package p000X;

import android.view.CollapsibleActionView;
import android.view.View;
import android.widget.FrameLayout;

/* renamed from: X.AID */
public final class AID extends FrameLayout implements C23323AHy {
    public final CollapsibleActionView A00;

    public final void onActionViewCollapsed() {
        this.A00.onActionViewCollapsed();
    }

    public final void onActionViewExpanded() {
        this.A00.onActionViewExpanded();
    }

    public AID(View view) {
        super(view.getContext());
        this.A00 = (CollapsibleActionView) view;
        addView(view);
    }
}
