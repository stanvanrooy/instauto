package p000X;

import android.content.Context;
import android.content.ServiceConnection;
import com.facebook.push.fbns.ipc.FbnsAIDLRequest;
import com.facebook.push.fbns.ipc.IFbnsAIDLService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: X.0Wl  reason: invalid class name and case insensitive filesystem */
public final class C08290Wl {
    public int A00 = 0;
    public IFbnsAIDLService A01 = null;
    public Integer A02 = Constants.ZERO;
    public final Context A03;
    public final ServiceConnection A04 = new C08270Wh(this);
    public final ExecutorService A05 = Executors.newFixedThreadPool(5);

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
    public static void A00(p000X.C08290Wl r3) {
        /*
            monitor-enter(r3)
            int r1 = r3.A00     // Catch:{ all -> 0x0029 }
            r0 = 1
            int r1 = r1 - r0
            r3.A00 = r1     // Catch:{ all -> 0x0029 }
            if (r1 != 0) goto L_0x0020
            monitor-enter(r3)     // Catch:{ all -> 0x0029 }
            r0 = 0
            r3.A01 = r0     // Catch:{ all -> 0x0012 }
            java.lang.Integer r0 = p000X.Constants.ZERO     // Catch:{ all -> 0x0012 }
            r3.A02 = r0     // Catch:{ all -> 0x0012 }
            goto L_0x0015
        L_0x0012:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0029 }
            throw r0     // Catch:{ all -> 0x0029 }
        L_0x0015:
            monitor-exit(r3)     // Catch:{ all -> 0x0029 }
            android.content.Context r2 = r3.A03     // Catch:{ all -> 0x0029 }
            android.content.ServiceConnection r1 = r3.A04     // Catch:{ all -> 0x0029 }
            r0 = -193509335(0xfffffffff4774829, float:-7.8366755E31)
            p000X.AnonymousClass0ZI.A01(r2, r1, r0)     // Catch:{ all -> 0x0029 }
        L_0x0020:
            monitor-exit(r3)     // Catch:{ all -> 0x0029 }
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.getId()
            return
        L_0x0029:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0029 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000X.C08290Wl.A00(X.0Wl):void");
    }

    public final void A01(FbnsAIDLRequest... fbnsAIDLRequestArr) {
        for (FbnsAIDLRequest r0 : fbnsAIDLRequestArr) {
            AnonymousClass0Z9.A02(this.A05, new C08280Wi(this, r0), -853626468);
        }
    }

    public final void finalize() {
        this.A05.shutdown();
    }

    public C08290Wl(Context context) {
        this.A03 = context;
    }
}
