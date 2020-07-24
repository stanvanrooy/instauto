package p000X;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.C0003R;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.p009ui.widget.spinner.SpinnerImageView;
import java.util.List;

/* renamed from: X.CDB */
public final class CDB extends C27341Hl implements AnonymousClass1HM, C27522CGm, C27516CGg {
    public RecyclerView A00;
    public CD8 A01;
    public C27434CDc A02;
    public CDD A03;
    public CD3 A04;
    public C27481CEx A05;
    public CDA A06;
    public AnonymousClass2TI A07;
    public AnonymousClass0C1 A08;
    public C31221Wz A09;
    public SpinnerImageView A0A;
    public final C17920r1 A0B = new CDR(this);

    public static void A03(CDB cdb, boolean z) {
        if (z) {
            cdb.A0A.setVisibility(0);
            cdb.A00.setVisibility(8);
            return;
        }
        cdb.A0A.setVisibility(8);
        cdb.A00.setVisibility(0);
    }

    public final String getModuleName() {
        return "promote_saved_settings";
    }

    public final boolean isToolbarEnabled() {
        return false;
    }

    public static void A00(CDB cdb) {
        if (!AnonymousClass0OX.A00(cdb.A04.A0k)) {
            C27481CEx cEx = (C27481CEx) cdb.A04.A0k.get(0);
            cdb.A05 = cEx;
            cEx.A08 = true;
        }
    }

    public static void A02(CDB cdb, C27481CEx cEx) {
        if (!AnonymousClass0OX.A00(cdb.A04.A0k)) {
            if (cdb.A05.equals(cEx)) {
                cdb.A05 = cEx;
            }
            cdb.A04.A0k.set(cdb.A04.A0k.indexOf(cEx), cEx);
            CDD cdd = cdb.A03;
            List list = cdb.A04.A0k;
            C27481CEx cEx2 = cdb.A05;
            cdd.A01 = list;
            cdd.A00 = cEx2;
            cdd.notifyDataSetChanged();
        }
    }

    private void A04(C27481CEx cEx) {
        String str;
        CD8 cd8 = this.A01;
        C27406CBz cBz = new C27406CBz(this, cEx);
        AnonymousClass0C1 r12 = cd8.A0D;
        String str2 = cd8.A04.A0R;
        String str3 = cEx.A06;
        String str4 = cEx.A05;
        int i = cEx.A00;
        int i2 = cEx.A01;
        CCf cCf = cEx.A03;
        CCN A002 = CCf.A00(cCf);
        String str5 = cEx.A07;
        CFW cfw = cEx.A02;
        if (CDV.A05(cfw)) {
            str = null;
        } else {
            str = cfw.A03;
        }
        C15890nh r4 = new C15890nh(r12);
        r4.A09 = Constants.ONE;
        r4.A0C = "ads/promote/edit_settings/";
        r4.A09("fb_auth_token", str2);
        r4.A09("draft_name", str3);
        r4.A09("draft_id", str4);
        r4.A09("daily_budget_with_offset", String.valueOf(i));
        r4.A09("duration_in_days", String.valueOf(i2));
        r4.A09("call_to_action", cCf.toString());
        r4.A09("destination", A002.toString());
        r4.A0A("website_url", str5);
        r4.A0A("audience_id", str);
        r4.A06(C23657AWu.class, false);
        C17850qu A032 = r4.A03();
        A032.A00 = cBz;
        cd8.A09.schedule(A032);
    }

    public final void Aqn() {
        C31221Wz r1 = this.A09;
        if (r1 != null) {
            r1.A0F(new CDG());
        }
        this.A02.A03(false);
    }

    public static void A01(CDB cdb, int i) {
        AnonymousClass5F9.A03(cdb.getActivity(), cdb.getString(i), 0);
    }

