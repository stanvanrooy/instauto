package com.instagram.common.graphics;

import android.graphics.Bitmap;
import java.lang.ref.WeakReference;
import p000X.C253318j;

public final class IgBitmapReference {
    public WeakReference mBitmapWeakReference;
    public final long mNativeEntry;
    public boolean mReleased;

    public static native Bitmap nativeCreateBitmap(long j);

    public static native void nativeDestructor(long j);

    public static native void nativeMakeDiscardable(long j);

    public synchronized Bitmap getOrCreateBitmap() {
        Bitmap bitmap;
        if (!this.mReleased) {
            WeakReference weakReference = this.mBitmapWeakReference;
            if (weakReference == null) {
                bitmap = null;
            } else {
                bitmap = (Bitmap) weakReference.get();
            }
            if (bitmap == null) {
                bitmap = nativeCreateBitmap(this.mNativeEntry);
                if (C253318j.A01.size() > 450) {
                    System.gc();
                }
                C253318j.A01.add(new WeakReference(bitmap, C253318j.A00));
                if (bitmap != null) {
                    this.mBitmapWeakReference = new WeakReference(bitmap);
                }
            }
        } else {
            throw new IllegalStateException("Trying to use a bitmap reference that's already been released");
        }
        return bitmap;
    }

    public synchronized void makeDiscardable() {
        nativeMakeDiscardable(this.mNativeEntry);
    }

    public synchronized void release() {
        if (!this.mReleased) {
            this.mReleased = true;
            this.mBitmapWeakReference = null;
            nativeDestructor(this.mNativeEntry);
        } else {
            throw new IllegalStateException("Trying to release a bitmap reference that's already been released");
        }
    }

    public IgBitmapReference(long j) {
        this.mNativeEntry = j;
    }

    public void finalize() {
        try {
            super.finalize();
            if (this.mReleased) {
                return;
            }
        } catch (Throwable unused) {
            if (this.mReleased) {
                return;
            }
        }
        nativeDestructor(this.mNativeEntry);
    }
}
