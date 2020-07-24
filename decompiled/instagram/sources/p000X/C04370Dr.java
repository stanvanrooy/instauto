package p000X;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.0Dr  reason: invalid class name and case insensitive filesystem */
public final class C04370Dr {
    public static final Object A08 = new Object();
    public final C05590Le A00;
    public final AnonymousClass0PP A01;
    public final AnonymousClass0FG A02;
    public final Map A03 = new HashMap();
    public final Map A04 = new HashMap();
    public final Set A05 = new HashSet();
    public final Set A06 = new HashSet();
    public final Map A07 = new HashMap();

    public final void A07(C04530Ei r2, C04440Dz r3, AnonymousClass0LX r4) {
        A08(r2, r3, r4, 0);
    }

    public static String A00(Integer num, C04440Dz r5, int i, String str) {
        String A002;
        String str2 = r5.A00;
        String str3 = "";
        if (i == 0) {
            A002 = str3;
        } else {
            A002 = AnonymousClass000.A00(i, "_");
        }
        if (C04540Ej.A01(num)) {
            str3 = "suppl_";
        }
        return AnonymousClass000.A0O(str2, A002, str3, C04540Ej.A00(num), str);
    }

    public static List A01(C04530Ei r3, C04440Dz r4, Map map) {
        List list;
        synchronized (A08) {
            Map map2 = (Map) map.get(r4);
            if (map2 == null) {
                map2 = new HashMap();
                map.put(r4, map2);
            }
            list = (List) map2.get(r3);
            if (list == null) {
                list = new ArrayList();
                map2.put(r3, list);
            }
        }
        return list;
    }

    public final List A03(C04530Ei r4, C04440Dz r5) {
        List list;
        synchronized (A08) {
            Map map = (Map) this.A07.get(r5);
            if (map == null) {
                map = new HashMap();
                this.A07.put(r5, map);
            }
            list = (List) map.get(r4);
            if (list == null) {
                list = new ArrayList();
                map.put(r4, list);
            }
        }
        return list;
    }

    public final void A04(C04530Ei r3, C04350Dp r4, C04440Dz r5) {
        synchronized (A08) {
            A03(r3, r5).add(r4);
            this.A05.add(r3);
        }
    }

    public final void A05(C04530Ei r2, C04440Dz r3) {
        A02(r2, r3, A01(r2, r3, this.A03));
    }

    public final void A06(C04530Ei r2, C04440Dz r3) {
        A02(r2, r3, A01(r2, r3, this.A04));
    }

    public final void A09(C04530Ei r3, C04440Dz r4, C04360Dq r5) {
        synchronized (A08) {
            A01(r3, r4, this.A03).add(r5);
        }
    }

    public final void A0A(C04530Ei r3, C04440Dz r4, C04360Dq r5) {
        synchronized (A08) {
            A01(r3, r4, this.A04).add(r5);
        }
    }

    public final boolean A0B(C04440Dz r3) {
        boolean contains;
        synchronized (A08) {
            contains = this.A06.contains(r3);
        }
        return contains;
    }

    public C04370Dr(AnonymousClass0FG r2, AnonymousClass0PP r3, C05590Le r4) {
        this.A02 = r2;
        this.A01 = r3;
        this.A00 = r4;
    }

