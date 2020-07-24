package com.facebook.xplat.fbglog;

import p000X.AnonymousClass0DB;
import p000X.AnonymousClass0DC;
import p000X.AnonymousClass0YD;
import p000X.C09460bS;

public class FbGlog {
    public static AnonymousClass0DC sCallback;

    public static native void setLogLevel(int i);

    static {
        AnonymousClass0YD.A01("fb");
    }

    public static synchronized void ensureSubscribedToBLogLevelChanges() {
        synchronized (FbGlog.class) {
            if (sCallback == null) {
                C09460bS r0 = new C09460bS();
                sCallback = r0;
                AnonymousClass0DB.A02(r0);
                setLogLevel(AnonymousClass0DB.A01.getMinimumLoggingLevel());
            }
        }
    }
}
