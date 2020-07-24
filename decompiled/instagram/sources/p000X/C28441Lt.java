package p000X;

/* renamed from: X.1Lt  reason: invalid class name and case insensitive filesystem */
public final class C28441Lt implements C28401Lo {
    public final AnonymousClass13M A00;
    public final C06180Ob A01;

    public final void BJ7(C15880ng r1) {
    }

    public final void BJB() {
    }

    public final void BJS(C15880ng r1, C28661Mp r2, boolean z) {
    }

    public final void BP6() {
    }

    public final void BJK(C15880ng r12) {
        AnonymousClass13M r4 = this.A00;
        long currentTimeMillis = System.currentTimeMillis();
        String A002 = C16120o4.A00(r12.A04);
        String str = r12.A05;
        String str2 = r12.A06;
        synchronized (r4.A01) {
            C28751My r2 = r4.A00;
            if (r2 != null) {
                r4.A02.add(0, r2);
            }
            r4.A00 = new C28751My(currentTimeMillis, A002, str, str2);
        }
    }

    public C28441Lt(C06180Ob r1, AnonymousClass13M r2) {
        this.A01 = r1;
        this.A00 = r2;
    }

    public final void BJ5(C15880ng r9, Throwable th, int i) {
        String str;
        String str2;
        long currentTimeMillis = System.currentTimeMillis();
        if (th == null || !(th.getCause() instanceof C45381xm)) {
            str = null;
        } else {
            str = ((C45381xm) th.getCause()).A00;
        }
        AnonymousClass13M r6 = this.A00;
        synchronized (r6) {
            synchronized (r6.A01) {
                C28751My r2 = r6.A00;
                if (r2 != null) {
                    r2.A02 = currentTimeMillis - r2.A05;
                    r2.A01 = i;
                    if (th != null) {
                        str2 = th.toString();
                    } else {
                        str2 = null;
                    }
                    r2.A04 = str2;
                    r6.A00.A03 = str;
                    AnonymousClass13M.A00(r6);
                }
            }
        }
    }

    public final void BJX(C15880ng r7, C28661Mp r8) {
        C12670hC.A04(new C37081j5(this, System.currentTimeMillis(), r8.mStatusCode, r8.A01().size()));
    }
}
