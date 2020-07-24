package p000X;

import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import com.facebook.react.uimanager.BaseViewManager;
import java.util.Arrays;

/* renamed from: X.AFk */
public final class AFk {
    public static final Interpolator A0M = new C23277AFw();
    public float A00;
    public float A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public View A07;
    public boolean A08;
    public float[] A09;
    public float[] A0A;
    public float[] A0B;
    public float[] A0C;
    public int[] A0D;
    public int[] A0E;
    public int[] A0F;
    public int A0G = -1;
    public VelocityTracker A0H;
    public OverScroller A0I;
    public final ViewGroup A0J;
    public final C23271AFp A0K;
    public final Runnable A0L = new C23275AFu(this);

    private void A02(float f, float f2, int i) {
        int i2 = 1;
        if (!A06(f, f2, i, 1)) {
            i2 = 0;
        }
        if (A06(f2, f, i, 4)) {
            i2 |= 4;
        }
        if (A06(f, f2, i, 2)) {
            i2 |= 2;
        }
        if (A06(f2, f, i, 8)) {
            i2 |= 8;
        }
        if (i2 != 0) {
            int[] iArr = this.A0D;
            iArr[i] = iArr[i] | i2;
            this.A0K.A05(i2, i);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0026 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    private boolean A09(View view, float f, float f2) {
        float abs;
        if (view == null) {
            return false;
        }
        boolean z = false;
        if (this.A0K.A00(view) > 0) {
            z = true;
        }
        boolean z2 = false;
        if (this.A0K.A01(view) > 0) {
            z2 = true;
        }
        if (!z || !z2) {
            if (z) {
                abs = Math.abs(f);
            } else if (!z2) {
                return false;
            } else {
                abs = Math.abs(f2);
            }
            return abs > ((float) this.A05);
        }
        int i = this.A05;
        if ((f * f) + (f2 * f2) <= ((float) (i * i))) {
            return false;
        }
    }

    public static final boolean A0A(View view, int i, int i2) {
        return view != null && i >= view.getLeft() && i < view.getRight() && i2 >= view.getTop() && i2 < view.getBottom();
    }

    public final void A0D() {
        this.A0G = -1;
        float[] fArr = this.A09;
        if (fArr != null) {
            Arrays.fill(fArr, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
            Arrays.fill(this.A0A, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
            Arrays.fill(this.A0B, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
            Arrays.fill(this.A0C, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
            Arrays.fill(this.A0F, 0);
            Arrays.fill(this.A0D, 0);
            Arrays.fill(this.A0E, 0);
            this.A04 = 0;
        }
        VelocityTracker velocityTracker = this.A0H;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.A0H = null;
        }
    }

    private int A00(int i, int i2, int i3) {
        int i4;
        if (i == 0) {
            return 0;
        }
        int width = this.A0J.getWidth();
        float abs = (float) Math.abs(i);
        float f = (float) (width >> 1);
        float sin = f + (((float) Math.sin((double) ((Math.min(1.0f, abs / ((float) width)) - 0.5f) * 0.47123894f))) * f);
        int abs2 = Math.abs(i2);
        if (abs2 > 0) {
            i4 = Math.round(Math.abs(sin / ((float) abs2)) * 1000.0f) << 2;
        } else {
            i4 = (int) (((abs / ((float) i3)) + 1.0f) * 256.0f);
        }
        return Math.min(i4, 600);
    }

    private void A01() {
        this.A0H.computeCurrentVelocity(1000, this.A00);
        float xVelocity = this.A0H.getXVelocity(this.A0G);
        float f = this.A01;
        float f2 = this.A00;
        float abs = Math.abs(xVelocity);
        if (abs < f) {
            xVelocity = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
        } else if (abs > f2) {
            if (xVelocity <= BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
                f2 = -f2;
            }
            xVelocity = f2;
        }
        float yVelocity = this.A0H.getYVelocity(this.A0G);
        float f3 = this.A01;
        float f4 = this.A00;
        float abs2 = Math.abs(yVelocity);
        if (abs2 < f3) {
            yVelocity = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
        } else if (abs2 > f4) {
            if (yVelocity <= BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
                f4 = -f4;
            }
            yVelocity = f4;
        }
        this.A08 = true;
        this.A0K.A06(this.A07, xVelocity, yVelocity);
        this.A08 = false;
        if (this.A02 == 1) {
            A0E(0);
        }
    }

    private void A03(float f, float f2, int i) {
        float[] fArr = this.A09;
        if (fArr == null || fArr.length <= i) {
            int i2 = i + 1;
            float[] fArr2 = new float[i2];
            float[] fArr3 = new float[i2];
            float[] fArr4 = new float[i2];
            float[] fArr5 = new float[i2];
            int[] iArr = new int[i2];
            int[] iArr2 = new int[i2];
            int[] iArr3 = new int[i2];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.A0A;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.A0B;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.A0C;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.A0F;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.A0D;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.A0E;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.A09 = fArr2;
            this.A0A = fArr3;
            this.A0B = fArr4;
            this.A0C = fArr5;
            this.A0F = iArr;
            this.A0D = iArr2;
            this.A0E = iArr3;
        }
        float[] fArr9 = this.A09;
        this.A0B[i] = f;
        fArr9[i] = f;
        float[] fArr10 = this.A0A;
        this.A0C[i] = f2;
        fArr10[i] = f2;
        int[] iArr7 = this.A0F;
        int i3 = (int) f;
        int i4 = (int) f2;
        int i5 = 0;
        if (i3 < this.A0J.getLeft() + this.A03) {
            i5 = 1;
        }
        if (i4 < this.A0J.getTop() + this.A03) {
            i5 |= 4;
        }
        if (i3 > this.A0J.getRight() - this.A03) {
            i5 |= 2;
        }
        if (i4 > this.A0J.getBottom() - this.A03) {
            i5 |= 8;
        }
        iArr7[i] = i5;
        this.A04 |= 1 << i;
    }

    private void A04(int i) {
        float[] fArr = this.A09;
        if (fArr != null) {
            int i2 = this.A04;
            boolean z = true;
            int i3 = 1 << i;
            if ((i3 & i2) == 0) {
                z = false;
            }
            if (z) {
                fArr[i] = 0.0f;
                this.A0A[i] = 0.0f;
                this.A0B[i] = 0.0f;
                this.A0C[i] = 0.0f;
                this.A0F[i] = 0;
                this.A0D[i] = 0;
                this.A0E[i] = 0;
                this.A04 = (i3 ^ -1) & i2;
            }
        }
    }

    private boolean A07(int i) {
        boolean z = true;
        if (((1 << i) & this.A04) == 0) {
            z = false;
        }
        if (z) {
            return true;
        }
        Log.e("ViewDragHelper", AnonymousClass000.A06("Ignoring pointerId=", i, " because ACTION_DOWN was not received for this pointer before ACTION_MOVE. It likely happened because  ViewDragHelper did not receive all the events in the event stream."));
        return false;
    }

    private boolean A08(int i, int i2, int i3, int i4) {
        float f;
        float f2;
        int i5 = i4;
        int i6 = i3;
        int left = this.A07.getLeft();
        int top = this.A07.getTop();
        int i7 = i - left;
        int i8 = i2 - top;
        if (i7 == 0 && i8 == 0) {
            this.A0I.abortAnimation();
            A0E(0);
            return false;
        }
        View view = this.A07;
        int i9 = (int) this.A01;
        int i10 = (int) this.A00;
        int i11 = i10;
        int abs = Math.abs(i6);
        if (abs < i9) {
            i6 = 0;
        } else if (abs > i10) {
            if (i3 <= 0) {
                i11 = -i10;
            }
            i6 = i11;
        }
        int abs2 = Math.abs(i5);
        if (abs2 < i9) {
            i5 = 0;
        } else if (abs2 > i10) {
            if (i4 <= 0) {
                i10 = -i10;
            }
            i5 = i10;
        }
        int abs3 = Math.abs(i7);
        int abs4 = Math.abs(i8);
        int abs5 = Math.abs(i6);
        int abs6 = Math.abs(i5);
        int i12 = abs5 + abs6;
        int i13 = abs3 + abs4;
        if (i6 != 0) {
            f = (float) abs5;
            f2 = (float) i12;
        } else {
            f = (float) abs3;
            f2 = (float) i13;
        }
        float f3 = f / f2;
        float f4 = (float) abs4;
        float f5 = (float) i13;
        if (i5 != 0) {
            f4 = (float) abs6;
            f5 = (float) i12;
        }
        int A002 = A00(i7, i6, this.A0K.A00(view));
        OverScroller overScroller = this.A0I;
        overScroller.startScroll(left, top, i7, i8, (int) ((((float) A002) * f3) + (((float) A00(i8, i5, this.A0K.A01(view))) * (f4 / f5))));
        A0E(2);
        return true;
    }

    public final View A0B(int i, int i2) {
        for (int childCount = this.A0J.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = this.A0J.getChildAt(childCount);
            if (i >= childAt.getLeft() && i < childAt.getRight() && i2 >= childAt.getTop() && i2 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    public final void A0E(int i) {
        this.A0J.removeCallbacks(this.A0L);
        if (this.A02 != i) {
            this.A02 = i;
            this.A0K.A04(i);
            if (this.A02 == 0) {
                this.A07 = null;
            }
        }
    }

    public final boolean A0H() {
        if (this.A02 == 2) {
            boolean computeScrollOffset = this.A0I.computeScrollOffset();
            int currX = this.A0I.getCurrX();
            int currY = this.A0I.getCurrY();
            int left = currX - this.A07.getLeft();
            int top = currY - this.A07.getTop();
            if (left != 0) {
                AnonymousClass1E1.A0S(this.A07, left);
            }
            if (top != 0) {
                AnonymousClass1E1.A0T(this.A07, top);
            }
            if (!(left == 0 && top == 0)) {
                this.A0K.A08(this.A07, currX, currY, left, top);
            }
            if (computeScrollOffset && currX == this.A0I.getFinalX() && currY == this.A0I.getFinalY()) {
                this.A0I.abortAnimation();
                computeScrollOffset = false;
            }
            if (!computeScrollOffset) {
                this.A0J.post(this.A0L);
            }
        }
        if (this.A02 == 2) {
            return true;
        }
        return false;
    }

    public final boolean A0I(int i, int i2) {
        if (this.A08) {
            return A08(i, i2, (int) this.A0H.getXVelocity(this.A0G), (int) this.A0H.getYVelocity(this.A0G));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x009c, code lost:
        if (A09(r7, r13, r8) == false) goto L_0x009e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00cb, code lost:
        if (r5 != r6) goto L_0x00d8;
     */
    public final boolean A0J(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        View A0B2;
        MotionEvent motionEvent2 = motionEvent;
        int actionMasked = motionEvent2.getActionMasked();
        int actionIndex = motionEvent2.getActionIndex();
        if (actionMasked == 0) {
            A0D();
        }
        if (this.A0H == null) {
            this.A0H = VelocityTracker.obtain();
        }
        this.A0H.addMovement(motionEvent2);
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        if (actionMasked == 5) {
                            int pointerId = motionEvent2.getPointerId(actionIndex);
                            float x = motionEvent2.getX(actionIndex);
                            float y = motionEvent2.getY(actionIndex);
                            A03(x, y, pointerId);
                            int i = this.A02;
                            if (i != 0 && i == 2 && (A0B2 = A0B((int) x, (int) y)) == this.A07) {
                                A0K(A0B2, pointerId);
                            }
                        } else if (actionMasked == 6) {
                            A04(motionEvent2.getPointerId(actionIndex));
                        }
                    }
                } else if (!(this.A09 == null || this.A0A == null)) {
                    int pointerCount = motionEvent2.getPointerCount();
                    for (int i2 = 0; i2 < pointerCount; i2++) {
                        int pointerId2 = motionEvent2.getPointerId(i2);
                        if (A07(pointerId2)) {
                            float x2 = motionEvent2.getX(i2);
                            float y2 = motionEvent2.getY(i2);
                            float f = x2 - this.A09[pointerId2];
                            float f2 = y2 - this.A0A[pointerId2];
                            View A0B3 = A0B((int) x2, (int) y2);
                            if (A0B3 != null) {
                                z2 = true;
                            }
                            z2 = false;
                            if (z2) {
                                int left = A0B3.getLeft();
                                int i3 = (int) f;
                                int A022 = this.A0K.A02(A0B3, left + i3, i3);
                                int top = A0B3.getTop();
                                int i4 = (int) f2;
                                int A032 = this.A0K.A03(A0B3, top + i4, i4);
                                int A002 = this.A0K.A00(A0B3);
                                int A012 = this.A0K.A01(A0B3);
                                if (A002 != 0) {
                                    if (A002 > 0) {
                                    }
                                }
                                if (A012 != 0) {
                                    if (A012 > 0 && A032 == top) {
                                        break;
                                    }
                                } else {
                                    break;
                                }
                            }
                            A02(f, f2, pointerId2);
                            if (this.A02 != 1) {
                                if (z2 && A0K(A0B3, pointerId2)) {
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                    }
                    A05(motionEvent2);
                }
                z = false;
            }
            A0D();
            z = false;
        } else {
            float x3 = motionEvent2.getX();
            float y3 = motionEvent2.getY();
            z = false;
            int pointerId3 = motionEvent2.getPointerId(0);
            A03(x3, y3, pointerId3);
            View A0B4 = A0B((int) x3, (int) y3);
            if (A0B4 == this.A07 && this.A02 == 2) {
                A0K(A0B4, pointerId3);
            }
        }
        if (this.A02 == 1) {
            return true;
        }
        return z;
    }

    public final boolean A0K(View view, int i) {
        if (view == this.A07 && this.A0G == i) {
            return true;
        }
        if (view == null || !this.A0K.A09(view, i)) {
            return false;
        }
        this.A0G = i;
        A0G(view, i);
        return true;
    }

    public final boolean A0L(View view, int i, int i2) {
        this.A07 = view;
        this.A0G = -1;
        boolean A082 = A08(i, i2, 0, 0);
        if (!A082 && this.A02 == 0 && this.A07 != null) {
            this.A07 = null;
        }
        return A082;
    }

    public AFk(Context context, ViewGroup viewGroup, C23271AFp aFp) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("Parent view may not be null");
        } else if (aFp != null) {
            this.A0J = viewGroup;
            this.A0K = aFp;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            this.A03 = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
            this.A05 = viewConfiguration.getScaledTouchSlop();
            this.A00 = (float) viewConfiguration.getScaledMaximumFlingVelocity();
            this.A01 = (float) viewConfiguration.getScaledMinimumFlingVelocity();
            this.A0I = new OverScroller(context, A0M);
        } else {
            throw new IllegalArgumentException("Callback may not be null");
        }
    }

    private void A05(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i = 0; i < pointerCount; i++) {
            int pointerId = motionEvent.getPointerId(i);
            if (A07(pointerId)) {
                float x = motionEvent.getX(i);
                float y = motionEvent.getY(i);
                this.A0B[pointerId] = x;
                this.A0C[pointerId] = y;
            }
        }
    }

    private boolean A06(float f, float f2, int i, int i2) {
        int i3;
        float abs = Math.abs(f);
        float abs2 = Math.abs(f2);
        if (!((this.A0F[i] & i2) != i2 || (this.A06 & i2) == 0 || (this.A0E[i] & i2) == i2 || (i3 = this.A0D[i] & i2) == i2)) {
            float f3 = (float) this.A05;
            if ((abs > f3 || abs2 > f3) && i3 == 0 && abs > f3) {
                return true;
            }
        }
        return false;
    }

    public final void A0C() {
        A0D();
        if (this.A02 == 2) {
            int currX = this.A0I.getCurrX();
            int currY = this.A0I.getCurrY();
            this.A0I.abortAnimation();
            int currX2 = this.A0I.getCurrX();
            int currY2 = this.A0I.getCurrY();
            this.A0K.A08(this.A07, currX2, currY2, currX2 - currX, currY2 - currY);
        }
        A0E(0);
    }

    public final void A0F(MotionEvent motionEvent) {
        int i;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            A0D();
        }
        if (this.A0H == null) {
            this.A0H = VelocityTracker.obtain();
        }
        this.A0H.addMovement(motionEvent);
        int i2 = 0;
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    if (this.A02 != 1) {
                        int pointerCount = motionEvent.getPointerCount();
                        while (i2 < pointerCount) {
                            int pointerId = motionEvent.getPointerId(i2);
                            if (A07(pointerId)) {
                                float x = motionEvent.getX(i2);
                                float y = motionEvent.getY(i2);
                                float f = x - this.A09[pointerId];
                                float f2 = y - this.A0A[pointerId];
                                A02(f, f2, pointerId);
                                if (this.A02 == 1) {
                                    break;
                                }
                                View A0B2 = A0B((int) x, (int) y);
                                if (A09(A0B2, f, f2) && A0K(A0B2, pointerId)) {
                                    break;
                                }
                            }
                            i2++;
                        }
                    } else if (A07(this.A0G)) {
                        int findPointerIndex = motionEvent.findPointerIndex(this.A0G);
                        float x2 = motionEvent.getX(findPointerIndex);
                        float y2 = motionEvent.getY(findPointerIndex);
                        float[] fArr = this.A0B;
                        int i3 = this.A0G;
                        int i4 = (int) (x2 - fArr[i3]);
                        int i5 = (int) (y2 - this.A0C[i3]);
                        int left = this.A07.getLeft() + i4;
                        int top = this.A07.getTop() + i5;
                        int left2 = this.A07.getLeft();
                        int top2 = this.A07.getTop();
                        if (i4 != 0) {
                            left = this.A0K.A02(this.A07, left, i4);
                            AnonymousClass1E1.A0S(this.A07, left - left2);
                        }
                        if (i5 != 0) {
                            top = this.A0K.A03(this.A07, top, i5);
                            AnonymousClass1E1.A0T(this.A07, top - top2);
                        }
                        if (!(i4 == 0 && i5 == 0)) {
                            this.A0K.A08(this.A07, left, top, left - left2, top - top2);
                        }
                    } else {
                        return;
                    }
                    A05(motionEvent);
                    return;
                } else if (actionMasked != 3) {
                    if (actionMasked == 5) {
                        int pointerId2 = motionEvent.getPointerId(actionIndex);
                        float x3 = motionEvent.getX(actionIndex);
                        float y3 = motionEvent.getY(actionIndex);
                        A03(x3, y3, pointerId2);
                        if (this.A02 == 0) {
                            A0K(A0B((int) x3, (int) y3), pointerId2);
                            return;
                        }
                        if (A0A(this.A07, (int) x3, (int) y3)) {
                            A0K(this.A07, pointerId2);
                            return;
                        }
                        return;
                    } else if (actionMasked == 6) {
                        int pointerId3 = motionEvent.getPointerId(actionIndex);
                        if (this.A02 == 1 && pointerId3 == this.A0G) {
                            int pointerCount2 = motionEvent.getPointerCount();
                            while (true) {
                                if (i2 >= pointerCount2) {
                                    i = -1;
                                    break;
                                }
                                int pointerId4 = motionEvent.getPointerId(i2);
                                if (pointerId4 != this.A0G) {
                                    View A0B3 = A0B((int) motionEvent.getX(i2), (int) motionEvent.getY(i2));
                                    View view = this.A07;
                                    if (A0B3 == view && A0K(view, pointerId4)) {
                                        i = this.A0G;
                                        break;
                                    }
                                }
                                i2++;
                            }
                            if (i == -1) {
                                A01();
                            }
                        }
                        A04(pointerId3);
                        return;
                    } else {
                        return;
                    }
                } else if (this.A02 == 1) {
                    this.A08 = true;
                    this.A0K.A06(this.A07, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
                    this.A08 = false;
                    if (this.A02 == 1) {
                        A0E(0);
                    }
                }
            } else if (this.A02 == 1) {
                A01();
            }
            A0D();
            return;
        }
        float x4 = motionEvent.getX();
        float y4 = motionEvent.getY();
        int pointerId5 = motionEvent.getPointerId(0);
        View A0B4 = A0B((int) x4, (int) y4);
        A03(x4, y4, pointerId5);
        A0K(A0B4, pointerId5);
    }

    public final void A0G(View view, int i) {
        ViewParent parent = view.getParent();
        ViewGroup viewGroup = this.A0J;
        if (parent == viewGroup) {
            this.A07 = view;
            this.A0G = i;
            this.A0K.A07(view, i);
            A0E(1);
            return;
        }
        throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + viewGroup + ")");
    }
}
