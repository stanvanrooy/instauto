package p000X;

import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer;
import java.io.Serializable;
import java.util.HashMap;

/* renamed from: X.C0N */
public abstract class C0N extends C27106By5 implements Serializable {
    public JsonDeserializer A00;
    public final C27148BzD A01;
    public final C0L A02;
    public final C0L A03;
    public final C27211C2d A04;
    public final String A05;
    public final boolean A06;
    public final HashMap A07;

    public C2C A02() {
        if (this instanceof C0Q) {
            return C2C.WRAPPER_OBJECT;
        }
        C0O c0o = (C0O) this;
        return !(c0o instanceof C0P) ? !(c0o instanceof C27208C1z) ? C2C.WRAPPER_ARRAY : C2C.EXTERNAL_PROPERTY : C2C.PROPERTY;
    }

    public C27106By5 A03(C27148BzD bzD) {
        C27208C1z c1z;
        if (!(this instanceof C0Q)) {
            C0O c0o = (C0O) this;
            if (c0o instanceof C0P) {
                C0P c0p = (C0P) c0o;
                C27148BzD bzD2 = c0p.A01;
                c1z = c0p;
                if (bzD != bzD2) {
                    return new C0P(c0p, bzD);
                }
            } else if (!(c0o instanceof C27208C1z)) {
                C27148BzD bzD3 = c0o.A01;
                c1z = c0o;
                if (bzD != bzD3) {
                    return new C0O(c0o, bzD);
                }
            } else {
                C27208C1z c1z2 = (C27208C1z) c0o;
                C27148BzD bzD4 = c1z2.A01;
                c1z = c1z2;
                if (bzD != bzD4) {
                    return new C27208C1z(c1z2, bzD);
                }
            }
            return c1z;
        }
        C0Q c0q = (C0Q) this;
        return bzD != c0q.A01 ? new C0Q(c0q, bzD) : c0q;
    }

    public final JsonDeserializer A0B(C27123ByY byY) {
        JsonDeserializer jsonDeserializer;
        C0L c0l = this.A03;
        if (c0l == null) {
            if (byY.A0O(C27109ByB.FAIL_ON_INVALID_SUBTYPE)) {
                return null;
            }
        } else if (c0l.A00 != C27159BzW.class) {
            synchronized (c0l) {
                if (this.A00 == null) {
                    this.A00 = byY.A08(this.A03, this.A01);
                }
                jsonDeserializer = this.A00;
            }
            return jsonDeserializer;
        }
        return NullifyingDeserializer.A00;
    }

    public final JsonDeserializer A0C(C27123ByY byY, String str) {
        JsonDeserializer jsonDeserializer;
        synchronized (this.A07) {
            jsonDeserializer = (JsonDeserializer) this.A07.get(str);
            if (jsonDeserializer == null) {
                C0L Brw = this.A04.Brw(str);
                if (Brw != null) {
                    C0L c0l = this.A02;
                    if (c0l != null && c0l.getClass() == Brw.getClass()) {
                        Brw = c0l.A09(Brw.A00);
                    }
                    jsonDeserializer = byY.A08(Brw, this.A01);
                } else if (this.A03 != null) {
                    jsonDeserializer = A0B(byY);
                } else {
                    C0L c0l2 = this.A02;
                    C13080hr r2 = byY.A05;
                    throw C27125Bya.A00(r2, "Could not resolve type id '" + str + "' into a subtype of " + c0l2);
                }
                this.A07.put(str, jsonDeserializer);
            }
        }
        return jsonDeserializer;
    }

    public final String toString() {
        return "[" + getClass().getName() + "; base-type:" + this.A02 + "; id-resolver: " + this.A04 + ']';
    }

    public C0N(C0L c0l, C27211C2d c2d, String str, boolean z, Class cls) {
        this.A02 = c0l;
        this.A04 = c2d;
        this.A05 = str;
        this.A06 = z;
        this.A07 = new HashMap();
        if (cls == null) {
            this.A03 = null;
        } else {
            if (cls != c0l.A00) {
                C0L A062 = c0l.A06(cls);
                Object obj = c0l.A02;
                A062 = obj != A062.A0G() ? A062.A0E(obj) : A062;
                Object obj2 = c0l.A01;
                c0l = obj2 != A062.A0F() ? A062.A0D(obj2) : A062;
            }
            this.A03 = c0l;
        }
        this.A01 = null;
    }

    public C0N(C0N c0n, C27148BzD bzD) {
        this.A02 = c0n.A02;
        this.A04 = c0n.A04;
        this.A05 = c0n.A05;
        this.A06 = c0n.A06;
        this.A07 = c0n.A07;
        this.A03 = c0n.A03;
        this.A00 = c0n.A00;
        this.A01 = bzD;
    }
}
