package p000X;

import android.content.res.Resources;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import com.facebook.C0003R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.CJL */
public final class CJL extends AnonymousClass2NN implements C467220p, C27600CJt, C145886Lp {
    public C13300iJ A00;
    public C27586CJf A01;
    public String A02;
    public AnonymousClass0C1 A03;
    public C27572CIq A04;
    public CJS A05;
    public String A06;
    public final List A07 = new ArrayList();

    public final void Avu(C13300iJ r1) {
    }

    public final void Aw7(C13300iJ r1) {
    }

    public final void B5C(C13300iJ r1) {
    }

    public final void B5D(C13300iJ r1) {
    }

    public final void B5E(C13300iJ r1, Integer num) {
    }

    public final boolean BmW(C13300iJ r2) {
        return false;
    }

    public final String getModuleName() {
        return "reporting_confirmation_bottom_sheet_fragment";
    }

    public static CJL A00(AnonymousClass0C1 r4, C13300iJ r5, String str, String str2, C27586CJf cJf, String str3, List list) {
        CJL cjl = new CJL();
        Bundle bundle = new Bundle();
        bundle.putString("IgSessionManager.SESSION_TOKEN_KEY", r4.getToken());
        bundle.putString("ReportingConfirmationBottomSheetFragment.ARG_FRX_CONTEXT", str2);
        bundle.putString("ReportingConfirmationBottomSheetFragment.ARG_FOLLOWUP_ACTIONS_TITLE", str3);
        cjl.setArguments(bundle);
        cjl.A00 = r5;
        cjl.A02 = str;
        cjl.A01 = cJf;
        cjl.A07.clear();
        if (list != null) {
            cjl.A07.addAll(list);
        }
        return cjl;
    }

    public final void AtT(AnonymousClass6NM r8) {
        this.A04.A08(this, this.A06, this.A00, this.A02, r8.A00.name());
        C12810hQ.A02(C27575CIu.A02(this.A03, this.A06, r8.A00.toString()));
        switch (r8.A00.ordinal()) {
            case 1:
                AnonymousClass6NI.A05(getActivity(), this.A03, this, this.A00, false);
                return;
            case 2:
            case 4:
            case 5:
            case 9:
                AnonymousClass6NI.A07(getContext(), this.A03, r8.A04, r8.A05);
                return;
            case 3:
                AnonymousClass6NI.A06(getActivity(), this.A03, this.A00, this, "reporting_report_confirmation_bottom_sheet", getModuleName(), false);
                return;
            default:
                return;
        }
    }

    public final void AtU(AnonymousClass6NM r8) {
        this.A04.A09(this, this.A06, this.A00, this.A02, r8.A00.name());
    }

    public final void BMC(AnonymousClass6NQ r4) {
        this.A04.A06(this, this.A00, r4.name());
    }

    public final void BMD(AnonymousClass6NQ r8) {
        switch (r8.ordinal()) {
            case 0:
                this.A04.A05(this, this.A00, r8.name());
                AnonymousClass6NI.A06(getActivity(), this.A03, this.A00, this, "reporting_report_confirmation_bottom_sheet", getModuleName(), false);
                return;
            case 1:
                this.A04.A05(this, this.A00, r8.name());
                AnonymousClass6NI.A05(getActivity(), this.A03, this, this.A00, false);
                return;
            default:
                return;
        }
    }

    public final C06590Pq getSession() {
        return this.A03;
    }

