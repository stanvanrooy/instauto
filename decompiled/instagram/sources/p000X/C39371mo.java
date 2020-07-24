package p000X;

import android.content.Context;
import android.content.res.Resources;
import android.text.Html;
import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;
import com.facebook.C0003R;
import java.text.NumberFormat;
import java.util.List;
import java.util.Locale;

/* renamed from: X.1mo  reason: invalid class name and case insensitive filesystem */
public final class C39371mo {
    public static void A02(Resources resources, Context context, AnonymousClass0C1 r9, int i, List list, SpannableStringBuilder spannableStringBuilder) {
        if (i > 2) {
            int min = Math.min(list.size(), 2);
            if (min == 1) {
                int i2 = i - 1;
                spannableStringBuilder.append(Html.fromHtml(resources.getQuantityString(C0003R.plurals.followed_by_x_and_n_others, i2, new Object[]{list.get(0), A01(i2, true, resources)})));
            } else if (min != 2) {
                int i3 = i - 3;
                spannableStringBuilder.append(Html.fromHtml(resources.getQuantityString(C0003R.plurals.followed_by_x_y_z_and_n_others, i3, new Object[]{list.get(0), list.get(1), list.get(2), A01(i3, true, resources)})));
            } else {
                int i4 = i - 2;
                spannableStringBuilder.append(Html.fromHtml(resources.getQuantityString(C0003R.plurals.followed_by_x_y_and_n_others, i4, new Object[]{list.get(0), list.get(1), A01(i4, true, resources)})));
            }
        } else {
            int min2 = Math.min(list.size(), 2);
            if (min2 == 1) {
                spannableStringBuilder.append(resources.getString(C0003R.string.followed_by_x, new Object[]{list.get(0)}));
            } else if (min2 != 2) {
                spannableStringBuilder.append(resources.getString(C0003R.string.followed_by_x_y_and_z, new Object[]{list.get(0), list.get(1), list.get(2)}));
            } else {
                spannableStringBuilder.append(resources.getString(C0003R.string.followed_by_x_and_y, new Object[]{list.get(0), list.get(1)}));
            }
        }
        C38931m5 r1 = new C38931m5(r9, spannableStringBuilder);
        r1.A0F = true;
        r1.A01 = AnonymousClass1BA.A01(context, C0003R.attr.textColorBoldLink);
        r1.A0J = true;
        r1.A02((C38951m7) null);
        r1.A00();
    }

    public static void A06(Resources resources, SpannableStringBuilder spannableStringBuilder, List list, int i) {
        int i2;
        Object[] objArr;
        int min = Math.min(list.size(), 2);
        if (min != 1) {
            if (min != 2) {
                i2 = C0003R.string.liked_by_x_y_z_and_others;
                objArr = new Object[]{list.get(0), list.get(1), list.get(2)};
            } else {
                i2 = C0003R.string.liked_by_x_y_and_others;
                if (i == 2) {
                    i2 = C0003R.string.liked_by_x_and_y;
                }
                objArr = new Object[]{list.get(0), list.get(1)};
            }
        } else if (i == 1) {
            spannableStringBuilder.append(resources.getString(C0003R.string.liked_by_x, new Object[]{list.get(0)}));
            return;
        } else {
            i2 = C0003R.string.liked_by_x_and_others;
            objArr = new Object[]{list.get(0)};
        }
        spannableStringBuilder.append(Html.fromHtml(resources.getString(i2, objArr)));
    }

    public static void A08(Resources resources, SpannableStringBuilder spannableStringBuilder, List list, int i, boolean z) {
        int i2;
        Object[] objArr;
        int min = Math.min(list.size(), 2);
        if (min == 1) {
            i2 = C0003R.plurals.liked_by_x_and_n_others;
            objArr = new Object[]{list.get(0), A00(i, resources, z)};
        } else if (min != 2) {
            i2 = C0003R.plurals.liked_by_x_y_z_and_n_others;
            objArr = new Object[]{list.get(0), list.get(1), list.get(2), A00(i, resources, z)};
        } else {
            i2 = C0003R.plurals.liked_by_x_y_and_n_others;
            objArr = new Object[]{list.get(0), list.get(1), A00(i, resources, z)};
        }
        spannableStringBuilder.append(Html.fromHtml(resources.getQuantityString(i2, i, objArr)));
    }

    public static String A01(int i, boolean z, Resources resources) {
        if (z) {
            return AnonymousClass23g.A00(Integer.valueOf(i), resources, false);
        }
        return NumberFormat.getInstance(Locale.getDefault()).format((long) i);
    }

