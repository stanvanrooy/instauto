package p000X;

import android.os.Bundle;
import com.facebook.C0003R;

/* renamed from: X.CJM */
public final class CJM extends AK5 implements C467220p, C27592CJl, C145886Lp, C146096Mk {
    public float A00;
    public AnonymousClass2TI A01;
    public AnonymousClass0C1 A02;
    public C13300iJ A03;
    public CJX A04;
    public C27572CIq A05;
    public C27591CJk A06;
    public String A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;

    public final void AmU(AnonymousClass0RN r1, Integer num) {
    }

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
        return "comment_reporting_self_remediation_bottom_sheet";
    }

    public final void BIi() {
        this.A05.A06(this, this.A03, AnonymousClass6NQ.REPORT_THIS_COMMENT.name());
    }

    public final void BIj() {
        this.A05.A05(this, this.A03, AnonymousClass6NQ.REPORT_THIS_COMMENT.name());
        C27591CJk cJk = this.A06;
        if (cJk != null) {
            cJk.BIp();
        }
    }

    public final void BMC(AnonymousClass6NQ r4) {
        this.A05.A06(this, this.A03, r4.name());
    }

    public final void A00(AnonymousClass2TI r1) {
        this.A01 = r1;
    }

    public final void A01(C27591CJk cJk) {
        this.A06 = cJk;
    }

    public final void BMD(AnonymousClass6NQ r9) {
        switch (r9.ordinal()) {
            case 0:
                this.A05.A05(this, this.A03, r9.name());
                AnonymousClass6NI.A06(getActivity(), this.A02, this.A03, this, "comment_reporting_self_remediation_bottom_sheet", getModuleName(), this.A09);
                return;
            case 1:
                this.A05.A05(this, this.A03, r9.name());
                AnonymousClass6NI.A05(getActivity(), this.A02, this, this.A03, this.A09);
                return;
            case 2:
                this.A05.A05(this, this.A03, r9.name());
                AnonymousClass2TI r6 = this.A01;
                AnonymousClass11J.A00(r6);
                AnonymousClass2TH r5 = new AnonymousClass2TH(this.A02);
                r5.A0L = getContext().getResources().getString(C0003R.string.self_remediation_mute_user, new Object[]{this.A03.AZn()});
                r5.A0T = this.A08;
                r5.A00 = this.A00;
                r6.A08(r5, AnonymousClass6NI.A00(this.A02, this.A03, "comment_thread", this));
                return;
            case 5:
                C27591CJk cJk = this.A06;
                if (cJk != null) {
                    cJk.BJn();
                    return;
                }
                return;
            case 6:
                C27591CJk cJk2 = this.A06;
                if (cJk2 != null) {
                    cJk2.BTM();
                }
                if (!this.A09) {
                    AnonymousClass6NI.A04(getActivity());
                    return;
                }
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
        int A022 = AnonymousClass0Z0.A02(-2041001204);
        super.onCreate(bundle);
        if (bundle != null) {
            AnonymousClass6NI.A04(getActivity());
            i = 480206963;
        } else {
            Bundle bundle2 = this.mArguments;
            AnonymousClass11J.A00(bundle2);
            AnonymousClass0C1 A062 = AnonymousClass0J1.A06(bundle2);
            this.A02 = A062;
            this.A05 = C27572CIq.A00(A062);
            this.A08 = bundle2.getBoolean("ReportingConstants.ARG_IS_FULL_SCREEN_ENABLED");
            this.A00 = bundle2.getFloat("ReportingConstants.ARG_INITIAL_OPENING_HEIGHT_RATIO");
            String string = bundle2.getString("SelfRemediationBottomSheetFragment.ARG_COMMENT_ID");
            this.A07 = string;
            AnonymousClass11J.A00(string);
            String string2 = bundle2.getString("SelfRemediationBottomSheetFragment.COMMENTER_USER_ID");
            AnonymousClass11J.A00(string2);
            C13300iJ A023 = C13510ie.A00(this.A02).A02(string2);
            this.A03 = A023;
            AnonymousClass11J.A00(A023);
            bundle2.getString("SelfRemediationBottomSheetFragment.COMMENT_MEDIA_ID");
            this.A0A = bundle2.getBoolean("SelfRemediationBottomSheetFragment.ARG_SHOW_RESTRICT_ACTIONS", false);
            this.A09 = bundle2.getBoolean("SelfRemediationBottomSheetFragment.ARG_KEEP_OPEN_AFTER_ACTION", false);
            if (this.A03.A0M == C13390iS.FollowStatusUnknown) {
                C55602b0.A00(this.A02).A07(this.A03);
            }
            CJX cjx = new CJX(getContext(), this.A02, this.A03, this.A0A, this, this);
            this.A04 = cjx;
            setListAdapter(cjx);
            CJX cjx2 = this.A04;
            cjx2.clear();
            cjx2.addModel(cjx2.A00.getResources().getString(C0003R.string.self_remediation_bottom_sheet_subtitle_label), new C27563CIf(true, (Integer) null, (Integer) null, Integer.valueOf(C0003R.dimen.font_medium), (Integer) null), cjx2.A02);
            cjx2.addModel(C27583CJc.COMMENT, cjx2.A03);
            cjx2.addModel(cjx2.A01, AnonymousClass6NQ.MUTE, cjx2.A04);
            if (cjx2.A05) {
                cjx2.addModel(cjx2.A01, AnonymousClass6NQ.RESTRICT, cjx2.A04);
                cjx2.addModel(cjx2.A01, AnonymousClass6NQ.UNRESTRICT, cjx2.A04);
            }
            cjx2.addModel(cjx2.A01, AnonymousClass6NQ.UNFOLLOW, cjx2.A04);
            cjx2.addModel(cjx2.A01, AnonymousClass6NQ.BLOCK, cjx2.A04);
            cjx2.updateListView();
            this.A05.A04(this, this.A03, this.A07);
            i = -1045767211;
        }
        AnonymousClass0Z0.A09(i, A022);
    }
}
