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
import javafx.scene.shape.Rectangle;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.util.Arrays;
import java.util.List;

import static java.util.stream.Collectors.toList;


public class Ludoboardgame extends Application {
    private Image imageback = new Image("ludo-board-game.jpg");
    private Image icon = new Image("ikonagry.jpg");
    private Image pawnBlue = new Image("pawnBlue3.png");
    private Image pawnGreen = new Image("pawnGreen2.png");
    private Image pawnPurple = new Image("pawnPurple2.png");
    private Image pawnRed = new Image("pawnRed2.png");
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
    private Label label3 = new Label("Podaj imię gracza z czerwonymi pionkami ");
    private Label label4 = new Label("Podaj imię gracza z zielonymi pionkami ");
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
        instrukcja.relocate(45, 115);
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
        if (configuration.getPlayersQuantity().getQuantityOfPlayers() == 3) {
            label0.setText("Podaj imię gracza z żółtymi pionkami ");
            label0.relocate(200, 100);
            label1.setText("Podaj imię gracza z niebieskimi pionkami ");
            label1.relocate(200, 130);
            label3.relocate(200, 160);
            // Tworzymy TextField
            TextField nameTextField = new TextField();
            nameTextField.relocate(425, 95);
            nameTextField.setMinWidth(150);
            TextField nameTextField1 = new TextField();
            nameTextField1.relocate(425, 125);
            nameTextField1.setMinWidth(150);
            TextField nameTextField2 = new TextField();
            nameTextField2.relocate(425, 155);
            nameTextField2.setMinWidth(150);
            // Dodajemy Label i TextField
            downPane.getChildren().addAll(label0, label1, label3, nameTextField, nameTextField1, nameTextField2);

            but1.setPrefWidth(70);
            but1.relocate(600, 135);
            but1.setText("Next >");
            downPane.getChildren().add(but1);
            but1.setOnAction((e) -> {
                downPane.getChildren().removeAll(label0, label1, label3, nameTextField, nameTextField1, nameTextField2, but1);
                configuration.player1.setPlayerName(nameTextField.getText());
                configuration.player2.setPlayerName(nameTextField1.getText());
                configuration.player3.setPlayerName(nameTextField2.getText());
                System.out.println(configuration.player1.getPlayerName());
                drawGameBeginning(downPane, pRight, pLeft, grid);
            });
        }
        if (configuration.getPlayersQuantity().getQuantityOfPlayers() == 4) {
            label0.setText("Podaj imię gracza z żółtymi pionkami ");
            label0.relocate(200, 70);
            label1.setText("Podaj imię gracza z niebieskimi pionkami ");
            label1.relocate(200, 100);
            label3.relocate(200, 130);
            label4.relocate(200,160);
            // Tworzymy TextField
            TextField nameTextField = new TextField();
            nameTextField.relocate(425, 63);
            nameTextField.setMinWidth(150);
            TextField nameTextField1 = new TextField();
            nameTextField1.relocate(425, 92);
            nameTextField1.setMinWidth(150);
            TextField nameTextField2 = new TextField();
            nameTextField2.relocate(425, 122);
            nameTextField2.setMinWidth(150);

            TextField nameTextField3 = new TextField();
            nameTextField3.relocate(425, 153);
            nameTextField3.setMinWidth(150);
            // Dodajemy Label i TextField
            downPane.getChildren().addAll(label0, label1, label3,label4, nameTextField, nameTextField1, nameTextField2, nameTextField3);

            but1.setPrefWidth(70);
            but1.relocate(600, 135);
            but1.setText("Next >");
            downPane.getChildren().add(but1);
            but1.setOnAction((e) -> {
                downPane.getChildren().removeAll(label0, label1, label3, label4, nameTextField, nameTextField1, nameTextField2, nameTextField3, but1);
                configuration.player1.setPlayerName(nameTextField.getText());
                configuration.player2.setPlayerName(nameTextField1.getText());
                configuration.player3.setPlayerName(nameTextField2.getText());
                configuration.player4.setPlayerName(nameTextField3.getText());
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
            drawStartBtn(downPane);
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
        });
    }


