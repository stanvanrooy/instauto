package p000X;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: X.CZI */
public final class CZI implements View.OnTouchListener {
    public final C38471lK A00;
    public final /* synthetic */ AnonymousClass1NJ A01;
    public final /* synthetic */ CZA A02;
    public final /* synthetic */ CZH A03;
    public final /* synthetic */ C30391Tq A04;
    public final /* synthetic */ C36841ih A05;

    public CZI(CZH czh, C30391Tq r9, CZA cza, AnonymousClass1NJ r11, C36841ih r12) {
        this.A03 = czh;
        this.A04 = r9;
        this.A02 = cza;
        this.A01 = r11;
        this.A05 = r12;
        this.A00 = new C38471lK(czh.A00, r9, cza.A08, r11, r12, 0);
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        return this.A00.B4G(motionEvent);
    }
}
