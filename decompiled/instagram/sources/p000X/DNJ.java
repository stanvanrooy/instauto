package p000X;

import android.view.View;

/* renamed from: X.DNJ */
public final class DNJ {
    public DNN A00;
    public DNN A01;
    public Float A02;
    public Integer A03;

    public final int[] A03(C31391Ya r6, View view) {
        int[] iArr = new int[2];
        if (r6.A1b()) {
            DNN dnn = this.A00;
            if (dnn == null || dnn.A01 != r6) {
                this.A00 = new DNN(r6, new C31501Yl(r6));
            }
            C31491Yk r0 = this.A00.A00;
            iArr[0] = A00(view, r0) - A01(r6, r0);
        } else {
            iArr[0] = 0;
        }
        if (r6.A1c()) {
            DNN dnn2 = this.A01;
            if (dnn2 == null || dnn2.A01 != r6) {
                this.A01 = new DNN(r6, new AnonymousClass1ZG(r6));
            }
            C31491Yk r02 = this.A01.A00;
            iArr[1] = A00(view, r02) - A01(r6, r02);
            return iArr;
        }
        iArr[1] = 0;
        return iArr;
    }

    private int A00(View view, C31491Yk r6) {
        Integer num = this.A03;
        switch (num.intValue()) {
            case 0:
                return r6.A0B(view);
            case 2:
                return r6.A08(view);
            default:
                throw new IllegalArgumentException(AnonymousClass000.A0E("Invalid gravity :", C205228qW.A00(num)));
        }
    }

    private int A01(C31391Ya r5, C31491Yk r6) {
        Integer num = this.A03;
        switch (num.intValue()) {
            case 0:
                Float f = this.A02;
                if (r5.A0y()) {
                    return r6.A06() + Math.round(f.floatValue());
                }
                return 0;
            case 2:
                if (r5.A0y()) {
                    return r6.A02();
                }
                return r6.A01();
            default:
                throw new IllegalArgumentException(AnonymousClass000.A0E("Invalid gravity :", C205228qW.A00(num)));
        }
    }

    public DNJ(Integer num, Float f) {
        this.A03 = num;
        this.A02 = f;
    }

    public final View A02(C31391Ya r10) {
        DNN dnn;
        if (r10.A1b()) {
            DNN dnn2 = this.A00;
            if (dnn2 == null || dnn2.A01 != r10) {
                this.A00 = new DNN(r10, new C31501Yl(r10));
            }
            dnn = this.A00;
        } else {
            DNN dnn3 = this.A01;
            if (dnn3 == null || dnn3.A01 != r10) {
                this.A01 = new DNN(r10, new AnonymousClass1ZG(r10));
            }
            dnn = this.A01;
        }
        C31491Yk r8 = dnn.A00;
        int A0R = r10.A0R();
        View view = null;
        if (A0R != 0) {
            int i = Integer.MAX_VALUE;
            int A012 = A01(r10, r8);
            for (int i2 = 0; i2 < A0R; i2++) {
                View A0a = r10.A0a(i2);
                int abs = Math.abs(A00(A0a, r8) - A012);
                if (abs < i) {
                    view = A0a;
                    i = abs;
                }
            }
        }
        return view;
    }
}
