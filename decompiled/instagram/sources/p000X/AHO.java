package p000X;

import android.view.View;
import android.widget.PopupWindow;

/* renamed from: X.AHO */
public final class AHO extends AnonymousClass2WR {
    public final /* synthetic */ AnonymousClass2WK A00;

    public AHO(AnonymousClass2WK r1) {
        this.A00 = r1;
    }

    public final void Arh(View view) {
        this.A00.A01.A0F.setVisibility(8);
        AnonymousClass1AZ r1 = this.A00.A01;
        PopupWindow popupWindow = r1.A06;
        if (popupWindow != null) {
            popupWindow.dismiss();
        } else if (r1.A0F.getParent() instanceof View) {
            AnonymousClass1E1.A0J((View) this.A00.A01.A0F.getParent());
        }
        this.A00.A01.A0F.removeAllViews();
        this.A00.A01.A0H.A04((AnonymousClass2WS) null);
        this.A00.A01.A0H = null;
    }
}
