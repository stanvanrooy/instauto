package p000X;

/* renamed from: X.1Mj  reason: invalid class name and case insensitive filesystem */
public final class C28601Mj extends C17920r1 {
    public final AnonymousClass2TE A00;
    public final C28591Mi A01;
    public final /* synthetic */ C28341Li A02;

    public C28601Mj(C28341Li r1, C28591Mi r2, AnonymousClass2TE r3) {
        this.A02 = r1;
        this.A01 = r2;
        this.A00 = r3;
    }

    public final void onFail(C43791v5 r4) {
        AnonymousClass2TE r0;
        int A03 = AnonymousClass0Z0.A03(1863791116);
        if (r4.A03() || (r0 = this.A00) == null) {
            this.A02.A00 = Constants.ONE;
            this.A01.B4I(r4);
        } else {
            AnonymousClass2TE.A00(r0);
        }
        AnonymousClass0Z0.A0A(1308424908, A03);
    }

    public final void onFailInBackground(C17710qg r3) {
        int A03 = AnonymousClass0Z0.A03(812165646);
        this.A01.B4J(r3);
        AnonymousClass0Z0.A0A(-1973026011, A03);
    }

    public final void onFinish() {
        int A03 = AnonymousClass0Z0.A03(-54614056);
        this.A01.B4K();
        AnonymousClass0Z0.A0A(-1939365378, A03);
    }

    public final void onStart() {
        int A03 = AnonymousClass0Z0.A03(-960331647);
        this.A02.A00 = Constants.ZERO;
        this.A01.B4L();
        AnonymousClass0Z0.A0A(-261285167, A03);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = AnonymousClass0Z0.A03(731983435);
        C28691Ms r6 = (C28691Ms) obj;
        int A032 = AnonymousClass0Z0.A03(-697081806);
        AnonymousClass2TE r0 = this.A00;
        if (r0 != null) {
            AnonymousClass0ZA.A07(r0.A07.A03, (Object) null);
        }
        C28341Li r2 = this.A02;
        r2.A00 = Constants.A0C;
        C28721Mv r1 = (C28721Mv) r6;
        r2.A01 = r1.AQs();
        r2.A02 = r1.AeH();
        this.A01.B4M(r6);
        AnonymousClass0Z0.A0A(1800566873, A032);
        AnonymousClass0Z0.A0A(-1939882577, A03);
    }

    public final /* bridge */ /* synthetic */ void onSuccessInBackground(Object obj) {
        int A03 = AnonymousClass0Z0.A03(1307781655);
        int A032 = AnonymousClass0Z0.A03(-749461727);
        this.A01.B4N((C28691Ms) obj);
        AnonymousClass0Z0.A0A(-1382018880, A032);
        AnonymousClass0Z0.A0A(943957324, A03);
    }
}
