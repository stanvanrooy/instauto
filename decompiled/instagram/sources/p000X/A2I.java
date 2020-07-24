package p000X;

import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.react.impl.IgReactPackage;

/* renamed from: X.A2I */
public final class A2I implements AnonymousClass0IT {
    public final /* synthetic */ IgReactPackage A00;
    public final /* synthetic */ A44 A01;

    public A2I(IgReactPackage igReactPackage, A44 a44) {
        this.A00 = igReactPackage;
        this.A01 = a44;
    }

    public final /* bridge */ /* synthetic */ Object get() {
        return new DialogModule(this.A01);
    }
}
