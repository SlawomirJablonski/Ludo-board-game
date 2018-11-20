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

    public static Position[] getYellowPath1() {
        Position[] yellowPath1 = new Position[45];
        yellowPath1[0] = new Position(0, 9); //home
        yellowPath1[1] = new Position(4, 10);//start
        yellowPath1[2] = new Position(4, 9);
        yellowPath1[3] = new Position(4, 8);
        yellowPath1[4] = new Position(4, 7);
        yellowPath1[5] = new Position(4, 6);
        yellowPath1[6] = new Position(3, 6);
        yellowPath1[7] = new Position(2, 6);
        yellowPath1[8] = new Position(1, 6);
        yellowPath1[9] = new Position(0, 6);
        yellowPath1[10] = new Position(0, 5);
        yellowPath1[11] = new Position(0, 4);
        yellowPath1[12] = new Position(1, 4);
        yellowPath1[13] = new Position(2, 4);
        yellowPath1[14] = new Position(3, 4);
        yellowPath1[15] = new Position(4, 4);
        yellowPath1[16] = new Position(4, 3);
        yellowPath1[17] = new Position(4, 2);
        yellowPath1[18] = new Position(4, 1);
        yellowPath1[19] = new Position(4, 0);
        yellowPath1[20] = new Position(5, 0);
        yellowPath1[21] = new Position(6, 0);
        yellowPath1[22] = new Position(6, 1);
        yellowPath1[23] = new Position(6, 2);
        yellowPath1[24] = new Position(6, 3);
        yellowPath1[25] = new Position(6, 4);
        yellowPath1[26] = new Position(7, 4);
        yellowPath1[27] = new Position(8, 4);
        yellowPath1[28] = new Position(9, 4);
        yellowPath1[29] = new Position(10, 4);
        yellowPath1[30] = new Position(10, 5);
        yellowPath1[31] = new Position(10, 6);
        yellowPath1[32] = new Position(9, 6);
        yellowPath1[33] = new Position(8, 6);
        yellowPath1[34] = new Position(7, 6);
        yellowPath1[35] = new Position(6, 6);
        yellowPath1[36] = new Position(6, 7);
        yellowPath1[37] = new Position(6, 8);
        yellowPath1[38] = new Position(6, 9);
        yellowPath1[39] = new Position(6, 10);
        yellowPath1[40] = new Position(5, 10);//last white field
        yellowPath1[41] = new Position(5, 9);//finish
        yellowPath1[42] = new Position(5, 8);//finish
        yellowPath1[43] = new Position(5, 7);//finish
        yellowPath1[44] = new Position(5, 6);//finish

        return yellowPath1;
    }
    public static Position[] getYellowPath2() {
        Position[] yellowPath2 = new Position[45];
        yellowPath2[0] = new Position(1, 9); //home
        yellowPath2[1] = new Position(4, 10);//start
        yellowPath2[2] = new Position(4, 9);
        yellowPath2[3] = new Position(4, 8);
        yellowPath2[4] = new Position(4, 7);
        yellowPath2[5] = new Position(4, 6);
        yellowPath2[6] = new Position(3, 6);
        yellowPath2[7] = new Position(2, 6);
        yellowPath2[8] = new Position(1, 6);
        yellowPath2[9] = new Position(0, 6);
        yellowPath2[10] = new Position(0, 5);
        yellowPath2[11] = new Position(0, 4);
        yellowPath2[12] = new Position(1, 4);
        yellowPath2[13] = new Position(2, 4);
        yellowPath2[14] = new Position(3, 4);
        yellowPath2[15] = new Position(4, 4);
        yellowPath2[16] = new Position(4, 3);
        yellowPath2[17] = new Position(4, 2);
        yellowPath2[18] = new Position(4, 1);
        yellowPath2[19] = new Position(4, 0);
        yellowPath2[20] = new Position(5, 0);
        yellowPath2[21] = new Position(6, 0);
        yellowPath2[22] = new Position(6, 1);
        yellowPath2[23] = new Position(6, 2);
        yellowPath2[24] = new Position(6, 3);
        yellowPath2[25] = new Position(6, 4);
        yellowPath2[26] = new Position(7, 4);
        yellowPath2[27] = new Position(8, 4);
        yellowPath2[28] = new Position(9, 4);
        yellowPath2[29] = new Position(10, 4);
        yellowPath2[30] = new Position(10, 5);
        yellowPath2[31] = new Position(10, 6);
        yellowPath2[32] = new Position(9, 6);
        yellowPath2[33] = new Position(8, 6);
        yellowPath2[34] = new Position(7, 6);
        yellowPath2[35] = new Position(6, 6);
        yellowPath2[36] = new Position(6, 7);
        yellowPath2[37] = new Position(6, 8);
        yellowPath2[38] = new Position(6, 9);
        yellowPath2[39] = new Position(6, 10);
        yellowPath2[40] = new Position(5, 10);//last white field
        yellowPath2[41] = new Position(5, 9);//finish
        yellowPath2[42] = new Position(5, 8);//finish
        yellowPath2[43] = new Position(5, 7);//finish
        yellowPath2[44] = new Position(5, 6);//finish

        return yellowPath2;
    }
    public static Position[] getYellowPath3() {
        Position[] yellowPath3 = new Position[45];
        yellowPath3[0] = new Position(0, 10); //home
        yellowPath3[1] = new Position(4, 10);//start
        yellowPath3[2] = new Position(4, 9);
        yellowPath3[3] = new Position(4, 8);
        yellowPath3[4] = new Position(4, 7);
        yellowPath3[5] = new Position(4, 6);
        yellowPath3[6] = new Position(3, 6);
        yellowPath3[7] = new Position(2, 6);
        yellowPath3[8] = new Position(1, 6);
        yellowPath3[9] = new Position(0, 6);
        yellowPath3[10] = new Position(0, 5);
        yellowPath3[11] = new Position(0, 4);
        yellowPath3[12] = new Position(1, 4);
        yellowPath3[13] = new Position(2, 4);
        yellowPath3[14] = new Position(3, 4);
        yellowPath3[15] = new Position(4, 4);
        yellowPath3[16] = new Position(4, 3);
        yellowPath3[17] = new Position(4, 2);
        yellowPath3[18] = new Position(4, 1);
        yellowPath3[19] = new Position(4, 0);
        yellowPath3[20] = new Position(5, 0);
        yellowPath3[21] = new Position(6, 0);
        yellowPath3[22] = new Position(6, 1);
        yellowPath3[23] = new Position(6, 2);
        yellowPath3[24] = new Position(6, 3);
        yellowPath3[25] = new Position(6, 4);
        yellowPath3[26] = new Position(7, 4);
        yellowPath3[27] = new Position(8, 4);
        yellowPath3[28] = new Position(9, 4);
        yellowPath3[29] = new Position(10, 4);
        yellowPath3[30] = new Position(10, 5);
        yellowPath3[31] = new Position(10, 6);
        yellowPath3[32] = new Position(9, 6);
        yellowPath3[33] = new Position(8, 6);
        yellowPath3[34] = new Position(7, 6);
        yellowPath3[35] = new Position(6, 6);
        yellowPath3[36] = new Position(6, 7);
        yellowPath3[37] = new Position(6, 8);
        yellowPath3[38] = new Position(6, 9);
        yellowPath3[39] = new Position(6, 10);
        yellowPath3[40] = new Position(5, 10);//last white field
        yellowPath3[41] = new Position(5, 9);//finish
        yellowPath3[42] = new Position(5, 8);//finish
        yellowPath3[43] = new Position(5, 7);//finish
        yellowPath3[44] = new Position(5, 6);//finish

        return yellowPath3;
    }
    public static Position[] getYellowPath4() {
        Position[] yellowPath4 = new Position[45];
        yellowPath4[0] = new Position(1, 10); //home
        yellowPath4[1] = new Position(4, 10);//start
        yellowPath4[2] = new Position(4, 9);
        yellowPath4[3] = new Position(4, 8);
        yellowPath4[4] = new Position(4, 7);
        yellowPath4[5] = new Position(4, 6);
        yellowPath4[6] = new Position(3, 6);
        yellowPath4[7] = new Position(2, 6);
        yellowPath4[8] = new Position(1, 6);
        yellowPath4[9] = new Position(0, 6);
        yellowPath4[10] = new Position(0, 5);
        yellowPath4[11] = new Position(0, 4);
        yellowPath4[12] = new Position(1, 4);
        yellowPath4[13] = new Position(2, 4);
        yellowPath4[14] = new Position(3, 4);
        yellowPath4[15] = new Position(4, 4);
        yellowPath4[16] = new Position(4, 3);
        yellowPath4[17] = new Position(4, 2);
        yellowPath4[18] = new Position(4, 1);
        yellowPath4[19] = new Position(4, 0);
        yellowPath4[20] = new Position(5, 0);
        yellowPath4[21] = new Position(6, 0);
        yellowPath4[22] = new Position(6, 1);
        yellowPath4[23] = new Position(6, 2);
        yellowPath4[24] = new Position(6, 3);
        yellowPath4[25] = new Position(6, 4);
        yellowPath4[26] = new Position(7, 4);
        yellowPath4[27] = new Position(8, 4);
        yellowPath4[28] = new Position(9, 4);
        yellowPath4[29] = new Position(10, 4);
        yellowPath4[30] = new Position(10, 5);
        yellowPath4[31] = new Position(10, 6);
        yellowPath4[32] = new Position(9, 6);
        yellowPath4[33] = new Position(8, 6);
        yellowPath4[34] = new Position(7, 6);
        yellowPath4[35] = new Position(6, 6);
        yellowPath4[36] = new Position(6, 7);
        yellowPath4[37] = new Position(6, 8);
        yellowPath4[38] = new Position(6, 9);
        yellowPath4[39] = new Position(6, 10);
        yellowPath4[40] = new Position(5, 10);//last white field
        yellowPath4[41] = new Position(5, 9);//finish
        yellowPath4[42] = new Position(5, 8);//finish
        yellowPath4[43] = new Position(5, 7);//finish
        yellowPath4[44] = new Position(5, 6);//finish

        return yellowPath4;
    }

    public static Position[] getBluePath1() {
        Position[] bluePath1 = new Position[45];
        bluePath1[0] = new Position(0, 0); //home

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
        bluePath1[44] = new Position(6, 3);
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
    public static Position[] getBluePath2() {
        Position[] bluePath2 = new Position[45];
        bluePath2[0] = new Position(1, 0); //home

        bluePath2[1] = new Position(0, 4);//start
        bluePath2[2] = new Position(1, 4);
        bluePath2[3] = new Position(2, 4);
        bluePath2[4] = new Position(3, 4);
        bluePath2[5] = new Position(4, 4);
        bluePath2[6] = new Position(4, 3);
        bluePath2[7] = new Position(4, 2);
        bluePath2[8] = new Position(4, 1);
        bluePath2[9] = new Position(4, 0);
        bluePath2[10] = new Position(5, 0);
        bluePath2[11] = new Position(6, 0);
        bluePath2[12] = new Position(6, 1);
        bluePath2[13] = new Position(6, 2);
        bluePath2[44] = new Position(6, 3);
        bluePath2[15] = new Position(6, 4);
        bluePath2[16] = new Position(7, 4);
        bluePath2[17] = new Position(8, 4);
        bluePath2[18] = new Position(9, 4);
        bluePath2[19] = new Position(10, 4);
        bluePath2[20] = new Position(10, 5);
        bluePath2[21] = new Position(10, 6);
        bluePath2[22] = new Position(9, 6);
        bluePath2[23] = new Position(8, 6);
        bluePath2[24] = new Position(7, 6);
        bluePath2[25] = new Position(6, 6);
        bluePath2[26] = new Position(6, 7);
        bluePath2[27] = new Position(6, 8);
        bluePath2[28] = new Position(6, 9);
        bluePath2[29] = new Position(6, 10);
        bluePath2[30] = new Position(5, 10);

        bluePath2[31] = new Position(4, 10);
        bluePath2[32] = new Position(4, 9);
        bluePath2[33] = new Position(4, 8);
        bluePath2[34] = new Position(4, 7);
        bluePath2[35] = new Position(4, 6);
        bluePath2[36] = new Position(3, 6);
        bluePath2[37] = new Position(2, 6);
        bluePath2[38] = new Position(1, 6);
        bluePath2[39] = new Position(0, 6);
        bluePath2[40] = new Position(0, 5);//last white field

        bluePath2[41] = new Position(1, 5);//finish
        bluePath2[42] = new Position(2, 5);//finish
        bluePath2[43] = new Position(3, 5);//finish
        bluePath2[44] = new Position(4, 5);//finish

        return bluePath2;
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
    public static Position[] getBluePath4() {
        Position[] bluePath4 = new Position[45];
        bluePath4[0] = new Position(1, 1); //home

        bluePath4[1] = new Position(0, 4);//start
        bluePath4[2] = new Position(1, 4);
        bluePath4[3] = new Position(2, 4);
        bluePath4[4] = new Position(3, 4);
        bluePath4[5] = new Position(4, 4);
        bluePath4[6] = new Position(4, 3);
        bluePath4[7] = new Position(4, 2);
        bluePath4[8] = new Position(4, 1);
        bluePath4[9] = new Position(4, 0);
        bluePath4[10] = new Position(5, 0);
        bluePath4[11] = new Position(6, 0);
        bluePath4[12] = new Position(6, 1);
        bluePath4[13] = new Position(6, 2);
        bluePath4[44] = new Position(6, 3);
        bluePath4[15] = new Position(6, 4);
        bluePath4[16] = new Position(7, 4);
        bluePath4[17] = new Position(8, 4);
        bluePath4[18] = new Position(9, 4);
        bluePath4[19] = new Position(10, 4);
        bluePath4[20] = new Position(10, 5);
        bluePath4[21] = new Position(10, 6);
        bluePath4[22] = new Position(9, 6);
        bluePath4[23] = new Position(8, 6);
        bluePath4[24] = new Position(7, 6);
        bluePath4[25] = new Position(6, 6);
        bluePath4[26] = new Position(6, 7);
        bluePath4[27] = new Position(6, 8);
        bluePath4[28] = new Position(6, 9);
        bluePath4[29] = new Position(6, 10);
        bluePath4[30] = new Position(5, 10);

        bluePath4[31] = new Position(4, 10);
        bluePath4[32] = new Position(4, 9);
        bluePath4[33] = new Position(4, 8);
        bluePath4[34] = new Position(4, 7);
        bluePath4[35] = new Position(4, 6);
        bluePath4[36] = new Position(3, 6);
        bluePath4[37] = new Position(2, 6);
        bluePath4[38] = new Position(1, 6);
        bluePath4[39] = new Position(0, 6);
        bluePath4[40] = new Position(0, 5);//last white field

        bluePath4[41] = new Position(1, 5);//finish
        bluePath4[42] = new Position(2, 5);//finish
        bluePath4[43] = new Position(3, 5);//finish
        bluePath4[44] = new Position(4, 5);//finish

        return bluePath4;
    }

}
