package p000X;

/* renamed from: X.0xG  reason: invalid class name and case insensitive filesystem */
public final class C21770xG implements C19560tg {
    public static final C05110Id A01 = new C21780xH();
    public final AnonymousClass0C1 A00;

    public final /* bridge */ /* synthetic */ void BCQ(C17090pf r8, AnonymousClass3LS r9, AnonymousClass3LS r10) {
        C21730xC r82 = (C21730xC) r8;
        String str = r82.A03;
        C13510ie A002 = C13510ie.A00(this.A00);
        C13300iJ A02 = A002.A02(str);
        if (A02 == null) {
            AnonymousClass0DB.A0J("DirectUserMessagingMutationStateObserver", "user with id: %s does not exist in cache.", str);
            return;
        }
        String str2 = r10.A02;
        char c = 65535;
        if (str2.hashCode() == 1563991648 && str2.equals("uploaded")) {
            c = 0;
        }
        if (c == 0) {
            A02.A0N(r82.A04);
            A002.A01(A02, false);
            C23300zv.A00(this.A00).BXT(new C62512nq(A02));
            C19290tE.A00(this.A00).BeU();
        }
    }

    public C21770xG(AnonymousClass0C1 r1) {
        this.A00 = r1;
    }

    public final void BCL(C17090pf r1, AnonymousClass3LS r2) {
    }

    public final void BCP(C17090pf r1, AnonymousClass3LS r2) {
    }
}
