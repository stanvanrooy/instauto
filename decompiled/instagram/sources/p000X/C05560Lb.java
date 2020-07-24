package p000X;

import java.util.HashMap;
import java.util.Map;

/* renamed from: X.0Lb  reason: invalid class name and case insensitive filesystem */
public final class C05560Lb {
    public static final Map A00 = new HashMap();

    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00d2, code lost:
        if (com.instagram.realtimeclient.RealtimeSubscription.GRAPHQL_MQTT_VERSION.equals(r1) != false) goto L_0x00d4;
     */
    public static Object A00(C05040Hq r6, AnonymousClass0L7 r7, String str, Object obj, AnonymousClass04H r10) {
        Object cast;
        boolean z;
        Object obj2;
        if (r7.A03) {
            String str2 = r7.A02;
            C13760jB r1 = r6.A02;
            C13870jM A002 = r1.A00.A00(str2, str);
            String overriddenParameter = r1.A03.getOverriddenParameter(str2, str);
            if (overriddenParameter == null) {
                if (A002 == null) {
                    overriddenParameter = null;
                } else {
                    overriddenParameter = A002.A03;
                }
            }
            if (overriddenParameter != null) {
                obj2 = A01(overriddenParameter, obj.getClass());
            } else {
                obj2 = null;
            }
            if (obj2 == null) {
                return obj;
            }
            return obj2;
        }
        if (r10 != null) {
            boolean z2 = false;
            if (r6.A03.getOverriddenParameter(r7.A02, str) != null) {
                z2 = true;
            }
            if (!z2) {
                String str3 = (String) A00(r6, r10.A01, r10.A04, r10.A03, r10.A00);
                char c = 65535;
                int hashCode = str3.hashCode();
                if (hashCode != 3433489) {
                    if (hashCode != 3556498) {
                        if (hashCode == 951543133 && str3.equals("control")) {
                            c = 0;
                        }
                    } else if (str3.equals("test")) {
                        c = 1;
                    }
                } else if (str3.equals("pass")) {
                    c = 2;
                }
                if (c == 0 || !(c == 1 || c == 2)) {
                    return obj;
                }
            }
        }
        C05720Lr A003 = AnonymousClass0LP.A00(r6.A04, r7.A02);
        Class cls = obj.getClass();
        if (!A003.A03.containsKey(str)) {
            cast = null;
        } else {
            String str4 = ((AnonymousClass0LL) A003.A03.get(str)).A01;
            if (cls == Boolean.class) {
                if (!"enabled".equals(str4) && !"true".equals(str4)) {
                    z = false;
                }
                z = true;
                cast = Boolean.valueOf(z);
            } else if (cls == Integer.class) {
                cast = cls.cast(Integer.valueOf(Integer.parseInt(str4)));
            } else if (cls == Double.class) {
                cast = cls.cast(Double.valueOf(Double.parseDouble(str4)));
            } else {
                cast = cls.cast(str4);
            }
        }
        if (cast == null) {
            cast = obj;
        }
        String overriddenParameter2 = r6.A03.getOverriddenParameter(r7.A02, str);
        if (overriddenParameter2 != null) {
            return A01(overriddenParameter2, cls);
        }
        return cast;
    }

    public static Object A01(String str, Class cls) {
        if (cls == Boolean.class) {
            return Boolean.valueOf(str);
        }
        if (cls == Double.class) {
            return Double.valueOf(Double.parseDouble(str));
        }
        if (cls == Integer.class) {
            return Integer.valueOf(Integer.parseInt(str));
        }
        return str;
    }

    public static void A02(C06590Pq r6, AnonymousClass0L7 r7, String str, AnonymousClass04H r9, C05040Hq r10) {
        if (r10 == null) {
            return;
        }
        if (r7.A03) {
            r10.A04(r6, r7.A02, str);
            return;
        }
        if (r9 != null) {
            String str2 = (String) A00(r10, r9.A01, r9.A04, r9.A03, r9.A00);
            char c = 65535;
            int hashCode = str2.hashCode();
            if (hashCode != 3433489) {
                if (hashCode != 3556498) {
                    if (hashCode == 951543133 && str2.equals("control")) {
                        c = 0;
                    }
                } else if (str2.equals("test")) {
                    c = 1;
                }
            } else if (str2.equals("pass")) {
                c = 2;
            }
            if (c == 0) {
                A02(r6, r9.A01, r9.A04, r9.A00, r10);
                return;
            } else if (c == 1) {
                A02(r6, r9.A01, r9.A04, r9.A00, r10);
            } else if (c != 2) {
                return;
            }
        }
        r10.A03(r6, r7.A02, str);
    }

    public static void A03(AnonymousClass0L7 r2, String str) {
        AnonymousClass0QD.A02("QuickExperiment", "QE not initialized before " + r2 + ":" + str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0022, code lost:
        if (com.instagram.realtimeclient.RealtimeSubscription.GRAPHQL_MQTT_VERSION.equals(r3) != false) goto L_0x0024;
     */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x003a A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x003b A[RETURN] */
    public static Object castStringToParameter(String str, Object obj) {
        Object obj2;
        boolean z;
        Class<?> cls = obj.getClass();
        if (str != null) {
            if (cls == Boolean.class) {
                try {
                    if (!"enabled".equals(str) && !"true".equals(str)) {
                        z = false;
                    }
                    z = true;
                    obj2 = A01(Boolean.valueOf(z).toString(), cls);
                } catch (ClassCastException unused) {
                }
            } else {
                obj2 = A01(str, cls);
            }
            if (obj2 != null) {
                return obj;
            }
            return obj2;
        }
        obj2 = null;
        if (obj2 != null) {
        }
    }
}
