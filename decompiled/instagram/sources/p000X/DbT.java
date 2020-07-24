package p000X;

/* renamed from: X.DbT */
public final class DbT {
    public static DbV parseFromJson(C13080hr r4) {
        DbV dbV = new DbV();
        if (r4.A0g() != C13120hv.START_OBJECT) {
            r4.A0f();
            return null;
        }
        while (r4.A0p() != C13120hv.END_OBJECT) {
            String A0i = r4.A0i();
            r4.A0p();
            if ("count".equals(A0i)) {
                dbV.A00 = r4.A0I();
            } else {
                String str = null;
                if ("media_owner_id".equals(A0i)) {
                    if (r4.A0g() != C13120hv.VALUE_NULL) {
                        str = r4.A0t();
                    }
                    dbV.A02 = str;
                } else if ("name".equals(A0i)) {
                    if (r4.A0g() != C13120hv.VALUE_NULL) {
                        str = r4.A0t();
                    }
                    dbV.A03 = str;
                } else if ("username".equals(A0i)) {
                    if (r4.A0g() != C13120hv.VALUE_NULL) {
                        str = r4.A0t();
                    }
                    dbV.A04 = str;
                } else if (AnonymousClass0C5.$const$string(113).equals(A0i)) {
                    dbV.A01 = DbU.parseFromJson(r4);
                }
            }
            r4.A0f();
        }
        return dbV;
    }
}
