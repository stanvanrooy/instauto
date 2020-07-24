package p000X;

import com.facebook.react.uimanager.BaseViewManager;

/* renamed from: X.CWT */
public final class CWT implements C102614bo {
    public final /* synthetic */ CWQ A00;

    public CWT(CWQ cwq) {
        this.A00 = cwq;
    }

    public final void BJZ() {
        CWQ cwq = this.A00;
        switch (cwq.A0C.intValue()) {
            case 1:
                cwq.A00.setTranslationY(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
                this.A00.A00.setVisibility(0);
                break;
            case 2:
                cwq.A00.setTranslationY((float) cwq.A0L);
                this.A00.A00.setVisibility(8);
                break;
        }
        this.A00.A0S.onFinish();
    }
}
