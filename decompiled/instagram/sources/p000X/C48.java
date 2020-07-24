package p000X;

/* renamed from: X.C48 */
public final class C48 {
    public final C49 A00;
    public final C27233C3z A01;

    public final void A03(C4A c4a) {
        C49 c49 = this.A00;
        switch (c4a.A03.intValue()) {
            case 0:
                c49.A02.put(Long.valueOf(c4a.A00), c4a);
                break;
            case 1:
                c49.A00 = c4a;
                break;
            case 2:
            case 3:
                c49.A00 = null;
                break;
        }
        if (c49.A02.containsKey(Long.valueOf(c4a.A00))) {
            c49.A02.put(Long.valueOf(c4a.A00), c4a);
            C27233C3z c3z = this.A01;
            String str = c3z.A00;
            if (str == null) {
                C24984AxR.A02(new C4E("Question source not set"), (C24967AxA) null);
                return;
            }
            switch (c4a.A03.intValue()) {
                case 1:
                    C25014Ay6 ay6 = c3z.A01;
                    C41 c41 = new C41(c3z);
                    AnonymousClass0C1 r0 = ay6.A00;
                    long j = c4a.A00;
                    C15890nh r6 = new C15890nh(r0);
                    r6.A09 = Constants.ONE;
                    r6.A0E("live/%s/question/%s/activate/", str, Long.valueOf(j));
                    r6.A06(C101094Yi.class, false);
                    C17850qu A03 = r6.A03();
                    A03.A00 = new AnonymousClass5IY(c41, "selectQuestions");
                    C12810hQ.A02(A03);
                    return;
                case 3:
                    C25014Ay6 ay62 = c3z.A01;
                    C40 c40 = new C40(c3z);
                    AnonymousClass0C1 r02 = ay62.A00;
                    long j2 = c4a.A00;
                    C15890nh r62 = new C15890nh(r02);
                    r62.A09 = Constants.ONE;
                    r62.A0E("live/%s/question/%s/deactivate/", str, Long.valueOf(j2));
                    r62.A06(C101074Yg.class, false);
                    C17850qu A032 = r62.A03();
                    A032.A00 = new AnonymousClass5IY(c40, "deselectQuestions");
                    C12810hQ.A02(A032);
                    return;
                default:
                    return;
            }
        } else {
            throw new IllegalStateException("Attempt to update a question that doesn't exist: " + c4a);
        }
    }

    public final void A00(long j, C24967AxA axA) {
        if (axA != null) {
            C4A c4a = (C4A) this.A00.A02.get(Long.valueOf(j));
            if (c4a != null) {
                C24984AxR.A01(c4a, axA);
                C24984AxR.A00(axA);
                return;
            }
            C24984AxR.A02(new C4E(AnonymousClass000.A0B("Question not found for id: ", j)), axA);
        }
    }

    public final void A01(C24967AxA axA) {
        C24984AxR.A01(this.A00.A01(C26813Bsy.STORY), axA);
        C27233C3z.A00(this.A01, new C4B(this, axA), C26813Bsy.STORY);
    }

    public final void A02(C24967AxA axA) {
        C24984AxR.A01(this.A00.A00(), axA);
        C27233C3z c3z = this.A01;
        C4C c4c = new C4C(this, axA);
        C25014Ay6 ay6 = c3z.A01;
        C43 c43 = new C43(c3z, c4c);
        C15890nh r2 = new C15890nh(ay6.A00);
        r2.A09 = Constants.A0N;
        r2.A0C = "live/get_questions/";
        r2.A06(C45.class, false);
        C17850qu A03 = r2.A03();
        A03.A00 = new AnonymousClass5IY(c43, "getQuestions");
        C12810hQ.A02(A03);
    }

    public C48(C49 c49, C27233C3z c3z) {
        this.A00 = c49;
        this.A01 = c3z;
    }
}
