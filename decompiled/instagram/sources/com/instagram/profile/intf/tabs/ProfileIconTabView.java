package com.instagram.profile.intf.tabs;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewStub;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.facebook.C0003R;
import com.instagram.common.p004ui.colorfilter.ColorFilterAlphaImageView;
import p000X.C120465Es;
import p000X.C26571Ea;
import p000X.C71453At;

public class ProfileIconTabView extends FrameLayout implements C71453At {
    public ColorFilterAlphaImageView A00;
    public C26571Ea A01;
    public C26571Ea A02;
    public boolean A03;

    public View getView() {
        return this;
    }

    public void setTitle(String str) {
    }

    public void setActiveColor(int i) {
        this.A00.setActiveColorFilter(i);
    }

    public void setBadgeCount(int i) {
        String str;
        int i2 = 0;
        if (!this.A03) {
            C26571Ea r0 = this.A02;
            if (i <= 0) {
                i2 = 8;
            }
            r0.A02(i2);
        } else if (i > 0) {
            this.A01.A02(0);
            TextView textView = (TextView) this.A01.A01();
            if (i < 100) {
                str = String.valueOf(i);
            } else {
                str = "•••";
            }
            C120465Es.A00(textView, str);
        } else {
            this.A01.A02(8);
        }
    }

    public void setContentDescription(CharSequence charSequence) {
        this.A00.setContentDescription(charSequence);
    }

    public void setIcon(Drawable drawable) {
        this.A00.setImageDrawable(drawable);
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.A00.setOnClickListener(onClickListener);
    }

    private void A00(Context context) {
        inflate(context, C0003R.layout.profile_icon_tab_view, this);
        this.A00 = (ColorFilterAlphaImageView) findViewById(C0003R.C0005id.profile_tab_icon_view);
        this.A01 = new C26571Ea((ViewStub) findViewById(C0003R.C0005id.profile_tab_badge_count_view_stub));
        this.A02 = new C26571Ea((ViewStub) findViewById(C0003R.C0005id.profile_tab_led_notification_stub));
    }

    public final void BdJ(boolean z) {
        this.A03 = z;
    }

    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClickable(false);
    }

    public ProfileIconTabView(Context context) {
        super(context);
        A00(context);
    }

    public ProfileIconTabView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00(context);
    }

    public ProfileIconTabView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A00(context);
    }
}
