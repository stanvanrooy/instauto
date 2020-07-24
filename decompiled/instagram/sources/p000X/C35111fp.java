package p000X;

/* renamed from: X.1fp  reason: invalid class name and case insensitive filesystem */
public final class C35111fp implements C06570Po, C06580Pp {
    public String A00;
    public String A01;
    public boolean A02;
    public boolean A03;
    public final C06590Pq A04;

    public final void onSessionIsEnding() {
    }

    public final void onUserSessionWillEnd(boolean z) {
    }

    public static C35111fp A00(C06590Pq r2) {
        return (C35111fp) r2.AVA(C35111fp.class, new C35121fq(r2));
    }

    public final void A02(String str, String str2) {
        String str3;
        if (str != null && str2 != null) {
            this.A00 = str;
            this.A01 = str2;
            C91993yR r2 = new C91993yR(AnonymousClass0QT.A00(this.A04, (AnonymousClass0RN) null).A02("app_switch_dest_intermediate"));
            r2.A08("dest_module", str2);
            r2.A08("attempt_id", this.A00);
            if (this.A02) {
                str3 = "warm";
            } else {
                str3 = "cold";
            }
            r2.A08("dest_state", str3);
            r2.A01();
            this.A03 = this.A02;
        }
    }

    public C35111fp(C06590Pq r1) {
        this.A04 = r1;
    }

    public final void A01(AnonymousClass0RN r4) {
        String str;
        AnonymousClass0a4.A06(r4);
        if (!(this.A00 == null || this.A01 == null || !r4.getModuleName().equals(this.A01))) {
            C92003yS r2 = new C92003yS(AnonymousClass0QT.A00(this.A04, r4).A02("app_switch_dest"));
            r2.A08("dest_module", this.A01);
            r2.A08("attempt_id", this.A00);
            if (this.A03) {
                str = "warm";
            } else {
                str = "cold";
            }
            r2.A08("dest_state", str);
            r2.A01();
            this.A00 = null;
            this.A01 = null;
        }
        this.A02 = true;
    }
}
