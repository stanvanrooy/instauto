package com.facebook.fbreact.i18n;

import android.content.Context;
import com.facebook.fbreact.specs.NativeI18nSpec;
import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.module.annotations.ReactModule;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import p000X.A3L;
import p000X.A44;
import p000X.AnonymousClass19O;
import p000X.C11690fO;

@ReactModule(name = "I18n")
public class FbReactI18nModule extends NativeI18nSpec {
    public static final String NAME = "I18n";
    public final C11690fO mLocales;

    public static String readLocalizedJSONFile(Context context, int i) {
        InputStream inputStream = null;
        try {
            InputStream openRawResource = context.getResources().openRawResource(i);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            AnonymousClass19O.A01(openRawResource, byteArrayOutputStream);
            String str = new String(byteArrayOutputStream.toByteArray());
            if (openRawResource != null) {
                try {
                    openRawResource.close();
                } catch (IOException unused) {
                }
            }
            return str;
        } catch (IOException e) {
            throw new IllegalStateException("Could not read localized JSON file from resources", e);
        } catch (Throwable th) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException unused2) {
                }
            }
            throw th;
        }
    }

    public String getName() {
        return NAME;
    }

    public Map getTypedExportedConstants() {
        ReactMarker.logMarker(A3L.CREATE_I18N_MODULE_CONSTANTS_START);
        C11690fO r3 = this.mLocales;
        HashMap hashMap = new HashMap();
        Locale AG6 = r3.AG6();
        hashMap.put("localeIdentifier", AG6.toString());
        hashMap.put("localeCountryCode", AG6.getCountry());
        hashMap.put("fbLocaleIdentifier", r3.ALZ());
        HashMap hashMap2 = new HashMap();
        DecimalFormatSymbols instance = DecimalFormatSymbols.getInstance(AG6);
        hashMap2.put("decimalSeparator", String.valueOf(instance.getDecimalSeparator()));
        hashMap2.put("numberDelimiter", String.valueOf(instance.getGroupingSeparator()));
        hashMap2.put("minDigitsForThousandsSeparator", Integer.valueOf(((DecimalFormat) DecimalFormat.getInstance(AG6)).getGroupingSize()));
        hashMap.put("FallbackNumberFormatConfig", hashMap2);
        ReactMarker.logMarker(A3L.CREATE_I18N_MODULE_CONSTANTS_END);
        return hashMap;
    }

    public FbReactI18nModule(A44 a44, C11690fO r2) {
        super(a44);
        this.mLocales = r2;
    }
}
