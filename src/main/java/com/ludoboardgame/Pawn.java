package com.ludoboardgame;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;

public class Pawn {
    private int pawnIndex;
    private Position homePosition;
    private Image pawnImage;
    private ImageView imgPawn = new ImageView(pawnImage);
    private int currentPosIndex = 0;
    private Position[] path;
    private int offset;

    private int pawnFinalPosIndex;

    public Pawn(int pawnIndex, Position[] path, Image pawnImage, ImageView imgPawn, int offset) {
        this.pawnIndex = pawnIndex;
        this.homePosition = path[0];
        this.path = path;
        this.pawnImage = pawnImage;
        this.imgPawn = imgPawn;
        this.offset = offset;
    }

    public int getOffset() {
        return offset;
    }

    public Position getHomePosition() {
        return homePosition;
    }

    public Position[] getPath() {
        return path;
    }

    public int getPawnIndex() {
        return pawnIndex;
    }

    public Image getPawnImage() {
        return pawnImage;
    }

    public void setPawnImage(Image pawnImage) {
        this.pawnImage = pawnImage;
    }

    public ImageView getImgPawn() {
        return imgPawn;
    }

    public void setCurrentPosIndex(int currentPosIndex) {
        this.currentPosIndex = currentPosIndex;
    }


    public Position getNextPosition() {
        return path[++currentPosIndex];
        //return path[1];
    }
    public Position getLastPosition() {
        return path[++currentPosIndex];
        //return path[1];
    }

    public Position getCurrentPosition(){
        return path[currentPosIndex];
    }

    public int getCurrentPosIndex() {
        return currentPosIndex;
    }

    public Position getNextPositionBehindHome(int diceResult){
        //return path[currentPosIndex+diceResult];
        currentPosIndex=currentPosIndex+diceResult;
        return path[currentPosIndex];
    }
    public Position getFinishPosition(int diceResult){
        return path[currentPosIndex+diceResult];
        //currentPosIndex=currentPosIndex+diceResult;
        //return path[currentPosIndex];
    }

    public int getNextPosIndex(int diceResult){return currentPosIndex+diceResult;}

    public int getPawnFinalPosIndex() {
        return pawnFinalPosIndex;
    }

    public void setPawnFinalPosIndex(int pawnFinalPosIndex) {
        this.pawnFinalPosIndex = pawnFinalPosIndex;
    }
}
