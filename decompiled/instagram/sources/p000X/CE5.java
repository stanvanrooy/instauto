package p000X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.facebook.C0003R;
import com.google.common.collect.ImmutableList;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.common.p004ui.base.IgCheckBox;
import com.instagram.common.p004ui.base.IgTextView;
import com.instagram.p009ui.widget.rangeseekbar.RangeSeekBar;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.CE5 */
public final class CE5 extends C27341Hl implements AnonymousClass1HM, C27516CGg {
    public int A00 = 65;
    public int A01 = 13;
    public C27513CGd A02;
    public CD3 A03;
    public CDA A04;
    public IgCheckBox A05;
    public IgCheckBox A06;
    public IgTextView A07;
    public IgTextView A08;
    public RangeSeekBar A09;
    public List A0A;
    public CD8 A0B;
    public C26915Bue A0C;
    public CDW A0D;
    public AnonymousClass0C1 A0E;

    public final void BGX(CDA cda, Integer num) {
    }

    public final String getModuleName() {
        return "promote_age_gender";
    }

    public final boolean isToolbarEnabled() {
        return false;
    }

    public final void onAttach(Context context) {
        this.A03 = ((C945346y) context).AT6();
        CDA AT7 = ((CC9) context).AT7();
        this.A04 = AT7;
        AT7.A0C(this);
        AnonymousClass0C1 r2 = this.A03.A0Q;
        this.A0E = r2;
        FragmentActivity activity = getActivity();
        AnonymousClass0a4.A06(activity);
        this.A0B = new CD8(r2, activity, this);
        ((BaseFragmentActivity) context).A0U();
        super.onAttach(context);
    }

    public static List A00(CE5 ce5) {
        ArrayList arrayList = new ArrayList();
        if (ce5.A06.isChecked()) {
            arrayList.add(C27485CFb.MALE);
        }
        if (ce5.A05.isChecked()) {
            arrayList.add(C27485CFb.FEMALE);
        }
        return ImmutableList.A09(arrayList);
    }

    public static void A01(CE5 ce5) {
        CDW cdw = ce5.A0D;
        C27452CDu cDu = ce5.A03.A08;
        String str = cDu.A02;
        String str2 = cDu.A03;
        cDu.A00();
        ImmutableList A012 = cDu.A01();
        ImmutableList A022 = cDu.A02();
        int i = ce5.A01;
        int i2 = ce5.A00;
        List A002 = A00(ce5);
        C27452CDu cDu2 = new C27452CDu();
        cDu2.A02 = str;
        cDu2.A03 = str2;
        cDu2.A01 = i;
        cDu2.A00 = i2;
        cDu2.A04 = A002;
        cDu2.A05 = A012;
        cDu2.A06 = A022;
        cdw.A03(cDu2);
    }

    public final void configureActionBar(AnonymousClass1EX r4) {
        r4.BlI(C0003R.string.promote_audience_gender_and_age_title);
        r4.Bg9(C0003R.C0004drawable.instagram_x_outline_24);
        C26915Bue bue = new C26915Bue(getContext(), r4);
        this.A0C = bue;
        bue.A00(Constants.A12, new CE4(this));
        this.A0C.A01(true);
    }

