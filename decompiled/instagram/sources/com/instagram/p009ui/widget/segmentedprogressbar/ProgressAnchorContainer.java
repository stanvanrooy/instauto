package com.instagram.p009ui.widget.segmentedprogressbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import com.facebook.C0003R;
import p000X.C06400Ox;
import p000X.C169367Lp;
import p000X.C212909Gd;
import p000X.C212919Ge;
import p000X.C476524w;
import p000X.C476624x;

/* renamed from: com.instagram.ui.widget.segmentedprogressbar.ProgressAnchorContainer */
public class ProgressAnchorContainer extends LinearLayout {
    public C169367Lp A00;
    public final SegmentedProgressBar A01;
    public final boolean A02;

    public static void A00(ProgressAnchorContainer progressAnchorContainer, boolean z) {
        int i;
        SegmentedProgressBar segmentedProgressBar = progressAnchorContainer.A01;
        int i2 = segmentedProgressBar.A06;
        if (progressAnchorContainer.A02) {
            i = (i2 - segmentedProgressBar.A02) - 1;
        } else {
            i = segmentedProgressBar.A02;
        }
        if (i2 > 1) {
            C476524w A07 = C476624x.A07(progressAnchorContainer);
            A07.A0N();
            A07.A0A = new C212919Ge(progressAnchorContainer, z, i2, i);
            A07.A0T(true).A0O();
        }
        C169367Lp r2 = progressAnchorContainer.A00;
        if (r2 == null) {
            return;
        }
        if (z) {
            C476624x.A08(true, r2);
            return;
        }
        C476624x.A09(true, r2);
    }

    public final void addView(View view) {
        if ((view instanceof C169367Lp) || (view instanceof SegmentedProgressBar)) {
            super.addView(view);
            return;
        }
        throw new IllegalArgumentException("Can only attach views that extend from ProgressAnchorView");
    }

    public void setAnchorView(C169367Lp r2) {
        C169367Lp r0 = this.A00;
        if (r0 != null) {
            removeView(r0);
        }
        addView(r2);
        this.A00 = r2;
    }

    public C169367Lp getAnchorView() {
        return this.A00;
    }

    public SegmentedProgressBar getSegmentedProgressBar() {
        return this.A01;
    }

    public ProgressAnchorContainer(Context context) {
        this(context, (AttributeSet) null);
    }

    public ProgressAnchorContainer(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ProgressAnchorContainer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setOrientation(1);
        LayoutInflater.from(context).inflate(C0003R.layout.layout_progress_anchor_container, this, true);
        this.A01 = (SegmentedProgressBar) findViewById(C0003R.C0005id.segment_progress_bar);
        this.A02 = C06400Ox.A02(context);
        this.A01.setPositionAnchorDelegate(new C212909Gd(this));
    }
}
