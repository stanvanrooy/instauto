package p000X;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.1Or  reason: invalid class name and case insensitive filesystem */
public abstract class C29121Or implements C29131Os {
    public int ANH(int i, Object obj, Object obj2) {
        return Integer.MAX_VALUE;
    }

    public int AaQ(int i, Object obj, Object obj2) {
        return Integer.MAX_VALUE;
    }

    public void BVd(View view, int i, Object obj, Object obj2) {
    }

    public void onViewDetachedFromWindow(View view) {
    }

    public View AaJ(int i, View view, ViewGroup viewGroup, Object obj, Object obj2) {
        int A03 = AnonymousClass0Z0.A03(-2048425802);
        if (view == null) {
            view = ABB(i, viewGroup);
        }
        A6f(i, view, obj, obj2);
        AnonymousClass0Z0.A0A(1534779901, A03);
        return view;
    }

    public String AaR(int i) {
        return AnonymousClass000.A0H(getClass().getSimpleName(), "[", i, "]");
    }

    public boolean AfG(int i, Object obj, Object obj2) {
        return C255419e.A00;
    }
}
