package com.instagram.business.p015ui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.C0003R;
import com.facebook.phonenumbers.PhoneNumberUtil;
import com.instagram.igds.components.switchbutton.IgSwitch;
import com.instagram.model.business.Address;
import com.instagram.model.business.BusinessInfo;
import com.instagram.model.business.PublicPhoneContact;
import com.instagram.p009ui.widget.editphonenumber.EditPhoneNumberView;
import com.instagram.phonenumber.model.CountryCodeData;
import p000X.AnonymousClass000;
import p000X.Constants;
import p000X.AnonymousClass0C1;
import p000X.AnonymousClass1AM;
import p000X.AnonymousClass1BA;
import p000X.AnonymousClass1HD;
import p000X.AnonymousClass38B;
import p000X.AnonymousClass3M1;
import p000X.C019000b;
import p000X.C114104vN;
import p000X.C134375oQ;
import p000X.C1407760c;
import p000X.C1407860d;
import p000X.C1407960e;
import p000X.C1408060f;
import p000X.C1408160g;
import p000X.C1408260h;
import p000X.C1408360i;
import p000X.C1408460j;
import p000X.C155016jf;
import p000X.C26771Ff;
import p000X.C53912Uz;

/* renamed from: com.instagram.business.ui.BusinessInfoSectionView */
public class BusinessInfoSectionView extends LinearLayout {
    public CompoundButton A00;
    public TextView A01;
    public TextView A02;
    public TextView A03;
    public TextView A04;
    public EditPhoneNumberView A05;
    public String A06;
    public boolean A07;
    public TextWatcher A08;
    public TextWatcher A09;
    public View A0A;
    public View A0B;
    public View A0C;
    public View A0D;
    public View A0E;
    public ViewGroup A0F;
    public ViewGroup A0G;
    public ViewGroup A0H;
    public EditText A0I;
    public TextView A0J;
    public TextView A0K;
    public TextView A0L;
    public TextView A0M;
    public TextView A0N;
    public TextView A0O;
    public boolean A0P;
    public boolean A0Q;

