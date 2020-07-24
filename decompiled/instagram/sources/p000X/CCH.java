package p000X;

import android.content.Context;
import com.facebook.C0003R;
import com.facebook.common.dextricks.DexOptimizationMessageHandler;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Currency;
import java.util.List;

/* renamed from: X.CCH */
public final class CCH {
    public static final List A00 = Arrays.asList(new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 20, 25, 30, 35, 40, 50, 60, 75, 100, 150, 200, Integer.valueOf(DexOptimizationMessageHandler.DEFAULT_RESTART_IMPORTANCE_THRESHOLD), 500, 1000});
    public static final List A01 = Arrays.asList(new Integer[]{1, 2, 3, 4, 5, 6, 7, 10, 15, 30});
    public static final List A02 = Arrays.asList(new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30});

    public static String A01(Context context, int i) {
        int i2 = C0003R.string.promote_duration_multiple_days_text;
        if (i == 1) {
            i2 = C0003R.string.promote_duration_one_day_text;
        }
        return context.getString(i2, new Object[]{Integer.valueOf(i)});
    }

    public static String A00(double d, int i, Currency currency, int i2) {
        NumberFormat currencyInstance = NumberFormat.getCurrencyInstance(C15300mf.A03());
        currencyInstance.setCurrency(currency);
        currencyInstance.setMaximumFractionDigits(i2);
        return currencyInstance.format(d / ((double) i));
    }
}
