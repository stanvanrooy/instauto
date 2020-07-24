package com.instagram.p009ui.widget.pageindicator;

import android.animation.ArgbEvaluator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import com.facebook.C0003R;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass1E8;
import p000X.AnonymousClass1EG;
import p000X.AnonymousClass1EM;
import p000X.AnonymousClass1wT;
import p000X.AnonymousClass8AL;
import p000X.C019000b;
import p000X.C06220Of;
import p000X.C06400Ox;
import p000X.C256519s;
import p000X.C27181Gu;
import p000X.C32501bN;
import p000X.C44611wS;
import p000X.C92803zk;

/* renamed from: com.instagram.ui.widget.pageindicator.CirclePageIndicator */
public class CirclePageIndicator extends View implements C44611wS, AnonymousClass1E8, C256519s {
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public boolean A05;
    public int A06;
    public final int A07;
    public final ArgbEvaluator A08;
    public final Paint A09;
    public final int A0A;
    public final int A0B;
    public final int A0C;
    public final C92803zk A0D;
    public final boolean A0E;

    public final void BDU(int i, int i2) {
        A01(i, false);
    }

    public final void BDW(int i) {
    }

    public final void BDX(int i) {
    }

    public final void BDi(int i, int i2) {
    }

    public final void BLD(float f, float f2, C32501bN r10) {
        this.A00 = (float) C27181Gu.A00((double) f, 0.0d, (double) (this.A02 - 1));
        invalidate();
    }

    public final void BLO(C32501bN r1, C32501bN r2) {
    }

    public final void BOF(AnonymousClass1EG r1) {
    }

    public final void BOH(AnonymousClass1EG r1) {
    }

    public final void BOI(AnonymousClass1EG r1) {
    }

    public final void BQW(int i, int i2) {
    }

    public final void BVp(View view) {
    }

    public final void onPageScrollStateChanged(int i) {
    }

    public final void onPageScrolled(int i, float f, int i2) {
    }

    public final void onPageSelected(int i) {
        A01(i, false);
    }

    private void setCurrentPage(int i) {
        this.A03 = i;
        double targetScrollPosition = (double) getTargetScrollPosition();
        if (targetScrollPosition != ((AnonymousClass1EG) this.A0D.get()).A01) {
            ((AnonymousClass1EG) this.A0D.get()).A03(targetScrollPosition);
        }
        invalidate();
    }

