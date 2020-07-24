package com.facebook.browser.lite.views;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.TextView;
import p000X.ARG;

public class BrowserLiteErrorScreen extends FrameLayout {
    public TextView A00;
    public TextView A01;
    public ARG A02;

    public boolean getDisplayed() {
        return false;
    }

    public String getUserAction() {
        return null;
    }

    public void setAutoRetryController(ARG arg) {
        this.A02 = arg;
    }

    public BrowserLiteErrorScreen(Context context) {
        super(context, (AttributeSet) null);
    }

    public BrowserLiteErrorScreen(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
