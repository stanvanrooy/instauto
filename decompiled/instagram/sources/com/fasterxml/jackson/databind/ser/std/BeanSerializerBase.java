package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.ser.BeanSerializer;
import com.fasterxml.jackson.databind.ser.ContainerSerializer;
import com.fasterxml.jackson.databind.ser.impl.BeanAsArraySerializer;
import com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import p000X.AnonymousClass000;
import p000X.Constants;
import p000X.C06;
import p000X.C09;
import p000X.C0L;
import p000X.C12960hf;
import p000X.C13460iZ;
import p000X.C15;
import p000X.C1D;
import p000X.C1K;
import p000X.C1Y;
import p000X.C200288hn;
import p000X.C21;
import p000X.C27;
import p000X.C27107By8;
import p000X.C27115ByP;
import p000X.C27125Bya;
import p000X.C27126Byj;
import p000X.C27148BzD;
import p000X.C27174Bzm;
import p000X.C27179Bzx;
import p000X.C27200C1k;
import p000X.C27204C1t;
import p000X.C27224C3n;
import p000X.C2P;
import p000X.C32;
import p000X.C35;
import p000X.C36;
import p000X.C3P;
import p000X.C3b;
import p000X.C3m;

public abstract class BeanSerializerBase extends StdSerializer implements C35, C3b, C3m, C27224C3n {
    public static final C09[] A07 = new C09[0];
    public final C27200C1k A00;
    public final C1D A01;
    public final C27 A02;
    public final Integer A03;
    public final Object A04;
    public final C09[] A05;
    public final C09[] A06;

    public void A0B(Object obj, C13460iZ r5, C06 c06) {
        if (this instanceof UnwrappingBeanSerializer) {
            UnwrappingBeanSerializer unwrappingBeanSerializer = (UnwrappingBeanSerializer) this;
            if (unwrappingBeanSerializer.A02 != null) {
                unwrappingBeanSerializer.A0I(obj, r5, c06, false);
            } else if (unwrappingBeanSerializer.A04 != null) {
                unwrappingBeanSerializer.A0G();
            } else {
                unwrappingBeanSerializer.A0H(obj, r5, c06);
            }
        } else if (!(this instanceof BeanAsArraySerializer)) {
            BeanSerializer beanSerializer = (BeanSerializer) this;
            if (beanSerializer.A02 != null) {
                beanSerializer.A0I(obj, r5, c06, true);
                return;
            }
            r5.A0T();
            if (beanSerializer.A04 != null) {
                beanSerializer.A0G();
            } else {
                beanSerializer.A0H(obj, r5, c06);
            }
            r5.A0Q();
        } else {
            BeanAsArraySerializer beanAsArraySerializer = (BeanAsArraySerializer) this;
            if (c06.A05.A06(C15.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED)) {
                C09[] c09Arr = beanAsArraySerializer.A05;
                boolean z = true;
                if (beanAsArraySerializer.A06.length != 1) {
                    z = false;
                }
                if (z) {
                    beanAsArraySerializer.A0J(obj, r5, c06);
                    return;
                }
            }
            r5.A0S();
            beanAsArraySerializer.A0J(obj, r5, c06);
            r5.A0P();
        }
    }

    public BeanSerializerBase A0D() {
        if (this instanceof UnwrappingBeanSerializer) {
            return (UnwrappingBeanSerializer) this;
        }
        if (this instanceof BeanAsArraySerializer) {
            return (BeanAsArraySerializer) this;
        }
        BeanSerializer beanSerializer = (BeanSerializer) this;
        return (beanSerializer.A02 == null && beanSerializer.A01 == null && beanSerializer.A04 == null) ? new BeanAsArraySerializer(beanSerializer) : beanSerializer;
    }

    public BeanSerializerBase A0E(C27 c27) {
        return !(this instanceof UnwrappingBeanSerializer) ? !(this instanceof BeanAsArraySerializer) ? new BeanSerializer((BeanSerializerBase) (BeanSerializer) this, c27) : ((BeanAsArraySerializer) this).A00.A0E(c27) : new UnwrappingBeanSerializer((UnwrappingBeanSerializer) this, c27);
    }

    public BeanSerializerBase A0F(String[] strArr) {
        return !(this instanceof UnwrappingBeanSerializer) ? !(this instanceof BeanAsArraySerializer) ? new BeanSerializer((BeanSerializerBase) (BeanSerializer) this, strArr) : new BeanAsArraySerializer((BeanAsArraySerializer) this, strArr) : new UnwrappingBeanSerializer((UnwrappingBeanSerializer) this, strArr);
    }