    public final void BOK(AnonymousClass1EG r5) {
        double A002;
        if (this.A02 > this.A06) {
            if (this.A0E) {
                A002 = 1.0d - r5.A00();
            } else {
                A002 = r5.A00();
            }
            setScrollX((int) Math.round(A002));
            return;
        }
        setScrollX(0);
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x00ce  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00f8  */
    public final void onDraw(Canvas canvas) {
        int paddingLeft;
        int i;
        int i2;
        int i3;
        float f;
        float f2;
        Paint paint;
        ArgbEvaluator argbEvaluator;
        Integer valueOf;
        int i4;
        double d;
        double d2;
        double d3;
        double d4;
        double d5;
        double scrollX;
        double paddingLeft2;
        double d6;
        Canvas canvas2 = canvas;
        super.onDraw(canvas2);
        if (this.A0E) {
            paddingLeft = getWidth() - getPaddingRight();
        } else {
            paddingLeft = getPaddingLeft();
        }
        int paddingTop = getPaddingTop() + (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) >> 1);
        boolean z = this.A0E;
        int i5 = 1;
        if (z) {
            i5 = -1;
        }
        if (z) {
            i = this.A02 - 1;
        } else {
            i = 0;
        }
        while (true) {
            if (this.A0E) {
                if (i < 0) {
                    return;
                }
            } else if (i >= this.A02) {
                return;
            }
            int i6 = this.A0B;
            int i7 = paddingLeft + (i6 * i5);
            float f3 = (float) i6;
            if (this.A02 > this.A06) {
                if ((i6 + i7) - getScrollX() > getWidth() - getPaddingRight()) {
                    scrollX = (double) ((this.A0B + i7) - getScrollX());
                    paddingLeft2 = (double) (getWidth() - getPaddingRight());
                    d6 = (double) getWidth();
                } else if ((i7 - this.A0B) - getScrollX() < getPaddingLeft()) {
                    scrollX = (double) ((i7 - this.A0B) - getScrollX());
                    paddingLeft2 = (double) getPaddingLeft();
                    d6 = 0.0d;
                }
                f3 = (float) C27181Gu.A01(scrollX, paddingLeft2, d6, (double) this.A0B, 0.0d);
            }
            if (this.A0E) {
                i2 = (this.A02 - i) - 1;
            } else {
                i2 = i;
            }
            if (this.A05) {
                float f4 = this.A00;
                double d7 = (double) f4;
                int floor = (int) Math.floor(d7);
                int ceil = (int) Math.ceil(d7);
                int i8 = this.A03;
                float f5 = (float) ceil;
                if (floor == i8) {
                    f5 = f4;
                    f4 = (float) floor;
                }
                float f6 = f5 - f4;
                if (i2 == i8) {
                    paint = this.A09;
                    argbEvaluator = this.A08;
                    valueOf = Integer.valueOf(this.A01);
                    i4 = this.A04;
                } else if (i2 == floor || i2 == ceil) {
                    paint = this.A09;
                    argbEvaluator = this.A08;
                    valueOf = Integer.valueOf(this.A04);
                    i4 = this.A01;
                } else {
                    this.A09.setColor(this.A04);
                    if (i2 != this.A03) {
                        d = (double) (1.0f - f6);
                        d4 = 0.0d;
                        d5 = 1.0d;
                        d2 = (double) (f3 * 0.8f);
                        d3 = (double) f3;
                    } else if (i2 == floor || i2 == ceil) {
                        d = (double) f6;
                        d2 = (double) (f3 * 0.8f);
                        d3 = (double) f3;
                        d4 = 0.0d;
                        d5 = 1.0d;
                    } else {
                        f = (float) i7;
                        f2 = (float) paddingTop;
                        f3 *= 0.8f;
                        canvas2.drawCircle(f, f2, f3, this.A09);
                        paddingLeft = i7 + ((this.A0B + this.A0C) * i5);
                        i += i5;
                    }
                    f3 = (float) C27181Gu.A01(d, d4, d5, d2, d3);
                }
                paint.setColor(((Integer) argbEvaluator.evaluate(f6, valueOf, Integer.valueOf(i4))).intValue());
                if (i2 != this.A03) {
                }
                f3 = (float) C27181Gu.A01(d, d4, d5, d2, d3);
            } else {
                if (i2 != this.A03) {
                    f3 *= 0.8f;
                }
                if (this.A07 != -1) {
                    Paint paint2 = new Paint(1);
                    paint2.setColor(C019000b.A00(getContext(), C0003R.color.black_15_transparent));
                    paint2.setMaskFilter(new BlurMaskFilter((float) this.A07, BlurMaskFilter.Blur.NORMAL));
                    setLayerType(1, (Paint) null);
                    canvas2.drawCircle((float) i7, (float) paddingTop, ((float) this.A07) + f3, paint2);
                }
                Paint paint3 = this.A09;
                if (i2 == this.A03) {
                    i3 = this.A01;
                } else {
                    i3 = this.A04;
                }
                paint3.setColor(i3);
            }
            f = (float) i7;
            f2 = (float) paddingTop;
            canvas2.drawCircle(f, f2, f3, this.A09);
            paddingLeft = i7 + ((this.A0B + this.A0C) * i5);
            i += i5;
        }
    }

    public void setActiveColor(int i) {
        this.A01 = i;
        invalidate();
    }

    public void setInactiveColor(int i) {
        this.A04 = i;
        invalidate();
    }

