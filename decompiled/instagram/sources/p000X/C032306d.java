package p000X;

import android.content.Context;
import android.util.SparseArray;
import java.util.ArrayDeque;

/* renamed from: X.06d  reason: invalid class name and case insensitive filesystem */
public final class C032306d {
    public final Context A00;
    public final SparseArray A01 = new SparseArray(2);

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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public static synchronized void A00(p000X.C032306d r7, p000X.AnonymousClass06X r8, p000X.AnonymousClass06Y r9) {
        /*
            monitor-enter(r7)
            X.033 r4 = new X.033     // Catch:{ all -> 0x0098 }
            int r0 = r8.A00     // Catch:{ all -> 0x0098 }
            r4.<init>(r7, r0, r9)     // Catch:{ all -> 0x0098 }
            monitor-enter(r7)     // Catch:{ all -> 0x0098 }
            android.content.Context r0 = r7.A00     // Catch:{ all -> 0x0095 }
            X.05J r2 = p000X.AnonymousClass05J.A00(r0)     // Catch:{ all -> 0x0095 }
            X.06W r0 = r8.A01     // Catch:{ all -> 0x0095 }
            java.lang.String r1 = r0.A06     // Catch:{ all -> 0x0095 }
            java.util.ArrayList r0 = r2.A01     // Catch:{ all -> 0x0095 }
            java.lang.Object r5 = p000X.AnonymousClass05J.A02(r2, r0, r1)     // Catch:{ all -> 0x0095 }
            com.facebook.analytics2.logger.HandlerThreadFactory r5 = (com.facebook.analytics2.logger.HandlerThreadFactory) r5     // Catch:{ all -> 0x0095 }
            if (r5 != 0) goto L_0x002b
            com.facebook.analytics2.logger.DefaultHandlerThreadFactory r5 = new com.facebook.analytics2.logger.DefaultHandlerThreadFactory     // Catch:{ all -> 0x0095 }
            android.content.Context r0 = r2.A00     // Catch:{ all -> 0x0095 }
            r5.<init>(r0)     // Catch:{ all -> 0x0095 }
            java.lang.String r1 = "ContextConstructorHelper"
            java.lang.String r0 = "Unable to create instance for HandlerThreadFactory"
            p000X.AnonymousClass0DB.A0F(r1, r0)     // Catch:{ all -> 0x0095 }
        L_0x002b:
            int r3 = r8.A00     // Catch:{ all -> 0x0095 }
            r6 = r7
            monitor-enter(r6)     // Catch:{ all -> 0x0095 }
            android.util.SparseArray r0 = r7.A01     // Catch:{ all -> 0x0092 }
            java.lang.Object r0 = r0.get(r3)     // Catch:{ all -> 0x0092 }
            if (r0 == 0) goto L_0x0053
            android.util.SparseArray r0 = r7.A01     // Catch:{ all -> 0x0092 }
            java.lang.Object r0 = r0.get(r3)     // Catch:{ all -> 0x0092 }
            X.06c r0 = (p000X.C032206c) r0     // Catch:{ all -> 0x0092 }
            X.06Z r0 = r0.A00     // Catch:{ all -> 0x0092 }
            if (r0 == 0) goto L_0x0053
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0092 }
            java.lang.String r1 = "Trying to create a new handler when one already exists for jobId: "
            java.lang.String r0 = java.lang.String.valueOf(r3)     // Catch:{ all -> 0x0092 }
            java.lang.String r0 = p000X.AnonymousClass000.A0E(r1, r0)     // Catch:{ all -> 0x0092 }
            r2.<init>(r0)     // Catch:{ all -> 0x0092 }
            throw r2     // Catch:{ all -> 0x0092 }
        L_0x0053:
            X.06W r0 = r8.A01     // Catch:{ all -> 0x0092 }
            java.lang.Integer r1 = r0.A02     // Catch:{ all -> 0x0092 }
            java.lang.Integer r0 = p000X.Constants.ONE     // Catch:{ all -> 0x0092 }
            r2 = 19
            if (r1 != r0) goto L_0x005f
            r2 = 18
        L_0x005f:
            java.lang.String r1 = "UploadJobHandlerManager-"
            java.lang.String r0 = p000X.AnonymousClass000.A05(r1, r3)     // Catch:{ all -> 0x0092 }
            android.os.HandlerThread r1 = r5.AAD(r0, r2)     // Catch:{ all -> 0x0092 }
            android.content.Context r0 = r7.A00     // Catch:{ all -> 0x0092 }
            X.06Z r2 = new X.06Z     // Catch:{ all -> 0x0092 }
            r2.<init>(r0, r1, r8, r4)     // Catch:{ all -> 0x0092 }
            android.util.SparseArray r0 = r7.A01     // Catch:{ all -> 0x0092 }
            java.lang.Object r1 = r0.get(r3)     // Catch:{ all -> 0x0092 }
            X.06c r1 = (p000X.C032206c) r1     // Catch:{ all -> 0x0092 }
            if (r1 != 0) goto L_0x0084
            X.06c r1 = new X.06c     // Catch:{ all -> 0x0092 }
            r1.<init>()     // Catch:{ all -> 0x0092 }
            android.util.SparseArray r0 = r7.A01     // Catch:{ all -> 0x0092 }
            r0.put(r3, r1)     // Catch:{ all -> 0x0092 }
        L_0x0084:
            r1.A00 = r2     // Catch:{ all -> 0x0092 }
            monitor-exit(r6)     // Catch:{ all -> 0x0095 }
            r0 = 1
            android.os.Message r0 = r2.obtainMessage(r0)     // Catch:{ all -> 0x0095 }
            p000X.AnonymousClass0ZA.A0D(r2, r0)     // Catch:{ all -> 0x0095 }
            monitor-exit(r7)     // Catch:{ all -> 0x0098 }
            monitor-exit(r7)
            return
        L_0x0092:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x0095 }
            throw r0     // Catch:{ all -> 0x0095 }
        L_0x0095:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x0098 }
            throw r0     // Catch:{ all -> 0x0098 }
        L_0x0098:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000X.C032306d.A00(X.06d, X.06X, X.06Y):void");
    }

    public final synchronized void A01(AnonymousClass06X r4, AnonymousClass06Y r5) {
        AnonymousClass06Z r0;
        boolean z;
        C032206c r2 = (C032206c) this.A01.get(r4.A00);
        synchronized (this) {
            if (r2 != null) {
                r0 = r2.A00;
            } else {
                r0 = null;
            }
            if (r0 != null) {
                z = false;
            } else {
                A00(this, r4, r5);
                z = true;
            }
        }
        if (!z) {
            AnonymousClass0FY.A00(r2);
            AnonymousClass06b r1 = new AnonymousClass06b(this, r4, r5);
            if (r2.A01 == null) {
                r2.A01 = new ArrayDeque();
            }
            r2.A01.offer(r1);
        }
    }

    public C032306d(Context context) {
        this.A00 = context;
    }
}
