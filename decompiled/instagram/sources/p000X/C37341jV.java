package p000X;

import android.content.Context;

/* renamed from: X.1jV  reason: invalid class name and case insensitive filesystem */
public final class C37341jV {
    public static byte[] A07;
    public final int A00;
    public final Context A01;
    public final C252818e A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final boolean A06;

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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public final android.graphics.Bitmap A00() {
        /*
            r21 = this;
            r2 = r21
            X.18e r0 = r2.A02
            X.12C r0 = r0.A05
            X.18Q r5 = r0.A0D
            java.lang.String r4 = r2.A03
            r1 = 1
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            java.lang.String r3 = "mini_preview"
            X.1iC r0 = r5.A07(r4, r1, r0, r3)
            if (r0 == 0) goto L_0x0018
            android.graphics.Bitmap r0 = r0.A01
            return r0
        L_0x0018:
            r9 = 0
            java.lang.Class<X.1jV> r8 = p000X.C37341jV.class
            monitor-enter(r8)     // Catch:{ IOException -> 0x00bc }
            android.content.Context r1 = r2.A01     // Catch:{ all -> 0x00b9 }
            java.lang.String r7 = r2.A04     // Catch:{ all -> 0x00b9 }
            monitor-enter(r8)     // Catch:{ all -> 0x00b9 }
            r6 = r8
            monitor-enter(r6)     // Catch:{ all -> 0x00b6 }
            byte[] r0 = A07     // Catch:{ all -> 0x00b3 }
            if (r0 != 0) goto L_0x0053
            r0 = 2048(0x800, float:2.87E-42)
            byte[] r0 = new byte[r0]     // Catch:{ all -> 0x00b3 }
            A07 = r0     // Catch:{ all -> 0x00b3 }
            r5 = 0
            android.content.res.Resources r1 = r1.getResources()     // Catch:{ IOException -> 0x0045 }
            r0 = 2131755043(0x7f100023, float:1.9140954E38)
            java.io.InputStream r5 = r1.openRawResource(r0)     // Catch:{ IOException -> 0x0045 }
            byte[] r4 = A07     // Catch:{ IOException -> 0x0045 }
            r1 = 0
            r0 = 607(0x25f, float:8.5E-43)
            r5.read(r4, r1, r0)     // Catch:{ IOException -> 0x0045 }
            r5.close()     // Catch:{ all -> 0x00b3 }
            goto L_0x0053
        L_0x0045:
            r1 = move-exception
            java.lang.String r0 = "mini_preview_image_loader"
            p000X.AnonymousClass0QD.A09(r0, r1)     // Catch:{ all -> 0x004c }
            throw r1     // Catch:{ all -> 0x004c }
        L_0x004c:
            r0 = move-exception
            if (r5 == 0) goto L_0x0052
            r5.close()     // Catch:{ all -> 0x00b3 }
        L_0x0052:
            throw r0     // Catch:{ all -> 0x00b3 }
        L_0x0053:
            monitor-exit(r6)     // Catch:{ all -> 0x00b6 }
            r0 = 0
            byte[] r6 = android.util.Base64.decode(r7, r0)     // Catch:{ all -> 0x00b6 }
            byte[] r5 = A07     // Catch:{ all -> 0x00b6 }
            r1 = 162(0xa2, float:2.27E-43)
            r0 = 1
            byte r0 = r6[r0]     // Catch:{ all -> 0x00b6 }
            r5[r1] = r0     // Catch:{ all -> 0x00b6 }
            r1 = 160(0xa0, float:2.24E-43)
            r0 = 2
            byte r0 = r6[r0]     // Catch:{ all -> 0x00b6 }
            r5[r1] = r0     // Catch:{ all -> 0x00b6 }
            r1 = 607(0x25f, float:8.5E-43)
            int r4 = r6.length     // Catch:{ all -> 0x00b6 }
            r0 = 3
            int r4 = r4 - r0
            java.lang.System.arraycopy(r6, r0, r5, r1, r4)     // Catch:{ all -> 0x00b6 }
            monitor-exit(r8)     // Catch:{ all -> 0x00b9 }
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x00b9 }
            r0 = 19
            if (r1 > r0) goto L_0x0083
            byte[] r3 = A07     // Catch:{ all -> 0x00b9 }
            r1 = 0
            int r0 = r4 + 607
            android.graphics.Bitmap r1 = android.graphics.BitmapFactory.decodeByteArray(r3, r1, r0)     // Catch:{ all -> 0x00b9 }
        L_0x0081:
            monitor-exit(r8)     // Catch:{ all -> 0x00b9 }
            goto L_0x00ab
        L_0x0083:
            X.18e r0 = r2.A02     // Catch:{ all -> 0x00b9 }
            X.12C r0 = r0.A05     // Catch:{ all -> 0x00b9 }
            X.18Q r10 = r0.A0D     // Catch:{ all -> 0x00b9 }
            java.lang.String r11 = r2.A03     // Catch:{ all -> 0x00b9 }
            byte[] r13 = A07     // Catch:{ all -> 0x00b9 }
            int r14 = r4 + 607
            java.lang.String r1 = r2.A05     // Catch:{ all -> 0x00b9 }
            boolean r0 = r2.A06     // Catch:{ all -> 0x00b9 }
            r16 = -1
            r17 = 0
            r12 = 1
            r15 = -1082130432(0xffffffffbf800000, float:-1.0)
            r18 = r1
            r19 = r3
            r20 = r0
            X.1iC r0 = r10.A08(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)     // Catch:{ all -> 0x00b9 }
            if (r0 == 0) goto L_0x00a9
            android.graphics.Bitmap r1 = r0.A01     // Catch:{ all -> 0x00b9 }
            goto L_0x0081
        L_0x00a9:
            r1 = r9
            goto L_0x0081
        L_0x00ab:
            if (r1 == 0) goto L_0x00b2
            int r0 = r2.A00     // Catch:{ IOException -> 0x00bc }
            com.instagram.common.p004ui.blur.BlurUtil.blurInPlace(r1, r0)     // Catch:{ IOException -> 0x00bc }
        L_0x00b2:
            return r1
        L_0x00b3:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x00b6 }
            throw r0     // Catch:{ all -> 0x00b6 }
        L_0x00b6:
            r0 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x00b9 }
            throw r0     // Catch:{ all -> 0x00b9 }
        L_0x00b9:
            r0 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x00b9 }
            throw r0     // Catch:{ IOException -> 0x00bc }
        L_0x00bc:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p000X.C37341jV.A00():android.graphics.Bitmap");
    }

    public C37341jV(Context context, C252818e r2, String str, String str2, int i, String str3, boolean z) {
        this.A01 = context;
        this.A02 = r2;
        this.A03 = str;
        this.A04 = str2;
        this.A00 = i;
        this.A06 = z;
        this.A05 = str3;
    }
}
