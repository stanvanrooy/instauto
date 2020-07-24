package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.ser.ContainerSerializer;
import com.fasterxml.jackson.databind.ser.impl.IndexedListSerializer;
import com.fasterxml.jackson.databind.ser.impl.IteratorSerializer;
import java.lang.reflect.Modifier;
import java.util.Collection;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import p000X.C06;
import p000X.C0L;
import p000X.C13460iZ;
import p000X.C27148BzD;
import p000X.C27200C1k;
import p000X.C27204C1t;
import p000X.C27207C1y;
import p000X.C27217C2o;
import p000X.C27221C2x;
import p000X.C35;

public abstract class AsArraySerializerBase extends ContainerSerializer implements C35 {
    public C27207C1y A00;
    public final C27148BzD A01;
    public final C0L A02;
    public final JsonSerializer A03;
    public final C27204C1t A04;
    public final boolean A05;

    public AsArraySerializerBase A0H(C27148BzD bzD, C27204C1t c1t, JsonSerializer jsonSerializer) {
        return !(this instanceof IterableSerializer) ? !(this instanceof EnumSetSerializer) ? !(this instanceof CollectionSerializer) ? !(this instanceof IteratorSerializer) ? new IndexedListSerializer((IndexedListSerializer) this, bzD, c1t, jsonSerializer) : new IteratorSerializer((IteratorSerializer) this, bzD, c1t, jsonSerializer) : new CollectionSerializer((CollectionSerializer) this, bzD, c1t, jsonSerializer) : new EnumSetSerializer((EnumSetSerializer) this, bzD, c1t, jsonSerializer) : new IterableSerializer((IterableSerializer) this, bzD, c1t, jsonSerializer);
    }

