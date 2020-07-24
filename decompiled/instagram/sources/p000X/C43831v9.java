package p000X;

import android.content.Context;
import android.os.Build;
import java.util.Set;

/* renamed from: X.1v9  reason: invalid class name and case insensitive filesystem */
public final class C43831v9 implements AnonymousClass0Q6, C06570Po {
    public AnonymousClass0C1 A00;
    public String A01;
    public AnonymousClass2IT A02;
    public boolean A03;
    public final String A04;
    public final int A05;
    public final C11200ea A06 = new C43841vA(this);
    public final C43851vB A07;

    public static synchronized void A01(C43831v9 r1, String str) {
        synchronized (r1) {
            if (str.equals(r1.A01)) {
                r1.A02 = null;
            }
        }
    }

    public static synchronized void A02(C43831v9 r9, String str, String str2, int i) {
        String str3;
        synchronized (r9) {
            if (str.equals(r9.A01)) {
                if (i < r9.A05) {
                    boolean z = false;
                    if (Build.VERSION.SDK_INT >= 29) {
                        z = true;
                    }
                    if ((z && AnonymousClass0Q7.A03().A0J()) || AnonymousClass0Q7.A03().A0H()) {
                        AnonymousClass0Q7.A03().A0H();
                    } else if (C44081vZ.A00(r9.A07.A04(), Constants.A0C, (Set) null, (Set) null) == Constants.A0N) {
                        r9.A03(false);
                        AnonymousClass2IT A062 = r9.A07.A06();
                        r9.A02 = A062;
                        if (i == 0) {
                            if (str2 == null) {
                                str3 = "ig_place_tagging";
                            } else {
                                str3 = AnonymousClass000.A0E("ig_place_tagging", str2);
                            }
                        } else if (str2 == null) {
                            str3 = "ig_place_tagging_extra";
                        } else {
                            str3 = AnonymousClass000.A0E(str2, "ig_place_tagging_extra");
                        }
                        C50892Ig r6 = new C50892Ig();
                        r6.A07 = true;
                        r6.A05 = true;
                        r6.A08 = true;
                        r6.A04 = str;
                        r6.A06 = false;
                        if (i != 0) {
                            C50882If r4 = new C50882If(10000, 1800000);
                            r4.A00 = true;
                            r6.A03 = r4;
                        }
                        A062.A04(new C50902Ih(r6), str3);
                        AnonymousClass2MU.A03(r9.A02, new C200258hh(r9, str, i, str2), r9.A07.A09());
                    }
                }
                r9.A01 = null;
            }
        }
    }

    private synchronized void A03(boolean z) {
        AnonymousClass2IT r0 = this.A02;
        if (r0 != null && !r0.isDone()) {
            this.A02.cancel(true);
        }
        if (z) {
            this.A01 = null;
        }
    }

    public static synchronized void A00(Context context, AnonymousClass0C1 r6) {
        Class<C43831v9> cls = C43831v9.class;
        synchronized (cls) {
            if (((C43831v9) r6.AV9(cls)) == null) {
                C43831v9 r3 = new C43831v9(context, r6);
                boolean z = false;
                if (Build.VERSION.SDK_INT >= 29) {
                    z = true;
                }
                if (z) {
                    AnonymousClass0Q7.A03().A0C(r3);
                } else {
                    AnonymousClass0Q7.A03().A0B(r3);
                }
                r6.BYi(cls, r3);
            }
        }
    }

    public final void onUserSessionWillEnd(boolean z) {
        C23300zv.A00(this.A00).A03(C43921vI.class, this.A06);
        boolean z2 = false;
        if (Build.VERSION.SDK_INT >= 29) {
            z2 = true;
        }
        if (z2) {
            AnonymousClass0Q7.A03().A05.remove(this);
        } else {
            AnonymousClass0Q7.A03().A0D(this);
        }
        this.A00 = null;
    }

    public C43831v9(Context context, AnonymousClass0C1 r6) {
        this.A00 = r6;
        this.A07 = C43851vB.A00(context, r6);
        this.A04 = C05860Mt.A02.A05(context);
        C23300zv.A00(this.A00).A02(C43921vI.class, this.A06);
        AnonymousClass0L7 r3 = AnonymousClass0L7.PLACE_SIGNATURE;
        this.A03 = ((Boolean) AnonymousClass0L6.A02(r6, r3, "is_cancel_on_exit_enabled", true, (AnonymousClass04H) null)).booleanValue();
        int intValue = ((Integer) AnonymousClass0L6.A02(r6, r3, "num_place_signature_collections", 1, (AnonymousClass04H) null)).intValue();
        this.A05 = intValue < 0 ? 1 : intValue;
    }

    public final void onAppBackgrounded() {
        int A032 = AnonymousClass0Z0.A03(576731480);
        if (this.A03) {
            A03(true);
        }
        AnonymousClass0Z0.A0A(-1120207662, A032);
    }

    public final void onAppForegrounded() {
        AnonymousClass0Z0.A0A(-2050953189, AnonymousClass0Z0.A03(-1286867608));
    }
}
