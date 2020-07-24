package p000X;

import com.facebook.react.modules.sound.SoundManagerModule;
import com.instagram.react.impl.IgReactPackage;

/* renamed from: X.A2K */
public final class A2K implements AnonymousClass0IT {
    public final /* synthetic */ IgReactPackage A00;
    public final /* synthetic */ A44 A01;

    public A2K(IgReactPackage igReactPackage, A44 a44) {
        this.A00 = igReactPackage;
        this.A01 = a44;
    }

    public final /* bridge */ /* synthetic */ Object get() {
        return new SoundManagerModule(this.A01);
    }
}
