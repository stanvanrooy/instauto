package com.instagram.p009ui.widget.search;

import android.animation.ArgbEvaluator;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.activity.ComponentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.C0003R;
import com.facebook.react.uimanager.BaseViewManager;
import com.instagram.p009ui.widget.searchedittext.SearchEditText;
import p000X.AFU;
import p000X.Constants;
import p000X.AnonymousClass0P2;
import p000X.AnonymousClass0QD;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass1BA;
import p000X.AnonymousClass1E8;
import p000X.AnonymousClass1EG;
import p000X.AnonymousClass1PH;
import p000X.AnonymousClass1PW;
import p000X.AnonymousClass66L;
import p000X.AnonymousClass67C;
import p000X.AnonymousClass67D;
import p000X.AnonymousClass67E;
import p000X.AnonymousClass67G;
import p000X.C019000b;
import p000X.C06220Of;
import p000X.C06360Ot;
import p000X.C256219o;
import p000X.C256319p;
import p000X.C27181Gu;
import p000X.C27291Hg;
import p000X.C27491Ib;
import p000X.C27511Id;
import p000X.C28991Oe;
import p000X.C84533lp;

/* renamed from: com.instagram.ui.widget.search.SearchController */
public class SearchController extends C27291Hg implements View.OnClickListener, AnonymousClass1E8, View.OnFocusChangeListener, C84533lp, C28991Oe, AFU, AnonymousClass66L {
    public float A00;
    public float A01;
    public AnonymousClass1PH A02;
    public AnonymousClass1PW A03;
    public Integer A04;
    public Integer A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public final int A09;
    public final int A0A;
    public final ArgbEvaluator A0B;
    public final Activity A0C;
    public final AnonymousClass67D A0D;
    public final int A0E;
    public final int A0F;
    public final AnonymousClass1EG A0G;
    public final C27511Id A0H;
    public AnonymousClass67C mViewHolder;

    public final void B8g(int i, boolean z) {
        AnonymousClass67C r0;
        int i2 = 0;
        boolean z2 = false;
        if (i > 0) {
            z2 = true;
        }
        this.A07 = z2;
        if (this.A08 && (r0 = this.mViewHolder) != null) {
            ViewGroup.LayoutParams layoutParams = r0.A0A.getLayoutParams();
            int height = ((ViewGroup) this.mViewHolder.A0A.getParent()).getHeight() - i;
            layoutParams.height = height;
            if (this.A07) {
                i2 = this.A0E;
            }
            layoutParams.height = height + i2;
            this.mViewHolder.A0A.post(new AnonymousClass67E(this, layoutParams));
        }
    }

    public final void B8i() {
        this.A07 = true;
    }

    public final void BO0() {
        this.A07 = false;
    }

    public final void BOF(AnonymousClass1EG r1) {
    }

    public final void BOH(AnonymousClass1EG r1) {
    }

    public final void BOI(AnonymousClass1EG r1) {
    }

    public final void onSearchSubmitted(SearchEditText searchEditText, String str) {
    }

    private void A00(Integer num) {
        Integer num2 = this.A05;
        if (num != num2) {
            this.A05 = num;
            switch (num2.intValue()) {
                case 0:
                    this.mViewHolder.A0B.A02();
                    C06220Of.A0G(this.mViewHolder.A0B);
                    break;
                case 2:
                    this.mViewHolder.A0B.setText("");
                    this.mViewHolder.A0B.clearFocus();
                    C06220Of.A0E(this.mViewHolder.A0B);
                    break;
            }
            this.A0D.BOo(this, this.A05, num2);
        }
    }

    public final void A01(boolean z, float f) {
        A03(z, Constants.ZERO, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, f);
    }

