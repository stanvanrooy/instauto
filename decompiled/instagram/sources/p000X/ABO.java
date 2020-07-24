package p000X;

import com.facebook.react.animated.NativeAnimatedModule;
import java.util.List;

/* renamed from: X.ABO */
public final class ABO implements C23183ABl {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ NativeAnimatedModule A02;

    public ABO(NativeAnimatedModule nativeAnimatedModule, int i, int i2) {
        this.A02 = nativeAnimatedModule;
        this.A01 = i;
        this.A00 = i2;
    }

    public final void ADZ(AB3 ab3) {
        int i = this.A01;
        int i2 = this.A00;
        ABX abx = (ABX) ab3.A03.get(i);
        if (abx != null) {
            ABX abx2 = (ABX) ab3.A03.get(i2);
            if (abx2 != null) {
                List list = abx.A03;
                if (list != null) {
                    abx2.A03(abx);
                    list.remove(abx2);
                }
                ab3.A04.put(i2, abx2);
                return;
            }
            throw new A0k(AnonymousClass000.A06("Animated node with tag ", i2, " does not exists"));
        }
        throw new A0k(AnonymousClass000.A06("Animated node with tag ", i, " does not exists"));
    }
}
