package p000X;

import android.os.Bundle;
import android.text.SpannableStringBuilder;
import com.facebook.C0003R;
import java.util.List;

/* renamed from: X.CJK */
public final class CJK extends AnonymousClass2NN implements C467220p, C27600CJt, C145886Lp {
    public C13300iJ A00;
    public C27578CIx A01;
    public AnonymousClass0C1 A02;
    public C27572CIq A03;
    public CJR A04;
    public String A05;

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
        return "reporting_confirmation_v2_bottom_sheet_fragment";
    }

    public final void AtT(AnonymousClass6NM r8) {
        this.A03.A08(this, this.A01.A00.A0B, this.A00, this.A05, r8.A00.name());
        C12810hQ.A02(C27575CIu.A02(this.A02, this.A01.A00.A0B, r8.A00.toString()));
        switch (r8.A00.ordinal()) {
            case 2:
            case 4:
            case 5:
            case 9:
                AnonymousClass6NI.A07(getContext(), this.A02, r8.A04, r8.A05);
                return;
            default:
                return;
        }
    }

    public final void AtU(AnonymousClass6NM r8) {
        this.A03.A09(this, this.A01.A00.A0B, this.A00, this.A05, r8.A00.name());
    }

    public final void BMC(AnonymousClass6NQ r4) {
        this.A03.A06(this, this.A00, r4.name());
    }

    public final void BMD(AnonymousClass6NQ r8) {
        switch (r8.ordinal()) {
            case 0:
                this.A03.A05(this, this.A00, r8.name());
                C13300iJ r2 = this.A00;
                if (r2 != null) {
                    AnonymousClass6NI.A06(getActivity(), this.A02, r2, this, "reporting_report_confirmation_bottom_sheet", getModuleName(), false);
                    return;
                }
                return;
            case 1:
                this.A03.A05(this, this.A00, r8.name());
                AnonymousClass6NI.A05(getActivity(), this.A02, this, this.A00, false);
                return;
            default:
                return;
        }
    }

    public final C06590Pq getSession() {
        return this.A02;
    }

    public final void onCreate(Bundle bundle) {
        int i;
        C13300iJ r7;
        AnonymousClass6NQ r3;
        int A022 = AnonymousClass0Z0.A02(249128310);
        super.onCreate(bundle);
        if (bundle != null) {
            AnonymousClass6NI.A04(getActivity());
            i = 198907532;
        } else {
            Bundle bundle2 = this.mArguments;
            AnonymousClass11J.A00(bundle2);
            AnonymousClass0C1 A06 = AnonymousClass0J1.A06(bundle2);
            this.A02 = A06;
            this.A03 = C27572CIq.A00(A06);
            this.A05 = bundle2.getString("ReportingConstants.ARG_CONTENT_ID");
            CJR cjr = new CJR(getContext(), this.A02, this, this);
            this.A04 = cjr;
            setListAdapter(cjr);
            CJR cjr2 = this.A04;
            C27578CIx cIx = this.A01;
            AnonymousClass11J.A00(cIx);
            C13300iJ r2 = this.A00;
            cjr2.A01 = cIx;
            cjr2.A00 = r2;
            cjr2.clear();
            CJC cjc = cjr2.A01.A00;
            if (cjc.A06 != null) {
                Integer valueOf = Integer.valueOf(C0003R.C0004drawable.instagram_circle_check_outline_24);
                Integer valueOf2 = Integer.valueOf(C0003R.dimen.bottom_sheet_title_icon_size_redesign);
                Integer valueOf3 = Integer.valueOf(C0003R.dimen.row_padding);
                cjr2.addModel((Object) null, new C27602CJv(valueOf, (String) null, valueOf2, valueOf2, valueOf3, valueOf3, Integer.valueOf(C0003R.color.green_5)), cjr2.A05);
                cjr2.addModel(cjc.A06.A00, new C27563CIf(true, Integer.valueOf(C0003R.dimen.bottom_sheet_zero_padding), valueOf3, (Integer) null, (Integer) null), cjr2.A08);
            }
            C25963BdH bdH = cjc.A05;
            if (bdH != null) {
                SpannableStringBuilder A002 = bdH.A00();
                Integer valueOf4 = Integer.valueOf(C0003R.dimen.font_medium);
                C25963BdH bdH2 = cjc.A06;
                int i2 = C0003R.dimen.bottom_sheet_zero_padding;
                if (bdH2 == null) {
                    i2 = C0003R.dimen.row_padding;
                }
                cjr2.addModel(A002, new C27563CIf(true, Integer.valueOf(i2), Integer.valueOf(C0003R.dimen.row_padding), valueOf4, (Integer) null), cjr2.A07);
            }
            List list = cjr2.A01.A00.A0E;
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                AnonymousClass6NM r72 = (AnonymousClass6NM) list.get(i4);
                AnonymousClass6NO r32 = r72.A00;
                if (!(r32 == AnonymousClass6NO.REPORT_CONTENT || r32 == AnonymousClass6NO.PLACE_HOLDER_CONTENT_ACTION || r32 == AnonymousClass6NO.PLACE_HOLDER_BULLY_CONTENT_ACTION || r32 == AnonymousClass6NO.PLACE_HOLDER_I_JUST_DONT_LIKE_CONTENT_ACTION)) {
                    switch (r32.ordinal()) {
                        case 1:
                            r7 = cjr2.A00;
                            if (r7 != null && !r7.A0e()) {
                                r3 = AnonymousClass6NQ.BLOCK;
                                break;
                            }
                        case 2:
                        case 4:
                        case 5:
                        case 9:
                            cjr2.addModel(r72, new C27599CJs(i3, true), cjr2.A06);
                            break;
                        case 3:
                            if (cjr2.A00 != null && C26661Ek.A00(cjr2.A04).A0K(cjr2.A00)) {
                                r7 = cjr2.A00;
                                r3 = AnonymousClass6NQ.UNFOLLOW;
                                break;
                            }
                    }
                    cjr2.addModel(r7, r3, cjr2.A09);
                    i3++;
                }
            }
            if (i3 == 0) {
                cjr2.A03.A00(cjr2.A02.getResources().getDimensionPixelSize(C0003R.dimen.bottom_sheet_subtitle_vertical_margin));
                cjr2.addModel((Object) null, cjr2.A03);
            }
            cjr2.updateListView();
            this.A03.A0A(this, this.A01.A00.A0B, this.A00, this.A05, (String) null);
            i = -1000254728;
        }
        AnonymousClass0Z0.A09(i, A022);
    }
}
