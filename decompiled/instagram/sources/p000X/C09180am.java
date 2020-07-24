package p000X;

import java.io.File;

/* renamed from: X.0am  reason: invalid class name and case insensitive filesystem */
public final class C09180am extends AnonymousClass0O9 {
    public final /* synthetic */ C09160ak A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C09180am(C09160ak r2) {
        super(568);
        this.A00 = r2;
    }

    public final void run() {
        AnonymousClass12C r0 = AnonymousClass12C.A0c;
        if (r0 != null) {
            r0.A0M();
        }
        String[] strArr = this.A00.A02;
        if (strArr != null) {
            for (String A01 : strArr) {
                File A012 = C15020mC.A01(this.A00.A01.A00, A01, false);
                if (A012 != null) {
                    AnonymousClass2BA.A00(this.A00.A01.A00).A01(A012);
                }
            }
        }
    }
}
