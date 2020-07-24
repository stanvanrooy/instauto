package p000X;

import com.facebook.react.animated.NativeAnimatedModule;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.ABC */
public final class ABC implements C23183ABl {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ NativeAnimatedModule A02;

    public ABC(NativeAnimatedModule nativeAnimatedModule, int i, int i2) {
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
                if (abx.A03 == null) {
                    abx.A03 = new ArrayList(1);
                }
                List list = abx.A03;
                AnonymousClass0FY.A00(list);
                list.add(abx2);
                abx2.A02(abx);
                ab3.A04.put(i2, abx2);
                return;
            }
            throw new A0k(AnonymousClass000.A06("Animated node with tag ", i2, " does not exists"));
        }
        throw new A0k(AnonymousClass000.A06("Animated node with tag ", i, " does not exists"));
    }
}
