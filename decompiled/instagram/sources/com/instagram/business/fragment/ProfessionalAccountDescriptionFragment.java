package com.instagram.business.fragment;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import com.facebook.C0003R;
import com.instagram.business.p015ui.BusinessNavBar;
import p000X.Constants;
import p000X.AnonymousClass0C1;
import p000X.AnonymousClass0J1;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass0a4;
import p000X.AnonymousClass1EX;
import p000X.AnonymousClass1HK;
import p000X.AnonymousClass1HM;
import p000X.AnonymousClass1HU;
import p000X.AnonymousClass2UH;
import p000X.AnonymousClass61R;
import p000X.AnonymousClass624;
import p000X.AnonymousClass625;
import p000X.AnonymousClass626;
import p000X.AnonymousClass62H;
import p000X.AnonymousClass63U;
import p000X.AnonymousClass63X;
import p000X.C019000b;
import p000X.C06590Pq;
import p000X.C128275eQ;
import p000X.C13240i8;
import p000X.C140685zs;
import p000X.C14100jl;
import p000X.C1412261x;
import p000X.C27341Hl;
import p000X.C30248DXi;

public class ProfessionalAccountDescriptionFragment extends C27341Hl implements AnonymousClass1HK, AnonymousClass1HM, AnonymousClass63X {
    public AnonymousClass61R A00;
    public AnonymousClass2UH A01;
    public AnonymousClass0C1 A02;
    public String A03;
    public Integer A04;
    public BusinessNavBar mBusinessNavBar;
    public AnonymousClass63U mBusinessNavBarHelper;
    public View mMainView;

    public final void AC1() {
    }

    public final void ACw() {
    }

    public final void BLe() {
    }

    public final String getModuleName() {
        return "professional_account_description_fragment";
    }

    public final boolean isToolbarEnabled() {
        return false;
    }

    public final void BFZ() {
        this.A01.AoZ();
        AnonymousClass61R r2 = this.A00;
        if (r2 != null) {
            C1412261x r1 = new C1412261x("value_props");
            r1.A01 = this.A03;
            r1.A04 = C14100jl.A01(this.A02);
            r1.A00 = "continue";
            r2.Ano(r1.A00());
        }
        AnonymousClass61R r22 = this.A00;
        if (r22 != null) {
            C1412261x r12 = new C1412261x("value_props");
            r12.A01 = this.A03;
            r12.A04 = C14100jl.A01(this.A02);
            r22.AlP(r12.A00());
        }
    }

    public final boolean onBackPressed() {
        AnonymousClass61R r2 = this.A00;
        if (r2 != null) {
            C1412261x r1 = new C1412261x("value_props");
            r1.A01 = this.A03;
            r1.A04 = C14100jl.A01(this.A02);
            r2.Ajn(r1.A00());
        }
        AnonymousClass2UH r3 = this.A01;
        if (!AnonymousClass62H.A0D(r3) || this.A02.A06.A1b != Constants.A0N) {
            r3.Be6();
            return true;
        }
        r3.A8B();
        return true;
    }

    public final void configureActionBar(AnonymousClass1EX r3) {
        r3.BmB(C0003R.C0004drawable.instagram_arrow_back_24, new AnonymousClass625(this));
    }

    public final C06590Pq getSession() {
        return this.A02;
    }

    public final void onAttach(Context context) {
        super.onAttach(context);
        AnonymousClass2UH A012 = AnonymousClass62H.A01(getActivity());
        AnonymousClass0a4.A06(A012);
        this.A01 = A012;
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0Z0.A02(523760863);
        super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        AnonymousClass0a4.A06(bundle2);
        AnonymousClass0C1 A06 = AnonymousClass0J1.A06(bundle2);
        this.A02 = A06;
        AnonymousClass2UH r0 = this.A01;
        this.A00 = C30248DXi.A00(A06, this, r0.ALv(), r0.Aad());
        this.A03 = bundle2.getString("entry_point");
        this.A04 = C13240i8.A01(bundle2.getInt("selected_account_type"));
        AnonymousClass61R r2 = this.A00;
        if (r2 != null) {
            C1412261x r1 = new C1412261x("value_props");
            r1.A01 = this.A03;
            r1.A04 = C14100jl.A01(this.A02);
            r2.Al6(r1.A00());
        }
        AnonymousClass1HU r22 = new AnonymousClass1HU();
        r22.A0C(new C128275eQ(getActivity()));
        registerLifecycleListenerSet(r22);
        AnonymousClass0Z0.A09(506673393, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0Z0.A02(1562725913);
        View inflate = layoutInflater.inflate(C0003R.layout.stacked_value_props, viewGroup, false);
        this.mMainView = inflate;
        ViewGroup viewGroup2 = (ViewGroup) inflate.findViewById(C0003R.C0005id.value_props_container);
        BusinessNavBar businessNavBar = (BusinessNavBar) this.mMainView.findViewById(C0003R.C0005id.navigation_bar);
        this.mBusinessNavBar = businessNavBar;
        AnonymousClass63U r2 = new AnonymousClass63U(this, businessNavBar, C0003R.string.next, -1);
        this.mBusinessNavBarHelper = r2;
        registerLifecycleListener(r2);
        this.mBusinessNavBar.A04((ScrollView) this.mMainView.findViewById(C0003R.C0005id.scroll_view));
        Context context = getContext();
        AnonymousClass626 A002 = AnonymousClass624.A00(this.A04, context);
        ImageView imageView = (ImageView) viewGroup2.findViewById(C0003R.C0005id.title_icon);
        TextView textView = (TextView) viewGroup2.findViewById(C0003R.C0005id.title);
        TextView textView2 = (TextView) viewGroup2.findViewById(C0003R.C0005id.subtitle);
        if (imageView != null) {
            imageView.setImageDrawable(A002.A00);
        }
        if (textView != null) {
            textView.setText(A002.A03);
        }
        if (textView2 != null) {
            textView2.setText(A002.A02);
        }
        for (C140685zs r22 : A002.A04) {
            View inflate2 = layoutInflater.inflate(C0003R.layout.stacked_value_props_row, viewGroup2, false);
            String str = r22.A03;
            String str2 = r22.A02;
            Drawable A032 = C019000b.A03(context, r22.A01);
            ((TextView) inflate2.findViewById(C0003R.C0005id.title)).setText(str);
            ((TextView) inflate2.findViewById(C0003R.C0005id.subtitle)).setText(str2);
            ((ImageView) inflate2.findViewById(C0003R.C0005id.icon)).setImageDrawable(A032);
            viewGroup2.addView(inflate2);
        }
        AnonymousClass61R r23 = this.A00;
        if (r23 != null) {
            C1412261x r1 = new C1412261x("value_props");
            r1.A01 = this.A03;
            r1.A04 = C14100jl.A01(this.A02);
            r23.AnW(r1.A00());
        }
        View view = this.mMainView;
        AnonymousClass0Z0.A09(-1558325978, A022);
        return view;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0Z0.A02(-590947068);
        super.onDestroyView();
        unregisterLifecycleListener(this.mBusinessNavBarHelper);
        AnonymousClass0Z0.A09(-1613655386, A022);
    }
}
