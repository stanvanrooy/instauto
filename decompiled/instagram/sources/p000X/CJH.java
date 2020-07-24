package p000X;

import android.os.Bundle;

/* renamed from: X.CJH */
public final class CJH {
    public float A00;
    public AnonymousClass2TI A01;
    public AnonymousClass0C1 A02;
    public C13300iJ A03;
    public C146056Mg A04;
    public AnonymousClass6MW A05;
    public AnonymousClass6MX A06;
    public C27588CJh A07;
    public C27578CIx A08;
    public String A09;
    public String A0A;
    public String A0B;
    public boolean A0C;

    public final CJ4 A00() {
        AnonymousClass11J.A00(this.A02);
        CJ4 cj4 = new CJ4();
        Bundle bundle = new Bundle();
        String token = this.A02.getToken();
        AnonymousClass11J.A00(token);
        bundle.putString("IgSessionManager.SESSION_TOKEN_KEY", token);
        cj4.setArguments(bundle);
        AnonymousClass0C1 r13 = this.A02;
        AnonymousClass11J.A00(r13);
        String str = this.A09;
        AnonymousClass11J.A00(str);
        String str2 = this.A0B;
        AnonymousClass11J.A00(str2);
        C146056Mg r9 = this.A04;
        AnonymousClass11J.A00(r9);
        AnonymousClass6MW r7 = this.A05;
        AnonymousClass11J.A00(r7);
        AnonymousClass6MX r6 = this.A06;
        AnonymousClass11J.A00(r6);
        C27588CJh cJh = this.A07;
        AnonymousClass11J.A00(cJh);
        AnonymousClass2TI r4 = this.A01;
        AnonymousClass11J.A00(r4);
        CJW cjw = new CJW(r13, r4, this.A03, str, this.A0C, this.A00, cJh, str2, r9, r7, r6, this.A0A);
        CJ5 cj5 = new CJ5(cj4, r13, C27572CIq.A00(r13), this.A0B, this.A09, this.A03, this.A08, this.A04, this.A05, this.A06, this.A0A, this.A07, cjw);
        AnonymousClass2TI r0 = this.A01;
        AnonymousClass11J.A00(r0);
        cj4.A05 = cj5;
        cj4.A02 = r0;
        return cj4;
    }
}
