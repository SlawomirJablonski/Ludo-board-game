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
    private Button newbtn1 = new Button("2");
    private Button newbtn2 = new Button("3");
    private Button newbtn3 = new Button("4");
    private Button but0 = new Button("Start Game");
    private Button but1 = new Button("Podaj imiona graczy");


    private final Dice dice = new Dice();
    private PlayersQuantity quantity = new PlayersQuantity();

    public void drawWelcomeItems(Pane leftPane, Pane downPane, Pane rightPane) {
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
            drawPlayersQuantity(downPane);
        });
        downPane.getChildren().addAll(label0, but0);
    }



    public void drawPlayersQuantity(Pane pane) {

        pane.getChildren().removeAll(label0, but0);

        label1.relocate(300, 143);

        newbtn1.relocate(410, 140);
        newbtn1.setOnAction((e) -> {
            quantity.setQuantityOfPlayers(2);
            //drawUserNameBtn(pane);
            pane.getChildren().removeAll(label1, newbtn1, newbtn2, newbtn3);
            System.out.println(quantity.getQuantityOfPlayers());
        });

        newbtn2.relocate(440, 140);
        newbtn2.setOnAction((e) -> {
            quantity.setQuantityOfPlayers(3);
            //drawUserNameBtn(pane);
            pane.getChildren().removeAll(label1, newbtn1, newbtn2, newbtn3);
            System.out.println(quantity.getQuantityOfPlayers());
        });

        newbtn3.relocate(470, 140);
        newbtn3.setOnAction((e) -> {
            quantity.setQuantityOfPlayers(4);
            //drawUserNameBtn(pane);
            pane.getChildren().removeAll(label1, newbtn1, newbtn2, newbtn3);
            System.out.println(quantity.getQuantityOfPlayers());
            //setPlayersName(pane);
        });
        pane.getChildren().addAll(label1, newbtn1, newbtn2, newbtn3);
    }
    public void drawBtn(Pane pane) {
        but1.setPrefWidth(100);
        but1.relocate(645, 185);
        but1.setText("Next >");
        pane.getChildren().add(but1);
    }

    public void setPlayersName(Pane downPane){
        for(int j=0;j<quantity.getQuantityOfPlayers();j++){
            label0.setText("Podaj imię gracza nr "+(j+1));
            // Tworzymy TextField
            TextField nameTextField = new TextField();
            // Ustawiamy minimalną szerokość pola tekstowego
            nameTextField.setMinWidth(200);
            // Dodajemy Label i TextField do HBox-u
            downPane.getChildren().addAll(label0,nameTextField);
            drawBtn(downPane);

        }
    }

    public void drawDiceAfterThrow(Pane pane) {
        dice.throwDice();
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
        drawWelcomeItems(left, down, right);






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
        Scene scene = new Scene(root, 800, 800, Color.BLACK);

        primaryStage.setTitle("Ludo Board Game");
        primaryStage.setScene(scene);
        primaryStage.show();
/*
        //okno ustawienia liczby graczy
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
