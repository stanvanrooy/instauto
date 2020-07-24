package p000X;

import com.facebook.proxygen.SamplePolicy;

/* renamed from: X.1Ch  reason: invalid class name and case insensitive filesystem */
public final class C26241Ch implements SamplePolicy {
    public static int A02 = 10000;
    public boolean A00;
    public boolean A01;

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0016, code lost:
        if (java.lang.Math.random() >= (1.0d / ((double) r12))) goto L_0x0018;
     */
    public C26241Ch(int i) {
        A02 = i;
        boolean z = false;
        boolean z2 = i != 0 ? true : z2;
        z2 = false;
        this.A01 = z2;
        this.A00 = Math.random() < 1.0d / ((double) 5000) ? true : z;
    }

    public final boolean isSampled() {
        if (this.A01 || this.A00 || AnonymousClass1CU.A00()) {
            return true;
        }
        return false;
    }
}
