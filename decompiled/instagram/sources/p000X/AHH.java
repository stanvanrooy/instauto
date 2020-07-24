package p000X;

import android.view.View;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import com.facebook.react.uimanager.BaseViewManager;

/* renamed from: X.AHH */
public final class AHH extends AnonymousClass2WR {
    public final /* synthetic */ AnonymousClass2W2 A00;

    public AHH(AnonymousClass2W2 r1) {
        this.A00 = r1;
    }

    public final void Arh(View view) {
        View view2;
        AnonymousClass2W2 r1 = this.A00;
        if (r1.A0C && (view2 = r1.A05) != null) {
            view2.setTranslationY(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
            this.A00.A09.setTranslationY(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
        }
        this.A00.A09.setVisibility(8);
        this.A00.A09.setTransitioning(false);
        AnonymousClass2W2 r3 = this.A00;
        r3.A08 = null;
        AnonymousClass2WJ r12 = r3.A06;
        if (r12 != null) {
            r12.Azf(r3.A07);
            r3.A07 = null;
            r3.A06 = null;
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.A00.A0A;
        if (actionBarOverlayLayout != null) {
            AnonymousClass1E1.A0J(actionBarOverlayLayout);
        }
    }
}
