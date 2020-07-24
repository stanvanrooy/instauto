package com.instagram.business.insights.p014ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.C0003R;
import com.instagram.common.p004ui.base.IgTextView;
import com.instagram.common.p004ui.widget.imageview.CircularImageView;
import p000X.C36981iv;
import p000X.C81;
import p000X.C85;
import p000X.C88;

/* renamed from: com.instagram.business.insights.ui.InsightsProfileView */
public class InsightsProfileView extends ConstraintLayout {
    public C88 A00;
    public View A01;
    public TextView A02;
    public TextView A03;
    public IgTextView A04;
    public CircularImageView A05;

    public final void A04(C85 c85, String str) {
        this.A05.setUrl(c85.A03, str);
        this.A03.setText(c85.A04);
        this.A02.setText(c85.A02);
        this.A04.setText(C36981iv.A01(c85.A00));
        this.A01.setOnClickListener(new C81(this, c85));
    }

    private void A00(Context context) {
        View inflate = LayoutInflater.from(context).inflate(C0003R.layout.insights_profile_view, this);
        this.A01 = inflate;
        this.A05 = (CircularImageView) inflate.findViewById(C0003R.C0005id.row_user_imageview);
        this.A03 = (TextView) this.A01.findViewById(C0003R.C0005id.row_user_username);
        this.A02 = (TextView) this.A01.findViewById(C0003R.C0005id.row_user_fullname);
        this.A04 = (IgTextView) this.A01.findViewById(C0003R.C0005id.metric_value);
    }

    public void setDelegate(C88 c88) {
        this.A00 = c88;
    }

    public InsightsProfileView(Context context) {
        super(context);
        A00(context);
    }

    public InsightsProfileView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00(context);
    }
}
