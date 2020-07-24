package com.instagram.common.p004ui.widget.draggable;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.FrameLayout;
import com.facebook.C0003R;
import com.facebook.react.uimanager.BaseViewManager;
import com.instagram.common.p004ui.widget.imageview.RoundedCornerImageView;
import java.lang.ref.WeakReference;
import p000X.AnonymousClass0Z0;
import p000X.C185587wK;
import p000X.C186097xD;
import p000X.C186197xN;

/* renamed from: com.instagram.common.ui.widget.draggable.DraggableContainer */
public class DraggableContainer extends FrameLayout implements Animation.AnimationListener {
    public float A00;
    public float A01;
    public Rect A02 = new Rect();
    public RoundedCornerImageView A03;
    public float A04;
    public float A05;
    public final Rect A06 = new Rect();
    public final Rect A07 = new Rect();
    public final int[] A08 = new int[2];

    public final void onAnimationRepeat(Animation animation) {
    }

    public final void onAnimationStart(Animation animation) {
    }

    private void A00() {
        RoundedCornerImageView roundedCornerImageView = new RoundedCornerImageView(getContext());
        this.A03 = roundedCornerImageView;
        roundedCornerImageView.setVisibility(4);
        addView(this.A03);
    }

    public static float getDragCenterX(DraggableContainer draggableContainer) {
        return ((float) draggableContainer.A06.left) + draggableContainer.A00 + ((float) (draggableContainer.A03.getWidth() >> 1));
    }

    public static float getDragCenterY(DraggableContainer draggableContainer) {
        return ((float) draggableContainer.A06.top) + draggableContainer.A01 + ((float) (draggableContainer.A03.getHeight() >> 1));
    }

    public final void onAnimationEnd(Animation animation) {
        this.A03.setVisibility(4);
        C185587wK r1 = C186197xN.A00;
        r1.A05(A01());
        r1.A00 = null;
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean A062 = C186197xN.A00.A06();
        if (A062) {
            this.A04 = motionEvent.getRawX();
            this.A05 = motionEvent.getRawY();
            if (motionEvent.getAction() == 3 || motionEvent.getAction() == 1) {
                onAnimationEnd((Animation) null);
            }
        }
        return A062;
    }

    private boolean A01() {
        View findViewById = findViewById(C0003R.C0005id.drag_target);
        if (findViewById == null || !findViewById.isShown()) {
            return false;
        }
        if (this.A02.isEmpty()) {
            findViewById.getGlobalVisibleRect(this.A02);
        }
        this.A03.getGlobalVisibleRect(this.A07);
        return this.A02.contains(this.A07);
    }

    public final void onAttachedToWindow() {
        int A062 = AnonymousClass0Z0.A06(1671160262);
        super.onAttachedToWindow();
        C186197xN.A00.A01 = new WeakReference(this);
        AnonymousClass0Z0.A0D(-1598039035, A062);
    }

    public final void onDetachedFromWindow() {
        int A062 = AnonymousClass0Z0.A06(1001398252);
        super.onDetachedFromWindow();
        C186197xN.A00.A00 = null;
        AnonymousClass0Z0.A0D(-652822441, A062);
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int i;
        float f;
        float f2;
        float f3;
        float f4;
        boolean z;
        int A052 = AnonymousClass0Z0.A05(-1042661076);
        if (!C186197xN.A00.A06()) {
            AnonymousClass0Z0.A0C(-144497518, A052);
            return false;
        }
        int action = motionEvent.getAction();
        this.A00 += motionEvent.getRawX() - this.A04;
        this.A01 += motionEvent.getRawY() - this.A05;
        this.A00 = Math.min(this.A00, (float) (getMeasuredWidth() - 1));
        this.A01 = Math.min(this.A01, (float) (getMeasuredHeight() - 1));
        if (action == 2) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.A03.getLayoutParams();
            layoutParams.leftMargin = (int) this.A00;
            layoutParams.topMargin = (int) this.A01;
            this.A03.setLayoutParams(layoutParams);
            C185587wK r4 = C186197xN.A00;
            RoundedCornerImageView roundedCornerImageView = this.A03;
            float dragCenterX = getDragCenterX(this);
            float dragCenterY = getDragCenterY(this);
            boolean A012 = A01();
            int rawX = (int) motionEvent.getRawX();
            int rawY = (int) motionEvent.getRawY();
            View findViewById = findViewById(C0003R.C0005id.drag_target);
            if (findViewById == null || !findViewById.isShown()) {
                z = false;
            } else {
                if (this.A02.isEmpty()) {
                    findViewById.getGlobalVisibleRect(this.A02);
                }
                z = this.A02.contains(rawX, rawY);
            }
            synchronized (r4) {
                for (C186097xD B1O : C185587wK.A00(r4, r4.A00.getClass())) {
                    B1O.B1O(roundedCornerImageView, dragCenterX, dragCenterY, A012, z);
                }
            }
        } else if (action == 1 || action == 3) {
            C186197xN.A00.A01();
            if (this.A03.getVisibility() == 0) {
                View view = (View) C186197xN.A00.A00.A00().get();
                Rect rect = new Rect();
                Point point = new Point();
                if (view.getGlobalVisibleRect(rect, point)) {
                    rect.top = point.y;
                    i = point.x;
                } else {
                    view.getLocationInWindow(this.A08);
                    int[] iArr = this.A08;
                    rect.top = iArr[1];
                    i = iArr[0];
                }
                rect.left = i;
                if (A01()) {
                    f = (float) this.A02.centerX();
                    f2 = getDragCenterX(this);
                } else {
                    f = ((float) rect.left) - this.A00;
                    f2 = (float) this.A06.left;
                }
                float f5 = f - f2;
                if (A01()) {
                    f3 = (float) this.A02.centerY();
                    f4 = getDragCenterY(this);
                } else {
                    f3 = ((float) rect.top) - this.A01;
                    f4 = (float) this.A06.top;
                }
                float f6 = f3 - f4;
                TranslateAnimation translateAnimation = new TranslateAnimation(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, f5, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, f6);
                translateAnimation.setDuration((long) Math.sqrt((double) ((f5 * f5) + (f6 * f6))));
                translateAnimation.setAnimationListener(this);
                this.A03.startAnimation(translateAnimation);
            } else {
                onAnimationEnd((Animation) null);
            }
        }
        this.A04 = motionEvent.getRawX();
        this.A05 = motionEvent.getRawY();
        AnonymousClass0Z0.A0C(1080396345, A052);
        return true;
    }

    public DraggableContainer(Context context) {
        super(context);
        A00();
    }

    public DraggableContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00();
    }

    public DraggableContainer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A00();
    }
}
