package com.instagram.business.insights.fragment;

import android.os.Bundle;
import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import com.facebook.C0003R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import p000X.Constants;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass2UZ;
import p000X.C146776Pc;
import p000X.C225709nb;
import p000X.C26808Bst;
import p000X.C27299C7p;
import p000X.C27320C8p;
import p000X.C27324C8t;
import p000X.C52362Om;
import p000X.C8F;
import p000X.C8K;
import p000X.C8L;
import p000X.C8R;
import p000X.C8U;

public class InsightsPostGridFragment extends BaseGridInsightsFragment implements C27320C8p, C225709nb {
    public static final C26808Bst[] A04;
    public static final C26808Bst[] A05;
    public static final Integer[] A06 = {Constants.ONE, Constants.A0N, Constants.A0Y, Constants.A0j, Constants.A12, Constants.A14};
    public C27324C8t A00;
    public C26808Bst[] A01;
    public C26808Bst[] A02;
    public final Comparator A03 = new C27299C7p(this);
    public TextView mMetricFilterText;
    public TextView mTimeFrameFilterText;
    public TextView mTypeFilterText;

    public final String getModuleName() {
        return "insights_post_grid";
    }

    static {
        C26808Bst bst = C26808Bst.CALL;
        C26808Bst bst2 = C26808Bst.COMMENT_COUNT;
        C26808Bst bst3 = C26808Bst.EMAIL;
        C26808Bst bst4 = C26808Bst.ENGAGEMENT_COUNT;
        C26808Bst bst5 = C26808Bst.GET_DIRECTIONS;
        C26808Bst bst6 = C26808Bst.IMPRESSION_COUNT;
        C26808Bst bst7 = C26808Bst.LIKE_COUNT;
        C26808Bst bst8 = C26808Bst.SHOPPING_OUTBOUND_CLICK_COUNT;
        C26808Bst bst9 = C26808Bst.SHOPPING_PRODUCT_CLICK_COUNT;
        C26808Bst bst10 = C26808Bst.REACH_COUNT;
        C26808Bst bst11 = C26808Bst.SAVE_COUNT;
        C26808Bst bst12 = C26808Bst.SHARE_COUNT;
        C26808Bst bst13 = C26808Bst.TEXT;
        C26808Bst bst14 = C26808Bst.VIDEO_VIEW_COUNT;
        C26808Bst bst15 = C26808Bst.BIO_LINK_CLICK;
        A05 = new C26808Bst[]{bst, bst2, bst3, bst4, C26808Bst.FOLLOW, bst5, bst6, bst7, bst8, bst9, C26808Bst.PROFILE_VIEW, bst10, bst11, bst12, bst13, bst14, bst15};
        A04 = new C26808Bst[]{bst, bst2, bst3, bst4, bst5, bst6, bst7, bst8, bst9, bst10, bst11, bst12, bst13, bst14, bst15};
    }

    public static C26808Bst[] A00(InsightsPostGridFragment insightsPostGridFragment, C26808Bst[] bstArr, Integer num) {
        ArrayList arrayList = new ArrayList(bstArr.length);
        arrayList.addAll(Arrays.asList(bstArr));
        if (num != Constants.A0Y) {
            arrayList.remove(C26808Bst.VIDEO_VIEW_COUNT);
        }
        if (num != Constants.A0N) {
            arrayList.remove(C26808Bst.SHOPPING_OUTBOUND_CLICK_COUNT);
            arrayList.remove(C26808Bst.SHOPPING_PRODUCT_CLICK_COUNT);
        }
        Collections.sort(arrayList, insightsPostGridFragment.A03);
        return (C26808Bst[]) arrayList.toArray(new C26808Bst[0]);
    }

    public final void B71(View view, String str) {
        C52362Om r2 = new C52362Om(getActivity(), getSession());
        C146776Pc A0T = AnonymousClass2UZ.A00().A0T(str);
        A0T.A0A = true;
        r2.A02 = A0T.A01();
        r2.A02();
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0Z0.A02(-180305008);
        super.onCreate(bundle);
        Integer num = C8L.A05;
        this.A02 = A00(this, A05, num);
        this.A01 = A00(this, A04, num);
        AnonymousClass0Z0.A09(91897316, A022);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        ((ViewStub) view.findViewById(C0003R.C0005id.filterLeftViewStub)).inflate();
        ((ViewStub) view.findViewById(C0003R.C0005id.filterCenterViewStub)).inflate();
        ((ViewStub) view.findViewById(C0003R.C0005id.filterRightViewStub)).inflate();
        View findViewById = view.findViewById(C0003R.C0005id.filterLeft);
        this.mTypeFilterText = (TextView) findViewById.findViewById(C0003R.C0005id.title);
        findViewById.setOnClickListener(new C8K(this));
        TextView textView = (TextView) view.findViewById(C0003R.C0005id.filterCenter).findViewById(C0003R.C0005id.title);
        this.mTimeFrameFilterText = textView;
        textView.setOnClickListener(new C8U(this));
        View findViewById2 = view.findViewById(C0003R.C0005id.filterRight);
        this.mMetricFilterText = (TextView) findViewById2.findViewById(C0003R.C0005id.title);
        findViewById2.setOnClickListener(new C8F(this));
        C8R c8r = this.A01;
        if (c8r != null) {
            ((C8L) c8r).A06(this);
        }
    }
}
