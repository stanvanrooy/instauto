package p000X;

import com.instagram.common.util.gradient.TextModeGradientColors;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.0Ng  reason: invalid class name and case insensitive filesystem */
public final class C05990Ng {
    public static TextModeGradientColors parseFromJson(C13080hr r4) {
        TextModeGradientColors textModeGradientColors = new TextModeGradientColors();
        if (r4.A0g() != C13120hv.START_OBJECT) {
            r4.A0f();
            return null;
        }
        while (r4.A0p() != C13120hv.END_OBJECT) {
            String A0i = r4.A0i();
            r4.A0p();
            if ("colors".equals(A0i)) {
                ArrayList arrayList = null;
                if (r4.A0g() == C13120hv.START_ARRAY) {
                    arrayList = new ArrayList();
                    while (r4.A0p() != C13120hv.END_ARRAY) {
                        Integer valueOf = Integer.valueOf(r4.A0I());
                        if (valueOf != null) {
                            arrayList.add(valueOf);
                        }
                    }
                }
                textModeGradientColors.A01 = arrayList;
            } else if ("orientation".equals(A0i)) {
                textModeGradientColors.A00 = r4.A0I();
            }
            r4.A0f();
        }
        return textModeGradientColors;
    }

    public static void A00(C13460iZ r2, TextModeGradientColors textModeGradientColors) {
        r2.A0T();
        if (textModeGradientColors.A01 != null) {
            r2.A0d("colors");
            r2.A0S();
            Iterator it = textModeGradientColors.A01.iterator();
            while (it.hasNext()) {
                Integer num = (Integer) it.next();
                if (num != null) {
                    r2.A0X(num.intValue());
                }
            }
            r2.A0P();
        }
        r2.A0F("orientation", textModeGradientColors.A00);
        r2.A0Q();
    }
}
