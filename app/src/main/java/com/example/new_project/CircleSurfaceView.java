package com.example.new_project;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;

public class CircleSurfaceView {

}

protected void onDraw(Canvas canvas)
{
    canvas.drawCircle(300, 300, circleSize, redPaint);
    Bitmap image = BitmapFactory.decodeResource(
            getResources(), R.drawable.maxresdefault);
    canvas.drawBitmap(image, 200.f, 200.f, redPaint);

}

public void onProgressChanged()
{
    //Want to update the size of circle
    //A: need to member variable to hold gold updated info
    circleSize = progress;
    //B: We have to tell the view that it is no longer valid
    invalidate();
}
