package p000X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.instagram.react.impl.IgReactPackage;

/* renamed from: X.A2J */
public final class A2J implements AnonymousClass0IT {
    public final /* synthetic */ IgReactPackage A00;
    public final /* synthetic */ A44 A01;

    public A2J(IgReactPackage igReactPackage, A44 a44) {
        this.A00 = igReactPackage;
        this.A01 = a44;
    }

    public final /* bridge */ /* synthetic */ Object get() {
        return new NetInfoModule(this.A01);
    }
}
