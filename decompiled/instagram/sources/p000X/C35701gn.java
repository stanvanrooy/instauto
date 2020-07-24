package p000X;

import android.view.GestureDetector;
import android.view.MotionEvent;

/* renamed from: X.1gn  reason: invalid class name and case insensitive filesystem */
public final class C35701gn extends GestureDetector.SimpleOnGestureListener {
    public final /* synthetic */ C35691gm A00;
    public final /* synthetic */ C35651gi A01;

    public C35701gn(C35691gm r1, C35651gi r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public final void onLongPress(MotionEvent motionEvent) {
        this.A00.A01 = true;
        if (!this.A01.A0B.isAttachedToWindow()) {
            AnonymousClass0QD.A01("BouncyPressStateOnTouchListener", "Long press action detected but touch handling view is no longer attached to the window.");
        }
        this.A00.A08.BA5(this.A01.A0B);
    }
}
