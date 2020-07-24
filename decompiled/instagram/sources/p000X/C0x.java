package p000X;

import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer;
import com.fasterxml.jackson.databind.deser.std.ArrayBlockingQueueDeserializer;
import com.fasterxml.jackson.databind.deser.std.CollectionDeserializer;
import com.fasterxml.jackson.databind.deser.std.EnumDeserializer;
import com.fasterxml.jackson.databind.deser.std.EnumMapDeserializer;
import com.fasterxml.jackson.databind.deser.std.EnumSetDeserializer;
import com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer;
import com.fasterxml.jackson.databind.deser.std.MapDeserializer;
import com.fasterxml.jackson.databind.deser.std.ObjectArrayDeserializer;
import com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers;
import com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer;
import com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.concurrent.ArrayBlockingQueue;

/* renamed from: X.C0x */
public abstract class C0x {
    public static final C1G[] A00 = new C1G[0];

    public C0L A05(C27190C0p c0p, C0L c0l) {
        C30758DjE[] djEArr = ((C27170Bzi) this).A00.A00;
        boolean z = false;
        if (djEArr.length > 0) {
            z = true;
        }
        if (z) {
            Iterator it = new C27154BzL(djEArr).iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
        return c0l;
    }

    public JsonDeserializer A06(C27190C0p c0p, C0L c0l, C0K c0k) {
        JsonDeserializer jsonDeserializer;
        Class<C64342rK> cls = c0l.A00;
        Iterator it = new C27154BzL(((C27170Bzi) this).A00.A02).iterator();
        while (true) {
            if (!it.hasNext()) {
                jsonDeserializer = null;
                break;
            }
            jsonDeserializer = ((C1G) it.next()).AEO(cls, c0p, c0k);
            if (jsonDeserializer != null) {
                break;
            }
        }
        return jsonDeserializer == null ? cls == C26690Bpo.class ? JsonNodeDeserializer.ObjectDeserializer.A00 : cls == C64342rK.class ? JsonNodeDeserializer.ArrayDeserializer.A00 : JsonNodeDeserializer.A00 : jsonDeserializer;
    }

    public JsonDeserializer A07(C27123ByY byY, C0L c0l, C0K c0k) {
        Class cls;
        C27170Bzi bzi = (C27170Bzi) this;
        C27190C0p c0p = byY.A00;
        Class cls2 = c0l.A00;
        JsonDeserializer A0I = bzi.A0I(cls2, c0p, c0k);
        if (A0I == null) {
            Iterator it = c0k.A0M().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C0F c0f = (C0F) it.next();
                if (byY.A00.A01().A0n(c0f)) {
                    if (c0f.A0T().length != 1 || !c0f.A01.getReturnType().isAssignableFrom(cls2)) {
                        throw new IllegalArgumentException("Unsuitable method (" + c0f + ") decorated with @JsonCreator (for Enum type " + cls2.getName() + ")");
                    }
                    Class<Long> A0R = c0f.A0R();
                    if (A0R == String.class) {
                        cls = null;
                    } else if (A0R == Integer.TYPE || A0R == Integer.class) {
                        cls = Integer.class;
                    } else if (A0R == Long.TYPE || A0R == Long.class) {
                        cls = Long.class;
                    } else {
                        throw new IllegalArgumentException("Parameter #0 type for factory method (" + c0f + ") not suitable, must be java.lang.String or int/Integer/long/Long");
                    }
                    if (c0p.A05(C1A.CAN_OVERRIDE_ACCESS_MODIFIERS)) {
                        C26691Bpp.A07(c0f.A01);
                    }
                    A0I = new EnumDeserializer.FactoryBasedDeserializer(cls2, c0f, cls);
                }
            }
            if (A0I == null) {
                A0I = new EnumDeserializer(C27170Bzi.A04(cls2, c0p, c0k.A08()));
            }
        }
        C1R c1r = bzi.A00;
        if (c1r.A00()) {
            Iterator it2 = new C27154BzL(c1r.A01).iterator();
            while (it2.hasNext()) {
                it2.next();
            }
        }
        return A0I;
    }