    public static String A00(int i, Resources resources, boolean z) {
        return AnonymousClass23g.A01(Integer.valueOf(i), resources, true, 1000, z);
    }

    public static void A03(Resources resources, SpannableStringBuilder spannableStringBuilder, int i) {
        spannableStringBuilder.append(resources.getQuantityString(C0003R.plurals.number_of_likes, i, new Object[]{AnonymousClass23g.A01(Integer.valueOf(i), resources, true, 1000, false)}));
        spannableStringBuilder.setSpan(new StyleSpan(1), 0, spannableStringBuilder.length(), 33);
    }

    public static void A04(Resources resources, SpannableStringBuilder spannableStringBuilder, int i) {
        int i2;
        if (i >= 10000000) {
            i2 = C0003R.string.liked_by_tens_of_millions_of_people;
        } else if (i >= 1000000) {
            i2 = C0003R.string.liked_by_millions_of_people;
        } else if (i >= 100000) {
            i2 = C0003R.string.liked_by_hundreds_of_thousands_of_people;
        } else if (i >= 10000) {
            i2 = C0003R.string.liked_by_tens_of_thousands_of_people;
        } else if (i >= 1000) {
            i2 = C0003R.string.liked_by_thousands_of_people;
        } else if (i >= 100) {
            i2 = C0003R.string.liked_by_hundreds_of_people;
        } else if (i > 0) {
            i2 = C0003R.string.view_likes;
        } else {
            throw new IllegalArgumentException(AnonymousClass000.A05("Illegal ads bucketed like count: ", i));
        }
        spannableStringBuilder.append(C46031z1.A00(resources, i2));
    }

    public static void A05(Resources resources, SpannableStringBuilder spannableStringBuilder, List list, int i) {
        int i2;
        AnonymousClass0a4.A09(!list.isEmpty());
        if (i >= 10000000) {
            int size = list.size();
            i2 = C0003R.string.liked_by_x_and_tens_of_millions_of_others;
            if (size > 1) {
                i2 = C0003R.string.liked_by_x_y_and_tens_of_millions_of_others;
            }
        } else if (i >= 1000000) {
            int size2 = list.size();
            i2 = C0003R.string.liked_by_x_and_millions_of_others;
            if (size2 > 1) {
                i2 = C0003R.string.liked_by_x_y_and_millions_of_others;
            }
        } else if (i >= 100000) {
            int size3 = list.size();
            i2 = C0003R.string.liked_by_x_and_hundreds_of_thousands_of_others;
            if (size3 > 1) {
                i2 = C0003R.string.liked_by_x_y_and_hundreds_of_thousands_of_others;
            }
        } else if (i >= 10000) {
            int size4 = list.size();
            i2 = C0003R.string.liked_by_x_and_tens_of_thousands_of_others;
            if (size4 > 1) {
                i2 = C0003R.string.liked_by_x_y_and_tens_of_thousands_of_others;
            }
        } else if (i >= 1000) {
            int size5 = list.size();
            i2 = C0003R.string.liked_by_x_and_thousands_of_others;
            if (size5 > 1) {
                i2 = C0003R.string.liked_by_x_y_and_thousands_of_others;
            }
        } else if (i >= 100) {
            int size6 = list.size();
            i2 = C0003R.string.liked_by_x_and_hundreds_of_others;
            if (size6 > 1) {
                i2 = C0003R.string.liked_by_x_y_and_hundreds_of_others;
            }
        } else {
            throw new IllegalArgumentException(AnonymousClass000.A05("Bucketed like count less than 100: ", i));
        }
        spannableStringBuilder.append(C46031z1.A01(resources, i2, list.size() > 1 ? new String[]{(String) list.get(0), (String) list.get(1)} : new String[]{(String) list.get(0)}));
    }

    public static void A07(Resources resources, SpannableStringBuilder spannableStringBuilder, List list, int i) {
        int i2;
        Object[] objArr;
        int min = Math.min(list.size(), i);
        if (min == 1) {
            i2 = C0003R.string.liked_by_x;
            objArr = new Object[]{list.get(0)};
        } else if (min != 2) {
            i2 = C0003R.string.liked_by_x_y_and_z;
            objArr = new Object[]{list.get(0), list.get(1), list.get(2)};
        } else {
            i2 = C0003R.string.liked_by_x_and_y;
            objArr = new Object[]{list.get(0), list.get(1)};
        }
        spannableStringBuilder.append(resources.getString(i2, objArr));
    }
}
