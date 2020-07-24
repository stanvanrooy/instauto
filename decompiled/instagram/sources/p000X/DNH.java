package p000X;

import android.graphics.PointF;
import android.view.View;
import com.facebook.forker.Process;
import com.facebook.react.uimanager.BaseViewManager;

/* renamed from: X.DNH */
public class DNH extends AnonymousClass7K9 {
    public C31491Yk A00;
    public C31491Yk A01;

    private C31491Yk A01(C31391Ya r2) {
        C31491Yk r0 = this.A00;
        if (r0 == null || r0.A02 != r2) {
            this.A00 = new C31501Yl(r2);
        }
        return this.A00;
    }

    private C31491Yk A02(C31391Ya r2) {
        C31491Yk r0 = this.A01;
        if (r0 == null || r0.A02 != r2) {
            this.A01 = new AnonymousClass1ZG(r2);
        }
        return this.A01;
    }

    public final C44651wX A06(C31391Ya r3) {
        if (!(r3 instanceof C31401Yb)) {
            return null;
        }
        return new AnonymousClass26R(this, this.A00.getContext());
    }

    public int[] A0A(C31391Ya r5, View view) {
        if (this instanceof DNK) {
            return ((DNK) this).A00.A03(r5, view);
        }
        int[] iArr = new int[2];
        if (r5.A1b()) {
            iArr[0] = A00(view, A01(r5));
        } else {
            iArr[0] = 0;
        }
        if (r5.A1c()) {
            iArr[1] = A00(view, A02(r5));
            return iArr;
        }
        iArr[1] = 0;
        return iArr;
    }

    public static int A00(View view, C31491Yk r4) {
        return (r4.A0B(view) + (r4.A09(view) >> 1)) - (r4.A06() + (r4.A07() >> 1));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:45:0x008d, code lost:
        if (r2.y < com.facebook.react.uimanager.BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) goto L_0x008f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0092  */
    public final int A04(C31391Ya r12, int i, int i2) {
        C31491Yk r9;
        boolean z;
        int i3;
        int A0S = r12.A0S();
        if (A0S != 0) {
            if (r12.A1c()) {
                r9 = A02(r12);
            } else if (r12.A1b()) {
                r9 = A01(r12);
            } else {
                r9 = null;
            }
            if (r9 != null) {
                int A0R = r12.A0R();
                View view = null;
                View view2 = null;
                int i4 = Process.WAIT_RESULT_TIMEOUT;
                int i5 = Integer.MAX_VALUE;
                for (int i6 = 0; i6 < A0R; i6++) {
                    View A0a = r12.A0a(i6);
                    if (A0a != null) {
                        int A002 = A00(A0a, r9);
                        if (A002 <= 0 && A002 > i4) {
                            view2 = A0a;
                            i4 = A002;
                        }
                        if (A002 >= 0 && A002 < i5) {
                            view = A0a;
                            i5 = A002;
                        }
                    }
                }
                boolean z2 = true;
                if (!r12.A1b() ? i2 <= 0 : i <= 0) {
                    z2 = false;
                }
                if (z2 && view != null) {
                    return C31391Ya.A0G(view);
                }
                if (!z2 && view2 != null) {
                    return C31391Ya.A0G(view2);
                }
                if (!z2) {
                    view2 = view;
                }
                if (view2 != null) {
                    int A0G = C31391Ya.A0G(view2);
                    int A0S2 = r12.A0S();
                    if (r12 instanceof C31401Yb) {
                        z = true;
                        PointF A9F = ((C31401Yb) r12).A9F(A0S2 - 1);
                        if (A9F != null) {
                            if (A9F.x >= BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
                            }
                            int i7 = 1;
                            if (z == z2) {
                                i7 = -1;
                            }
                            i3 = A0G + i7;
                            if (i3 >= 0 || i3 >= A0S) {
                                return -1;
                            }
                            return i3;
                        }
                    }
                    z = false;
                    int i72 = 1;
                    if (z == z2) {
                    }
                    i3 = A0G + i72;
                    if (i3 >= 0) {
                    }
                }
            }
        }
        return -1;
    }

    public View A05(C31391Ya r10) {
        C31491Yk A012;
        if (r10.A1c()) {
            A012 = A02(r10);
        } else if (!r10.A1b()) {
            return null;
        } else {
            A012 = A01(r10);
        }
        int A0R = r10.A0R();
        View view = null;
        if (A0R != 0) {
            int A06 = A012.A06() + (A012.A07() >> 1);
            int i = Integer.MAX_VALUE;
            for (int i2 = 0; i2 < A0R; i2++) {
                View A0a = r10.A0a(i2);
                int abs = Math.abs((A012.A0B(A0a) + (A012.A09(A0a) >> 1)) - A06);
                if (abs < i) {
                    view = A0a;
                    i = abs;
                }
            }
        }
        return view;
    }
}
