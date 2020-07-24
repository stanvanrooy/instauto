package p000X;

import java.util.List;

/* renamed from: X.1kv  reason: invalid class name and case insensitive filesystem */
public final class C38221kv extends C17920r1 {
    public final /* synthetic */ boolean A00 = true;
    public final /* synthetic */ C37991kY A01;
    public final /* synthetic */ C38011ka A02;

    public C38221kv(C37991kY r2, C38011ka r3) {
        this.A01 = r2;
        this.A02 = r3;
    }

    public final void onFailInBackground(C17710qg r5) {
        int A03 = AnonymousClass0Z0.A03(-114889499);
        if (this.A00) {
            C37991kY.A02(this.A01, this.A02, false);
        }
        AnonymousClass0Z0.A0A(863630756, A03);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001c, code lost:
        if (r1 != false) goto L_0x001e;
     */
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        boolean z;
        int A03 = AnonymousClass0Z0.A03(646538979);
        C38801ls r9 = (C38801ls) obj;
        int A032 = AnonymousClass0Z0.A03(750649022);
        super.onSuccess(r9);
        List list = r9.A04;
        if (list != null) {
            boolean isEmpty = list.isEmpty();
            z = true;
        }
        z = false;
        if (z) {
            C37991kY r1 = this.A01;
            r1.A01 = r9;
            if (!(r9 instanceof C28731Mw) || !C38141kn.A00(r1.A04).booleanValue()) {
                this.A01.A00 = System.currentTimeMillis();
            } else {
                C37991kY r5 = this.A01;
                long AHb = r9.AHb();
                if (AHb == -1) {
                    AHb = System.currentTimeMillis();
                }
                r5.A00 = AHb;
            }
        }
        AnonymousClass0Z0.A0A(2014221621, A032);
        AnonymousClass0Z0.A0A(-27104861, A03);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001c, code lost:
        if (r1 != false) goto L_0x001e;
     */
    public final /* bridge */ /* synthetic */ void onSuccessInBackground(Object obj) {
        boolean z;
        int A03 = AnonymousClass0Z0.A03(-2116827351);
        C38801ls r6 = (C38801ls) obj;
        int A032 = AnonymousClass0Z0.A03(1997089652);
        super.onSuccessInBackground(r6);
        List list = r6.A04;
        if (list != null) {
            boolean isEmpty = list.isEmpty();
            z = true;
        }
        z = false;
        if (z) {
            C38011ka r2 = this.A02;
            C12670hC.A04(new C40601ov(r2, C40321oT.A04(r2.A01, r6.A04)));
        }
        AnonymousClass0Z0.A0A(-695599169, A032);
        AnonymousClass0Z0.A0A(-1490652074, A03);
    }
}
