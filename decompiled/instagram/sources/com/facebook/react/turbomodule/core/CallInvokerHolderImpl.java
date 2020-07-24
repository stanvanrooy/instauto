package com.facebook.react.turbomodule.core;

import com.facebook.jni.HybridData;
import p000X.AnonymousClass0Y1;

public class CallInvokerHolderImpl {
    public static volatile boolean sIsSoLibraryLoaded;
    public final HybridData mHybridData;

    public CallInvokerHolderImpl(HybridData hybridData) {
        synchronized (CallInvokerHolderImpl.class) {
            if (!sIsSoLibraryLoaded) {
                AnonymousClass0Y1.A08("turbomodulejsijni");
                sIsSoLibraryLoaded = true;
            }
        }
        this.mHybridData = hybridData;
    }
}
