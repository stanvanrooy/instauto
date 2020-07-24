package p000X;

import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.widget.TextView;
import com.facebook.C0003R;

/* renamed from: X.20l  reason: invalid class name and case insensitive filesystem */
public final class C466820l {
    public static BitmapDrawable A00(Context context) {
        return (BitmapDrawable) C019000b.A03(context, C0003R.C0004drawable.verified_profile);
    }

    public static SpannableStringBuilder A01(TextView textView, CharSequence charSequence, boolean z) {
        Context context = textView.getContext();
        Drawable mutate = A00(context).mutate();
        int i = 0;
        mutate.setBounds(0, 0, mutate.getIntrinsicWidth(), mutate.getIntrinsicHeight());
        if (z) {
            mutate.setColorFilter(C26771Ff.A00(C019000b.A00(context, C0003R.color.blue_5)));
        }
        float A05 = C06220Of.A05(context.getResources().getDisplayMetrics(), 2);
        CharSequence charSequence2 = charSequence;
        CharSequence ellipsize = TextUtils.ellipsize(charSequence2, textView.getPaint(), (((float) textView.getWidth()) - A05) - ((float) mutate.getIntrinsicWidth()), TextUtils.TruncateAt.END, false, (TextUtils.EllipsizeCallback) null);
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(ellipsize);
        valueOf.append(" ");
        C59232hF r3 = new C59232hF(mutate);
        if (ellipsize.length() >= charSequence.length()) {
            i = (int) A05;
        }
        r3.A00 = i;
        valueOf.setSpan(r3, valueOf.length() - 1, valueOf.length(), 33);
        return valueOf;
    }

    public static void A02(Context context, SpannableStringBuilder spannableStringBuilder, boolean z) {
        A04(context, spannableStringBuilder, z, C06400Ox.A02(context));
    }

    public static void A03(Context context, SpannableStringBuilder spannableStringBuilder, boolean z) {
        boolean A02 = C06400Ox.A02(context);
        if (A02) {
            spannableStringBuilder.insert(0, " ");
        } else {
            spannableStringBuilder.append(" ");
        }
        A04(context, spannableStringBuilder, z, A02);
    }

    public static void A04(Context context, SpannableStringBuilder spannableStringBuilder, boolean z, boolean z2) {
        Drawable mutate = A00(context).mutate();
        if (z) {
            mutate.setColorFilter(C26771Ff.A00(C019000b.A00(context, C0003R.color.blue_5)));
        }
        int i = 0;
        mutate.setBounds(0, 0, mutate.getIntrinsicWidth(), mutate.getIntrinsicHeight());
        C59232hF r2 = new C59232hF(mutate);
        if (z2) {
            spannableStringBuilder.insert(0, " ");
        } else {
            i = spannableStringBuilder.length();
            spannableStringBuilder.append(" ");
        }
        spannableStringBuilder.setSpan(r2, i, i + 1, 33);
    }

    public static void A05(TextView textView, boolean z) {
        Context context = textView.getContext();
        A07(textView, z, (int) C06220Of.A05(context.getResources().getDisplayMetrics(), 1), 0, C019000b.A00(context, C0003R.color.blue_5));
    }

    public static void A06(TextView textView, boolean z) {
        Context context = textView.getContext();
        if (Build.VERSION.SDK_INT >= 21) {
            A05(textView, z);
            return;
        }
        A07(textView, z, (int) (((float) 0) - ((((float) C019000b.A03(context, C0003R.C0004drawable.verified_profile).mutate().getIntrinsicHeight()) * (textView.getLineSpacingMultiplier() - 1.0f)) / 2.0f)), 0, C019000b.A00(context, C0003R.color.blue_5));
    }

    public static void A07(TextView textView, boolean z, int i, int i2, int i3) {
        Drawable drawable;
        int intrinsicWidth;
        Context context = textView.getContext();
        boolean A02 = C06400Ox.A02(context);
        if (z) {
            textView.getContext();
            drawable = A00(context).mutate();
            int i4 = i2;
            if (A02) {
                i4 = 0;
            }
            if (A02) {
                intrinsicWidth = drawable.getIntrinsicWidth();
            } else {
                intrinsicWidth = drawable.getIntrinsicWidth() + i2;
            }
            drawable.setBounds(i4, i, intrinsicWidth, drawable.getIntrinsicHeight() + i);
            if (A02) {
                C06220Of.A0M(textView, drawable.getIntrinsicWidth());
            } else {
                C06220Of.A0O(textView, i2);
            }
            if (i3 != -1) {
                drawable.setColorFilter(C26771Ff.A00(i3));
            }
        } else {
            drawable = null;
        }
        Drawable drawable2 = null;
        if (A02) {
            drawable2 = drawable;
        }
        if (A02) {
            drawable = null;
        }
        textView.setCompoundDrawables(drawable2, (Drawable) null, drawable, (Drawable) null);
    }
}
