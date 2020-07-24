package p000X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/* renamed from: X.0ge  reason: invalid class name and case insensitive filesystem */
public abstract class C12380ge implements C12390gf {
    public static final Queue A09 = new LinkedList();
    public int A00 = 0;
    public C12400gg A01;
    public boolean A02 = false;
    public C12410gh[] A03 = new C12410gh[0];
    public final int A04;
    public final Handler A05;
    public final C12330gZ A06;
    public final List A07 = new ArrayList();
    public volatile boolean A08 = false;

    public C45121xK A02(int i, int i2) {
        return null;
    }

    public abstract void A03();

    public abstract boolean A04();

    public abstract int AGu();

    public final synchronized int AJ3() {
        return this.A00;
    }

    public synchronized boolean BaM(boolean z) {
        boolean z2;
        synchronized (this) {
            z2 = this.A02;
        }
        if (!z2) {
            return false;
        }
        A01(false, true, z);
        A03();
        AnonymousClass0ZA.A04(this.A06.A00, 0, this);
        this.A02 = false;
        A01(false, false, z);
        return true;
    }

    public final synchronized int BdH(int i, Integer num) {
        boolean z;
        int i2;
        synchronized (this) {
            try {
                z = this.A02;
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        }
        if (z) {
            synchronized (this) {
                try {
                    A01(true, true, false);
                } catch (Throwable th2) {
                    th = th2;
                    throw th;
                }
            }
            return 2;
        }
        A01(true, true, true);
        this.A00++;
        try {
            boolean A042 = A04();
            this.A02 = A042;
            if (A042) {
                C12330gZ r5 = this.A06;
                int i3 = this.A04;
                if (num != null) {
                    i2 = num.intValue();
                } else {
                    i2 = 0;
                }
                Message obtain = Message.obtain(r5.A00, 0);
                obtain.obj = this;
                obtain.arg1 = i;
                obtain.arg2 = i2;
                AnonymousClass0ZA.A06(r5.A00, obtain, (long) i3);
            }
            A01(true, false, this.A02);
            return 1;
        } catch (Exception e) {
            AnonymousClass0ZA.A0E(this.A05, A00(true, false, false, true), 2136412925);
            throw e;
        }
    }

    public C12380ge(int i) {
        C12330gZ r0;
        C12400gg r5 = new C12400gg();
        this.A04 = i;
        synchronized (C12330gZ.class) {
            if (C12330gZ.A01 == null) {
                Looper mainLooper = Looper.getMainLooper();
                if (C12190gK.A05 == null) {
                    C12190gK.A05 = new C12190gK((AnonymousClass0Ba) null);
                }
                C12190gK r2 = C12190gK.A05;
                C12210gM A002 = C12210gM.A00();
                if (C12240gQ.A01 == null) {
                    C12240gQ.A01 = new C12240gQ(A002);
                }
                C12330gZ.A01 = new C12330gZ(mainLooper, r2, C12240gQ.A01);
            }
            r0 = C12330gZ.A01;
        }
        this.A06 = r0;
        this.A05 = r0.A00;
        this.A01 = r5;
    }

    private C45101xI A00(boolean z, boolean z2, boolean z3, boolean z4) {
        C45101xI r1;
        Queue queue = A09;
        synchronized (queue) {
            r1 = null;
            if (!queue.isEmpty()) {
                r1 = (C45101xI) queue.remove();
            }
        }
        if (r1 == null) {
            r1 = new C45101xI();
        }
        int i = this.A00;
        r1.A01 = this;
        r1.A05 = z;
        r1.A04 = z2;
        r1.A03 = z3;
        r1.A00 = i;
        r1.A02.set(z4);
        return r1;
    }

    private void A01(boolean z, boolean z2, boolean z3) {
        if (this.A08) {
            AnonymousClass0ZA.A0E(this.A05, A00(z, z2, z3, false), -191210392);
        }
    }

    public final void BZf(C12410gh r4) {
        synchronized (this.A07) {
            if (!this.A07.contains(r4)) {
                this.A07.add(r4);
                List list = this.A07;
                this.A03 = (C12410gh[]) list.toArray(new C12410gh[list.size()]);
                this.A08 = true;
            }
        }
    }
}
