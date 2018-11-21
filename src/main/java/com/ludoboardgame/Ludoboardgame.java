package com.ludoboardgame;

import javafx.application.Application;

import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;



public class Ludoboardgame extends Application {
    private Image imageback = new Image("ludo-board-game.jpg");
    private Image icon = new Image("ikonagry.jpg");
    private Image pawnBlue = new Image("pawnBlue3.png");
    private Image pawnGreen = new Image("pawnGreen2.png");
    private Image pawnPurple = new Image("pawnPurple2.png");
    private Image pawnRed = new Image("pawnRed2.png");
    private Image kubekBefore = new Image("kubekBefore.png");
    private Image kubekAfter = new Image("kubekAfter.png");
    private Image diceValue1 = new Image("dice1.png");
    private Image diceValue2 = new Image("dice2.png");
    private Image diceValue3 = new Image("dice3.png");
    private Image diceValue4 = new Image("dice4.png");
    private Image diceValue5 = new Image("dice5.png");
    private Image diceValue6 = new Image("dice6.png");

    private ImageView imgPawnBlue1 = new ImageView(pawnBlue);
    private ImageView imgPawnBlue2 = new ImageView(pawnBlue);
    private ImageView imgPawnBlue3 = new ImageView(pawnBlue);
    private ImageView imgPawnBlue4 = new ImageView(pawnBlue);
    private ImageView imgPawnGreen1 = new ImageView(pawnGreen);
    private ImageView imgPawnGreen2 = new ImageView(pawnGreen);
    private ImageView imgPawnGreen3 = new ImageView(pawnGreen);
    private ImageView imgPawnGreen4 = new ImageView(pawnGreen);
    private ImageView imgPawnPurple1 = new ImageView(pawnPurple);
    private ImageView imgPawnPurple2 = new ImageView(pawnPurple);
    private ImageView imgPawnPurple3 = new ImageView(pawnPurple);
    private ImageView imgPawnPurple4 = new ImageView(pawnPurple);
    private ImageView imgPawnRed1 = new ImageView(pawnRed);
    private ImageView imgPawnRed2 = new ImageView(pawnRed);
    private ImageView imgPawnRed3 = new ImageView(pawnRed);
    private ImageView imgPawnRed4 = new ImageView(pawnRed);
    private ImageView imgKubekBefore = new ImageView(kubekBefore);
    private ImageView imgKubekAfter = new ImageView(kubekAfter);

    private Label label0 = new Label("Witaj w grze planszowej CHIŃCZYK !");
    private Label label1 = new Label("Podaj liczbę graczy");
    private Button newbtn1 = new Button("2");
    private Button newbtn2 = new Button("3");
    private Button newbtn3 = new Button("4");
    private Button but0 = new Button("Start Game");
    private Button but1 = new Button("Podaj imiona graczy");

    private Dice dice = new Dice();
    private Configuration configuration = new Configuration();

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        primaryStage.getIcons().add(icon);
        BackgroundSize backgroundSize = new BackgroundSize(100, 100, true, true, true, false);
        BackgroundImage backgroundImage =
                new BackgroundImage(imageback, BackgroundRepeat.REPEAT, BackgroundRepeat.NO_REPEAT,
                        BackgroundPosition.CENTER, backgroundSize);
        Background background = new Background(backgroundImage);

        BorderPane root = new BorderPane(); // Tworzymy rozkład.
        root.setBackground(background);

        //pane z siatka do centrum
        GridPane grid = new GridPane();
        grid.setGridLinesVisible(true);
        final int numCols = 11;
        final int numRows = 11;
        for (int i = 0; i < numCols; i++) {
            ColumnConstraints colConst = new ColumnConstraints();
            colConst.setPercentWidth(100.0 / numCols);
            grid.getColumnConstraints().add(colConst);
        }
        for (int i = 0; i < numRows; i++) {
            RowConstraints rowConst = new RowConstraints();
            rowConst.setPercentHeight(100.0 / numRows);
            grid.getRowConstraints().add(rowConst);
        }
        root.setCenter(grid);

        //ustaw margines górny na siatkę
        StackPane up = new StackPane();
        up.setPrefHeight(115);
        root.setTop(up);

