package p000X;

import java.util.HashMap;

/* renamed from: X.1fk  reason: invalid class name and case insensitive filesystem */
public final class C35061fk extends C35071fl {
    public static final HashMap A00 = new HashMap();

    public static C35071fl A00(String str) {
        return (C35071fl) A00.get(str);
    }

    public static C35061fk A01(String str) {
        C35061fk r2 = new C35061fk(AnonymousClass000.A0E("IG_", str));
        A00.put(r2.A04, r2);
        return r2;
    }

    public C35061fk(String str) {
        super(str);
    }
}
