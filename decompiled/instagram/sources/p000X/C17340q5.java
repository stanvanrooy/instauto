package p000X;

/* renamed from: X.0q5  reason: invalid class name and case insensitive filesystem */
public final class C17340q5 implements C17120pi {
    public final void BfU(C13460iZ r3, Object obj) {
        C17330q4 r4 = (C17330q4) obj;
        r3.A0T();
        String str = r4.A00;
        if (str != null) {
            r3.A0H("media_id", str);
        }
        String str2 = r4.A03;
        if (str2 != null) {
            r3.A0H("question_id", str2);
        }
        String str3 = r4.A01;
        if (str3 != null) {
            r3.A0H("music_browse_session_id", str3);
        }
        String str4 = r4.A02;
        if (str4 != null) {
            r3.A0H("audio_asset_id", str4);
        }
        String str5 = r4.A04;
        if (str5 != null) {
            r3.A0H("response", str5);
        }
        AnonymousClass3LW.A00(r3, r4);
        r3.A0Q();
    }

    public final Object BWo(C13080hr r2) {
        return C99304Rd.parseFromJson(r2);
    }
}