    public void A0I(Object obj, C13460iZ r12, C06 c06) {
        if (this instanceof IterableSerializer) {
            IterableSerializer iterableSerializer = (IterableSerializer) this;
            Iterator it = ((Iterable) obj).iterator();
            if (it.hasNext()) {
                C27204C1t c1t = iterableSerializer.A04;
                Class<?> cls = null;
                JsonSerializer jsonSerializer = null;
                do {
                    Object next = it.next();
                    if (next == null) {
                        c06.A0D(r12);
                    } else {
                        Class<?> cls2 = next.getClass();
                        if (cls2 != cls) {
                            jsonSerializer = c06.A0A(cls2, iterableSerializer.A01);
                            cls = cls2;
                        }
                        if (c1t == null) {
                            jsonSerializer.A0B(next, r12, c06);
                        } else {
                            jsonSerializer.A08(next, r12, c06, c1t);
                        }
                    }
                } while (it.hasNext());
            }
        } else if (this instanceof EnumSetSerializer) {
            EnumSetSerializer enumSetSerializer = (EnumSetSerializer) this;
            JsonSerializer jsonSerializer2 = enumSetSerializer.A03;
            Iterator it2 = ((EnumSet) obj).iterator();
            while (it2.hasNext()) {
                Enum enumR = (Enum) it2.next();
                if (jsonSerializer2 == null) {
                    jsonSerializer2 = c06.A0A(enumR.getDeclaringClass(), enumSetSerializer.A01);
                }
                jsonSerializer2.A0B(enumR, r12, c06);
            }
        } else if (this instanceof CollectionSerializer) {
            CollectionSerializer collectionSerializer = (CollectionSerializer) this;
            Collection collection = (Collection) obj;
            JsonSerializer jsonSerializer3 = collectionSerializer.A03;
            if (jsonSerializer3 != null) {
                Iterator it3 = collection.iterator();
                if (it3.hasNext()) {
                    C27204C1t c1t2 = collectionSerializer.A04;
                    int i = 0;
                    do {
                        Object next2 = it3.next();
                        if (next2 == null) {
                            try {
                                c06.A0D(r12);
                            } catch (Exception e) {
                                StdSerializer.A02(c06, e, collection, i);
                            }
                        } else if (c1t2 == null) {
                            jsonSerializer3.A0B(next2, r12, c06);
                        } else {
                            jsonSerializer3.A08(next2, r12, c06, c1t2);
                        }
                        i++;
                    } while (it3.hasNext());
                    return;
                }
                return;
            }
            Iterator it4 = collection.iterator();
            if (it4.hasNext()) {
                C27207C1y c1y = collectionSerializer.A00;
                C27204C1t c1t3 = collectionSerializer.A04;
                int i2 = 0;
                do {
                    try {
                        Object next3 = it4.next();
                        if (next3 == null) {
                            c06.A0D(r12);
                        } else {
                            Class<?> cls3 = next3.getClass();
                            JsonSerializer A002 = c1y.A00(cls3);
                            if (A002 == null) {
                                C0L c0l = collectionSerializer.A02;
                                A002 = c0l.A0J() ? collectionSerializer.A0F(c1y, c06.A03(c0l, cls3), c06) : collectionSerializer.A0G(c1y, cls3, c06);
                                c1y = collectionSerializer.A00;
                            }
                            if (c1t3 == null) {
                                A002.A0B(next3, r12, c06);
                            } else {
                                A002.A08(next3, r12, c06, c1t3);
                            }
                        }
                        i2++;
                    } catch (Exception e2) {
                        StdSerializer.A02(c06, e2, collection, i2);
                        return;
                    }
                } while (it4.hasNext());
            }
        } else if (!(this instanceof IteratorSerializer)) {
            IndexedListSerializer indexedListSerializer = (IndexedListSerializer) this;
            List list = (List) obj;
            JsonSerializer jsonSerializer4 = indexedListSerializer.A03;
            if (jsonSerializer4 != null) {
                int size = list.size();
                if (size != 0) {
                    C27204C1t c1t4 = indexedListSerializer.A04;
                    for (int i3 = 0; i3 < size; i3++) {
                        Object obj2 = list.get(i3);
                        if (obj2 == null) {
                            try {
                                c06.A0D(r12);
                            } catch (Exception e3) {
                                StdSerializer.A02(c06, e3, list, i3);
                            }
                        } else if (c1t4 == null) {
                            jsonSerializer4.A0B(obj2, r12, c06);
                        } else {
                            jsonSerializer4.A08(obj2, r12, c06, c1t4);
                        }
                    }
                }
            } else if (indexedListSerializer.A04 != null) {
                int size2 = list.size();
                if (size2 != 0) {
                    try {
                        C27204C1t c1t5 = indexedListSerializer.A04;
                        C27207C1y c1y2 = indexedListSerializer.A00;
                        for (int i4 = 0; i4 < size2; i4++) {
                            Object obj3 = list.get(i4);
                            if (obj3 == null) {
                                c06.A0D(r12);
                            } else {
                                Class<?> cls4 = obj3.getClass();
                                JsonSerializer A003 = c1y2.A00(cls4);
                                if (A003 == null) {
                                    C0L c0l2 = indexedListSerializer.A02;
                                    A003 = c0l2.A0J() ? indexedListSerializer.A0F(c1y2, c06.A03(c0l2, cls4), c06) : indexedListSerializer.A0G(c1y2, cls4, c06);
                                    c1y2 = indexedListSerializer.A00;
                                }
                                A003.A08(obj3, r12, c06, c1t5);
                            }
                        }
                    } catch (Exception e4) {
                        StdSerializer.A02(c06, e4, list, 0);
                    }
                }
            } else {
                int size3 = list.size();
                if (size3 != 0) {
                    try {
                        C27207C1y c1y3 = indexedListSerializer.A00;
                        for (int i5 = 0; i5 < size3; i5++) {
                            Object obj4 = list.get(i5);
                            if (obj4 == null) {
                                c06.A0D(r12);
                            } else {
                                Class<?> cls5 = obj4.getClass();
                                JsonSerializer A004 = c1y3.A00(cls5);
                                if (A004 == null) {
                                    C0L c0l3 = indexedListSerializer.A02;
                                    A004 = c0l3.A0J() ? indexedListSerializer.A0F(c1y3, c06.A03(c0l3, cls5), c06) : indexedListSerializer.A0G(c1y3, cls5, c06);
                                    c1y3 = indexedListSerializer.A00;
                                }
                                A004.A0B(obj4, r12, c06);
                            }
                        }
                    } catch (Exception e5) {
                        StdSerializer.A02(c06, e5, list, 0);
                    }
                }
            }
        } else {
            IteratorSerializer iteratorSerializer = (IteratorSerializer) this;
            Iterator it5 = (Iterator) obj;
            if (it5.hasNext()) {
                C27204C1t c1t6 = iteratorSerializer.A04;
                Class<?> cls6 = null;
                JsonSerializer jsonSerializer5 = null;
                do {
                    Object next4 = it5.next();
                    if (next4 == null) {
                        c06.A0D(r12);
                    } else {
                        Class<?> cls7 = next4.getClass();
                        if (cls7 != cls6) {
                            jsonSerializer5 = c06.A0A(cls7, iteratorSerializer.A01);
                            cls6 = cls7;
                        }
                        if (c1t6 == null) {
                            jsonSerializer5.A0B(next4, r12, c06);
                        } else {
                            jsonSerializer5.A08(next4, r12, c06, c1t6);
                        }
                    }
                } while (it5.hasNext());
            }
        }
    }

