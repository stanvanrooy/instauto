package com.google.common.base;

import java.util.logging.Level;
import java.util.logging.Logger;
import p000X.AnonymousClass000;

public final class Strings {
    public static boolean validSurrogatePairAt(CharSequence charSequence, int i) {
        return i >= 0 && i <= charSequence.length() + -2 && Character.isHighSurrogate(charSequence.charAt(i)) && Character.isLowSurrogate(charSequence.charAt(i + 1));
    }

    public static String A00(String str, Object... objArr) {
        int length;
        String str2;
        String valueOf = String.valueOf(str);
        int i = 0;
        int i2 = 0;
        while (true) {
            length = objArr.length;
            if (i2 >= length) {
                break;
            }
            Object obj = objArr[i2];
            try {
                str2 = String.valueOf(obj);
            } catch (Exception e) {
                String A03 = AnonymousClass000.A03(obj.getClass().getName(), '@', Integer.toHexString(System.identityHashCode(obj)));
                Logger.getLogger("com.google.common.base.Strings").log(Level.WARNING, AnonymousClass000.A0E("Exception during lenientFormat for ", A03), e);
                str2 = AnonymousClass000.A0O("<", A03, " threw ", e.getClass().getName(), ">");
            }
            objArr[i2] = str2;
            i2++;
        }
        int length2 = valueOf.length();
        int i3 = length;
        StringBuilder sb = new StringBuilder((length << 4) + length2);
        int i4 = 0;
        while (i < i3) {
            int indexOf = valueOf.indexOf("%s", i4);
            if (indexOf == -1) {
                break;
            }
            sb.append(valueOf, i4, indexOf);
            sb.append(objArr[i]);
            i4 = indexOf + 2;
            i++;
        }
        sb.append(valueOf, i4, length2);
        if (i < i3) {
            sb.append(" [");
            sb.append(objArr[i]);
            for (int i5 = i + 1; i5 < i3; i5++) {
                sb.append(", ");
                sb.append(objArr[i5]);
            }
            sb.append(']');
        }
        return sb.toString();
    }
}
