package p000X;

import android.content.Context;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.1cr  reason: invalid class name and case insensitive filesystem */
public final class C33401cr {
    public static BQQ A05;
    public static final AtomicReference A06 = new AtomicReference();
    public static volatile BQK A07;
    public BQB A00;
    public final BQH A01;
    public final AtomicReference A02 = new AtomicReference();
    public final Context A03;
    public final AtomicReference A04 = new AtomicReference();

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0039, code lost:
        if (r1 != false) goto L_0x003b;
     */
    public static synchronized void A00(C33401cr r3, BQK bqk) {
        boolean z;
        synchronized (r3) {
            if (r3.A02.get() == null && BQC.A06(bqk)) {
                BQH bqh = r3.A01;
                C54802Yz.A00 = bqh.A09;
                C25591BQx bQx = new C25591BQx(bqh, r3.A00);
                r3.A04.set(bQx);
                A05.A00.add(bQx);
                List unmodifiableList = Collections.unmodifiableList(r3.A00.A05.A00);
                if (unmodifiableList != null) {
                    boolean isEmpty = unmodifiableList.isEmpty();
                    z = true;
                }
                z = false;
                if (z && BQC.A06(bqk)) {
                    bQx.A01(bqk);
                }
                r3.A02.set(C25593BQz.A00(r3.A03, r3.A01));
            }
        }
    }

    public final synchronized void A01(BQK bqk) {
        A07 = bqk;
        A05.A00(bqk);
        A00(this, bqk);
    }

    public final synchronized void A02(boolean z) {
        BQA bqa;
        BQB bqb = this.A00;
        if (!(bqb == null || (bqa = bqb.A06) == null)) {
            synchronized (bqa) {
                try {
                    bqa.A0A.set(z);
                    if (z) {
                        bqa.A01 = -1;
                    } else if (bqa.A01 == -1) {
                        bqa.A01 = System.currentTimeMillis();
                    }
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
            }
        }
        if (this.A04.get() != null) {
            C25591BQx bQx = (C25591BQx) this.A04.get();
            synchronized (bQx) {
                if (z) {
                    try {
                        bQx.A01(bQx.A00);
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                } else {
                    bQx.A00();
                }
            }
        }
    }

    public final synchronized void A03(boolean z) {
        BQA bqa;
        BQB bqb = this.A00;
        if (!(bqb == null || (bqa = bqb.A06) == null)) {
            synchronized (bqa) {
                bqa.A0B.set(z);
                BQA.A01(bqa, bqa.A0B);
            }
        }
    }

    public C33401cr(Context context, BQH bqh, BQK bqk) {
        BQQ bqq;
        this.A03 = context;
        this.A01 = bqh;
        this.A00 = new BQB(context, bqh, bqk);
        synchronized (BQQ.class) {
            bqq = BQQ.A01;
            if (bqq == null) {
                synchronized (BQQ.sReputationTierUpdateProviderLock) {
                    if (BQQ.A01 == null) {
                        BQQ.A01 = new BQQ();
                    }
                    bqq = BQQ.A01;
                }
            }
        }
        A05 = bqq;
        bqq.A00.add(this.A00.A06);
        A01(bqk);
    }
}
