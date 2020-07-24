package com.fasterxml.jackson.databind.deser;

import com.facebook.react.modules.dialog.DialogModule;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Map;
import p000X.AnonymousClass000;
import p000X.C0G;
import p000X.C0H;
import p000X.C0K;
import p000X.C13080hr;
import p000X.C13120hv;
import p000X.C13480ib;
import p000X.C27106By5;
import p000X.C27123ByY;
import p000X.C27125Bya;
import p000X.C27162Bza;
import p000X.C27163Bzb;
import p000X.C27164Bzc;
import p000X.C27175Bzn;
import p000X.C27176Bzt;
import p000X.C27177Bzu;
import p000X.C27183C0d;
import p000X.C27209C2a;
import p000X.C3P;

public class BeanDeserializer extends BeanDeserializerBase implements Serializable {
    public static final Object A00(BeanDeserializer beanDeserializer, C13080hr r4, C27123ByY byY) {
        Object A05 = beanDeserializer.A08.A05(byY);
        while (r4.A0g() != C13120hv.END_OBJECT) {
            String A0i = r4.A0i();
            r4.A0p();
            C27176Bzt A00 = beanDeserializer.A09.A00(A0i);
            if (A00 != null) {
                try {
                    A00.A08(r4, byY, A05);
                } catch (Exception e) {
                    beanDeserializer.A0d(e, A05, A0i, byY);
                }
            } else {
                beanDeserializer.A0Z(r4, byY, A05, A0i);
            }
            r4.A0p();
        }
        return A05;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v10, resolved type: X.Bzb} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v11, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v30, resolved type: X.Bzb} */
    /* JADX WARNING: Multi-variable type inference failed */
    public Object A0P(C13080hr r15, C27123ByY byY) {
        C27125Bya bya;
        Object A05;
        C27163Bzb bzb;
        C27163Bzb bzb2;
        Object obj;
        C13480ib r2;
        C27123ByY byY2 = byY;
        if (this instanceof ThrowableDeserializer) {
            ThrowableDeserializer throwableDeserializer = (ThrowableDeserializer) this;
            if (throwableDeserializer.A03 != null) {
                return throwableDeserializer.A0O(r15, byY2);
            }
            JsonDeserializer jsonDeserializer = throwableDeserializer.A00;
            if (jsonDeserializer != null) {
                return throwableDeserializer.A08.A09(byY2, jsonDeserializer.A06(r15, byY2));
            }
            if (!throwableDeserializer.A07.A0K()) {
                C27183C0d c0d = throwableDeserializer.A08;
                boolean A0J = c0d.A0J();
                boolean A0K = c0d.A0K();
                if (A0J || A0K) {
                    Object obj2 = null;
                    Object[] objArr = null;
                    int i = 0;
                    while (r15.A0g() != C13120hv.END_OBJECT) {
                        String A0i = r15.A0i();
                        C27176Bzt A00 = throwableDeserializer.A09.A00(A0i);
                        r15.A0p();
                        if (A00 != null) {
                            if (obj2 != null) {
                                A00.A08(r15, byY2, obj2);
                            } else {
                                if (objArr == null) {
                                    int i2 = throwableDeserializer.A09.A01;
                                    objArr = new Object[(i2 + i2)];
                                }
                                int i3 = i + 1;
                                objArr[i] = A00;
                                i = i3 + 1;
                                objArr[i3] = A00.A05(r15, byY2);
                            }
                        } else if (!DialogModule.KEY_MESSAGE.equals(A0i) || !A0J) {
                            HashSet hashSet = throwableDeserializer.A0B;
                            if (hashSet == null || !hashSet.contains(A0i)) {
                                C0H c0h = throwableDeserializer.A01;
                                if (c0h != null) {
                                    c0h.A01(r15, byY2, obj2, A0i);
                                } else {
                                    throwableDeserializer.A0J(r15, byY2, obj2, A0i);
                                }
                            } else {
                                r15.A0f();
                            }
                        } else {
                            obj2 = throwableDeserializer.A08.A0A(byY2, r15.A0t());
                            if (objArr != null) {
                                for (int i4 = 0; i4 < i; i4 += 2) {
                                    ((C27176Bzt) objArr[i4]).A0A(obj2, objArr[i4 + 1]);
                                }
                                objArr = null;
                            }
                        }
                        r15.A0p();
                    }
                    if (obj2 != null) {
                        return obj2;
                    }
                    if (A0J) {
                        A05 = throwableDeserializer.A08.A0A(byY2, (String) null);
                    } else {
                        A05 = throwableDeserializer.A08.A05(byY2);
                    }
                    if (objArr == null) {
                        return A05;
                    }
                    for (int i5 = 0; i5 < i; i5 += 2) {
                        ((C27176Bzt) objArr[i5]).A0A(A05, objArr[i5 + 1]);
                    }
                    return A05;
                }
                throw new C27125Bya("Can not deserialize Throwable of type " + throwableDeserializer.A07 + " without having a default contructor, a single-String-arg constructor; or explicit @JsonCreator");
            }
            bya = C27125Bya.A00(r15, "Can not instantiate abstract type " + throwableDeserializer.A07 + " (need to add/enable type information?)");
        } else if (this.A05) {
            if (this.A04 != null) {
                JsonDeserializer jsonDeserializer2 = this.A00;
                if (jsonDeserializer2 != null) {
                    return this.A08.A09(byY2, jsonDeserializer2.A06(r15, byY2));
                }
                C27162Bza bza = this.A03;
                if (bza != null) {
                    C27163Bzb A01 = bza.A01(r15, byY2, this.A0A);
                    r2 = new C13480ib(r15.A0q());
                    r2.A0T();
                    C13120hv A0g = r15.A0g();
                    while (true) {
                        if (A0g == C13120hv.FIELD_NAME) {
                            String A0i2 = r15.A0i();
                            r15.A0p();
                            C27176Bzt bzt = (C27176Bzt) bza.A00.get(A0i2);
                            if (bzt != null) {
                                if (A01.A02(bzt.A01(), bzt.A05(r15, byY2))) {
                                    C13120hv A0p = r15.A0p();
                                    try {
                                        obj = bza.A02(byY2, A01);
                                        while (A0p == C13120hv.FIELD_NAME) {
                                            r15.A0p();
                                            r2.A0q(r15);
                                            A0p = r15.A0p();
                                        }
                                        r2.A0Q();
                                        if (obj.getClass() != this.A07.A00) {
                                            r2.close();
                                        }
                                    } catch (Exception e) {
                                        A0d(e, this.A07.A00, A0i2, byY2);
                                    }
                                } else {
                                    continue;
                                }
                            } else if (!A01.A03(A0i2)) {
                                C27176Bzt A002 = this.A09.A00(A0i2);
                                if (A002 != null) {
                                    A01.A01(A002, A002.A05(r15, byY2));
                                } else {
                                    HashSet hashSet2 = this.A0B;
                                    if (hashSet2 == null || !hashSet2.contains(A0i2)) {
                                        r2.A0d(A0i2);
                                        r2.A0q(r15);
                                        C0H c0h2 = this.A01;
                                        if (c0h2 != null) {
                                            A01.A00(c0h2, A0i2, c0h2.A00(r15, byY2));
                                        }
                                    } else {
                                        r15.A0f();
                                    }
                                }
                            }
                            A0g = r15.A0p();
                        } else {
                            try {
                                obj = bza.A02(byY2, A01);
                                break;
                            } catch (Exception e2) {
                                A0c(e2, byY2);
                                return null;
                            }
                        }
                    }
                } else {
                    r2 = new C13480ib(r15.A0q());
                    r2.A0T();
                    obj = this.A08.A05(byY2);
                    if (this.A0F != null) {
                        A0a(byY2, obj);
                    }
                    boolean z = this.A0E;
                    while (r15.A0g() != C13120hv.END_OBJECT) {
                        String A0i3 = r15.A0i();
                        r15.A0p();
                        C27176Bzt A003 = this.A09.A00(A0i3);
                        if (A003 != null) {
                            try {
                                A003.A08(r15, byY2, obj);
                            } catch (Exception e3) {
                                A0d(e3, obj, A0i3, byY2);
                            }
                        } else {
                            HashSet hashSet3 = this.A0B;
                            if (hashSet3 == null || !hashSet3.contains(A0i3)) {
                                r2.A0d(A0i3);
                                r2.A0q(r15);
                                C0H c0h3 = this.A01;
                                if (c0h3 != null) {
                                    c0h3.A01(r15, byY2, obj, A0i3);
                                }
                            } else {
                                r15.A0f();
                            }
                        }
                        r15.A0p();
                    }
                    r2.A0Q();
                }
                this.A04.A00(byY2, obj, r2);
                return obj;
            }
            C27177Bzu bzu = this.A02;
            if (bzu == null) {
                return A0X(r15, byY2);
            }
            C27162Bza bza2 = this.A03;
            if (bza2 != null) {
                C27177Bzu bzu2 = new C27177Bzu(bzu);
                C27163Bzb A012 = bza2.A01(r15, byY2, this.A0A);
                C13480ib r22 = new C13480ib(r15.A0q());
                r22.A0T();
                C13120hv A0g2 = r15.A0g();
                C27163Bzb bzb3 = A012;
                while (A0g2 == C13120hv.FIELD_NAME) {
                    String A0i4 = r15.A0i();
                    r15.A0p();
                    C27176Bzt bzt2 = (C27176Bzt) bza2.A00.get(A0i4);
                    if (bzt2 != null) {
                        if (!bzu2.A02(r15, byY2, A0i4, bzb3)) {
                            if (bzb3.A02(bzt2.A01(), bzt2.A05(r15, byY2))) {
                                C13120hv A0p2 = r15.A0p();
                                try {
                                    bzb2 = bzb3;
                                    Object A02 = bza2.A02(byY2, bzb3);
                                    bzb2 = A02;
                                    while (A0p2 == C13120hv.FIELD_NAME) {
                                        r15.A0p();
                                        r22.A0q(r15);
                                        A0p2 = r15.A0p();
                                    }
                                    if (A02.getClass() == this.A07.A00) {
                                        bzu2.A00(r15, byY2, A02);
                                        return A02;
                                    }
                                } catch (Exception e4) {
                                    A0d(e4, this.A07.A00, A0i4, byY2);
                                    bzb = bzb2;
                                }
                            } else {
                                bzb = bzb3;
                                continue;
                            }
                        } else {
                            bzb = bzb3;
                            continue;
                        }
                    } else if (bzb3.A03(A0i4)) {
                        bzb = bzb3;
                    } else {
                        C27176Bzt A004 = this.A09.A00(A0i4);
                        if (A004 != null) {
                            bzb3.A01(A004, A004.A05(r15, byY2));
                            bzb = bzb3;
                        } else if (bzu2.A02(r15, byY2, A0i4, (Object) null)) {
                            bzb = bzb3;
                        } else {
                            HashSet hashSet4 = this.A0B;
                            if (hashSet4 == null || !hashSet4.contains(A0i4)) {
                                C0H c0h4 = this.A01;
                                if (c0h4 != null) {
                                    bzb3.A00(c0h4, A0i4, c0h4.A00(r15, byY2));
                                    bzb = bzb3;
                                } else {
                                    bzb = bzb3;
                                }
                            } else {
                                r15.A0f();
                                bzb = bzb3;
                            }
                        }
                    }
                    A0g2 = r15.A0p();
                    bzb3 = bzb;
                }
                try {
                    int length = bzu2.A01.length;
                    Object[] objArr2 = new Object[length];
                    for (int i6 = 0; i6 < length; i6++) {
                        String str = bzu2.A03[i6];
                        if (str == null) {
                            if (bzu2.A02[i6] != null) {
                                C27209C2a c2a = bzu2.A01[i6];
                                C27106By5 by5 = c2a.A01;
                                Class A052 = by5.A05();
                                boolean z2 = false;
                                if (A052 != null) {
                                    z2 = true;
                                }
                                if (z2) {
                                    str = null;
                                    if (A052 != null) {
                                        str = by5.A04().Acq((Object) null, A052);
                                    }
                                } else {
                                    throw C27125Bya.A00(byY2.A05, AnonymousClass000.A0J("Missing external type id property '", c2a.A02, "'"));
                                }
                            } else {
                                continue;
                            }
                        } else if (bzu2.A02[i6] == null) {
                            C27209C2a c2a2 = bzu2.A01[i6];
                            throw C27125Bya.A00(byY2.A05, AnonymousClass000.A0N("Missing property '", c2a2.A00.A07, "' for external type id '", c2a2.A02));
                        }
                        C13480ib r23 = new C13480ib(r15.A0q());
                        r23.A0S();
                        r23.A0g(str);
                        C13080hr A0o = bzu2.A02[i6].A0o(r15);
                        A0o.A0p();
                        r23.A0q(A0o);
                        r23.A0P();
                        C13080hr A0o2 = r23.A0o(r15);
                        A0o2.A0p();
                        objArr2[i6] = bzu2.A01[i6].A00.A05(A0o2, byY2);
                    }
                    for (int i7 = 0; i7 < length; i7++) {
                        C27176Bzt bzt3 = bzu2.A01[i7].A00;
                        if (((C27176Bzt) bza2.A00.get(bzt3.A07)) != null) {
                            bzb3.A02(bzt3.A01(), objArr2[i7]);
                        }
                    }
                    Object A022 = bza2.A02(byY2, bzb3);
                    for (int i8 = 0; i8 < length; i8++) {
                        C27176Bzt bzt4 = bzu2.A01[i8].A00;
                        if (((C27176Bzt) bza2.A00.get(bzt4.A07)) == null) {
                            bzt4.A0A(A022, objArr2[i8]);
                        }
                    }
                    return A022;
                } catch (Exception e5) {
                    A0c(e5, byY2);
                    return null;
                }
            } else {
                Object A053 = this.A08.A05(byY2);
                A0e(r15, byY2, A053);
                return A053;
            }
            bya = C27125Bya.A00(byY2.A05, "Can not create polymorphic instances with unwrapped values");
        } else {
            Object A054 = this.A08.A05(byY2);
            if (this.A0F != null) {
                A0a(byY2, A054);
            }
            boolean z3 = this.A0E;
            while (r15.A0g() != C13120hv.END_OBJECT) {
                String A0i5 = r15.A0i();
                r15.A0p();
                C27176Bzt A005 = this.A09.A00(A0i5);
                if (A005 != null) {
                    try {
                        A005.A08(r15, byY2, A054);
                    } catch (Exception e6) {
                        A0d(e6, A054, A0i5, byY2);
                    }
                } else {
                    HashSet hashSet5 = this.A0B;
                    if (hashSet5 == null || !hashSet5.contains(A0i5)) {
                        C0H c0h5 = this.A01;
                        if (c0h5 != null) {
                            c0h5.A01(r15, byY2, A054, A0i5);
                        } else {
                            A0J(r15, byY2, A054, A0i5);
                        }
                    } else {
                        r15.A0f();
                    }
                }
                r15.A0p();
            }
            return A054;
        }
        throw bya;
    }

    public final void A0e(C13080hr r11, C27123ByY byY, Object obj) {
        boolean z = this.A0E;
        C27177Bzu bzu = new C27177Bzu(this.A02);
        while (true) {
            C13080hr r5 = r11;
            C27123ByY byY2 = byY;
            Object obj2 = obj;
            if (r11.A0g() != C13120hv.END_OBJECT) {
                String A0i = r11.A0i();
                r11.A0p();
                C27176Bzt A00 = this.A09.A00(A0i);
                if (A00 != null) {
                    if (r11.A0g().A00()) {
                        Integer num = (Integer) bzu.A00.get(A0i);
                        boolean z2 = false;
                        if (num != null) {
                            int intValue = num.intValue();
                            if (A0i.equals(bzu.A01[intValue].A02)) {
                                String A0t = r11.A0t();
                                if (!(obj == null || bzu.A02[intValue] == null)) {
                                    z2 = true;
                                }
                                if (z2) {
                                    bzu.A01(r5, byY2, obj2, intValue, A0t);
                                    bzu.A02[intValue] = null;
                                } else {
                                    bzu.A03[intValue] = A0t;
                                }
                            }
                        }
                    }
                    try {
                        A00.A08(r11, byY, obj);
                    } catch (Exception e) {
                        A0d(e, obj, A0i, byY);
                    }
                } else {
                    HashSet hashSet = this.A0B;
                    if (hashSet != null && hashSet.contains(A0i)) {
                        r11.A0f();
                    } else if (!bzu.A02(r11, byY, A0i, obj)) {
                        C0H c0h = this.A01;
                        if (c0h != null) {
                            c0h.A01(r11, byY, obj, A0i);
                        } else {
                            A0J(r11, byY, obj, A0i);
                        }
                    }
                }
                r11.A0p();
            } else {
                bzu.A00(r11, byY, obj);
                return;
            }
        }
    }

    public BeanDeserializer(C27175Bzn bzn, C0K c0k, C0G c0g, Map map, HashSet hashSet, boolean z, boolean z2) {
        super(bzn, c0k, c0g, map, hashSet, z, z2);
    }

    public BeanDeserializer(BeanDeserializerBase beanDeserializerBase) {
        super(beanDeserializerBase, beanDeserializerBase.A0D);
    }

    public BeanDeserializer(BeanDeserializerBase beanDeserializerBase, C27164Bzc bzc) {
        super(beanDeserializerBase, bzc);
    }

    public BeanDeserializer(BeanDeserializerBase beanDeserializerBase, C3P c3p) {
        super(beanDeserializerBase, c3p);
    }

    public BeanDeserializer(BeanDeserializerBase beanDeserializerBase, HashSet hashSet) {
        super(beanDeserializerBase, hashSet);
    }
}
