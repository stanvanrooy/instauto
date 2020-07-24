package com.facebook.react.modules.i18nmanager;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.Locale;

public final class I18nUtil {
    public static I18nUtil A00;

    public static I18nUtil A00() {
        if (A00 == null) {
            A00 = new I18nUtil();
        }
        return A00;
    }

    public static void A01(Context context, String str, boolean z) {
        SharedPreferences.Editor edit = context.getSharedPreferences("com.facebook.react.modules.i18nmanager.I18nUtil", 0).edit();
        edit.putBoolean(str, z);
        edit.apply();
    }

    public final boolean A02(Context context) {
        return context.getSharedPreferences("com.facebook.react.modules.i18nmanager.I18nUtil", 0).getBoolean("RCTI18nUtil_makeRTLFlipLeftAndRightStyles", true);
    }

    public final boolean A03(Context context) {
        if (!context.getSharedPreferences("com.facebook.react.modules.i18nmanager.I18nUtil", 0).getBoolean("RCTI18nUtil_forceRTL", false)) {
            if (!context.getSharedPreferences("com.facebook.react.modules.i18nmanager.I18nUtil", 0).getBoolean("RCTI18nUtil_allowRTL", true)) {
                return false;
            }
            boolean z = true;
            if (TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) != 1) {
                z = false;
            }
            if (z) {
                return true;
            }
            return false;
        }
        return true;
    }
}
