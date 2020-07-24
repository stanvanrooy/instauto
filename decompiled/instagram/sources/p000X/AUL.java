package p000X;

import com.facebook.react.uimanager.BaseViewManager;

/* renamed from: X.AUL */
public final class AUL extends AnonymousClass2LX {
    public final /* synthetic */ AUJ A00;

    public AUL(AUJ auj) {
        this.A00 = auj;
    }

    public final void BOK(AnonymousClass1EG r6) {
        AUJ auj = this.A00;
        float A002 = (float) r6.A00();
        if (Float.compare(A002, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) == 0) {
            auj.A00 = Constants.A0N;
        }
        auj.A02.setTranslationY(A002);
    }
}
