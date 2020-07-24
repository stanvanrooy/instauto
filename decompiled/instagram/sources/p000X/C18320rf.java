package p000X;

import android.content.Context;
import java.util.List;

/* renamed from: X.0rf  reason: invalid class name and case insensitive filesystem */
public abstract class C18320rf {
    public static C18320rf A00;

    public abstract C17850qu A01(AnonymousClass0C1 r1);

    public abstract C17850qu A02(AnonymousClass0C1 r1, String str);

    public abstract AnonymousClass6LM A03();

    public abstract AnonymousClass2V0 A04();

    public abstract C67182wk A05(AnonymousClass0C1 r1);

    public abstract void A06(Context context, AnonymousClass1L8 r2, AnonymousClass0C1 r3, String str, C109584np r5);

    public abstract void A07(Context context, AnonymousClass1L8 r2, AnonymousClass0C1 r3, String str, C109584np r5);

    public abstract void A08(Context context, AnonymousClass1L8 r2, AnonymousClass0C1 r3, List list, C109584np r5);

    public static boolean A00(AnonymousClass0C1 r8, boolean z) {
        Object A02;
        C05000Hl r2 = new C05000Hl("is_enabled", AnonymousClass0L7.RESTRICT_KILLSWITCH_LAUNCHER, false, (String[]) null, (AnonymousClass04H) null);
        boolean z2 = false;
        if (A00 != null) {
            z2 = true;
        }
        if (!z2 || !z) {
            A02 = C05570Lc.A02(r2, r8);
        } else {
            A02 = r2.A01(r8);
        }
        return ((Boolean) A02).booleanValue();
    }
}
