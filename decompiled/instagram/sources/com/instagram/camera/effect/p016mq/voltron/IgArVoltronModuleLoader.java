package com.instagram.camera.effect.p016mq.voltron;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p000X.AnonymousClass000;
import p000X.Constants;
import p000X.AnonymousClass0C1;
import p000X.AnonymousClass8GM;
import p000X.AnonymousClass8GN;
import p000X.AnonymousClass8GW;
import p000X.AnonymousClass8GX;
import p000X.C06570Po;
import p000X.C191408Gc;
import p000X.C22270y8;
import p000X.C22470yU;
import p000X.C65862uW;
import p000X.C72353Ew;

/* renamed from: com.instagram.camera.effect.mq.voltron.IgArVoltronModuleLoader */
public class IgArVoltronModuleLoader implements C06570Po {
    public static final String CAFFE2_VOLTRON_MODULE_NAME = "caffe2";
    public static final String TAG = "IgArVoltronModuleLoader";
    public static IgArVoltronModuleLoader sInstance;
    public final Map mLoaderMap;
    public final AnonymousClass0C1 mUserSession;

    public synchronized C65862uW getModuleLoader(C22470yU r3) {
        C65862uW r1;
        r1 = (C65862uW) this.mLoaderMap.get(r3);
        if (r1 == null) {
            r1 = new C65862uW(r3, this.mUserSession);
            this.mLoaderMap.put(r3, r1);
        }
        return r1;
    }

    public void onUserSessionWillEnd(boolean z) {
    }

    public static synchronized IgArVoltronModuleLoader getInstance(AnonymousClass0C1 r2) {
        IgArVoltronModuleLoader igArVoltronModuleLoader;
        Class<IgArVoltronModuleLoader> cls = IgArVoltronModuleLoader.class;
        synchronized (cls) {
            igArVoltronModuleLoader = (IgArVoltronModuleLoader) r2.AVA(cls, new C72353Ew(r2));
            sInstance = igArVoltronModuleLoader;
        }
        return igArVoltronModuleLoader;
    }

    public static boolean shouldLoadCaffe2Libraries(C22470yU r2) {
        C22470yU r1 = C22470yU.CAFFE2;
        if (r2 == r1) {
            return true;
        }
        List list = r2.A00;
        if (list == null || !list.contains(r1)) {
            return false;
        }
        return true;
    }

    public void loadModule(String str, C191408Gc r7) {
        for (C22470yU r2 : C22470yU.values()) {
            if (r2.A01.equals(str)) {
                C65862uW moduleLoader = getModuleLoader(r2);
                AnonymousClass8GW r1 = new AnonymousClass8GW(this, r2, r7);
                synchronized (moduleLoader) {
                    moduleLoader.A02.add(r1);
                    if (moduleLoader.A03 == null) {
                        AnonymousClass8GM r3 = new AnonymousClass8GM(moduleLoader.A00);
                        r3.A03 = Constants.ONE;
                        r3.A02 = new AnonymousClass8GX(moduleLoader);
                        moduleLoader.A03 = new AnonymousClass8GN(r3);
                        C22270y8.A01().A04(moduleLoader.A01, moduleLoader.A03);
                    }
                }
                return;
            }
        }
        throw new IllegalArgumentException(AnonymousClass000.A0E("Invalid module name: ", str));
    }

    public IgArVoltronModuleLoader(AnonymousClass0C1 r2) {
        this.mLoaderMap = new HashMap();
        this.mUserSession = r2;
    }

    public /* synthetic */ IgArVoltronModuleLoader(AnonymousClass0C1 r1, C72353Ew r2) {
        this(r1);
    }
}
