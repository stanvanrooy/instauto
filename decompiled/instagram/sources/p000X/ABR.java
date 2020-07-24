package p000X;

import com.facebook.react.animated.NativeAnimatedModule;

/* renamed from: X.ABR */
public final class ABR implements C23183ABl {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C23180ABi A01;
    public final /* synthetic */ NativeAnimatedModule A02;

    public ABR(NativeAnimatedModule nativeAnimatedModule, int i, C23180ABi aBi) {
        this.A02 = nativeAnimatedModule;
        this.A00 = i;
        this.A01 = aBi;
    }

    public final void ADZ(AB3 ab3) {
        int i = this.A00;
        C23180ABi aBi = this.A01;
        ABX abx = (ABX) ab3.A03.get(i);
        if (abx == null || !(abx instanceof ABP)) {
            throw new A0k(AnonymousClass000.A06("Animated node with tag ", i, " does not exist, or is not a 'value' node"));
        }
        ((ABP) abx).A02 = aBi;
    }
}
