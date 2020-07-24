package com.instagram.arlink.model;

import android.graphics.Path;
import android.graphics.Point;
import android.graphics.RectF;

public class ArLinkTextBox {
    public final float mRotationDegree;
    public final Point mSize = new Point();
    public final RectF mTextRect = new RectF();

    public static int getDistance(float f, float f2, float f3, float f4) {
        float f5 = f3 - f;
        float f6 = f4 - f2;
        return (int) Math.sqrt((double) ((f5 * f5) + (f6 * f6)));
    }

    public ArLinkTextBox(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        Path path = new Path();
        path.moveTo(f, f2);
        path.lineTo(f3, f4);
        path.lineTo(f7, f8);
        path.lineTo(f5, f6);
        path.close();
        path.computeBounds(this.mTextRect, true);
        Point point = this.mSize;
        point.x = getDistance(f, f2, f3, f4);
        point.y = getDistance(f, f2, f5, f6);
        this.mRotationDegree = (float) Math.toDegrees(Math.atan2((double) (f2 - f4), (double) (f3 - f)));
    }

    public float getRotationDegree() {
        return this.mRotationDegree;
    }

    public Point getSize() {
        return this.mSize;
    }

    public RectF getTextRect() {
        return this.mTextRect;
    }
}
