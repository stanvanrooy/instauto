package com.instagram.survey.structuredsurvey.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.CheckBox;
import p000X.AnonymousClass0Z0;

public class InertCheckBox extends CheckBox {
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        return false;
    }

    public final boolean onKeyMultiple(int i, int i2, KeyEvent keyEvent) {
        return false;
    }

    public final boolean onKeyPreIme(int i, KeyEvent keyEvent) {
        return false;
    }

    public final boolean onKeyShortcut(int i, KeyEvent keyEvent) {
        return false;
    }

    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        return false;
    }

    public final boolean onTrackballEvent(MotionEvent motionEvent) {
        return false;
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        AnonymousClass0Z0.A0C(-543099734, AnonymousClass0Z0.A05(535370335));
        return false;
    }

    public InertCheckBox(Context context) {
        super(context);
    }

    public InertCheckBox(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public InertCheckBox(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
