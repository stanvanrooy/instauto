package p000X;

/* renamed from: X.1Kv  reason: invalid class name and case insensitive filesystem */
public class C28211Kv implements C06570Po {
    public final C13740j9 A00;
    public final C13740j9 A01;

    public static C28211Kv A00(AnonymousClass0C1 r2) {
        return (C28211Kv) r2.AVA(C28211Kv.class, new C28221Kw(r2));
    }

    public final void onUserSessionWillEnd(boolean z) {
        if (z) {
            this.A01.A07();
            this.A00.A07();
            return;
        }
        this.A01.A08();
        this.A00.A08();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    public C28211Kv(AnonymousClass0C1 r5, boolean z, String str, String str2, int i) {
        this(r1, r0);
        C13740j9 A012;
        C13740j9 A013;
        String A0J = AnonymousClass000.A0J(r5.A04(), "_", str);
        Class<C13740j9> cls = C13740j9.class;
        synchronized (cls) {
            A012 = C13740j9.A01(A0J, z, i);
        }
        String A0J2 = AnonymousClass000.A0J(r5.A04(), "_", str2);
        synchronized (cls) {
            A013 = C13740j9.A01(A0J2, z, i);
        }
    }

    public C28211Kv(C13740j9 r1, C13740j9 r2) {
        this.A01 = r1;
        this.A00 = r2;
    }
}
