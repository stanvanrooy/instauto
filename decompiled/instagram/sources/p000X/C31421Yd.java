package p000X;

import android.view.View;

/* renamed from: X.1Yd  reason: invalid class name and case insensitive filesystem */
public final class C31421Yd implements C31431Ye {
    public final /* synthetic */ C31391Ya A00;

    public C31421Yd(C31391Ya r1) {
        this.A00 = r1;
    }

    public final View AI1(int i) {
        return this.A00.A0a(i);
    }

    public final int ARb() {
        C31391Ya r0 = this.A00;
        return r0.A06 - r0.A0Q();
    }

    public final int ARc() {
        return this.A00.A0P();
    }

    public final int AI6(View view) {
        return this.A00.A0X(view) + ((AnonymousClass1ZN) view.getLayoutParams()).rightMargin;
    }

    public final int AI8(View view) {
        return this.A00.A0W(view) - ((AnonymousClass1ZN) view.getLayoutParams()).leftMargin;
    }
}
