package com.facebook.errorreporting.lacrima.common.mappedfile.mlocked;

import java.io.File;
import java.nio.ByteBuffer;
import p000X.AnonymousClass0P7;

public class MLockedFile extends AnonymousClass0P7 {
    public static volatile boolean sLibraryLoaded;

    public static native void mlockBuffer(ByteBuffer byteBuffer);

    public static native void munlockBuffer(ByteBuffer byteBuffer);

    public MLockedFile(File file, int i) {
        super(file);
        mlockBuffer();
    }

    public void mlockBuffer() {
        if (sLibraryLoaded) {
            mlockBuffer(this.A01);
        }
    }
}
