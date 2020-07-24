package p000X;

import java.util.List;

/* renamed from: X.1ve  reason: invalid class name and case insensitive filesystem */
public final class C44131ve extends C17920r1 {
    public final /* synthetic */ C37991kY A00;
    public final /* synthetic */ C38011ka A01;
    public final /* synthetic */ AnonymousClass0C1 A02;

    public C44131ve(C37991kY r1, C38011ka r2, AnonymousClass0C1 r3) {
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = r3;
    }

    public final void onFinish() {
        int A03 = AnonymousClass0Z0.A03(-586377310);
        this.A00.A02 = false;
        this.A01.A00();
        AnonymousClass0Z0.A0A(-675121618, A03);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001c, code lost:
        if (r1 != false) goto L_0x001e;
     */
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        boolean z;
        int A03 = AnonymousClass0Z0.A03(-858453008);
        C38801ls r6 = (C38801ls) obj;
        int A032 = AnonymousClass0Z0.A03(179355170);
        super.onSuccess(r6);
        List list = r6.A04;
        if (list != null) {
            boolean isEmpty = list.isEmpty();
            z = true;
        }
        z = false;
        if (z) {
            if (C38141kn.A00(this.A02).booleanValue()) {
                AnonymousClass0C1 r2 = this.A02;
                ((C38161kp) r2.AVA(C38161kp.class, new C38181kr(r2))).A00.edit().putBoolean("prefetch_and_store_to_disk_on_next_startup", false).apply();
            }
            C37991kY r22 = this.A00;
            r22.A01 = r6;
            r22.A00 = System.currentTimeMillis();
        }
        AnonymousClass0Z0.A0A(1639727089, A032);
        AnonymousClass0Z0.A0A(597944898, A03);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001c, code lost:
        if (r1 != false) goto L_0x001e;
     */
    public final /* bridge */ /* synthetic */ void onSuccessInBackground(Object obj) {
        boolean z;
        int A03 = AnonymousClass0Z0.A03(1957085786);
        C38801ls r6 = (C38801ls) obj;
        int A032 = AnonymousClass0Z0.A03(1768748677);
        super.onSuccessInBackground(r6);
        List list = r6.A04;
        if (list != null) {
            boolean isEmpty = list.isEmpty();
            z = true;
        }
        z = false;
        if (z) {
            C38011ka r2 = this.A01;
            C12670hC.A04(new C40601ov(r2, C40321oT.A04(r2.A01, r6.A04)));
        }
        AnonymousClass0Z0.A0A(716698064, A032);
        AnonymousClass0Z0.A0A(-1948559127, A03);
    }
}
