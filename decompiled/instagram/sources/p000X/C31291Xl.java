package p000X;

import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: X.1Xl  reason: invalid class name and case insensitive filesystem */
public final class C31291Xl {
    public int A00;
    public int A01;
    public C31521Yp A02;
    public C14260k9 A03;
    public ArrayList A04 = null;
    public final ArrayList A05;
    public final ArrayList A06 = new ArrayList();
    public final List A07;
    public final /* synthetic */ RecyclerView A08;

    public C31291Xl(RecyclerView recyclerView) {
        this.A08 = recyclerView;
        ArrayList arrayList = new ArrayList();
        this.A05 = arrayList;
        this.A07 = Collections.unmodifiableList(arrayList);
        this.A01 = 2;
        this.A00 = 2;
    }

    public final int A01(int i) {
        if (i >= 0) {
            RecyclerView recyclerView = this.A08;
            AnonymousClass1Xv r1 = recyclerView.A0y;
            if (i < r1.A00()) {
                if (!r1.A08) {
                    return i;
                }
                return recyclerView.A0G.A04(i, 0);
            }
        }
        RecyclerView recyclerView2 = this.A08;
        throw new IndexOutOfBoundsException(AnonymousClass000.A08("invalid position ", i, ". State item count is ", recyclerView2.A0y.A00(), recyclerView2.A0R()));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003b, code lost:
        if (r8 != null) goto L_0x003e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:229:0x0450, code lost:
        if (r1 < 0) goto L_0x0452;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:231:0x0453, code lost:
        if (r0 == false) goto L_0x03e1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:238:0x048a, code lost:
        if (r1 == false) goto L_0x048c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0181, code lost:
        if (r1 < 0) goto L_0x0183;
     */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x029c  */
    /* JADX WARNING: Removed duplicated region for block: B:206:0x03ea  */
    /* JADX WARNING: Removed duplicated region for block: B:214:0x0402  */
    /* JADX WARNING: Removed duplicated region for block: B:259:0x04e0  */
    public final AnonymousClass1ZK A02(int i, long j) {
        AnonymousClass1ZK r8;
        boolean z;
        boolean z2;
        boolean z3;
        AnonymousClass1YC A09;
        boolean z4;
        ViewGroup.LayoutParams layoutParams;
        AnonymousClass1ZN r2;
        ViewGroup.LayoutParams generateLayoutParams;
        RecyclerView A022;
        boolean z5;
        AnonymousClass1ZK r0;
        AnonymousClass1ZK r82;
        AnonymousClass1ZK r83;
        View view;
        AnonymousClass1ZK r84;
        int i2;
        boolean z6;
        int size;
        int A042;
        if (i >= 0) {
            AnonymousClass1Xv r1 = this.A08.A0y;
            if (i < r1.A00()) {
                boolean z7 = true;
                if (r1.A08) {
                    ArrayList arrayList = this.A04;
                    if (arrayList != null && (size = arrayList.size()) != 0) {
                        int i3 = 0;
                        int i4 = 0;
                        while (true) {
                            if (i4 < size) {
                                r8 = (AnonymousClass1ZK) this.A04.get(i4);
                                if (!r8.wasReturnedFromScrap() && r8.getLayoutPosition() == i) {
                                    break;
                                }
                                i4++;
                            } else {
                                RecyclerView recyclerView = this.A08;
                                if (recyclerView.A0J.hasStableIds() && (A042 = recyclerView.A0G.A04(i, 0)) > 0 && A042 < this.A08.A0J.getItemCount()) {
                                    long itemId = this.A08.A0J.getItemId(A042);
                                    while (true) {
                                        if (i3 >= size) {
                                            break;
                                        }
                                        r8 = (AnonymousClass1ZK) this.A04.get(i3);
                                        if (!r8.wasReturnedFromScrap() && r8.mItemId == itemId) {
                                            break;
                                        }
                                        i3++;
                                    }
                                }
                            }
                        }
                        r8.addFlags(32);
                        z = true;
                    }
                    r8 = null;
                    z = true;
                } else {
                    r8 = null;
                }
                z = false;
                if (r8 == null) {
                    int size2 = this.A05.size();
                    int i5 = 0;
                    int i6 = 0;
                    while (true) {
                        if (i6 >= size2) {
                            AnonymousClass1Y7 r10 = this.A08.A0H;
                            int size3 = r10.A02.size();
                            int i7 = 0;
                            while (true) {
                                if (i7 >= size3) {
                                    view = null;
                                    break;
                                }
                                view = (View) r10.A02.get(i7);
                                AnonymousClass1ZK AI9 = r10.A01.AI9(view);
                                if (AI9.getLayoutPosition() == i && !AI9.isInvalid() && !AI9.isRemoved()) {
                                    break;
                                }
                                i7++;
                            }
                            if (view == null) {
                                int size4 = this.A06.size();
                                while (true) {
                                    if (i5 >= size4) {
                                        r84 = null;
                                        break;
                                    }
                                    r84 = (AnonymousClass1ZK) this.A06.get(i5);
                                    if (!r84.isInvalid() && r84.getLayoutPosition() == i && !r84.isAttachedToTransitionOverlay()) {
                                        this.A06.remove(i5);
                                        break;
                                    }
                                    i5++;
                                }
                            } else {
                                r84 = RecyclerView.A01(view);
                                AnonymousClass1Y7 r9 = this.A08.A0H;
                                int indexOfChild = r9.A01.indexOfChild(view);
                                if (indexOfChild >= 0) {
                                    AnonymousClass1YA r12 = r9.A00;
                                    if (r12.A06(indexOfChild)) {
                                        r12.A03(indexOfChild);
                                        AnonymousClass1Y7.A01(r9, view);
                                        AnonymousClass1Y7 r13 = this.A08.A0H;
                                        int indexOfChild2 = r13.A01.indexOfChild(view);
                                        if (indexOfChild2 != -1) {
                                            AnonymousClass1YA r14 = r13.A00;
                                            if (!r14.A06(indexOfChild2)) {
                                                i2 = indexOfChild2 - r14.A01(indexOfChild2);
                                                if (i2 == -1) {
                                                    AnonymousClass1Y7 r3 = this.A08.A0H;
                                                    int A002 = AnonymousClass1Y7.A00(r3, i2);
                                                    r3.A00.A07(A002);
                                                    r3.A01.ABw(A002);
                                                    A07(view);
                                                    r84.addFlags(8224);
                                                } else {
                                                    throw new IllegalStateException("layout index should not be -1 after unhiding a view:" + r84 + this.A08.A0R());
                                                }
                                            }
                                        }
                                        i2 = -1;
                                        if (i2 == -1) {
                                        }
                                    } else {
                                        throw new RuntimeException("trying to unhide a view that was not hidden" + view);
                                    }
                                } else {
                                    throw new IllegalArgumentException("view is not a child, cannot hide " + view);
                                }
                            }
                        } else {
                            r84 = (AnonymousClass1ZK) this.A05.get(i6);
                            if (r84.wasReturnedFromScrap() || r84.getLayoutPosition() != i || r84.isInvalid() || (!this.A08.A0y.A08 && r84.isRemoved())) {
                                i6++;
                            }
                        }
                    }
                    r84.addFlags(32);
                    if (r8 != null) {
                        if (r8.isRemoved()) {
                            z6 = this.A08.A0y.A08;
                        } else {
                            int i8 = r8.mPosition;
                            if (i8 < 0 || i8 >= this.A08.A0J.getItemCount()) {
                                throw new IndexOutOfBoundsException("Inconsistency detected. Invalid view holder adapter position" + r8 + this.A08.A0R());
                            }
                            RecyclerView recyclerView2 = this.A08;
                            z6 = false;
                            if (recyclerView2.A0y.A08 || recyclerView2.A0J.getItemViewType(r8.mPosition) == r8.mItemViewType) {
                                AnonymousClass1PH r92 = this.A08.A0J;
                                if (!r92.hasStableIds() || r8.mItemId == r92.getItemId(r8.mPosition)) {
                                    z6 = true;
                                }
                            }
                        }
                        if (!z6) {
                            r8.addFlags(4);
                            if (r8.isScrap()) {
                                this.A08.removeDetachedView(r8.itemView, false);
                                r8.unScrap();
                            } else if (r8.wasReturnedFromScrap()) {
                                r8.clearReturnedFromScrapFlag();
                            }
                            A08(r8);
                            r8 = null;
                        } else {
                            z = true;
                        }
                    }
                }
                if (r8 == null) {
                    int A043 = this.A08.A0G.A04(i, 0);
                    if (A043 < 0 || A043 >= this.A08.A0J.getItemCount()) {
                        StringBuilder sb = new StringBuilder("Inconsistency detected. Invalid item position ");
                        sb.append(i);
                        sb.append("(offset:");
                        sb.append(A043);
                        sb.append(").state:");
                        RecyclerView recyclerView3 = this.A08;
                        sb.append(recyclerView3.A0y.A00());
                        sb.append(recyclerView3.A0R());
                        throw new IndexOutOfBoundsException(sb.toString());
                    }
                    int itemViewType = this.A08.A0J.getItemViewType(A043);
                    AnonymousClass1PH r15 = this.A08.A0J;
                    if (r15.hasStableIds()) {
                        long itemId2 = r15.getItemId(A043);
                        int size5 = this.A05.size() - 1;
                        while (true) {
                            if (size5 < 0) {
                                int size6 = this.A06.size() - 1;
                                while (true) {
                                    if (size6 < 0) {
                                        r83 = null;
                                        break;
                                    }
                                    r83 = (AnonymousClass1ZK) this.A06.get(size6);
                                    if (r83.mItemId != itemId2 || r83.isAttachedToTransitionOverlay()) {
                                        size6--;
                                    } else if (itemViewType == r83.mItemViewType) {
                                        this.A06.remove(size6);
                                    } else {
                                        A05(size6);
                                        r83 = null;
                                    }
                                }
                            } else {
                                r83 = (AnonymousClass1ZK) this.A05.get(size5);
                                if (r83.mItemId == itemId2 && !r83.wasReturnedFromScrap()) {
                                    if (itemViewType == r83.mItemViewType) {
                                        r83.addFlags(32);
                                        if (r83.isRemoved() && !this.A08.A0y.A08) {
                                            r83.setFlags(2, 14);
                                        }
                                    } else {
                                        this.A05.remove(size5);
                                        this.A08.removeDetachedView(r83.itemView, false);
                                        AnonymousClass1ZK A012 = RecyclerView.A01(r83.itemView);
                                        A012.mScrapContainer = null;
                                        A012.mInChangeScrap = false;
                                        A012.clearReturnedFromScrapFlag();
                                        A08(A012);
                                    }
                                }
                                size5--;
                            }
                        }
                        if (r8 != null) {
                            r8.mPosition = A043;
                            z = true;
                        }
                    }
                    if (r8 == null) {
                        if (this.A02 == null) {
                            this.A02 = new C31521Yp();
                        }
                        AnonymousClass1ZP r16 = (AnonymousClass1ZP) this.A02.A01.get(itemViewType);
                        if (r16 != null && !r16.A03.isEmpty()) {
                            ArrayList arrayList2 = r16.A03;
                            int size7 = arrayList2.size() - 1;
                            while (true) {
                                if (size7 < 0) {
                                    break;
                                } else if (!((AnonymousClass1ZK) arrayList2.get(size7)).isAttachedToTransitionOverlay()) {
                                    r0 = (AnonymousClass1ZK) arrayList2.remove(size7);
                                    r82 = r0;
                                    break;
                                } else {
                                    size7--;
                                }
                            }
                        }
                        r0 = null;
                        r82 = null;
                        if (r0 != null) {
                            r8.resetInternal();
                            if (RecyclerView.A1B) {
                                View view2 = r8.itemView;
                                if (view2 instanceof ViewGroup) {
                                    A00((ViewGroup) view2, false);
                                }
                            }
                        }
                    }
                    if (r8 == null) {
                        long nanoTime = this.A08.getNanoTime();
                        if (j != Long.MAX_VALUE) {
                            long j2 = C31521Yp.A00(this.A02, itemViewType).A02;
                            if (j2 != 0) {
                                int i9 = ((nanoTime + j2) > j ? 1 : ((nanoTime + j2) == j ? 0 : -1));
                                z5 = false;
                            }
                            z5 = true;
                            if (!z5) {
                                return null;
                            }
                        }
                        RecyclerView recyclerView4 = this.A08;
                        r8 = recyclerView4.A0J.createViewHolder(recyclerView4, itemViewType);
                        if (RecyclerView.A1A && (A022 = RecyclerView.A02(r8.itemView)) != null) {
                            r8.mNestedRecyclerView = new WeakReference(A022);
                        }
                        long nanoTime2 = this.A08.getNanoTime() - nanoTime;
                        AnonymousClass1ZP A003 = C31521Yp.A00(this.A02, itemViewType);
                        long j3 = A003.A02;
                        if (j3 != 0) {
                            nanoTime2 = ((j3 / 4) * 3) + (nanoTime2 / 4);
                        }
                        A003.A02 = nanoTime2;
                    }
                }
                if (z) {
                    AnonymousClass1Xv r22 = this.A08.A0y;
                    if (!r22.A08 && r8.hasAnyOfTheFlags(8192)) {
                        r8.setFlags(0, 8192);
                        if (r22.A0B) {
                            C31341Xr.A04(r8);
                            C31341Xr r02 = this.A08.A0K;
                            r8.getUnmodifiedPayloads();
                            this.A08.A0y(r8, r02.A07(r8));
                        }
                    }
                }
                RecyclerView recyclerView5 = this.A08;
                if (recyclerView5.A0y.A08 && r8.isBound()) {
                    r8.mPreLayoutPosition = i;
                } else if (!r8.isBound() || r8.needsUpdate() || r8.isInvalid()) {
                    int A044 = recyclerView5.A0G.A04(i, 0);
                    RecyclerView recyclerView6 = this.A08;
                    r8.mOwnerRecyclerView = recyclerView6;
                    int i10 = r8.mItemViewType;
                    long nanoTime3 = recyclerView6.getNanoTime();
                    if (j != Long.MAX_VALUE) {
                        long j4 = C31521Yp.A00(this.A02, i10).A01;
                        if (j4 != 0) {
                            int i11 = ((nanoTime3 + j4) > j ? 1 : ((nanoTime3 + j4) == j ? 0 : -1));
                            z4 = false;
                        }
                        z4 = true;
                    }
                    this.A08.A0J.bindViewHolder(r8, A044);
                    long nanoTime4 = this.A08.getNanoTime() - nanoTime3;
                    AnonymousClass1ZP A004 = C31521Yp.A00(this.A02, r8.mItemViewType);
                    long j5 = A004.A01;
                    if (j5 != 0) {
                        nanoTime4 = ((j5 / 4) * 3) + (nanoTime4 / 4);
                    }
                    A004.A01 = nanoTime4;
                    AccessibilityManager accessibilityManager = this.A08.A0w;
                    if (accessibilityManager != null) {
                        boolean isEnabled = accessibilityManager.isEnabled();
                        z2 = true;
                    }
                    z2 = false;
                    if (z2) {
                        View view3 = r8.itemView;
                        if (view3.getImportantForAccessibility() == 0) {
                            AnonymousClass1E1.A0V(view3, 1);
                        }
                        AnonymousClass1YB r03 = this.A08.A0R;
                        if (r03 != null) {
                            AnonymousClass1YE r23 = r03.A01;
                            if (!(!(r23 instanceof AnonymousClass1YE) || (A09 = AnonymousClass1E1.A09(view3)) == null || A09 == r23)) {
                                r23.A00.put(view3, A09);
                            }
                            AnonymousClass1E1.A0b(view3, r23);
                        }
                    }
                    if (this.A08.A0y.A08) {
                        r8.mPreLayoutPosition = i;
                    }
                    z3 = true;
                    layoutParams = r8.itemView.getLayoutParams();
                    if (layoutParams != null) {
                        generateLayoutParams = this.A08.generateDefaultLayoutParams();
                    } else {
                        RecyclerView recyclerView7 = this.A08;
                        if (!recyclerView7.checkLayoutParams(layoutParams)) {
                            generateLayoutParams = recyclerView7.generateLayoutParams(layoutParams);
                        } else {
                            r2 = (AnonymousClass1ZN) layoutParams;
                            r2.A01 = r8;
                            if (!z || !z3) {
                                z7 = false;
                            }
                            r2.A00 = z7;
                            return r8;
                        }
                    }
                    r2 = (AnonymousClass1ZN) generateLayoutParams;
                    r8.itemView.setLayoutParams(r2);
                    r2.A01 = r8;
                    z7 = false;
                    r2.A00 = z7;
                    return r8;
                }
                z3 = false;
                layoutParams = r8.itemView.getLayoutParams();
                if (layoutParams != null) {
                }
                r2 = (AnonymousClass1ZN) generateLayoutParams;
                r8.itemView.setLayoutParams(r2);
                r2.A01 = r8;
                z7 = false;
                r2.A00 = z7;
                return r8;
            }
        }
        StringBuilder sb2 = new StringBuilder("Invalid item position ");
        sb2.append(i);
        sb2.append("(");
        sb2.append(i);
        sb2.append("). Item count:");
        RecyclerView recyclerView8 = this.A08;
        sb2.append(recyclerView8.A0y.A00());
        sb2.append(recyclerView8.A0R());
        throw new IndexOutOfBoundsException(sb2.toString());
    }

    public final void A03() {
        for (int size = this.A06.size() - 1; size >= 0; size--) {
            A05(size);
        }
        this.A06.clear();
        if (RecyclerView.A1A) {
            AnonymousClass1Xt r2 = this.A08.A0I;
            int[] iArr = r2.A03;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            r2.A00 = 0;
        }
    }

    public final void A04() {
        int i;
        C31391Ya r0 = this.A08.A0L;
        if (r0 != null) {
            i = r0.A05;
        } else {
            i = 0;
        }
        this.A00 = this.A01 + i;
        for (int size = this.A06.size() - 1; size >= 0 && this.A06.size() > this.A00; size--) {
            A05(size);
        }
    }

    public final void A05(int i) {
        A0A((AnonymousClass1ZK) this.A06.get(i), true);
        this.A06.remove(i);
    }

    public final void A09(AnonymousClass1ZK r2) {
        ArrayList arrayList;
        if (r2.mInChangeScrap) {
            arrayList = this.A04;
        } else {
            arrayList = this.A05;
        }
        arrayList.remove(r2);
        r2.mScrapContainer = null;
        r2.mInChangeScrap = false;
        r2.clearReturnedFromScrapFlag();
    }

    private void A00(ViewGroup viewGroup, boolean z) {
        for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = viewGroup.getChildAt(childCount);
            if (childAt instanceof ViewGroup) {
                A00((ViewGroup) childAt, true);
            }
        }
        if (!z) {
            return;
        }
        if (viewGroup.getVisibility() == 4) {
            viewGroup.setVisibility(0);
            viewGroup.setVisibility(4);
            return;
        }
        int visibility = viewGroup.getVisibility();
        viewGroup.setVisibility(4);
        viewGroup.setVisibility(visibility);
    }

