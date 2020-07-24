package p000X;

import android.graphics.PointF;
import android.view.View;
import com.facebook.forker.Process;
import com.facebook.react.uimanager.BaseViewManager;

/* renamed from: X.DNI */
public class DNI extends AnonymousClass7K9 {
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

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0017, code lost:
        r2 = r4 - 1;
     */
    public final int A04(C31391Ya r10, int i, int i2) {
        int A0S;
        View A05;
        int A0G;
        int i3;
        PointF A9F;
        int i4;
        if (!(!(r10 instanceof C31401Yb) || (A0S = r10.A0S()) == 0 || (A05 = A05(r10)) == null || (A0G = C31391Ya.A0G(A05)) == -1 || (A9F = ((C31401Yb) r10).A9F(i3)) == null)) {
            int i5 = 0;
            if (r10.A1b()) {
                i4 = A00(r10, A01(r10), i, 0);
                if (A9F.x < BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
                    i4 = -i4;
                }
            } else {
                i4 = 0;
            }
            if (r10.A1c()) {
                i5 = A00(r10, A02(r10), 0, i2);
                if (A9F.y < BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
                    i5 = -i5;
                }
            }
            if (r10.A1c()) {
                i4 = i5;
            }
            if (i4 != 0) {
                int i6 = A0G + i4;
                if (i6 < 0) {
                    i6 = 0;
                }
                if (i6 >= A0S) {
                    return i3;
                }
                return i6;
            }
        }
        return -1;
    }

    public int[] A0A(C31391Ya r8, View view) {
        if (this instanceof DNL) {
            return ((DNL) this).A00.A03(r8, view);
        }
        int[] iArr = new int[2];
        if (r8.A1b()) {
            C31491Yk A012 = A01(r8);
            iArr[0] = (A012.A0B(view) + (A012.A09(view) >> 1)) - (A012.A06() + (A012.A07() >> 1));
        } else {
            iArr[0] = 0;
        }
        if (r8.A1c()) {
            C31491Yk A02 = A02(r8);
            iArr[1] = (A02.A0B(view) + (A02.A09(view) >> 1)) - (A02.A06() + (A02.A07() >> 1));
            return iArr;
        }
        iArr[1] = 0;
        return iArr;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x005b A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x005c  */
    private int A00(C31391Ya r12, C31491Yk r13, int i, int i2) {
        float f;
        int max;
        int[] A09 = A09(i, i2);
        int A0R = r12.A0R();
        if (A0R != 0) {
            View view = null;
            View view2 = null;
            int i3 = Integer.MAX_VALUE;
            int i4 = Process.WAIT_RESULT_TIMEOUT;
            for (int i5 = 0; i5 < A0R; i5++) {
                View A0a = r12.A0a(i5);
                int A0G = C31391Ya.A0G(A0a);
                if (A0G != -1) {
                    if (A0G < i3) {
                        view = A0a;
                        i3 = A0G;
                    }
                    if (A0G > i4) {
                        view2 = A0a;
                        i4 = A0G;
                    }
                }
            }
            if (!(view == null || view2 == null || (max = Math.max(r13.A08(view), r13.A08(view2)) - Math.min(r13.A0B(view), r13.A0B(view2))) == 0)) {
                f = (((float) max) * 1.0f) / ((float) ((i4 - i3) + 1));
                if (f > BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
                    return 0;
                }
                int i6 = A09[0];
                int abs = Math.abs(i6);
                int i7 = A09[1];
                if (abs > Math.abs(i7)) {
                    i7 = i6;
                }
                return Math.round(((float) i7) / f);
            }
        }
        f = 1.0f;
        if (f > BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
        }
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
