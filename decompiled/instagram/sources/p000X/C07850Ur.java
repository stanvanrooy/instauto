package p000X;

import android.os.SystemClock;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: X.0Ur  reason: invalid class name and case insensitive filesystem */
public final class C07850Ur implements Runnable {
    public final /* synthetic */ C10630dc A00;
    public final /* synthetic */ AnonymousClass0WB A01;

    public C07850Ur(C10630dc r1, AnonymousClass0WB r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0064, code lost:
        if (r2.A05() == false) goto L_0x0066;
     */
    public final void run() {
        int i;
        boolean z;
        C10520dR r9;
        long j;
        long j2;
        long j3;
        C07990Vf r1 = this.A00.A01.A0l;
        C10630dc r2 = this.A00;
        if (r1 == r2.A00) {
            C07400Sy r11 = C11020eI.A00;
            AnonymousClass0WB r12 = this.A01;
            switch (r12.A00.A03.ordinal()) {
                case 2:
                    if (((AnonymousClass0d7) r12).A00.A02 == AnonymousClass0WE.A00(Constants.ONE)) {
                        r2.A01.A08();
                        break;
                    }
                    break;
                case 3:
                case 8:
                case 10:
                    i = ((AnonymousClass0W4) r12.A01()).A00;
                    break;
                case C120125Dh.VIEW_TYPE_BANNER /*11*/:
                    r2.A01.A08();
                    C07890Uv r5 = this.A00.A01;
                    if (r5.A0W) {
                        C07990Vf r22 = r5.A0l;
                        if (r22 != null) {
                            z = true;
                            break;
                        }
                        z = false;
                        if (z) {
                            long j4 = r22.A0U;
                            C07890Uv.A02(r5, r5.A0A.A05(SystemClock.elapsedRealtime() - j4), true);
                            break;
                        }
                    }
                    break;
                case C120125Dh.VIEW_TYPE_SPINNER /*12*/:
                    i = -1;
                    break;
            }
            Integer valueOf = Integer.valueOf(i);
            C07410Sz.A00(valueOf);
            r11 = new C11010eH(valueOf);
            if (r11.A01()) {
                r11.A00();
                AnonymousClass0V4 r10 = this.A00.A01.A0L;
                int intValue = ((Integer) r11.A00()).intValue();
                synchronized (r10.A03) {
                    r9 = (C10520dR) r10.A03.remove(Integer.valueOf(intValue));
                }
                if (r9 != null) {
                    if (r9.A06 != null) {
                        r9.A06.cancel(false);
                    }
                    SystemClock.elapsedRealtime();
                    long elapsedRealtime = SystemClock.elapsedRealtime() - r9.A02;
                    if (r9.A04.equals(AnonymousClass0W6.PUBACK)) {
                        AtomicLong atomicLong = (AtomicLong) ((AnonymousClass061) r10.A01.A07(AnonymousClass061.class)).A00(C10840dx.PublishAcknowledgementMs);
                        if (elapsedRealtime > 0) {
                            do {
                                j2 = atomicLong.get();
                                if (j2 == 0) {
                                    j3 = elapsedRealtime;
                                } else {
                                    j3 = (long) ((((double) j2) * 0.8d) + (((double) elapsedRealtime) * 0.2d));
                                }
                            } while (!atomicLong.compareAndSet(j2, j3));
                        }
                    }
                    int i2 = r9.A01;
                    C07990Vf r0 = r9.A03;
                    if (r0 == null) {
                        j = 0;
                    } else {
                        j = r0.A0U;
                    }
                    r10.A00.A03(r9.A05, AnonymousClass0WE.A00(Constants.ONE), intValue, elapsedRealtime, i2, j);
                }
                r11.A00();
            }
            C07890Uv r13 = this.A00.A01;
            if (r13.A05 != null) {
                AnonymousClass0W6 r02 = AnonymousClass0W6.PUBLISH;
            }
            r13.A0I.BBh(this.A01);
        }
    }
}
