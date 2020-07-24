package p000X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;

/* renamed from: X.ADW */
public class ADW extends C23214ADc {
    public AEF A00;
    public boolean A01;
    public boolean A02;
    public int[] A03 = new int[0];
    public C23225ADo[] A04;
    public C23225ADo[] A05;
    public Drawable A06;
    public SparseArray A07;
    public Object A08;
    public final ADY A09 = new ADY(this);

    public void A04(boolean z, int i, int i2, int i3, int i4) {
        ADR adr;
        if (this instanceof ADT) {
            ADT adt = (ADT) this;
            ADU adu = adt.A00;
            if (adu.A02 && (adr = adu.A00) != null) {
                adr.A01(View.MeasureSpec.makeMeasureSpec(i3 - i, C25913Bc3.MAX_SIGNED_POWER_OF_TWO), View.MeasureSpec.makeMeasureSpec(i4 - i2, C25913Bc3.MAX_SIGNED_POWER_OF_TWO), (int[]) null);
                adu.A02 = false;
            }
            adu.A03.A06(adu.A01);
            ADT.A00(adt);
        } else if (this instanceof C23215ADd) {
            C23215ADd aDd = (C23215ADd) this;
            aDd.A01.A06(aDd.A00);
        }
    }

    public int getMountItemCount() {
        int i = 0;
        int i2 = 0;
        while (true) {
            C23225ADo[] aDoArr = this.A04;
            if (i >= aDoArr.length) {
                return i2;
            }
            if (aDoArr[i] != null) {
                i2++;
            }
            i++;
        }
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.A01 = true;
        A04(z, i, i2, i3, i4);
        this.A01 = false;
    }

    public final void requestLayout() {
        ViewParent viewParent = this;
        while (viewParent instanceof ADW) {
            if (!((ADW) viewParent).A01) {
                viewParent = viewParent.getParent();
            } else {
                return;
            }
        }
        super.requestLayout();
    }

    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public final boolean verifyDrawable(Drawable drawable) {
        return true;
    }

