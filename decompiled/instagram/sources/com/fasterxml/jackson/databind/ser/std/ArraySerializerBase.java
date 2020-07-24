package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.ser.ContainerSerializer;
import com.fasterxml.jackson.databind.ser.impl.StringArraySerializer;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import p000X.C06;
import p000X.C0L;
import p000X.C13460iZ;
import p000X.C27148BzD;
import p000X.C27204C1t;
import p000X.C27207C1y;
import p000X.C27221C2x;

public abstract class ArraySerializerBase extends ContainerSerializer {
    public final C27148BzD A00;

    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0130, code lost:
        r1 = r1.getCause();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x0137, code lost:
        if ((r1 instanceof java.lang.Error) == false) goto L_0x0139;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x0139, code lost:
        r0 = new p000X.C200288hn((java.lang.Object) null, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x0143, code lost:
        r0 = new p000X.C200288hn(r2, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x014c, code lost:
        throw p000X.C27125Bya.A01(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x0150, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x0151, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x00b9, code lost:
        r1 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x00bc, code lost:
        if ((r1 instanceof java.lang.reflect.InvocationTargetException) != false) goto L_0x00be;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x00c4, code lost:
        r1 = r1.getCause();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x0125, code lost:
        r1 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x0128, code lost:
        if ((r1 instanceof java.lang.reflect.InvocationTargetException) != false) goto L_0x012a;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:38:0x005c, B:55:0x0086] */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:38:0x005c, B:76:0x00cb] */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x0143  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x0150 A[ExcHandler: IOException (r0v25 'e' java.io.IOException A[CUSTOM_DECLARE]), Splitter:B:38:0x005c] */
    public void A0F(Object obj, C13460iZ r13, C06 c06) {
        int i;
        Object obj2;
        if (this instanceof StdArraySerializers$IntArraySerializer) {
            for (int A0X : (int[]) obj) {
                r13.A0X(A0X);
            }
        } else if (this instanceof StdArraySerializers$ShortArraySerializer) {
            StdArraySerializers$ShortArraySerializer stdArraySerializers$ShortArraySerializer = (StdArraySerializers$ShortArraySerializer) this;
            short[] sArr = (short[]) obj;
            int i2 = 0;
            if (stdArraySerializers$ShortArraySerializer.A00 != null) {
                int length = sArr.length;
                while (i2 < length) {
                    stdArraySerializers$ShortArraySerializer.A00.A07((Object) null, r13, Short.TYPE);
                    r13.A0j(sArr[i2]);
                    stdArraySerializers$ShortArraySerializer.A00.A06((Object) null, r13);
                    i2++;
                }
                return;
            }
            int length2 = sArr.length;
            while (i2 < length2) {
                r13.A0X(sArr[i2]);
                i2++;
            }
        } else if (this instanceof StdArraySerializers$LongArraySerializer) {
            StdArraySerializers$LongArraySerializer stdArraySerializers$LongArraySerializer = (StdArraySerializers$LongArraySerializer) this;
            long[] jArr = (long[]) obj;
            int i3 = 0;
            if (stdArraySerializers$LongArraySerializer.A00 != null) {
                int length3 = jArr.length;
                while (i3 < length3) {
                    stdArraySerializers$LongArraySerializer.A00.A07((Object) null, r13, Long.TYPE);
                    r13.A0Y(jArr[i3]);
                    stdArraySerializers$LongArraySerializer.A00.A06((Object) null, r13);
                    i3++;
                }
                return;
            }
            int length4 = jArr.length;
            while (i3 < length4) {
                r13.A0Y(jArr[i3]);
                i3++;
            }
        } else if (this instanceof StdArraySerializers$FloatArraySerializer) {
            StdArraySerializers$FloatArraySerializer stdArraySerializers$FloatArraySerializer = (StdArraySerializers$FloatArraySerializer) this;
            float[] fArr = (float[]) obj;
            int i4 = 0;
            if (stdArraySerializers$FloatArraySerializer.A00 != null) {
                int length5 = fArr.length;
                while (i4 < length5) {
                    stdArraySerializers$FloatArraySerializer.A00.A07((Object) null, r13, Float.TYPE);
                    r13.A0W(fArr[i4]);
                    stdArraySerializers$FloatArraySerializer.A00.A06((Object) null, r13);
                    i4++;
                }
                return;
            }
            int length6 = fArr.length;
            while (i4 < length6) {
                r13.A0W(fArr[i4]);
                i4++;
            }
        } else if (this instanceof StdArraySerializers$DoubleArraySerializer) {
            for (double A0V : (double[]) obj) {
                r13.A0V(A0V);
            }
        } else if (this instanceof StdArraySerializers$BooleanArraySerializer) {
            for (boolean A0k : (boolean[]) obj) {
                r13.A0k(A0k);
            }
        } else if (!(this instanceof ObjectArraySerializer)) {
            StringArraySerializer stringArraySerializer = (StringArraySerializer) this;
            String[] strArr = (String[]) obj;
            if (r3 != 0) {
                JsonSerializer jsonSerializer = stringArraySerializer.A00;
                if (jsonSerializer != null) {
                    for (String str : strArr) {
                        if (str == null) {
                            c06.A0D(r13);
                        } else {
                            jsonSerializer.A0B(str, r13, c06);
                        }
                    }
                    return;
                }
                for (String str2 : strArr) {
                    if (str2 == null) {
                        r13.A0R();
                    } else {
                        r13.A0g(str2);
                    }
                }
            }
        } else {
            ObjectArraySerializer objectArraySerializer = (ObjectArraySerializer) this;
            Object[] objArr = (Object[]) obj;
            if (r6 != 0) {
                JsonSerializer jsonSerializer2 = objectArraySerializer.A00;
                if (jsonSerializer2 != null) {
                    C27204C1t c1t = objectArraySerializer.A03;
                    i = 0;
                    obj2 = null;
                    while (i < r6) {
                        try {
                            obj2 = objArr[i];
                            if (obj2 == null) {
                                c06.A0D(r13);
                            } else if (c1t == null) {
                                jsonSerializer2.A0B(obj2, r13, c06);
                            } else {
                                jsonSerializer2.A08(obj2, r13, c06, c1t);
                            }
                            i++;
                        } catch (IOException e) {
                        } catch (Exception e2) {
                            e = e2;
                            while ((e instanceof InvocationTargetException) && e.getCause() != null) {
                                e = e.getCause();
                            }
                            if (!(e instanceof Error)) {
                            }
                            throw ((Error) e);
                        }
                    }
                    return;
                }
                C27204C1t c1t2 = objectArraySerializer.A03;
                if (c1t2 != null) {
                    i = 0;
                    obj2 = null;
                    C27207C1y c1y = objectArraySerializer.A01;
                    while (i < r6) {
                        Object obj3 = objArr[i];
                        if (obj3 == null) {
                            c06.A0D(r13);
                        } else {
                            Class<?> cls = obj3.getClass();
                            JsonSerializer A002 = c1y.A00(cls);
                            if (A002 == null) {
                                JsonSerializer A0A = c06.A0A(cls, objectArraySerializer.A00);
                                C27221C2x c2x = new C27221C2x(A0A, c1y.A01(cls, A0A));
                                C27207C1y c1y2 = c2x.A01;
                                if (c1y != c1y2) {
                                    objectArraySerializer.A01 = c1y2;
                                }
                                A002 = c2x.A00;
                            }
                            A002.A08(obj3, r13, c06, c1t2);
                        }
                        i++;
                    }
                    return;
                }
                C27207C1y c1y3 = objectArraySerializer.A01;
                for (Object obj4 : objArr) {
                    if (obj4 == null) {
                        c06.A0D(r13);
                    } else {
                        Class<?> cls2 = obj4.getClass();
                        JsonSerializer A003 = c1y3.A00(cls2);
                        if (A003 == null) {
                            C0L c0l = objectArraySerializer.A02;
                            if (c0l.A0J()) {
                                C0L A03 = c06.A03(c0l, cls2);
                                JsonSerializer A07 = c06.A07(A03, objectArraySerializer.A00);
                                C27221C2x c2x2 = new C27221C2x(A07, c1y3.A01(A03.A00, A07));
                                C27207C1y c1y4 = c2x2.A01;
                                if (c1y3 != c1y4) {
                                    objectArraySerializer.A01 = c1y4;
                                }
                                A003 = c2x2.A00;
                            } else {
                                JsonSerializer A0A2 = c06.A0A(cls2, objectArraySerializer.A00);
                                C27221C2x c2x3 = new C27221C2x(A0A2, c1y3.A01(cls2, A0A2));
                                C27207C1y c1y5 = c2x3.A01;
                                if (c1y3 != c1y5) {
                                    objectArraySerializer.A01 = c1y5;
                                }
                                A003 = c2x3.A00;
                            }
                        }
                        A003.A0B(obj4, r13, c06);
                    }
                }
            }
        }
    }

    public ArraySerializerBase(ArraySerializerBase arraySerializerBase, C27148BzD bzD) {
        super(arraySerializerBase.A00, false);
        this.A00 = bzD;
    }

    public ArraySerializerBase(Class cls) {
        super(cls);
        this.A00 = null;
    }

    public ArraySerializerBase(Class cls, C27148BzD bzD) {
        super(cls);
        this.A00 = null;
    }
}
