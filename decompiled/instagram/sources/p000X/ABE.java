package p000X;

import com.facebook.react.animated.NativeAnimatedModule;

/* renamed from: X.ABE */
public final class ABE implements C23183ABl {
    public final /* synthetic */ int A00;
    public final /* synthetic */ NativeAnimatedModule A01;

    public ABE(NativeAnimatedModule nativeAnimatedModule, int i) {
        this.A01 = nativeAnimatedModule;
        this.A00 = i;
    }

    public final void ADZ(AB3 ab3) {
        int i = this.A00;
        for (int i2 = 0; i2 < ab3.A02.size(); i2++) {
            ABK abk = (ABK) ab3.A02.valueAt(i2);
            if (abk.A00 == i) {
                if (abk.A02 != null) {
                    C228259s1 A03 = C23041A0r.A03();
                    A03.putBoolean("finished", false);
                    abk.A02.invoke(A03);
                }
                ab3.A02.removeAt(i2);
                return;
            }
        }
    }
}
