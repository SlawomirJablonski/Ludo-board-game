package com.ludoboardgame;

public class Player {
    private String playerName = "";
    private String playerColor = "";
    private Pawn playerPawn1;
    private Pawn playerPawn2;
    private Pawn playerPawn3;
    private Pawn playerPawn4;

    public Player(String playerName, String playerColor, Pawn playerPawn1, Pawn playerPawn2, Pawn playerPawn3, Pawn playerPawn4) {
        this.playerName = playerName;
        this.playerColor = playerColor;
        this.playerPawn1 = playerPawn1;
        this.playerPawn2 = playerPawn2;
        this.playerPawn3 = playerPawn3;
        this.playerPawn4 = playerPawn4;
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

    public Pawn getPlayerPawn1() {
        return playerPawn1;
    }

    public void setPlayerPawn1(Pawn playerPawn1) {
        this.playerPawn1 = playerPawn1;
    }

    public Pawn getPlayerPawn2() {
        return playerPawn2;
    }

    public void setPlayerPawn2(Pawn playerPawn2) {
        this.playerPawn2 = playerPawn2;
    }

    public Pawn getPlayerPawn3() {
        return playerPawn3;
    }

    public void setPlayerPawn3(Pawn playerPawn3) {
        this.playerPawn3 = playerPawn3;
    }

    public Pawn getPlayerPawn4() {
        return playerPawn4;
    }

    public void setPlayerPawn4(Pawn playerPawn4) {
        this.playerPawn4 = playerPawn4;
    }
}
