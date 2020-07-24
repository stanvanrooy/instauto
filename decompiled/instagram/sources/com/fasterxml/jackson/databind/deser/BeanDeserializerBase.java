package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.deser.impl.BeanAsArrayBuilderDeserializer;
import com.fasterxml.jackson.databind.deser.impl.BeanAsArrayDeserializer;
import com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase;
import com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer;
import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import p000X.AnonymousClass000;
import p000X.Constants;
import p000X.C00;
import p000X.C0G;
import p000X.C0H;
import p000X.C0K;
import p000X.C0L;
import p000X.C0R;
import p000X.C0Z;
import p000X.C13080hr;
import p000X.C13120hv;
import p000X.C13480ib;
import p000X.C1A;
import p000X.C1T;
import p000X.C1X;
import p000X.C200288hn;
import p000X.C21;
import p000X.C25;
import p000X.C25942Bct;
import p000X.C26691Bpp;
import p000X.C27105Bxz;
import p000X.C27106By5;
import p000X.C27107By8;
import p000X.C27108By9;
import p000X.C27123ByY;
import p000X.C27125Bya;
import p000X.C27126Byj;
import p000X.C27148BzD;
import p000X.C27162Bza;
import p000X.C27163Bzb;
import p000X.C27164Bzc;
import p000X.C27175Bzn;
import p000X.C27176Bzt;
import p000X.C27177Bzu;
import p000X.C27179Bzx;
import p000X.C27183C0d;
import p000X.C27192C0r;
import p000X.C27200C1k;
import p000X.C27209C2a;
import p000X.C27210C2b;
import p000X.C27225C3o;
import p000X.C2A;
import p000X.C2B;
import p000X.C2C;
import p000X.C2P;
import p000X.C2R;
import p000X.C36;
import p000X.C3P;
import p000X.C45371xl;

public abstract class BeanDeserializerBase extends StdDeserializer implements C27105Bxz, C27108By9, Serializable {
    public JsonDeserializer A00;
    public C0H A01;
    public C27177Bzu A02;
    public C27162Bza A03;
    public C1X A04;
    public boolean A05;
    public boolean A06;
    public final C0L A07;
    public final C27183C0d A08;
    public final C0G A09;
    public final C27164Bzc A0A;
    public final HashSet A0B;
    public final Map A0C;
    public final boolean A0D;
    public final boolean A0E;
    public final C2R[] A0F;
    public final Integer A0G;
    public transient HashMap A0H;
    public final transient C27225C3o A0I;

    public JsonDeserializer A04(C3P c3p) {
        BeanDeserializerBase beanDeserializerBase;
        if (this instanceof BeanAsArrayDeserializer) {
            beanDeserializerBase = ((BeanAsArrayDeserializer) this).A00;
        } else if (this instanceof BeanAsArrayBuilderDeserializer) {
            beanDeserializerBase = ((BeanAsArrayBuilderDeserializer) this).A00;
        } else if (this instanceof BuilderBasedDeserializer) {
            return new BuilderBasedDeserializer((BuilderBasedDeserializer) this, c3p);
        } else {
            BeanDeserializer beanDeserializer = (BeanDeserializer) this;
            if (beanDeserializer instanceof ThrowableDeserializer) {
                beanDeserializer = (ThrowableDeserializer) beanDeserializer;
                if (beanDeserializer.getClass() == ThrowableDeserializer.class) {
                    return new ThrowableDeserializer(beanDeserializer, c3p);
                }
            } else if (beanDeserializer.getClass() == BeanDeserializer.class) {
                return new BeanDeserializer((BeanDeserializerBase) beanDeserializer, c3p);
            }
            return beanDeserializer;
        }
        return beanDeserializerBase.A04(c3p);
    }

    public BeanDeserializerBase A0L() {
        if (this instanceof BeanAsArrayDeserializer) {
            return (BeanAsArrayDeserializer) this;
        }
        if (this instanceof BeanAsArrayBuilderDeserializer) {
            return (BeanAsArrayBuilderDeserializer) this;
        }
        if (!(this instanceof BuilderBasedDeserializer)) {
            BeanDeserializer beanDeserializer = (BeanDeserializer) this;
            return new BeanAsArrayDeserializer(beanDeserializer, beanDeserializer.A09.A04());
        }
        BuilderBasedDeserializer builderBasedDeserializer = (BuilderBasedDeserializer) this;
        return new BeanAsArrayBuilderDeserializer(builderBasedDeserializer, builderBasedDeserializer.A09.A04(), builderBasedDeserializer.A00);
    }

    public BeanDeserializerBase A0M(C27164Bzc bzc) {
        if (this instanceof BeanAsArrayDeserializer) {
            BeanAsArrayDeserializer beanAsArrayDeserializer = (BeanAsArrayDeserializer) this;
            return new BeanAsArrayDeserializer(beanAsArrayDeserializer.A00.A0M(bzc), beanAsArrayDeserializer.A01);
        } else if (!(this instanceof BeanAsArrayBuilderDeserializer)) {
            return !(this instanceof BuilderBasedDeserializer) ? new BeanDeserializer((BeanDeserializerBase) (BeanDeserializer) this, bzc) : new BuilderBasedDeserializer((BuilderBasedDeserializer) this, bzc);
        } else {
            BeanAsArrayBuilderDeserializer beanAsArrayBuilderDeserializer = (BeanAsArrayBuilderDeserializer) this;
            return new BeanAsArrayBuilderDeserializer(beanAsArrayBuilderDeserializer.A00.A0M(bzc), beanAsArrayBuilderDeserializer.A02, beanAsArrayBuilderDeserializer.A01);
        }
    }

    public BeanDeserializerBase A0N(HashSet hashSet) {
        if (this instanceof BeanAsArrayDeserializer) {
            BeanAsArrayDeserializer beanAsArrayDeserializer = (BeanAsArrayDeserializer) this;
            return new BeanAsArrayDeserializer(beanAsArrayDeserializer.A00.A0N(hashSet), beanAsArrayDeserializer.A01);
        } else if (!(this instanceof BeanAsArrayBuilderDeserializer)) {
            return !(this instanceof BuilderBasedDeserializer) ? new BeanDeserializer((BeanDeserializerBase) (BeanDeserializer) this, hashSet) : new BuilderBasedDeserializer((BuilderBasedDeserializer) this, hashSet);
        } else {
            BeanAsArrayBuilderDeserializer beanAsArrayBuilderDeserializer = (BeanAsArrayBuilderDeserializer) this;
            return new BeanAsArrayBuilderDeserializer(beanAsArrayBuilderDeserializer.A00.A0N(hashSet), beanAsArrayBuilderDeserializer.A02, beanAsArrayBuilderDeserializer.A01);
        }
    }

