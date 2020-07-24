package com.instagram.business.insights.p014ui;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import com.facebook.C0003R;
import p000X.B3U;
import p000X.C26807Bss;

/* renamed from: com.instagram.business.insights.ui.InsightsEducationView */
public class InsightsEducationView extends LinearLayout {
    public View A00;
    public ViewGroup A01;
    public TextView A02;
    public NestedScrollView A03;
    public boolean A04;

    public void setupEducationButton(View view) {
        this.A02.setOnClickListener(new B3U(this, view));
    }

    private void A00(Context context) {
        View inflate = LayoutInflater.from(context).inflate(C0003R.layout.business_education_unit, this);
        this.A00 = inflate;
        this.A02 = (TextView) inflate.findViewById(C0003R.C0005id.education_button);
        NestedScrollView nestedScrollView = (NestedScrollView) this.A00.findViewById(C0003R.C0005id.education_text_container);
        this.A03 = nestedScrollView;
        this.A01 = (LinearLayout) nestedScrollView.findViewById(C0003R.C0005id.education_text_in_scroll);
    }

    private void A01(Context context, String str, String str2) {
        TextView textView = (TextView) LayoutInflater.from(context).inflate(C0003R.layout.education_title, this.A01, false);
        TextView textView2 = (TextView) LayoutInflater.from(context).inflate(C0003R.layout.education_subtitle, this.A01, false);
        textView.setText(str);
        textView2.setText(str2);
        this.A01.addView(textView);
        this.A01.addView(textView2);
    }

    public void setupStoriesEducationView(Context context) {
        Resources resources = context.getResources();
        A01(context, resources.getString(C0003R.string.impressions), resources.getString(C0003R.string.story_impressions_explanation));
        A01(context, resources.getString(C0003R.string.reach), resources.getString(C0003R.string.story_reach_explanation));
        A01(context, resources.getString(C0003R.string.forward), resources.getString(C0003R.string.story_forward_explanation));
        A01(context, resources.getString(C0003R.string.story_back), resources.getString(C0003R.string.story_back_explanation));
        A01(context, resources.getString(C0003R.string.exited), resources.getString(C0003R.string.story_exited_explanation));
        A01(context, resources.getString(C0003R.string.replies), resources.getString(C0003R.string.story_replies_explanation));
        A01(context, resources.getString(C0003R.string.next_story), resources.getString(C0003R.string.story_next_story_explanation));
        A01(context, resources.getString(C0003R.string.link_clicks), resources.getString(C0003R.string.story_link_clicks_explanation));
    }

    public void setupTopPostsEducationView(Context context, String str) {
        Resources resources = context.getResources();
        A01(context, resources.getString(C0003R.string.impressions), resources.getString(C0003R.string.impressions_explanation));
        A01(context, resources.getString(C0003R.string.reach), resources.getString(C0003R.string.reach_explanation));
        A01(context, resources.getString(C0003R.string.engagement), resources.getString(C0003R.string.engagement_explanation));
        A01(context, resources.getString(C0003R.string.saved), resources.getString(C0003R.string.saved_explanation));
        A01(context, resources.getString(C0003R.string.profile_visits), resources.getString(C0003R.string.prfile_visits_explanation));
        A01(context, resources.getString(C0003R.string.follows), resources.getString(C0003R.string.follows_explanation));
        if (C26807Bss.A05[4].equals(str)) {
            A01(context, resources.getString(C0003R.string.product_opens), resources.getString(C0003R.string.product_opens_explanation));
            A01(context, resources.getString(C0003R.string.outbound_clicks), resources.getString(C0003R.string.outbound_clicks_explanation));
        }
    }

    public InsightsEducationView(Context context) {
        super(context);
        A00(context);
    }

    public InsightsEducationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00(context);
    }
}
