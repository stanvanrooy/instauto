package p000X;

import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.ser.impl.FailingSerializer;
import com.fasterxml.jackson.databind.ser.impl.TypeWrappedSerializer;
import com.fasterxml.jackson.databind.ser.impl.UnknownSerializer;
import com.fasterxml.jackson.databind.ser.std.NullSerializer;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.IdentityHashMap;

/* renamed from: X.C06 */
public abstract class C06 extends C27184C0g {
    public static final JsonSerializer A0A = new FailingSerializer();
    public static final JsonSerializer A0B = new UnknownSerializer();
    public static final C0L A0C = new C0w(Object.class);
    public JsonSerializer A00;
    public JsonSerializer A01;
    public JsonSerializer A02;
    public JsonSerializer A03;
    public DateFormat A04;
    public final C27191C0q A05;
    public final C26 A06;
    public final C2H A07;
    public final C27223C2z A08;
    public final C12 A09;

    public JsonSerializer A08(C1c c1c, Object obj) {
        JsonSerializer jsonSerializer;
        C05 c05 = (C05) this;
        if (obj != null) {
            if (obj instanceof JsonSerializer) {
                jsonSerializer = (JsonSerializer) obj;
            } else if (obj instanceof Class) {
                Class<C27159BzW> cls = (Class) obj;
                if (!(cls == JsonSerializer.None.class || cls == C27159BzW.class)) {
                    if (JsonSerializer.class.isAssignableFrom(cls)) {
                        jsonSerializer = (JsonSerializer) C26691Bpp.A02(cls, c05.A05.A05(C1A.CAN_OVERRIDE_ACCESS_MODIFIERS));
                    } else {
                        throw new IllegalStateException(AnonymousClass000.A0J("AnnotationIntrospector returned Class ", cls.getName(), "; expected Class<JsonSerializer>"));
                    }
                }
            } else {
                throw new IllegalStateException(AnonymousClass000.A0J("AnnotationIntrospector returned serializer definition of type ", obj.getClass().getName(), "; expected type JsonSerializer or Class<JsonSerializer> instead"));
            }
            if (jsonSerializer instanceof C3b) {
                ((C3b) jsonSerializer).Bdm(c05);
            }
            return jsonSerializer;
        }
        return null;
    }

    public C32 A0B(Object obj, C2P c2p) {
        C05 c05 = (C05) this;
        IdentityHashMap identityHashMap = c05.A01;
        if (identityHashMap == null) {
            c05.A01 = new IdentityHashMap();
        } else {
            C32 c32 = (C32) identityHashMap.get(obj);
            if (c32 != null) {
                return c32;
            }
        }
        C2P c2p2 = null;
        ArrayList arrayList = c05.A00;
        if (arrayList != null) {
            int i = 0;
            int size = arrayList.size();
            while (true) {
                if (i >= size) {
                    break;
                }
                C2P c2p3 = (C2P) c05.A00.get(i);
                if (c2p3.A04(c2p)) {
                    c2p2 = c2p3;
                    break;
                }
                i++;
            }
        } else {
            c05.A00 = new ArrayList(8);
        }
        if (c2p2 == null) {
            c2p2 = c2p;
            c05.A00.add(c2p);
        }
        C32 c322 = new C32(c2p2);
        c05.A01.put(obj, c322);
        return c322;
    }

