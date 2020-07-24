package p000X;

import android.view.View;
import androidx.appcompat.widget.Toolbar;

/* renamed from: X.AHY */
public final class AHY implements View.OnClickListener {
    public final /* synthetic */ Toolbar A00;

    public AHY(Toolbar toolbar) {
        this.A00 = toolbar;
    }

    public final void onClick(View view) {
        AnonymousClass99I r0;
        int A05 = AnonymousClass0Z0.A05(-1884120641);
        C23299AGz aGz = this.A00.A0G;
        if (aGz == null) {
            r0 = null;
        } else {
            r0 = aGz.A01;
        }
        if (r0 != null) {
            r0.collapseActionView();
        }
        AnonymousClass0Z0.A0C(677761098, A05);
    }
}
