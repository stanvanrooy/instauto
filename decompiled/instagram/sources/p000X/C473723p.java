package p000X;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.react.uimanager.BaseViewManager;

/* renamed from: X.23p  reason: invalid class name and case insensitive filesystem */
public final class C473723p extends AnonymousClass1YW implements C473823q {
    public static final int[] A0T = new int[0];
    public static final int[] A0U = {16842919};
    public float A00;
    public float A01;
    public int A02 = 0;
    public int A03;
    public int A04;
    public int A05 = 0;
    public int A06 = 0;
    public int A07 = 0;
    public int A08;
    public int A09;
    public RecyclerView A0A;
    public boolean A0B = false;
    public boolean A0C = false;
    public int A0D = 0;
    public final int A0E;
    public final int A0F;
    public final int A0G;
    public final int A0H;
    public final int A0I;
    public final int A0J;
    public final ValueAnimator A0K = ValueAnimator.ofFloat(new float[]{BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, 1.0f});
    public final Drawable A0L;
    public final Drawable A0M;
    public final StateListDrawable A0N;
    public final StateListDrawable A0O;
    public final C256319p A0P = new AnonymousClass5AV(this);
    public final Runnable A0Q = new AnonymousClass5AY(this);
    public final int[] A0R = new int[2];
    public final int[] A0S = new int[2];

    public final void A01(int i) {
        int i2;
        if (i == 2 && this.A07 != 2) {
            this.A0O.setState(A0U);
            this.A0A.removeCallbacks(this.A0Q);
        }
        if (i == 0) {
            this.A0A.invalidate();
        } else {
            A00();
        }
        if (this.A07 != 2 || i == 2) {
            if (i == 1) {
                i2 = 1500;
            }
            this.A07 = i;
        }
        this.A0O.setState(A0T);
        i2 = 1200;
        this.A0A.removeCallbacks(this.A0Q);
        this.A0A.postDelayed(this.A0Q, (long) i2);
        this.A07 = i;
    }

    public final void BIw(boolean z) {
    }

