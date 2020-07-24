package p000X;

import android.text.TextPaint;
import android.view.View;

/* renamed from: X.1mg  reason: invalid class name and case insensitive filesystem */
public final class C39301mg extends C39261mc {
    public final /* synthetic */ C29191Oy A00;
    public final /* synthetic */ C37751kA A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C39301mg(C29191Oy r3, C37751kA r4) {
        super(false, -1);
        this.A00 = r3;
        this.A01 = r4;
    }

    public final void onClick(View view) {
        AnonymousClass12J r1;
        C29191Oy r12 = this.A00;
        instagramComment r3 = this.A01.A03;
        boolean A06 = r3.A06();
        C23300zv r2 = r12.A03;
        if (A06) {
            r1 = new C34021ds(r3.A0C);
        } else {
            r1 = new C35301g9(r3);
        }
        r2.BXT(r1);
    }

    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        if (this.A01.A03.A0I != Constants.A0u) {
            textPaint.setAlpha(64);
        }
    }
}
