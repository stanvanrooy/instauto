package p000X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.text.style.ForegroundColorSpan;
import android.widget.TextView;
import com.facebook.C0003R;
import com.instagram.model.reels.Reel;
import com.instagram.model.venue.Venue;
import com.instagram.p009ui.widget.gradientspinner.GradientSpinner;

/* renamed from: X.1l1  reason: invalid class name and case insensitive filesystem */
public final class C38281l1 {
    public static boolean A03(C30301Th r14, AnonymousClass1NJ r15, TextView textView, TextView textView2, boolean z, boolean z2, Venue venue, SpannableStringBuilder spannableStringBuilder, int i, int i2) {
        TextView textView3 = textView2;
        if (z) {
            SpannableStringBuilder spannableStringBuilder2 = spannableStringBuilder;
            Venue venue2 = venue;
            TextView textView4 = textView;
            boolean z3 = false;
            if (((float) textView4.getWidth()) < textView4.getPaint().measureText(AnonymousClass000.A0J(spannableStringBuilder2.toString(), " • ", venue2.A0B))) {
                z3 = true;
            }
            int i3 = i;
            AnonymousClass1NJ r8 = r15;
            int i4 = i2;
            C30301Th r12 = r14;
            if (z3) {
                textView3.setVisibility(0);
                SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
                A01(spannableStringBuilder3, r8, venue2.A0B, i3, i4, r12);
                textView3.setText(spannableStringBuilder3);
                if (!z2) {
                    return true;
                }
                textView3.setMovementMethod(LinkMovementMethod.getInstance());
                return true;
            }
            C06220Of.A0F(textView3);
            A01(spannableStringBuilder2, r8, venue2.A0B, i3, i4, r12);
            textView4.setText(spannableStringBuilder2);
            return false;
        }
        C06220Of.A0F(textView3);
        return false;
    }

    public static void A02(AnonymousClass0C1 r1, Reel reel, GradientSpinner gradientSpinner, boolean z) {
        if (reel == null || z) {
            gradientSpinner.setVisibility(4);
            return;
        }
        gradientSpinner.setVisibility(0);
        C35871h4.A01(gradientSpinner, reel, r1);
        gradientSpinner.A04();
    }

    public static void A00(SpannableStringBuilder spannableStringBuilder, Context context, AnonymousClass1NJ r10, AnonymousClass0C1 r11, C30301Th r12, int i) {
        String string;
        String str = r10.A0c(r11).A2Y;
        int length = spannableStringBuilder.length();
        if ("not_shared".equals(str)) {
            string = context.getString(C0003R.string.feed_media_header_location_transparency_tag_location_unknown);
        } else {
            string = context.getString(C0003R.string.feed_media_header_location_transparency_tag_location_known, new Object[]{str});
        }
        spannableStringBuilder.append(string);
        spannableStringBuilder.setSpan(new C151126dC(i, r12, r10), length, spannableStringBuilder.length(), 33);
        new C25771BZf(r11).A00(C140505zZ.VIEW_COUNTRY_ON_POST, r10.A27, r10.A0c(r11).getId(), !str.equals("not_shared"));
    }

    public static void A01(SpannableStringBuilder spannableStringBuilder, AnonymousClass1NJ r5, String str, int i, int i2, C30301Th r9) {
        if (spannableStringBuilder.length() != 0) {
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append(" • ");
            spannableStringBuilder.setSpan(new ForegroundColorSpan(i), length, spannableStringBuilder.length(), 0);
        }
        C46021z0 r3 = new C46021z0(r9, r5, i2, i);
        int length2 = spannableStringBuilder.length();
        spannableStringBuilder.append(str);
        spannableStringBuilder.setSpan(r3, length2, spannableStringBuilder.length(), 33);
    }
}
