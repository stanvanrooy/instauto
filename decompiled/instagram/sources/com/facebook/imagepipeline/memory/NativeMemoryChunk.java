package com.facebook.imagepipeline.memory;

import android.util.Log;
import java.io.Closeable;
import java.nio.ByteBuffer;
import p000X.AnonymousClass000;
import p000X.AnonymousClass0YD;
import p000X.C29391Cx4;
import p000X.C29394Cx8;
import p000X.C79543dc;

public class NativeMemoryChunk implements Closeable, C29391Cx4 {
    public boolean mIsClosed;
    public final long mNativePtr;
    public final int mSize;

    public static native long nativeAllocate(int i);

    public static native void nativeCopyFromByteArray(long j, byte[] bArr, int i, int i2);

    public static native void nativeCopyToByteArray(long j, byte[] bArr, int i, int i2);

    public static native void nativeFree(long j);

    public static native void nativeMemcpy(long j, long j2, int i);

    public static native byte nativeReadByte(long j);

    public synchronized void close() {
        if (!this.mIsClosed) {
            this.mIsClosed = true;
            nativeFree(this.mNativePtr);
        }
    }

    public ByteBuffer getByteBuffer() {
        return null;
    }

    public synchronized boolean isClosed() {
        return this.mIsClosed;
    }

    public synchronized int write(int i, byte[] bArr, int i2, int i3) {
        int min;
        C79543dc.A01(bArr);
        boolean z = false;
        if (!isClosed()) {
            z = true;
        }
        C79543dc.A04(z);
        int i4 = this.mSize;
        min = Math.min(Math.max(0, i4 - i), i3);
        C29394Cx8.A00(i, bArr.length, i2, min, i4);
        nativeCopyFromByteArray(this.mNativePtr + ((long) i), bArr, i2, min);
        return min;
    }

    static {
        AnonymousClass0YD.A01("imagepipeline");
    }

    private void doCopy(int i, C29391Cx4 cx4, int i2, int i3) {
        if (cx4 instanceof NativeMemoryChunk) {
            C79543dc.A04(!isClosed());
            C79543dc.A04(!cx4.isClosed());
            C29394Cx8.A00(i, cx4.getSize(), i2, i3, this.mSize);
            nativeMemcpy(cx4.getNativePtr() + ((long) i2), this.mNativePtr + ((long) i), i3);
            return;
        }
        throw new IllegalArgumentException("Cannot copy two incompatible MemoryChunks");
    }

    public void copy(int i, C29391Cx4 cx4, int i2, int i3) {
        C79543dc.A01(cx4);
        if (cx4.getUniqueId() == getUniqueId()) {
            Log.w("NativeMemoryChunk", AnonymousClass000.A0P("Copying from NativeMemoryChunk ", Integer.toHexString(System.identityHashCode(this)), " to NativeMemoryChunk ", Integer.toHexString(System.identityHashCode(cx4)), " which share the same address ", Long.toHexString(this.mNativePtr)));
            C79543dc.A03(false);
        }
        if (cx4.getUniqueId() < getUniqueId()) {
            synchronized (cx4) {
                try {
                    synchronized (this) {
                        doCopy(i, cx4, i2, i3);
                    }
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
            }
            return;
        }
        synchronized (this) {
            try {
                synchronized (cx4) {
                    doCopy(i, cx4, i2, i3);
                }
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        }
    }

    public void finalize() {
        if (!isClosed()) {
            Log.w("NativeMemoryChunk", AnonymousClass000.A0J("finalize: Chunk ", Integer.toHexString(System.identityHashCode(this)), " still active. "));
            try {
                close();
            } finally {
                super.finalize();
            }
        }
    }

    public long getNativePtr() {
        return this.mNativePtr;
    }

    public int getSize() {
        return this.mSize;
    }

    public long getUniqueId() {
        return this.mNativePtr;
    }

    public NativeMemoryChunk() {
        this.mSize = 0;
        this.mNativePtr = 0;
        this.mIsClosed = true;
    }

    public NativeMemoryChunk(int i) {
        C79543dc.A03(i > 0);
        this.mSize = i;
        this.mNativePtr = nativeAllocate(i);
        this.mIsClosed = false;
    }

    public synchronized byte read(int i) {
        boolean z = true;
        boolean z2 = false;
        if (!isClosed()) {
            z2 = true;
        }
        C79543dc.A04(z2);
        boolean z3 = false;
        if (i >= 0) {
            z3 = true;
        }
        C79543dc.A03(z3);
        if (i >= this.mSize) {
            z = false;
        }
        C79543dc.A03(z);
        return nativeReadByte(this.mNativePtr + ((long) i));
    }

    public synchronized int read(int i, byte[] bArr, int i2, int i3) {
        int min;
        C79543dc.A01(bArr);
        boolean z = false;
        if (!isClosed()) {
            z = true;
        }
        C79543dc.A04(z);
        int i4 = this.mSize;
        min = Math.min(Math.max(0, i4 - i), i3);
        C29394Cx8.A00(i, bArr.length, i2, min, i4);
        nativeCopyToByteArray(this.mNativePtr + ((long) i), bArr, i2, min);
        return min;
    }
}
