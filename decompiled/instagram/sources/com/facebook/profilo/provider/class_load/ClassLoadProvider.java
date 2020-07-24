package com.facebook.profilo.provider.class_load;

import android.util.Log;
import com.facebook.profilo.core.ProvidersRegistry;
import com.facebook.profilo.core.TraceEvents;
import java.util.ArrayList;
import java.util.Iterator;
import p000X.AnonymousClass0GW;
import p000X.AnonymousClass0Z0;
import p000X.C04200Cy;
import p000X.C04210Cz;
import p000X.C09670bn;

public final class ClassLoadProvider extends AnonymousClass0GW {
    public static final int A01 = ProvidersRegistry.A00.A02("class_load");
    public C04210Cz A00 = new C09670bn();

    public ClassLoadProvider() {
        super((String) null);
    }

    public final int getSupportedProviders() {
        return A01;
    }

    public final void disable() {
        int A03 = AnonymousClass0Z0.A03(-1042262447);
        C04200Cy A002 = C04200Cy.A00();
        if (A002 != null) {
            C04210Cz r3 = this.A00;
            synchronized (A002) {
                ArrayList arrayList = new ArrayList(((ArrayList) A002.A03.get()).size() - 1);
                Iterator it = ((ArrayList) A002.A03.get()).iterator();
                while (it.hasNext()) {
                    C04210Cz r0 = (C04210Cz) it.next();
                    if (r0 != r3) {
                        arrayList.add(r0);
                    }
                }
                A002.A03.set(arrayList);
                if (((ArrayList) A002.A03.get()).isEmpty()) {
                    if (!A002.A00.toString().startsWith("dalvik.system.PathClassLoader") || !(A002.A00.getParent() instanceof C04200Cy)) {
                        Log.w("PluginClassLoader", "Non-standard class loader chain. PluginClassLoader will not be uninstalled");
                    } else {
                        try {
                            A002.A02.set(A002.A00, A002.A01);
                            A002.A04 = false;
                            Log.w("PluginClassLoader", "Uninstalled PluginClassLoader");
                        } catch (IllegalAccessException unused) {
                            Log.w("PluginClassLoader", "Failed to uninstall PluginClassLoader");
                        }
                    }
                }
            }
        }
        AnonymousClass0Z0.A0A(-1174448314, A03);
    }

    public final void enable() {
        int A03 = AnonymousClass0Z0.A03(849025068);
        C04200Cy A002 = C04200Cy.A00();
        if (A002 != null) {
            A002.A01(this.A00);
        }
        AnonymousClass0Z0.A0A(-1867853427, A03);
    }

    public final int getTracingProviders() {
        boolean z;
        C04200Cy A002 = C04200Cy.A00();
        if (!TraceEvents.isEnabled(A01) || A002 == null) {
            return 0;
        }
        synchronized (A002) {
            z = A002.A04;
        }
        if (z) {
            return A01;
        }
        return 0;
    }
}
