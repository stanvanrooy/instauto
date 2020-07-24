package p000X;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.view.View;
import com.facebook.C0003R;

/* renamed from: X.1z7  reason: invalid class name and case insensitive filesystem */
public final class C46091z7 implements Runnable {
    public final /* synthetic */ C46081z6 A00;

    public C46091z7(C46081z6 r1) {
        this.A00 = r1;
    }

    public final void run() {
        int i;
        C35491gS r0 = C27141Gq.A02;
        if (r0 == null) {
            AnonymousClass0QD.A01("SwipeNavigationStatusBarManager", "windowInsets is null");
            return;
        }
        int A02 = r0.A02();
        int A03 = r0.A03();
        C46321zY r7 = new C46321zY(this.A00.A04, A02);
        if (C46081z6.A02()) {
            i = this.A00.A04;
        } else {
            i = -16777216;
        }
        this.A00.A06.setBackground(new LayerDrawable(new Drawable[]{r7, new C46331zZ(i, A03)}));
        boolean booleanValue = ((Boolean) C05640Lj.A00(AnonymousClass0L7.COORDINATORLAYOUT_ROOT_LAYOUT, "is_enabled", false)).booleanValue();
        Activity activity = this.A00.A05;
        int i2 = C0003R.C0005id.layout_container_center_right_frame_layout;
        if (booleanValue) {
            i2 = C0003R.C0005id.layout_container_center_right_coordinator_layout;
        }
        View A09 = C36431i2.A09(activity, i2);
        C06220Of.A0S(A09, A02);
        C06220Of.A0I(A09, A03);
    }
}
