package com.example.a533.canvas;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

public class Marqueur implements PlanViewDisplayable {
    private float positionX = 0;
    private float positionY = 0;
    private Bitmap plan;

    public Marqueur(Bitmap plan, float placeX, float placeY){
        this.plan = plan;
        this.positionX = placeX;
        this.positionY = placeY;
    }

    @Override
    public float getPositionX() {
        return positionX ;
    }

    @Override
    public float getPositionY() {
        return positionY ;
    }

    @Override
    public float getWidth() {
        return plan.getWidth();
    }

    @Override
    public float getHeight() {
        return plan.getHeight();
    }

    @Override
    public Bitmap getBitmap() {
        return plan;
    }
}
