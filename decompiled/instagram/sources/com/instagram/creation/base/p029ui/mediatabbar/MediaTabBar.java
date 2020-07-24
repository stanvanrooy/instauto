package com.instagram.creation.base.p029ui.mediatabbar;

import android.animation.ArgbEvaluator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.C0003R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p000X.AnonymousClass1BA;
import p000X.C06400Ox;
import p000X.C180697nX;

/* renamed from: com.instagram.creation.base.ui.mediatabbar.MediaTabBar */
public class MediaTabBar extends LinearLayout {
    public float A00;
    public Paint A01;
    public boolean A02;
    public final int A03;
    public final int A04;
    public final ArgbEvaluator A05;
    public final List A06;

    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float width = (this.A00 * ((float) getWidth())) / ((float) this.A06.size());
        float height = ((float) getHeight()) - (this.A01.getStrokeWidth() / 2.0f);
        canvas.drawLine(width, height, width + ((float) (getWidth() / this.A06.size())), height, this.A01);
    }

    public void setTabs(List list, View.OnClickListener onClickListener) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C180697nX r3 = (C180697nX) it.next();
            TextView textView = (TextView) LayoutInflater.from(getContext()).inflate(C0003R.layout.media_tab_bar_tab, this, false);
            textView.setTag(r3);
            textView.setText(getResources().getString(r3.A01));
            textView.setOnClickListener(onClickListener);
            addView(textView);
            this.A06.add(textView);
        }
    }

    public MediaTabBar(Context context) {
        this(context, (AttributeSet) null);
    }

    public MediaTabBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MediaTabBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A06 = new ArrayList();
        this.A02 = false;
        setOrientation(0);
        Resources resources = getResources();
        Context context2 = getContext();
        this.A02 = C06400Ox.A02(context2);
        this.A05 = new ArgbEvaluator();
        this.A04 = AnonymousClass1BA.A01(context, C0003R.attr.mediaTabTextColor);
        this.A03 = AnonymousClass1BA.A01(context, C0003R.attr.mediaTabTextColorSelected);
        getContext();
        int dimensionPixelSize = resources.getDimensionPixelSize(AnonymousClass1BA.A03(context2, C0003R.attr.segmentedUnderlineWidth));
        Paint paint = new Paint();
        this.A01 = paint;
        paint.setStyle(Paint.Style.STROKE);
        this.A01.setStrokeWidth((float) dimensionPixelSize);
        this.A01.setColor(this.A03);
        setWillNotDraw(false);
    }
}
