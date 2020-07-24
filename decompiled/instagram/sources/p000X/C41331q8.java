package p000X;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: X.1q8  reason: invalid class name and case insensitive filesystem */
public final class C41331q8 extends AnonymousClass0L1 {
    public final /* synthetic */ C37531jo A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C41331q8(C37531jo r3) {
        super("maybeInitializeMobileBoostProvider", 390);
        this.A00 = r3;
    }

    public final void A00() {
        C37531jo r1 = this.A00;
        try {
            C12090gA A002 = C12090gA.A00(r1.A06);
            Context context = r1.A06;
            AnonymousClass0C1 r4 = r1.A07;
            C486128t r0 = new C486128t(r4);
            A002.A01 = r0;
            if (r0.A03) {
                A002.A05 = true;
                A002.A04 = C05770Lw.A01(context).A0L();
                C486128t r3 = A002.A01;
                A002.A03 = new AnonymousClass291(r3.A00, r3.A02);
                AnonymousClass293 r02 = new AnonymousClass293(r3);
                A002.A00 = r02;
                AnonymousClass296 r32 = new AnonymousClass296();
                r32.A00 = context;
                r32.A01 = r02.A00;
                A002.A07(1, A002.A07.A03);
                A002.A07(5, A002.A0A);
                A002.A07(6, A002.A09);
                A002.A07(3, A002.A08);
                A002.A07(10, A002.A06);
                A002.A07(7, r32);
                C30757DjC djC = A002.A02;
                if (djC != null) {
                    djC.onMobileBoostInit(A002);
                }
                A002.A08(context, A002.A04.A00());
                if (System.currentTimeMillis() - C05760Lv.A01.A00.getLong("mobile_boost_analytics_last_send_timestamp", 0) > C51822Mg.A00) {
                    C05760Lv r03 = C05760Lv.A01;
                    r03.A00.edit().putLong("mobile_boost_analytics_last_send_timestamp", System.currentTimeMillis()).apply();
                    synchronized (C45241xW.class) {
                        SharedPreferences A003 = C197068bw.A00("MB_LOGS_LOCATIONS", context);
                        if (A003 != null) {
                            for (String A004 : A003.getAll().keySet()) {
                                SharedPreferences A005 = C197068bw.A00(A004, context);
                                if (A005 != null) {
                                    AnonymousClass0P4 A006 = AnonymousClass0P4.A00("android_mobileboost_usage_reporting", (AnonymousClass0RN) null);
                                    for (C68042yK r12 : C45241xW.A00) {
                                        String str = r12.A01;
                                        if (str.equals("qpl_marker")) {
                                            A006.A0G(str, A005.getString(str, "UNKNOWN MARKER"));
                                        } else {
                                            Integer num = r12.A00;
                                            if (num == Constants.ZERO) {
                                                A006.A0F(str, Long.valueOf(A005.getLong(str, 0)));
                                            } else if (num == Constants.ONE) {
                                                A006.A0G(str, A005.getString(str, ""));
                                            }
                                        }
                                    }
                                    AnonymousClass0WN.A01(r4).BcG(A006);
                                }
                            }
                            C45241xW.A00(context);
                        }
                    }
                }
            }
        } catch (Throwable th) {
            AnonymousClass0QD.A05("StartupManager", "failed to initialize mobileboost", th);
        }
    }
}
