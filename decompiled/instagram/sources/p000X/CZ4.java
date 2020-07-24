package p000X;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.facebook.C0003R;
import com.facebook.react.uimanager.BaseViewManager;
import com.instagram.common.p004ui.colorfilter.ColorFilterAlphaImageView;
import com.instagram.common.p004ui.widget.framelayout.MediaFrameLayout;
import java.lang.ref.WeakReference;

/* renamed from: X.CZ4 */
public final class CZ4 extends Handler {
    public WeakReference A00;

    public final void handleMessage(Message message) {
        boolean z;
        int i;
        CZ7 cz7 = (CZ7) this.A00.get();
        if (cz7 != null && message.what == 0) {
            CZO czo = cz7.A02;
            CZ3 cz3 = czo.A00;
            AnonymousClass1EK r0 = cz3.A03;
            if (r0 != null) {
                r0.Adn(cz3);
                czo.A00.A03.setFocusable(true);
                CZ3 cz32 = czo.A00;
                cz32.A0B = true;
                CZH czh = cz32.A0I;
                Context context = cz32.A0D;
                AnonymousClass0C1 r6 = cz32.A0M;
                View view = cz32.A02;
                AnonymousClass1NJ r1 = cz32.A05;
                C32141af A01 = AnonymousClass1RS.A01(cz32.A0O);
                C36841ih APu = cz32.APu(r1);
                CZ3 cz33 = czo.A00;
                C30391Tq r7 = cz33.A0K;
                CZA cza = (CZA) view.getTag();
                cza.A04.setLayoutParams(new FrameLayout.LayoutParams(cza.A06.getWidth(), cza.A06.getHeight() << 1));
                AnonymousClass1VJ r11 = czh.A03;
                C31801Zz r12 = cza.A07;
                if (APu.A0R()) {
                    i = APu.getPosition();
                } else {
                    i = -1;
                }
                r11.A05(r12, r1, APu, i, false, (String) null, r6, cz33, C38261kz.WITH_DEFAULT_COLOR, (C31571Yv) null, (AnonymousClass1I2) null);
                ColorFilterAlphaImageView colorFilterAlphaImageView = cza.A07.A06;
                if (colorFilterAlphaImageView != null) {
                    colorFilterAlphaImageView.setVisibility(8);
                }
                cza.A08.A07.setOnTouchListener(new CZI(czh, r7, cza, r1, APu));
                MediaFrameLayout mediaFrameLayout = cza.A08.A07;
                float f = cza.A01;
                if (f == BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
                    int width = cza.A06.getWidth();
                    int height = cza.A06.getHeight();
                    int height2 = cza.A07.A00.getHeight();
                    f = ((float) (width - (context.getResources().getDimensionPixelOffset(C0003R.dimen.grid_quick_preview_horizontal_margin) << 1))) / ((float) ((height - height2) - ((int) cza.A00())));
                    cza.A01 = f;
                }
                mediaFrameLayout.setAspectRatio(Math.max(f, AnonymousClass1VM.A00(r1)));
                cza.A08.A0D.setScaleType(ImageView.ScaleType.CENTER_CROP);
                C38641lb.A00(r6, r1, cza.A08.A0D, cz33, czh.A00);
                AnonymousClass1VM r72 = czh.A02;
                C32151ag r2 = cza.A08;
                r72.A01(r2.A0G, r2.A0D, A01, r1, APu);
                C32151ag r22 = cza.A08;
                C36841ih r3 = r22.A05;
                if (!(r3 == null || r3 == APu)) {
                    r3.A0K(r22.A0F);
                    C32151ag r23 = cza.A08;
                    r23.A05.A0H(r23.A08.A00());
                }
                C32151ag r24 = cza.A08;
                r24.A05 = APu;
                APu.A0I(r24.A0F);
                C38781lp.A00(cza.A08.AGJ(), r1, APu);
                C38771lo.A01(r6, cza.A08.A0D, r1);
                CZ3.A02(czo.A00);
                CZ5 cz5 = czo.A00.A06;
                cz5.A0A = new CZ6(cz5, new CZJ(czo));
                cz5.A0F.A06.getViewTreeObserver().addOnGlobalLayoutListener(cz5.A0A);
                CZ3 cz34 = czo.A00;
                cz34.A02.setBackgroundDrawable(C52142Np.A00(cz34.A0D, cz34.A03.A60()));
                LinearLayout linearLayout = czo.A00.A07.A04;
                linearLayout.setTranslationY(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
                linearLayout.setScaleX(0.8f);
                linearLayout.setScaleY(0.8f);
                CZ3 cz35 = czo.A00;
                cz35.A0H.A01(cz35.A05, cz35.A01, cz35.A00);
                CZ3 cz36 = czo.A00;
                if (CZ3.A00(cz36.A05, cz36.A00).AiO()) {
                    CZ3 cz37 = czo.A00;
                    C39831nd.A00(new C39821nc(CZ3.A00(cz37.A05, cz37.A00).A0e(), czo.A00.getModuleName()), czo.A00.A0M);
                }
                czo.A00.A0F.A03(1.0d);
                czo.A00.A0A = Constants.A0C;
                z = true;
            } else {
                z = false;
            }
            if (z) {
                cz7.A01 = false;
            }
        }
    }

    public CZ4(WeakReference weakReference) {
        this.A00 = weakReference;
    }
}
