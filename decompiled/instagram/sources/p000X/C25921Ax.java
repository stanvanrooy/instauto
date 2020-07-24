package p000X;

/* renamed from: X.1Ax  reason: invalid class name and case insensitive filesystem */
public final class C25921Ax {
    public final AnonymousClass1B1 A00;
    public final C25911Aw A01;

    public final C25941Az A00(Class cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            String A0E = AnonymousClass000.A0E("androidx.lifecycle.ViewModelProvider.DefaultKey:", canonicalName);
            C25941Az r1 = (C25941Az) this.A01.A00.get(A0E);
            if (cls.isInstance(r1)) {
                AnonymousClass1B1 r2 = this.A00;
                if (r2 instanceof AnonymousClass1B3) {
                    ((AnonymousClass1B3) r2).A00(r1);
                }
            } else {
                AnonymousClass1B1 r12 = this.A00;
                if (r12 instanceof AnonymousClass1B2) {
                    r1 = ((AnonymousClass1B2) r12).A01(A0E, cls);
                } else {
                    r1 = r12.create(cls);
                }
                C25941Az r0 = (C25941Az) this.A01.A00.put(A0E, r1);
                if (r0 != null) {
                    r0.onCleared();
                    return r1;
                }
            }
            return r1;
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    public C25921Ax(C11750fc r3) {
        this(r1, r0);
        AnonymousClass1B1 r0;
        C25911Aw viewModelStore = r3.getViewModelStore();
        if (r3 instanceof C11780ff) {
            r0 = ((C11780ff) r3).getDefaultViewModelProviderFactory();
        } else {
            if (C168907Jg.A00 == null) {
                C168907Jg.A00 = new C168907Jg();
            }
            r0 = C168907Jg.A00;
        }
    }

    public C25921Ax(C11750fc r2, AnonymousClass1B1 r3) {
        this(r2.getViewModelStore(), r3);
    }

    public C25921Ax(C25911Aw r1, AnonymousClass1B1 r2) {
        this.A00 = r2;
        this.A01 = r1;
    }
}
