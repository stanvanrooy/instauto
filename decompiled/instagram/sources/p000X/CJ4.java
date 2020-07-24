package p000X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.C0003R;
import com.instagram.common.p004ui.base.IgTextView;
import com.instagram.igds.components.bottombutton.IgBottomButtonLayout;
import java.util.Collections;
import java.util.List;

/* renamed from: X.CJ4 */
public final class CJ4 extends AnonymousClass2NN implements AnonymousClass0RN, C51312Ke, CJ3 {
    public IgTextView A00;
    public IgBottomButtonLayout A01;
    public AnonymousClass2TI A02;
    public AnonymousClass0C1 A03;
    public CIh A04;
    public CJ5 A05;

    public final boolean AhU() {
        return true;
    }

    public final void AtV() {
    }

    public final String getModuleName() {
        return "start_frx_report_v2_bottom_sheet";
    }

    public final void A00(boolean z) {
        if (z) {
            AnonymousClass6NI.A03(getActivity());
        } else {
            AnonymousClass6NI.A02(getActivity());
        }
    }

    public final void AtY(int i, int i2) {
        IgTextView igTextView = this.A00;
        if (igTextView != null) {
            igTextView.setTranslationY((float) ((-i) - i2));
        }
        IgBottomButtonLayout igBottomButtonLayout = this.A01;
        if (igBottomButtonLayout != null) {
            igBottomButtonLayout.setTranslationY((float) ((-i) - i2));
        }
    }

    public final void BIn(C27586CJf cJf) {
        CJ5 cj5 = this.A05;
        AnonymousClass0a4.A06(cj5);
        cj5.A05.A0C(cj5.A06, cj5.A02, cj5.A04, cj5.A0D, cJf.A03);
    }

    public final void BIo(C27586CJf cJf) {
        CJ5 cj5 = this.A05;
        AnonymousClass0a4.A06(cj5);
        Context context = getContext();
        cj5.A06.A00(false);
        AnonymousClass0C1 r3 = cj5.A03;
        String str = cj5.A02;
        AnonymousClass0a4.A06(str);
        C27586CJf cJf2 = cJf;
        schedule(C27575CIu.A01(r3, str, cJf2.A03));
        cj5.A05.A0B(cj5.A06, cj5.A02, cj5.A04, cj5.A0D, cJf2.A03);
        C27578CIx cIx = cj5.A0C;
        if (cIx == null || cIx.A00.A09 != C27581CJa.RADIO_BUTTONS) {
            CJ5.A03(cj5, this, context, cj5.A01, cj5.A02, cJf2, (AnonymousClass7RN) null);
            return;
        }
        cj5.A00 = cJf2;
        CIh cIh = cj5.A06.A04;
        for (C27586CJf cJf3 : cIh.A03) {
            boolean equals = cJf2.equals(cJf3);
            if (cJf3.A05 != equals) {
                cJf3.A05 = equals;
            }
        }
        CIh.A00(cIh);
        IgBottomButtonLayout igBottomButtonLayout = cj5.A06.A01;
        if (igBottomButtonLayout != null) {
            igBottomButtonLayout.setPrimaryButtonEnabled(true);
        }
        cj5.A06.A00(true);
    }

    public final C06590Pq getSession() {
        return this.A03;
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0Z0.A02(-167596311);
        super.onCreate(bundle);
        if (bundle != null) {
            AnonymousClass6NI.A04(getActivity());
        } else {
            this.A03 = AnonymousClass0J1.A06(requireArguments());
            CIh cIh = new CIh(getContext(), this, this);
            this.A04 = cIh;
            setListAdapter(cIh);
            CJ5 cj5 = this.A05;
            cj5.A05.A07(cj5.A06, cj5.A02, cj5.A04, cj5.A0D);
        }
        AnonymousClass0Z0.A09(-284643879, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0Z0.A02(-1269807505);
        View inflate = layoutInflater.inflate(C0003R.layout.frx_report_fragment, viewGroup, false);
        AnonymousClass0Z0.A09(-1905935920, A022);
        return inflate;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0Z0.A02(-1515522208);
        super.onDestroyView();
        this.A01 = null;
        this.A00 = null;
        AnonymousClass0Z0.A09(-1005747008, A022);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C17850qu A032;
        super.onViewCreated(view, bundle);
        this.A01 = (IgBottomButtonLayout) view.findViewById(C0003R.C0005id.frx_report_action_button);
        this.A00 = (IgTextView) view.findViewById(C0003R.C0005id.frx_footer_view);
        CJ5 cj5 = this.A05;
        AnonymousClass0a4.A06(cj5);
        Context context = getContext();
        C27578CIx cIx = cj5.A0C;
        if (cIx != null) {
            CJ4 cj4 = cj5.A06;
            CJC cjc = cIx.A00;
            C27577CIw cIw = cjc.A00;
            cj4.A02.A0C(cjc.A07.A00);
            CIh cIh = cj4.A04;
            String str = cjc.A06.A00;
            List unmodifiableList = Collections.unmodifiableList(cjc.A0G);
            C27581CJa cJa = cjc.A09;
            C26008Be2 be2 = cjc.A08;
            cIh.A02 = str;
            cIh.A03.clear();
            if (unmodifiableList != null && !unmodifiableList.isEmpty()) {
                cIh.A03.addAll(unmodifiableList);
            }
            cIh.A01 = cJa;
            cIh.A00 = be2;
            CIh.A00(cIh);
            if (cIw != null && cj4.A01 != null) {
                C06220Of.A0L(cj4.getListView(), cj4.getResources().getDimensionPixelSize(C0003R.dimen.bottom_button_layout_height));
                cj4.A01.setPrimaryAction(cIw.A01.A00, new CJ7(cj4, cIw));
                IgBottomButtonLayout igBottomButtonLayout = cj4.A01;
                boolean z = false;
                if (cjc.A09 != C27581CJa.RADIO_BUTTONS) {
                    z = true;
                }
                igBottomButtonLayout.setPrimaryButtonEnabled(z);
                cj4.A01.setVisibility(0);
                CJ5 cj52 = cj4.A05;
                AnonymousClass0a4.A06(cj52);
                cj52.A05.A0E(cj52.A02, cj52.A04, cj52.A0D, cIw.A00.name());
                return;
            }
            return;
        }
        boolean A002 = C17440qF.A00(context);
        String str2 = cj5.A0E;
        if (str2 == null) {
            AnonymousClass0C1 r7 = cj5.A03;
            String str3 = cj5.A0F;
            String str4 = cj5.A0D;
            C146056Mg r2 = cj5.A08;
            AnonymousClass6MW r1 = cj5.A09;
            AnonymousClass6MX r0 = cj5.A0A;
            C15890nh A003 = C27575CIu.A00(r7, str3, r2, r1);
            A003.A09("object_type", r0.toString());
            A003.A09("object_id", str4);
            A003.A0C("is_dark_mode", A002);
            A032 = A003.A03();
        } else {
            C15890nh A004 = C27575CIu.A00(cj5.A03, cj5.A0F, cj5.A08, cj5.A09);
            A004.A09("object", str2);
            A004.A0C("is_dark_mode", A002);
            A032 = A004.A03();
        }
        A032.A00 = new CJ6(cj5);
        schedule(A032);
    }
}