    public JsonDeserializer A08(C27123ByY byY, C0L c0l, C0K c0k, Class cls) {
        C27169Bzh bzh = (C27169Bzh) this;
        C0L A03 = byY.A00.A03(cls);
        C27190C0p c0p = byY.A00;
        C0K A032 = c0p.A00.A02.A03(c0p, A03, c0p);
        C27183C0d A0K = bzh.A0K(byY, A032);
        C27190C0p c0p2 = byY.A00;
        C27190C0p c0p3 = c0p2;
        C27175Bzn bzn = new C27175Bzn(A032, c0p2);
        bzn.A02 = A0K;
        bzh.A0M(byY, A032, bzn);
        C27169Bzh.A01(byY, A032, bzn);
        bzh.A0N(byY, A032, bzn);
        C27169Bzh.A00(byY, A032, bzn);
        C31 A033 = A032.A03();
        String str = A033 == null ? "build" : A033.A00;
        C0F A09 = A032.A09(str, (Class[]) null);
        if (A09 != null && c0p3.A05(C1A.CAN_OVERRIDE_ACCESS_MODIFIERS)) {
            C26691Bpp.A07(A09.A01);
        }
        bzn.A04 = A09;
        bzn.A00 = A033;
        C1R c1r = bzh.A00;
        if (c1r.A00()) {
            Iterator it = new C27154BzL(c1r.A01).iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
        C0F c0f = bzn.A04;
        if (c0f != null) {
            Class<?> returnType = c0f.A01.getReturnType();
            C0L c0l2 = c0l;
            if (c0l2.A00.isAssignableFrom(returnType)) {
                Collection values = bzn.A0A.values();
                C0G c0g = new C0G(values);
                c0g.A02();
                boolean z = !bzn.A0B;
                if (!z) {
                    Iterator it2 = values.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        boolean z2 = false;
                        if (((C27176Bzt) it2.next()).A02 != null) {
                            z2 = true;
                            continue;
                        }
                        if (z2) {
                            z = true;
                            break;
                        }
                    }
                }
                C27164Bzc bzc = bzn.A03;
                if (bzc != null) {
                    c0g = c0g.A01(new C27192C0r(bzc));
                }
                BuilderBasedDeserializer builderBasedDeserializer = new BuilderBasedDeserializer(bzn, bzn.A09, c0g, bzn.A05, bzn.A06, bzn.A08, z);
                C1R c1r2 = bzh.A00;
                if (c1r2.A00()) {
                    Iterator it3 = new C27154BzL(c1r2.A01).iterator();
                    while (it3.hasNext()) {
                        it3.next();
                    }
                }
                return builderBasedDeserializer;
            }
            throw new IllegalArgumentException(AnonymousClass000.A0Q("Build method '", bzn.A04.A0S(), " has bad return type (", returnType.getName(), "), not compatible with POJO type (", c0l2.A00.getName(), ")"));
        }
        throw new IllegalArgumentException(AnonymousClass000.A0O("Builder class ", bzn.A09.A00.A00.getName(), " does not have build method '", str, "()'"));
    }

    public JsonDeserializer A09(C27123ByY byY, C0b c0b, C0K c0k) {
        JsonDeserializer jsonDeserializer;
        C27170Bzi bzi = (C27170Bzi) this;
        C27190C0p c0p = byY.A00;
        C0L A03 = c0b.A03();
        JsonDeserializer jsonDeserializer2 = (JsonDeserializer) A03.A0G();
        C27106By5 by5 = (C27106By5) A03.A0F();
        if (by5 == null) {
            by5 = bzi.A0F(c0p, A03);
        }
        Iterator it = new C27154BzL(bzi.A00.A02).iterator();
        while (true) {
            if (!it.hasNext()) {
                jsonDeserializer = null;
                break;
            }
            jsonDeserializer = ((C1G) it.next()).AE9(c0b, c0p, c0k, by5, jsonDeserializer2);
            if (jsonDeserializer != null) {
                break;
            }
        }
        if (jsonDeserializer == null) {
            if (jsonDeserializer2 == null) {
                Class<String> cls = A03.A00;
                if (cls.isPrimitive()) {
                    if (cls == Integer.TYPE) {
                        return PrimitiveArrayDeserializers.IntDeser.A00;
                    }
                    if (cls == Long.TYPE) {
                        return PrimitiveArrayDeserializers.LongDeser.A00;
                    }
                    if (cls == Byte.TYPE) {
                        return new PrimitiveArrayDeserializers.ByteDeser();
                    }
                    if (cls == Short.TYPE) {
                        return new PrimitiveArrayDeserializers.ShortDeser();
                    }
                    if (cls == Float.TYPE) {
                        return new PrimitiveArrayDeserializers.FloatDeser();
                    }
                    if (cls == Double.TYPE) {
                        return new PrimitiveArrayDeserializers.DoubleDeser();
                    }
                    if (cls == Boolean.TYPE) {
                        return new PrimitiveArrayDeserializers.BooleanDeser();
                    }
                    if (cls == Character.TYPE) {
                        return new PrimitiveArrayDeserializers.CharDeser();
                    }
                    throw new IllegalStateException();
                } else if (cls == String.class) {
                    return StringArrayDeserializer.A01;
                }
            }
            jsonDeserializer = new ObjectArrayDeserializer(c0b, jsonDeserializer2, by5);
        }
        C1R c1r = bzi.A00;
        if (!c1r.A00()) {
            return jsonDeserializer;
        }
        Iterator it2 = new C27154BzL(c1r.A01).iterator();
        while (it2.hasNext()) {
            it2.next();
        }
        return jsonDeserializer;
    }

