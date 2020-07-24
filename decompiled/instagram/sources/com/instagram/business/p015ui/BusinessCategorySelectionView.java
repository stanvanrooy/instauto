package com.instagram.business.p015ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.facebook.C0003R;
import p000X.AnonymousClass65Z;
import p000X.AnonymousClass660;
import p000X.AnonymousClass663;
import p000X.AnonymousClass66K;
import p000X.C06220Of;
import p000X.C1416663x;
import p000X.C1418064m;

/* renamed from: com.instagram.business.ui.BusinessCategorySelectionView */
public class BusinessCategorySelectionView extends LinearLayout implements AnonymousClass663 {
    public View A00;
    public View A01;
    public TextView A02;
    public TextView A03;
    public AnonymousClass66K A04;
    public C1418064m A05 = C1418064m.CATEGORY;
    public AnonymousClass65Z A06;
    public AnonymousClass65Z A07;
    public String A08;
    public View A09;
    public ViewGroup A0A;
    public C1416663x A0B;
    public String A0C;

    public static void A01(BusinessCategorySelectionView businessCategorySelectionView) {
        AnonymousClass65Z r0;
        String str;
        C1418064m r2 = businessCategorySelectionView.A05;
        C1418064m r1 = C1418064m.CATEGORY;
        if (r2 == r1) {
            r0 = businessCategorySelectionView.A06;
        } else {
            r0 = businessCategorySelectionView.A07;
        }
        if (r2 == r1) {
            str = businessCategorySelectionView.A0C;
        } else {
            str = businessCategorySelectionView.A08;
        }
        C1416663x r22 = new C1416663x();
        businessCategorySelectionView.A0B = r22;
        if (r0 != null) {
            r22.A03 = r0.A00;
        }
        r22.A02 = str;
        r22.A01 = businessCategorySelectionView;
        r22.A06(((FragmentActivity) businessCategorySelectionView.getContext()).A05(), (String) null);
    }

    private void setCategoryView(String str, String str2, TextView textView) {
        if (str == null) {
            textView.setText(str2);
        } else {
            textView.setText(str);
        }
    }

    public final void B4B(AnonymousClass660 r4) {
        String str;
        boolean z = false;
        if (this.A05 == C1418064m.CATEGORY) {
            setSuperCategoryView(r4.A01);
            String str2 = this.A0C;
            if (str2 == null || ((str = r4.A00) != null && !str.equals(str2))) {
                setSubCategoryTextView((String) null);
                this.A08 = null;
                z = true;
            }
            this.A0C = r4.A00;
        } else {
            setSubCategoryTextView(r4.A01);
            this.A08 = r4.A00;
        }
        this.A04.Auw(r4.A00, z);
    }

    public String getSubCategory() {
        return this.A03.getText().toString();
    }

    public String getSuperCategory() {
        return this.A02.getText().toString();
    }

    public void setCategory(AnonymousClass65Z r3, C1418064m r4) {
        if (r4 == C1418064m.CATEGORY) {
            this.A02.setVisibility(0);
            this.A06 = r3;
            return;
        }
        this.A03.setVisibility(0);
        this.A09.setVisibility(0);
        this.A07 = r3;
    }

    private void A00(Context context) {
        View inflate = LayoutInflater.from(context).inflate(C0003R.layout.business_category_selection_view, this);
        this.A02 = (TextView) inflate.findViewById(C0003R.C0005id.page_category);
        setSuperCategoryView((String) null);
        this.A03 = (TextView) inflate.findViewById(C0003R.C0005id.page_subcategory);
        setSubCategoryTextView((String) null);
        this.A09 = inflate.findViewById(C0003R.C0005id.subcategory_divider);
        C06220Of.A09(getContext());
        getResources().getDimension(C0003R.dimen.location_suggestion_min_width);
        this.A00 = inflate.findViewById(C0003R.C0005id.horizontal_scroll_view);
        this.A0A = (ViewGroup) inflate.findViewById(C0003R.C0005id.suggested_categories_container);
        this.A01 = inflate.findViewById(C0003R.C0005id.suggest_divider);
    }

    private void setSubCategoryTextView(String str) {
        setCategoryView(str, getContext().getString(C0003R.string.choose_page_subcategory), this.A03);
    }

    private void setSuperCategoryView(String str) {
        setCategoryView(str, getContext().getString(C0003R.string.choose_page_category), this.A02);
    }

    public String getSelectedSubcategoryId() {
        return this.A08;
    }

    public void setDelegate(AnonymousClass66K r1) {
        this.A04 = r1;
    }

    public BusinessCategorySelectionView(Context context) {
        super(context);
        A00(context);
    }

    public BusinessCategorySelectionView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00(context);
    }
}
