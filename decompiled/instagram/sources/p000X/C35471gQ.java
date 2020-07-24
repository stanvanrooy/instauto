package p000X;

import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;

/* renamed from: X.1gQ  reason: invalid class name and case insensitive filesystem */
public final class C35471gQ implements Runnable {
    public static Comparator A04 = new C35481gR();
    public static final ThreadLocal A05 = new ThreadLocal();
    public long A00;
    public long A01;
    public ArrayList A02 = new ArrayList();
    public ArrayList A03 = new ArrayList();

    public static AnonymousClass1ZK A00(RecyclerView recyclerView, int i, long j) {
        boolean z;
        int AI5 = recyclerView.A0H.A01.AI5();
        int i2 = 0;
        while (true) {
            if (i2 >= AI5) {
                z = false;
                break;
            }
            AnonymousClass1ZK A012 = RecyclerView.A01(recyclerView.A0H.A01.AI1(i2));
            if (A012.mPosition == i && !A012.isInvalid()) {
                z = true;
                break;
            }
            i2++;
        }
        if (z) {
            return null;
        }
        C31291Xl r3 = recyclerView.A0x;
        try {
            recyclerView.A0A++;
            AnonymousClass1ZK A022 = r3.A02(i, j);
            if (A022 != null) {
                if (!A022.isBound() || A022.isInvalid()) {
                    r3.A0A(A022, false);
                } else {
                    r3.A06(A022.itemView);
                }
            }
            return A022;
        } finally {
            recyclerView.A10(false);
        }
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00ee, code lost:
        r6 = (p000X.C480626m) r15.A03.get(r7);
     */
    public final void run() {
        int i;
        C480626m r6;
        RecyclerView recyclerView;
        long j;
        WeakReference weakReference;
        RecyclerView recyclerView2;
        C480626m r0;
        try {
            AnonymousClass0ZL.A01("RV Prefetch", -966120296);
            if (this.A02.isEmpty()) {
                this.A01 = 0;
                i = 264918373;
            } else {
                int size = this.A02.size();
                long j2 = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    RecyclerView recyclerView3 = (RecyclerView) this.A02.get(i2);
                    if (recyclerView3.getWindowVisibility() == 0) {
                        j2 = Math.max(recyclerView3.getDrawingTime(), j2);
                    }
                }
                if (j2 == 0) {
                    this.A01 = 0;
                    i = 583900495;
                } else {
                    long nanos = TimeUnit.MILLISECONDS.toNanos(j2) + this.A00;
                    int size2 = this.A02.size();
                    int i3 = 0;
                    for (int i4 = 0; i4 < size2; i4++) {
                        RecyclerView recyclerView4 = (RecyclerView) this.A02.get(i4);
                        if (recyclerView4.getWindowVisibility() == 0) {
                            recyclerView4.A0I.A00(recyclerView4, false);
                            i3 += recyclerView4.A0I.A00;
                        }
                    }
                    this.A03.ensureCapacity(i3);
                    int i5 = 0;
                    for (int i6 = 0; i6 < size2; i6++) {
                        RecyclerView recyclerView5 = (RecyclerView) this.A02.get(i6);
                        if (recyclerView5.getWindowVisibility() == 0) {
                            AnonymousClass1Xt r8 = recyclerView5.A0I;
                            int abs = Math.abs(r8.A01) + Math.abs(r8.A02);
                            for (int i7 = 0; i7 < (r8.A00 << 1); i7 += 2) {
                                if (i5 >= this.A03.size()) {
                                    r0 = new C480626m();
                                    this.A03.add(r0);
                                } else {
                                    r0 = (C480626m) this.A03.get(i5);
                                }
                                int[] iArr = r8.A03;
                                int i8 = iArr[i7 + 1];
                                boolean z = false;
                                if (i8 <= abs) {
                                    z = true;
                                }
                                r0.A04 = z;
                                r0.A02 = abs;
                                r0.A00 = i8;
                                r0.A03 = recyclerView5;
                                r0.A01 = iArr[i7];
                                i5++;
                            }
                        }
                    }
                    Collections.sort(this.A03, A04);
                    int i9 = 0;
                    while (i9 < this.A03.size() && (recyclerView = r6.A03) != null) {
                        if (r6.A04) {
                            j = Long.MAX_VALUE;
                        } else {
                            j = nanos;
                        }
                        AnonymousClass1ZK A002 = A00(recyclerView, r6.A01, j);
                        if (!(A002 == null || (weakReference = A002.mNestedRecyclerView) == null || !A002.isBound() || A002.isInvalid() || (recyclerView2 = (RecyclerView) weakReference.get()) == null)) {
                            if (recyclerView2.A0U && recyclerView2.A0H.A01.AI5() != 0) {
                                recyclerView2.A0b();
                            }
                            AnonymousClass1Xt r82 = recyclerView2.A0I;
                            r82.A00(recyclerView2, true);
                            if (r82.A00 != 0) {
                                AnonymousClass0ZL.A01("RV Nested Prefetch", -1882727927);
                                AnonymousClass1Xv r10 = recyclerView2.A0y;
                                AnonymousClass1PH r1 = recyclerView2.A0J;
                                r10.A04 = 1;
                                r10.A03 = r1.getItemCount();
                                r10.A08 = false;
                                r10.A0D = false;
                                r10.A09 = false;
                                for (int i10 = 0; i10 < (r82.A00 << 1); i10 += 2) {
                                    A00(recyclerView2, r82.A03[i10], nanos);
                                }
                                AnonymousClass0ZL.A00(-839132815);
                            }
                        }
                        r6.A04 = false;
                        r6.A02 = 0;
                        r6.A00 = 0;
                        r6.A03 = null;
                        r6.A01 = 0;
                        i9++;
                    }
                    this.A01 = 0;
                    i = 1577108253;
                }
            }
            AnonymousClass0ZL.A00(i);
        } catch (Throwable th) {
            this.A01 = 0;
            AnonymousClass0ZL.A00(679703661);
            throw th;
        }
    }

    public final void A01(RecyclerView recyclerView, int i, int i2) {
        if (recyclerView.isAttachedToWindow() && this.A01 == 0) {
            this.A01 = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        AnonymousClass1Xt r0 = recyclerView.A0I;
        r0.A01 = i;
        r0.A02 = i2;
    }
}
