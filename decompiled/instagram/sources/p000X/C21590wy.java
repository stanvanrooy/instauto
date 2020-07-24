package p000X;

import java.util.Collections;
import java.util.List;

/* renamed from: X.0wy  reason: invalid class name and case insensitive filesystem */
public final class C21590wy implements C17140pk {
    public final C17850qu A6w(AnonymousClass0C1 r6, C17090pf r7) {
        C21570ww r72 = (C21570ww) r7;
        String str = r72.A00;
        List singletonList = Collections.singletonList(r72.A01);
        C15890nh r2 = new C15890nh(r6);
        r2.A09 = Constants.ONE;
        r2.A0E("direct_v2/threads/%s/deny_participant_requests/", str);
        r2.A06(AnonymousClass1N4.class, false);
        r2.A09("user_ids", C62662oA.A04(singletonList));
        return r2.A03();
    }
}
