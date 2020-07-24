package p000X;

import android.os.Build;
import java.util.Locale;
import org.json.JSONObject;

/* renamed from: X.0gS  reason: invalid class name and case insensitive filesystem */
public final class C12260gS {
    public static C12260gS A08;
    public String A00 = "N/A";
    public String A01 = "others";
    public boolean A02 = false;
    public boolean A03 = false;
    public boolean A04 = false;
    public boolean A05 = false;
    public C12270gT A06;
    public final C12290gV A07;

    public static synchronized C12260gS A00() {
        C12260gS r0;
        synchronized (C12260gS.class) {
            if (A08 == null) {
                A08 = new C12260gS();
            }
            r0 = A08;
        }
        return r0;
    }

    public static boolean A01() {
        try {
            String str = Build.FINGERPRINT;
            if (!str.startsWith("generic") && !str.startsWith("unknown") && !Build.MODEL.contains("google_sdk")) {
                String str2 = Build.MODEL;
                if (str2.contains("Emulator") || str2.contains("Android SDK built for x86") || Build.MANUFACTURER.contains("Genymotion") || ((Build.BRAND.startsWith("generic") && Build.DEVICE.startsWith("generic")) || "google_sdk".equals(Build.PRODUCT))) {
                    return true;
                }
                return false;
            }
            return true;
        } catch (Error | Exception unused) {
            return false;
        }
    }

    public final String toString() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("chip_name", this.A00);
            jSONObject.put("chip_vendor", this.A01);
            jSONObject.put("platform_qualcomm", "qualcomm".equals(this.A01));
            jSONObject.put("platform_samsung", "samsung".equals(this.A01));
            jSONObject.put("platform_mediatek", "mediatek".equals(this.A01));
            jSONObject.put("platform_spreadtrum", "spreadtrum".equals(this.A01));
            jSONObject.put("platform_hisilicon", "hisilicon".equals(this.A01));
            return jSONObject.toString();
        } catch (Exception unused) {
            return "";
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0056, code lost:
        if ("samsung".equals(android.os.Build.MANUFACTURER) != false) goto L_0x0058;
     */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00f8 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:80:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    public C12260gS() {
        C12290gV A022;
        int i;
        int[] iArr;
        int i2;
        int i3;
        int[] iArr2;
        if (A01()) {
            C12290gV r2 = new C12290gV();
            if (r2.A07) {
                r2.A02 = r2.A03 + r2.A00 + r2.A06;
                r2.A0B = r2.A0A;
            }
            this.A07 = r2;
            return;
        }
        C12270gT r0 = new C12270gT();
        this.A06 = r0;
        String str = r0.A00;
        this.A00 = str;
        this.A01 = r0.A01;
        String str2 = Build.BRAND;
        boolean z = false;
        boolean z2 = !"samsung".equals(str2) ? false : z2;
        z2 = true;
        this.A05 = z2;
        this.A02 = "google".equals(str2);
        this.A03 = ("huawei".equals(str2.toLowerCase(Locale.US)) || "HONOR".equals(str2)) ? true : z;
        this.A04 = "lge".equals(str2);
        if (str.equals("msm8952") && C12280gU.A00() == 6) {
            str = "msm8956";
        }
        this.A00 = str;
        String str3 = this.A01;
        if ("qualcomm".equals(str3)) {
            A022 = new C12290gV();
            if ("msmnile".equals(str)) {
                A022 = new C12290gV();
                A022.A06 = 1;
                A022.A0D = new int[]{825600, 2841600};
                A022.A08 = true;
                A022.A00 = 3;
                A022.A0A = new int[]{710400, 2419200};
                A022.A01 = 4;
                A022.A07 = true;
                iArr2 = new int[]{300000, 1785600};
            } else if ("msm8994".equals(str)) {
                A022.A00 = 4;
                A022.A0A = new int[]{384000, 1958400};
                A022.A01 = 4;
                A022.A07 = true;
                iArr2 = new int[]{384000, 1555200};
            } else if ("msm8956".equals(str)) {
                A022.A00 = 2;
                A022.A0A = new int[]{400000, 1804800};
                A022.A01 = 4;
                A022.A07 = true;
                iArr2 = new int[]{400000, 1401600};
            } else {
                if ("msm8992".equals(str)) {
                    A022.A00 = 2;
                    A022.A0A = new int[]{384000, 1824000};
                    A022.A01 = 4;
                    A022.A07 = true;
                    iArr2 = new int[]{384000, 1440000};
                }
                A022 = C12280gU.A02();
                this.A07 = A022;
                String str4 = this.A00;
                if (!A022.A07 && str4 != null) {
                    int i4 = A022.A02;
                    if (i4 != 10) {
                        if (i4 == 8) {
                            if (str4.equals("exynos7885")) {
                                i2 = 2;
                                A022.A03 = 2;
                                i3 = 6;
                            } else {
                                return;
                            }
                        } else if (i4 == 6 && str4.startsWith("exynos")) {
                            i2 = 2;
                            A022.A03 = 2;
                            i3 = 4;
                        } else {
                            return;
                        }
                        A022.A00 = i3;
                        if (A022.A04 == 0) {
                            A022.A01 = i2;
                            return;
                        } else {
                            A022.A04 = i3;
                            return;
                        }
                    } else if (str4.startsWith("mt")) {
                        A022.A03 = 2;
                        A022.A05 = 4;
                        A022.A00 = 4;
                        if (A022.A04 == 0) {
                            A022.A01 = 6;
                            return;
                        } else {
                            A022.A04 = 8;
                            return;
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
            A022.A03 = 4;
            A022.A0C = iArr2;
            A022.A04 = 0;
            A022.A07 = true;
            A022.A09 = true;
            A022.A02 = 4 + A022.A00 + A022.A06;
        } else {
            if (!"samsung".equals(str3)) {
                if ("mediatek".equals(str3)) {
                    C12290gV r22 = new C12290gV();
                    if ("mt6797".equals(str)) {
                        r22 = new C12290gV();
                        r22.A06 = 2;
                        r22.A0D = new int[]{338000, 2314000};
                        r22.A08 = true;
                        i = 4;
                        r22.A00 = 4;
                        r22.A0A = new int[]{325000, 1846000};
                        r22.A01 = 4;
                        r22.A07 = true;
                        iArr = new int[]{221000, 1391000};
                    } else if ("mt6771".equals(str)) {
                        i = 4;
                        r22.A00 = 4;
                        r22.A0A = new int[]{793000, 1989000};
                        r22.A01 = 4;
                        r22.A07 = true;
                        iArr = new int[]{793000, 1989000};
                    }
                    A022.A03 = i;
                    A022.A0C = iArr;
                    A022.A04 = 0;
                    A022.A07 = true;
                    A022.A09 = true;
                    A022.A02 = i + A022.A00 + A022.A06;
                } else {
                    boolean equals = "hisilicon".equals(str3);
                }
            }
            A022 = C12280gU.A02();
            this.A07 = A022;
            String str42 = this.A00;
            if (!A022.A07) {
                return;
            }
            return;
        }
        A022.A0B = A022.A0A;
        this.A07 = A022;
        String str422 = this.A00;
        if (!A022.A07) {
        }
    }
}
