package com.instagram.profile.intf.tabs;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewStub;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.facebook.C0003R;
import p000X.C019000b;
import p000X.C26571Ea;
import p000X.C71453At;

public class ProfileTextTabView extends FrameLayout implements C71453At {
    public static final int[][] A03 = {new int[]{16842913}, new int[0]};
    public int A00;
    public TextView A01;
    public C26571Ea A02;

    public final void BdJ(boolean z) {
    }

    public View getView() {
        return this;
    }

    public void setIcon(Drawable drawable) {
    }

    public void setActiveColor(int i) {
        this.A01.setTextColor(new ColorStateList(A03, new int[]{i, this.A00}));
    }

    public void setBadgeCount(int i) {
        C26571Ea r1 = this.A02;
        int i2 = 8;
        if (i > 0) {
            i2 = 0;
        }
        r1.A02(i2);
    }

    public void setContentDescription(CharSequence charSequence) {
        this.A01.setContentDescription(charSequence);
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.A01.setOnClickListener(onClickListener);
    }

    public void setTitle(String str) {
        this.A01.setText(str);
    }

    private void A00(Context context) {
        inflate(context, C0003R.layout.profile_text_tab_view, this);
        this.A01 = (TextView) findViewById(C0003R.C0005id.profile_tab_text_view);
        this.A02 = new C26571Ea((ViewStub) findViewById(C0003R.C0005id.profile_tab_led_notification_stub));
        this.A00 = C019000b.A00(context, C0003R.color.grey_5);
    }

    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClickable(false);
    }

    public ProfileTextTabView(Context context) {
        super(context);
        A00(context);
    }

    public ProfileTextTabView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00(context);
    }

    public ProfileTextTabView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A00(context);
    }
}
