package p000X;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.0gP  reason: invalid class name and case insensitive filesystem */
public final class C12230gP {
    public static volatile boolean A06 = true;
    public static C12100gB A07;
    public static final C12200gL A08 = C12200gL.A01;
    public static volatile boolean A09;
    public C12190gK A00;
    public C12410gh A01 = null;
    public final int A02;
    public final SparseArray A03 = new SparseArray();
    public final C12240gQ A04;
    public final List A05 = new ArrayList();

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
    public static p000X.C12390gf A00(p000X.C12230gP r5, p000X.AnonymousClass299 r6) {
        /*
            X.0gf r2 = r6.A00
            if (r2 != 0) goto L_0x0074
            monitor-enter(r5)
            X.0gf r2 = r6.A00     // Catch:{ all -> 0x0071 }
            if (r2 != 0) goto L_0x006f
            X.0gL r3 = A08     // Catch:{ Exception -> 0x0024 }
            int r1 = r6.A04     // Catch:{ Exception -> 0x0024 }
            monitor-enter(r3)     // Catch:{ Exception -> 0x0024 }
            android.util.SparseArray r0 = r3.A00     // Catch:{ all -> 0x0021 }
            java.lang.Object r2 = r0.get(r1)     // Catch:{ all -> 0x0021 }
            X.0gn r2 = (p000X.C12470gn) r2     // Catch:{ all -> 0x0021 }
            if (r2 != 0) goto L_0x001f
            X.2MZ r2 = p000X.AnonymousClass2MZ.A00     // Catch:{ all -> 0x0021 }
            android.util.SparseArray r0 = r3.A00     // Catch:{ all -> 0x0021 }
            r0.put(r1, r2)     // Catch:{ all -> 0x0021 }
        L_0x001f:
            monitor-exit(r3)     // Catch:{ Exception -> 0x0024 }
            goto L_0x003d
        L_0x0021:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ Exception -> 0x0024 }
            throw r0     // Catch:{ Exception -> 0x0024 }
        L_0x0024:
            r4 = move-exception
            X.0gK r0 = r5.A00     // Catch:{ all -> 0x0071 }
            int r3 = r6.A04     // Catch:{ all -> 0x0071 }
            p000X.C12190gK.A01(r0, r4)     // Catch:{ all -> 0x0071 }
            X.0Ba r2 = r0.A00     // Catch:{ all -> 0x0071 }
            java.lang.String r1 = r4.getMessage()     // Catch:{ all -> 0x0071 }
            java.lang.String r0 = "BoosterBuilderInitializationWithException"
            java.lang.String r0 = p000X.C12190gK.A00(r0, r3, r1)     // Catch:{ all -> 0x0071 }
            r2.BpD(r0, r4)     // Catch:{ all -> 0x0071 }
            X.2MZ r2 = p000X.AnonymousClass2MZ.A00     // Catch:{ all -> 0x0071 }
        L_0x003d:
            int r1 = r6.A03     // Catch:{ Exception -> 0x0046 }
            X.2Ma r0 = r6.A05     // Catch:{ Exception -> 0x0046 }
            X.0gf r2 = r2.A00(r1, r0)     // Catch:{ Exception -> 0x0046 }
            goto L_0x0052
        L_0x0046:
            r2 = move-exception
            X.0gK r1 = r5.A00     // Catch:{ all -> 0x0071 }
            int r0 = r6.A04     // Catch:{ all -> 0x0071 }
            r1.A03(r0, r2)     // Catch:{ all -> 0x0071 }
            X.0gd r0 = p000X.C12370gd.A00     // Catch:{ all -> 0x0071 }
            monitor-exit(r5)     // Catch:{ all -> 0x0071 }
            return r0
        L_0x0052:
            int r1 = r6.A04     // Catch:{ all -> 0x0071 }
            r0 = 1
            if (r1 != r0) goto L_0x0062
            boolean r0 = A09     // Catch:{ all -> 0x0071 }
            if (r0 == 0) goto L_0x0062
            X.2bW r0 = new X.2bW     // Catch:{ all -> 0x0071 }
            r0.<init>()     // Catch:{ all -> 0x0071 }
            r5.A01 = r0     // Catch:{ all -> 0x0071 }
        L_0x0062:
            X.0gh r0 = r5.A01     // Catch:{ all -> 0x0071 }
            if (r0 == 0) goto L_0x006d
            r2.BZf(r0)     // Catch:{ all -> 0x0071 }
            X.0gh r0 = r5.A01     // Catch:{ all -> 0x0071 }
            r6.A01 = r0     // Catch:{ all -> 0x0071 }
        L_0x006d:
            r6.A00 = r2     // Catch:{ all -> 0x0071 }
        L_0x006f:
            monitor-exit(r5)     // Catch:{ all -> 0x0071 }
            return r2
        L_0x0071:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0071 }
            throw r0
        L_0x0074:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p000X.C12230gP.A00(X.0gP, X.299):X.0gf");
    }

    public C12230gP(int i, C12190gK r3, C12240gQ r4) {
        this.A02 = i;
        this.A04 = r4;
        this.A00 = r3;
    }
}
