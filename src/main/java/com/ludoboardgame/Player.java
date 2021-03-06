package com.ludoboardgame;

public class Player {
    private String playerName = "";
    private String playerColor = "";

    private int currentPawn = 0;
    private Pawn[] pawns;

    public Player(String playerName, String playerColor, Pawn playerPawn1, Pawn playerPawn2, Pawn playerPawn3, Pawn playerPawn4) {
        this.playerName = playerName;
        this.playerColor = playerColor;
        pawns = new Pawn[]{playerPawn1, playerPawn2, playerPawn3, playerPawn4};
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

    public String getPlayerColor() {
        return playerColor;
    }

    public void setPlayerColor(String playerColor) {
        this.playerColor = playerColor;
    }

    public Pawn getCurrentPawn() {
        return pawns[currentPawn];
    }

    public void setCurrentPawn(int currentPawn) {
        this.currentPawn = currentPawn;
    }
}
