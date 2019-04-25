package com.ludoboardgame;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.util.Arrays;
import java.util.List;

import static java.util.stream.Collectors.toList;

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
    private ImageView imgPawnGreen2 = new ImageView(pawnGreen);
    private ImageView imgPawnGreen3 = new ImageView(pawnGreen);
    private ImageView imgPawnGreen4 = new ImageView(pawnGreen);

    Pawn pawn1y = new Pawn(1, Position.getYellowPath(0, 9), pawnPurple, imgPawnPurple1);
    Pawn pawn2y = new Pawn(2, Position.getYellowPath(1, 9), pawnPurple, imgPawnPurple2);
    Pawn pawn3y = new Pawn(3, Position.getYellowPath(0, 10), pawnPurple, imgPawnPurple3);
    Pawn pawn4y = new Pawn(4, Position.getYellowPath(1, 10), pawnPurple, imgPawnPurple4);

    Pawn pawn1b = new Pawn(1, Position.getBluePath(0, 0), pawnBlue, imgPawnBlue1);
    Pawn pawn2b = new Pawn(2, Position.getBluePath(1, 0), pawnBlue, imgPawnBlue2);
    Pawn pawn3b = new Pawn(3, Position.getBluePath(0, 1), pawnBlue, imgPawnBlue3);
    Pawn pawn4b = new Pawn(4, Position.getBluePath(1, 1), pawnBlue, imgPawnBlue4);

    Pawn pawn1r = new Pawn(1, Position.getRedPath(9, 0), pawnRed, imgPawnRed1);
    Pawn pawn2r = new Pawn(2, Position.getRedPath(10, 0), pawnRed, imgPawnRed2);
    Pawn pawn3r = new Pawn(3, Position.getRedPath(9, 1), pawnRed, imgPawnRed3);
    Pawn pawn4r = new Pawn(4, Position.getRedPath(10, 1), pawnRed, imgPawnRed4);

    Pawn pawn1g = new Pawn(1,Position.getGreenPath(9,9),pawnGreen,imgPawnGreen1);
    Pawn pawn2g = new Pawn(2,Position.getGreenPath(10,9),pawnGreen,imgPawnGreen2);
    Pawn pawn3g = new Pawn(3,Position.getGreenPath(9,10),pawnGreen,imgPawnGreen3);
    Pawn pawn4g = new Pawn(4,Position.getGreenPath(10,10),pawnGreen,imgPawnGreen4);

    int playerIndex = 0;

    Player player1 = new Player("Payer1", "yellow", pawn1y, pawn2y, pawn3y, pawn4y);
    Player player2 = new Player("Payer2", "blue", pawn1b, pawn2b, pawn3b, pawn4b);
    Player player3 = new Player("Payer3", "red", pawn1r, pawn2r, pawn3r, pawn4r);
    Player player4 = new Player("Payer4", "green", pawn1g, pawn2g, pawn3g, pawn4g);

    public final Player[] getPlayers() {
        Player[] players = null;
        if (playersQuantity.getQuantityOfPlayers() == 2) {
            players = new Player[2];
            players[0] = player1;
            players[1] = player2;
        }
        if (playersQuantity.getQuantityOfPlayers() == 3) {
            players = new Player[3];
            players[0] = player1;
            players[1] = player2;
            players[2] = player3;
        }
        if (playersQuantity.getQuantityOfPlayers() == 4) {
            players = new Player[4];
            players[0] = player1;
            players[1] = player2;
            players[2] = player3;
            players[3] = player4;
        }
        return players;
    }

    public void setNextPlayer() {
        playerIndex = (playerIndex + 1) % playersQuantity.getQuantityOfPlayers();
        currentPlayer = getPlayers()[playerIndex];

    }

    public Player getPlayer1() {
        return player1;
    }

    public void incrementThrowsCounter() {
        throwsCounter++;
    }

    List<Pawn> getCurrPlayerHomePawns() {
        return Arrays.stream(getCurrentPlayer().getPawns())
                .filter(pawn -> pawn.getCurrentPosIndex() == 0)
                .collect(toList());
    }

    List<Pawn> getCurrPlayerInTargetPawns() {
        return Arrays.stream(getCurrentPlayer().getPawns())
                .filter(pawn -> pawn.getCurrentPosIndex() > 40 && pawn.getCurrentPosIndex() < 45)
                .collect(toList());
    }

    List<Pawn> getOpponentsOnPath() {
        return Arrays.stream(getPlayers())
                .filter(player -> !player.getPlayerColor().equals(getCurrentPlayer().getPlayerColor()))
                .flatMap(player -> Arrays.stream(player.getPawns()))
                .filter(pawn -> pawn.getCurrentPosIndex() > 0 && pawn.getCurrentPosIndex() < 41)
                .collect(toList());
    }

    List<Pawn> getCurrPlayerOnPathPawns() {
        return Arrays.stream(getCurrentPlayer().getPawns())
                .filter(pawn -> pawn.getCurrentPosIndex() > 0 && pawn.getCurrentPosIndex() < 41)
                .collect(toList());
    }
}
