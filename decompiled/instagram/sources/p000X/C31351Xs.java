package p000X;

import android.os.Build;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;
import org.webrtc.CameraVideoCapturer;

/* renamed from: X.1Xs  reason: invalid class name and case insensitive filesystem */
public final class C31351Xs implements Runnable {
    public int A00;
    public int A01;
    public Interpolator A02;
    public OverScroller A03;
    public boolean A04 = false;
    public boolean A05 = false;
    public final /* synthetic */ RecyclerView A06;

    public C31351Xs(RecyclerView recyclerView) {
        this.A06 = recyclerView;
        Interpolator interpolator = RecyclerView.A1C;
        this.A02 = interpolator;
        this.A03 = new OverScroller(recyclerView.getContext(), interpolator);
    }

    public final void A00() {
        if (this.A04) {
            this.A05 = true;
            return;
        }
        this.A06.removeCallbacks(this);
        this.A06.postOnAnimation(this);
    }

    public final void A01(int i, int i2, int i3, Interpolator interpolator) {
        int height;
        int i4;
        int i5 = i3;
        Interpolator interpolator2 = interpolator;
        int i6 = i2;
        int i7 = i;
        if (i5 == Integer.MIN_VALUE) {
            int abs = Math.abs(i7);
            int abs2 = Math.abs(i6);
            boolean z = false;
            if (abs > abs2) {
                z = true;
            }
            int sqrt = (int) Math.sqrt((double) 0);
            int sqrt2 = (int) Math.sqrt((double) ((i * i) + (i2 * i2)));
            RecyclerView recyclerView = this.A06;
            if (z) {
                height = recyclerView.getWidth();
            } else {
                height = recyclerView.getHeight();
            }
            float f = (float) height;
            float f2 = (float) (height >> 1);
            float sin = f2 + (((float) Math.sin((double) ((Math.min(1.0f, (((float) sqrt2) * 1.0f) / f) - 0.5f) * 0.47123894f))) * f2);
            if (sqrt > 0) {
                i4 = Math.round(Math.abs(sin / ((float) sqrt)) * 1000.0f) << 2;
            } else {
                if (!z) {
                    abs = abs2;
                }
                i4 = (int) (((((float) abs) / f) + 1.0f) * 300.0f);
            }
            i5 = Math.min(i4, CameraVideoCapturer.CameraStatistics.CAMERA_OBSERVER_PERIOD_MS);
        }
        if (interpolator == null) {
            interpolator2 = RecyclerView.A1C;
        }
        if (this.A02 != interpolator2) {
            this.A02 = interpolator2;
            this.A03 = new OverScroller(this.A06.getContext(), interpolator2);
        }
        this.A01 = 0;
        this.A00 = 0;
        this.A06.setScrollState(2);
        this.A03.startScroll(0, 0, i7, i6, i5);
        if (Build.VERSION.SDK_INT < 23) {
            this.A03.computeScrollOffset();
        }
        A00();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0103, code lost:
        if (r1 == false) goto L_0x0105;
     */
    public final void run() {
        int i;
        int i2;
        int i3;
        boolean z;
        boolean z2;
        int i4;
        int A032 = AnonymousClass0Z0.A03(-365608472);
        RecyclerView recyclerView = this.A06;
        if (recyclerView.A0L == null) {
            recyclerView.removeCallbacks(this);
            this.A03.abortAnimation();
            i = 185966960;
        } else {
            this.A05 = false;
            this.A04 = true;
            recyclerView.A0S();
            OverScroller overScroller = this.A03;
            if (overScroller.computeScrollOffset()) {
                int currX = overScroller.getCurrX();
                int currY = overScroller.getCurrY();
                int i5 = currX - this.A00;
                int i6 = currY - this.A01;
                this.A00 = currX;
                this.A01 = currY;
                RecyclerView recyclerView2 = this.A06;
                int[] iArr = recyclerView2.A0s;
                iArr[0] = 0;
                iArr[1] = 0;
                if (recyclerView2.A16(i5, i6, iArr)) {
                    int[] iArr2 = this.A06.A0s;
                    i5 -= iArr2[0];
                    i6 -= iArr2[1];
                }
                if (this.A06.getOverScrollMode() != 2) {
                    this.A06.A0i(i5, i6);
                }
                RecyclerView recyclerView3 = this.A06;
                if (recyclerView3.A0J != null) {
                    int[] iArr3 = recyclerView3.A0s;
                    iArr3[0] = 0;
                    iArr3[1] = 0;
                    recyclerView3.A0p(i5, i6, iArr3);
                    RecyclerView recyclerView4 = this.A06;
                    int[] iArr4 = recyclerView4.A0s;
                    i2 = iArr4[0];
                    i3 = iArr4[1];
                    i5 -= i2;
                    i6 -= i3;
                    C44661wY r8 = recyclerView4.A0L.A09;
                    if (r8 != null && !r8.A04 && r8.A05) {
                        int A002 = recyclerView4.A0y.A00();
                        if (A002 == 0) {
                            r8.A01();
                        } else if (r8.A00 >= A002) {
                            r8.A00 = A002 - 1;
                            r8.A03(i2, i3);
                        } else {
                            r8.A03(i2, i3);
                        }
                    }
                } else {
                    i2 = 0;
                    i3 = 0;
                }
                if (!this.A06.A11.isEmpty()) {
                    this.A06.invalidate();
                }
                RecyclerView recyclerView5 = this.A06;
                int[] iArr5 = recyclerView5.A0s;
                iArr5[0] = 0;
                iArr5[1] = 0;
                recyclerView5.A0m(i2, i3, i5, i6, iArr5);
                RecyclerView recyclerView6 = this.A06;
                int[] iArr6 = recyclerView6.A0s;
                int i7 = i5 - iArr6[0];
                int i8 = i6 - iArr6[1];
                if (!(i2 == 0 && i3 == 0)) {
                    recyclerView6.A0k(i2, i3);
                }
                if (!this.A06.awakenScrollBars()) {
                    this.A06.invalidate();
                }
                boolean z3 = false;
                if (overScroller.getCurrX() == overScroller.getFinalX()) {
                    z3 = true;
                }
                boolean z4 = false;
                if (overScroller.getCurrY() == overScroller.getFinalY()) {
                    z4 = true;
                }
                if (overScroller.isFinished() || ((z3 || i7 != 0) && (z4 || i8 != 0))) {
                    z = true;
                } else {
                    z = false;
                }
                RecyclerView recyclerView7 = this.A06;
                C44661wY r0 = recyclerView7.A0L.A09;
                if (r0 != null) {
                    boolean z5 = r0.A04;
                    z2 = true;
                }
                z2 = false;
                if (z2 || !z) {
                    A00();
                    RecyclerView recyclerView8 = this.A06;
                    C35471gQ r02 = recyclerView8.mGapWorker;
                    if (r02 != null) {
                        r02.A01(recyclerView8, i2, i3);
                    }
                } else {
                    if (recyclerView7.getOverScrollMode() != 2) {
                        int currVelocity = (int) overScroller.getCurrVelocity();
                        if (i7 < 0) {
                            i4 = -currVelocity;
                        } else {
                            i4 = 0;
                            if (i7 > 0) {
                                i4 = currVelocity;
                            }
                        }
                        if (i8 < 0) {
                            currVelocity = -currVelocity;
                        } else if (i8 <= 0) {
                            currVelocity = 0;
                        }
                        RecyclerView recyclerView9 = this.A06;
                        if (i4 < 0) {
                            recyclerView9.A0X();
                            if (recyclerView9.A0D.isFinished()) {
                                recyclerView9.A0D.onAbsorb(-i4);
                            }
                        } else if (i4 > 0) {
                            recyclerView9.A0Y();
                            if (recyclerView9.A0E.isFinished()) {
                                recyclerView9.A0E.onAbsorb(i4);
                            }
                        }
                        if (currVelocity < 0) {
                            recyclerView9.A0Z();
                            if (recyclerView9.A0F.isFinished()) {
                                recyclerView9.A0F.onAbsorb(-currVelocity);
                            }
                        } else if (currVelocity > 0) {
                            recyclerView9.A0W();
                            if (recyclerView9.A0C.isFinished()) {
                                recyclerView9.A0C.onAbsorb(currVelocity);
                            }
                        }
                        if (!(i4 == 0 && currVelocity == 0)) {
                            AnonymousClass1E1.A0I(recyclerView9);
                        }
                    }
                    if (RecyclerView.A1A) {
                        AnonymousClass1Xt r6 = this.A06.A0I;
                        int[] iArr7 = r6.A03;
                        if (iArr7 != null) {
                            Arrays.fill(iArr7, -1);
                        }
                        r6.A00 = 0;
                    }
                }
            }
            C44661wY r1 = this.A06.A0L.A09;
            if (r1 != null && r1.A04) {
                r1.A03(0, 0);
            }
            this.A04 = false;
            if (this.A05) {
                this.A06.removeCallbacks(this);
                this.A06.postOnAnimation(this);
            } else {
                this.A06.setScrollState(0);
                this.A06.BqR(1);
            }
            i = 809759386;
        }
        AnonymousClass0Z0.A0A(i, A032);
    }
}
