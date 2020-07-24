package com.facebook.msys.mci;

import android.util.Log;
import p000X.AnonymousClass000;
import p000X.AnonymousClass4HB;
import p000X.AnonymousClass920;
import p000X.C208928zC;

public class AuthDataStorage {
    public static native void nativeInitialize();

    public static void assertInitialized() {
        throw new RuntimeException("Settings have not been initialized yet. Call initialize() first");
    }

    static {
        C208928zC.A00();
    }

    public static Object get(AuthData authData, String str) {
        assertInitialized();
        AnonymousClass920.A00(authData);
        AnonymousClass920.A00(str);
        boolean z = false;
        if (authData.getFacebookUserID() != null) {
            z = true;
        }
        if (!z) {
            return null;
        }
        AnonymousClass000.A0J(authData.getFacebookUserID(), "-", str);
        assertInitialized();
        throw null;
    }

    public static Object getFromRawKey(String str) {
        assertInitialized();
        throw null;
    }

    public static void reset(AuthData authData) {
        assertInitialized();
        AnonymousClass920.A00(authData);
        boolean z = false;
        if (authData.getFacebookUserID() != null) {
            z = true;
        }
        if (z) {
            resetFromFacebookUserId(authData.getFacebookUserID());
        }
    }

    public static void resetFromFacebookUserId(String str) {
        assertInitialized();
        throw null;
    }

    public static void set(AuthData authData, String str, Object obj) {
        assertInitialized();
        AnonymousClass920.A00(authData);
        AnonymousClass920.A00(str);
        boolean z = false;
        if (authData.getFacebookUserID() != null) {
            z = true;
        }
        if (z) {
            setWithRawKey(AnonymousClass000.A0J(authData.getFacebookUserID(), "-", str), obj);
        }
    }

    public static void setWithRawKey(String str, Object obj) {
        assertInitialized();
        try {
            throw null;
        } catch (AnonymousClass4HB e) {
            Log.e("AuthDataStorage", AnonymousClass000.A0E("Error serializing object for key ", str), e);
        }
    }
}
