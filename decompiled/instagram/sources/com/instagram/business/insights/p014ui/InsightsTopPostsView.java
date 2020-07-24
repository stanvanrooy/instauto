package com.instagram.business.insights.p014ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.facebook.C0003R;
import com.google.common.collect.ImmutableList;
import p000X.C225709nb;

/* renamed from: com.instagram.business.insights.ui.InsightsTopPostsView */
public class InsightsTopPostsView extends LinearLayout implements C225709nb {
    public C225709nb A00;
    public String A01 = "insights_top_posts";
    public boolean A02;

    public final void B71(View view, String str) {
        C225709nb r0 = this.A00;
        if (r0 != null) {
            r0.B71(view, str);
        }
    }

    public void setData(ImmutableList immutableList) {
        removeAllViews();
        int size = immutableList.size();
        int i = 0;
        int i2 = 0;
        while (i < size && i2 < 2) {
            InsightsImagesRowView insightsImagesRowView = new InsightsImagesRowView(getContext(), 3);
            int i3 = i + 3;
            insightsImagesRowView.A01(immutableList.subList(i, Math.min(immutableList.size(), i3)), true, this.A01, this.A02);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
            layoutParams.topMargin = getResources().getDimensionPixelOffset(C0003R.dimen.insights_photo_grid_spacing);
            insightsImagesRowView.setLayoutParams(layoutParams);
            insightsImagesRowView.A00 = this;
            addView(insightsImagesRowView);
            i2++;
            i = i3;
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

    public InsightsTopPostsView(Context context) {
        super(context);
        setOrientation(1);
    }

    public InsightsTopPostsView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOrientation(1);
    }
}
