package com.instagram.business.insights.p014ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import com.facebook.C0003R;
import com.instagram.common.p004ui.base.IgTextView;

/* renamed from: com.instagram.business.insights.ui.InsightsUnitParagraphView */
public class InsightsUnitParagraphView extends LinearLayout {
    public IgTextView A00;
    public IgTextView A01;

    public final void A01(String str, String str2) {
        this.A01.setText(str);
        if (str2 != null) {
            this.A00.setVisibility(0);
            this.A00.setText(str2);
            return;
        }
        this.A00.setVisibility(8);
    }

    private void A00(Context context) {
        View inflate = LayoutInflater.from(context).inflate(C0003R.layout.layout_insights_unit_paragraph_view, this);
        this.A01 = (IgTextView) inflate.findViewById(C0003R.C0005id.insights_paragraph_title);
        this.A00 = (IgTextView) inflate.findViewById(C0003R.C0005id.insights_paragraph_subtitle);
    }

    public InsightsUnitParagraphView(Context context) {
        super(context);
        A00(context);
    }

    public InsightsUnitParagraphView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00(context);
    }
}
