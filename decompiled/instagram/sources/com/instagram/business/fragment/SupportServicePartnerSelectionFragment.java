package com.instagram.business.fragment;

import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.C0003R;
import com.instagram.p009ui.widget.spinner.SpinnerImageView;
import java.util.List;
import p000X.Constants;
import p000X.AnonymousClass0C1;
import p000X.AnonymousClass0C5;
import p000X.AnonymousClass0J1;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass1EX;
import p000X.AnonymousClass1HM;
import p000X.AnonymousClass2A5;
import p000X.AnonymousClass3AT;
import p000X.AnonymousClass4XV;
import p000X.C019000b;
import p000X.C06590Pq;
import p000X.C13300iJ;
import p000X.C15890nh;
import p000X.C17850qu;
import p000X.C27341Hl;
import p000X.C29086Cre;
import p000X.C29088Crg;
import p000X.C29090Cri;
import p000X.C29094Crm;
import p000X.C29109Cs4;
import p000X.C57942f3;

public class SupportServicePartnerSelectionFragment extends C27341Hl implements AnonymousClass1HM {
    public C29090Cri A00;
    public C29109Cs4 A01;
    public AnonymousClass0C1 A02;
    public AnonymousClass2A5 A03;
    public C57942f3 A04;
    public String A05;
    public String A06;
    public List A07;
    public boolean A08;
    public SpinnerImageView mLoadingSpinner;
    public RecyclerView mRecyclerView;

    public final String getModuleName() {
        return "service_partner_selection";
    }

    public final boolean isToolbarEnabled() {
        return false;
    }

    public final void configureActionBar(AnonymousClass1EX r3) {
        if (this.A05.equals("sticker")) {
            r3.BmK(C0003R.string.support_partner_selection_sticker_actionbar_title);
            return;
        }
        r3.BlI(C0003R.string.action_button_actionbar_title);
        r3.Bo6(true);
    }

    public final C06590Pq getSession() {
        return this.A02;
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0Z0.A02(895805237);
        super.onCreate(bundle);
        this.A00 = new C29090Cri(this);
        Bundle bundle2 = this.mArguments;
        this.A02 = AnonymousClass0J1.A06(bundle2);
        this.A06 = bundle2.getString("args_session_id");
        this.A05 = bundle2.getString("args_entry_point");
        AnonymousClass2A5 r4 = (AnonymousClass2A5) bundle2.getSerializable(AnonymousClass0C5.$const$string(62));
        this.A03 = r4;
        AnonymousClass0C1 r2 = this.A02;
        this.A01 = new C29109Cs4(r2, this, this.A06, this.A05);
        C13300iJ r22 = r2.A06;
        boolean z = false;
        if (AnonymousClass3AT.A00(r22, r4) != null) {
            z = true;
        }
        this.A08 = z;
        this.A04 = AnonymousClass3AT.A00(r22, r4);
        AnonymousClass0Z0.A09(1304577856, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0Z0.A02(1720926573);
        View inflate = layoutInflater.inflate(C0003R.layout.support_service_partner_selection_fragment, viewGroup, false);
        AnonymousClass0Z0.A09(52117911, A022);
        return inflate;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        int i;
        C15890nh r2;
        String str;
        super.onViewCreated(view, bundle);
        this.mLoadingSpinner = (SpinnerImageView) view.findViewById(C0003R.C0005id.loading_indicator);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(C0003R.C0005id.recycler_view);
        this.mRecyclerView = recyclerView;
        recyclerView.setAdapter(this.A00);
        if (this.A07 == null) {
            SpinnerImageView spinnerImageView = this.mLoadingSpinner;
            if (spinnerImageView != null) {
                spinnerImageView.setVisibility(0);
            }
            C29086Cre cre = new C29086Cre(this);
            AnonymousClass2A5 r1 = this.A03;
            if (r1.equals(AnonymousClass2A5.GIFT_CARD)) {
                r2 = new C15890nh(this.A02);
                r2.A09 = Constants.A0N;
                str = "business/instant_experience/get_support_button_partners_bundle/";
            } else if (r1.equals(AnonymousClass2A5.DELIVERY)) {
                r2 = new C15890nh(this.A02);
                r2.A09 = Constants.A0N;
                str = "business/instant_experience/get_delivery_button_partners_bundle/";
            }
            r2.A0C = str;
            r2.A06(C29094Crm.class, false);
            r2.A0G = true;
            C17850qu A032 = r2.A03();
            A032.A00 = cre;
            schedule(A032);
        }
        TextView textView = (TextView) view.findViewById(C0003R.C0005id.title);
        if (this.A05.equals("sticker")) {
            boolean equals = this.A03.equals(AnonymousClass2A5.GIFT_CARD);
            i = C0003R.string.service_selection_title_sticker_delivery;
            if (equals) {
                i = C0003R.string.service_selection_title_sticker_gift_cards;
            }
        } else {
            i = C0003R.string.service_selection_title;
        }
        textView.setText(getString(i));
        TextView textView2 = (TextView) view.findViewById(C0003R.C0005id.subtitle);
        int i2 = C0003R.string.service_selection_info;
        if (this.A05.equals("sticker")) {
            boolean equals2 = this.A03.equals(AnonymousClass2A5.GIFT_CARD);
            i2 = C0003R.string.service_selection_info_sticker_delivery;
            if (equals2) {
                i2 = C0003R.string.service_selection_info_sticker_gift_cards;
            }
        }
        String string = getString(C0003R.string.business_support_learn_more_text);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(getString(i2, string));
        AnonymousClass4XV.A02(string, spannableStringBuilder, new C29088Crg(this, C019000b.A00(getContext(), C0003R.color.igds_link)));
        textView2.setText(spannableStringBuilder);
        textView2.setHighlightColor(0);
        textView2.setMovementMethod(LinkMovementMethod.getInstance());
    }
}
