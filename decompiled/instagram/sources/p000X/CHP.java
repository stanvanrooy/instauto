package p000X;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.C0003R;
import com.google.common.collect.ImmutableList;
import com.instagram.p009ui.widget.refresh.RefreshableNestedScrollingParent;
import java.lang.ref.WeakReference;

/* renamed from: X.CHP */
public final class CHP extends C27291Hg implements C27538CHc, C27539CHd, C96584Fr, C32891c1 {
    public String A00;
    public boolean A01 = true;
    public boolean A02 = true;
    public boolean A03;
    public final AnonymousClass1L8 A04;
    public final C6Y A05;
    public final CHV A06;
    public final CHR A07;
    public final AnonymousClass0C1 A08;
    public final WeakReference A09;
    public final C27271C6e A0A;
    public final C151836eN A0B;
    public final WeakReference A0C;

    public final void Aqq(AnonymousClass2NW r8) {
        this.A01 = true;
        CHV chv = this.A06;
        ImmutableList A092 = ImmutableList.A09(AnonymousClass17A.A01(chv.A00, new CHZ(chv)));
        C27271C6e c6e = this.A0A;
        C6X c6x = c6e.A00;
        Context context = c6x.getContext();
        c6x.A03.A09 = true;
        AnonymousClass5EO r2 = new AnonymousClass5EO(c6x.A0B, context);
        r2.A03(c6x.getString(C0003R.string.are_you_sure));
        r2.A04(c6e.A00.getString(C0003R.string.close_friends_v2_remove_all), new CHK(c6e, A092));
        r2.A05(c6e.A00.getString(C0003R.string.cancel), new C27537CHb(c6e));
        r2.A00().A01(context);
    }

    public final void At5() {
        this.A01 = false;
        C6X.A01(this.A0A.A00);
        A01(this);
    }

    public final void B9C(int i) {
    }

    public static void A00(CHP chp) {
        RefreshableNestedScrollingParent refreshableNestedScrollingParent = (RefreshableNestedScrollingParent) chp.A0C.get();
        if (refreshableNestedScrollingParent != null) {
            refreshableNestedScrollingParent.setRefreshing(false);
        }
        chp.A0A.A00.A0F = false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0011, code lost:
        if (r1.A01.isEmpty() == false) goto L_0x0013;
     */
    public static void A01(CHP chp) {
        boolean z;
        CHV chv = chp.A06;
        if (chv.A00.isEmpty()) {
            z = true;
        }
        z = false;
        if (z) {
            Context context = (Context) chp.A09.get();
            if (context != null) {
                chp.A0B.A0J(context, AnonymousClass2Oq.EMPTY, (View.OnClickListener) null);
                return;
            }
            return;
        }
        chp.A0B.A0K(ImmutableList.A09(chp.A06.A00), ImmutableList.A09(chp.A06.A01), chp.A00, true);
    }

    public static void A02(CHP chp) {
        Context context = (Context) chp.A09.get();
        if (context != null) {
            C53642Tq.A00(context, C0003R.string.close_friends_v2_network_error_toast, 0).show();
            chp.A0B.A0J(context, AnonymousClass2Oq.ERROR, new C27273C6g(chp));
        }
    }

    public final void A03(boolean z) {
        Context context = (Context) this.A09.get();
        if (context != null) {
            this.A03 = true;
            if (z) {
                this.A0B.A0J(context, AnonymousClass2Oq.LOADING, (View.OnClickListener) null);
            }
            AnonymousClass1L8 r2 = this.A04;
            C17850qu A012 = C25007Axz.A01(this.A08);
            A012.A00 = new CHU(this);
            C28351Lj.A00(context, r2, A012);
        }
    }

    public final boolean A7l() {
        return !this.A03;
    }

    public final void Aww() {
        C6X c6x = this.A0A.A00;
        if (c6x.A0D && c6x.isResumed()) {
            C6X.A02(c6x);
        }
    }

    public final void BE0() {
        this.A07.A05(this.A0B);
        this.A07.A05(this);
    }

    public final void BHw() {
        this.A0A.A00.A0F = true;
        A03(false);
    }

    public final void BJx() {
        this.A07.A03.add(new WeakReference(this.A0B));
        this.A07.A03.add(new WeakReference(this));
    }

    public final void BR3() {
        C6X.A01(this.A0A.A00);
    }

    public final void BR7() {
        C6X.A01(this.A0A.A00);
    }

    public CHP(Context context, View view, LinearLayoutManager linearLayoutManager, AnonymousClass0C1 r14, AnonymousClass1L8 r15, C27271C6e c6e, CHV chv, C6Y c6y) {
        this.A09 = new WeakReference(context);
        this.A08 = r14;
        this.A04 = r15;
        this.A0A = c6e;
        CHV chv2 = chv;
        this.A06 = chv2;
        CHR chr = new CHR(context, r14, r15, Constants.ONE, chv2, this);
        this.A07 = chr;
        this.A05 = c6y;
        C151836eN r4 = new C151836eN(context, this.A08, CI0.SEARCH, chr, this);
        this.A0B = r4;
        r4.setHasStableIds(true);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(C0003R.C0005id.recycler_view);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(this.A0B);
        recyclerView.A0w(new CAY(this, linearLayoutManager));
        recyclerView.setClipToPadding(false);
        C31341Xr r1 = recyclerView.A0K;
        if (r1 instanceof C31331Xq) {
            ((C31331Xq) r1).A0J();
        }
        RefreshableNestedScrollingParent refreshableNestedScrollingParent = (RefreshableNestedScrollingParent) view.findViewById(C0003R.C0005id.refreshable_container);
        refreshableNestedScrollingParent.setListener(this);
        refreshableNestedScrollingParent.setRenderer(new C31241Xc(refreshableNestedScrollingParent, false));
        this.A0C = new WeakReference(refreshableNestedScrollingParent);
    }
}
