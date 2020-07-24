package p000X;

import android.view.View;
import com.facebook.react.uimanager.BaseViewManager;

/* renamed from: X.AOP */
public final class AOP implements View.OnClickListener {
    public final /* synthetic */ C23472ANu A00;

    public AOP(C23472ANu aNu) {
        this.A00 = aNu;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0Z0.A05(923773277);
        C23472ANu aNu = this.A00;
        C476624x.A08(true, aNu.A01, aNu.A06, aNu.A04);
        aNu.A08.setAlpha(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
        aNu.A08.setVisibility(0);
        aNu.A08.A02();
        C476624x.A09(true, aNu.A08);
        aNu.A08.setOnFilterTextListener(aNu);
        AnonymousClass0Z0.A0C(-898053514, A05);
    }
}