    public Object A0O(C13080hr r12, C27123ByY byY) {
        Class<?> cls;
        Class<?> cls2;
        Object obj;
        if (this instanceof BeanAsArrayDeserializer) {
            BeanAsArrayDeserializer beanAsArrayDeserializer = (BeanAsArrayDeserializer) this;
            C27162Bza bza = beanAsArrayDeserializer.A03;
            C27163Bzb A012 = bza.A01(r12, byY, beanAsArrayDeserializer.A0A);
            C27176Bzt[] bztArr = beanAsArrayDeserializer.A01;
            int length = bztArr.length;
            Object obj2 = null;
            int i = 0;
            while (r12.A0p() != C13120hv.END_ARRAY) {
                C27176Bzt bzt = i < length ? bztArr[i] : null;
                if (bzt == null) {
                    r12.A0f();
                } else if (obj2 != null) {
                    try {
                        bzt.A08(r12, byY, obj2);
                    } catch (Exception e) {
                        beanAsArrayDeserializer.A0d(e, obj2, bzt.A07, byY);
                    }
                } else {
                    String str = bzt.A07;
                    C27176Bzt bzt2 = (C27176Bzt) bza.A00.get(str);
                    if (bzt2 != null) {
                        if (A012.A02(bzt2.A01(), bzt2.A05(r12, byY))) {
                            try {
                                obj2 = bza.A02(byY, A012);
                                cls = obj2.getClass();
                                cls2 = beanAsArrayDeserializer.A07.A00;
                                if (cls == cls2) {
                                }
                            } catch (Exception e2) {
                                beanAsArrayDeserializer.A0d(e2, beanAsArrayDeserializer.A07.A00, str, byY);
                            }
                        } else {
                            continue;
                        }
                    } else if (!A012.A03(str)) {
                        A012.A01(bzt, bzt.A05(r12, byY));
                    }
                }
                i++;
            }
            if (obj2 != null) {
                return obj2;
            }
            try {
                return bza.A02(byY, A012);
            } catch (Exception e3) {
                beanAsArrayDeserializer.A0c(e3, byY);
                return null;
            }
        } else if (this instanceof BeanAsArrayBuilderDeserializer) {
            BeanAsArrayBuilderDeserializer beanAsArrayBuilderDeserializer = (BeanAsArrayBuilderDeserializer) this;
            C27162Bza bza2 = beanAsArrayBuilderDeserializer.A03;
            C27163Bzb A013 = bza2.A01(r12, byY, beanAsArrayBuilderDeserializer.A0A);
            C27176Bzt[] bztArr2 = beanAsArrayBuilderDeserializer.A02;
            int length2 = bztArr2.length;
            Object obj3 = null;
            int i2 = 0;
            while (r12.A0p() != C13120hv.END_ARRAY) {
                C27176Bzt bzt3 = i2 < length2 ? bztArr2[i2] : null;
                if (bzt3 == null) {
                    r12.A0f();
                } else if (obj3 != null) {
                    try {
                        obj3 = bzt3.A06(r12, byY, obj3);
                    } catch (Exception e4) {
                        beanAsArrayBuilderDeserializer.A0d(e4, obj3, bzt3.A07, byY);
                    }
                } else {
                    String str2 = bzt3.A07;
                    C27176Bzt bzt4 = (C27176Bzt) bza2.A00.get(str2);
                    if (bzt4 != null) {
                        if (A013.A02(bzt4.A01(), bzt4.A05(r12, byY))) {
                            try {
                                obj3 = bza2.A02(byY, A013);
                                cls = obj3.getClass();
                                cls2 = beanAsArrayBuilderDeserializer.A07.A00;
                                if (cls == cls2) {
                                }
                            } catch (Exception e5) {
                                beanAsArrayBuilderDeserializer.A0d(e5, beanAsArrayBuilderDeserializer.A07.A00, str2, byY);
                            }
                        } else {
                            continue;
                        }
                    } else if (!A013.A03(str2)) {
                        A013.A01(bzt3, bzt3.A05(r12, byY));
                    }
                }
                i2++;
            }
            if (obj3 != null) {
                return obj3;
            }
            try {
                return bza2.A02(byY, A013);
            } catch (Exception e6) {
                beanAsArrayBuilderDeserializer.A0c(e6, byY);
                return null;
            }
        } else if (!(this instanceof BuilderBasedDeserializer)) {
            BeanDeserializer beanDeserializer = (BeanDeserializer) this;
            C27162Bza bza3 = beanDeserializer.A03;
            C27163Bzb A014 = bza3.A01(r12, byY, beanDeserializer.A0A);
            C13120hv A0g = r12.A0g();
            Object obj4 = null;
            C13480ib r3 = null;
            while (A0g == C13120hv.FIELD_NAME) {
                String A0i = r12.A0i();
                r12.A0p();
                C27176Bzt bzt5 = (C27176Bzt) bza3.A00.get(A0i);
                if (bzt5 != null) {
                    if (A014.A02(bzt5.A01(), bzt5.A05(r12, byY))) {
                        r12.A0p();
                        try {
                            obj4 = bza3.A02(byY, A014);
                        } catch (Exception e7) {
                            beanDeserializer.A0d(e7, beanDeserializer.A07.A00, A0i, byY);
                        }
                        if (obj4.getClass() != beanDeserializer.A07.A00) {
                            return beanDeserializer.A0Y(r12, byY, obj4, r3);
                        }
                        if (r3 != null) {
                            beanDeserializer.A0b(byY, obj4, r3);
                        }
                        beanDeserializer.A08(r12, byY, obj4);
                        return obj4;
                    }
                } else if (!A014.A03(A0i)) {
                    C27176Bzt A002 = beanDeserializer.A09.A00(A0i);
                    if (A002 != null) {
                        A014.A01(A002, A002.A05(r12, byY));
                    } else {
                        HashSet hashSet = beanDeserializer.A0B;
                        if (hashSet == null || !hashSet.contains(A0i)) {
                            C0H c0h = beanDeserializer.A01;
                            if (c0h != null) {
                                A014.A00(c0h, A0i, c0h.A00(r12, byY));
                            } else {
                                if (r3 == null) {
                                    r3 = new C13480ib(r12.A0q());
                                }
                                r3.A0d(A0i);
                                r3.A0q(r12);
                            }
                        } else {
                            r12.A0f();
                        }
                    }
                }
                A0g = r12.A0p();
            }
            try {
                obj = bza3.A02(byY, A014);
            } catch (Exception e8) {
                beanDeserializer.A0c(e8, byY);
                obj = null;
            }
            if (r3 == null) {
                return obj;
            }
            if (obj.getClass() != beanDeserializer.A07.A00) {
                return beanDeserializer.A0Y((C13080hr) null, byY, obj, r3);
            }
            beanDeserializer.A0b(byY, obj, r3);
            return obj;
        } else {
            BuilderBasedDeserializer builderBasedDeserializer = (BuilderBasedDeserializer) this;
            C27162Bza bza4 = builderBasedDeserializer.A03;
            C27163Bzb A015 = bza4.A01(r12, byY, builderBasedDeserializer.A0A);
            C13120hv A0g2 = r12.A0g();
            C13480ib r5 = null;
            while (A0g2 == C13120hv.FIELD_NAME) {
                String A0i2 = r12.A0i();
                r12.A0p();
                C27176Bzt bzt6 = (C27176Bzt) bza4.A00.get(A0i2);
                if (bzt6 != null) {
                    if (A015.A02(bzt6.A01(), bzt6.A05(r12, byY))) {
                        r12.A0p();
                        try {
                            Object A022 = bza4.A02(byY, A015);
                            if (A022.getClass() != builderBasedDeserializer.A07.A00) {
                                return builderBasedDeserializer.A0Y(r12, byY, A022, r5);
                            }
                            if (r5 != null) {
                                builderBasedDeserializer.A0b(byY, A022, r5);
                            }
                            return builderBasedDeserializer.A0e(r12, byY, A022);
                        } catch (Exception e9) {
                            builderBasedDeserializer.A0d(e9, builderBasedDeserializer.A07.A00, A0i2, byY);
                        }
                    } else {
                        continue;
                    }
                } else if (!A015.A03(A0i2)) {
                    C27176Bzt A003 = builderBasedDeserializer.A09.A00(A0i2);
                    if (A003 != null) {
                        A015.A01(A003, A003.A05(r12, byY));
                    } else {
                        HashSet hashSet2 = builderBasedDeserializer.A0B;
                        if (hashSet2 == null || !hashSet2.contains(A0i2)) {
                            C0H c0h2 = builderBasedDeserializer.A01;
                            if (c0h2 != null) {
                                A015.A00(c0h2, A0i2, c0h2.A00(r12, byY));
                            } else {
                                if (r5 == null) {
                                    r5 = new C13480ib(r12.A0q());
                                }
                                r5.A0d(A0i2);
                                r5.A0q(r12);
                            }
                        } else {
                            r12.A0f();
                        }
                    }
                }
                A0g2 = r12.A0p();
            }
            try {
                Object A023 = bza4.A02(byY, A015);
                if (r5 == null) {
                    return A023;
                }
                if (A023.getClass() != builderBasedDeserializer.A07.A00) {
                    return builderBasedDeserializer.A0Y((C13080hr) null, byY, A023, r5);
                }
                builderBasedDeserializer.A0b(byY, A023, r5);
                return A023;
            } catch (Exception e10) {
                builderBasedDeserializer.A0c(e10, byY);
                return null;
            }
        }
        throw C27125Bya.A00(byY.A05, AnonymousClass000.A0N("Can not support implicit polymorphic deserialization for POJOs-as-Arrays style: nominal type ", cls2.getName(), ", actual type ", cls.getName()));
    }

