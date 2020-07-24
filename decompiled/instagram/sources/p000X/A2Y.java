package p000X;

import com.facebook.react.modules.i18nmanager.I18nManagerModule;
import com.instagram.react.impl.IgReactPackage;

/* renamed from: X.A2Y */
public final class A2Y implements AnonymousClass0IT {
    public final /* synthetic */ IgReactPackage A00;
    public final /* synthetic */ A44 A01;

    public A2Y(IgReactPackage igReactPackage, A44 a44) {
        this.A00 = igReactPackage;
        this.A01 = a44;
    }

    public final /* bridge */ /* synthetic */ Object get() {
        return new I18nManagerModule(this.A01);
    }
}
