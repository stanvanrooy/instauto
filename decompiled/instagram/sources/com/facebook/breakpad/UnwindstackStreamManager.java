package com.facebook.breakpad;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import p000X.AnonymousClass000;
import p000X.AnonymousClass0DB;
import p000X.AnonymousClass0Y1;
import p000X.AnonymousClass0Y2;

public class UnwindstackStreamManager {
    public static boolean isUnwindstackJniLoaded = true;

    public static native void nativeRegister(String str, String str2);

    public static native void nativeUnregister();

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00c2, code lost:
        if (r10.startsWith("/odm") != false) goto L_0x00c4;
     */
    public static boolean register() {
        boolean z;
        if (!isUnwindstackJniLoaded) {
            AnonymousClass0DB.A0D("UnwindstackStreamManager", "Loading unwindstack jni native library failed. Cannot register unwindstack stream to breakpad");
            return false;
        }
        try {
            String A03 = AnonymousClass0Y1.A03("libunwindstack_binary.so");
            if (A03 == null) {
                AnonymousClass0DB.A0D("UnwindstackStreamManager", "Unable to find libunwindstack_binary.so");
                return false;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add("libunwindstack_binary.so");
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(new File(A03).getParentFile().getCanonicalPath());
            for (int i = 0; i < arrayList.size(); i++) {
                String str = (String) arrayList.get(i);
                AnonymousClass0Y1.A06.readLock().lock();
                String[] strArr = null;
                if (AnonymousClass0Y1.A04 != null) {
                    int i2 = 0;
                    while (strArr == null) {
                        AnonymousClass0Y2[] r1 = AnonymousClass0Y1.A04;
                        if (i2 < r1.length) {
                            strArr = r1[i2].A08(str);
                            i2++;
                        }
                    }
                }
                AnonymousClass0Y1.A06.readLock().unlock();
                if (strArr == null) {
                    AnonymousClass0DB.A0E("UnwindstackStreamManager", AnonymousClass000.A0E("unable to find dependencies for ", (String) arrayList.get(i)));
                } else {
                    for (String str2 : strArr) {
                        String A032 = AnonymousClass0Y1.A03(str2);
                        if (A032 == null) {
                            AnonymousClass0DB.A0E("UnwindstackStreamManager", AnonymousClass000.A0E("unable to find path for ", str2));
                        } else if (!arrayList.contains(str2)) {
                            if (!A032.startsWith("/system") && !A032.startsWith("/vendor") && !A032.startsWith("/apex")) {
                                z = false;
                            }
                            z = true;
                            if (!z) {
                                arrayList.add(str2);
                                String canonicalPath = new File(A032).getParentFile().getCanonicalPath();
                                if (!arrayList2.contains(canonicalPath)) {
                                    arrayList2.add(canonicalPath);
                                }
                            }
                        }
                    }
                }
            }
            StringBuilder sb = new StringBuilder((String) arrayList2.get(0));
            for (int i3 = 1; i3 < arrayList2.size(); i3++) {
                sb.append(":");
                sb.append((String) arrayList2.get(i3));
            }
            nativeRegister(A03, sb.toString());
            return true;
        } catch (IOException e) {
            AnonymousClass0DB.A0G("UnwindstackStreamManager", "Error registering unwindstack stream", e);
            return false;
        } catch (Throwable th) {
            AnonymousClass0Y1.A06.readLock().unlock();
            throw th;
        }
    }

    static {
        try {
            AnonymousClass0Y1.A08("unwindstack_stream");
        } catch (UnsatisfiedLinkError e) {
            AnonymousClass0DB.A0G("UnwindstackStreamManager", "Failed to load unwindstack jni library: ", e);
        }
    }
}
