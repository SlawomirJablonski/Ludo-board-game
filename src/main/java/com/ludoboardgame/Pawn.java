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

    public ImageView getImgPawn() {
        return imgPawn;
    }

    public Position getNextPosition() {
        return path[++currentPosIndex];
    }
}
