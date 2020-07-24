package p000X;

import com.instagram.realtimeclient.RealtimeSubscription;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.1Ee  reason: invalid class name and case insensitive filesystem */
public final class C26611Ee extends C26621Ef {
    public C26631Eg A00;

    public static C26611Ee A00(AnonymousClass0C1 r7) {
        Class<C26611Ee> cls = C26611Ee.class;
        C26591Ec A002 = C26591Ec.A00(r7);
        C26611Ee r4 = (C26611Ee) ((C26621Ef) A002.A03.get(cls));
        if (r4 != null) {
            return r4;
        }
        C26611Ee r42 = new C26611Ee(r7, new C26631Eg(StoredPreferences.A00, "pending_likes", new C26641Eh()));
        A002.A03.put(cls, r42);
        return r42;
    }

    public final /* bridge */ /* synthetic */ C17850qu A0E(Object obj) {
        String str;
        AnonymousClass2F6 r9 = (AnonymousClass2F6) obj;
        C15890nh r4 = new C15890nh(this.A02);
        r4.A09 = Constants.ONE;
        r4.A0E("media/%s/%s/", r9.A03, r9.A02);
        if (r9.A06) {
            str = RealtimeSubscription.GRAPHQL_MQTT_VERSION;
        } else {
            str = "0";
        }
        r4.A09("d", str);
        r4.A09("media_id", r9.A03);
        r4.A09("module_name", r9.A01);
        if (r9.A05 != null) {
            for (int i = 0; i < r9.A05.size(); i += 2) {
                r4.A09((String) r9.A05.get(i), (String) r9.A05.get(i + 1));
            }
        }
        String str2 = r9.A04;
        if (str2 != null) {
            r4.A09("radio_type", str2);
        }
        r4.A06(AnonymousClass1N4.class, false);
        r4.A0F("d");
        return r4.A03();
    }

    public final Integer A0F() {
        return Constants.ONE;
    }

    public final void A0G() {
        List<AnonymousClass2F6> list;
        C26731Fa r0 = (C26731Fa) this.A00.A01(AnonymousClass000.A0E("pending_likes_", this.A02.A04()), true);
        if (!(r0 == null || (list = r0.A00) == null)) {
            HashMap hashMap = new HashMap();
            for (AnonymousClass2F6 r1 : list) {
                hashMap.put(r1.A03, r1);
            }
            A0C(hashMap);
            A08();
            hashMap.size();
        }
        this.A00.A02(AnonymousClass000.A0E("pending_likes_", this.A02.A04()));
    }

    public final void A0H() {
        this.A00.A02(AnonymousClass000.A0E("pending_likes_", this.A02.A04()));
    }

    public final Integer A0J(AnonymousClass1NJ r3) {
        if (this.A00 == null) {
            A07();
        }
        if (!A0D(r3.APo())) {
            return r3.A1R;
        }
        if (((AnonymousClass2F6) A03(r3.APo())).A02.equals("like")) {
            return Constants.ZERO;
        }
        return Constants.ONE;
    }

    public C26611Ee(AnonymousClass0C1 r1, C26631Eg r2) {
        super(r1);
        this.A00 = r2;
    }

    public final void A0I() {
        A02();
        C26731Fa r3 = new C26731Fa();
        r3.A00 = A05();
        this.A00.A06(AnonymousClass000.A0E("pending_likes_", this.A02.A04()), r3);
    }

    public final boolean A0K(AnonymousClass1NJ r4) {
        if (A0J(r4) == Constants.ZERO) {
            return true;
        }
        return false;
    }
}
