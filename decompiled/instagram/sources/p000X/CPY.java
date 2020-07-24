package p000X;

import com.facebook.react.uimanager.BaseViewManager;

/* renamed from: X.CPY */
public final class CPY implements Runnable {
    public final /* synthetic */ CPV A00;

    public CPY(CPV cpv) {
        this.A00 = cpv;
    }

    public final void run() {
        CPV cpv = this.A00;
        C476524w A0T = C476624x.A07(cpv.A02).A0S(CPV.A06).A0T(true);
        A0T.A0L(1.0f, 0.9f, -1.0f);
        A0T.A0M(1.0f, 0.9f, -1.0f);
        A0T.A0G(1.0f, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
        A0T.A09 = new C27745CPp(cpv);
        A0T.A0O();
    }
}
