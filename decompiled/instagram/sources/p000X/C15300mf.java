package p000X;

import android.content.res.Resources;
import android.os.Build;
import android.os.LocaleList;
import android.text.TextUtils;
import com.facebook.C0003R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

/* renamed from: X.0mf  reason: invalid class name and case insensitive filesystem */
public final class C15300mf {
    public static final C15310mg A00;
    public static final ArrayList A01 = new ArrayList(Arrays.asList(new C15310mg[]{new C15310mg("en-US", C0003R.string.no_translate_language_en_US, C0003R.string.language_en_US, Locale.US), new C15310mg("af-ZA", C0003R.string.no_translate_language_af_za, C0003R.string.language_af_za, new Locale("af", "ZA")), new C15310mg("ar-AR", C0003R.string.no_translate_language_ar_ar, C0003R.string.language_ar_ar, new Locale("ar", "AR")), new C15310mg("bg-BG", C0003R.string.no_translate_language_bg_bg, C0003R.string.language_bg_bg, new Locale("bg", "BG")), new C15310mg("cs-CZ", C0003R.string.no_translate_language_cs_cz, C0003R.string.language_cs_cz, new Locale("cs", "CZ")), new C15310mg("da-DK", C0003R.string.no_translate_language_da_dk, C0003R.string.language_da_dk, new Locale("da", "DK")), new C15310mg("de-DE", C0003R.string.no_translate_language_de_de, C0003R.string.language_de_de, Locale.GERMANY), new C15310mg("el-GR", C0003R.string.no_translate_language_el_gr, C0003R.string.language_el_gr, new Locale("el", "GR")), new C15310mg("en-GB", C0003R.string.no_translate_language_en_gb, C0003R.string.language_en_gb, Locale.UK), new C15310mg("es-ES", C0003R.string.no_translate_language_es_es, C0003R.string.language_es_es, new Locale("es", "ES")), new C15310mg("es-LA", C0003R.string.no_translate_language_es_la, C0003R.string.language_es_la, new Locale("es", "LA")), new C15310mg("fa-IR", C0003R.string.no_translate_language_fa_ir, C0003R.string.language_fa_ir, new Locale("fa", "IR")), new C15310mg("fi-FI", C0003R.string.no_translate_language_fi_fi, C0003R.string.language_fi_fi, new Locale("fi", "FI")), new C15310mg("fr-CA", C0003R.string.no_translate_language_fr_ca, C0003R.string.language_fr_ca, new Locale("fr", "CA")), new C15310mg("fr-FR", C0003R.string.no_translate_language_fr_fr, C0003R.string.language_fr_fr, Locale.FRANCE), new C15310mg("hr-HR", C0003R.string.no_translate_language_hr_hr, C0003R.string.language_hr_hr, new Locale("hr", "HR")), new C15310mg("hu-HU", C0003R.string.no_translate_language_hu_hu, C0003R.string.language_hu_hu, new Locale("hu", "HU")), new C15310mg("id-ID", C0003R.string.no_translate_language_id_id, C0003R.string.language_id_id, new Locale("id", "ID")), new C15310mg("he-IL", C0003R.string.no_translate_language_he_il, C0003R.string.language_he_il, new Locale("he", "IL")), A00, new C15310mg("it-IT", C0003R.string.no_translate_language_it_it, C0003R.string.language_it_it, Locale.ITALY), new C15310mg("ja-JP", C0003R.string.no_translate_language_ja_jp, C0003R.string.language_ja_jp, Locale.JAPAN), new C15310mg("ko-KR", C0003R.string.no_translate_language_ko_kr, C0003R.string.language_ko_kr, Locale.KOREA), new C15310mg("ms-MY", C0003R.string.no_translate_language_ms_my, C0003R.string.language_ms_my, new Locale("ms", "MY")), new C15310mg("nb-NO", C0003R.string.no_translate_language_nb_no, C0003R.string.language_nb_no, new Locale("nb", "NO")), new C15310mg("nl-NL", C0003R.string.no_translate_language_nl_nl, C0003R.string.language_nl_nl, new Locale("nl", "NL")), new C15310mg("pl-PL", C0003R.string.no_translate_language_pl_pl, C0003R.string.language_pl_pl, new Locale("pl", "PL")), new C15310mg("pt-BR", C0003R.string.no_translate_language_pt_br, C0003R.string.language_pt_br, new Locale("pt", "BR")), new C15310mg("pt-PT", C0003R.string.no_translate_language_pt_pt, C0003R.string.language_pt_pt, new Locale("pt", "PT")), new C15310mg("ro-RO", C0003R.string.no_translate_language_ro_ro, C0003R.string.language_ro_ro, new Locale("ro", "RO")), new C15310mg("ru-RU", C0003R.string.no_translate_language_ru_ru, C0003R.string.language_ru_ru, new Locale("ru", "RU")), new C15310mg("sv-SE", C0003R.string.no_translate_language_sv_se, C0003R.string.language_sv_se, new Locale("sv", "SE")), new C15310mg("sk-SK", C0003R.string.no_translate_language_sk_sk, C0003R.string.language_sk_sk, new Locale("sk", "SK")), new C15310mg("sr-RS", C0003R.string.no_translate_language_sr_rs, C0003R.string.language_sr_rs, new Locale("sr", "RS")), new C15310mg("th-TH", C0003R.string.no_translate_language_th_th, C0003R.string.language_th_th, new Locale("th", "TH")), new C15310mg("tl-PH", C0003R.string.no_translate_language_tl_ph, C0003R.string.language_tl_ph, new Locale("tl", "PH")), new C15310mg("tr-TR", C0003R.string.no_translate_language_tr_tr, C0003R.string.language_tr_tr, new Locale("tr", "TR")), new C15310mg("uk-UA", C0003R.string.no_translate_language_uk_ua, C0003R.string.language_uk_ua, new Locale("uk", "UA")), new C15310mg("vi-VN", C0003R.string.no_translate_language_vi_vn, C0003R.string.language_vi_vn, new Locale("vi", "VN")), new C15310mg("zh-CN", C0003R.string.no_translate_language_zh_cn, C0003R.string.language_zh_cn, Locale.SIMPLIFIED_CHINESE), new C15310mg("zh-HK", C0003R.string.no_translate_language_zh_hk, C0003R.string.language_zh_hk, new Locale("zh", "HK")), new C15310mg("zh-TW", C0003R.string.no_translate_language_zh_tw, C0003R.string.language_zh_tw, Locale.TAIWAN)}));
    public static final Locale A02;

