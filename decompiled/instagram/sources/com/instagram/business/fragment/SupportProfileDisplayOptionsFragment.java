package com.instagram.business.fragment;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.C0003R;
import com.instagram.actionbar.ActionButton;
import com.instagram.business.p015ui.BusinessNavBar;
import com.instagram.react.modules.navigator.IgReactNavigatorModule;
import java.util.ArrayList;
import p000X.AnonymousClass04H;
import p000X.AnonymousClass0C1;
import p000X.AnonymousClass0J1;
import p000X.AnonymousClass0L6;
import p000X.AnonymousClass0L7;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass0a4;
import p000X.AnonymousClass1EX;
import p000X.AnonymousClass1HM;
import p000X.AnonymousClass2A5;
import p000X.AnonymousClass38B;
import p000X.AnonymousClass3AT;
import p000X.C019000b;
import p000X.C06590Pq;
import p000X.C174207cO;
import p000X.C27341Hl;
import p000X.C29109Cs4;
import p000X.C29111Cs6;
import p000X.C29113Cs8;
import p000X.C29116CsB;
import p000X.C29118CsD;
import p000X.C29123CsI;
import p000X.C29124CsJ;
import p000X.C29138CsX;
import p000X.C57942f3;
import p000X.C58422fu;

public class SupportProfileDisplayOptionsFragment extends C27341Hl implements AnonymousClass1HM {
    public ActionButton A00;
    public C29118CsD A01;
    public C29116CsB A02;
    public C29109Cs4 A03;
    public C29138CsX A04;
    public AnonymousClass0C1 A05;
    public C58422fu A06;
    public boolean A07;
    public String A08;
    public final Handler A09 = new Handler(Looper.getMainLooper());
    public BusinessNavBar mBusinessNavBar;
    public View mLoadingIndicator;
    public RecyclerView mRecyclerView;

    public final String getModuleName() {
        return "support_profile_display_options";
    }

    public final boolean isToolbarEnabled() {
        return false;
    }

    public static AnonymousClass2A5 A00(SupportProfileDisplayOptionsFragment supportProfileDisplayOptionsFragment) {
        C29138CsX csX = supportProfileDisplayOptionsFragment.A02.A00;
        if (csX == null) {
            return null;
        }
        return csX.A03;
    }

    public final void configureActionBar(AnonymousClass1EX r4) {
        ActionButton BmG = r4.BmG(C0003R.string.profile_display_actionbar_title, C0003R.C0004drawable.instagram_arrow_back_24, new C29111Cs6(this));
        this.A00 = BmG;
        BmG.setEnabled(false);
    }

