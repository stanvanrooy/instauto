package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.databind.deser.AbstractDeserializer;
import com.fasterxml.jackson.databind.deser.BeanDeserializer;
import com.fasterxml.jackson.databind.deser.BeanDeserializerBase;
import com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer;
import com.fasterxml.jackson.databind.deser.impl.BeanAsArrayBuilderDeserializer;
import com.fasterxml.jackson.databind.deser.impl.BeanAsArrayDeserializer;
import com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer;
import com.fasterxml.jackson.databind.deser.std.ArrayBlockingQueueDeserializer;
import com.fasterxml.jackson.databind.deser.std.BaseNodeDeserializer;
import com.fasterxml.jackson.databind.deser.std.ClassDeserializer;
import com.fasterxml.jackson.databind.deser.std.CollectionDeserializer;
import com.fasterxml.jackson.databind.deser.std.DateDeserializers$CalendarDeserializer;
import com.fasterxml.jackson.databind.deser.std.DateDeserializers$DateDeserializer;
import com.fasterxml.jackson.databind.deser.std.DateDeserializers$SqlDateDeserializer;
import com.fasterxml.jackson.databind.deser.std.DateDeserializers$TimestampDeserializer;
import com.fasterxml.jackson.databind.deser.std.EnumDeserializer;
import com.fasterxml.jackson.databind.deser.std.EnumMapDeserializer;
import com.fasterxml.jackson.databind.deser.std.EnumSetDeserializer;
import com.fasterxml.jackson.databind.deser.std.FromStringDeserializer;
import com.fasterxml.jackson.databind.deser.std.JacksonDeserializers$JavaTypeDeserializer;
import com.fasterxml.jackson.databind.deser.std.JacksonDeserializers$TokenBufferDeserializer;
import com.fasterxml.jackson.databind.deser.std.JdkDeserializers$AtomicBooleanDeserializer;
import com.fasterxml.jackson.databind.deser.std.JdkDeserializers$AtomicReferenceDeserializer;
import com.fasterxml.jackson.databind.deser.std.JdkDeserializers$StackTraceElementDeserializer;
import com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer;
import com.fasterxml.jackson.databind.deser.std.MapDeserializer;
import com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer;
import com.fasterxml.jackson.databind.deser.std.NumberDeserializers$BigDecimalDeserializer;
import com.fasterxml.jackson.databind.deser.std.NumberDeserializers$BigIntegerDeserializer;
import com.fasterxml.jackson.databind.deser.std.NumberDeserializers$BooleanDeserializer;
import com.fasterxml.jackson.databind.deser.std.NumberDeserializers$ByteDeserializer;
import com.fasterxml.jackson.databind.deser.std.NumberDeserializers$CharacterDeserializer;
import com.fasterxml.jackson.databind.deser.std.NumberDeserializers$DoubleDeserializer;
import com.fasterxml.jackson.databind.deser.std.NumberDeserializers$FloatDeserializer;
import com.fasterxml.jackson.databind.deser.std.NumberDeserializers$IntegerDeserializer;
import com.fasterxml.jackson.databind.deser.std.NumberDeserializers$LongDeserializer;
import com.fasterxml.jackson.databind.deser.std.NumberDeserializers$NumberDeserializer;
import com.fasterxml.jackson.databind.deser.std.NumberDeserializers$PrimitiveOrWrapperDeserializer;
import com.fasterxml.jackson.databind.deser.std.NumberDeserializers$ShortDeserializer;
import com.fasterxml.jackson.databind.deser.std.ObjectArrayDeserializer;
import com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers;
import com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.fasterxml.jackson.databind.deser.std.StdScalarDeserializer;
import com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer;
import com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer;
import com.fasterxml.jackson.databind.deser.std.StringDeserializer;
import com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer;
import com.fasterxml.jackson.databind.ext.CoreXMLDeserializers;
import com.fasterxml.jackson.databind.jsontype.impl.FailingDeserializer;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.GregorianCalendar;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import p000X.AnonymousClass000;
import p000X.C04;
import p000X.C0H;
import p000X.C0L;
import p000X.C13080hr;
import p000X.C13120hv;
import p000X.C13230i7;
import p000X.C13480ib;
import p000X.C200288hn;
import p000X.C25930Bch;
import p000X.C26690Bpo;
import p000X.C26691Bpp;
import p000X.C26703Bq3;
import p000X.C26707BqL;
import p000X.C26708BqZ;
import p000X.C26710Bqd;
import p000X.C26711Bqe;
import p000X.C26712Bqf;
import p000X.C26713Bqg;
import p000X.C26715Bqi;
import p000X.C26716Bqn;
import p000X.C26717Bqo;
import p000X.C27106By5;
import p000X.C27109ByB;
import p000X.C27111ByF;
import p000X.C27114ByJ;
import p000X.C27115ByP;
import p000X.C27116ByQ;
import p000X.C27117ByR;
import p000X.C27118ByS;
import p000X.C27119ByT;
import p000X.C27120ByU;
import p000X.C27121ByW;
import p000X.C27122ByX;
import p000X.C27123ByY;
import p000X.C27125Bya;
import p000X.C27161BzZ;
import p000X.C27162Bza;
import p000X.C27163Bzb;
import p000X.C27164Bzc;
import p000X.C27176Bzt;
import p000X.C2O;
import p000X.C3P;
import p000X.C64342rK;

public abstract class JsonDeserializer {

    public abstract class None extends JsonDeserializer {
    }

    public JsonDeserializer A04(C3P c3p) {
        return this;
    }

