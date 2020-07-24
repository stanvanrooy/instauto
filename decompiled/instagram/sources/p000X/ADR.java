package p000X;

import android.content.Context;
import android.os.Looper;
import android.view.View;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.ADR */
public final class ADR {
    public static final AtomicInteger A0E = new AtomicInteger(0);
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public C23159AAn A05;
    public C23159AAn A06;
    public C23166AAu A07;
    public ADS A08;
    public ADU A09;
    public final Context A0A;
    public final ADZ A0B = new ADZ(this, Looper.getMainLooper());
    public final Object A0C;
    public final AEA A0D;

    public static void A00(ADR adr) {
        synchronized (adr) {
            AEA aea = adr.A0D;
            C23159AAn aAn = adr.A05;
            aea.A96(aAn.A03, aAn.A04);
            adr.A06 = adr.A05;
        }
        ADU adu = adr.A09;
        if (adu != null) {
            adu.A00(adr.A06.A03);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002a, code lost:
        r1 = r5.A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002e, code lost:
        monitor-enter(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0031, code lost:
        if (r10 <= r13.A00) goto L_0x0039;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0033, code lost:
        r13.A00 = r10;
        r13.A05 = r1;
        r1 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0039, code lost:
        r1 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x003c, code lost:
        if (r13.A08 != r5) goto L_0x0040;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x003e, code lost:
        r13.A08 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0040, code lost:
        monitor-exit(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0041, code lost:
        if (r1 == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0047, code lost:
        if (p000X.AnonymousClass2U1.A00() == false) goto L_0x004d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0049, code lost:
        A00(r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0055, code lost:
        if (r13.A0B.hasMessages(99) != false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0057, code lost:
        p000X.AnonymousClass0ZA.A0B(r13.A0B, 99);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x005c, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x005d, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:?, code lost:
        return;
     */
    public final void A02(C23166AAu aAu) {
        int i;
        synchronized (this) {
            try {
                if (this.A01 <= -1) {
                    C23159AAn aAn = this.A05;
                    this.A01 = -1;
                    C23166AAu aAu2 = aAu;
                    this.A07 = aAu;
                    int i2 = this.A04;
                    if (i2 != -1 && (i = this.A02) != -1) {
                        int i3 = this.A03;
                        this.A03 = i3 + 1;
                        ADS ads = new ADS(this.A0A, this.A0C, aAu2, aAn, i3, i2, i);
                        this.A08 = ads;
                    }
                } else {
                    throw new IllegalStateException("Setting an unversioned tree after calling setVersionedTree is not supported. If this RenderState takes its version from a parent tree make sure to always call setVersionedTree");
                }
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x007d, code lost:
        if (p000X.C23162AAq.A00(r5.A00, r3, r5.A02.A02.height()) == false) goto L_0x007f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00b3, code lost:
        if (r1 == false) goto L_0x00b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00d8, code lost:
        r1 = r8.A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00dc, code lost:
        monitor-enter(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00df, code lost:
        if (r13 <= r2.A00) goto L_0x00e7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00e1, code lost:
        r2.A00 = r13;
        r2.A05 = r1;
        r3 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00e7, code lost:
        r3 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00eb, code lost:
        if (r2.A08 != r8) goto L_0x00ef;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00ed, code lost:
        r2.A08 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00ef, code lost:
        if (r19 == null) goto L_0x010d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x002b, code lost:
        if (p000X.C23162AAq.A00(r5.A00, r3, r5.A02.A02.height()) == false) goto L_0x002d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00f1, code lost:
        r19[0] = r2.A05.A03.A02.A02.width();
        r19[1] = r2.A05.A03.A02.A02.height();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x010d, code lost:
        monitor-exit(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x010e, code lost:
        if (r3 == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0114, code lost:
        if (p000X.AnonymousClass2U1.A00() == false) goto L_0x011a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0116, code lost:
        A00(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0119, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0122, code lost:
        if (r2.A0B.hasMessages(99) != false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0124, code lost:
        p000X.AnonymousClass0ZA.A0B(r2.A0B, 99);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0129, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0148, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:?, code lost:
        return;
     */
    public final void A01(int i, int i2, int[] iArr) {
        int i3;
        ADS ads;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        C23159AAn aAn = this.A06;
        int i4 = i2;
        int i5 = i;
        if (aAn != null) {
            C23161AAp aAp = aAn.A03;
            if (C23162AAq.A00(aAp.A01, i5, aAp.A02.A02.width())) {
                z5 = true;
            }
            z5 = false;
            if (z5) {
                if (iArr != null) {
                    iArr[0] = this.A06.A03.A02.A02.width();
                    iArr[1] = this.A06.A03.A02.A02.height();
                    return;
                }
                return;
            }
        }
        synchronized (this) {
            try {
                this.A04 = i5;
                this.A02 = i4;
                C23159AAn aAn2 = this.A05;
                if (aAn2 != null) {
                    C23161AAp aAp2 = aAn2.A03;
                    if (C23162AAq.A00(aAp2.A01, i5, aAp2.A02.A02.width())) {
                        z4 = true;
                    }
                    z4 = false;
                    if (z4 && iArr != null) {
                        iArr[0] = this.A05.A03.A02.A02.width();
                        iArr[1] = this.A05.A03.A02.A02.height();
                        return;
                    }
                }
                ADS ads2 = this.A08;
                if (ads2 != null) {
                    int i6 = ads2.A02;
                    if (i6 == i5 || (View.MeasureSpec.getMode(i6) == 0 && View.MeasureSpec.getMode(i5) == 0)) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        int i7 = ads2.A00;
                        if (i7 == i4 || (View.MeasureSpec.getMode(i7) == 0 && View.MeasureSpec.getMode(i4) == 0)) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        z2 = true;
                    }
                    z2 = false;
                    if (z2) {
                        ads = this.A08;
                        i3 = ads.A01;
                    }
                }
                i3 = this.A03;
                this.A03 = i3 + 1;
                ads = new ADS(this.A0A, this.A0C, this.A07, this.A05, i3, this.A04, this.A02);
                this.A08 = ads;
            } catch (Throwable th) {
                while (true) {
                    th = th;
                }
            }
        }
        throw th;
    }

    public ADR(Context context, Object obj, AEA aea) {
        A0E.incrementAndGet();
        this.A01 = -1;
        this.A03 = 0;
        this.A00 = -1;
        this.A04 = -1;
        this.A02 = -1;
        this.A0A = context;
        this.A0D = aea;
        this.A0C = obj;
    }
}
