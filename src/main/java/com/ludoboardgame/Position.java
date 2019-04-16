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

    public int getFy() {
        return fy;
    }

    public static Position[] getYellowPath(int homePositionX, int homePositionY) {
        Position[] yellowPath = new Position[45];
        yellowPath[0] = new Position(homePositionX, homePositionY); //home
        yellowPath[1] = new Position(4, 10);//start
        yellowPath[2] = new Position(4, 9);
        yellowPath[3] = new Position(4, 8);
        yellowPath[4] = new Position(4, 7);
        yellowPath[5] = new Position(4, 6);
        yellowPath[6] = new Position(3, 6);
        yellowPath[7] = new Position(2, 6);
        yellowPath[8] = new Position(1, 6);
        yellowPath[9] = new Position(0, 6);
        yellowPath[10] = new Position(0, 5);
        yellowPath[11] = new Position(0, 4);
        yellowPath[12] = new Position(1, 4);
        yellowPath[13] = new Position(2, 4);
        yellowPath[14] = new Position(3, 4);
        yellowPath[15] = new Position(4, 4);
        yellowPath[16] = new Position(4, 3);
        yellowPath[17] = new Position(4, 2);
        yellowPath[18] = new Position(4, 1);
        yellowPath[19] = new Position(4, 0);
        yellowPath[20] = new Position(5, 0);
        yellowPath[21] = new Position(6, 0);
        yellowPath[22] = new Position(6, 1);
        yellowPath[23] = new Position(6, 2);
        yellowPath[24] = new Position(6, 3);
        yellowPath[25] = new Position(6, 4);
        yellowPath[26] = new Position(7, 4);
        yellowPath[27] = new Position(8, 4);
        yellowPath[28] = new Position(9, 4);
        yellowPath[29] = new Position(10, 4);
        yellowPath[30] = new Position(10, 5);
        yellowPath[31] = new Position(10, 6);
        yellowPath[32] = new Position(9, 6);
        yellowPath[33] = new Position(8, 6);
        yellowPath[34] = new Position(7, 6);
        yellowPath[35] = new Position(6, 6);
        yellowPath[36] = new Position(6, 7);
        yellowPath[37] = new Position(6, 8);
        yellowPath[38] = new Position(6, 9);
        yellowPath[39] = new Position(6, 10);
        yellowPath[40] = new Position(5, 10);//last white field
        yellowPath[41] = new Position(5, 9);//finish
        yellowPath[42] = new Position(5, 8);//finish
        yellowPath[43] = new Position(5, 7);//finish
        yellowPath[44] = new Position(5, 6);//finish

        return yellowPath;
    }

    public static Position[] getBluePath(int homePositionX, int homePositionY) {
        Position[] bluePath1 = new Position[45];
        bluePath1[0] = new Position(homePositionX, homePositionY); //home

        bluePath1[1] = new Position(0, 4);//start
        bluePath1[2] = new Position(1, 4);
        bluePath1[3] = new Position(2, 4);
        bluePath1[4] = new Position(3, 4);
        bluePath1[5] = new Position(4, 4);
        bluePath1[6] = new Position(4, 3);
        bluePath1[7] = new Position(4, 2);
        bluePath1[8] = new Position(4, 1);
        bluePath1[9] = new Position(4, 0);
        bluePath1[10] = new Position(5, 0);
        bluePath1[11] = new Position(6, 0);
        bluePath1[12] = new Position(6, 1);
        bluePath1[13] = new Position(6, 2);
        bluePath1[14] = new Position(6, 3);
        bluePath1[15] = new Position(6, 4);
        bluePath1[16] = new Position(7, 4);
        bluePath1[17] = new Position(8, 4);
        bluePath1[18] = new Position(9, 4);
        bluePath1[19] = new Position(10, 4);
        bluePath1[20] = new Position(10, 5);
        bluePath1[21] = new Position(10, 6);
        bluePath1[22] = new Position(9, 6);
        bluePath1[23] = new Position(8, 6);
        bluePath1[24] = new Position(7, 6);
        bluePath1[25] = new Position(6, 6);
        bluePath1[26] = new Position(6, 7);
        bluePath1[27] = new Position(6, 8);
        bluePath1[28] = new Position(6, 9);
        bluePath1[29] = new Position(6, 10);
        bluePath1[30] = new Position(5, 10);

        bluePath1[31] = new Position(4, 10);
        bluePath1[32] = new Position(4, 9);
        bluePath1[33] = new Position(4, 8);
        bluePath1[34] = new Position(4, 7);
        bluePath1[35] = new Position(4, 6);
        bluePath1[36] = new Position(3, 6);
        bluePath1[37] = new Position(2, 6);
        bluePath1[38] = new Position(1, 6);
        bluePath1[39] = new Position(0, 6);
        bluePath1[40] = new Position(0, 5);//last white field

        bluePath1[41] = new Position(1, 5);//finish
        bluePath1[42] = new Position(2, 5);//finish
        bluePath1[43] = new Position(3, 5);//finish
        bluePath1[44] = new Position(4, 5);//finish

        return bluePath1;
    }

    public static Position[] getRedPath(int homePositionX, int homePositionY) {
        Position[] redPath = new Position[45];
        redPath[0] = new Position(homePositionX, homePositionY); //home

        redPath[1] = new Position(6, 0);//start
        redPath[2] = new Position(6, 1);
        redPath[3] = new Position(6, 2);
        redPath[4] = new Position(6, 3);
        redPath[5] = new Position(6, 4);

        redPath[6] = new Position(7, 4);
        redPath[7] = new Position(8, 4);
        redPath[8] = new Position(9, 4);
        redPath[9] = new Position(10, 4);

        redPath[10] = new Position(10, 5);
        redPath[11] = new Position(10, 6);
        redPath[12] = new Position(9, 6);
        redPath[13] = new Position(8, 6);
        redPath[14] = new Position(7, 6);
        redPath[15] = new Position(6, 6);

        redPath[16] = new Position(6, 7);
        redPath[17] = new Position(6, 8);
        redPath[18] = new Position(6, 9);
        redPath[19] = new Position(6, 10);
        redPath[20] = new Position(5, 10);
        redPath[21] = new Position(4, 10);

        redPath[22] = new Position(4, 9);
        redPath[23] = new Position(4, 8);
        redPath[24] = new Position(4, 7);
        redPath[25] = new Position(4, 6);
        redPath[26] = new Position(3, 6);
        redPath[27] = new Position(2, 6);
        redPath[28] = new Position(1, 6);
        redPath[29] = new Position(0, 6);

        redPath[30] = new Position(0, 5);
        redPath[31] = new Position(0, 4);
        redPath[32] = new Position(1, 4);
        redPath[33] = new Position(2, 4);
        redPath[34] = new Position(3, 4);
        redPath[35] = new Position(4, 4);
        redPath[36] = new Position(4, 3);
        redPath[37] = new Position(4, 2);
        redPath[38] = new Position(4, 1);
        redPath[39] = new Position(4, 0);
        redPath[40] = new Position(5, 0);//last white field

        redPath[41] = new Position(5, 1);//finish
        redPath[42] = new Position(5, 2);//finish
        redPath[43] = new Position(5, 3);//finish
        redPath[44] = new Position(5, 4);//finish

        return redPath;
    }
    public static Position[] getBluePath3() {
        Position[] bluePath3 = new Position[45];
        bluePath3[0] = new Position(0, 1); //home

        bluePath3[1] = new Position(0, 4);//start
        bluePath3[2] = new Position(1, 4);
        bluePath3[3] = new Position(2, 4);
        bluePath3[4] = new Position(3, 4);
        bluePath3[5] = new Position(4, 4);
        bluePath3[6] = new Position(4, 3);
        bluePath3[7] = new Position(4, 2);
        bluePath3[8] = new Position(4, 1);
        bluePath3[9] = new Position(4, 0);
        bluePath3[10] = new Position(5, 0);
        bluePath3[11] = new Position(6, 0);
        bluePath3[12] = new Position(6, 1);
        bluePath3[13] = new Position(6, 2);
        bluePath3[44] = new Position(6, 3);
        bluePath3[15] = new Position(6, 4);
        bluePath3[16] = new Position(7, 4);
        bluePath3[17] = new Position(8, 4);
        bluePath3[18] = new Position(9, 4);
        bluePath3[19] = new Position(10, 4);
        bluePath3[20] = new Position(10, 5);
        bluePath3[21] = new Position(10, 6);
        bluePath3[22] = new Position(9, 6);
        bluePath3[23] = new Position(8, 6);
        bluePath3[24] = new Position(7, 6);
        bluePath3[25] = new Position(6, 6);
        bluePath3[26] = new Position(6, 7);
        bluePath3[27] = new Position(6, 8);
        bluePath3[28] = new Position(6, 9);
        bluePath3[29] = new Position(6, 10);
        bluePath3[30] = new Position(5, 10);

        bluePath3[31] = new Position(4, 10);
        bluePath3[32] = new Position(4, 9);
        bluePath3[33] = new Position(4, 8);
        bluePath3[34] = new Position(4, 7);
        bluePath3[35] = new Position(4, 6);
        bluePath3[36] = new Position(3, 6);
        bluePath3[37] = new Position(2, 6);
        bluePath3[38] = new Position(1, 6);
        bluePath3[39] = new Position(0, 6);
        bluePath3[40] = new Position(0, 5);//last white field

        bluePath3[41] = new Position(1, 5);//finish
        bluePath3[42] = new Position(2, 5);//finish
        bluePath3[43] = new Position(3, 5);//finish
        bluePath3[44] = new Position(4, 5);//finish

        return bluePath3;
    }


}