    public final void A02(boolean z, float f) {
        A03(z, Constants.ONE, f, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
    }

    public final void A03(boolean z, Integer num, float f, float f2) {
        AnonymousClass1EG r2 = this.A0G;
        if (r2.A09()) {
            this.A04 = num;
            r2.A05(0.0d, true);
            this.A00 = f;
            this.A01 = f2;
            if (z) {
                this.A0G.A03(1.0d);
            } else {
                this.A0G.A05(1.0d, true);
            }
        }
    }

    public final boolean A04() {
        if (this.A05 == Constants.A0C) {
            return true;
        }
        return false;
    }

    public final void Azh() {
        AnonymousClass1PW r0;
        C256319p r02;
        AnonymousClass67C r2 = this.mViewHolder;
        if (r2 != null) {
            ListView listView = r2.A00;
            if (listView != null) {
                listView.setOnScrollListener((AbsListView.OnScrollListener) null);
            }
            RecyclerView recyclerView = r2.A01;
            if (!(recyclerView == null || (r02 = r2.A08) == null)) {
                recyclerView.A0x(r02);
            }
        } else {
            AnonymousClass0QD.A01("SearchController", "Expected onDestroyView to be called only once");
        }
        AnonymousClass1PH r1 = this.A02;
        if (!(r1 == null || (r0 = this.A03) == null)) {
            r1.unregisterAdapterDataObserver(r0);
            this.A02 = null;
            this.A03 = null;
        }
        this.mViewHolder = null;
    }

    public final void BE0() {
        this.A0G.A08(this);
        this.A0H.BbF(this);
        this.A0H.BP6();
    }

    public final void BJx() {
        this.A0G.A07(this);
        this.A0H.BOP(this.A0C);
        this.A0H.A3j(this);
    }

    public final boolean onBackPressed() {
        this.A0D.B3D();
        A01(true, this.A0D.AFw(this, Constants.ZERO));
        return true;
    }

    public final void onFocusChange(View view, boolean z) {
        this.A0D.BLV(this, z);
    }

    public final void onSearchTextChanged(SearchEditText searchEditText, CharSequence charSequence, int i, int i2, int i3) {
        AnonymousClass67C r1;
        this.A0D.onSearchTextChanged(C06360Ot.A01(searchEditText.getSearchString()));
        if (this.A06 && (r1 = this.mViewHolder) != null) {
            ListView listView = r1.A00;
            if (listView != null) {
                listView.setSelectionAfterHeaderView();
                return;
            }
            RecyclerView recyclerView = r1.A01;
            if (recyclerView != null) {
                recyclerView.A0h(0);
            }
        }
    }

    public final boolean Ag6() {
        return this.A07;
    }

    public final void BOK(AnonymousClass1EG r16) {
        double d;
        double d2;
        Integer num;
        float A002 = (float) r16.A00();
        double d3 = (double) A002;
        float A012 = (float) C27181Gu.A01(d3, 0.0d, 1.0d, (double) this.A00, (double) this.A01);
        Integer num2 = this.A04;
        Integer num3 = Constants.ONE;
        if (num2 == num3) {
            d = 0.0d;
        } else {
            d = 1.0d;
        }
        if (num2 == num3) {
            d2 = 1.0d;
        } else {
            d2 = 0.0d;
        }
        float A013 = (float) C27181Gu.A01(d3, 0.0d, 1.0d, d, d2);
        int intValue = ((Integer) this.A0B.evaluate(A002, Integer.valueOf(this.A09), Integer.valueOf(this.A0A))).intValue();
        ImeBackButtonHandlerFrameLayout imeBackButtonHandlerFrameLayout = this.mViewHolder.A0A;
        int i = 0;
        int i2 = 4;
        if (A013 > BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
            i2 = 0;
        }
        imeBackButtonHandlerFrameLayout.setVisibility(i2);
        View view = this.mViewHolder.A05;
        if (A013 <= BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
            i = 4;
        }
        view.setVisibility(i);
        this.mViewHolder.A06.setAlpha(A013);
        this.mViewHolder.A09.setAlpha(A013);
        this.mViewHolder.A07.setAlpha(1.0f - A013);
        this.mViewHolder.A03.setBackgroundColor(intValue);
        this.mViewHolder.A03.setAlpha(A013);
        this.mViewHolder.A05.setAlpha(A013);
        this.mViewHolder.A0A.setTranslationY(A012);
        this.A0D.Arn(this, A002, A012, this.A04);
        if (A002 == 1.0f) {
            if (this.A04 == Constants.ONE) {
                num = Constants.A0C;
            } else {
                num = Constants.ZERO;
            }
            A00(num);
            return;
        }
        A00(Constants.ONE);
    }

    public final void BVf(View view, Bundle bundle) {
        AnonymousClass1PW r0;
        super.BVf(view, bundle);
        AnonymousClass1PH r1 = this.A02;
        if (r1 != null && (r0 = this.A03) != null) {
            r1.registerAdapterDataObserver(r0);
        }
    }

    public final void onClick(View view) {
        int A052 = AnonymousClass0Z0.A05(-2082710107);
        if (view == this.mViewHolder.A09) {
            onBackPressed();
        }
        AnonymousClass0Z0.A0C(-1365146296, A052);
    }

    public SearchController(Activity activity, ViewGroup viewGroup, int i, int i2, AnonymousClass67D r8, boolean z, AnonymousClass67G r10, boolean z2, C256219o r12) {
        this.A05 = Constants.ZERO;
        this.A08 = true;
        this.A0C = activity;
        AnonymousClass1EG A002 = AnonymousClass0P2.A00().A00();
        A002.A06 = true;
        this.A0G = A002;
        this.A0D = r8;
        this.A0B = new ArgbEvaluator();
        Context context = viewGroup.getContext();
        viewGroup.getContext();
        this.A09 = C019000b.A00(context, AnonymousClass1BA.A03(context, C0003R.attr.backgroundColorPrimary));
        this.A0A = AnonymousClass1BA.A01(activity, C0003R.attr.backgroundColorSecondary);
        this.A0H = C27491Ib.A00((ComponentActivity) activity);
        viewGroup.getContext();
        this.A0E = i2;
        this.A0F = i;
        AnonymousClass67C r1 = new AnonymousClass67C((ImeBackButtonHandlerFrameLayout) LayoutInflater.from(context).inflate(C0003R.layout.search_overlay, viewGroup, false), r10, z2, r12);
        this.mViewHolder = r1;
        r1.A0A.setBackListener(this);
        r1.A09.setOnClickListener(this);
        SearchEditText searchEditText = this.mViewHolder.A0B;
        searchEditText.setOnFilterTextListener(this);
        searchEditText.setOnFocusChangeListener(this);
        AnonymousClass67C r13 = this.mViewHolder;
        r13.A0B.setOnKeyboardListener(this);
        viewGroup.addView(r13.A0A);
        int i3 = this.A0F;
        if (i3 != -1) {
            C06220Of.A0S(this.mViewHolder.A0A, i3);
        }
        if (z) {
            C06220Of.A0P(this.mViewHolder.A03, this.mViewHolder.A03.getPaddingEnd() + activity.getResources().getDimensionPixelOffset(C0003R.dimen.one_tap_fast_scroll_separator_width));
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    public SearchController(Activity activity, ViewGroup viewGroup, int i, int i2, ListAdapter listAdapter, AnonymousClass67D r16, boolean z, AnonymousClass67G r18, C256219o r19) {
        this(r1, r2, r3, r4, r16, z, r18, false, r19);
        Activity activity2 = activity;
        ViewGroup viewGroup2 = viewGroup;
        int i3 = i;
        int i4 = i2;
        ListView listView = this.mViewHolder.A00;
        if (listView != null) {
            listView.setAdapter(listAdapter);
        }
    }
}
