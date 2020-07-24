package p000X;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;

/* renamed from: X.1mx  reason: invalid class name and case insensitive filesystem */
public final class C39461mx extends ClickableSpan {
    public final /* synthetic */ instagramComment A00;
    public final /* synthetic */ C29191Oy A01;

    public C39461mx(C29191Oy r1, instagramComment r2) {
        this.A01 = r1;
        this.A00 = r2;
    }

    public final void onClick(View view) {
        this.A01.A03.BXT(new C35301g9(this.A00));
    }

    public final void updateDrawState(TextPaint textPaint) {
        if (this.A00.A0I != Constants.A0u) {
            textPaint.setAlpha(64);
        }
    }
}
