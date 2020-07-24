package p000X;

import android.util.SparseIntArray;
import android.widget.AbsListView;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.19o  reason: invalid class name and case insensitive filesystem */
public abstract class C256219o extends C256319p implements AbsListView.OnScrollListener {
    public static SparseIntArray A04;
    public static SparseIntArray A05;
    public static boolean A06;
    public int A00;
    public int A01;
    public int A02;
    public Runnable A03;

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0023, code lost:
        if (r0 > r2) goto L_0x0017;
     */
    private void A00(RecyclerView recyclerView, int i, int i2, boolean z) {
        boolean z2;
        int i3 = i2;
        int i4 = i;
        super.onScrolled(recyclerView, i, i2);
        if (!z) {
            int i5 = this.A02;
            boolean z3 = false;
            if (i5 > 0) {
                z3 = true;
            }
            if (z3) {
                int i6 = this.A00;
                if (i6 * i2 < 0) {
                    this.A00 = i2;
                } else {
                    int i7 = i6 + i2;
                    this.A00 = i7;
                    int abs = Math.abs(i7);
                    z2 = true;
                }
            }
            z2 = false;
            if (z2) {
                return;
            }
        }
        boolean z4 = false;
        if (this.A02 > 0) {
            z4 = true;
        }
        if (z4) {
            i3 = this.A00;
            this.A00 = 0;
        }
        int itemCount = recyclerView.A0J.getItemCount();
        C31391Ya r0 = recyclerView.A0L;
        int A002 = C33981do.A00(r0);
        int A012 = C33981do.A01(r0);
        int i8 = 0;
        if (A002 > -1) {
            i8 = (A012 - A002) + 1;
        }
        A09(AnonymousClass1YG.A00(recyclerView), Math.max(A002, 0), i8, itemCount, i4, i3);
    }

    public abstract void A08(C255119b r1, int i);

    public abstract void A09(C255119b r1, int i, int i2, int i3, int i4, int i5);

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        A05 = sparseIntArray;
        sparseIntArray.put(0, 0);
        sparseIntArray.put(1, 1);
        sparseIntArray.put(2, 2);
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        A04 = sparseIntArray2;
        sparseIntArray2.put(0, 0);
        sparseIntArray2.put(1, 1);
        sparseIntArray2.put(2, 2);
    }

    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
        int A032 = AnonymousClass0Z0.A03(-1610399148);
        A09(AnonymousClass1YG.A00(absListView), i, i2, i3, 0, 0);
        AnonymousClass0Z0.A0A(1341363251, A032);
    }

    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        int A032 = AnonymousClass0Z0.A03(-1960086385);
        boolean z = false;
        if (i2 == 0) {
            z = true;
        }
        A00(recyclerView, i, i2, z);
        AnonymousClass0Z0.A0A(1057555355, A032);
    }

    public final void onScrollStateChanged(AbsListView absListView, int i) {
        boolean z;
        int i2;
        int A032 = AnonymousClass0Z0.A03(-1769682703);
        if (!A06) {
            z = false;
        } else if (this.A01 == 2 && i == 0 && this.A03 == null) {
            C54282Wr r0 = new C54282Wr(this, absListView);
            this.A03 = r0;
            absListView.postOnAnimation(r0);
            this.A01 = i;
            z = true;
        } else {
            Runnable runnable = this.A03;
            if (runnable != null) {
                absListView.removeCallbacks(runnable);
                this.A03 = null;
            }
            this.A01 = i;
            z = false;
        }
        if (z) {
            i2 = -881998776;
        } else {
            int i3 = A04.get(i, -1);
            if (i3 != -1) {
                A08(AnonymousClass1YG.A00(absListView), i3);
                i2 = -2008374745;
            } else {
                IllegalStateException illegalStateException = new IllegalStateException(AnonymousClass000.A05("Unknown AbsListView State:", i));
                AnonymousClass0Z0.A0A(669395920, A032);
                throw illegalStateException;
            }
        }
        AnonymousClass0Z0.A0A(i2, A032);
    }

    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        int A032 = AnonymousClass0Z0.A03(1417106028);
        super.onScrollStateChanged(recyclerView, i);
        if (i == 0) {
            int i2 = this.A00;
            if (i2 > 0) {
                A00(recyclerView, 0, i2, true);
            }
            this.A00 = 0;
        }
        int i3 = A05.get(i, -1);
        if (i3 != -1) {
            A08(AnonymousClass1YG.A00(recyclerView), i3);
            AnonymousClass0Z0.A0A(-2089996579, A032);
            return;
        }
        IllegalStateException illegalStateException = new IllegalStateException(AnonymousClass000.A05("Unknown RecyclerView State:", i));
        AnonymousClass0Z0.A0A(-1980651712, A032);
        throw illegalStateException;
    }
}