        //ustaw prawy margines
        Pane right = new Pane();
        right.setPrefWidth(142);
        root.setRight(right);

        //ustaw spód
        Pane down = new Pane();
        down.setPrefHeight(190);
        root.setBottom(down);

        //ustaw lewy margines
        Pane left = new Pane();
        left.setPrefWidth(155);
        root.setLeft(left);

        //widok powitalny
        drawWelcomeItems(left, down, right, grid);

        Scene scene = new Scene(root, 800, 800, Color.BLACK);

        primaryStage.setTitle("Ludo Board Game");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    void restart(Pane left, Pane down, Pane right, GridPane grid) {
        left.getChildren().clear();
        down.getChildren().clear();
        right.getChildren().clear();
        grid.getChildren().clear();
        drawWelcomeItems(left, down, right, grid);
    }

    public void drawWelcomeItems(Pane leftPane, Pane downPane, Pane rightPane, GridPane grid) {
        imgPawnBlue1.relocate(45, 0);
        imgPawnBlue2.relocate(45, 50);
        imgPawnBlue3.relocate(45, 100);
        imgPawnBlue4.relocate(45, 150);
        imgPawnPurple1.relocate(45, 300);
        imgPawnPurple2.relocate(45, 350);
        imgPawnPurple3.relocate(45, 400);
        imgPawnPurple4.relocate(45, 450);
        leftPane.getChildren()
                .addAll(imgPawnBlue1, imgPawnBlue2, imgPawnBlue3, imgPawnBlue4, imgPawnPurple1, imgPawnPurple2,
                        imgPawnPurple3, imgPawnPurple4);
        imgPawnRed1.relocate(65, 0);
        imgPawnRed2.relocate(65, 50);
        imgPawnRed3.relocate(65, 100);
        imgPawnRed4.relocate(65, 150);
        imgPawnGreen1.relocate(65, 300);
        imgPawnGreen2.relocate(65, 350);
        imgPawnGreen3.relocate(65, 400);
        imgPawnGreen4.relocate(65, 450);
        rightPane.getChildren()
                .addAll(imgPawnRed1, imgPawnRed2, imgPawnRed3, imgPawnRed4, imgPawnGreen1, imgPawnGreen2, imgPawnGreen3,
                        imgPawnGreen4);
        label0.relocate(300, 143);
        but0.setPrefWidth(100);
        but0.relocate(645, 115);
        but0.setOnAction((e) -> {
            drawPlayersQuantity(downPane, rightPane, leftPane, grid);
        });
        downPane.getChildren().addAll(label0, but0);

        //przycik restart
        Button restartBtn = new Button("Restart Game");
        restartBtn.relocate(45, 115);
        restartBtn.setOnAction((e) -> {
            restart(leftPane,downPane,rightPane,grid);
        });
        downPane.getChildren().add(restartBtn);
    }

    public void drawPlayersQuantity(Pane pane, Pane right, Pane left, GridPane grid) {

        pane.getChildren().removeAll(label0, but0);

        label1.relocate(300, 143);

        newbtn1.relocate(410, 140);
        newbtn1.setOnAction((e) -> {
            PlayersQuantity quantity = new PlayersQuantity(2);
            configuration.setPlayersQuantity(quantity);
            pane.getChildren().removeAll(label1, newbtn1, newbtn2, newbtn3);
            System.out.println(quantity.getQuantityOfPlayers());
            setPlayersName(pane, right, left, grid);
        });

        newbtn2.relocate(440, 140);
        newbtn2.setOnAction((e) -> {
            PlayersQuantity quantity = new PlayersQuantity(3);
            configuration.setPlayersQuantity(quantity);
            pane.getChildren().removeAll(label1, newbtn1, newbtn2, newbtn3);
            System.out.println(quantity.getQuantityOfPlayers());
            setPlayersName(pane, right, left, grid);
        });

        newbtn3.relocate(470, 140);
        newbtn3.setOnAction((e) -> {
            PlayersQuantity quantity = new PlayersQuantity(4);
            configuration.setPlayersQuantity(quantity);
            pane.getChildren().removeAll(label1, newbtn1, newbtn2, newbtn3);
            System.out.println(quantity.getQuantityOfPlayers());
            setPlayersName(pane, right, left, grid);
        });
        pane.getChildren().addAll(label1, newbtn1, newbtn2, newbtn3);
    }

