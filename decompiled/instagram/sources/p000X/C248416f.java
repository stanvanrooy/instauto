package p000X;

/* renamed from: X.16f  reason: invalid class name and case insensitive filesystem */
public final class C248416f implements C248516g {
    public final String A00;
    public final Object[] A01;

    public static void A00(C248816j r5, Object[] objArr) {
        long j;
        int byteValue;
        if (objArr != null) {
            int length = objArr.length;
            int i = 0;
            while (i < length) {
                byte[] bArr = objArr[i];
                i++;
                if (bArr == null) {
                    r5.A6Z(i);
                } else if (bArr instanceof byte[]) {
                    r5.A6W(i, bArr);
                } else if (bArr instanceof Float) {
                    r5.A6X(i, (double) ((Float) bArr).floatValue());
                } else if (bArr instanceof Double) {
                    r5.A6X(i, ((Double) bArr).doubleValue());
                } else if (bArr instanceof Long) {
                    r5.A6Y(i, ((Long) bArr).longValue());
                } else {
                    if (bArr instanceof Integer) {
                        byteValue = ((Integer) bArr).intValue();
                    } else if (bArr instanceof Short) {
                        byteValue = ((Short) bArr).shortValue();
                    } else if (bArr instanceof Byte) {
                        byteValue = ((Byte) bArr).byteValue();
                    } else if (bArr instanceof String) {
                        r5.A6a(i, (String) bArr);
                    } else if (bArr instanceof Boolean) {
                        if (((Boolean) bArr).booleanValue()) {
                            j = 1;
                        } else {
                            j = 0;
                        }
                        r5.A6Y(i, j);
                    } else {
                        throw new IllegalArgumentException("Cannot bind " + bArr + " at index " + i + " Supported types: null, byte[], float, double, long, int, short, byte, string");
                    }
                    r5.A6Y(i, (long) byteValue);
                }
            }
        }
    }

    public final void A6c(C248816j r2) {
        A00(r2, this.A01);
    }

    public final String AWU() {
        return this.A00;
    }

    public C248416f(String str, Object[] objArr) {
        this.A00 = str;
        this.A01 = objArr;
    }
}
