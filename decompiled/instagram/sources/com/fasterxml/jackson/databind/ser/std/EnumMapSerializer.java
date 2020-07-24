package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.ser.ContainerSerializer;
import java.lang.reflect.Modifier;
import java.util.EnumMap;
import java.util.Map;
import p000X.C06;
import p000X.C0L;
import p000X.C12960hf;
import p000X.C13460iZ;
import p000X.C15;
import p000X.C27127Byq;
import p000X.C27148BzD;
import p000X.C27200C1k;
import p000X.C27204C1t;
import p000X.C35;

@JacksonStdImpl
public final class EnumMapSerializer extends ContainerSerializer implements C35 {
    public final C27148BzD A00;
    public final C0L A01;
    public final JsonSerializer A02;
    public final C27204C1t A03;
    public final C27127Byq A04;
    public final boolean A05;

    public final void A0F(EnumMap enumMap, C13460iZ r13, C06 c06) {
        JsonSerializer jsonSerializer = this.A02;
        if (jsonSerializer != null) {
            C27127Byq byq = this.A04;
            boolean z = !c06.A05.A06(C15.WRITE_NULL_MAP_VALUES);
            C27204C1t c1t = this.A03;
            for (Map.Entry entry : enumMap.entrySet()) {
                Object value = entry.getValue();
                if (!z || value != null) {
                    Enum enumR = (Enum) entry.getKey();
                    if (byq == null) {
                        byq = ((EnumSerializer) ((StdSerializer) c06.A0A(enumR.getDeclaringClass(), this.A00))).A00;
                    }
                    r13.A0b((C12960hf) byq.A00.get(enumR));
                    if (value == null) {
                        c06.A0D(r13);
                    } else if (c1t == null) {
                        try {
                            jsonSerializer.A0B(value, r13, c06);
                        } catch (Exception e) {
                            StdSerializer.A03(c06, e, enumMap, ((Enum) entry.getKey()).name());
                        }
                    } else {
                        jsonSerializer.A08(value, r13, c06, c1t);
                    }
                }
            }
            return;
        }
        C27127Byq byq2 = this.A04;
        boolean z2 = !c06.A05.A06(C15.WRITE_NULL_MAP_VALUES);
        C27204C1t c1t2 = this.A03;
        Class<?> cls = null;
        JsonSerializer jsonSerializer2 = null;
        for (Map.Entry entry2 : enumMap.entrySet()) {
            Object value2 = entry2.getValue();
            if (!z2 || value2 != null) {
                Enum enumR2 = (Enum) entry2.getKey();
                if (byq2 == null) {
                    byq2 = ((EnumSerializer) ((StdSerializer) c06.A0A(enumR2.getDeclaringClass(), this.A00))).A00;
                }
                r13.A0b((C12960hf) byq2.A00.get(enumR2));
                if (value2 == null) {
                    c06.A0D(r13);
                } else {
                    Class<?> cls2 = value2.getClass();
                    if (cls2 != cls) {
                        jsonSerializer2 = c06.A0A(cls2, this.A00);
                        cls = cls2;
                    }
                    if (c1t2 == null) {
                        try {
                            jsonSerializer2.A0B(value2, r13, c06);
                        } catch (Exception e2) {
                            StdSerializer.A03(c06, e2, enumMap, ((Enum) entry2.getKey()).name());
                        }
                    } else {
                        jsonSerializer2.A08(value2, r13, c06, c1t2);
                    }
                }
            }
        }
    }

    public final JsonSerializer AAL(C06 c06, C27148BzD bzD) {
        JsonSerializer jsonSerializer;
        C27200C1k APy;
        Object A0T;
        if (bzD == null || (APy = bzD.APy()) == null || (A0T = c06.A05.A01().A0T(APy)) == null) {
            jsonSerializer = null;
        } else {
            jsonSerializer = c06.A08(APy, A0T);
        }
        if (jsonSerializer == null) {
            jsonSerializer = this.A02;
        }
        JsonSerializer A012 = StdSerializer.A01(c06, bzD, jsonSerializer);
        if (A012 == null) {
            if (this.A05) {
                JsonSerializer A07 = c06.A07(this.A01, bzD);
                if (this.A00 == bzD && A07 == this.A02) {
                    return this;
                }
                return new EnumMapSerializer(this, bzD, A07);
            }
        } else if (this.A02 instanceof C35) {
            A012 = ((C35) A012).AAL(c06, bzD);
        }
        JsonSerializer jsonSerializer2 = this.A02;
        if (A012 == jsonSerializer2) {
            return this;
        }
        if (this.A00 == bzD && A012 == jsonSerializer2) {
            return this;
        }
        return new EnumMapSerializer(this, bzD, A012);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EnumMapSerializer(C0L c0l, boolean z, C27127Byq byq, C27204C1t c1t, JsonSerializer jsonSerializer) {
        super(EnumMap.class, false);
        boolean z2 = false;
        this.A00 = null;
        if (z || (c0l != null && Modifier.isFinal(c0l.A00.getModifiers()))) {
            z2 = true;
        }
        this.A05 = z2;
        this.A01 = c0l;
        this.A04 = byq;
        this.A03 = c1t;
        this.A02 = jsonSerializer;
    }

    public EnumMapSerializer(EnumMapSerializer enumMapSerializer, C27148BzD bzD, JsonSerializer jsonSerializer) {
        super((ContainerSerializer) enumMapSerializer);
        this.A00 = bzD;
        this.A05 = enumMapSerializer.A05;
        this.A01 = enumMapSerializer.A01;
        this.A04 = enumMapSerializer.A04;
        this.A03 = enumMapSerializer.A03;
        this.A02 = jsonSerializer;
    }
}
