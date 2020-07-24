package p000X;

import com.facebook.react.animated.NativeAnimatedModule;
import com.facebook.react.bridge.ReadableMapKeySetIterator;

/* renamed from: X.AB7 */
public final class AB7 implements C23183ABl {
    public final /* synthetic */ int A00;
    public final /* synthetic */ NativeAnimatedModule A01;

    public AB7(NativeAnimatedModule nativeAnimatedModule, int i) {
        this.A01 = nativeAnimatedModule;
        this.A00 = i;
    }

    public final void ADZ(AB3 ab3) {
        ABX abx = (ABX) ab3.A03.get(this.A00);
        if (abx == null) {
            return;
        }
        if (abx instanceof ABA) {
            ABA aba = (ABA) abx;
            if (aba.A00 != -1) {
                ReadableMapKeySetIterator keySetIterator = aba.A03.keySetIterator();
                while (keySetIterator.Aby()) {
                    aba.A03.putNull(keySetIterator.Aq1());
                }
                aba.A01.synchronouslyUpdateViewOnUIThread(aba.A00, aba.A03);
                return;
            }
            return;
        }
        throw new A0k(AnonymousClass000.A0E("Animated node connected to view should beof type ", ABA.class.getName()));
    }
}
