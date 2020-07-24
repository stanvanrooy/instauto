package com.facebook.jni;

import p000X.AnonymousClass0YD;
import p000X.C04720Fd;

public class HybridData {
    public Destructor mDestructor = new Destructor(this);

    public class Destructor extends C04720Fd {
        public volatile long mNativePointer;

        public static native void deleteNative(long j);

        public final void destruct() {
            deleteNative(this.mNativePointer);
            this.mNativePointer = 0;
        }

        public Destructor(Object obj) {
            super(obj);
        }
    }

    public synchronized void resetNative() {
        this.mDestructor.destruct();
    }

    static {
        AnonymousClass0YD.A01("fbjni");
    }
}
