package p000X;

import android.app.Activity;
import android.view.View;

/* renamed from: X.AIP */
public final class AIP implements View.OnAttachStateChangeListener {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ AIM A01;

    public final void onViewDetachedFromWindow(View view) {
    }

    public AIP(AIM aim, Activity activity) {
        this.A01 = aim;
        this.A00 = activity;
    }

    public final void onViewAttachedToWindow(View view) {
        AIM.A01(this.A01, this.A00);
    }
}
