package p000X;

/* renamed from: X.0tX  reason: invalid class name and case insensitive filesystem */
public final class C19470tX implements C17120pi {
    public final void BfU(C13460iZ r3, Object obj) {
        C19450tV r4 = (C19450tV) obj;
        r3.A0T();
        String str = r4.A03;
        if (str != null) {
            r3.A0H("text", str);
        }
        if (r4.A04 != null) {
            r3.A0d("mentioned_user_ids");
            r3.A0S();
            for (String str2 : r4.A04) {
                if (str2 != null) {
                    r3.A0g(str2);
                }
            }
            r3.A0P();
        }
        String str3 = r4.A02;
        if (str3 != null) {
            r3.A0H("after_post_action", str3);
        }
        if (r4.A01 != null) {
            r3.A0d("replied_to_message");
            C99434Rq.A00(r3, r4.A01);
        }
        if (r4.A00 != null) {
            r3.A0d("forwarding_params");
            C98994Pw.A00(r3, r4.A00);
        }
        AnonymousClass4RD.A00(r3, r4);
        r3.A0Q();
    }

    public final Object BWo(C13080hr r2) {
        return C99414Ro.parseFromJson(r2);
    }
}