    public void setPlayersName(Pane downPane, Pane pRight, Pane pLeft, GridPane grid) {

        if (configuration.getPlayersQuantity().getQuantityOfPlayers() == 2) {
            label0.setText("Podaj imię gracza z żółtymi pionkami ");
            label0.relocate(200, 110);
            label1.setText("Podaj imię gracza z niebieskimi pionkami ");
            label1.relocate(200, 140);
            // Tworzymy TextField
            TextField nameTextField = new TextField();
            nameTextField.relocate(425, 105);
            nameTextField.setMinWidth(150);
            TextField nameTextField1 = new TextField();
            nameTextField1.relocate(425, 135);
            nameTextField1.setMinWidth(150);
            // Dodajemy Label i TextField
            downPane.getChildren().addAll(label0, label1, nameTextField, nameTextField1);

            but1.setPrefWidth(70);
            but1.relocate(600, 135);
            but1.setText("Next >");
            downPane.getChildren().add(but1);
            but1.setOnAction((e) -> {
                downPane.getChildren().removeAll(label0, label1, nameTextField, nameTextField1, but1);
                configuration.player1.setPlayerName(nameTextField.getText());
                configuration.player2.setPlayerName(nameTextField1.getText());
                System.out.println(configuration.player1.getPlayerName());
                drawGameBeginning(downPane, pRight, pLeft, grid);
                //następna metoda
            });
        }

    }

    public void drawYellowPawnsAtHome(GridPane grid, Pawn pawny1, Pawn pawny2, Pawn pawny3, Pawn pawny4) {
        GridPane.setConstraints(pawny1.getImgPawn(), pawny1.getHomePosition().getFx(),
                pawny1.getHomePosition().getFy());
        GridPane.setConstraints(pawny2.getImgPawn(), pawny2.getHomePosition().getFx(),
                pawny2.getHomePosition().getFy());
        GridPane.setConstraints(pawny3.getImgPawn(), pawny3.getHomePosition().getFx(),
                pawny3.getHomePosition().getFy());
        GridPane.setConstraints(pawny4.getImgPawn(), pawny4.getHomePosition().getFx(),
                pawny4.getHomePosition().getFy());
        grid.getChildren().addAll(pawny1.getImgPawn(), pawny2.getImgPawn(), pawny3.getImgPawn(), pawny4.getImgPawn());
    }

    public void drawBluePawnsAtHome(GridPane grid, Pawn pawnB1, Pawn pawnB2, Pawn pawnB3, Pawn pawnB4) {
        GridPane.setConstraints(pawnB1.getImgPawn(), pawnB1.getHomePosition().getFx(),
                pawnB1.getHomePosition().getFy());
        GridPane.setConstraints(pawnB2.getImgPawn(), pawnB2.getHomePosition().getFx(),
                pawnB2.getHomePosition().getFy());
        GridPane.setConstraints(pawnB3.getImgPawn(), pawnB3.getHomePosition().getFx(),
                pawnB3.getHomePosition().getFy());
        GridPane.setConstraints(pawnB4.getImgPawn(), pawnB4.getHomePosition().getFx(),
                pawnB4.getHomePosition().getFy());
        grid.getChildren().addAll(pawnB1.getImgPawn(), pawnB2.getImgPawn(), pawnB3.getImgPawn(), pawnB4.getImgPawn());
    }

    public void drawRedPawnsAtHome(GridPane grid) {
        GridPane.setConstraints(imgPawnRed1, 9, 0);
        GridPane.setConstraints(imgPawnRed2, 10, 0);
        GridPane.setConstraints(imgPawnRed3, 9, 1);
        GridPane.setConstraints(imgPawnRed4, 10, 1);
        grid.getChildren().addAll(imgPawnRed1, imgPawnRed2, imgPawnRed3, imgPawnRed4);
    }

