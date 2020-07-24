package p000X;

import android.content.Context;

/* renamed from: X.CUK */
public final class CUK {
    public Integer A00 = Constants.A0C;
    public final AnonymousClass0C1 A01;
    public final C27865CUf A02;
    public final String A03;
    public final Context A04;
    public final AnonymousClass1L8 A05;
    public final C17920r1 A06;

    public final void A00(String str) {
        Integer num = this.A00;
        Integer num2 = Constants.ZERO;
        if (num != num2) {
            this.A00 = num2;
            C15890nh r2 = new C15890nh(this.A01);
            r2.A09 = Constants.A0N;
            r2.A0C = this.A03;
            r2.A0A("initially_selected_catalog_id", str);
            r2.A06(CUN.class, false);
            C17850qu A032 = r2.A03();
            A032.A00 = this.A06;
            C28351Lj.A00(this.A04, this.A05, A032);
        }
    }

    public CUK(C27865CUf cUf, AnonymousClass0C1 r3, Context context, AnonymousClass1L8 r5, String str) {
        this.A02 = cUf;
        this.A01 = r3;
        this.A04 = context;
        this.A05 = r5;
        this.A03 = str;
        this.A06 = new CUF(this);
    }
}
