package p000X;

import com.facebook.react.animated.NativeAnimatedModule;

/* renamed from: X.AB1 */
public final class AB1 implements C23183ABl {
    public final /* synthetic */ int A00;
    public final /* synthetic */ NativeAnimatedModule A01;
    public final /* synthetic */ C23043A0y A02;

    public AB1(NativeAnimatedModule nativeAnimatedModule, int i, C23043A0y a0y) {
        this.A01 = nativeAnimatedModule;
        this.A00 = i;
        this.A02 = a0y;
    }

    public final void ADZ(AB3 ab3) {
        ABX abi;
        int i = this.A00;
        C23043A0y a0y = this.A02;
        if (ab3.A03.get(i) == null) {
            String string = a0y.getString("type");
            if ("style".equals(string)) {
                abi = new ABF(a0y, ab3);
            } else if ("value".equals(string)) {
                abi = new ABP(a0y);
            } else if ("props".equals(string)) {
                abi = new ABA(a0y, ab3);
            } else if ("interpolation".equals(string)) {
                abi = new C23158AAm(a0y);
            } else if ("addition".equals(string)) {
                abi = new C23171AAz(a0y, ab3);
            } else if ("subtraction".equals(string)) {
                abi = new C23169AAx(a0y, ab3);
            } else if ("division".equals(string)) {
                abi = new AB0(a0y, ab3);
            } else if ("multiplication".equals(string)) {
                abi = new C23170AAy(a0y, ab3);
            } else if ("modulus".equals(string)) {
                abi = new ABT(a0y, ab3);
            } else if ("diffclamp".equals(string)) {
                abi = new C23168AAw(a0y, ab3);
            } else if ("transform".equals(string)) {
                abi = new AB8(a0y, ab3);
            } else if ("tracking".equals(string)) {
                abi = new ABI(a0y, ab3);
            } else {
                throw new A0k(AnonymousClass000.A0E("Unsupported node type: ", string));
            }
            abi.A02 = i;
            ab3.A03.put(i, abi);
            ab3.A04.put(i, abi);
            return;
        }
        throw new A0k(AnonymousClass000.A06("Animated node with tag ", i, " already exists"));
    }
}
