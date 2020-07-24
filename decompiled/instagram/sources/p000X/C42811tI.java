package p000X;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AbsListView;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.facebook.common.dextricks.DexStore;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.1tI  reason: invalid class name and case insensitive filesystem */
public class C42811tI implements C255119b {
    public AnonymousClass1PI A00;
    public boolean A01 = false;
    public final AbsListView A02;
    public final List A03 = new ArrayList();
    public final AbsListView.OnScrollListener A04 = new C42821tJ(this);

    public final boolean AgC() {
        return true;
    }

    public final void A4V(C256219o r4) {
        if (this.A03.contains(r4)) {
            AnonymousClass0QD.A03("AbsListViewProxy", AnonymousClass000.A0E("Cannot add same listener twice: ", r4.getClass().getName()), DexStore.MS_IN_NS);
        } else {
            this.A03.add(r4);
        }
        if (!this.A01) {
            this.A02.setOnScrollListener(this.A04);
            this.A01 = true;
        }
    }

    public final void A8n() {
        this.A03.clear();
    }

    public final AnonymousClass1PI AFX() {
        if (this.A00 == null) {
            this.A00 = (AnonymousClass1PI) this.A02.getAdapter();
        }
        return this.A00;
    }

    public final View AI1(int i) {
        return this.A02.getChildAt(i);
    }

    public final View AI4(int i) {
        AbsListView absListView = this.A02;
        return absListView.getChildAt(i - absListView.getFirstVisiblePosition());
    }

    public final int AI5() {
        return this.A02.getChildCount();
    }

    public final int AKR() {
        return ((ListView) this.A02).getDividerHeight();
    }

    public final int ALs() {
        return this.A02.getFirstVisiblePosition();
    }

    public final void AMW(Rect rect) {
        this.A02.getGlobalVisibleRect(rect);
    }

    public final int AMn() {
        AbsListView absListView = this.A02;
        if (absListView instanceof ListView) {
            return ((ListView) absListView).getHeaderViewsCount();
        }
        return 0;
    }

    public final int AOh() {
        return this.A02.getLastVisiblePosition();
    }

    public final /* bridge */ /* synthetic */ ViewGroup AaK() {
        return this.A02;
    }

    public final boolean AeF() {
        return C256119n.A03(this.A02);
    }

    public final boolean AfZ() {
        return this.A02.isFocused();
    }

    public final void Bem(AnonymousClass1HD r2) {
        C43041tf.A00(r2, this.A02);
    }

    public final void Bfh(AnonymousClass1PI r3) {
        this.A00 = r3;
        this.A02.setAdapter((ListAdapter) r3.AFY());
    }

    public final void Bk2(C150536cF r2) {
        this.A02.setRecyclerListener(r2);
    }

    public final void BkR(int i) {
        this.A02.setSelection(i);
    }

    public final void BkS(int i, int i2) {
        AbsListView absListView = this.A02;
        if (absListView instanceof ListView) {
            ((ListView) absListView).setSelectionFromTop(i, i2);
        } else {
            absListView.setSelectionFromTop(i, i2);
        }
    }

    public final void BkT(C150856cl r3) {
        if (r3 != null) {
            BkS(r3.A00, r3.A01);
        }
    }

    public final void Blf(boolean z) {
        this.A02.setVerticalScrollBarEnabled(z);
    }

    public final void Bow(int i) {
        this.A02.smoothScrollToPosition(i);
    }

    public final void Box(int i, int i2) {
        this.A02.smoothScrollToPositionFromTop(i, i2);
    }

    public final void Boy(int i, int i2, int i3) {
        this.A02.smoothScrollToPositionFromTop(i, i2, i3);
    }

    public final void BqW() {
        this.A02.smoothScrollBy(0, 0);
    }

    public final Context getContext() {
        return this.A02.getContext();
    }

    public final int getCount() {
        return this.A02.getCount();
    }

    public final ViewParent getParent() {
        return this.A02.getParent();
    }

    public C42811tI(AbsListView absListView) {
        this.A02 = absListView;
    }

    public final C150856cl AVJ() {
        if (AI5() > 0) {
            return new C150856cl(ALs(), AI1(0).getTop());
        }
        return null;
    }
}