    public void drawGreenPawnsAtHome(GridPane grid) {
        GridPane.setConstraints(imgPawnGreen1, 9, 9);
        GridPane.setConstraints(imgPawnGreen2, 10, 9);
        GridPane.setConstraints(imgPawnGreen3, 9, 10);
        GridPane.setConstraints(imgPawnGreen4, 10, 10);
        grid.getChildren().addAll(imgPawnGreen1, imgPawnGreen2, imgPawnGreen3, imgPawnGreen4);
    }

    public void drawThrowButton(Pane pane) {
        Button throwBtn = new Button("throw dice");
        throwBtn.relocate(645, 115);

        throwBtn.setOnAction((f) -> {
            configuration.incrementThrowsCounter();
            drawDiceAfterThrow(pane);
            //jesli pierwszy pionek w bazie
            if (configuration.getCurrentPlayer().getCurrentPawn().getCurrentPosition() == configuration.getCurrentPlayer().getCurrentPawn().getHomePosition()) {

                if (dice.getDiceResult() == 6) {
                    //jesli wolne pole to wjedz
                    if (configuration.getNextPlyer().getCurrentPawn().getCurrentPosition().getFx() != configuration.getCurrentPlayer().getCurrentPawn().getPath()[1].getFx() &&
                            configuration.getNextPlyer().getCurrentPawn().getCurrentPosition().getFy() != configuration.getCurrentPlayer().getCurrentPawn().getPath()[1].getFy()) {
                        moveCurrentPlayerToNextPosition();
                        configuration.getCurrentPlayer().getCurrentPawn().setCurrentPosIndex(1);
                        System.out.println("Player "+configuration.getCurrentPlayer().getPlayerName()+" pawn index: "+
                                configuration.getCurrentPlayer().getCurrentPawn().getCurrentPosIndex());
                        finishCurrentPlayerMove();
                        return;
                    }
                    //lub gdy na docelowym polu wróg to zbicie
                    if (configuration.getNextPlyer().getCurrentPawn().getCurrentPosition().getFx() == configuration.getCurrentPlayer().getCurrentPawn().getPath()[1].getFx() &&
                            configuration.getNextPlyer().getCurrentPawn().getCurrentPosition().getFy() == configuration.getCurrentPlayer().getCurrentPawn().getPath()[1].getFy()) {
                        moveOpponentToHome();
                        resetOpponentcurrPosIndex();
                        moveCurrentPlayerToNextPosition();
                        configuration.getCurrentPlayer().getCurrentPawn().setCurrentPosIndex(1);
                        System.out.println("Player "+configuration.getCurrentPlayer().getPlayerName()+" pawn index: "+
                                configuration.getCurrentPlayer().getCurrentPawn().getCurrentPosIndex());
                        finishCurrentPlayerMove();
                        return;

                    }
                }
                if (configuration.getThrowsCounter() == 3) {
                    finishCurrentPlayerMove();
                }
            }
            //pierwszy pionek wyjechał z bazy
            if (configuration.getCurrentPlayer().getCurrentPawn().getCurrentPosition() != configuration.getCurrentPlayer().getCurrentPawn().getHomePosition()) {
                //jesli docelowe pole pute to wjedz
                if (configuration.getNextPlyer().getCurrentPawn().getCurrentPosition().getFx() != configuration.getCurrentPlayer().getCurrentPawn().getPath()[1 + dice.getDiceResult()].getFx() &&
                        configuration.getNextPlyer().getCurrentPawn().getCurrentPosition().getFy() != configuration.getCurrentPlayer().getCurrentPawn().getPath()[1 + dice.getDiceResult()].getFy()) {

                    //nie moze zająć pozycji poza zakresem indexPosition
                    if(configuration.getCurrentPlayer().getCurrentPawn().getCurrentPosIndex()+dice.getDiceResult()<45){
                        moveCurrentPlayerToNextPositionBehindHome(dice.getDiceResult());
                        configuration.getCurrentPlayer().getCurrentPawn().setCurrentPosIndex(configuration.getCurrentPlayer().getCurrentPawn().getCurrentPosIndex() + dice.getDiceResult());
                    }
                    System.out.println("Player "+configuration.getCurrentPlayer().getPlayerName()+" pawn index: "+
                            configuration.getCurrentPlayer().getCurrentPawn().getCurrentPosIndex());
                    finishCurrentPlayerMove();
                    return;
                }
                //jesli na doceowym polu preciwnik to zbij go i wjedz
                if (configuration.getNextPlyer().getCurrentPawn().getCurrentPosition().getFx() == configuration.getCurrentPlayer().getCurrentPawn().getPath()[1 + dice.getDiceResult()].getFx() &&
                        configuration.getNextPlyer().getCurrentPawn().getCurrentPosition().getFy() == configuration.getCurrentPlayer().getCurrentPawn().getPath()[1 + dice.getDiceResult()].getFy()) {
                    //zbicie
                    moveOpponentToHome();
                    resetOpponentcurrPosIndex();
                    moveCurrentPlayerToNextPositionBehindHome(dice.getDiceResult());
                    configuration.getCurrentPlayer().getCurrentPawn().setCurrentPosIndex(configuration.getCurrentPlayer().getCurrentPawn().getCurrentPosIndex() + dice.getDiceResult());
                    System.out.println("Player "+configuration.getCurrentPlayer().getPlayerName()+" pawn index: "+
                            configuration.getCurrentPlayer().getCurrentPawn().getCurrentPosIndex());
                    finishCurrentPlayerMove();
                    return;
                }
                //wjazd na pola finish
                //jesli posIndex w nastepnym ruchu bedzie...
                if(configuration.getCurrentPlayer().getCurrentPawn().getCurrentPosIndex()+dice.getDiceResult()>=41 && configuration.getCurrentPlayer().getCurrentPawn().getCurrentPosIndex()+dice.getDiceResult()<=44){
                    //warianty dla poszczegolnych pionków gracza
                    if(configuration.getCurrentPlayer().getCurrentPawn().getPawnIndex()==0){
                        moveCurrentPlayerToNextPositionBehindHome(dice.getDiceResult());
                        configuration.getCurrentPlayer().getCurrentPawn().setCurrentPosIndex(configuration.getCurrentPlayer().getCurrentPawn().getCurrentPosIndex() + dice.getDiceResult());
                        System.out.println("Player "+configuration.getCurrentPlayer().getPlayerName()+" pawn index: "+
                                configuration.getCurrentPlayer().getCurrentPawn().getCurrentPosIndex());
                        configuration.getCurrentPlayer().setCurrentPawn(1);
                        finishCurrentPlayerMove();
                        return;
                    }
                    if(configuration.getCurrentPlayer().getCurrentPawn().getPawnIndex()==1){
                        if(configuration.getCurrentPlayer().getCurrentPawn().getNextPosIndex(dice.getDiceResult())!=configuration.getCurrentPlayer().getPawns()[0].getCurrentPosIndex()){
                            moveCurrentPlayerToNextPositionBehindHome(dice.getDiceResult());
                            configuration.getCurrentPlayer().getCurrentPawn().setCurrentPosIndex(configuration.getCurrentPlayer().getCurrentPawn().getCurrentPosIndex() + dice.getDiceResult());
                            System.out.println("Player "+configuration.getCurrentPlayer().getPlayerName()+" pawn index: "+
                                    configuration.getCurrentPlayer().getCurrentPawn().getCurrentPosIndex());
                            configuration.getCurrentPlayer().setCurrentPawn(2);
                            finishCurrentPlayerMove();
                            return;
                        }
                    }
                    if(configuration.getCurrentPlayer().getCurrentPawn().getPawnIndex()==2){
                        if(configuration.getCurrentPlayer().getCurrentPawn().getNextPosIndex(dice.getDiceResult())!=configuration.getCurrentPlayer().getPawns()[0].getCurrentPosIndex()&&
                                configuration.getCurrentPlayer().getCurrentPawn().getNextPosIndex(dice.getDiceResult())!=configuration.getCurrentPlayer().getPawns()[1].getCurrentPosIndex()){
                            moveCurrentPlayerToNextPositionBehindHome(dice.getDiceResult());
                            configuration.getCurrentPlayer().getCurrentPawn().setCurrentPosIndex(configuration.getCurrentPlayer().getCurrentPawn().getCurrentPosIndex() + dice.getDiceResult());
                            System.out.println("Player "+configuration.getCurrentPlayer().getPlayerName()+" pawn index: "+
                                    configuration.getCurrentPlayer().getCurrentPawn().getCurrentPosIndex());
                            configuration.getCurrentPlayer().setCurrentPawn(3);
                            finishCurrentPlayerMove();
                            return;
                        }
                    }
                    if(configuration.getCurrentPlayer().getCurrentPawn().getPawnIndex()==3){
                        if(configuration.getCurrentPlayer().getCurrentPawn().getNextPosIndex(dice.getDiceResult())!=configuration.getCurrentPlayer().getPawns()[0].getCurrentPosIndex()&&
                                configuration.getCurrentPlayer().getCurrentPawn().getNextPosIndex(dice.getDiceResult())!=configuration.getCurrentPlayer().getPawns()[1].getCurrentPosIndex()&&
                                configuration.getCurrentPlayer().getCurrentPawn().getNextPosIndex(dice.getDiceResult())!=configuration.getCurrentPlayer().getPawns()[2].getCurrentPosIndex()){
                            moveCurrentPlayerToNextPositionBehindHome(dice.getDiceResult());
                            configuration.getCurrentPlayer().getCurrentPawn().setCurrentPosIndex(configuration.getCurrentPlayer().getCurrentPawn().getCurrentPosIndex() + dice.getDiceResult());
                            System.out.println("Player "+configuration.getCurrentPlayer().getPlayerName()+" pawn index: "+
                                    configuration.getCurrentPlayer().getCurrentPawn().getCurrentPosIndex());

                            //show winner info, remove throwBtn
                            label0.setText("Player "+configuration.getCurrentPlayer().getPlayerName()+" win the game!");
                            pane.getChildren().remove(throwBtn);

                        }
                    }
                }

                if (configuration.getThrowsCounter() == 1) {
                    finishCurrentPlayerMove();
                }
            }
        });

        pane.getChildren().addAll(throwBtn);
    }

