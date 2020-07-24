package p000X;

import android.content.Context;
import com.instagram.strings.StringBridge;

/* renamed from: X.1pu  reason: invalid class name and case insensitive filesystem */
public final class C41191pu extends AnonymousClass0L1 {
    public final /* synthetic */ C37531jo A00;

    public final void A00() {
        C37531jo r0 = this.A00;
        Context context = r0.A06;
        AnonymousClass0C1 r4 = r0.A07;
        if (!StringBridge.A00) {
            if (C14110jm.A00(r4.A04()).A05()) {
                C14110jm.A00(r4.A04()).A04(new C25182B5k());
            } else {
                C12800hP.A0F(r4, (AnonymousClass66M) null);
                if (C12800hP.A0J(r4) && C14100jl.A02(r4)) {
                    boolean z = false;
                    if (System.currentTimeMillis() - C42251s2.A01(r4).getLong("user_ie_check", 0) >= 86400000) {
                        z = true;
                    }
                    if (z) {
                        C17850qu A002 = C12800hP.A00(r4);
                        A002.A00 = new C155256k6(r4);
                        C12800hP.A01.schedule(A002);
                    }
                }
            }
            new AnonymousClass28Y(context.getApplicationContext()).A04(new Void[0]);
        }
        if (!C05760Lv.A01.A00.getBoolean("com.facebook.sdk.appInstallEvent", false)) {
            C113714uk r2 = new C113714uk();
            C486028s r1 = new C486028s();
            r1.A04 = "v2.3";
            r1.A02 = Constants.ONE;
            r1.A05 = C486528y.A00;
            r1.A03 = C14100jl.A00(r4);
            r1.A04(AnonymousClass290.class);
            r1.A00 = new AnonymousClass4Oz();
            C17850qu A01 = r1.A01();
            A01.A00 = r2;
            C12810hQ.A02(A01);
        }
        C486028s r12 = new C486028s();
        r12.A04 = "v2.3";
        r12.A02 = Constants.ONE;
        r12.A05 = C486528y.A00;
        r12.A03 = C14100jl.A00(r4);
        r12.A04(AnonymousClass290.class);
        r12.A00 = new AnonymousClass292();
        C12810hQ.A02(r12.A01());
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C41191pu(C37531jo r3) {
        super("runFBReauth", 376);
        this.A00 = r3;
    }
}
