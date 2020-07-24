package com.instagram.business.insights.p014ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.facebook.C0003R;
import com.google.common.collect.ImmutableList;
import p000X.AnonymousClass1X6;
import p000X.C225669nX;
import p000X.C225709nb;
import p000X.C27367CAm;
import p000X.C36981iv;
import p000X.C90;

/* renamed from: com.instagram.business.insights.ui.InsightsImagesRowView */
public class InsightsImagesRowView extends LinearLayout implements C225709nb {
    public C225709nb A00;
    public final int A01;

    public static C225669nX A00(Context context, boolean z) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -2, 1.0f);
        if (z) {
            AnonymousClass1X6.A00(layoutParams, context.getResources().getDimensionPixelSize(C0003R.dimen.insights_photo_grid_spacing));
        }
        C225669nX r0 = new C225669nX(context);
        r0.setLayoutParams(layoutParams);
        return r0;
    }

    public final void A01(ImmutableList immutableList, boolean z, String str, boolean z2) {
        boolean z3;
        removeAllViews();
        Context context = getContext();
        ImmutableList immutableList2 = immutableList;
        int size = immutableList2.size();
        int i = 0;
        while (i < Math.min(size, this.A01)) {
            C90 c90 = (C90) immutableList2.get(i);
            boolean z4 = false;
            if (i < Math.min(size, this.A01)) {
                z4 = true;
            }
            C225669nX A002 = A00(context, z4);
            String str2 = c90.A03;
            String str3 = c90.A02;
            C27367CAm cAm = c90.A01;
            String A012 = C36981iv.A01(c90.A00);
            if (z) {
                z3 = true;
                if (c90.A00 != -1) {
                    A002.setData(str2, str3, cAm, A012, z3, z2, str, c90.A04);
                    A002.setDelegate(this);
                    addView(A002);
                    i++;
                }
            }
            z3 = false;
            A002.setData(str2, str3, cAm, A012, z3, z2, str, c90.A04);
            A002.setDelegate(this);
            addView(A002);
            i++;
        }
        while (i < this.A01) {
            boolean z5 = false;
            if (i < size - 1) {
                z5 = true;
            }
            C225669nX A003 = A00(context, z5);
            A003.setVisibility(4);
            addView(A003);
            i++;
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

    public InsightsImagesRowView(Context context) {
        this(context, (AttributeSet) null);
    }

    public InsightsImagesRowView(Context context, int i) {
        super(context);
        this.A01 = i;
        setOrientation(0);
        setImportantForAccessibility(2);
    }

    public InsightsImagesRowView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A01 = 3;
        setOrientation(0);
        setImportantForAccessibility(2);
    }
}
