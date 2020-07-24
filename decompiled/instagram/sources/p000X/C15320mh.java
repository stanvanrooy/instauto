package p000X;

import android.os.Build;
import com.facebook.common.dextricks.OdexSchemeArtXdex;
import com.facebook.react.modules.camera.CameraRollManager;
import java.util.Locale;

/* renamed from: X.0mh  reason: invalid class name and case insensitive filesystem */
public final class C15320mh {
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x025a, code lost:
        if (r12.equals("la_VA") == false) goto L_0x002f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x0266, code lost:
        if (r12.equals("ku_TR") == false) goto L_0x002f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x0272, code lost:
        if (r12.equals("ko_KR") == false) goto L_0x002f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x027e, code lost:
        if (r12.equals("kn_IN") == false) goto L_0x002f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x028a, code lost:
        if (r12.equals("km_KH") == false) goto L_0x002f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x0296, code lost:
        if (r12.equals("ka_GE") == false) goto L_0x002f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x02a2, code lost:
        if (r12.equals("jv_ID") == false) goto L_0x002f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x02ae, code lost:
        if (r12.equals("ja_JP") == false) goto L_0x002f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x02ba, code lost:
        if (r12.equals("it_IT") == false) goto L_0x002f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x02c6, code lost:
        if (r12.equals("is_IS") == false) goto L_0x002f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x003f, code lost:
        if (r12.equals("zu_ZA") == false) goto L_0x002f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x02d2, code lost:
        if (r12.equals("id_ID") == false) goto L_0x002f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x02de, code lost:
        if (r12.equals("hy_AM") == false) goto L_0x002f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x02ea, code lost:
        if (r12.equals("hu_HU") == false) goto L_0x002f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x02f6, code lost:
        if (r12.equals("hr_HR") == false) goto L_0x002f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x0302, code lost:
        if (r12.equals("hi_IN") == false) goto L_0x002f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x030e, code lost:
        if (r12.equals("he_IL") == false) goto L_0x002f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x031a, code lost:
        if (r12.equals("ha_NG") == false) goto L_0x002f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x0326, code lost:
        if (r12.equals("gu_IN") == false) goto L_0x002f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x0332, code lost:
        if (r12.equals("gn_PY") == false) goto L_0x002f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x033e, code lost:
        if (r12.equals("gl_ES") == false) goto L_0x002f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0048, code lost:
        if (r12.equals("zh_TW") == false) goto L_0x002f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x034a, code lost:
        if (r12.equals("ga_IE") == false) goto L_0x002f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x0356, code lost:
        if (r12.equals("fy_NL") == false) goto L_0x002f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x0362, code lost:
        if (r12.equals("fr_FR") == false) goto L_0x002f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x036c, code lost:
        if (r12.equals("fr_CA") == false) goto L_0x002f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x0378, code lost:
        if (r12.equals("fo_FO") == false) goto L_0x002f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x0384, code lost:
        if (r12.equals("fi_FI") == false) goto L_0x002f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x038e, code lost:
        if (r12.equals("fb_LS") == false) goto L_0x002f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x039a, code lost:
        if (r12.equals("fb_HA") == false) goto L_0x002f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x03a6, code lost:
        if (r12.equals("fa_IR") == false) goto L_0x002f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x03b2, code lost:
        if (r12.equals("eu_ES") == false) goto L_0x002f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0051, code lost:
        if (r12.equals("zh_HK") == false) goto L_0x002f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x03be, code lost:
        if (r12.equals("et_EE") == false) goto L_0x002f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x03c8, code lost:
        if (r12.equals("es_LA") != false) goto L_0x0030;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x03d2, code lost:
        if (r12.equals("es_ES") == false) goto L_0x002f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x03de, code lost:
        if (r12.equals("eo_EO") == false) goto L_0x002f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x03e8, code lost:
        if (r12.equals("en_GB") == false) goto L_0x002f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x03f4, code lost:
        if (r12.equals("el_GR") == false) goto L_0x002f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x0400, code lost:
        if (r12.equals("de_DE") == false) goto L_0x002f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x040c, code lost:
        if (r12.equals("da_DK") == false) goto L_0x002f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x0418, code lost:
        if (r12.equals("cy_GB") == false) goto L_0x002f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x0424, code lost:
        if (r12.equals("cx_PH") == false) goto L_0x002f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x005a, code lost:
        if (r12.equals("zh_CN") == false) goto L_0x002f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x0430, code lost:
        if (r12.equals("cs_CZ") == false) goto L_0x002f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x043c, code lost:
        if (r12.equals("ck_US") == false) goto L_0x002f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x0448, code lost:
        if (r12.equals("cb_IQ") == false) goto L_0x002f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x0454, code lost:
        if (r12.equals("ca_ES") == false) goto L_0x002f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:0x0460, code lost:
        if (r12.equals("bs_BA") == false) goto L_0x002f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:0x046b, code lost:
        if (r12.equals("bn_IN") == false) goto L_0x002f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x0476, code lost:
        if (r12.equals("bg_BG") == false) goto L_0x002f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x0481, code lost:
        if (r12.equals("be_BY") == false) goto L_0x002f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:0x048c, code lost:
        if (r12.equals("az_AZ") == false) goto L_0x002f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:0x0497, code lost:
        if (r12.equals("as_IN") == false) goto L_0x002f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0066, code lost:
        if (r12.equals("wo_SN") == false) goto L_0x002f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:201:0x04a2, code lost:
        if (r12.equals("ar_AR") == false) goto L_0x002f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:203:0x04ad, code lost:
        if (r12.equals("am_ET") == false) goto L_0x002f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:205:0x04b8, code lost:
        if (r12.equals("af_ZA") == false) goto L_0x002f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0072, code lost:
        if (r12.equals("vi_VN") == false) goto L_0x002f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x007e, code lost:
        if (r12.equals("ur_PK") == false) goto L_0x002f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x008a, code lost:
        if (r12.equals("uk_UA") == false) goto L_0x002f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0096, code lost:
        if (r12.equals("tr_TR") == false) goto L_0x002f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x009f, code lost:
        if (r12.equals("tl_PH") == false) goto L_0x002f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00ab, code lost:
        if (r12.equals("th_TH") == false) goto L_0x002f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00b7, code lost:
        if (r12.equals("te_IN") == false) goto L_0x002f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00c4, code lost:
        if (r12.equals("ta_IN") == false) goto L_0x002f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00d1, code lost:
        if (r12.equals("sw_KE") == false) goto L_0x002f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00de, code lost:
        if (r12.equals("sv_SE") == false) goto L_0x002f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00eb, code lost:
        if (r12.equals("sr_RS") == false) goto L_0x002f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00f8, code lost:
        if (r12.equals("sq_AL") == false) goto L_0x002f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0105, code lost:
        if (r12.equals("sn_ZW") == false) goto L_0x002f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0112, code lost:
        if (r12.equals("sl_SI") == false) goto L_0x002f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x011f, code lost:
        if (r12.equals("sk_SK") == false) goto L_0x002f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x012c, code lost:
        if (r12.equals("si_LK") == false) goto L_0x002f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0139, code lost:
        if (r12.equals("rw_RW") == false) goto L_0x002f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0146, code lost:
        if (r12.equals("ru_RU") == false) goto L_0x002f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0153, code lost:
        if (r12.equals("ro_RO") == false) goto L_0x002f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0160, code lost:
        if (r12.equals("qz_MM") == false) goto L_0x002f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x016a, code lost:
        if (r12.equals("pt_PT") == false) goto L_0x002f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0176, code lost:
        if (r12.equals("pt_BR") == false) goto L_0x002f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0182, code lost:
        if (r12.equals("ps_AF") == false) goto L_0x002f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x018e, code lost:
        if (r12.equals("pl_PL") == false) goto L_0x002f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x019a, code lost:
        if (r12.equals("pa_IN") == false) goto L_0x002f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x01a6, code lost:
        if (r12.equals("or_IN") == false) goto L_0x002f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x01b2, code lost:
        if (r12.equals("nn_NO") == false) goto L_0x002f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x01be, code lost:
        if (r12.equals("nl_NL") == false) goto L_0x002f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x01ca, code lost:
        if (r12.equals("ne_NP") == false) goto L_0x002f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x01d6, code lost:
        if (r12.equals("nb_NO") == false) goto L_0x002f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01e2, code lost:
        if (r12.equals("my_MM") == false) goto L_0x002f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01ee, code lost:
        if (r12.equals("ms_MY") == false) goto L_0x002f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x01fa, code lost:
        if (r12.equals("mr_IN") == false) goto L_0x002f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0206, code lost:
        if (r12.equals("mn_MN") == false) goto L_0x002f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0212, code lost:
        if (r12.equals("ml_IN") == false) goto L_0x002f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x021e, code lost:
        if (r12.equals("mk_MK") == false) goto L_0x002f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x022a, code lost:
        if (r12.equals("mg_MG") == false) goto L_0x002f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0236, code lost:
        if (r12.equals("lv_LV") == false) goto L_0x002f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x0242, code lost:
        if (r12.equals("lt_LT") == false) goto L_0x002f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x024e, code lost:
        if (r12.equals("lo_LA") == false) goto L_0x002f;
     */
    public static String A00(String str) {
        char c = 21;
        if (!"tl_PH".equals(str)) {
            switch (str.hashCode()) {
                case 92714369:
                    c = 0;
                    break;
                case 92922274:
                    c = 1;
                    break;
                case 93071103:
                    c = 2;
                    break;
                case 93101138:
                    c = 3;
                    break;
                case 93309439:
                    c = 4;
                    break;
                case 93607379:
                    c = 5;
                    break;
                case 93666943:
                    c = 6;
                    break;
                case 93875704:
                    c = 7;
                    break;
                case 94024429:
                    c = 8;
                    break;
                case 94411823:
                    c = 9;
                    break;
                case 94441736:
                    c = 10;
                    break;
                case 94710229:
                    c = 11;
                    break;
                case 94948006:
                    c = 12;
                    break;
                case 95097346:
                    c = 13;
                    break;
                case 95126852:
                    c = 14;
                    break;
                case 95335305:
                    c = 15;
                    break;
                case 95454463:
                    c = 16;
                    break;
                case 96586627:
                    c = 17;
                    break;
                case 96646193:
                    c = 18;
                    break;
                case 96675935:
                    c = 19;
                    break;
                case 96795103:
                    c = 20;
                    break;
                case 96795302:
                    break;
                case 96824880:
                    c = 22;
                    break;
                case 96854685:
                    c = 23;
                    break;
                case 97182509:
                    c = 24;
                    break;
                case 97212252:
                    c = 25;
                    break;
                case 97212394:
                    c = 26;
                    break;
                case 97420735:
                    c = 27;
                    break;
                case 97599487:
                    c = 28;
                    break;
                case 97688753:
                    c = 29;
                    break;
                case 97688863:
                    c = 30;
                    break;
                case 97897642:
                    c = 31;
                    break;
                case 98106017:
                    c = ' ';
                    break;
                case 98433608:
                    c = '!';
                    break;
                case 98493537:
                    c = '\"';
                    break;
                case 98701846:
                    c = '#';
                    break;
                case 99029695:
                    c = '$';
                    break;
                case 99148709:
                    c = '%';
                    break;
                case 99267875:
                    c = '&';
                    break;
                case 99535967:
                    c = '\'';
                    break;
                case 99625343:
                    c = '(';
                    break;
                case 99744282:
                    c = ')';
                    break;
                case 100042431:
                    c = '*';
                    break;
                case 100489311:
                    c = '+';
                    break;
                case 100519103:
                    c = ',';
                    break;
                case 100876622:
                    c = '-';
                    break;
                case 101502190:
                    c = '.';
                    break;
                case 101800039:
                    c = '/';
                    break;
                case 102157658:
                    c = '0';
                    break;
                case 102187393:
                    c = '1';
                    break;
                case 102217250:
                    c = '2';
                    break;
                case 102396275:
                    c = '3';
                    break;
                case 102724021:
                    c = '4';
                    break;
                case 103140785:
                    c = '5';
                    break;
                case 103289759:
                    c = '6';
                    break;
                case 103349343:
                    c = '7';
                    break;
                case 103826015:
                    c = '8';
                    break;
                case 103945183:
                    c = '9';
                    break;
                case 103974853:
                    c = ':';
                    break;
                case 104034559:
                    c = ';';
                    break;
                case 104153599:
                    c = '<';
                    break;
                case 104183525:
                    c = '=';
                    break;
                case 104362259:
                    c = '>';
                    break;
                case 104600620:
                    c = '?';
                    break;
                case 104689994:
                    c = '@';
                    break;
                case 104898527:
                    c = 'A';
                    break;
                case 104958112:
                    c = 'B';
                    break;
                case 106000641:
                    c = 'C';
                    break;
                case 106417715:
                    c = 'D';
                    break;
                case 106745631:
                    c = 'E';
                    break;
                case 106953697:
                    c = 'F';
                    break;
                case 106983531:
                    c = 'G';
                    break;
                case 106983967:
                    c = 'H';
                    break;
                case 108086134:
                    c = 'I';
                    break;
                case 108682111:
                    c = 'J';
                    break;
                case 108860863:
                    c = 'K';
                    break;
                case 108920447:
                    c = 'L';
                    break;
                case 109426696:
                    c = 'M';
                    break;
                case 109486495:
                    c = 'N';
                    break;
                case 109516284:
                    c = 'O';
                    break;
                case 109576097:
                    c = 'P';
                    break;
                case 109664684:
                    c = 'Q';
                    break;
                case 109695009:
                    c = 'R';
                    break;
                case 109814190:
                    c = 'S';
                    break;
                case 109843733:
                    c = 'T';
                    break;
                case 110111799:
                    c = 'U';
                    break;
                case 110230963:
                    c = 'V';
                    break;
                case 110320671:
                    c = 'W';
                    break;
                case 110439711:
                    c = 'X';
                    break;
                case 110618591:
                    c = 'Y';
                    break;
                case 111333589:
                    c = 'Z';
                    break;
                case 111541981:
                    c = '[';
                    break;
                case 112197572:
                    c = '\\';
                    break;
                case 113299746:
                    c = ']';
                    break;
                case 115861276:
                    c = '^';
                    break;
                case 115861428:
                    c = '_';
                    break;
                case 115861812:
                    c = '`';
                    break;
                case 116249259:
                    c = 'a';
                    break;
                default:
                    c = 65535;
                    break;
            }
            switch (c) {
                case 0:
                    return "af";
                case 1:
                    return "am";
                case 2:
                    return "ar";
                case 3:
                    return "as";
                case 4:
                    return "az";
                case 5:
                    return "be";
                case 6:
                    return "bg";
                case 7:
                    return "bn";
                case 8:
                    return "bs";
                case 9:
                    return "ca";
                case 10:
                    return "cb";
                case C120125Dh.VIEW_TYPE_BANNER /*11*/:
                    return "ck";
                case C120125Dh.VIEW_TYPE_SPINNER /*12*/:
                    return "cs";
                case C120125Dh.VIEW_TYPE_BADGE /*13*/:
                    return "cx";
                case C120125Dh.VIEW_TYPE_LINK /*14*/:
                    return "cy";
                case 15:
                    return "da";
                case 16:
                    return "de";
                case C120125Dh.VIEW_TYPE_CUSTOM_ITEM /*17*/:
                    return "el";
                case 18:
                    return "en_GB";
                case 19:
                    return "eo";
                case 20:
                    return "es_ES";
                case C120125Dh.VIEW_TYPE_BRANDING /*21*/:
                    return "es";
                case C120125Dh.NUM_VIEW_TYPES /*22*/:
                    return "et";
                case 23:
                    return "eu";
                case 24:
                    return "fa";
                case 25:
                    return "fb";
                case OdexSchemeArtXdex.OREO_SDK_INT /*26*/:
                    return "fb_LS";
                case 27:
                    return "fi";
                case 28:
                    return "fo";
                case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /*29*/:
                    return "fr_CA";
                case 30:
                    return "fr";
                case 31:
                    return "fy";
                case ' ':
                    return "ga";
                case '!':
                    return "gl";
                case '\"':
                    return "gn";
                case '#':
                    return "gu";
                case '$':
                    return "ha";
                case '%':
                    return "iw";
                case '&':
                    return "hi";
                case '\'':
                    return "hr";
                case '(':
                    return "hu";
                case ')':
                    return "hy";
                case '*':
                    return "in";
                case '+':
                    return "is";
                case ',':
                    return "it";
                case '-':
                    return "ja";
                case '.':
                    return "jv";
                case '/':
                    return "ka";
                case '0':
                    return "km";
                case '1':
                    return "kn";
                case AMD.MAX_LIKES_PER_FETCH /*50*/:
                    return "ko";
                case '3':
                    return "ku";
                case '4':
                    return "la";
                case '5':
                    return "lo";
                case '6':
                    return "lt";
                case '7':
                    return "lv";
                case '8':
                    return "mg";
                case '9':
                    return "mk";
                case ':':
                    return "ml";
                case ';':
                    return "mn";
                case '<':
                    return "mr";
                case '=':
                    return "ms";
                case '>':
                    return "my";
                case '?':
                    return "nb";
                case '@':
                    return "ne";
                case 'A':
                    return "nl";
                case 'B':
                    return "nn";
                case 'C':
                    return "or";
                case 'D':
                    return "pa";
                case 'E':
                    return "pl";
                case 'F':
                    return "ps";
                case 'G':
                    return "pt";
                case 'H':
                    return "pt_PT";
                case 'I':
                    return "qz";
                case 'J':
                    return "ro";
                case 'K':
                    return "ru";
                case 'L':
                    return "rw";
                case 'M':
                    return "si";
                case 'N':
                    return "sk";
                case 'O':
                    return "sl";
                case 'P':
                    return "sn";
                case 'Q':
                    return "sq";
                case 'R':
                    return "sr";
                case 'S':
                    return "sv";
                case 'T':
                    return "sw";
                case 'U':
                    return "ta";
                case 'V':
                    return "te";
                case 'W':
                    return "th";
                case 'X':
                    return "tl";
                case 'Y':
                    return "tr";
                case 'Z':
                    return "uk";
                case '[':
                    return "ur";
                case '\\':
                    return "vi";
                case ']':
                    return "wo";
                case '^':
                    return "zh_CN";
                case '_':
                    return "zh_HK";
                case '`':
                    return "zh_TW";
                case 'a':
                    return "zu";
                default:
                    return "en";
            }
        } else if (Build.VERSION.SDK_INT >= 21) {
            return "fil";
        } else {
            return "tl";
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x019f, code lost:
        if (r0 == false) goto L_0x0030;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x01ac, code lost:
        if (r0 == false) goto L_0x0030;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x01b9, code lost:
        if (r0 == false) goto L_0x0030;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x01c6, code lost:
        if (r0 == false) goto L_0x0030;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x01d3, code lost:
        if (r0 == false) goto L_0x0030;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x01e0, code lost:
        if (r0 == false) goto L_0x0030;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x01ed, code lost:
        if (r0 == false) goto L_0x0030;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x01fa, code lost:
        if (r0 == false) goto L_0x0030;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x0207, code lost:
        if (r0 == false) goto L_0x0030;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x0214, code lost:
        if (r0 == false) goto L_0x0030;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x0221, code lost:
        if (r0 == false) goto L_0x0030;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x022e, code lost:
        if (r0 == false) goto L_0x0030;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x023b, code lost:
        if (r0 == false) goto L_0x0030;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x0248, code lost:
        if (r0 == false) goto L_0x0030;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x0255, code lost:
        if (r0 == false) goto L_0x0030;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x0262, code lost:
        if (r0 == false) goto L_0x0030;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x026f, code lost:
        if (r0 == false) goto L_0x0030;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x027c, code lost:
        if (r0 == false) goto L_0x0030;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x0289, code lost:
        if (r0 == false) goto L_0x0030;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x0296, code lost:
        if (r0 == false) goto L_0x0030;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x02a3, code lost:
        if (r0 == false) goto L_0x0030;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x02b0, code lost:
        if (r0 == false) goto L_0x0030;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x02bd, code lost:
        if (r0 == false) goto L_0x0030;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x02ca, code lost:
        if (r0 == false) goto L_0x0030;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x02d6, code lost:
        if (r0 == false) goto L_0x0030;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x02e2, code lost:
        if (r0 == false) goto L_0x0030;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x02ee, code lost:
        if (r0 == false) goto L_0x0030;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x02fa, code lost:
        if (r0 == false) goto L_0x0030;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x0306, code lost:
        if (r0 == false) goto L_0x0030;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x0312, code lost:
        if (r0 == false) goto L_0x0030;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x031e, code lost:
        if (r0 == false) goto L_0x0030;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x032a, code lost:
        if (r0 == false) goto L_0x0030;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x0336, code lost:
        if (r0 == false) goto L_0x0030;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x0342, code lost:
        if (r0 == false) goto L_0x0030;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x034e, code lost:
        if (r0 == false) goto L_0x0030;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x035a, code lost:
        if (r0 == false) goto L_0x0030;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x0366, code lost:
        if (r0 == false) goto L_0x0030;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x0372, code lost:
        if (r0 == false) goto L_0x0030;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x037e, code lost:
        if (r0 == false) goto L_0x0030;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x038a, code lost:
        if (r0 == false) goto L_0x0030;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x0396, code lost:
        if (r0 == false) goto L_0x0030;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x03a2, code lost:
        if (r0 == false) goto L_0x0030;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:0x03ae, code lost:
        if (r0 == false) goto L_0x0030;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:0x03ba, code lost:
        if (r0 == false) goto L_0x0030;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x03c6, code lost:
        if (r0 == false) goto L_0x0030;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x03d2, code lost:
        if (r0 == false) goto L_0x0030;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:0x03de, code lost:
        if (r0 == false) goto L_0x0030;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:0x03ea, code lost:
        if (r0 == false) goto L_0x0030;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:201:0x03f6, code lost:
        if (r0 == false) goto L_0x0030;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:203:0x0402, code lost:
        if (r0 == false) goto L_0x0030;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:205:0x040e, code lost:
        if (r0 == false) goto L_0x0030;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:207:0x041a, code lost:
        if (r0 == false) goto L_0x0030;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:209:0x0426, code lost:
        if (r0 == false) goto L_0x0030;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:211:0x0432, code lost:
        if (r0 == false) goto L_0x0030;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:213:0x043e, code lost:
        if (r0 == false) goto L_0x0030;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:215:0x044a, code lost:
        if (r0 == false) goto L_0x0030;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:217:0x0456, code lost:
        if (r0 == false) goto L_0x0030;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:219:0x0462, code lost:
        if (r0 == false) goto L_0x0030;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:221:0x046e, code lost:
        if (r0 == false) goto L_0x0030;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:223:0x047a, code lost:
        if (r0 == false) goto L_0x0030;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:225:0x0486, code lost:
        if (r0 == false) goto L_0x0030;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:227:0x0492, code lost:
        if (r0 == false) goto L_0x0030;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:229:0x049e, code lost:
        if (r0 == false) goto L_0x0030;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:231:0x04aa, code lost:
        if (r0 == false) goto L_0x0030;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:233:0x04b6, code lost:
        if (r0 == false) goto L_0x0030;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:235:0x04c2, code lost:
        if (r0 == false) goto L_0x0030;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:237:0x04ce, code lost:
        if (r0 == false) goto L_0x0030;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:239:0x04da, code lost:
        if (r0 == false) goto L_0x0030;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:241:0x04e6, code lost:
        if (r0 == false) goto L_0x0030;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:243:0x04f2, code lost:
        if (r0 == false) goto L_0x0030;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:245:0x04fe, code lost:
        if (r0 == false) goto L_0x0030;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:247:0x050a, code lost:
        if (r0 == false) goto L_0x0030;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:249:0x0516, code lost:
        if (r0 == false) goto L_0x0030;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:251:0x0522, code lost:
        if (r0 == false) goto L_0x0030;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:253:0x052e, code lost:
        if (r0 == false) goto L_0x0030;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:255:0x053a, code lost:
        if (r0 == false) goto L_0x0030;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:257:0x0546, code lost:
        if (r0 == false) goto L_0x0030;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:259:0x0552, code lost:
        if (r0 == false) goto L_0x0030;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:261:0x055e, code lost:
        if (r0 == false) goto L_0x0030;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:263:0x056a, code lost:
        if (r0 == false) goto L_0x0030;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:265:0x0576, code lost:
        if (r0 == false) goto L_0x0030;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:267:0x0582, code lost:
        if (r0 == false) goto L_0x0030;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:269:0x058e, code lost:
        if (r0 == false) goto L_0x0030;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:271:0x059a, code lost:
        if (r0 == false) goto L_0x0030;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:273:0x05a5, code lost:
        if (r0 == false) goto L_0x0030;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:275:0x05b0, code lost:
        if (r0 == false) goto L_0x0030;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:277:0x05bb, code lost:
        if (r0 == false) goto L_0x0030;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:279:0x05c6, code lost:
        if (r0 == false) goto L_0x0030;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:281:0x05d1, code lost:
        if (r0 == false) goto L_0x0030;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:283:0x05dc, code lost:
        if (r0 == false) goto L_0x0030;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:285:0x05e7, code lost:
        if (r0 == false) goto L_0x0030;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:287:0x05f2, code lost:
        if (r0 == false) goto L_0x0030;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:296:0x0610, code lost:
        if (r0 == false) goto L_0x001e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:298:0x0619, code lost:
        if (r0 == false) goto L_0x001e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:300:0x0622, code lost:
        if (r0 == false) goto L_0x001e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:302:0x062b, code lost:
        if (r0 == false) goto L_0x001e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:304:0x0634, code lost:
        if (r0 == false) goto L_0x001e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:306:0x063d, code lost:
        if (r0 == false) goto L_0x001e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:308:0x0646, code lost:
        if (r0 == false) goto L_0x001e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:310:0x064f, code lost:
        if (r0 == false) goto L_0x001e;
     */
    public static String A01(Locale locale) {
        char c;
        char c2;
        String locale2 = locale.toString();
        String str = "zh_TW";
        switch (locale2.hashCode()) {
            case 96646193:
                boolean equals = locale2.equals("en_GB");
                c = 0;
                break;
            case 96795103:
                boolean equals2 = locale2.equals("es_ES");
                c = 1;
                break;
            case 97212394:
                boolean equals3 = locale2.equals("fb_LS");
                c = 2;
                break;
            case 97688753:
                boolean equals4 = locale2.equals("fr_CA");
                c = 3;
                break;
            case 106983967:
                boolean equals5 = locale2.equals("pt_PT");
                c = 4;
                break;
            case 115861276:
                boolean equals6 = locale2.equals("zh_CN");
                c = 5;
                break;
            case 115861428:
                boolean equals7 = locale2.equals("zh_HK");
                c = 6;
                break;
            case 115861812:
                boolean equals8 = locale2.equals(str);
                c = 7;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
                str = "en_GB";
                break;
            case 1:
                str = "es_ES";
                break;
            case 2:
                str = "fb_LS";
                break;
            case 3:
                str = "fr_CA";
                break;
            case 4:
                str = "pt_PT";
                break;
            case 5:
                str = "zh_CN";
                break;
            case 6:
                str = "zh_HK";
                break;
            case 7:
                break;
            default:
                str = null;
                break;
        }
        if (str == null) {
            String language = locale.getLanguage();
            switch (language.hashCode()) {
                case 3109:
                    boolean equals9 = language.equals("af");
                    c2 = 0;
                    break;
                case 3116:
                    boolean equals10 = language.equals("am");
                    c2 = 1;
                    break;
                case 3121:
                    boolean equals11 = language.equals("ar");
                    c2 = 2;
                    break;
                case 3122:
                    boolean equals12 = language.equals("as");
                    c2 = 3;
                    break;
                case 3129:
                    boolean equals13 = language.equals("az");
                    c2 = 4;
                    break;
                case 3139:
                    boolean equals14 = language.equals("be");
                    c2 = 5;
                    break;
                case 3141:
                    boolean equals15 = language.equals("bg");
                    c2 = 6;
                    break;
                case 3148:
                    boolean equals16 = language.equals("bn");
                    c2 = 7;
                    break;
                case 3153:
                    boolean equals17 = language.equals("bs");
                    c2 = 8;
                    break;
                case 3166:
                    boolean equals18 = language.equals("ca");
                    c2 = 9;
                    break;
                case 3167:
                    boolean equals19 = language.equals("cb");
                    c2 = 10;
                    break;
                case 3176:
                    boolean equals20 = language.equals("ck");
                    c2 = 11;
                    break;
                case 3184:
                    boolean equals21 = language.equals("cs");
                    c2 = 12;
                    break;
                case 3189:
                    boolean equals22 = language.equals("cx");
                    c2 = 13;
                    break;
                case 3190:
                    boolean equals23 = language.equals("cy");
                    c2 = 14;
                    break;
                case 3197:
                    boolean equals24 = language.equals("da");
                    c2 = 15;
                    break;
                case 3201:
                    boolean equals25 = language.equals("de");
                    c2 = 16;
                    break;
                case 3239:
                    boolean equals26 = language.equals("el");
                    c2 = 17;
                    break;
                case 3242:
                    boolean equals27 = language.equals("eo");
                    c2 = 18;
                    break;
                case 3246:
                    boolean equals28 = language.equals("es");
                    c2 = 19;
                    break;
                case 3247:
                    boolean equals29 = language.equals("et");
                    c2 = 20;
                    break;
                case 3248:
                    boolean equals30 = language.equals("eu");
                    c2 = 21;
                    break;
                case 3259:
                    boolean equals31 = language.equals("fa");
                    c2 = 22;
                    break;
                case 3260:
                    boolean equals32 = language.equals("fb");
                    c2 = 23;
                    break;
                case 3267:
                    boolean equals33 = language.equals("fi");
                    c2 = 24;
                    break;
                case 3273:
                    boolean equals34 = language.equals("fo");
                    c2 = 26;
                    break;
                case 3276:
                    boolean equals35 = language.equals("fr");
                    c2 = 27;
                    break;
                case 3283:
                    boolean equals36 = language.equals("fy");
                    c2 = 28;
                    break;
                case 3290:
                    boolean equals37 = language.equals("ga");
                    c2 = 29;
                    break;
                case 3301:
                    boolean equals38 = language.equals("gl");
                    c2 = 30;
                    break;
                case 3303:
                    boolean equals39 = language.equals("gn");
                    c2 = 31;
                    break;
                case 3310:
                    boolean equals40 = language.equals("gu");
                    c2 = ' ';
                    break;
                case 3321:
                    boolean equals41 = language.equals("ha");
                    c2 = '!';
                    break;
                case 3329:
                    boolean equals42 = language.equals("hi");
                    c2 = '\"';
                    break;
                case 3338:
                    boolean equals43 = language.equals("hr");
                    c2 = '#';
                    break;
                case 3341:
                    boolean equals44 = language.equals("hu");
                    c2 = '$';
                    break;
                case 3345:
                    boolean equals45 = language.equals("hy");
                    c2 = '%';
                    break;
                case 3365:
                    boolean equals46 = language.equals("in");
                    c2 = '&';
                    break;
                case 3370:
                    boolean equals47 = language.equals("is");
                    c2 = '\'';
                    break;
                case 3371:
                    boolean equals48 = language.equals("it");
                    c2 = '(';
                    break;
                case 3374:
                    boolean equals49 = language.equals("iw");
                    c2 = ')';
                    break;
                case 3383:
                    boolean equals50 = language.equals("ja");
                    c2 = '*';
                    break;
                case 3404:
                    boolean equals51 = language.equals("jv");
                    c2 = '+';
                    break;
                case 3414:
                    boolean equals52 = language.equals("ka");
                    c2 = ',';
                    break;
                case 3426:
                    boolean equals53 = language.equals("km");
                    c2 = '-';
                    break;
                case 3427:
                    boolean equals54 = language.equals("kn");
                    c2 = '.';
                    break;
                case 3428:
                    boolean equals55 = language.equals("ko");
                    c2 = '/';
                    break;
                case 3434:
                    boolean equals56 = language.equals("ku");
                    c2 = '0';
                    break;
                case 3445:
                    boolean equals57 = language.equals("la");
                    c2 = '1';
                    break;
                case 3459:
                    boolean equals58 = language.equals("lo");
                    c2 = '2';
                    break;
                case 3464:
                    boolean equals59 = language.equals("lt");
                    c2 = '3';
                    break;
                case 3466:
                    boolean equals60 = language.equals("lv");
                    c2 = '4';
                    break;
                case 3482:
                    boolean equals61 = language.equals("mg");
                    c2 = '5';
                    break;
                case 3486:
                    boolean equals62 = language.equals("mk");
                    c2 = '6';
                    break;
                case 3487:
                    boolean equals63 = language.equals("ml");
                    c2 = '7';
                    break;
                case 3489:
                    boolean equals64 = language.equals("mn");
                    c2 = '8';
                    break;
                case 3493:
                    boolean equals65 = language.equals("mr");
                    c2 = '9';
                    break;
                case 3494:
                    boolean equals66 = language.equals("ms");
                    c2 = ':';
                    break;
                case 3500:
                    boolean equals67 = language.equals("my");
                    c2 = ';';
                    break;
                case 3508:
                    boolean equals68 = language.equals("nb");
                    c2 = '<';
                    break;
                case 3511:
                    boolean equals69 = language.equals("ne");
                    c2 = '=';
                    break;
                case 3518:
                    boolean equals70 = language.equals("nl");
                    c2 = '>';
                    break;
                case 3520:
                    boolean equals71 = language.equals("nn");
                    c2 = '?';
                    break;
                case 3555:
                    boolean equals72 = language.equals("or");
                    c2 = '@';
                    break;
                case 3569:
                    boolean equals73 = language.equals("pa");
                    c2 = 'A';
                    break;
                case 3580:
                    boolean equals74 = language.equals("pl");
                    c2 = 'B';
                    break;
                case 3587:
                    boolean equals75 = language.equals("ps");
                    c2 = 'C';
                    break;
                case 3588:
                    boolean equals76 = language.equals("pt");
                    c2 = 'D';
                    break;
                case 3625:
                    boolean equals77 = language.equals("qz");
                    c2 = 'E';
                    break;
                case 3645:
                    boolean equals78 = language.equals("ro");
                    c2 = 'F';
                    break;
                case 3651:
                    boolean equals79 = language.equals("ru");
                    c2 = 'G';
                    break;
                case 3653:
                    boolean equals80 = language.equals("rw");
                    c2 = 'H';
                    break;
                case 3670:
                    boolean equals81 = language.equals("si");
                    c2 = 'I';
                    break;
                case 3672:
                    boolean equals82 = language.equals("sk");
                    c2 = 'J';
                    break;
                case 3673:
                    boolean equals83 = language.equals("sl");
                    c2 = 'K';
                    break;
                case 3675:
                    boolean equals84 = language.equals("sn");
                    c2 = 'L';
                    break;
                case 3678:
                    boolean equals85 = language.equals("sq");
                    c2 = 'M';
                    break;
                case 3679:
                    boolean equals86 = language.equals("sr");
                    c2 = 'N';
                    break;
                case 3683:
                    boolean equals87 = language.equals("sv");
                    c2 = 'O';
                    break;
                case 3684:
                    boolean equals88 = language.equals("sw");
                    c2 = 'P';
                    break;
                case 3693:
                    boolean equals89 = language.equals("ta");
                    c2 = 'Q';
                    break;
                case 3697:
                    boolean equals90 = language.equals("te");
                    c2 = 'R';
                    break;
                case 3700:
                    boolean equals91 = language.equals("th");
                    c2 = 'S';
                    break;
                case 3704:
                    boolean equals92 = language.equals("tl");
                    c2 = 'T';
                    break;
                case 3710:
                    boolean equals93 = language.equals("tr");
                    c2 = 'U';
                    break;
                case 3734:
                    boolean equals94 = language.equals("uk");
                    c2 = 'V';
                    break;
                case 3741:
                    boolean equals95 = language.equals("ur");
                    c2 = 'W';
                    break;
                case 3763:
                    boolean equals96 = language.equals("vi");
                    c2 = 'X';
                    break;
                case 3800:
                    boolean equals97 = language.equals("wo");
                    c2 = 'Y';
                    break;
                case 3886:
                    boolean equals98 = language.equals("zh");
                    c2 = 'Z';
                    break;
                case 3899:
                    boolean equals99 = language.equals("zu");
                    c2 = '[';
                    break;
                case 101385:
                    boolean equals100 = language.equals("fil");
                    c2 = 25;
                    break;
                default:
                    c2 = 65535;
                    break;
            }
            str = "tl_PH";
            switch (c2) {
                case 0:
                    str = "af_ZA";
                    break;
                case 1:
                    str = "am_ET";
                    break;
                case 2:
                    str = "ar_AR";
                    break;
                case 3:
                    str = "as_IN";
                    break;
                case 4:
                    str = "az_AZ";
                    break;
                case 5:
                    str = "be_BY";
                    break;
                case 6:
                    str = "bg_BG";
                    break;
                case 7:
                    str = "bn_IN";
                    break;
                case 8:
                    str = "bs_BA";
                    break;
                case 9:
                    str = "ca_ES";
                    break;
                case 10:
                    str = "cb_IQ";
                    break;
                case C120125Dh.VIEW_TYPE_BANNER /*11*/:
                    str = "ck_US";
                    break;
                case C120125Dh.VIEW_TYPE_SPINNER /*12*/:
                    str = "cs_CZ";
                    break;
                case C120125Dh.VIEW_TYPE_BADGE /*13*/:
                    str = "cx_PH";
                    break;
                case C120125Dh.VIEW_TYPE_LINK /*14*/:
                    str = "cy_GB";
                    break;
                case 15:
                    str = "da_DK";
                    break;
                case 16:
                    str = "de_DE";
                    break;
                case C120125Dh.VIEW_TYPE_CUSTOM_ITEM /*17*/:
                    str = "el_GR";
                    break;
                case 18:
                    str = "eo_EO";
                    break;
                case 19:
                    str = "es_LA";
                    break;
                case 20:
                    str = "et_EE";
                    break;
                case C120125Dh.VIEW_TYPE_BRANDING /*21*/:
                    str = "eu_ES";
                    break;
                case C120125Dh.NUM_VIEW_TYPES /*22*/:
                    str = "fa_IR";
                    break;
                case 23:
                    str = "fb_HA";
                    break;
                case 24:
                    str = "fi_FI";
                    break;
                case 25:
                case 'T':
                    break;
                case OdexSchemeArtXdex.OREO_SDK_INT /*26*/:
                    str = "fo_FO";
                    break;
                case 27:
                    str = "fr_FR";
                    break;
                case 28:
                    str = "fy_NL";
                    break;
                case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /*29*/:
                    str = "ga_IE";
                    break;
                case 30:
                    str = "gl_ES";
                    break;
                case 31:
                    str = "gn_PY";
                    break;
                case ' ':
                    str = "gu_IN";
                    break;
                case '!':
                    str = "ha_NG";
                    break;
                case '\"':
                    str = "hi_IN";
                    break;
                case '#':
                    str = "hr_HR";
                    break;
                case '$':
                    str = "hu_HU";
                    break;
                case '%':
                    str = "hy_AM";
                    break;
                case '&':
                    str = "id_ID";
                    break;
                case '\'':
                    str = "is_IS";
                    break;
                case '(':
                    str = "it_IT";
                    break;
                case ')':
                    str = "he_IL";
                    break;
                case '*':
                    str = "ja_JP";
                    break;
                case '+':
                    str = "jv_ID";
                    break;
                case ',':
                    str = "ka_GE";
                    break;
                case '-':
                    str = "km_KH";
                    break;
                case '.':
                    str = "kn_IN";
                    break;
                case '/':
                    str = "ko_KR";
                    break;
                case '0':
                    str = "ku_TR";
                    break;
                case '1':
                    str = "la_VA";
                    break;
                case AMD.MAX_LIKES_PER_FETCH /*50*/:
                    str = "lo_LA";
                    break;
                case '3':
                    str = "lt_LT";
                    break;
                case '4':
                    str = "lv_LV";
                    break;
                case '5':
                    str = "mg_MG";
                    break;
                case '6':
                    str = "mk_MK";
                    break;
                case '7':
                    str = "ml_IN";
                    break;
                case '8':
                    str = "mn_MN";
                    break;
                case '9':
                    str = "mr_IN";
                    break;
                case ':':
                    str = "ms_MY";
                    break;
                case ';':
                    str = "my_MM";
                    break;
                case '<':
                    str = "nb_NO";
                    break;
                case '=':
                    str = "ne_NP";
                    break;
                case '>':
                    str = "nl_NL";
                    break;
                case '?':
                    str = "nn_NO";
                    break;
                case '@':
                    str = "or_IN";
                    break;
                case 'A':
                    str = "pa_IN";
                    break;
                case 'B':
                    str = "pl_PL";
                    break;
                case 'C':
                    str = "ps_AF";
                    break;
                case 'D':
                    str = "pt_BR";
                    break;
                case 'E':
                    str = "qz_MM";
                    break;
                case 'F':
                    str = "ro_RO";
                    break;
                case 'G':
                    str = "ru_RU";
                    break;
                case 'H':
                    str = "rw_RW";
                    break;
                case 'I':
                    str = "si_LK";
                    break;
                case 'J':
                    str = "sk_SK";
                    break;
                case 'K':
                    str = "sl_SI";
                    break;
                case 'L':
                    str = "sn_ZW";
                    break;
                case 'M':
                    str = "sq_AL";
                    break;
                case 'N':
                    str = "sr_RS";
                    break;
                case 'O':
                    str = "sv_SE";
                    break;
                case 'P':
                    str = "sw_KE";
                    break;
                case 'Q':
                    str = "ta_IN";
                    break;
                case 'R':
                    str = "te_IN";
                    break;
                case 'S':
                    str = "th_TH";
                    break;
                case 'U':
                    str = "tr_TR";
                    break;
                case 'V':
                    str = "uk_UA";
                    break;
                case 'W':
                    str = "ur_PK";
                    break;
                case 'X':
                    str = "vi_VN";
                    break;
                case 'Y':
                    str = "wo_SN";
                    break;
                case 'Z':
                    str = "zh_CN";
                    break;
                case '[':
                    str = "zu_ZA";
                    break;
                default:
                    str = null;
                    break;
            }
        }
        if (str == null) {
            return "en_US";
        }
        return str;
    }
}
