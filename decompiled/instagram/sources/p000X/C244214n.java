package p000X;

import java.util.HashMap;
import java.util.Map;

/* renamed from: X.14n  reason: invalid class name and case insensitive filesystem */
public final class C244214n {
    public static final Class A06 = C244214n.class;
    public boolean A00;
    public final AnonymousClass0OT A01;
    public final C243014b A02;
    public final AnonymousClass14W A03;
    public final HashMap A04 = new HashMap();
    public final Map A05 = new HashMap();

    public static synchronized Map A00(C244214n r1, Map map, String str) {
        Map map2;
        synchronized (r1) {
            if (!map.containsKey(str)) {
                map.put(str, new HashMap());
            }
            Object obj = map.get(str);
            AnonymousClass0a4.A06(obj);
            map2 = (Map) obj;
        }
        return map2;
    }

    public static void A01(C244214n r4, String str, AnonymousClass15G r6) {
        C244214n r2 = r4;
        String str2 = str;
        r2.A01.ADc(new C108074lE(r2, str2, r6, (AnonymousClass4l0) A00(r4, r4.A05, str).get(r6), (AnonymousClass4l0) A00(r2, r2.A04, str2).get(r6)));
    }

    public final synchronized void A03(String str, AnonymousClass15G r4, C105884ha r5) {
        AnonymousClass4l0 r0;
        Map A002 = A00(this, this.A05, str);
        if (r5 == null) {
            r0 = null;
        } else {
            r0 = AnonymousClass4l0.A00(r5);
        }
        if (r0 != null) {
            A002.put(r4, r0);
        } else {
            A002.remove(r4);
        }
        A01(this, str, r4);
    }

    public C244214n(AnonymousClass14W r2, AnonymousClass0OT r3, C243014b r4) {
        this.A03 = r2;
        this.A01 = r3;
        this.A02 = r4;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0021, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0022, code lost:
        if (r1 != null) goto L_0x0024;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0027, code lost:
        throw r0;
     */
    public static void A02(C244214n r1, Map map, AnonymousClass15G r3, String str, byte[] bArr) {
        AnonymousClass4l0 r0;
        Map A002 = A00(r1, map, str);
        C13080hr A003 = C107974l1.A00(bArr);
        if (A003 != null) {
            r0 = C108024l8.parseFromJson(A003);
        } else {
            r0 = null;
        }
        if (r0 == null) {
            A002.remove(r3);
        } else {
            A002.put(r3, r0);
        }
        if (A003 != null) {
            A003.close();
        }
    }
}
