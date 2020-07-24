package p000X;

import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.facebook.C0003R;
import com.instagram.common.p004ui.base.IgSimpleImageView;
import java.util.HashMap;

/* renamed from: X.CD2 */
public final class CD2 {
    public FragmentActivity A00;
    public C27398CBr A01;
    public C27385CBe A02;
    public CD3 A03;
    public AnonymousClass0C1 A04;

    public final void A01(View view) {
        CD3 cd3 = this.A03;
        double d = (double) cd3.A06;
        double d2 = d * ((double) cd3.A0N.A00);
        String A002 = CCH.A00(d, cd3.A01, cd3.A0f, 0);
        CD3 cd32 = this.A03;
        String A003 = CCH.A00(d2, cd32.A01, cd32.A0f, 2);
        CD3 cd33 = this.A03;
        String A004 = CCH.A00(((double) cd33.A06) + d2, cd33.A01, cd33.A0f, 2);
        CD3 cd34 = this.A03;
        C27398CBr cBr = this.A01;
        HashMap hashMap = new HashMap();
        hashMap.put("tax_budget", A002);
        hashMap.put("tax_estimate", A003);
        hashMap.put("tax_total_spend", A004);
        AnonymousClass0P4 A005 = AnonymousClass2VV.A00(Constants.A06);
        A005.A0G("step", cBr.toString());
        A005.A0G("component", "tax_detail");
        C06270Ok A006 = C06270Ok.A00();
        A006.A0C(hashMap);
        A005.A08("configurations", A006);
        CCZ.A0G(cd34, A005);
        TextView textView = (TextView) view.findViewById(C0003R.C0005id.title_row).findViewById(C0003R.C0005id.primary_text);
        textView.setText(C0003R.string.promote_review_tax_row_title_text);
        textView.setTypeface((Typeface) null, 1);
        ((TextView) view.findViewById(C0003R.C0005id.ad_budget_row).findViewById(C0003R.C0005id.primary_text)).setText(C0003R.string.promote_review_tax_row_ad_budget_text);
        ((TextView) view.findViewById(C0003R.C0005id.ad_budget_row).findViewById(C0003R.C0005id.subtitle_text)).setText(A002);
        ((TextView) view.findViewById(C0003R.C0005id.estimated_tax_row).findViewById(C0003R.C0005id.primary_text)).setText(C0003R.string.promote_review_tax_row_estimated_tax_text);
        ((TextView) view.findViewById(C0003R.C0005id.estimated_tax_row).findViewById(C0003R.C0005id.subtitle_text)).setText(A003);
        TextView textView2 = (TextView) view.findViewById(C0003R.C0005id.total_spend_row).findViewById(C0003R.C0005id.primary_text);
        textView2.setText(C0003R.string.promote_review_tax_row_total_spend_text);
        textView2.setTypeface((Typeface) null, 1);
        ((TextView) view.findViewById(C0003R.C0005id.total_spend_row).findViewById(C0003R.C0005id.subtitle_text)).setText(A004);
    }

    public CD2(CD3 cd3, FragmentActivity fragmentActivity, C27385CBe cBe, C27398CBr cBr) {
        this.A03 = cd3;
        this.A00 = fragmentActivity;
        this.A04 = cd3.A0Q;
        this.A02 = cBe;
        this.A01 = cBr;
    }

