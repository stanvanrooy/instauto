package com.instagram.profile.edit.controller;

import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.facebook.C0003R;
import com.instagram.igds.components.form.IgFormField;
import java.util.HashMap;
import java.util.Map;
import p000X.AnonymousClass000;
import p000X.Constants;
import p000X.AnonymousClass0C1;
import p000X.AnonymousClass0WN;
import p000X.AnonymousClass0a4;
import p000X.AnonymousClass1L8;
import p000X.AnonymousClass3BD;
import p000X.AnonymousClass3BE;
import p000X.AnonymousClass507;
import p000X.AnonymousClass508;
import p000X.AnonymousClass509;
import p000X.AnonymousClass50C;
import p000X.AnonymousClass50D;
import p000X.AnonymousClass50E;
import p000X.AnonymousClass50H;
import p000X.AnonymousClass50I;
import p000X.AnonymousClass50J;
import p000X.B7D;
import p000X.C11200ea;
import p000X.C116224yt;
import p000X.C116234yu;
import p000X.C116524zR;
import p000X.C116534zS;
import p000X.C116564zV;
import p000X.C116784zr;
import p000X.C16180oA;
import p000X.C23300zv;
import p000X.C27291Hg;
import p000X.C481927a;

public class EditProfileFieldsController extends C27291Hg {
    public C116784zr A00;
    public AnonymousClass50I A01;
    public AnonymousClass507 A02;
    public boolean A03;
    public boolean A04;
    public final AnonymousClass1L8 A05;
    public final AnonymousClass0C1 A06;
    public final Map A07 = new HashMap();
    public final C11200ea A08 = new AnonymousClass50E(this);
    public final C11200ea A09 = new C116234yu(this);
    public final C11200ea A0A = new AnonymousClass509(this);
    public FragmentActivity mActivity;
    public IgFormField mBioField;
    public IgFormField mNameField;
    public IgFormField mUsernameField;
    public View mView;
    public IgFormField mWebsiteField;

    public final void A00() {
        View view;
        C116784zr r2 = this.A00;
        if (r2 != null && (view = this.mView) != null) {
            C481927a r6 = r2.A03;
            if (r6 != null) {
                if (!(view == null || r2 == null || r6 == null)) {
                    this.A01.ASt().BhN(false);
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(r6.A01);
                    AnonymousClass3BE.A01(this.mActivity, this.A06, (AnonymousClass3BD) null, r6.A02, spannableStringBuilder);
                    this.mBioField.setText(spannableStringBuilder);
                    this.A01.ASt().BhN(true);
                }
                this.mBioField.A00.setFocusableInTouchMode(false);
                this.mBioField.A00.setOnClickListener(new C116524zR(this));
            } else {
                this.A01.ASt().BhN(false);
                this.mBioField.setText(r2.A07);
                this.A01.ASt().BhN(true);
            }
            if (C16180oA.A00(this.A06).A00.getBoolean("should_show_bio_linking_tooltip", true)) {
                this.mView.postDelayed(new C116534zS(this), 100);
            }
        }
    }

    public final void A01() {
        C116784zr r1 = this.A00;
        if (r1 != null) {
            r1.A0C = this.mNameField.getText().toString();
            this.A00.A0L = this.mUsernameField.getText().toString();
            String trim = this.mWebsiteField.getText().toString().trim();
            if (trim.length() > 0 && !trim.matches("^https?://.+")) {
                trim = AnonymousClass000.A0E("http://", trim);
            }
            C116784zr r12 = this.A00;
            r12.A0B = trim;
            r12.A07 = this.mBioField.getText().toString();
        }
    }

    public final void A03(FragmentActivity fragmentActivity, View view, AnonymousClass50I r7, boolean z, boolean z2) {
        this.A01 = r7;
        this.mActivity = fragmentActivity;
        this.mView = view;
        this.A04 = z;
        this.A03 = z2;
        IgFormField igFormField = (IgFormField) view.findViewById(C0003R.C0005id.full_name);
        this.mNameField = igFormField;
        if (!z) {
            igFormField.setRuleChecker(new AnonymousClass50H(this.mActivity.getString(C0003R.string.required_field)));
        }
        this.mUsernameField = (IgFormField) view.findViewById(C0003R.C0005id.username);
        this.A02 = new AnonymousClass507(new AnonymousClass50D(this));
        this.mUsernameField.setRuleChecker(new AnonymousClass50C(this));
        IgFormField igFormField2 = (IgFormField) view.findViewById(C0003R.C0005id.website);
        this.mWebsiteField = igFormField2;
        igFormField2.setInputType(17);
        IgFormField igFormField3 = this.mWebsiteField;
        igFormField3.A05(new C116564zV(igFormField3.A00, Constants.ZERO));
        IgFormField igFormField4 = (IgFormField) view.findViewById(C0003R.C0005id.bio);
        this.mBioField = igFormField4;
        if (!z2) {
            igFormField4.setRuleChecker(new AnonymousClass50H(this.mActivity.getString(C0003R.string.required_field)));
        }
        AnonymousClass0WN.A01(this.A06).Ba2(this.mBioField.A00);
    }

