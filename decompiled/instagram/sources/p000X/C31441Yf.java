package p000X;

import android.view.View;

/* renamed from: X.1Yf  reason: invalid class name and case insensitive filesystem */
public final class C31441Yf implements C31431Ye {
    public final /* synthetic */ C31391Ya A00;

    public C31441Yf(C31391Ya r1) {
        this.A00 = r1;
    }

    public final View AI1(int i) {
        return this.A00.A0a(i);
    }

    public final int ARb() {
        C31391Ya r0 = this.A00;
        return r0.A03 - r0.A0T();
    }

    public final int ARc() {
        return this.A00.A0U();
    }

    public final int AI6(View view) {
        return this.A00.A0V(view) + ((AnonymousClass1ZN) view.getLayoutParams()).bottomMargin;
    }

    public final int AI8(View view) {
        return this.A00.A0Y(view) - ((AnonymousClass1ZN) view.getLayoutParams()).topMargin;
    }
}
