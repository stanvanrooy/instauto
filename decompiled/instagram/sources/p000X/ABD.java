package p000X;

import com.facebook.react.animated.NativeAnimatedModule;

/* renamed from: X.ABD */
public final class ABD implements C23183ABl {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ NativeAnimatedModule A02;

    public ABD(NativeAnimatedModule nativeAnimatedModule, int i, int i2) {
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
            ABA aba = (ABA) abx;
            int i3 = aba.A00;
            if (i3 == i2 || i3 == -1) {
                aba.A00 = -1;
                return;
            }
            throw new A0k(AnonymousClass000.A07("Attempting to disconnect view that has not been connected with the given animated node: ", i2, " but is connected to view ", i3));
        } else {
            throw new A0k(AnonymousClass000.A0E("Animated node connected to view should beof type ", ABA.class.getName()));
        }
    }
}