    public JsonDeserializer A0A(C27123ByY byY, C27193C0t c0t, C0K c0k) {
        JsonDeserializer jsonDeserializer;
        C27170Bzi bzi = (C27170Bzi) this;
        C27193C0t c0t2 = c0t;
        C0L A03 = c0t.A03();
        JsonDeserializer jsonDeserializer2 = (JsonDeserializer) A03.A0G();
        C27190C0p c0p = byY.A00;
        C27106By5 by5 = (C27106By5) A03.A0F();
        if (by5 == null) {
            by5 = bzi.A0F(c0p, A03);
        }
        Iterator it = new C27154BzL(bzi.A00.A02).iterator();
        while (true) {
            if (!it.hasNext()) {
                jsonDeserializer = null;
                break;
            }
            jsonDeserializer = ((C1G) it.next()).AED(c0t2, c0p, c0k, by5, jsonDeserializer2);
            if (jsonDeserializer != null) {
                break;
            }
        }
        if (jsonDeserializer != null) {
            C1R c1r = bzi.A00;
            if (c1r.A00()) {
                Iterator it2 = new C27154BzL(c1r.A01).iterator();
                while (it2.hasNext()) {
                    it2.next();
                }
            }
        }
        return jsonDeserializer;
    }

    public JsonDeserializer A0B(C27123ByY byY, C1B c1b, C0K c0k) {
        JsonDeserializer jsonDeserializer;
        C1B c1b2;
        C0K c0k2 = c0k;
        C27170Bzi bzi = (C27170Bzi) this;
        C1B c1b3 = c1b;
        C0L A03 = c1b3.A03();
        JsonDeserializer jsonDeserializer2 = (JsonDeserializer) A03.A0G();
        C27123ByY byY2 = byY;
        C27190C0p c0p = byY2.A00;
        C27106By5 by5 = (C27106By5) A03.A0F();
        if (by5 == null) {
            by5 = bzi.A0F(c0p, A03);
        }
        Iterator it = new C27154BzL(bzi.A00.A02).iterator();
        while (true) {
            if (!it.hasNext()) {
                jsonDeserializer = null;
                break;
            }
            jsonDeserializer = ((C1G) it.next()).AEC(c1b3, c0p, c0k2, by5, jsonDeserializer2);
            if (jsonDeserializer != null) {
                break;
            }
        }
        if (jsonDeserializer == null) {
            Class cls = c1b3.A00;
            if (jsonDeserializer2 == null && EnumSet.class.isAssignableFrom(cls)) {
                jsonDeserializer = new EnumSetDeserializer(A03, (JsonDeserializer) null);
            }
        }
        if (jsonDeserializer == null) {
            if (c1b3.A00.isInterface() || c1b3.A0K()) {
                Class cls2 = (Class) C27170Bzi.A05.get(c1b3.A00.getName());
                c1b2 = cls2 == null ? null : (C1B) c0p.A00.A04.A03(c1b3, cls2);
                if (c1b2 != null) {
                    c0k2 = c0p.A00.A02.A01(c0p, c1b2, c0p);
                } else {
                    throw new IllegalArgumentException("Can not find a deserializer for non-concrete Collection type " + c1b3);
                }
            } else {
                c1b2 = c1b3;
            }
            C27183C0d A0K = bzi.A0K(byY2, c0k2);
            if (!A0K.A0K() && c1b2.A00 == ArrayBlockingQueue.class) {
                return new ArrayBlockingQueueDeserializer(c1b2, jsonDeserializer2, by5, A0K, (JsonDeserializer) null);
            }
            jsonDeserializer = A03.A00 == String.class ? new StringCollectionDeserializer(c1b2, A0K, (JsonDeserializer) null, jsonDeserializer2) : new CollectionDeserializer(c1b2, jsonDeserializer2, by5, A0K, (JsonDeserializer) null);
        }
        C1R c1r = bzi.A00;
        if (!c1r.A00()) {
            return jsonDeserializer;
        }
        Iterator it2 = new C27154BzL(c1r.A01).iterator();
        while (it2.hasNext()) {
            it2.next();
        }
        return jsonDeserializer;
    }

