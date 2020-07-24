package p000X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.facebook.C0003R;
import com.google.common.collect.ImmutableList;
import com.instagram.p009ui.widget.spinner.SpinnerImageView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.json.JSONArray;

/* renamed from: X.CD9 */
public final class CD9 extends C27341Hl implements AnonymousClass1HM, C27516CGg {
    public Drawable A00;
    public Drawable A01;
    public EditText A02;
    public ImageView A03;
    public TextView A04;
    public TextView A05;
    public TextView A06;
    public TextView A07;
    public TextView A08;
    public TextView A09;
    public C27398CBr A0A;
    public CD8 A0B;
    public C26915Bue A0C;
    public CDW A0D;
    public CD3 A0E;
    public CDA A0F;
    public AnonymousClass0C1 A0G;
    public SpinnerImageView A0H;
    public String A0I;
    public C26571Ea A0J;

    public final String getModuleName() {
        return "promote_create_audience";
    }

    public final boolean isToolbarEnabled() {
        return false;
    }

    public static void A00(CD9 cd9) {
        View A012 = cd9.A0J.A01();
        cd9.A0D = new CDW(cd9.A0A, A012.findViewById(C0003R.C0005id.audience_potential_reach_view), cd9.A0E, cd9.A0B);
        View findViewById = A012.findViewById(C0003R.C0005id.audience_name_row);
        cd9.A02 = (EditText) findViewById.findViewById(C0003R.C0005id.audience_input);
        ImageView imageView = (ImageView) findViewById.findViewById(C0003R.C0005id.status_icon);
        cd9.A03 = imageView;
        imageView.setImageDrawable(cd9.A01);
        cd9.A02.addTextChangedListener(new C27482CEy(cd9, (TextView) findViewById.findViewById(C0003R.C0005id.audience_input_title)));
        View findViewById2 = A012.findViewById(C0003R.C0005id.locations_row);
        cd9.A09 = (TextView) findViewById2.findViewById(C0003R.C0005id.row_title);
        cd9.A08 = (TextView) findViewById2.findViewById(C0003R.C0005id.row_subtitle);
        cd9.A09.setText(C0003R.string.promote_create_audience_locations_row_title);
        findViewById2.setOnClickListener(new C27382CBb(cd9));
        View findViewById3 = A012.findViewById(C0003R.C0005id.interests_row);
        cd9.A07 = (TextView) findViewById3.findViewById(C0003R.C0005id.row_title);
        cd9.A06 = (TextView) findViewById3.findViewById(C0003R.C0005id.row_subtitle);
        cd9.A07.setText(C0003R.string.promote_create_audience_interest_row_title);
        findViewById3.setOnClickListener(new C27381CBa(cd9));
        View findViewById4 = A012.findViewById(C0003R.C0005id.age_gender_row);
        cd9.A05 = (TextView) findViewById4.findViewById(C0003R.C0005id.row_title);
        cd9.A04 = (TextView) findViewById4.findViewById(C0003R.C0005id.row_subtitle);
        cd9.A05.setText(C0003R.string.promote_create_audience_age_gender_row_title);
        findViewById4.setOnClickListener(new C27383CBc(cd9));
    }

