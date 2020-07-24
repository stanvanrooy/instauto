package com.instagram.common.p004ui.widget.recyclerview.flow;

import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.forker.Process;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.redex.PCreatorEBaseShape0S0000000_I0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p000X.AnonymousClass000;
import p000X.AnonymousClass1PH;
import p000X.AnonymousClass1Xu;
import p000X.AnonymousClass1Xv;
import p000X.AnonymousClass1ZN;
import p000X.AnonymousClass2S1;
import p000X.AnonymousClass2SH;
import p000X.C151306dV;
import p000X.C31291Xl;
import p000X.C31391Ya;
import p000X.C40341oV;
import p000X.C40361oX;
import p000X.C40371oY;
import p000X.C54462Xk;

/* renamed from: com.instagram.common.ui.widget.recyclerview.flow.FlowingGridLayoutManager */
public class FlowingGridLayoutManager extends C31391Ya {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04 = 0;
    public boolean A05 = false;
    public final Rect A06 = new Rect();
    public final C54462Xk A07;
    public final List A08 = new ArrayList();
    public final Map A09 = new HashMap();
    public final Map A0A = new HashMap();
    public final boolean A0B;

    /* renamed from: com.instagram.common.ui.widget.recyclerview.flow.FlowingGridLayoutManager$SavedState */
    public class SavedState implements Parcelable {
        public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape0S0000000_I0(28);
        public int A00;

        public final int describeContents() {
            return 0;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.A00);
        }

        public SavedState() {
        }

