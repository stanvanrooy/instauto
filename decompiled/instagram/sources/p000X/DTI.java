package p000X;

import android.content.Context;
import android.view.GestureDetector;

/* renamed from: X.DTI */
public final class DTI {
    public final int A00;
    public final GestureDetector A01;
    public final AnonymousClass1UG A02;
    public final C36411i0 A03;
    public final AnonymousClass1NJ A04;
    public final C36841ih A05;
    public final C38511lO A06;

    public DTI(Context context, AnonymousClass1UG r5, C36411i0 r6, int i, AnonymousClass1NJ r8, C36841ih r9) {
        DTJ dtj = new DTJ(this);
        GestureDetector gestureDetector = new GestureDetector(context, dtj);
        this.A01 = gestureDetector;
        gestureDetector.setIsLongpressEnabled(false);
        C38511lO r0 = new C38511lO(context);
        this.A06 = r0;
        r0.A00(dtj);
        this.A02 = r5;
        this.A03 = r6;
        this.A00 = i;
        this.A04 = r8;
        this.A05 = r9;
    }
}
