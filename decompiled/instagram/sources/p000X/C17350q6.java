package p000X;

/* renamed from: X.0q6  reason: invalid class name and case insensitive filesystem */
public final class C17350q6 implements C17140pk {
    public final C17850qu A6w(AnonymousClass0C1 r14, C17090pf r15) {
        C17330q4 r0 = (C17330q4) r15;
        String str = r0.A00;
        String str2 = r0.A03;
        String str3 = r0.A01;
        String str4 = r0.A02;
        String str5 = r0.A04;
        String str6 = r0.A03;
        C15890nh A00 = C99654Sm.A00(r14, str, str2, C44761wi.MUSIC.A00, str6, str6, (String) null, (String) null);
        A00.A09("music_browse_session_id", str3);
        if (str4 != null) {
            A00.A09("audio_asset_id", str4);
        } else {
            A00.A09("response", str5);
        }
        return A00.A03();
    }
}
