package p000X;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: X.0lV  reason: invalid class name and case insensitive filesystem */
public final class C14780lV {
    public ScheduledExecutorService A00;
    public final C14650lH A01;
    public final Set A02 = new HashSet();
    public final C14720lO A03;

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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public static synchronized void A00(p000X.C14780lV r6, p000X.C14850lq r7) {
        /*
            monitor-enter(r6)
            X.0lH r0 = r6.A01     // Catch:{ 1z3 -> 0x002c }
            int r1 = r7.A00     // Catch:{ 1z3 -> 0x002c }
            java.lang.String r2 = r7.A02     // Catch:{ 1z3 -> 0x002c }
            java.lang.String r3 = r7.A01     // Catch:{ 1z3 -> 0x002c }
            java.lang.Integer r4 = p000X.Constants.ZERO     // Catch:{ 1z3 -> 0x002c }
            r5 = 1
            r0.A00(r1, r2, r3, r4, r5)     // Catch:{ 1z3 -> 0x002c }
            monitor-enter(r6)     // Catch:{ 1z3 -> 0x002c }
            java.util.Set r0 = r6.A02     // Catch:{ all -> 0x0029 }
            r0.remove(r7)     // Catch:{ all -> 0x0029 }
            java.util.Set r0 = r6.A02     // Catch:{ all -> 0x0029 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0029 }
            if (r0 == 0) goto L_0x0027
            java.util.concurrent.ScheduledExecutorService r0 = r6.A00     // Catch:{ all -> 0x0029 }
            if (r0 == 0) goto L_0x0027
            r0.shutdown()     // Catch:{ all -> 0x0029 }
            r0 = 0
            r6.A00 = r0     // Catch:{ all -> 0x0029 }
        L_0x0027:
            monitor-exit(r6)     // Catch:{ 1z3 -> 0x002c }
            goto L_0x004d
        L_0x0029:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ 1z3 -> 0x002c }
            throw r0     // Catch:{ 1z3 -> 0x002c }
        L_0x002c:
            r5 = move-exception
            java.lang.String r4 = "OnDemandResourcePrefetchImpl"
            java.lang.String r3 = "Prefetch failed for resource %s, %s, %d"
            r0 = 4
            java.lang.Object[] r2 = new java.lang.Object[r0]     // Catch:{ all -> 0x004f }
            r1 = 0
            java.lang.String r0 = r7.A02     // Catch:{ all -> 0x004f }
            r2[r1] = r0     // Catch:{ all -> 0x004f }
            r1 = 1
            java.lang.String r0 = r7.A01     // Catch:{ all -> 0x004f }
            r2[r1] = r0     // Catch:{ all -> 0x004f }
            r1 = 2
            int r0 = r7.A00     // Catch:{ all -> 0x004f }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x004f }
            r2[r1] = r0     // Catch:{ all -> 0x004f }
            r0 = 3
            r2[r0] = r5     // Catch:{ all -> 0x004f }
            p000X.AnonymousClass0DB.A0K(r4, r3, r2)     // Catch:{ all -> 0x004f }
        L_0x004d:
            monitor-exit(r6)
            return
        L_0x004f:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000X.C14780lV.A00(X.0lV, X.0lq):void");
    }

    public C14780lV(C14650lH r2, C14720lO r3) {
        this.A01 = r2;
        this.A03 = r3;
        this.A00 = null;
    }
}
