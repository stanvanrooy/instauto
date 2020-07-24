package p000X;

/* renamed from: X.0ty  reason: invalid class name and case insensitive filesystem */
public final class C19740ty implements C17120pi {
    public final void BfU(C13460iZ r3, Object obj) {
        C19730tx r4 = (C19730tx) obj;
        r3.A0T();
        String str = r4.A0A;
        if (str != null) {
            r3.A0H("reel_owner_user_id", str);
        }
        String str2 = r4.A09;
        if (str2 != null) {
            r3.A0H("reel_id", str2);
        }
        if (r4.A00 != null) {
            r3.A0d("reel_share");
            C58042fD.A00(r3, r4.A00);
        }
        String str3 = r4.A08;
        if (str3 != null) {
            r3.A0H("reaction_name", str3);
        }
        String str4 = r4.A02;
        if (str4 != null) {
            r3.A0H("gif_id", str4);
        }
        r3.A0I("gif_is_sticker", r4.A0D);
        String str5 = r4.A04;
        if (str5 != null) {
            r3.A0H("interactive_sticker_type", str5);
        }
        String str6 = r4.A03;
        if (str6 != null) {
            r3.A0H("interact_user_id", str6);
        }
        String str7 = r4.A07;
        if (str7 != null) {
            r3.A0H("question_response_id", str7);
        }
        String str8 = r4.A05;
        if (str8 != null) {
            r3.A0H("poll_id", str8);
        }
        String str9 = r4.A06;
        if (str9 != null) {
            r3.A0H("poll_vote", str9);
        }
        String str10 = r4.A0B;
        if (str10 != null) {
            r3.A0H("slider_id", str10);
        }
        String str11 = r4.A0C;
        if (str11 != null) {
            r3.A0H("slider_vote", str11);
        }
        String str12 = r4.A01;
        if (str12 != null) {
            r3.A0H("entry_point", str12);
        }
        AnonymousClass4RD.A00(r3, r4);
        r3.A0Q();
    }

    public final Object BWo(C13080hr r2) {
        return C99444Rr.parseFromJson(r2);
    }
}
