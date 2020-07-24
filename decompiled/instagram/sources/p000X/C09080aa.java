package p000X;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;

/* renamed from: X.0aa  reason: invalid class name and case insensitive filesystem */
public final class C09080aa implements AnonymousClass0Ba {
    public final AnonymousClass0MU A00;
    public final AnonymousClass0aZ A01;
    public final Object A02 = new Object();
    public final Map A03 = new HashMap();
    public final ExecutorService A04;

    public final void Bbx() {
    }

    public final void BcK(String str) {
    }

    public final void BcZ(String str, String str2) {
        AnonymousClass0Z9.A03(this.A04, new C04640Et(this, str, str2, (Throwable) null), 865798394);
    }

    public C09080aa(ExecutorService executorService) {
        AnonymousClass0MU r1 = new AnonymousClass0MU();
        this.A04 = executorService;
        this.A00 = r1;
        this.A01 = new AnonymousClass0aZ(this);
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processLoop(RegionMaker.java:225)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public static void A00(p000X.C09080aa r8, java.lang.Throwable r9) {
        /*
            X.0MU r0 = r8.A00
            if (r0 == 0) goto L_0x0056
            java.lang.Object r6 = r8.A02
            monitor-enter(r6)
            java.util.Map r0 = r8.A03     // Catch:{ all -> 0x0053 }
            java.util.Set r0 = r0.entrySet()     // Catch:{ all -> 0x0053 }
            java.util.Iterator r7 = r0.iterator()     // Catch:{ all -> 0x0053 }
        L_0x0011:
            boolean r0 = r7.hasNext()     // Catch:{ all -> 0x0053 }
            if (r0 == 0) goto L_0x0051
            java.lang.Object r0 = r7.next()     // Catch:{ all -> 0x0053 }
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch:{ all -> 0x0053 }
            java.lang.Object r5 = r0.getKey()     // Catch:{ all -> 0x0053 }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ all -> 0x0053 }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x0042 }
            X.4IP r0 = (p000X.AnonymousClass4IP) r0     // Catch:{ all -> 0x0042 }
            java.lang.String r0 = r0.getCustomData(r9)     // Catch:{ all -> 0x0042 }
            if (r0 != 0) goto L_0x003e
            X.0MU r1 = r8.A00     // Catch:{ all -> 0x0042 }
            if (r1 == 0) goto L_0x0011
            monitor-enter(r1)     // Catch:{ all -> 0x0042 }
            java.util.Map r0 = r1.A00     // Catch:{ all -> 0x003b }
            r0.remove(r5)     // Catch:{ all -> 0x003b }
            monitor-exit(r1)     // Catch:{ all -> 0x0042 }
            goto L_0x0011
        L_0x003b:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0042 }
            throw r0     // Catch:{ all -> 0x0042 }
        L_0x003e:
            r8.BYg(r5, r0)     // Catch:{ all -> 0x0042 }
            goto L_0x0011
        L_0x0042:
            r4 = move-exception
            java.lang.String r3 = "lacrima"
            java.lang.String r2 = "Failed to apply lazy supplier: %s"
            r0 = 1
            java.lang.Object[] r1 = new java.lang.Object[r0]     // Catch:{ all -> 0x0053 }
            r0 = 0
            r1[r0] = r5     // Catch:{ all -> 0x0053 }
            p000X.AnonymousClass0DB.A0Q(r3, r4, r2, r1)     // Catch:{ all -> 0x0053 }
            goto L_0x0011
        L_0x0051:
            monitor-exit(r6)     // Catch:{ all -> 0x0053 }
            return
        L_0x0053:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x0053 }
            throw r0
        L_0x0056:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000X.C09080aa.A00(X.0aa, java.lang.Throwable):void");
    }

    public final void BYg(String str, String str2) {
        AnonymousClass0MU r1 = this.A00;
        if (r1 != null) {
            synchronized (r1) {
                r1.A00.put(str, str2);
            }
        }
    }

    public final void Bp3(AnonymousClass0Bb r4) {
        AnonymousClass0Z9.A03(this.A04, new C04610Eq(this, r4), -698138254);
    }

    public final void Bp5(String str, String str2) {
        AnonymousClass0Bc r1 = new AnonymousClass0Bc();
        r1.A01 = str;
        r1.A02 = str2;
        Bp3(new AnonymousClass0Bb(r1));
    }

    public final void Bp6(String str, String str2, int i) {
        AnonymousClass0Bc r1 = new AnonymousClass0Bc();
        r1.A01 = str;
        r1.A02 = str2;
        r1.A00 = i;
        Bp3(new AnonymousClass0Bb(r1));
    }

    public final void Bca(String str, Throwable th) {
        String message = th.getMessage();
        if (message == null) {
            message = "Empty cause message";
        }
        AnonymousClass0Z9.A03(this.A04, new C04640Et(this, str, message, th), 865798394);
    }

    public final void Bp7(String str, String str2, Throwable th) {
        AnonymousClass0Bc A002 = AnonymousClass0Bb.A00(str, str2);
        A002.A03 = th;
        Bp3(new AnonymousClass0Bb(A002));
    }

    public final void Bp8(String str, String str2, Throwable th, int i) {
        AnonymousClass0Bc A002 = AnonymousClass0Bb.A00(str, str2);
        A002.A03 = th;
        A002.A00 = i;
        Bp3(new AnonymousClass0Bb(A002));
    }

    public final void Bp9(String str, Throwable th) {
        String message = th.getMessage();
        if (message == null) {
            message = "Empty cause message";
        }
        Bp7(str, message, th);
    }

    public final void BpB(String str, String str2) {
        AnonymousClass0Bc A002 = AnonymousClass0Bb.A00(str, str2);
        A002.A04 = true;
        Bp3(new AnonymousClass0Bb(A002));
    }

    public final void BpC(String str, String str2, Throwable th) {
        AnonymousClass0Bc A002 = AnonymousClass0Bb.A00(str, str2);
        A002.A04 = true;
        A002.A03 = th;
        Bp3(new AnonymousClass0Bb(A002));
    }

    public final void BpD(String str, Throwable th) {
        String message = th.getMessage();
        if (message == null) {
            message = "Empty cause message";
        }
        BpC(str, message, th);
    }

    public final void BpA(AnonymousClass0Bb r1) {
        Bp3(r1);
    }
}
