package com.instagram.debug.logdelegate;

import android.util.Log;
import p000X.AnonymousClass0CI;
import p000X.AnonymousClass0QD;
import p000X.C05400Kh;

public class IgLogImpl extends C05400Kh {
    public static final IgLogImpl sInstance = new IgLogImpl();

    public static AnonymousClass0CI getInstance() {
        return sInstance;
    }

    public void wtf(String str, String str2) {
        AnonymousClass0QD.A01(str, str2);
        Log.e(str, str2);
    }

    public void wtf(String str, String str2, Throwable th) {
        AnonymousClass0QD.A05(str, str2, th);
        Log.e(str, str2, th);
    }
}
