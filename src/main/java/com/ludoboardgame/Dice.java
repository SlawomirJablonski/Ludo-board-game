package com.ludoboardgame;

import java.util.Random;

public class Dice {

    private int diceResult = 0;

    public void throwDice(){
        Random random = new Random();
        int throwResult = random.nextInt(6) + 1;
        this.diceResult = throwResult;
    }



    public int getDiceResult() {
        return diceResult;
    }


}
