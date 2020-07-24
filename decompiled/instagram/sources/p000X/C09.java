package p000X;

import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;

/* renamed from: X.C09 */
public class C09 implements C27148BzD {
    public static final Object A0I = new Object();
    public C0L A00;
    public JsonSerializer A01;
    public JsonSerializer A02;
    public C27204C1t A03;
    public C27207C1y A04;
    public HashMap A05;
    public final C12960hf A06;
    public final C0L A07;
    public final Object A08;
    public final Field A09;
    public final Method A0A;
    public final boolean A0B;
    public final Class[] A0C;
    public final C0L A0D;
    public final C2B A0E;
    public final C27200C1k A0F;
    public final C27225C3o A0G;
    public final boolean A0H;

    public JsonSerializer A00(C27207C1y c1y, Class cls, C06 c06) {
        JsonSerializer A0A2;
        C27221C2x c2x;
        if (!(this instanceof C0T)) {
            C0L c0l = this.A00;
            if (c0l != null) {
                C0L A032 = c06.A03(c0l, cls);
                JsonSerializer A072 = c06.A07(A032, this);
                c2x = new C27221C2x(A072, c1y.A01(A032.A00, A072));
            } else {
                JsonSerializer A0A3 = c06.A0A(cls, this);
                c2x = new C27221C2x(A0A3, c1y.A01(cls, A0A3));
            }
            C27207C1y c1y2 = c2x.A01;
            if (c1y != c1y2) {
                this.A04 = c1y2;
            }
            return c2x.A00;
        }
        C0T c0t = (C0T) this;
        C0L c0l2 = c0t.A00;
        if (c0l2 != null) {
            A0A2 = c06.A07(c06.A03(c0l2, cls), c0t);
        } else {
            A0A2 = c06.A0A(cls, c0t);
        }
        C3P c3p = c0t.A00;
        if (A0A2.A09()) {
            c3p = new C2M(c3p, ((UnwrappingBeanSerializer) A0A2).A00);
        }
        JsonSerializer A062 = A0A2.A06(c3p);
        c0t.A04 = c0t.A04.A01(cls, A062);
        return A062;
    }

    public C09 A01(C3P c3p) {
        if (this instanceof C0T) {
            C0T c0t = (C0T) this;
            return new C0T(c0t, new C2M(c3p, c0t.A00), new C12960hf(c3p.A00(c0t.A06.getValue())));
        } else if (this instanceof C27195C1a) {
            C27195C1a c1a = (C27195C1a) this;
            return new C27195C1a(c1a.A00.A01(c3p), c1a.A01);
        } else if (!(this instanceof C27196C1b)) {
            C12960hf r1 = this.A06;
            String A002 = c3p.A00(r1.getValue());
            if (A002.equals(r1.toString())) {
                return this;
            }
            return new C09(this, new C12960hf(A002));
        } else {
            C27196C1b c1b = (C27196C1b) this;
            return new C27196C1b(c1b.A00.A01(c3p), c1b.A01);
        }
    }

    public final Object A02(Object obj) {
        Method method = this.A0A;
        if (method != null) {
            return method.invoke(obj, new Object[0]);
        }
        return this.A09.get(obj);
    }

    public void A03(JsonSerializer jsonSerializer) {
        C09 c09;
        if (this instanceof C27195C1a) {
            c09 = ((C27195C1a) this).A00;
        } else if (!(this instanceof C27196C1b)) {
            JsonSerializer jsonSerializer2 = this.A01;
            if (jsonSerializer2 == null || jsonSerializer2 == jsonSerializer) {
                this.A01 = jsonSerializer;
                return;
            }
            throw new IllegalStateException("Can not override null serializer");
        } else {
            c09 = ((C27196C1b) this).A00;
        }
        c09.A03(jsonSerializer);
    }

