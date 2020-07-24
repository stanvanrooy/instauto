package p000X;

import java.util.HashSet;

/* renamed from: X.1d4  reason: invalid class name and case insensitive filesystem */
public final class C33531d4 extends AnonymousClass0O9 {
    public final /* synthetic */ C16710p2 A00;
    public final /* synthetic */ C16620ot A01;
    public final /* synthetic */ AnonymousClass0C1 A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C33531d4(C16620ot r2, C16710p2 r3, AnonymousClass0C1 r4) {
        super(344);
        this.A01 = r2;
        this.A00 = r3;
        this.A02 = r4;
    }

    public final void run() {
        String str;
        C16710p2 r5 = this.A00;
        r5.A02();
        AnonymousClass0C1 r4 = this.A02;
        C16710p2.A00(r5);
        for (String str2 : new HashSet(r5.A01)) {
            if (str2.contains("_")) {
                if (str2.isEmpty() || !str2.contains("_")) {
                    str = "";
                } else {
                    str = str2.split("_")[0];
                }
                if (str.equals(r4.A04())) {
                    r5.A05(str2);
                }
            }
        }
    }
}
