package p000X;

import android.view.View;

/* renamed from: X.20k  reason: invalid class name and case insensitive filesystem */
public final class C466720k implements View.OnClickListener {
    public final /* synthetic */ C466520i A00;
    public final /* synthetic */ C465920c A01;
    public final /* synthetic */ C43451uR A02;

    public C466720k(C465920c r1, C466520i r2, C43451uR r3) {
        this.A01 = r1;
        this.A00 = r2;
        this.A02 = r3;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0Z0.A05(-1494558736);
        if (this.A00.getAdapterPosition() != -1) {
            C465920c r0 = this.A01;
            C28161Kq r3 = r0.A05;
            AnonymousClass0C1 r4 = r0.A07;
            C43411uN r2 = r0.A00;
            int i = r2.A00;
            int intValue = r2.A02(this.A02).intValue();
            C43451uR r7 = this.A02;
            C43411uN r02 = this.A01.A00;
            r3.BQ5(r4, i, intValue, r7, r02.A08, "profile", r02.getId(), r02.A0B);
        }
        AnonymousClass0Z0.A0C(-1147963509, A05);
    }
}
