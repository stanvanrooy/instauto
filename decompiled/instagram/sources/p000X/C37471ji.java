package p000X;

import java.util.List;

/* renamed from: X.1ji  reason: invalid class name and case insensitive filesystem */
public final class C37471ji extends AnonymousClass0O9 {
    public final /* synthetic */ AnonymousClass1GP A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C37471ji(AnonymousClass1GP r5) {
        super(518, 3, false, true);
        this.A00 = r5;
    }

    public final void run() {
        if (this.A00.A0Q == Constants.ZERO) {
            this.A00.A0Q = Constants.ONE;
        }
        AnonymousClass1GP r2 = this.A00;
        if (r2.A08 == null) {
            AnonymousClass12C r1 = r2.A0T;
            if (!r1.A0S) {
                r2.A08 = r1.A0B.A04.A00();
            }
        }
        AnonymousClass1GP r4 = this.A00;
        C252818e r3 = r4.A0T.A0B;
        AnonymousClass18O r5 = r4.A0E;
        int i = r4.A03;
        int i2 = 0;
        if (i > 0) {
            i2 = i + 1;
        }
        int i3 = r4.A0P;
        AnonymousClass1GP r0 = this.A00;
        C35441gN r8 = r0.A08;
        List list = r0.A0R;
        String A03 = AnonymousClass12C.A03(this.A00.A0E);
        AnonymousClass1GP r02 = this.A00;
        AnonymousClass1GR r11 = r02.A0F;
        AnonymousClass12C r12 = r02.A0T;
        r4.A07 = new AnonymousClass12E(r3, r4, r5, i2, i3, r8, list, A03, r11, r12.A04, r02.A0D.A00(), r12.A09).A00();
    }
}
