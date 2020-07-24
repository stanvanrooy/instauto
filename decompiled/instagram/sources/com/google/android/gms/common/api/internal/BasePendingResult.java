package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.util.Pair;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.LocationSettingsResult;
import com.google.android.gms.location.LocationSettingsStates;
import com.google.android.gms.safetynet.zza;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;
import p000X.AnonymousClass0ZA;
import p000X.AnonymousClass0a2;
import p000X.BHH;
import p000X.BHS;
import p000X.BHe;
import p000X.BHw;
import p000X.BI4;
import p000X.BIC;
import p000X.BID;
import p000X.BIE;
import p000X.BIG;
import p000X.BIR;
import p000X.BK9;
import p000X.BKM;
import p000X.C138515vO;
import p000X.C25388BHf;
import p000X.C25392BHo;
import p000X.C25394BHq;
import p000X.C25395BHs;
import p000X.C25396BHt;
import p000X.C25397BHu;
import p000X.C25400BHy;

@KeepName
public abstract class BasePendingResult extends BHH {
    public static final ThreadLocal A0E = new C25392BHo();
    public C138515vO A00;
    public C25388BHf A01;
    public Status A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public final BHe A06;
    public final Object A07;
    public final WeakReference A08;
    public final ArrayList A09;
    public final CountDownLatch A0A;
    public final AtomicReference A0B;
    public volatile boolean A0C;
    public volatile BHw A0D;
    @KeepName
    public C25396BHt mResultGuardian;

    public C138515vO A06(Status status) {
        if (!(this instanceof BK9)) {
            if (this instanceof C25394BHq) {
                return new C25395BHs(status, (zza) null);
            }
            if (this instanceof BI4) {
                return new LocationSettingsResult(status, (LocationSettingsStates) null);
            }
            if (!(this instanceof BIR) && !(this instanceof BIE)) {
                if (this instanceof BID) {
                    return new BIC(status, (Credential) null);
                }
                boolean z = this instanceof BKM;
            }
        }
        return status;
    }

    public static final C138515vO A00(BasePendingResult basePendingResult) {
        C138515vO r2;
        synchronized (basePendingResult.A07) {
            boolean z = false;
            if (!basePendingResult.A0C) {
                z = true;
            }
            AnonymousClass0a2.A09(z, "Result has already been consumed.");
            AnonymousClass0a2.A09(basePendingResult.A0C(), "Result is not ready.");
            r2 = basePendingResult.A00;
            basePendingResult.A00 = null;
            basePendingResult.A01 = null;
            basePendingResult.A0C = true;
        }
        C25397BHu bHu = (C25397BHu) basePendingResult.A0B.getAndSet((Object) null);
        if (bHu != null) {
            bHu.Bux(basePendingResult);
        }
        return r2;
    }

    private final void A01(C138515vO r6) {
        this.A00 = r6;
        this.A0A.countDown();
        C138515vO r1 = this.A00;
        this.A02 = r1.AWn();
        if (this.A04) {
            this.A01 = null;
        } else if (this.A01 != null) {
            AnonymousClass0ZA.A02(this.A06, 2);
            BHe bHe = this.A06;
            AnonymousClass0ZA.A0D(bHe, bHe.obtainMessage(1, new Pair(this.A01, A00(this))));
        } else if (r1 instanceof C25400BHy) {
            this.mResultGuardian = new C25396BHt(this);
        }
        ArrayList arrayList = this.A09;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((BHS) obj).AxX(this.A02);
        }
        this.A09.clear();
    }

    public final void A07() {
        synchronized (this.A07) {
            if (!this.A04 && !this.A0C) {
                this.A04 = true;
                A01(A06(Status.A04));
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0011, code lost:
        if (((java.lang.Boolean) A0E.get()).booleanValue() != false) goto L_0x0013;
     */
    public final void A08() {
        boolean z;
        if (!this.A03) {
            z = false;
        }
        z = true;
        this.A03 = z;
    }

    public final void A09(C138515vO r5) {
        synchronized (this.A07) {
            if (!this.A05 && !this.A04) {
                A0C();
                boolean z = true;
                boolean z2 = false;
                if (!A0C()) {
                    z2 = true;
                }
                AnonymousClass0a2.A09(z2, "Results have already been set");
                if (this.A0C) {
                    z = false;
                }
                AnonymousClass0a2.A09(z, "Result has already been consumed");
                A01(r5);
            }
        }
    }

    public final void A0A(Status status) {
        synchronized (this.A07) {
            if (!A0C()) {
                A09(A06(status));
                this.A05 = true;
            }
        }
    }

    public final boolean A0B() {
        boolean z;
        synchronized (this.A07) {
            z = this.A04;
        }
        return z;
    }

    public final boolean A0C() {
        if (this.A0A.getCount() == 0) {
            return true;
        }
        return false;
    }

    public BasePendingResult() {
        this.A07 = new Object();
        this.A0A = new CountDownLatch(1);
        this.A09 = new ArrayList();
        this.A0B = new AtomicReference();
        this.A03 = false;
        this.A06 = new BHe(Looper.getMainLooper());
        this.A08 = new WeakReference((Object) null);
    }

    public BasePendingResult(BIG big) {
        this.A07 = new Object();
        this.A0A = new CountDownLatch(1);
        this.A09 = new ArrayList();
        this.A0B = new AtomicReference();
        this.A03 = false;
        this.A06 = new BHe(big != null ? big.A04() : Looper.getMainLooper());
        this.A08 = new WeakReference(big);
    }
}