    public static void A01(CD9 cd9) {
        TextView textView;
        Resources resources;
        int i;
        TextView textView2;
        Resources resources2;
        int i2;
        int i3;
        C27452CDu cDu = cd9.A0E.A08;
        if (cDu.A03()) {
            cd9.A0D.A03(cDu);
        }
        String str = cd9.A0E.A08.A03;
        EditText editText = cd9.A02;
        if (str == null) {
            str = "";
        }
        editText.setText(str);
        ImmutableList A012 = cd9.A0E.A08.A01();
        if (A012 != null) {
            Context context = cd9.getContext();
            AnonymousClass11J.A04(!A012.isEmpty(), "Geolocations should never be null");
            String str2 = ((C27473CEp) A012.get(0)).A05;
            if (A012.size() > 1) {
                for (int i4 = 1; i4 < A012.size(); i4++) {
                    String str3 = ((C27473CEp) A012.get(i4)).A05;
                    int size = A012.size() - 1;
                    int i5 = C0003R.string.promote_list_with_and;
                    if (i4 < size) {
                        i5 = C0003R.string.promote_list_with_comma;
                    }
                    str2 = context.getString(i5, new Object[]{str2, str3});
                }
            }
            cd9.A08.setText(str2);
            cd9.A08.setVisibility(0);
            textView = cd9.A09;
            resources = cd9.getResources();
            i = C0003R.dimen.font_medium;
        } else {
            cd9.A08.setVisibility(8);
            textView = cd9.A09;
            resources = cd9.getResources();
            i = C0003R.dimen.font_medium_xlarge;
        }
        textView.setTextSize(0, (float) resources.getDimensionPixelSize(i));
        ImmutableList A022 = cd9.A0E.A08.A02();
        if (A022 != null) {
            Context context2 = cd9.getContext();
            String str4 = ((CG9) A022.get(0)).A01;
            if (A022.size() > 1) {
                for (int i6 = 1; i6 < A022.size(); i6++) {
                    String str5 = ((CG9) A022.get(i6)).A01;
                    int size2 = A022.size() - 1;
                    int i7 = C0003R.string.promote_list_with_or;
                    if (i6 < size2) {
                        i7 = C0003R.string.promote_list_with_comma;
                    }
                    str4 = context2.getString(i7, new Object[]{str4, str5});
                }
            }
            cd9.A06.setText(str4);
            cd9.A06.setVisibility(0);
            textView2 = cd9.A07;
            resources2 = cd9.getResources();
            i2 = C0003R.dimen.font_medium;
        } else {
            cd9.A06.setVisibility(8);
            textView2 = cd9.A07;
            resources2 = cd9.getResources();
            i2 = C0003R.dimen.font_medium_xlarge;
        }
        textView2.setTextSize(0, (float) resources2.getDimensionPixelSize(i2));
        C27452CDu cDu2 = cd9.A0E.A08;
        if (cDu2.A00() != null) {
            int i8 = cDu2.A00;
            int i9 = i8;
            if (i8 != 0) {
                int i10 = cDu2.A01;
                int i11 = i10;
                if (i10 != 0) {
                    Context context3 = cd9.getContext();
                    ImmutableList A002 = cDu2.A00();
                    Object[] objArr = new Object[3];
                    if (A002.size() > 1) {
                        i3 = C0003R.string.promote_create_audience_all_gender;
                    } else {
                        Object obj = A002.get(0);
                        C27485CFb cFb = C27485CFb.MALE;
                        i3 = C0003R.string.promote_create_audience_gender_female;
                        if (obj == cFb) {
                            i3 = C0003R.string.promote_create_audience_gender_male;
                        }
                    }
                    objArr[0] = context3.getString(i3);
                    objArr[1] = Integer.valueOf(i11);
                    objArr[2] = Integer.valueOf(i9);
                    cd9.A04.setText(context3.getString(C0003R.string.promote_create_audience_age_gender_subtitle, objArr));
                    cd9.A04.setVisibility(0);
                    cd9.A05.setTextSize(0, (float) cd9.getResources().getDimensionPixelSize(C0003R.dimen.font_medium));
                }
            }
        }
        cd9.A04.setVisibility(8);
        cd9.A05.setTextSize(0, (float) cd9.getResources().getDimensionPixelSize(C0003R.dimen.font_medium));
    }

    public final void BGX(CDA cda, Integer num) {
        if (num == Constants.A12) {
            A01(this);
            C27452CDu cDu = this.A0E.A08;
            AnonymousClass0a4.A06(cDu);
            if (cDu.A03()) {
                this.A0D.A03(cDu);
            }
        }
    }

    public final void configureActionBar(AnonymousClass1EX r4) {
        boolean z = false;
        if (this.A0A == C27398CBr.EDIT_AUDIENCE) {
            z = true;
        }
        int i = C0003R.string.promote_create_audience_screen_title;
        if (z) {
            i = C0003R.string.promote_edit_audience_screen_title;
        }
        r4.BlI(i);
        r4.Bg9(C0003R.C0004drawable.instagram_arrow_back_24);
        C26915Bue bue = new C26915Bue(getContext(), r4);
        this.A0C = bue;
        bue.A00(Constants.A12, new CDT(this));
        this.A0C.A01(true);
    }

