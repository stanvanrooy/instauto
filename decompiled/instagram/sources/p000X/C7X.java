package p000X;

import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.C0003R;
import com.instagram.p009ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;

/* renamed from: X.C7X */
public final class C7X extends C27341Hl implements C27371Ho, AnonymousClass1HM {
    public int A00;
    public AnonymousClass0C1 A01;
    public COP A02;
    public C27286C7a A03;
    public C13300iJ A04;
    public TextView A05;
    public final C27286C7a A06 = new C7Z(this);

    public final boolean Ago() {
        return true;
    }

    public final boolean Ahq() {
        return false;
    }

    public final String getModuleName() {
        return "product_tagging_shopping_partner_details";
    }

    public final boolean isToolbarEnabled() {
        return false;
    }

    public static void A00(C7X c7x) {
        if (c7x.A00 == 0) {
            c7x.A05.setVisibility(8);
            return;
        }
        c7x.A05.setVisibility(0);
        c7x.A05.setText(String.format(C15300mf.A03(), "%d", new Object[]{Integer.valueOf(c7x.A00)}));
    }

    public final void configureActionBar(AnonymousClass1EX r2) {
        r2.BlI(C0003R.string.add_highlighted_product_title);
        r2.Bo0(true);
        r2.Bo6(true);
    }

    public final C06590Pq getSession() {
        return this.A01;
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0Z0.A02(-1605986186);
        super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        AnonymousClass0a4.A06(bundle2);
        AnonymousClass0C1 A062 = AnonymousClass0J1.A06(bundle2);
        this.A01 = A062;
        C13300iJ A023 = C13510ie.A00(A062).A02(bundle2.getString("displayed_user_id"));
        AnonymousClass0a4.A06(A023);
        this.A04 = A023;
        this.A00 = bundle2.getInt("highlighted_products_count");
        this.A02 = new COP(this.A01, this);
        AnonymousClass0Z0.A09(1227366929, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0Z0.A02(2006584145);
        View inflate = layoutInflater.inflate(C0003R.layout.layout_shopping_partner_details_fragment, viewGroup, false);
        ViewGroup viewGroup2 = (ViewGroup) inflate.findViewById(C0003R.C0005id.row_user_container);
        TextView textView = (TextView) inflate.findViewById(C0003R.C0005id.row_user_username);
        TextView textView2 = (TextView) inflate.findViewById(C0003R.C0005id.row_user_info);
        GradientSpinnerAvatarView gradientSpinnerAvatarView = (GradientSpinnerAvatarView) inflate.findViewById(C0003R.C0005id.selectable_user_row_avatar);
        gradientSpinnerAvatarView.setGradientSpinnerVisible(false);
        C13300iJ r1 = this.A04;
        if (r1.A0s()) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(r1.AZn());
            C466820l.A02(textView.getContext(), spannableStringBuilder, true);
            textView.setText(spannableStringBuilder);
        } else {
            textView.setText(r1.AZn());
        }
        if (TextUtils.isEmpty(this.A04.AMN())) {
            textView2.setVisibility(8);
        } else {
            textView2.setText(this.A04.AMN());
            textView2.setVisibility(0);
        }
        gradientSpinnerAvatarView.A06(this.A04.ASv(), (AnonymousClass46K) null);
        viewGroup2.setOnClickListener(new C87(this));
        inflate.findViewById(C0003R.C0005id.suggest_products_button).setOnClickListener(new C7Y(this));
        inflate.findViewById(C0003R.C0005id.remove_partner_button).setOnClickListener(new C25824BaY(this));
        this.A05 = (TextView) inflate.findViewById(C0003R.C0005id.suggested_products_count);
        A00(this);
        AnonymousClass0Z0.A09(-1158241987, A022);
        return inflate;
    }
}
