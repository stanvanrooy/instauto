package p000X;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.text.SpannableStringBuilder;
import androidx.fragment.app.FragmentActivity;
import com.facebook.C0003R;

/* renamed from: X.1j1  reason: invalid class name and case insensitive filesystem */
public final class C37041j1 {
    public static SpannableStringBuilder A00(FragmentActivity fragmentActivity, AnonymousClass0C1 r8, String str, String str2, String str3, Context context, Integer num, String str4) {
        AnonymousClass0C1 r5 = r8;
        C100054Ub r1 = new C100054Ub(fragmentActivity, r5, str4, context);
        AnonymousClass7B4 r2 = new AnonymousClass7B4((AnonymousClass7B5) null, fragmentActivity, r5, str4, num, context);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        AnonymousClass4XV.A02(str2, spannableStringBuilder, r2);
        AnonymousClass4XV.A02(str3, spannableStringBuilder, r1);
        return spannableStringBuilder;
    }

    public static void A01(Activity activity) {
        AnonymousClass0a4.A07(activity, "Fragment should be attached to an activity when UI is clicked");
        AnonymousClass2OA r2 = new AnonymousClass2OA(activity);
        r2.A07(C0003R.string.delete_branded_content_ad_title);
        r2.A06(C0003R.string.delete_branded_content_ad_subtitle);
        r2.A0A(C0003R.string.f118ok, new C92063yY());
        r2.A03().show();
    }

    public static void A02(Activity activity, Context context, AnonymousClass0C1 r6, String str, AnonymousClass0RN r8) {
        if (((Boolean) AnonymousClass0L6.A02(r6, AnonymousClass0L7.BRANDED_CONTENT_INSIGHTS_DISCLOSURE, "enabled", false, (AnonymousClass04H) null)).booleanValue() && !C16180oA.A00(r6).A00.getBoolean("seen_story_branded_content_insights_disclosure_dialog", false)) {
            C16180oA.A00(r6).A00.edit().putBoolean("seen_story_branded_content_insights_disclosure_dialog", true).apply();
            AnonymousClass6OZ.A09(r6, "ig_branded_content_insights_disclosure_dialog_impression", (String) null, str, r8);
            AnonymousClass2OA r2 = new AnonymousClass2OA(activity);
            r2.A07(C0003R.string.branded_content_insights_disclosure_title);
            r2.A06(C0003R.string.branded_content_insights_disclosure_description);
            r2.A0H(C019000b.A03(context, C0003R.C0004drawable.ig_shopping_from_creators_assets_creator_insights));
            r2.A09(C0003R.string.f118ok, (DialogInterface.OnClickListener) null);
            r2.A03().show();
        }
    }

    public static void A03(Activity activity, AnonymousClass0C1 r4, String str, String str2, DialogInterface.OnClickListener onClickListener) {
        AnonymousClass2OA r2 = new AnonymousClass2OA(activity);
        r2.A03 = str;
        r2.A0M(str2);
        r2.A0A(C0003R.string.learn_more, new C99264Qz(activity, r4));
        r2.A09(C0003R.string.cancel, onClickListener);
        r2.A03().show();
    }

    public static void A04(Context context) {
        AnonymousClass2OA r4 = new AnonymousClass2OA(context);
        r4.A07(C0003R.string.f71x37d42dea);
        r4.A06(C0003R.string.f70x43d573d0);
        r4.A0S(context.getString(C0003R.string.f118ok), (DialogInterface.OnClickListener) null, true, Constants.A0C);
        r4.A03().show();
    }

    public static void A05(Context context, DialogInterface.OnClickListener onClickListener) {
        AnonymousClass2OA r3 = new AnonymousClass2OA(context);
        r3.A03 = context.getString(C0003R.string.branded_content_tools_ready_dialog_title);
        r3.A0M(context.getString(C0003R.string.branded_content_tools_ready_dialog_description));
        r3.A0S(context.getString(C0003R.string.tag_business_partner), onClickListener, true, Constants.A0C);
        r3.A09(C0003R.string.done, (DialogInterface.OnClickListener) null);
        r3.A03().show();
    }

    public static void A06(Context context, C13300iJ r6, DialogInterface.OnClickListener onClickListener, DialogInterface.OnClickListener onClickListener2) {
        AnonymousClass2OA r4 = new AnonymousClass2OA(context);
        r4.A07(C0003R.string.branded_content_brand_approval_request_dialog_title);
        r4.A0M(context.getString(C0003R.string.branded_content_brand_approval_request_dialog_message, new Object[]{r6.AZn()}));
        r4.A0P(context.getString(C0003R.string.branded_content_brand_approval_request_dialog_action), onClickListener);
        r4.A09(C0003R.string.cancel, onClickListener2);
        r4.A03().show();
    }

    public static void A07(AnonymousClass1NJ r4, AnonymousClass0C1 r5, Activity activity, String str, Class cls) {
        AnonymousClass0a4.A07(activity, "Fragment should be attached to an activity when UI is clicked");
        AnonymousClass2OA r2 = new AnonymousClass2OA(activity);
        r2.A07(C0003R.string.remove_sponsor_tag_title_for_ad);
        r2.A06(C0003R.string.remove_sponsor_tag_subtitle_for_ad);
        r2.A0A(C0003R.string.f118ok, new C143416Bo(r4, r5, activity, str, cls));
        r2.A09(C0003R.string.cancel, new C92073yZ());
        r2.A03().show();
    }

    public static boolean A08(AnonymousClass1NJ r3, AnonymousClass0C1 r4) {
        if (r3.Aho() || !r3.A1R() || !((Boolean) AnonymousClass0L6.A02(r4, AnonymousClass0L7.BRANDED_CONTENT_TAG_REDESIGN_ORGANIC, "show_tag_above_caption", false, (AnonymousClass04H) null)).booleanValue()) {
            return false;
        }
        return true;
    }
}
