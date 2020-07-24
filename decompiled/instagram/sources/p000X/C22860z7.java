package p000X;

import java.util.List;

/* renamed from: X.0z7  reason: invalid class name and case insensitive filesystem */
public final class C22860z7 implements AnonymousClass0RV {
    public static C22860z7 A03;
    public static final Class A04 = C22860z7.class;
    public List A00;
    public final C12900hZ A01 = C12890hY.A00;
    public final AnonymousClass0O9 A02 = new C22870z8(this);

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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public final synchronized void BAN(java.io.InputStream r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            X.0hZ r0 = r3.A01     // Catch:{ IOException -> 0x003a }
            X.0hr r0 = r0.A08(r4)     // Catch:{ IOException -> 0x003a }
            r0.A0p()     // Catch:{ IOException -> 0x003a }
            X.0Qy r0 = p000X.C06890Qw.parseFromJson(r0)     // Catch:{ IOException -> 0x003a }
            if (r0 == 0) goto L_0x0042
            X.0R4 r0 = r0.A00     // Catch:{ IOException -> 0x003a }
            if (r0 == 0) goto L_0x0042
            X.0R2 r0 = r0.A00     // Catch:{ IOException -> 0x003a }
            if (r0 == 0) goto L_0x0042
            java.util.List r2 = r0.A00     // Catch:{ IOException -> 0x003a }
            r1 = r3
            monitor-enter(r1)     // Catch:{ IOException -> 0x003a }
            if (r2 == 0) goto L_0x0038
            boolean r0 = r2.isEmpty()     // Catch:{ all -> 0x0035 }
            if (r0 != 0) goto L_0x0038
            java.util.List r0 = r3.A00     // Catch:{ all -> 0x0035 }
            if (r0 != 0) goto L_0x002f
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x0035 }
            r0.<init>()     // Catch:{ all -> 0x0035 }
            r3.A00 = r0     // Catch:{ all -> 0x0035 }
        L_0x002f:
            java.util.List r0 = r3.A00     // Catch:{ all -> 0x0035 }
            r0.addAll(r2)     // Catch:{ all -> 0x0035 }
            goto L_0x0038
        L_0x0035:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ IOException -> 0x003a }
            throw r0     // Catch:{ IOException -> 0x003a }
        L_0x0038:
            monitor-exit(r1)     // Catch:{ IOException -> 0x003a }
            goto L_0x0042
        L_0x003a:
            r2 = move-exception
            java.lang.Class r1 = A04     // Catch:{ all -> 0x0051 }
            java.lang.String r0 = "Failed to parse JSON"
            p000X.AnonymousClass0DB.A06(r1, r0, r2)     // Catch:{ all -> 0x0051 }
        L_0x0042:
            java.util.List r0 = r3.A00     // Catch:{ all -> 0x0051 }
            if (r0 == 0) goto L_0x004f
            X.0OT r1 = p000X.C05700Lp.A00()     // Catch:{ all -> 0x0051 }
            X.0O9 r0 = r3.A02     // Catch:{ all -> 0x0051 }
            r1.ADc(r0)     // Catch:{ all -> 0x0051 }
        L_0x004f:
            monitor-exit(r3)
            return
        L_0x0051:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000X.C22860z7.BAN(java.io.InputStream):void");
    }

    public static C22860z7 A00() {
        if (A03 == null) {
            synchronized (C22860z7.class) {
                if (A03 == null) {
                    A03 = new C22860z7();
                }
            }
        }
        return A03;
    }
}
