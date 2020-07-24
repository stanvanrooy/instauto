package com.facebook.common.dextricks;

import android.util.Log;
import p000X.AnonymousClass000;

public final class Mlog {
    public static final String TAG = "DexLibLoader";
    public static final boolean VERBOSE = true;

    public static void assertThat(boolean z, String str, Object... objArr) {
        if (!z) {
            String safeFmt = safeFmt(str, objArr);
            Log.e(TAG, safeFmt);
            throw new AssertionError(AnonymousClass000.A0E("DexLibLoader: ", safeFmt));
        }
    }

    public static String safeFmt(String str, Object... objArr) {
        try {
            return String.format(str, objArr);
        } catch (Exception e) {
            return "[bad fmt: \"" + str + "\" (" + e + ")]";
        }
    }

    /* renamed from: d */
    public static void m27d(String str, Object... objArr) {
        safeFmt(str, objArr);
    }

    /* renamed from: d */
    public static void m28d(Throwable th, String str, Object... objArr) {
        safeFmt(str, objArr);
    }

    /* renamed from: e */
    public static void m29e(String str, Object... objArr) {
        Log.e(TAG, safeFmt(str, objArr));
    }

    /* renamed from: e */
    public static void m30e(Throwable th, String str, Object... objArr) {
        Log.e(TAG, safeFmt(str, objArr), th);
    }

    /* renamed from: i */
    public static void m31i(String str, Object... objArr) {
        safeFmt(str, objArr);
    }

    /* renamed from: i */
    public static void m32i(Throwable th, String str, Object... objArr) {
        safeFmt(str, objArr);
    }

    /* renamed from: v */
    public static void m33v(String str, Object... objArr) {
        safeFmt(str, objArr);
    }

    /* renamed from: v */
    public static void m34v(Throwable th, String str, Object... objArr) {
        safeFmt(str, objArr);
    }

    /* renamed from: w */
    public static void m35w(String str, Object... objArr) {
        Log.w(TAG, safeFmt(str, objArr));
    }

    /* renamed from: w */
    public static void m36w(Throwable th, String str, Object... objArr) {
        Log.w(TAG, safeFmt(str, objArr), th);
    }
}
