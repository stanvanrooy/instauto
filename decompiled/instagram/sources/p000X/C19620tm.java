package p000X;

/* renamed from: X.0tm  reason: invalid class name and case insensitive filesystem */
public final class C19620tm implements C17120pi {
    public final void BfU(C13460iZ r3, Object obj) {
        C19610tl r4 = (C19610tl) obj;
        r3.A0T();
        if (r4.A01 != null) {
            r3.A0d("link");
            C56272cD.A00(r3, r4.A01);
        }
        String str = r4.A03;
        if (str != null) {
            r3.A0H("after_post_action", str);
        }
        if (r4.A02 != null) {
            r3.A0d("replied_to_message");
            C99434Rq.A00(r3, r4.A02);
        }
        if (r4.A00 != null) {
            r3.A0d("direct_forwarding_params");
            C98994Pw.A00(r3, r4.A00);
        }
        AnonymousClass4RD.A00(r3, r4);
        r3.A0Q();
    }

    public final Object BWo(C13080hr r2) {
        return C99404Rn.parseFromJson(r2);
    }
}
