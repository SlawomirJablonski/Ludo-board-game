package com.ludoboardgame;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Configuration {

    private PlayersQuantity playersQuantity;

    private Player currentPlayer;
    private int throwsCounter = 0;

    public void setPlayersQuantity(PlayersQuantity playersQuantity) {
        this.playersQuantity = playersQuantity;
    }

    public PlayersQuantity getPlayersQuantity() {
        return playersQuantity;
    }

    public int getThrowsCounter() {
        return throwsCounter;
    }

    public void resetPlayerRound() {
        this.throwsCounter = 0;
    }

    public void setCurrentPlayer(Player currentPlayer) {
        this.currentPlayer = currentPlayer;
    }

    public Player getCurrentPlayer() {
        return currentPlayer;
    }


    private Image icon = new Image("ikonagry.jpg");
    private ImageView imgIcon = new ImageView(icon);

    private Image pawnPurple = new Image("pawnPurple2.png");
    private ImageView imgPawnPurple1 = new ImageView(pawnPurple);
    private ImageView imgPawnPurple2 = new ImageView(pawnPurple);
    private ImageView imgPawnPurple3 = new ImageView(pawnPurple);
    private ImageView imgPawnPurple4 = new ImageView(pawnPurple);
    private Image pawnBlue = new Image("pawnBlue3.png");
    private ImageView imgPawnBlue1 = new ImageView(pawnBlue);
    private ImageView imgPawnBlue2 = new ImageView(pawnBlue);
    private ImageView imgPawnBlue3 = new ImageView(pawnBlue);
    private ImageView imgPawnBlue4 = new ImageView(pawnBlue);
    private Image pawnRed = new Image("pawnRed2.png");
    private ImageView imgPawnRed1 = new ImageView(pawnRed);
    private ImageView imgPawnRed2 = new ImageView(pawnRed);
    private ImageView imgPawnRed3 = new ImageView(pawnRed);
    private ImageView imgPawnRed4 = new ImageView(pawnRed);
    private Image pawnGreen = new Image("pawnGreen2.png");
    private ImageView imgPawnGreen1 = new ImageView(pawnGreen);

    Pawn pawn1y = new Pawn(1, Position.getYellowPath(0, 9), pawnPurple, imgPawnPurple1, 0);
    Pawn pawn2y = new Pawn(2, Position.getYellowPath(1, 9), pawnPurple, imgPawnPurple2, 0);
    Pawn pawn3y = new Pawn(3, Position.getYellowPath(0, 10), pawnPurple, imgPawnPurple3, 0);
    Pawn pawn4y = new Pawn(4, Position.getYellowPath(1, 10), pawnPurple, imgPawnPurple4, 0);

    Pawn pawn1b = new Pawn(1, Position.getBluePath(0, 0), pawnBlue, imgPawnBlue1, 10);
    Pawn pawn2b = new Pawn(2, Position.getBluePath(1, 0), pawnBlue, imgPawnBlue2, 10);
    Pawn pawn3b = new Pawn(3, Position.getBluePath(0, 1), pawnBlue, imgPawnBlue3, 10);
    Pawn pawn4b = new Pawn(4, Position.getBluePath(1, 1), pawnBlue, imgPawnBlue4, 10);

//nieobrobione przyciski !!!
    Pawn pawn1r = new Pawn(1,Position.getRedPath(9,0),pawnRed,imgPawnRed1,0);
    Pawn pawn2r = new Pawn(2,Position.getRedPath(10,0),pawnRed,imgPawnRed2,0);
    Pawn pawn3r = new Pawn(3,Position.getRedPath(9,1),pawnRed,imgPawnRed3,0);
    Pawn pawn4r = new Pawn(4,Position.getRedPath(10,1),pawnRed,imgPawnRed4,0);

    /*Pawn pawn1g = new Pawn(1,new Position(9,9),new Position(10,6),pawnRed,imgPawnRed1,new Position(9,9));
    Pawn pawn2g = new Pawn(2,new Position(10,9),new Position(10,6),pawnRed,imgPawnRed1,new Position(10,9));
    Pawn pawn3g = new Pawn(3,new Position(9,10),new Position(10,6),pawnRed,imgPawnRed1,new Position(9,10));
    Pawn pawn4g = new Pawn(4,new Position(10,10),new Position(10,6),pawnRed,imgPawnRed1,new Position(10,10));*/

    int playerIndex = 0;

    Player player1 = new Player("Payer1", "yellow", pawn1y, pawn2y, pawn3y, pawn4y);
    Player player2 = new Player("Payer2", "blue", pawn1b, pawn2b, pawn3b, pawn4b);
    Player player3 = new Player("Payer3", "red", pawn1r, pawn2r, pawn3r, pawn4r);

    /*
      Player player4 = new Player("Payer4","green",pawn1g,pawn2g,pawn3g,pawn4g);
  */
    public final Player[] getPlayers() {
        Player[] players = new Player[3];
        players[0] = player1;
        players[1] = player2;
        players[2] = player3;
        //players[3]=player4;
        return players;
    }

    public void setNextPlayer() {
        playerIndex = (playerIndex + 1) % playersQuantity.getQuantityOfPlayers();
        currentPlayer = getPlayers()[playerIndex];

    }

    public Player getNextPlayer() {
        if (playerIndex==0){
            return getPlayers()[1];
        } else {
            return getPlayers()[0];
        }
        /*if(currentPlayer==player1) {
            return player2;
        } else return player1;*/
    }

    public Player getPlayer1() {
        return player1;
    }


    public void incrementThrowsCounter() {
        throwsCounter++;
    }

    public Position getNextPlayerCurrPawnPos(){
        int nextPlayerIndex = (playerIndex + 1) % playersQuantity.getQuantityOfPlayers();
        Position nextPlayerPos = getPlayers()[nextPlayerIndex].getCurrentPawn().getCurrentPosition();
        return nextPlayerPos;
    }
}