    private int getTargetScrollPosition() {
        int i;
        int paddingLeft = getPaddingLeft();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i3 >= this.A02) {
                i = 0;
                break;
            }
            int i4 = this.A0B;
            int i5 = paddingLeft + i4;
            if (i3 == this.A03) {
                i2 = i5 - i4;
                i = i2 + (i4 << 1);
                break;
            }
            paddingLeft = i5 + i4 + this.A0C;
            i3++;
        }
        int paddingLeft2 = i2 - getPaddingLeft();
        int width = (i - getWidth()) + getPaddingRight();
        if (width > getScrollX()) {
            return width;
        }
        if (paddingLeft2 >= getScrollX()) {
            return getScrollX();
        }
        return paddingLeft2;
    }

    public final void A00(int i, int i2) {
        setCurrentPage(i);
        this.A02 = i2;
        requestLayout();
    }

    public final void A01(int i, boolean z) {
        setCurrentPage(i);
        if (z) {
            setScrollX(0);
            ((AnonymousClass1EG) this.A0D.get()).A05((double) getTargetScrollPosition(), true);
        }
    }

    public final void onAttachedToWindow() {
        int A062 = AnonymousClass0Z0.A06(-913693523);
        super.onAttachedToWindow();
        ((AnonymousClass1EG) this.A0D.get()).A07(this);
        AnonymousClass0Z0.A0D(-658242455, A062);
    }

    public final void onDetachedFromWindow() {
        int A062 = AnonymousClass0Z0.A06(-1280897534);
        super.onDetachedFromWindow();
        AnonymousClass1EG r0 = (AnonymousClass1EG) this.A0D.get();
        r0.A02();
        r0.A08(this);
        AnonymousClass0Z0.A0D(-1263765291, A062);
    }

    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int i3 = this.A07;
        if (i3 == -1) {
            i3 = 0;
        }
        if (mode != 1073741824) {
            int i4 = this.A02;
            int paddingLeft = getPaddingLeft() + getPaddingRight() + ((i4 << 1) * (this.A0B + i3)) + ((i4 - 1) * this.A0C);
            if (mode == Integer.MIN_VALUE) {
                size = Math.min(paddingLeft, size);
            } else {
                size = paddingLeft;
            }
            int i5 = this.A0A;
            if (i5 != -1) {
                size = Math.min(i5, size);
            }
        }
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode2 != 1073741824) {
            int paddingBottom = getPaddingBottom() + ((this.A0B + i3) << 1) + getPaddingTop();
            if (mode2 == Integer.MIN_VALUE) {
                size2 = Math.min(paddingBottom, size2);
            } else {
                size2 = paddingBottom;
            }
        }
        setMeasuredDimension(size, size2);
    }

    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        int A062 = AnonymousClass0Z0.A06(-643988674);
        super.onSizeChanged(i, i2, i3, i4);
        setScrollX(0);
        ((AnonymousClass1EG) this.A0D.get()).A05((double) getTargetScrollPosition(), true);
        AnonymousClass0Z0.A0D(191314593, A062);
    }

    public void setAnimatePageDotSelection(boolean z) {
        this.A05 = z;
    }

    public CirclePageIndicator(Context context) {
        this(context, (AttributeSet) null);
    }

    public CirclePageIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CirclePageIndicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A09 = new Paint(1);
        this.A08 = new ArgbEvaluator();
        Context context2 = getContext();
        this.A0E = C06400Ox.A02(context2);
        getContext();
        int A002 = C019000b.A00(context2, C0003R.color.grey_5);
        int A052 = (int) C06220Of.A05(getResources().getDisplayMetrics(), 3);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AnonymousClass1EM.A0g, i, 0);
            this.A01 = obtainStyledAttributes.getColor(0, A002);
            this.A04 = obtainStyledAttributes.getColor(3, A002);
            this.A0B = obtainStyledAttributes.getDimensionPixelSize(1, A052);
            this.A0C = obtainStyledAttributes.getDimensionPixelOffset(2, A052);
            this.A06 = obtainStyledAttributes.getInt(6, 5);
            this.A0A = obtainStyledAttributes.getDimensionPixelSize(4, -1);
            this.A07 = obtainStyledAttributes.getDimensionPixelSize(5, -1);
            obtainStyledAttributes.recycle();
        } else {
            this.A01 = A002;
            this.A04 = A002;
            this.A0B = A052;
            this.A0C = A052;
            this.A0A = -1;
            this.A07 = -1;
        }
        this.A0D = AnonymousClass8AL.A00(new AnonymousClass1wT(this));
    }
}
