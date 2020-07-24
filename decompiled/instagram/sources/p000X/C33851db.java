package p000X;

import java.util.List;

/* renamed from: X.1db  reason: invalid class name and case insensitive filesystem */
public final class C33851db {
    public int A00;
    public String A01;
    public List A02;

    public final C17190pp A00(String str) {
        for (C17190pp r1 : this.A02) {
            if (r1.A00.equalsIgnoreCase(str)) {
                return r1;
            }
        }
        return null;
    }

    public final boolean A01() {
        int i = this.A00;
        if (i < 200 || i >= 300) {
            return false;
        }
        return true;
    }

    public C33851db(int i, String str, List list) {
        this.A00 = i;
        this.A01 = str;
        this.A02 = list;
    }

    public final boolean A02(String str) {
        if (A00(str) != null) {
            return true;
        }
        return false;
    }
}
