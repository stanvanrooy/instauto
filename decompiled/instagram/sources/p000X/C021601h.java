package p000X;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.OverlappingFileLockException;
import java.util.HashSet;

/* renamed from: X.01h  reason: invalid class name and case insensitive filesystem */
public final class C021601h {
    public final File A00;
    public final HashSet A01 = new HashSet();

    public static final boolean A00(RandomAccessFile randomAccessFile) {
        try {
            return randomAccessFile.getChannel().tryLock(0, Long.MAX_VALUE, false) != null;
        } catch (OverlappingFileLockException unused) {
            return false;
        } catch (IOException e) {
            String message = e.getMessage();
            if (message != null && (message.contains(": EAGAIN (") || message.contains(": errno 11 ("))) {
                return false;
            }
            throw e;
        }
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processExcHandler(RegionMaker.java:1043)
        	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:975)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:52)
        */
    public final p000X.C021401f A01(java.lang.String r10, java.io.File r11) {
        /*
            r9 = this;
            java.lang.String r0 = "/"
            boolean r0 = r10.contains(r0)
            if (r0 != 0) goto L_0x00f5
            java.lang.String r0 = "."
            boolean r0 = r0.equals(r10)
            if (r0 != 0) goto L_0x00f5
            java.lang.String r0 = ".."
            boolean r0 = r0.equals(r10)
            if (r0 != 0) goto L_0x00f5
            r8 = 0
            java.io.File r4 = new java.io.File     // Catch:{ all -> 0x00d8 }
            java.io.File r0 = r9.A00     // Catch:{ all -> 0x00d8 }
            r4.<init>(r0, r10)     // Catch:{ all -> 0x00d8 }
            monitor-enter(r9)     // Catch:{ all -> 0x00d8 }
            java.util.HashSet r0 = r9.A01     // Catch:{ all -> 0x00d5 }
            boolean r0 = r0.contains(r4)     // Catch:{ all -> 0x00d5 }
            if (r0 == 0) goto L_0x002b
            monitor-exit(r9)     // Catch:{ all -> 0x00d5 }
            return r8
        L_0x002b:
            java.util.HashSet r0 = r9.A01     // Catch:{ all -> 0x00d5 }
            r0.add(r4)     // Catch:{ all -> 0x00d5 }
            monitor-exit(r9)     // Catch:{ all -> 0x00d5 }
            boolean r0 = r4.exists()     // Catch:{ all -> 0x00d2 }
            if (r0 == 0) goto L_0x0043
            monitor-enter(r9)
            java.util.HashSet r0 = r9.A01     // Catch:{ all -> 0x003f }
            r0.remove(r4)     // Catch:{ all -> 0x003f }
            monitor-exit(r9)     // Catch:{ all -> 0x003f }
            return r8
        L_0x003f:
            r1 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x003f }
            goto L_0x00f4
        L_0x0043:
            if (r11 == 0) goto L_0x0085
            boolean r0 = r11.exists()     // Catch:{ all -> 0x00d2 }
            if (r0 == 0) goto L_0x0085
            r7 = 0
            r6 = 1
            java.io.RandomAccessFile r5 = new java.io.RandomAccessFile     // Catch:{ Exception -> 0x0067, all -> 0x0064 }
            java.lang.String r0 = "rw"
            r5.<init>(r11, r0)     // Catch:{ Exception -> 0x0067, all -> 0x0064 }
            boolean r0 = A00(r5)     // Catch:{ Exception -> 0x0062 }
            if (r0 == 0) goto L_0x0076
            boolean r0 = r11.renameTo(r4)     // Catch:{ Exception -> 0x0062 }
            if (r0 == 0) goto L_0x0076
            goto L_0x0075
        L_0x0062:
            r3 = move-exception
            goto L_0x0069
        L_0x0064:
            r0 = move-exception
            r5 = r8
            goto L_0x007f
        L_0x0067:
            r3 = move-exception
            r5 = r8
        L_0x0069:
            java.lang.String r2 = "Spool"
            java.lang.String r1 = "error using donor file %s; falling back to regular path"
            java.lang.Object[] r0 = new java.lang.Object[r6]     // Catch:{ all -> 0x007e }
            r0[r7] = r11     // Catch:{ all -> 0x007e }
            p000X.AnonymousClass0DB.A0Q(r2, r3, r1, r0)     // Catch:{ all -> 0x007e }
            goto L_0x0078
        L_0x0075:
            r7 = 1
        L_0x0076:
            if (r7 != 0) goto L_0x0086
        L_0x0078:
            if (r5 == 0) goto L_0x0085
            r5.close()     // Catch:{ IOException -> 0x0085 }
            goto L_0x0085
        L_0x007e:
            r0 = move-exception
        L_0x007f:
            if (r5 == 0) goto L_0x0084
            r5.close()     // Catch:{ IOException -> 0x0084 }
        L_0x0084:
            throw r0     // Catch:{ all -> 0x00d2 }
        L_0x0085:
            r5 = r8
        L_0x0086:
            if (r5 != 0) goto L_0x00ac
            java.io.RandomAccessFile r3 = new java.io.RandomAccessFile     // Catch:{ all -> 0x00dc }
            java.lang.String r0 = "rw"
            r3.<init>(r4, r0)     // Catch:{ all -> 0x00dc }
            boolean r0 = A00(r3)     // Catch:{ all -> 0x00a9 }
            if (r0 != 0) goto L_0x00a7
            r4.delete()
            r3.close()     // Catch:{ IOException -> 0x009c }
        L_0x009c:
            monitor-enter(r9)
            java.util.HashSet r0 = r9.A01     // Catch:{ all -> 0x00a4 }
            r0.remove(r4)     // Catch:{ all -> 0x00a4 }
            monitor-exit(r9)     // Catch:{ all -> 0x00a4 }
            return r8
        L_0x00a4:
            r1 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x00a4 }
            goto L_0x00f4
        L_0x00a7:
            r2 = r4
            goto L_0x00ae
        L_0x00a9:
            r1 = move-exception
            r8 = r4
            goto L_0x00de
        L_0x00ac:
            r3 = r5
            r2 = r8
        L_0x00ae:
            boolean r0 = r4.exists()     // Catch:{ all -> 0x00cf }
            if (r0 != 0) goto L_0x00c9
            if (r2 == 0) goto L_0x00b9
            r2.delete()
        L_0x00b9:
            if (r3 == 0) goto L_0x00be
            r3.close()     // Catch:{ IOException -> 0x00be }
        L_0x00be:
            monitor-enter(r9)
            java.util.HashSet r0 = r9.A01     // Catch:{ all -> 0x00c6 }
            r0.remove(r4)     // Catch:{ all -> 0x00c6 }
            monitor-exit(r9)     // Catch:{ all -> 0x00c6 }
            return r8
        L_0x00c6:
            r1 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x00c6 }
            goto L_0x00f4
        L_0x00c9:
            X.01f r0 = new X.01f     // Catch:{ all -> 0x00cf }
            r0.<init>(r9, r4, r3)     // Catch:{ all -> 0x00cf }
            return r0
        L_0x00cf:
            r1 = move-exception
            r8 = r2
            goto L_0x00de
        L_0x00d2:
            r1 = move-exception
            r3 = r8
            goto L_0x00de
        L_0x00d5:
            r0 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x00d5 }
            throw r0     // Catch:{ all -> 0x00d8 }
        L_0x00d8:
            r1 = move-exception
            r4 = r8
            r3 = r8
            goto L_0x00de
        L_0x00dc:
            r1 = move-exception
            r3 = r5
        L_0x00de:
            if (r8 == 0) goto L_0x00e3
            r8.delete()
        L_0x00e3:
            if (r3 == 0) goto L_0x00e8
            r3.close()     // Catch:{ IOException -> 0x00e8 }
        L_0x00e8:
            if (r4 == 0) goto L_0x00f4
            monitor-enter(r9)
            java.util.HashSet r0 = r9.A01     // Catch:{ all -> 0x00f2 }
            r0.remove(r4)     // Catch:{ all -> 0x00f2 }
            monitor-exit(r9)     // Catch:{ all -> 0x00f2 }
            goto L_0x00f4
        L_0x00f2:
            r1 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x00f2 }
        L_0x00f4:
            throw r1
        L_0x00f5:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "illegal spool file name: "
            java.lang.String r0 = p000X.AnonymousClass000.A0E(r0, r10)
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p000X.C021601h.A01(java.lang.String, java.io.File):X.01f");
    }

    public C021601h(File file) {
        this.A00 = file;
    }
}