    public final C06590Pq getSession() {
        return this.A0G;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0Z0.A02(-782613954);
        View inflate = layoutInflater.inflate(C0003R.layout.promote_create_audience_view, viewGroup, false);
        AnonymousClass0Z0.A09(313303139, A022);
        return inflate;
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0Z0.A02(2096349025);
        super.onDestroy();
        CD3 cd3 = this.A0E;
        cd3.A08 = C27452CDu.A07;
        cd3.A09.A00 = new HashMap();
        CFS cfs = cd3.A07;
        cfs.A05 = new ArrayList();
        cfs.A00 = 5;
        cfs.A01 = null;
        cfs.A02 = null;
        cfs.A03 = null;
        cfs.A04 = new ArrayList();
        AnonymousClass0Z0.A09(-1716748294, A022);
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0Z0.A02(-242143617);
        super.onDestroyView();
        this.A0F.A0D(this);
        CDW cdw = this.A0D;
        cdw.A08.A00();
        cdw.A00 = C27493CFj.A01;
        CCZ.A03(this.A0E, this.A0A);
        AnonymousClass0Z0.A09(-600267763, A022);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C27398CBr cBr;
        String str;
        C17850qu A032;
        C28351Lj r0;
        super.onViewCreated(view, bundle);
        FragmentActivity activity = getActivity();
        CD3 AT6 = ((C945346y) activity).AT6();
        this.A0E = AT6;
        this.A0F = ((CC9) activity).AT7();
        AnonymousClass0C1 r1 = AT6.A0Q;
        this.A0G = r1;
        this.A0B = new CD8(r1, activity, this);
        this.A0J = new C26571Ea((ViewStub) view.findViewById(C0003R.C0005id.main_container_stub));
        this.A0H = (SpinnerImageView) view.findViewById(C0003R.C0005id.loading_spinner);
        Drawable A033 = C019000b.A03(getContext(), C0003R.C0004drawable.instagram_error_outline_16);
        this.A01 = A033;
        A033.setColorFilter(C26771Ff.A00(C019000b.A00(getContext(), C0003R.color.igds_error_or_destructive)));
        Drawable A034 = C019000b.A03(getContext(), C0003R.C0004drawable.instagram_circle_check_outline_16);
        this.A00 = A034;
        A034.setColorFilter(C26771Ff.A00(C019000b.A00(getContext(), C0003R.color.igds_success)));
        Bundle bundle2 = this.mArguments;
        if (bundle2 == null || bundle2.getString("audienceID") == null) {
            cBr = C27398CBr.CREATE_AUDIENCE;
        } else {
            this.A0I = bundle2.getString("audienceID");
            cBr = C27398CBr.EDIT_AUDIENCE;
        }
        this.A0A = cBr;
        if (C27452CDu.A07.equals(this.A0E.A08)) {
            C27404CBx cBx = new C27404CBx(this);
            String str2 = this.A0I;
            if (str2 != null) {
                CD8 cd8 = this.A0B;
                AnonymousClass0C1 r4 = cd8.A0D;
                String str3 = cd8.A04.A0R;
                C15890nh r2 = new C15890nh(r4);
                r2.A09 = Constants.ONE;
                r2.A0C = "ads/promote/audience_edit_screen/";
                r2.A0A("audience_id", str2);
                r2.A09("fb_auth_token", str3);
                r2.A06(C27437CDf.class, false);
                A032 = r2.A03();
                A032.A00 = cBx;
                r0 = cd8.A09;
            } else if (((Boolean) AnonymousClass0L6.A02(this.A0G, AnonymousClass0L7.PROMOTE_BETTER_TARGETING, "is_manual_defaults_enabled", false, (AnonymousClass04H) null)).booleanValue()) {
                CD8 cd82 = this.A0B;
                AnonymousClass0C1 r9 = cd82.A0D;
                CD3 cd3 = cd82.A04;
                String str4 = cd3.A0R;
                String str5 = cd3.A0Z;
                CC7 cc7 = cd3.A0O;
                if (cc7 != null) {
                    str = cc7.A01;
                } else {
                    str = CC7.A06.A01;
                }
                List A012 = cd3.A01();
                CCN ccn = cd82.A04.A0D;
                AnonymousClass0a4.A06(ccn);
                C15890nh r42 = new C15890nh(r9);
                r42.A09 = Constants.ONE;
                r42.A0C = "ads/promote/audience_create_screen/";
                r42.A0A("media_id", str5);
                r42.A09("regulated_category", str);
                r42.A09("destination", ccn.toString());
                r42.A09("fb_auth_token", str4);
                r42.A06(C27437CDf.class, false);
                if (A012 != null) {
                    r42.A09("regulated_categories", new JSONArray(A012).toString());
                }
                A032 = r42.A03();
                A032.A00 = cBx;
                r0 = cd82.A09;
            }
            r0.schedule(A032);
            this.A0F.A0C(this);
            CCZ.A04(this.A0E, this.A0A);
        }
        A00(this);
        A01(this);
        this.A0F.A0C(this);
        CCZ.A04(this.A0E, this.A0A);
    }
}