    public Object A0P(C13080hr r8, C27123ByY byY) {
        Object obj;
        C27163Bzb bzb;
        C27163Bzb bzb2;
        if (this instanceof BeanAsArrayDeserializer) {
            return ((BeanAsArrayDeserializer) this).A0e(r8, byY);
        }
        if (this instanceof BeanAsArrayBuilderDeserializer) {
            return ((BeanAsArrayBuilderDeserializer) this).A0e(r8, byY);
        }
        BuilderBasedDeserializer builderBasedDeserializer = (BuilderBasedDeserializer) this;
        if (!builderBasedDeserializer.A05) {
            Object A052 = builderBasedDeserializer.A08.A05(byY);
            if (builderBasedDeserializer.A0F != null) {
                builderBasedDeserializer.A0a(byY, A052);
            }
            boolean z = builderBasedDeserializer.A0E;
            while (r8.A0g() != C13120hv.END_OBJECT) {
                String A0i = r8.A0i();
                r8.A0p();
                C27176Bzt A002 = builderBasedDeserializer.A09.A00(A0i);
                if (A002 != null) {
                    try {
                        A052 = A002.A06(r8, byY, A052);
                    } catch (Exception e) {
                        builderBasedDeserializer.A0d(e, A052, A0i, byY);
                    }
                } else {
                    HashSet hashSet = builderBasedDeserializer.A0B;
                    if (hashSet == null || !hashSet.contains(A0i)) {
                        C0H c0h = builderBasedDeserializer.A01;
                        if (c0h != null) {
                            c0h.A01(r8, byY, A052, A0i);
                        } else {
                            builderBasedDeserializer.A0J(r8, byY, A052, A0i);
                        }
                    } else {
                        r8.A0f();
                    }
                }
                r8.A0p();
            }
            return A052;
        } else if (builderBasedDeserializer.A04 != null) {
            JsonDeserializer jsonDeserializer = builderBasedDeserializer.A00;
            if (jsonDeserializer != null) {
                return builderBasedDeserializer.A08.A09(byY, jsonDeserializer.A06(r8, byY));
            }
            C27162Bza bza = builderBasedDeserializer.A03;
            if (bza != null) {
                C27163Bzb A012 = bza.A01(r8, byY, builderBasedDeserializer.A0A);
                C13480ib r4 = new C13480ib(r8.A0q());
                r4.A0T();
                C13120hv A0g = r8.A0g();
                C27163Bzb bzb3 = A012;
                while (true) {
                    if (A0g == C13120hv.FIELD_NAME) {
                        String A0i2 = r8.A0i();
                        r8.A0p();
                        C27176Bzt bzt = (C27176Bzt) bza.A00.get(A0i2);
                        if (bzt != null) {
                            if (bzb3.A02(bzt.A01(), bzt.A05(r8, byY))) {
                                C13120hv A0p = r8.A0p();
                                try {
                                    bzb2 = bzb3;
                                    Object A022 = bza.A02(byY, bzb3);
                                    bzb2 = A022;
                                    while (A0p == C13120hv.FIELD_NAME) {
                                        r8.A0p();
                                        r4.A0q(r8);
                                        A0p = r8.A0p();
                                    }
                                    r4.A0Q();
                                    Class<?> cls = A022.getClass();
                                    obj = A022;
                                    if (cls != builderBasedDeserializer.A07.A00) {
                                        throw C27125Bya.A00(byY.A05, "Can not create polymorphic instances with unwrapped values");
                                    }
                                } catch (Exception e2) {
                                    builderBasedDeserializer.A0d(e2, builderBasedDeserializer.A07.A00, A0i2, byY);
                                    bzb = bzb2;
                                }
                            } else {
                                bzb = bzb3;
                                continue;
                            }
                        } else if (bzb3.A03(A0i2)) {
                            bzb = bzb3;
                        } else {
                            C27176Bzt A003 = builderBasedDeserializer.A09.A00(A0i2);
                            if (A003 != null) {
                                bzb3.A01(A003, A003.A05(r8, byY));
                                bzb = bzb3;
                            } else {
                                HashSet hashSet2 = builderBasedDeserializer.A0B;
                                if (hashSet2 == null || !hashSet2.contains(A0i2)) {
                                    r4.A0d(A0i2);
                                    r4.A0q(r8);
                                    C0H c0h2 = builderBasedDeserializer.A01;
                                    if (c0h2 != null) {
                                        bzb3.A00(c0h2, A0i2, c0h2.A00(r8, byY));
                                        bzb = bzb3;
                                    } else {
                                        bzb = bzb3;
                                    }
                                } else {
                                    r8.A0f();
                                    bzb = bzb3;
                                }
                            }
                        }
                        A0g = r8.A0p();
                        bzb3 = bzb;
                    } else {
                        try {
                            obj = bza.A02(byY, bzb3);
                            break;
                        } catch (Exception e3) {
                            builderBasedDeserializer.A0c(e3, byY);
                            return null;
                        }
                    }
                }
                builderBasedDeserializer.A04.A00(byY, obj, r4);
                return obj;
            }
            C13480ib r42 = new C13480ib(r8.A0q());
            r42.A0T();
            Object A053 = builderBasedDeserializer.A08.A05(byY);
            if (builderBasedDeserializer.A0F != null) {
                builderBasedDeserializer.A0a(byY, A053);
            }
            boolean z2 = builderBasedDeserializer.A0E;
            while (r8.A0g() != C13120hv.END_OBJECT) {
                String A0i3 = r8.A0i();
                r8.A0p();
                C27176Bzt A004 = builderBasedDeserializer.A09.A00(A0i3);
                if (A004 != null) {
                    try {
                        A053 = A004.A06(r8, byY, A053);
                    } catch (Exception e4) {
                        builderBasedDeserializer.A0d(e4, A053, A0i3, byY);
                    }
                } else {
                    HashSet hashSet3 = builderBasedDeserializer.A0B;
                    if (hashSet3 == null || !hashSet3.contains(A0i3)) {
                        r42.A0d(A0i3);
                        r42.A0q(r8);
                        C0H c0h3 = builderBasedDeserializer.A01;
                        if (c0h3 != null) {
                            c0h3.A01(r8, byY, A053, A0i3);
                        }
                    } else {
                        r8.A0f();
                    }
                }
                r8.A0p();
            }
            r42.A0Q();
            builderBasedDeserializer.A04.A00(byY, A053, r42);
            return A053;
        } else if (builderBasedDeserializer.A02 == null) {
            return builderBasedDeserializer.A0X(r8, byY);
        } else {
            if (builderBasedDeserializer.A03 == null) {
                return builderBasedDeserializer.A0f(r8, byY, builderBasedDeserializer.A08.A05(byY));
            }
            throw new IllegalStateException("Deserialization with Builder, External type id, @JsonCreator not yet implemented");
        }
    }

