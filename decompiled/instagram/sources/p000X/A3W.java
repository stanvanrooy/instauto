package p000X;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import com.facebook.react.bridge.CatalystInstance;
import com.facebook.react.bridge.ReactSoftException;
import com.facebook.react.uimanager.UIManagerModule;

/* renamed from: X.A3W */
public final class A3W {
    public static A9C A02(A3N a3n, int i) {
        int i2 = 1;
        if (i % 2 == 0) {
            i2 = 2;
        }
        if (a3n.A09()) {
            if (a3n instanceof C23053A3d) {
                a3n = ((C23053A3d) a3n).A00;
            }
            return ((C23074A4s) a3n).getEventDispatcher();
        }
        A3o A01 = A01(a3n, i2, false);
        if (A01 == null) {
            return null;
        }
        return (A9C) A01.getEventDispatcher();
    }

    public static A3o A01(A3N a3n, int i, boolean z) {
        boolean z2 = false;
        if (a3n.A00 != null) {
            z2 = true;
        }
        if (!z2) {
            ReactSoftException.logSoftException("UIManagerHelper", new A0P("Cannot get UIManager because the context doesn't contain a CatalystInstance."));
            return null;
        }
        if (!a3n.A0A()) {
            ReactSoftException.logSoftException("UIManagerHelper", new A0P("Cannot get UIManager because the context doesn't contain an active CatalystInstance."));
            if (z) {
                return null;
            }
        }
        CatalystInstance catalystInstance = a3n.A00;
        AnonymousClass0FY.A00(catalystInstance);
        if (i == 2) {
            return (A3o) catalystInstance.getJSIModule(C23061A3s.UIManager);
        }
        return (A3o) catalystInstance.getNativeModule(UIManagerModule.class);
    }

    public static A3N A00(View view) {
        Context context = view.getContext();
        if (!(context instanceof A3N) && (context instanceof ContextWrapper)) {
            context = ((ContextWrapper) context).getBaseContext();
        }
        return (A3N) context;
    }
}