    public void drawStartBtn(Pane pane) {
        Button startGameButton = new Button("Ludo Game Start");
        //Label playerLabel = new Label();
        //playerLabel.relocate(350, 120);
        startGameButton.relocate(645, 115);
        pane.getChildren().add(startGameButton);
        startGameButton.setOnAction((e) -> {
            //.......
            pane.getChildren().remove(startGameButton);
            configuration.setCurrentPlayer(configuration.getPlayer1());
            drawThrowButton(pane);

            //.........
            //startGameButton.relocate(745, 115);//645
            //startGameButton.setOnAction(null);
        });
    }

    public void drawGameBeginning(Pane downPane, Pane pRight, Pane pLeft, GridPane grid) {
        pLeft.getChildren()
                .removeAll(imgPawnBlue1, imgPawnBlue2, imgPawnBlue3, imgPawnBlue4, imgPawnPurple1, imgPawnPurple2,
                        imgPawnPurple3, imgPawnPurple4);
        pRight.getChildren().removeAll(imgPawnRed1, imgPawnRed2, imgPawnRed3, imgPawnRed4, imgPawnGreen1, imgPawnGreen2,
                imgPawnGreen3, imgPawnGreen4);
        if (configuration.getPlayersQuantity().getQuantityOfPlayers() == 2) {
            drawYellowPawnsAtHome(grid, configuration.pawn1y, configuration.pawn2y, configuration.pawn3y,
                    configuration.pawn4y);
            drawBluePawnsAtHome(grid, configuration.pawn1b, configuration.pawn2b, configuration.pawn3b,
                    configuration.pawn4b);
            drawStartBtn(downPane);
        }
        if (configuration.getPlayersQuantity().getQuantityOfPlayers() == 3) {
            drawYellowPawnsAtHome(grid, configuration.pawn1y, configuration.pawn2y, configuration.pawn3y,
                    configuration.pawn4y);
            drawBluePawnsAtHome(grid, configuration.pawn1b, configuration.pawn2b, configuration.pawn3b,
                    configuration.pawn4b);
            drawRedPawnsAtHome(grid);
            drawStartBtn(downPane);
        }
        if (configuration.getPlayersQuantity().getQuantityOfPlayers() == 4) {
            drawYellowPawnsAtHome(grid, configuration.pawn1y, configuration.pawn2y, configuration.pawn3y,
                    configuration.pawn4y);
            drawBluePawnsAtHome(grid, configuration.pawn1b, configuration.pawn2b, configuration.pawn3b,
                    configuration.pawn4b);
            drawRedPawnsAtHome(grid);
            drawGreenPawnsAtHome(grid);
            drawStartBtn(downPane);
        }
    }


