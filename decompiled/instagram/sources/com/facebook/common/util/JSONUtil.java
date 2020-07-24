package com.facebook.common.util;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Map;
import p000X.C26690Bpo;
import p000X.C26695Bpv;
import p000X.C26696Bpw;
import p000X.C26697Bpx;
import p000X.C26698Bpy;
import p000X.C26699Bpz;
import p000X.C26700Bq0;
import p000X.C26701Bq1;
import p000X.C26702Bq2;
import p000X.C26703Bq3;
import p000X.C26705Bq6;
import p000X.C59382hU;
import p000X.C59422hY;
import p000X.C59442ha;
import p000X.C64342rK;

public final class JSONUtil {
    public static C59382hU A00(Object obj) {
        if (obj == null) {
            return C26703Bq3.A00;
        }
        if (obj instanceof CharSequence) {
            return new C59442ha(obj.toString());
        }
        if (obj instanceof Boolean) {
            if (((Boolean) obj).booleanValue()) {
                return C26701Bq1.A02;
            }
            return C26701Bq1.A01;
        } else if (obj instanceof Float) {
            return new C26696Bpw(((Float) obj).floatValue());
        } else {
            if (obj instanceof Double) {
                return new C26695Bpv(((Double) obj).doubleValue());
            }
            if (obj instanceof Short) {
                return new C26698Bpy(((Short) obj).shortValue());
            }
            if (obj instanceof Integer) {
                return C26699Bpz.A00(((Integer) obj).intValue());
            }
            if (obj instanceof Long) {
                return new C26697Bpx(((Long) obj).longValue());
            }
            if (obj instanceof BigDecimal) {
                return new C26705Bq6((BigDecimal) obj);
            }
            if (obj instanceof BigInteger) {
                return new C26700Bq0((BigInteger) obj);
            }
            if (obj instanceof Map) {
                C26690Bpo bpo = new C26690Bpo(C59422hY.A01);
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    String obj2 = entry.getKey().toString();
                    Object A00 = A00(entry.getValue());
                    if (A00 == null) {
                        A00 = C26703Bq3.A00;
                    }
                    bpo.A00.put(obj2, A00);
                }
                return bpo;
            } else if (obj instanceof Iterable) {
                C64342rK r2 = new C64342rK(C59422hY.A01);
                for (Object A002 : (Iterable) obj) {
                    r2.A03(A00(A002));
                }
                return r2;
            } else if (obj instanceof Object[]) {
                C64342rK r3 = new C64342rK(C59422hY.A01);
                for (Object A003 : (Object[]) obj) {
                    r3.A03(A00(A003));
                }
                return r3;
            } else {
                Class<?> cls = obj.getClass();
                boolean z = false;
                if (cls.getAnnotation(JsonSerialize.class) != null) {
                    z = true;
                }
                if (z) {
                    return new C26702Bq2(obj);
                }
                throw new IllegalArgumentException("Can't convert to json: " + obj + ", of type: " + cls);
            }
        }
    }
}
