package com.ludoboardgame;

public class Player {
    private String playerName = "";
    private String playerColor = "";

    private int currentPawn = 0;
    private Pawn[] pawns;

    public Player(String playerName, String playerColor, Pawn playerPawn1, Pawn playerPawn2, Pawn playerPawn3, Pawn playerPawn4, Pawn playerPawn5) {
        this.playerName = playerName;
        this.playerColor = playerColor;
        pawns = new Pawn[]{playerPawn1, playerPawn2, playerPawn3, playerPawn4, playerPawn5};
    }

    public Pawn[] getPawns() {
        return pawns;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public Pawn getCurrentPawn() {
        return pawns[currentPawn];
    }

    public Pawn getNextPawn() {
        return pawns[currentPawn++];
        //return path[1];
    }
}
