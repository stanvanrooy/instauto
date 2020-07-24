package p000X;

import android.graphics.Rect;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.smartcapture.components.ContourView;
import com.facebook.smartcapture.components.DottedAlignmentView;
import com.instagram.arlink.fragment.ArLinkScanControllerImpl;

/* renamed from: X.C4t */
public final class C4t implements Runnable {
    public final /* synthetic */ Rect A00;
    public final /* synthetic */ ContourView A01;
    public final /* synthetic */ Integer A02;
    public final /* synthetic */ boolean A03;

    public C4t(ContourView contourView, Integer num, Rect rect, boolean z) {
        this.A01 = contourView;
        this.A02 = num;
        this.A00 = rect;
        this.A03 = z;
    }

    public final void run() {
        ContourView contourView = this.A01;
        Integer num = this.A02;
        Rect rect = this.A00;
        if (num == Constants.A12) {
            ContourView.A00(contourView.A09, rect, contourView.A00);
            contourView.A09.setVisibility(0);
            contourView.A09.animate().alpha(1.0f).start();
            DottedAlignmentView dottedAlignmentView = contourView.A09;
            dottedAlignmentView.post(new C213019Gp(dottedAlignmentView));
        } else {
            DottedAlignmentView dottedAlignmentView2 = contourView.A09;
            dottedAlignmentView2.post(new C213029Gq(dottedAlignmentView2));
            contourView.A09.setVisibility(8);
            contourView.A09.setAlpha(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
        }
        ContourView contourView2 = this.A01;
        Integer num2 = this.A02;
        Rect rect2 = this.A00;
        if (num2 == Constants.ONE || num2 == Constants.A0j) {
            ContourView.A00(contourView2.A07, rect2, contourView2.A01);
            contourView2.A07.animate().alpha(1.0f).start();
            if (num2 == Constants.A0j) {
                contourView2.A07.postDelayed(new C57(contourView2), ArLinkScanControllerImpl.ERROR_DELAY_MS);
            }
        } else {
            contourView2.A07.animate().alpha(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER).start();
        }
        ContourView contourView3 = this.A01;
        Rect rect3 = this.A00;
        int i = rect3.left;
        int width = rect3.right - contourView3.A05.getWidth();
        Rect rect4 = this.A00;
        int i2 = rect4.top;
        int height = rect4.bottom - this.A01.A05.getHeight();
        boolean z = this.A03;
        float f = (float) height;
        float f2 = contourView3.A02 + f;
        if (z) {
            float f3 = (float) i;
            float f4 = (float) i2;
            contourView3.A05.animate().x(f3).y(f4);
            float f5 = (float) width;
            contourView3.A06.animate().x(f5).y(f4);
            contourView3.A03.animate().x(f3).y(f);
            contourView3.A04.animate().x(f5).y(f);
            contourView3.A08.animate().y(f2);
        } else {
            float f6 = (float) i;
            contourView3.A05.setX(f6);
            float f7 = (float) i2;
            contourView3.A05.setY(f7);
            float f8 = (float) width;
            contourView3.A06.setX(f8);
            contourView3.A06.setY(f7);
            contourView3.A03.setX(f6);
            contourView3.A03.setY(f);
            contourView3.A04.setX(f8);
            contourView3.A04.setY(f);
            contourView3.A08.setY(f2);
        }
        ContourView contourView4 = this.A01;
        if (contourView4.A0A) {
            contourView4.animate().alpha(1.0f).start();
            this.A01.A0A = false;
        }
    }
}
