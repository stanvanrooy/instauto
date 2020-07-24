package com.google.p013ar.core;

import android.content.Context;
import android.util.Log;
import java.util.HashMap;
import java.util.Map;
import p000X.B81;
import p000X.B9P;
import p000X.B9X;
import p000X.B9j;
import p000X.C25234B9f;
import p000X.C25235B9h;
import p000X.C25236B9i;
import p000X.C25237B9k;
import p000X.C30179DUa;

/* renamed from: com.google.ar.core.ArCoreApkJniAdapter */
public class ArCoreApkJniAdapter {

    /* renamed from: a */
    public static final Map f167a;

    static {
        HashMap hashMap = new HashMap();
        f167a = hashMap;
        hashMap.put(IllegalArgumentException.class, Integer.valueOf(B9P.ERROR_INVALID_ARGUMENT.A00));
        Map map = f167a;
        map.put(B9X.class, Integer.valueOf(B9P.ERROR_RESOURCE_EXHAUSTED.A00));
        map.put(B9j.class, Integer.valueOf(B9P.UNAVAILABLE_ARCORE_NOT_INSTALLED.A00));
        map.put(C25235B9h.class, Integer.valueOf(B9P.UNAVAILABLE_DEVICE_NOT_COMPATIBLE.A00));
        map.put(C25237B9k.class, Integer.valueOf(B9P.UNAVAILABLE_APK_TOO_OLD.A00));
        map.put(C25236B9i.class, Integer.valueOf(B9P.UNAVAILABLE_SDK_TOO_OLD.A00));
        map.put(C25234B9f.class, Integer.valueOf(B9P.UNAVAILABLE_USER_DECLINED_INSTALLATION.A00));
    }

    public static int checkAvailability(Context context) {
        try {
            return B81.A06.A02(context).A00;
        } catch (Throwable th) {
            Log.e("ARCore-ArCoreApkJniAdapter", "Exception details:", th);
            Class<?> cls = th.getClass();
            if (f167a.containsKey(cls)) {
                f167a.get(cls);
            }
            return C30179DUa.A06.A00;
        }
    }
}
