package com.ludoboardgame;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.scene.text.TextBoundsType;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.util.Random;

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

    private final Dice dice = new Dice();
    private PlayersQuantity quantity = new PlayersQuantity();
    private Configuration configuration = new Configuration();

    public void drawWelcomeItems(Pane leftPane, Pane downPane, Pane rightPane, GridPane grid) {
        imgPawnBlue1.relocate(45, 0);
        imgPawnBlue2.relocate(45, 50);
        imgPawnBlue3.relocate(45, 100);
        imgPawnBlue4.relocate(45, 150);
        imgPawnPurple1.relocate(45, 300);
        imgPawnPurple2.relocate(45, 350);
        imgPawnPurple3.relocate(45, 400);
        imgPawnPurple4.relocate(45, 450);
        leftPane.getChildren().addAll(imgPawnBlue1, imgPawnBlue2, imgPawnBlue3, imgPawnBlue4, imgPawnPurple1, imgPawnPurple2, imgPawnPurple3, imgPawnPurple4);
        imgPawnRed1.relocate(65, 0);
        imgPawnRed2.relocate(65, 50);
        imgPawnRed3.relocate(65, 100);
        imgPawnRed4.relocate(65, 150);
        imgPawnGreen1.relocate(65, 300);
        imgPawnGreen2.relocate(65, 350);
        imgPawnGreen3.relocate(65, 400);
        imgPawnGreen4.relocate(65, 450);
        rightPane.getChildren().addAll(imgPawnRed1, imgPawnRed2, imgPawnRed3, imgPawnRed4, imgPawnGreen1, imgPawnGreen2, imgPawnGreen3, imgPawnGreen4);
        label0.relocate(300, 143);
        but0.setPrefWidth(100);
        but0.relocate(645, 115);
        but0.setOnAction((e) -> {
            drawPlayersQuantity(downPane, rightPane, leftPane, grid);
        });
        downPane.getChildren().addAll(label0, but0);
    }


    public void drawPlayersQuantity(Pane pane, Pane right, Pane left, GridPane grid) {

        pane.getChildren().removeAll(label0, but0);

        label1.relocate(300, 143);

        newbtn1.relocate(410, 140);
        newbtn1.setOnAction((e) -> {
            quantity.setQuantityOfPlayers(2);
            pane.getChildren().removeAll(label1, newbtn1, newbtn2, newbtn3);
            System.out.println(quantity.getQuantityOfPlayers());
            setPlayersName(pane, right, left, grid);
            configuration.setEtap(1);
        });

        newbtn2.relocate(440, 140);
        newbtn2.setOnAction((e) -> {
            quantity.setQuantityOfPlayers(3);
            pane.getChildren().removeAll(label1, newbtn1, newbtn2, newbtn3);
            System.out.println(quantity.getQuantityOfPlayers());
            setPlayersName(pane, right, left, grid);
            configuration.setEtap(1);
        });

        newbtn3.relocate(470, 140);
        newbtn3.setOnAction((e) -> {
            quantity.setQuantityOfPlayers(4);
            pane.getChildren().removeAll(label1, newbtn1, newbtn2, newbtn3);
            System.out.println(quantity.getQuantityOfPlayers());
            setPlayersName(pane, right, left, grid);
            configuration.setEtap(1);

        });
        pane.getChildren().addAll(label1, newbtn1, newbtn2, newbtn3);
    }


    public void setPlayersName(Pane downPane, Pane pRight, Pane pLeft, GridPane grid) {

        if (quantity.getQuantityOfPlayers() == 2) {
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
                //drawTest(grid);
                drawGameBeginning(downPane, pRight, pLeft, grid);

                //drawGameBeginning(pLeft,pRight);
                //następna metoda
            });
        }
        if (quantity.getQuantityOfPlayers() == 3) {
            label0.setText("Podaj imiona graczy: ");
            label0.relocate(100, 130);
            ImageView imgYellow = new ImageView(pawnPurple);
            ImageView imgBlue = new ImageView(pawnBlue);
            ImageView imgRed = new ImageView(pawnRed);
            imgYellow.relocate(240, 90);
            imgBlue.relocate(480, 90);
            imgRed.relocate(240, 140);
            TextField nameTextFieldY = new TextField();
            nameTextFieldY.relocate(290, 105);
            nameTextFieldY.setMinWidth(150);
            TextField nameTextFieldB = new TextField();
            nameTextFieldB.relocate(530, 105);
            nameTextFieldB.setMinWidth(150);
            TextField nameTextFieldR = new TextField();
            nameTextFieldR.relocate(290, 150);
            nameTextFieldR.setMinWidth(150);
            downPane.getChildren().addAll(label0, imgYellow, nameTextFieldY, imgBlue, nameTextFieldB, imgRed, nameTextFieldR);

            but1.setPrefWidth(70);
            but1.relocate(715, 150);
            but1.setText("Next >");
            downPane.getChildren().add(but1);
            but1.setOnAction((e) -> {
                downPane.getChildren().removeAll(label0, imgYellow, nameTextFieldY, imgBlue, nameTextFieldB, imgRed, nameTextFieldR, but1);
                configuration.player1.setPlayerName(nameTextFieldY.getText());
                configuration.player2.setPlayerName(nameTextFieldB.getText());
                configuration.player3.setPlayerName(nameTextFieldR.getText());
                drawGameBeginning(downPane, pRight, pLeft, grid);

                //drawGameBeginning(pLeft,pRight);
                //następna metoda
            });
        }
        if (quantity.getQuantityOfPlayers() == 4) {
            label0.setText("Podaj imiona graczy: ");
            label0.relocate(100, 130);
            ImageView imgYellow = new ImageView(pawnPurple);
            ImageView imgBlue = new ImageView(pawnBlue);
            ImageView imgRed = new ImageView(pawnRed);
            ImageView imgGreen = new ImageView(pawnGreen);
            imgYellow.relocate(240, 90);
            imgBlue.relocate(480, 90);
            imgRed.relocate(240, 140);
            imgGreen.relocate(480, 140);
            TextField nameTextFieldY = new TextField();
            nameTextFieldY.relocate(290, 105);
            nameTextFieldY.setMinWidth(150);
            TextField nameTextFieldB = new TextField();
            nameTextFieldB.relocate(530, 105);
            nameTextFieldB.setMinWidth(150);
            TextField nameTextFieldR = new TextField();
            nameTextFieldR.relocate(290, 150);
            nameTextFieldR.setMinWidth(150);
            TextField nameTextFieldG = new TextField();
            nameTextFieldG.relocate(530, 150);
            nameTextFieldG.setMinWidth(150);
            downPane.getChildren().addAll(label0, imgYellow, nameTextFieldY, imgBlue, nameTextFieldB, imgRed, nameTextFieldR, imgGreen, nameTextFieldG);

            but1.setPrefWidth(70);
            but1.relocate(715, 150);
            but1.setText("Next >");
            downPane.getChildren().add(but1);
            but1.setOnAction((e) -> {
                downPane.getChildren().removeAll(label0, imgYellow, nameTextFieldY, imgBlue, nameTextFieldB, imgRed, nameTextFieldR, imgGreen, nameTextFieldG, but1);
                configuration.player1.setPlayerName(nameTextFieldY.getText());
                configuration.player2.setPlayerName(nameTextFieldB.getText());
                configuration.player3.setPlayerName(nameTextFieldR.getText());
                configuration.player4.setPlayerName(nameTextFieldG.getText());
                drawGameBeginning(downPane, pRight, pLeft, grid);

                //następna metoda
            });
        }
    }


    public void klikniecie(Pawn pawn,Position position, GridPane gridPane)
    {
        pawn.drawMove(pawn,position,gridPane);
    }

    public void drawYellowPawnsAtHome(GridPane grid, Pawn pawny1, Pawn pawny2, Pawn pawny3, Pawn pawny4) {
        GridPane.setConstraints(pawny1.getImgPawn(), 0, 9);
        GridPane.setConstraints(pawny2.getImgPawn(), 1, 9);
        GridPane.setConstraints(pawny3.getImgPawn(), 0, 10);
        GridPane.setConstraints(pawny4.getImgPawn(), 1, 10);
        grid.getChildren().addAll(pawny1.getImgPawn(), pawny2.getImgPawn(), pawny3.getImgPawn(), pawny4.getImgPawn());
        pawny1.getImgPawn().setOnMousePressed((event -> {
            klikniecie(configuration.pawn1y,configuration.pawn1y.getStartPosition(),grid);
        }));
    }

    public void drawBluePawnsAtHome(GridPane grid) {
        GridPane.setConstraints(imgPawnBlue1, 0, 0);
        GridPane.setConstraints(imgPawnBlue2, 1, 0);
        GridPane.setConstraints(imgPawnBlue3, 0, 1);
        GridPane.setConstraints(imgPawnBlue4, 1, 1);
        grid.getChildren().addAll(imgPawnBlue1, imgPawnBlue2, imgPawnBlue3, imgPawnBlue4);
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


    public void drawGameBeginning(Pane downPane, Pane pRight, Pane pLeft, GridPane grid) {
        pLeft.getChildren().removeAll(imgPawnBlue1, imgPawnBlue2, imgPawnBlue3, imgPawnBlue4, imgPawnPurple1, imgPawnPurple2, imgPawnPurple3, imgPawnPurple4);
        pRight.getChildren().removeAll(imgPawnRed1, imgPawnRed2, imgPawnRed3, imgPawnRed4, imgPawnGreen1, imgPawnGreen2, imgPawnGreen3, imgPawnGreen4);
        if (quantity.getQuantityOfPlayers() == 2) {
            drawYellowPawnsAtHome(grid,configuration.pawn1y,configuration.pawn2y,configuration.pawn3y,configuration.pawn4y);
            drawBluePawnsAtHome(grid);
        }
        if (quantity.getQuantityOfPlayers() == 3) {
            drawYellowPawnsAtHome(grid,configuration.pawn1y,configuration.pawn2y,configuration.pawn3y,configuration.pawn4y);
            drawBluePawnsAtHome(grid);
            drawRedPawnsAtHome(grid);
        }
        if (quantity.getQuantityOfPlayers() == 4) {
            drawYellowPawnsAtHome(grid,configuration.pawn1y,configuration.pawn2y,configuration.pawn3y,configuration.pawn4y);
            drawBluePawnsAtHome(grid);
            drawRedPawnsAtHome(grid);
            drawGreenPawnsAtHome(grid);
        }
        drawStartBtn(downPane);
    }

    public void drawKubekBeforeThrow(Pane pane) {
        Button but1 = new Button("..Dice throw");
        but1.setPrefWidth(100);
        but1.relocate(645, 115);
        //ImageView imgKubekBefore = new ImageView(kubekBefore);
        imgKubekBefore.relocate(45, 80);
        pane.getChildren().addAll(but1, imgKubekBefore);
        but1.setOnAction((e) -> {   //akcja przycisku
            //dice.throwDice();
            //drawKubekAfterThrow(pane);
            //drawDiceAfterThrow(pane);
        });
    }

    public void drawStartBtn(Pane pane) {
        Button but1 = new Button("Ludo Game Start");
        but1.relocate(645, 115);
        //imgKubekBefore.relocate(45, 80);
        //pane.getChildren().addAll(but1, imgKubekBefore);
        but1.setOnAction((e) -> {   //akcja przycisku
            label0.setText(configuration.player1.getPlayerName()+"turn");
            label0.relocate(200, 110);
            pane.getChildren().add(label0);
            but1.setText("Dice throw");
                    but1.setOnAction((f) -> {
                        for(int d = 0;d<3;d++) {
                            drawDiceAfterThrow(pane);
                            if(dice.getDiceResult() == 6){

                            }
                        }
                    });

            //dice.throwDice();
            //drawKubekAfterThrow(pane);
            //drawDiceAfterThrow(pane);
        });
    }
    /*public void runner(Pane pane, GridPane gridPane){
        do{
            for(int p=1;p==quantity.getQuantityOfPlayers();p++){
                na dole drukuj aktualnie grającego grcza nr p
                if(wszystkie w bazie){
                    rzucamy max 3 razy aby wyszła 6
                        jesli padło6 wybrac pionek do wprowdzenia na start
                        jesli po trzech razach nie padło 6 to kolejka nastepnego gracza
                }
                if(cos już jest na scieżce){
                    jesli padła 6 wyprowadz kolejny pionek na start a jesli ktos inny stoi na twoim polu startowym to go kasujesz na dom
                            jesli inne oczka to przesuń pion z scieżki o ilosc wyrzuconych oczek - jak po przesunięciu najeżdzsz na wroga to on wraca do domu, jesli jest tam twoj pion to ruch nie możliwy

                }
            }

        }while (zolte na mecie || niebieskie na mecie)
    }*/

    public void drawKubekAfterThrow(Pane pane) {
        pane.getChildren().remove(imgKubekBefore);
        imgKubekAfter.relocate(45, 80);
        pane.getChildren().add(imgKubekAfter);
    }

    public void drawTest(GridPane grid) {
        if (configuration.player1.getPlayerName().equals("a")) {
            ImageView img = new ImageView(pawnBlue);
            GridPane.setConstraints(img, 1, 0);
            grid.getChildren().add(img);
        }
    }

    public void drawDiceAfterThrow(Pane pane) {
        dice.throwDice();
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

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        primaryStage.getIcons().add(icon);
        BackgroundSize backgroundSize = new BackgroundSize(100, 100, true, true, true, false);
        BackgroundImage backgroundImage = new BackgroundImage(imageback, BackgroundRepeat.REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, backgroundSize);
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


        /*
        System.out.println("etap " + configuration.getEtap());
        if (configuration.getEtap() == 1) {
            Button but1 = new Button("Dice throw");
            but1.setPrefWidth(100);
            but1.relocate(645, 115);

            ImageView imgKubekBefore = new ImageView(kubekBefore);
            imgKubekBefore.relocate(45, 80);
            down.getChildren().addAll(but1, imgKubekBefore);
            but1.setOnAction((e) -> {   //akcja przycisku
                dice.throwDice();
                drawDiceAfterThrow(down);
            });
        }






/*
        //przycisk i kubek w części down
        Button but1 = new Button("Dice throw");
        but1.setPrefWidth(100);
        but1.relocate(645, 115);

        ImageView imgKubekBefore = new ImageView(kubekBefore);
        imgKubekBefore.relocate(45, 80);
        down.getChildren().addAll(but1,imgKubekBefore);
        but1.setOnAction((e) -> {   //akcja przycisku
            dice.throwDice();
            drawDiceAfterThrow(down);
        });
        */
/*
        //pionek na siatkę
        ImageView img = new ImageView(pawn);
        GridPane.setConstraints(img, 1, 0);
        grid.getChildren().add(img);
*/

/*
        //okno do wypisania np instrukcji
        Stage stage1 = new Stage();
        stage1.initModality(Modality.WINDOW_MODAL);
        VBox root1 = new VBox();
        Button but11 = new Button("Start");
        root1.getChildren().add(but11);
        but11.setOnAction((e) -> {
            stage1.close();
        });
        Scene scene1 = new Scene(root1, 800, 800);
        stage1.setScene(scene1);
        stage1.setTitle("Ludo Board Game1");
        stage1.showAndWait();
        */
    }
}
