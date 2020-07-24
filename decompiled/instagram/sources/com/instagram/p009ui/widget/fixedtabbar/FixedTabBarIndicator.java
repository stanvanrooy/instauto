package com.instagram.p009ui.widget.fixedtabbar;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import com.facebook.react.uimanager.BaseViewManager;
import java.util.List;
import p000X.AnonymousClass1E1;

/* renamed from: com.instagram.ui.widget.fixedtabbar.FixedTabBarIndicator */
public class FixedTabBarIndicator extends View {
    public int A00 = -1;
    public List A01;
    public boolean A02;
    public int A03;
    public boolean A04 = false;
    public final Paint A05 = new Paint();
    public final Rect A06 = new Rect();

    public final void A00(int i, float f) {
        this.A00 = i;
        this.A06.offsetTo((int) (((float) this.A03) * (((float) i) + f)), 0);
        AnonymousClass1E1.A0I(this);
    }

    public final void onDraw(Canvas canvas) {
        List list = this.A01;
        if (list != null && !list.isEmpty() && this.A00 >= 0) {
            canvas.drawRect(this.A06, this.A05);
        }
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        List list;
        if ((this.A04 || z) && (list = this.A01) != null && !list.isEmpty()) {
            this.A04 = false;
            this.A02 = true;
            View view = (View) getParent();
            int width = ((view.getWidth() - view.getPaddingLeft()) - view.getPaddingRight()) / this.A01.size();
            this.A03 = width;
            this.A06.set(0, 0, width, getHeight());
            int i5 = this.A00;
            if (i5 >= 0) {
                A00(i5, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
            }
        }
    }

    public void setTabs(List list) {
        List list2 = this.A01;
        if (list2 == null || list2.size() != list.size()) {
            this.A04 = true;
        }
        this.A01 = list;
    }

    public FixedTabBarIndicator(Context context) {
        super(context);
    }

    public FixedTabBarIndicator(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public FixedTabBarIndicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
