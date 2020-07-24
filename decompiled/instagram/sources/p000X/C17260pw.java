package p000X;

/* renamed from: X.0pw  reason: invalid class name and case insensitive filesystem */
public final class C17260pw implements C17140pk {
    public final C17850qu A6w(AnonymousClass0C1 r10, C17090pf r11) {
        C17240pu r112 = (C17240pu) r11;
        String str = r112.A02;
        String str2 = r112.A03;
        int i = r112.A00;
        String str3 = r112.A04;
        String str4 = r112.A05;
        String str5 = r112.A01;
        C15890nh r2 = new C15890nh(r10);
        r2.A09 = Constants.ONE;
        r2.A0E("media/%s/%s/story_poll_vote/", str, str2);
        r2.A09("vote", String.valueOf(i));
        r2.A09("radio_type", str3);
        r2.A09("container_module", str4);
        r2.A09("delivery_class", str5);
        r2.A06(C120985Gu.class, false);
        r2.A0G = true;
        return r2.A03();
    }
}
