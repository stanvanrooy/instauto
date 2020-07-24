package com.instagram.util.jpeg;

import p000X.AnonymousClass0a4;

public class NativeImage {
    public int mBufferId;
    public long mBufferPtr;
    public int mHeight;
    public int mWidth;

    public void assertDimensions(int i, int i2) {
        boolean z = true;
        boolean z2 = false;
        if (this.mWidth == i) {
            z2 = true;
        }
        AnonymousClass0a4.A09(z2);
        if (this.mHeight != i2) {
            z = false;
        }
        AnonymousClass0a4.A09(z);
    }

    public int getBufferId() {
        return this.mBufferId;
    }

    public long getBufferPtr() {
        return this.mBufferPtr;
    }

    public int getHeight() {
        return this.mHeight;
    }

    public int getWidth() {
        return this.mWidth;
    }

    public NativeImage(int i, int i2, int i3) {
        this(i, i2, i3, 0);
    }

    public NativeImage(int i, int i2, int i3, long j) {
        this.mBufferId = i;
        this.mWidth = i2;
        this.mHeight = i3;
        this.mBufferPtr = j;
    }
}
