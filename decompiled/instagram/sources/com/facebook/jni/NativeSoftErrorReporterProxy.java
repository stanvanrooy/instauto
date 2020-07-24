package com.facebook.jni;

import java.util.LinkedList;
import p000X.AnonymousClass000;
import p000X.AnonymousClass0Bb;
import p000X.AnonymousClass0Bc;

public final class NativeSoftErrorReporterProxy {
    public static final LinkedList sSoftErrorCache = new LinkedList();

    public static native void generateNativeSoftError();

    public static void softReport(int i, String str, String str2, int i2) {
        softReport(i, str, str2, (Throwable) null, i2);
    }

    public static void softReport(int i, String str, String str2, Throwable th, int i2) {
        String str3;
        if (i != 1) {
            str3 = i != 2 ? "<level:unknown> " : "<level:mustfix> ";
        } else {
            str3 = "<level:warning> ";
        }
        String A0J = AnonymousClass000.A0J("[Native] ", str3, str);
        Class<NativeSoftErrorReporterProxy> cls = NativeSoftErrorReporterProxy.class;
        synchronized (cls) {
            LinkedList linkedList = sSoftErrorCache;
            synchronized (linkedList) {
                AnonymousClass0Bc A00 = AnonymousClass0Bb.A00(A0J, str2);
                A00.A03 = th;
                A00.A00 = i2;
                linkedList.addLast(new AnonymousClass0Bb(A00));
                while (linkedList.size() >= 50) {
                    linkedList.removeFirst();
                }
            }
        }
        synchronized (cls) {
        }
    }
}
