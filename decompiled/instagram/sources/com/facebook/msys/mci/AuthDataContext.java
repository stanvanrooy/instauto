package com.facebook.msys.mci;

import com.facebook.simplejni.NativeHolder;
import p000X.C30187DUl;

public class AuthDataContext {
    public final NativeHolder mNativeHolder;

    public static native NativeHolder initNativeHolder(AuthData authData, Database database);

    public native boolean getIsValid();

    public native void invalidate();

    static {
        C30187DUl.A00();
    }
}
