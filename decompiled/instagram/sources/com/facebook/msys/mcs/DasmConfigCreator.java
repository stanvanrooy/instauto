package com.facebook.msys.mcs;

import com.facebook.simplejni.NativeHolder;

public abstract class DasmConfigCreator {
    public final NativeHolder mNativeHolder = initNativeHolder();

    public abstract NativeHolder initNativeHolder();
}
