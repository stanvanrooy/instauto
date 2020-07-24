package p000X;

import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.A0Z */
public final class A0Z {
    public static Handler A07;
    public long A00 = -1;
    public Runnable A01;
    public boolean A02;
    public final SparseArray A03 = new SparseArray(0);
    public final A0V A04 = new A0U();
    public final A0V A05 = new A0T();
    public final A0V A06 = new C226349oh();

    public static void A01(A0Z a0z, View view) {
        view.setClickable(false);
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                A01(a0z, viewGroup.getChildAt(i));
            }
        }
    }

    public final boolean A03(View view) {
        if (view != null) {
            return (this.A02 && view.getParent() != null) || this.A03.get(view.getId()) != null;
        }
        return false;
    }

    public static void A00(A0Z a0z, long j) {
        if (A07 == null) {
            A07 = new Handler(Looper.getMainLooper());
        }
        Runnable runnable = a0z.A01;
        if (runnable != null) {
            AnonymousClass0ZA.A08(A07, runnable);
            AnonymousClass0ZA.A09(A07, a0z.A01, j, -2095698504);
        }
    }

    public final void A02() {
        A0V a0v = this.A04;
        a0v.A03 = null;
        a0v.A01 = 0;
        a0v.A00 = 0;
        a0v.A02 = null;
        A0V a0v2 = this.A06;
        a0v2.A03 = null;
        a0v2.A01 = 0;
        a0v2.A00 = 0;
        a0v2.A02 = null;
        A0V a0v3 = this.A05;
        a0v3.A03 = null;
        a0v3.A01 = 0;
        a0v3.A00 = 0;
        a0v3.A02 = null;
        this.A01 = null;
        this.A02 = false;
        this.A00 = -1;
    }
}
