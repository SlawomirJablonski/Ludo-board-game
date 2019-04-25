package com.ludoboardgame;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Pawn {
    private int pawnIndex;
    private Position homePosition;
    private Image pawnImage;
    private ImageView imgPawn = new ImageView(pawnImage);
    private int currentPosIndex = 0;
    private Position[] path;


    public Pawn(int pawnIndex, Position[] path, Image pawnImage, ImageView imgPawn) {
        this.pawnIndex = pawnIndex;
        this.homePosition = path[0];
        this.path = path;
        this.pawnImage = pawnImage;
        this.imgPawn = imgPawn;
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

    public ImageView getImgPawn() {
        return imgPawn;
    }

    public void setCurrentPosIndex(int currentPosIndex) {
        this.currentPosIndex = currentPosIndex;
    }

    public Position getNextPosition() {
        return path[++currentPosIndex];
    }

    public Position getCurrentPosition(){
        return path[currentPosIndex];
    }

    public int getCurrentPosIndex() {
        return currentPosIndex;
    }

    public Position getNextPositionBehindHome(int diceResult){
        currentPosIndex=diceResult+currentPosIndex;
        return path[currentPosIndex];
    }

}
