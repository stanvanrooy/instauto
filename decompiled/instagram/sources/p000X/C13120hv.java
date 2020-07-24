package p000X;

/* renamed from: X.0hv  reason: invalid class name and case insensitive filesystem */
public enum C13120hv {
    NOT_AVAILABLE((String) null),
    START_OBJECT("{"),
    END_OBJECT("}"),
    START_ARRAY("["),
    END_ARRAY("]"),
    FIELD_NAME((String) null),
    VALUE_EMBEDDED_OBJECT((String) null),
    VALUE_STRING((String) null),
    VALUE_NUMBER_INT((String) null),
    VALUE_NUMBER_FLOAT((String) null),
    VALUE_TRUE("true"),
    VALUE_FALSE("false"),
    VALUE_NULL("null");
    
    public final byte[] A00;
    public final String A01;
    public final char[] A02;

    /* access modifiers changed from: public */
    C13120hv(String str) {
        if (str != null) {
            this.A01 = str;
            char[] charArray = str.toCharArray();
            this.A02 = charArray;
            int length = charArray.length;
            byte[] bArr = new byte[length];
            this.A00 = bArr;
            for (int i = 0; i < length; i++) {
                bArr[i] = (byte) charArray[i];
            }
        }
    }

    public final boolean A00() {
        if (ordinal() >= VALUE_EMBEDDED_OBJECT.ordinal()) {
            return true;
        }
        return false;
    }
}
