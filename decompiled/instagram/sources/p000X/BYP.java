package p000X;

/* renamed from: X.BYP */
public enum BYP {
    ;

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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public java.util.List A00(p000X.BXX r2) {
        /*
            r1 = this;
            boolean r0 = r1 instanceof p000X.BYO
            if (r0 != 0) goto L_0x001e
            boolean r0 = r1 instanceof p000X.BYQ
            if (r0 != 0) goto L_0x0018
            boolean r0 = r1 instanceof p000X.BYR
            if (r0 != 0) goto L_0x0012
            if (r2 == 0) goto L_0x0028
            monitor-enter(r2)
            java.util.List r0 = r2.A03     // Catch:{ all -> 0x0025 }
            goto L_0x0023
        L_0x0012:
            if (r2 == 0) goto L_0x0028
            monitor-enter(r2)
            java.util.List r0 = r2.A05     // Catch:{ all -> 0x0025 }
            goto L_0x0023
        L_0x0018:
            if (r2 == 0) goto L_0x0028
            monitor-enter(r2)
            java.util.List r0 = r2.A06     // Catch:{ all -> 0x0025 }
            goto L_0x0023
        L_0x001e:
            if (r2 == 0) goto L_0x0028
            monitor-enter(r2)
            java.util.List r0 = r2.A04     // Catch:{ all -> 0x0025 }
        L_0x0023:
            monitor-exit(r2)
            return r0
        L_0x0025:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x0028:
            java.util.List r0 = java.util.Collections.emptyList()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000X.BYP.A00(X.BXX):java.util.List");
    }
}
