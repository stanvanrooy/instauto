package p000X;

import android.media.AudioTrack;
import android.os.SystemClock;
import java.lang.reflect.Method;

/* renamed from: X.DII */
public final class DII {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public long A05;
    public long A06;
    public long A07;
    public long A08;
    public long A09;
    public long A0A;
    public long A0B;
    public long A0C;
    public long A0D;
    public long A0E;
    public long A0F;
    public long A0G;
    public AudioTrack A0H;
    public DIT A0I;
    public Method A0J;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;
    public final C29953DId A0N;
    public final long[] A0O;

    public static long A00(DII dii) {
        AudioTrack audioTrack = dii.A0H;
        D6U.A01(audioTrack);
        long j = dii.A0G;
        if (j != -9223372036854775807L) {
            return Math.min(dii.A06, dii.A0F + ((((SystemClock.elapsedRealtime() * 1000) - j) * ((long) dii.A03)) / 1000000));
        }
        int playState = audioTrack.getPlayState();
        if (playState == 1) {
            return 0;
        }
        long playbackHeadPosition = 4294967295L & ((long) audioTrack.getPlaybackHeadPosition());
        if (dii.A0M) {
            if (playState == 2 && playbackHeadPosition == 0) {
                dii.A0C = dii.A0A;
            }
            playbackHeadPosition += dii.A0C;
        }
        if (C25948Bd0.A00 <= 29) {
            if (playbackHeadPosition == 0) {
                long j2 = dii.A0A;
                if (j2 > 0 && playState == 3) {
                    if (dii.A07 == -9223372036854775807L) {
                        dii.A07 = SystemClock.elapsedRealtime();
                    }
                    return j2;
                }
            }
            dii.A07 = -9223372036854775807L;
        }
        if (dii.A0A > playbackHeadPosition) {
            dii.A0D++;
        }
        dii.A0A = playbackHeadPosition;
        return playbackHeadPosition + (dii.A0D << 32);
    }

    public DII(C29953DId dId) {
        D6U.A01(dId);
        this.A0N = dId;
        if (C25948Bd0.A00 >= 18) {
            try {
                this.A0J = AudioTrack.class.getMethod("getLatency", (Class[]) null);
            } catch (NoSuchMethodException unused) {
            }
        }
        this.A0O = new long[10];
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0021, code lost:
        if (A00(r5) != 0) goto L_0x0023;
     */
    public final boolean A01(long j) {
        boolean z;
        if (j <= A00(this)) {
            if (this.A0M) {
                AudioTrack audioTrack = this.A0H;
                D6U.A01(audioTrack);
                if (audioTrack.getPlayState() == 2) {
                    z = true;
                }
            }
            z = false;
            if (z) {
                return true;
            }
            return false;
        }
        return true;
    }
}
