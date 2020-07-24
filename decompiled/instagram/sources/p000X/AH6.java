package p000X;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SpinnerAdapter;
import com.facebook.C0003R;

/* renamed from: X.AH6 */
public final class AH6 extends AH5 implements C23320AHv {
    public ListAdapter A00;
    public int A01;
    public CharSequence A02;
    public final Rect A03 = new Rect();
    public final /* synthetic */ AnonymousClass2AW A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AH6(AnonymousClass2AW r3, Context context, AttributeSet attributeSet) {
        super(context, attributeSet, C0003R.attr.spinnerStyle, 0);
        this.A04 = r3;
        this.A07 = r3;
        this.A0E = true;
        this.A0A.setFocusable(true);
        this.A08 = new AHV(this, r3);
    }

    public final void A03() {
        int i;
        Drawable AGY = AGY();
        int i2 = 0;
        if (AGY != null) {
            AGY.getPadding(this.A04.A05);
            if (AnonymousClass2WC.A00(this.A04)) {
                i2 = this.A04.A05.right;
            } else {
                i2 = -this.A04.A05.left;
            }
        } else {
            Rect rect = this.A04.A05;
            rect.right = 0;
            rect.left = 0;
        }
        int paddingLeft = this.A04.getPaddingLeft();
        int paddingRight = this.A04.getPaddingRight();
        int width = this.A04.getWidth();
        AnonymousClass2AW r3 = this.A04;
        int i3 = r3.A00;
        if (i3 == -2) {
            int A002 = r3.A00((SpinnerAdapter) this.A00, AGY());
            int i4 = this.A04.getContext().getResources().getDisplayMetrics().widthPixels;
            Rect rect2 = this.A04.A05;
            int i5 = (i4 - rect2.left) - rect2.right;
            if (A002 > i5) {
                A002 = i5;
            }
            A02(Math.max(A002, (width - paddingLeft) - paddingRight));
        } else if (i3 == -1) {
            A02((width - paddingLeft) - paddingRight);
        } else {
            A02(i3);
        }
        if (AnonymousClass2WC.A00(this.A04)) {
            i = i2 + (((width - paddingRight) - this.A04) - this.A01);
        } else {
            i = i2 + paddingLeft + this.A01;
        }
        Bhu(i);
    }

    public final CharSequence AN3() {
        return this.A02;
    }

    public final void Bff(ListAdapter listAdapter) {
        super.Bff(listAdapter);
        this.A00 = listAdapter;
    }

    public final void Bnv(int i, int i2) {
        ViewTreeObserver viewTreeObserver;
        boolean Ahh = Ahh();
        A03();
        this.A0A.setInputMethodMode(2);
        super.show();
        ListView AP5 = AP5();
        AP5.setChoiceMode(1);
        AP5.setTextDirection(i);
        AP5.setTextAlignment(i2);
        int selectedItemPosition = this.A04.getSelectedItemPosition();
        C205608r8 r1 = this.A0B;
        if (Ahh() && r1 != null) {
            r1.A08 = false;
            r1.setSelection(selectedItemPosition);
            if (r1.getChoiceMode() != 0) {
                r1.setItemChecked(selectedItemPosition, true);
            }
        }
        if (!Ahh && (viewTreeObserver = this.A04.getViewTreeObserver()) != null) {
            AHM ahm = new AHM(this);
            viewTreeObserver.addOnGlobalLayoutListener(ahm);
            this.A0A.setOnDismissListener(new C23304AHe(this, ahm));
        }
    }

    public final void Bhv(int i) {
        this.A01 = i;
    }

    public final void Bjp(CharSequence charSequence) {
        this.A02 = charSequence;
    }
}
