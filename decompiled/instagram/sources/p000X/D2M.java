package p000X;

import android.os.SystemClock;
import android.util.Pair;
import com.facebook.video.heroplayer.setting.HeroPlayerSetting;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.D2M */
public final class D2M {
    public static final HashMap A09 = new HashMap();
    public static final int[] A0A;
    public long A00;
    public boolean A01;
    public final long A02;
    public final C29603D1i A03;
    public final List A04;
    public final boolean A05;
    public final D3P[] A06;
    public final D4Q A07;
    public final List A08;

    public final synchronized int A02() {
        return A00(this, 2);
    }

    static {
        int[] iArr = new int[17];
        A0A = iArr;
        iArr[0] = 8000;
        iArr[1] = 8000;
        iArr[2] = 3;
        iArr[3] = 0;
        iArr[4] = 0;
        iArr[5] = 500;
        iArr[6] = 2000;
        iArr[7] = 500;
        iArr[8] = 2000;
        iArr[9] = 500;
        iArr[10] = 2000;
        iArr[11] = 8000;
        iArr[12] = 500;
        iArr[13] = 15000;
        iArr[14] = 30000;
        iArr[15] = 15000;
        iArr[16] = 30000;
    }

    public static int A00(D2M d2m, int i) {
        C29603D1i d1i;
        long j;
        D37 d37;
        int i2;
        if (d2m.A06[i] == null) {
            return A0A[i];
        }
        if (d2m.A01 && (d1i = d2m.A03) != null) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (elapsedRealtime - d2m.A00 > d2m.A02) {
                if (d2m.A05) {
                    C25945Bcx A002 = C25945Bcx.A00();
                    synchronized (A002) {
                        j = A002.A01;
                    }
                } else {
                    j = d1i.AGf().A06;
                }
                if (j < 0) {
                    j = d2m.A03.AGm().A06;
                }
                List list = d2m.A04;
                if (j >= 0) {
                    Iterator it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            d37 = D37.EXCELLENT;
                            break;
                        }
                        Pair pair = (Pair) it.next();
                        if (j < ((long) ((Integer) pair.second).intValue())) {
                            d37 = (D37) pair.first;
                            break;
                        }
                    }
                } else {
                    d37 = D37.A06;
                }
                for (int i3 = 0; i3 < 17; i3++) {
                    D3P d3p = d2m.A06[i3];
                    if (!(d3p == null || d37 == null)) {
                        C40111o6 r1 = d3p.A01;
                        if (r1.A06) {
                            switch (d37.ordinal()) {
                                case 0:
                                    i2 = r1.A01;
                                    break;
                                case 1:
                                    i2 = r1.A05;
                                    break;
                                case 2:
                                    i2 = r1.A04;
                                    break;
                                case 3:
                                    i2 = r1.A03;
                                    break;
                                case 4:
                                    i2 = r1.A02;
                                    break;
                                default:
                                    i2 = r1.A00;
                                    break;
                            }
                            d3p.A00 = i2;
                        }
                    }
                }
                d2m.A00 = elapsedRealtime;
            }
        }
        return d2m.A06[i].A00;
    }

    public static D3P A01(C40111o6 r1) {
        if (r1 != null) {
            return new D3P(r1);
        }
        return null;
    }

    public D2M() {
        this(HeroPlayerSetting.A1t, (C29603D1i) null, (D4Q) null);
    }

    public D2M(HeroPlayerSetting heroPlayerSetting, C29603D1i d1i, D4Q d4q) {
        this.A06 = new D3P[17];
        int i = 0;
        this.A01 = false;
        this.A05 = heroPlayerSetting.A1h;
        D37 d37 = D37.DEGRADED;
        C40111o6 r8 = heroPlayerSetting.A0L;
        this.A08 = Collections.unmodifiableList(Arrays.asList(new Pair[]{new Pair(d37, Integer.valueOf(r8.A01)), new Pair(D37.POOR, Integer.valueOf(r8.A05)), new Pair(D37.MODERATE, Integer.valueOf(r8.A04)), new Pair(D37.GOOD, Integer.valueOf(r8.A03))}));
        D37 d372 = D37.DEGRADED;
        C40111o6 r82 = heroPlayerSetting.A0Q;
        this.A04 = Collections.unmodifiableList(Arrays.asList(new Pair[]{new Pair(d372, Integer.valueOf(r82.A01)), new Pair(D37.POOR, Integer.valueOf(r82.A05)), new Pair(D37.MODERATE, Integer.valueOf(r82.A04)), new Pair(D37.GOOD, Integer.valueOf(r82.A03))}));
        D3P[] d3pArr = this.A06;
        d3pArr[0] = A01((C40111o6) null);
        d3pArr[1] = A01((C40111o6) null);
        d3pArr[2] = A01((C40111o6) null);
        d3pArr[3] = A01((C40111o6) null);
        d3pArr[4] = A01((C40111o6) null);
        d3pArr[5] = A01(heroPlayerSetting.A0O);
        d3pArr[6] = A01(heroPlayerSetting.A0P);
        d3pArr[7] = A01(heroPlayerSetting.A0M);
        d3pArr[8] = A01(heroPlayerSetting.A0N);
        d3pArr[9] = A01((C40111o6) null);
        d3pArr[10] = A01((C40111o6) null);
        d3pArr[11] = A01((C40111o6) null);
        d3pArr[12] = A01((C40111o6) null);
        d3pArr[13] = A01((C40111o6) null);
        d3pArr[14] = A01((C40111o6) null);
        d3pArr[15] = A01((C40111o6) null);
        d3pArr[16] = A01((C40111o6) null);
        while (true) {
            if (i >= 17) {
                break;
            } else if (d3pArr[i] != null) {
                this.A01 = true;
                break;
            } else {
                i++;
            }
        }
        this.A03 = d1i;
        this.A02 = 2000;
        this.A07 = d4q;
    }
}
