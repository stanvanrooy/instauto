package p000X;

import android.content.res.Resources;
import android.text.TextUtils;
import com.facebook.C0003R;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

/* renamed from: X.1uA  reason: invalid class name and case insensitive filesystem */
public final class C43301uA {
    public static String A00(int i, Resources resources, Integer num) {
        int intValue;
        if (num == null || (intValue = num.intValue()) < 0) {
            throw new UnsupportedOperationException("Cannot format null view count");
        } else if (intValue == 0) {
            return resources.getString(i);
        } else {
            return resources.getQuantityString(C0003R.plurals.number_of_views, intValue, new Object[]{NumberFormat.getInstance().format(num)});
        }
    }

    public static String A02(Resources resources, int i) {
        if (i <= 0) {
            return "";
        }
        DecimalFormat decimalFormat = new DecimalFormat();
        decimalFormat.setGroupingUsed(true);
        decimalFormat.setMaximumFractionDigits(0);
        return resources.getQuantityString(C0003R.plurals.number_of_public_posts, i, new Object[]{decimalFormat.format((long) i)});
    }

    public static String A03(Resources resources, Integer num) {
        int intValue;
        if (num == null || (intValue = num.intValue()) < 0) {
            throw new UnsupportedOperationException("Cannot format null view count");
        }
        return resources.getQuantityString(C0003R.plurals.number_of_views, intValue, new Object[]{AnonymousClass23g.A00(num, resources, false)});
    }

    public static String A01(Resources resources, int i) {
        return resources.getQuantityString(C0003R.plurals.number_of_likes, i, new Object[]{NumberFormat.getInstance(Locale.getDefault()).format((long) i)});
    }

    public static boolean A04(String str) {
        if (!TextUtils.isEmpty(str)) {
            int i = 0;
            while (i < str.length()) {
                if (Character.isDigit(str.charAt(i))) {
                    i++;
                }
            }
            return true;
        }
        return false;
    }
}
