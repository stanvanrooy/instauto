package p000X;

import android.content.Context;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import com.facebook.C0003R;

/* renamed from: X.AH7 */
public final class AH7 implements C83233jh {
    public int A00;
    public int A01;
    public View A02;
    public PopupWindow A03;
    public C35691gm A04;
    public AnonymousClass8EJ A05;
    public final Context A06;
    public final int A07;
    public final Runnable A08 = new C23321AHw(this);

    public final boolean Ahh() {
        PopupWindow popupWindow = this.A03;
        if (popupWindow == null || !popupWindow.isShowing()) {
            return false;
        }
        return true;
    }

    public final void Bnw(View view, int i, boolean z, AnonymousClass8EJ r10) {
        if (this.A03 == null) {
            View inflate = LayoutInflater.from(this.A06).inflate(C0003R.layout.item_menu, (ViewGroup) null);
            PopupWindow popupWindow = new PopupWindow(inflate, -2, -2, false);
            this.A03 = popupWindow;
            popupWindow.setAnimationStyle(C0003R.style.ItemMenuAnimationStyle);
            this.A03.setOutsideTouchable(true);
            View findViewById = inflate.findViewById(C0003R.C0005id.trash_can);
            this.A02 = findViewById;
            C35651gi r1 = new C35651gi(findViewById);
            r1.A07 = true;
            r1.A05 = new AHZ(this);
            this.A04 = r1.A00();
            inflate.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
            this.A01 = inflate.getMeasuredWidth();
            this.A00 = inflate.getMeasuredHeight();
        }
        AcV();
        this.A05 = r10;
        View view2 = this.A02;
        int i2 = 8;
        if (z) {
            i2 = 0;
        }
        view2.setVisibility(i2);
        Rect rect = new Rect();
        view.getGlobalVisibleRect(rect);
        AHS ahs = new AHS(this, rect);
        this.A03.getContentView().setOnTouchListener(ahs);
        this.A03.setTouchInterceptor(ahs);
        this.A03.showAtLocation(view, 51, rect.centerX() - (this.A01 >> 1), (rect.top - this.A07) - this.A00);
        this.A03.getContentView().removeCallbacks(this.A08);
        this.A03.getContentView().postDelayed(this.A08, 3000);
    }

    public AH7(Context context) {
        this.A06 = context;
        this.A07 = context.getResources().getDimensionPixelSize(C0003R.dimen.menu_bottom_margin);
    }

    public final boolean AcV() {
        if (!Ahh()) {
            return false;
        }
        this.A03.getContentView().removeCallbacks(this.A08);
        this.A03.dismiss();
        return true;
    }
}
