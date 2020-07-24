package p000X;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: X.0Lg  reason: invalid class name and case insensitive filesystem */
public final class C05610Lg implements AnonymousClass0OT, AnonymousClass0OS {
    public boolean A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final List A04;
    public final List A05;
    public final List A06;
    public final List A07;
    public final BlockingQueue A08;
    public final Executor A09;
    public final PriorityBlockingQueue A0A = new PriorityBlockingQueue(11, new AnonymousClass0OF());
    public final ThreadFactory A0B = new AnonymousClass0OD(this);
    public final boolean A0C;
    public final boolean A0D;

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002b, code lost:
        if (r6.A06.isEmpty() != false) goto L_0x004b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002d, code lost:
        r1 = r6.A06;
        r1 = (p000X.C05510Kv) r1.get(r1.size() - 1);
        r1.A01 = true;
        r6.A06.remove(r1);
        p000X.C06120Nv.A00().A02.remove(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x004b, code lost:
        r4 = java.lang.Math.max(1, r6.A02 + r6.A03);
        r3 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0055, code lost:
        if (r3 >= r4) goto L_0x0072;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0057, code lost:
        r1 = new p000X.C05520Kw(r6.A0A);
        r1.start();
        r6.A07.add(r1);
        p000X.C06120Nv.A00().A02.add(r1);
        r3 = r3 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0074, code lost:
        if (r6.A0D == false) goto L_0x008e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0076, code lost:
        r1 = new p000X.C05510Kv(r6.A0A);
        r1.start();
        r6.A06.add(r1);
        p000X.C06120Nv.A00().A02.add(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x008e, code lost:
        r5 = p000X.C06140Nx.A06;
        r5.A05 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0095, code lost:
        if (r5.A04 == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0097, code lost:
        r5.A04 = false;
        r4 = r5.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x009b, code lost:
        if (r4 == null) goto L_0x00ad;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x009d, code lost:
        p000X.C05700Lp.A00().ADc(new p000X.AnonymousClass0KX(r4, r5.A02, r5.A03));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00ad, code lost:
        r5.A02 = null;
        r5.A03 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
        return;
     */
    public final void BOm() {
        synchronized (this) {
            if (this.A00) {
                this.A00 = false;
                for (AnonymousClass0O9 A002 : this.A04) {
                    A00(A002);
                }
                this.A04.clear();
            }
        }
    }

    private void A00(AnonymousClass0O9 r4) {
        if (r4.mSendToNetworkThreadPool) {
            if (this.A00) {
                AnonymousClass0Z9.A03(this.A09, r4, 482751024);
                return;
            }
            r4 = new C05620Lh(this, r4.mPriority, r4.mMayRunDuringStartup, r4);
        }
        for (AnonymousClass0O6 onAddTask : this.A05) {
            onAddTask.onAddTask(r4, this.A0A.size());
        }
        this.A0A.put(r4);
    }

    public final void ADb(AnonymousClass0OC r2) {
        ADc(r2.A00);
    }

    public final void ADc(AnonymousClass0O9 r2) {
        if (!this.A00 || r2.mMayRunDuringStartup || !this.A0C) {
            A00(r2);
        } else {
            this.A04.add(r2);
        }
    }

    public C05610Lg(int i, int i2, boolean z, boolean z2, boolean z3, int i3) {
        int A032 = AnonymousClass0NI.A01().A03();
        SynchronousQueue synchronousQueue = new SynchronousQueue();
        this.A08 = synchronousQueue;
        this.A04 = new ArrayList();
        this.A09 = new ThreadPoolExecutor(5, 128, 1, TimeUnit.SECONDS, synchronousQueue, this.A0B);
        this.A06 = new ArrayList();
        this.A07 = new ArrayList();
        this.A05 = Collections.synchronizedList(new ArrayList());
        this.A00 = true;
        this.A01 = i;
        this.A03 = i2;
        this.A0D = z;
        this.A0C = z2;
        C06120Nv A002 = C06120Nv.A00();
        A002.A01 = z3;
        A002.A00 = i3;
        this.A02 = A032;
        for (int i4 = 0; i4 < this.A02 + this.A01; i4++) {
            C05510Kv r1 = new C05510Kv(this.A0A);
            r1.start();
            this.A06.add(r1);
            C06120Nv.A00().A02.add(r1);
        }
    }
}
