package com.instagram.shopping.fragment.sizechart;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import com.facebook.C0003R;
import com.instagram.model.shopping.sizechart.SizeChart;
import com.instagram.p009ui.widget.pageindicator.CirclePageIndicator;
import java.util.Collections;
import java.util.List;
import p000X.AnonymousClass0C1;
import p000X.AnonymousClass0J1;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass0a4;
import p000X.AnonymousClass1BA;
import p000X.AnonymousClass7GL;
import p000X.AnonymousClass7KT;
import p000X.C06220Of;
import p000X.C06590Pq;
import p000X.C196168aN;
import p000X.C196218aT;
import p000X.C196228aU;
import p000X.C196248aW;
import p000X.C196348aj;
import p000X.C27341Hl;
import p000X.C51312Ke;

public class SizeChartFragment extends C27341Hl implements C51312Ke {
    public AnonymousClass7KT A00;
    public AnonymousClass0C1 A01;
    public RecyclerView mRowHeadersColumn;
    public View mTopLeftFixedSpace;
    public ViewPager mViewPager;

    public final void AtV() {
    }

    public final void AtY(int i, int i2) {
    }

    public final String getModuleName() {
        return "instagram_shopping_sizing_chart";
    }

    public final boolean AhU() {
        for (RecyclerView canScrollVertically : this.A00.A01) {
            if (canScrollVertically.canScrollVertically(-1)) {
                return false;
            }
        }
        return true;
    }

    public final C06590Pq getSession() {
        return this.A01;
    }

    public final void onCreate(Bundle bundle) {
        int A02 = AnonymousClass0Z0.A02(-1782694416);
        super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        AnonymousClass0a4.A06(bundle2);
        this.A01 = AnonymousClass0J1.A06(bundle2);
        this.A00 = new AnonymousClass7KT();
        AnonymousClass0Z0.A09(-482210495, A02);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = AnonymousClass0Z0.A02(-329432954);
        View inflate = layoutInflater.inflate(C0003R.layout.size_chart, viewGroup, false);
        AnonymousClass0Z0.A09(-1037321656, A02);
        return inflate;
    }

    public final void onDestroyView() {
        int A02 = AnonymousClass0Z0.A02(-1750033376);
        super.onDestroyView();
        AnonymousClass7KT r2 = this.A00;
        RecyclerView recyclerView = this.mRowHeadersColumn;
        r2.A01.remove(recyclerView);
        recyclerView.A0x(r2.A00);
        SizeChartFragmentLifecycleUtil.cleanupReferences(this);
        AnonymousClass0Z0.A09(212260780, A02);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        ((ConstraintLayout) view).setMaxHeight((int) (((float) C06220Of.A08(getContext())) * 0.5f));
        this.mTopLeftFixedSpace = view.findViewById(C0003R.C0005id.top_left_fixed_space);
        this.mRowHeadersColumn = (RecyclerView) view.findViewById(C0003R.C0005id.row_headers_column);
        this.mViewPager = (ViewPager) view.findViewById(C0003R.C0005id.size_chart_pager);
        Bundle bundle2 = this.mArguments;
        AnonymousClass0a4.A06(bundle2);
        C196218aT r5 = new C196218aT(getContext(), (SizeChart) bundle2.getParcelable("size_chart_model"));
        List unmodifiableList = Collections.unmodifiableList(r5.A03);
        this.mViewPager.setOffscreenPageLimit(unmodifiableList.size() - 1);
        this.mViewPager.setAdapter(new C196228aU(unmodifiableList, this.A00));
        int size = unmodifiableList.size();
        ((TextView) view.findViewById(C0003R.C0005id.bottom_sheet_title)).setText(C0003R.string.size_chart_title);
        ImageView imageView = (ImageView) view.findViewById(C0003R.C0005id.bottom_sheet_back_button);
        imageView.setImageResource(C0003R.C0004drawable.instagram_arrow_back_24);
        imageView.setContentDescription(getString(C0003R.string.back));
        imageView.setBackgroundResource(AnonymousClass1BA.A03(getContext(), 16843534));
        imageView.setOnClickListener(new C196168aN(this));
        CirclePageIndicator circlePageIndicator = (CirclePageIndicator) view.findViewById(C0003R.C0005id.bottom_sheet_page_indicator);
        int i = 8;
        if (size > 1) {
            i = 0;
        }
        circlePageIndicator.setVisibility(i);
        if (size > 1) {
            circlePageIndicator.A00(0, size);
            this.mViewPager.A0K(circlePageIndicator);
        }
        this.mRowHeadersColumn.setLayoutManager(new LinearLayoutManager(1, false));
        RecyclerView recyclerView = this.mRowHeadersColumn;
        C196348aj r3 = r5.A01;
        recyclerView.A0r(new AnonymousClass7GL(recyclerView.getContext(), 1));
        recyclerView.setAdapter(new C196248aW(r3));
        AnonymousClass7KT r2 = this.A00;
        RecyclerView recyclerView2 = this.mRowHeadersColumn;
        r2.A01.add(recyclerView2);
        recyclerView2.A0w(r2.A00);
        C06220Of.A0K(this.mTopLeftFixedSpace, r5.A02.A00);
    }
}