    public JsonDeserializer A0C(C27123ByY byY, C27188C0m c0m, C0K c0k) {
        JsonDeserializer jsonDeserializer;
        C27170Bzi bzi = (C27170Bzi) this;
        C27188C0m c0m2 = c0m;
        C0L A04 = c0m.A04();
        C0L A03 = c0m.A03();
        C27190C0p c0p = byY.A00;
        JsonDeserializer jsonDeserializer2 = (JsonDeserializer) A03.A0G();
        C27146BzA bzA = (C27146BzA) A04.A0G();
        C27106By5 by5 = (C27106By5) A03.A0F();
        if (by5 == null) {
            by5 = bzi.A0F(c0p, A03);
        }
        Iterator it = new C27154BzL(bzi.A00.A02).iterator();
        while (true) {
            if (!it.hasNext()) {
                jsonDeserializer = null;
                break;
            }
            jsonDeserializer = ((C1G) it.next()).AEJ(c0m2, c0p, c0k, bzA, by5, jsonDeserializer2);
            if (jsonDeserializer != null) {
                break;
            }
        }
        if (jsonDeserializer != null) {
            C1R c1r = bzi.A00;
            if (c1r.A00()) {
                Iterator it2 = new C27154BzL(c1r.A01).iterator();
                while (it2.hasNext()) {
                    it2.next();
                }
            }
        }
        return jsonDeserializer;
    }

    /* JADX WARNING: Failed to insert additional move for type inference */
    public JsonDeserializer A0D(C27123ByY byY, C11 c11, C0K c0k) {
        EnumMapDeserializer enumMapDeserializer;
        C0K c0k2 = c0k;
        C27170Bzi bzi = (C27170Bzi) this;
        C11 c112 = c11;
        C11 c113 = c112;
        C27123ByY byY2 = byY;
        C27190C0p c0p = byY2.A00;
        C0L A04 = c112.A04();
        C0L A03 = c112.A03();
        JsonDeserializer jsonDeserializer = (JsonDeserializer) A03.A0G();
        C27146BzA bzA = (C27146BzA) A04.A0G();
        C27106By5 by5 = (C27106By5) A03.A0F();
        if (by5 == null) {
            by5 = bzi.A0F(c0p, A03);
        }
        Iterator it = new C27154BzL(bzi.A00.A02).iterator();
        while (true) {
            if (!it.hasNext()) {
                enumMapDeserializer = null;
                break;
            }
            JsonDeserializer AEI = ((C1G) it.next()).AEI(c112, c0p, c0k2, bzA, by5, jsonDeserializer);
            if (AEI != null) {
                enumMapDeserializer = AEI;
                break;
            }
        }
        if (enumMapDeserializer == null) {
            Class cls = c112.A00;
            if (EnumMap.class.isAssignableFrom(cls)) {
                Class cls2 = A04.A00;
                if (cls2 == null || !cls2.isEnum()) {
                    throw new IllegalArgumentException("Can not construct EnumMap; generic (key) type not available");
                }
                enumMapDeserializer = new EnumMapDeserializer(c112, (JsonDeserializer) null, jsonDeserializer, by5);
            }
            if (enumMapDeserializer == null) {
                if (c112.A00.isInterface() || c112.A0K()) {
                    Class cls3 = (Class) C27170Bzi.A06.get(cls.getName());
                    if (cls3 != null) {
                        c113 = (C11) c0p.A00.A04.A03(c112, cls3);
                        c0k2 = c0p.A00.A02.A01(c0p, c113, c0p);
                    } else {
                        throw new IllegalArgumentException("Can not find a deserializer for non-concrete Map type " + c112);
                    }
                }
                MapDeserializer mapDeserializer = new MapDeserializer((C0L) c113, bzi.A0K(byY2, c0k2), bzA, jsonDeserializer, by5);
                String[] A0u = c0p.A01().A0u(c0k2.A04());
                mapDeserializer.A02 = (A0u == null || A0u.length == 0) ? null : C27115ByP.A00(A0u);
                enumMapDeserializer = mapDeserializer;
            }
        }
        C1R c1r = bzi.A00;
        if (c1r.A00()) {
            Iterator it2 = new C27154BzL(c1r.A01).iterator();
            while (it2.hasNext()) {
                it2.next();
            }
        }
        return enumMapDeserializer;
    }

