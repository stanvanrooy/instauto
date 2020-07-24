package p000X;

import android.view.View;

/* renamed from: X.1tU  reason: invalid class name and case insensitive filesystem */
public final class C42931tU implements View.OnClickListener {
    public final /* synthetic */ AnonymousClass1NJ A00;
    public final /* synthetic */ AnonymousClass0C1 A01;

    public C42931tU(AnonymousClass0C1 r1, AnonymousClass1NJ r2) {
        this.A01 = r1;
        this.A00 = r2;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0Z0.A05(1296835492);
        if (C14090jk.A03(this.A01, this.A00) && C36461i5.A00(this.A01).A02(this.A00.A0N())) {
            C16180oA.A00(this.A01).A00.edit().putBoolean("has_seen_daisy_header", true).apply();
        }
        C23300zv.A00(this.A01).BXT(new C35351gE(this.A00));
        this.A00.A1A = false;
        AnonymousClass0Z0.A0C(-970741102, A05);
    }
}
