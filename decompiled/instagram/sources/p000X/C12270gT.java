package p000X;

import android.os.SystemProperties;
import java.util.Locale;

/* renamed from: X.0gT  reason: invalid class name and case insensitive filesystem */
public final class C12270gT {
    public String A00 = "N/A";
    public String A01 = "others";

    public C12270gT() {
        String str;
        String str2 = SystemProperties.get("ro.board.platform");
        if ((str2 != null && !str2.isEmpty()) || (((str2 = SystemProperties.get("ro.mediatek.platform")) != null && !str2.isEmpty()) || ((str2 = SystemProperties.get("ro.mediatek.hardware")) != null && !str2.isEmpty()))) {
            String lowerCase = str2.toLowerCase(Locale.ENGLISH);
            if (lowerCase.startsWith("msm") || lowerCase.startsWith("apq") || lowerCase.startsWith("sdm") || lowerCase.startsWith("sm") || lowerCase.equals("trinket") || lowerCase.equals("kona") || lowerCase.equals("atoll") || lowerCase.equals("lito")) {
                str = "qualcomm";
            } else if (lowerCase.startsWith("exynos") || lowerCase.startsWith("universal") || lowerCase.startsWith("erd")) {
                this.A01 = "samsung";
                String str3 = SystemProperties.get("ro.chipname");
                str3 = (str3 == null || str3.isEmpty()) ? SystemProperties.get("ro.hardware.chipname") : str3;
                if (str3 != null && !str3.isEmpty()) {
                    lowerCase = str3;
                }
                this.A00 = lowerCase;
            } else if (lowerCase.startsWith("mt")) {
                str = "mediatek";
            } else if (lowerCase.startsWith("sc") || lowerCase.startsWith("sp9") || lowerCase.startsWith("sp7")) {
                str = "spreadtrum";
            } else if (lowerCase.startsWith("hi") || lowerCase.startsWith("kirin")) {
                str = "hisilicon";
            } else if (lowerCase.startsWith("rk")) {
                str = "rockchip";
            } else {
                if (lowerCase.startsWith("bcm")) {
                    str = "broadcom";
                }
                this.A00 = lowerCase;
            }
            this.A01 = str;
            this.A00 = lowerCase;
        }
    }
}
