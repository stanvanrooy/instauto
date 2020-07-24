package com.facebook.msys.mci;

import android.content.Context;
import java.nio.charset.Charset;
import p000X.AnonymousClass000;
import p000X.C208928zC;
import p000X.C29039Cqr;

public class Localization {
    public static Context sContext;
    public static C29039Cqr sLocalizationIdentifier;

    public static native void nativeInitialize();

    public static String getLocalizedString(String str, String str2, String[] strArr) {
        Context context = sContext;
        C29039Cqr cqr = sLocalizationIdentifier;
        String[] strArr2 = {str, str2};
        StringBuilder sb = new StringBuilder();
        sb.append(strArr2[0]);
        for (int i = 1; i < 2; i++) {
            sb.append("|");
            sb.append(strArr2[i]);
        }
        long j = 0;
        for (byte b : sb.toString().getBytes(Charset.forName("UTF-8"))) {
            long j2 = (j + (((long) b) & 255)) & 4294967295L;
            long j3 = (j2 + (j2 << 10)) & 4294967295L;
            j = j3 ^ (j3 >> 6);
        }
        long j4 = (j + (j << 3)) & 4294967295L;
        long j5 = j4 ^ (j4 >> 11);
        long j6 = (j5 + (j5 << 15)) & 4294967295L;
        StringBuffer stringBuffer = new StringBuffer();
        while (j6 > 0) {
            long j7 = (long) 62;
            stringBuffer.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".charAt((int) (j6 % j7)));
            j6 /= j7;
        }
        stringBuffer.reverse();
        String A0E = AnonymousClass000.A0E("msys_", stringBuffer.toString());
        if (cqr.A00.containsKey(A0E)) {
            return context.getString(((Integer) cqr.A00.get(A0E)).intValue(), strArr);
        }
        throw new RuntimeException(AnonymousClass000.A0E(A0E, " is not found in DirectMsysLocalizationIdentifier."));
    }

    static {
        C208928zC.A00();
    }
}
