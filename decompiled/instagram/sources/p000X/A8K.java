package p000X;

import java.util.ArrayDeque;
import java.util.ArrayList;

/* renamed from: X.A8K */
public final class A8K {
    public long A00;
    public long A01;
    public long A02;
    public long A03;
    public long A04;
    public long A05;
    public long A06;
    public long A07;
    public long A08;
    public long A09;
    public long A0A;
    public long A0B;
    public A9W A0C;
    public ArrayDeque A0D = new ArrayDeque();
    public ArrayList A0E = new ArrayList();
    public ArrayList A0F = new ArrayList();
    public ArrayList A0G = new ArrayList();
    public boolean A0H = false;
    public boolean A0I = false;
    public boolean A0J = false;
    public final A44 A0K;
    public final A83 A0L;
    public final C23123A8b A0M;
    public final Object A0N = new Object();
    public final Object A0O = new Object();
    public final int[] A0P = new int[4];

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0021, code lost:
        r2 = android.os.SystemClock.uptimeMillis();
        r1 = r1.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002d, code lost:
        if (r1.hasNext() == false) goto L_0x0039;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002f, code lost:
        ((java.lang.Runnable) r1.next()).run();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003b, code lost:
        if (r10.A0J == false) goto L_0x005a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003d, code lost:
        r10.A02 = android.os.SystemClock.uptimeMillis() - r2;
        r10.A07 = r10.A01;
        r10.A0J = false;
        com.facebook.systrace.Systrace.A06(com.facebook.common.dextricks.OdexSchemeArtXdex.STATE_PGO_ATTEMPTED, "batchedExecutionTime", 0, 1000000 * r2);
        com.facebook.systrace.Systrace.A03(com.facebook.common.dextricks.OdexSchemeArtXdex.STATE_PGO_ATTEMPTED, "batchedExecutionTime", 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x005a, code lost:
        r10.A01 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x005e, code lost:
        return;
     */
    public static void A00(A8K a8k) {
        if (a8k.A0I) {
            AnonymousClass0CH.A07("ReactNative", "Not flushing pending UI operations because of previously thrown Exception");
            return;
        }
        synchronized (a8k.A0N) {
            if (!a8k.A0E.isEmpty()) {
                ArrayList arrayList = a8k.A0E;
                a8k.A0E = new ArrayList();
            }
        }
    }

    public final void A01(C23053A3d a3d, int i, String str, C230099zE r15) {
        synchronized (this.A0O) {
            this.A00++;
            this.A0D.addLast(new A87(this, a3d, i, str, r15));
        }
    }

    public A8K(A44 a44, A83 a83, int i) {
        this.A0L = a83;
        this.A0M = new C23123A8b(this, a44, i == -1 ? 8 : i);
        this.A0K = a44;
    }
}
