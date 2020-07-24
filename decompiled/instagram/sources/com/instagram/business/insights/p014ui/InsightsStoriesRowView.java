package com.instagram.business.insights.p014ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.facebook.C0003R;
import p000X.C06220Of;
import p000X.C225669nX;
import p000X.C225709nb;

/* renamed from: com.instagram.business.insights.ui.InsightsStoriesRowView */
public class InsightsStoriesRowView extends LinearLayout implements C225709nb {
    public C225709nb A00;
    public C225669nX[] A01;

    private void A00(Context context, int i) {
        setOrientation(0);
        setImportantForAccessibility(2);
        int dimensionPixelSize = getResources().getDimensionPixelSize(C0003R.dimen.insights_photo_grid_spacing);
        int i2 = i - 1;
        int A09 = (C06220Of.A09(context) - (dimensionPixelSize * i2)) / i;
        float A04 = C06220Of.A04(C06220Of.A0B(context));
        this.A01 = new C225669nX[i];
        for (int i3 = 0; i3 < i; i3++) {
            C225669nX r2 = new C225669nX(context);
            r2.setAspect(A04);
            r2.setDelegate(this);
            this.A01[i3] = r2;
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(A09, -2);
            int i4 = dimensionPixelSize;
            if (i3 == i2) {
                i4 = 0;
            }
            layoutParams.rightMargin = i4;
            addView(r2, layoutParams);
        }
    }

    public final void B71(View view, String str) {
        C225709nb r0 = this.A00;
        if (r0 != null) {
            r0.B71(view, str);
        }
    }

    public void setDelegate(C225709nb r1) {
        this.A00 = r1;
    }

    public InsightsStoriesRowView(Context context, int i) {
        super(context);
        A00(context, i);
    }

    public InsightsStoriesRowView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00(context, 3);
    }
}
