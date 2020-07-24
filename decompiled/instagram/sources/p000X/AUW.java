package p000X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListPopupWindow;
import com.facebook.C0003R;
import java.util.ArrayList;

/* renamed from: X.AUW */
public final class AUW extends ListPopupWindow {
    public Context A00;
    public AUV A01;
    public AUS A02;
    public ArrayList A03;
    public boolean A04;

    public final void A00(int i) {
        setModal(true);
        setBackgroundDrawable(this.A00.getResources().getDrawable(i));
        setInputMethodMode(2);
        AUV auv = new AUV(this.A03, this.A00, this.A02, this.A04);
        this.A01 = auv;
        setAdapter(auv);
        AUV auv2 = this.A01;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int count = auv2.getCount();
        int i2 = 0;
        for (int i3 = 0; i3 < count; i3++) {
            View view = auv2.getView(i3, (View) null, (ViewGroup) null);
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            if (view.getMeasuredWidth() > i2) {
                i2 = view.getMeasuredWidth();
            }
        }
        int dimensionPixelSize = this.A00.getResources().getDimensionPixelSize(C0003R.dimen.browser_menu_horizontal_padding) << 1;
        int i4 = this.A00.getResources().getDisplayMetrics().widthPixels - dimensionPixelSize;
        int i5 = i2 + dimensionPixelSize;
        int dimensionPixelSize2 = this.A00.getResources().getDimensionPixelSize(C0003R.dimen.browser_menu_popup_custom_width);
        if (i5 > i4) {
            dimensionPixelSize2 = i4;
        } else if (i5 >= dimensionPixelSize2) {
            dimensionPixelSize2 = i5;
        }
        setContentWidth(dimensionPixelSize2);
    }

    public AUW(Context context, ArrayList arrayList, AUS aus, boolean z) {
        super(context);
        this.A03 = arrayList;
        this.A00 = context;
        this.A02 = aus;
        this.A04 = z;
    }
}
