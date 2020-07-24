package p000X;

import com.facebook.AccessToken;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.0jm  reason: invalid class name and case insensitive filesystem */
public abstract class C14110jm {
    public static final Map A00 = new HashMap();

    public abstract AccessToken A02();

    public abstract void A03(AccessToken accessToken);

    public abstract void A04(C14180jt r1);

    public abstract boolean A05();

    public static synchronized C14110jm A00(String str) {
        C14110jm r2;
        synchronized (C14110jm.class) {
            r2 = (C14110jm) A00.get(str);
            if (r2 == null) {
                if ("fbsdk_logged_out_id".equals(str)) {
                    r2 = new C14210jw();
                } else {
                    r2 = new C14150jq(str, C14120jn.A00(C12840hT.A00), new C14140jp(str));
                }
                A00.put(str, r2);
            }
        }
        return r2;
    }

    public static synchronized void A01() {
        synchronized (C14110jm.class) {
            A00.clear();
        }
    }
}
