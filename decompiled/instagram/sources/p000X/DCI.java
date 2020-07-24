package p000X;

import com.google.android.exoplayer2.Format;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.DCI */
public final class DCI {
    public int A00 = -1;
    public int A01 = 0;
    public int A02 = 0;
    public int A03 = 0;
    public int A04 = 0;
    public int A05;
    public int A06 = Integer.MAX_VALUE;
    public int A07 = Integer.MAX_VALUE;
    public int A08 = Integer.MAX_VALUE;
    public int A09 = Integer.MAX_VALUE;
    public int A0A = 0;
    public int A0B = 0;
    public int A0C = 0;
    public int A0D = 0;
    public int A0E = 0;
    public int A0F = 0;
    public int A0G = 0;
    public int A0H = 0;
    public int A0I = 0;
    public int A0J = 0;
    public int A0K = 0;
    public int A0L;
    public long A0M = 0;
    public long A0N = Long.MAX_VALUE;
    public long A0O;
    public long A0P = 0;
    public long A0Q = 0;
    public long A0R = 0;
    public long A0S = 0;
    public long A0T = 0;
    public D9W A0U = null;
    public DCL A0V;
    public Format A0W;
    public String A0X;
    public boolean A0Y;
    public final DCH A0Z;
    public final D29 A0a;
    public final BME A0b;
    public final String A0c;
    public final String A0d;
    public final AtomicInteger A0e;
    public final boolean A0f;
    public final boolean A0g;
    public final boolean A0h;

    public final synchronized void A00(DCL dcl, Format format, int i, int i2) {
        this.A0O = this.A0b.ACp();
        this.A0W = format;
        this.A0L = i;
        this.A05 = i2;
        this.A0V = dcl;
    }

    public DCI(String str, BME bme, D29 d29, int i, boolean z, boolean z2, boolean z3, String str2, boolean z4) {
        this.A0d = str;
        this.A0b = bme;
        this.A0a = d29;
        this.A0f = z;
        this.A0g = z2;
        this.A0h = z3;
        this.A0Z = new DCH(this, bme);
        this.A0e = new AtomicInteger(i);
        this.A0c = str2;
        this.A0Y = z4;
    }
}
