package com.instagram.p009ui.listview;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ListView;
import com.facebook.react.uimanager.BaseViewManager;

/* renamed from: com.instagram.ui.listview.CustomFadingEdgeListView */
public class CustomFadingEdgeListView extends ListView {
    public int A00 = 0;
    public boolean A01 = true;
    public boolean A02 = true;
    public boolean A03 = true;
    public boolean A04 = true;

    public float getBottomFadingEdgeStrength() {
        if (this.A01) {
            return super.getBottomFadingEdgeStrength();
        }
        return BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
    }

    public float getLeftFadingEdgeStrength() {
        if (this.A02) {
            return super.getLeftFadingEdgeStrength();
        }
        return BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
    }

    public float getRightFadingEdgeStrength() {
        if (this.A03) {
            return super.getRightFadingEdgeStrength();
        }
        return BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
    }

    public float getTopFadingEdgeStrength() {
        if (this.A04) {
            return super.getTopFadingEdgeStrength();
        }
        return BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
    }

    public int getSolidColor() {
        return this.A00;
    }

    public void setBottomFadingEnabled(boolean z) {
        this.A01 = z;
    }

    public void setLeftFadingEnabled(boolean z) {
        this.A02 = z;
    }

    public void setRightFadingEnabled(boolean z) {
        this.A03 = z;
    }

    public void setSolidColor(int i) {
        this.A00 = i;
    }

    public void setTopFadingEnabled(boolean z) {
        this.A04 = z;
    }

    public CustomFadingEdgeListView(Context context) {
        super(context);
    }

    public CustomFadingEdgeListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CustomFadingEdgeListView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
