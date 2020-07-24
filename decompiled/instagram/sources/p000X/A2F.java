package p000X;

import com.instagram.react.impl.IgReactPackage;
import com.instagram.react.modules.base.IgSharedPreferencesModule;

/* renamed from: X.A2F */
public final class A2F implements AnonymousClass0IT {
    public final /* synthetic */ IgReactPackage A00;
    public final /* synthetic */ A44 A01;

    public A2F(IgReactPackage igReactPackage, A44 a44) {
        this.A00 = igReactPackage;
        this.A01 = a44;
    }

    public final /* bridge */ /* synthetic */ Object get() {
        return new IgSharedPreferencesModule(this.A01);
    }
}
