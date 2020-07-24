package p000X;

import android.webkit.WebResourceResponse;

/* renamed from: X.AQI */
public final class AQI implements Runnable {
    public final /* synthetic */ long A00;
    public final /* synthetic */ WebResourceResponse A01;
    public final /* synthetic */ C23564ARi A02;
    public final /* synthetic */ AQ8 A03;
    public final /* synthetic */ String A04;

    public AQI(C23564ARi aRi, AQ8 aq8, String str, WebResourceResponse webResourceResponse, long j) {
        this.A02 = aRi;
        this.A03 = aq8;
        this.A04 = str;
        this.A01 = webResourceResponse;
        this.A00 = j;
    }

    public final void run() {
        AQ8 aq8 = this.A03;
        String str = this.A04;
        boolean z = false;
        if (this.A01 != null) {
            z = true;
        }
        long j = this.A00;
        if (!aq8.A19()) {
            ATK.A03("FB tracking %s requested", str);
            char c = 65535;
            int hashCode = str.hashCode();
            if (hashCode != 3710) {
                if (hashCode != 98107086) {
                    if (hashCode != 1017223877) {
                        if (hashCode == 1457680597 && str.equals("fbevents")) {
                            c = 0;
                        }
                    } else if (str.equals("ga_collect")) {
                        c = 3;
                    }
                } else if (str.equals("ga_js")) {
                    c = 2;
                }
            } else if (str.equals("tr")) {
                c = 1;
            }
            if (c != 0) {
                if (c != 1) {
                    if (c != 2) {
                        if (c == 3 && aq8.A02 == -1) {
                            aq8.A02 = j;
                            aq8.A0E = z;
                        }
                    } else if (aq8.A03 == -1) {
                        aq8.A03 = j;
                        aq8.A0F = z;
                    }
                } else if (aq8.A08 == -1) {
                    aq8.A08 = j;
                    aq8.A0K = z;
                }
            } else if (aq8.A00 == -1) {
                aq8.A00 = j;
                aq8.A0J = z;
            }
        }
    }
}
