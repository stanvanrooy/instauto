package p000X;

/* renamed from: X.1pp  reason: invalid class name and case insensitive filesystem */
public final class C41141pp extends AnonymousClass0L1 {
    public final /* synthetic */ C37531jo A00;

    public final void A00() {
        String token = this.A00.A07.getToken();
        C41981rI A002 = C41951rF.A00();
        C05760Lv r8 = C05760Lv.A01;
        String str = A002.ATL().A01;
        long j = C41941rE.A00;
        String A0E = AnonymousClass000.A0E("push_reg_date", str);
        long j2 = r8.A00.getLong("push_reg_date", -1);
        if (j2 != -1) {
            r8.A00.edit().remove("push_reg_date").putLong(A0E, j2).apply();
        }
        boolean z = true;
        if (r8.A00.contains(A0E)) {
            if (Math.abs(r8.A00.getLong(A0E, 0) - System.currentTimeMillis()) <= j) {
                z = false;
            }
        }
        if (z) {
            A002.BZU();
        } else {
            C11130eT.A01.BXT(new C33581d9(token));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C41141pp(C37531jo r3) {
        super("tryRegisterPushToken", 371);
        this.A00 = r3;
    }
}