    public void drawThrowButton(Pane pane) {
        curPlayerLabel.setText("Rzut kością dla gracza " + configuration.getCurrentPlayer().getPlayerName() + "  -->");
        curPlayerLabel.relocate(350, 118);

        Button throwBtn = new Button("    rzut kością    ");
        throwBtn.relocate(645, 115);

        throwBtn.setOnAction((f) -> {

            configuration.incrementThrowsCounter();
            drawDiceAfterThrow(pane);
            int currentDiceResult = dice.getDiceResult();

            List<Pawn> pawnsInHome = configuration.getCurrPlayerHomePawns();
            List<Pawn> pawnsInTarget = configuration.getCurrPlayerInTargetPawns();
            List<Pawn> pawnsOnPath =configuration.getCurrPlayerOnPathPawns();

            System.out.println("checking: currentPlayer: " + configuration.getCurrentPlayer().getPlayerName());

            //aktualny gracz nie ma pionka na białych polach
            if (pawnsInHome.size() + pawnsInTarget.size() == 4) {

                Pawn currPawn = pawnsInHome.get(0);
                int curI = currPawn.getCurrentPosIndex();
                int nextX = currPawn.getPath()[curI + 1].getFx();
                int nextY = currPawn.getPath()[curI + 1].getFy();

                if (dice.getDiceResult() == 6) {

                    List<Pawn> opponentsOnPath = configuration.getOpponentsOnPath();

                    if (opponentsOnPath.size() == 0) {
                        moveCurrentPlayerToNextPosition(currPawn);
                        finishCurrentPlayerMove();
                        curPlayerLabel.setText("Rzut kością dla gracza " + configuration.getCurrentPlayer().getPlayerName() + "  -->");
                        return;
                    }
                    if (opponentsOnPath.size() == 1 &&
                            opponentsOnPath.get(0).getCurrentPosition().getFx() != nextX &&
                            opponentsOnPath.get(0).getCurrentPosition().getFy() != nextY) {
                        moveCurrentPlayerToNextPosition(currPawn);
                        finishCurrentPlayerMove();
                        curPlayerLabel.setText("Rzut kością dla gracza " + configuration.getCurrentPlayer().getPlayerName() + "  -->");
                        return;
                    }
                    if (opponentsOnPath.size() == 2 &&
                            opponentsOnPath.get(0).getCurrentPosition().getFx() != nextX &&
                            opponentsOnPath.get(0).getCurrentPosition().getFy() != nextY &&
                            opponentsOnPath.get(1).getCurrentPosition().getFx() != nextX &&
                            opponentsOnPath.get(1).getCurrentPosition().getFy() != nextY) {
                        moveCurrentPlayerToNextPosition(currPawn);
                        finishCurrentPlayerMove();
                        curPlayerLabel.setText("Rzut kością dla gracza " + configuration.getCurrentPlayer().getPlayerName() + "  -->");
                        return;
                    }

                    if (opponentsOnPath.size() == 1 &&
                            opponentsOnPath.get(0).getCurrentPosition().getFx() == nextX &&
                            opponentsOnPath.get(0).getCurrentPosition().getFy() == nextY) {
                        moveOpponentToHome(opponentsOnPath.get(0));
                        moveCurrentPlayerToNextPosition(currPawn);
                        finishCurrentPlayerMove();
                        curPlayerLabel.setText("Rzut kością dla gracza " + configuration.getCurrentPlayer().getPlayerName() + "  -->");
                        return;
                    }

                    if (opponentsOnPath.size() == 2 &&
                            opponentsOnPath.get(0).getCurrentPosition().getFx() == nextX &&
                            opponentsOnPath.get(0).getCurrentPosition().getFy() == nextY) {
                        moveOpponentToHome(opponentsOnPath.get(0));
                        moveCurrentPlayerToNextPosition(currPawn);
                        finishCurrentPlayerMove();
                        curPlayerLabel.setText("Rzut kością dla gracza " + configuration.getCurrentPlayer().getPlayerName() + "  -->");
                        return;
                    }
                    if (opponentsOnPath.size() == 2 &&
                            opponentsOnPath.get(1).getCurrentPosition().getFx() == nextX &&
                            opponentsOnPath.get(1).getCurrentPosition().getFy() == nextY) {
                        moveOpponentToHome(opponentsOnPath.get(1));
                        moveCurrentPlayerToNextPosition(currPawn);
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

            //aktualny gracz ma 1 pionka na bałych polach
            if (pawnsOnPath.size() == 1) {

                Player currPlayer = configuration.getCurrentPlayer();
                Pawn currPawn = pawnsOnPath.get(0);
                int curI = currPawn.getCurrentPosIndex();

                int currPlayerPawnIndex = currPawn.getPawnIndex();
                int nextPosIndexForCurrPlayerPawn = currPawn.getCurrentPosIndex()+ currentDiceResult;

                if (currPawn.getCurrentPosIndex() + currentDiceResult < 41) {  //przed wjazdem na pola finish

                    int nextX = currPawn.getPath()[dice.getDiceResult()+curI].getFx();
                    int nextY = currPawn.getPath()[dice.getDiceResult()+curI].getFy();

                    List<Pawn> opponentsOnPath = configuration.getOpponentsOnPath();

                    if (opponentsOnPath.size() == 0) {  //jezeli docelowe miejsce puste

                        moveCurrentPlayerToNextPositionBehindHome(currentDiceResult);
                        finishCurrentPlayerMove();
                        curPlayerLabel.setText("Rzut kością dla gracza " + currPlayer.getPlayerName() + "  -->");
                        return;
                    }
                    if (opponentsOnPath.size() == 1 &&
                            opponentsOnPath.get(0).getCurrentPosition().getFx() != nextX &&
                            opponentsOnPath.get(0).getCurrentPosition().getFy() != nextY) {  //jezeli docelowe miejsce puste

                        moveCurrentPlayerToNextPositionBehindHome(currentDiceResult);
                        finishCurrentPlayerMove();
                        curPlayerLabel.setText("Rzut kością dla gracza " + currPlayer.getPlayerName() + "  -->");
                        return;
                    }
                    if (opponentsOnPath.size() == 2 &&
                            opponentsOnPath.get(0).getCurrentPosition().getFx() != nextX &&
                            opponentsOnPath.get(0).getCurrentPosition().getFy() != nextY &&
                            opponentsOnPath.get(1).getCurrentPosition().getFx() != nextX &&
                            opponentsOnPath.get(1).getCurrentPosition().getFy() != nextY) {  //jezeli docelowe miejsce puste

                        moveCurrentPlayerToNextPositionBehindHome(currentDiceResult);
                        finishCurrentPlayerMove();
                        curPlayerLabel.setText("Rzut kością dla gracza " + currPlayer.getPlayerName() + "  -->");
                        return;
                    }

                    if (opponentsOnPath.size() == 1 &&
                            opponentsOnPath.get(0).getCurrentPosition().getFx() == nextX &&
                            opponentsOnPath.get(0).getCurrentPosition().getFy() == nextY) {

                        moveOpponentToHome(opponentsOnPath.get(0));
                        moveCurrentPlayerToNextPositionBehindHome(currentDiceResult);
                        finishCurrentPlayerMove();
                        curPlayerLabel.setText("Rzut kością dla gracza " + currPlayer.getPlayerName() + "  -->");

                        return;
                    }
                    if (opponentsOnPath.size() == 2 &&
                            opponentsOnPath.get(0).getCurrentPosition().getFx() == nextX &&
                            opponentsOnPath.get(0).getCurrentPosition().getFy() == nextY) {

                        moveOpponentToHome(opponentsOnPath.get(0));
                        moveCurrentPlayerToNextPositionBehindHome(currentDiceResult);
                        finishCurrentPlayerMove();
                        curPlayerLabel.setText("Rzut kością dla gracza " + currPlayer.getPlayerName() + "  -->");
                        return;
                    }
                    if (opponentsOnPath.size() == 2 &&
                            opponentsOnPath.get(1).getCurrentPosition().getFx() == nextX &&
                            opponentsOnPath.get(1).getCurrentPosition().getFy() == nextY) {

                        moveOpponentToHome(opponentsOnPath.get(1));
                        moveCurrentPlayerToNextPositionBehindHome(currentDiceResult);
                        finishCurrentPlayerMove();
                        curPlayerLabel.setText("Rzut kością dla gracza " + currPlayer.getPlayerName() + "  -->");
                        return;
                    }
                }

                if (currPawn.getCurrentPosIndex() + currentDiceResult > 40 && currPawn.getCurrentPosIndex() + currentDiceResult < 45) {  //wjechnie na pola finish

                    if (currPlayerPawnIndex == 1) {

                        moveCurrentPlayerToNextPositionBehindHome(currentDiceResult);
                        finishCurrentPlayerMove();
                        curPlayerLabel.setText("Rzut kością dla gracza " + currPlayer.getPlayerName() + "  -->");
                        return;
                    }

                    if (currPlayerPawnIndex == 2) {

                        if (nextPosIndexForCurrPlayerPawn != configuration.getCurrentPlayer().getPawns()[0].getCurrentPosIndex()) {

                            moveCurrentPlayerToNextPositionBehindHome(currentDiceResult);
                            finishCurrentPlayerMove();
                            curPlayerLabel.setText("Rzut kością dla gracza " + currPlayer.getPlayerName() + "  -->");
                            return;
                        }
                    }

                    if (currPlayerPawnIndex == 3) {

                        if (nextPosIndexForCurrPlayerPawn != currPlayer.getPawns()[0].getCurrentPosIndex() &&
                                nextPosIndexForCurrPlayerPawn != currPlayer.getPawns()[1].getCurrentPosIndex()) {

                            moveCurrentPlayerToNextPositionBehindHome(currentDiceResult);
                            finishCurrentPlayerMove();
                            curPlayerLabel.setText("Rzut kością dla gracza " + currPlayer.getPlayerName() + "  -->");
                            return;
                        }
                    }

                    if (currPlayerPawnIndex == 4) {
                        System.out.println(currPlayerPawnIndex);

                        if (nextPosIndexForCurrPlayerPawn != currPlayer.getPawns()[0].getCurrentPosIndex() &&
                                nextPosIndexForCurrPlayerPawn != currPlayer.getPawns()[1].getCurrentPosIndex() &&
                                nextPosIndexForCurrPlayerPawn != currPlayer.getPawns()[2].getCurrentPosIndex()) {

                            moveCurrentPlayerToNextPositionBehindHome(currentDiceResult);

                            winLabel.setText("GRATULACJE !  Gracz " + currPlayer.getPlayerName() + " wygrał grę! Zapraszamy do ponownej gry...");
                            winLabel.relocate(250, 143);
                            Rectangle rect = new Rectangle(640, 100, 150, 60);
                            rect.setFill(Color.WHITE);
                            pane.getChildren().addAll(winLabel, rect);
                            pane.getChildren().removeAll(curPlayerLabel, throwBtn);
                        }
                    }
                }

                if (configuration.getThrowsCounter() == 1) {
                    finishCurrentPlayerMove();
                    curPlayerLabel.setText("Rzut kością dla gracza " + currPlayer.getPlayerName() + "  -->");
                }
            }
        });

        pane.getChildren().addAll(curPlayerLabel, throwBtn);
    }


    public void drawDiceAfterThrow(Pane pane) {
        dice.throwDice();
        System.out.println("Dice result " + dice.getDiceResult());

        if (dice.getDiceResult() == 1) {
            ImageView imgDiceValue1 = new ImageView(diceValue1);
            imgDiceValue1.relocate(160, 110);
            pane.getChildren().add(imgDiceValue1);
        } else if (dice.getDiceResult() == 2) {
            ImageView imgDiceValue2 = new ImageView(diceValue2);
            imgDiceValue2.relocate(160, 110);
            pane.getChildren().add(imgDiceValue2);
        } else if (dice.getDiceResult() == 3) {
            ImageView imgDiceValue3 = new ImageView(diceValue3);
            imgDiceValue3.relocate(160, 110);
            pane.getChildren().add(imgDiceValue3);
        } else if (dice.getDiceResult() == 4) {
            ImageView imgDiceValue4 = new ImageView(diceValue4);
            imgDiceValue4.relocate(160, 110);
            pane.getChildren().add(imgDiceValue4);
        } else if (dice.getDiceResult() == 5) {
            ImageView imgDiceValue5 = new ImageView(diceValue5);
            imgDiceValue5.relocate(160, 110);
            pane.getChildren().add(imgDiceValue5);
        } else {
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

    private void moveCurrentPlayerToNextPosition(Pawn pawn) {
        System.out.println("Moving player " + configuration.getCurrentPlayer().getPlayerName() + "to next position.");

        Position nextPosition = pawn.getNextPosition();
        GridPane.setConstraints(pawn.getImgPawn(),
                nextPosition.getFx(),
                nextPosition.getFy());
    }

    private void moveCurrentPlayerToNextPositionBehindHome(int diceResult) {
        List<Pawn> list = Arrays.stream(configuration.getCurrentPlayer().getPawns()).filter(pawn -> pawn.getCurrentPosIndex() > 0 && pawn.getCurrentPosIndex() < 41).collect(toList());
        Pawn curPawn = list.get(0);
        System.out.println("Moving player " + configuration.getCurrentPlayer().getPlayerName() + " to next position.");
        Position nextPositionBH = curPawn.getNextPositionBehindHome(diceResult);
        GridPane.setConstraints(curPawn.getImgPawn(),
                nextPositionBH.getFx(),
                nextPositionBH.getFy());
    }

    private void moveOpponentToHome(Pawn pawn) {
        pawn.setCurrentPosIndex(0);
        GridPane.setConstraints(pawn.getImgPawn(), pawn.getHomePosition().getFx(), pawn.getHomePosition().getFy());
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
            "Dopiero gdy pierwszy pion gracza zajmie jedną z pozycji docelowych, można wprowadzić na planszę kolejny pion.\n" +
            "W tym celu przysługują ponownie trzy próby na wyrzucenie szóstki wymaganej do wyjechania kolejnym pionkiem.\n" +
            "\n" +
            "\n" +
            "                                                                                                      Życzymy przyjemnej zabawy!";
}