    public final void A06(View view) {
        AnonymousClass1ZK A012 = RecyclerView.A01(view);
        if (A012.isTmpDetached()) {
            this.A08.removeDetachedView(view, false);
        }
        if (A012.isScrap()) {
            A012.unScrap();
        } else if (A012.wasReturnedFromScrap()) {
            A012.clearReturnedFromScrapFlag();
        }
        A08(A012);
        if (this.A08.A0K != null && !A012.isRecyclable()) {
            this.A08.A0K.A0A(A012);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0021, code lost:
        if (r1.A0H(r2, r2.getUnmodifiedPayloads()) != false) goto L_0x0023;
     */
    public final void A07(View view) {
        ArrayList arrayList;
        boolean z;
        AnonymousClass1ZK A012 = RecyclerView.A01(view);
        if (!A012.hasAnyOfTheFlags(12) && A012.isUpdated()) {
            C31341Xr r1 = this.A08.A0K;
            if (r1 != null) {
                z = false;
            }
            z = true;
            if (!z) {
                if (this.A04 == null) {
                    this.A04 = new ArrayList();
                }
                A012.setScrapContainer(this, true);
                arrayList = this.A04;
                arrayList.add(A012);
            }
        }
        if (A012.isInvalid() && !A012.isRemoved()) {
            RecyclerView recyclerView = this.A08;
            if (!recyclerView.A0J.hasStableIds()) {
                throw new IllegalArgumentException(AnonymousClass000.A0E("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool.", recyclerView.A0R()));
            }
        }
        A012.setScrapContainer(this, false);
        arrayList = this.A05;
        arrayList.add(A012);
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x0061 A[LOOP:1: B:29:0x0061->B:38:0x0083, LOOP_START, PHI: r7 
      PHI: (r7v3 int) = (r7v1 int), (r7v4 int) binds: [B:28:0x005f, B:38:0x0083] A[DONT_GENERATE, DONT_INLINE]] */
    public final void A08(AnonymousClass1ZK r10) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4 = false;
        if (r10.isScrap() || r10.itemView.getParent() != null) {
            StringBuilder sb = new StringBuilder("Scrapped or attached views may not be recycled. isScrap:");
            sb.append(r10.isScrap());
            sb.append(" isAttached:");
            if (r10.itemView.getParent() != null) {
                z4 = true;
            }
            sb.append(z4);
            sb.append(this.A08.A0R());
            throw new IllegalArgumentException(sb.toString());
        } else if (r10.isTmpDetached()) {
            throw new IllegalArgumentException("Tmp detached view should be removed from RecyclerView before it can be recycled: " + r10 + this.A08.A0R());
        } else if (!r10.shouldIgnore()) {
            boolean doesTransientStatePreventRecycling = r10.doesTransientStatePreventRecycling();
            if (r10.isRecyclable()) {
                if (this.A00 <= 0 || r10.hasAnyOfTheFlags(526)) {
                    z = false;
                } else {
                    int size = this.A06.size();
                    if (size >= this.A00 && size > 0) {
                        A05(0);
                        size--;
                    }
                    if (RecyclerView.A1A && size > 0) {
                        AnonymousClass1Xt r0 = this.A08.A0I;
                        int i = r10.mPosition;
                        int[] iArr = r0.A03;
                        if (iArr != null) {
                            int i2 = r0.A00 << 1;
                            int i3 = 0;
                            while (true) {
                                if (i3 >= i2) {
                                    break;
                                } else if (iArr[i3] == i) {
                                    z2 = true;
                                    break;
                                } else {
                                    i3 += 2;
                                }
                            }
                            if (!z2) {
                                do {
                                    size--;
                                    if (size < 0) {
                                        break;
                                    }
                                    int i4 = ((AnonymousClass1ZK) this.A06.get(size)).mPosition;
                                    AnonymousClass1Xt r02 = this.A08.A0I;
                                    int[] iArr2 = r02.A03;
                                    if (iArr2 != null) {
                                        int i5 = r02.A00 << 1;
                                        int i6 = 0;
                                        while (true) {
                                            if (i6 >= i5) {
                                                break;
                                            } else if (iArr2[i6] == i4) {
                                                z3 = true;
                                                continue;
                                                break;
                                            } else {
                                                i6 += 2;
                                            }
                                        }
                                    }
                                    z3 = false;
                                    continue;
                                } while (z3);
                                size++;
                            }
                        }
                        z2 = false;
                        if (!z2) {
                        }
                    }
                    this.A06.add(size, r10);
                    z = true;
                }
                if (!z) {
                    A0A(r10, true);
                    z4 = true;
                }
            } else {
                z = false;
            }
            this.A08.A10.A02(r10);
            if (!z && !z4 && doesTransientStatePreventRecycling) {
                r10.mOwnerRecyclerView = null;
            }
        } else {
            throw new IllegalArgumentException(AnonymousClass000.A0E("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle.", this.A08.A0R()));
        }
    }

    public final void A0A(AnonymousClass1ZK r5, boolean z) {
        AnonymousClass1YC r0;
        RecyclerView.A0A(r5);
        View view = r5.itemView;
        AnonymousClass1YB r02 = this.A08.A0R;
        if (r02 != null) {
            AnonymousClass1YE r1 = r02.A01;
            if (r1 instanceof AnonymousClass1YE) {
                r0 = (AnonymousClass1YC) r1.A00.remove(view);
            } else {
                r0 = null;
            }
            AnonymousClass1E1.A0b(view, r0);
        }
        if (z) {
            C474023u r03 = this.A08.A0P;
            if (r03 != null) {
                r03.BVq(r5);
            }
            AnonymousClass1PH r04 = this.A08.A0J;
            if (r04 != null) {
                r04.onViewRecycled(r5);
            }
            RecyclerView recyclerView = this.A08;
            if (recyclerView.A0y != null) {
                recyclerView.A10.A02(r5);
            }
        }
        r5.mOwnerRecyclerView = null;
        if (this.A02 == null) {
            this.A02 = new C31521Yp();
        }
        this.A02.A03(r5);
    }
}
