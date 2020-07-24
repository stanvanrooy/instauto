package p000X;

import com.facebook.react.modules.storage.AsyncStorageModule;
import com.instagram.react.impl.IgReactPackage;

/* renamed from: X.A2V */
public final class A2V implements AnonymousClass0IT {
    public final /* synthetic */ IgReactPackage A00;
    public final /* synthetic */ A44 A01;

    public A2V(IgReactPackage igReactPackage, A44 a44) {
        this.A00 = igReactPackage;
        this.A01 = a44;
    }

    public final /* bridge */ /* synthetic */ Object get() {
        return new AsyncStorageModule(this.A01);
    }
}
