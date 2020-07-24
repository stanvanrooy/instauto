package com.facebook.browser.lite.chrome.widgets.menu;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;

public class MenuItemTextView extends LinearLayout {
    public Context A00;

    public MenuItemTextView(Context context) {
        this(context, (AttributeSet) null);
    }

    public MenuItemTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MenuItemTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A00 = context;
    }
}
