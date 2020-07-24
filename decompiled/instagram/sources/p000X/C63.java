package p000X;

import android.view.ViewTreeObserver;
import com.facebook.C0003R;

/* renamed from: X.C63 */
public final class C63 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ C27265C5y A00;

    public C63(C27265C5y c5y) {
        this.A00 = c5y;
    }

    public final void onGlobalLayout() {
        this.A00.A04.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        int dimensionPixelSize = this.A00.A0I.getResources().getDimensionPixelSize(C0003R.dimen.fundraiser_sticker_consumption_sheet_divider_width);
        C27265C5y c5y = this.A00;
        float f = (float) dimensionPixelSize;
        c5y.A07 = new C77453Zw(c5y.A0I, f, C0003R.color.grey_2, 80);
        C27265C5y c5y2 = this.A00;
        c5y2.A08 = new C77453Zw(c5y2.A0I, f, C0003R.color.red_5, 80);
        C27265C5y c5y3 = this.A00;
        c5y3.A04.setBackgroundDrawable(c5y3.A07);
    }
}