    public final C06590Pq getSession() {
        return this.A05;
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0Z0.A02(-1251531810);
        super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        this.A05 = AnonymousClass0J1.A06(bundle2);
        this.A08 = bundle2.getString("args_session_id");
        String string = bundle2.getString("args_entry_point");
        AnonymousClass0C1 r1 = this.A05;
        this.A03 = new C29109Cs4(r1, this, this.A08, string);
        boolean A002 = AnonymousClass38B.A00(r1, true);
        this.A07 = A002;
        if (A002) {
            this.A01 = new C29118CsD(this, getContext());
        } else {
            this.A02 = new C29116CsB(this, this.A05.A06, getContext());
        }
        AnonymousClass0Z0.A09(332902542, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0Z0.A02(1729142557);
        View inflate = layoutInflater.inflate(C0003R.layout.support_profile_display_options_fragment, viewGroup, false);
        AnonymousClass0Z0.A09(-744947297, A022);
        return inflate;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x003b, code lost:
        if (r0 != null) goto L_0x003d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x01ad, code lost:
        if (r6 != null) goto L_0x003d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x01b1, code lost:
        r0 = false;
     */
    public final void onViewCreated(View view, Bundle bundle) {
        C29138CsX csX;
        String str;
        String str2;
        String str3;
        AnonymousClass2A5 r1;
        Long valueOf;
        super.onViewCreated(view, bundle);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(C0003R.C0005id.recycler_view);
        AnonymousClass0a4.A06(recyclerView);
        this.mRecyclerView = recyclerView;
        View findViewById = view.findViewById(C0003R.C0005id.loading_spinner);
        AnonymousClass0a4.A06(findViewById);
        this.mLoadingIndicator = findViewById;
        if (this.A07) {
            C29124CsJ.A00(this.A05, this, new C29123CsI(this));
            this.mRecyclerView.setAdapter(this.A01);
            C58422fu r0 = this.A05.A06.A0A;
            this.A06 = r0;
        } else {
            this.mRecyclerView.setAdapter(this.A02);
            ArrayList arrayList = new ArrayList();
            AnonymousClass0C1 r4 = this.A05;
            AnonymousClass0L7 r3 = AnonymousClass0L7.SMB_SUPPORT_LINK;
            if (((Boolean) AnonymousClass0L6.A02(r4, r3, "has_gift_card_option", false, (AnonymousClass04H) null)).booleanValue()) {
                arrayList.add(new C29138CsX(AnonymousClass2A5.GIFT_CARD));
            }
            if (((Boolean) AnonymousClass0L6.A02(this.A05, r3, "has_food_delivery_option", false, (AnonymousClass04H) null)).booleanValue()) {
                arrayList.add(new C29138CsX(AnonymousClass2A5.DELIVERY));
            }
            if (AnonymousClass38B.A01(this.A05)) {
                arrayList.add(new C29138CsX(AnonymousClass2A5.DONATION));
            }
            AnonymousClass2A5 r6 = this.A05.A06.A0G;
            if (r6 != null) {
                csX = new C29138CsX(r6);
            } else {
                csX = null;
            }
            this.A04 = csX;
            C29116CsB csB = this.A02;
            csB.A01 = arrayList;
            if (arrayList.isEmpty() || csX == null) {
                csB.A00 = null;
            } else if (csB.A00 == null) {
                csB.A00 = (C29138CsX) csB.A01.get(0);
                for (C29138CsX csX2 : csB.A01) {
                    if (csX2.A03.equals(csX.A03)) {
                        csB.A00 = csX2;
                    }
                }
            }
            if (csB.A01 != null) {
                C29116CsB.A00(csB);
            }
        }
        boolean z = true;
        if (z) {
            BusinessNavBar businessNavBar = (BusinessNavBar) view.findViewById(C0003R.C0005id.remove_action_bar);
            this.mBusinessNavBar = businessNavBar;
            businessNavBar.A02();
            this.mBusinessNavBar.A05(getString(C0003R.string.remove_action_button), C019000b.A00(getContext(), C0003R.color.igds_error_or_destructive), getResources().getDimensionPixelSize(C0003R.dimen.font_small));
            this.mBusinessNavBar.setSecondaryButtonOnclickListeners(new C29113Cs8(this));
            this.mBusinessNavBar.setVisibility(0);
        }
        String str4 = null;
        if (this.A07) {
            C58422fu r2 = this.A06;
            if (r2 != null) {
                str4 = r2.A03;
                str = r2.A01;
                str2 = r2.A05;
                str3 = r2.A06;
            }
            str = null;
            str2 = null;
            str3 = null;
        } else {
            C29138CsX csX3 = this.A04;
            if (csX3 == null) {
                r1 = null;
            } else {
                r1 = csX3.A03;
            }
            C57942f3 A002 = AnonymousClass3AT.A00(this.A05.A06, r1);
            if (A002 != null) {
                str4 = r1.A00;
                str = A002.A00;
                str2 = A002.A02;
                str3 = A002.A03;
            }
            str = null;
            str2 = null;
            str3 = null;
        }
        C29109Cs4 cs4 = this.A03;
        C174207cO A0C = C174207cO.A00(cs4.A00).A0D(cs4.A01).A0G("edit_action_button").A0E("view").A0F(cs4.A03).A0C(true);
        A0C.A0H(cs4.A02);
        A0C.A0I(str4);
        if (str == null) {
            valueOf = null;
        } else {
            valueOf = Long.valueOf(Long.parseLong(str));
        }
        A0C.A07("partner_id", valueOf);
        A0C.A08("partner_name", str2);
        A0C.A08(IgReactNavigatorModule.URL, str3);
        A0C.A01();
    }
}
