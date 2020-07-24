package com.instagram.p009ui.widget.dismissablecallout;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.facebook.C0003R;
import com.facebook.react.uimanager.BaseViewManager;
import p000X.AnonymousClass1EM;
import p000X.C476524w;
import p000X.C476624x;
import p000X.C66982wP;
import p000X.C67462xF;

/* renamed from: com.instagram.ui.widget.dismissablecallout.DismissableCallout */
public class DismissableCallout extends FrameLayout {
    public int A00;
    public View A01;
    public TextView A02;
    public C66982wP A03;
    public boolean A04;

    public final void A02(String str) {
        float f;
        this.A02.setText(str);
        C476524w A07 = C476624x.A07(this);
        A07.A0N();
        A07.A0G(getAlpha(), 1.0f);
        if (getVisibility() == 0) {
            f = getY();
        } else {
            f = (float) this.A00;
        }
        A07.A0K(f, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
        A07.A08 = 0;
        A07.A0T(true).A0O();
        this.A04 = true;
    }

    private void A00(AttributeSet attributeSet) {
        Context context = getContext();
        LayoutInflater.from(context).inflate(C0003R.layout.dismissable_callout, this);
        this.A02 = (TextView) findViewById(C0003R.C0005id.dismissable_callout_info_banner);
        View findViewById = findViewById(C0003R.C0005id.dismiss_button);
        this.A01 = findViewById;
        findViewById.setOnClickListener(new C67462xF(this));
        setBackgroundResource(C0003R.color.igds_highlight_background);
        this.A00 = getResources().getDimensionPixelSize(C0003R.dimen.comment_input_row_directmention_banner_height);
        getContext();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AnonymousClass1EM.A16);
        this.A02.setText(obtainStyledAttributes.getString(0));
        obtainStyledAttributes.recycle();
    }

    public final void A01() {
        C476524w A07 = C476624x.A07(this);
        A07.A0N();
        A07.A0K(getY(), (float) this.A00);
        A07.A07 = 8;
        A07.A0T(true).A0O();
        this.A04 = false;
    }

    public void setOnDismissListener(C66982wP r1) {
        this.A03 = r1;
    }

    public DismissableCallout(Context context) {
        this(context, (AttributeSet) null);
    }

    public DismissableCallout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public DismissableCallout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A04 = false;
        A00(attributeSet);
    }

    public DismissableCallout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.A04 = false;
        A00(attributeSet);
    }
}
