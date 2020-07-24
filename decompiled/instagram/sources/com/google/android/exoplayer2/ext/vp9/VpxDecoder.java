package com.google.android.exoplayer2.ext.vp9;

import android.os.SystemClock;
import com.google.android.exoplayer2.drm.ExoMediaCrypto;
import java.nio.ByteBuffer;
import p000X.AnonymousClass000;
import p000X.C25913Bc3;
import p000X.C29717D6d;
import p000X.C29718D6e;
import p000X.C29728D6s;
import p000X.C29739D7f;
import p000X.C29748D7u;
import p000X.D6U;
import p000X.D8I;
import p000X.D8o;

public final class VpxDecoder extends C29728D6s {
    public final long A00;
    public final ExoMediaCrypto A01;
    public volatile int A02;
    public volatile int A03;
    public volatile long A04;

    private native long vpxClose(long j);

    private native long vpxDecode(long j, ByteBuffer byteBuffer, int i);

    private native int vpxGetErrorCode(long j);

    private native String vpxGetErrorMessage(long j);

    private native int vpxGetFrame(long j, VpxOutputBuffer vpxOutputBuffer);

    private native long vpxInit(boolean z);

    private native long vpxSecureDecode(long j, ByteBuffer byteBuffer, int i, ExoMediaCrypto exoMediaCrypto, int i2, byte[] bArr, byte[] bArr2, int i3, int[] iArr, int[] iArr2);

    public VpxDecoder(ExoMediaCrypto exoMediaCrypto, boolean z) {
        super(new D8I[8], new VpxOutputBuffer[8]);
        if (VpxLibrary.A00()) {
            this.A01 = exoMediaCrypto;
            if (exoMediaCrypto == null || VpxLibrary.vpxIsSecureDecodeSupported()) {
                long vpxInit = vpxInit(z);
                this.A00 = vpxInit;
                if (vpxInit != 0) {
                    int i = this.A00;
                    D6U.A03(i == r2);
                    for (C29717D6d A042 : this.A0A) {
                        A042.A04(786432);
                    }
                    return;
                }
                throw new C29748D7u("Failed to initialize decoder");
            }
            throw new C29748D7u("Vpx decoder does not support secure decode.");
        }
        throw new C29748D7u("Failed to load decoder native libraries.");
    }

    public final /* bridge */ /* synthetic */ Exception A05(C29717D6d d6d, C29739D7f d7f, boolean z) {
        long vpxDecode;
        D8I d8i = (D8I) d6d;
        VpxOutputBuffer vpxOutputBuffer = (VpxOutputBuffer) d7f;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        ByteBuffer byteBuffer = d8i.A01;
        int limit = byteBuffer.limit();
        C29718D6e d6e = d8i.A03;
        boolean z2 = false;
        if ((d8i.A00 & C25913Bc3.MAX_SIGNED_POWER_OF_TWO) == 1073741824) {
            z2 = true;
        }
        if (z2) {
            long j = this.A00;
            long j2 = j;
            vpxDecode = vpxSecureDecode(j2, byteBuffer, limit, this.A01, d6e.A00, d6e.A03, d6e.A02, d6e.A01, d6e.A04, d6e.A05);
        } else {
            vpxDecode = vpxDecode(this.A00, byteBuffer, limit);
        }
        if (vpxDecode == 0) {
            if (!d8i.A01()) {
                long j3 = d8i.A00;
                int i = this.A02;
                vpxOutputBuffer.A01 = j3;
                vpxOutputBuffer.mode = i;
                int vpxGetFrame = vpxGetFrame(this.A00, vpxOutputBuffer);
                if (vpxGetFrame == 1) {
                    vpxOutputBuffer.A00 = Integer.MIN_VALUE | vpxOutputBuffer.A00;
                } else if (vpxGetFrame == -1) {
                    return new C29748D7u("Buffer initialization failed.");
                }
                vpxOutputBuffer.colorInfo = d8i.A00;
            }
            synchronized (this) {
                this.A04 += SystemClock.elapsedRealtime() - elapsedRealtime;
                this.A03++;
            }
            return null;
        } else if (vpxDecode != 2) {
            return new C29748D7u(AnonymousClass000.A0E("Decode error: ", vpxGetErrorMessage(this.A00)));
        } else {
            String A0E = AnonymousClass000.A0E("Drm error: ", vpxGetErrorMessage(this.A00));
            vpxGetErrorCode(this.A00);
            return new C29748D7u(A0E, new D8o(A0E));
        }
    }

    public final /* bridge */ /* synthetic */ void A08(C29739D7f d7f) {
        super.A08((VpxOutputBuffer) d7f);
    }

    public final void A09(VpxOutputBuffer vpxOutputBuffer) {
        super.A08(vpxOutputBuffer);
    }

    public final void release() {
        super.release();
        vpxClose(this.A00);
    }
}