    public void A04(JsonSerializer jsonSerializer) {
        JsonSerializer jsonSerializer2 = this.A02;
        if (jsonSerializer2 == null || jsonSerializer2 == jsonSerializer) {
            this.A02 = jsonSerializer;
            return;
        }
        throw new IllegalStateException("Can not override serializer");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002e, code lost:
        if (r0 != false) goto L_0x0030;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0012, code lost:
        r1 = r3.getClass();
        r0 = r4.A04;
     */
    public void A05(Object obj, C13460iZ r6, C06 c06) {
        C09 c09;
        boolean equals;
        Class<?> cls;
        C27207C1y c1y;
        if (this instanceof C27195C1a) {
            c09 = ((C27195C1a) this).A00;
        } else if (!(this instanceof C27196C1b)) {
            Object A022 = A02(obj);
            if (A022 != null) {
                JsonSerializer jsonSerializer = this.A02;
                if (jsonSerializer == null && (jsonSerializer = c1y.A00(cls)) == null) {
                    jsonSerializer = A00(c1y, cls, c06);
                }
                Object obj2 = this.A08;
                if (obj2 != null) {
                    if (A0I == obj2) {
                        equals = jsonSerializer.A0C(A022);
                    } else {
                        equals = obj2.equals(A022);
                    }
                }
                if (A022 != obj || jsonSerializer.A0A()) {
                    C27204C1t c1t = this.A03;
                    if (c1t == null) {
                        jsonSerializer.A0B(A022, r6, c06);
                        return;
                    } else {
                        jsonSerializer.A08(A022, r6, c06, c1t);
                        return;
                    }
                } else {
                    throw new C27125Bya("Direct self-reference leading to cycle");
                }
            }
            JsonSerializer jsonSerializer2 = this.A01;
            if (jsonSerializer2 != null) {
                jsonSerializer2.A0B((Object) null, r6, c06);
                return;
            } else {
                r6.A0R();
                return;
            }
        } else {
            c09 = ((C27196C1b) this).A00;
        }
        c09.A05(obj, r6, c06);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002f, code lost:
        r1 = r3.getClass();
        r0 = r4.A04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0057, code lost:
        r1 = r3.getClass();
        r0 = r5.A04;
     */
    public void A06(Object obj, C13460iZ r7, C06 c06) {
        Object obj2;
        JsonSerializer jsonSerializer;
        C27204C1t c1t;
        boolean equals;
        Class<?> cls;
        C27207C1y c1y;
        C09 c09;
        boolean equals2;
        Class<?> cls2;
        C27207C1y c1y2;
        if (!(this instanceof C0T)) {
            if (this instanceof C27195C1a) {
                c09 = ((C27195C1a) this).A00;
            } else if (!(this instanceof C27196C1b)) {
                obj2 = A02(obj);
                if (obj2 != null) {
                    jsonSerializer = this.A02;
                    if (jsonSerializer == null && (jsonSerializer = c1y2.A00(cls2)) == null) {
                        jsonSerializer = A00(c1y2, cls2, c06);
                    }
                    Object obj3 = this.A08;
                    if (obj3 != null) {
                        if (A0I == obj3) {
                            equals2 = jsonSerializer.A0C(obj2);
                        } else {
                            equals2 = obj3.equals(obj2);
                        }
                        if (equals2) {
                            return;
                        }
                    }
                    if (obj2 != obj || jsonSerializer.A0A()) {
                        r7.A0b(this.A06);
                        c1t = this.A03;
                    }
                    throw new C27125Bya("Direct self-reference leading to cycle");
                } else if (this.A01 != null) {
                    r7.A0b(this.A06);
                    this.A01.A0B((Object) null, r7, c06);
                    return;
                } else {
                    return;
                }
            } else {
                c09 = ((C27196C1b) this).A00;
            }
            c09.A06(obj, r7, c06);
            return;
        }
        C0T c0t = (C0T) this;
        obj2 = c0t.A02(obj);
        if (obj2 != null) {
            JsonSerializer jsonSerializer2 = c0t.A02;
            if (jsonSerializer2 == null && (jsonSerializer2 = c1y.A00(cls)) == null) {
                jsonSerializer2 = c0t.A00(c1y, cls, c06);
            }
            Object obj4 = c0t.A08;
            if (obj4 != null) {
                if (A0I == obj4) {
                    equals = jsonSerializer.A0C(obj2);
                } else {
                    equals = obj4.equals(obj2);
                }
                if (equals) {
                    return;
                }
            }
            if (obj2 != obj || jsonSerializer.A0A()) {
                if (!jsonSerializer.A09()) {
                    r7.A0b(c0t.A06);
                }
                c1t = c0t.A03;
            }
            throw new C27125Bya("Direct self-reference leading to cycle");
        }
        return;
        if (c1t == null) {
            jsonSerializer.A0B(obj2, r7, c06);
        } else {
            jsonSerializer.A08(obj2, r7, c06, c1t);
        }
    }

    public final String toString() {
        String name;
        StringBuilder sb = new StringBuilder(40);
        sb.append("property '");
        sb.append(this.A06.getValue());
        sb.append("' (");
        Method method = this.A0A;
        if (method != null) {
            sb.append("via method ");
            sb.append(method.getDeclaringClass().getName());
            sb.append("#");
            name = this.A0A.getName();
        } else {
            sb.append("field \"");
            sb.append(this.A09.getDeclaringClass().getName());
            sb.append("#");
            name = this.A09.getName();
        }
        sb.append(name);
        JsonSerializer jsonSerializer = this.A02;
        if (jsonSerializer == null) {
            sb.append(", no static serializer");
        } else {
            sb.append(AnonymousClass000.A0E(", static serializer of type ", jsonSerializer.getClass().getName()));
        }
        sb.append(')');
        return sb.toString();
    }

    public final C27200C1k APy() {
        return this.A0F;
    }

    public final C0L AZA() {
        return this.A0D;
    }

    public C09(C09 c09, C12960hf r4) {
        this.A06 = r4;
        this.A0E = c09.A0E;
        this.A0F = c09.A0F;
        this.A0G = c09.A0G;
        this.A0D = c09.A0D;
        this.A0A = c09.A0A;
        this.A09 = c09.A09;
        this.A02 = c09.A02;
        this.A01 = c09.A01;
        HashMap hashMap = c09.A05;
        if (hashMap != null) {
            this.A05 = new HashMap(hashMap);
        }
        this.A07 = c09.A07;
        this.A04 = c09.A04;
        this.A0B = c09.A0B;
        this.A08 = c09.A08;
        this.A0C = c09.A0C;
        this.A03 = c09.A03;
        this.A00 = c09.A00;
        this.A0H = c09.A0H;
    }

    public C09(C27194C0y c0y, C27200C1k c1k, C27225C3o c3o, C0L c0l, JsonSerializer jsonSerializer, C27204C1t c1t, C0L c0l2, boolean z, Object obj) {
        C27217C2o c2o;
        this.A0F = c1k;
        this.A0G = c3o;
        this.A06 = new C12960hf(c0y.A0D());
        this.A0E = c0y.A06();
        this.A0D = c0l;
        this.A02 = jsonSerializer;
        if (jsonSerializer == null) {
            c2o = C27217C2o.A00;
        } else {
            c2o = null;
        }
        this.A04 = c2o;
        this.A03 = c1t;
        this.A07 = c0l2;
        this.A0H = c0y.A0J();
        if (c1k instanceof C0e) {
            this.A0A = null;
            this.A09 = (Field) c1k.A0I();
        } else if (c1k instanceof C0F) {
            this.A0A = (Method) c1k.A0I();
            this.A09 = null;
        } else {
            throw new IllegalArgumentException(AnonymousClass000.A0E("Can not pass member of type ", c1k.getClass().getName()));
        }
        this.A0B = z;
        this.A08 = obj;
        this.A0C = c0y.A0L();
        this.A01 = null;
    }
}
