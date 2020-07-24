package p000X;

import android.content.Context;
import java.util.Locale;
import java.util.regex.Matcher;

/* renamed from: X.BWI */
public final class BWI {
    public String A00;
    public String A01;
    public final int A02;
    public final boolean A03;
    public final boolean A04;
    public final AnonymousClass0C1 A05;
    public final boolean A06;

    public final String A00(String str) {
        String str2;
        String A042 = this.A05.A04();
        boolean z = this.A06;
        int length = str.length();
        Matcher matcher = BWO.A00.matcher(str);
        if (matcher.find()) {
            str2 = "__guid__";
        } else if (length >= 32 && !z) {
            return "__hash__";
        } else {
            String replace = str.replace(' ', '_').replace(".", "");
            Locale locale = Locale.US;
            String lowerCase = replace.toLowerCase(locale);
            matcher = BWO.A01.matcher(lowerCase);
            if (!matcher.find()) {
                return lowerCase;
            }
            if (A042 != null && lowerCase.contains(A042)) {
                return lowerCase.replace(A042.toLowerCase(locale), "__primary_uid__");
            }
            str2 = "__auxiliary_uid__";
        }
        return matcher.replaceAll(str2);
    }

    public BWI(Context context, AnonymousClass0C1 r3) {
        this.A05 = r3;
        this.A02 = ((Integer) C05680Ln.A5S.A01(r3)).intValue();
        boolean booleanValue = ((Boolean) C05680Ln.A5N.A01(r3)).booleanValue();
        this.A03 = booleanValue;
        if (booleanValue) {
            this.A00 = context.getCacheDir().getName();
        }
        boolean booleanValue2 = ((Boolean) C05680Ln.A5O.A01(r3)).booleanValue();
        this.A04 = booleanValue2;
        if (booleanValue2) {
            this.A01 = context.getDatabasePath("ignore").getParentFile().getName();
        }
        this.A06 = ((Boolean) C05680Ln.A5P.A01(r3)).booleanValue();
    }
}
