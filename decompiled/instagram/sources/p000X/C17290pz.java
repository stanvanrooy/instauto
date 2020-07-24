package p000X;

/* renamed from: X.0pz  reason: invalid class name and case insensitive filesystem */
public final class C17290pz implements C17120pi {
    public final void BfU(C13460iZ r3, Object obj) {
        C17280py r4 = (C17280py) obj;
        r3.A0T();
        String str = r4.A01;
        if (str != null) {
            r3.A0H("media_id", str);
        }
        String str2 = r4.A02;
        if (str2 != null) {
            r3.A0H("question_id", str2);
        }
        String str3 = r4.A04;
        if (str3 != null) {
            r3.A0H("response", str3);
        }
        String str4 = r4.A03;
        if (str4 != null) {
            r3.A0H("reel_viewer_module_name", str4);
        }
        String str5 = r4.A00;
        if (str5 != null) {
            r3.A0H("media_delivery_class", str5);
        }
        AnonymousClass3LW.A00(r3, r4);
        r3.A0Q();
    }

    public final Object BWo(C13080hr r2) {
        return AnonymousClass4RV.parseFromJson(r2);
    }
}
