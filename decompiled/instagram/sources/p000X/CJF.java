package p000X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.C0003R;
import com.instagram.igds.components.bottombutton.IgBottomButtonLayout;
import java.util.Collections;
import java.util.List;

/* renamed from: X.CJF */
public final class CJF extends AnonymousClass2NN implements C51312Ke {
    public float A00;
    public AnonymousClass2TI A01;
    public AnonymousClass0C1 A02;
    public C13300iJ A03;
    public C27572CIq A04;
    public C27588CJh A05;
    public C27578CIx A06;
    public Integer A07;
    public String A08;
    public String A09;
    public String A0A;
    public boolean A0B;
    public IgBottomButtonLayout A0C;
    public CJY A0D;

    public final boolean AhU() {
        return true;
    }

    public final void AtV() {
    }

    public final String getModuleName() {
        return "process_education_bottom_sheet";
    }

    public final void AtY(int i, int i2) {
        IgBottomButtonLayout igBottomButtonLayout = this.A0C;
        if (igBottomButtonLayout != null) {
            igBottomButtonLayout.setTranslationY((float) ((-i) - i2));
        }
    }

    public final void onViewCreated(View view, Bundle bundle) {
        View view2 = view;
        super.onViewCreated(view2, bundle);
        this.A0C = (IgBottomButtonLayout) view2.findViewById(C0003R.C0005id.frx_report_action_button);
        CJC cjc = this.A06.A00;
        C27577CIw cIw = cjc.A00;
        this.A01.A0C(cjc.A07.A00);
        CJY cjy = this.A0D;
        String str = cjc.A0C;
        String str2 = cjc.A06.A00;
        List unmodifiableList = Collections.unmodifiableList(cjc.A0F);
        cjy.A00 = str;
        cjy.A01 = str2;
        cjy.A05.clear();
        if (unmodifiableList != null) {
            cjy.A05.addAll(unmodifiableList);
        }
        cjy.clear();
        String str3 = cjy.A00;
        if (str3 != null) {
            cjy.addModel((Object) null, new C27602CJv((Integer) null, str3, (Integer) null, Integer.valueOf(C0003R.dimen.process_education_image_height), Integer.valueOf(C0003R.dimen.row_padding), Integer.valueOf(C0003R.dimen.bottom_sheet_zero_padding), (Integer) null), cjy.A02);
        }
        String str4 = cjy.A01;
        if (str4 != null) {
            cjy.addModel(str4, new C27563CIf(true, (Integer) null, (Integer) null, (Integer) null, (Integer) null), cjy.A04);
        }
        for (C25963BdH A002 : cjy.A05) {
            cjy.addModel(A002.A00(), new C27563CIf(true, Integer.valueOf(C0003R.dimen.bottom_sheet_zero_padding), (Integer) null, (Integer) null, (Integer) null), cjy.A03);
        }
        cjy.updateListView();
        if (cIw != null && this.A0C != null) {
            C06220Of.A0L(getListView(), getResources().getDimensionPixelSize(C0003R.dimen.bottom_button_layout_height));
            this.A0C.setPrimaryAction(cIw.A01.A00, new CJI(this, cIw));
            this.A0C.setPrimaryButtonEnabled(true);
            this.A0C.setVisibility(0);
            this.A04.A0E(this.A09, this.A03, this.A08, cIw.A00.name());
        }
    }

    public final C06590Pq getSession() {
        return this.A02;
    }

    public final void onCreate(Bundle bundle) {
        int i;
        int A022 = AnonymousClass0Z0.A02(-1066464382);
        super.onCreate(bundle);
        if (bundle != null) {
            AnonymousClass6NI.A04(getActivity());
            i = 1025124726;
        } else {
            Bundle bundle2 = this.mArguments;
            AnonymousClass11J.A00(bundle2);
            AnonymousClass0C1 A062 = AnonymousClass0J1.A06(bundle2);
            this.A02 = A062;
            this.A04 = C27572CIq.A00(A062);
            this.A08 = bundle2.getString("ReportingConstants.ARG_CONTENT_ID");
            this.A0B = bundle2.getBoolean("ReportingConstants.ARG_IS_FULL_SCREEN_ENABLED");
            this.A00 = bundle2.getFloat("ReportingConstants.ARG_INITIAL_OPENING_HEIGHT_RATIO");
            CJY cjy = new CJY(getContext());
            this.A0D = cjy;
            setListAdapter(cjy);
            this.A04.A07(this, this.A09, this.A03, this.A08);
            i = -1813478544;
        }
        AnonymousClass0Z0.A09(i, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0Z0.A02(1886578961);
        View inflate = layoutInflater.inflate(C0003R.layout.frx_report_fragment, viewGroup, false);
        AnonymousClass0Z0.A09(1189559037, A022);
        return inflate;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0Z0.A02(-356566233);
        super.onDestroyView();
        this.A0C = null;
        AnonymousClass0Z0.A09(-1506519922, A022);
    }
}
