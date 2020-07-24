package p000X;

import android.content.Context;
import android.os.Build;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;

/* renamed from: X.CDX */
public final class CDX {
    public static final Set A00 = AnonymousClass93S.A02("US", "LR", "MY");

    public static Integer A00(Context context) {
        Locale locale;
        if (Build.VERSION.SDK_INT >= 24) {
            locale = context.getResources().getConfiguration().getLocales().get(0);
        } else {
            locale = context.getResources().getConfiguration().locale;
        }
        if (locale == null || !A00.contains(locale.getCountry())) {
            return Constants.ONE;
        }
        return Constants.ZERO;
    }

    public static Locale A01(Context context) {
        if (Build.VERSION.SDK_INT >= 24) {
            return context.getResources().getConfiguration().getLocales().get(0);
        }
        return context.getResources().getConfiguration().locale;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0057, code lost:
        if (r1.equals(r0) == false) goto L_0x002e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x002f, code lost:
        continue;
     */
    public static boolean A02(C27473CEp cEp, List list) {
        String str;
        String str2;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C27473CEp cEp2 = (C27473CEp) it.next();
            C27473CEp cEp3 = cEp;
            C27473CEp cEp4 = cEp2;
            boolean z = true;
            if (!cEp.equals(cEp2)) {
                if (cEp.A03.compareTo(cEp2.A03) >= 0) {
                    cEp4 = cEp;
                    cEp3 = cEp2;
                }
                switch (cEp3.A03.ordinal()) {
                    case 0:
                        if (cEp4.A03 != CFL.COUNTRY) {
                            str = cEp3.A06;
                            str2 = cEp4.A04;
                        }
                        break;
                    case 1:
                        if (cEp4.A03 != CFL.REGION) {
                            str = cEp3.A06;
                            str2 = cEp4.A08;
                        }
                        break;
                    case 2:
                        if (cEp4.A03 != CFL.CITY) {
                            str = cEp3.A06;
                            str2 = cEp4.A07;
                        }
                        break;
                }
                z = false;
                continue;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    public static boolean A03(List list) {
        if (!CGR.A00(list) && list.size() == 1 && ((C27473CEp) list.get(0)).A03 == CFL.CUSTOM_LOCATION) {
            return true;
        }
        return false;
    }
}
