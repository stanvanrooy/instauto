package com.fbpay.common;

import android.view.View;
import p000X.BVM;
import p000X.BVN;
import p000X.C25468BMc;

public class LinkableText$1 extends URLSpanNoUnderline {
    public final /* synthetic */ BVN A00;
    public final /* synthetic */ C25468BMc A01;
    public final /* synthetic */ BVM A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LinkableText$1(BVM bvm, String str, C25468BMc bMc, BVN bvn) {
        super(str);
        this.A02 = bvm;
        this.A01 = bMc;
        this.A00 = bvn;
    }

    public final void onClick(View view) {
        super.onClick(view);
        this.A01.B9B(this.A00);
    }
}
