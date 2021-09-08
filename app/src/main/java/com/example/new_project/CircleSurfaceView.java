package com.example.new_project;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.view.SurfaceView;
import android.view.View;
import android.widget.SeekBar;

public class CircleSurfaceView extends SurfaceView
implements SeekBar.OnSeekBarChangeListener, View.OnClickListener {
//Want to create paints a a memver variable for memory efficiency

    private Paint redPaint;
    showImage = true;
}

protected void onDraw(Canvas canvas)
{
    canvas.drawCircle(300, 300, circleSize, redPaint);

    if(showImage) {
        Bitmap image = BitmapFactory.decodeResource(
                getResources(), R.drawable.maxresdefault);
        canvas.drawBitmap(image, 200.f, 200.f, redPaint);
    }

}
@Override
public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser)
{
    //Want to update the size of circle
    //A: need to member variable to hold gold updated info
    circleSize = progress;
    //B: We have to tell the view that it is no longer valid
    invalidate();
}

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public void onClick(View v) {
    //WANT to show or hide this image
        showImage = !showImage;
        invalidate();
    }




