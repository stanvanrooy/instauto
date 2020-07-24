package p000X;

import android.view.View;
import android.view.ViewParent;

/* renamed from: X.1Xb  reason: invalid class name and case insensitive filesystem */
public final class C31231Xb {
    public ViewParent A00;
    public ViewParent A01;
    public boolean A02;
    public int[] A03;
    public final View A04;

    public final boolean A07(int i, int i2, int i3, int i4, int[] iArr) {
        return A01(this, i, i2, i3, i4, iArr, 0, (int[]) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r10 = r16;
     */
    public final boolean A08(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        int i4;
        ViewParent A002;
        int i5;
        int i6;
        int[] iArr3 = iArr;
        if (this.A02 && (A002 = A00(this, i4)) != null) {
            int i7 = i2;
            int i8 = i;
            if (i != 0 || i2 != 0) {
                if (iArr2 != null) {
                    this.A04.getLocationInWindow(iArr2);
                    i5 = iArr2[0];
                    i6 = iArr2[1];
                } else {
                    i5 = 0;
                    i6 = 0;
                }
                if (iArr == null) {
                    if (this.A03 == null) {
                        this.A03 = new int[2];
                    }
                    iArr3 = this.A03;
                }
                iArr3[0] = 0;
                iArr3[1] = 0;
                C480226i.A02(A002, this.A04, i8, i7, iArr3, i4);
                if (iArr2 != null) {
                    this.A04.getLocationInWindow(iArr2);
                    iArr2[0] = iArr2[0] - i5;
                    iArr2[1] = iArr2[1] - i6;
                }
                if (iArr3[0] == 0 && iArr3[1] == 0) {
                    return false;
                }
                return true;
            } else if (iArr2 != null) {
                iArr2[0] = 0;
                iArr2[1] = 0;
            }
        }
        return false;
    }

    public static ViewParent A00(C31231Xb r1, int i) {
        if (i == 0) {
            return r1.A01;
        }
        if (i != 1) {
            return null;
        }
        return r1.A00;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0007, code lost:
        r12 = r20;
     */
    public static boolean A01(C31231Xb r14, int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        int i6;
        ViewParent A002;
        int i7;
        int i8;
        int[] iArr3 = iArr2;
        if (r14.A02 && (A002 = A00(r14, i6)) != null) {
            int i9 = i2;
            int i10 = i;
            int i11 = i3;
            int i12 = i4;
            int[] iArr4 = iArr;
            if (i != 0 || i2 != 0 || i3 != 0 || i4 != 0) {
                if (iArr != null) {
                    r14.A04.getLocationInWindow(iArr4);
                    i7 = iArr[0];
                    i8 = iArr[1];
                } else {
                    i7 = 0;
                    i8 = 0;
                }
                if (iArr2 == null) {
                    if (r14.A03 == null) {
                        r14.A03 = new int[2];
                    }
                    iArr3 = r14.A03;
                    iArr3[0] = 0;
                    iArr3[1] = 0;
                }
                C480226i.A01(A002, r14.A04, i10, i9, i11, i12, i6, iArr3);
                if (iArr != null) {
                    r14.A04.getLocationInWindow(iArr4);
                    iArr[0] = iArr[0] - i7;
                    iArr[1] = iArr[1] - i8;
                }
                return true;
            } else if (iArr != null) {
                iArr[0] = 0;
                iArr[1] = 0;
            }
        }
        return false;
    }

    public final void A03(boolean z) {
        if (this.A02) {
            AnonymousClass1E1.A0L(this.A04);
        }
        this.A02 = z;
    }

    public final boolean A04(float f, float f2) {
        ViewParent A002;
        if (!this.A02 || (A002 = A00(this, 0)) == null) {
            return false;
        }
        return C480226i.A04(A002, this.A04, f, f2);
    }

    public final boolean A05(float f, float f2, boolean z) {
        ViewParent A002;
        if (!this.A02 || (A002 = A00(this, 0)) == null) {
            return false;
        }
        return C480226i.A05(A002, this.A04, f, f2, z);
    }

    public C31231Xb(View view) {
        this.A04 = view;
    }

    public final void A02(int i) {
        ViewParent A002 = A00(this, i);
        if (A002 != null) {
            C480226i.A00(A002, this.A04, i);
            if (i == 0) {
                this.A01 = null;
            } else if (i == 1) {
                this.A00 = null;
            }
        }
    }

    public final boolean A06(int i, int i2) {
        boolean z = false;
        if (A00(this, i2) != null) {
            z = true;
        }
        if (z) {
            return true;
        }
        if (!this.A02) {
            return false;
        }
        View view = this.A04;
        for (ViewParent parent = this.A04.getParent(); parent != null; parent = parent.getParent()) {
            if (C480226i.A06(parent, view, this.A04, i, i2)) {
                if (i2 == 0) {
                    this.A01 = parent;
                } else if (i2 == 1) {
                    this.A00 = parent;
                }
                C480226i.A03(parent, view, this.A04, i, i2);
                return true;
            }
            if (parent instanceof View) {
                view = (View) parent;
            }
        }
        return false;
    }
}
