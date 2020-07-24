package p000X;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import com.facebook.C0003R;

/* renamed from: X.CYX */
public final class CYX extends C27291Hg {
    public ValueAnimator A00;
    public View A01;
    public Integer A02 = Constants.ONE;
    public boolean A03;
    public final int A04;
    public final int A05;

    public static CYX A00(Context context) {
        return new CYX(context.getResources().getDimensionPixelSize(C0003R.dimen.universal_cta_empty_button_view_height), 350);
    }

    public final void A01() {
        this.A01.setTranslationY((float) this.A04);
        this.A01.setVisibility(8);
    }

    public final void A03(View view) {
        this.A01 = view;
        if (this.A03) {
            A01();
        }
        ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{this.A04, 0});
        this.A00 = ofInt;
        ofInt.setDuration((long) this.A05);
        this.A00.addUpdateListener(new C27964CYa(this));
        this.A00.addListener(new CYZ(this));
        this.A00.setInterpolator(new OvershootInterpolator());
    }

    public CYX(int i, int i2) {
        this.A04 = i;
        this.A05 = i2;
    }

    public final void A02(View view) {
        A03(view);
        A01();
        this.A01.postDelayed(new CYY(this), 500);
    }

    public final void BE0() {
        super.BE0();
        ValueAnimator valueAnimator = this.A00;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }
}
