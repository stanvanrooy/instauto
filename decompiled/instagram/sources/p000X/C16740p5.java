package p000X;

import android.net.ConnectivityManager;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.0p5  reason: invalid class name and case insensitive filesystem */
public final class C16740p5 implements C14250k8 {
    public ConnectivityManager A00;
    public final int A01;
    public final AnonymousClass0a7 A02;
    public final C14250k8 A03;
    public final C15190mU A04 = new C16750p6(this);
    public final AtomicInteger A05;
    public final boolean A06;

    public void setResponseCounter(C33851db r7) {
        AnonymousClass0a7 r5;
        Integer num;
        if (r7.A02("X-IG-Deployment-Stage")) {
            this.A05.set(0);
            r5 = this.A02;
            num = Constants.ZERO;
        } else if (this.A05.intValue() < this.A01 && this.A05.incrementAndGet() >= this.A01) {
            r5 = this.A02;
            num = Constants.ONE;
        } else {
            return;
        }
        synchronized (r5) {
            if (r5.A01 != num) {
                r5.A01 = num;
                if (r5.A00 != null) {
                    String A002 = AnonymousClass0a6.A00(num);
                    synchronized (AnonymousClass09Q.A0X) {
                        try {
                            if (C04330Dn.A02 == null) {
                                AnonymousClass0DB.A0E("AppStateLoggerCore", "AppStateLogger is not ready yet");
                            } else {
                                C04290Dj AG4 = C04330Dn.A02.AG4();
                                synchronized (AG4.A00) {
                                    try {
                                        AG4.A00.put("deployment_stage", A002);
                                    } catch (Throwable th) {
                                        th = th;
                                        throw th;
                                    }
                                }
                            }
                        } catch (Throwable th2) {
                            while (true) {
                                th = th2;
                            }
                            throw th;
                        }
                    }
                }
            }
        }
        return;
    }

    public final C26211Cc startRequest(AnonymousClass1C4 r3, C256019m r4, AnonymousClass1CB r5) {
        if (AnonymousClass1C2.A00(r3.A04.getHost())) {
            if (this.A00 == null) {
                this.A00 = (ConnectivityManager) StoredPreferences.A00.getSystemService("connectivity");
            }
            r3.A01("X-IG-Connection-Type", AnonymousClass0NT.A06(this.A00.getActiveNetworkInfo()));
            r3.A01("X-IG-Capabilities", "3brTvw8=");
            r3.A01("X-IG-App-ID", "567067343352427");
            if (this.A06) {
                r5.A04(this.A04);
            }
        }
        return this.A03.startRequest(r3, r4, r5);
    }

    public C16740p5(C14250k8 r3, boolean z, AnonymousClass0a7 r5) {
        this.A03 = r3;
        this.A06 = z;
        this.A02 = r5;
        this.A01 = 10;
        this.A05 = new AtomicInteger(10);
    }
}
