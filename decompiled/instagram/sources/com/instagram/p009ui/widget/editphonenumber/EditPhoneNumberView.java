package com.instagram.p009ui.widget.editphonenumber;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.telephony.PhoneNumberFormattingTextWatcher;
import android.telephony.PhoneNumberUtils;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.C0003R;
import com.facebook.phonenumbers.PhoneNumberUtil;
import com.facebook.react.uimanager.BaseViewManager;
import com.instagram.p009ui.widget.inlineerror.InlineErrorMessageView;
import com.instagram.phonenumber.model.CountryCodeData;
import java.util.ArrayList;
import java.util.List;
import p000X.AnonymousClass000;
import p000X.AnonymousClass0C1;
import p000X.AnonymousClass0WN;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass1AM;
import p000X.AnonymousClass1BA;
import p000X.AnonymousClass1EM;
import p000X.AnonymousClass1HD;
import p000X.AnonymousClass3M1;
import p000X.AnonymousClass5YU;
import p000X.AnonymousClass5YV;
import p000X.C114104vN;
import p000X.C114724wN;
import p000X.C114734wO;
import p000X.C114744wP;
import p000X.C114754wQ;
import p000X.C114824wY;
import p000X.C114844wa;
import p000X.C134375oQ;
import p000X.C26771Ff;
import p000X.C53912Uz;

/* renamed from: com.instagram.ui.widget.editphonenumber.EditPhoneNumberView */
public class EditPhoneNumberView extends LinearLayout {
    public ViewGroup A00;
    public EditText A01;
    public ImageView A02;
    public ImageView A03;
    public CountryCodeTextView A04;
    public InlineErrorMessageView A05;
    public boolean A06 = false;
    public AnonymousClass0C1 A07;
    public boolean A08;
    public final PhoneNumberUtil A09 = PhoneNumberUtil.A01(getContext());
    public final Runnable A0A = new AnonymousClass5YU(this);
    public final List A0B = new ArrayList();
    public final List A0C = new ArrayList();

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x003b, code lost:
        if (((java.lang.Boolean) p000X.AnonymousClass0L6.A02(r9, p000X.AnonymousClass0L7.COUNTRY_CODE_FIX, "guess", true, (p000X.AnonymousClass04H) null)).booleanValue() == false) goto L_0x003d;
     */
    public static void A01(EditPhoneNumberView editPhoneNumberView, AnonymousClass0C1 r9, AnonymousClass1AM r10, AnonymousClass1HD r11, C114734wO r12, C114104vN r13, C53912Uz r14) {
        boolean z;
        AnonymousClass0C1 r7 = r9;
        EditPhoneNumberView editPhoneNumberView2 = editPhoneNumberView;
        editPhoneNumberView.A07 = r9;
        CountryCodeData A002 = AnonymousClass3M1.A00(editPhoneNumberView.getContext());
        if (TextUtils.isEmpty(editPhoneNumberView.A04.A00)) {
            if (!"+1".equals(AnonymousClass000.A0E("+", A002.A01))) {
                z = true;
            }
            z = false;
            if (z) {
                editPhoneNumberView.setCountryCodeWithPlus(A002);
            } else {
                editPhoneNumberView.A04.setCountryCodeWithPlus("+1");
            }
        }
        C114824wY r5 = new C114824wY(editPhoneNumberView2, r7, r14, r11, r10, r12);
        editPhoneNumberView2.A04.setOnClickListener(r5);
        editPhoneNumberView2.A03.setOnClickListener(r5);
        if (editPhoneNumberView2.A08) {
            editPhoneNumberView2.A02.setOnClickListener(new C114844wa(editPhoneNumberView2));
        }
        editPhoneNumberView2.A01.setOnFocusChangeListener(new AnonymousClass5YV(editPhoneNumberView2, r12));
        editPhoneNumberView2.A01.setOnEditorActionListener(new C114754wQ(editPhoneNumberView2, r12));
        editPhoneNumberView2.A01.addTextChangedListener(new PhoneNumberFormattingTextWatcher());
        editPhoneNumberView2.A01.addTextChangedListener(new C114724wN(editPhoneNumberView2, r13, r12));
        editPhoneNumberView2.A04.addTextChangedListener(new C114744wP(editPhoneNumberView2, r12));
        AnonymousClass0WN.A01(editPhoneNumberView2.A07).Ba2(editPhoneNumberView2.A01);
    }

    public String getCountryCode() {
        return this.A04.A00;
    }

    public String getCountryCodeWithoutPlus() {
        return this.A04.getCountryCodeWithoutPlus();
    }

    public String getPhone() {
        return this.A01.getText().toString();
    }

    public String getPhoneNumber() {
        return PhoneNumberUtils.stripSeparators(AnonymousClass000.A0J(this.A04.A00, " ", getPhone()));
    }

    public void setCountryCodeWithCountryPrefix(CountryCodeData countryCodeData) {
        this.A04.setCountryCodeWithCountryPrefix(countryCodeData);
    }

    public void setCountryCodeWithPlus(CountryCodeData countryCodeData) {
        this.A04.setCountryCodeWithPlus(countryCodeData);
        this.A01.postDelayed(this.A0A, 200);
    }

