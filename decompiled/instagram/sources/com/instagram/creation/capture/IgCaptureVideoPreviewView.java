package com.instagram.creation.capture;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.common.p004ui.widget.videopreviewview.VideoPreviewView;
import p000X.C182797rM;
import p000X.C183027rm;
import p000X.C45681yK;

public class IgCaptureVideoPreviewView extends VideoPreviewView {
    public float getMaxFitAspectRatio() {
        return 1.91f;
    }

    public float getMinFitAspectRatio() {
        return 0.8f;
    }

    public C45681yK getScaleType() {
        if (((C182797rM) getContext()).AJ7().A05 == C183027rm.RECTANGULAR) {
            return C45681yK.FIT_WITH_LIMITS;
        }
        return C45681yK.FILL;
    }

    public void setAspectRatio(float f) {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (f > 1.0f) {
            int width = ((View) getParent()).getWidth();
            layoutParams.width = width;
            layoutParams.height = (int) (((float) width) / f);
        } else if (f < 1.0f) {
            int height = ((View) getParent()).getHeight();
            layoutParams.height = height;
            layoutParams.width = (int) (((float) height) * f);
        } else {
            layoutParams.width = ((View) getParent()).getWidth();
            layoutParams.height = ((View) getParent()).getHeight();
        }
        setLayoutParams(layoutParams);
    }

    public IgCaptureVideoPreviewView(Context context) {
        this(context, (AttributeSet) null);
    }

    public IgCaptureVideoPreviewView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public IgCaptureVideoPreviewView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (!(context instanceof C182797rM)) {
            throw new RuntimeException("Context is not a SessionProvider");
        }
    }
}
