package com.ludoboardgame;

public class Position {
    private int fx;
    private int fy;

    public Position(int fx, int fy) {
        this.fx = fx;
        this.fy = fy;
    }

    public int getFx() {
        return fx;
    }

    public void setFx(int fx) {
        this.fx = fx;
    }

    public int getFy() {
        return fy;
    }

    public void setFy(int fy) {
        this.fy = fy;
    }

    public static Position[] getYellowPath(){
        Position[] yellowPath = new Position[44];
        yellowPath[0]=new Position(0,9);
        yellowPath[1]=new Position(4,10);
        yellowPath[2]=new Position(4,9);
        yellowPath[3]=new Position(4,8);
        yellowPath[4]=new Position(4,7);
        yellowPath[5]=new Position(4,6);
        yellowPath[6]=new Position(3,6);
        yellowPath[7]=new Position(2,6);
        yellowPath[8]=new Position(1,6);
        yellowPath[9]=new Position(0,6);
        yellowPath[10]=new Position(0,5);
        yellowPath[11]=new Position(0,4);
        yellowPath[12]=new Position(1,4);
        yellowPath[13]=new Position(2,4);
        yellowPath[14]=new Position(3,4);
        yellowPath[15]=new Position(4,4);
        yellowPath[16]=new Position(4,3);
        yellowPath[17]=new Position(4,2);
        yellowPath[18]=new Position(4,1);
        yellowPath[19]=new Position(4,0);
        yellowPath[20]=new Position(5,0);
        yellowPath[21]=new Position(6,0);
        yellowPath[22]=new Position(6,1);
        yellowPath[23]=new Position(6,2);
        yellowPath[24]=new Position(6,3);
        yellowPath[25]=new Position(6,4);
        yellowPath[26]=new Position(7,4);
        yellowPath[27]=new Position(8,4);
        yellowPath[28]=new Position(9,4);
        yellowPath[29]=new Position(10,4);
        yellowPath[30]=new Position(10,5);
        yellowPath[31]=new Position(10,6);
        yellowPath[32]=new Position(9,6);
        yellowPath[33]=new Position(8,6);
        yellowPath[34]=new Position(7,6);
        yellowPath[35]=new Position(6,6);
        yellowPath[36]=new Position(6,7);
        yellowPath[37]=new Position(6,8);
        yellowPath[38]=new Position(6,9);
        yellowPath[39]=new Position(6,10);
        yellowPath[40]=new Position(5,10);
        yellowPath[41]=new Position(5,9);
        yellowPath[42]=new Position(5,8);
        yellowPath[43]=new Position(5,7);
        yellowPath[44]=new Position(5,6);

return yellowPath;
    }

}
