package com.facebook.msys.mci;

import com.facebook.simplejni.NativeHolder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import p000X.AnonymousClass000;
import p000X.C208928zC;
import p000X.C208978zJ;
import p000X.C90533w4;

public class NotificationCenter {
    public final Set mMainConfig = new HashSet();
    public final NativeHolder mNativeHolder = initNativeHolder();
    public final Map mNativeScopeToJavaScope = new HashMap();
    public final Map mObserverConfigs = new HashMap();

    public interface NotificationCallback {
        void onNewNotification(String str, Object obj, Map map);
    }

    private native void addObserverNative(String str);

    private void dispatchNotificationToCallbacks(String str, Long l, Object obj) {
        String str2;
        boolean z;
        Object obj2 = obj;
        if (obj == null || (obj instanceof Map)) {
            Map map = (Map) obj2;
            ArrayList arrayList = new ArrayList();
            Object obj3 = null;
            synchronized (this) {
                if (l != null) {
                    obj3 = this.mNativeScopeToJavaScope.get(l);
                }
                Iterator it = this.mObserverConfigs.entrySet().iterator();
                while (true) {
                    str2 = str;
                    if (!it.hasNext()) {
                        break;
                    }
                    Map.Entry entry = (Map.Entry) it.next();
                    C90533w4 r1 = (C90533w4) entry.getValue();
                    if (r1.A01.contains(str)) {
                        z = true;
                    } else {
                        Set set = (Set) r1.A00.get(obj3);
                        if (set == null) {
                            z = false;
                        } else {
                            z = set.contains(str);
                        }
                    }
                    if (z) {
                        arrayList.add(entry.getKey());
                    }
                }
            }
            if (!arrayList.isEmpty()) {
                Execution.executePossiblySync(new C208978zJ(this, arrayList, str2, obj3, map), 1);
                return;
            }
            return;
        }
        throw new RuntimeException(AnonymousClass000.A0E("Native layer of msys reported a notification whose payload could not be serialized into a Java Map. Instead, it's of type ", obj.getClass().getName()));
    }

    private native NativeHolder initNativeHolder();

    private native void removeObserverNative(String str);

    static {
        C208928zC.A00();
    }
}