    public final void onCreate(Bundle bundle) {
        SpannableStringBuilder spannableStringBuilder;
        int i;
        C13300iJ r6;
        AnonymousClass6NQ r3;
        C25963BdH bdH;
        int A022 = AnonymousClass0Z0.A02(1793694122);
        super.onCreate(bundle);
        if (bundle != null) {
            AnonymousClass6NI.A04(getActivity());
            i = 1389978033;
        } else {
            Bundle bundle2 = this.mArguments;
            AnonymousClass11J.A00(bundle2);
            String string = bundle2.getString("ReportingConfirmationBottomSheetFragment.ARG_FRX_CONTEXT");
            this.A06 = string;
            if (string == null) {
                this.A06 = "get_frx_prompt request failed";
            }
            String string2 = bundle2.getString("ReportingConfirmationBottomSheetFragment.ARG_FOLLOWUP_ACTIONS_TITLE");
            AnonymousClass11J.A00(string2);
            AnonymousClass0C1 A062 = AnonymousClass0J1.A06(bundle2);
            this.A03 = A062;
            this.A04 = C27572CIq.A00(A062);
            CJS cjs = new CJS(getContext(), this.A03, this, this);
            this.A05 = cjs;
            setListAdapter(cjs);
            CJS cjs2 = this.A05;
            List list = this.A07;
            C13300iJ r2 = this.A00;
            cjs2.A01 = string2;
            cjs2.A02 = list;
            cjs2.A00 = r2;
            cjs2.clear();
            Integer valueOf = Integer.valueOf(C0003R.C0004drawable.instagram_circle_check_outline_24);
            Integer valueOf2 = Integer.valueOf(C0003R.dimen.bottom_sheet_title_icon_size_redesign);
            cjs2.addModel((Object) null, new C27602CJv(valueOf, (String) null, valueOf2, valueOf2, Integer.valueOf(C0003R.dimen.report_confirm_page_padding), Integer.valueOf(C0003R.dimen.row_padding), Integer.valueOf(C0003R.color.igds_success)), cjs2.A06);
            String str = cjs2.A01;
            Integer valueOf3 = Integer.valueOf(C0003R.dimen.bottom_sheet_zero_padding);
            cjs2.addModel(str, new C27563CIf(true, valueOf3, Integer.valueOf(C0003R.dimen.row_padding_medium), (Integer) null, (Integer) null), cjs2.A09);
            List list2 = cjs2.A02;
            if (list2.isEmpty() || (bdH = ((AnonymousClass6NM) list2.get(0)).A02) == null) {
                spannableStringBuilder = null;
            } else {
                spannableStringBuilder = bdH.A00();
            }
            if (spannableStringBuilder != null) {
                Integer num = valueOf3;
                cjs2.addModel(spannableStringBuilder, new C27563CIf(true, num, valueOf3, Integer.valueOf(C0003R.dimen.font_medium), (Integer) null), cjs2.A08);
            }
            int i2 = 0;
            for (int i3 = 0; i3 < cjs2.A02.size(); i3++) {
                AnonymousClass6NM r62 = (AnonymousClass6NM) cjs2.A02.get(i3);
                AnonymousClass6NO r32 = r62.A00;
                if (!(r32 == AnonymousClass6NO.REPORT_CONTENT || r32 == AnonymousClass6NO.PLACE_HOLDER_CONTENT_ACTION || r32 == AnonymousClass6NO.PLACE_HOLDER_BULLY_CONTENT_ACTION || r32 == AnonymousClass6NO.PLACE_HOLDER_I_JUST_DONT_LIKE_CONTENT_ACTION)) {
                    switch (r32.ordinal()) {
                        case 1:
                            r6 = cjs2.A00;
                            if (!r6.A0e()) {
                                r3 = AnonymousClass6NQ.BLOCK;
                                break;
                            } else {
                                continue;
                            }
                        case 2:
                        case 4:
                        case 5:
                        case 9:
                            cjs2.addModel(r62, new C27599CJs(i2, true), cjs2.A07);
                            break;
                        case 3:
                            if (C26661Ek.A00(cjs2.A05).A0K(cjs2.A00)) {
                                r6 = cjs2.A00;
                                r3 = AnonymousClass6NQ.UNFOLLOW;
                                break;
                            } else {
                                continue;
                            }
                    }
                    cjs2.addModel(r6, r3, cjs2.A0A);
                    i2++;
                }
            }
            C29381Pr r4 = cjs2.A04;
            Resources resources = cjs2.A03.getResources();
            int i4 = C0003R.dimen.report_confirm_page_padding;
            if (i2 == 0) {
                i4 = C0003R.dimen.report_confirm_page_padding_without_action;
            }
            r4.A00(resources.getDimensionPixelSize(i4));
            cjs2.addModel((Object) null, cjs2.A04);
            cjs2.updateListView();
            C27586CJf cJf = this.A01;
            if (cJf != null) {
                this.A04.A0A(this, this.A06, this.A00, this.A02, cJf.A03);
            }
            i = -530114429;
        }
        AnonymousClass0Z0.A09(i, A022);
    }
}
