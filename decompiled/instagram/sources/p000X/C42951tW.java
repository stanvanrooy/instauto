package p000X;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;

/* renamed from: X.1tW  reason: invalid class name and case insensitive filesystem */
public final class C42951tW extends ClickableSpan {
    public final /* synthetic */ AnonymousClass1NJ A00;
    public final /* synthetic */ C30301Th A01;
    public final /* synthetic */ C36841ih A02;

    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(false);
    }

    public C42951tW(C30301Th r1, AnonymousClass1NJ r2, C36841ih r3) {
        this.A01 = r1;
        this.A00 = r2;
        this.A02 = r3;
    }

    public final void onClick(View view) {
        this.A01.AwO(this.A00, this.A02);
    }
}
