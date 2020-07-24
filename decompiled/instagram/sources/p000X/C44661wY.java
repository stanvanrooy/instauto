package p000X;

import android.graphics.PointF;
import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.react.uimanager.BaseViewManager;

/* renamed from: X.1wY  reason: invalid class name and case insensitive filesystem */
public abstract class C44661wY {
    public int A00 = -1;
    public View A01;
    public C31391Ya A02;
    public RecyclerView A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public final C44671wZ A07 = new C44671wZ();

    public abstract void A02();

    public abstract void A04(int i, int i2, AnonymousClass1Xv r3, C44671wZ r4);

    public abstract void A05(View view, AnonymousClass1Xv r2, C44671wZ r3);

    public PointF A00(int i) {
        C31391Ya r1 = this.A02;
        if (r1 instanceof C31401Yb) {
            return ((C31401Yb) r1).A9F(i);
        }
        Log.w("RecyclerView", AnonymousClass000.A0E("You should override computeScrollVectorForPosition when the LayoutManager does not implement ", C31401Yb.class.getCanonicalName()));
        return null;
    }

    public final void A01() {
        if (this.A05) {
            this.A05 = false;
            A02();
            this.A03.A0y.A06 = -1;
            this.A01 = null;
            this.A00 = -1;
            this.A04 = false;
            C31391Ya r1 = this.A02;
            if (r1.A09 == this) {
                r1.A09 = null;
            }
            this.A02 = null;
            this.A03 = null;
        }
    }

    public final void A03(int i, int i2) {
        int i3;
        PointF A002;
        RecyclerView recyclerView = this.A03;
        if (this.A00 == -1 || recyclerView == null) {
            A01();
        }
        if (this.A04 && this.A01 == null && this.A02 != null && (A002 = A00(this.A00)) != null) {
            float f = A002.x;
            if (!(f == BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER && A002.y == BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER)) {
                recyclerView.A0p((int) Math.signum(f), (int) Math.signum(A002.y), (int[]) null);
            }
        }
        this.A04 = false;
        View view = this.A01;
        if (view != null) {
            AnonymousClass1ZK A012 = RecyclerView.A01(view);
            if (A012 != null) {
                i3 = A012.getLayoutPosition();
            } else {
                i3 = -1;
            }
            if (i3 == this.A00) {
                A05(this.A01, recyclerView.A0y, this.A07);
                this.A07.A01(recyclerView);
                A01();
            } else {
                Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
                this.A01 = null;
            }
        }
        if (this.A05) {
            A04(i, i2, recyclerView.A0y, this.A07);
            C44671wZ r2 = this.A07;
            boolean z = false;
            if (r2.A04 >= 0) {
                z = true;
            }
            r2.A01(recyclerView);
            if (z && this.A05) {
                this.A04 = true;
                recyclerView.A0Q.A00();
            }
        }
    }
}
