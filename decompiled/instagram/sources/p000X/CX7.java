package p000X;

import com.facebook.react.uimanager.BaseViewManager;
import com.instagram.common.p004ui.widget.framelayout.MediaFrameLayout;

/* renamed from: X.CX7 */
public final class CX7 implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ CXF A01;
    public final /* synthetic */ C27926CWo A02;
    public final /* synthetic */ C27952CXo A03;
    public final /* synthetic */ String A04;

    public CX7(C27926CWo cWo, CXF cxf, C27952CXo cXo, int i, String str) {
        this.A02 = cWo;
        this.A01 = cxf;
        this.A03 = cXo;
        this.A00 = i;
        this.A04 = str;
    }

    public final void run() {
        C27926CWo cWo = this.A02;
        cWo.A02 = new C27948CXk(this.A01, this.A03, C17600qV.A01.A01(cWo.A07));
        C27926CWo cWo2 = this.A02;
        if (cWo2.A07 && this.A01.A02) {
            C27926CWo.A01(cWo2);
        }
        C27926CWo cWo3 = this.A02;
        C45541y6 r2 = cWo3.A04;
        CXF cxf = this.A01;
        C37671k2 r4 = cxf.A01;
        C27948CXk cXk = cWo3.A02;
        MediaFrameLayout mediaFrameLayout = cXk.A02.A01;
        int i = this.A00;
        boolean z = cxf.A02;
        float f = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
        if (z) {
            f = 1.0f;
        }
        r2.A0K((String) null, r4, mediaFrameLayout, -1, cXk, i, f, true, this.A04);
    }
}
