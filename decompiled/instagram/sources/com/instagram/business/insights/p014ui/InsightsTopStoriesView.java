package com.instagram.business.insights.p014ui;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.facebook.C0003R;
import com.google.common.collect.ImmutableList;
import p000X.C06220Of;
import p000X.C225669nX;
import p000X.C225709nb;
import p000X.C27367CAm;
import p000X.C36981iv;
import p000X.C90;

/* renamed from: com.instagram.business.insights.ui.InsightsTopStoriesView */
public class InsightsTopStoriesView extends LinearLayout implements C225709nb {
    public C225709nb A00;
    public String A01 = "insights_top_stories";
    public boolean A02;
    public C225669nX[] A03;

    private void A00(Context context) {
        setOrientation(0);
        Resources resources = getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(C0003R.dimen.insights_photo_grid_spacing);
        int A09 = (int) (((float) ((C06220Of.A09(context) - (dimensionPixelSize * 5)) - resources.getDimensionPixelSize(C0003R.dimen.insights_view_padding))) / 3.1f);
        float A04 = C06220Of.A04(C06220Of.A0B(context));
        this.A03 = new C225669nX[6];
        for (int i = 0; i < 6; i++) {
            C225669nX r3 = new C225669nX(context);
            r3.setAspect(A04);
            r3.setDelegate(this);
            this.A03[i] = r3;
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(A09, -2);
            int i2 = dimensionPixelSize;
            if (i == 5) {
                i2 = 0;
            }
            layoutParams.rightMargin = i2;
            addView(r3, layoutParams);
        }
    }

    public final void B71(View view, String str) {
        C225709nb r0 = this.A00;
        if (r0 != null) {
            r0.B71(view, str);
        }
    }

    public void setData(ImmutableList immutableList) {
        String str;
        String string = getResources().getString(C0003R.string.not_available);
        for (int i = 0; i < this.A03.length; i++) {
            ImmutableList immutableList2 = immutableList;
            if (i < immutableList2.size()) {
                C90 c90 = (C90) immutableList2.get(i);
                boolean z = false;
                if (c90.A00 != -1) {
                    z = true;
                }
                this.A03[i].setVisibility(0);
                C225669nX r6 = this.A03[i];
                String str2 = c90.A03;
                String str3 = c90.A02;
                C27367CAm cAm = c90.A01;
                if (z) {
                    str = C36981iv.A01(c90.A00);
                } else {
                    str = string;
                }
                r6.setData(str2, str3, cAm, str, z, this.A02, this.A01, c90.A04);
                this.A03[i].setDelegate(this);
            } else {
                this.A03[i].setVisibility(8);
            }
        }
    }

    public void setDelegate(C225709nb r1) {
        this.A00 = r1;
    }

    public void setModuleName(String str) {
        this.A01 = str;
    }

    public void setShowAvatarForMediaOverlay(boolean z) {
        this.A02 = z;
    }

    public InsightsTopStoriesView(Context context) {
        super(context);
        A00(context);
    }

    public InsightsTopStoriesView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00(context);
    }
}
