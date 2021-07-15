package com.example.ap_customview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.Nullable;

public class Circle  extends View {
    public Circle(Context context) {
        super(context);
    }

    public Circle(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int r=50;
        int centerX=getLeft()+r;
        int centerY=getTop()+r;
        Paint p=new Paint();
        p.setColor(Color.GREEN);
        canvas.drawCircle(centerX,centerY,r,p);
    }
}
