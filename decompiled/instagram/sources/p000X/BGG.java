package p000X;

import sun.misc.Unsafe;

/* renamed from: X.BGG */
public final class BGG {
    public static final long A0E;
    public static final Unsafe A0F;
    public volatile long A00;
    public volatile long A01;
    public volatile long A02;
    public volatile long A03;
    public volatile long A04;
    public volatile long A05;
    public volatile long A06;
    public volatile long A07;
    public volatile long A08;
    public volatile long A09;
    public volatile long A0A;
    public volatile long A0B;
    public volatile long A0C;
    public volatile long A0D;
    public volatile long value;

    public final boolean A00(long j, long j2) {
        return A0F.compareAndSwapLong(this, A0E, j, j2);
    }

    static {
        try {
            Unsafe A002 = BGE.A00();
            A0F = A002;
            A0E = A002.objectFieldOffset(BGG.class.getDeclaredField("value"));
        } catch (Exception e) {
            throw new Error(e);
        }
    }

    public BGG(long j) {
        this.value = j;
    }
}
