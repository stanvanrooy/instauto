package com.instagram.igtv.search;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ListAdapter;
import androidx.fragment.app.FragmentActivity;
import com.facebook.react.uimanager.BaseViewManager;
import com.instagram.p009ui.widget.search.SearchController;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import p000X.Constants;
import p000X.AnonymousClass0C1;
import p000X.AnonymousClass0RN;
import p000X.AnonymousClass2MB;
import p000X.AnonymousClass3AD;
import p000X.AnonymousClass3DA;
import p000X.AnonymousClass53Q;
import p000X.AnonymousClass67D;
import p000X.AnonymousClass67G;
import p000X.C06220Of;
import p000X.C15890nh;
import p000X.C162926xI;
import p000X.C163926yy;
import p000X.C173747bZ;
import p000X.C173977by;
import p000X.C173987bz;
import p000X.C17850qu;
import p000X.C179787lz;
import p000X.C179797m0;
import p000X.C179807m1;
import p000X.C191578Ha;
import p000X.C191588Hb;
import p000X.C191598Hc;
import p000X.C217829aN;
import p000X.C256219o;
import p000X.C256419q;
import p000X.C27291Hg;
import p000X.C27341Hl;
import p000X.C28511Ma;
import p000X.C28691Ms;
import p000X.C32631ba;
import p000X.C43791v5;
import p000X.C60522k2;
import p000X.C68342yv;
import p000X.C68362yx;
import p000X.C68372yy;
import p000X.C68382yz;
import p000X.C68622zT;

public class IGTVSearchController extends C27291Hg implements AnonymousClass0RN, AnonymousClass2MB, C60522k2, AnonymousClass67D {
    public static final C28511Ma A0C = new C28511Ma(Constants.A06);
    public AnonymousClass3AD A00;
    public SearchController A01;
    public Integer A02 = Constants.ZERO;
    public String A03 = "";
    public C68382yz A04;
    public final C179787lz A05;
    public final C179807m1 A06;
    public final C191578Ha A07;
    public final ViewGroup A08;
    public final C27341Hl A09;
    public final C256419q A0A;
    public final AnonymousClass0C1 A0B;
    public ImageView mCustomLoadingSpinnerView;

    public final float AFw(SearchController searchController, Integer num) {
        return BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
    }

    public final void Arn(SearchController searchController, float f, float f2, Integer num) {
    }

    public final void BJD(String str) {
    }

    public final void BLV(SearchController searchController, boolean z) {
    }

    public final void BdZ(float f, float f2) {
    }

    public final void destroy() {
    }

    public final void onSearchTextChanged(String str) {
        String str2 = str;
        this.A03 = str;
        C191578Ha.A00(this.A07, str2, "SEARCH_QUERY_CHANGE", this.A0B.A04(), C217829aN.A00(Constants.A0j), false, 0);
        C68362yx ATO = this.A04.A04.ATO(this.A03);
        String str3 = ATO.A03;
        List list = ATO.A04;
        if (list != null) {
            A00(Constants.ONE);
            A01(list, TextUtils.isEmpty(this.A03), this.A03, str3);
            int size = list.size();
            this.A07.A07(this.A03, size);
            this.A07.A08(this.A03, str3, size);
            this.A07.A0A(str2, str3, true, size, this.A05.getCount());
        } else if (TextUtils.isEmpty(this.A03)) {
            this.A07.A09(str, str3, 0);
        } else {
            this.A04.A04(this.A03);
            A00(Constants.ZERO);
            A01(Collections.emptyList(), false, this.A03, (String) null);
        }
    }

    private void A00(Integer num) {
        this.A02 = num;
        boolean equals = Constants.ZERO.equals(num);
        ImageView imageView = this.mCustomLoadingSpinnerView;
        int i = 8;
        if (equals) {
            i = 0;
        }
        imageView.setVisibility(i);
        this.A00.A03(equals);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002e, code lost:
        if (r2.size() != 0) goto L_0x0030;
     */
    private void A01(List list, boolean z, String str, String str2) {
        boolean z2;
        AnonymousClass53Q r1;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C32631ba r0 = ((C173747bZ) it.next()).A00;
            if (r0 != null) {
                arrayList.add(r0);
            }
        }
        C179787lz r3 = this.A05;
        if (!Constants.ZERO.equals(this.A02)) {
            z2 = true;
        }
        z2 = false;
        r3.A0B.clear();
        r3.A0B.addAll(arrayList);
        r3.A03 = z;
        r3.A01 = str;
        r3.A02 = str2;
        r3.clear();
        if (z2) {
            r3.addModel(r3.A0A, r3.A09);
        } else {
            if (r3.A03) {
                r1 = r3.A07;
            } else {
                r1 = r3.A06;
            }
            r3.addModel(r1, r3.A08);
            for (C32631ba addModel : r3.A0B) {
                r3.addModel(addModel, r3.A05);
            }
            r3.addModel((Object) null, r3.A04);
        }
        r3.updateListView();
    }