    public final void BGX(CDA cda, Integer num) {
        C31221Wz r0;
        switch (num.intValue()) {
            case C120125Dh.VIEW_TYPE_BANNER:
                this.A01.A03(this.A0B);
                AnonymousClass0ZA.A0E(new Handler(), new AnonymousClass6PT(this), -1429635091);
                AnonymousClass2TI r02 = this.A07;
                if (r02 != null) {
                    r02.A04();
                }
                if (!AnonymousClass0OX.A00(this.A04.A0k)) {
                    CDD cdd = this.A03;
                    List list = this.A04.A0k;
                    C27481CEx cEx = this.A05;
                    cdd.A01 = list;
                    cdd.A00 = cEx;
                    cdd.notifyDataSetChanged();
                    return;
                }
                return;
            case C120125Dh.VIEW_TYPE_SPINNER:
                C31221Wz r03 = this.A09;
                if (r03 != null) {
                    r03.A0B();
                }
                A02(this, this.A04.A0E);
                return;
            case C120125Dh.VIEW_TYPE_BADGE:
                this.A01.A02(new C27405CBy(this));
                return;
            case C120125Dh.VIEW_TYPE_LINK:
                if (this.A06.A05 && (r0 = this.A09) != null) {
                    r0.A0B();
                }
                A04(this.A04.A0E);
                return;
            case 15:
                if (!AnonymousClass0OX.A00(this.A04.A0j)) {
                    for (C27481CEx A042 : this.A04.A0j) {
                        A04(A042);
                    }
                }
                this.A04.A0j = null;
                return;
            default:
                return;
        }
    }

    public final void configureActionBar(AnonymousClass1EX r2) {
        r2.BlI(C0003R.string.promote_saved_settings_screen_title);
        r2.Bg9(C0003R.C0004drawable.instagram_x_outline_24);
    }

    public final C06590Pq getSession() {
        return this.A08;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0Z0.A02(-1012005499);
        View inflate = layoutInflater.inflate(C0003R.layout.promote_saved_settings_view, viewGroup, false);
        AnonymousClass0Z0.A09(-2127088364, A022);
        return inflate;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0Z0.A02(1731418966);
        super.onDestroyView();
        CCZ.A03(this.A04, C27398CBr.QUICK_PROMOTE_SAVE_SETTING);
        this.A00 = null;
        this.A02 = null;
        this.A0A = null;
        AnonymousClass0Z0.A09(794394504, A022);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x00c9, code lost:
        if (p000X.CDV.A06(r8.A05) == false) goto L_0x00cb;
     */
    public final void onViewCreated(View view, Bundle bundle) {
        boolean z;
        FragmentActivity activity = getActivity();
        AnonymousClass0a4.A06(activity);
        this.A04 = ((C945346y) activity).AT6();
        AnonymousClass0a4.A06(activity);
        CDA AT7 = ((CC9) activity).AT7();
        this.A06 = AT7;
        AT7.A0C(this);
        CD3 cd3 = this.A04;
        cd3.A0v = true;
        AnonymousClass0C1 r2 = cd3.A0Q;
        this.A08 = r2;
        this.A01 = new CD8(r2, getActivity(), this);
        Context context = getContext();
        AnonymousClass0a4.A06(context);
        this.A09 = C31201Wx.A01(context);
        ((BaseFragmentActivity) getActivity()).A0U();
        View inflate = ((ViewStub) view.findViewById(C0003R.C0005id.main_container_stub)).inflate();
        this.A0A = (SpinnerImageView) inflate.findViewById(C0003R.C0005id.recycler_view_loading_spinner);
        this.A00 = (RecyclerView) inflate.findViewById(C0003R.C0005id.settings_recycler_view);
        List list = this.A04.A0k;
        AnonymousClass0a4.A06(list);
        if (this.A05 == null) {
            A00(this);
        }
        CDD cdd = new CDD(new C27480CEw(this, list), this.A04, this.A06, getActivity());
        this.A03 = cdd;
        this.A00.setAdapter(cdd);
        CDD cdd2 = this.A03;
        C27481CEx cEx = this.A05;
        cdd2.A01 = list;
        cdd2.A00 = cEx;
        cdd2.notifyDataSetChanged();
        C27434CDc cDc = new C27434CDc(inflate, C27398CBr.QUICK_PROMOTE_SAVE_SETTING);
        this.A02 = cDc;
        cDc.A00();
        C27433CDb.A01(this.A02, this, getActivity(), this.A08, this.A04, true);
        C27434CDc cDc2 = this.A02;
        if (this.A04.A05()) {
            z = true;
        }
        z = false;
        cDc2.A02(z);
        CCZ.A04(this.A04, C27398CBr.QUICK_PROMOTE_SAVE_SETTING);
        super.onViewCreated(view, bundle);
    }
}
