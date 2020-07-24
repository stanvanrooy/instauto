package p000X;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;

/* renamed from: X.1z0  reason: invalid class name and case insensitive filesystem */
public final class C46021z0 extends ClickableSpan {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ AnonymousClass1NJ A02;
    public final /* synthetic */ C30301Th A03;

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0011, code lost:
        if (r2.A0h() == null) goto L_0x0013;
     */
    public final void updateDrawState(TextPaint textPaint) {
        boolean z;
        int i;
        textPaint.setUnderlineText(false);
        AnonymousClass1NJ r2 = this.A02;
        if (r2.A0g() != null) {
            z = true;
        }
        z = false;
        if (z || r2.A0j() == Constants.A0C) {
            i = this.A00;
        } else {
            i = this.A01;
        }
        textPaint.setColor(i);
    }

    public C46021z0(C30301Th r1, AnonymousClass1NJ r2, int i, int i2) {
        this.A03 = r1;
        this.A02 = r2;
        this.A00 = i;
        this.A01 = i2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0011, code lost:
        if (r2.A0h() == null) goto L_0x0013;
     */
    public final void onClick(View view) {
        boolean z;
        C30301Th r3 = this.A03;
        if (r3 != null) {
            AnonymousClass1NJ r2 = this.A02;
            if (r2.A0g() != null) {
                z = true;
            }
            z = false;
            if (z || r2.A0j() == Constants.A0C) {
                r3.Aw2(r2);
            }
        }
    }
}
