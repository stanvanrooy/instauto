package p000X;

/* renamed from: X.0r4  reason: invalid class name and case insensitive filesystem */
public final class C17950r4 extends C17920r1 {
    public final /* synthetic */ C17880qx A00;

    public final synchronized void onFail(C43791v5 r3) {
        int A03 = AnonymousClass0Z0.A03(1834947017);
        C17880qx r0 = this.A00;
        r0.A02 = r3;
        C17920r1 r02 = r0.A07;
        if (r02 != null) {
            r02.onFail(r3);
        }
        C17920r1 r03 = this.A00.A01;
        if (r03 != null) {
            r03.onFail(r3);
        }
        AnonymousClass0Z0.A0A(-1194209419, A03);
    }

    public final synchronized void onFailInBackground(C17710qg r3) {
        int A03 = AnonymousClass0Z0.A03(2096230879);
        C17880qx r0 = this.A00;
        r0.A00 = r3;
        C17920r1 r02 = r0.A07;
        if (r02 != null) {
            r02.onFailInBackground(r3);
        }
        C17920r1 r03 = this.A00.A01;
        if (r03 != null) {
            r03.onFailInBackground(r3);
        }
        AnonymousClass0Z0.A0A(-306069147, A03);
    }

    public final synchronized void onFinish() {
        int A03 = AnonymousClass0Z0.A03(1280063297);
        C17880qx r1 = this.A00;
        r1.A05 = true;
        C17920r1 r0 = r1.A07;
        if (r0 != null) {
            r0.onFinish();
        }
        C17920r1 r02 = this.A00.A01;
        if (r02 != null) {
            r02.onFinish();
        }
        AnonymousClass0Z0.A0A(-405861784, A03);
    }

    public final synchronized void onStart() {
        int A03 = AnonymousClass0Z0.A03(-1462287182);
        C17880qx r1 = this.A00;
        r1.A06 = true;
        C17920r1 r0 = r1.A07;
        if (r0 != null) {
            r0.onStart();
        }
        C17920r1 r02 = this.A00.A01;
        if (r02 != null) {
            r02.onStart();
        }
        AnonymousClass0Z0.A0A(-486447770, A03);
    }

    public C17950r4(C17880qx r1) {
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = AnonymousClass0Z0.A03(1342058928);
        C28711Mu r5 = (C28711Mu) obj;
        synchronized (this) {
            int A032 = AnonymousClass0Z0.A03(95384660);
            C17880qx r0 = this.A00;
            r0.A03 = r5;
            C17920r1 r02 = r0.A07;
            if (r02 != null) {
                r02.onSuccess(r5);
            }
            C17920r1 r03 = this.A00.A01;
            if (r03 != null) {
                r03.onSuccess(r5);
            }
            AnonymousClass0Z0.A0A(-1527142057, A032);
        }
        AnonymousClass0Z0.A0A(1814750254, A03);
    }

    public final /* bridge */ /* synthetic */ void onSuccessInBackground(Object obj) {
        int A03 = AnonymousClass0Z0.A03(227399877);
        C28711Mu r5 = (C28711Mu) obj;
        synchronized (this) {
            int A032 = AnonymousClass0Z0.A03(1397198445);
            C17880qx r0 = this.A00;
            r0.A04 = r5;
            C17920r1 r02 = r0.A07;
            if (r02 != null) {
                r02.onSuccessInBackground(r5);
            }
            C17920r1 r03 = this.A00.A01;
            if (r03 != null) {
                r03.onSuccessInBackground(r5);
            }
            AnonymousClass0Z0.A0A(-1316234867, A032);
        }
        AnonymousClass0Z0.A0A(-1632649005, A03);
    }
}
