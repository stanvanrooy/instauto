package p000X;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: X.DTB */
public final class DTB implements View.OnTouchListener {
    public final DTC A00;
    public final /* synthetic */ AnonymousClass2Z9 A01;
    public final /* synthetic */ C44431w9 A02;
    public final /* synthetic */ AnonymousClass1NJ A03;
    public final /* synthetic */ C36841ih A04;

    public DTB(C44431w9 r8, AnonymousClass2Z9 r9, int i, AnonymousClass1NJ r11, C36841ih r12) {
        this.A02 = r8;
        this.A01 = r9;
        this.A03 = r11;
        this.A04 = r12;
        this.A00 = new DTC(r8.A00, r8.A01, r9, i, r11, r12);
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        DTC dtc = this.A00;
        if (motionEvent.getPointerCount() >= 2 && dtc.A03.A01.getParent() != null) {
            dtc.A03.A01.getParent().requestDisallowInterceptTouchEvent(true);
        }
        int actionMasked = motionEvent.getActionMasked();
        if ((actionMasked == 1 || actionMasked == 3) && dtc.A03.A01.getParent() != null) {
            dtc.A03.A01.getParent().requestDisallowInterceptTouchEvent(false);
        }
        dtc.A06.A01(motionEvent);
        dtc.A01.onTouchEvent(motionEvent);
        return true;
    }
}