    public final JsonSerializer A07(C0L c0l, C27148BzD bzD) {
        C27223C2z c2z = this.A08;
        C1J c1j = c2z.A00;
        if (c1j == null) {
            c2z.A00 = new C1J(c0l, false);
        } else {
            c1j.A01 = c0l;
            c1j.A02 = null;
            c1j.A03 = false;
            c1j.A00 = c0l.hashCode() - 1;
        }
        JsonSerializer A002 = c2z.A01.A00(c2z.A00);
        if (A002 == null) {
            C26 c26 = this.A06;
            synchronized (c26) {
                try {
                    A002 = (JsonSerializer) c26.A01.get(new C1J(c0l, false));
                } catch (Throwable th) {
                    while (true) {
                        th = th;
                    }
                }
            }
            if (A002 == null) {
                try {
                    JsonSerializer A042 = this.A07.A04(this, c0l);
                    if (A042 != null) {
                        C26 c262 = this.A06;
                        JsonSerializer jsonSerializer = A042;
                        synchronized (c262) {
                            try {
                                if (c262.A01.put(new C1J(c0l, false), A042) == null) {
                                    c262.A00 = null;
                                }
                                if (A042 instanceof C3b) {
                                    ((C3b) jsonSerializer).Bdm(this);
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                throw th;
                            }
                        }
                    }
                    A002 = A042;
                    if (A042 == null) {
                        return this.A03;
                    }
                } catch (IllegalArgumentException e) {
                    throw new C27125Bya(e.getMessage(), (C116574zW) null, e);
                }
            }
        }
        if (A002 instanceof C35) {
            return ((C35) A002).AAL(this, bzD);
        }
        return A002;
    }

    public final JsonSerializer A09(Class cls, C27148BzD bzD) {
        C27223C2z c2z = this.A08;
        C1J c1j = c2z.A00;
        if (c1j == null) {
            c2z.A00 = new C1J(cls, true);
        } else {
            c1j.A01 = null;
            c1j.A02 = cls;
            c1j.A03 = true;
            c1j.A00 = cls.getName().hashCode() + 1;
        }
        JsonSerializer A002 = c2z.A01.A00(c2z.A00);
        if (A002 == null) {
            C26 c26 = this.A06;
            synchronized (c26) {
                try {
                    A002 = (JsonSerializer) c26.A01.get(new C1J(cls, true));
                } catch (Throwable th) {
                    while (true) {
                        th = th;
                    }
                }
            }
            if (A002 == null) {
                JsonSerializer A0A2 = A0A(cls, bzD);
                C2H c2h = this.A07;
                C27191C0q c0q = this.A05;
                C27204C1t A032 = c2h.A03(c0q, c0q.A03(cls));
                if (A032 != null) {
                    A0A2 = new TypeWrappedSerializer(A032.A00(bzD), A0A2);
                }
                C26 c262 = this.A06;
                synchronized (c262) {
                    try {
                        if (c262.A01.put(new C1J(cls, true), A0A2) == null) {
                            c262.A00 = null;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                }
                return A0A2;
            }
        }
        return A002;
    }

    public final JsonSerializer A0A(Class cls, C27148BzD bzD) {
        C27223C2z c2z = this.A08;
        C1J c1j = c2z.A00;
        if (c1j == null) {
            c2z.A00 = new C1J(cls, false);
        } else {
            c1j.A01 = null;
            c1j.A02 = cls;
            c1j.A03 = false;
            c1j.A00 = cls.getName().hashCode();
        }
        JsonSerializer A002 = c2z.A01.A00(c2z.A00);
        if (A002 == null) {
            C26 c26 = this.A06;
            synchronized (c26) {
                try {
                    A002 = (JsonSerializer) c26.A01.get(new C1J(cls, false));
                } catch (Throwable th) {
                    while (true) {
                        th = th;
                    }
                }
            }
            if (A002 == null) {
                C26 c262 = this.A06;
                C0L A032 = this.A05.A03(cls);
                synchronized (c262) {
                    try {
                        A002 = (JsonSerializer) c262.A01.get(new C1J(A032, false));
                    } catch (Throwable th2) {
                        while (true) {
                            th = th2;
                            break;
                        }
                    }
                }
                if (A002 == null) {
                    try {
                        JsonSerializer A042 = this.A07.A04(this, this.A05.A03(cls));
                        if (A042 != null) {
                            C26 c263 = this.A06;
                            JsonSerializer jsonSerializer = A042;
                            synchronized (c263) {
                                try {
                                    if (c263.A01.put(new C1J(cls, false), A042) == null) {
                                        c263.A00 = null;
                                    }
                                    if (A042 instanceof C3b) {
                                        ((C3b) jsonSerializer).Bdm(this);
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    throw th;
                                }
                            }
                        }
                        A002 = A042;
                        if (A042 == null) {
                            return this.A03;
                        }
                    } catch (IllegalArgumentException e) {
                        throw new C27125Bya(e.getMessage(), (C116574zW) null, e);
                    }
                }
            }
        }
        if (A002 instanceof C35) {
            return ((C35) A002).AAL(this, bzD);
        }
        return A002;
    }

    public final DateFormat A0C() {
        DateFormat dateFormat = this.A04;
        if (dateFormat != null) {
            return dateFormat;
        }
        DateFormat dateFormat2 = (DateFormat) this.A05.A00.A05.clone();
        this.A04 = dateFormat2;
        return dateFormat2;
    }

    public final void A0D(C13460iZ r3) {
        this.A02.A0B((Object) null, r3, this);
    }

    public final void A0E(Date date, C13460iZ r4) {
        String format;
        if (this.A05.A06(C15.WRITE_DATE_KEYS_AS_TIMESTAMPS)) {
            format = String.valueOf(date.getTime());
        } else {
            format = A0C().format(date);
        }
        r4.A0d(format);
    }

    public final void A0F(Date date, C13460iZ r4) {
        if (this.A05.A06(C15.WRITE_DATES_AS_TIMESTAMPS)) {
            r4.A0Y(date.getTime());
        } else {
            r4.A0g(A0C().format(date));
        }
    }

    public C06() {
        this.A03 = A0B;
        this.A02 = NullSerializer.A00;
        this.A01 = A0A;
        this.A05 = null;
        this.A07 = null;
        this.A06 = new C26();
        this.A08 = null;
        this.A09 = new C12();
    }

    public C06(C06 c06, C27191C0q c0q, C2H c2h) {
        C27223C2z c2z;
        this.A03 = A0B;
        this.A02 = NullSerializer.A00;
        this.A01 = A0A;
        if (c0q != null) {
            this.A07 = c2h;
            this.A05 = c0q;
            C26 c26 = c06.A06;
            this.A06 = c26;
            this.A03 = c06.A03;
            this.A00 = c06.A00;
            this.A02 = c06.A02;
            this.A01 = c06.A01;
            this.A09 = c06.A09;
            synchronized (c26) {
                c2z = c26.A00;
                if (c2z == null) {
                    c2z = new C27223C2z(new C1S(c26.A01));
                    c26.A00 = c2z;
                }
            }
            this.A08 = new C27223C2z(c2z.A01);
            return;
        }
        throw null;
    }
}
