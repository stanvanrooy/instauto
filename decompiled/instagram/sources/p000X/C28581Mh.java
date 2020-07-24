package p000X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.1Mh  reason: invalid class name and case insensitive filesystem */
public final class C28581Mh implements C28591Mi {
    public final /* synthetic */ C15880ng A00;
    public final /* synthetic */ AnonymousClass1LV A01;

    public C28581Mh(AnonymousClass1LV r1, C15880ng r2) {
        this.A01 = r1;
        this.A00 = r2;
    }

    public final void B4I(C43791v5 r5) {
        int i;
        C28661Mp r0 = (C28661Mp) r5.A00;
        if (r0 != null) {
            i = r0.mStatusCode;
        } else {
            Throwable th = r5.A01;
            i = -1;
            if (th instanceof C150316bt) {
                i = ((C150316bt) th).A00;
            }
        }
        this.A01.A0E.BJ5(this.A00, r5.A01, i);
        synchronized (this.A01.A0J) {
            C28541Md r2 = this.A01.A03;
            if (r2 != null) {
                r2.A03(C28571Mg.NETWORK, r5, this.A00.A00());
            }
        }
    }

    public final void B4J(C17710qg r3) {
        this.A01.A0E.BJ7(this.A00);
    }

    public final void B4K() {
        this.A01.A0E.BJB();
        AnonymousClass1LV r2 = this.A01;
        r2.A0C.A00 = null;
        synchronized (r2.A0J) {
            C28541Md r3 = this.A01.A03;
            if (r3 != null) {
                C28571Mg r1 = C28571Mg.NETWORK;
                boolean A002 = this.A00.A00();
                if (r1.ordinal() == 2 && A002) {
                    r3.A06.A0E(false);
                }
            }
        }
    }

    public final void B4L() {
        this.A01.A0E.BJK(this.A00);
        synchronized (this.A01.A0J) {
            C28541Md r2 = this.A01.A03;
            if (r2 != null) {
                r2.A04(C28571Mg.NETWORK, this.A00.A00());
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0028, code lost:
        if (r3.A07(r2, p000X.C28571Mg.NETWORK, r8, r2.A00()) == false) goto L_0x002a;
     */
    public final /* bridge */ /* synthetic */ void B4M(C28691Ms r8) {
        boolean z;
        C28661Mp r82 = (C28661Mp) r8;
        AnonymousClass0JN r0 = this.A01.A09;
        r82.A01();
        r0.A01();
        AnonymousClass1LV r2 = this.A01;
        r2.A01 = r82.A00;
        synchronized (r2.A0J) {
            C28541Md r3 = this.A01.A03;
            if (r3 != null) {
                C15880ng r22 = this.A00;
                z = true;
            }
            z = false;
            long currentTimeMillis = System.currentTimeMillis();
            if (this.A00.A00()) {
                this.A01.A02 = new C37251jM(r82.A09, r82, currentTimeMillis);
            } else {
                C37251jM r1 = this.A01.A02;
                if (r1 != null) {
                    r1.A03.add(r82);
                    r1.A01 = currentTimeMillis;
                }
            }
        }
        this.A01.A0E.BJS(this.A00, r82, z);
    }

    public final /* bridge */ /* synthetic */ void B4N(C28691Ms r8) {
        C28661Mp r82 = (C28661Mp) r8;
        this.A01.A0E.BJX(this.A00, r82);
        synchronized (this.A01.A0J) {
            C28541Md r3 = this.A01.A03;
            if (r3 != null) {
                C15880ng r2 = this.A00;
                r3.A02(r2, C28571Mg.NETWORK, r82, r2.A00());
            }
            if (C252117x.A02().A07()) {
                AnonymousClass1LV r0 = this.A01;
                r0.A0F.A00 = ((Integer) AnonymousClass0L6.A02(r0.A0G, AnonymousClass0L7.HOME_FLASH_FEED, "low_mem_cache_size", 0, (AnonymousClass04H) null)).intValue();
            }
            AnonymousClass1LY r4 = this.A01.A0F;
            List A012 = r82.A01();
            boolean A002 = this.A00.A00();
            if (r4.A07) {
                r4.A03.ADc(new C471822o(r4, new ArrayList(A012), A002));
            }
        }
    }
}
