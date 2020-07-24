package p000X;

import android.view.View;
import com.instagram.notifications.badging.p007ui.component.ToastingBadge;

/* renamed from: X.BE1 */
public final class BE1 implements View.OnClickListener {
    public final /* synthetic */ ToastingBadge A00;

    public BE1(ToastingBadge toastingBadge) {
        this.A00 = toastingBadge;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0Z0.A05(753727042);
        if (!this.A00.isSelected() || this.A00.A09) {
            ToastingBadge.getViewModel(this.A00).A02();
        }
        AnonymousClass0Z0.A0C(-167073414, A05);
    }
}
