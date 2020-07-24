package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import java.util.HashSet;
import java.util.Map;
import p000X.C0L;
import p000X.C13080hr;
import p000X.C13120hv;
import p000X.C27105Bxz;
import p000X.C27106By5;
import p000X.C27108By9;
import p000X.C27123ByY;
import p000X.C27125Bya;
import p000X.C27146BzA;
import p000X.C27148BzD;
import p000X.C27160BzY;
import p000X.C27162Bza;
import p000X.C27179Bzx;
import p000X.C27183C0d;

@JacksonStdImpl
public final class MapDeserializer extends ContainerDeserializerBase implements C27105Bxz, C27108By9 {
    public JsonDeserializer A00;
    public C27162Bza A01;
    public HashSet A02;
    public boolean A03;
    public final C0L A04;
    public final JsonDeserializer A05;
    public final C27146BzA A06;
    public final C27183C0d A07;
    public final C27106By5 A08;
    public final boolean A09;

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0020, code lost:
        if (r5.getClass().getAnnotation(com.fasterxml.jackson.databind.annotation.JacksonStdImpl.class) == null) goto L_0x0022;
     */
    public final boolean A0O(C0L c0l, C27146BzA bzA) {
        C0L A042;
        boolean z;
        if (!(bzA == null || (A042 = c0l.A04()) == null)) {
            Class<Object> cls = A042.A00;
            if (cls != String.class && cls != Object.class) {
                return false;
            }
            if (bzA != null) {
                z = true;
            }
            z = false;
            return z;
        }
    }

    public final JsonDeserializer AAK(C27123ByY byY, C27148BzD bzD) {
        String[] A0u;
        HashSet hashSet;
        C27146BzA bzA = this.A06;
        if (bzA == null) {
            C0L A042 = this.A04.A04();
            bzA = byY.A01.A0E(byY, A042);
            if (bzA == null) {
                throw new C27125Bya("Can not find a (Map) Key deserializer for type " + A042);
            } else if (bzA instanceof C27108By9) {
                ((C27108By9) bzA).Bdl(byY);
            }
        }
        if (bzA instanceof C27160BzY) {
            bzA = ((C27160BzY) bzA).createContextual(byY, bzD);
        }
        JsonDeserializer A012 = StdDeserializer.A01(byY, bzD, this.A05);
        if (A012 == null) {
            A012 = byY.A08(this.A04.A03(), bzD);
        } else if (A012 instanceof C27105Bxz) {
            A012 = ((C27105Bxz) A012).AAK(byY, bzD);
        }
        C27106By5 by5 = this.A08;
        if (by5 != null) {
            by5 = by5.A03(bzD);
        }
        HashSet hashSet2 = this.A02;
        C27179Bzx A013 = byY.A00.A01();
        if (!(A013 == null || bzD == null || (A0u = A013.A0u(bzD.APy())) == null)) {
            if (hashSet2 != null) {
                hashSet = new HashSet(hashSet2);
            }
            hashSet2 = hashSet;
            for (String add : A0u) {
                hashSet2.add(add);
            }
        }
        if (this.A06 == bzA && this.A05 == A012 && this.A08 == by5 && this.A02 == hashSet2) {
            return this;
        }
        return new MapDeserializer(this, bzA, A012, by5, hashSet2);
    }

    public final void Bdl(C27123ByY byY) {
        C27183C0d c0d = this.A07;
        if (c0d.A0L()) {
            C0L A012 = c0d.A01(byY.A00);
            if (A012 != null) {
                this.A00 = byY.A08(A012, (C27148BzD) null);
            } else {
                throw new IllegalArgumentException("Invalid delegate-creator definition for " + this.A04 + ": value instantiator (" + this.A07.getClass().getName() + ") returned true for 'canCreateUsingDelegate()', but null for 'getDelegateType()'");
            }
        }
        C27183C0d c0d2 = this.A07;
        if (c0d2.A0I()) {
            this.A01 = C27162Bza.A00(byY, this.A07, c0d2.A0M(byY.A00));
        }
        this.A03 = A0O(this.A04, this.A06);
    }

    public final void A0M(C13080hr r8, C27123ByY byY, Map map) {
        Object A072;
        C13120hv A0g = r8.A0g();
        if (A0g == C13120hv.START_OBJECT) {
            A0g = r8.A0p();
        }
        C27146BzA bzA = this.A06;
        JsonDeserializer jsonDeserializer = this.A05;
        C27106By5 by5 = this.A08;
        while (A0g == C13120hv.FIELD_NAME) {
            String A0i = r8.A0i();
            Object A002 = bzA.A00(A0i, byY);
            C13120hv A0p = r8.A0p();
            HashSet hashSet = this.A02;
            if (hashSet == null || !hashSet.contains(A0i)) {
                if (A0p == C13120hv.VALUE_NULL) {
                    A072 = null;
                } else if (by5 == null) {
                    A072 = jsonDeserializer.A06(r8, byY);
                } else {
                    A072 = jsonDeserializer.A07(r8, byY, by5);
                }
                map.put(A002, A072);
            } else {
                r8.A0f();
            }
            A0g = r8.A0p();
        }
    }

    public final void A0N(C13080hr r6, C27123ByY byY, Map map) {
        Object A072;
        C13120hv A0g = r6.A0g();
        if (A0g == C13120hv.START_OBJECT) {
            A0g = r6.A0p();
        }
        JsonDeserializer jsonDeserializer = this.A05;
        C27106By5 by5 = this.A08;
        while (A0g == C13120hv.FIELD_NAME) {
            String A0i = r6.A0i();
            C13120hv A0p = r6.A0p();
            HashSet hashSet = this.A02;
            if (hashSet == null || !hashSet.contains(A0i)) {
                if (A0p == C13120hv.VALUE_NULL) {
                    A072 = null;
                } else if (by5 == null) {
                    A072 = jsonDeserializer.A06(r6, byY);
                } else {
                    A072 = jsonDeserializer.A07(r6, byY, by5);
                }
                map.put(A0i, A072);
            } else {
                r6.A0f();
            }
            A0g = r6.A0p();
        }
    }

    public MapDeserializer(C0L c0l, C27183C0d c0d, C27146BzA bzA, JsonDeserializer jsonDeserializer, C27106By5 by5) {
        super(Map.class);
        this.A04 = c0l;
        this.A06 = bzA;
        this.A05 = jsonDeserializer;
        this.A08 = by5;
        this.A07 = c0d;
        this.A09 = c0d.A0K();
        this.A00 = null;
        this.A01 = null;
        this.A03 = A0O(c0l, bzA);
    }

    public MapDeserializer(MapDeserializer mapDeserializer, C27146BzA bzA, JsonDeserializer jsonDeserializer, C27106By5 by5, HashSet hashSet) {
        super(mapDeserializer.A00);
        C0L c0l = mapDeserializer.A04;
        this.A04 = c0l;
        this.A06 = bzA;
        this.A05 = jsonDeserializer;
        this.A08 = by5;
        this.A07 = mapDeserializer.A07;
        this.A01 = mapDeserializer.A01;
        this.A00 = mapDeserializer.A00;
        this.A09 = mapDeserializer.A09;
        this.A02 = hashSet;
        this.A03 = A0O(c0l, bzA);
    }
}
