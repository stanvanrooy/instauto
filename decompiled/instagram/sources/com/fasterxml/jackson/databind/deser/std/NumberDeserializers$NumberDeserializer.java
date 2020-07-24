package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import java.math.BigDecimal;
import java.math.BigInteger;
import p000X.C13080hr;
import p000X.C13120hv;
import p000X.C27109ByB;
import p000X.C27123ByY;

@JacksonStdImpl
public final class NumberDeserializers$NumberDeserializer extends StdScalarDeserializer {
    public static final NumberDeserializers$NumberDeserializer A00 = new NumberDeserializers$NumberDeserializer();

    public NumberDeserializers$NumberDeserializer() {
        super(Number.class);
    }

    public final Number A0L(C13080hr r7, C27123ByY byY) {
        C13120hv A0g = r7.A0g();
        if (A0g == C13120hv.VALUE_NUMBER_INT) {
            if (byY.A0O(C27109ByB.USE_BIG_INTEGER_FOR_INTS)) {
                return r7.A0b();
            }
            return r7.A0Y();
        } else if (A0g == C13120hv.VALUE_NUMBER_FLOAT) {
            if (byY.A0O(C27109ByB.USE_BIG_DECIMAL_FOR_FLOATS)) {
                return r7.A0a();
            }
            return Double.valueOf(r7.A0R());
        } else if (A0g == C13120hv.VALUE_STRING) {
            String trim = r7.A0t().trim();
            try {
                if (trim.indexOf(46) >= 0) {
                    if (byY.A0O(C27109ByB.USE_BIG_DECIMAL_FOR_FLOATS)) {
                        return new BigDecimal(trim);
                    }
                    return new Double(trim);
                } else if (byY.A0O(C27109ByB.USE_BIG_INTEGER_FOR_INTS)) {
                    return new BigInteger(trim);
                } else {
                    long parseLong = Long.parseLong(trim);
                    if (parseLong > 2147483647L || parseLong < -2147483648L) {
                        return Long.valueOf(parseLong);
                    }
                    return Integer.valueOf((int) parseLong);
                }
            } catch (IllegalArgumentException unused) {
                throw byY.A0F(trim, this.A00, "not a valid number");
            }
        } else {
            throw byY.A0B(this.A00, A0g);
        }
    }
}
