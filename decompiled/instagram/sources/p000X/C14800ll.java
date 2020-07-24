package p000X;

import android.content.res.Configuration;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import java.util.Locale;

/* renamed from: X.0ll  reason: invalid class name and case insensitive filesystem */
public abstract class C14800ll extends Resources {
    public final Resources A00;

    public void A00(Locale locale) {
        Configuration configuration = this.A00.getConfiguration();
        if (!locale.equals(configuration.locale)) {
            configuration.locale = locale;
            Resources resources = this.A00;
            resources.updateConfiguration(configuration, resources.getDisplayMetrics());
        }
        configuration.setLayoutDirection(locale);
        Locale.setDefault(locale);
        Configuration configuration2 = this.A00.getConfiguration();
        DisplayMetrics displayMetrics = this.A00.getDisplayMetrics();
        Configuration configuration3 = this.A00.getConfiguration();
        DisplayMetrics displayMetrics2 = this.A00.getDisplayMetrics();
        if (!configuration2.equals(configuration3)) {
            configuration2.setLocale(configuration3.locale);
        } else {
            configuration2 = configuration3;
        }
        if (displayMetrics.equals(getDisplayMetrics())) {
            displayMetrics = displayMetrics2;
        }
        updateConfiguration(configuration2, displayMetrics);
    }

    public C14800ll(Resources resources) {
        super(resources.getAssets(), resources.getDisplayMetrics(), resources.getConfiguration());
        this.A00 = resources;
    }
}