    public void drawDiceAfterThrow(Pane pane) {
        dice.throwDice();
        System.out.println("Dice result " + dice.getDiceResult());
        //drawKubekAfterThrow(pane);
        if (dice.getDiceResult() == 1) {
            //drawKubekAfterThrow(pane);
            ImageView imgDiceValue1 = new ImageView(diceValue1);
            imgDiceValue1.relocate(160, 110);
            pane.getChildren().add(imgDiceValue1);
        } else if (dice.getDiceResult() == 2) {
            //drawKubekAfterThrow(pane);
            ImageView imgDiceValue2 = new ImageView(diceValue2);
            imgDiceValue2.relocate(160, 110);
            pane.getChildren().add(imgDiceValue2);
        } else if (dice.getDiceResult() == 3) {
            //drawKubekAfterThrow(pane);
            ImageView imgDiceValue3 = new ImageView(diceValue3);
            imgDiceValue3.relocate(160, 110);
            pane.getChildren().add(imgDiceValue3);
        } else if (dice.getDiceResult() == 4) {
            //drawKubekAfterThrow(pane);
            ImageView imgDiceValue4 = new ImageView(diceValue4);
            imgDiceValue4.relocate(160, 110);
            pane.getChildren().add(imgDiceValue4);
        } else if (dice.getDiceResult() == 5) {
            //drawKubekAfterThrow(pane);
            ImageView imgDiceValue5 = new ImageView(diceValue5);
            imgDiceValue5.relocate(160, 110);
            pane.getChildren().add(imgDiceValue5);
        } else {
            //drawKubekAfterThrow(pane);
            ImageView imgDiceValue6 = new ImageView(diceValue6);
            imgDiceValue6.relocate(160, 110);
            pane.getChildren().add(imgDiceValue6);
        }
    }

