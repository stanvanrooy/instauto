package p000X;

import java.util.ArrayList;

/* renamed from: X.AOY */
public final class AOY {
    public static final C175927fI A03 = new C175927fI();
    public final AnonymousClass1HQ A00 = new AnonymousClass1HQ(new C23487AOj((ArrayList) null, (String) null, 3, (AnonymousClass7BR) null));
    public final C27691Iv A01 = C27691Iv.A00();
    public final C224969mN A02;

    public final void A00(String str, boolean z) {
        C23487AOj aOj;
        C13150hy.A02(str, "mediaId");
        String str2 = null;
        if (!z && (aOj = (C23487AOj) this.A00.A02()) != null) {
            str2 = aOj.A00;
        }
        if (z || str2 != null) {
            C27691Iv r3 = this.A01;
            C224969mN r0 = this.A02;
            C13150hy.A02(str, "mediaId");
            C23527APx aPx = r0.A00;
            C13150hy.A02(str, "mediaId");
            C15890nh r4 = new C15890nh(aPx.A00);
            r4.A09 = Constants.A0N;
            r4.A0E("media/%s/user_pay_supporters/", str);
            r4.A06(C23351AJc.class, true);
            if (str2 != null) {
                r4.A09("cursor", str2);
            }
            C17850qu A032 = r4.A03();
            C13150hy.A01(A032, "builder.build()");
            C27791Jf A002 = C64482rY.A00(A032);
            C13150hy.A01(A002, "RxRequest.observeRequest…estTask(mediaId, cursor))");
            r3.A02(A002, new C23479AOb(this));
        }
    }

    public AOY(C224969mN r5) {
        this.A02 = r5;
    }
}
