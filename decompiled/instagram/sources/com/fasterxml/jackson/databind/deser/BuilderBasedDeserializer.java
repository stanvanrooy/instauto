package com.fasterxml.jackson.databind.deser;

import java.util.HashSet;
import java.util.Map;
import p000X.C0F;
import p000X.C0G;
import p000X.C0H;
import p000X.C0K;
import p000X.C13080hr;
import p000X.C13120hv;
import p000X.C13480ib;
import p000X.C27123ByY;
import p000X.C27164Bzc;
import p000X.C27175Bzn;
import p000X.C27176Bzt;
import p000X.C27177Bzu;
import p000X.C3P;

public final class BuilderBasedDeserializer extends BeanDeserializerBase {
    public final C0F A00;

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x007c, code lost:
        if (r1 == p000X.C13120hv.START_OBJECT) goto L_0x007e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00b5  */
    public final Object A0e(C13080hr r5, C27123ByY byY, Object obj) {
        C13120hv A0g;
        C0H c0h;
        if (this.A0F != null) {
            A0a(byY, obj);
        }
        if (this.A04 != null) {
            C13120hv A0g2 = r5.A0g();
            if (A0g2 == C13120hv.START_OBJECT) {
                A0g2 = r5.A0p();
            }
            C13480ib r2 = new C13480ib(r5.A0q());
            r2.A0T();
            boolean z = this.A0E;
            while (A0g2 == C13120hv.FIELD_NAME) {
                String A0i = r5.A0i();
                C27176Bzt A002 = this.A09.A00(A0i);
                r5.A0p();
                if (A002 != null) {
                    try {
                        obj = A002.A06(r5, byY, obj);
                    } catch (Exception e) {
                        A0d(e, obj, A0i, byY);
                    }
                } else {
                    HashSet hashSet = this.A0B;
                    if (hashSet == null || !hashSet.contains(A0i)) {
                        r2.A0d(A0i);
                        r2.A0q(r5);
                        C0H c0h2 = this.A01;
                        if (c0h2 != null) {
                            c0h2.A01(r5, byY, obj, A0i);
                        }
                    } else {
                        r5.A0f();
                    }
                }
                A0g2 = r5.A0p();
            }
            r2.A0Q();
            this.A04.A00(byY, obj, r2);
            return obj;
        } else if (this.A02 != null) {
            return A0f(r5, byY, obj);
        } else {
            boolean z2 = this.A0E;
            A0g = r5.A0g();
        }
        A0g = r5.A0p();
        if (A0g != C13120hv.FIELD_NAME) {
            String A0i2 = r5.A0i();
            r5.A0p();
            C27176Bzt A003 = this.A09.A00(A0i2);
            if (A003 == null) {
                HashSet hashSet2 = this.A0B;
                if (hashSet2 == null || !hashSet2.contains(A0i2)) {
                    c0h = this.A01;
                    if (c0h == null) {
                        c0h.A01(r5, byY, obj, A0i2);
                    } else {
                        A0J(r5, byY, obj, A0i2);
                    }
                } else {
                    r5.A0f();
                }
                c0h = this.A01;
                if (c0h == null) {
                }
            } else {
                try {
                    obj = A003.A06(r5, byY, obj);
                } catch (Exception e2) {
                    A0d(e2, obj, A0i2, byY);
                }
            }
            A0g = r5.A0p();
            if (A0g != C13120hv.FIELD_NAME) {
                return obj;
            }
        }
        return obj;
    }

    public final Object A0f(C13080hr r4, C27123ByY byY, Object obj) {
        boolean z = this.A0E;
        C27177Bzu bzu = new C27177Bzu(this.A02);
        while (r4.A0g() != C13120hv.END_OBJECT) {
            String A0i = r4.A0i();
            r4.A0p();
            C27176Bzt A002 = this.A09.A00(A0i);
            if (A002 != null) {
                try {
                    obj = A002.A06(r4, byY, obj);
                } catch (Exception e) {
                    A0d(e, obj, A0i, byY);
                }
            } else {
                HashSet hashSet = this.A0B;
                if (hashSet != null && hashSet.contains(A0i)) {
                    r4.A0f();
                } else if (!bzu.A02(r4, byY, A0i, obj)) {
                    C0H c0h = this.A01;
                    if (c0h != null) {
                        c0h.A01(r4, byY, obj, A0i);
                    } else {
                        A0J(r4, byY, obj, A0i);
                    }
                }
            }
            r4.A0p();
        }
        bzu.A00(r4, byY, obj);
        return obj;
    }

    public final Object A0g(C27123ByY byY, Object obj) {
        try {
            return this.A00.A01.invoke(obj, new Object[0]);
        } catch (Exception e) {
            A0c(e, byY);
            return null;
        }
    }

    public BuilderBasedDeserializer(C27175Bzn bzn, C0K c0k, C0G c0g, Map map, HashSet hashSet, boolean z, boolean z2) {
        super(bzn, c0k, c0g, map, hashSet, z, z2);
        this.A00 = bzn.A04;
        if (this.A0A != null) {
            throw new IllegalArgumentException("Can not use Object Id with Builder-based deserialization (type " + c0k.A00 + ")");
        }
    }

    public BuilderBasedDeserializer(BuilderBasedDeserializer builderBasedDeserializer, C27164Bzc bzc) {
        super((BeanDeserializerBase) builderBasedDeserializer, bzc);
        this.A00 = builderBasedDeserializer.A00;
    }

    public BuilderBasedDeserializer(BuilderBasedDeserializer builderBasedDeserializer, C3P c3p) {
        super((BeanDeserializerBase) builderBasedDeserializer, c3p);
        this.A00 = builderBasedDeserializer.A00;
    }

    public BuilderBasedDeserializer(BuilderBasedDeserializer builderBasedDeserializer, HashSet hashSet) {
        super((BeanDeserializerBase) builderBasedDeserializer, hashSet);
        this.A00 = builderBasedDeserializer.A00;
    }
}
