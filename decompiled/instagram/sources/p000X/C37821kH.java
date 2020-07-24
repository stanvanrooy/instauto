package p000X;

import com.instagram.realtimeclient.GraphQLSubscriptionID;
import java.util.ArrayList;

/* renamed from: X.1kH  reason: invalid class name and case insensitive filesystem */
public final class C37821kH {
    public static C37831kI parseFromJson(C13080hr r4) {
        C37831kI r2 = new C37831kI();
        if (r4.A0g() != C13120hv.START_OBJECT) {
            r4.A0f();
            return null;
        }
        while (r4.A0p() != C13120hv.END_OBJECT) {
            String A0i = r4.A0i();
            r4.A0p();
            ArrayList arrayList = null;
            if ("surfaces".equals(A0i)) {
                if (r4.A0g() == C13120hv.START_ARRAY) {
                    arrayList = new ArrayList();
                    while (r4.A0p() != C13120hv.END_ARRAY) {
                        C37851kK parseFromJson = C37841kJ.parseFromJson(r4);
                        if (parseFromJson != null) {
                            arrayList.add(parseFromJson);
                        }
                    }
                }
                r2.A04 = arrayList;
            } else if ("slots".equals(A0i)) {
                if (r4.A0g() == C13120hv.START_ARRAY) {
                    arrayList = new ArrayList();
                    while (r4.A0p() != C13120hv.END_ARRAY) {
                        C37871kM parseFromJson2 = C37861kL.parseFromJson(r4);
                        if (parseFromJson2 != null) {
                            arrayList.add(parseFromJson2);
                        }
                    }
                }
                r2.A03 = arrayList;
            } else if ("global".equals(A0i)) {
                r2.A02 = Long.valueOf(r4.A0J());
            } else if (GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT.equals(A0i)) {
                r2.A01 = Long.valueOf(r4.A0J());
            } else if ("ttl".equals(A0i)) {
                r2.A00 = Long.valueOf(r4.A0J());
            } else {
                AnonymousClass1N4.A01(r2, A0i, r4);
            }
            r4.A0f();
        }
        return r2;
    }
}
