package p000X;

import com.facebook.react.modules.statusbar.StatusBarModule;
import com.instagram.react.impl.IgReactPackage;

/* renamed from: X.A2M */
public final class A2M implements AnonymousClass0IT {
    public final /* synthetic */ IgReactPackage A00;
    public final /* synthetic */ A44 A01;

    public A2M(IgReactPackage igReactPackage, A44 a44) {
        this.A00 = igReactPackage;
        this.A01 = a44;
    }

    public final /* bridge */ /* synthetic */ Object get() {
        return new StatusBarModule(this.A01);
    }
}
