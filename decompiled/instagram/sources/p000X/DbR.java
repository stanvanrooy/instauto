package p000X;

import java.util.ArrayList;

/* renamed from: X.DbR */
public final class DbR {
    public static DbS parseFromJson(C13080hr r4) {
        DbS dbS = new DbS();
        if (r4.A0g() != C13120hv.START_OBJECT) {
            r4.A0f();
            return null;
        }
        while (r4.A0p() != C13120hv.END_OBJECT) {
            String A0i = r4.A0i();
            r4.A0p();
            if ("count".equals(A0i)) {
                r4.A0I();
            } else if ("page_info".equals(A0i)) {
                dbS.A00 = DbP.parseFromJson(r4);
            } else if ("edges".equals(A0i)) {
                ArrayList arrayList = null;
                if (r4.A0g() == C13120hv.START_ARRAY) {
                    arrayList = new ArrayList();
                    while (r4.A0p() != C13120hv.END_ARRAY) {
                        DbV parseFromJson = DbT.parseFromJson(r4);
                        if (parseFromJson != null) {
                            arrayList.add(parseFromJson);
                        }
                    }
                }
                dbS.A01 = arrayList;
            }
            r4.A0f();
        }
        return dbS;
    }
}
