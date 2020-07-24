package p000X;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: X.DTE */
public final class DTE implements View.OnTouchListener {
    public final DTI A00;
    public final /* synthetic */ C36411i0 A01;
    public final /* synthetic */ C30751Vb A02;
    public final /* synthetic */ AnonymousClass1NJ A03;
    public final /* synthetic */ C36841ih A04;

    public DTE(C30751Vb r8, C36411i0 r9, int i, AnonymousClass1NJ r11, C36841ih r12) {
        this.A02 = r8;
        this.A01 = r9;
        this.A03 = r11;
        this.A04 = r12;
        this.A00 = new DTI(r8.A01, r8.A02, r9, i, r11, r12);
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        DTI dti = this.A00;
        if (motionEvent.getPointerCount() >= 2 && dti.A03.A0A.getParent() != null) {
            dti.A03.A0A.getParent().requestDisallowInterceptTouchEvent(true);
        }
        int actionMasked = motionEvent.getActionMasked();
        if ((actionMasked == 1 || actionMasked == 3) && dti.A03.A0A.getParent() != null) {
            dti.A03.A0A.getParent().requestDisallowInterceptTouchEvent(false);
        }
        dti.A06.A01(motionEvent);
        dti.A01.onTouchEvent(motionEvent);
        return true;
    }
}
