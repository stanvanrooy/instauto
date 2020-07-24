package p000X;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;

/* renamed from: X.DIJ */
public final class DIJ {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;
    public final DIV[] A0A;

    public DIJ(boolean z, int i, int i2, int i3, int i4, int i5, int i6, int i7, boolean z2, boolean z3, DIV[] divArr) {
        int i8;
        int i9 = i7;
        this.A08 = z;
        this.A01 = i;
        this.A02 = i2;
        this.A05 = i3;
        int i10 = i4;
        this.A06 = i10;
        int i11 = i5;
        this.A03 = i11;
        int i12 = i6;
        this.A04 = i12;
        if (i7 == 0) {
            if (z) {
                int minBufferSize = AudioTrack.getMinBufferSize(i10, i11, i12);
                D6U.A03(minBufferSize != -2);
                long j = (long) this.A06;
                int i13 = this.A05;
                i9 = Math.max(((int) ((250000 * j) / 1000000)) * i13, Math.min(minBufferSize << 2, (int) Math.max((long) minBufferSize, ((750000 * j) / 1000000) * ((long) i13))));
            } else {
                if (i12 != 5) {
                    if (i12 != 6) {
                        if (i12 == 7) {
                            i8 = 192000;
                        } else if (i12 == 8) {
                            i8 = 2250000;
                        } else if (i12 == 14) {
                            i8 = 3062500;
                        } else if (i12 == 17) {
                            i8 = 336000;
                        } else if (i12 != 18) {
                            throw new IllegalArgumentException();
                        }
                    }
                    i8 = 768000;
                } else {
                    i8 = 80000;
                }
                i9 = (int) ((((long) (i12 == 5 ? i8 << 1 : i8)) * 250000) / 1000000);
            }
        }
        this.A00 = i9;
        this.A09 = z2;
        this.A07 = z3;
        this.A0A = divArr;
    }

    public static AudioTrack A00(DIJ dij, boolean z, DIX dix, int i) {
        AudioAttributes audioAttributes;
        if (z) {
            audioAttributes = new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build();
        } else {
            if (dix.A00 == null) {
                AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(0).setFlags(0).setUsage(dix.A02);
                if (C25948Bd0.A00 >= 29) {
                    usage.setAllowedCapturePolicy(dix.A01);
                }
                dix.A00 = usage.build();
            }
            audioAttributes = dix.A00;
        }
        AudioFormat build = new AudioFormat.Builder().setChannelMask(dij.A03).setEncoding(dij.A04).setSampleRate(dij.A06).build();
        int i2 = dij.A00;
        int i3 = 0;
        if (i != 0) {
            i3 = i;
        }
        return new AudioTrack(audioAttributes, build, i2, 1, i3);
    }
}