    public void setHint(int i) {
        this.A01.setHint(i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0063, code lost:
        r5 = r2.getBoolean(4, false);
     */
    private void A00(Context context, AttributeSet attributeSet) {
        Context context2 = getContext();
        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(context2).inflate(C0003R.layout.layout_edit_phone_view, this);
        this.A00 = viewGroup;
        this.A04 = (CountryCodeTextView) viewGroup.findViewById(C0003R.C0005id.country_code_picker);
        this.A01 = (EditText) this.A00.findViewById(C0003R.C0005id.phone_number);
        this.A02 = (ImageView) this.A00.findViewById(C0003R.C0005id.clear_button);
        this.A03 = (ImageView) this.A00.findViewById(C0003R.C0005id.country_code_drop_down);
        this.A05 = (InlineErrorMessageView) this.A00.findViewById(C0003R.C0005id.phone_inline_error);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AnonymousClass1EM.A1C);
            boolean z = false;
            if (obtainStyledAttributes.hasValue(4) && z) {
                this.A04.setCompoundDrawablesWithIntrinsicBounds(C0003R.C0004drawable.instagram_device_phone_outline_24, 0, 0, 0);
                getContext();
                this.A04.getCompoundDrawables()[0].mutate().setColorFilter(C26771Ff.A00(AnonymousClass1BA.A01(context2, C0003R.attr.glyphColorPrimary)));
            }
            if (z && obtainStyledAttributes.hasValue(5)) {
                this.A04.setCompoundDrawablePadding(obtainStyledAttributes.getDimensionPixelSize(5, C0003R.dimen.field_with_glyph_drawable_padding));
            }
            if (obtainStyledAttributes.hasValue(2) && obtainStyledAttributes.getBoolean(2, false)) {
                this.A04.setTypeface((Typeface) null, 1);
            }
            if (obtainStyledAttributes.hasValue(3)) {
                this.A04.setTextColor(obtainStyledAttributes.getColor(3, 0));
            }
            if (obtainStyledAttributes.hasValue(0)) {
                this.A08 = obtainStyledAttributes.getBoolean(0, false);
            }
            int i = 0;
            if (obtainStyledAttributes.hasValue(6)) {
                i = obtainStyledAttributes.getDimensionPixelSize(6, 0);
            }
            int i2 = 0;
            if (obtainStyledAttributes.hasValue(7)) {
                i2 = obtainStyledAttributes.getDimensionPixelSize(7, 0);
            }
            int i3 = 0;
            if (obtainStyledAttributes.hasValue(8)) {
                i3 = obtainStyledAttributes.getDimensionPixelSize(8, 0);
            }
            this.A04.setPadding(i2, 0, i, 0);
            this.A01.setPadding(i, 0, i3, 0);
            if (obtainStyledAttributes.hasValue(10)) {
                float dimension = obtainStyledAttributes.getDimension(10, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
                this.A04.setTextSize(0, dimension);
                this.A01.setTextSize(0, dimension);
            }
            boolean z2 = obtainStyledAttributes.getBoolean(1, false);
            this.A06 = z2;
            if (z2) {
                Resources resources = getResources();
                int dimensionPixelSize = resources.getDimensionPixelSize(C0003R.dimen.container_horizontal_padding);
                this.A00.findViewById(C0003R.C0005id.phone_number_container).setBackgroundResource(AnonymousClass1BA.A03(context, C0003R.attr.textEditBackground));
                this.A00.findViewById(C0003R.C0005id.phone_number_container).setPadding(dimensionPixelSize, 0, dimensionPixelSize, 0);
                ViewGroup.LayoutParams layoutParams = this.A00.findViewById(C0003R.C0005id.phone_number_container).getLayoutParams();
                getResources();
                layoutParams.height = resources.getDimensionPixelSize(C0003R.dimen.container_height);
                this.A00.findViewById(C0003R.C0005id.phone_number_container).requestLayout();
                this.A03.setVisibility(0);
                EditText editText = this.A01;
                getResources();
                editText.setPadding(resources.getDimensionPixelSize(C0003R.dimen.container_edittext_left_padding), 0, 0, 0);
                this.A03.setBackgroundResource(C0003R.C0004drawable.container_divider);
            }
            obtainStyledAttributes.recycle();
        }
    }

    public TextView getCountryCodeTextView() {
        return this.A04;
    }

    public EditText getNumberEditText() {
        return this.A01;
    }

    public final void onDetachedFromWindow() {
        int A062 = AnonymousClass0Z0.A06(1312548448);
        super.onDetachedFromWindow();
        this.A01.removeCallbacks(this.A0A);
        for (TextWatcher removeTextChangedListener : this.A0B) {
            this.A04.removeTextChangedListener(removeTextChangedListener);
        }
        for (TextWatcher removeTextChangedListener2 : this.A0C) {
            this.A01.removeTextChangedListener(removeTextChangedListener2);
        }
        AnonymousClass0C1 r0 = this.A07;
        if (r0 != null) {
            AnonymousClass0WN.A01(r0).BsB(this.A01);
        }
        AnonymousClass0Z0.A0D(-656689200, A062);
    }

    public EditPhoneNumberView(Context context) {
        super(context);
        A00(context, (AttributeSet) null);
    }

    public EditPhoneNumberView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00(context, attributeSet);
    }

    public void setupEditPhoneNumberView(CountryCodeData countryCodeData, String str) {
        this.A04.setCountryCodeWithCountryPrefix(countryCodeData);
        if (str != null && !str.isEmpty()) {
            this.A01.setText(C134375oQ.A02(str, (String) null));
        }
    }

    public void setupEditPhoneNumberView(String str, String str2) {
        this.A04.setCountryCodeWithPlus(str);
        if (str2 != null && !str2.isEmpty()) {
            this.A01.setText(C134375oQ.A02(str2, (String) null));
        }
    }
}
