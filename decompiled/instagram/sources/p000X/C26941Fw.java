package p000X;

import android.view.View;
import androidx.fragment.app.FragmentActivity;

/* renamed from: X.1Fw  reason: invalid class name and case insensitive filesystem */
public final class C26941Fw implements C06570Po {
    public View A00;
    public AnonymousClass1HD A01;
    public FragmentActivity A02;
    public C105204gU A03;
    public boolean A04;
    public boolean A05;
    public final AnonymousClass0C1 A06;

    public static void A00(C26941Fw r3) {
        r3.A05 = false;
        r3.A04 = false;
        AnonymousClass0C1 r32 = r3.A06;
        C27665CMj.A00(r32).edit().putInt("tag_products_tooltip_seen_count", 0).apply();
        C27665CMj.A00(r32).edit().putLong("tag_products_tooltip_last_shown_time_sec", 0).apply();
    }

    public final void A01(FragmentActivity fragmentActivity, AnonymousClass1HD r4) {
        this.A05 = true;
        this.A02 = fragmentActivity;
        this.A01 = r4;
        C105204gU A0e = C17510qM.A00.A0e(this.A06);
        this.A03 = A0e;
        if (r4 instanceof C27341Hl) {
            ((C27341Hl) r4).registerLifecycleListener(A0e);
        }
    }

    public C26941Fw(AnonymousClass0C1 r1) {
        this.A06 = r1;
    }

    public final void onUserSessionWillEnd(boolean z) {
        A00(this);
    }
}
