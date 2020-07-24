package com.fasterxml.jackson.databind.jsontype.impl;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import p000X.C0D;
import p000X.C0L;
import p000X.C0O;
import p000X.C0P;
import p000X.C0Q;
import p000X.C0s;
import p000X.C1F;
import p000X.C1e;
import p000X.C1n;
import p000X.C1u;
import p000X.C1w;
import p000X.C27009BwC;
import p000X.C27106By5;
import p000X.C27148BzD;
import p000X.C27186C0j;
import p000X.C27190C0p;
import p000X.C27191C0q;
import p000X.C27204C1t;
import p000X.C27205C1v;
import p000X.C27206C1x;
import p000X.C27208C1z;
import p000X.C27211C2d;
import p000X.C2C;

public class StdTypeResolverBuilder implements C1e {
    public C27211C2d _customIdResolver;
    public Class _defaultImpl;
    public C27009BwC _idType;
    public C2C _includeAs;
    public boolean _typeIdVisible = false;
    public String _typeProperty;

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0089, code lost:
        r3 = r4.getName();
     */
    public final C27211C2d A00(C0s c0s, C0L c0l, Collection collection, boolean z, boolean z2) {
        HashMap hashMap;
        int lastIndexOf;
        C0L c0l2;
        C27211C2d c2d = this._customIdResolver;
        if (c2d != null) {
            return c2d;
        }
        C27009BwC bwC = this._idType;
        if (bwC != null) {
            switch (bwC.ordinal()) {
                case 0:
                    return null;
                case 1:
                    return new C0D(c0l, c0s.A00.A04);
                case 2:
                    return new C1F(c0l, c0s.A00.A04);
                case 3:
                    if (z != z2) {
                        HashMap hashMap2 = null;
                        if (z) {
                            hashMap = new HashMap();
                        } else {
                            hashMap = null;
                        }
                        if (z2) {
                            hashMap2 = new HashMap();
                        }
                        if (collection != null) {
                            Iterator it = collection.iterator();
                            while (it.hasNext()) {
                                C1n c1n = (C1n) it.next();
                                Class cls = c1n.A01;
                                String str = c1n.A00;
                                boolean z3 = false;
                                if (str != null) {
                                    z3 = true;
                                }
                                if (!z3 && (lastIndexOf = str.lastIndexOf(46)) >= 0) {
                                    str = str.substring(lastIndexOf + 1);
                                }
                                if (z) {
                                    hashMap.put(cls.getName(), str);
                                }
                                if (z2 && ((c0l2 = (C0L) hashMap2.get(str)) == null || !cls.isAssignableFrom(c0l2.A00))) {
                                    hashMap2.put(str, c0s.A03(cls));
                                }
                            }
                        }
                        return new C27186C0j(c0s, c0l, hashMap, hashMap2);
                    }
                    throw new IllegalArgumentException();
                default:
                    throw new IllegalStateException("Do not know how to construct standard type id resolver for idType: " + bwC);
            }
        } else {
            throw new IllegalStateException("Can not build, 'init()' not yet called");
        }
    }

    public final C27106By5 A75(C27190C0p c0p, C0L c0l, Collection collection) {
        if (this._idType == C27009BwC.A02) {
            return null;
        }
        C0L c0l2 = c0l;
        C27211C2d A00 = A00(c0p, c0l2, collection, false, true);
        C2C c2c = this._includeAs;
        switch (c2c.ordinal()) {
            case 0:
                return new C0P(c0l2, A00, this._typeProperty, this._typeIdVisible, this._defaultImpl);
            case 1:
                return new C0Q(c0l, A00, this._typeProperty, this._typeIdVisible);
            case 2:
                return new C0O(c0l2, A00, this._typeProperty, this._typeIdVisible, this._defaultImpl);
            case 3:
                return new C27208C1z(c0l2, A00, this._typeProperty, this._typeIdVisible, this._defaultImpl);
            default:
                throw new IllegalStateException("Do not know how to construct standard type serializer for inclusion type: " + c2c);
        }
    }

    public final C27204C1t A76(C27191C0q c0q, C0L c0l, Collection collection) {
        if (this._idType == C27009BwC.A02) {
            return null;
        }
        C27211C2d A00 = A00(c0q, c0l, collection, true, false);
        C2C c2c = this._includeAs;
        switch (c2c.ordinal()) {
            case 0:
                return new C27206C1x(A00, (C27148BzD) null, this._typeProperty);
            case 1:
                return new C1u(A00, (C27148BzD) null);
            case 2:
                return new C27205C1v(A00, (C27148BzD) null);
            case 3:
                return new C1w(A00, (C27148BzD) null, this._typeProperty);
            default:
                throw new IllegalStateException("Do not know how to construct standard type serializer for inclusion type: " + c2c);
        }
    }

    public final /* bridge */ /* synthetic */ C1e Acw(C2C c2c) {
        if (c2c != null) {
            this._includeAs = c2c;
            return this;
        }
        throw new IllegalArgumentException("includeAs can not be null");
    }

    public final /* bridge */ /* synthetic */ C1e Ad7(C27009BwC bwC, C27211C2d c2d) {
        if (bwC != null) {
            this._idType = bwC;
            this._customIdResolver = c2d;
            this._typeProperty = bwC.A00;
            return this;
        }
        throw new IllegalArgumentException("idType can not be null");
    }

    public final /* bridge */ /* synthetic */ C1e Bry(String str) {
        if (str == null || str.length() == 0) {
            str = this._idType.A00;
        }
        this._typeProperty = str;
        return this;
    }

    public final /* bridge */ /* synthetic */ C1e ABY(Class cls) {
        this._defaultImpl = cls;
        return this;
    }

    public final Class AJz() {
        return this._defaultImpl;
    }

    public final /* bridge */ /* synthetic */ C1e Brx(boolean z) {
        this._typeIdVisible = z;
        return this;
    }
}
