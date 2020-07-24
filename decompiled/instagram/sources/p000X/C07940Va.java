package p000X;

import android.os.PowerManager;
import android.os.SystemClock;

/* renamed from: X.0Va  reason: invalid class name and case insensitive filesystem */
public final class C07940Va implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AnonymousClass0TV A01;
    public final /* synthetic */ C07990Vf A02;
    public final /* synthetic */ C08090Vp A03;
    public final /* synthetic */ Integer A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ byte[] A06;

    public C07940Va(C07990Vf r1, String str, byte[] bArr, Integer num, int i, C08090Vp r6, AnonymousClass0TV r7) {
        this.A02 = r1;
        this.A05 = str;
        this.A06 = bArr;
        this.A04 = num;
        this.A00 = i;
        this.A03 = r6;
        this.A01 = r7;
    }

    public final void run() {
        C07990Vf r5 = this.A02;
        String str = this.A05;
        byte[] bArr = this.A06;
        int A002 = AnonymousClass0WE.A00(this.A04);
        int i = this.A00;
        C08090Vp r3 = this.A03;
        try {
            C07990Vf.A02(r5);
            if (r5.A05()) {
                r5.A0D.A04(str, bArr, A002, i);
                C10630dc r1 = r5.A0W;
                if (r1 != null) {
                    AnonymousClass0W6.PUBLISH.name();
                    r1.A00();
                }
                if (r3 != null) {
                    r3.BPW(SystemClock.elapsedRealtime());
                }
            } else if (r3 != null) {
                r3.onFailure();
            }
        } catch (Throwable th) {
            C07990Vf.A03(r5, C07450Td.A00(th), C08110Vr.PUBLISH, th);
            if (r3 != null) {
                r3.onFailure();
            }
            th.getMessage();
        }
        try {
            PowerManager.WakeLock wakeLock = this.A01.A00;
            if (wakeLock != null) {
                AnonymousClass0ZP.A02(wakeLock);
            }
        } catch (Throwable unused) {
        }
    }
}
