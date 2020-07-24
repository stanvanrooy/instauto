package p000X;

/* renamed from: X.0vL  reason: invalid class name and case insensitive filesystem */
public final class C20580vL implements C17120pi {
    public final void BfU(C13460iZ r4, Object obj) {
        C20560vJ r5 = (C20560vJ) obj;
        r4.A0T();
        if (r5.A01 != null) {
            r4.A0d("thread_key");
            C55372aW.A00(r4, r5.A01);
        }
        String str = r5.A02;
        if (str != null) {
            r4.A0H("client_context", str);
        }
        String str2 = r5.A03;
        if (str2 != null) {
            r4.A0H("message_id", str2);
        }
        if (r5.A00 != null) {
            r4.A0d("reaction_mutation");
            C56412cS r2 = r5.A00;
            r4.A0T();
            String str3 = r2.A06;
            if (str3 != null) {
                r4.A0H("reaction_type", str3);
            }
            String str4 = r2.A05;
            if (str4 != null) {
                r4.A0H("reaction_status", str4);
            }
            String str5 = r2.A01;
            if (str5 != null) {
                r4.A0H("item_id", str5);
            }
            String str6 = r2.A03;
            if (str6 != null) {
                r4.A0H("original_message_client_context", str6);
            }
            String str7 = r2.A02;
            if (str7 != null) {
                r4.A0H("message_content_type_id", str7);
            }
            String str8 = r2.A00;
            if (str8 != null) {
                r4.A0H("emoji", str8);
            }
            String str9 = r2.A04;
            if (str9 != null) {
                r4.A0H("reaction_action_source", str9);
            }
            r4.A0Q();
        }
        AnonymousClass3LW.A00(r4, r5);
        r4.A0Q();
    }

    public final Object BWo(C13080hr r2) {
        return C99714Ss.parseFromJson(r2);
    }
}
