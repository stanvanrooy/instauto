package p000X;

import android.content.Context;
import android.os.Looper;

/* renamed from: X.BJF */
public final class BJF extends BJ7 {
    public final C25435BJr A00;

    public BJF(Context context, Looper looper, C25437BKa bKa, BEH beh, C25387BHd bHd) {
        super(context, looper, bKa, beh, bHd);
        this.A00 = new C25435BJr(context, this.A01);
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
    public final void AC7() {
        /*
            r5 = this;
            X.BJr r3 = r5.A00
            monitor-enter(r3)
            boolean r0 = r5.isConnected()     // Catch:{ all -> 0x0079 }
            if (r0 == 0) goto L_0x0074
            X.BJr r4 = r5.A00     // Catch:{ Exception -> 0x006c }
            java.util.Map r2 = r4.A01     // Catch:{ Exception -> 0x006c }
            monitor-enter(r2)     // Catch:{ Exception -> 0x006c }
            java.util.Map r0 = r4.A01     // Catch:{ all -> 0x0069 }
            java.util.Collection r0 = r0.values()     // Catch:{ all -> 0x0069 }
            java.util.Iterator r1 = r0.iterator()     // Catch:{ all -> 0x0069 }
        L_0x0018:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x0069 }
            if (r0 == 0) goto L_0x0022
            r1.next()     // Catch:{ all -> 0x0069 }
            goto L_0x0018
        L_0x0022:
            java.util.Map r0 = r4.A01     // Catch:{ all -> 0x0069 }
            r0.clear()     // Catch:{ all -> 0x0069 }
            monitor-exit(r2)     // Catch:{ all -> 0x0069 }
            java.util.Map r2 = r4.A03     // Catch:{ Exception -> 0x006c }
            monitor-enter(r2)     // Catch:{ Exception -> 0x006c }
            java.util.Map r0 = r4.A03     // Catch:{ all -> 0x0066 }
            java.util.Collection r0 = r0.values()     // Catch:{ all -> 0x0066 }
            java.util.Iterator r1 = r0.iterator()     // Catch:{ all -> 0x0066 }
        L_0x0035:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x0066 }
            if (r0 == 0) goto L_0x003f
            r1.next()     // Catch:{ all -> 0x0066 }
            goto L_0x0035
        L_0x003f:
            java.util.Map r0 = r4.A03     // Catch:{ all -> 0x0066 }
            r0.clear()     // Catch:{ all -> 0x0066 }
            monitor-exit(r2)     // Catch:{ all -> 0x0066 }
            java.util.Map r2 = r4.A02     // Catch:{ Exception -> 0x006c }
            monitor-enter(r2)     // Catch:{ Exception -> 0x006c }
            java.util.Map r0 = r4.A02     // Catch:{ all -> 0x0063 }
            java.util.Collection r0 = r0.values()     // Catch:{ all -> 0x0063 }
            java.util.Iterator r1 = r0.iterator()     // Catch:{ all -> 0x0063 }
        L_0x0052:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x0063 }
            if (r0 == 0) goto L_0x005c
            r1.next()     // Catch:{ all -> 0x0063 }
            goto L_0x0052
        L_0x005c:
            java.util.Map r0 = r4.A02     // Catch:{ all -> 0x0063 }
            r0.clear()     // Catch:{ all -> 0x0063 }
            monitor-exit(r2)     // Catch:{ all -> 0x0063 }
            goto L_0x0074
        L_0x0063:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0063 }
            goto L_0x006b
        L_0x0066:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0066 }
            goto L_0x006b
        L_0x0069:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0069 }
        L_0x006b:
            throw r0     // Catch:{ Exception -> 0x006c }
        L_0x006c:
            r2 = move-exception
            java.lang.String r1 = "LocationClientImpl"
            java.lang.String r0 = "Client disconnected before listeners could be cleaned up"
            android.util.Log.e(r1, r0, r2)     // Catch:{ all -> 0x0079 }
        L_0x0074:
            super.AC7()     // Catch:{ all -> 0x0079 }
            monitor-exit(r3)     // Catch:{ all -> 0x0079 }
            return
        L_0x0079:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0079 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000X.BJF.AC7():void");
    }
}
