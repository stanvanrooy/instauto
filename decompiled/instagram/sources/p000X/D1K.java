package p000X;

/* renamed from: X.D1K */
public final class D1K implements Runnable {
    public final int A00;
    public final /* synthetic */ C29618D1y A01;

    public D1K(C29618D1y d1y, int i) {
        this.A01 = d1y;
        this.A00 = i;
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
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
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public final void run() {
        /*
            r53 = this;
        L_0x0000:
            r6 = r53
            X.D1y r0 = r6.A01     // Catch:{ InterruptedException -> 0x03b1 }
            java.util.concurrent.BlockingQueue r0 = r0.A0B     // Catch:{ InterruptedException -> 0x03b1 }
            java.lang.Object r0 = r0.take()     // Catch:{ InterruptedException -> 0x03b1 }
            X.D1R r0 = (p000X.D1R) r0     // Catch:{ InterruptedException -> 0x03b1 }
            X.D1Z r1 = r0.A03     // Catch:{ InterruptedException -> 0x03b1 }
            android.net.Uri r1 = r1.A02     // Catch:{ InterruptedException -> 0x03b1 }
            r18 = r1
            X.D1y r2 = r6.A01
            boolean r1 = r2.A07
            if (r1 == 0) goto L_0x002c
            X.D23 r3 = r2.A09
            X.Cuo r1 = r0.A04
            java.lang.String r2 = r1.A04
            r1 = r18
            byte[] r1 = r3.A01(r2, r1)
            if (r1 == 0) goto L_0x002c
            java.lang.Integer r1 = p000X.Constants.ONE
            r0.A00(r1)
            goto L_0x0000
        L_0x002c:
            java.lang.Integer r2 = r0.A01
            java.lang.Integer r1 = p000X.Constants.ZERO
            if (r2 != r1) goto L_0x0000
            r17 = 2
            r5 = 1
            r4 = 0
            X.D1H r3 = new X.D1H     // Catch:{ IOException | RuntimeException -> 0x02e1 }
            r3.<init>()     // Catch:{ IOException | RuntimeException -> 0x02e1 }
            X.D1Q r7 = new X.D1Q     // Catch:{ IOException | RuntimeException -> 0x02e1 }
            X.D1y r1 = r6.A01     // Catch:{ IOException | RuntimeException -> 0x02e1 }
            X.D2V r2 = r1.A02     // Catch:{ IOException | RuntimeException -> 0x02e1 }
            r1 = 0
            r7.<init>(r1, r2)     // Catch:{ IOException | RuntimeException -> 0x02e1 }
            X.D1U r1 = r7.A00     // Catch:{ IOException | RuntimeException -> 0x02e1 }
            r3.A00(r1)     // Catch:{ IOException | RuntimeException -> 0x02e1 }
            X.D1u r1 = r0.A06     // Catch:{ IOException | RuntimeException -> 0x02e1 }
            X.D2G r1 = r1.A00()     // Catch:{ IOException | RuntimeException -> 0x02e1 }
            X.D29 r8 = r0.A05     // Catch:{ IOException | RuntimeException -> 0x02e1 }
            if (r8 == 0) goto L_0x00ba
            X.D1N r7 = new X.D1N     // Catch:{ IOException | RuntimeException -> 0x02e1 }
            X.Cuo r13 = r0.A04     // Catch:{ IOException | RuntimeException -> 0x02e1 }
            r21 = 0
            r24 = 1
            java.lang.String r12 = r0.A08     // Catch:{ IOException | RuntimeException -> 0x02e1 }
            r26 = 0
            X.Cv5 r2 = p000X.C29279Cv5.A00     // Catch:{ IOException | RuntimeException -> 0x02e1 }
            java.lang.String r27 = r2.A01()     // Catch:{ IOException | RuntimeException -> 0x02e1 }
            r28 = 0
            java.lang.String r11 = r0.A07     // Catch:{ IOException | RuntimeException -> 0x02e1 }
            X.D1Z r2 = r0.A03     // Catch:{ IOException | RuntimeException -> 0x02e1 }
            java.lang.Integer r10 = r2.A04     // Catch:{ IOException | RuntimeException -> 0x02e1 }
            r31 = 0
            r32 = 0
            if (r1 == 0) goto L_0x007c
            X.D2U r2 = r1.A01     // Catch:{ IOException | RuntimeException -> 0x02e1 }
            boolean r2 = r2.A0I     // Catch:{ IOException | RuntimeException -> 0x02e1 }
            r33 = 1
            if (r2 != 0) goto L_0x007e
        L_0x007c:
            r33 = 0
        L_0x007e:
            if (r1 == 0) goto L_0x0088
            X.D2U r2 = r1.A01     // Catch:{ IOException | RuntimeException -> 0x02e1 }
            boolean r2 = r2.A0J     // Catch:{ IOException | RuntimeException -> 0x02e1 }
            r34 = 1
            if (r2 != 0) goto L_0x008a
        L_0x0088:
            r34 = 0
        L_0x008a:
            if (r1 == 0) goto L_0x0094
            X.D2U r2 = r1.A01     // Catch:{ IOException | RuntimeException -> 0x02e1 }
            boolean r2 = r2.A0K     // Catch:{ IOException | RuntimeException -> 0x02e1 }
            r35 = 1
            if (r2 != 0) goto L_0x0096
        L_0x0094:
            r35 = 0
        L_0x0096:
            if (r1 == 0) goto L_0x00a0
            X.D2U r2 = r1.A01     // Catch:{ IOException | RuntimeException -> 0x02e1 }
            boolean r2 = r2.A0G     // Catch:{ IOException | RuntimeException -> 0x02e1 }
            r36 = 1
            if (r2 != 0) goto L_0x00a2
        L_0x00a0:
            r36 = 0
        L_0x00a2:
            r37 = 0
            r38 = 0
            r39 = 0
            r23 = r8
            r25 = r12
            r29 = r11
            r30 = r10
            r19 = r7
            r20 = r13
            r19.<init>(r20, r21, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39)     // Catch:{ IOException | RuntimeException -> 0x02e1 }
            r3.A00(r7)     // Catch:{ IOException | RuntimeException -> 0x02e1 }
        L_0x00ba:
            X.DCI r2 = r0.A02     // Catch:{ IOException | RuntimeException -> 0x02e1 }
            if (r2 == 0) goto L_0x00c3
            X.DCH r2 = r2.A0Z     // Catch:{ IOException | RuntimeException -> 0x02e1 }
            r3.A00(r2)     // Catch:{ IOException | RuntimeException -> 0x02e1 }
        L_0x00c3:
            X.D1Z r7 = r0.A03     // Catch:{ IOException | RuntimeException -> 0x02e1 }
            java.lang.Integer r2 = r7.A04     // Catch:{ IOException | RuntimeException -> 0x02e1 }
            if (r2 != 0) goto L_0x00cb
            java.lang.Integer r2 = p000X.Constants.ZERO     // Catch:{ IOException | RuntimeException -> 0x02e1 }
        L_0x00cb:
            int r27 = p000X.C43721uy.A00(r2)     // Catch:{ IOException | RuntimeException -> 0x02e1 }
            X.D1J r2 = new X.D1J     // Catch:{ IOException | RuntimeException -> 0x02e1 }
            X.Cuo r12 = r0.A04     // Catch:{ IOException | RuntimeException -> 0x02e1 }
            X.D1y r8 = r6.A01     // Catch:{ IOException | RuntimeException -> 0x02e1 }
            java.lang.String r11 = r8.A03     // Catch:{ IOException | RuntimeException -> 0x02e1 }
            X.D23 r10 = r8.A09     // Catch:{ IOException | RuntimeException -> 0x02e1 }
            X.Cv2 r8 = r3.A00     // Catch:{ IOException | RuntimeException -> 0x02e1 }
            r19 = r2
            X.Cv5 r25 = p000X.C29279Cv5.A00     // Catch:{ IOException | RuntimeException -> 0x02e1 }
            r20 = r12
            r21 = r11
            r22 = r10
            r23 = r3
            r24 = r8
            r19.<init>(r20, r21, r22, r23, r24, r25)     // Catch:{ IOException | RuntimeException -> 0x02e1 }
            X.D1M r1 = new X.D1M     // Catch:{ IOException | RuntimeException -> 0x02e1 }
            android.net.Uri r13 = r7.A02     // Catch:{ IOException | RuntimeException -> 0x02e1 }
            r43 = 0
            r50 = 0
            X.D1P r19 = new X.D1P     // Catch:{ IOException | RuntimeException -> 0x02e1 }
            com.google.android.exoplayer2.Format r3 = r7.A03     // Catch:{ IOException | RuntimeException -> 0x02e1 }
            java.lang.String r12 = r3.A0P     // Catch:{ IOException | RuntimeException -> 0x02e1 }
            int r3 = r3.A04     // Catch:{ IOException | RuntimeException -> 0x02e1 }
            long r10 = (long) r3     // Catch:{ IOException | RuntimeException -> 0x02e1 }
            r23 = 0
            int r8 = r7.A01     // Catch:{ IOException | RuntimeException -> 0x02e1 }
            int r7 = r7.A00     // Catch:{ IOException | RuntimeException -> 0x02e1 }
            r26 = -1
            r28 = 0
            r29 = 0
            r30 = -1
            r31 = -1
            X.D1B r3 = new X.D1B     // Catch:{ IOException | RuntimeException -> 0x02e1 }
            r3.<init>(r5)     // Catch:{ IOException | RuntimeException -> 0x02e1 }
            r34 = 0
            r36 = 0
            r37 = -1
            r39 = -1
            r41 = -1
            r42 = 0
            r20 = r12
            r21 = r10
            r24 = r8
            r25 = r7
            r33 = r3
            r19.<init>(r20, r21, r23, r24, r25, r26, r27, r28, r29, r30, r31, r33, r34, r36, r37, r39, r41, r42)     // Catch:{ IOException | RuntimeException -> 0x02e1 }
            r44 = 0
            r46 = 0
            r48 = -1
            r51 = 0
            r41 = r1
            r42 = r13
            r52 = r19
            r41.<init>(r42, r43, r44, r46, r48, r50, r51, r52)     // Catch:{ IOException | RuntimeException -> 0x02e1 }
            monitor-enter(r2)     // Catch:{ IOException | RuntimeException -> 0x02e1 }
            X.D1W r10 = new X.D1W     // Catch:{ all -> 0x02de }
            X.Cuo r3 = r2.A06     // Catch:{ all -> 0x02de }
            java.lang.String r7 = r3.A04     // Catch:{ all -> 0x02de }
            android.net.Uri r3 = r1.A04     // Catch:{ all -> 0x02de }
            r10.<init>(r7, r3)     // Catch:{ all -> 0x02de }
            X.D24 r16 = p000X.D1J.A0C     // Catch:{ all -> 0x02de }
            monitor-enter(r16)     // Catch:{ all -> 0x02de }
            X.D24 r3 = p000X.D1J.A0C     // Catch:{ all -> 0x02db }
            X.D15 r3 = r3.A00(r10)     // Catch:{ all -> 0x02db }
            if (r3 != 0) goto L_0x02aa
            X.D23 r8 = r2.A03     // Catch:{ all -> 0x02db }
            X.Cuo r3 = r2.A06     // Catch:{ all -> 0x02db }
            java.lang.String r7 = r3.A04     // Catch:{ all -> 0x02db }
            android.net.Uri r3 = r1.A04     // Catch:{ all -> 0x02db }
            byte[] r3 = r8.A01(r7, r3)     // Catch:{ all -> 0x02db }
            if (r3 != 0) goto L_0x02aa
            X.D1G r9 = new X.D1G     // Catch:{ all -> 0x02db }
            X.Cv5 r12 = r2.A04     // Catch:{ all -> 0x02db }
            java.lang.String r11 = r2.A08     // Catch:{ all -> 0x02db }
            int r22 = p000X.D1J.A09     // Catch:{ all -> 0x02db }
            int r23 = p000X.D1J.A0A     // Catch:{ all -> 0x02db }
            X.D23 r8 = r2.A03     // Catch:{ all -> 0x02db }
            X.D19 r7 = r2.A05     // Catch:{ all -> 0x02db }
            X.Cv2 r3 = r2.A07     // Catch:{ all -> 0x02db }
            java.lang.String r27 = p000X.D1J.A0B     // Catch:{ all -> 0x02db }
            r19 = r9
            r20 = r12
            r21 = r11
            r24 = r8
            r25 = r7
            r26 = r3
            r19.<init>(r20, r21, r22, r23, r24, r25, r26, r27)     // Catch:{ all -> 0x02db }
            X.D24 r13 = p000X.D1J.A0C     // Catch:{ all -> 0x02db }
            r13.A02(r10, r9)     // Catch:{ all -> 0x02db }
            monitor-exit(r16)     // Catch:{ all -> 0x02db }
            X.D1M r7 = p000X.D1J.A00(r2, r1, r5)     // Catch:{ IOException -> 0x02a1 }
            X.Cuo r12 = r2.A06     // Catch:{ IOException -> 0x02a1 }
            android.net.Uri r14 = r1.A04     // Catch:{ IOException -> 0x02a1 }
            X.D19 r3 = r9.A01     // Catch:{ IOException -> 0x02a1 }
            if (r3 == 0) goto L_0x0199
            X.1ux r1 = p000X.C43711ux.NOT_CACHED     // Catch:{ IOException -> 0x02a1 }
            r3.BSW(r7, r1)     // Catch:{ IOException -> 0x02a1 }
        L_0x0199:
            monitor-enter(r9)     // Catch:{ IOException -> 0x02a1 }
            r11 = 0
            r9.A04 = r11     // Catch:{ all -> 0x029e }
            r3 = -1
            r9.A01 = r3     // Catch:{ all -> 0x029e }
            r9.A00 = r3     // Catch:{ all -> 0x029e }
            r9.A00 = r3     // Catch:{ all -> 0x029e }
            r9.A06 = r5     // Catch:{ all -> 0x029e }
            monitor-exit(r9)     // Catch:{ all -> 0x029e }
            X.Cv5 r1 = r9.A0A     // Catch:{ IOException -> 0x02a1 }
            r19 = r1
            java.lang.String r1 = r9.A0B     // Catch:{ IOException -> 0x02a1 }
            r20 = r1
            X.D19 r1 = r9.A01     // Catch:{ IOException -> 0x02a1 }
            r21 = r1
            X.Cv2 r15 = r9.A03     // Catch:{ IOException -> 0x02a1 }
            int r8 = r9.A07     // Catch:{ IOException -> 0x02a1 }
            int r1 = r9.A08     // Catch:{ IOException -> 0x02a1 }
            r22 = r15
            r23 = r8
            r24 = r1
            r25 = r12
            X.D17 r1 = r19.A00(r20, r21, r22, r23, r24, r25)     // Catch:{ IOException -> 0x02a1 }
            java.lang.String r8 = r9.A03     // Catch:{ IOException -> 0x02a1 }
            if (r8 == 0) goto L_0x01e2
            java.lang.String r15 = r14.getHost()     // Catch:{ IOException -> 0x02a1 }
            java.lang.String r8 = "m-livestream-lookaside.facebook.com"
            boolean r8 = r15.equals(r8)     // Catch:{ IOException -> 0x02a1 }
            if (r8 == 0) goto L_0x01e2
            java.lang.String r15 = "OAuth "
            java.lang.String r8 = r9.A03     // Catch:{ IOException -> 0x02a1 }
            java.lang.String r15 = p000X.AnonymousClass000.A0E(r15, r8)     // Catch:{ IOException -> 0x02a1 }
            java.lang.String r8 = "Authorization"
            r1.BkD(r8, r15)     // Catch:{ IOException -> 0x02a1 }
        L_0x01e2:
            long r7 = r1.BWT(r7)     // Catch:{ IOException -> 0x0278 }
            monitor-enter(r9)     // Catch:{ IOException -> 0x0278 }
            X.D19 r15 = r9.A01     // Catch:{ all -> 0x0275 }
            r9.A01(r15)     // Catch:{ all -> 0x0275 }
            int r15 = (int) r7     // Catch:{ all -> 0x0275 }
            r9.A01 = r15     // Catch:{ all -> 0x0275 }
            r7 = 0
            if (r15 != r3) goto L_0x01f3
            r7 = 1
        L_0x01f3:
            r9.A05 = r7     // Catch:{ all -> 0x0275 }
            X.D17 r3 = r9.A02     // Catch:{ all -> 0x0275 }
            if (r3 == 0) goto L_0x0211
            java.util.Map r7 = r3.AUX()     // Catch:{ all -> 0x0275 }
            if (r7 == 0) goto L_0x0211
            java.lang.String r3 = "X-FB-Video-Livehead"
            java.lang.Object r3 = r7.get(r3)     // Catch:{ all -> 0x0275 }
            java.util.List r3 = (java.util.List) r3     // Catch:{ all -> 0x0275 }
            if (r3 == 0) goto L_0x0211
            boolean r3 = r3.isEmpty()     // Catch:{ all -> 0x0275 }
            if (r3 != 0) goto L_0x0211
            r9.A05 = r5     // Catch:{ all -> 0x0275 }
        L_0x0211:
            r9.A00 = r4     // Catch:{ all -> 0x0275 }
            int r3 = r9.A01     // Catch:{ all -> 0x0275 }
            r15 = 1048576(0x100000, float:1.469368E-39)
            if (r3 > r15) goto L_0x021c
            if (r3 < 0) goto L_0x021c
            r15 = r3
        L_0x021c:
            byte[] r8 = new byte[r15]     // Catch:{ all -> 0x0275 }
            r9.A02 = r1     // Catch:{ all -> 0x0275 }
            r9.A04 = r8     // Catch:{ all -> 0x0275 }
            r9.notifyAll()     // Catch:{ all -> 0x0275 }
            monitor-exit(r9)     // Catch:{ all -> 0x0275 }
        L_0x0226:
            boolean r3 = r9.A06     // Catch:{ IOException -> 0x0278 }
            if (r3 == 0) goto L_0x024d
            int r7 = r9.A00     // Catch:{ IOException -> 0x0278 }
            if (r7 >= r15) goto L_0x024d
            int r3 = r15 - r7
            int r7 = r1.read(r8, r7, r3)     // Catch:{ IOException -> 0x0278 }
            monitor-enter(r9)     // Catch:{ IOException -> 0x0278 }
            if (r7 >= 0) goto L_0x0238
            goto L_0x0244
        L_0x0238:
            int r3 = r9.A00     // Catch:{ all -> 0x024a }
            int r3 = r3 + r7
            r9.A00 = r3     // Catch:{ all -> 0x024a }
            if (r7 <= 0) goto L_0x0242
            r9.notifyAll()     // Catch:{ all -> 0x024a }
        L_0x0242:
            monitor-exit(r9)     // Catch:{ all -> 0x024a }
            goto L_0x0226
        L_0x0244:
            int r3 = r9.A00     // Catch:{ all -> 0x024a }
            r9.A01 = r3     // Catch:{ all -> 0x024a }
            monitor-exit(r9)     // Catch:{ all -> 0x024a }
            goto L_0x024d
        L_0x024a:
            r3 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x024a }
            goto L_0x0277
        L_0x024d:
            monitor-enter(r9)     // Catch:{ IOException -> 0x0278 }
            r9.A06 = r4     // Catch:{ all -> 0x0272 }
            int r7 = r9.A01     // Catch:{ all -> 0x0272 }
            int r3 = r9.A00     // Catch:{ all -> 0x0272 }
            if (r7 != r3) goto L_0x026d
            r1.close()     // Catch:{ IOException -> 0x0259 }
        L_0x0259:
            r9.A02 = r11     // Catch:{ all -> 0x026a }
            X.D23 r8 = r9.A09     // Catch:{ all -> 0x026a }
            if (r8 == 0) goto L_0x0268
            java.lang.String r7 = r12.A04     // Catch:{ all -> 0x026a }
            byte[] r3 = r9.A04     // Catch:{ all -> 0x026a }
            int r1 = r9.A01     // Catch:{ all -> 0x026a }
            r8.A00(r7, r14, r3, r1)     // Catch:{ all -> 0x026a }
        L_0x0268:
            r1 = r11
            goto L_0x026d
        L_0x026a:
            r3 = move-exception
            r1 = r11
            goto L_0x0273
        L_0x026d:
            r9.notifyAll()     // Catch:{ all -> 0x0272 }
            monitor-exit(r9)     // Catch:{ all -> 0x0272 }
            goto L_0x0292
        L_0x0272:
            r3 = move-exception
        L_0x0273:
            monitor-exit(r9)     // Catch:{ all -> 0x0272 }
            goto L_0x0277
        L_0x0275:
            r3 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x0275 }
        L_0x0277:
            throw r3     // Catch:{ IOException -> 0x0278 }
        L_0x0278:
            r7 = move-exception
            X.D19 r3 = r9.A01     // Catch:{ IOException -> 0x02a1 }
            if (r3 == 0) goto L_0x0280
            r3.BSS(r7)     // Catch:{ IOException -> 0x02a1 }
        L_0x0280:
            monitor-enter(r9)     // Catch:{ IOException -> 0x02a1 }
            r9.A06 = r4     // Catch:{ all -> 0x029b }
            r1.close()     // Catch:{ IOException -> 0x0286 }
        L_0x0286:
            r9.A02 = r11     // Catch:{ all -> 0x029b }
            int r1 = r9.A00     // Catch:{ all -> 0x029b }
            if (r1 < 0) goto L_0x0297
            r9.A04 = r7     // Catch:{ all -> 0x029b }
            r9.notifyAll()     // Catch:{ all -> 0x029b }
            monitor-exit(r9)     // Catch:{ all -> 0x029b }
        L_0x0292:
            r9.A01 = r11     // Catch:{ IOException -> 0x02a1 }
            int r9 = r9.A00     // Catch:{ IOException -> 0x02a1 }
            goto L_0x02ae
        L_0x0297:
            r9.notifyAll()     // Catch:{ all -> 0x029b }
            throw r7     // Catch:{ all -> 0x029b }
        L_0x029b:
            r1 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x029b }
            goto L_0x02a0
        L_0x029e:
            r1 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x029e }
        L_0x02a0:
            throw r1     // Catch:{ IOException -> 0x02a1 }
        L_0x02a1:
            r1 = move-exception
            monitor-enter(r16)     // Catch:{ all -> 0x02de }
            r13.A01(r10)     // Catch:{ all -> 0x02a8 }
        L_0x02a6:
            monitor-exit(r16)     // Catch:{ all -> 0x02a8 }
            goto L_0x02dd
        L_0x02a8:
            r1 = move-exception
            goto L_0x02a6
        L_0x02aa:
            monitor-exit(r16)     // Catch:{ all -> 0x02db }
            monitor-exit(r2)     // Catch:{ IOException | RuntimeException -> 0x02e1 }
            r9 = 0
            goto L_0x02af
        L_0x02ae:
            monitor-exit(r2)     // Catch:{ IOException | RuntimeException -> 0x02e1 }
        L_0x02af:
            java.lang.Integer r1 = p000X.Constants.ONE     // Catch:{ IOException | RuntimeException -> 0x02e1 }
            r0.A00(r1)     // Catch:{ IOException | RuntimeException -> 0x02e1 }
            java.lang.String r8 = "DashLiveSegmentPrefetcher"
            java.lang.String r7 = "[thread=%d] Prefetch is done, fetched: %d, url=%s, cacheKey=%s"
            r1 = 4
            java.lang.Object[] r3 = new java.lang.Object[r1]     // Catch:{ IOException | RuntimeException -> 0x02e1 }
            int r1 = r6.A00     // Catch:{ IOException | RuntimeException -> 0x02e1 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ IOException | RuntimeException -> 0x02e1 }
            r3[r4] = r1     // Catch:{ IOException | RuntimeException -> 0x02e1 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r9)     // Catch:{ IOException | RuntimeException -> 0x02e1 }
            r3[r5] = r1     // Catch:{ IOException | RuntimeException -> 0x02e1 }
            r3[r17] = r18     // Catch:{ IOException | RuntimeException -> 0x02e1 }
            r2 = 3
            X.D1Z r1 = r0.A03     // Catch:{ IOException | RuntimeException -> 0x02e1 }
            java.lang.String r1 = r1.A05     // Catch:{ IOException | RuntimeException -> 0x02e1 }
            if (r1 != 0) goto L_0x02d4
            java.lang.String r1 = "null"
        L_0x02d4:
            r3[r2] = r1     // Catch:{ IOException | RuntimeException -> 0x02e1 }
            p000X.C40431oe.A01(r8, r7, r3)     // Catch:{ IOException | RuntimeException -> 0x02e1 }
            goto L_0x0000
        L_0x02db:
            r1 = move-exception
            monitor-exit(r16)     // Catch:{ all -> 0x02db }
        L_0x02dd:
            throw r1     // Catch:{ all -> 0x02de }
        L_0x02de:
            r1 = move-exception
            monitor-exit(r2)     // Catch:{ IOException | RuntimeException -> 0x02e1 }
            throw r1     // Catch:{ IOException | RuntimeException -> 0x02e1 }
        L_0x02e1:
            r8 = move-exception
            boolean r1 = r8 instanceof p000X.C29264Cuq
            if (r1 == 0) goto L_0x0375
            java.lang.String r3 = "DashLiveSegmentPrefetcher"
            java.lang.Object[] r2 = new java.lang.Object[r5]
            r2[r4] = r18
            java.lang.String r1 = "Invalid response happens while fetching %s"
            p000X.C40431oe.A05(r3, r8, r1, r2)
            java.lang.Integer r1 = p000X.Constants.A0C
            r0.A00(r1)
            X.Cuq r8 = (p000X.C29264Cuq) r8
            int r2 = r8.A00
            r1 = 404(0x194, float:5.66E-43)
            if (r2 == r1) goto L_0x0318
            r1 = 410(0x19a, float:5.75E-43)
            if (r2 != r1) goto L_0x0000
            X.D29 r1 = r0.A05
            if (r1 == 0) goto L_0x0000
            X.2jU r2 = new X.2jU
            X.Cuo r0 = r0.A04
            java.lang.String r3 = r0.A04
            r6 = 0
            r7 = -1
            r5 = 410(0x19a, float:5.75E-43)
            r2.<init>(r3, r4, r5, r6, r7)
            r1.A00(r2)
            goto L_0x0000
        L_0x0318:
            X.D1y r1 = r6.A01
            boolean r1 = r1.A08
            if (r1 == 0) goto L_0x0000
            java.util.concurrent.atomic.AtomicBoolean r4 = r0.A0A
            monitor-enter(r4)
            java.util.concurrent.atomic.AtomicBoolean r2 = r0.A0A     // Catch:{ all -> 0x03ae }
            boolean r1 = r2.getAndSet(r5)     // Catch:{ all -> 0x03ae }
            if (r1 != 0) goto L_0x0372
            java.util.Collection r1 = r0.A09     // Catch:{ all -> 0x03ae }
            java.util.Iterator r3 = r1.iterator()     // Catch:{ all -> 0x03ae }
        L_0x032f:
            boolean r1 = r3.hasNext()     // Catch:{ all -> 0x03ae }
            if (r1 == 0) goto L_0x0341
            java.lang.Object r2 = r3.next()     // Catch:{ all -> 0x03ae }
            X.D1R r2 = (p000X.D1R) r2     // Catch:{ all -> 0x03ae }
            java.lang.Integer r1 = p000X.Constants.A0N     // Catch:{ all -> 0x03ae }
            r2.A00(r1)     // Catch:{ all -> 0x03ae }
            goto L_0x032f
        L_0x0341:
            X.D1u r5 = r0.A06     // Catch:{ all -> 0x03ae }
            java.lang.Object r3 = r5.A0G     // Catch:{ all -> 0x03ae }
            monitor-enter(r3)     // Catch:{ all -> 0x03ae }
            java.lang.Integer r1 = r5.A0L     // Catch:{ all -> 0x03ab }
            java.lang.Integer r0 = p000X.Constants.ONE     // Catch:{ all -> 0x03ab }
            if (r1 != r0) goto L_0x0371
            int r0 = r5.A03     // Catch:{ all -> 0x03ab }
            if (r0 <= 0) goto L_0x0371
            java.util.concurrent.atomic.AtomicInteger r0 = r5.A0I     // Catch:{ all -> 0x03ab }
            int r0 = r0.intValue()     // Catch:{ all -> 0x03ab }
            if (r0 <= 0) goto L_0x0371
            java.util.concurrent.atomic.AtomicInteger r0 = r5.A0I     // Catch:{ all -> 0x03ab }
            int r0 = r0.decrementAndGet()     // Catch:{ all -> 0x03ab }
            if (r0 < 0) goto L_0x0371
            java.lang.Integer r0 = p000X.Constants.A0j     // Catch:{ all -> 0x03ab }
            r5.A0L = r0     // Catch:{ all -> 0x03ab }
            android.os.Handler r2 = r5.A08     // Catch:{ all -> 0x03ab }
            X.D1h r1 = new X.D1h     // Catch:{ all -> 0x03ab }
            r1.<init>(r5)     // Catch:{ all -> 0x03ab }
            r0 = -865772510(0xffffffffcc655c22, float:-6.012532E7)
            p000X.AnonymousClass0ZA.A0E(r2, r1, r0)     // Catch:{ all -> 0x03ab }
        L_0x0371:
            monitor-exit(r3)     // Catch:{ all -> 0x03ab }
        L_0x0372:
            monitor-exit(r4)     // Catch:{ all -> 0x03ae }
            goto L_0x0000
        L_0x0375:
            int r1 = r0.A00
            int r7 = r1 + -1
            r0.A00 = r7
            if (r7 <= 0) goto L_0x0399
            java.lang.String r3 = "DashLiveSegmentPrefetcher"
            r1 = r17
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r2[r4] = r18
            java.lang.Integer r1 = java.lang.Integer.valueOf(r7)
            r2[r5] = r1
            java.lang.String r1 = "Error happens while fetching %s retry remain: %d"
            p000X.C40431oe.A05(r3, r8, r1, r2)
            X.D1y r1 = r6.A01
            java.util.concurrent.BlockingQueue r1 = r1.A0B
            r1.add(r0)
            goto L_0x0000
        L_0x0399:
            java.lang.Integer r1 = p000X.Constants.A0C
            r0.A00(r1)
            java.lang.String r2 = "DashLiveSegmentPrefetcher"
            java.lang.Object[] r1 = new java.lang.Object[r5]
            r1[r4] = r18
            java.lang.String r0 = "Error happens while fetching %s"
            p000X.C40431oe.A05(r2, r8, r0, r1)
            goto L_0x0000
        L_0x03ab:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x03ab }
            throw r0     // Catch:{ all -> 0x03ae }
        L_0x03ae:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x03ae }
            throw r0
        L_0x03b1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000X.D1K.run():void");
    }
}
