package p000X;

import android.view.MotionEvent;

/* renamed from: X.1go  reason: invalid class name and case insensitive filesystem */
public final class C35711go implements Runnable {
    public MotionEvent A00;
    public boolean A01;
    public final C35691gm A02;

    public final void run() {
        this.A01 = true;
        MotionEvent motionEvent = this.A00;
        if (motionEvent != null) {
            C35691gm.A00(this.A02, motionEvent);
            this.A00.recycle();
            this.A00 = null;
        }
    }

    public C35711go(C35691gm r1) {
        this.A02 = r1;
    }
}