    public final C06590Pq getSession() {
        return this.A0E;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0Z0.A02(661134479);
        View inflate = layoutInflater.inflate(C0003R.layout.promote_age_gender_main_view, viewGroup, false);
        AnonymousClass0Z0.A09(-1852832633, A022);
        return inflate;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0Z0.A02(-1324576356);
        super.onDestroyView();
        CDW cdw = this.A0D;
        cdw.A08.A00();
        cdw.A00 = C27493CFj.A01;
        CCZ.A03(this.A03, C27398CBr.AGE_AND_GENDER_SELECTION);
        AnonymousClass0Z0.A09(42762527, A022);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.A06 = (IgCheckBox) view.findViewById(C0003R.C0005id.male_gender_option);
        this.A05 = (IgCheckBox) view.findViewById(C0003R.C0005id.female_gender_option);
        IgCheckBox igCheckBox = this.A06;
        View findViewById = view.findViewById(C0003R.C0005id.male_gender_row);
        igCheckBox.setButtonDrawable((Drawable) null);
        findViewById.setOnClickListener(new CFV(this, igCheckBox));
        IgCheckBox igCheckBox2 = this.A05;
        View findViewById2 = view.findViewById(C0003R.C0005id.female_gender_row);
        igCheckBox2.setButtonDrawable((Drawable) null);
        findViewById2.setOnClickListener(new CFV(this, igCheckBox2));
        this.A09 = (RangeSeekBar) view.findViewById(C0003R.C0005id.age_range_seekbar);
        this.A08 = (IgTextView) view.findViewById(C0003R.C0005id.age_min_text);
        this.A07 = (IgTextView) view.findViewById(C0003R.C0005id.age_max_text);
        CD3 cd3 = this.A03;
        C27452CDu cDu = cd3.A08;
        RangeSeekBar rangeSeekBar = this.A09;
        rangeSeekBar.A05 = 3;
        float f = 13.0f;
        if (cd3.A0D == CCN.A02) {
            f = 18.0f;
        }
        if (f < 65.0f) {
            rangeSeekBar.A02 = f;
            rangeSeekBar.A00 = 65.0f;
            rangeSeekBar.A01 = 65.0f + ((float) 3);
            if (Float.isNaN(rangeSeekBar.A04) && Float.isNaN(rangeSeekBar.A03)) {
                rangeSeekBar.A04 = f;
                rangeSeekBar.A03 = 65.0f;
            }
            boolean z = false;
            if (rangeSeekBar.A04 < f) {
                rangeSeekBar.A04 = f;
                z = true;
            }
            if (rangeSeekBar.A03 > 65.0f) {
                rangeSeekBar.A03 = 65.0f;
                z = true;
            }
            if (z) {
                rangeSeekBar.invalidate();
                RangeSeekBar.A01(rangeSeekBar);
            }
            AnonymousClass0a4.A07(cDu, "Audience info should never be null during the sub flow");
            ImmutableList A002 = cDu.A00();
            this.A0A = A002;
            if (A002 == null) {
                this.A0A = C27452CDu.A07.A00();
            }
            this.A06.setChecked(this.A0A.contains(C27485CFb.MALE));
            this.A05.setChecked(this.A0A.contains(C27485CFb.FEMALE));
            int i = cDu.A01;
            this.A01 = i;
            int i2 = cDu.A00;
            this.A00 = i2;
            if (this.A03.A0D == CCN.A02) {
                this.A01 = Math.max(18, i);
            }
            RangeSeekBar rangeSeekBar2 = this.A09;
            float f2 = (float) this.A01;
            float f3 = (float) i2;
            if (f2 >= rangeSeekBar2.A02 && f3 <= rangeSeekBar2.A00 && f2 <= f3) {
                rangeSeekBar2.A04 = f2;
                rangeSeekBar2.A03 = f3;
                rangeSeekBar2.invalidate();
                RangeSeekBar.A01(rangeSeekBar2);
            }
            this.A08.setText(String.valueOf(this.A01));
            this.A07.setText(String.valueOf(this.A00));
            this.A02 = new C27513CGd(this);
            view.addOnLayoutChangeListener(new C27509CFz(this));
            this.A09.A07 = new C27487CFd(this);
            C27398CBr cBr = C27398CBr.AGE_AND_GENDER_SELECTION;
            this.A0D = new CDW(cBr, view.findViewById(C0003R.C0005id.audience_potential_reach_view), this.A03, this.A0B);
            A01(this);
            CCZ.A04(this.A03, cBr);
            return;
        }
        throw new IllegalArgumentException("Minimum seekbar value equal or greater than maximum value");
    }
}
