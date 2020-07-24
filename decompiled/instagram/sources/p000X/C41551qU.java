package p000X;

/* renamed from: X.1qU  reason: invalid class name and case insensitive filesystem */
public final class C41551qU extends AnonymousClass1SZ {
    public final C27371Ho A00;
    public final AnonymousClass0C1 A01;
    public final String A02;

    public final /* bridge */ /* synthetic */ void A01(Object obj, Object obj2) {
        C218499bU r8 = (C218499bU) obj;
        switch (((C217629a3) obj2).ordinal()) {
            case 0:
                C27371Ho r1 = this.A00;
                AnonymousClass0C1 r0 = this.A01;
                String str = this.A02;
                String str2 = r8.A01;
                int i = r8.A00;
                C91593xn r3 = new C91593xn(AnonymousClass0QT.A00(r0, r1).A02("instagram_shopping_followed_brand_impression"));
                if (r3.A0B()) {
                    r3.A07("ig_profile_user_id", Long.valueOf(Long.parseLong(str2)));
                    r3.A08("shopping_session_id", str);
                    String str3 = null;
                    if (i >= 0) {
                        str3 = C71813Cg.A00(i, 0);
                    }
                    r3.A08("position", str3);
                    r3.A01();
                    return;
                }
                return;
            case 1:
                C27371Ho r12 = this.A00;
                AnonymousClass0C1 r02 = this.A01;
                String str4 = this.A02;
                String str5 = r8.A01;
                int i2 = r8.A00;
                C91613xp r32 = new C91613xp(AnonymousClass0QT.A00(r02, r12).A02("instagram_shopping_suggested_brand_impression"));
                if (r32.A0B()) {
                    r32.A07("ig_profile_user_id", Long.valueOf(Long.parseLong(str5)));
                    r32.A08("shopping_session_id", str4);
                    String str6 = null;
                    if (i2 >= 0) {
                        str6 = C71813Cg.A00(i2, 0);
                    }
                    r32.A08("position", str6);
                    r32.A01();
                    return;
                }
                return;
            default:
                return;
        }
    }

    public C41551qU(C27371Ho r1, AnonymousClass0C1 r2, String str, AnonymousClass1L0 r4, C13740j9 r5) {
        super(r5, r4);
        this.A00 = r1;
        this.A02 = str;
        this.A01 = r2;
    }

    public final void A02(Object obj, Object obj2) {
    }
}
