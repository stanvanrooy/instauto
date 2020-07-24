package p000X;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import com.facebook.C0003R;

/* renamed from: X.AH2 */
public class AH2 {
    public int A00 = 8388611;
    public View A01;
    public PopupWindow.OnDismissListener A02;
    public AH1 A03;
    public C54122Vv A04;
    public boolean A05;
    public final int A06;
    public final int A07;
    public final Context A08;
    public final PopupWindow.OnDismissListener A09 = new C23319AHu(this);
    public final C54042Vn A0A;
    public final boolean A0B;

    public void A02() {
        this.A03 = null;
        PopupWindow.OnDismissListener onDismissListener = this.A02;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public final AH1 A01() {
        AH1 ah4;
        if (this.A03 == null) {
            Display defaultDisplay = ((WindowManager) this.A08.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            int min = Math.min(point.x, point.y);
            boolean z = false;
            if (min >= this.A08.getResources().getDimensionPixelSize(C0003R.dimen.abc_cascading_menus_min_smallest_width)) {
                z = true;
            }
            if (z) {
                ah4 = new AH3(this.A08, this.A01, this.A06, this.A07, this.A0B);
            } else {
                ah4 = new AH4(this.A08, this.A0A, this.A01, this.A06, this.A07, this.A0B);
            }
            ah4.A07(this.A0A);
            ah4.A06(this.A09);
            ah4.A05(this.A01);
            ah4.BgL(this.A04);
            ah4.A08(this.A05);
            ah4.A02(this.A00);
            this.A03 = ah4;
        }
        return this.A03;
    }

    public final void A04(C54122Vv r2) {
        this.A04 = r2;
        AH1 ah1 = this.A03;
        if (ah1 != null) {
            ah1.BgL(r2);
        }
    }

    public final boolean A05() {
        AH1 ah1 = this.A03;
        if (ah1 == null || !ah1.Ahh()) {
            return false;
        }
        return true;
    }

    public AH2(Context context, C54042Vn r3, View view, boolean z, int i, int i2) {
        this.A08 = context;
        this.A0A = r3;
        this.A01 = view;
        this.A0B = z;
        this.A06 = i;
        this.A07 = i2;
    }

    public static void A00(AH2 ah2, int i, int i2, boolean z, boolean z2) {
        AH1 A012 = ah2.A01();
        A012.A09(z2);
        if (z) {
            if ((Gravity.getAbsoluteGravity(ah2.A00, ah2.A01.getLayoutDirection()) & 7) == 5) {
                i -= ah2.A01.getWidth();
            }
            A012.A03(i);
            A012.A04(i2);
            int i3 = (int) ((ah2.A08.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            A012.A00 = new Rect(i - i3, i2 - i3, i + i3, i2 + i3);
        }
        A012.show();
    }

    public final void A03() {
        if (A05()) {
            this.A03.dismiss();
        }
    }
}
