package p000X;

import java.util.HashMap;
import java.util.List;

/* renamed from: X.1Ew  reason: invalid class name and case insensitive filesystem */
public final class C26701Ew extends C26621Ef {
    public C26631Eg A00;

    public static C26701Ew A00(AnonymousClass0C1 r7) {
        Class<C26701Ew> cls = C26701Ew.class;
        C26591Ec A002 = C26591Ec.A00(r7);
        C26701Ew r4 = (C26701Ew) ((C26621Ef) A002.A03.get(cls));
        if (r4 != null) {
            return r4;
        }
        C26701Ew r42 = new C26701Ew(r7, new C26631Eg(StoredPreferences.A00, "pending_comments", new C26711Ex(r7)));
        A002.A03.put(cls, r42);
        return r42;
    }

    public final /* bridge */ /* synthetic */ C17850qu A0E(Object obj) {
        String str;
        Integer num;
        AnonymousClass6UV r11 = (AnonymousClass6UV) obj;
        if (this.A00 == null) {
            A07();
        }
        AnonymousClass0C1 r4 = this.A02;
        instagramComment r1 = r11.A03;
        String str2 = r11.A04;
        String str3 = r11.A05;
        boolean z = r11.A06;
        AnonymousClass1NJ r0 = r1.A0C;
        if (r0 != null) {
            str = r0.A21;
        } else {
            str = null;
        }
        int i = r11.A01;
        int i2 = r11.A00;
        if (r0 != null) {
            num = r0.A0i();
        } else {
            num = Constants.A0C;
        }
        return AnonymousClass6UD.A00(r1, str2, str3, r4, z, str, i, i2, num);
    }

    public final Integer A0F() {
        return Constants.ONE;
    }

    public final void A0G() {
        List<AnonymousClass6UV> list;
        AnonymousClass1G9 r0 = (AnonymousClass1G9) this.A00.A01(AnonymousClass000.A0E("pending_comments_", this.A02.A04()), true);
        if (!(r0 == null || (list = r0.A00) == null)) {
            HashMap hashMap = new HashMap();
            for (AnonymousClass6UV r2 : list) {
                instagramComment r1 = r2.A03;
                r1.A0I = Constants.ZERO;
                hashMap.put(r1.AS8(), r2);
            }
            hashMap.size();
            A0C(hashMap);
            A08();
        }
        this.A00.A02(AnonymousClass000.A0E("pending_comments_", this.A02.A04()));
    }

    public final void A0H() {
        this.A00.A02(AnonymousClass000.A0E("pending_comments_", this.A02.A04()));
    }

    public C26701Ew(AnonymousClass0C1 r1, C26631Eg r2) {
        super(r1);
        this.A00 = r2;
    }

    public final void A0I() {
        A02();
        AnonymousClass1G9 r3 = new AnonymousClass1G9();
        r3.A00 = A05();
        this.A00.A06(AnonymousClass000.A0E("pending_comments_", this.A02.A04()), r3);
    }
}
