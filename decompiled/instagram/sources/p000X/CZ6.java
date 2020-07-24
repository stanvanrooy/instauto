package p000X;

import android.view.ViewTreeObserver;
import android.widget.LinearLayout;
import com.facebook.react.uimanager.BaseViewManager;

/* renamed from: X.CZ6 */
public final class CZ6 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ CZ5 A00;
    public final /* synthetic */ Runnable A01;

    public CZ6(CZ5 cz5, Runnable runnable) {
        this.A00 = cz5;
        this.A01 = runnable;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0146  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0159  */
    /* JADX WARNING: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    public final void onGlobalLayout() {
        float min;
        float f;
        float height;
        CZ5 cz5 = this.A00;
        cz5.A0B = false;
        if (!cz5.A0G) {
            cz5.A0F.A05.setVisibility(4);
        }
        cz5.A00 = (float) cz5.A0F.A05.getHeight();
        cz5.A02 = cz5.A0F.A00();
        float max = Math.max((((float) (cz5.A0F.A06.getHeight() - cz5.A0F.A09.getHeight())) - cz5.A02) / 2.0f, cz5.A00);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) cz5.A0F.A09.getLayoutParams();
        layoutParams.topMargin = (int) max;
        layoutParams.bottomMargin = (int) (max - ((float) cz5.A0F.A05.getHeight()));
        cz5.A0F.A09.setLayoutParams(layoutParams);
        cz5.A04 = max;
        if (cz5.A0F.A09.getHeight() == 0) {
            min = 1.0f;
        } else {
            min = Math.min(((((float) cz5.A0F.A06.getHeight()) - (cz5.A00 * 2.0f)) - ((float) cz5.A0F.A03.getMeasuredHeight())) / ((float) cz5.A0F.A09.getHeight()), 1.0f);
        }
        cz5.A08 = min;
        if (cz5.A0F.A09.getHeight() != 0) {
            float height2 = ((((float) cz5.A0F.A09.getHeight()) + (cz5.A04 * 2.0f)) + cz5.A02) - ((float) cz5.A0F.A06.getHeight());
            if (height2 >= BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
                f = (((float) cz5.A0F.A09.getHeight()) - height2) / ((float) cz5.A0F.A09.getHeight());
                cz5.A05 = f;
                if (cz5.A08 >= 1.0f) {
                    height = cz5.A00 - cz5.A04;
                } else {
                    height = (cz5.A02 - ((float) cz5.A0F.A03.getHeight())) / 2.0f;
                }
                cz5.A06 = height;
                cz5.A07 = (height - (((float) cz5.A0F.A09.getHeight()) * cz5.A05)) + (((float) cz5.A0F.A09.getHeight()) * cz5.A08);
                cz5.A01 = (((float) cz5.A0F.A06.getWidth()) - (((float) cz5.A0F.A09.getWidth()) * cz5.A05)) / 2.0f;
                cz5.A03 = (((float) cz5.A0F.A09.getHeight()) * cz5.A05) - ((float) cz5.A0F.A09.getHeight());
                cz5.A09++;
                this.A01.run();
                if (this.A00.A0F.A06.getHeight() > 0 && this.A00.A0F.A09.getHeight() > 0 && this.A00.A0F.A06.getViewTreeObserver().isAlive()) {
                    this.A00.A0F.A06.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                    this.A00.A0A = null;
                    return;
                }
                return;
            }
        }
        f = 1.0f;
        cz5.A05 = f;
        if (cz5.A08 >= 1.0f) {
        }
        cz5.A06 = height;
        cz5.A07 = (height - (((float) cz5.A0F.A09.getHeight()) * cz5.A05)) + (((float) cz5.A0F.A09.getHeight()) * cz5.A08);
        cz5.A01 = (((float) cz5.A0F.A06.getWidth()) - (((float) cz5.A0F.A09.getWidth()) * cz5.A05)) / 2.0f;
        cz5.A03 = (((float) cz5.A0F.A09.getHeight()) * cz5.A05) - ((float) cz5.A0F.A09.getHeight());
        cz5.A09++;
        this.A01.run();
        if (this.A00.A0F.A06.getHeight() > 0 || this.A00.A0F.A09.getHeight() > 0 || this.A00.A0F.A06.getViewTreeObserver().isAlive()) {
        }
    }
}
