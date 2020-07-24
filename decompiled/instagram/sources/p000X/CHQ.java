package p000X;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import com.facebook.C0003R;
import com.facebook.react.uimanager.BaseViewManager;
import com.google.common.collect.ImmutableList;
import com.instagram.p009ui.widget.search.SearchController;
import com.instagram.video.live.p038ui.streaming.IgLiveWithInviteFragment;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.CHQ */
public final class CHQ extends C27291Hg implements C67692xg, AnonymousClass67D, C27538CHc {
    public final CHV A00;
    public final SearchController A01;
    public final WeakReference A02;
    public final C27270C6d A03;
    public final C151836eN A04;
    public final CHR A05;
    public final C67712xi A06;
    public final WeakReference A07;
    public final WeakReference A08;

    public final boolean A7l() {
        return true;
    }

    public final void BLV(SearchController searchController, boolean z) {
    }

    public final void BOo(SearchController searchController, Integer num, Integer num2) {
    }

    public final void BR3() {
    }

    public final void BR7() {
    }

    public CHQ(Context context, View view, ViewGroup viewGroup, AnonymousClass0C1 r22, AnonymousClass1L8 r23, CHV chv, C27270C6d c6d) {
        Context context2 = context;
        this.A07 = new WeakReference(context2);
        this.A00 = chv;
        this.A03 = c6d;
        View view2 = view;
        this.A08 = new WeakReference(view2.findViewById(C0003R.C0005id.main_container));
        AnonymousClass0C1 r10 = r22;
        AnonymousClass1L8 r3 = r23;
        Context context3 = context2;
        AnonymousClass0C1 r13 = r10;
        CHR chr = new CHR(context3, r13, r3, Constants.ZERO, this.A00, this);
        this.A05 = chr;
        this.A04 = new C151836eN(context3, r13, CI0.SEARCH, new CHW(this, chr), (C96584Fr) null);
        C67712xi A002 = C67782xp.A00(r10, new C28351Lj(context2, r3), AnonymousClass0C5.$const$string(74), new C225399n5(this, r10), (List) null, (IgLiveWithInviteFragment) null, true, new C27536CHa(this, r10));
        this.A06 = A002;
        A002.BiZ(this);
        this.A01 = new SearchController((Activity) context2, viewGroup, -1, 0, (ListAdapter) this.A04, (AnonymousClass67D) this, false, (AnonymousClass67G) null, (C256219o) null);
        View findViewById = view2.findViewById(C0003R.C0005id.search_box);
        this.A02 = new WeakReference(view2.findViewById(C0003R.C0005id.header));
        findViewById.setOnClickListener(new C27272C6f(this));
    }

    public final void A00() {
        C6X.A01(this.A03.A00);
        View view = (View) this.A02.get();
        if (view != null) {
            this.A01.A02(true, (float) view.getHeight());
            if (!ImmutableList.A09(this.A00.A01).isEmpty()) {
                this.A04.A0K(Collections.EMPTY_LIST, ImmutableList.A09(this.A00.A01), (String) null, true);
            } else {
                this.A06.Bjv("");
            }
        }
    }

    public final float AFw(SearchController searchController, Integer num) {
        View view = (View) this.A02.get();
        if (view != null) {
            return (float) view.getHeight();
        }
        return BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
    }

    public final void Arn(SearchController searchController, float f, float f2, Integer num) {
        View view = (View) this.A02.get();
        Context context = (Context) this.A07.get();
        View view2 = (View) this.A08.get();
        if (view != null && context != null && view2 != null) {
            float height = f2 - ((float) view.getHeight());
            AnonymousClass1EW.A03((Activity) context).A07.setTranslationY(height);
            view2.setTranslationY(height);
        }
    }

    public final void Azh() {
        this.A01.Azh();
    }

    public final void B3D() {
        C27270C6d c6d = this.A03;
        c6d.A00.A04.A03(false);
        C6X c6x = c6d.A00;
        if (c6x.A0D && c6x.isResumed()) {
            C6X.A02(c6x);
        }
    }

    public final void BE0() {
        this.A05.A05(this.A04);
        this.A01.BE0();
    }

    public final void BJx() {
        this.A05.A03.add(new WeakReference(this.A04));
        this.A01.BJx();
    }

    public final void BVf(View view, Bundle bundle) {
        this.A01.BVf(view, bundle);
    }

    public final void onSearchTextChanged(String str) {
        this.A06.Bjv(str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0054, code lost:
        if (r6.isEmpty() == false) goto L_0x0056;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0066, code lost:
        if (r6.isEmpty() != false) goto L_0x0068;
     */
    public final void BGZ(C67712xi r12) {
        boolean z;
        boolean z2;
        boolean isEmpty = r12.ATP().isEmpty();
        ArrayList arrayList = new ArrayList();
        for (C13300iJ r3 : (List) r12.AUa()) {
            boolean contains = this.A00.A00.contains(new C155936lE(r3, true));
            if (!isEmpty || !contains) {
                arrayList.add(new C155936lE(r3, contains));
            }
        }
        if (!r12.ATP().isEmpty() && !r12.AgL()) {
            z = true;
        }
        z = false;
        if (r12.ATP().isEmpty()) {
            z2 = true;
        }
        z2 = false;
        this.A04.A0L(arrayList, z, r12.AgL(), z2, r12.ATX());
    }
}