    public final Object A0Y(C13080hr r6, C27123ByY byY, Object obj, C13480ib r9) {
        JsonDeserializer jsonDeserializer;
        synchronized (this) {
            try {
                HashMap hashMap = this.A0H;
                if (hashMap == null) {
                    jsonDeserializer = null;
                } else {
                    jsonDeserializer = (JsonDeserializer) hashMap.get(new C25942Bct(obj.getClass()));
                }
            } catch (Throwable th) {
                while (true) {
                    th = th;
                }
            }
        }
        if (jsonDeserializer == null) {
            Class<?> cls = obj.getClass();
            jsonDeserializer = byY.A07(byY.A00.A03(cls));
            if (jsonDeserializer != null) {
                synchronized (this) {
                    try {
                        if (this.A0H == null) {
                            this.A0H = new HashMap();
                        }
                        this.A0H.put(new C25942Bct(cls), jsonDeserializer);
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                }
            }
        }
        if (jsonDeserializer != null) {
            if (r9 != null) {
                r9.A0Q();
                C13080hr A0n = r9.A0n();
                A0n.A0p();
                obj = jsonDeserializer.A08(A0n, byY, obj);
            }
            if (r6 != null) {
                return jsonDeserializer.A08(r6, byY, obj);
            }
            return obj;
        }
        if (r9 != null) {
            A0b(byY, obj, r9);
        }
        if (r6 != null) {
            return A08(r6, byY, obj);
        }
        return obj;
    }

    public final void A0J(C13080hr r2, C27123ByY byY, Object obj, String str) {
        HashSet hashSet;
        if (this.A0D || ((hashSet = this.A0B) != null && hashSet.contains(str))) {
            r2.A0f();
        } else {
            super.A0J(r2, byY, obj, str);
        }
    }

    public final Object A0Q(C13080hr r3, C27123ByY byY) {
        JsonDeserializer jsonDeserializer = this.A00;
        if (jsonDeserializer != null) {
            try {
                Object A092 = this.A08.A09(byY, jsonDeserializer.A06(r3, byY));
                if (this.A0F != null) {
                    A0a(byY, A092);
                }
                return A092;
            } catch (Exception e) {
                A0c(e, byY);
            }
        }
        throw byY.A0A(this.A07.A00);
    }

    public final Object A0R(C13080hr r4, C27123ByY byY) {
        JsonDeserializer jsonDeserializer = this.A00;
        if (jsonDeserializer != null) {
            C27183C0d c0d = this.A08;
            if (!c0d.A0E()) {
                Object A092 = c0d.A09(byY, jsonDeserializer.A06(r4, byY));
                if (this.A0F != null) {
                    A0a(byY, A092);
                }
                return A092;
            }
        }
        boolean z = false;
        if (r4.A0g() == C13120hv.VALUE_TRUE) {
            z = true;
        }
        return this.A08.A0B(byY, z);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0034, code lost:
        if (r1.A0G() == false) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0041, code lost:
        if (r1.A0G() == false) goto L_0x0043;
     */
    public final Object A0T(C13080hr r4, C27123ByY byY) {
        JsonDeserializer jsonDeserializer;
        C27183C0d c0d;
        Object A062;
        if (this.A0A != null) {
            return A0U(r4, byY);
        }
        switch (r4.A0X().intValue()) {
            case 0:
                jsonDeserializer = this.A00;
                if (jsonDeserializer != null) {
                    c0d = this.A08;
                    break;
                }
                return this.A08.A07(byY, r4.A0T());
            case 1:
                jsonDeserializer = this.A00;
                if (jsonDeserializer != null) {
                    c0d = this.A08;
                    break;
                }
                return this.A08.A08(byY, r4.A0U());
            default:
                JsonDeserializer jsonDeserializer2 = this.A00;
                if (jsonDeserializer2 != null) {
                    c0d = this.A08;
                    A062 = jsonDeserializer2.A06(r4, byY);
                    break;
                } else {
                    throw byY.A0C(this.A07.A00, "no suitable creator method found to deserialize from JSON integer number");
                }
        }
        A062 = jsonDeserializer.A06(r4, byY);
        Object A092 = c0d.A09(byY, A062);
        if (this.A0F == null) {
            return A092;
        }
        A0a(byY, A092);
        return A092;
    }

    public final Object A0U(C13080hr r5, C27123ByY byY) {
        Object A062 = this.A0A.A02.A06(r5, byY);
        Object obj = byY.A0H(A062, this.A0A.A00).A00;
        if (obj != null) {
            return obj;
        }
        throw new IllegalStateException("Could not resolve Object Id [" + A062 + "] (for " + this.A07 + ") -- unresolved forward-reference?");
    }

    public final Object A0V(C13080hr r4, C27123ByY byY) {
        if (this.A0A != null) {
            return A0U(r4, byY);
        }
        JsonDeserializer jsonDeserializer = this.A00;
        if (jsonDeserializer != null) {
            C27183C0d c0d = this.A08;
            if (!c0d.A0J()) {
                Object A092 = c0d.A09(byY, jsonDeserializer.A06(r4, byY));
                if (this.A0F == null) {
                    return A092;
                }
                A0a(byY, A092);
                return A092;
            }
        }
        return this.A08.A0A(byY, r4.A0t());
    }

    public final Object A0W(C13080hr r7, C27123ByY byY) {
        String str = this.A0A.A04;
        if (!str.equals(r7.A0i())) {
            C13480ib r4 = new C13480ib(r7.A0q());
            C13480ib r2 = null;
            while (r7.A0g() != C13120hv.END_OBJECT) {
                String A0i = r7.A0i();
                if (r2 != null) {
                    r2.A0d(A0i);
                    r7.A0p();
                    r2.A0q(r7);
                } else if (str.equals(A0i)) {
                    r2 = new C13480ib(r7.A0q());
                    r2.A0d(A0i);
                    r7.A0p();
                    r2.A0q(r7);
                    C13080hr A0n = r4.A0n();
                    while (A0n.A0p() != null) {
                        r2.A0p(A0n);
                    }
                    r4 = null;
                } else {
                    r4.A0d(A0i);
                    r7.A0p();
                    r4.A0q(r7);
                }
                r7.A0p();
            }
            if (r2 == null) {
                r2 = r4;
            }
            r2.A0Q();
            r7 = r2.A0n();
            r7.A0p();
        }
        return A0P(r7, byY);
    }

    public final Object A0X(C13080hr r3, C27123ByY byY) {
        StringBuilder sb;
        String str;
        JsonDeserializer jsonDeserializer = this.A00;
        if (jsonDeserializer != null) {
            return this.A08.A09(byY, jsonDeserializer.A06(r3, byY));
        }
        if (this.A03 != null) {
            return A0O(r3, byY);
        }
        if (this.A07.A0K()) {
            sb = new StringBuilder("Can not instantiate abstract type ");
            sb.append(this.A07);
            str = " (need to add/enable type information?)";
        } else {
            sb = new StringBuilder("No suitable constructor found for type ");
            sb.append(this.A07);
            str = ": can not instantiate from JSON object (need to add/enable type information?)";
        }
        sb.append(str);
        throw C27125Bya.A00(r3, sb.toString());
    }

    public final void A0Z(C13080hr r2, C27123ByY byY, Object obj, String str) {
        HashSet hashSet = this.A0B;
        if (hashSet == null || !hashSet.contains(str)) {
            C0H c0h = this.A01;
            if (c0h != null) {
                try {
                    c0h.A01(r2, byY, obj, str);
                } catch (Exception e) {
                    A0d(e, obj, str, byY);
                }
            } else {
                A0J(r2, byY, obj, str);
            }
        } else {
            r2.A0f();
        }
    }

    public final void A0a(C27123ByY byY, Object obj) {
        for (C2R c2r : this.A0F) {
            c2r.A01.A0J(obj, byY.A0K(c2r.A00, c2r, obj));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001c, code lost:
        if (r4.A0O(p000X.C27109ByB.WRAP_EXCEPTIONS) != false) goto L_0x001e;
     */
    public final void A0c(Throwable th, C27123ByY byY) {
        boolean z;
        while ((th instanceof InvocationTargetException) && th.getCause() != null) {
            th = th.getCause();
        }
        if (!(th instanceof Error)) {
            if (byY != null) {
                z = false;
            }
            z = true;
            if (th instanceof IOException) {
                throw ((IOException) th);
            } else if (z || !(th instanceof RuntimeException)) {
                throw byY.A0E(this.A07.A00, th);
            } else {
                throw ((RuntimeException) th);
            }
        } else {
            throw ((Error) th);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001c, code lost:
        if (r6.A0O(p000X.C27109ByB.WRAP_EXCEPTIONS) != false) goto L_0x001e;
     */
    public final void A0d(Throwable th, Object obj, String str, C27123ByY byY) {
        boolean z;
        while ((th instanceof InvocationTargetException) && th.getCause() != null) {
            th = th.getCause();
        }
        if (!(th instanceof Error)) {
            if (byY != null) {
                z = false;
            }
            z = true;
            if (th instanceof IOException) {
                if (!z || !(th instanceof C45371xl)) {
                    throw ((IOException) th);
                }
            } else if (!z && (th instanceof RuntimeException)) {
                throw ((RuntimeException) th);
            }
            throw C27125Bya.A01(th, new C200288hn(obj, str));
        }
        throw ((Error) th);
    }

    public final JsonDeserializer AAK(C27123ByY byY, C27148BzD bzD) {
        C27200C1k c1k;
        String[] strArr;
        BeanDeserializerBase beanDeserializerBase;
        C27126Byj A002;
        C0L c0l;
        C2P A022;
        C27176Bzt bzt;
        C27162Bza bza;
        C27164Bzc bzc = this.A0A;
        C27179Bzx A012 = byY.A00.A01();
        Integer num = null;
        if (bzD == null || A012 == null) {
            c1k = null;
        } else {
            c1k = bzD.APy();
        }
        if (bzD == null || A012 == null) {
            strArr = null;
        } else {
            strArr = A012.A0u(c1k);
            C21 A072 = A012.A07(c1k);
            if (A072 != null) {
                C21 A082 = A012.A08(c1k, A072);
                Class<C36> cls = A082.A00;
                if (cls == C36.class) {
                    String str = A082.A02;
                    C0G c0g = this.A09;
                    if (c0g == null) {
                        bzt = null;
                    } else {
                        bzt = c0g.A00(str);
                    }
                    if (bzt == null && (bza = this.A03) != null) {
                        bzt = (C27176Bzt) bza.A00.get(str);
                    }
                    if (bzt != null) {
                        c0l = bzt.AZA();
                        A022 = new C25(A082.A01);
                    } else {
                        throw new IllegalArgumentException(AnonymousClass000.A0O("Invalid Object Id definition for ", this.A07.A00.getName(), ": can not find property with name '", str, "'"));
                    }
                } else {
                    c0l = byY.A05().A09(byY.A00.A03(cls), C2P.class)[0];
                    A022 = byY.A02(A082);
                    bzt = null;
                }
                bzc = new C27164Bzc(c0l, A082.A02, A022, byY.A07(c0l), bzt);
            }
        }
        if (bzc == null || bzc == this.A0A) {
            beanDeserializerBase = this;
        } else {
            beanDeserializerBase = A0M(bzc);
        }
        if (!(strArr == null || (r7 = strArr.length) == 0)) {
            HashSet hashSet = beanDeserializerBase.A0B;
            HashSet hashSet2 = new HashSet();
            if (hashSet != null) {
                hashSet2.addAll(hashSet);
            }
            if (strArr != null) {
                for (String add : strArr) {
                    hashSet2.add(add);
                }
            }
            beanDeserializerBase = beanDeserializerBase.A0N(hashSet2);
        }
        if (!(c1k == null || (A002 = A012.A00(c1k)) == null)) {
            num = A002.A00;
        }
        if (num == null) {
            num = this.A0G;
        }
        if (num == Constants.A0C) {
            return beanDeserializerBase.A0L();
        }
        return beanDeserializerBase;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0067, code lost:
        if (r5 == p000X.C27176Bzt.A0B) goto L_0x0069;
     */
    /* JADX WARNING: Removed duplicated region for block: B:176:0x0259 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00f2  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0101  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x010f  */
    public final void Bdl(C27123ByY byY) {
        C1T c1t;
        boolean z;
        C0Z c0z;
        JsonDeserializer AAK;
        String str;
        C27176Bzt bzt;
        Class cls;
        Class A002;
        C3P A0D2;
        JsonDeserializer jsonDeserializer;
        JsonDeserializer A042;
        Map map;
        String name;
        C27176Bzt bzt2;
        C27176Bzt bzt3;
        boolean z2;
        Object A0U;
        C27183C0d c0d = this.A08;
        C1X c1x = null;
        C27123ByY byY2 = byY;
        if (c0d.A0I()) {
            C27162Bza A003 = C27162Bza.A00(byY2, this.A08, c0d.A0M(byY2.A00));
            this.A03 = A003;
            c1t = null;
            for (C27176Bzt bzt4 : A003.A00.values()) {
                C27106By5 by5 = bzt4.A06;
                boolean z3 = false;
                if (by5 != null) {
                    z3 = true;
                }
                if (z3 && by5.A02() == C2C.EXTERNAL_PROPERTY) {
                    if (c1t == null) {
                        c1t = new C1T();
                    }
                    c1t.A00(bzt4, by5);
                }
            }
        } else {
            c1t = null;
        }
        Iterator it = this.A09.iterator();
        while (it.hasNext()) {
            C27176Bzt bzt5 = (C27176Bzt) it.next();
            JsonDeserializer jsonDeserializer2 = bzt5.A01;
            if (jsonDeserializer2 != null) {
                z = true;
            }
            z = false;
            if (!z) {
                C27179Bzx A012 = byY2.A00.A01();
                if (A012 == null || (A0U = A012.A0U(bzt5.APy())) == null) {
                    AAK = null;
                } else {
                    C27107By8 A062 = byY2.A06(A0U);
                    C0L ANn = A062.ANn(byY2.A05());
                    AAK = new StdDelegatingDeserializer(A062, ANn, byY2.A08(ANn, bzt5));
                }
                if (AAK == null) {
                    AAK = byY2.A08(bzt5.AZA(), bzt5);
                }
            } else {
                if (jsonDeserializer2 == C27176Bzt.A0B) {
                    jsonDeserializer2 = null;
                }
                if (!(jsonDeserializer2 instanceof C27105Bxz) || (AAK = ((C27105Bxz) jsonDeserializer2).AAK(byY2, bzt5)) == jsonDeserializer2) {
                    c0z = bzt5;
                    str = c0z.A03;
                    if (str != null) {
                        JsonDeserializer jsonDeserializer3 = c0z.A01;
                        if (jsonDeserializer3 == C27176Bzt.A0B) {
                            jsonDeserializer3 = null;
                        }
                        if (jsonDeserializer3 instanceof BeanDeserializerBase) {
                            map = ((BeanDeserializerBase) jsonDeserializer3).A0C;
                        } else if (jsonDeserializer3 instanceof ContainerDeserializerBase) {
                            JsonDeserializer A0L = ((ContainerDeserializerBase) jsonDeserializer3).A0L();
                            if (!(A0L instanceof BeanDeserializerBase)) {
                                if (A0L == null) {
                                    name = "NULL";
                                } else {
                                    name = A0L.getClass().getName();
                                }
                                throw new IllegalArgumentException(AnonymousClass000.A0P("Can not handle managed/back reference '", str, "': value deserializer is of type ContainerDeserializerBase, but content type is not handled by a BeanDeserializer ", " (instead it's of type ", name, ")"));
                            }
                            Map map2 = ((BeanDeserializerBase) A0L).A0C;
                            if (map2 == null) {
                                bzt2 = null;
                            } else {
                                bzt2 = (C27176Bzt) map2.get(str);
                            }
                            z2 = true;
                            if (bzt3 == null) {
                                C0L c0l = this.A07;
                                C0L AZA = bzt3.AZA();
                                if (AZA.A00.isAssignableFrom(c0l.A00)) {
                                    c0z = new C0Z(c0z, str, bzt3, this.A0I, z2);
                                } else {
                                    throw new IllegalArgumentException(AnonymousClass000.A0Q("Can not handle managed/back reference '", str, "': back reference type (", AZA.A00.getName(), ") not compatible with managed type (", c0l.A00.getName(), ")"));
                                }
                            } else {
                                throw new IllegalArgumentException("Can not handle managed/back reference '" + str + "': no back reference property found from type " + c0z.AZA());
                            }
                        } else if (jsonDeserializer3 instanceof AbstractDeserializer) {
                            map = ((AbstractDeserializer) jsonDeserializer3).A02;
                        } else {
                            throw new IllegalArgumentException(AnonymousClass000.A0N("Can not handle managed/back reference '", str, "': type for value deserializer is not BeanDeserializer or ContainerDeserializerBase, but ", jsonDeserializer3.getClass().getName()));
                        }
                        if (map == null) {
                            bzt3 = null;
                        } else {
                            bzt3 = (C27176Bzt) map.get(str);
                        }
                        z2 = false;
                        if (bzt3 == null) {
                        }
                    }
                    C27200C1k APy = c0z.APy();
                    if (!(APy == null || (A0D2 = byY2.A00.A01().A0D(APy)) == null)) {
                        jsonDeserializer = c0z.A01;
                        if (jsonDeserializer == C27176Bzt.A0B) {
                            jsonDeserializer = null;
                        }
                        A042 = jsonDeserializer.A04(A0D2);
                        if (!(A042 == jsonDeserializer || A042 == null)) {
                            bzt = c0z.A02(A042);
                            if (bzt != null) {
                                if (c1x == null) {
                                    c1x = new C1X();
                                }
                                c1x.A00.add(bzt);
                            } else {
                                JsonDeserializer jsonDeserializer4 = c0z.A01;
                                if (jsonDeserializer4 == C27176Bzt.A0B) {
                                    jsonDeserializer4 = null;
                                }
                                if ((jsonDeserializer4 instanceof BeanDeserializerBase) && !((BeanDeserializerBase) jsonDeserializer4).A08.A0K() && (A002 = C26691Bpp.A00(cls)) != null && A002 == this.A07.A00) {
                                    Constructor[] constructors = (cls = c0z.AZA().A00).getConstructors();
                                    int length = constructors.length;
                                    int i = 0;
                                    while (true) {
                                        if (i >= length) {
                                            break;
                                        }
                                        Constructor constructor = constructors[i];
                                        Class[] parameterTypes = constructor.getParameterTypes();
                                        if (parameterTypes.length == 1 && parameterTypes[0] == A002) {
                                            if (byY2.A00.A05(C1A.CAN_OVERRIDE_ACCESS_MODIFIERS)) {
                                                C26691Bpp.A07(constructor);
                                            }
                                            c0z = new C0R(c0z, constructor);
                                        } else {
                                            i++;
                                        }
                                    }
                                }
                                if (c0z != bzt5) {
                                    this.A09.A03(c0z);
                                }
                                C27106By5 by52 = c0z.A06;
                                boolean z4 = false;
                                if (by52 != null) {
                                    z4 = true;
                                }
                                if (z4 && by52.A02() == C2C.EXTERNAL_PROPERTY) {
                                    if (c1t == null) {
                                        c1t = new C1T();
                                    }
                                    c1t.A00(c0z, by52);
                                    C0G c0g = this.A09;
                                    String str2 = c0z.A07;
                                    int hashCode = str2.hashCode();
                                    C27210C2b[] c2bArr = c0g.A02;
                                    int length2 = hashCode & (c2bArr.length - 1);
                                    C27210C2b c2b = null;
                                    boolean z5 = false;
                                    for (C27210C2b c2b2 = c2bArr[length2]; c2b2 != null; c2b2 = c2b2.A02) {
                                        if (z5 || !c2b2.A03.equals(str2)) {
                                            c2b = new C27210C2b(c2b, c2b2.A03, c2b2.A01, c2b2.A00);
                                        } else {
                                            z5 = true;
                                        }
                                    }
                                    if (z5) {
                                        c2bArr[length2] = c2b;
                                    } else {
                                        throw new NoSuchElementException("No entry '" + c0z + "' found, can't remove");
                                    }
                                }
                            }
                        }
                    }
                    bzt = null;
                    if (bzt != null) {
                    }
                }
            }
            c0z = bzt5.A02(AAK);
            str = c0z.A03;
            if (str != null) {
            }
            C27200C1k APy2 = c0z.APy();
            jsonDeserializer = c0z.A01;
            if (jsonDeserializer == C27176Bzt.A0B) {
            }
            A042 = jsonDeserializer.A04(A0D2);
            bzt = c0z.A02(A042);
            if (bzt != null) {
            }
        }
        C0H c0h = this.A01;
        if (c0h != null) {
            boolean z6 = false;
            if (c0h.A00 != null) {
                z6 = true;
            }
            if (!z6) {
                this.A01 = new C0H(c0h.A01, c0h.A03, c0h.A02, byY2.A08(c0h.A02, c0h.A01));
            }
        }
        C27183C0d c0d2 = this.A08;
        if (c0d2.A0L()) {
            C0L A013 = c0d2.A01(byY2.A00);
            if (A013 != null) {
                this.A00 = byY2.A08(A013, new C2A((String) null, A013, (C2B) null, this.A0I, c0d2.A04(), false));
            } else {
                throw new IllegalArgumentException("Invalid delegate-creator definition for " + this.A07 + ": value instantiator (" + this.A08.getClass().getName() + ") returned true for 'canCreateUsingDelegate()', but null for 'getDelegateType()'");
            }
        }
        boolean z7 = true;
        if (c1t != null) {
            ArrayList arrayList = c1t.A00;
            this.A02 = new C27177Bzu((C27209C2a[]) arrayList.toArray(new C27209C2a[arrayList.size()]), c1t.A01);
            this.A05 = true;
        }
        this.A04 = c1x;
        if (c1x != null) {
            this.A05 = true;
        }
        if (!this.A06 || this.A05) {
            z7 = false;
        }
        this.A06 = z7;
    }

    public final Object A0S(C13080hr r4, C27123ByY byY) {
        switch (r4.A0X().intValue()) {
            case 3:
            case 4:
                JsonDeserializer jsonDeserializer = this.A00;
                if (jsonDeserializer != null) {
                    C27183C0d c0d = this.A08;
                    if (!c0d.A0F()) {
                        Object A092 = c0d.A09(byY, jsonDeserializer.A06(r4, byY));
                        if (this.A0F == null) {
                            return A092;
                        }
                        A0a(byY, A092);
                        return A092;
                    }
                }
                return this.A08.A06(byY, r4.A0R());
            default:
                JsonDeserializer jsonDeserializer2 = this.A00;
                if (jsonDeserializer2 != null) {
                    return this.A08.A09(byY, jsonDeserializer2.A06(r4, byY));
                }
                throw byY.A0C(this.A07.A00, "no suitable creator method found to deserialize from JSON floating-point number");
        }
    }

    public final void A0b(C27123ByY byY, Object obj, C13480ib r6) {
        r6.A0Q();
        C13080hr A0n = r6.A0n();
        while (A0n.A0p() != C13120hv.END_OBJECT) {
            String A0i = A0n.A0i();
            A0n.A0p();
            A0J(A0n, byY, obj, A0i);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x005d, code lost:
        if (r2.A0K() == false) goto L_0x005f;
     */
    public BeanDeserializerBase(C27175Bzn bzn, C0K c0k, C0G c0g, Map map, HashSet hashSet, boolean z, boolean z2) {
        super(c0k.A00);
        C2R[] c2rArr;
        boolean z3;
        C00 A042 = c0k.A04();
        if (A042.A02 == null) {
            C00.A02(A042);
        }
        this.A0I = A042.A02;
        this.A07 = c0k.A00;
        this.A08 = bzn.A02;
        this.A09 = c0g;
        this.A0C = map;
        this.A0B = hashSet;
        this.A0D = z;
        this.A01 = bzn.A01;
        List list = bzn.A07;
        Integer num = null;
        if (list == null || list.isEmpty()) {
            c2rArr = null;
        } else {
            c2rArr = (C2R[]) list.toArray(new C2R[list.size()]);
        }
        this.A0F = c2rArr;
        this.A0A = bzn.A03;
        boolean z4 = false;
        if (this.A04 == null) {
            C27183C0d c0d = this.A08;
            z3 = (!c0d.A0L() && !c0d.A0I()) ? false : z3;
        }
        z3 = true;
        this.A05 = z3;
        C27126Byj A012 = c0k.A01((C27126Byj) null);
        this.A0G = A012 != null ? A012.A00 : num;
        this.A0E = z2;
        if (!this.A05 && this.A0F == null && !z2 && this.A0A != null) {
            z4 = true;
        }
        this.A06 = z4;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    public BeanDeserializerBase(BeanDeserializerBase beanDeserializerBase, C27164Bzc bzc) {
        super(r1);
        C0L c0l = beanDeserializerBase.A07;
        this.A0I = beanDeserializerBase.A0I;
        this.A07 = c0l;
        this.A08 = beanDeserializerBase.A08;
        this.A00 = beanDeserializerBase.A00;
        this.A03 = beanDeserializerBase.A03;
        this.A0C = beanDeserializerBase.A0C;
        this.A0B = beanDeserializerBase.A0B;
        this.A0D = beanDeserializerBase.A0D;
        this.A01 = beanDeserializerBase.A01;
        this.A0F = beanDeserializerBase.A0F;
        this.A05 = beanDeserializerBase.A05;
        this.A04 = beanDeserializerBase.A04;
        this.A0E = beanDeserializerBase.A0E;
        this.A0G = beanDeserializerBase.A0G;
        this.A06 = beanDeserializerBase.A06;
        this.A0A = bzc;
        if (bzc == null) {
            this.A09 = beanDeserializerBase.A09;
            return;
        }
        this.A09 = beanDeserializerBase.A09.A01(new C27192C0r(bzc));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0025, code lost:
        if (r8.A0D != false) goto L_0x0027;
     */
    /* JADX WARNING: Illegal instructions before constructor call */
    public BeanDeserializerBase(BeanDeserializerBase beanDeserializerBase, C3P c3p) {
        super(r1);
        JsonDeserializer A042;
        JsonDeserializer A043;
        C0L c0l = beanDeserializerBase.A07;
        this.A0I = beanDeserializerBase.A0I;
        this.A07 = c0l;
        this.A08 = beanDeserializerBase.A08;
        this.A00 = beanDeserializerBase.A00;
        this.A03 = beanDeserializerBase.A03;
        this.A0C = beanDeserializerBase.A0C;
        this.A0B = beanDeserializerBase.A0B;
        boolean z = c3p == null ? false : z;
        z = true;
        this.A0D = z;
        this.A01 = beanDeserializerBase.A01;
        this.A0F = beanDeserializerBase.A0F;
        this.A0A = beanDeserializerBase.A0A;
        this.A05 = beanDeserializerBase.A05;
        C1X c1x = beanDeserializerBase.A04;
        if (c3p != null) {
            if (c1x != null) {
                ArrayList arrayList = new ArrayList(c1x.A00.size());
                for (C27176Bzt bzt : c1x.A00) {
                    C27176Bzt A032 = bzt.A03(c3p.A00(bzt.A07));
                    JsonDeserializer jsonDeserializer = A032.A01;
                    jsonDeserializer = jsonDeserializer == C27176Bzt.A0B ? null : jsonDeserializer;
                    if (!(jsonDeserializer == null || (A043 = jsonDeserializer.A04(c3p)) == jsonDeserializer)) {
                        A032 = A032.A02(A043);
                    }
                    arrayList.add(A032);
                }
                c1x = new C1X(arrayList);
            }
            C0G c0g = beanDeserializerBase.A09;
            if (!(c3p == null || c3p == C3P.A00)) {
                Iterator it = c0g.iterator();
                ArrayList arrayList2 = new ArrayList();
                while (it.hasNext()) {
                    C27176Bzt bzt2 = (C27176Bzt) it.next();
                    C27176Bzt A033 = bzt2.A03(c3p.A00(bzt2.A07));
                    JsonDeserializer jsonDeserializer2 = A033.A01;
                    jsonDeserializer2 = jsonDeserializer2 == C27176Bzt.A0B ? null : jsonDeserializer2;
                    if (!(jsonDeserializer2 == null || (A042 = jsonDeserializer2.A04(c3p)) == jsonDeserializer2)) {
                        A033 = A033.A02(A042);
                    }
                    arrayList2.add(A033);
                }
                c0g = new C0G(arrayList2);
            }
            this.A09 = c0g;
        } else {
            this.A09 = beanDeserializerBase.A09;
        }
        this.A04 = c1x;
        this.A0E = beanDeserializerBase.A0E;
        this.A0G = beanDeserializerBase.A0G;
        this.A06 = false;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    public BeanDeserializerBase(BeanDeserializerBase beanDeserializerBase, HashSet hashSet) {
        super(r1);
        C0L c0l = beanDeserializerBase.A07;
        this.A0I = beanDeserializerBase.A0I;
        this.A07 = c0l;
        this.A08 = beanDeserializerBase.A08;
        this.A00 = beanDeserializerBase.A00;
        this.A03 = beanDeserializerBase.A03;
        this.A0C = beanDeserializerBase.A0C;
        this.A0B = hashSet;
        this.A0D = beanDeserializerBase.A0D;
        this.A01 = beanDeserializerBase.A01;
        this.A0F = beanDeserializerBase.A0F;
        this.A05 = beanDeserializerBase.A05;
        this.A04 = beanDeserializerBase.A04;
        this.A0E = beanDeserializerBase.A0E;
        this.A0G = beanDeserializerBase.A0G;
        this.A06 = beanDeserializerBase.A06;
        this.A0A = beanDeserializerBase.A0A;
        this.A09 = beanDeserializerBase.A09;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    public BeanDeserializerBase(BeanDeserializerBase beanDeserializerBase, boolean z) {
        super(r1);
        C0L c0l = beanDeserializerBase.A07;
        this.A0I = beanDeserializerBase.A0I;
        this.A07 = c0l;
        this.A08 = beanDeserializerBase.A08;
        this.A00 = beanDeserializerBase.A00;
        this.A03 = beanDeserializerBase.A03;
        this.A09 = beanDeserializerBase.A09;
        this.A0C = beanDeserializerBase.A0C;
        this.A0B = beanDeserializerBase.A0B;
        this.A0D = z;
        this.A01 = beanDeserializerBase.A01;
        this.A0F = beanDeserializerBase.A0F;
        this.A0A = beanDeserializerBase.A0A;
        this.A05 = beanDeserializerBase.A05;
        this.A04 = beanDeserializerBase.A04;
        this.A0E = beanDeserializerBase.A0E;
        this.A0G = beanDeserializerBase.A0G;
        this.A06 = beanDeserializerBase.A06;
    }
}