    public final void A0G() {
        C09[] c09Arr = this.A05;
        Object obj = this.A04;
        throw new C27125Bya("Can not resolve BeanPropertyFilter with id '" + obj + "'; no FilterProvider configured");
    }

    public final void A0H(Object obj, C13460iZ r11, C06 c06) {
        Object A0H;
        String str = "[anySetter]";
        C09[] c09Arr = this.A05;
        C09[] c09Arr2 = this.A06;
        try {
            for (C09 c09 : c09Arr2) {
                if (c09 != null) {
                    c09.A06(obj, r11, c06);
                }
            }
            C1D c1d = this.A01;
            if (c1d != null && (A0H = c1d.A02.A0H(obj)) != null) {
                if (A0H instanceof Map) {
                    c1d.A00.A0F((Map) A0H, r11, c06);
                    return;
                }
                throw new C27125Bya(AnonymousClass000.A0N("Value returned by 'any-getter' (", c1d.A02.A0B(), "()) not java.util.Map but ", A0H.getClass().getName()));
            }
        } catch (Exception e) {
            if (0 != c09Arr2.length) {
                str = c09Arr2[0].A06.getValue();
            }
            StdSerializer.A03(c06, e, obj, str);
        } catch (StackOverflowError e2) {
            C27125Bya bya = new C27125Bya("Infinite recursion (StackOverflowError)", (Throwable) e2);
            if (0 != c09Arr2.length) {
                str = c09Arr2[0].A06.getValue();
            }
            bya.A04(new C200288hn(obj, str));
            throw bya;
        }
    }

    public final void A0I(Object obj, C13460iZ r6, C06 c06, boolean z) {
        boolean z2;
        C27 c27 = this.A02;
        C32 A0B = c06.A0B(obj, c27.A00);
        Object obj2 = A0B.A00;
        if (obj2 == null || (!A0B.A01 && !c27.A04)) {
            z2 = false;
        } else {
            c27.A03.A0B(obj2, r6, c06);
            z2 = true;
        }
        if (!z2) {
            Object A032 = A0B.A02.A03(obj);
            A0B.A00 = A032;
            if (c27.A04) {
                c27.A03.A0B(A032, r6, c06);
                return;
            }
            if (z) {
                r6.A0T();
            }
            C12960hf r1 = c27.A01;
            A0B.A01 = true;
            if (r1 != null) {
                r6.A0b(r1);
                c27.A03.A0B(A0B.A00, r6, c06);
            }
            if (this.A04 != null) {
                A0G();
            } else {
                A0H(obj, r6, c06);
            }
            if (z) {
                r6.A0Q();
            }
        }
    }

    public final JsonSerializer AAL(C06 c06, C27148BzD bzD) {
        C27200C1k c1k;
        String[] strArr;
        BeanSerializerBase beanSerializerBase;
        C27126Byj A002;
        C27 c27;
        C27 c272 = this.A02;
        C27179Bzx A012 = c06.A05.A01();
        Integer num = null;
        if (bzD == null || A012 == null) {
            c1k = null;
        } else {
            c1k = bzD.APy();
        }
        if (c1k != null) {
            strArr = A012.A0u(c1k);
            C21 A072 = A012.A07(c1k);
            if (A072 != null) {
                C21 A08 = A012.A08(c1k, A072);
                Class<C36> cls = A08.A00;
                C0L c0l = c06.A05().A09(c06.A05().A05(cls, (C27174Bzm) null), C2P.class)[0];
                if (cls == C36.class) {
                    String str = A08.A02;
                    C09[] c09Arr = this.A06;
                    int length = c09Arr.length;
                    int i = 0;
                    while (i != length) {
                        C09 c09 = c09Arr[i];
                        if (str.equals(c09.A06.getValue())) {
                            if (i > 0) {
                                System.arraycopy(c09Arr, 0, c09Arr, 1, i);
                                this.A06[0] = c09;
                                C09[] c09Arr2 = this.A05;
                                if (c09Arr2 != null) {
                                    C09 c092 = c09Arr2[i];
                                    System.arraycopy(c09Arr2, 0, c09Arr2, 1, i);
                                    this.A05[0] = c092;
                                }
                            }
                            c272 = C27.A00(c09.AZA(), (String) null, new C1K(A08.A01, c09), A08.A03);
                        } else {
                            i++;
                        }
                    }
                    throw new IllegalArgumentException(AnonymousClass000.A0O("Invalid Object Id definition for ", this.A00.getName(), ": can not find property with name '", str, "'"));
                }
                c272 = C27.A00(c0l, A08.A02, c06.A02(A08), A08.A03);
            } else if (c272 != null) {
                C21 A082 = A012.A08(c1k, new C21("", (Class) null, (Class) null, false));
                c272 = this.A02;
                boolean z = A082.A03;
                if (z != c272.A04) {
                    c272 = new C27(c272.A02, c272.A01, c272.A00, c272.A03, z);
                }
            }
        } else {
            strArr = null;
        }
        if (c272 == null || (c27 = new C27(c272.A02, c272.A01, c272.A00, c06.A07(c272.A02, bzD), c272.A04)) == this.A02) {
            beanSerializerBase = this;
        } else {
            beanSerializerBase = A0E(c27);
        }
        if (!(strArr == null || strArr.length == 0)) {
            beanSerializerBase = beanSerializerBase.A0F(strArr);
        }
        if (!(c1k == null || (A002 = A012.A00(c1k)) == null)) {
            num = A002.A00;
        }
        if (num == null) {
            num = this.A03;
        }
        if (num == Constants.A0C) {
            return beanSerializerBase.A0D();
        }
        return beanSerializerBase;
    }

