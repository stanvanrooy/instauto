package com.instagram.p009ui.widget.expanding;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import com.facebook.react.uimanager.BaseViewManager;
import com.instagram.p009ui.widget.refresh.RefreshableListView;
import java.util.ArrayList;
import java.util.List;
import p000X.AnonymousClass2IR;
import p000X.C256219o;
import p000X.C42781tF;

/* renamed from: com.instagram.ui.widget.expanding.ExpandingListView */
public class ExpandingListView extends RefreshableListView {
    public boolean A00;
    public boolean A01;
    public final C256219o A02 = new C42781tF(this);
    public final List A03 = new ArrayList();

    public static Animator A00(View view, View view2, float f, float f2, int i) {
        View view3 = view;
        int top = view.getTop();
        int bottom = view.getBottom();
        int bottom2 = view2.getBottom();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, 1.0f});
        ofFloat.addUpdateListener(new AnonymousClass2IR(view2, bottom2, i, view3, top, f, bottom, f2));
        return ofFloat;
    }

    public C256219o getOnScrollListener() {
        return this.A02;
    }

    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.A01 && !this.A03.isEmpty()) {
            for (View view : this.A03) {
                canvas.translate(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, (float) view.getTop());
                view.draw(canvas);
                canvas.translate(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, (float) (-view.getTop()));
            }
        }
    }

    public void setExpandingDisabledOnScroll(boolean z) {
        this.A00 = z;
    }

    public void setExpandingEnabled(boolean z) {
        this.A01 = z;
    }

    public ExpandingListView(Context context) {
        super(context);
    }

    public ExpandingListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ExpandingListView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
