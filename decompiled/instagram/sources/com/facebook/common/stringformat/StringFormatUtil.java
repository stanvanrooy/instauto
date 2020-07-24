package com.facebook.common.stringformat;

import java.util.Formattable;
import java.util.Formatter;
import java.util.Locale;
import java.util.MissingFormatArgumentException;
import java.util.UnknownFormatConversionException;
import p000X.AnonymousClass000;

public class StringFormatUtil {
    public static final Object[] A00 = {null};

    public static int A03(StringBuilder sb, String str, int i, Object obj, Object obj2, Object obj3, Object obj4) {
        int i2;
        int A04;
        boolean z = false;
        if (sb == null) {
            z = true;
        }
        int i3 = 0;
        if (i == 0) {
            i3 = -1;
        }
        int i4 = i3;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            if (i4 >= i) {
                i2 = -200;
                break;
            }
            Object obj5 = obj2;
            Object obj6 = obj3;
            Object obj7 = obj4;
            if (i4 == -1) {
                A04 = A04(sb, str, i5, (Object) null, false);
            } else if (i4 == 0) {
                A04 = A04(sb, str, i5, obj, true);
            } else if (i4 == 1) {
                A04 = A04(sb, str, i5, obj5, true);
            } else if (i4 == 2) {
                A04 = A04(sb, str, i5, obj6, true);
            } else if (i4 == 3) {
                A04 = A04(sb, str, i5, obj7, true);
            } else {
                throw new AssertionError();
            }
            if (A04 == -1) {
                return -1;
            }
            if (z) {
                i6 += A04;
            }
            i5 = A00(str, i5);
            i2 = -200;
            if (i4 != i3 || i5 != -200 || !z) {
                if (i5 < 0) {
                    break;
                }
                i4++;
            } else {
                return -2;
            }
        }
        if (i5 != i2 && i5 != -201) {
            return A02(sb, str, i5, i6, z);
        }
        if (z) {
            return i6;
        }
        return -3;
    }

    public static int A05(StringBuilder sb, String str, Object... objArr) {
        boolean z;
        int i = 0;
        boolean z2 = false;
        if (sb == null) {
            z2 = true;
        }
        if (objArr == null || objArr.length == 0) {
            objArr = A00;
            z = true;
        } else {
            z = false;
        }
        int length = objArr.length;
        int i2 = 0;
        int i3 = 0;
        boolean z3 = false;
        while (i < length) {
            int A04 = A04(sb, str, i2, objArr[i], !z);
            if (A04 != -1) {
                if (z2) {
                    i3 += A04;
                }
                i2 = A00(str, i2);
                if (i2 == -200) {
                    break;
                }
                z3 = true;
                if (i2 == -201) {
                    break;
                }
                i++;
            } else {
                return -1;
            }
        }
        if (z2 && !z3) {
            return -2;
        }
        if (i2 != -200 && i2 != -201) {
            return A02(sb, str, i2, i3, z2);
        }
        if (z2) {
            return i3;
        }
        return -3;
    }

    public static void appendFormatStrLocaleSafe(StringBuilder sb, String str, Object... objArr) {
        int A01 = A01(str, -1, (Object) null, (Object) null, (Object) null, (Object) null, objArr);
        if (A01 == -1) {
            new Formatter(sb).format((Locale) null, str, objArr);
        } else if (A01 == -2) {
            sb.append(str);
        } else {
            sb.ensureCapacity(A01);
            A05(sb, str, objArr);
        }
    }

    public static int A01(String str, int i, Object obj, Object obj2, Object obj3, Object obj4, Object[] objArr) {
        if (i == 0) {
            return A03((StringBuilder) null, str, 0, (Object) null, (Object) null, (Object) null, (Object) null);
        }
        if (i == 1) {
            return A03((StringBuilder) null, str, 1, obj, (Object) null, (Object) null, (Object) null);
        }
        if (i == 2) {
            return A03((StringBuilder) null, str, 2, obj, obj2, (Object) null, (Object) null);
        }
        if (i == 3) {
            return A03((StringBuilder) null, str, 3, obj, obj2, obj3, (Object) null);
        }
        if (i != 4) {
            return A05((StringBuilder) null, str, objArr);
        }
        return A03((StringBuilder) null, str, 4, obj, obj2, obj3, obj4);
    }

    public static int A00(String str, int i) {
        char c;
        char charAt;
        int length = str.length();
        boolean z = false;
        while (i < length) {
            if (str.charAt(i) == '%') {
                int i2 = i + 1;
                if (length <= i2 || !((charAt = str.charAt(i2)) == 's' || charAt == 'd' || charAt == '%')) {
                    c = 65435;
                } else {
                    c = 65436;
                }
                if (c != 65436) {
                    continue;
                } else if (str.charAt(i2) != '%') {
                    return i + 2;
                } else {
                    i = i2;
                    z = true;
                }
            }
            i++;
        }
        if (z) {
            return -201;
        }
        return -200;
    }

    public static int A02(StringBuilder sb, String str, int i, int i2, boolean z) {
        int length = str.length();
        int i3 = 0;
        while (i < length) {
            char charAt = str.charAt(i);
            if (charAt != '%' || (length > (i = i + 1) && str.charAt(i) == '%')) {
                if (sb == null) {
                    i3++;
                } else {
                    sb.append(charAt);
                }
                i++;
            } else if (z) {
                return -1;
            } else {
                throw new AssertionError();
            }
        }
        int i4 = i2 + i3;
        if (!z) {
            return -3;
        }
        return i4;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0091, code lost:
        if (r8 == null) goto L_0x0078;
     */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00b5  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x00d0 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0033 A[SYNTHETIC] */
    public static int A04(StringBuilder sb, String str, int i, Object obj, boolean z) {
        char c;
        int i2;
        boolean z2;
        char charAt;
        int length = str.length();
        int i3 = 0;
        while (i < length) {
            char charAt2 = str.charAt(i);
            if (charAt2 == '%') {
                int i4 = i + 1;
                if (length <= i4 || !((charAt = str.charAt(i4)) == 's' || charAt == 'd' || charAt == '%')) {
                    c = 65435;
                } else {
                    c = 65436;
                }
                if (c == 65436) {
                    char charAt3 = str.charAt(i4);
                    if (z || charAt3 == '%') {
                        if (charAt3 == 's') {
                            if (!(obj instanceof Formattable)) {
                                String str2 = null;
                                if (obj instanceof String) {
                                    str2 = (String) obj;
                                } else if (obj != null) {
                                    str2 = obj.toString();
                                }
                                if (str2 == null) {
                                    str2 = "null";
                                }
                                if (sb == null) {
                                    i2 = str2.length();
                                } else {
                                    sb.append(str2);
                                    i2 = -3;
                                }
                            }
                            if (sb != null) {
                                i2 = -1;
                            } else {
                                throw new AssertionError();
                            }
                        } else if (charAt3 == 'd') {
                            i2 = 4;
                            if (obj == null) {
                                if (sb != null) {
                                    sb.append("null");
                                }
                                if (sb != null) {
                                    i2 = -3;
                                }
                            } else {
                                if (obj instanceof Integer) {
                                    if (sb == null) {
                                        i2 = 11;
                                        if (sb != null) {
                                        }
                                    }
                                } else if (!(obj instanceof Short)) {
                                    if (!(obj instanceof Byte)) {
                                        if (obj instanceof Long) {
                                            if (sb == null) {
                                                i2 = 20;
                                            } else {
                                                sb.append(((Long) obj).longValue());
                                            }
                                        }
                                        if (sb != null) {
                                        }
                                    }
                                    if (sb != null) {
                                    }
                                } else if (sb == null) {
                                    i2 = 6;
                                    if (sb != null) {
                                    }
                                }
                                sb.append(((Number) obj).intValue());
                            }
                            i2 = 0;
                            if (sb != null) {
                            }
                        } else {
                            if (charAt3 == '%') {
                                if (sb != null) {
                                    sb.append('%');
                                }
                                i = i4;
                                z2 = false;
                                i2 = 1;
                            } else {
                                z2 = true;
                                i2 = -1;
                            }
                            if (i2 == -1) {
                                if (sb == null) {
                                    i3 += i2;
                                }
                                if (z2) {
                                    break;
                                }
                            }
                        }
                        z2 = true;
                        if (i2 == -1) {
                        }
                    }
                }
                return -1;
            } else if (sb == null) {
                i3++;
            } else {
                sb.append(charAt2);
            }
            i++;
        }
        if (sb != null) {
            return -3;
        }
        return i3;
    }

    public static String A06(String str, int i, Object obj, Object obj2, Object obj3, Object obj4, Object[] objArr) {
        Object[] objArr2;
        int A01 = A01(str, i, obj, obj2, obj3, obj4, objArr);
        if (A01 == -1) {
            if (i == 0) {
                objArr2 = new Object[0];
            } else if (i == 1) {
                objArr2 = new Object[]{obj};
            } else if (i == 2) {
                objArr2 = new Object[]{obj, obj2};
            } else if (i == 3) {
                objArr2 = new Object[]{obj, obj2, obj3};
            } else if (i != 4) {
                try {
                    return String.format((Locale) null, str, objArr);
                } catch (MissingFormatArgumentException | UnknownFormatConversionException e) {
                    throw new RuntimeException(AnonymousClass000.A0J(e.getMessage(), ": ", str));
                }
            } else {
                objArr2 = new Object[]{obj, obj2, obj3, obj4};
            }
            return String.format((Locale) null, str, objArr2);
        } else if (A01 == -2) {
            return str;
        } else {
            StringBuilder sb = new StringBuilder(A01);
            if (i == -1) {
                A05(sb, str, objArr);
            } else {
                A03(sb, str, i, obj, obj2, obj3, obj4);
            }
            return sb.toString();
        }
    }

    public static String formatStrLocaleSafe(String str) {
        return A06(str, 0, (Object) null, (Object) null, (Object) null, (Object) null, (Object[]) null);
    }

    public static String formatStrLocaleSafe(String str, Object obj) {
        return A06(str, 1, obj, (Object) null, (Object) null, (Object) null, (Object[]) null);
    }

    public static String formatStrLocaleSafe(String str, Object obj, Object obj2) {
        return A06(str, 2, obj, obj2, (Object) null, (Object) null, (Object[]) null);
    }

    public static String formatStrLocaleSafe(String str, Object obj, Object obj2, Object obj3) {
        return A06(str, 3, obj, obj2, obj3, (Object) null, (Object[]) null);
    }

    public static String formatStrLocaleSafe(String str, Object obj, Object obj2, Object obj3, Object obj4) {
        return A06(str, 4, obj, obj2, obj3, obj4, (Object[]) null);
    }

    public static String formatStrLocaleSafe(String str, Object... objArr) {
        return A06(str, -1, (Object) null, (Object) null, (Object) null, (Object) null, objArr);
    }
}
