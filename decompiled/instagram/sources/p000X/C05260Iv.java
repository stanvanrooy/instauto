package p000X;

/* renamed from: X.0Iv  reason: invalid class name and case insensitive filesystem */
public final class C05260Iv implements C04350Dp {
    public final /* synthetic */ C05240It A00;

    public C05260Iv(C05240It r1) {
        this.A00 = r1;
    }

    public final Integer AQe() {
        return Constants.A0u;
    }

    public final void BXP(AnonymousClass0LX r3, C04440Dz r4) {
        Integer num;
        Integer num2;
        AnonymousClass0a7 A002 = AnonymousClass0a7.A00();
        synchronized (A002) {
            num = A002.A01;
        }
        r3.A01("ig_push_phase", AnonymousClass0a6.A00(num));
        AnonymousClass0a7 A003 = AnonymousClass0a7.A00();
        synchronized (A003) {
            num2 = A003.A01;
        }
        r3.A01("deployment_stage", AnonymousClass0a6.A00(num2));
    }
}
