package com.ludoboardgame;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;

public class Pawn {
    private int pawnIndex;
    private Position homePosition;
    private Position startPosition;
    private Image pawnImage;
    private ImageView imgPawn = new ImageView(pawnImage);
    private Position currentPos;

    public Pawn(int pawnIndex, Position homePosition, Position startPosition, Image pawnImage, ImageView imgPawn, Position currentPos) {
        this.pawnIndex = pawnIndex;
        this.homePosition = homePosition;
        this.startPosition = startPosition;
        this.pawnImage = pawnImage;
        this.imgPawn = imgPawn;
        this.currentPos = currentPos;
    }

    public int getPawnIndex() {
        return pawnIndex;
    }

    public void setPawnIndex(int pawnIndex) {
        this.pawnIndex = pawnIndex;
    }

    public Position getHomePosition() {
        return homePosition;
    }

    public void setHomePosition(Position homePosition) {
        this.homePosition = homePosition;
    }

    public Position getStartPosition() {
        return startPosition;
    }

    public void setStartPosition(Position startPosition) {
        this.startPosition = startPosition;
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

    public void setImgPawn(ImageView imgPawn) {
        this.imgPawn = imgPawn;
    }

    public Position getCurrentPos() {
        return currentPos;
    }

    public void setCurrentPos(Position currentPos) {
        this.currentPos = currentPos;
    }


    public void drawMove(Pawn pawn,Position position,GridPane gridPane){

        GridPane.setConstraints(pawn.getImgPawn(), position.getFx(), position.getFy());

    }
}
