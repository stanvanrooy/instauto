package p000X;

import com.facebook.react.bridge.CatalystInstanceImpl;
import com.facebook.react.bridge.Systrace;
import java.lang.ref.WeakReference;

/* renamed from: X.A4Q */
public final class A4Q implements AnonymousClass0Yw {
    public final WeakReference A00;

    public final void BSH() {
        CatalystInstanceImpl catalystInstanceImpl = (CatalystInstanceImpl) this.A00.get();
        if (catalystInstanceImpl != null) {
            ((Systrace) catalystInstanceImpl.getJSModule(Systrace.class)).setEnabled(true);
        }
    }

    public final void BSJ() {
        CatalystInstanceImpl catalystInstanceImpl = (CatalystInstanceImpl) this.A00.get();
        if (catalystInstanceImpl != null) {
            ((Systrace) catalystInstanceImpl.getJSModule(Systrace.class)).setEnabled(false);
        }
    }

    public A4Q(CatalystInstanceImpl catalystInstanceImpl) {
        this.A00 = new WeakReference(catalystInstanceImpl);
    }
}