        public SavedState(Parcel parcel) {
            this.A00 = parcel.readInt();
        }
    }

    public final void A1L(int i) {
        A1h(i, 0);
    }

    public final boolean A1c() {
        return true;
    }

    public final boolean A1e() {
        return false;
    }

    public static int A00(FlowingGridLayoutManager flowingGridLayoutManager, int i, int i2) {
        int A0T;
        Rect A002 = flowingGridLayoutManager.A07.A00(i);
        C54462Xk r3 = flowingGridLayoutManager.A07;
        int i3 = 0;
        for (int i4 = 0; i4 < r3.A02; i4++) {
            i3 = Math.max(i3, r3.A03[i4]);
        }
        int i5 = A002.top;
        if (i3 >= ((flowingGridLayoutManager.A03 - flowingGridLayoutManager.A0T()) - flowingGridLayoutManager.A0U()) + i5 + i2) {
            A0T = i5 + i2;
        } else {
            C54462Xk r2 = flowingGridLayoutManager.A07;
            int i6 = 0;
            for (int i7 = 0; i7 < r2.A02; i7++) {
                i6 = Math.max(i6, r2.A03[i7]);
            }
            A0T = i6 - ((flowingGridLayoutManager.A03 - flowingGridLayoutManager.A0T()) - flowingGridLayoutManager.A0U());
        }
        return Math.max(0, A0T);
    }

    private void A02(C31291Xl r10) {
        this.A09.clear();
        int i = 0;
        while (i < A0R()) {
            View A0a = A0a(i);
            if (this.A0A.containsKey(A0a)) {
                this.A09.put(this.A0A.get(A0a), A0a);
                i++;
            } else {
                throw new IllegalStateException(AnonymousClass000.A05("Cannot find current rect index for View at child position: ", i));
            }
        }
        for (int A0R = A0R() - 1; A0R >= 0; A0R--) {
            A0c(A0R);
        }
        for (int i2 = 0; i2 < this.A08.size(); i2++) {
            int intValue = ((Integer) this.A08.get(i2)).intValue();
            Map map = this.A09;
            Integer valueOf = Integer.valueOf(intValue);
            if (map.containsKey(valueOf)) {
                A0i((View) this.A09.get(valueOf), -1);
                this.A09.remove(valueOf);
            } else {
                Rect A002 = this.A07.A00(intValue);
                View view = r10.A02(intValue, Long.MAX_VALUE).itemView;
                view.getLayoutParams().width = A002.width();
                view.getLayoutParams().height = A002.height();
                this.A0A.put(view, valueOf);
                C31391Ya.A0J(this, view, -1, false);
                A0h(view);
                int i3 = A002.left;
                int i4 = A002.top;
                int i5 = this.A04;
                int i6 = A002.right;
                int i7 = A002.bottom - i5;
                Rect rect = ((AnonymousClass1ZN) view.getLayoutParams()).A03;
                view.layout(i3 + rect.left, (i4 - i5) + rect.top, i6 - rect.right, i7 - rect.bottom);
            }
        }
        for (View view2 : this.A09.values()) {
            this.A0A.remove(view2);
            A0m(view2, r10);
        }
    }

    public final void A0n(AnonymousClass1PH r3, AnonymousClass1PH r4) {
        this.A07.A00 = 0;
        for (int A0R = A0R() - 1; A0R >= 0; A0R--) {
            this.A08.A04(A0R);
        }
    }

    public final void A0v(RecyclerView recyclerView, int i, int i2) {
        this.A07.A01(i);
    }

    public final Parcelable A1D() {
        SavedState savedState = new SavedState();
        savedState.A00 = this.A04;
        return savedState;
    }

    public final AnonymousClass1ZN A1F() {
        return new AnonymousClass1ZN(-2, -2);
    }

    public final void A1M(int i, int i2, AnonymousClass1Xv r8, AnonymousClass1Xu r9) {
        if (i2 != 0 && A0S() != 0 && !this.A08.isEmpty()) {
            boolean z = false;
            if (i2 > 0) {
                z = true;
            }
            int abs = Math.abs(i2);
            if (z) {
                List list = this.A08;
                int intValue = ((Integer) list.get(list.size() - 1)).intValue() + 1;
                while (intValue < r8.A00()) {
                    int i3 = this.A07.A00(intValue).top;
                    int i4 = this.A06.bottom;
                    if (i3 < i4 + abs) {
                        r9.A45(intValue, i3 - i4);
                        intValue++;
                    } else {
                        return;
                    }
                }
                return;
            }
            int intValue2 = ((Integer) this.A08.get(0)).intValue() - 1;
            while (intValue2 >= 0) {
                int i5 = this.A07.A00(intValue2).bottom;
                int i6 = this.A06.top;
                if (i5 > i6 - abs) {
                    r9.A45(intValue2, i6 - i5);
                    intValue2--;
                } else {
                    return;
                }
            }
        }
    }

    public final void A1O(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            this.A04 = ((SavedState) parcelable).A00;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:119:0x026f, code lost:
        if (((java.lang.Boolean) r4.A08.get(r1)).booleanValue() == false) goto L_0x0271;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0108, code lost:
        if (((java.lang.Boolean) r4.A08.get(r1)).booleanValue() == false) goto L_0x010a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0173, code lost:
        if (r0.Acs() == false) goto L_0x0175;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0186, code lost:
        if (r9 != -1.0f) goto L_0x0188;
     */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x0291  */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x02a7  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x02e3  */
    /* JADX WARNING: Removed duplicated region for block: B:184:0x0345 A[SYNTHETIC] */
    public final void A1Q(C31291Xl r23, AnonymousClass1Xv r24) {
        C40341oV r0;
        int i;
        boolean z;
        boolean z2;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        FlowingGridLayoutManager flowingGridLayoutManager;
        boolean z3;
        int i7;
        int i8;
        boolean z4;
        C31291Xl r5 = r23;
        if (A0S() == 0) {
            C54462Xk r3 = this.A07;
            r3.A07.clear();
            Arrays.fill(r3.A03, 0);
            Arrays.fill(r3.A04, 0);
            r3.A08.clear();
            A0o(r5);
            return;
        }
        if (this.A0B && this.A05) {
            A0p(r5);
            this.A05 = false;
        }
        if (!(this.A03 == A0U() && this.A01 == A0P() && this.A02 == this.A06 - A0Q() && this.A00 == this.A03 - A0T())) {
            this.A03 = A0U();
            this.A01 = A0P();
            this.A02 = this.A06 - A0Q();
            this.A00 = this.A03 - A0T();
            this.A07.A00 = 0;
        }
        C54462Xk r4 = this.A07;
        int A002 = r24.A00();
        int i9 = r4.A00;
        int i10 = -1;
        if (i9 != -1) {
            if (i9 == 0) {
                r4.A07.clear();
                Arrays.fill(r4.A03, 0);
                Arrays.fill(r4.A04, 0);
                r4.A08.clear();
                int A1g = (r4.A05.A1g() - ((r4.A02 - 1) * r4.A01)) / r4.A02;
                for (int i11 = 0; i11 < r4.A03.length; i11++) {
                    r4.A04[i11] = r4.A05.A0P() + ((r4.A01 + A1g) * i11);
                }
            } else if (i9 < r4.A07.size()) {
                for (int size = r4.A07.size() - 1; size >= i9; size--) {
                    Rect rect = (Rect) r4.A07.remove(size);
                    int i12 = 0;
                    int max = Math.max(0, rect.top - r4.A05.A0U());
                    Map map = r4.A08;
                    Integer valueOf = Integer.valueOf(max);
                    if (map.containsKey(valueOf)) {
                        z4 = true;
                    }
                    z4 = false;
                    if (!z4) {
                        max -= r4.A01;
                    }
                    while (true) {
                        int[] iArr = r4.A04;
                        if (i12 >= iArr.length) {
                            break;
                        }
                        int i13 = iArr[i12];
                        if (i13 >= rect.left && i13 < rect.right) {
                            r4.A03[i12] = max;
                        }
                        i12++;
                    }
                }
            }
            int i14 = (r4.A02 - 1) * r4.A01;
            int i15 = r4.A02;
            int A1g2 = (r4.A05.A1g() - i14) / i15;
            boolean[] zArr = new boolean[i15];
            while (i9 < A002) {
                AnonymousClass2SH r9 = r4.A06.A02;
                C40371oY r1 = (C40371oY) r9.A01.A05(i9);
                if (r9.A00.containsKey(r1)) {
                    r0 = (C40341oV) r9.A00.get(r1);
                } else if (r1 instanceof C40361oX) {
                    r0 = ((C40361oX) r1).A00;
                } else {
                    throw new IllegalStateException(AnonymousClass000.A05("No GridSpec at position: ", i9));
                }
                float AGA = r0.AGA();
                int AIT = r0.AIT();
                if (AIT == i10) {
                    i = r4.A02;
                } else {
                    i = AIT;
                }
                int i16 = 0;
                if (AIT == i10) {
                    z = true;
                }
                z = false;
                int i17 = r4.A02;
                boolean z5 = false;
                if (i == i17) {
                    z5 = true;
                }
                if (z5) {
                    z2 = true;
                }
                z2 = false;
                if (i <= 0) {
                    throw new IllegalStateException(AnonymousClass000.A06("columnSpan (", i, ") must be positive."));
                } else if (i > i17) {
                    throw new IllegalStateException(AnonymousClass000.A08("columnSpan (", i, ") cannot exceed totalColumnCount (", i17, ")."));
                } else if (AGA == -1.0f && i != i17) {
                    throw new IllegalStateException("Only full width items may wrap_content.");
                } else if (AGA == -1.0f || AGA > BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
                    if (z2) {
                        View view = r5.A02(i9, Long.MAX_VALUE).itemView;
                        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(r4.A05.A1g(), Process.WAIT_RESULT_TIMEOUT);
                        FlowingGridLayoutManager flowingGridLayoutManager2 = r4.A05;
                        view.measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec((flowingGridLayoutManager2.A03 - flowingGridLayoutManager2.A0T()) - flowingGridLayoutManager2.A0U(), 0));
                        i2 = view.getMeasuredHeight();
                    } else {
                        i2 = -1;
                    }
                    Arrays.fill(zArr, false);
                    int i18 = -1;
                    int i19 = -1;
                    while (i18 < 0) {
                        i19 = -1;
                        int i20 = Integer.MAX_VALUE;
                        int i21 = 0;
                        while (true) {
                            i7 = r4.A02;
                            if (i21 >= i7) {
                                break;
                            }
                            if (!zArr[i21] && (i8 = r4.A03[i21]) < i20) {
                                i19 = i21;
                                i20 = i8;
                            }
                            i21++;
                        }
                        if (i19 >= 0) {
                            int i22 = i19;
                            int i23 = i22;
                            while (i23 > 0) {
                                int[] iArr2 = r4.A03;
                                int i24 = i23 - 1;
                                if (iArr2[i24] > iArr2[i19]) {
                                    break;
                                }
                                i23 = i24;
                            }
                            while (i22 < i7 - 1) {
                                int[] iArr3 = r4.A03;
                                int i25 = i22 + 1;
                                if (iArr3[i25] > iArr3[i19]) {
                                    break;
                                }
                                i22 = i25;
                            }
                            i18 = -1;
                            if ((i22 - i23) + 1 >= i) {
                                i18 = i23;
                            }
                            zArr[i19] = true;
                        } else {
                            throw new IllegalStateException("Minimum column not found.");
                        }
                    }
                    if (i2 >= 0 || (z5 && r4.A09)) {
                        i3 = 0;
                    } else {
                        int i26 = r4.A01;
                        i3 = (i - 1) * i26;
                        i16 = (int) Math.abs(((float) i26) * ((((float) i) / AGA) - 1.0f));
                    }
                    int i27 = r4.A03[i19];
                    if (i27 != 0) {
                        Map map2 = r4.A08;
                        Integer valueOf2 = Integer.valueOf(i27);
                        if (map2.containsKey(valueOf2)) {
                            z3 = true;
                        }
                        z3 = false;
                        if (!z3) {
                            i4 = r4.A01;
                            int A0P = r4.A05.A0P() + ((r4.A01 + A1g2) * i18);
                            int A0U = r4.A05.A0U() + r4.A03[i19] + i4;
                            if (i2 < 0) {
                                i5 = r4.A05.A1g();
                                i6 = i2 + A0U;
                            } else if (!z5 || !r4.A09) {
                                int i28 = i * A1g2;
                                i5 = i3 + A0P + i28;
                                i6 = (int) (((float) A0U) + (((float) i28) / AGA) + ((float) i16));
                            } else {
                                i5 = r4.A05.A1g();
                                i6 = (int) (((float) A0U) + (((float) r4.A05.A1g()) / AGA));
                            }
                            if (A0P >= 0 && A0U >= 0) {
                                flowingGridLayoutManager = r4.A05;
                                if (i5 > flowingGridLayoutManager.A06 - flowingGridLayoutManager.A0Q()) {
                                    if (i9 < r4.A07.size()) {
                                        ((Rect) r4.A07.get(i9)).set(A0P, A0U, i5, i6);
                                    } else {
                                        r4.A07.add(new Rect(A0P, A0U, i5, i6));
                                    }
                                    int height = r4.A03[i19] + ((Rect) r4.A07.get(i9)).height() + i4;
                                    for (int i29 = 0; i29 < i; i29++) {
                                        r4.A03[i18 + i29] = height;
                                    }
                                    r4.A08.put(Integer.valueOf(height), Boolean.valueOf(z));
                                    i9++;
                                    i10 = -1;
                                }
                            }
                            throw new IllegalStateException(AnonymousClass000.A09("Child is out of bounds (l: ", A0P, ", t: ", A0U, ", r: ", i5));
                        }
                    }
                    i4 = 0;
                    int A0P2 = r4.A05.A0P() + ((r4.A01 + A1g2) * i18);
                    int A0U2 = r4.A05.A0U() + r4.A03[i19] + i4;
                    if (i2 < 0) {
                    }
                    flowingGridLayoutManager = r4.A05;
                    if (i5 > flowingGridLayoutManager.A06 - flowingGridLayoutManager.A0Q()) {
                    }
                } else {
                    throw new IllegalStateException("aspectRatio (" + AGA + ") must be positive.");
                }
            }
            for (int size2 = r4.A07.size() - 1; size2 >= A002; size2--) {
                r4.A07.remove(size2);
            }
            r4.A00 = r4.A07.size();
        }
        if (this.A07.A07.size() == A0S()) {
            A01();
            A0o(r5);
            A02(r5);
            return;
        }
        throw new IllegalStateException(AnonymousClass000.A08("rectCount (", this.A07.A07.size(), ") doesn't match adapterCount (", A0S(), ")!"));
    }

    public final void A1T(RecyclerView recyclerView) {
        this.A07.A00 = 0;
    }

    public final void A1U(RecyclerView recyclerView, int i, int i2) {
        this.A07.A01(i);
    }

    public final void A1V(RecyclerView recyclerView, int i, int i2) {
        this.A07.A01(i);
    }

    public final void A1W(RecyclerView recyclerView, int i, int i2, int i3) {
        this.A07.A00 = 0;
    }

    public final void A1X(RecyclerView recyclerView, int i, int i2, Object obj) {
        this.A07.A01(i);
    }

    public final int A1g() {
        return (this.A06 - A0Q()) - A0P();
    }

    public FlowingGridLayoutManager(AnonymousClass2S1 r7, int i, boolean z, int i2, boolean z2) {
        this.A07 = new C54462Xk(this, r7, i, i2, z2);
        this.A0B = z;
    }

    private void A01() {
        int i;
        int i2;
        int i3;
        boolean A0y = A0y();
        int i4 = 0;
        if (A0y) {
            i = A0P();
        } else {
            i = 0;
        }
        int i5 = this.A04;
        if (A0y) {
            i4 = A0U();
        }
        int i6 = i5 + i4;
        if (A0y) {
            i2 = this.A06 - A0Q();
        } else {
            i2 = this.A06;
        }
        int i7 = this.A04;
        if (A0y) {
            i3 = this.A03 - A0T();
        } else {
            i3 = this.A03;
        }
        this.A06.set(i, i6, i2, i7 + i3);
        C54462Xk r4 = this.A07;
        List list = this.A08;
        Rect rect = this.A06;
        list.clear();
        for (int i8 = 0; i8 < r4.A07.size(); i8++) {
            if (Rect.intersects(rect, (Rect) r4.A07.get(i8))) {
                list.add(Integer.valueOf(i8));
            }
        }
    }

    public final int A14(int i, C31291Xl r7, AnonymousClass1Xv r8) {
        if (r8.A00() > 0 && i != 0) {
            C54462Xk r3 = this.A07;
            int i2 = 0;
            for (int i3 = 0; i3 < r3.A02; i3++) {
                i2 = Math.max(i2, r3.A03[i3]);
            }
            int max = Math.max(0, i2 - ((this.A03 - A0T()) - A0U()));
            int i4 = this.A04;
            int i5 = i4 + i;
            if (i5 > max) {
                i = max - i4;
            } else if (i5 <= 0) {
                i = -i4;
            }
            if (i != 0) {
                int i6 = i4 + i;
                this.A04 = i6;
                if (i6 >= 0) {
                    A1J(-i);
                    A01();
                    A02(r7);
                    return i;
                }
                throw new IllegalStateException("Cannot scroll less than 0!");
            }
        }
        return 0;
    }

    public final void A1h(int i, int i2) {
        if (A0S() != 0 && this.A07.A07.size() != 0) {
            if (i >= this.A07.A07.size()) {
                i = this.A07.A07.size() - 1;
            }
            if (i < 0) {
                i = 0;
            }
            int A002 = A00(this, i, i2);
            if (this.A04 != A002) {
                this.A04 = A002;
                if (this.A0B) {
                    this.A05 = true;
                } else {
                    for (int A0R = A0R() - 1; A0R >= 0; A0R--) {
                        this.A08.A04(A0R);
                    }
                }
                A0b();
            }
        }
    }

    public final void A1i(RecyclerView recyclerView, int i) {
        if (A0S() != 0) {
            C151306dV r1 = new C151306dV(this, recyclerView.getContext());
            if (i >= this.A07.A07.size()) {
                i = this.A07.A07.size() - 1;
            }
            if (i < 0) {
                i = 0;
            }
            r1.A00 = i;
            A0t(r1);
        }
    }

    public final void A1Z(RecyclerView recyclerView, AnonymousClass1Xv r2, int i) {
        A1i(recyclerView, i);
    }
}
