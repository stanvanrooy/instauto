package com.facebook.browser.lite.chrome.widgets.menu;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;

public class MenuItemNavigationView extends LinearLayout {
    public MenuItemNavigationView(Context context) {
        this(context, (AttributeSet) null);
    }

    public MenuItemNavigationView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MenuItemNavigationView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
