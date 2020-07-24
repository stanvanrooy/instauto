package p000X;

import android.content.Context;
import android.view.View;
import com.facebook.react.uimanager.BaseViewManager;

/* renamed from: X.AAC */
public final class AAC implements C23232ADv {
    public final /* synthetic */ AnonymousClass2D8 A00;

    public AAC(AnonymousClass2D8 r1) {
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ void A6S(Context context, Object obj, Object obj2, Object obj3) {
        View view = (View) obj;
        view.setScaleX(this.A00.A01.A02);
        view.setScaleY(this.A00.A01.A03);
        view.setTranslationX(this.A00.A01.A04);
        view.setTranslationY(this.A00.A01.A05);
        view.setRotation(this.A00.A01.A01);
        view.setAlpha(this.A00.A01.A00);
    }

    public final void Bs0(Context context, Object obj, Object obj2, Object obj3) {
        View view = (View) obj;
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
        view.setTranslationX(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
        view.setTranslationY(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
        view.setRotation(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
        view.setAlpha(1.0f);
    }

    public final boolean Bng(Object obj, Object obj2, Object obj3, Object obj4) {
        return true;
    }
}
