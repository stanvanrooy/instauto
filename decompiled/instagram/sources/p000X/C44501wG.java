package p000X;

import android.graphics.Bitmap;

/* renamed from: X.1wG  reason: invalid class name and case insensitive filesystem */
public final class C44501wG implements C38591lW {
    public final /* synthetic */ AnonymousClass1LO A00;
    public final /* synthetic */ C44461wC A01;
    public final /* synthetic */ C44411w7 A02;
    public final /* synthetic */ AnonymousClass1NJ A03;
    public final /* synthetic */ C36841ih A04;

    public C44501wG(C44411w7 r1, AnonymousClass1LO r2, AnonymousClass1NJ r3, C36841ih r4, C44461wC r5) {
        this.A02 = r1;
        this.A00 = r2;
        this.A03 = r3;
        this.A04 = r4;
        this.A01 = r5;
    }

    public final void B9O(C37371jY r6) {
        Bitmap bitmap;
        AnonymousClass1LO r4 = this.A00;
        if (!(r4 == null || (bitmap = r6.A00) == null)) {
            r4.A08(this.A03, r6.A02, bitmap.getByteCount() >> 10, r6.A01);
        }
        C36841ih r3 = this.A04;
        r3.A08 = -1;
        this.A02.A02.B79(r6, this.A03, r3, this.A01);
    }
}
