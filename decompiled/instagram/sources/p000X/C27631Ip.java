package p000X;

/* renamed from: X.1Ip  reason: invalid class name and case insensitive filesystem */
public final class C27631Ip implements C27021Ge {
    public final /* synthetic */ C27581Ik A00;

    public C27631Ip(C27581Ik r1) {
        this.A00 = r1;
    }

    public final boolean A2J(Object obj) {
        return AnonymousClass1DW.A00(Constants.ZERO).equals(((AnonymousClass1FF) obj).A02);
    }

    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        int A03 = AnonymousClass0Z0.A03(-569293593);
        AnonymousClass1FF r8 = (AnonymousClass1FF) obj;
        int A032 = AnonymousClass0Z0.A03(1027709232);
        String str = r8.A01;
        if (str != null) {
            C27581Ik r3 = this.A00;
            if (!r3.A04) {
                r3.A0C("NAVIGATED_AWAY", str, r8.A00);
                this.A00.A04 = true;
            }
        }
        C11130eT.A01.A03(AnonymousClass1FF.class, this);
        AnonymousClass0Z0.A0A(1852007684, A032);
        AnonymousClass0Z0.A0A(-769567267, A03);
    }
}
