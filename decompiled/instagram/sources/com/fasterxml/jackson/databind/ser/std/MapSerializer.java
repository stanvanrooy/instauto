package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.ser.ContainerSerializer;
import java.util.HashSet;
import java.util.Map;
import p000X.C06;
import p000X.C0L;
import p000X.C0w;
import p000X.C13460iZ;
import p000X.C15;
import p000X.C27148BzD;
import p000X.C27179Bzx;
import p000X.C27200C1k;
import p000X.C27204C1t;
import p000X.C27207C1y;
import p000X.C27217C2o;
import p000X.C27221C2x;
import p000X.C35;
import p000X.C3b;

@JacksonStdImpl
public final class MapSerializer extends ContainerSerializer implements C35 {
    public static final C0L A09 = new C0w(Object.class);
    public JsonSerializer A00;
    public JsonSerializer A01;
    public C27207C1y A02;
    public final C27148BzD A03;
    public final C0L A04;
    public final C27204C1t A05;
    public final HashSet A06;
    public final C0L A07;
    public final boolean A08;

    public final JsonSerializer AAL(C06 c06, C27148BzD bzD) {
        JsonSerializer jsonSerializer;
        String[] A0u;
        C27200C1k APy;
        JsonSerializer jsonSerializer2 = null;
        C27148BzD bzD2 = bzD;
        if (bzD == null || (APy = bzD.APy()) == null) {
            jsonSerializer = null;
        } else {
            C27179Bzx A012 = c06.A05.A01();
            Object A0X = A012.A0X(APy);
            if (A0X != null) {
                jsonSerializer = c06.A08(APy, A0X);
            } else {
                jsonSerializer = null;
            }
            Object A0T = A012.A0T(APy);
            if (A0T != null) {
                jsonSerializer2 = c06.A08(APy, A0T);
            }
        }
        if (jsonSerializer2 == null) {
            jsonSerializer2 = this.A01;
        }
        JsonSerializer A013 = StdSerializer.A01(c06, bzD, jsonSerializer2);
        if (A013 == null) {
            if ((this.A08 && this.A04.A00 != Object.class) || ContainerSerializer.A05(c06, bzD)) {
                A013 = c06.A07(this.A04, bzD);
            }
        } else if (A013 instanceof C35) {
            A013 = ((C35) A013).AAL(c06, bzD);
        }
        if (jsonSerializer == null) {
            jsonSerializer = this.A00;
        }
        if (jsonSerializer == null) {
            jsonSerializer = c06.A07.A02(c06.A05, this.A07, c06.A00);
            if (jsonSerializer instanceof C3b) {
                ((C3b) jsonSerializer).Bdm(c06);
            }
        }
        if (jsonSerializer instanceof C35) {
            jsonSerializer = ((C35) jsonSerializer).AAL(c06, bzD);
        }
        HashSet hashSet = this.A06;
        C27179Bzx A014 = c06.A05.A01();
        if (!(A014 == null || bzD == null || (A0u = A014.A0u(bzD.APy())) == null)) {
            if (hashSet == null) {
                hashSet = new HashSet();
            } else {
                hashSet = new HashSet(hashSet);
            }
            for (String add : A0u) {
                hashSet.add(add);
            }
        }
        return new MapSerializer(this, bzD2, jsonSerializer, A013, hashSet);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002a, code lost:
        if (java.lang.reflect.Modifier.isFinal(r5.A00.getModifiers()) == false) goto L_0x002c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003c, code lost:
        if (r5.A00 != java.lang.Object.class) goto L_0x002d;
     */
    public static MapSerializer A00(String[] strArr, C0L c0l, boolean z, C27204C1t c1t, JsonSerializer jsonSerializer, JsonSerializer jsonSerializer2) {
        HashSet hashSet;
        C0L A042;
        C0L A032;
        boolean z2;
        int length;
        if (strArr == null || (length = strArr.length) == 0) {
            hashSet = null;
        } else {
            hashSet = new HashSet(length);
            for (String add : strArr) {
                hashSet.add(add);
            }
        }
        if (c0l == null) {
            A042 = A09;
            A032 = A042;
        } else {
            A042 = c0l.A04();
            A032 = c0l.A03();
        }
        if (!z) {
            if (A032 != null) {
                z = true;
            }
            z = false;
        } else {
            z2 = false;
        }
        z2 = z;
        return new MapSerializer(hashSet, A042, A032, z2, c1t, jsonSerializer, jsonSerializer2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00ed, code lost:
        if (r3 != r0) goto L_0x00ef;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0107, code lost:
        if (r3 != r0) goto L_0x00ef;
     */
    public final void A0F(Map map, C13460iZ r14, C06 c06) {
        C27221C2x c2x;
        C27207C1y c1y;
        if (this.A05 != null) {
            JsonSerializer jsonSerializer = this.A00;
            HashSet hashSet = this.A06;
            boolean z = !c06.A05.A06(C15.WRITE_NULL_MAP_VALUES);
            Class<?> cls = null;
            JsonSerializer jsonSerializer2 = null;
            for (Map.Entry entry : map.entrySet()) {
                Object value = entry.getValue();
                Object key = entry.getKey();
                if (key == null) {
                    c06.A01.A0B((Object) null, r14, c06);
                } else if ((!z || value != null) && (hashSet == null || !hashSet.contains(key))) {
                    jsonSerializer.A0B(key, r14, c06);
                }
                if (value == null) {
                    c06.A0D(r14);
                } else {
                    Class<?> cls2 = value.getClass();
                    if (cls2 != cls) {
                        C0L c0l = this.A04;
                        if (c0l.A0J()) {
                            jsonSerializer2 = c06.A07(c06.A03(c0l, cls2), this.A03);
                        } else {
                            jsonSerializer2 = c06.A0A(cls2, this.A03);
                        }
                        cls = cls2;
                    }
                    try {
                        jsonSerializer2.A08(value, r14, c06, this.A05);
                    } catch (Exception e) {
                        StdSerializer.A03(c06, e, map, "" + key);
                    }
                }
            }
            return;
        }
        JsonSerializer jsonSerializer3 = this.A00;
        HashSet hashSet2 = this.A06;
        boolean z2 = !c06.A05.A06(C15.WRITE_NULL_MAP_VALUES);
        C27207C1y c1y2 = this.A02;
        for (Map.Entry entry2 : map.entrySet()) {
            Object value2 = entry2.getValue();
            Object key2 = entry2.getKey();
            if (key2 == null) {
                c06.A01.A0B((Object) null, r14, c06);
            } else if ((!z2 || value2 != null) && (hashSet2 == null || !hashSet2.contains(key2))) {
                jsonSerializer3.A0B(key2, r14, c06);
            }
            if (value2 == null) {
                c06.A0D(r14);
            } else {
                Class<?> cls3 = value2.getClass();
                JsonSerializer A002 = c1y2.A00(cls3);
                if (A002 == null) {
                    C0L c0l2 = this.A04;
                    if (c0l2.A0J()) {
                        C0L A032 = c06.A03(c0l2, cls3);
                        JsonSerializer A072 = c06.A07(A032, this.A03);
                        c2x = new C27221C2x(A072, c1y2.A01(A032.A00, A072));
                        c1y = c2x.A01;
                    } else {
                        JsonSerializer A0A = c06.A0A(cls3, this.A03);
                        c2x = new C27221C2x(A0A, c1y2.A01(cls3, A0A));
                        c1y = c2x.A01;
                    }
                    this.A02 = c1y;
                    A002 = c2x.A00;
                    c1y2 = this.A02;
                }
                try {
                    A002.A0B(value2, r14, c06);
                } catch (Exception e2) {
                    StdSerializer.A03(c06, e2, map, "" + key2);
                }
            }
        }
    }

    public final void A0G(Map map, C13460iZ r11, C06 c06, JsonSerializer jsonSerializer) {
        JsonSerializer jsonSerializer2 = this.A00;
        HashSet hashSet = this.A06;
        C27204C1t c1t = this.A05;
        boolean z = !c06.A05.A06(C15.WRITE_NULL_MAP_VALUES);
        for (Map.Entry entry : map.entrySet()) {
            Object value = entry.getValue();
            Object key = entry.getKey();
            if (key == null) {
                c06.A01.A0B((Object) null, r11, c06);
            } else if ((!z || value != null) && (hashSet == null || !hashSet.contains(key))) {
                jsonSerializer2.A0B(key, r11, c06);
            }
            if (value == null) {
                c06.A0D(r11);
            } else if (c1t == null) {
                try {
                    jsonSerializer.A0B(value, r11, c06);
                } catch (Exception e) {
                    StdSerializer.A03(c06, e, map, "" + key);
                }
            } else {
                jsonSerializer.A08(value, r11, c06, c1t);
            }
        }
    }

    public MapSerializer(MapSerializer mapSerializer, C27148BzD bzD, JsonSerializer jsonSerializer, JsonSerializer jsonSerializer2, HashSet hashSet) {
        super(Map.class, false);
        this.A06 = hashSet;
        this.A07 = mapSerializer.A07;
        this.A04 = mapSerializer.A04;
        this.A08 = mapSerializer.A08;
        this.A05 = mapSerializer.A05;
        this.A00 = jsonSerializer;
        this.A01 = jsonSerializer2;
        this.A02 = mapSerializer.A02;
        this.A03 = bzD;
    }

    public MapSerializer(MapSerializer mapSerializer, C27204C1t c1t) {
        super(Map.class, false);
        this.A06 = mapSerializer.A06;
        this.A07 = mapSerializer.A07;
        this.A04 = mapSerializer.A04;
        this.A08 = mapSerializer.A08;
        this.A05 = c1t;
        this.A00 = mapSerializer.A00;
        this.A01 = mapSerializer.A01;
        this.A02 = mapSerializer.A02;
        this.A03 = mapSerializer.A03;
    }

    public MapSerializer(HashSet hashSet, C0L c0l, C0L c0l2, boolean z, C27204C1t c1t, JsonSerializer jsonSerializer, JsonSerializer jsonSerializer2) {
        super(Map.class, false);
        this.A06 = hashSet;
        this.A07 = c0l;
        this.A04 = c0l2;
        this.A08 = z;
        this.A05 = c1t;
        this.A00 = jsonSerializer;
        this.A01 = jsonSerializer2;
        this.A02 = C27217C2o.A00;
        this.A03 = null;
    }
}
