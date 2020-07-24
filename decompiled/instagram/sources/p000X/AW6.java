package p000X;

import com.facebook.proxygen.RootCACallbacks;

/* renamed from: X.AW6 */
public final class AW6 implements RootCACallbacks {
    public final /* synthetic */ AW4 A00;

    public AW6(AW4 aw4) {
        this.A00 = aw4;
    }

    public final byte[][] getSystemRootCAs() {
        return AW4.A00.A02();
    }
}