    /* JADX WARNING: Failed to insert additional move for type inference */
    public final void Bdm(C06 c06) {
        int length;
        StdDelegatingSerializer stdDelegatingSerializer;
        C09 c09;
        Type genericType;
        Object A0Y;
        C09 c092;
        C09[] c09Arr = this.A05;
        if (c09Arr == null) {
            length = 0;
        } else {
            length = c09Arr.length;
        }
        int length2 = this.A06.length;
        for (int i = 0; i < length2; i++) {
            C09 c093 = this.A06[i];
            if (!c093.A0B) {
                boolean z = false;
                if (c093.A01 != null) {
                    z = true;
                }
                if (!z) {
                    JsonSerializer jsonSerializer = c06.A02;
                    JsonSerializer jsonSerializer2 = jsonSerializer;
                    if (jsonSerializer != null) {
                        c093.A03(jsonSerializer);
                        if (i < length && (c092 = this.A05[i]) != null) {
                            c092.A03(jsonSerializer2);
                        }
                    }
                }
            }
            boolean z2 = false;
            if (c093.A02 != null) {
                z2 = true;
            }
            if (!z2) {
                C27179Bzx A012 = c06.A05.A01();
                if (A012 == null || (A0Y = A012.A0Y(c093.APy())) == null) {
                    stdDelegatingSerializer = null;
                } else {
                    C27107By8 A062 = c06.A06(A0Y);
                    C0L ARO = A062.ARO(c06.A05());
                    stdDelegatingSerializer = new StdDelegatingSerializer(A062, ARO, c06.A07(ARO, c093));
                }
                if (stdDelegatingSerializer == null) {
                    C0L c0l = c093.A07;
                    if (c0l == null) {
                        Method method = c093.A0A;
                        if (method != null) {
                            genericType = method.getGenericReturnType();
                        } else {
                            genericType = c093.A09.getGenericType();
                        }
                        c0l = c06.A05().A05(genericType, (C27174Bzm) null);
                        if (!Modifier.isFinal(c0l.A00.getModifiers())) {
                            if (c0l.A0O() || c0l.A02() > 0) {
                                c093.A00 = c0l;
                            }
                        }
                    }
                    JsonSerializer A072 = c06.A07(c0l, c093);
                    stdDelegatingSerializer = A072;
                    if (c0l.A0O()) {
                        C27204C1t c1t = (C27204C1t) c0l.A03().A0F();
                        stdDelegatingSerializer = A072;
                        if (c1t != null) {
                            boolean z3 = A072 instanceof ContainerSerializer;
                            stdDelegatingSerializer = A072;
                            if (z3) {
                                ContainerSerializer containerSerializer = (ContainerSerializer) A072;
                                stdDelegatingSerializer = containerSerializer;
                                if (c1t != null) {
                                    stdDelegatingSerializer = containerSerializer.A0D(c1t);
                                }
                            }
                        }
                    }
                }
                c093.A04(stdDelegatingSerializer);
                if (i < length && (c09 = this.A05[i]) != null) {
                    c09.A04(stdDelegatingSerializer);
                }
            }
        }
        C1D c1d = this.A01;
        if (c1d != null) {
            c1d.A00 = (MapSerializer) c1d.A00.AAL(c06, c1d.A01);
        }
    }

