package p000X;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.1sb  reason: invalid class name and case insensitive filesystem */
public final class C42591sb implements C06570Po {
    public final C42531sV A00;
    public final Map A01 = Collections.synchronizedMap(new HashMap());

    public final void onUserSessionWillEnd(boolean z) {
    }

    public final void A00(C201558jw r6, String str, String str2) {
        C202028ki r4 = (C202028ki) this.A01.remove(str);
        AnonymousClass0a4.A06(r4);
        C201638k5 r0 = r4.A01;
        AnonymousClass0a4.A06(r0);
        DS5 ds5 = r0.A01;
        if (ds5 != null) {
            r0.A02.A03(ds5);
        }
        C42531sV r3 = r6.A01;
        AnonymousClass0P4 A012 = C42531sV.A01(r3, "streaming_upload_cancel", (AnonymousClass0RN) null, r6.A00);
        A012.A0G("reason", str2);
        C42531sV.A0H(r3, A012);
        r6.A02(str2);
        r4.A00.close();
    }

    public C42591sb(C42531sV r2) {
        this.A00 = r2;
    }
}
