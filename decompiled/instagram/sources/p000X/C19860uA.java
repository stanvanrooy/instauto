package p000X;

import com.facebook.proxygen.TraceFieldType;

/* renamed from: X.0uA  reason: invalid class name and case insensitive filesystem */
public final class C19860uA implements C17120pi {
    public final void BfU(C13460iZ r3, Object obj) {
        C19850u9 r4 = (C19850u9) obj;
        r3.A0T();
        String str = r4.A02;
        if (str != null) {
            r3.A0H(TraceFieldType.BroadcastId, str);
        }
        if (r4.A01 != null) {
            r3.A0d("live_viewer_invite");
            AnonymousClass2XQ.A00(r3, r4.A01);
        }
        if (r4.A00 != null) {
            r3.A0d("direct_forwarding_params");
            C98994Pw.A00(r3, r4.A00);
        }
        AnonymousClass4RD.A00(r3, r4);
        r3.A0Q();
    }

    public final Object BWo(C13080hr r2) {
        return AnonymousClass4RQ.parseFromJson(r2);
    }
}
