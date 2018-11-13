package com.ludoboardgame;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Configuration {
    private int etap = 0;
    private int j = 0;

    private Image pawnPurple = new Image("pawnPurple2.png");
    private ImageView imgPawnPurple1 = new ImageView(pawnPurple);
    private ImageView imgPawnPurple2 = new ImageView(pawnPurple);
    private ImageView imgPawnPurple3 = new ImageView(pawnPurple);
    private ImageView imgPawnPurple4 = new ImageView(pawnPurple);
    private Image pawnBlue = new Image("pawnBlue3.png");
    private ImageView imgPawnBlue1 = new ImageView(pawnBlue);
    private Image pawnRed = new Image("pawnRed2.png");
    private ImageView imgPawnRed1 = new ImageView(pawnRed);
    private Image pawnGreen = new Image("pawnGreen2.png");
    private ImageView imgPawnGreen1 = new ImageView(pawnGreen);

    Pawn pawn1y = new Pawn(1,new Position(4,10),pawnPurple,imgPawnPurple1,new Position(0,8));
    Pawn pawn2y = new Pawn(2,new Position(4,10),pawnPurple,imgPawnPurple2,new Position(1,8));
    Pawn pawn3y = new Pawn(3,new Position(4,10),pawnPurple,imgPawnPurple3,new Position(2,9));
    Pawn pawn4y = new Pawn(4,new Position(4,10),pawnPurple,imgPawnPurple4,new Position(2,10));
/*
    Pawn pawn1y = new Pawn(1,new Position(0,9),new Position(4,10),pawnPurple,imgPawnPurple1,new Position(0,8));
    Pawn pawn2y = new Pawn(2,new Position(1,9),new Position(4,10),pawnPurple,imgPawnPurple1,new Position(1,8));
    Pawn pawn3y = new Pawn(3,new Position(0,10),new Position(4,10),pawnPurple,imgPawnPurple1,new Position(2,9));
    Pawn pawn4y = new Pawn(4,new Position(1,10),new Position(4,10),pawnPurple,imgPawnPurple1,new Position(2,10));
    */
    Pawn pawn1b = new Pawn(1,new Position(0,4),pawnBlue,imgPawnBlue1,new Position(0,0));
    Pawn pawn2b = new Pawn(2,new Position(0,4),pawnBlue,imgPawnBlue1,new Position(1,0));
    Pawn pawn3b = new Pawn(3,new Position(0,4),pawnBlue,imgPawnBlue1,new Position(0,1));
    Pawn pawn4b = new Pawn(4,new Position(0,4),pawnBlue,imgPawnBlue1,new Position(1,1));

    Pawn pawn1r = new Pawn(1,new Position(6,0),pawnRed,imgPawnRed1,new Position(9,0));
    Pawn pawn2r = new Pawn(2,new Position(6,0),pawnRed,imgPawnRed1,new Position(9,0));
    Pawn pawn3r = new Pawn(3,new Position(6,0),pawnRed,imgPawnRed1,new Position(9,0));
    Pawn pawn4r = new Pawn(4,new Position(6,0),pawnRed,imgPawnRed1,new Position(9,0));

    Pawn pawn1g = new Pawn(1,new Position(10,6),pawnRed,imgPawnRed1,new Position(9,9));
    Pawn pawn2g = new Pawn(2,new Position(10,6),pawnRed,imgPawnRed1,new Position(10,9));
    Pawn pawn3g = new Pawn(3,new Position(10,6),pawnRed,imgPawnRed1,new Position(9,10));
    Pawn pawn4g = new Pawn(4,new Position(10,6),pawnRed,imgPawnRed1,new Position(10,10));
/*
    Pawn pawn1b = new Pawn(1,new Position(0,0),new Position(0,4),pawnBlue,imgPawnBlue1,new Position(0,0));
    Pawn pawn2b = new Pawn(2,new Position(1,0),new Position(0,4),pawnBlue,imgPawnBlue1,new Position(1,0));
    Pawn pawn3b = new Pawn(3,new Position(0,1),new Position(0,4),pawnBlue,imgPawnBlue1,new Position(0,1));
    Pawn pawn4b = new Pawn(4,new Position(1,1),new Position(0,4),pawnBlue,imgPawnBlue1,new Position(1,1));

    Pawn pawn1r = new Pawn(1,new Position(9,0),new Position(6,0),pawnRed,imgPawnRed1,new Position(9,0));
    Pawn pawn2r = new Pawn(2,new Position(9,0),new Position(6,0),pawnRed,imgPawnRed1,new Position(9,0));
    Pawn pawn3r = new Pawn(3,new Position(9,0),new Position(6,0),pawnRed,imgPawnRed1,new Position(9,0));
    Pawn pawn4r = new Pawn(4,new Position(9,0),new Position(6,0),pawnRed,imgPawnRed1,new Position(9,0));

    Pawn pawn1g = new Pawn(1,new Position(9,9),new Position(10,6),pawnRed,imgPawnRed1,new Position(9,9));
    Pawn pawn2g = new Pawn(2,new Position(10,9),new Position(10,6),pawnRed,imgPawnRed1,new Position(10,9));
    Pawn pawn3g = new Pawn(3,new Position(9,10),new Position(10,6),pawnRed,imgPawnRed1,new Position(9,10));
    Pawn pawn4g = new Pawn(4,new Position(10,10),new Position(10,6),pawnRed,imgPawnRed1,new Position(10,10));
*/

    Player player1 = new Player("Payer1","yellow",pawn1y,pawn2y,pawn3y,pawn4y);
    Player player2 = new Player("Payer2","blue",pawn1b,pawn2b,pawn3b,pawn4b);
    Player player3 = new Player("Payer3","red",pawn1r,pawn2r,pawn3r,pawn4r);
    Player player4 = new Player("Payer4","green",pawn1g,pawn2g,pawn3g,pawn4g);


    public Player getPlayer1() {
        return player1;
    }

    public void setPlayer1(Player player1) {
        this.player1 = player1;
    }

    public Player getPlayer2() {
        return player2;
    }

    public void setPlayer2(Player player2) {
        this.player2 = player2;
    }

    public Player getPlayer3() {
        return player3;
    }

    public void setPlayer3(Player player3) {
        this.player3 = player3;
    }

    public Player getPlayer4() {
        return player4;
    }

    public void setPlayer4(Player player4) {
        this.player4 = player4;
    }

    public int getEtap() {
        return etap;
    }

    public void setEtap(int etap) {
        this.etap = etap;
    }

    public int getJ() {
        return j;
    }

    public void setJ(int j) {
        this.j = j;
    }



}
