package p000X;

import java.io.File;
import java.util.Iterator;

/* renamed from: X.05k  reason: invalid class name and case insensitive filesystem */
public final class C031005k implements Iterator {
    public int A00;
    public AnonymousClass05B A01;
    public C033206n A02;
    public File A03;
    public boolean A04;
    public final int A05;
    public final long A06;
    public final long A07;
    public final AnonymousClass055 A08;
    public final AnonymousClass058 A09;
    public final AnonymousClass03C A0A;

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
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeEndlessLoop(RegionMaker.java:368)
        	at jadx.core.dex.visitors.regions.RegionMaker.processLoop(RegionMaker.java:172)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public final boolean hasNext() {
        /*
            r17 = this;
            r9 = r17
            boolean r0 = r9.A04
            r8 = 1
            if (r0 != 0) goto L_0x01a9
            r9.A04 = r8
            X.05j r12 = new X.05j
            r0 = 0
            r12.<init>()
            java.util.ArrayList r7 = new java.util.ArrayList
            r1 = 4
            r7.<init>(r1)
            r11 = 0
            r10 = r0
            r6 = 0
        L_0x0018:
            if (r6 == 0) goto L_0x001e
            int r1 = r9.A05
            if (r6 >= r1) goto L_0x018b
        L_0x001e:
            X.055 r1 = r9.A08
            boolean r1 = r1.hasNext()
            if (r1 == 0) goto L_0x018b
            X.055 r2 = r9.A08
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L_0x0185
            X.053 r1 = r2.A00
            r2.A00 = r0
            r2.A01 = r11
            X.051 r5 = r1.A01
            int r2 = r1.A00
            if (r2 == r8) goto L_0x00dc
            r1 = 2
            if (r2 == r1) goto L_0x00a8
            r1 = 3
            if (r2 != r1) goto L_0x0162
            if (r10 == 0) goto L_0x0079
            java.io.File r4 = r5.A00
            X.05B r1 = r9.A01
            X.05A r2 = r1.A01(r4)
            monitor-enter(r2)     // Catch:{ all -> 0x015d }
            p000X.AnonymousClass05A.A00(r2, r9)     // Catch:{ all -> 0x0155 }
            boolean r1 = r2.A09()     // Catch:{ all -> 0x0155 }
            if (r1 != 0) goto L_0x0062
            java.lang.Object r1 = r2.A01     // Catch:{ all -> 0x0155 }
            if (r1 != 0) goto L_0x0062
            boolean r1 = r2.A08()     // Catch:{ all -> 0x0155 }
            if (r1 == 0) goto L_0x0060
            r2.A01 = r9     // Catch:{ all -> 0x0155 }
        L_0x0060:
            monitor-exit(r2)     // Catch:{ all -> 0x015d }
            goto L_0x0064
        L_0x0062:
            monitor-exit(r2)     // Catch:{ all -> 0x015d }
            r1 = 0
        L_0x0064:
            if (r1 == 0) goto L_0x0075
            boolean r1 = r4.delete()     // Catch:{ all -> 0x0158 }
            if (r1 == 0) goto L_0x0072
            r2.A06(r9)     // Catch:{ all -> 0x0158 }
            r2.A04()     // Catch:{ all -> 0x0158 }
        L_0x0072:
            r2.A07(r9)     // Catch:{ all -> 0x015d }
        L_0x0075:
            r2.A02()
            goto L_0x0018
        L_0x0079:
            java.io.File r1 = r5.A00
            long r13 = r1.length()
            r2 = 0
            int r1 = (r13 > r2 ? 1 : (r13 == r2 ? 0 : -1))
            if (r1 != 0) goto L_0x008b
            java.io.File r1 = r5.A00
            r1.getName()
            goto L_0x0018
        L_0x008b:
            X.010 r4 = new X.010
            X.058 r3 = r9.A09
            java.io.File r2 = r5.A00
            X.05B r1 = r9.A01
            r4.<init>(r3, r2, r1)
            r7.add(r4)
            long r1 = (long) r6
            java.io.File r3 = r4.A00
            long r3 = r3.length()
            long r1 = r1 + r3
            int r6 = (int) r1
            java.io.File r1 = r5.A00
            r9.A03 = r1
            goto L_0x0018
        L_0x00a8:
            if (r10 == 0) goto L_0x00d3
            java.io.File r1 = r5.A00
            A00(r1)
            java.io.File r2 = r10.A00
            java.io.File r1 = r5.A00
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x00ba
            r10 = r0
        L_0x00ba:
            boolean r1 = r5 instanceof p000X.AnonymousClass08P
            if (r1 == 0) goto L_0x0018
            X.03C r4 = r9.A0A
            java.io.File r1 = r5.A00
            java.io.File r3 = r9.A03
            java.lang.String r2 = r1.getName()
            X.06Z r1 = r4.A00
            X.00N r1 = r1.A06
            r1.put(r2, r3)
            r9.A03 = r0
            goto L_0x0018
        L_0x00d3:
            r2 = r5
            X.06p r2 = (p000X.C033406p) r2
            java.util.ArrayList r1 = r12.A00
            r1.add(r2)
            goto L_0x00ba
        L_0x00dc:
            boolean r1 = r5 instanceof p000X.AnonymousClass08P
            if (r1 == 0) goto L_0x0117
            java.io.File r1 = r5.A00
            java.lang.String r2 = r1.getName()
            java.lang.String r1 = p000X.C14600lC.A00()
            boolean r1 = r2.equals(r1)
            r1 = r1 ^ r8
            if (r1 == 0) goto L_0x0102
            java.lang.Class<X.06a> r2 = p000X.C032106a.class
            monitor-enter(r2)
            X.05B r1 = p000X.C032106a.A00     // Catch:{ all -> 0x016e }
            if (r1 != 0) goto L_0x00ff
            X.06a r1 = new X.06a     // Catch:{ all -> 0x016e }
            r1.<init>()     // Catch:{ all -> 0x016e }
            p000X.C032106a.A00 = r1     // Catch:{ all -> 0x016e }
        L_0x00ff:
            X.05B r1 = p000X.C032106a.A00     // Catch:{ all -> 0x016e }
            goto L_0x0112
        L_0x0102:
            java.lang.Class<X.05i> r2 = p000X.C030805i.class
            monitor-enter(r2)
            X.05B r1 = p000X.C030805i.A00     // Catch:{ all -> 0x016e }
            if (r1 != 0) goto L_0x0110
            X.05i r1 = new X.05i     // Catch:{ all -> 0x016e }
            r1.<init>()     // Catch:{ all -> 0x016e }
            p000X.C030805i.A00 = r1     // Catch:{ all -> 0x016e }
        L_0x0110:
            X.05B r1 = p000X.C030805i.A00     // Catch:{ all -> 0x016e }
        L_0x0112:
            monitor-exit(r2)
            r9.A01 = r1
            goto L_0x0018
        L_0x0117:
            boolean r1 = r5 instanceof p000X.AnonymousClass08O
            if (r1 == 0) goto L_0x0018
            X.08O r5 = (p000X.AnonymousClass08O) r5
            boolean r1 = r5 instanceof p000X.C022001l
            if (r1 == 0) goto L_0x012f
            long r3 = r9.A06
            r2 = -1
            java.io.File r1 = r5.A00     // Catch:{ NumberFormatException -> 0x0141 }
            java.lang.String r1 = r1.getName()     // Catch:{ NumberFormatException -> 0x0141 }
            long r1 = java.lang.Long.parseLong(r1)     // Catch:{ NumberFormatException -> 0x0141 }
            goto L_0x0142
        L_0x012f:
            boolean r1 = r5 instanceof p000X.AnonymousClass01U
            if (r1 == 0) goto L_0x0171
            long r3 = r9.A07
            r2 = -1
            java.io.File r1 = r5.A00     // Catch:{ NumberFormatException -> 0x0141 }
            java.lang.String r1 = r1.getName()     // Catch:{ NumberFormatException -> 0x0141 }
            long r1 = java.lang.Long.parseLong(r1)     // Catch:{ NumberFormatException -> 0x0141 }
            goto L_0x0142
        L_0x0141:
            long r1 = (long) r2
        L_0x0142:
            r16 = 1
            r14 = 0
            int r13 = (r1 > r14 ? 1 : (r1 == r14 ? 0 : -1))
            if (r13 < 0) goto L_0x0150
            int r13 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r13 < 0) goto L_0x0150
            r16 = 0
        L_0x0150:
            if (r16 == 0) goto L_0x0018
            r10 = r5
            goto L_0x0018
        L_0x0155:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x015d }
            goto L_0x015c
        L_0x0158:
            r0 = move-exception
            r2.A07(r9)     // Catch:{ all -> 0x015d }
        L_0x015c:
            throw r0     // Catch:{ all -> 0x015d }
        L_0x015d:
            r0 = move-exception
            r2.A02()
            throw r0
        L_0x0162:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "eventType="
            java.lang.String r0 = p000X.AnonymousClass000.A05(r0, r2)
            r1.<init>(r0)
            throw r1
        L_0x016e:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x0171:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r0 = "directoryNode="
            r1.<init>(r0)
            r1.append(r5)
            java.lang.String r0 = r1.toString()
            r2.<init>(r0)
            throw r2
        L_0x0185:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        L_0x018b:
            int r1 = r7.size()
            if (r1 <= 0) goto L_0x01a7
            int r0 = r9.A00
            int r0 = r0 + r1
            r9.A00 = r0
            if (r1 <= r8) goto L_0x01af
            r7.size()
            X.08L r1 = new X.08L
            X.058 r0 = r9.A09
            r1.<init>(r7, r0)
        L_0x01a2:
            X.08M r0 = new X.08M
            r0.<init>(r1, r12)
        L_0x01a7:
            r9.A02 = r0
        L_0x01a9:
            X.06n r0 = r9.A02
            if (r0 != 0) goto L_0x01ae
            r8 = 0
        L_0x01ae:
            return r8
        L_0x01af:
            java.lang.Object r1 = r7.get(r11)
            X.06n r1 = (p000X.C033206n) r1
            goto L_0x01a2
        */
        throw new UnsupportedOperationException("Method not decompiled: p000X.C031005k.hasNext():boolean");
    }

