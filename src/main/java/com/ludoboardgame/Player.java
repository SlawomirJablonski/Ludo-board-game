package com.ludoboardgame;

public class Player {
    private String playerName = "";
    private String playerColor = "";

    public Player(String playerName,String playerColor){
        this.playerName=playerName;
        this.playerColor=playerColor;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }
}
