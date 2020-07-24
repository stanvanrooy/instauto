package p000X;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Build;
import android.view.MenuItem;

/* renamed from: X.AHJ */
public final class AHJ {
    public static void A00(MenuItem menuItem, char c, int i) {
        if (menuItem instanceof AI8) {
            ((AI8) menuItem).setAlphabeticShortcut(c, i);
        } else if (Build.VERSION.SDK_INT >= 26) {
            menuItem.setAlphabeticShortcut(c, i);
        }
    }

    public static void A01(MenuItem menuItem, char c, int i) {
        if (menuItem instanceof AI8) {
            ((AI8) menuItem).setNumericShortcut(c, i);
        } else if (Build.VERSION.SDK_INT >= 26) {
            menuItem.setNumericShortcut(c, i);
        }
    }

    public static void A02(MenuItem menuItem, ColorStateList colorStateList) {
        if (menuItem instanceof AI8) {
            ((AI8) menuItem).setIconTintList(colorStateList);
        } else if (Build.VERSION.SDK_INT >= 26) {
            menuItem.setIconTintList(colorStateList);
        }
    }

    public static void A03(MenuItem menuItem, PorterDuff.Mode mode) {
        if (menuItem instanceof AI8) {
            ((AI8) menuItem).setIconTintMode(mode);
        } else if (Build.VERSION.SDK_INT >= 26) {
            menuItem.setIconTintMode(mode);
        }
    }

    public static void A04(MenuItem menuItem, CharSequence charSequence) {
        if (menuItem instanceof AI8) {
            ((AI8) menuItem).Bgh(charSequence);
        } else if (Build.VERSION.SDK_INT >= 26) {
            menuItem.setContentDescription(charSequence);
        }
    }

    public static void A05(MenuItem menuItem, CharSequence charSequence) {
        if (menuItem instanceof AI8) {
            ((AI8) menuItem).BlK(charSequence);
        } else if (Build.VERSION.SDK_INT >= 26) {
            menuItem.setTooltipText(charSequence);
        }
    }
}