    public final boolean A04() {
        boolean z = true;
        boolean z2 = false;
        if (this.mUsernameField.getText().length() != 0) {
            z2 = true;
        }
        if (!this.A04) {
            boolean z3 = false;
            if (this.mNameField.getText().length() != 0) {
                z3 = true;
            }
            z2 &= z3;
        }
        if (this.A03) {
            return z2;
        }
        if (this.mBioField.getText().length() == 0) {
            z = false;
        }
        return z2 & z;
    }

    public final void Azd() {
        C23300zv A002 = C23300zv.A00(this.A06);
        A002.A03(AnonymousClass50J.class, this.A08);
        A002.A03(AnonymousClass508.class, this.A0A);
        A002.A03(C116224yt.class, this.A09);
    }

    public final void BE0() {
        this.mNameField.A06(this.A01.ASt());
        this.mUsernameField.A06(this.A01.ASt());
        this.mWebsiteField.A06(this.A01.ASt());
        this.mBioField.A00.removeTextChangedListener(this.A01.ASt());
    }

    public final void BKp(Bundle bundle) {
        IgFormField igFormField = this.mNameField;
        if (igFormField != null) {
            bundle.putString("bundle_name_field", igFormField.getText().toString());
        }
        IgFormField igFormField2 = this.mUsernameField;
        if (igFormField2 != null) {
            bundle.putString("bundle_username_field", igFormField2.getText().toString());
        }
        IgFormField igFormField3 = this.mWebsiteField;
        if (igFormField3 != null) {
            bundle.putString("bundle_website_field", igFormField3.getText().toString());
        }
        IgFormField igFormField4 = this.mBioField;
        if (igFormField4 != null) {
            bundle.putString("bundle_bio_field", igFormField4.getText().toString());
        }
    }

    public EditProfileFieldsController(AnonymousClass0C1 r4, AnonymousClass1L8 r5) {
        this.A06 = r4;
        this.A05 = r5;
        C23300zv A002 = C23300zv.A00(r4);
        A002.A02(AnonymousClass50J.class, this.A08);
        A002.A02(AnonymousClass508.class, this.A0A);
        A002.A02(C116224yt.class, this.A09);
    }

    public final void A02(Bundle bundle, C116784zr r5) {
        AnonymousClass0a4.A06(r5);
        this.A00 = r5;
        if (bundle != null) {
            String string = bundle.getString("bundle_name_field");
            if (string != null) {
                this.mNameField.setText(string);
            }
            String string2 = bundle.getString("bundle_username_field");
            if (string2 != null) {
                this.mUsernameField.setText(string2);
            }
            String string3 = bundle.getString("bundle_website_field");
            if (string3 != null) {
                this.mWebsiteField.setText(string3);
            }
            String string4 = bundle.getString("bundle_bio_field");
            if (string4 != null) {
                this.mBioField.setText(string4);
            }
        } else {
            this.mNameField.setText(r5.A0C);
            this.mUsernameField.setText(this.A00.A0L);
            this.mWebsiteField.setText(this.A00.A0B);
        }
        if (this.A01.Af3()) {
            this.mNameField.A00.setFocusableInTouchMode(false);
            this.mNameField.A00.setOnClickListener(this.A01.AMO());
        }
        if (this.A01.Af4()) {
            this.mUsernameField.A00.setFocusableInTouchMode(false);
            this.mUsernameField.A00.setOnClickListener(this.A01.AZo());
        }
        A00();
    }

    public final void Azh() {
        A01();
        this.mUsernameField.setRuleChecker((B7D) null);
        AnonymousClass0WN.A01(this.A06).BsB(this.mBioField.A00);
        EditProfileFieldsControllerLifecycleUtil.cleanupReferences(this);
    }

    public final void BJx() {
        A00();
        this.mNameField.A05(this.A01.ASt());
        this.mUsernameField.A05(this.A01.ASt());
        this.mWebsiteField.A05(this.A01.ASt());
        this.mBioField.A00.addTextChangedListener(this.A01.ASt());
    }
}
