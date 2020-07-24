package p000X;

import android.content.Context;
import android.view.GestureDetector;

/* renamed from: X.DTC */
public final class DTC {
    public final int A00;
    public final GestureDetector A01;
    public final AnonymousClass1UB A02;
    public final AnonymousClass2Z9 A03;
    public final AnonymousClass1NJ A04;
    public final C36841ih A05;
    public final C38511lO A06;

    public DTC(Context context, AnonymousClass1UB r5, AnonymousClass2Z9 r6, int i, AnonymousClass1NJ r8, C36841ih r9) {
        DTD dtd = new DTD(this);
        GestureDetector gestureDetector = new GestureDetector(context, dtd);
        this.A01 = gestureDetector;
        gestureDetector.setIsLongpressEnabled(false);
        C38511lO r0 = new C38511lO(context);
        this.A06 = r0;
        r0.A00(dtd);
        this.A02 = r5;
        this.A03 = r6;
        this.A00 = i;
        this.A04 = r8;
        this.A05 = r9;
    }
}
