package p000X;

import android.content.Context;
import com.instagram.realtimeclient.RealtimeSubscription;

/* renamed from: X.0pT  reason: invalid class name and case insensitive filesystem */
public final class C16970pT extends C16980pU {
    public AnonymousClass2V9 A00;

    public final AnonymousClass2V9 A00() {
        if (this.A00 == null) {
            this.A00 = new AnonymousClass2V9();
        }
        return this.A00;
    }

    public final AnonymousClass2EZ A01(AnonymousClass0C1 r3) {
        Class<AnonymousClass2EZ> cls = AnonymousClass2EZ.class;
        AnonymousClass2EZ r0 = (AnonymousClass2EZ) r3.AV9(cls);
        if (r0 != null) {
            return r0;
        }
        AnonymousClass2EZ r02 = new AnonymousClass2EZ();
        r3.BYi(cls, r02);
        return r02;
    }

    public final AnonymousClass1VX A02(AnonymousClass0C1 r3) {
        AnonymousClass1VX r0;
        Class<AnonymousClass1VX> cls = AnonymousClass1VX.class;
        synchronized (cls) {
            r0 = (AnonymousClass1VX) r3.AV9(cls);
            if (r0 == null) {
                r0 = new AnonymousClass1VX(r3);
                r3.BYi(cls, r0);
            }
        }
        return r0;
    }

    public final AnonymousClass6PB A03(AnonymousClass0C1 r2) {
        return new AnonymousClass6PB(r2);
    }

    public final C17850qu A04(AnonymousClass0C1 r4, String str, String str2) {
        C15890nh r2 = new C15890nh(r4);
        r2.A0E("live/%s/comment/%s/flag/", str, str2);
        r2.A09 = Constants.ONE;
        r2.A09("reason", RealtimeSubscription.GRAPHQL_MQTT_VERSION);
        r2.A09("media_id", str);
        r2.A09("comment_id", str2);
        r2.A06(AnonymousClass1N4.class, false);
        r2.A0G = true;
        return r2.A03();
    }

    public final String A05(String str, String str2) {
        Object[] objArr;
        String str3;
        String str4 = C144786Hb.A01.A00;
        if (str4 != null) {
            C15910nj r2 = new C15910nj();
            r2.A06(AnonymousClass6HY.A00(Constants.A02), str4);
            objArr = new Object[]{str, str2, r2.A01()};
            str3 = "/live/%s/comment/%s/flag/?%s";
        } else {
            objArr = new Object[]{str, str2};
            str3 = "/live/%s/comment/%s/flag";
        }
        return C06360Ot.formatString(str3, objArr);
    }

    public final void A06(instagramComment r1, AnonymousClass1NJ r2) {
        AnonymousClass6QS.A01(r1, r2);
    }

    public final void A07(AnonymousClass0C1 r1, String str, Context context) {
        C119445Am.A00(r1, str, context);
    }
}
