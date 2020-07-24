package p000X;

import org.webrtc.ScreenCapturerAndroid;

/* renamed from: X.1qF  reason: invalid class name and case insensitive filesystem */
public final class C41401qF extends AnonymousClass0L1 {
    public final /* synthetic */ C37531jo A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C41401qF(C37531jo r3) {
        super("initDeviceStorageMonitors", ScreenCapturerAndroid.VIRTUAL_DISPLAY_DPI);
        this.A00 = r3;
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public final void A00() {
        /*
            r7 = this;
            X.1jo r0 = r7.A00
            android.content.Context r4 = r0.A06
            X.0C1 r3 = r0.A07
            X.0L7 r1 = p000X.AnonymousClass0L7.BIG_FOOT_FOREGROUND_REPORTING_CONFIG
            r0 = 0
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r0)
            java.lang.String r6 = "is_enabled"
            r0 = 0
            java.lang.Object r0 = p000X.AnonymousClass0L6.A02(r3, r1, r6, r5, r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0045
            java.lang.Class<X.29C> r2 = p000X.AnonymousClass29C.class
            monitor-enter(r2)
            X.29C r0 = p000X.AnonymousClass29C.A02     // Catch:{ all -> 0x0041 }
            if (r0 != 0) goto L_0x0044
            monitor-enter(r2)     // Catch:{ all -> 0x0041 }
            X.29C r0 = p000X.AnonymousClass29C.A02     // Catch:{ all -> 0x003e }
            if (r0 != 0) goto L_0x003c
            X.29C r1 = new X.29C     // Catch:{ all -> 0x003e }
            android.content.Context r0 = r4.getApplicationContext()     // Catch:{ all -> 0x003e }
            r1.<init>(r0, r3)     // Catch:{ all -> 0x003e }
            p000X.AnonymousClass29C.A02 = r1     // Catch:{ all -> 0x003e }
            X.0Q7 r1 = p000X.AnonymousClass0Q7.A03()     // Catch:{ all -> 0x003e }
            X.29C r0 = p000X.AnonymousClass29C.A02     // Catch:{ all -> 0x003e }
            r1.A0B(r0)     // Catch:{ all -> 0x003e }
        L_0x003c:
            monitor-exit(r2)     // Catch:{ all -> 0x003e }
            goto L_0x0044
        L_0x003e:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x003e }
            throw r0     // Catch:{ all -> 0x0041 }
        L_0x0041:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x0044:
            monitor-exit(r2)
        L_0x0045:
            X.0Cm r0 = p000X.C04120Cm.A01()
            boolean r4 = r0.A08()
            X.0L7 r1 = p000X.AnonymousClass0L7.LOW_DISK_SPACE_MONITOR_CONFIG
            r0 = 0
            java.lang.Object r0 = p000X.AnonymousClass0L6.A02(r3, r1, r6, r5, r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x0070
            if (r4 == 0) goto L_0x0081
            X.0L7 r2 = p000X.AnonymousClass0L7.LOW_DISK_SPACE_MONITOR_CONFIG
            java.lang.String r1 = "yellow_zone_only_is_enabled"
            r0 = 0
            java.lang.Object r0 = p000X.AnonymousClass0L6.A02(r3, r2, r1, r5, r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0081
        L_0x0070:
            X.00B r0 = p000X.AnonymousClass00B.A01
            X.8xW r1 = p000X.C208638xW.A00(r0)
            X.8Gm r0 = new X.8Gm
            r0.<init>(r3)
            p000X.C1898589k.A01 = r0
            r1.A02(r0)
        L_0x0080:
            return
        L_0x0081:
            if (r4 == 0) goto L_0x0080
            X.0L7 r2 = p000X.AnonymousClass0L7.LOW_DISK_SPACE_MONITOR_CONFIG
            java.lang.String r1 = "disk_trimmable_is_enabled"
            r0 = 0
            java.lang.Object r0 = p000X.AnonymousClass0L6.A02(r3, r2, r1, r5, r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0080
            X.00B r0 = p000X.AnonymousClass00B.A01
            X.8xW r4 = p000X.C208638xW.A00(r0)
            X.00B r2 = p000X.AnonymousClass00B.A01
            java.lang.Class<X.2d9> r1 = p000X.C56842d9.class
            monitor-enter(r1)
            X.2d9 r0 = new X.2d9     // Catch:{ all -> 0x0114 }
            r0.<init>(r2)     // Catch:{ all -> 0x0114 }
            p000X.C56842d9.A01 = r0     // Catch:{ all -> 0x0114 }
            monitor-exit(r1)
            p000X.C1898589k.A00 = r0
            r4.A02(r0)
            X.40L r4 = new X.40L
            r4.<init>()
            X.0L7 r2 = p000X.AnonymousClass0L7.LOW_DISK_SPACE_MONITOR_CONFIG
            r0 = 0
            java.lang.Integer r5 = java.lang.Integer.valueOf(r0)
            java.lang.String r1 = "trim_caches_to_minimum_threshold_bytes"
            r0 = 0
            java.lang.Object r0 = p000X.AnonymousClass0L6.A02(r3, r2, r1, r5, r0)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            long r0 = (long) r0
            r4.A01 = r0
            java.lang.String r1 = "trim_caches_to_nothing_threshold_bytes"
            r0 = 0
            java.lang.Object r0 = p000X.AnonymousClass0L6.A02(r3, r2, r1, r5, r0)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            long r0 = (long) r0
            r4.A03 = r0
            java.lang.String r1 = "gap_between_trim_to_min_ms"
            r0 = 0
            java.lang.Object r0 = p000X.AnonymousClass0L6.A02(r3, r2, r1, r5, r0)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            long r0 = (long) r0
            r4.A00 = r0
            java.lang.String r1 = "gap_between_trim_to_nothings_ms"
            r0 = 0
            java.lang.Object r0 = p000X.AnonymousClass0L6.A02(r3, r2, r1, r5, r0)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            long r0 = (long) r0
            r4.A02 = r0
            X.2d9 r1 = p000X.C1898589k.A00
            r1.A00 = r4
            X.12C r0 = p000X.AnonymousClass12C.A0c
            r1.BZa(r0)
            X.2d9 r1 = p000X.C1898589k.A00
            X.1nL r0 = p000X.C39701nL.A03
            r1.BZa(r0)
            X.2d9 r1 = p000X.C1898589k.A00
            X.1zj r0 = p000X.C46431zj.A00(r3)
            r1.BZa(r0)
            return
        L_0x0114:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000X.C41401qF.A00():void");
    }
}