    public BeanSerializerBase(C0L c0l, C1Y c1y, C09[] c09Arr, C09[] c09Arr2) {
        super(c0l);
        this.A06 = c09Arr;
        this.A05 = c09Arr2;
        Integer num = null;
        if (c1y == null) {
            this.A00 = null;
            this.A01 = null;
            this.A04 = null;
            this.A02 = null;
            this.A03 = null;
            return;
        }
        this.A00 = c1y.A01;
        this.A01 = c1y.A02;
        this.A04 = c1y.A04;
        this.A02 = c1y.A03;
        C27126Byj A012 = c1y.A07.A01((C27126Byj) null);
        this.A03 = A012 != null ? A012.A00 : num;
    }

    public BeanSerializerBase(BeanSerializerBase beanSerializerBase, C27 c27) {
        super(beanSerializerBase.A00);
        this.A06 = beanSerializerBase.A06;
        this.A05 = beanSerializerBase.A05;
        this.A00 = beanSerializerBase.A00;
        this.A01 = beanSerializerBase.A01;
        this.A02 = c27;
        this.A04 = beanSerializerBase.A04;
        this.A03 = beanSerializerBase.A03;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BeanSerializerBase(BeanSerializerBase beanSerializerBase, C3P c3p) {
        super(beanSerializerBase.A00);
        int length;
        int length2;
        C09[] c09Arr = beanSerializerBase.A06;
        if (!(c09Arr == null || (length2 = c09Arr.length) == 0 || c3p == null || c3p == C3P.A00)) {
            C09[] c09Arr2 = new C09[length2];
            for (int i = 0; i < length2; i++) {
                C09 c09 = c09Arr[i];
                if (c09 != null) {
                    c09Arr2[i] = c09.A01(c3p);
                }
            }
            c09Arr = c09Arr2;
        }
        C09[] c09Arr3 = beanSerializerBase.A05;
        if (!(c09Arr3 == null || (length = c09Arr3.length) == 0 || c3p == null || c3p == C3P.A00)) {
            C09[] c09Arr4 = new C09[length];
            for (int i2 = 0; i2 < length; i2++) {
                C09 c092 = c09Arr3[i2];
                if (c092 != null) {
                    c09Arr4[i2] = c092.A01(c3p);
                }
            }
            c09Arr3 = c09Arr4;
        }
        this.A06 = c09Arr;
        this.A05 = c09Arr3;
        this.A00 = beanSerializerBase.A00;
        this.A01 = beanSerializerBase.A01;
        this.A02 = beanSerializerBase.A02;
        this.A04 = beanSerializerBase.A04;
        this.A03 = beanSerializerBase.A03;
    }

    public BeanSerializerBase(BeanSerializerBase beanSerializerBase, String[] strArr) {
        super(beanSerializerBase.A00);
        ArrayList arrayList;
        HashSet A002 = C27115ByP.A00(strArr);
        C09[] c09Arr = beanSerializerBase.A06;
        C09[] c09Arr2 = beanSerializerBase.A05;
        int length = c09Arr.length;
        ArrayList arrayList2 = new ArrayList(length);
        C09[] c09Arr3 = null;
        if (c09Arr2 == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList(length);
        }
        for (int i = 0; i < length; i++) {
            C09 c09 = c09Arr[i];
            if (!A002.contains(c09.A06.getValue())) {
                arrayList2.add(c09);
                if (c09Arr2 != null) {
                    arrayList.add(c09Arr2[i]);
                }
            }
        }
        this.A06 = (C09[]) arrayList2.toArray(new C09[arrayList2.size()]);
        this.A05 = arrayList != null ? (C09[]) arrayList.toArray(new C09[arrayList.size()]) : c09Arr3;
        this.A00 = beanSerializerBase.A00;
        this.A01 = beanSerializerBase.A01;
        this.A02 = beanSerializerBase.A02;
        this.A04 = beanSerializerBase.A04;
        this.A03 = beanSerializerBase.A03;
    }
}
