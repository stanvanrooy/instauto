package p000X;

import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import com.instagram.common.p004ui.widget.framelayout.MediaFrameLayout;

/* renamed from: X.DTF */
public final class DTF extends C481226s {
    public final DTG A00;
    public final /* synthetic */ MediaFrameLayout A01;
    public final /* synthetic */ C36411i0 A02;
    public final /* synthetic */ C30751Vb A03;
    public final /* synthetic */ AnonymousClass1NJ A04;
    public final /* synthetic */ C36841ih A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DTF(C30751Vb r10, C06590Pq r11, C36411i0 r12, MediaFrameLayout mediaFrameLayout, int i, int i2, AnonymousClass1NJ r16, C36841ih r17) {
        super(r11);
        this.A03 = r10;
        this.A02 = r12;
        this.A01 = mediaFrameLayout;
        AnonymousClass1NJ r7 = r16;
        this.A04 = r7;
        C36841ih r8 = r17;
        this.A05 = r8;
        this.A00 = new DTG(r10.A01, r10.A02, r12, mediaFrameLayout, i, i2, r7, r8);
    }

    public final boolean A01(View view, MotionEvent motionEvent) {
        View view2;
        Drawable drawable;
        DTG dtg = this.A00;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            view2 = dtg.A07.A03;
            drawable = dtg.A03;
            view2.setBackground(drawable);
        } else if (actionMasked == 1 || actionMasked == 3) {
            if (dtg.A05.getParent() != null) {
                dtg.A05.getParent().requestDisallowInterceptTouchEvent(false);
            }
            view2 = dtg.A07.A03;
            drawable = dtg.A02;
            view2.setBackground(drawable);
        }
        dtg.A04.onTouchEvent(motionEvent);
        return true;
    }
}
