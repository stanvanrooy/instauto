package p000X;

import android.content.Context;
import android.os.Build;
import com.facebook.common.time.RealtimeSinceBootClock;
import com.google.common.collect.EvictingQueue;
import java.util.Set;

/* renamed from: X.1vJ  reason: invalid class name and case insensitive filesystem */
public final class C43931vJ implements AnonymousClass0Q6, C06570Po {
    public static final Integer A09 = Constants.ONE;
    public long A00;
    public AnonymousClass2IT A01;
    public AnonymousClass0C1 A02;
    public boolean A03;
    public final Context A04;
    public final C04140Cp A05 = RealtimeSinceBootClock.A00;
    public final EvictingQueue A06 = new EvictingQueue(10);
    public final C43851vB A07;
    public final String A08;

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
    private synchronized void A00() {
        /*
            r3 = this;
            monitor-enter(r3)
            X.2IT r0 = r3.A01     // Catch:{ Exception -> 0x001b }
            if (r0 == 0) goto L_0x0023
            boolean r0 = r0.isDone()     // Catch:{ Exception -> 0x001b }
            if (r0 != 0) goto L_0x0023
            X.2IT r1 = r3.A01     // Catch:{ Exception -> 0x001b }
            r0 = 1
            r1.cancel(r0)     // Catch:{ Exception -> 0x001b }
            r1 = r3
            monitor-enter(r1)     // Catch:{ Exception -> 0x001b }
            r0 = 0
            r3.A01 = r0     // Catch:{ all -> 0x0018 }
            monitor-exit(r1)     // Catch:{ Exception -> 0x001b }
            goto L_0x0023
        L_0x0018:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ Exception -> 0x001b }
            throw r0     // Catch:{ Exception -> 0x001b }
        L_0x001b:
            r2 = move-exception
            java.lang.String r1 = "ForegroundLocation"
            java.lang.String r0 = "location-stop"
            p000X.AnonymousClass0QD.A05(r1, r0, r2)     // Catch:{ all -> 0x0025 }
        L_0x0023:
            monitor-exit(r3)
            return
        L_0x0025:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000X.C43931vJ.A00():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00de, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00df, code lost:
        p000X.AnonymousClass0QD.A05("ForegroundLocation", "location-start", r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00e8, code lost:
        if (r9.A03 != false) goto L_0x00ea;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00ea, code lost:
        r9.A00();
        r9.A03 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:?, code lost:
        return;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    public static void A01(C43931vJ r9) {
        if (!r9.A03 && r9.A02 != null) {
            if (r9.A05.now() - r9.A00 >= 21600000 && !AnonymousClass0Q7.A03().A0H() && C16230oG.isLocationEnabled(r9.A04) && C16230oG.isLocationPermitted(r9.A04)) {
                synchronized (r9) {
                    boolean z = false;
                    if (Build.VERSION.SDK_INT >= 29) {
                        z = true;
                    }
                    if ((z && AnonymousClass0Q7.A03().A0J()) || AnonymousClass0Q7.A03().A0H()) {
                        AnonymousClass0Q7.A03().A0H();
                    } else if (C44081vZ.A00(r9.A07.A04(), Constants.A0C, (Set) null, (Set) null) == Constants.A0N) {
                        r9.A00();
                        AnonymousClass2IT A062 = r9.A07.A06();
                        r9.A01 = A062;
                        C50862Id r4 = new C50862Id(A09);
                        r4.A05 = 7000;
                        r4.A07 = 1800000L;
                        r4.A00 = 10000.0f;
                        C50872Ie r7 = new C50872Ie(r4);
                        C50882If r42 = new C50882If(7000, 1800000);
                        boolean z2 = false;
                        if (Build.VERSION.SDK_INT >= 29) {
                            z2 = true;
                        }
                        boolean z3 = false;
                        if (!z2) {
                            z3 = true;
                        }
                        C50892Ig r2 = new C50892Ig();
                        r2.A07 = true;
                        r2.A01 = r7;
                        r2.A05 = z3;
                        r2.A08 = true;
                        r2.A03 = r42;
                        r2.A06 = true;
                        A062.A04(new C50902Ih(r2), "LocationIntegrity");
                        r9.A00 = r9.A05.now();
                        AnonymousClass2MU.A03(A062, new AnonymousClass2TP(r9), r9.A07.A09());
                    }
                }
                r9.A03 = true;
            }
        }
    }

    public final void onUserSessionWillEnd(boolean z) {
        this.A06.clear();
        if (this.A03) {
            A00();
            this.A03 = false;
        }
        AnonymousClass0Q7.A03().A0D(this);
        this.A02 = null;
    }

    public C43931vJ(Context context, AnonymousClass0C1 r4) {
        this.A04 = context;
        this.A02 = r4;
        this.A07 = C43851vB.A00(context, r4);
        this.A08 = C05860Mt.A02.A05(context);
    }

    public final void onAppBackgrounded() {
        int A032 = AnonymousClass0Z0.A03(1244204663);
        if (this.A03) {
            A00();
            this.A03 = false;
        }
        AnonymousClass0Z0.A0A(-1938926280, A032);
    }

    public final void onAppForegrounded() {
        int A032 = AnonymousClass0Z0.A03(983655291);
        C12000g1.A01.A00(new C43971vO(this));
        AnonymousClass0Z0.A0A(772878599, A032);
    }
}
