package p000X;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: X.1wD  reason: invalid class name and case insensitive filesystem */
public final class C44471wD implements View.OnTouchListener {
    public final C44481wE A00;
    public final /* synthetic */ C44461wC A01;
    public final /* synthetic */ C44411w7 A02;
    public final /* synthetic */ AnonymousClass1NJ A03;
    public final /* synthetic */ C36841ih A04;

    public C44471wD(C44411w7 r8, C44461wC r9, int i, AnonymousClass1NJ r11, C36841ih r12) {
        this.A02 = r8;
        this.A01 = r9;
        this.A03 = r11;
        this.A04 = r12;
        this.A00 = new C44481wE(r8.A01, r8.A02, r9, i, r11, r12);
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        C36841ih.A01(this.A04, 11);
        C44481wE r3 = this.A00;
        if (motionEvent.getPointerCount() >= 2 && r3.A03.A03.getParent() != null) {
            r3.A03.A03.getParent().requestDisallowInterceptTouchEvent(true);
        }
        int actionMasked = motionEvent.getActionMasked();
        if ((actionMasked == 1 || actionMasked == 3) && r3.A03.A03.getParent() != null) {
            r3.A03.A03.getParent().requestDisallowInterceptTouchEvent(false);
        }
        r3.A06.A01(motionEvent);
        r3.A01.onTouchEvent(motionEvent);
        return true;
    }
}
