package com.ludoboardgame;

import javafx.application.Application;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;


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

    private Label label0 = new Label("Witaj w grze planszowej CHIŃCZYK !");
    private Label label1 = new Label("Podaj liczbę graczy");
    private Label winLabel = new Label();
    private Label curPlayerLabel = new Label();
    private Button newbtn1 = new Button("2");
    private Button newbtn2 = new Button("3");
    private Button newbtn3 = new Button("4");
    private Button but0 = new Button("Nowa gra");
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
        //new Conf..
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
        //przycisk instrukcja
        Button instrukcja = new Button("Instrukcja");
        instrukcja.setPrefWidth(75);
        instrukcja.relocate(45, 85);
        instrukcja.setOnAction((e) -> {
            Stage stage1 = new Stage();
            stage1.getIcons().add(icon);
            stage1.initModality(Modality.WINDOW_MODAL);
            Pane root1 = new Pane();
            Label tekst = new Label(info);
            tekst.relocate(50, 50);
            Button but11 = new Button("Wróć do gry");
            but11.relocate(687, 750);
            root1.getChildren().addAll(tekst, but11);
            but11.setOnAction((f) -> {
                stage1.close();
            });
            Scene scene1 = new Scene(root1, 800, 800);
            stage1.setScene(scene1);
            stage1.setTitle("Instrukcja do gry CHIŃCZYK");
            stage1.showAndWait();
        });
        downPane.getChildren().add(instrukcja);

        //przycik restart
        Button restartBtn = new Button("Restart Gry");
        restartBtn.setPrefWidth(75);
        restartBtn.relocate(45, 115);
        restartBtn.setOnAction((e) -> {
            restart(leftPane, downPane, rightPane, grid);
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
            });
        }

    }

    public void drawGameBeginning(Pane downPane, Pane pRight, Pane pLeft, GridPane grid) {
        pLeft.getChildren()
                .removeAll(imgPawnBlue1, imgPawnBlue2, imgPawnBlue3, imgPawnBlue4, imgPawnPurple1, imgPawnPurple2,
                        imgPawnPurple3, imgPawnPurple4);
        pRight.getChildren().removeAll(imgPawnRed1, imgPawnRed2, imgPawnRed3, imgPawnRed4, imgPawnGreen1, imgPawnGreen2,
                imgPawnGreen3, imgPawnGreen4);

        for (Player player : configuration.getPlayers()) {
            for (Pawn pawn : player.getPawns()) {
                GridPane.setConstraints(pawn.getImgPawn(), pawn.getHomePosition().getFx(),
                        pawn.getHomePosition().getFy());

                grid.getChildren().add(pawn.getImgPawn());
            }
            drawStartBtn(downPane);//wczesniej było klamre wyzej
        }
    }

    public void drawStartBtn(Pane pane) {
        Button startGameButton = new Button("Start rozgrywki");
        startGameButton.relocate(645, 115);
        pane.getChildren().add(startGameButton);
        startGameButton.setOnAction((e) -> {
            pane.getChildren().remove(startGameButton);
            configuration.setCurrentPlayer(configuration.getPlayer1());
            drawThrowButton(pane);
            //drawThrowBtNew(pane);
        });
    }



    public boolean naDocelowejInny(Pawn pawn, int dice) {
        boolean result = false;

        List<Pawn> otherPawns = Arrays.stream(configuration.getPlayers())
                .flatMap(player -> Arrays.stream(player.getPawns()))
                .filter(p -> p != pawn)
                .collect(toList());

        for (Pawn otherPawn : otherPawns) {

            int pawnNextPosIndex = pawn.getCurrentPosIndex() + dice;
            if (pawnNextPosIndex < 45) {
                Position pawnNextPos = pawn.getPath()[pawnNextPosIndex];
                int pawnNextX = pawnNextPos.getFx();
                int pawnNextY = pawnNextPos.getFy();
                int oponentCurX = otherPawn.getCurrentPosition().getFx();
                int oponentCurY = otherPawn.getCurrentPosition().getFx();


                if (pawnNextX != oponentCurX && pawnNextY != oponentCurY && pawn.getPawnImage() != otherPawn.getPawnImage()) {
                    result = true;
                }
            }


        }
        return result;
    }

    //spr czy pozycja docelowa pusta
    public boolean isDocelowaPusta(Pawn pawn, int dice) {

        boolean result = false;

        List<Pawn> otherPawns = Arrays.stream(configuration.getPlayers())
                .flatMap(player -> Arrays.stream(player.getPawns()))
                .filter(p -> p != pawn)
                .collect(toList());

        for (Pawn otherPawn : otherPawns) {

            int pawnNextPosIndex = pawn.getCurrentPosIndex() + dice;
            if (pawnNextPosIndex < 45) {
                Position pawnNextPos = pawn.getPath()[pawnNextPosIndex];
                int pawnNextX = pawnNextPos.getFx();
                int pawnNextY = pawnNextPos.getFy();
                int oponentCurX = otherPawn.getCurrentPosition().getFx();
                int oponentCurY = otherPawn.getCurrentPosition().getFx();

                if (pawnNextX != oponentCurX && pawnNextY != oponentCurY) {
                    result = true;
                }


            }
        }
        return result;
    }

    public void sendOpponetToHome(Pawn pawn, int dice) {

        Pawn oponent = null;

        List<Pawn> otherPawns = Arrays.stream(configuration.getPlayers())
                .flatMap(player -> Arrays.stream(player.getPawns()))
                .filter(p -> p != pawn)
                .collect(toList());

        for (Pawn otherPawn : otherPawns) {

            int pawnNextPosIndex = pawn.getCurrentPosIndex() + dice;
            if(pawnNextPosIndex<45){
                Position pawnNextPos = pawn.getPath()[pawnNextPosIndex];
                int pawnNextX = pawnNextPos.getFx();
                int pawnNextY = pawnNextPos.getFy();
                int oponentCurX = otherPawn.getCurrentPosition().getFx();
                int oponentCurY = otherPawn.getCurrentPosition().getFx();

                if (pawnNextX == oponentCurX && pawnNextY == oponentCurY) {
                    oponent = otherPawn;
                }
            }


        }
        if(oponent != null) {
            //may produce NPE
            GridPane.setConstraints(oponent.getImgPawn(),
                    oponent.getHomePosition().getFx(),
                    oponent.getHomePosition().getFy());
        }

    }

    public boolean isJedenNaSciezce(Pawn pawn) {
        return pawn.getCurrentPosition() != pawn.getHomePosition() || pawn.getCurrentPosIndex() < 41;
    }

    private void currPawnToNextPosBH(int diceResult) {
        Pawn currPlayerPawnBH = configuration.getCurrentPlayer().getCurrentPawn();
        System.out.println("Moving player " + configuration.getCurrentPlayer().getPlayerName() + " to next position.");
        Position nextPositionBH = currPlayerPawnBH.getNextPositionBehindHome(diceResult);
        GridPane.setConstraints(currPlayerPawnBH.getImgPawn(),
                nextPositionBH.getFx(),
                nextPositionBH.getFy());
    }


    public void drawThrowButton(Pane pane) {
        curPlayerLabel.setText("Rzut kością dla gracza " + configuration.getCurrentPlayer().getPlayerName() + "  -->");
        curPlayerLabel.relocate(350, 118);
        Button throwBtn = new Button("   rzut kością    ");
        throwBtn.relocate(645, 115);

        throwBtn.setOnAction((f) -> {

            configuration.incrementThrowsCounter();
            drawDiceAfterThrow(pane);
            System.out.println("checking: currentPlayer: " + configuration.getCurrentPlayer().getPlayerName());

            int currentDiceResult = dice.getDiceResult();
            Pawn currPlayerPawn = configuration.getCurrentPlayer().getCurrentPawn();
            Position currPosForCurrPawn = currPlayerPawn.getCurrentPosition();
            Position homePosForCurrPawn = currPlayerPawn.getHomePosition();
            Position posForNextPlayer = configuration.getNextPlayerCurrPawnPos();
            int nextPosIndexForCurrPlayerPawn = currPlayerPawn.getNextPosIndex(currentDiceResult);
            int currPlayerPawnIndex = currPlayerPawn.getPawnIndex();

            List<Pawn> currPlayerHomePawns = Arrays.stream(configuration.getCurrentPlayer().getPawns())
                    .filter(pawn -> pawn.getCurrentPosIndex()==0)
                    .collect(toList());
            List<Pawn> currPlayerOnPathPawns = Arrays.stream(configuration.getCurrentPlayer().getPawns())
                    .filter(pawn -> pawn.getCurrentPosIndex()>0 && pawn.getCurrentPosIndex()<41)
                    .collect(toList());
            List<Pawn> currPlayerInTargetPawns = Arrays.stream(configuration.getCurrentPlayer().getPawns())
                    .filter(pawn -> pawn.getCurrentPosIndex()>40 && pawn.getCurrentPosIndex()<45)
                    .collect(toList());



            if (currPosForCurrPawn == homePosForCurrPawn) {
                if (dice.getDiceResult() == 6) {
                    if (posForNextPlayer != currPlayerPawn.getPath()[1]) {  //jezeli docelowe miejsce puste
                        System.out.println("dla next x " + posForNextPlayer.getFx() + ", y " + posForNextPlayer.getFy());
                        moveCurrentPlayerToNextPosition();
                        finishCurrentPlayerMove();
                        curPlayerLabel.setText("Rzut kością dla gracza " + configuration.getCurrentPlayer().getPlayerName() + "  -->");
                        return;
                    }
                    if (posForNextPlayer == currPlayerPawn.getPath()[1]) { //jezeli docelowe miejsce zajęte
                        System.out.println("spełniono warunek zbicia xxxxxxxxxxxxxxxxxxxx");
                        moveOpponentToHome();
                        moveCurrentPlayerToNextPosition();
                        finishCurrentPlayerMove();
                        curPlayerLabel.setText("Rzut kością dla gracza " + configuration.getCurrentPlayer().getPlayerName() + "  -->");
                        return;
                    }
                }
                if (configuration.getThrowsCounter() == 3) {
                    finishCurrentPlayerMove();
                    curPlayerLabel.setText("Rzut kością dla gracza " + configuration.getCurrentPlayer().getPlayerName() + "  -->");
                }
            }
            if (currPosForCurrPawn != homePosForCurrPawn) {  //pierwszy pionek wyjechał z bazy

                if (nextPosIndexForCurrPlayerPawn < 41) {  //przed wjazdem na pola finish
                    if (posForNextPlayer.getFx() != currPlayerPawn.getPath()[nextPosIndexForCurrPlayerPawn].getFx() &&
                            posForNextPlayer.getFy() != currPlayerPawn.getPath()[nextPosIndexForCurrPlayerPawn].getFy()) {  //jezeli docelowe miejsce puste
                        moveCurrentPlayerToNextPositionBehindHome(currentDiceResult);
                        finishCurrentPlayerMove();
                        curPlayerLabel.setText("Rzut kością dla gracza " + configuration.getCurrentPlayer().getPlayerName() + "  -->");
                        return;
                    }
                    if (posForNextPlayer.getFx() == currPlayerPawn.getPath()[nextPosIndexForCurrPlayerPawn].getFx() &&
                            posForNextPlayer.getFy() == currPlayerPawn.getPath()[nextPosIndexForCurrPlayerPawn].getFy()) {  //jezeli docelowe miejsce zajete if (posForNextPlayer == currPlayerPawn.getPath()[nextPosIndexForCurrPlayerPawn])
                        System.out.println("spełniono warunek zbicia xxxxxxxxxxxxxxxxxxxx");
                        moveOpponentToHome();
                        moveCurrentPlayerToNextPositionBehindHome(currentDiceResult);
                        finishCurrentPlayerMove();
                        curPlayerLabel.setText("Rzut kością dla gracza " + configuration.getCurrentPlayer().getPlayerName() + "  -->");
                        return;
                    }
                }
                if (nextPosIndexForCurrPlayerPawn < 45) {  //wjechnie na pola finish
                    if (currPlayerPawnIndex == 0) {
                        moveCurrentPlayerToNextPositionBehindHome(currentDiceResult);
                        configuration.getCurrentPlayer().getNextPawn();
                        finishCurrentPlayerMove();
                        curPlayerLabel.setText("Rzut kością dla gracza " + configuration.getCurrentPlayer().getPlayerName() + "  -->");
                        return;
                    }
                    if (currPlayerPawnIndex == 1) {
                        if (nextPosIndexForCurrPlayerPawn != configuration.getCurrentPlayer().getPawns()[0].getCurrentPosIndex()) {
                            moveCurrentPlayerToNextPositionBehindHome(currentDiceResult);
                            configuration.getCurrentPlayer().getNextPawn();
                            finishCurrentPlayerMove();
                            curPlayerLabel.setText("Rzut kością dla gracza " + configuration.getCurrentPlayer().getPlayerName() + "  -->");
                            return;
                        }
                    }
                    if (currPlayerPawnIndex == 2) {
                        if (nextPosIndexForCurrPlayerPawn != configuration.getCurrentPlayer().getPawns()[0].getCurrentPosIndex() &&
                                nextPosIndexForCurrPlayerPawn != configuration.getCurrentPlayer().getPawns()[1].getCurrentPosIndex()) {
                            moveCurrentPlayerToNextPositionBehindHome(currentDiceResult);
                            configuration.getCurrentPlayer().getNextPawn();
                            finishCurrentPlayerMove();
                            curPlayerLabel.setText("Rzut kością dla gracza " + configuration.getCurrentPlayer().getPlayerName() + "  -->");
                            return;
                        }
                    }
                    if (currPlayerPawnIndex == 3) {

                        if (nextPosIndexForCurrPlayerPawn != configuration.getCurrentPlayer().getPawns()[0].getCurrentPosIndex() &&
                                nextPosIndexForCurrPlayerPawn != configuration.getCurrentPlayer().getPawns()[1].getCurrentPosIndex() &&
                                nextPosIndexForCurrPlayerPawn != configuration.getCurrentPlayer().getPawns()[2].getCurrentPosIndex()) {
                            System.out.println("spelniono warunek b----------------------------------------");

                            moveCurrentPlayerToNextPositionBehindHome(currentDiceResult);

                            configuration.getCurrentPlayer().getNextPawn();
                            finishCurrentPlayerMove();
                            curPlayerLabel.setText("Rzut kością dla gracza " + configuration.getCurrentPlayer().getPlayerName() + "  -->");
                            return;
                        }
                    }
                    if (currPlayerPawnIndex == 4) {//fikcyjny pionek

                        if (nextPosIndexForCurrPlayerPawn != configuration.getCurrentPlayer().getPawns()[0].getCurrentPosIndex() &&
                                nextPosIndexForCurrPlayerPawn != configuration.getCurrentPlayer().getPawns()[1].getCurrentPosIndex() &&
                                nextPosIndexForCurrPlayerPawn != configuration.getCurrentPlayer().getPawns()[2].getCurrentPosIndex() &&
                                nextPosIndexForCurrPlayerPawn != configuration.getCurrentPlayer().getPawns()[3].getCurrentPosIndex()) {
                            System.out.println("spelniono warunek c-------------c------------c---------c------c");

                            GridPane.setConstraints(configuration.getCurrentPlayer().getPawns()[3].getImgPawn(),
                                    configuration.getCurrentPlayer().getPawns()[3].getCurrentPosition().getFx(),
                                    configuration.getCurrentPlayer().getPawns()[3].getCurrentPosition().getFy());

                            winLabel.setText("GRATULACJE !  Gracz " + configuration.getCurrentPlayer().getPlayerName() + " wygrał grę! Zapraszamy do ponownej gry...");
                            winLabel.relocate(250, 143);
                            pane.getChildren().add(winLabel);

                            pane.getChildren().removeAll(curPlayerLabel, throwBtn);
                        }

                    }
                }
                if (configuration.getThrowsCounter() == 1) {
                    finishCurrentPlayerMove();
                    curPlayerLabel.setText("Rzut kością dla gracza " + configuration.getCurrentPlayer().getPlayerName() + "  -->");
                }
            }
        });

        pane.getChildren().addAll(curPlayerLabel, throwBtn);

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
        Pawn currPlayerPawn = configuration.getCurrentPlayer().getCurrentPawn();
        System.out.println("Moving player " + configuration.getCurrentPlayer().getPlayerName() + "to next position.");

        Position nextPosition = currPlayerPawn.getNextPosition();
        GridPane.setConstraints(currPlayerPawn.getImgPawn(),
                nextPosition.getFx(),
                nextPosition.getFy());
    }

    private void moveCurrentPlayerToNextPositionBehindHome(int diceResult) {
        Pawn currPlayerPawnBH = configuration.getCurrentPlayer().getCurrentPawn();
        System.out.println("Moving player " + configuration.getCurrentPlayer().getPlayerName() + " to next position.");
        Position nextPositionBH = currPlayerPawnBH.getNextPositionBehindHome(diceResult);
        GridPane.setConstraints(currPlayerPawnBH.getImgPawn(),
                nextPositionBH.getFx(),
                nextPositionBH.getFy());
    }

    private void moveOpponentToHome() {

        Player secondPlayer = configuration.getNextPlayer();
        Pawn opponentPawn = secondPlayer.getCurrentPawn();
        opponentPawn.setCurrentPosIndex(0);
        GridPane.setConstraints(opponentPawn.getImgPawn(), opponentPawn.getHomePosition().getFx(), opponentPawn.getHomePosition().getFy());
    }

    private String info = " \n" + "CHIŃCZYK to gra przeznaczona dla 2-4 osób, w której celem graczy jest przejechanie dookoła planszy\n" +
            " czterema pionkami z pozycji początkowych na końcowe. Pierwszy gracz, który tego dokona, wygrywa.\n" +
            "\n" +
            "Ruch w grze polega na przesunięciu na planszy dowolnego z własnych pionów o tyle pól,\n" +
            "ile oczek zostanie wyrzuconych na kostce (1-6). Jeśli na docelowym polu znajduje się pion przeciwnika,\n" +
            "to jest on usuwany i wraca do domu (jedną z początkowych pozycji), a jeśli znajduje się tam własny pion,\n" +
            "to taki ruch jest niedozwolony.\n" +
            "\n" +
            "Aby wyjechać pionem z domu, konieczne jest wyrzucenie szóstki. Dowolny pion jest wtedy umieszczany na pierwszym\n" +
            "polu planszy oznaczonym w kolorze pionów gracza. Jeśli gracz posiada wszystkie swoje piony w domu, \n" +
            "to przysługują mu trzy próby na wyrzucenie szóstki wymaganej do wyjechania pierwszym pionkiem.\n" +
            "Dopero gdy pierwszy pion gracza zajmie jedną z pozycji docelowych, można wprowadzić na planszę kolejny pion.\n" +
            "W tym celu przysługują ponownie trzy próby na wyrzucenie szóstki wymaganej do wyjechania kolejnym pionkiem.\n" +
            "\n" +
            "\n" +
            "                                                                                                      Życzymy przyjemnej zabawy!";
}