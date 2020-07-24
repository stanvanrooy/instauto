package p000X;

/* renamed from: X.BDE */
public final class BDE implements AnonymousClass10W, BD6 {
    public int A00;
    public int A01;
    public BDR[] A02 = new BDR[2];
    public int A03;
    public volatile Object _state;

    public final BD6 AEn(AnonymousClass2GC r2, int i) {
        if (i == -1 || i == 0) {
            return this;
        }
        return new BD2(this, r2, i);
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
        	at jadx.core.dex.visitors.regions.RegionMaker.makeEndlessLoop(RegionMaker.java:368)
        	at jadx.core.dex.visitors.regions.RegionMaker.processLoop(RegionMaker.java:172)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:106)
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
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public final void A00(java.lang.Object r10) {
        /*
            r9 = this;
            if (r10 != 0) goto L_0x0004
            X.10F r10 = p000X.C52852Ql.A01
        L_0x0004:
            monitor-enter(r9)
            java.lang.Object r0 = r9._state     // Catch:{ all -> 0x005f }
            boolean r0 = p000X.C13150hy.A05(r0, r10)     // Catch:{ all -> 0x005f }
            if (r0 != 0) goto L_0x005d
            r9._state = r10     // Catch:{ all -> 0x005f }
            int r1 = r9.A03     // Catch:{ all -> 0x005f }
            r0 = r1 & 1
            if (r0 != 0) goto L_0x0059
            int r8 = r1 + 1
            r9.A03 = r8     // Catch:{ all -> 0x005f }
            X.BDR[] r7 = r9.A02     // Catch:{ all -> 0x005f }
        L_0x001b:
            monitor-exit(r9)
            int r6 = r7.length
            r5 = 0
        L_0x001e:
            if (r5 >= r6) goto L_0x004b
            r4 = r7[r5]
            if (r4 == 0) goto L_0x0038
        L_0x0024:
            java.lang.Object r3 = r4._state
            if (r3 == 0) goto L_0x0038
            X.10F r2 = p000X.BDT.A01
            if (r3 == r2) goto L_0x0038
            X.10F r1 = p000X.BDT.A00
            if (r3 != r1) goto L_0x003b
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = p000X.BDR.A00
            boolean r0 = r0.compareAndSet(r4, r3, r2)
            if (r0 == 0) goto L_0x0024
        L_0x0038:
            int r5 = r5 + 1
            goto L_0x001e
        L_0x003b:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = p000X.BDR.A00
            boolean r0 = r0.compareAndSet(r4, r3, r1)
            if (r0 == 0) goto L_0x0024
            X.2Hp r3 = (p000X.C50722Hp) r3
            X.2Ha r0 = p000X.C50622Ha.A00
            r3.Be0(r0)
            goto L_0x0038
        L_0x004b:
            monitor-enter(r9)
            int r0 = r9.A03     // Catch:{ all -> 0x005f }
            if (r0 != r8) goto L_0x0055
            int r0 = r8 + 1
            r9.A03 = r0     // Catch:{ all -> 0x005f }
            goto L_0x005d
        L_0x0055:
            r8 = r0
            X.BDR[] r7 = r9.A02     // Catch:{ all -> 0x005f }
            goto L_0x001b
        L_0x0059:
            int r0 = r1 + 2
            r9.A03 = r0     // Catch:{ all -> 0x005f }
        L_0x005d:
            monitor-exit(r9)
            return
        L_0x005f:
            r0 = move-exception
            monitor-exit(r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000X.BDE.A00(java.lang.Object):void");
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00b2 A[Catch:{ all -> 0x0158 }] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00c5 A[Catch:{ all -> 0x0158 }] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00d2 A[Catch:{ all -> 0x0158 }] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00da A[Catch:{ all -> 0x0158 }] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00e7 A[Catch:{ all -> 0x0158 }] */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00ea A[Catch:{ all -> 0x0158 }] */
    public final java.lang.Object A91(p000X.AnonymousClass2HP r15, p000X.C233910f r16) {
        /*
            r14 = this;
            r3 = r16
            boolean r0 = r3 instanceof p000X.C50752Hs
            if (r0 == 0) goto L_0x0032
            r9 = r3
            X.2Hs r9 = (p000X.C50752Hs) r9
            int r2 = r9.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0032
            int r2 = r2 - r1
            r9.A00 = r2
        L_0x0014:
            java.lang.Object r1 = r9.A06
            X.2I1 r8 = p000X.AnonymousClass2I1.COROUTINE_SUSPENDED
            int r0 = r9.A00
            r6 = 0
            r7 = 2
            r5 = 1
            if (r0 == 0) goto L_0x0052
            if (r0 == r5) goto L_0x0040
            if (r0 != r7) goto L_0x0038
            java.lang.Object r4 = r9.A04
            java.lang.Object r2 = r9.A03
            X.BDR r2 = (p000X.BDR) r2
            java.lang.Object r15 = r9.A02
            X.2HP r15 = (p000X.AnonymousClass2HP) r15
            java.lang.Object r3 = r9.A01
            X.BDE r3 = (p000X.BDE) r3
            goto L_0x009f
        L_0x0032:
            X.2Hs r9 = new X.2Hs
            r9.<init>(r14, r3)
            goto L_0x0014
        L_0x0038:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L_0x0040:
            java.lang.Object r12 = r9.A05
            java.lang.Object r2 = r9.A03
            X.BDR r2 = (p000X.BDR) r2
            java.lang.Object r15 = r9.A02
            X.2HP r15 = (p000X.AnonymousClass2HP) r15
            java.lang.Object r3 = r9.A01
            X.BDE r3 = (p000X.BDE) r3
            p000X.AnonymousClass2I2.A01(r1)     // Catch:{ all -> 0x0158 }
            goto L_0x00c7
        L_0x0052:
            p000X.AnonymousClass2I2.A01(r1)
            r3 = r14
            monitor-enter(r3)
            X.BDR[] r2 = r14.A02     // Catch:{ all -> 0x0164 }
            int r1 = r2.length     // Catch:{ all -> 0x0164 }
            int r0 = r14.A00     // Catch:{ all -> 0x0164 }
            if (r0 < r1) goto L_0x006d
            int r0 = r1 << 1
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r2, r0)     // Catch:{ all -> 0x0164 }
            java.lang.String r0 = "java.util.Arrays.copyOf(this, newSize)"
            p000X.C13150hy.A01(r1, r0)     // Catch:{ all -> 0x0164 }
            X.BDR[] r1 = (p000X.BDR[]) r1     // Catch:{ all -> 0x0164 }
            r14.A02 = r1     // Catch:{ all -> 0x0164 }
        L_0x006d:
            int r1 = r14.A01     // Catch:{ all -> 0x0164 }
        L_0x006f:
            X.BDR[] r0 = r14.A02     // Catch:{ all -> 0x0164 }
            r2 = r0[r1]     // Catch:{ all -> 0x0164 }
            if (r2 != 0) goto L_0x007e
            X.BDR r2 = new X.BDR     // Catch:{ all -> 0x0164 }
            r2.<init>()     // Catch:{ all -> 0x0164 }
            X.BDR[] r0 = r14.A02     // Catch:{ all -> 0x0164 }
            r0[r1] = r2     // Catch:{ all -> 0x0164 }
        L_0x007e:
            int r1 = r1 + 1
            X.BDR[] r0 = r14.A02     // Catch:{ all -> 0x0164 }
            int r0 = r0.length     // Catch:{ all -> 0x0164 }
            if (r1 < r0) goto L_0x0086
            r1 = 0
        L_0x0086:
            java.lang.Object r0 = r2._state     // Catch:{ all -> 0x0164 }
            if (r0 == 0) goto L_0x008b
            goto L_0x0091
        L_0x008b:
            X.10F r0 = p000X.BDT.A00     // Catch:{ all -> 0x0164 }
            r2._state = r0     // Catch:{ all -> 0x0164 }
            r0 = 1
            goto L_0x0092
        L_0x0091:
            r0 = 0
        L_0x0092:
            if (r0 == 0) goto L_0x006f
            r14.A01 = r1     // Catch:{ all -> 0x0164 }
            int r0 = r14.A00     // Catch:{ all -> 0x0164 }
            int r0 = r0 + 1
            r14.A00 = r0     // Catch:{ all -> 0x0164 }
            monitor-exit(r3)
            r4 = r6
            goto L_0x00a2
        L_0x009f:
            p000X.AnonymousClass2I2.A01(r1)     // Catch:{ all -> 0x0158 }
        L_0x00a2:
            java.lang.Object r12 = r3._state     // Catch:{ all -> 0x0158 }
            if (r4 == 0) goto L_0x00ad
            boolean r0 = p000X.C13150hy.A05(r12, r4)     // Catch:{ all -> 0x0158 }
            r0 = r0 ^ r5
            if (r0 == 0) goto L_0x00c8
        L_0x00ad:
            X.10F r1 = p000X.C52852Ql.A01     // Catch:{ all -> 0x0158 }
            r0 = r12
            if (r12 != r1) goto L_0x00b3
            r0 = r6
        L_0x00b3:
            r9.A01 = r3     // Catch:{ all -> 0x0158 }
            r9.A02 = r15     // Catch:{ all -> 0x0158 }
            r9.A03 = r2     // Catch:{ all -> 0x0158 }
            r9.A04 = r4     // Catch:{ all -> 0x0158 }
            r9.A05 = r12     // Catch:{ all -> 0x0158 }
            r9.A00 = r5     // Catch:{ all -> 0x0158 }
            java.lang.Object r0 = r15.ACq(r0, r9)     // Catch:{ all -> 0x0158 }
            if (r0 != r8) goto L_0x00c7
            goto L_0x0151
        L_0x00c7:
            r4 = r12
        L_0x00c8:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = p000X.BDR.A00     // Catch:{ all -> 0x0158 }
            X.10F r0 = p000X.BDT.A00     // Catch:{ all -> 0x0158 }
            java.lang.Object r11 = r1.getAndSet(r2, r0)     // Catch:{ all -> 0x0158 }
            if (r11 != 0) goto L_0x00d5
            p000X.C13150hy.A00()     // Catch:{ all -> 0x0158 }
        L_0x00d5:
            boolean r13 = p000X.AnonymousClass2GE.A01     // Catch:{ all -> 0x0158 }
            r10 = 1
            if (r13 == 0) goto L_0x00e3
            boolean r1 = r11 instanceof p000X.C50722Hp     // Catch:{ all -> 0x0158 }
            r0 = 0
            if (r1 != 0) goto L_0x00e0
            r0 = 1
        L_0x00e0:
            if (r0 != 0) goto L_0x00e3
            goto L_0x0152
        L_0x00e3:
            X.10F r0 = p000X.BDT.A01     // Catch:{ all -> 0x0158 }
            if (r11 == r0) goto L_0x00e8
            r10 = 0
        L_0x00e8:
            if (r10 != 0) goto L_0x00a2
            r9.A01 = r3     // Catch:{ all -> 0x0158 }
            r9.A02 = r15     // Catch:{ all -> 0x0158 }
            r9.A03 = r2     // Catch:{ all -> 0x0158 }
            r9.A04 = r4     // Catch:{ all -> 0x0158 }
            r9.A05 = r12     // Catch:{ all -> 0x0158 }
            r9.A00 = r7     // Catch:{ all -> 0x0158 }
            X.2Hp r10 = new X.2Hp     // Catch:{ all -> 0x0158 }
            X.10f r0 = p000X.AnonymousClass2H2.A00(r9)     // Catch:{ all -> 0x0158 }
            r11 = 1
            r10.<init>(r0, r5)     // Catch:{ all -> 0x0158 }
            p000X.C50722Hp.A03(r10)     // Catch:{ all -> 0x0158 }
            if (r13 == 0) goto L_0x011d
            java.lang.Object r0 = r2._state     // Catch:{ all -> 0x0158 }
            boolean r1 = r0 instanceof p000X.C50722Hp     // Catch:{ all -> 0x0158 }
            r0 = 0
            if (r1 != 0) goto L_0x010d
            r0 = 1
        L_0x010d:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x0158 }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x0158 }
            if (r0 != 0) goto L_0x011d
            java.lang.AssertionError r0 = new java.lang.AssertionError     // Catch:{ all -> 0x0158 }
            r0.<init>()     // Catch:{ all -> 0x0158 }
            goto L_0x0157
        L_0x011d:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = p000X.BDR.A00     // Catch:{ all -> 0x0158 }
            X.10F r0 = p000X.BDT.A00     // Catch:{ all -> 0x0158 }
            boolean r0 = r1.compareAndSet(r2, r0, r10)     // Catch:{ all -> 0x0158 }
            if (r0 != 0) goto L_0x0145
            if (r13 == 0) goto L_0x0140
            java.lang.Object r1 = r2._state     // Catch:{ all -> 0x0158 }
            X.10F r0 = p000X.BDT.A01     // Catch:{ all -> 0x0158 }
            if (r1 == r0) goto L_0x0130
            r11 = 0
        L_0x0130:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r11)     // Catch:{ all -> 0x0158 }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x0158 }
            if (r0 != 0) goto L_0x0140
            java.lang.AssertionError r0 = new java.lang.AssertionError     // Catch:{ all -> 0x0158 }
            r0.<init>()     // Catch:{ all -> 0x0158 }
            goto L_0x0157
        L_0x0140:
            X.2Ha r0 = p000X.C50622Ha.A00     // Catch:{ all -> 0x0158 }
            r10.Be0(r0)     // Catch:{ all -> 0x0158 }
        L_0x0145:
            java.lang.Object r0 = r10.A09()     // Catch:{ all -> 0x0158 }
            if (r0 != r8) goto L_0x014e
            p000X.C25301BCs.A00(r9)     // Catch:{ all -> 0x0158 }
        L_0x014e:
            if (r0 != r8) goto L_0x00a2
            return r8
        L_0x0151:
            return r8
        L_0x0152:
            java.lang.AssertionError r0 = new java.lang.AssertionError     // Catch:{ all -> 0x0158 }
            r0.<init>()     // Catch:{ all -> 0x0158 }
        L_0x0157:
            throw r0     // Catch:{ all -> 0x0158 }
        L_0x0158:
            r1 = move-exception
            monitor-enter(r3)
            r2._state = r6     // Catch:{ all -> 0x0164 }
            int r0 = r3.A00     // Catch:{ all -> 0x0164 }
            int r0 = r0 + -1
            r3.A00 = r0     // Catch:{ all -> 0x0164 }
            monitor-exit(r3)
            throw r1
        L_0x0164:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000X.BDE.A91(X.2HP, X.10f):java.lang.Object");
    }

    public BDE(Object obj) {
        this._state = obj;
    }
}
