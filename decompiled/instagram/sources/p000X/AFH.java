package p000X;

import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import androidx.appcompat.widget.SearchView;
import com.facebook.C0003R;

/* renamed from: X.AFH */
public final class AFH implements View.OnLayoutChangeListener {
    public final /* synthetic */ SearchView A00;

    public AFH(SearchView searchView) {
        this.A00 = searchView;
    }

    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9;
        SearchView searchView = this.A00;
        if (searchView.A0b.getWidth() > 1) {
            Resources resources = searchView.getContext().getResources();
            int paddingLeft = searchView.A0c.getPaddingLeft();
            Rect rect = new Rect();
            boolean A002 = AnonymousClass2WC.A00(searchView);
            int i10 = 0;
            if (searchView.A0A) {
                i10 = resources.getDimensionPixelSize(C0003R.dimen.abc_dropdownitem_icon_width) + resources.getDimensionPixelSize(C0003R.dimen.abc_dropdownitem_text_padding_left);
            }
            searchView.A0d.getDropDownBackground().getPadding(rect);
            if (A002) {
                i9 = -rect.left;
            } else {
                i9 = paddingLeft - (rect.left + i10);
            }
            searchView.A0d.setDropDownHorizontalOffset(i9);
            searchView.A0d.setDropDownWidth((((searchView.A0b.getWidth() + rect.left) + rect.right) + i10) - paddingLeft);
        }
    }
}
