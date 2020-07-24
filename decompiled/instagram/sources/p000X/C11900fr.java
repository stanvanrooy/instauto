package p000X;

/* renamed from: X.0fr  reason: invalid class name and case insensitive filesystem */
public final class C11900fr implements C11910fs {
    public final /* synthetic */ C11890fq A00;

    public C11900fr(C11890fq r1) {
        this.A00 = r1;
    }

    public final void Brl(AnonymousClass2CH r5) {
        C251117i r3;
        C935242t r0;
        switch (r5.ordinal()) {
            case 1:
                r3 = this.A00.A00;
                r0 = C935242t.TRIM_MEMORY_SYSTEM_RUNNING_CRITICAL;
                break;
            case 2:
                r3 = this.A00.A00;
                r0 = C935242t.TRIM_MEMORY_SYSTEM_RUNNING_LOW;
                break;
            default:
                return;
        }
        AnonymousClass0ZA.A0E(r3.A06, new AnonymousClass41M(r3, r0), -2003419195);
    }
}
