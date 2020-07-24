package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.ser.impl.TypeWrappedSerializer;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import p000X.C06;
import p000X.C0L;
import p000X.C1A;
import p000X.C1J;
import p000X.C26;
import p000X.C27148BzD;
import p000X.C27174Bzm;
import p000X.C27204C1t;
import p000X.C27223C2z;
import p000X.C27224C3n;
import p000X.C35;
import p000X.C3m;

@JacksonStdImpl
public final class JsonValueSerializer extends StdSerializer implements C35, C3m, C27224C3n {
    public final C27148BzD A00;
    public final JsonSerializer A01;
    public final Method A02;
    public final boolean A03;

    /* JADX WARNING: Removed duplicated region for block: B:40:0x00ad A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00c2  */
    public final JsonSerializer AAL(C06 c06, C27148BzD bzD) {
        boolean A04;
        Class<Double> cls;
        JsonSerializer jsonSerializer = this.A01;
        if (jsonSerializer == null) {
            if (c06.A04().A05(C1A.USE_STATIC_TYPING) || Modifier.isFinal(this.A02.getReturnType().getModifiers())) {
                C0L A05 = c06.A05().A05(this.A02.getGenericReturnType(), (C27174Bzm) null);
                C27148BzD bzD2 = this.A00;
                C27223C2z c2z = c06.A08;
                C1J c1j = c2z.A00;
                if (c1j == null) {
                    c2z.A00 = new C1J(A05, true);
                } else {
                    c1j.A01 = A05;
                    c1j.A02 = null;
                    c1j.A03 = true;
                    c1j.A00 = (A05.hashCode() - 1) - 1;
                }
                JsonSerializer A002 = c2z.A01.A00(c2z.A00);
                if (A002 == null) {
                    C26 c26 = c06.A06;
                    synchronized (c26) {
                        A002 = (JsonSerializer) c26.A01.get(new C1J(A05, true));
                    }
                    if (A002 == null) {
                        A002 = c06.A07(A05, bzD2);
                        C27204C1t A032 = c06.A07.A03(c06.A05, A05);
                        if (A032 != null) {
                            A002 = new TypeWrappedSerializer(A032.A00(bzD2), A002);
                        }
                    }
                }
                Class<Double> cls2 = A05.A00;
                if (cls2.isPrimitive()) {
                    if (!(cls2 == Integer.TYPE || cls2 == Boolean.TYPE)) {
                        cls = Double.TYPE;
                    }
                    A04 = StdSerializer.A04(A002);
                    if (this.A00 == bzD && this.A01 == A002 && A04 == this.A03) {
                        return this;
                    }
                    return new JsonValueSerializer(this, bzD, A002, A04);
                }
                if (!(cls2 == String.class || cls2 == Integer.class || cls2 == Boolean.class)) {
                    cls = Double.class;
                }
                A04 = StdSerializer.A04(A002);
                if (this.A00 == bzD || this.A01 == A002 || A04 == this.A03) {
                }
                if (cls2 != cls) {
                    A04 = false;
                    if (this.A00 == bzD || this.A01 == A002 || A04 == this.A03) {
                    }
                }
                A04 = StdSerializer.A04(A002);
                if (this.A00 == bzD || this.A01 == A002 || A04 == this.A03) {
                }
            }
        } else if (jsonSerializer instanceof C35) {
            JsonSerializer AAL = ((C35) jsonSerializer).AAL(c06, bzD);
            boolean z = this.A03;
            if (this.A00 == bzD && this.A01 == AAL && z == z) {
                return this;
            }
            return new JsonValueSerializer(this, bzD, AAL, z);
        }
        return this;
    }

    public final String toString() {
        return "(@JsonValue serializer for method " + this.A02.getDeclaringClass() + "#" + this.A02.getName() + ")";
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    public JsonValueSerializer(JsonValueSerializer jsonValueSerializer, C27148BzD bzD, JsonSerializer jsonSerializer, boolean z) {
        super((Class) r0 == null ? Object.class : r0);
        Class A07 = jsonValueSerializer.A07();
        this.A02 = jsonValueSerializer.A02;
        this.A01 = jsonSerializer;
        this.A00 = bzD;
        this.A03 = z;
    }

    public JsonValueSerializer(Method method, JsonSerializer jsonSerializer) {
        super(Object.class);
        this.A02 = method;
        this.A01 = jsonSerializer;
        this.A00 = null;
        this.A03 = true;
    }
}
