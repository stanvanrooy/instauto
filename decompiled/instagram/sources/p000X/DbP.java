package p000X;

/* renamed from: X.DbP */
public final class DbP {
    public static DbQ parseFromJson(C13080hr r3) {
        DbQ dbQ = new DbQ();
        if (r3.A0g() != C13120hv.START_OBJECT) {
            r3.A0f();
            return null;
        }
        while (r3.A0p() != C13120hv.END_OBJECT) {
            String A0i = r3.A0i();
            r3.A0p();
            if ("has_next_page".equals(A0i)) {
                r3.A0O();
            } else if ("end_cursor".equals(A0i) && r3.A0g() != C13120hv.VALUE_NULL) {
                r3.A0t();
            }
            r3.A0f();
        }
        return dbQ;
    }
}
