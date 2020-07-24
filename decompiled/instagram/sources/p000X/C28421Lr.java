package p000X;

/* renamed from: X.1Lr  reason: invalid class name and case insensitive filesystem */
public final class C28421Lr implements C28401Lo {
    public final C27641Iq A00;

    public final void BJ5(C15880ng r1, Throwable th, int i) {
    }

    public final void BJ7(C15880ng r1) {
    }

    public final void BJS(C15880ng r1, C28661Mp r2, boolean z) {
    }

    public final void BJX(C15880ng r1, C28661Mp r2) {
    }

    public final void BP6() {
    }

    public final void BJB() {
        C27641Iq r1 = this.A00;
        r1.A00 = false;
        AnonymousClass2YY r0 = r1.A01;
        if (r0 != null) {
            r0.A00.add(0, new AnonymousClass2Y6(System.currentTimeMillis(), "stop_recording"));
        }
    }

    public final void BJK(C15880ng r6) {
        C27641Iq r1 = this.A00;
        r1.A00 = true;
        r1.A02.clear();
        AnonymousClass2YY r0 = r1.A01;
        if (r0 != null) {
            r0.A00.add(0, new AnonymousClass2Y6(System.currentTimeMillis(), "start_recording"));
        }
    }

    public C28421Lr(C27641Iq r1) {
        this.A00 = r1;
    }
}