    public final void remove() {
        throw new UnsupportedOperationException("File removal should be accomplished via markSuccessful");
    }

    public C031005k(File file, AnonymousClass058 r7, AnonymousClass03C r8, int i) {
        long currentTimeMillis;
        long currentTimeMillis2;
        this.A08 = new AnonymousClass055(new AnonymousClass08Q(file));
        this.A09 = r7;
        this.A0A = r8;
        this.A05 = i;
        Class<C029704w> cls = C029704w.class;
        synchronized (cls) {
            currentTimeMillis = System.currentTimeMillis();
        }
        this.A06 = (currentTimeMillis / C029704w.A00) - 7;
        synchronized (cls) {
            currentTimeMillis2 = System.currentTimeMillis();
        }
        this.A07 = (currentTimeMillis2 / C029704w.A01) - 168;
    }

    public static void A00(File file) {
        if (!file.isDirectory()) {
            AnonymousClass0DB.A0K("FileBatchPayloadIterator", "%s: not a directory, deleting anyway...", file);
        }
        file.delete();
    }

    public final /* bridge */ /* synthetic */ Object next() {
        if (hasNext()) {
            C033206n r1 = this.A02;
            this.A04 = false;
            this.A02 = null;
            return r1;
        }
        throw new IllegalStateException();
    }
}
