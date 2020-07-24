package com.facebook.smartcapture.p011ui;

import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.facebook.C0003R;
import java.util.HashMap;
import java.util.Map;
import p000X.AnonymousClass1E1;
import p000X.C213009Go;
import p000X.C26970BvZ;
import p000X.C4K;

/* renamed from: com.facebook.smartcapture.ui.TextTipView */
public class TextTipView extends FrameLayout {
    public ImageView A00 = ((ImageView) C26970BvZ.A00(this, C0003R.C0005id.iv_tip_icon));
    public ProgressBar A01;
    public TextView A02 = ((TextView) C26970BvZ.A00(this, C0003R.C0005id.tv_tip_description));
    public TextView A03 = ((TextView) C26970BvZ.A00(this, C0003R.C0005id.tv_tip_title));
    public C4K A04;
    public Map A05;

    public TextTipView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        inflate(context, C0003R.layout.text_tip_view, this);
        AnonymousClass1E1.A0X((RelativeLayout) C26970BvZ.A00(this, C0003R.C0005id.rl_text_tip_container), ColorStateList.valueOf(C213009Go.A00(getContext(), C0003R.attr.sc_always_white)));
        ProgressBar progressBar = (ProgressBar) C26970BvZ.A00(this, C0003R.C0005id.pb_text_tip);
        this.A01 = progressBar;
        C213009Go.A03(context, progressBar);
        this.A05 = new HashMap();
    }
}
