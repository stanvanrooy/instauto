package com.facebook.analytics.appstatelogger;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import p000X.AnonymousClass04W;
import p000X.AnonymousClass09Q;
import p000X.AnonymousClass0DB;

public class EarlyActivityTransitionMonitor {
    public static final Set sListeners = new HashSet();

    public static native void start(boolean z, boolean z2);

    public static void onPendingLaunch(int i) {
        synchronized (AnonymousClass09Q.A0X) {
            try {
                if (AnonymousClass09Q.A0W == null) {
                    AnonymousClass0DB.A0E("AppStateLoggerCore", "AppStateLogger is not ready yet");
                } else {
                    AnonymousClass09Q r2 = AnonymousClass09Q.A0W;
                    AnonymousClass09Q.A06(r2, r2.A0G, AnonymousClass04W.IN_FOREGROUND);
                }
            } catch (Throwable th) {
                while (true) {
                    th = th;
                }
            }
        }
        HashSet hashSet = new HashSet();
        Set set = sListeners;
        synchronized (set) {
            try {
                hashSet.addAll(set);
            } catch (Throwable th2) {
                while (true) {
                    th = th2;
                    break;
                }
            }
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            it.next();
        }
        return;
        throw th;
    }

    public static void onPendingStop(int i) {
        int size;
        int i2;
        synchronized (AnonymousClass09Q.A0X) {
            try {
                if (AnonymousClass09Q.A0W == null) {
                    AnonymousClass0DB.A0E("AppStateLoggerCore", "AppStateLogger is not ready yet");
                } else {
                    AnonymousClass09Q r3 = AnonymousClass09Q.A0W;
                    synchronized (r3.A0J) {
                        try {
                            r3.A0J.offer(Integer.valueOf(i));
                            size = r3.A0J.size();
                            if (size > 0) {
                                i2 = ((Integer) r3.A0J.peek()).intValue();
                            } else {
                                i2 = 0;
                            }
                        } catch (Throwable th) {
                            while (true) {
                                th = th;
                                break;
                            }
                        }
                    }
                    AnonymousClass09Q.A05(r3, size, i2);
                }
            } catch (Throwable th2) {
                while (true) {
                    th = th2;
                }
            }
        }
        HashSet hashSet = new HashSet();
        Set set = sListeners;
        synchronized (set) {
            try {
                hashSet.addAll(set);
            } catch (Throwable th3) {
                while (true) {
                    th = th3;
                    break;
                }
            }
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            it.next();
        }
        return;
        throw th;
    }
}