    public final JsonSerializer A0F(C27207C1y c1y, C0L c0l, C06 c06) {
        JsonSerializer A07 = c06.A07(c0l, this.A01);
        C27221C2x c2x = new C27221C2x(A07, c1y.A01(c0l.A00, A07));
        C27207C1y c1y2 = c2x.A01;
        if (c1y != c1y2) {
            this.A00 = c1y2;
        }
        return c2x.A00;
    }

    public final JsonSerializer A0G(C27207C1y c1y, Class cls, C06 c06) {
        JsonSerializer A0A = c06.A0A(cls, this.A01);
        C27221C2x c2x = new C27221C2x(A0A, c1y.A01(cls, A0A));
        C27207C1y c1y2 = c2x.A01;
        if (c1y != c1y2) {
            this.A00 = c1y2;
        }
        return c2x.A00;
    }

    public final JsonSerializer AAL(C06 c06, C27148BzD bzD) {
        C27200C1k APy;
        Object A0T;
        C27204C1t c1t = this.A04;
        if (c1t != null) {
            c1t = c1t.A00(bzD);
        }
        JsonSerializer jsonSerializer = null;
        if (!(bzD == null || (APy = bzD.APy()) == null || (A0T = c06.A05.A01().A0T(APy)) == null)) {
            jsonSerializer = c06.A08(APy, A0T);
        }
        if (jsonSerializer == null) {
            jsonSerializer = this.A03;
        }
        JsonSerializer A012 = StdSerializer.A01(c06, bzD, jsonSerializer);
        if (A012 == null) {
            if (this.A02 != null && (this.A05 || ContainerSerializer.A05(c06, bzD))) {
                A012 = c06.A07(this.A02, bzD);
            }
        } else if (A012 instanceof C35) {
            A012 = ((C35) A012).AAL(c06, bzD);
        }
        if (A012 == this.A03 && bzD == this.A01 && this.A04 == c1t) {
            return this;
        }
        return A0H(bzD, c1t, A012);
    }

    public AsArraySerializerBase(AsArraySerializerBase asArraySerializerBase, C27148BzD bzD, C27204C1t c1t, JsonSerializer jsonSerializer) {
        super((ContainerSerializer) asArraySerializerBase);
        this.A02 = asArraySerializerBase.A02;
        this.A05 = asArraySerializerBase.A05;
        this.A04 = c1t;
        this.A01 = bzD;
        this.A03 = jsonSerializer;
        this.A00 = asArraySerializerBase.A00;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AsArraySerializerBase(Class cls, C0L c0l, boolean z, C27204C1t c1t, C27148BzD bzD, JsonSerializer jsonSerializer) {
        super(cls, false);
        boolean z2 = false;
        this.A02 = c0l;
        if (z || (c0l != null && Modifier.isFinal(c0l.A00.getModifiers()))) {
            z2 = true;
        }
        this.A05 = z2;
        this.A04 = c1t;
        this.A01 = bzD;
        this.A03 = jsonSerializer;
        this.A00 = C27217C2o.A00;
    }
}
