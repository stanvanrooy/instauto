package p000X;

import com.facebook.react.animated.NativeAnimatedModule;

/* renamed from: X.ABG */
public final class ABG implements C23183ABl {
    public final /* synthetic */ double A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ NativeAnimatedModule A02;

    public ABG(NativeAnimatedModule nativeAnimatedModule, int i, double d) {
        this.A02 = nativeAnimatedModule;
        this.A01 = i;
        this.A00 = d;
    }

    public final void ADZ(AB3 ab3) {
        int i = this.A01;
        double d = this.A00;
        ABX abx = (ABX) ab3.A03.get(i);
        if (abx == null || !(abx instanceof ABP)) {
            throw new A0k(AnonymousClass000.A06("Animated node with tag ", i, " does not exist, or is not a 'value' node"));
        }
        AB3.A00(ab3, abx);
        ((ABP) abx).A01 = d;
        ab3.A04.put(i, abx);
    }
}
