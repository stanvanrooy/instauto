package p000X;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

/* renamed from: X.C04 */
public final class C04 implements Serializable {
    public final C27173Bzl A00;

    public static final IllegalArgumentException A00(C2O c2o, String str) {
        String str2 = c2o.A02;
        return new IllegalArgumentException(AnonymousClass000.A0P("Failed to parse type '", str2, "' (remaining: '", str2.substring(c2o.A00), "'): ", str));
    }

    public C04(C27173Bzl bzl) {
        this.A00 = bzl;
    }

    public final C0L A01(C2O c2o) {
        String str;
        C0L c0w;
        if (c2o.hasMoreTokens()) {
            String nextToken = c2o.nextToken();
            try {
                Class A01 = C26691Bpp.A01(nextToken);
                if (c2o.hasMoreTokens()) {
                    String nextToken2 = c2o.nextToken();
                    if ("<".equals(nextToken2)) {
                        C27173Bzl bzl = this.A00;
                        ArrayList arrayList = new ArrayList();
                        while (true) {
                            if (!c2o.hasMoreTokens()) {
                                break;
                            }
                            arrayList.add(A01(c2o));
                            if (!c2o.hasMoreTokens()) {
                                break;
                            }
                            String nextToken3 = c2o.nextToken();
                            if (!">".equals(nextToken3)) {
                                if (!",".equals(nextToken3)) {
                                    str = AnonymousClass000.A0J("Unexpected token '", nextToken3, "', expected ',' or '>')");
                                    break;
                                }
                            } else if (A01.isArray()) {
                                return C0b.A00(bzl.A05(A01.getComponentType(), (C27174Bzm) null));
                            } else {
                                if (!A01.isEnum()) {
                                    if (Map.class.isAssignableFrom(A01)) {
                                        if (arrayList.size() <= 0) {
                                            return C27173Bzl.A01(bzl, A01);
                                        }
                                        C0L c0l = (C0L) arrayList.get(0);
                                        if (arrayList.size() >= 2) {
                                            c0w = (C0L) arrayList.get(1);
                                        } else {
                                            c0w = new C0w(Object.class);
                                        }
                                        return C11.A00(A01, c0l, c0w);
                                    } else if (Collection.class.isAssignableFrom(A01)) {
                                        if (arrayList.size() >= 1) {
                                            return C1B.A00(A01, (C0L) arrayList.get(0));
                                        }
                                        return C27173Bzl.A00(bzl, A01);
                                    } else if (arrayList.size() != 0) {
                                        return C27173Bzl.A02(A01, (C0L[]) arrayList.toArray(new C0L[arrayList.size()]));
                                    }
                                }
                                return new C0w(A01);
                            }
                        }
                    } else {
                        c2o.A01 = nextToken2;
                        c2o.A00 -= nextToken2.length();
                    }
                }
                return this.A00.A04(A01);
            } catch (Exception e) {
                if (e instanceof RuntimeException) {
                    throw ((RuntimeException) e);
                }
                str = AnonymousClass000.A0N("Can not locate class '", nextToken, "', problem: ", e.getMessage());
            }
        }
        str = "Unexpected end-of-string";
        throw A00(c2o, str);
    }
}