    private void finishCurrentPlayerMove() {
        Player currentPlayer = configuration.getCurrentPlayer();
        System.out.println("Finishing round for player: " + currentPlayer.getPlayerName());
        configuration.resetPlayerRound();
        configuration.setNextPlayer();

        System.out.println("Next player is: " + configuration.getCurrentPlayer().getPlayerName());
    }

    private void moveCurrentPlayerToNextPosition() {
        Player currentPlayer = configuration.getCurrentPlayer();
        System.out.println("Moving player " + currentPlayer.getPlayerName() + "to next position.");
        Pawn playerPawn = currentPlayer.getCurrentPawn();

        Position nextPosition = playerPawn.getNextPosition();
        GridPane.setConstraints(playerPawn.getImgPawn(),
                nextPosition.getFx(),
                nextPosition.getFy());
    }

    private void moveCurrentPlayerToNextPositionBehindHome(int diceResult) {
        Player currentPlayerBH = configuration.getCurrentPlayer();
        System.out.println("Moving player " + currentPlayerBH.getPlayerName() + " to next position.");
        Pawn playerPawnBH = currentPlayerBH.getCurrentPawn();

        Position nextPositionBH = playerPawnBH.getNextPositionBehindHome(diceResult);
        GridPane.setConstraints(playerPawnBH.getImgPawn(),
                nextPositionBH.getFx(),
                nextPositionBH.getFy());
    }

    private void moveOpponentToHome() {
        Player secondPlayer = configuration.getNextPlyer();
        Pawn opponentPawn = secondPlayer.getCurrentPawn();
        GridPane.setConstraints(opponentPawn.getImgPawn(), opponentPawn.getHomePosition().getFx(), opponentPawn.getHomePosition().getFy());
    }

    private void resetOpponentcurrPosIndex() {
        configuration.getNextPlyer().getCurrentPawn().setCurrentPosIndex(0);
    }
}