package p000X;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;

/* renamed from: X.1kB  reason: invalid class name and case insensitive filesystem */
public final class C37761kB extends ClickableSpan {
    public C32991cC A00;
    public final int A01;
    public final C23300zv A02;
    public final AnonymousClass1NJ A03;
    public final C13300iJ A04;
    public final String A05 = "comment_owner";

    public C37761kB(AnonymousClass0C1 r3, C13300iJ r4, AnonymousClass1NJ r5, int i) {
        this.A02 = C23300zv.A00(r3);
        this.A04 = r4;
        this.A03 = r5;
        this.A01 = i;
        this.A00 = C32991cC.A00(r3);
    }

    public final void onClick(View view) {
        C32991cC r1 = this.A00;
        if (r1 != null) {
            r1.A00 = C33031cG.TAP;
            r1.A03(view, (C33071cK) null);
        }
        this.A02.BXT(new C35311gA(this.A03, this.A04, this.A05));
    }

    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setColor(this.A01);
        textPaint.setFakeBoldText(true);
    }
}
