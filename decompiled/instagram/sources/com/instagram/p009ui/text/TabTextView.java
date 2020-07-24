package com.instagram.p009ui.text;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.TextView;
import com.facebook.C0003R;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass1BA;
import p000X.C019000b;

/* renamed from: com.instagram.ui.text.TabTextView */
public class TabTextView extends TextView {
    public int A00;
    public final Paint A01 = new Paint();
    public final Rect A02 = new Rect();

    private void A00() {
        Context context = getContext();
        this.A00 = getResources().getDimensionPixelSize(AnonymousClass1BA.A03(context, C0003R.attr.segmentedUnderlineWidth));
        getContext();
        int A03 = AnonymousClass1BA.A03(context, C0003R.attr.textColorSelected);
        Paint paint = this.A01;
        getContext();
        paint.setColor(C019000b.A00(context, A03));
    }

    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (isSelected()) {
            canvas.drawRect(this.A02, this.A01);
        }
    }

    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        int A06 = AnonymousClass0Z0.A06(101637289);
        super.onSizeChanged(i, i2, i3, i4);
        this.A02.set(0, i2 - this.A00, i, i2);
        AnonymousClass0Z0.A0D(-690833775, A06);
    }

    public TabTextView(Context context) {
        super(context);
        A00();
    }

    public TabTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00();
    }

    public TabTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A00();
    }
}
