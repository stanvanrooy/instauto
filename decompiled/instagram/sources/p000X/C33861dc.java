package p000X;

import java.util.List;

/* renamed from: X.1dc  reason: invalid class name and case insensitive filesystem */
public final class C33861dc {
    public AnonymousClass1CA A00;
    public final int A01;
    public final String A02;
    public final List A03;

    public final C17190pp A00(String str) {
        for (C17190pp r1 : this.A03) {
            if (r1.A00.equalsIgnoreCase(str)) {
                return r1;
            }
        }
        return null;
    }

    public final C17190pp[] A01() {
        List list = this.A03;
        return (C17190pp[]) list.toArray(new C17190pp[list.size()]);
    }

    public C33861dc(int i, String str, List list) {
        this.A01 = i;
        this.A02 = str;
        this.A03 = list;
    }
}
