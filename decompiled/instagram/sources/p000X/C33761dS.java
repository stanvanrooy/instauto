package p000X;

import android.view.View;

/* renamed from: X.1dS  reason: invalid class name and case insensitive filesystem */
public final class C33761dS implements View.OnLongClickListener {
    public final /* synthetic */ AnonymousClass1IH A00;

    public C33761dS(AnonymousClass1IH r1) {
        this.A00 = r1;
    }

    public final boolean onLongClick(View view) {
        C27321Hj A002 = AnonymousClass1IH.A00(this.A00);
        if (A002 == null) {
            return true;
        }
        C27541Ig.A02(A002.A0V, A002.getActivity());
        return true;
    }
}
