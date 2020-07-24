package p000X;

import android.content.Context;

/* renamed from: X.A2B */
public final class A2B extends C23081A5s {
    public final C06590Pq A00;
    public final A3H A01;

    public A2B(Context context, C06590Pq r2, A3H a3h) {
        super(context);
        this.A00 = r2;
        this.A01 = a3h;
    }

    public final void onAttachedToWindow() {
        int A06 = AnonymousClass0Z0.A06(2015222884);
        super.onAttachedToWindow();
        if (this.A01 != null) {
            C16920pO.getInstance().getPerformanceLogger(this.A00).BQd();
        }
        AnonymousClass0Z0.A0D(1411489335, A06);
    }
}
