package p000X;

import android.content.Context;
import android.view.GestureDetector;

/* renamed from: X.1wE  reason: invalid class name and case insensitive filesystem */
public final class C44481wE {
    public final int A00;
    public final GestureDetector A01;
    public final AnonymousClass1U7 A02;
    public final C44461wC A03;
    public final AnonymousClass1NJ A04;
    public final C36841ih A05;
    public final C38511lO A06;

    public C44481wE(Context context, AnonymousClass1U7 r5, C44461wC r6, int i, AnonymousClass1NJ r8, C36841ih r9) {
        C44491wF r2 = new C44491wF(this);
        GestureDetector gestureDetector = new GestureDetector(context, r2);
        this.A01 = gestureDetector;
        gestureDetector.setIsLongpressEnabled(false);
        C38511lO r0 = new C38511lO(context);
        this.A06 = r0;
        r0.A00(r2);
        this.A02 = r5;
        this.A03 = r6;
        this.A00 = i;
        this.A04 = r8;
        this.A05 = r9;
    }
}
