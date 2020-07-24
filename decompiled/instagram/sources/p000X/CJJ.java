package p000X;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.fragment.app.FragmentActivity;
import com.facebook.C0003R;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.CJJ */
public final class CJJ extends AnonymousClass2NN implements C27600CJt, CJ3 {
    public float A00;
    public AnonymousClass2TI A01;
    public AnonymousClass0C1 A02;
    public C13300iJ A03;
    public CJN A04;
    public C146056Mg A05;
    public AnonymousClass6MW A06;
    public AnonymousClass6MX A07;
    public C27588CJh A08;
    public C27586CJf A09;
    public C27586CJf A0A;
    public String A0B;
    public String A0C;
    public String A0D;
    public String A0E;
    public List A0F;
    public List A0G;
    public boolean A0H;
    public boolean A0I;
    public C27572CIq A0J;
    public String A0K;

    public final String getModuleName() {
        return "start_frx_report_bottom_sheet";
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x002c A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:5:0x000e  */
    public static C27581CJa A01(CJJ cjj) {
        boolean z;
        List list = cjj.A0G;
        if (list != null) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    C27586CJf cJf = (C27586CJf) it.next();
                    List list2 = cJf.A04;
                    if ((list2 != null && !list2.isEmpty()) || !cJf.A02.booleanValue()) {
                        z = false;
                    }
                    if (!it.hasNext()) {
                        z = true;
                        break;
                    }
                }
            }
            z = false;
            if (z) {
                return C27581CJa.RADIO_BUTTONS;
            }
        }
        return C27581CJa.LIST;
    }

    public static void A02(CJJ cjj) {
        if (AnonymousClass6NI.A08(cjj.A07)) {
            A04(cjj, cjj.getContext(), false);
            return;
        }
        AnonymousClass6NI.A04(cjj.getActivity());
        cjj.A08.B3V();
    }

    public static void A03(CJJ cjj, Context context, C27586CJf cJf, String str, List list, String str2) {
        String str3;
        String str4 = str2;
        C27588CJh cJh = cjj.A08;
        C27586CJf cJf2 = cjj.A09;
        if (cJf2 != null) {
            str3 = cJf2.A03;
        } else {
            str3 = "did_not_select_report_tag";
        }
        cJh.B3X(str3);
        cjj.A01.A03();
        C27586CJf cJf3 = cJf;
        if (AnonymousClass6NI.A08(cjj.A07)) {
            AnonymousClass2TI r4 = cjj.A01;
            AnonymousClass0C1 r5 = cjj.A02;
            AnonymousClass2TH r3 = new AnonymousClass2TH(r5);
            r3.A0T = cjj.A0I;
            r3.A00 = cjj.A00;
            C13300iJ r6 = cjj.A03;
            String str5 = cjj.A0C;
            if (str2 == null) {
                str4 = cjj.A0E;
            }
            boolean z = false;
            if (C146056Mg.REPORT_AD_BUTTON == cjj.A05) {
                z = true;
            }
            int i = C0003R.string.hide_ad_confirmation_title;
            if (z) {
                i = C0003R.string.report_ad_confirmation_title;
            }
            String string = context.getString(i);
            boolean z2 = false;
            if (C146056Mg.REPORT_AD_BUTTON == cjj.A05) {
                z2 = true;
            }
            r4.A08(r3, CJL.A00(r5, r6, str5, str4, cJf3, string, AnonymousClass6NI.A01(context, z2)));
            return;
        }
        AnonymousClass2TI r2 = cjj.A01;
        AnonymousClass0C1 r52 = cjj.A02;
        AnonymousClass2TH r1 = new AnonymousClass2TH(r52);
        r1.A0T = cjj.A0I;
        r1.A00 = cjj.A00;
        C13300iJ r62 = cjj.A03;
        String str6 = cjj.A0C;
        if (str2 == null) {
            str4 = cjj.A0E;
        }
        r2.A08(r1, CJL.A00(r52, r62, str6, str4, cJf3, str, list));
    }

    public static void A04(CJJ cjj, Context context, boolean z) {
        String str;
        if (z) {
            C27588CJh cJh = cjj.A08;
            C27586CJf cJf = cjj.A09;
            if (cJf != null) {
                str = cJf.A03;
            } else {
                str = "did_not_select_report_tag";
            }
            cJh.B3X(str);
        } else {
            cjj.A08.B3V();
        }
        FragmentActivity activity = cjj.getActivity();
        if (activity != null) {
            cjj.A01.A03();
            AnonymousClass2TI r4 = cjj.A01;
            AnonymousClass0C1 r5 = cjj.A02;
            AnonymousClass2TH r3 = new AnonymousClass2TH(r5);
            r3.A0T = cjj.A0I;
            r3.A00 = cjj.A00;
            C13300iJ r6 = cjj.A03;
            String str2 = cjj.A0C;
            String str3 = cjj.A0E;
            boolean z2 = false;
            if (C146056Mg.REPORT_AD_BUTTON == cjj.A05) {
                z2 = true;
            }
            int i = C0003R.string.hide_ad_confirmation_title;
            if (z2) {
                i = C0003R.string.report_ad_confirmation_title;
            }
            String string = context.getString(i);
            boolean z3 = false;
            if (C146056Mg.REPORT_AD_BUTTON == cjj.A05) {
                z3 = true;
            }
            r4.A08(r3, CJL.A00(r5, r6, str2, str3, (C27586CJf) null, string, AnonymousClass6NI.A01(context, z3)));
            AnonymousClass6NI.A03(cjj.getActivity());
            return;
        }
        AnonymousClass6NI.A04(activity);
    }

    private void A05(C27586CJf cJf) {
        AnonymousClass2TI r10 = this.A01;
        AnonymousClass2TH r9 = new AnonymousClass2TH(this.A02);
        r9.A0L = getString(C0003R.string.report);
        boolean z = this.A0I;
        r9.A0T = z;
        float f = this.A00;
        r9.A00 = f;
        AnonymousClass2TI r32 = this.A01;
        AnonymousClass0C1 r31 = this.A02;
        C13300iJ r15 = this.A03;
        String str = this.A0C;
        C146056Mg r6 = this.A05;
        AnonymousClass6MW r5 = this.A06;
        AnonymousClass6MX r4 = this.A07;
        C27588CJh cJh = this.A08;
        String str2 = this.A0E;
        C27586CJf cJf2 = this.A0A;
        String string = getString(C0003R.string.ip_violation_report_page_title);
        String string2 = getString(C0003R.string.ip_violation_follow_up_action_definition);
        Context context = getContext();
        AnonymousClass6NM r12 = new AnonymousClass6NM();
        r12.A03 = new C25963BdH(context.getString(C0003R.string.ip_violation_followup_action_button_text));
        r12.A00 = AnonymousClass6NO.IP_VIOLATION_EDUCATION;
        r12.A04 = "https://help.instagram.com/contact/372592039493026?helpref=faq_content";
        boolean z2 = z;
        float f2 = f;
        AnonymousClass6MX r19 = r4;
        C27588CJh cJh2 = cJh;
        C146056Mg r17 = r6;
        AnonymousClass6MW r18 = r5;
        String str3 = str;
        AnonymousClass2TI r13 = r32;
        AnonymousClass0C1 r14 = r31;
        r10.A08(r9, A00(r13, r14, r15, str3, r17, r18, r19, cJh2, z2, f2, str2, cJf2, (List) null, string, string2, (String) null, Collections.singletonList(r12), cJf));
    }

    public final void AtT(AnonymousClass6NM r8) {
        AnonymousClass11J.A00(this.A09);
        this.A0J.A08(this, this.A0E, this.A03, this.A0C, r8.A00.name());
        AnonymousClass6NO r3 = r8.A00;
        if (!this.A09.A02.booleanValue()) {
            C12810hQ.A02(C27575CIu.A02(this.A02, this.A0E, r3.toString()));
        }
        switch (r3.ordinal()) {
            case 0:
                C27586CJf cJf = this.A09;
                AnonymousClass11J.A00(cJf);
                if ("ig_ad_ip_violation".equals(cJf.A03)) {
                    A05(cJf);
                    return;
                } else if (AnonymousClass6NI.A08(this.A07) || cJf.A02.booleanValue()) {
                    A06(cJf);
                    return;
                } else {
                    A03(this, getContext(), cJf, this.A0D, this.A0F, (String) null);
                    return;
                }
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
        this.A0J.A09(this, this.A0E, this.A03, this.A0C, r8.A00.name());
    }

    public final void BIn(C27586CJf cJf) {
        this.A0J.A0C(this, this.A0E, this.A03, this.A0C, cJf.A03);
    }

    public final void BIo(C27586CJf cJf) {
        int i;
        AnonymousClass6NI.A02(getActivity());
        C27586CJf cJf2 = cJf;
        this.A0J.A0B(this, this.A0E, this.A03, this.A0C, cJf2.A03);
        this.A09 = cJf2;
        if (this.A0A == null || this.A0H) {
            this.A0A = cJf2;
        }
        List list = cJf2.A04;
        if (list == null) {
            AnonymousClass11J.A00(this.A0A);
            if (cJf2.A02.booleanValue()) {
                CJN cjn = this.A04;
                if (cjn.A01 == C27581CJa.RADIO_BUTTONS) {
                    for (C27586CJf cJf3 : cjn.A0A) {
                        boolean equals = cJf2.equals(cJf3);
                        if (cJf3.A05 != equals) {
                            cJf3.A05 = equals;
                        }
                    }
                    CJN.A00(cjn);
                }
            } else if ("ig_ad_ip_violation".equals(cJf2.A03)) {
                A05(cJf2);
            } else {
                A06(cJf2);
                return;
            }
            AnonymousClass6NI.A03(getActivity());
            return;
        }
        C12810hQ.A02(C27575CIu.A01(this.A02, this.A0E, cJf2.A03));
        String str = cJf2.A03;
        if (!TextUtils.isEmpty(str)) {
            this.A08.B7q(str);
        }
        AnonymousClass6NI.A03(getActivity());
        AnonymousClass6MX r0 = this.A07;
        C146056Mg r5 = this.A05;
        if (AnonymousClass6NI.A08(r0)) {
            r5 = C146056Mg.REPORT_AD_BUTTON;
        }
        this.A05 = r5;
        if (C146056Mg.HIDE_AD_BUTTON == r5) {
            i = C0003R.string.hide_ad;
        } else {
            C146056Mg r02 = C146056Mg.REPORT_AD_BUTTON;
            i = C0003R.string.report;
            if (r02 == r5) {
                i = C0003R.string.report_ad;
            }
        }
        String string = getString(i);
        AnonymousClass2TI r52 = this.A01;
        AnonymousClass0C1 r6 = this.A02;
        AnonymousClass2TH r03 = new AnonymousClass2TH(r6);
        r03.A0L = string;
        boolean z = this.A0I;
        r03.A0T = z;
        float f = this.A00;
        r03.A00 = f;
        C13300iJ r7 = this.A03;
        String str2 = this.A0C;
        C146056Mg r9 = this.A05;
        AnonymousClass6MW r10 = this.A06;
        AnonymousClass6MX r11 = this.A07;
        C27588CJh cJh = this.A08;
        String str3 = this.A0E;
        C27586CJf cJf4 = this.A0A;
        C27586CJf cJf5 = cJf4;
        r52.A08(r03, A00(r52, r6, r7, str2, r9, r10, r11, cJh, z, f, str3, cJf5, list, cJf2.A00.A00, this.A0B, (String) null, (List) null, (C27586CJf) null));
    }

    private void A06(C27586CJf cJf) {
        Context context = getContext();
        C17850qu A032 = C27575CIu.A03(this.A02, this.A0E, C17440qF.A00(context), cJf.A03, (AnonymousClass7RN) null, (Integer) null, (String) null, (String) null);
        A032.A00 = new CJO(this, context, cJf);
        C12810hQ.A02(A032);
    }

    public final C06590Pq getSession() {
        return this.A02;
    }

    public final void onCreate(Bundle bundle) {
        int i;
        int A022 = AnonymousClass0Z0.A02(-1855953408);
        super.onCreate(bundle);
        if (bundle != null) {
            AnonymousClass6NI.A04(getActivity());
            i = -734685044;
        } else {
            Bundle bundle2 = this.mArguments;
            AnonymousClass11J.A00(bundle2);
            AnonymousClass0C1 A062 = AnonymousClass0J1.A06(bundle2);
            this.A02 = A062;
            this.A0J = C27572CIq.A00(A062);
            this.A0C = bundle2.getString("StartFRXReportBottomSheetFragment.ARG_CONTENT_ID");
            this.A0E = bundle2.getString("StartFRXReportBottomSheetFragment.ARG_FRX_CONTEXT");
            this.A05 = (C146056Mg) bundle2.getSerializable("StartFRXReportBottomSheetFragment.ARG_FRX_ENTRY_POINT");
            this.A06 = (AnonymousClass6MW) bundle2.getSerializable("StartFRXReportBottomSheetFragment.ARG_FRX_LOCATION");
            this.A07 = (AnonymousClass6MX) bundle2.getSerializable("StartFRXReportBottomSheetFragment.ARG_FRX_OBJECT_TYPE");
            this.A0K = bundle2.getString("StartFRXReportBottomSheetFragment.ARG_BOTTOM_SHEET_TITLE_TEXT");
            this.A0B = bundle2.getString("StartFRXReportBottomSheetFragment.ARG_BOTTOM_SHEET_SUBTITLE_TEXT");
            this.A0D = bundle2.getString("StartFRXReportBottomSheetFragment.ARG_FOLLOWUP_ACTIONS_TITLE");
            this.A0I = bundle2.getBoolean("StartFRXReportBottomSheetFragment.ARG_IS_FULL_SCREEN_ENABLED");
            this.A00 = bundle2.getFloat("StartFRXReportBottomSheetFragment.ARG_INITIAL_OPENING_HEIGHT_RATIO");
            CJN cjn = new CJN(getContext(), this, this, this.A05, this.A0I);
            this.A04 = cjn;
            setListAdapter(cjn);
            List list = this.A0G;
            if (list == null && this.A0F == null) {
                boolean A002 = C17440qF.A00(getContext());
                AnonymousClass0C1 r6 = this.A02;
                String moduleName = getModuleName();
                String str = this.A0C;
                C146056Mg r3 = this.A05;
                AnonymousClass6MW r1 = this.A06;
                AnonymousClass6MX r0 = this.A07;
                C15890nh A003 = C27575CIu.A00(r6, moduleName, r3, r1);
                A003.A09("object_type", r0.toString());
                A003.A09("object_id", str);
                A003.A0C("is_dark_mode", A002);
                C17850qu A032 = A003.A03();
                A032.A00 = new CJQ(this);
                C12810hQ.A02(A032);
            } else {
                this.A04.A01(this.A0K, this.A0B, list, this.A0F, this.A0A, A01(this));
            }
            this.A0J.A07(this, this.A0E, this.A03, this.A0C);
            i = 2025574461;
        }
        AnonymousClass0Z0.A09(i, A022);
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0Z0.A02(1178354381);
        super.onDestroy();
        List<C27586CJf> list = this.A0G;
        if (list != null) {
            for (C27586CJf cJf : list) {
                cJf.A05 = false;
            }
        }
        AnonymousClass0Z0.A09(-1796027109, A022);
    }

    public static CJJ A00(AnonymousClass2TI r4, AnonymousClass0C1 r5, C13300iJ r6, String str, C146056Mg r8, AnonymousClass6MW r9, AnonymousClass6MX r10, C27588CJh cJh, boolean z, float f, String str2, C27586CJf cJf, List list, String str3, String str4, String str5, List list2, C27586CJf cJf2) {
        CJJ cjj = new CJJ();
        Bundle bundle = new Bundle();
        bundle.putString("IgSessionManager.SESSION_TOKEN_KEY", r5.getToken());
        bundle.putString("StartFRXReportBottomSheetFragment.ARG_CONTENT_ID", str);
        bundle.putSerializable("StartFRXReportBottomSheetFragment.ARG_FRX_ENTRY_POINT", r8);
        bundle.putSerializable("StartFRXReportBottomSheetFragment.ARG_FRX_LOCATION", r9);
        bundle.putSerializable("StartFRXReportBottomSheetFragment.ARG_FRX_OBJECT_TYPE", r10);
        bundle.putString("StartFRXReportBottomSheetFragment.ARG_FRX_CONTEXT", str2);
        bundle.putString("StartFRXReportBottomSheetFragment.ARG_BOTTOM_SHEET_TITLE_TEXT", str3);
        bundle.putString("StartFRXReportBottomSheetFragment.ARG_BOTTOM_SHEET_SUBTITLE_TEXT", str4);
        bundle.putString("StartFRXReportBottomSheetFragment.ARG_FOLLOWUP_ACTIONS_TITLE", str5);
        bundle.putBoolean("StartFRXReportBottomSheetFragment.ARG_IS_FULL_SCREEN_ENABLED", z);
        bundle.putFloat("StartFRXReportBottomSheetFragment.ARG_INITIAL_OPENING_HEIGHT_RATIO", f);
        cjj.setArguments(bundle);
        cjj.A03 = r6;
        cjj.A01 = r4;
        cjj.A08 = cJh;
        cjj.A0A = cJf;
        cjj.A0G = list;
        cjj.A0F = list2;
        cjj.A09 = cJf2;
        return cjj;
    }
}
