package p000X;

import com.facebook.react.animated.NativeAnimatedModule;
import com.facebook.react.bridge.Callback;

/* renamed from: X.ABY */
public final class ABY implements C23183ABl {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ NativeAnimatedModule A02;
    public final /* synthetic */ Callback A03;
    public final /* synthetic */ C23043A0y A04;

    public ABY(NativeAnimatedModule nativeAnimatedModule, int i, int i2, C23043A0y a0y, Callback callback) {
        this.A02 = nativeAnimatedModule;
        this.A01 = i;
        this.A00 = i2;
        this.A04 = a0y;
        this.A03 = callback;
    }

    public final void ADZ(AB3 ab3) {
        ab3.A03(this.A01, this.A00, this.A04, this.A03);
    }
}
