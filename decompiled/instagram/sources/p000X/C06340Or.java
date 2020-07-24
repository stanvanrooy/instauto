package p000X;

import android.text.Layout;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.style.ForegroundColorSpan;
import android.widget.TextView;
import com.facebook.react.uimanager.BaseViewManager;

/* renamed from: X.0Or  reason: invalid class name and case insensitive filesystem */
public abstract class C06340Or {
    public static float A00(int i, int i2, C06350Os r8) {
        int i3 = (int) (((float) i) * 2.0f);
        int i4 = (int) (((float) i2) * 2.0f);
        while (true) {
            int floor = ((int) Math.floor((double) (((float) (i4 - i3)) / 2.0f))) + i3;
            if (i3 >= floor) {
                return ((float) floor) / 2.0f;
            }
            if (r8.A8O(((float) floor) / 2.0f)) {
                i3 = floor;
            } else {
                i4 = floor;
            }
        }
    }

    public static float A01(String str, TextPaint textPaint, Layout.Alignment alignment, int i, int i2, int i3, int i4) {
        TextPaint textPaint2 = textPaint;
        int i5 = i;
        int i6 = i3;
        int i7 = i4;
        float A00 = A00(i6, i7, new AnonymousClass0MG(textPaint2, str, i5, alignment, i2));
        float f = Float.MAX_VALUE;
        for (String r1 : str.split(" ")) {
            f = Math.min(f, A00(i6, i7, new AnonymousClass0MC(textPaint2, r1, i5)));
        }
        return Math.min(A00, f);
    }

    public static void A03(TextView textView, int i) {
        textView.setLineSpacing(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, 1.0f);
        textView.setLineSpacing((float) (i - textView.getLineHeight()), 1.0f);
    }

    public static boolean A04(TextView textView, CharSequence charSequence) {
        String replaceAll = C06360Ot.A02.matcher(charSequence).replaceAll(" ");
        if (charSequence.equals(replaceAll)) {
            return false;
        }
        textView.setText(replaceAll);
        return true;
    }

    public static void A02(SpannableString spannableString, String str, int i) {
        int length = str.length();
        int indexOf = spannableString.toString().toLowerCase().indexOf(str.toLowerCase());
        if (indexOf > -1) {
            spannableString.setSpan(new ForegroundColorSpan(i), indexOf, length + indexOf, 0);
        }
    }
}