    public final void A00(View view) {
        String str;
        String str2;
        Object[] objArr;
        Drawable A032;
        int i;
        ((TextView) view.findViewById(C0003R.C0005id.primary_text)).setText(C0003R.string.promote_review_payment_row_title);
        IgSimpleImageView igSimpleImageView = (IgSimpleImageView) view.findViewById(C0003R.C0005id.error_icon);
        CD3 cd3 = this.A03;
        if (cd3.A03()) {
            C27398CBr cBr = this.A01;
            switch (cd3.A0K.A02.A00.intValue()) {
                case 1:
                    str = "UNSET";
                    break;
                case 2:
                    str = "CREDIT_CARD";
                    break;
                case 3:
                    str = "FACEBOOK_EXTENDED_CREDIT";
                    break;
                case 4:
                    str = "ORDER";
                    break;
                case 5:
                    str = "INVOICE";
                    break;
                case 6:
                    str = "FACEBOOK_TOKEN";
                    break;
                case 7:
                    str = "PAYPAL_TOKEN";
                    break;
                case 8:
                    str = "PAYPAL_BILLING_AGREEMENT";
                    break;
                case 9:
                    str = "DIRECT_DEBIT";
                    break;
                case 10:
                    str = "DUMMY";
                    break;
                case C120125Dh.VIEW_TYPE_BANNER:
                    str = "ALTPAY";
                    break;
                case C120125Dh.VIEW_TYPE_SPINNER:
                    str = "STORED_BALANCE";
                    break;
                default:
                    str = "UNSET_OR_UNRECOGNIZED_ENUM_VALUE";
                    break;
            }
            HashMap hashMap = new HashMap();
            hashMap.put("payment_method_type", str);
            AnonymousClass0P4 A002 = AnonymousClass2VV.A00(Constants.A06);
            A002.A0G("step", cBr.toString());
            A002.A0G("component", "existing_payment_method");
            C06270Ok A003 = C06270Ok.A00();
            A003.A0C(hashMap);
            A002.A08("configurations", A003);
            CCZ.A0G(cd3, A002);
            CD3 cd32 = this.A03;
            CGP cgp = cd32.A0K.A02;
            String str3 = cgp.A02;
            String str4 = cgp.A01;
            CGB cgb = cd32.A0G;
            if (cgb != null) {
                str2 = C06360Ot.formatString("%s%n%s", str3, cgb.A02);
            } else {
                if (cgp.A00 == Constants.A04) {
                    str2 = C06360Ot.formatString("%s%n%s", str3, str4);
                } else if (str3 == null || str3.length() <= 0 || str4 == null || str4.length() <= 0) {
                    if (str3 != null && str3.length() > 0) {
                        objArr = new Object[]{str3};
                    } else if (str4 == null || str4.length() <= 0) {
                        str2 = "";
                    } else {
                        objArr = new Object[]{str4};
                    }
                    str2 = C06360Ot.formatString("%s", objArr);
                } else {
                    str2 = C06360Ot.formatString("%s | %s", str3, str4);
                }
                if (this.A03.A0K.A04) {
                    String string = this.A00.getResources().getString(C0003R.string.promote_review_payment_from_facebook);
                    if (TextUtils.isEmpty(str2)) {
                        str2 = string;
                    } else {
                        str2 = this.A00.getResources().getString(C0003R.string.promote_review_payment_subtitle_with_from_facebook, new Object[]{str2, string});
                    }
                }
            }
            if (!TextUtils.isEmpty(str2)) {
                TextView textView = (TextView) view.findViewById(C0003R.C0005id.secondary_text);
                textView.setText(str2);
                textView.setVisibility(0);
            } else {
                view.findViewById(C0003R.C0005id.secondary_text).setVisibility(8);
            }
            view.setOnClickListener(new C27384CBd(this, "edit_payment_method"));
            CGB cgb2 = this.A03.A0G;
            if (cgb2 != null) {
                FragmentActivity fragmentActivity = this.A00;
                CGC cgc = cgb2.A00;
                AnonymousClass11J.A01(cgc.A00, "Error level should not be null for payment error");
                if (cgc.A00.intValue() != 1) {
                    A032 = C019000b.A03(fragmentActivity, C0003R.C0004drawable.instagram_error_filled_24);
                    i = C0003R.color.igds_error_or_destructive;
                } else {
                    A032 = C019000b.A03(fragmentActivity, C0003R.C0004drawable.instagram_warning_filled_24);
                    i = C0003R.color.yellow_5;
                }
                A032.setColorFilter(C26771Ff.A00(C019000b.A00(fragmentActivity, i)));
                igSimpleImageView.setImageDrawable(A032);
                AnonymousClass0a4.A07(this.A03.A0G.A00.A00, "Error level should not be null for payment error");
                igSimpleImageView.setVisibility(0);
                Integer num = this.A03.A0G.A01;
                if (num == Constants.A0I || num == Constants.A0H || num == Constants.A0F || num == Constants.A0E) {
                    view.setOnClickListener(new C27384CBd(this, C27460CEc.A02(num)));
                    return;
                }
                return;
            }
            igSimpleImageView.setVisibility(8);
            return;
        }
        if (this.A01 != C27398CBr.BUDGET) {
            igSimpleImageView.setVisibility(0);
        }
        TextView textView2 = (TextView) view.findViewById(C0003R.C0005id.secondary_text);
        AnonymousClass0C1 r3 = this.A04;
        AnonymousClass0L7 r2 = AnonymousClass0L7.PROMOTE_PAYMENT_CONTENT_IMPROVEMENT;
        if (((Boolean) AnonymousClass0L6.A02(r3, r2, "has_guidance_content", false, (AnonymousClass04H) null)).booleanValue()) {
            textView2.setText(C0003R.string.promote_review_add_payment_label_with_guidance);
        } else if (((Boolean) AnonymousClass0L6.A02(this.A04, r2, "has_trust_content", false, (AnonymousClass04H) null)).booleanValue()) {
            textView2.setText(C0003R.string.promote_review_add_payment_label_with_trust);
        } else {
            textView2.setText(C0003R.string.promote_review_add_payment_label);
        }
        textView2.setVisibility(0);
        view.setOnClickListener(new C27384CBd(this, "add_payment_method"));
        CCZ.A08(this.A03, this.A01, "add_payment_method");
    }
}
