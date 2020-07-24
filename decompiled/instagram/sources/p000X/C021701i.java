package p000X;

/* renamed from: X.01i  reason: invalid class name and case insensitive filesystem */
public final class C021701i extends C035407j {
    public final AnonymousClass00N A00;

    /* renamed from: A05 */
    public final C021901k A03() {
        C021901k r5 = new C021901k();
        int size = this.A00.size();
        for (int i = 0; i < size; i++) {
            AnonymousClass00N r0 = this.A00;
            Class cls = (Class) r0.A06(i);
            r5.A00.put(cls, ((C035407j) r0.A08(i)).A03());
            r5.A01.put(cls, Boolean.FALSE);
        }
        return r5;
    }

    public C021701i(C034907e r3) {
        AnonymousClass00N r1 = new AnonymousClass00N();
        this.A00 = r1;
        r1.A0A(r3.A00);
    }

    /* renamed from: A06 */
    public final boolean A04(C021901k r8) {
        boolean z;
        C035707m.A00(r8);
        AnonymousClass00N r6 = r8.A00;
        int size = r6.size();
        boolean z2 = false;
        for (int i = 0; i < size; i++) {
            Class cls = (Class) r6.A06(i);
            C035407j r1 = (C035407j) this.A00.get(cls);
            if (r1 != null) {
                z = r1.A04(r8.A04(cls));
            } else {
                z = false;
            }
            r8.A07(cls, z);
            z2 |= z;
        }
        return z2;
    }
}
