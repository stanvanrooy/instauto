package p000X;

import android.graphics.Rect;
import android.view.View;
import com.facebook.forker.Process;
import com.instagram.common.p004ui.widget.reboundviewpager.ReboundViewPager;

/* renamed from: X.1bO  reason: invalid class name and case insensitive filesystem */
public class C32511bO implements C32521bP {
    public final Rect A00 = new Rect();

    public int AEY(float f, ReboundViewPager reboundViewPager) {
        double floor;
        if (reboundViewPager.A0O()) {
            floor = Math.ceil((double) f);
        } else {
            floor = Math.floor((double) f);
        }
        return (int) floor;
    }

    public int Aid(float f, ReboundViewPager reboundViewPager) {
        double ceil;
        if (reboundViewPager.A0O()) {
            ceil = Math.floor((double) f);
        } else {
            ceil = Math.ceil((double) f);
        }
        return (int) ceil;
    }

    public void BXS(ReboundViewPager reboundViewPager, View view, float f, int i) {
        float pageSize = (((float) reboundViewPager.getPageSize()) * f) + (f * reboundViewPager.A02);
        if (reboundViewPager.A0I == AnonymousClass1bM.VERTICAL) {
            view.setTranslationY(pageSize);
        } else {
            view.setTranslationX(pageSize);
        }
    }

    public boolean Bra(ReboundViewPager reboundViewPager, float f, float f2) {
        int childCount = reboundViewPager.getChildCount();
        if (childCount == 0) {
            return false;
        }
        int i = Integer.MAX_VALUE;
        int i2 = Process.WAIT_RESULT_STOPPED;
        for (int i3 = 0; i3 < childCount; i3++) {
            reboundViewPager.getChildAt(i3).getHitRect(this.A00);
            if (this.A00.contains(Math.round(f), Math.round(f2))) {
                return true;
            }
            Rect rect = this.A00;
            i = Math.min(i, rect.left);
            i2 = Math.max(i2, rect.right);
        }
        if (f < ((float) i) || f > ((float) i2)) {
            return false;
        }
        return true;
    }
}
