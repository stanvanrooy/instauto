package com.facebook.simplejni;

import p000X.AnonymousClass0Y1;
import p000X.C59792iF;

public class NativeHolder {
    public final Destructor mDestructor;
    public final long mNativePointer;

    public class Destructor extends C59792iF {
        public long mNativeDestructorFunctionPointer;
        public long mNativePointer;

        public static native void deleteNative(long j, long j2);

        public void destruct() {
            long j = this.mNativePointer;
            if (j != 0) {
                deleteNative(j, this.mNativeDestructorFunctionPointer);
                this.mNativePointer = 0;
            }
        }

        static {
            AnonymousClass0Y1.A08("simplejni");
        }

        public Destructor(Object obj, long j, long j2) {
            super(obj);
            this.mNativePointer = j;
            this.mNativeDestructorFunctionPointer = j2;
        }
    }

    static {
        AnonymousClass0Y1.A08("simplejni");
    }

    public NativeHolder(long j, long j2) {
        this.mNativePointer = j;
        this.mDestructor = new Destructor(this, j, j2);
    }
}