    /* JADX WARNING: Removed duplicated region for block: B:6:0x0028 A[LOOP:0: B:6:0x0028->B:9:0x0038, LOOP_START, PHI: r2 
      PHI: (r2v13 X.BzA) = (r2v0 X.BzA), (r2v14 X.BzA) binds: [B:5:0x0011, B:9:0x0038] A[DONT_GENERATE, DONT_INLINE]] */
    public C27146BzA A0E(C27123ByY byY, C0L c0l) {
        C27170Bzi bzi = (C27170Bzi) this;
        C27190C0p c0p = byY.A00;
        boolean z = false;
        if (bzi.A00.A03.length > 0) {
            z = true;
        }
        C27146BzA bzA = null;
        if (z) {
            C0K A02 = c0p.A02(c0p.A03(c0l.A00));
            Iterator it = new C27154BzL(bzi.A00.A03).iterator();
            while (it.hasNext() && (bzA = ((C27145Bz9) it.next()).AEH(c0l, c0p, A02)) == null) {
                while (it.hasNext() && (bzA = ((C27145Bz9) it.next()).AEH(c0l, c0p, A02)) == null) {
                }
            }
        }
        if (bzA == null) {
            if (c0l.A00.isEnum()) {
                C27190C0p c0p2 = byY.A00;
                C0K A022 = c0p2.A00.A02.A02(c0p2, c0l, c0p2);
                JsonDeserializer A03 = C27170Bzi.A03(byY, A022.A04());
                if (A03 == null) {
                    Class cls = c0l.A00;
                    if (bzi.A0I(cls, c0p2, A022) == null) {
                        C27121ByW A04 = C27170Bzi.A04(cls, c0p2, A022.A08());
                        for (C0F c0f : A022.A0M()) {
                            if (c0p2.A01().A0n(c0f)) {
                                if (c0f.A0T().length != 1 || !c0f.A01.getReturnType().isAssignableFrom(cls)) {
                                    throw new IllegalArgumentException("Unsuitable method (" + c0f + ") decorated with @JsonCreator (for Enum type " + cls.getName() + ")");
                                } else if (c0f.A0P(0) == String.class) {
                                    if (c0p2.A05(C1A.CAN_OVERRIDE_ACCESS_MODIFIERS)) {
                                        C26691Bpp.A07(c0f.A01);
                                    }
                                    return new C27131Byu(A04, c0f);
                                } else {
                                    throw new IllegalArgumentException("Parameter #0 type for factory method (" + c0f + ") not suitable, must be java.lang.String");
                                }
                            }
                        }
                        return new C27131Byu(A04, (C0F) null);
                    }
                }
                return new C27133Byw(c0l.A00, A03);
            }
            C0K A023 = c0p.A00.A02.A02(c0p, c0l, c0p);
            Class<String> cls2 = String.class;
            Constructor A0I = A023.A0I(cls2);
            if (A0I != null) {
                if (c0p.A05(C1A.CAN_OVERRIDE_ACCESS_MODIFIERS)) {
                    C26691Bpp.A07(A0I);
                }
                bzA = new C2J(A0I);
            } else {
                Method A0J = A023.A0J(cls2);
                if (A0J != null) {
                    if (c0p.A05(C1A.CAN_OVERRIDE_ACCESS_MODIFIERS)) {
                        C26691Bpp.A07(A0J);
                    }
                    bzA = new C2I(A0J);
                } else {
                    bzA = null;
                }
            }
        }
        if (bzA == null) {
            return bzA;
        }
        C1R c1r = bzi.A00;
        if (!c1r.A00()) {
            return bzA;
        }
        Iterator it2 = new C27154BzL(c1r.A01).iterator();
        while (it2.hasNext()) {
            it2.next();
        }
        return bzA;
    }

    public C27106By5 A0F(C27190C0p c0p, C0L c0l) {
        C0L A05;
        Class cls;
        C27170Bzi bzi = (C27170Bzi) this;
        C00 A04 = c0p.A02(c0p.A03(c0l.A00)).A04();
        C27179Bzx A01 = c0p.A01();
        C1e A0A = A01.A0A(c0p, A04, c0l);
        if (A0A == null) {
            return null;
        }
        Collection A002 = c0p.A00.A00(A04, c0p, A01);
        if (A0A.AJz() == null && c0l.A0K() && (A05 = bzi.A05(c0p, c0l)) != null && (cls = A05.A00) != c0l.A00) {
            A0A.ABY(cls);
        }
        return A0A.A75(c0p, c0l, A002);
    }

    public abstract JsonDeserializer A0G(C27123ByY byY, C0L c0l, C0K c0k);
}