    public final void A05(AnonymousClass0C1 r6, boolean z, boolean z2, String str, String str2) {
        if (AnonymousClass38B.A00(r6, false)) {
            this.A0H.setVisibility(8);
            this.A0G.setVisibility(8);
            this.A0N.setText(C0003R.string.people_contact_from_profile_with_optional_contact);
        } else if (z) {
            this.A0F.setVisibility(8);
            if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
                this.A0H.setVisibility(0);
                this.A0G.setVisibility(8);
            } else {
                ((TextView) this.A0G.findViewById(C0003R.C0005id.row_title)).setText(getContext().getString(C0003R.string.contact_options_ix_action, new Object[]{str}));
                ((TextView) this.A0G.findViewById(C0003R.C0005id.row_subtitle)).setText(str2);
                this.A0H.setVisibility(8);
                this.A0G.setVisibility(0);
            }
            this.A0N.setText(C0003R.string.contact_from_new_button_ix);
        } else if (!TextUtils.isEmpty(str2)) {
            this.A0F.setVisibility(0);
            this.A0H.setVisibility(8);
            this.A0G.setVisibility(8);
            this.A00.setChecked(z2);
            this.A0N.setText(C0003R.string.contact_from_new_button);
        }
    }

    private void A01(Drawable drawable) {
        if (drawable != null) {
            drawable.mutate().setColorFilter(C26771Ff.A00(AnonymousClass1BA.A01(getContext(), C0003R.attr.glyphColorPrimary)));
        }
    }

    public final void A02() {
        TextView textView = this.A04;
        if (textView != null) {
            textView.setOnClickListener((View.OnClickListener) null);
        }
        this.A0K.setOnClickListener((View.OnClickListener) null);
        this.A0I.removeTextChangedListener(this.A08);
        this.A08 = null;
        EditPhoneNumberView editPhoneNumberView = this.A05;
        editPhoneNumberView.A01.removeTextChangedListener(this.A09);
        this.A09 = null;
    }

    public final void A03(Address address) {
        TextView textView;
        if (address == null || TextUtils.isEmpty(address.A03)) {
            this.A0K.setTextColor(C019000b.A00(getContext(), C0003R.color.grey_5));
            this.A0K.setText(getResources().getString(C0003R.string.business_signup_address_hint));
            return;
        }
        if (this.A0P && (textView = this.A0J) != null) {
            textView.setVisibility(0);
        }
        this.A0K.setText(address.A03);
    }

    public final boolean A07() {
        boolean equals;
        if (this.A07) {
            equals = TextUtils.isEmpty(this.A05.getPhone());
        } else {
            equals = this.A06.equals(this.A04.getText().toString());
        }
        if (!equals || !A06() || !TextUtils.isEmpty(getEmail())) {
            return false;
        }
        return true;
    }

    public boolean getCallToActionEnabled() {
        return this.A00.isChecked();
    }

    public String getCountryCode() {
        return this.A05.A04.getCountryCodeWithoutPlus();
    }

    public String getEmail() {
        return this.A0I.getText().toString();
    }

    public String getNationalNumber() {
        return this.A05.getPhone();
    }

    public String getPhoneNumber() {
        return this.A05.getPhoneNumber();
    }

    public PublicPhoneContact getSubmitPublicPhoneContact() {
        if (!TextUtils.isEmpty(this.A05.getPhone())) {
            return new PublicPhoneContact(getCountryCode(), this.A05.getPhone(), this.A05.getPhoneNumber(), C155016jf.A00(Constants.ONE));
        }
        return null;
    }

    public void setBottomText(String str) {
        this.A0L.setText(str);
    }

    public void setBusinessInfo(AnonymousClass0C1 r12, BusinessInfo businessInfo, AnonymousClass1HD r14, boolean z, boolean z2, boolean z3, boolean z4, C1408360i r19) {
        this.A0Q = z4;
        this.A0I.setText(businessInfo.A09);
        this.A05.setHint(C0003R.string.business_signup_phone_hint);
        EditText editText = this.A0I;
        if (editText != null && this.A0Q) {
            editText.setHint(C0003R.string.business_email);
        }
        this.A07 = z;
        AnonymousClass1HD r7 = r14;
        A04(businessInfo.A01, r14.getContext());
        C1408360i r8 = r19;
        AnonymousClass0C1 r5 = r12;
        if (this.A07) {
            EditPhoneNumberView.A01(this.A05, r5, (AnonymousClass1AM) null, r7, r8, (C114104vN) null, (C53912Uz) null);
        } else {
            this.A05.setVisibility(8);
            this.A04.setVisibility(0);
            this.A0D.setVisibility(0);
        }
        if (z3) {
            A03(businessInfo.A00);
        } else {
            TextView textView = this.A0K;
            if (textView != null) {
                textView.setVisibility(8);
            }
            TextView textView2 = this.A0J;
            if (textView2 != null) {
                textView2.setVisibility(8);
            }
            View view = this.A0A;
            if (view != null) {
                view.setVisibility(8);
            }
        }
        if (AnonymousClass38B.A00(r12, false) || (TextUtils.isEmpty(businessInfo.A03) && TextUtils.isEmpty(businessInfo.A0C) && TextUtils.isEmpty(businessInfo.A05))) {
            this.A0F.setVisibility(8);
            this.A0B.setVisibility(8);
        } else {
            this.A0F.setVisibility(0);
            this.A00.setChecked(businessInfo.A0G);
            this.A0B.setVisibility(0);
        }
        C1407960e r2 = new C1407960e(this, r8);
        this.A0O.setOnClickListener(r2);
        this.A0G.setOnClickListener(r2);
        String str = businessInfo.A0D;
        String str2 = businessInfo.A0B;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            str = businessInfo.A04;
            str2 = businessInfo.A06;
        }
        A05(r5, z2, businessInfo.A0G, str2, str);
    }

    public void setBusinessInfoListeners(C1408360i r3) {
        TextView textView;
        C1407760c r1 = new C1407760c(this, r3);
        this.A08 = r1;
        this.A0I.addTextChangedListener(r1);
        this.A0I.setOnFocusChangeListener(new C1408460j(this, r3));
        C1407860d r12 = new C1407860d(this, r3);
        this.A09 = r12;
        this.A05.A01.addTextChangedListener(r12);
        if (!this.A07 && (textView = this.A04) != null) {
            textView.setOnClickListener(new C1408060f(this, r3));
        }
        this.A0K.setOnClickListener(new C1408160g(this, r3));
        this.A00.setOnCheckedChangeListener(new C1408260h(this, r3));
    }

    public void setContactInfoStyle(boolean z) {
        View view;
        int i;
        this.A0P = z;
        if (z) {
            view = this.A0E;
            i = C0003R.C0005id.conversion_editable_contact_info_container;
        } else {
            view = this.A0E;
            i = C0003R.C0005id.default_contact_info_view_container;
        }
        ((ViewStub) view.findViewById(i)).inflate();
        this.A0I = (EditText) this.A0E.findViewById(C0003R.C0005id.email);
        this.A0K = (TextView) this.A0E.findViewById(C0003R.C0005id.address);
        this.A0A = this.A0E.findViewById(C0003R.C0005id.address_divider);
        this.A05 = (EditPhoneNumberView) this.A0E.findViewById(C0003R.C0005id.phone_number_edit_view);
        if (this.A0P) {
            this.A0J = (TextView) this.A0E.findViewById(C0003R.C0005id.address_label);
            this.A05.A03.setVisibility(0);
            this.A0C.setVisibility(8);
            this.A0L.setVisibility(8);
        } else {
            this.A04 = (TextView) this.A0E.findViewById(C0003R.C0005id.phone_number_text_view);
            this.A0D = this.A0E.findViewById(C0003R.C0005id.phone_number_text_divider);
        }
        TextView textView = (TextView) this.A0E.findViewById(C0003R.C0005id.email_inline_error_message);
        this.A02 = textView;
        textView.setText(C0003R.string.please_enter_a_valid_email_address);
        TextView textView2 = (TextView) this.A0E.findViewById(C0003R.C0005id.phone_inline_error_message);
        this.A03 = textView2;
        textView2.setText(C0003R.string.phone_inline_error_message);
        TextView textView3 = (TextView) this.A0E.findViewById(C0003R.C0005id.bottom_inline_error_message);
        this.A01 = textView3;
        textView3.setText(C0003R.string.please_fill_one_form_of_contact);
        A01(this.A0I.getCompoundDrawables()[0]);
        A01(this.A0K.getCompoundDrawables()[0]);
        TextView textView4 = this.A04;
        if (textView4 != null) {
            A01(textView4.getCompoundDrawables()[0]);
        }
    }

    public void setCountryCode(CountryCodeData countryCodeData) {
        this.A05.setCountryCodeWithCountryPrefix(countryCodeData);
    }

    public void setCtaLabel(String str) {
        this.A0M.setText(str);
    }

    private void A00(Context context) {
        View inflate = LayoutInflater.from(context).inflate(C0003R.layout.layout_business_info_section, this);
        this.A0E = inflate;
        this.A06 = "";
        this.A0L = (TextView) inflate.findViewById(C0003R.C0005id.bottom_text);
        this.A0F = (ViewGroup) this.A0E.findViewById(C0003R.C0005id.book_switch_container);
        this.A00 = (IgSwitch) this.A0E.findViewById(C0003R.C0005id.book_switch);
        this.A0B = this.A0E.findViewById(C0003R.C0005id.book_switch_divider);
        this.A0M = (TextView) this.A0E.findViewById(C0003R.C0005id.cta_label);
        this.A0H = (ViewGroup) this.A0E.findViewById(C0003R.C0005id.ix_self_serve_container);
        this.A0O = (TextView) this.A0E.findViewById(C0003R.C0005id.ix_self_serve_label);
        this.A0G = (ViewGroup) this.A0E.findViewById(C0003R.C0005id.ix_self_serve_partner);
        this.A0N = (TextView) this.A0E.findViewById(C0003R.C0005id.bottom_text);
        this.A0C = this.A0E.findViewById(C0003R.C0005id.bottom_divider);
    }

    public final void A04(PublicPhoneContact publicPhoneContact, Context context) {
        String str;
        CountryCodeData A002 = AnonymousClass3M1.A00(context);
        String str2 = A002.A01;
        if (publicPhoneContact != null) {
            str2 = publicPhoneContact.A01;
            if (str2 != null && !str2.isEmpty()) {
                if (TextUtils.isEmpty(str2)) {
                    A002 = AnonymousClass3M1.A00(context);
                } else {
                    int parseInt = Integer.parseInt(str2);
                    A002 = new CountryCodeData(parseInt, PhoneNumberUtil.A01(context).A0H(parseInt));
                }
                str2 = AnonymousClass000.A0E("+", str2);
            }
            str = publicPhoneContact.A02;
        } else {
            str = null;
        }
        if (this.A07) {
            this.A05.setupEditPhoneNumberView(A002, str);
        } else if (!TextUtils.isEmpty(str)) {
            this.A04.setText(AnonymousClass000.A0J(str2, " ", C134375oQ.A02(str, (String) null)));
        } else {
            Context context2 = getContext();
            String string = context2.getString(C0003R.string.business_signup_phone_hint);
            this.A06 = string;
            this.A04.setText(string);
            TextView textView = this.A04;
            getContext();
            textView.setTextColor(C019000b.A00(context2, C0003R.color.grey_5));
        }
    }

    public final boolean A06() {
        Context context = getContext();
        if (!context.getString(C0003R.string.business_signup_address_hint).equals(this.A0K.getText().toString())) {
            getContext();
            if (context.getString(C0003R.string.business_address_optional).equals(this.A0K.getText().toString())) {
                return true;
            }
            return false;
        }
        return true;
    }

    public String getAddress() {
        if (A06()) {
            return "";
        }
        return this.A0K.getText().toString();
    }

    public void setIsLdpApp(boolean z) {
    }

    public BusinessInfoSectionView(Context context) {
        super(context);
        A00(context);
    }

    public BusinessInfoSectionView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00(context);
    }
}
