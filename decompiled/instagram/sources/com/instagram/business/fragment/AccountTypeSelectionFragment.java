package com.instagram.business.fragment;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.C0003R;
import java.util.Arrays;
import java.util.Map;
import p000X.Constants;
import p000X.AnonymousClass04H;
import p000X.AnonymousClass0C1;
import p000X.AnonymousClass0J1;
import p000X.AnonymousClass0L7;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass1HK;
import p000X.AnonymousClass1HU;
import p000X.AnonymousClass2UH;
import p000X.AnonymousClass3BL;
import p000X.AnonymousClass61R;
import p000X.AnonymousClass624;
import p000X.AnonymousClass626;
import p000X.AnonymousClass628;
import p000X.AnonymousClass629;
import p000X.AnonymousClass62H;
import p000X.C05000Hl;
import p000X.C06590Pq;
import p000X.C128275eQ;
import p000X.C134405oU;
import p000X.C27341Hl;
import p000X.C30248DXi;
import p000X.C30253DXn;

public class AccountTypeSelectionFragment extends C27341Hl implements AnonymousClass1HK {
    public AnonymousClass61R A00;
    public AnonymousClass0C1 A01;
    public String A02;
    public AnonymousClass2UH mController;

    public final String getModuleName() {
        return "account_type_selection";
    }

    public final boolean onBackPressed() {
        AnonymousClass61R r2 = this.A00;
        if (r2 != null) {
            r2.Ajn(new C30253DXn("account_type_selection", this.A02, (Map) null, (Map) null, (Map) null, AnonymousClass62H.A06(this.A01, this.mController), (String) null, (String) null, (String) null));
        }
        AnonymousClass2UH r0 = this.mController;
        if (r0 == null) {
            return false;
        }
        r0.Be6();
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x00ba  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x00c5  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x00e5 A[LOOP:0: B:17:0x00df->B:19:0x00e5, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0142  */
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        Integer num;
        AnonymousClass626[] r3;
        AnonymousClass61R r4;
        int A022 = AnonymousClass0Z0.A02(560138862);
        LayoutInflater layoutInflater2 = layoutInflater;
        View inflate = layoutInflater2.inflate(C0003R.layout.account_type_selection_fragment, viewGroup, false);
        TextView textView = (TextView) inflate.findViewById(C0003R.C0005id.title);
        TextView textView2 = (TextView) inflate.findViewById(C0003R.C0005id.description);
        String str = this.A02;
        if ("branded_content_tools".equals(str) || "branded_content_activity_feed".equals(str)) {
            textView.setText(C0003R.string.f73x19a18250);
            i = C0003R.string.f72x1d8909f4;
        } else {
            textView.setText(C0003R.string.account_type_selection_title);
            if (((Boolean) C134405oU.A00(new C05000Hl("is_subtitle_enabled", AnonymousClass0L7.SMB_ANDROID_ADD_REMOVE_PROFESSIONAL_TOOLS_LAUNCHER, false, (String[]) null, (AnonymousClass04H) null), this.A01, true)).booleanValue()) {
                i = C0003R.string.account_type_selection_subtitle;
            } else {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) textView.getLayoutParams();
                marginLayoutParams.bottomMargin = getResources().getDimensionPixelSize(C0003R.dimen.account_type_selection_title_margin_bottom);
                textView.setLayoutParams(marginLayoutParams);
                ViewGroup viewGroup2 = (ViewGroup) inflate.findViewById(C0003R.C0005id.cards_container);
                num = this.A01.A06.A1b;
                Context context = getContext();
                switch (num.intValue()) {
                    case 1:
                        r3 = new AnonymousClass626[]{AnonymousClass624.A00(Constants.A0N, context), AnonymousClass624.A00(Constants.A0C, context)};
                        break;
                    case 2:
                        r3 = new AnonymousClass626[]{AnonymousClass624.A00(Constants.A0N, context)};
                        break;
                    default:
                        throw new IllegalArgumentException("No supported onboarding configuration list for account type");
                }
                for (AnonymousClass626 r8 : Arrays.asList(r3)) {
                    View inflate2 = layoutInflater2.inflate(C0003R.layout.account_type_card, viewGroup2, false);
                    viewGroup2.addView(inflate2);
                    ((TextView) inflate2.findViewById(C0003R.C0005id.card_title)).setText(r8.A03);
                    ((TextView) inflate2.findViewById(C0003R.C0005id.card_subtitle)).setText(r8.A02);
                    ((ImageView) inflate2.findViewById(C0003R.C0005id.card_icon)).setImageDrawable(r8.A00);
                    inflate2.setOnClickListener(new AnonymousClass628(this, r8));
                }
                AnonymousClass3BL.A05(getContext(), (ImageView) inflate.findViewById(C0003R.C0005id.cross_button), new AnonymousClass629(this));
                r4 = this.A00;
                if (r4 != null) {
                    r4.AnW(new C30253DXn("account_type_selection", this.A02, (Map) null, (Map) null, (Map) null, AnonymousClass62H.A06(this.A01, this.mController), (String) null, (String) null, (String) null));
                }
                AnonymousClass0Z0.A09(654355452, A022);
                return inflate;
            }
        }
        textView2.setText(i);
        textView2.setVisibility(0);
        ViewGroup viewGroup22 = (ViewGroup) inflate.findViewById(C0003R.C0005id.cards_container);
        num = this.A01.A06.A1b;
        Context context2 = getContext();
        switch (num.intValue()) {
            case 1:
                break;
            case 2:
                break;
        }
        while (r11.hasNext()) {
        }
        AnonymousClass3BL.A05(getContext(), (ImageView) inflate.findViewById(C0003R.C0005id.cross_button), new AnonymousClass629(this));
        r4 = this.A00;
        if (r4 != null) {
        }
        AnonymousClass0Z0.A09(654355452, A022);
        return inflate;
    }

    public final C06590Pq getSession() {
        return this.A01;
    }

    public final void onAttach(Context context) {
        super.onAttach(context);
        this.mController = AnonymousClass62H.A01(getActivity());
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0Z0.A02(269376711);
        super.onCreate(bundle);
        this.A01 = AnonymousClass0J1.A06(this.mArguments);
        this.A02 = this.mArguments.getString("entry_point");
        AnonymousClass2UH r0 = this.mController;
        if (r0 != null) {
            this.A00 = C30248DXi.A00(this.A01, this, r0.ALv(), r0.Aad());
        }
        AnonymousClass1HU r2 = new AnonymousClass1HU();
        r2.A0C(new C128275eQ(getActivity()));
        registerLifecycleListenerSet(r2);
        AnonymousClass0Z0.A09(662066382, A022);
    }
}
