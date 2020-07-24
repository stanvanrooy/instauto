package p000X;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;

/* renamed from: X.1lK  reason: invalid class name and case insensitive filesystem */
public final class C38471lK implements C38481lL {
    public final int A00;
    public final Context A01;
    public final AnonymousClass1NJ A02;
    public final C30391Tq A03;
    public final C32151ag A04;
    public final C36841ih A05;
    public final GestureDetector A06;
    public final C38511lO A07;

    public C38471lK(Context context, C30391Tq r5, C32151ag r6, AnonymousClass1NJ r7, C36841ih r8, int i) {
        C38491lM r2 = new C38491lM(this);
        GestureDetector gestureDetector = new GestureDetector(context, r2);
        this.A06 = gestureDetector;
        gestureDetector.setIsLongpressEnabled(false);
        C38511lO r0 = new C38511lO(context);
        this.A07 = r0;
        r0.A00(r2);
        this.A01 = context;
        this.A03 = r5;
        this.A04 = r6;
        this.A02 = r7;
        this.A05 = r8;
        this.A00 = i;
    }

    public final boolean B4G(MotionEvent motionEvent) {
        if (motionEvent.getPointerCount() >= 2 && this.A04.A07.getParent() != null) {
            this.A04.A07.getParent().requestDisallowInterceptTouchEvent(true);
        }
        int actionMasked = motionEvent.getActionMasked();
        if ((actionMasked == 1 || actionMasked == 3) && this.A04.A07.getParent() != null) {
            this.A04.A07.getParent().requestDisallowInterceptTouchEvent(false);
        }
        this.A07.A01(motionEvent);
        this.A06.onTouchEvent(motionEvent);
        return true;
    }
}
