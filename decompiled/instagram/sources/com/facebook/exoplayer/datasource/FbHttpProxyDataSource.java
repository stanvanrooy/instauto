package com.facebook.exoplayer.datasource;

import android.net.Uri;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import p000X.C29258Cuk;
import p000X.C29262Cuo;
import p000X.C40431oe;
import p000X.C43711ux;
import p000X.D17;
import p000X.D19;
import p000X.D1B;
import p000X.D1M;
import p000X.D1P;

public final class FbHttpProxyDataSource implements D17 {
    public int A00;
    public int A01 = 0;
    public D19 A02;
    public D17 A03;
    public final C29262Cuo A04;

    public final synchronized void close() {
        this.A03.close();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001c, code lost:
        return r1;
     */
    public final synchronized int read(byte[] bArr, int i, int i2) {
        int i3 = this.A01;
        if (i3 == 0) {
            return -1;
        }
        if (i3 != -1) {
            i2 = Math.min(i2, i3);
        }
        int read = this.A03.read(bArr, i, i2);
        if (read != -1) {
            this.A01 -= read;
        }
    }

    public final Map AUX() {
        return this.A03.AUX();
    }

    public final synchronized long BWT(D1M d1m) {
        boolean z;
        long max;
        synchronized (this) {
            D1M d1m2 = d1m;
            Uri uri = d1m2.A04;
            D1P d1p = d1m2.A05;
            D1B d1b = d1p.A0B;
            if (d1b != null) {
                z = d1b.A00;
            } else {
                z = false;
            }
            D1B d1b2 = new D1B(z);
            D1M d1m3 = new D1M(uri, d1m2.A07, d1m2.A01, d1m2.A03, d1m2.A02, d1m2.A06, d1m2.A00, new D1P(d1p, this.A00, d1b2));
            try {
                D19 d19 = this.A02;
                if (d19 != null) {
                    d19.BSW(d1m3, C43711ux.NOT_CACHED);
                }
                long BWT = this.A03.BWT(d1m3);
                Map AUX = AUX();
                if (!(AUX == null || this.A02 == null)) {
                    List list = (List) AUX.get("X-FB-Connection-Quality");
                    if (list != null) {
                        this.A02.BSU("X-FB-Connection-Quality", (String) list.get(0));
                    }
                    List list2 = (List) AUX.get("x-fb-cec-video-limit");
                    if (list2 != null) {
                        this.A02.BSU("x-fb-cec-video-limit", (String) list2.get(0));
                    }
                    List list3 = (List) AUX.get("up-ttfb");
                    if (list3 != null) {
                        this.A02.BSU("up-ttfb", list3.get(0));
                    }
                    List list4 = (List) AUX.get("x-fb-log-session-id");
                    if (list4 != null) {
                        this.A02.BSU("x-fb-log-session-id", list4.get(0));
                    }
                    List list5 = (List) AUX.get("x-fb-log-transaction-id");
                    if (list5 != null) {
                        this.A02.BSU("x-fb-log-transaction-id", list5.get(0));
                    }
                    List list6 = (List) AUX.get("x-fb-response-time-ms");
                    if (list6 != null) {
                        this.A02.BSU("x-fb-response-time-ms", list6.get(0));
                    }
                }
                long A002 = C29258Cuk.A00(AUX);
                long j = d1m3.A03;
                max = Math.max(0, A002 - j);
                if (BWT == -1 || BWT > max) {
                    this.A01 = (int) max;
                } else {
                    this.A01 = (int) BWT;
                }
                C40431oe.A01("com.facebook.exoplayer.datasource.FbHttpProxyDataSource", "Opening data spec Offset: %d, Length %d Open Length %d Videoid %s Key %s", Long.valueOf(j), Long.valueOf(d1m3.A02), Long.valueOf(max), this.A04.A04, d1m3.A06);
                if (d1m3.A02 != -1) {
                    max = Math.min(BWT, max);
                }
            } catch (IOException e) {
                throw e;
            }
        }
        return max;
    }

    public final void BkD(String str, String str2) {
        if (str != null && str2 != null) {
            this.A03.BkD(str, str2);
        }
    }

    public FbHttpProxyDataSource(C29262Cuo cuo, D17 d17, int i, D19 d19) {
        this.A04 = cuo;
        this.A03 = d17;
        this.A00 = i;
        this.A02 = d19;
    }

    public final void A8J(int i) {
    }

    public final void cancel() {
    }
}
