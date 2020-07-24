package com.google.android.exoplayer2.ext.vp9;

import com.google.android.exoplayer2.video.ColorInfo;
import java.nio.ByteBuffer;
import p000X.C29739D7f;

public final class VpxOutputBuffer extends C29739D7f {
    public ColorInfo colorInfo;
    public int colorspace;
    public ByteBuffer data;
    public int height;
    public int mode;
    public final VpxDecoder owner;
    public int width;
    public ByteBuffer[] yuvPlanes;
    public int[] yuvStrides;

    private void initData(int i) {
        ByteBuffer byteBuffer = this.data;
        if (byteBuffer == null || byteBuffer.capacity() < i) {
            this.data = ByteBuffer.allocateDirect(i);
            return;
        }
        this.data.position(0);
        this.data.limit(i);
    }

    private boolean isSafeToMultiply(int i, int i2) {
        if (i < 0 || i2 < 0) {
            return false;
        }
        if (i2 <= 0 || i < Integer.MAX_VALUE / i2) {
            return true;
        }
        return false;
    }

    public boolean initForRgbFrame(int i, int i2) {
        this.width = i;
        this.height = i2;
        this.yuvPlanes = null;
        if (!isSafeToMultiply(i, i2)) {
            return false;
        }
        int i3 = i * i2;
        if (!isSafeToMultiply(i3, 2)) {
            return false;
        }
        initData(i3 << 1);
        return true;
    }

    public boolean initForYuvFrame(int i, int i2, int i3, int i4, int i5) {
        this.width = i;
        this.height = i2;
        this.colorspace = i5;
        int i6 = (int) ((((long) i2) + 1) / 2);
        if (isSafeToMultiply(i3, i2) && isSafeToMultiply(i4, i6)) {
            int i7 = i2 * i3;
            int i8 = i6 * i4;
            int i9 = (i8 << 1) + i7;
            if (isSafeToMultiply(i8, 2) && i9 >= i7) {
                initData(i9);
                if (this.yuvPlanes == null) {
                    this.yuvPlanes = new ByteBuffer[3];
                }
                this.yuvPlanes[0] = this.data.slice();
                this.yuvPlanes[0].limit(i7);
                this.data.position(i7);
                this.yuvPlanes[1] = this.data.slice();
                this.yuvPlanes[1].limit(i8);
                this.data.position(i7 + i8);
                this.yuvPlanes[2] = this.data.slice();
                this.yuvPlanes[2].limit(i8);
                if (this.yuvStrides == null) {
                    this.yuvStrides = new int[3];
                }
                int[] iArr = this.yuvStrides;
                iArr[0] = i3;
                iArr[1] = i4;
                iArr[2] = i4;
                return true;
            }
        }
        return false;
    }

    public void release() {
        this.owner.A09(this);
    }

    public VpxOutputBuffer(VpxDecoder vpxDecoder) {
        this.owner = vpxDecoder;
    }
}
