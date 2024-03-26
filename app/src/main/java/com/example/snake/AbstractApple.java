package com.example.snake;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;


abstract class AbstractApple implements Draw{
    protected Point location = new Point();

    // The range of values we can choose from
    // to spawn an apple
    protected Point mSpawnRange;
    protected int mSize;

    // An image to represent the apple
    protected Bitmap mBitmapApple;

    abstract void setApple(Context context, Point sr, int s);
    abstract void spawn();
    // Let SnakeGame know where the apple is
    // SnakeGame can share this with the snake
    Point getLocation(){
        return location;
    }

}