package com.instagram.igds.components.switchbutton;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import android.widget.CompoundButton;
import com.facebook.C0003R;
import com.facebook.react.uimanager.BaseViewManager;
import p000X.AnonymousClass0Z0;
import p000X.C019000b;
import p000X.C1878080e;
import p000X.C79583dh;

public class IgSwitch extends CompoundButton {
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public Drawable A06;
    public VelocityTracker A07;
    public Boolean A08;
    public boolean A09;
    public float A0A;
    public float A0B;
    public Drawable A0C;
    public Drawable A0D;
    public Drawable A0E;
    public C79583dh A0F;
    public final Rect A0G = new Rect();
    public final Rect A0H = new Rect();

    private void A00(Context context) {
        setClickable(true);
        Context context2 = getContext();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context2);
        this.A05 = viewConfiguration.getScaledTouchSlop();
        this.A01 = viewConfiguration.getScaledMinimumFlingVelocity();
        this.A06 = C019000b.A03(context, C0003R.C0004drawable.new_toggle_nub);
        getContext();
        this.A0D = C019000b.A03(context2, C0003R.C0004drawable.new_toggle_nub_active);
        getContext();
        this.A0E = C019000b.A03(context2, C0003R.C0004drawable.new_toggle);
        this.A0C = C019000b.A03(context, C0003R.C0004drawable.new_toggle_active);
        this.A03 = this.A06.getIntrinsicWidth();
        this.A02 = this.A0E.getIntrinsicWidth() - ((this.A03 * 3) / 5);
    }

    public static int[] A01(Drawable drawable, Drawable drawable2, Rect rect) {
        return new int[]{drawable.getIntrinsicWidth() + ((drawable2.getIntrinsicWidth() << 1) / 5) + rect.left + rect.right, drawable2.getIntrinsicHeight() + rect.top + rect.bottom};
    }

    public final boolean performClick() {
        this.A09 = true;
        return super.performClick();
    }

    public void setCheckedAnimated(boolean z) {
        this.A09 = true;
        setChecked(z);
    }

    private boolean getTargetCheckedState() {
        if (this.A00 >= ((float) (this.A02 >> 1))) {
            return true;
        }
        return false;
    }

    public final void toggle() {
        C79583dh r1 = this.A0F;
        if (r1 == null || r1.BRj(!isChecked())) {
            super.toggle();
        }
    }

    public final void onDetachedFromWindow() {
        int A062 = AnonymousClass0Z0.A06(95146277);
        super.onDetachedFromWindow();
        VelocityTracker velocityTracker = this.A07;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.A07 = null;
        }
        AnonymousClass0Z0.A0D(-841527535, A062);
    }

    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float f = this.A00 / ((float) this.A02);
        boolean z = !isEnabled();
        if (z) {
            f *= 0.3f;
        }
        int i = 255;
        if (z) {
            i = 76;
        }
        int i2 = (int) (f * 255.0f);
        this.A0C.setAlpha(i2);
        this.A0E.setAlpha(i);
        this.A0E.draw(canvas);
        this.A0C.draw(canvas);
        this.A0D.setAlpha(i2);
        this.A06.setAlpha(i);
        int i3 = (int) this.A00;
        this.A0H.set(getPaddingLeft() + i3, getPaddingTop(), i3 + this.A03 + getPaddingLeft(), getPaddingTop() + this.A06.getIntrinsicHeight());
        this.A06.setBounds(this.A0H);
        this.A0D.setBounds(this.A0H);
        this.A06.draw(canvas);
        this.A0D.draw(canvas);
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        float f;
        super.onLayout(z, i, i2, i3, i4);
        this.A0G.set(getPaddingLeft() + (this.A06.getIntrinsicWidth() / 5), (getPaddingTop() + (this.A06.getIntrinsicHeight() >> 1)) - (this.A0E.getIntrinsicHeight() >> 1), getPaddingLeft() + (this.A06.getIntrinsicWidth() / 5) + this.A0E.getIntrinsicWidth(), getPaddingTop() + (this.A06.getIntrinsicHeight() >> 1) + (this.A0E.getIntrinsicHeight() >> 1));
        this.A0E.setBounds(this.A0G);
        this.A0C.setBounds(this.A0G);
        if (isChecked()) {
            f = (float) this.A02;
        } else {
            f = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
        }
        this.A00 = f;
    }

    public final void onMeasure(int i, int i2) {
        int A062 = AnonymousClass0Z0.A06(-312443847);
        int[] A012 = A01(this.A0C, this.A06, new Rect(getPaddingLeft(), getPaddingTop(), getPaddingRight(), getPaddingBottom()));
        setMeasuredDimension(A012[0], A012[1]);
        AnonymousClass0Z0.A0D(12323398, A062);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00a7, code lost:
        if (isEnabled() == false) goto L_0x00a9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00e2, code lost:
        if (r0.booleanValue() == r3) goto L_0x00e7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0101, code lost:
        if (r0.booleanValue() == r1) goto L_0x00e7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0160, code lost:
        if (r2 >= ((float) r1)) goto L_0x0162;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0023, code lost:
        if (r1 != 3) goto L_0x0025;
     */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        int i;
        boolean z2;
        int A052 = AnonymousClass0Z0.A05(660591483);
        if (this.A07 == null) {
            this.A07 = VelocityTracker.obtain();
        }
        this.A07.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    int i2 = this.A04;
                    if (i2 != 0) {
                        if (i2 == 1) {
                            float x = motionEvent.getX();
                            float y = motionEvent.getY();
                            float abs = Math.abs(x - this.A0A);
                            float f = (float) this.A05;
                            if (abs > f || Math.abs(y - this.A0B) > f) {
                                this.A04 = 2;
                                getParent().requestDisallowInterceptTouchEvent(true);
                                this.A0A = x;
                                this.A0B = y;
                                i = -1521886752;
                                AnonymousClass0Z0.A0C(i, A052);
                                return true;
                            }
                        } else if (i2 == 2) {
                            float x2 = motionEvent.getX();
                            float f2 = this.A00;
                            float max = Math.max(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, Math.min(f2 + (x2 - this.A0A), (float) this.A02));
                            if (max != f2) {
                                this.A00 = max;
                                this.A0A = x2;
                                invalidate();
                            }
                            i = 850916854;
                            AnonymousClass0Z0.A0C(i, A052);
                            return true;
                        }
                    }
                }
            }
            if (this.A04 == 2) {
                boolean z3 = false;
                this.A04 = 0;
                if (motionEvent.getAction() == 1) {
                    z2 = true;
                }
                z2 = false;
                MotionEvent obtain = MotionEvent.obtain(motionEvent);
                obtain.setAction(3);
                super.onTouchEvent(obtain);
                obtain.recycle();
                if (z2) {
                    this.A07.computeCurrentVelocity(1000);
                    float xVelocity = this.A07.getXVelocity();
                    if (Math.abs(xVelocity) <= ((float) this.A01)) {
                        z3 = getTargetCheckedState();
                    } else if (xVelocity > BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
                        z3 = true;
                    }
                    this.A09 = true;
                    Boolean bool = this.A08;
                    if (bool != null) {
                    }
                } else {
                    boolean isChecked = isChecked();
                    this.A09 = true;
                    Boolean bool2 = this.A08;
                    if (bool2 != null) {
                    }
                }
                toggle();
                i = 819541678;
                AnonymousClass0Z0.A0C(i, A052);
                return true;
            }
            this.A04 = 0;
            this.A07.clear();
            this.A07.recycle();
            this.A07 = null;
        } else {
            float x3 = motionEvent.getX();
            float y2 = motionEvent.getY();
            if (isEnabled()) {
                int paddingTop = getPaddingTop() - this.A05;
                float paddingLeft = ((float) getPaddingLeft()) + this.A00 + 0.5f;
                int i3 = this.A05;
                int i4 = (int) (paddingLeft - ((float) i3));
                int i5 = this.A03 + i4 + (i3 << 1);
                int intrinsicHeight = this.A06.getIntrinsicHeight() + paddingTop + (this.A05 << 1);
                if (x3 > ((float) i4) && x3 < ((float) i5) && y2 > ((float) paddingTop)) {
                    z = true;
                }
                z = false;
                if (z) {
                    this.A04 = 1;
                    this.A0A = x3;
                    this.A0B = y2;
                }
            }
        }
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        AnonymousClass0Z0.A0C(879089096, A052);
        return onTouchEvent;
    }

    public void setChecked(boolean z) {
        int i;
        super.setChecked(z);
        Boolean bool = this.A08;
        if (!(bool == null || bool.booleanValue() == z)) {
            clearAnimation();
        }
        this.A08 = Boolean.valueOf(z);
        if (z) {
            i = this.A02;
        } else {
            i = 0;
        }
        if (!this.A09 || getWindowToken() == null) {
            this.A00 = (float) i;
            invalidate();
        } else {
            clearAnimation();
            startAnimation(new C1878080e(this, this.A00, (float) i));
        }
        this.A09 = false;
    }

    public void setToggleListener(C79583dh r1) {
        this.A0F = r1;
    }

    public IgSwitch(Context context) {
        super(context);
        A00(context);
    }

    public IgSwitch(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        A00(context);
    }

    public IgSwitch(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A00(context);
    }
}