    static {
        Locale locale = new Locale("hi", "IN");
        A02 = locale;
        A00 = new C15310mg("hi-IN", C0003R.string.no_translate_language_hi_in, C0003R.string.language_hi_in, locale);
    }

    public static String A01() {
        String string = C05760Lv.A01.A00.getString("fb_language_locale", (String) null);
        if (!TextUtils.isEmpty(string)) {
            return string;
        }
        if (Build.VERSION.SDK_INT >= 24) {
            return A02();
        }
        A04().equals(A02);
        return null;
    }

    public static boolean A06() {
        if (Locale.GERMANY.getCountry().equalsIgnoreCase(A03().getCountry()) || Locale.GERMANY.getCountry().equalsIgnoreCase(A04().getCountry())) {
            return true;
        }
        return false;
    }

    public static String A00() {
        return C15320mh.A01(A03());
    }

    public static String A02() {
        LocaleList locales = Resources.getSystem().getConfiguration().getLocales();
        Locale locale = A02;
        ArrayList arrayList = new ArrayList(A01);
        String[] strArr = new String[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            strArr[i] = C15320mh.A00(((C15310mg) arrayList.get(i)).A03.toString());
        }
        locale.equals(locales.getFirstMatch(strArr));
        return null;
    }

    public static Locale A03() {
        return C11540f8.A00().A01().A00.getConfiguration().locale;
    }

    public static Locale A04() {
        return Resources.getSystem().getConfiguration().locale;
    }

    public static void A05() {
        Locale locale;
        String A012 = A01();
        C14300kE.A00 = null;
        if (!TextUtils.isEmpty(A012)) {
            C05940Nb.A00 = A012;
            if (A012.contains("-")) {
                locale = new Locale(A012.substring(0, 2), A012.substring(3));
            } else {
                locale = new Locale(A012);
            }
            C11540f8.A00().A01().A00(locale);
            return;
        }
        C11540f8.A00().A01().A00(A04());
        C05940Nb.A00 = null;
    }
}