    public Object A05() {
        if (this instanceof NumberDeserializers$PrimitiveOrWrapperDeserializer) {
            return ((NumberDeserializers$PrimitiveOrWrapperDeserializer) this).A00;
        }
        if (!(this instanceof BaseNodeDeserializer)) {
            return null;
        }
        return C26703Bq3.A00;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v76, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v77, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v78, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v79, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v80, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v22, resolved type: java.lang.Byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v27, resolved type: java.lang.Byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v142, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v143, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v145, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v35, resolved type: java.lang.Byte[]} */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x0126, code lost:
        if (r3.A06 != false) goto L_0x00f4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:538:0x07cb, code lost:
        if (r7 == p000X.C13120hv.VALUE_NUMBER_FLOAT) goto L_0x07cd;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:1355:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:470:0x0683  */
    public Object A06(C13080hr r12, C27123ByY byY) {
        C26716Bqn bqn;
        Object[] objArr;
        int i;
        C27125Bya bya;
        Class cls;
        String str;
        byte A0G;
        Class<?> cls2;
        byte A0G2;
        Class<EnumSet> cls3;
        String str2;
        Class cls4;
        String str3;
        short s;
        C27125Bya bya2;
        long j;
        float A0S;
        char charAt;
        byte b;
        C27125Bya bya3;
        C27125Bya bya4;
        boolean z;
        Object A0Z;
        C27125Bya bya5;
        Enum enumR;
        String str4;
        Object obj;
        C27125Bya bya6;
        Object[] A03;
        Map map;
        C27125Bya bya7;
        Object A0A;
        StringBuilder sb;
        String str5;
        Object A05;
        StringBuilder sb2;
        String str6;
        Object obj2;
        if (this instanceof TypeWrappedDeserializer) {
            TypeWrappedDeserializer typeWrappedDeserializer = (TypeWrappedDeserializer) this;
            return typeWrappedDeserializer.A00.A07(r12, byY, typeWrappedDeserializer.A01);
        } else if (this instanceof FailingDeserializer) {
            throw C27125Bya.A00(byY.A05, ((FailingDeserializer) this).A00);
        } else if (this instanceof UntypedObjectDeserializer) {
            UntypedObjectDeserializer untypedObjectDeserializer = (UntypedObjectDeserializer) this;
            switch (C26710Bqd.A00[r12.A0g().ordinal()]) {
                case 1:
                case 3:
                    return untypedObjectDeserializer.A0L(r12, byY);
                case 2:
                    if (byY.A0O(C27109ByB.USE_JAVA_ARRAY_FOR_JSON_ARRAY)) {
                        if (r12.A0p() == C13120hv.END_ARRAY) {
                            return UntypedObjectDeserializer.A01;
                        }
                        C26716Bqn A0J = byY.A0J();
                        Object[] A01 = A0J.A01();
                        int i2 = 0;
                        while (true) {
                            Object A06 = untypedObjectDeserializer.A06(r12, byY);
                            if (i2 >= A01.length) {
                                A01 = A0J.A02(A01);
                                i2 = 0;
                            }
                            int i3 = i2 + 1;
                            A01[i2] = A06;
                            if (r12.A0p() == C13120hv.END_ARRAY) {
                                int i4 = A0J.A00 + i3;
                                Object[] objArr2 = new Object[i4];
                                A0J.A00(objArr2, i4, A01, i3);
                                return objArr2;
                            }
                            i2 = i3;
                        }
                    } else if (r12.A0p() == C13120hv.END_ARRAY) {
                        return new ArrayList(4);
                    } else {
                        C26716Bqn A0J2 = byY.A0J();
                        Object[] A012 = A0J2.A01();
                        int i5 = 0;
                        int i6 = 0;
                        while (true) {
                            Object A062 = untypedObjectDeserializer.A06(r12, byY);
                            i5++;
                            if (i6 >= A012.length) {
                                A012 = A0J2.A02(A012);
                                i6 = 0;
                            }
                            int i7 = i6 + 1;
                            A012[i6] = A062;
                            if (r12.A0p() == C13120hv.END_ARRAY) {
                                ArrayList arrayList = new ArrayList(i5 + (i5 >> 3) + 1);
                                C26717Bqo bqo = A0J2.A01;
                                while (true) {
                                    int i8 = 0;
                                    if (bqo != null) {
                                        Object[] objArr3 = bqo.A01;
                                        int length = objArr3.length;
                                        while (i8 < length) {
                                            arrayList.add(objArr3[i8]);
                                            i8++;
                                        }
                                        bqo = bqo.A00;
                                    } else {
                                        while (i8 < i7) {
                                            arrayList.add(A012[i8]);
                                            i8++;
                                        }
                                        return arrayList;
                                    }
                                }
                            } else {
                                i6 = i7;
                            }
                        }
                    }
                case 4:
                    return r12.A0Z();
                case 5:
                    return r12.A0t();
                case 6:
                    return byY.A0O(C27109ByB.USE_BIG_INTEGER_FOR_INTS) ? r12.A0b() : r12.A0Y();
                case 7:
                    return byY.A0O(C27109ByB.USE_BIG_DECIMAL_FOR_FLOATS) ? r12.A0a() : Double.valueOf(r12.A0R());
                case 8:
                    return Boolean.TRUE;
                case 9:
                    return Boolean.FALSE;
                case 10:
                    return null;
                default:
                    throw byY.A0A(Object.class);
            }
        } else if (this instanceof StringArrayDeserializer) {
            StringArrayDeserializer stringArrayDeserializer = (StringArrayDeserializer) this;
            if (!r12.A0P()) {
                String str7 = null;
                if (byY.A0O(C27109ByB.ACCEPT_SINGLE_VALUE_AS_ARRAY)) {
                    String[] strArr = new String[1];
                    if (r12.A0g() != C13120hv.VALUE_NULL) {
                        str7 = StdDeserializer.A02(r12, byY);
                    }
                    strArr[0] = str7;
                    return strArr;
                } else if (r12.A0g() == C13120hv.VALUE_STRING && byY.A0O(C27109ByB.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT) && r12.A0t().length() == 0) {
                    return null;
                } else {
                    throw byY.A0A(stringArrayDeserializer.A00);
                }
            } else {
                JsonDeserializer jsonDeserializer = stringArrayDeserializer.A00;
                if (jsonDeserializer == null) {
                    bqn = byY.A0J();
                    objArr = bqn.A01();
                    int i9 = 0;
                    while (true) {
                        C13120hv A0p = r12.A0p();
                        if (A0p == C13120hv.END_ARRAY) {
                            break;
                        }
                        Object A0t = A0p == C13120hv.VALUE_STRING ? r12.A0t() : A0p == C13120hv.VALUE_NULL ? null : StdDeserializer.A02(r12, byY);
                        if (i >= objArr.length) {
                            objArr = bqn.A02(objArr);
                            i = 0;
                        }
                        objArr[i] = A0t;
                        i9 = i + 1;
                    }
                } else {
                    bqn = byY.A0J();
                    objArr = bqn.A01();
                    i = 0;
                    while (true) {
                        C13120hv A0p2 = r12.A0p();
                        if (A0p2 == C13120hv.END_ARRAY) {
                            break;
                        }
                        String str8 = A0p2 == C13120hv.VALUE_NULL ? null : (String) jsonDeserializer.A06(r12, byY);
                        if (i >= objArr.length) {
                            objArr = bqn.A02(objArr);
                            i = 0;
                        }
                        objArr[i] = str8;
                        i++;
                    }
                }
                String[] strArr2 = (String[]) bqn.A03(objArr, i, String.class);
                byY.A0N(bqn);
                return strArr2;
            }
        } else if (this instanceof StdDelegatingDeserializer) {
            StdDelegatingDeserializer stdDelegatingDeserializer = (StdDelegatingDeserializer) this;
            Object A063 = stdDelegatingDeserializer.A00.A06(r12, byY);
            if (A063 != null) {
                return stdDelegatingDeserializer.A01.A9o(A063);
            }
            return null;
        } else if (this instanceof PrimitiveArrayDeserializers.ShortDeser) {
            PrimitiveArrayDeserializers.ShortDeser shortDeser = (PrimitiveArrayDeserializers.ShortDeser) this;
            if (r12.A0P()) {
                C27115ByP A0I = byY.A0I();
                if (A0I.A06 == null) {
                    A0I.A06 = new C27120ByU();
                }
                C27120ByU byU = A0I.A06;
                short[] sArr = (short[]) byU.A00();
                int i10 = 0;
                while (r12.A0p() != C13120hv.END_ARRAY) {
                    int A0D = shortDeser.A0D(r12, byY);
                    if (A0D < -32768 || A0D > 32767) {
                        throw byY.A0F(String.valueOf(A0D), shortDeser.A00, "overflow, value can not be represented as 16-bit value");
                    }
                    short s2 = (short) A0D;
                    if (i10 >= sArr.length) {
                        sArr = (short[]) byU.A02(sArr, i10);
                        i10 = 0;
                    }
                    sArr[i10] = s2;
                    i10++;
                }
                return (short[]) byU.A03(sArr, i10);
            } else if (r12.A0g() == C13120hv.VALUE_STRING && byY.A0O(C27109ByB.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT) && r12.A0t().length() == 0) {
                return null;
            } else {
                if (byY.A0O(C27109ByB.ACCEPT_SINGLE_VALUE_AS_ARRAY)) {
                    short[] sArr2 = new short[1];
                    int A0D2 = shortDeser.A0D(r12, byY);
                    if (A0D2 < -32768 || A0D2 > 32767) {
                        throw byY.A0F(String.valueOf(A0D2), shortDeser.A00, "overflow, value can not be represented as 16-bit value");
                    }
                    sArr2[0] = (short) A0D2;
                    return sArr2;
                }
                throw byY.A0A(shortDeser.A00);
            }
        } else if (this instanceof PrimitiveArrayDeserializers.LongDeser) {
            PrimitiveArrayDeserializers.LongDeser longDeser = (PrimitiveArrayDeserializers.LongDeser) this;
            if (r12.A0P()) {
                C27115ByP A0I2 = byY.A0I();
                if (A0I2.A05 == null) {
                    A0I2.A05 = new C27114ByJ();
                }
                C27114ByJ byJ = A0I2.A05;
                long[] jArr = (long[]) byJ.A00();
                int i11 = 0;
                while (r12.A0p() != C13120hv.END_ARRAY) {
                    long A0E = longDeser.A0E(r12, byY);
                    if (i11 >= jArr.length) {
                        jArr = (long[]) byJ.A02(jArr, i11);
                        i11 = 0;
                    }
                    jArr[i11] = A0E;
                    i11++;
                }
                return (long[]) byJ.A03(jArr, i11);
            } else if (r12.A0g() == C13120hv.VALUE_STRING && byY.A0O(C27109ByB.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT) && r12.A0t().length() == 0) {
                return null;
            } else {
                if (byY.A0O(C27109ByB.ACCEPT_SINGLE_VALUE_AS_ARRAY)) {
                    return new long[]{longDeser.A0E(r12, byY)};
                }
                throw byY.A0A(longDeser.A00);
            }
        } else if (this instanceof PrimitiveArrayDeserializers.IntDeser) {
            PrimitiveArrayDeserializers.IntDeser intDeser = (PrimitiveArrayDeserializers.IntDeser) this;
            if (r12.A0P()) {
                C27115ByP A0I3 = byY.A0I();
                if (A0I3.A04 == null) {
                    A0I3.A04 = new C27119ByT();
                }
                C27119ByT byT = A0I3.A04;
                int[] iArr = (int[]) byT.A00();
                int i12 = 0;
                while (r12.A0p() != C13120hv.END_ARRAY) {
                    int A0D3 = intDeser.A0D(r12, byY);
                    if (i12 >= iArr.length) {
                        iArr = (int[]) byT.A02(iArr, i12);
                        i12 = 0;
                    }
                    iArr[i12] = A0D3;
                    i12++;
                }
                return (int[]) byT.A03(iArr, i12);
            } else if (r12.A0g() == C13120hv.VALUE_STRING && byY.A0O(C27109ByB.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT) && r12.A0t().length() == 0) {
                return null;
            } else {
                if (byY.A0O(C27109ByB.ACCEPT_SINGLE_VALUE_AS_ARRAY)) {
                    return new int[]{intDeser.A0D(r12, byY)};
                }
                throw byY.A0A(intDeser.A00);
            }
        } else if (this instanceof PrimitiveArrayDeserializers.FloatDeser) {
            PrimitiveArrayDeserializers.FloatDeser floatDeser = (PrimitiveArrayDeserializers.FloatDeser) this;
            if (r12.A0P()) {
                C27115ByP A0I4 = byY.A0I();
                if (A0I4.A03 == null) {
                    A0I4.A03 = new C27118ByS();
                }
                C27118ByS byS = A0I4.A03;
                float[] fArr = (float[]) byS.A00();
                int i13 = 0;
                while (r12.A0p() != C13120hv.END_ARRAY) {
                    float A0C = floatDeser.A0C(r12, byY);
                    if (i13 >= fArr.length) {
                        fArr = (float[]) byS.A02(fArr, i13);
                        i13 = 0;
                    }
                    fArr[i13] = A0C;
                    i13++;
                }
                return (float[]) byS.A03(fArr, i13);
            } else if (r12.A0g() == C13120hv.VALUE_STRING && byY.A0O(C27109ByB.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT) && r12.A0t().length() == 0) {
                return null;
            } else {
                if (byY.A0O(C27109ByB.ACCEPT_SINGLE_VALUE_AS_ARRAY)) {
                    return new float[]{floatDeser.A0C(r12, byY)};
                }
                throw byY.A0A(floatDeser.A00);
            }
        } else if (this instanceof PrimitiveArrayDeserializers.DoubleDeser) {
            PrimitiveArrayDeserializers.DoubleDeser doubleDeser = (PrimitiveArrayDeserializers.DoubleDeser) this;
            if (r12.A0P()) {
                C27115ByP A0I5 = byY.A0I();
                if (A0I5.A02 == null) {
                    A0I5.A02 = new C27117ByR();
                }
                C27117ByR byR = A0I5.A02;
                double[] dArr = (double[]) byR.A00();
                int i14 = 0;
                while (r12.A0p() != C13120hv.END_ARRAY) {
                    double A0B = doubleDeser.A0B(r12, byY);
                    if (i14 >= dArr.length) {
                        dArr = (double[]) byR.A02(dArr, i14);
                        i14 = 0;
                    }
                    dArr[i14] = A0B;
                    i14++;
                }
                return (double[]) byR.A03(dArr, i14);
            } else if (r12.A0g() == C13120hv.VALUE_STRING && byY.A0O(C27109ByB.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT) && r12.A0t().length() == 0) {
                return null;
            } else {
                if (byY.A0O(C27109ByB.ACCEPT_SINGLE_VALUE_AS_ARRAY)) {
                    return new double[]{doubleDeser.A0B(r12, byY)};
                }
                throw byY.A0A(doubleDeser.A00);
            }
        } else if (this instanceof PrimitiveArrayDeserializers.CharDeser) {
            PrimitiveArrayDeserializers.CharDeser charDeser = (PrimitiveArrayDeserializers.CharDeser) this;
            C13120hv A0g = r12.A0g();
            if (A0g == C13120hv.VALUE_STRING) {
                char[] A0w = r12.A0w();
                int A0o = r12.A0o();
                int A0n = r12.A0n();
                char[] cArr = new char[A0n];
                System.arraycopy(A0w, A0o, cArr, 0, A0n);
                return cArr;
            }
            if (r12.A0P()) {
                StringBuilder sb3 = new StringBuilder(64);
                while (true) {
                    C13120hv A0p3 = r12.A0p();
                    if (A0p3 != C13120hv.END_ARRAY) {
                        if (A0p3 != C13120hv.VALUE_STRING) {
                            cls = Character.TYPE;
                            break;
                        }
                        String A0t2 = r12.A0t();
                        int length2 = A0t2.length();
                        if (length2 != 1) {
                            bya = C27125Bya.A00(r12, AnonymousClass000.A06("Can not convert a JSON String of length ", length2, " into a char element of char array"));
                            break;
                        }
                        sb3.append(A0t2.charAt(0));
                    } else {
                        str = sb3.toString();
                        break;
                    }
                }
                bya = byY.A0A(cls);
                throw bya;
            }
            if (A0g == C13120hv.VALUE_EMBEDDED_OBJECT) {
                Object A0Z2 = r12.A0Z();
                if (A0Z2 == null) {
                    return null;
                }
                if (A0Z2 instanceof char[]) {
                    return (char[]) A0Z2;
                }
                if (A0Z2 instanceof String) {
                    str = (String) A0Z2;
                } else if (A0Z2 instanceof byte[]) {
                    str = C25930Bch.A01.A02((byte[]) A0Z2, false);
                }
            }
            cls = charDeser.A00;
            bya = byY.A0A(cls);
            throw bya;
            return str.toCharArray();
        } else if (this instanceof PrimitiveArrayDeserializers.ByteDeser) {
            PrimitiveArrayDeserializers.ByteDeser byteDeser = (PrimitiveArrayDeserializers.ByteDeser) this;
            C13120hv A0g2 = r12.A0g();
            C13120hv r1 = C13120hv.VALUE_STRING;
            if (A0g2 == r1) {
                return r12.A0v(byY.A00.A00.A00);
            }
            if (A0g2 == C13120hv.VALUE_EMBEDDED_OBJECT) {
                Object A0Z3 = r12.A0Z();
                if (A0Z3 == null) {
                    return null;
                }
                if (A0Z3 instanceof byte[]) {
                    return (byte[]) A0Z3;
                }
            }
            if (r12.A0P()) {
                C27115ByP A0I6 = byY.A0I();
                if (A0I6.A01 == null) {
                    A0I6.A01 = new C27111ByF();
                }
                C27111ByF byF = A0I6.A01;
                byte[] bArr = (byte[]) byF.A00();
                int i15 = 0;
                while (true) {
                    C13120hv A0p4 = r12.A0p();
                    if (A0p4 == C13120hv.END_ARRAY) {
                        return (byte[]) byF.A03(bArr, i15);
                    }
                    if (A0p4 == C13120hv.VALUE_NUMBER_INT || A0p4 == C13120hv.VALUE_NUMBER_FLOAT) {
                        A0G = r12.A0G();
                    } else if (A0p4 == C13120hv.VALUE_NULL) {
                        A0G = 0;
                    } else {
                        throw byY.A0A(byteDeser.A00.getComponentType());
                    }
                    if (i15 >= bArr.length) {
                        bArr = (byte[]) byF.A02(bArr, i15);
                        i15 = 0;
                    }
                    bArr[i15] = A0G;
                    i15++;
                }
            } else if (A0g2 == r1 && byY.A0O(C27109ByB.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT) && r12.A0t().length() == 0) {
                return null;
            } else {
                if (byY.A0O(C27109ByB.ACCEPT_SINGLE_VALUE_AS_ARRAY)) {
                    C13120hv A0g3 = r12.A0g();
                    if (A0g3 == C13120hv.VALUE_NUMBER_INT || A0g3 == C13120hv.VALUE_NUMBER_FLOAT) {
                        A0G2 = r12.A0G();
                    } else if (A0g3 == C13120hv.VALUE_NULL) {
                        A0G2 = 0;
                    } else {
                        cls2 = byteDeser.A00.getComponentType();
                    }
                    return new byte[]{A0G2};
                }
                cls2 = byteDeser.A00;
                throw byY.A0A(cls2);
            }
        } else if (this instanceof PrimitiveArrayDeserializers.BooleanDeser) {
            PrimitiveArrayDeserializers.BooleanDeser booleanDeser = (PrimitiveArrayDeserializers.BooleanDeser) this;
            if (r12.A0P()) {
                C27115ByP A0I7 = byY.A0I();
                if (A0I7.A00 == null) {
                    A0I7.A00 = new C27116ByQ();
                }
                C27116ByQ byQ = A0I7.A00;
                boolean[] zArr = (boolean[]) byQ.A00();
                int i16 = 0;
                while (r12.A0p() != C13120hv.END_ARRAY) {
                    boolean A0K = booleanDeser.A0K(r12, byY);
                    if (i16 >= zArr.length) {
                        zArr = (boolean[]) byQ.A02(zArr, i16);
                        i16 = 0;
                    }
                    zArr[i16] = A0K;
                    i16++;
                }
                return (boolean[]) byQ.A03(zArr, i16);
            } else if (r12.A0g() == C13120hv.VALUE_STRING && byY.A0O(C27109ByB.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT) && r12.A0t().length() == 0) {
                return null;
            } else {
                if (byY.A0O(C27109ByB.ACCEPT_SINGLE_VALUE_AS_ARRAY)) {
                    return new boolean[]{booleanDeser.A0K(r12, byY)};
                }
                throw byY.A0A(booleanDeser.A00);
            }
        } else if (this instanceof NullifyingDeserializer) {
            r12.A0f();
            return null;
        } else if (this instanceof JsonNodeDeserializer) {
            JsonNodeDeserializer jsonNodeDeserializer = (JsonNodeDeserializer) this;
            int i17 = C26707BqL.A00[r12.A0g().ordinal()];
            return i17 != 1 ? i17 != 2 ? jsonNodeDeserializer.A0L(r12, byY, byY.A00.A01) : jsonNodeDeserializer.A0M(r12, byY, byY.A00.A01) : jsonNodeDeserializer.A0N(r12, byY, byY.A00.A01);
        } else if (this instanceof JsonNodeDeserializer.ObjectDeserializer) {
            JsonNodeDeserializer.ObjectDeserializer objectDeserializer = (JsonNodeDeserializer.ObjectDeserializer) this;
            C13120hv A0g4 = r12.A0g();
            if (A0g4 == C13120hv.START_OBJECT) {
                r12.A0p();
            } else if (A0g4 != C13120hv.FIELD_NAME) {
                throw byY.A0A(C26690Bpo.class);
            }
            return objectDeserializer.A0N(r12, byY, byY.A00.A01);
        } else if (this instanceof JsonNodeDeserializer.ArrayDeserializer) {
            JsonNodeDeserializer.ArrayDeserializer arrayDeserializer = (JsonNodeDeserializer.ArrayDeserializer) this;
            if (r12.A0P()) {
                return arrayDeserializer.A0M(r12, byY, byY.A00.A01);
            }
            throw byY.A0A(C64342rK.class);
        } else if (!(this instanceof EnumSetDeserializer)) {
            if (this instanceof EnumMapDeserializer) {
                EnumMapDeserializer enumMapDeserializer = (EnumMapDeserializer) this;
                if (r12.A0g() == C13120hv.START_OBJECT) {
                    EnumMap enumMap = new EnumMap(enumMapDeserializer.A04);
                    JsonDeserializer jsonDeserializer2 = enumMapDeserializer.A01;
                    C27106By5 by5 = enumMapDeserializer.A03;
                    while (r12.A0p() != C13120hv.END_OBJECT) {
                        Enum enumR2 = (Enum) enumMapDeserializer.A00.A06(r12, byY);
                        String str9 = null;
                        if (enumR2 != null) {
                            if (r12.A0p() != C13120hv.VALUE_NULL) {
                                str9 = by5 == null ? jsonDeserializer2.A06(r12, byY) : jsonDeserializer2.A07(r12, byY, by5);
                            }
                            enumMap.put(enumR2, str9);
                        } else if (!byY.A0O(C27109ByB.READ_UNKNOWN_ENUM_VALUES_AS_NULL)) {
                            try {
                                if (r12.A0k()) {
                                    str9 = r12.A0t();
                                }
                            } catch (Exception unused) {
                            }
                            cls4 = enumMapDeserializer.A04;
                            str3 = "value not one of declared Enum instance names";
                            str2 = str9;
                        } else {
                            r12.A0p();
                            r12.A0f();
                        }
                    }
                    return enumMap;
                }
                throw byY.A0A(EnumMap.class);
            } else if (this instanceof CoreXMLDeserializers.GregorianCalendarDeserializer) {
                Date A0I8 = ((CoreXMLDeserializers.GregorianCalendarDeserializer) this).A0I(r12, byY);
                if (A0I8 == null) {
                    return null;
                }
                GregorianCalendar gregorianCalendar = new GregorianCalendar();
                gregorianCalendar.setTime(A0I8);
                TimeZone timeZone = byY.A00.A00.A07;
                if (timeZone != null) {
                    gregorianCalendar.setTimeZone(timeZone);
                }
                return CoreXMLDeserializers.A00.newXMLGregorianCalendar(gregorianCalendar);
            } else if (this instanceof StringDeserializer) {
                return ((StringDeserializer) this).A0L(r12, byY);
            } else {
                if (this instanceof NumberDeserializers$NumberDeserializer) {
                    return ((NumberDeserializers$NumberDeserializer) this).A0L(r12, byY);
                }
                if (this instanceof NumberDeserializers$ShortDeserializer) {
                    NumberDeserializers$ShortDeserializer numberDeserializers$ShortDeserializer = (NumberDeserializers$ShortDeserializer) this;
                    C13120hv A0g5 = r12.A0g();
                    if (A0g5 == C13120hv.VALUE_NUMBER_INT || A0g5 == C13120hv.VALUE_NUMBER_FLOAT) {
                        s = r12.A0M();
                    } else {
                        if (A0g5 == C13120hv.VALUE_STRING) {
                            String trim = r12.A0t().trim();
                            try {
                                if (trim.length() == 0) {
                                    return (Short) numberDeserializers$ShortDeserializer.A05();
                                }
                                int A013 = C13230i7.A01(trim);
                                if (A013 < -32768 || A013 > 32767) {
                                    bya2 = byY.A0F(trim, numberDeserializers$ShortDeserializer.A00, "overflow, value can not be represented as 16-bit value");
                                } else {
                                    s = (short) A013;
                                }
                            } catch (IllegalArgumentException unused2) {
                                cls4 = numberDeserializers$ShortDeserializer.A00;
                                str3 = "not a valid Short value";
                                str2 = trim;
                            }
                        } else if (A0g5 == C13120hv.VALUE_NULL) {
                            return (Short) numberDeserializers$ShortDeserializer.A05();
                        } else {
                            bya2 = byY.A0B(numberDeserializers$ShortDeserializer.A00, A0g5);
                        }
                        throw bya2;
                    }
                    return Short.valueOf(s);
                } else if (this instanceof NumberDeserializers$LongDeserializer) {
                    NumberDeserializers$LongDeserializer numberDeserializers$LongDeserializer = (NumberDeserializers$LongDeserializer) this;
                    C13120hv A0g6 = r12.A0g();
                    if (A0g6 == C13120hv.VALUE_NUMBER_INT || A0g6 == C13120hv.VALUE_NUMBER_FLOAT) {
                        return Long.valueOf(r12.A0U());
                    }
                    if (A0g6 == C13120hv.VALUE_STRING) {
                        String trim2 = r12.A0t().trim();
                        int length3 = trim2.length();
                        if (length3 != 0) {
                            if (length3 <= 9) {
                                try {
                                    j = (long) C13230i7.A01(trim2);
                                } catch (IllegalArgumentException unused3) {
                                    cls4 = numberDeserializers$LongDeserializer.A00;
                                    str3 = "not a valid Long value";
                                    str2 = trim2;
                                }
                            } else {
                                j = Long.parseLong(trim2);
                            }
                            return Long.valueOf(j);
                        }
                    } else if (A0g6 != C13120hv.VALUE_NULL) {
                        throw byY.A0B(numberDeserializers$LongDeserializer.A00, A0g6);
                    }
                    return (Long) numberDeserializers$LongDeserializer.A05();
                } else if (this instanceof NumberDeserializers$IntegerDeserializer) {
                    return ((NumberDeserializers$IntegerDeserializer) this).A0H(r12, byY);
                } else {
                    if (this instanceof NumberDeserializers$FloatDeserializer) {
                        NumberDeserializers$FloatDeserializer numberDeserializers$FloatDeserializer = (NumberDeserializers$FloatDeserializer) this;
                        C13120hv A0g7 = r12.A0g();
                        if (A0g7 == C13120hv.VALUE_NUMBER_INT || A0g7 == C13120hv.VALUE_NUMBER_FLOAT) {
                            A0S = r12.A0S();
                        } else {
                            if (A0g7 == C13120hv.VALUE_STRING) {
                                String trim3 = r12.A0t().trim();
                                if (trim3.length() != 0) {
                                    char charAt2 = trim3.charAt(0);
                                    if (charAt2 != '-') {
                                        if (charAt2 != 'I') {
                                            if (charAt2 == 'N' && "NaN".equals(trim3)) {
                                                A0S = Float.NaN;
                                            }
                                        } else if ("Infinity".equals(trim3) || "INF".equals(trim3)) {
                                            A0S = Float.POSITIVE_INFINITY;
                                        }
                                    } else if ("-Infinity".equals(trim3) || "-INF".equals(trim3)) {
                                        A0S = Float.NEGATIVE_INFINITY;
                                    }
                                    try {
                                        return Float.valueOf(Float.parseFloat(trim3));
                                    } catch (IllegalArgumentException unused4) {
                                        cls4 = numberDeserializers$FloatDeserializer.A00;
                                        str3 = "not a valid Float value";
                                        str2 = trim3;
                                    }
                                }
                            } else if (A0g7 != C13120hv.VALUE_NULL) {
                                throw byY.A0B(numberDeserializers$FloatDeserializer.A00, A0g7);
                            }
                            return (Float) numberDeserializers$FloatDeserializer.A05();
                        }
                        return Float.valueOf(A0S);
                    } else if (this instanceof NumberDeserializers$DoubleDeserializer) {
                        return ((NumberDeserializers$DoubleDeserializer) this).A0G(r12, byY);
                    } else {
                        if (this instanceof NumberDeserializers$CharacterDeserializer) {
                            NumberDeserializers$CharacterDeserializer numberDeserializers$CharacterDeserializer = (NumberDeserializers$CharacterDeserializer) this;
                            C13120hv A0g8 = r12.A0g();
                            if (A0g8 == C13120hv.VALUE_NUMBER_INT) {
                                int A0T = r12.A0T();
                                if (A0T >= 0 && A0T <= 65535) {
                                    charAt = (char) A0T;
                                }
                                throw byY.A0B(numberDeserializers$CharacterDeserializer.A00, A0g8);
                            }
                            if (A0g8 == C13120hv.VALUE_STRING) {
                                String A0t3 = r12.A0t();
                                int length4 = A0t3.length();
                                if (length4 == 1) {
                                    charAt = A0t3.charAt(0);
                                } else if (length4 == 0) {
                                    return (Character) numberDeserializers$CharacterDeserializer.A05();
                                }
                            }
                            throw byY.A0B(numberDeserializers$CharacterDeserializer.A00, A0g8);
                            return Character.valueOf(charAt);
                        } else if (this instanceof NumberDeserializers$ByteDeserializer) {
                            NumberDeserializers$ByteDeserializer numberDeserializers$ByteDeserializer = (NumberDeserializers$ByteDeserializer) this;
                            C13120hv A0g9 = r12.A0g();
                            if (A0g9 == C13120hv.VALUE_NUMBER_INT || A0g9 == C13120hv.VALUE_NUMBER_FLOAT) {
                                b = r12.A0G();
                            } else {
                                if (A0g9 == C13120hv.VALUE_STRING) {
                                    String trim4 = r12.A0t().trim();
                                    try {
                                        if (trim4.length() == 0) {
                                            return (Byte) numberDeserializers$ByteDeserializer.A05();
                                        }
                                        int A014 = C13230i7.A01(trim4);
                                        if (A014 < -128 || A014 > 255) {
                                            bya3 = byY.A0F(trim4, numberDeserializers$ByteDeserializer.A00, "overflow, value can not be represented as 8-bit value");
                                        } else {
                                            b = (byte) A014;
                                        }
                                    } catch (IllegalArgumentException unused5) {
                                        cls4 = numberDeserializers$ByteDeserializer.A00;
                                        str3 = "not a valid Byte value";
                                        str2 = trim4;
                                    }
                                } else if (A0g9 == C13120hv.VALUE_NULL) {
                                    return (Byte) numberDeserializers$ByteDeserializer.A05();
                                } else {
                                    bya3 = byY.A0B(numberDeserializers$ByteDeserializer.A00, A0g9);
                                }
                                throw bya3;
                            }
                            return Byte.valueOf(b);
                        } else if (this instanceof NumberDeserializers$BooleanDeserializer) {
                            return ((NumberDeserializers$BooleanDeserializer) this).A0F(r12, byY);
                        } else {
                            if (this instanceof NumberDeserializers$BigIntegerDeserializer) {
                                NumberDeserializers$BigIntegerDeserializer numberDeserializers$BigIntegerDeserializer = (NumberDeserializers$BigIntegerDeserializer) this;
                                C13120hv A0g10 = r12.A0g();
                                if (A0g10 == C13120hv.VALUE_NUMBER_INT) {
                                    switch (r12.A0X().intValue()) {
                                        case 0:
                                        case 1:
                                            return BigInteger.valueOf(r12.A0U());
                                    }
                                } else if (A0g10 == C13120hv.VALUE_NUMBER_FLOAT) {
                                    return r12.A0a().toBigInteger();
                                } else {
                                    if (A0g10 != C13120hv.VALUE_STRING) {
                                        throw byY.A0B(numberDeserializers$BigIntegerDeserializer.A00, A0g10);
                                    }
                                }
                                String trim5 = r12.A0t().trim();
                                if (trim5.length() == 0) {
                                    return null;
                                }
                                try {
                                    return new BigInteger(trim5);
                                } catch (IllegalArgumentException unused6) {
                                    cls4 = numberDeserializers$BigIntegerDeserializer.A00;
                                    str3 = "not a valid representation";
                                    str2 = trim5;
                                }
                            } else if (this instanceof NumberDeserializers$BigDecimalDeserializer) {
                                NumberDeserializers$BigDecimalDeserializer numberDeserializers$BigDecimalDeserializer = (NumberDeserializers$BigDecimalDeserializer) this;
                                C13120hv A0g11 = r12.A0g();
                                if (A0g11 == C13120hv.VALUE_NUMBER_INT || A0g11 == C13120hv.VALUE_NUMBER_FLOAT) {
                                    return r12.A0a();
                                }
                                if (A0g11 == C13120hv.VALUE_STRING) {
                                    String trim6 = r12.A0t().trim();
                                    if (trim6.length() == 0) {
                                        return null;
                                    }
                                    try {
                                        return new BigDecimal(trim6);
                                    } catch (IllegalArgumentException unused7) {
                                        cls4 = numberDeserializers$BigDecimalDeserializer.A00;
                                        str3 = "not a valid representation";
                                        str2 = trim6;
                                    }
                                } else {
                                    throw byY.A0B(numberDeserializers$BigDecimalDeserializer.A00, A0g11);
                                }
                            } else if (this instanceof JdkDeserializers$StackTraceElementDeserializer) {
                                JdkDeserializers$StackTraceElementDeserializer jdkDeserializers$StackTraceElementDeserializer = (JdkDeserializers$StackTraceElementDeserializer) this;
                                C13120hv A0g12 = r12.A0g();
                                if (A0g12 == C13120hv.START_OBJECT) {
                                    String str10 = "";
                                    String str11 = str10;
                                    String str12 = str10;
                                    int i18 = -1;
                                    while (true) {
                                        C13120hv A0h = r12.A0h();
                                        if (A0h == C13120hv.END_OBJECT) {
                                            return new StackTraceElement(str10, str11, str12, i18);
                                        }
                                        String A0i = r12.A0i();
                                        if ("className".equals(A0i)) {
                                            str10 = r12.A0t();
                                        } else if ("fileName".equals(A0i)) {
                                            str12 = r12.A0t();
                                        } else if ("lineNumber".equals(A0i)) {
                                            if (A0h != C13120hv.VALUE_NUMBER_INT) {
                                                z = false;
                                            }
                                            z = true;
                                            if (!z) {
                                                bya4 = C27125Bya.A00(r12, "Non-numeric token (" + A0h + ") for property 'lineNumber'");
                                                break;
                                            }
                                            i18 = r12.A0T();
                                        } else if ("methodName".equals(A0i)) {
                                            str11 = r12.A0t();
                                        } else if (!"nativeMethod".equals(A0i)) {
                                            jdkDeserializers$StackTraceElementDeserializer.A0J(r12, byY, jdkDeserializers$StackTraceElementDeserializer.A00, A0i);
                                        }
                                    }
                                } else {
                                    bya4 = byY.A0B(jdkDeserializers$StackTraceElementDeserializer.A00, A0g12);
                                }
                                throw bya4;
                            } else if (this instanceof JdkDeserializers$AtomicReferenceDeserializer) {
                                return new AtomicReference(((JdkDeserializers$AtomicReferenceDeserializer) this).A00.A06(r12, byY));
                            } else {
                                if (this instanceof JdkDeserializers$AtomicBooleanDeserializer) {
                                    return new AtomicBoolean(((JdkDeserializers$AtomicBooleanDeserializer) this).A0K(r12, byY));
                                }
                                if (this instanceof JacksonDeserializers$TokenBufferDeserializer) {
                                    C13480ib r13 = new C13480ib(r12.A0q());
                                    r13.A0q(r12);
                                    return r13;
                                } else if (this instanceof JacksonDeserializers$JavaTypeDeserializer) {
                                    JacksonDeserializers$JavaTypeDeserializer jacksonDeserializers$JavaTypeDeserializer = (JacksonDeserializers$JavaTypeDeserializer) this;
                                    C13120hv A0g13 = r12.A0g();
                                    if (A0g13 == C13120hv.VALUE_STRING) {
                                        String trim7 = r12.A0t().trim();
                                        if (trim7.length() == 0) {
                                            A0Z = jacksonDeserializers$JavaTypeDeserializer.A05();
                                        } else {
                                            C04 c04 = byY.A05().A00;
                                            C2O c2o = new C2O(trim7.trim());
                                            C0L A015 = c04.A01(c2o);
                                            if (!c2o.hasMoreTokens()) {
                                                return A015;
                                            }
                                            throw C04.A00(c2o, "Unexpected tokens after complete type");
                                        }
                                    } else if (A0g13 == C13120hv.VALUE_EMBEDDED_OBJECT) {
                                        A0Z = r12.A0Z();
                                    } else {
                                        throw byY.A0A(jacksonDeserializers$JavaTypeDeserializer.A00);
                                    }
                                    return (C0L) A0Z;
                                } else if (this instanceof FromStringDeserializer) {
                                    FromStringDeserializer fromStringDeserializer = (FromStringDeserializer) this;
                                    String A0r = r12.A0r();
                                    if (A0r != null) {
                                        if (A0r.length() == 0) {
                                            return null;
                                        }
                                        String trim8 = A0r.trim();
                                        if (trim8.length() == 0) {
                                            return null;
                                        }
                                        try {
                                            Object A0M = fromStringDeserializer.A0M(trim8, byY);
                                            if (A0M != null) {
                                                return A0M;
                                            }
                                        } catch (IllegalArgumentException unused8) {
                                        }
                                        cls4 = fromStringDeserializer.A00;
                                        str3 = "not a valid textual representation";
                                        str2 = trim8;
                                    } else if (r12.A0g() == C13120hv.VALUE_EMBEDDED_OBJECT) {
                                        Object A0Z4 = r12.A0Z();
                                        if (A0Z4 != null) {
                                            return fromStringDeserializer.A00.isAssignableFrom(A0Z4.getClass()) ? A0Z4 : fromStringDeserializer.A0L(A0Z4, byY);
                                        }
                                        return null;
                                    } else {
                                        throw byY.A0A(fromStringDeserializer.A00);
                                    }
                                } else if (this instanceof EnumDeserializer) {
                                    EnumDeserializer enumDeserializer = (EnumDeserializer) this;
                                    C13120hv A0g14 = r12.A0g();
                                    if (A0g14 == C13120hv.VALUE_STRING || A0g14 == C13120hv.FIELD_NAME) {
                                        String A0t4 = r12.A0t();
                                        Enum enumR3 = (Enum) enumDeserializer.A00.A01.get(A0t4);
                                        if (enumR3 != null) {
                                            return enumR3;
                                        }
                                        if (byY.A0O(C27109ByB.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT) && (A0t4.length() == 0 || A0t4.trim().length() == 0)) {
                                            return null;
                                        }
                                        if (byY.A0O(C27109ByB.READ_UNKNOWN_ENUM_VALUES_AS_NULL)) {
                                            return enumR3;
                                        }
                                        bya5 = byY.A0F(A0t4, enumDeserializer.A00.A00, "value not one of declared Enum instance names");
                                    } else if (A0g14 != C13120hv.VALUE_NUMBER_INT) {
                                        bya5 = byY.A0A(enumDeserializer.A00.A00);
                                    } else if (!byY.A0O(C27109ByB.FAIL_ON_NUMBERS_FOR_ENUMS)) {
                                        int A0T2 = r12.A0T();
                                        C27121ByW byW = enumDeserializer.A00;
                                        if (A0T2 >= 0) {
                                            Enum[] enumArr = byW.A02;
                                            if (A0T2 < enumArr.length) {
                                                enumR = enumArr[A0T2];
                                                if (enumR != null || byY.A0O(C27109ByB.READ_UNKNOWN_ENUM_VALUES_AS_NULL)) {
                                                    return enumR;
                                                }
                                                Class cls5 = byW.A00;
                                                String A064 = AnonymousClass000.A06("index value outside legal index range [0..", byW.A02.length - 1, "]");
                                                C13080hr r4 = byY.A05;
                                                String name = cls5.getName();
                                                try {
                                                    str4 = C27123ByY.A01(r4.A0t());
                                                } catch (Exception unused9) {
                                                    str4 = "[N/A]";
                                                }
                                                throw new C27122ByX(AnonymousClass000.A0P("Can not construct instance of ", name, " from number value (", str4, "): ", A064), r4.A0W(), (Object) null);
                                            }
                                        }
                                        enumR = null;
                                        if (enumR != null || byY.A0O(C27109ByB.READ_UNKNOWN_ENUM_VALUES_AS_NULL)) {
                                        }
                                    } else {
                                        bya5 = C27125Bya.A00(byY.A05, "Not allowed to deserialize Enum value out of JSON number (disable DeserializationConfig.DeserializationFeature.FAIL_ON_NUMBERS_FOR_ENUMS to allow)");
                                    }
                                    throw bya5;
                                } else if (this instanceof EnumDeserializer.FactoryBasedDeserializer) {
                                    EnumDeserializer.FactoryBasedDeserializer factoryBasedDeserializer = (EnumDeserializer.FactoryBasedDeserializer) this;
                                    Class<Long> cls6 = factoryBasedDeserializer.A01;
                                    if (cls6 == null) {
                                        obj = r12.A0t();
                                    } else if (cls6 == Integer.class) {
                                        obj = Integer.valueOf(r12.A0I());
                                    } else if (cls6 == Long.class) {
                                        obj = Long.valueOf(r12.A0J());
                                    } else {
                                        throw byY.A0A(factoryBasedDeserializer.A00);
                                    }
                                    try {
                                        return factoryBasedDeserializer.A02.invoke(factoryBasedDeserializer.A00, new Object[]{obj});
                                    } catch (Exception e) {
                                        C26691Bpp.A05(e);
                                        return null;
                                    }
                                } else if (this instanceof DateDeserializers$TimestampDeserializer) {
                                    return new Timestamp(((DateDeserializers$TimestampDeserializer) this).A0I(r12, byY).getTime());
                                } else {
                                    if (this instanceof DateDeserializers$SqlDateDeserializer) {
                                        Date A0I9 = ((DateDeserializers$SqlDateDeserializer) this).A0I(r12, byY);
                                        if (A0I9 != null) {
                                            return new java.sql.Date(A0I9.getTime());
                                        }
                                        return null;
                                    } else if (this instanceof DateDeserializers$DateDeserializer) {
                                        return ((DateDeserializers$DateDeserializer) this).A0I(r12, byY);
                                    } else {
                                        if (this instanceof DateDeserializers$CalendarDeserializer) {
                                            DateDeserializers$CalendarDeserializer dateDeserializers$CalendarDeserializer = (DateDeserializers$CalendarDeserializer) this;
                                            Date A0I10 = dateDeserializers$CalendarDeserializer.A0I(r12, byY);
                                            if (A0I10 == null) {
                                                return null;
                                            }
                                            Class cls7 = dateDeserializers$CalendarDeserializer.A00;
                                            if (cls7 == null) {
                                                Calendar instance = Calendar.getInstance(byY.A00.A00.A07);
                                                instance.setTime(A0I10);
                                                return instance;
                                            }
                                            try {
                                                Calendar calendar = (Calendar) cls7.newInstance();
                                                calendar.setTimeInMillis(A0I10.getTime());
                                                TimeZone timeZone2 = byY.A00.A00.A07;
                                                if (timeZone2 == null) {
                                                    return calendar;
                                                }
                                                calendar.setTimeZone(timeZone2);
                                                return calendar;
                                            } catch (Exception e2) {
                                                throw byY.A0E(dateDeserializers$CalendarDeserializer.A00, e2);
                                            }
                                        } else if (this instanceof ClassDeserializer) {
                                            ClassDeserializer classDeserializer = (ClassDeserializer) this;
                                            C13120hv A0g15 = r12.A0g();
                                            if (A0g15 == C13120hv.VALUE_STRING) {
                                                try {
                                                    return C26691Bpp.A01(r12.A0t().trim());
                                                } catch (Exception e3) {
                                                    e = e3;
                                                    Class cls8 = classDeserializer.A00;
                                                    while (e.getCause() != null) {
                                                        e = e.getCause();
                                                    }
                                                    bya6 = byY.A0E(cls8, e);
                                                }
                                            } else {
                                                bya6 = byY.A0B(classDeserializer.A00, A0g15);
                                                throw bya6;
                                            }
                                        } else if (this instanceof StringCollectionDeserializer) {
                                            StringCollectionDeserializer stringCollectionDeserializer = (StringCollectionDeserializer) this;
                                            JsonDeserializer jsonDeserializer3 = stringCollectionDeserializer.A01;
                                            if (jsonDeserializer3 != null) {
                                                return (Collection) stringCollectionDeserializer.A03.A09(byY, jsonDeserializer3.A06(r12, byY));
                                            }
                                            Collection collection = (Collection) stringCollectionDeserializer.A03.A05(byY);
                                            stringCollectionDeserializer.A0M(r12, byY, collection);
                                            return collection;
                                        } else if (this instanceof ObjectArrayDeserializer) {
                                            ObjectArrayDeserializer objectArrayDeserializer = (ObjectArrayDeserializer) this;
                                            if (!r12.A0P()) {
                                                C13120hv A0g16 = r12.A0g();
                                                C13120hv r14 = C13120hv.VALUE_STRING;
                                                Object obj3 = null;
                                                if (!(A0g16 == r14 && byY.A0O(C27109ByB.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT) && r12.A0t().length() == 0)) {
                                                    if (byY.A0O(C27109ByB.ACCEPT_SINGLE_VALUE_AS_ARRAY)) {
                                                        if (r12.A0g() != C13120hv.VALUE_NULL) {
                                                            C27106By5 by52 = objectArrayDeserializer.A01;
                                                            obj3 = by52 == null ? objectArrayDeserializer.A00.A06(r12, byY) : objectArrayDeserializer.A00.A07(r12, byY, by52);
                                                        }
                                                        Object[] objArr4 = objectArrayDeserializer.A04 ? new Object[1] : (Object[]) Array.newInstance(objectArrayDeserializer.A03, 1);
                                                        objArr4[0] = obj3;
                                                        return objArr4;
                                                    } else if (r12.A0g() == r14 && objectArrayDeserializer.A03 == Byte.class) {
                                                        byte[] A0v = r12.A0v(byY.A00.A00.A00);
                                                        int length5 = A0v.length;
                                                        Byte[] bArr2 = new Byte[length5];
                                                        for (int i19 = 0; i19 < length5; i19++) {
                                                            bArr2[i19] = Byte.valueOf(A0v[i19]);
                                                        }
                                                        obj3 = bArr2;
                                                    } else {
                                                        throw byY.A0A(objectArrayDeserializer.A02.A00);
                                                    }
                                                }
                                                return obj3;
                                            }
                                            C26716Bqn A0J3 = byY.A0J();
                                            Object[] A016 = A0J3.A01();
                                            C27106By5 by53 = objectArrayDeserializer.A01;
                                            int i20 = 0;
                                            while (true) {
                                                C13120hv A0p5 = r12.A0p();
                                                if (A0p5 == C13120hv.END_ARRAY) {
                                                    break;
                                                }
                                                Object A065 = A0p5 == C13120hv.VALUE_NULL ? null : by53 == null ? objectArrayDeserializer.A00.A06(r12, byY) : objectArrayDeserializer.A00.A07(r12, byY, by53);
                                                if (i20 >= A016.length) {
                                                    A016 = A0J3.A02(A016);
                                                    i20 = 0;
                                                }
                                                A016[i20] = A065;
                                                i20++;
                                            }
                                            if (objectArrayDeserializer.A04) {
                                                int i21 = A0J3.A00 + i20;
                                                A03 = new Object[i21];
                                                A0J3.A00(A03, i21, A016, i20);
                                            } else {
                                                A03 = A0J3.A03(A016, i20, objectArrayDeserializer.A03);
                                            }
                                            byY.A0N(A0J3);
                                            return A03;
                                        } else if (this instanceof MapDeserializer) {
                                            MapDeserializer mapDeserializer = (MapDeserializer) this;
                                            C27162Bza bza = mapDeserializer.A01;
                                            if (bza != null) {
                                                C27163Bzb A017 = bza.A01(r12, byY, (C27164Bzc) null);
                                                C13120hv A0g17 = r12.A0g();
                                                if (A0g17 == C13120hv.START_OBJECT) {
                                                    A0g17 = r12.A0p();
                                                }
                                                JsonDeserializer jsonDeserializer4 = mapDeserializer.A05;
                                                C27106By5 by54 = mapDeserializer.A08;
                                                while (A0g17 == C13120hv.FIELD_NAME) {
                                                    String A0i2 = r12.A0i();
                                                    C13120hv A0p6 = r12.A0p();
                                                    HashSet hashSet = mapDeserializer.A02;
                                                    if (hashSet == null || !hashSet.contains(A0i2)) {
                                                        C27176Bzt bzt = (C27176Bzt) bza.A00.get(A0i2);
                                                        if (bzt != null) {
                                                            if (A017.A02(bzt.A01(), bzt.A05(r12, byY))) {
                                                                r12.A0p();
                                                                try {
                                                                    map = (Map) bza.A02(byY, A017);
                                                                } catch (Exception e4) {
                                                                    e = e4;
                                                                    Class cls9 = mapDeserializer.A04.A00;
                                                                    while ((e instanceof InvocationTargetException) && e.getCause() != null) {
                                                                        e = e.getCause();
                                                                    }
                                                                    if (e instanceof Error) {
                                                                        throw ((Error) e);
                                                                    } else if (!(e instanceof IOException) || (e instanceof C27125Bya)) {
                                                                        throw C27125Bya.A01(e, new C200288hn((Object) cls9, (String) null));
                                                                    } else {
                                                                        throw ((IOException) e);
                                                                    }
                                                                }
                                                            }
                                                        } else {
                                                            A017.A00 = new C27161BzZ(A017.A00, A0p6 == C13120hv.VALUE_NULL ? null : by54 == null ? jsonDeserializer4.A06(r12, byY) : jsonDeserializer4.A07(r12, byY, by54), mapDeserializer.A06.A00(r12.A0i(), byY));
                                                        }
                                                    } else {
                                                        r12.A0f();
                                                    }
                                                    A0g17 = r12.A0p();
                                                }
                                                return (Map) bza.A02(byY, A017);
                                            }
                                            JsonDeserializer jsonDeserializer5 = mapDeserializer.A00;
                                            if (jsonDeserializer5 != null) {
                                                A0A = mapDeserializer.A07.A09(byY, jsonDeserializer5.A06(r12, byY));
                                            } else {
                                                if (mapDeserializer.A09) {
                                                    C13120hv A0g18 = r12.A0g();
                                                    if (A0g18 == C13120hv.START_OBJECT || A0g18 == C13120hv.FIELD_NAME || A0g18 == C13120hv.END_OBJECT) {
                                                        map = (Map) mapDeserializer.A07.A05(byY);
                                                        if (mapDeserializer.A03) {
                                                            mapDeserializer.A0N(r12, byY, map);
                                                            return map;
                                                        }
                                                    } else if (A0g18 == C13120hv.VALUE_STRING) {
                                                        A0A = mapDeserializer.A07.A0A(byY, r12.A0t());
                                                    } else {
                                                        bya7 = byY.A0A(mapDeserializer.A04.A00);
                                                    }
                                                } else {
                                                    bya7 = byY.A0C(mapDeserializer.A04.A00, "No default constructor found");
                                                }
                                                throw bya7;
                                            }
                                            return (Map) A0A;
                                            mapDeserializer.A0M(r12, byY, map);
                                            return map;
                                        } else if (this instanceof CollectionDeserializer) {
                                            CollectionDeserializer collectionDeserializer = (CollectionDeserializer) this;
                                            if (collectionDeserializer instanceof ArrayBlockingQueueDeserializer) {
                                                collectionDeserializer = (ArrayBlockingQueueDeserializer) collectionDeserializer;
                                            }
                                            return collectionDeserializer.A0N(r12, byY);
                                        } else if (this instanceof BeanAsArrayDeserializer) {
                                            BeanAsArrayDeserializer beanAsArrayDeserializer = (BeanAsArrayDeserializer) this;
                                            if (r12.A0g() != C13120hv.START_ARRAY) {
                                                return beanAsArrayDeserializer.A0e(r12, byY);
                                            }
                                            if (beanAsArrayDeserializer.A06) {
                                                Object A052 = beanAsArrayDeserializer.A08.A05(byY);
                                                C27176Bzt[] bztArr = beanAsArrayDeserializer.A01;
                                                int i22 = 0;
                                                int length6 = bztArr.length;
                                                while (true) {
                                                    C13120hv A0p7 = r12.A0p();
                                                    C13120hv r15 = C13120hv.END_ARRAY;
                                                    if (A0p7 == r15) {
                                                        return A052;
                                                    }
                                                    if (i22 != length6) {
                                                        C27176Bzt bzt2 = bztArr[i22];
                                                        if (bzt2 != null) {
                                                            try {
                                                                bzt2.A08(r12, byY, A052);
                                                            } catch (Exception e5) {
                                                                beanAsArrayDeserializer.A0d(e5, A052, bzt2.A07, byY);
                                                            }
                                                        } else {
                                                            r12.A0f();
                                                        }
                                                        i22++;
                                                    } else if (!beanAsArrayDeserializer.A0D) {
                                                        throw C27125Bya.A00(byY.A05, AnonymousClass000.A06("Unexpected JSON values; expected at most ", length6, " properties (in JSON Array)"));
                                                    } else {
                                                        while (r12.A0p() != r15) {
                                                            r12.A0f();
                                                        }
                                                        return A052;
                                                    }
                                                }
                                            } else if (beanAsArrayDeserializer.A05) {
                                                JsonDeserializer jsonDeserializer6 = beanAsArrayDeserializer.A00;
                                                if (jsonDeserializer6 != null) {
                                                    return beanAsArrayDeserializer.A08.A09(byY, jsonDeserializer6.A06(r12, byY));
                                                }
                                                if (beanAsArrayDeserializer.A03 != null) {
                                                    return beanAsArrayDeserializer.A0O(r12, byY);
                                                }
                                                if (beanAsArrayDeserializer.A07.A0K()) {
                                                    sb = new StringBuilder("Can not instantiate abstract type ");
                                                    sb.append(beanAsArrayDeserializer.A07);
                                                    str5 = " (need to add/enable type information?)";
                                                } else {
                                                    sb = new StringBuilder("No suitable constructor found for type ");
                                                    sb.append(beanAsArrayDeserializer.A07);
                                                    str5 = ": can not instantiate from JSON object (need to add/enable type information?)";
                                                }
                                                sb.append(str5);
                                                throw C27125Bya.A00(r12, sb.toString());
                                            } else {
                                                Object A053 = beanAsArrayDeserializer.A08.A05(byY);
                                                if (beanAsArrayDeserializer.A0F != null) {
                                                    beanAsArrayDeserializer.A0a(byY, A053);
                                                }
                                                boolean z2 = beanAsArrayDeserializer.A0E;
                                                C27176Bzt[] bztArr2 = beanAsArrayDeserializer.A01;
                                                int i23 = 0;
                                                int length7 = bztArr2.length;
                                                while (r12.A0p() != C13120hv.END_ARRAY) {
                                                    if (i23 != length7) {
                                                        C27176Bzt bzt3 = bztArr2[i23];
                                                        i23++;
                                                        if (bzt3 != null) {
                                                            try {
                                                                bzt3.A08(r12, byY, A053);
                                                            } catch (Exception e6) {
                                                                beanAsArrayDeserializer.A0d(e6, A053, bzt3.A07, byY);
                                                            }
                                                        } else {
                                                            r12.A0f();
                                                        }
                                                    } else if (!beanAsArrayDeserializer.A0D) {
                                                        throw C27125Bya.A00(byY.A05, AnonymousClass000.A06("Unexpected JSON values; expected at most ", length7, " properties (in JSON Array)"));
                                                    } else {
                                                        while (r12.A0p() != C13120hv.END_ARRAY) {
                                                            r12.A0f();
                                                        }
                                                        return A053;
                                                    }
                                                }
                                                return A053;
                                            }
                                        } else if (!(this instanceof BeanAsArrayBuilderDeserializer)) {
                                            if (this instanceof BuilderBasedDeserializer) {
                                                BuilderBasedDeserializer builderBasedDeserializer = (BuilderBasedDeserializer) this;
                                                C13120hv A0g19 = r12.A0g();
                                                if (A0g19 == C13120hv.START_OBJECT) {
                                                    r12.A0p();
                                                    if (builderBasedDeserializer.A06) {
                                                        Object A054 = builderBasedDeserializer.A08.A05(byY);
                                                        while (r12.A0g() != C13120hv.END_OBJECT) {
                                                            String A0i3 = r12.A0i();
                                                            r12.A0p();
                                                            C27176Bzt A00 = builderBasedDeserializer.A09.A00(A0i3);
                                                            if (A00 != null) {
                                                                try {
                                                                    A054 = A00.A06(r12, byY, A054);
                                                                } catch (Exception e7) {
                                                                    builderBasedDeserializer.A0d(e7, A054, A0i3, byY);
                                                                }
                                                            } else {
                                                                builderBasedDeserializer.A0Z(r12, byY, A054, A0i3);
                                                            }
                                                            r12.A0p();
                                                        }
                                                        return builderBasedDeserializer.A0g(byY, A054);
                                                    }
                                                } else {
                                                    switch (C26712Bqf.A00[A0g19.ordinal()]) {
                                                        case 1:
                                                            obj2 = builderBasedDeserializer.A0V(r12, byY);
                                                            break;
                                                        case 2:
                                                            obj2 = builderBasedDeserializer.A0T(r12, byY);
                                                            break;
                                                        case 3:
                                                            obj2 = builderBasedDeserializer.A0S(r12, byY);
                                                            break;
                                                        case 4:
                                                            break;
                                                        case 5:
                                                        case 6:
                                                            obj2 = builderBasedDeserializer.A0R(r12, byY);
                                                            break;
                                                        case 7:
                                                            obj2 = builderBasedDeserializer.A0Q(r12, byY);
                                                            break;
                                                        case 8:
                                                        case 9:
                                                            break;
                                                        default:
                                                            throw byY.A0A(builderBasedDeserializer.A07.A00);
                                                    }
                                                }
                                                obj2 = builderBasedDeserializer.A0P(r12, byY);
                                                return builderBasedDeserializer.A0g(byY, obj2);
                                            } else if (!(this instanceof BeanDeserializer)) {
                                                throw byY.A0C(((AbstractDeserializer) this).A00.A00, "abstract types either need to be mapped to concrete types, have custom deserializer, or be instantiated with additional type information");
                                            } else {
                                                BeanDeserializer beanDeserializer = (BeanDeserializer) this;
                                                C13120hv A0g20 = r12.A0g();
                                                if (A0g20 == C13120hv.START_OBJECT) {
                                                    if (beanDeserializer.A06) {
                                                        r12.A0p();
                                                    } else {
                                                        r12.A0p();
                                                        return beanDeserializer.A0A != null ? beanDeserializer.A0W(r12, byY) : beanDeserializer.A0P(r12, byY);
                                                    }
                                                } else if (A0g20 == null) {
                                                    throw C27125Bya.A00(byY.A05, AnonymousClass000.A0E("Unexpected end-of-input when trying to deserialize a ", beanDeserializer.A07.A00.getName()));
                                                } else {
                                                    switch (C26711Bqe.A00[A0g20.ordinal()]) {
                                                        case 1:
                                                            return beanDeserializer.A0V(r12, byY);
                                                        case 2:
                                                            return beanDeserializer.A0T(r12, byY);
                                                        case 3:
                                                            return beanDeserializer.A0S(r12, byY);
                                                        case 4:
                                                            break;
                                                        case 5:
                                                        case 6:
                                                            return beanDeserializer.A0R(r12, byY);
                                                        case 7:
                                                            return beanDeserializer.A0Q(r12, byY);
                                                        case 8:
                                                        case 9:
                                                            break;
                                                        default:
                                                            throw byY.A0A(beanDeserializer.A07.A00);
                                                    }
                                                }
                                                return BeanDeserializer.A00(beanDeserializer, r12, byY);
                                            }
                                            return r12.A0Z();
                                        } else {
                                            BeanAsArrayBuilderDeserializer beanAsArrayBuilderDeserializer = (BeanAsArrayBuilderDeserializer) this;
                                            if (r12.A0g() != C13120hv.START_ARRAY) {
                                                A05 = beanAsArrayBuilderDeserializer.A0e(r12, byY);
                                            } else if (beanAsArrayBuilderDeserializer.A06) {
                                                A05 = beanAsArrayBuilderDeserializer.A08.A05(byY);
                                                C27176Bzt[] bztArr3 = beanAsArrayBuilderDeserializer.A02;
                                                int i24 = 0;
                                                int length8 = bztArr3.length;
                                                while (true) {
                                                    C13120hv A0p8 = r12.A0p();
                                                    C13120hv r16 = C13120hv.END_ARRAY;
                                                    if (A0p8 == r16) {
                                                        break;
                                                    } else if (i24 != length8) {
                                                        C27176Bzt bzt4 = bztArr3[i24];
                                                        if (bzt4 != null) {
                                                            try {
                                                                A05 = bzt4.A06(r12, byY, A05);
                                                            } catch (Exception e8) {
                                                                beanAsArrayBuilderDeserializer.A0d(e8, A05, bzt4.A07, byY);
                                                            }
                                                        } else {
                                                            r12.A0f();
                                                        }
                                                        i24++;
                                                    } else if (!beanAsArrayBuilderDeserializer.A0D) {
                                                        throw C27125Bya.A00(byY.A05, AnonymousClass000.A06("Unexpected JSON values; expected at most ", length8, " properties (in JSON Array)"));
                                                    } else {
                                                        while (r12.A0p() != r16) {
                                                            r12.A0f();
                                                        }
                                                    }
                                                }
                                            } else if (beanAsArrayBuilderDeserializer.A05) {
                                                JsonDeserializer jsonDeserializer7 = beanAsArrayBuilderDeserializer.A00;
                                                if (jsonDeserializer7 != null) {
                                                    A05 = beanAsArrayBuilderDeserializer.A08.A09(byY, jsonDeserializer7.A06(r12, byY));
                                                } else if (beanAsArrayBuilderDeserializer.A03 != null) {
                                                    A05 = beanAsArrayBuilderDeserializer.A0O(r12, byY);
                                                } else {
                                                    if (beanAsArrayBuilderDeserializer.A07.A0K()) {
                                                        sb2 = new StringBuilder("Can not instantiate abstract type ");
                                                        sb2.append(beanAsArrayBuilderDeserializer.A07);
                                                        str6 = " (need to add/enable type information?)";
                                                    } else {
                                                        sb2 = new StringBuilder("No suitable constructor found for type ");
                                                        sb2.append(beanAsArrayBuilderDeserializer.A07);
                                                        str6 = ": can not instantiate from JSON object (need to add/enable type information?)";
                                                    }
                                                    sb2.append(str6);
                                                    throw C27125Bya.A00(r12, sb2.toString());
                                                }
                                            } else {
                                                A05 = beanAsArrayBuilderDeserializer.A08.A05(byY);
                                                if (beanAsArrayBuilderDeserializer.A0F != null) {
                                                    beanAsArrayBuilderDeserializer.A0a(byY, A05);
                                                }
                                                boolean z3 = beanAsArrayBuilderDeserializer.A0E;
                                                C27176Bzt[] bztArr4 = beanAsArrayBuilderDeserializer.A02;
                                                int i25 = 0;
                                                int length9 = bztArr4.length;
                                                while (true) {
                                                    if (r12.A0p() == C13120hv.END_ARRAY) {
                                                        break;
                                                    } else if (i25 != length9) {
                                                        C27176Bzt bzt5 = bztArr4[i25];
                                                        i25++;
                                                        if (bzt5 != null) {
                                                            try {
                                                                bzt5.A06(r12, byY, A05);
                                                            } catch (Exception e9) {
                                                                beanAsArrayBuilderDeserializer.A0d(e9, A05, bzt5.A07, byY);
                                                            }
                                                        } else {
                                                            r12.A0f();
                                                        }
                                                    } else if (!beanAsArrayBuilderDeserializer.A0D) {
                                                        throw C27125Bya.A00(byY.A05, AnonymousClass000.A06("Unexpected JSON values; expected at most ", length9, " properties (in JSON Array)"));
                                                    } else {
                                                        while (r12.A0p() != C13120hv.END_ARRAY) {
                                                            r12.A0f();
                                                        }
                                                    }
                                                }
                                            }
                                            return beanAsArrayBuilderDeserializer.A0f(byY, A05);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            throw byY.A0F(str2, cls4, str3);
        } else {
            EnumSetDeserializer enumSetDeserializer = (EnumSetDeserializer) this;
            if (r12.A0P()) {
                EnumSet noneOf = EnumSet.noneOf(enumSetDeserializer.A02);
                while (true) {
                    C13120hv A0p9 = r12.A0p();
                    if (A0p9 != C13120hv.END_ARRAY) {
                        if (A0p9 == C13120hv.VALUE_NULL) {
                            cls3 = enumSetDeserializer.A02;
                            break;
                        }
                        Enum enumR4 = (Enum) enumSetDeserializer.A00.A06(r12, byY);
                        if (enumR4 != null) {
                            noneOf.add(enumR4);
                        }
                    } else {
                        return noneOf;
                    }
                }
            } else {
                cls3 = EnumSet.class;
            }
            throw byY.A0A(cls3);
        }
    }

    public Collection A09() {
        if (!(this instanceof BeanDeserializerBase)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = ((BeanDeserializerBase) this).A09.iterator();
        while (it.hasNext()) {
            arrayList.add(((C27176Bzt) it.next()).A07);
        }
        return arrayList;
    }

    public boolean A0A() {
        return (this instanceof EnumSetDeserializer) || (this instanceof EnumMapDeserializer) || (this instanceof EnumDeserializer) || (this instanceof BeanDeserializerBase) || (this instanceof AbstractDeserializer);
    }

    public Object A07(C13080hr r5, C27123ByY byY, C27106By5 by5) {
        C13120hv A0g;
        Object obj;
        C13120hv A0g2;
        if (!(this instanceof TypeWrappedDeserializer)) {
            if (this instanceof StdDeserializer) {
                StdDeserializer stdDeserializer = (StdDeserializer) this;
                if (!(stdDeserializer instanceof UntypedObjectDeserializer)) {
                    if (!(stdDeserializer instanceof StringArrayDeserializer)) {
                        if (stdDeserializer instanceof StdDelegatingDeserializer) {
                            StdDelegatingDeserializer stdDelegatingDeserializer = (StdDelegatingDeserializer) stdDeserializer;
                            Object A07 = stdDelegatingDeserializer.A00.A07(r5, byY, by5);
                            if (A07 != null) {
                                return stdDelegatingDeserializer.A01.A9o(A07);
                            }
                            return null;
                        } else if (!(stdDeserializer instanceof PrimitiveArrayDeserializers)) {
                            if (stdDeserializer instanceof StdScalarDeserializer) {
                                StdScalarDeserializer stdScalarDeserializer = (StdScalarDeserializer) stdDeserializer;
                                if (stdScalarDeserializer instanceof StringDeserializer) {
                                    return ((StringDeserializer) stdScalarDeserializer).A0L(r5, byY);
                                }
                                if (stdScalarDeserializer instanceof NumberDeserializers$NumberDeserializer) {
                                    NumberDeserializers$NumberDeserializer numberDeserializers$NumberDeserializer = (NumberDeserializers$NumberDeserializer) stdScalarDeserializer;
                                    int i = C26708BqZ.A01[r5.A0g().ordinal()];
                                    if (i == 1 || i == 2 || i == 3) {
                                        return numberDeserializers$NumberDeserializer.A0L(r5, byY);
                                    }
                                } else if (stdScalarDeserializer instanceof NumberDeserializers$IntegerDeserializer) {
                                    return ((NumberDeserializers$IntegerDeserializer) stdScalarDeserializer).A0H(r5, byY);
                                } else {
                                    if (stdScalarDeserializer instanceof NumberDeserializers$DoubleDeserializer) {
                                        return ((NumberDeserializers$DoubleDeserializer) stdScalarDeserializer).A0G(r5, byY);
                                    }
                                    if (stdScalarDeserializer instanceof NumberDeserializers$BooleanDeserializer) {
                                        return ((NumberDeserializers$BooleanDeserializer) stdScalarDeserializer).A0F(r5, byY);
                                    }
                                }
                                return by5.A07(r5, byY);
                            } else if (stdDeserializer instanceof NullifyingDeserializer) {
                                int i2 = C26715Bqi.A00[r5.A0g().ordinal()];
                                if (!(i2 == 1 || i2 == 2 || i2 == 3)) {
                                    return null;
                                }
                            } else if (!(stdDeserializer instanceof EnumSetDeserializer)) {
                                if (!(stdDeserializer instanceof EnumMapDeserializer)) {
                                    if (!(stdDeserializer instanceof BaseNodeDeserializer)) {
                                        if (!(stdDeserializer instanceof StringCollectionDeserializer)) {
                                            if (stdDeserializer instanceof ObjectArrayDeserializer) {
                                                return (Object[]) by5.A0A(r5, byY);
                                            }
                                            if (!(stdDeserializer instanceof MapDeserializer)) {
                                                if (stdDeserializer instanceof CollectionDeserializer) {
                                                    boolean z = ((CollectionDeserializer) stdDeserializer) instanceof ArrayBlockingQueueDeserializer;
                                                } else if (stdDeserializer instanceof BeanDeserializerBase) {
                                                    BeanDeserializerBase beanDeserializerBase = (BeanDeserializerBase) stdDeserializer;
                                                    if (!(beanDeserializerBase.A0A == null || (A0g = r5.A0g()) == null || !A0g.A00())) {
                                                        return beanDeserializerBase.A0U(r5, byY);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    return by5.A0A(r5, byY);
                }
                switch (C26710Bqd.A00[r5.A0g().ordinal()]) {
                    case 1:
                    case 2:
                    case 3:
                        break;
                    case 4:
                        return r5.A0Z();
                    case 5:
                        return r5.A0t();
                    case 6:
                        if (byY.A0O(C27109ByB.USE_BIG_INTEGER_FOR_INTS)) {
                            return r5.A0b();
                        }
                        return r5.A0Y();
                    case 7:
                        if (byY.A0O(C27109ByB.USE_BIG_DECIMAL_FOR_FLOATS)) {
                            return r5.A0a();
                        }
                        return Double.valueOf(r5.A0R());
                    case 8:
                        return Boolean.TRUE;
                    case 9:
                        return Boolean.FALSE;
                    case 10:
                        return null;
                    default:
                        throw byY.A0A(Object.class);
                }
                return by5.A09(r5, byY);
            } else if (!(this instanceof AbstractDeserializer)) {
                return by5.A09(r5, byY);
            } else {
                AbstractDeserializer abstractDeserializer = (AbstractDeserializer) this;
                C27164Bzc bzc = abstractDeserializer.A01;
                if (bzc == null || (A0g2 = r5.A0g()) == null || !A0g2.A00()) {
                    int i3 = C26713Bqg.A00[r5.A0g().ordinal()];
                    if (i3 == 1) {
                        if (abstractDeserializer.A06) {
                            obj = r5.A0t();
                        }
                        obj = null;
                    } else if (i3 == 2) {
                        if (abstractDeserializer.A05) {
                            obj = Integer.valueOf(r5.A0T());
                        }
                        obj = null;
                    } else if (i3 == 3) {
                        if (abstractDeserializer.A04) {
                            obj = Double.valueOf(r5.A0R());
                        }
                        obj = null;
                    } else if (i3 != 4) {
                        if (i3 == 5 && abstractDeserializer.A03) {
                            obj = Boolean.FALSE;
                        }
                        obj = null;
                    } else {
                        if (abstractDeserializer.A03) {
                            obj = Boolean.TRUE;
                        }
                        obj = null;
                    }
                    if (obj != null) {
                        return obj;
                    }
                } else {
                    Object A06 = bzc.A02.A06(r5, byY);
                    Object obj2 = byY.A0H(A06, abstractDeserializer.A01.A00).A00;
                    if (obj2 != null) {
                        return obj2;
                    }
                    throw new IllegalStateException("Could not resolve Object Id [" + A06 + "] -- unresolved forward-reference?");
                }
            }
            return by5.A06(r5, byY);
        }
        throw new IllegalStateException("Type-wrapped deserializer's deserializeWithType should never get called");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:69:0x00f9, code lost:
        return r5.A0f(r8, r9);
     */
    public Object A08(C13080hr r7, C27123ByY byY, Object obj) {
        int i;
        if (this instanceof TypeWrappedDeserializer) {
            return ((TypeWrappedDeserializer) this).A00.A08(r7, byY, obj);
        }
        if (this instanceof StringCollectionDeserializer) {
            Collection collection = (Collection) obj;
            ((StringCollectionDeserializer) this).A0M(r7, byY, collection);
            return collection;
        } else if (this instanceof MapDeserializer) {
            MapDeserializer mapDeserializer = (MapDeserializer) this;
            Map map = (Map) obj;
            C13120hv A0g = r7.A0g();
            if (A0g != C13120hv.START_OBJECT && A0g != C13120hv.FIELD_NAME) {
                throw byY.A0A(mapDeserializer.A04.A00);
            } else if (mapDeserializer.A03) {
                mapDeserializer.A0N(r7, byY, map);
                return map;
            } else {
                mapDeserializer.A0M(r7, byY, map);
                return map;
            }
        } else if (!(this instanceof CollectionDeserializer)) {
            if (this instanceof BeanAsArrayDeserializer) {
                BeanAsArrayDeserializer beanAsArrayDeserializer = (BeanAsArrayDeserializer) this;
                if (beanAsArrayDeserializer.A0F != null) {
                    beanAsArrayDeserializer.A0a(byY, obj);
                }
                C27176Bzt[] bztArr = beanAsArrayDeserializer.A01;
                int i2 = 0;
                i = bztArr.length;
                while (true) {
                    C13120hv A0p = r7.A0p();
                    C13120hv r1 = C13120hv.END_ARRAY;
                    if (A0p == r1) {
                        break;
                    } else if (i2 != i) {
                        C27176Bzt bzt = bztArr[i2];
                        if (bzt != null) {
                            try {
                                bzt.A08(r7, byY, obj);
                            } catch (Exception e) {
                                beanAsArrayDeserializer.A0d(e, obj, bzt.A07, byY);
                            }
                        } else {
                            r7.A0f();
                        }
                        i2++;
                    } else if (beanAsArrayDeserializer.A0D) {
                        while (r7.A0p() != r1) {
                            r7.A0f();
                        }
                    }
                }
                return obj;
            } else if (this instanceof BeanAsArrayBuilderDeserializer) {
                BeanAsArrayBuilderDeserializer beanAsArrayBuilderDeserializer = (BeanAsArrayBuilderDeserializer) this;
                if (beanAsArrayBuilderDeserializer.A0F != null) {
                    beanAsArrayBuilderDeserializer.A0a(byY, obj);
                }
                C27176Bzt[] bztArr2 = beanAsArrayBuilderDeserializer.A02;
                int i3 = 0;
                i = bztArr2.length;
                while (true) {
                    C13120hv A0p2 = r7.A0p();
                    C13120hv r12 = C13120hv.END_ARRAY;
                    if (A0p2 == r12) {
                        break;
                    } else if (i3 != i) {
                        C27176Bzt bzt2 = bztArr2[i3];
                        if (bzt2 != null) {
                            try {
                                obj = bzt2.A06(r7, byY, obj);
                            } catch (Exception e2) {
                                beanAsArrayBuilderDeserializer.A0d(e2, obj, bzt2.A07, byY);
                            }
                        } else {
                            r7.A0f();
                        }
                        i3++;
                    } else if (beanAsArrayBuilderDeserializer.A0D) {
                        while (r7.A0p() != r12) {
                            r7.A0f();
                        }
                    }
                }
            } else if (this instanceof BuilderBasedDeserializer) {
                BuilderBasedDeserializer builderBasedDeserializer = (BuilderBasedDeserializer) this;
                return builderBasedDeserializer.A0g(byY, builderBasedDeserializer.A0e(r7, byY, obj));
            } else if (!(this instanceof BeanDeserializer)) {
                throw new UnsupportedOperationException(AnonymousClass000.A0O("Can not update object of type ", obj.getClass().getName(), " (by deserializer of type ", getClass().getName(), ")"));
            } else {
                BeanDeserializer beanDeserializer = (BeanDeserializer) this;
                if (beanDeserializer.A0F != null) {
                    beanDeserializer.A0a(byY, obj);
                }
                if (beanDeserializer.A04 != null) {
                    C13120hv A0g2 = r7.A0g();
                    if (A0g2 == C13120hv.START_OBJECT) {
                        A0g2 = r7.A0p();
                    }
                    C13480ib r3 = new C13480ib(r7.A0q());
                    r3.A0T();
                    boolean z = beanDeserializer.A0E;
                    while (A0g2 == C13120hv.FIELD_NAME) {
                        String A0i = r7.A0i();
                        C27176Bzt A00 = beanDeserializer.A09.A00(A0i);
                        r7.A0p();
                        if (A00 != null) {
                            try {
                                A00.A08(r7, byY, obj);
                            } catch (Exception e3) {
                                beanDeserializer.A0d(e3, obj, A0i, byY);
                            }
                        } else {
                            HashSet hashSet = beanDeserializer.A0B;
                            if (hashSet == null || !hashSet.contains(A0i)) {
                                r3.A0d(A0i);
                                r3.A0q(r7);
                                C0H c0h = beanDeserializer.A01;
                                if (c0h != null) {
                                    c0h.A01(r7, byY, obj, A0i);
                                }
                            } else {
                                r7.A0f();
                            }
                        }
                        A0g2 = r7.A0p();
                    }
                    r3.A0Q();
                    beanDeserializer.A04.A00(byY, obj, r3);
                    return obj;
                }
                if (beanDeserializer.A02 != null) {
                    beanDeserializer.A0e(r7, byY, obj);
                } else {
                    C13120hv A0g3 = r7.A0g();
                    if (A0g3 == C13120hv.START_OBJECT) {
                        A0g3 = r7.A0p();
                    }
                    boolean z2 = beanDeserializer.A0E;
                    while (A0g3 == C13120hv.FIELD_NAME) {
                        String A0i2 = r7.A0i();
                        r7.A0p();
                        C27176Bzt A002 = beanDeserializer.A09.A00(A0i2);
                        if (A002 != null) {
                            try {
                                A002.A08(r7, byY, obj);
                            } catch (Exception e4) {
                                beanDeserializer.A0d(e4, obj, A0i2, byY);
                            }
                        } else {
                            HashSet hashSet2 = beanDeserializer.A0B;
                            if (hashSet2 == null || !hashSet2.contains(A0i2)) {
                                C0H c0h2 = beanDeserializer.A01;
                                if (c0h2 != null) {
                                    c0h2.A01(r7, byY, obj, A0i2);
                                } else {
                                    beanDeserializer.A0J(r7, byY, obj, A0i2);
                                }
                            } else {
                                r7.A0f();
                            }
                        }
                        A0g3 = r7.A0p();
                    }
                }
                return obj;
            }
            throw C27125Bya.A00(byY.A05, AnonymousClass000.A06("Unexpected JSON values; expected at most ", i, " properties (in JSON Array)"));
        } else {
            CollectionDeserializer collectionDeserializer = (CollectionDeserializer) this;
            if (collectionDeserializer instanceof ArrayBlockingQueueDeserializer) {
                collectionDeserializer = (ArrayBlockingQueueDeserializer) collectionDeserializer;
            }
            return collectionDeserializer.A0O(r7, byY, (Collection) obj);
        }
    }
}
