package com.instagram.creation.photo.edit.luxfilter;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import com.instagram.filterkit.filter.BaseSimpleFilter;
import com.instagram.util.creation.ShaderBridge;
import p000X.AnonymousClass0C1;
import p000X.AnonymousClass82K;
import p000X.AnonymousClass8U1;
import p000X.AnonymousClass8U6;
import p000X.C89433uD;

public class LocalLaplacianFilter extends BaseSimpleFilter {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(307);
    public int A00;
    public int A01;
    public AnonymousClass82K A02;
    public AnonymousClass8U6 A03;

    public final AnonymousClass8U1 A0C(C89433uD r3) {
        int A002 = ShaderBridge.A00("Laplacian");
        if (A002 == 0) {
            return null;
        }
        AnonymousClass8U1 r1 = new AnonymousClass8U1(A002);
        this.A03 = (AnonymousClass8U6) r1.A00("u_strength");
        return r1;
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
    public final void A0E(p000X.AnonymousClass8U1 r8, p000X.C89433uD r9, p000X.C89133th r10, p000X.AnonymousClass85B r11) {
        /*
            r7 = this;
            X.8U6 r2 = r7.A03
            int r1 = r7.A00
            int r0 = r7.A01
            int r1 = r1 + r0
            float r1 = (float) r1
            r0 = 1120403456(0x42c80000, float:100.0)
            float r1 = r1 / r0
            r2.A02(r1)
            X.82K r3 = r7.A02
            monitor-enter(r3)
            java.util.concurrent.atomic.AtomicInteger r0 = r3.A07     // Catch:{ all -> 0x007d }
            int r1 = r0.get()     // Catch:{ all -> 0x007d }
            r0 = -1
            if (r1 != r0) goto L_0x0059
            java.util.concurrent.BlockingQueue r0 = r3.A05     // Catch:{ InterruptedException -> 0x0056 }
            java.lang.Object r6 = r0.take()     // Catch:{ InterruptedException -> 0x0056 }
            X.82x r6 = (p000X.C1884782x) r6     // Catch:{ InterruptedException -> 0x0056 }
            monitor-enter(r3)     // Catch:{ InterruptedException -> 0x0056 }
            long r1 = r6.A02     // Catch:{ all -> 0x0053 }
            int r4 = r6.A01     // Catch:{ all -> 0x0053 }
            int r0 = r6.A00     // Catch:{ all -> 0x0053 }
            int r1 = com.instagram.util.jpeg.JpegBridge.loadBufferToTexture(r1, r4, r0)     // Catch:{ all -> 0x0053 }
            java.util.concurrent.atomic.AtomicInteger r0 = r3.A07     // Catch:{ all -> 0x0053 }
            r0.set(r1)     // Catch:{ all -> 0x0053 }
            if (r6 == 0) goto L_0x0046
            long r4 = r6.A02     // Catch:{ all -> 0x0053 }
            r1 = 0
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0046
            com.instagram.creation.photo.edit.luxfilter.HalideBridge.free(r4)     // Catch:{ all -> 0x0053 }
            r6.A02 = r1     // Catch:{ all -> 0x0053 }
            r0 = 0
            r6.A01 = r0     // Catch:{ all -> 0x0053 }
            r6.A00 = r0     // Catch:{ all -> 0x0053 }
        L_0x0046:
            java.util.Set r0 = r3.A04     // Catch:{ all -> 0x0053 }
            r0.add(r7)     // Catch:{ all -> 0x0053 }
            java.util.concurrent.atomic.AtomicInteger r0 = r3.A07     // Catch:{ all -> 0x0053 }
            int r1 = r0.get()     // Catch:{ all -> 0x0053 }
            monitor-exit(r3)     // Catch:{ all -> 0x0053 }
            goto L_0x0066
        L_0x0053:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0053 }
            throw r0     // Catch:{ InterruptedException -> 0x0056 }
        L_0x0056:
            monitor-exit(r3)
            r1 = -1
            goto L_0x0067
        L_0x0059:
            monitor-enter(r3)     // Catch:{ all -> 0x007d }
            java.util.Set r0 = r3.A04     // Catch:{ all -> 0x007a }
            r0.add(r7)     // Catch:{ all -> 0x007a }
            java.util.concurrent.atomic.AtomicInteger r0 = r3.A07     // Catch:{ all -> 0x007a }
            int r1 = r0.get()     // Catch:{ all -> 0x007a }
            monitor-exit(r3)     // Catch:{ all -> 0x007a }
        L_0x0066:
            monitor-exit(r3)
        L_0x0067:
            java.lang.String r0 = "localLaplacian"
            r8.A03(r0, r1)
            int r3 = r10.getTextureId()
            java.lang.Integer r2 = p000X.Constants.ZERO
            java.lang.Integer r1 = p000X.Constants.ONE
            java.lang.String r0 = "image"
            r8.A04(r0, r3, r2, r1)
            return
        L_0x007a:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x007a }
            throw r0     // Catch:{ all -> 0x007d }
        L_0x007d:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.photo.edit.luxfilter.LocalLaplacianFilter.A0E(X.8U1, X.3uD, X.3th, X.85B):void");
    }

    public final void A8Y(C89433uD r2) {
        super.A8Y(r2);
        this.A02.A02(this);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A01);
    }

    public LocalLaplacianFilter(AnonymousClass0C1 r1) {
        super(r1);
    }

    public LocalLaplacianFilter(Parcel parcel) {
        super(parcel);
        this.A00 = parcel.readInt();
        invalidate();
        this.A01 = parcel.readInt();
        invalidate();
    }
}
