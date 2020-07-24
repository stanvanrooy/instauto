package p000X;

import android.widget.RatingBar;

/* renamed from: X.BX2 */
public final class BX2 implements RatingBar.OnRatingBarChangeListener {
    public final /* synthetic */ RatingBar.OnRatingBarChangeListener A00;
    public final /* synthetic */ BX3 A01;

    public BX2(BX3 bx3, RatingBar.OnRatingBarChangeListener onRatingBarChangeListener) {
        this.A01 = bx3;
        this.A00 = onRatingBarChangeListener;
    }

    public final void onRatingChanged(RatingBar ratingBar, float f, boolean z) {
        this.A00.onRatingChanged(ratingBar, f, z);
        this.A01.A00.dismiss();
    }
}