    private void setForegroundLollipop(Drawable drawable) {
        Drawable drawable2 = this.A06;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback((Drawable.Callback) null);
                unscheduleDrawable(this.A06);
            }
            this.A06 = drawable;
            if (drawable != null) {
                drawable.setCallback(this);
                if (drawable.isStateful()) {
                    drawable.setState(getDrawableState());
                }
            }
            invalidate();
        }
    }

    public final void A01(int i, C23225ADo aDo) {
        if (aDo.A01.A05.A01 == Constants.ZERO) {
            Drawable drawable = (Drawable) aDo.A02;
            boolean z = false;
            if (getVisibility() == 0) {
                z = true;
            }
            drawable.setVisible(z, false);
            drawable.setCallback(this);
            if (drawable.isStateful()) {
                drawable.setState(getDrawableState());
            }
        } else {
            View view = (View) aDo.A02;
            this.A02 = true;
            if (!(view instanceof ADW) || view.getParent() != this) {
                if (view.getLayoutParams() == null) {
                    view.setLayoutParams(generateDefaultLayoutParams());
                }
                if (this.A01) {
                    super.addViewInLayout(view, -1, view.getLayoutParams(), true);
                } else {
                    super.addView(view, -1, view.getLayoutParams());
                }
            } else {
                AnonymousClass1E1.A0G(view);
                view.setVisibility(0);
            }
        }
        C23225ADo[] aDoArr = this.A04;
        int length = aDoArr.length;
        if (i >= length) {
            C23225ADo[] aDoArr2 = new C23225ADo[(length << 1)];
            System.arraycopy(aDoArr, 0, aDoArr2, 0, length);
            this.A04 = aDoArr2;
        }
        this.A04[i] = aDo;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0022, code lost:
        if (r2[r5] == null) goto L_0x0024;
     */
    public final void A02(int i, C23225ADo aDo) {
        boolean z;
        boolean z2;
        if (aDo.A01.A05.A01 == Constants.ZERO) {
            Drawable drawable = (Drawable) aDo.A02;
            drawable.setCallback((Drawable.Callback) null);
            invalidate(drawable.getBounds());
        } else {
            View view = (View) aDo.A02;
            this.A02 = true;
            if (this.A01) {
                super.removeViewInLayout(view);
            } else {
                super.removeView(view);
            }
            this.A02 = true;
        }
        C23225ADo[] aDoArr = this.A04;
        C23225ADo[] aDoArr2 = this.A05;
        if (aDoArr2 != null) {
            z = true;
        }
        z = false;
        if (z) {
            aDoArr2[i] = null;
        } else {
            aDoArr[i] = null;
        }
        if (aDoArr2 != null) {
            int i2 = 0;
            while (true) {
                if (i2 >= aDoArr2.length) {
                    z2 = true;
                    break;
                } else if (aDoArr2[i2] != null) {
                    z2 = false;
                    break;
                } else {
                    i2++;
                }
            }
            if (z2) {
                this.A05 = null;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0021, code lost:
        if (r3.A00 >= r3.A01) goto L_0x0023;
     */
    public void dispatchDraw(Canvas canvas) {
        boolean z;
        ADY ady = this.A09;
        ady.A02 = canvas;
        int i = 0;
        ady.A00 = 0;
        ADW adw = ady.A03;
        if (adw.A04 != null) {
            i = adw.getMountItemCount();
        }
        ady.A01 = i;
        super.dispatchDraw(canvas);
        ADY ady2 = this.A09;
        if (ady2.A02 != null) {
            z = true;
        }
        z = false;
        if (z) {
            ADY.A00(ady2);
        }
        this.A09.A02 = null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x004e, code lost:
        if (r3.A00 >= r3.A01) goto L_0x0050;
     */
    public final int getChildDrawingOrder(int i, int i2) {
        boolean z;
        int length;
        if (this.A02) {
            int childCount = getChildCount();
            if (this.A03.length < childCount) {
                this.A03 = new int[(childCount + 5)];
            }
            C23225ADo[] aDoArr = this.A04;
            if (aDoArr == null) {
                length = 0;
            } else {
                length = aDoArr.length;
            }
            int i3 = 0;
            for (int i4 = 0; i4 < length; i4++) {
                C23225ADo aDo = this.A04[i4];
                if (aDo != null && aDo.A01.A05.A01 == Constants.ONE) {
                    this.A03[i3] = indexOfChild((View) aDo.A02);
                    i3++;
                }
            }
            this.A02 = false;
        }
        ADY ady = this.A09;
        if (ady.A02 != null) {
            z = true;
        }
        z = false;
        if (z) {
            ADY.A00(ady);
        }
        return this.A03[i2];
    }

    public void setForegroundCompat(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 23) {
            C23231ADu.A00(this, drawable);
        } else {
            setForegroundLollipop(drawable);
        }
    }

    public ADW(Context context) {
        super(context);
        setWillNotDraw(false);
        setChildrenDrawingOrderEnabled(true);
        this.A04 = new C23225ADo[8];
    }

    public final void draw(Canvas canvas) {
        int A032 = AnonymousClass0Z0.A03(558765593);
        super.draw(canvas);
        Drawable drawable = this.A06;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        AnonymousClass0Z0.A0A(691222143, A032);
    }

    public final void drawableStateChanged() {
        int i;
        super.drawableStateChanged();
        C23225ADo[] aDoArr = this.A04;
        if (aDoArr == null) {
            i = 0;
        } else {
            i = aDoArr.length;
        }
        for (int i2 = 0; i2 < i; i2++) {
            C23225ADo aDo = this.A04[i2];
            if (aDo != null && aDo.A01.A05.A01 == Constants.ZERO) {
                Drawable drawable = (Drawable) aDo.A02;
                if (drawable.isStateful()) {
                    drawable.setState(getDrawableState());
                }
            }
        }
        Drawable drawable2 = this.A06;
        if (drawable2 != null) {
            drawable2.setState(getDrawableState());
        }
    }

    public boolean getClipChildren() {
        return super.getClipChildren();
    }

    public final void jumpDrawablesToCurrentState() {
        int i;
        super.jumpDrawablesToCurrentState();
        C23225ADo[] aDoArr = this.A04;
        if (aDoArr == null) {
            i = 0;
        } else {
            i = aDoArr.length;
        }
        for (int i2 = 0; i2 < i; i2++) {
            C23225ADo aDo = this.A04[i2];
            if (aDo != null && aDo.A01.A05.A01 == Constants.ZERO) {
                ((Drawable) aDo.A02).jumpToCurrentState();
            }
        }
        Drawable drawable = this.A06;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return super.onInterceptTouchEvent(motionEvent);
    }

    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        int A062 = AnonymousClass0Z0.A06(1070875406);
        super.onSizeChanged(i, i2, i3, i4);
        Drawable drawable = this.A06;
        if (drawable != null) {
            drawable.setBounds(0, 0, getRight(), getBottom());
        }
        AnonymousClass0Z0.A0D(-747375264, A062);
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x003a  */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int length;
        int A052 = AnonymousClass0Z0.A05(24382110);
        boolean z = true;
        if (isEnabled()) {
            C23225ADo[] aDoArr = this.A04;
            if (aDoArr == null) {
                length = 0;
            } else {
                length = aDoArr.length;
            }
            int i = length - 1;
            while (true) {
                if (i < 0) {
                    break;
                }
                C23225ADo aDo = aDoArr[i];
                if (aDo != null && aDo.A01.A05.A01 == Constants.ZERO) {
                    Object obj = aDo.A02;
                    if (obj instanceof C23233ADw) {
                        C23233ADw aDw = (C23233ADw) obj;
                        if (aDw.shouldHandleTouchEvent(motionEvent) && aDw.onTouchEvent(motionEvent, this)) {
                            break;
                        }
                    } else {
                        continue;
                    }
                }
                i--;
            }
            if (!z) {
                z = super.onTouchEvent(motionEvent);
            }
            AnonymousClass0Z0.A0C(763570443, A052);
            return z;
        }
        z = false;
        if (!z) {
        }
        AnonymousClass0Z0.A0C(763570443, A052);
        return z;
    }

    public void setVisibility(int i) {
        int length;
        super.setVisibility(i);
        C23225ADo[] aDoArr = this.A04;
        if (aDoArr == null) {
            length = 0;
        } else {
            length = aDoArr.length;
        }
        for (int i2 = 0; i2 < length; i2++) {
            C23225ADo aDo = this.A04[i2];
            if (aDo != null && aDo.A01.A05.A01 == Constants.ZERO) {
                Drawable drawable = (Drawable) aDo.A02;
                boolean z = false;
                if (i == 0) {
                    z = true;
                }
                drawable.setVisible(z, false);
            }
        }
    }

    public void setClipChildren(boolean z) {
        super.setClipChildren(z);
    }

    public void setInterceptTouchEventHandler(AEF aef) {
        this.A00 = aef;
    }

    public void setViewTag(Object obj) {
        this.A08 = obj;
    }

    public void setViewTags(SparseArray sparseArray) {
        this.A07 = sparseArray;
    }

    public Object getTag() {
        Object obj = this.A08;
        if (obj != null) {
            return obj;
        }
        return super.getTag();
    }

    public final Object getTag(int i) {
        Object obj;
        SparseArray sparseArray = this.A07;
        if (sparseArray == null || (obj = sparseArray.get(i)) == null) {
            return super.getTag(i);
        }
        return obj;
    }
}