    public final void A00() {
        int i = this.A02;
        if (i != 0) {
            if (i == 3) {
                this.A0K.cancel();
            } else {
                return;
            }
        }
        this.A02 = 1;
        ValueAnimator valueAnimator = this.A0K;
        valueAnimator.setFloatValues(new float[]{((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f});
        this.A0K.setDuration(500);
        this.A0K.setStartDelay(0);
        this.A0K.start();
    }

    public final boolean A02(float f, float f2) {
        if (f2 >= ((float) (this.A05 - this.A0E))) {
            int i = this.A03;
            int i2 = this.A04 >> 1;
            if (f < ((float) (i - i2)) || f > ((float) (i + i2))) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final boolean A03(float f, float f2) {
        boolean z = true;
        if (this.A0A.getLayoutDirection() != 1) {
            z = false;
        }
        if (!z ? f >= ((float) (this.A06 - this.A0I)) : f <= ((float) this.A0I)) {
            int i = this.A08;
            int i2 = this.A09 >> 1;
            if (f2 < ((float) (i - i2)) || f2 > ((float) (i + i2))) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final boolean B7c(RecyclerView recyclerView, MotionEvent motionEvent) {
        int i = this.A07;
        if (i == 1) {
            boolean A032 = A03(motionEvent.getX(), motionEvent.getY());
            boolean A022 = A02(motionEvent.getX(), motionEvent.getY());
            if (motionEvent.getAction() != 0) {
                return false;
            }
            if (!A032 && !A022) {
                return false;
            }
            if (A022) {
                this.A0D = 1;
                this.A00 = (float) ((int) motionEvent.getX());
            } else if (A032) {
                this.A0D = 2;
                this.A01 = (float) ((int) motionEvent.getY());
            }
            A01(2);
        } else if (i == 2) {
            return true;
        } else {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00b9, code lost:
        if (r5 >= 0) goto L_0x00bc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0116, code lost:
        if (r4 >= 0) goto L_0x0119;
     */
    public final void BS4(RecyclerView recyclerView, MotionEvent motionEvent) {
        int i;
        int i2;
        if (this.A07 == 0) {
            return;
        }
        if (motionEvent.getAction() == 0) {
            boolean A032 = A03(motionEvent.getX(), motionEvent.getY());
            boolean A022 = A02(motionEvent.getX(), motionEvent.getY());
            if (A032 || A022) {
                if (A022) {
                    this.A0D = 1;
                    this.A00 = (float) ((int) motionEvent.getX());
                } else if (A032) {
                    this.A0D = 2;
                    this.A01 = (float) ((int) motionEvent.getY());
                }
                A01(2);
            }
        } else if (motionEvent.getAction() == 1 && this.A07 == 2) {
            this.A01 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
            this.A00 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
            A01(1);
            this.A0D = 0;
        } else if (motionEvent.getAction() == 2 && this.A07 == 2) {
            A00();
            if (this.A0D == 1) {
                float x = motionEvent.getX();
                int[] iArr = this.A0R;
                int i3 = this.A0G;
                iArr[0] = i3;
                int i4 = this.A06 - i3;
                iArr[1] = i4;
                float max = Math.max((float) iArr[0], Math.min((float) i4, x));
                if (Math.abs(((float) this.A03) - max) >= 2.0f) {
                    float f = this.A00;
                    int computeHorizontalScrollRange = this.A0A.computeHorizontalScrollRange();
                    int computeHorizontalScrollOffset = this.A0A.computeHorizontalScrollOffset();
                    int i5 = this.A06;
                    int i6 = iArr[1] - iArr[0];
                    if (i6 != 0) {
                        int i7 = computeHorizontalScrollRange - i5;
                        i2 = (int) (((max - f) / ((float) i6)) * ((float) i7));
                        int i8 = computeHorizontalScrollOffset + i2;
                        if (i8 < i7) {
                        }
                    }
                    i2 = 0;
                    if (i2 != 0) {
                        this.A0A.scrollBy(i2, 0);
                    }
                    this.A00 = max;
                }
            }
            if (this.A0D == 2) {
                float y = motionEvent.getY();
                int[] iArr2 = this.A0S;
                int i9 = this.A0G;
                iArr2[0] = i9;
                int i10 = this.A05 - i9;
                iArr2[1] = i10;
                float max2 = Math.max((float) iArr2[0], Math.min((float) i10, y));
                if (Math.abs(((float) this.A08) - max2) >= 2.0f) {
                    float f2 = this.A01;
                    int computeVerticalScrollRange = this.A0A.computeVerticalScrollRange();
                    int computeVerticalScrollOffset = this.A0A.computeVerticalScrollOffset();
                    int i11 = this.A05;
                    int i12 = iArr2[1] - iArr2[0];
                    if (i12 != 0) {
                        int i13 = computeVerticalScrollRange - i11;
                        i = (int) (((max2 - f2) / ((float) i12)) * ((float) i13));
                        int i14 = computeVerticalScrollOffset + i;
                        if (i14 < i13) {
                        }
                    }
                    i = 0;
                    if (i != 0) {
                        this.A0A.scrollBy(0, i);
                    }
                    this.A01 = max2;
                }
            }
        }
    }

    public final void onDrawOver(Canvas canvas, RecyclerView recyclerView, AnonymousClass1Xv r9) {
        if (this.A06 != this.A0A.getWidth() || this.A05 != this.A0A.getHeight()) {
            this.A06 = this.A0A.getWidth();
            this.A05 = this.A0A.getHeight();
            A01(0);
        } else if (this.A02 != 0) {
            if (this.A0C) {
                int i = this.A06;
                int i2 = this.A0I;
                int i3 = i - i2;
                int i4 = this.A08;
                int i5 = this.A09;
                int i6 = i4 - (i5 >> 1);
                this.A0O.setBounds(0, 0, i2, i5);
                this.A0M.setBounds(0, 0, this.A0J, this.A05);
                boolean z = true;
                if (this.A0A.getLayoutDirection() != 1) {
                    z = false;
                }
                if (z) {
                    this.A0M.draw(canvas);
                    canvas.translate((float) this.A0I, (float) i6);
                    canvas.scale(-1.0f, 1.0f);
                    this.A0O.draw(canvas);
                    canvas.scale(-1.0f, 1.0f);
                    i3 = this.A0I;
                } else {
                    canvas.translate((float) i3, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
                    this.A0M.draw(canvas);
                    canvas.translate(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, (float) i6);
                    this.A0O.draw(canvas);
                }
                canvas.translate((float) (-i3), (float) (-i6));
            }
            if (this.A0B) {
                int i7 = this.A05;
                int i8 = this.A0E;
                int i9 = i7 - i8;
                int i10 = this.A03;
                int i11 = this.A04;
                int i12 = i10 - (i11 >> 1);
                this.A0N.setBounds(0, 0, i11, i8);
                this.A0L.setBounds(0, 0, this.A06, this.A0F);
                canvas.translate(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, (float) i9);
                this.A0L.draw(canvas);
                canvas.translate((float) i12, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
                this.A0N.draw(canvas);
                canvas.translate((float) (-i12), (float) (-i9));
            }
        }
    }

    public C473723p(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i, int i2, int i3) {
        this.A0O = stateListDrawable;
        this.A0M = drawable;
        this.A0N = stateListDrawable2;
        this.A0L = drawable2;
        this.A0I = Math.max(i, stateListDrawable.getIntrinsicWidth());
        this.A0J = Math.max(i, drawable.getIntrinsicWidth());
        this.A0E = Math.max(i, stateListDrawable2.getIntrinsicWidth());
        this.A0F = Math.max(i, drawable2.getIntrinsicWidth());
        this.A0H = i2;
        this.A0G = i3;
        this.A0O.setAlpha(255);
        this.A0M.setAlpha(255);
        this.A0K.addListener(new AnonymousClass5AX(this));
        this.A0K.addUpdateListener(new AnonymousClass5AW(this));
        RecyclerView recyclerView2 = this.A0A;
        if (recyclerView2 != recyclerView) {
            if (recyclerView2 != null) {
                recyclerView2.A0s(this);
                this.A0A.A0v(this);
                this.A0A.A0x(this.A0P);
                this.A0A.removeCallbacks(this.A0Q);
            }
            this.A0A = recyclerView;
            if (recyclerView != null) {
                recyclerView.A0r(this);
                this.A0A.A12.add(this);
                this.A0A.A0w(this.A0P);
            }
        }
    }
}