    public final void A02(AnonymousClass0RN r5) {
        this.A01.A02(true, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
        this.A05.A00 = C68622zT.A00(r5, UUID.randomUUID().toString(), this.A0B, true);
    }

    public final boolean A03() {
        SearchController searchController = this.A01;
        if (!searchController.A04()) {
            Integer num = searchController.A05;
            boolean z = false;
            if (num == Constants.ONE) {
                z = true;
            }
            if (z) {
                return true;
            }
            return false;
        }
        return true;
    }

    public final void Azh() {
        this.A09.unregisterLifecycleListener(this.A0A);
        this.mCustomLoadingSpinnerView = null;
        this.A01.Azh();
        this.A04.Azh();
        this.A04.Azd();
        this.A07.A03();
        this.mCustomLoadingSpinnerView = null;
    }

    public final void B3D() {
        C179787lz r1 = this.A05;
        r1.A0B.clear();
        r1.A03 = true;
    }

    public final void BE0() {
        this.A01.BE0();
        this.A07.A03();
        this.A0A.BE0();
    }

    public final void BIx(String str) {
        this.A07.A04(str);
    }

    public final void BJ2(String str, C43791v5 r9) {
        this.A02 = Constants.A0C;
        A01(new ArrayList(), false, this.A03, (String) null);
        this.A07.A05(str);
        this.A07.A0A(str, (String) null, false, 0, this.A05.getCount());
    }

    public final void BJL(String str) {
        C191588Hb r0 = (C191588Hb) this.A07.A00.get(str);
        if (r0 != null) {
            r0.A02.add(new C191598Hc("SEARCH_QUERY_REQUEST_START", (String) null, System.currentTimeMillis()));
        }
    }

    public final /* bridge */ /* synthetic */ void BJV(String str, C28691Ms r10) {
        C173987bz r102 = (C173987bz) r10;
        String ATX = r102.ATX();
        int size = r102.AOJ().size();
        String str2 = str;
        if (this.A03.equals(str)) {
            A00(Constants.ONE);
            A01(r102.AOJ(), TextUtils.isEmpty(str), str, r102.ATX());
            this.A07.A06(str);
            this.A07.A0A(str2, ATX, false, size, this.A05.getCount());
            return;
        }
        this.A07.A09(str, ATX, size);
    }

    public final void BJx() {
        this.A01.BJx();
    }

    public final void BOo(SearchController searchController, Integer num, Integer num2) {
        Integer num3 = Constants.A0C;
        if (num2 == num3) {
            this.A06.B0D();
        } else if (num == num3) {
            this.A06.BLZ();
        }
    }

    public final String getModuleName() {
        return A0C.A01();
    }

    public IGTVSearchController(C27341Hl r15, ViewGroup viewGroup, AnonymousClass0C1 r17, C179807m1 r18, AnonymousClass67G r19, int i, int i2) {
        this.A09 = r15;
        FragmentActivity activity = r15.getActivity();
        Context context = r15.getContext();
        AnonymousClass0C1 r1 = r17;
        this.A05 = new C179787lz(context, r1, this);
        this.A0B = r1;
        this.A06 = r18;
        this.A08 = viewGroup;
        this.A07 = new C191578Ha(32309251);
        C256419q A012 = AnonymousClass3DA.A01(23592993, activity, this.A0B, this, Constants.ZERO);
        this.A0A = A012;
        this.A09.registerLifecycleListener(A012);
        int i3 = i2;
        int i4 = i;
        this.A01 = new SearchController((Activity) activity, this.A08, i4, i3, (ListAdapter) this.A05, (AnonymousClass67D) this, false, r19, (C256219o) this.A0A);
        AnonymousClass3AD A013 = C163926yy.A01(context, false);
        this.A00 = A013;
        A013.A01(1.0f);
        this.A00.A03(true);
        this.mCustomLoadingSpinnerView = new ImageView(context);
        int A032 = (int) C06220Of.A03(context, 128);
        this.mCustomLoadingSpinnerView.setLayoutParams(new FrameLayout.LayoutParams(A032, A032, 17));
        this.mCustomLoadingSpinnerView.setImageDrawable(this.A00);
        this.A01.mViewHolder.A0A.addView(this.mCustomLoadingSpinnerView);
        C68372yy r12 = new C68372yy(this.A0B);
        r12.A00 = this.A09;
        r12.A02 = new C68342yv();
        r12.A01 = this;
        C68382yz A002 = r12.A00();
        this.A04 = A002;
        A002.A04("");
        C162926xI.A00(activity).A03(new C179797m0(this));
    }

    public final C17850qu AAz(String str, String str2) {
        C15890nh r2;
        String str3;
        if (TextUtils.isEmpty(str)) {
            r2 = new C15890nh(this.A0B);
            r2.A09 = Constants.A0N;
            str3 = "igtv/suggested_searches/";
        } else {
            r2 = new C15890nh(this.A0B);
            r2.A09 = Constants.A0N;
            str3 = "igtv/search/";
        }
        r2.A0C = str3;
        r2.A09("query", str);
        r2.A06(C173977by.class, false);
        return r2.A03();
    }

    public final boolean B7a(MotionEvent motionEvent) {
        if (!A03()) {
            return false;
        }
        this.A08.requestDisallowInterceptTouchEvent(true);
        if (!(!this.A05.A0B.isEmpty())) {
            return false;
        }
        C06220Of.A0E(this.A01.mViewHolder.A0B);
        return false;
    }

    public final boolean BS5(MotionEvent motionEvent) {
        return A03();
    }
}
