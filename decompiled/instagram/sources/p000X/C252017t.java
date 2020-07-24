package p000X;

import android.content.Context;

/* renamed from: X.17t  reason: invalid class name and case insensitive filesystem */
public abstract class C252017t {
    public AnonymousClass239 A00;
    public final int A01;
    public final Context A02;

    private synchronized AnonymousClass239 A00() {
        if (this.A00 == null) {
            this.A00 = AnonymousClass239.A00(this.A02, this.A01);
        }
        return this.A00;
    }

    public abstract void A02(int i, Class cls);

    public abstract void A04(AnonymousClass238 r1, Class cls);

    public final void A03(AnonymousClass238 r2) {
        Class A012 = A01(this, r2.A00);
        if (A012 != null) {
            A04(r2, A012);
        }
    }

    public C252017t(Context context, int i) {
        this.A02 = context;
        this.A01 = i;
    }

    public static Class A01(C252017t r3, int i) {
        try {
            Class cls = (Class) r3.A00().A02.get(i);
            if (cls != null) {
                return cls;
            }
            boolean z = r3.A00().A00;
            throw new RuntimeException("jobId: " + i + " was not found. buildOutOfSync: " + z);
        } catch (RuntimeException e) {
            AnonymousClass0DB.A0G("JobSchedulerCompat", "getServiceInfoParser Runtime Exception", e);
            return null;
        }
    }
}