    public static void A02(C04530Ei r4, C04440Dz r5, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            try {
                ((C04360Dq) it.next()).BDB(r4, r5);
            } catch (Throwable th) {
                AnonymousClass0DB.A0H("lacrima", "onNotify failed...", th);
            }
        }
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        	at java.base/java.util.Objects.checkIndex(Objects.java:373)
        	at java.base/java.util.ArrayList.get(ArrayList.java:425)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public final void A08(p000X.C04530Ei r9, p000X.C04440Dz r10, p000X.AnonymousClass0LX r11, int r12) {
        /*
            r8 = this;
            boolean r0 = r8.A0B(r10)
            if (r0 == 0) goto L_0x0007
            return
        L_0x0007:
            r1 = -1211183009(0xffffffffb7ced05f, float:-2.4654144E-5)
            java.lang.String r0 = "CollectorManager.applyCollectors"
            p000X.AnonymousClass0ZL.A01(r0, r1)
            java.lang.Object r7 = A08     // Catch:{ all -> 0x0184 }
            monitor-enter(r7)     // Catch:{ all -> 0x0184 }
            long r5 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0181 }
            java.util.List r1 = r8.A03(r9, r10)     // Catch:{ all -> 0x0181 }
            java.util.Map r0 = r11.A02     // Catch:{ all -> 0x0181 }
            int r0 = r0.size()     // Catch:{ all -> 0x0181 }
            if (r0 != 0) goto L_0x002e
            int r0 = r1.size()     // Catch:{ all -> 0x0181 }
            if (r0 != 0) goto L_0x002e
            monitor-exit(r7)     // Catch:{ all -> 0x0181 }
            r0 = 112873287(0x6ba4f47, float:7.008191E-35)
            goto L_0x017d
        L_0x002e:
            java.util.Iterator r4 = r1.iterator()     // Catch:{ all -> 0x0181 }
        L_0x0032:
            boolean r0 = r4.hasNext()     // Catch:{ all -> 0x0181 }
            if (r0 == 0) goto L_0x007e
            java.lang.Object r3 = r4.next()     // Catch:{ all -> 0x0181 }
            X.0Dp r3 = (p000X.C04350Dp) r3     // Catch:{ all -> 0x0181 }
            java.lang.String r1 = "Collector "
            java.lang.Integer r0 = r3.AQe()     // Catch:{ all -> 0x0181 }
            if (r0 == 0) goto L_0x007b
            java.lang.String r0 = p000X.C04380Ds.A00(r0)     // Catch:{ all -> 0x0181 }
        L_0x004a:
            java.lang.String r1 = p000X.AnonymousClass000.A0E(r1, r0)     // Catch:{ all -> 0x0181 }
            r0 = 141476869(0x86ec405, float:7.185094E-34)
            p000X.AnonymousClass0ZL.A01(r1, r0)     // Catch:{ all -> 0x0181 }
            r3.BXP(r11, r10)     // Catch:{ all -> 0x005e }
            r0 = -698146531(0xffffffffd663211d, float:-6.243284E13)
            p000X.AnonymousClass0ZL.A00(r0)     // Catch:{ all -> 0x0181 }
            goto L_0x0032
        L_0x005e:
            r2 = move-exception
            java.lang.String r1 = "crashed_"
            java.lang.Integer r0 = r3.AQe()     // Catch:{ all -> 0x016b }
            java.lang.String r0 = p000X.C04380Ds.A00(r0)     // Catch:{ all -> 0x016b }
            java.lang.String r1 = p000X.AnonymousClass000.A0E(r1, r0)     // Catch:{ all -> 0x016b }
            java.lang.String r0 = r2.getMessage()     // Catch:{ all -> 0x016b }
            r11.A01(r1, r0)     // Catch:{ all -> 0x016b }
            r0 = 1640679384(0x61cac7d8, float:4.6758032E20)
            p000X.AnonymousClass0ZL.A00(r0)     // Catch:{ all -> 0x0181 }
            goto L_0x0032
        L_0x007b:
            java.lang.String r0 = "null"
            goto L_0x004a
        L_0x007e:
            long r3 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0181 }
            java.util.Map r0 = r11.A02     // Catch:{ all -> 0x0181 }
            int r0 = r0.size()     // Catch:{ all -> 0x0181 }
            if (r0 <= 0) goto L_0x0179
            java.lang.String r2 = "time_apply_collectors_"
            java.lang.Integer r1 = r9.AQd()     // Catch:{ all -> 0x0181 }
            java.lang.String r0 = "_ms"
            java.lang.String r0 = A00(r1, r10, r12, r0)     // Catch:{ all -> 0x0181 }
            java.lang.String r1 = p000X.AnonymousClass000.A0E(r2, r0)     // Catch:{ all -> 0x0181 }
            long r3 = r3 - r5
            java.lang.String r0 = java.lang.Long.toString(r3)     // Catch:{ all -> 0x0181 }
            r11.A01(r1, r0)     // Catch:{ all -> 0x0181 }
            java.lang.String r1 = "CollectorManager.store"
            r0 = 2094378733(0x7cd5aeed, float:8.876057E36)
            p000X.AnonymousClass0ZL.A01(r1, r0)     // Catch:{ all -> 0x0181 }
            java.util.Properties r4 = new java.util.Properties     // Catch:{ all -> 0x0163 }
            r4.<init>()     // Catch:{ all -> 0x0163 }
            java.util.Map r0 = r11.A02     // Catch:{ all -> 0x0163 }
            r4.putAll(r0)     // Catch:{ all -> 0x0163 }
            java.lang.Object r5 = A08     // Catch:{ IOException -> 0x0139 }
            monitor-enter(r5)     // Catch:{ IOException -> 0x0139 }
            X.0FG r0 = r8.A02     // Catch:{ all -> 0x0136 }
            java.io.File r2 = r0.A00()     // Catch:{ all -> 0x0136 }
            java.io.File r3 = new java.io.File     // Catch:{ all -> 0x0136 }
            java.lang.Integer r1 = r9.AQd()     // Catch:{ all -> 0x0136 }
            java.lang.String r0 = "_prop.txt"
            java.lang.String r0 = A00(r1, r10, r12, r0)     // Catch:{ all -> 0x0136 }
            r3.<init>(r2, r0)     // Catch:{ all -> 0x0136 }
            X.0PP r2 = r8.A01     // Catch:{ all -> 0x0136 }
            X.0Le r1 = r8.A00     // Catch:{ all -> 0x0136 }
            java.lang.Integer r0 = r9.AQd()     // Catch:{ all -> 0x0136 }
            java.lang.String r0 = r1.A00(r0, r10)     // Catch:{ all -> 0x0136 }
            r2.A01(r3, r4, r0)     // Catch:{ all -> 0x0136 }
            monitor-exit(r5)     // Catch:{ all -> 0x0136 }
            monitor-enter(r5)     // Catch:{ IOException -> 0x0127 }
            X.0FG r0 = r8.A02     // Catch:{ all -> 0x0124 }
            java.io.File r2 = r0.A00()     // Catch:{ all -> 0x0124 }
            X.0Dz r0 = p000X.C04440Dz.CRITICAL_REPORT     // Catch:{ all -> 0x0124 }
            if (r10 != r0) goto L_0x0121
            java.util.Map r0 = r11.A00     // Catch:{ all -> 0x0124 }
        L_0x00ea:
            int r0 = r0.size()     // Catch:{ all -> 0x0124 }
            if (r0 <= 0) goto L_0x011c
            java.io.File r4 = new java.io.File     // Catch:{ all -> 0x0124 }
            java.lang.Integer r1 = r9.AQd()     // Catch:{ all -> 0x0124 }
            java.lang.String r0 = "_attach.txt"
            java.lang.String r0 = A00(r1, r10, r12, r0)     // Catch:{ all -> 0x0124 }
            r4.<init>(r2, r0)     // Catch:{ all -> 0x0124 }
            java.util.Properties r3 = new java.util.Properties     // Catch:{ all -> 0x0124 }
            r3.<init>()     // Catch:{ all -> 0x0124 }
            X.0Dz r0 = p000X.C04440Dz.CRITICAL_REPORT     // Catch:{ all -> 0x0124 }
            if (r10 != r0) goto L_0x011e
            java.util.Map r0 = r11.A00     // Catch:{ all -> 0x0124 }
        L_0x010a:
            r3.putAll(r0)     // Catch:{ all -> 0x0124 }
            X.0PP r2 = r8.A01     // Catch:{ all -> 0x0124 }
            X.0Le r1 = r8.A00     // Catch:{ all -> 0x0124 }
            java.lang.Integer r0 = r9.AQd()     // Catch:{ all -> 0x0124 }
            java.lang.String r0 = r1.A00(r0, r10)     // Catch:{ all -> 0x0124 }
            r2.A01(r4, r3, r0)     // Catch:{ all -> 0x0124 }
        L_0x011c:
            monitor-exit(r5)     // Catch:{ all -> 0x0124 }
            goto L_0x012f
        L_0x011e:
            java.util.Map r0 = r11.A01     // Catch:{ all -> 0x0124 }
            goto L_0x010a
        L_0x0121:
            java.util.Map r0 = r11.A01     // Catch:{ all -> 0x0124 }
            goto L_0x00ea
        L_0x0124:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0124 }
            throw r0     // Catch:{ IOException -> 0x0127 }
        L_0x0127:
            r2 = move-exception
            java.lang.String r1 = "lacrima"
            java.lang.String r0 = "Cannot create attachment properties"
            p000X.AnonymousClass0DB.A0H(r1, r0, r2)     // Catch:{ all -> 0x0163 }
        L_0x012f:
            r0 = 1587902316(0x5ea5776c, float:5.9615586E18)
            p000X.AnonymousClass0ZL.A00(r0)     // Catch:{ all -> 0x0181 }
            goto L_0x0179
        L_0x0136:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0136 }
            throw r0     // Catch:{ IOException -> 0x0139 }
        L_0x0139:
            r2 = move-exception
            java.lang.String r1 = "lacrima"
            java.lang.String r0 = "Cannot create property file"
            p000X.AnonymousClass0DB.A0H(r1, r0, r2)     // Catch:{ all -> 0x0163 }
            java.lang.Integer r4 = r9.AQd()     // Catch:{ all -> 0x0163 }
            boolean r0 = p000X.C04540Ej.A01(r4)     // Catch:{ all -> 0x0163 }
            if (r0 != 0) goto L_0x0173
            java.util.Map r3 = r11.A02     // Catch:{ all -> 0x0163 }
            java.lang.String r2 = "android_"
            java.lang.String r1 = r10.A00     // Catch:{ all -> 0x0163 }
            java.lang.String r0 = p000X.C04540Ej.A00(r4)     // Catch:{ all -> 0x0163 }
            java.lang.String r1 = p000X.AnonymousClass000.A0J(r2, r1, r0)     // Catch:{ all -> 0x0163 }
            java.lang.String r0 = "log_type"
            r3.put(r0, r1)     // Catch:{ all -> 0x0163 }
            r0 = 0
            p000X.AnonymousClass0EB.A01(r0, r3, r0)     // Catch:{ all -> 0x0163 }
            goto L_0x0173
        L_0x0163:
            r1 = move-exception
            r0 = 308383930(0x126190ba, float:7.117587E-28)
            p000X.AnonymousClass0ZL.A00(r0)     // Catch:{ all -> 0x0181 }
            goto L_0x0172
        L_0x016b:
            r1 = move-exception
            r0 = -1294568457(0xffffffffb2d673f7, float:-2.4965614E-8)
            p000X.AnonymousClass0ZL.A00(r0)     // Catch:{ all -> 0x0181 }
        L_0x0172:
            throw r1     // Catch:{ all -> 0x0181 }
        L_0x0173:
            r0 = -2045261691(0xffffffff8617c885, float:-2.8547262E-35)
            p000X.AnonymousClass0ZL.A00(r0)     // Catch:{ all -> 0x0181 }
        L_0x0179:
            monitor-exit(r7)     // Catch:{ all -> 0x0181 }
            r0 = -1241778590(0xffffffffb5fbf662, float:-1.8772664E-6)
        L_0x017d:
            p000X.AnonymousClass0ZL.A00(r0)
            return
        L_0x0181:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x0181 }
            throw r0     // Catch:{ all -> 0x0184 }
        L_0x0184:
            r1 = move-exception
            r0 = 836908594(0x31e23632, float:6.583627E-9)
            p000X.AnonymousClass0ZL.A00(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p000X.C04370Dr.A08(X.0Ei, X.0Dz, X.0LX, int):void");
    }
}
