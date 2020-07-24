package p000X;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;

/* renamed from: X.02u  reason: invalid class name and case insensitive filesystem */
public final class C025502u extends C035407j {
    public int A00;
    public long A01;
    public long A02;
    public long A03;
    public final AnonymousClass00N A04 = new AnonymousClass00N();
    public final ArrayList A05 = new ArrayList();
    public final WeakHashMap A06 = new WeakHashMap();

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004d, code lost:
        if (r0 != false) goto L_0x004f;
     */
    public static synchronized void A00(C025502u r15) {
        boolean z;
        boolean z2;
        boolean z3;
        long j;
        long j2;
        synchronized (r15) {
            int i = 0;
            long j3 = -1;
            Iterator it = r15.A05.iterator();
            while (it.hasNext()) {
                C036907z r11 = (C036907z) it.next();
                long uptimeMillis = SystemClock.uptimeMillis();
                long j4 = r11.A04;
                if (uptimeMillis >= j4) {
                    z = C036907z.A00(r11, j4);
                } else {
                    z = false;
                }
                if (!r11.A05 || r11.A08.get() != null) {
                    z2 = false;
                } else {
                    C035607l.A00("WakeLockMetricsCollector", AnonymousClass000.A0J("The wakelock ", r11.A07, " was garbage collected before being released."), (Throwable) null);
                    z2 = C036907z.A00(r11, SystemClock.uptimeMillis());
                }
                if (!z) {
                    z3 = false;
                }
                z3 = true;
                if (r11.A05) {
                    i++;
                } else if (z3) {
                    long j5 = r11.A03;
                    if (j5 > j3) {
                        j3 = j5;
                    }
                }
                if (r11.A08.get() == null) {
                    Long l = (Long) r15.A04.get(r11.A07);
                    AnonymousClass00N r10 = r15.A04;
                    String str = r11.A07;
                    if (l == null) {
                        j = 0;
                    } else {
                        j = l.longValue();
                    }
                    long j6 = r11.A02;
                    if (r11.A05) {
                        j2 = SystemClock.uptimeMillis() - r11.A01;
                    } else {
                        j2 = 0;
                    }
                    r10.put(str, Long.valueOf(j + j6 + j2));
                    it.remove();
                }
            }
            if (r15.A00 != 0 && i == 0) {
                r15.A03 += j3 - r15.A02;
            }
            r15.A00 = i;
        }
    }

    public final /* bridge */ /* synthetic */ C035307i A03() {
        AnonymousClass01c r1;
        synchronized (this) {
            r1 = new AnonymousClass01c(false);
        }
        return r1;
    }

    public final /* bridge */ /* synthetic */ boolean A04(C035307i r13) {
        long j;
        long j2;
        long j3;
        long j4;
        AnonymousClass01c r132 = (AnonymousClass01c) r13;
        synchronized (this) {
            C035707m.A00(r132);
            A00(this);
            r132.A00 = this.A01;
            long j5 = this.A03;
            if (this.A00 > 0) {
                j = SystemClock.uptimeMillis() - this.A02;
            } else {
                j = 0;
            }
            r132.A01 = j5 + j;
            if (r132.A02) {
                r132.A03.clear();
                int size = this.A05.size();
                for (int i = 0; i < size; i++) {
                    C036907z r2 = (C036907z) this.A05.get(i);
                    long j6 = r2.A02;
                    if (r2.A05) {
                        j3 = SystemClock.uptimeMillis() - r2.A01;
                    } else {
                        j3 = 0;
                    }
                    long j7 = j6 + j3;
                    String str = r2.A07;
                    Long l = (Long) r132.A03.get(str);
                    AnonymousClass00N r22 = r132.A03;
                    if (l == null) {
                        j4 = 0;
                    } else {
                        j4 = l.longValue();
                    }
                    r22.put(str, Long.valueOf(j4 + j7));
                }
                int size2 = this.A04.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    String str2 = (String) this.A04.A06(i2);
                    Long l2 = (Long) r132.A03.get(str2);
                    AnonymousClass00N r4 = r132.A03;
                    if (l2 == null) {
                        j2 = 0;
                    } else {
                        j2 = l2.longValue();
                    }
                    r4.put(str2, Long.valueOf(j2 + ((Long) this.A04.A08(i2)).longValue()));
                }
            }
        }
        return true;
    }
}
