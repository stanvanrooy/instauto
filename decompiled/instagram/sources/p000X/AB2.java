package p000X;

import com.facebook.react.animated.NativeAnimatedModule;
import com.facebook.react.bridge.ReactSoftException;

/* renamed from: X.AB2 */
public final class AB2 implements C23183ABl {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ NativeAnimatedModule A02;

    public AB2(NativeAnimatedModule nativeAnimatedModule, int i, int i2) {
        this.A02 = nativeAnimatedModule;
        this.A00 = i;
        this.A01 = i2;
    }

    public final void ADZ(AB3 ab3) {
        int i = this.A00;
        int i2 = this.A01;
        ABX abx = (ABX) ab3.A03.get(i);
        if (abx == null) {
            throw new A0k(AnonymousClass000.A06("Animated node with tag ", i, " does not exists"));
        } else if (abx instanceof ABA) {
            A44 a44 = ab3.A05;
            if (a44 != null) {
                int i3 = 1;
                if (i2 % 2 == 0) {
                    i3 = 2;
                }
                A3o A012 = A3W.A01(a44, i3, true);
                if (A012 == null) {
                    ReactSoftException.logSoftException("NativeAnimatedNodesManager", new A0P(AnonymousClass000.A05("Animated node could not be connected to UIManager - uiManager disappeared for tag: ", i2)));
                    return;
                }
                ABA aba = (ABA) abx;
                int i4 = aba.A00;
                if (i4 == -1) {
                    aba.A00 = i2;
                    aba.A01 = A012;
                    ab3.A04.put(i, abx);
                    return;
                }
                throw new A0k("Animated node " + aba.A02 + " is " + "already attached to a view: " + i4);
            }
            throw new IllegalStateException(AnonymousClass000.A05("Animated node could not be connected, no ReactApplicationContext: ", i2));
        } else {
            throw new A0k(AnonymousClass000.A0E("Animated node connected to view should beof type ", ABA.class.getName()));
        }
    }
}
