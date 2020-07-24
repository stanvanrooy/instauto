package p000X;

import java.math.BigInteger;

/* renamed from: X.Bi2 */
public final class Bi2 extends C26271BiZ {
    public static final Class[] A01 = {Integer.TYPE, Long.TYPE, Short.TYPE, Float.TYPE, Double.TYPE, Byte.TYPE, Boolean.TYPE, Character.TYPE, Integer.class, Long.class, Short.class, Float.class, Double.class, Byte.class, Boolean.class, Character.class};
    public Object A00;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            Bi2 bi2 = (Bi2) obj;
            Object obj2 = this.A00;
            if (obj2 == null) {
                return bi2.A00 == null;
            }
            if (A00(this) && A00(bi2)) {
                return A01().longValue() == bi2.A01().longValue();
            }
            if (!(obj2 instanceof Number) || !(bi2.A00 instanceof Number)) {
                return obj2.equals(bi2.A00);
            }
            double doubleValue = A01().doubleValue();
            double doubleValue2 = bi2.A01().doubleValue();
            if (doubleValue != doubleValue2) {
                return Double.isNaN(doubleValue) && Double.isNaN(doubleValue2);
            }
        }
    }

    public static boolean A00(Bi2 bi2) {
        Object obj = bi2.A00;
        if (!(obj instanceof Number)) {
            return false;
        }
        Number number = (Number) obj;
        if ((number instanceof BigInteger) || (number instanceof Long) || (number instanceof Integer) || (number instanceof Short) || (number instanceof Byte)) {
            return true;
        }
        return false;
    }

    public final Number A01() {
        Object obj = this.A00;
        if (obj instanceof String) {
            return new C223879kX((String) obj);
        }
        return (Number) obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0032, code lost:
        if (r1 != false) goto L_0x0034;
     */
    public final void A02(Object obj) {
        boolean z;
        boolean z2;
        if (obj instanceof Character) {
            this.A00 = String.valueOf(((Character) obj).charValue());
            return;
        }
        if (!(obj instanceof Number)) {
            if (!(obj instanceof String)) {
                Class<?> cls = obj.getClass();
                Class[] clsArr = A01;
                int length = clsArr.length;
                int i = 0;
                while (true) {
                    if (i < length) {
                        if (clsArr[i].isAssignableFrom(cls)) {
                            break;
                        }
                        i++;
                    } else {
                        z2 = false;
                        break;
                    }
                }
            }
            z2 = true;
            z = false;
        }
        z = true;
        C26303Bj9.A00(z);
        this.A00 = obj;
    }

    public final int hashCode() {
        long doubleToLongBits;
        Object obj = this.A00;
        if (obj == null) {
            return 31;
        }
        if (A00(this)) {
            doubleToLongBits = A01().longValue();
        } else if (!(obj instanceof Number)) {
            return obj.hashCode();
        } else {
            doubleToLongBits = Double.doubleToLongBits(A01().doubleValue());
        }
        return (int) ((doubleToLongBits >>> 32) ^ doubleToLongBits);
    }

    public Bi2(Boolean bool) {
        A02(bool);
    }

    public Bi2(Number number) {
        A02(number);
    }

    public Bi2(String str) {
        A02(str);
    }
}
