package com.instagram.pendingmedia.store;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import java.util.LinkedList;
import java.util.List;
import p000X.AnonymousClass000;
import p000X.AnonymousClass0C1;
import p000X.AnonymousClass0C2;
import p000X.AnonymousClass0O1;
import p000X.AnonymousClass0O9;
import p000X.StoredPreferences;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass14K;
import p000X.C05450Ko;
import p000X.C23260zq;
import p000X.C23270zr;

public final class PendingMediaStoreSerializer implements AnonymousClass0C2 {
    public static final Class A09 = PendingMediaStoreSerializer.class;
    public final Context A00;
    public final Handler A01 = new Handler(Looper.getMainLooper());
    public final AnonymousClass0O9 A02;
    public final C05450Ko A03;
    public final AnonymousClass0C1 A04;
    public final Object A05;
    public final String A06;
    public final List A07;
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processLoop(RegionMaker.java:225)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x0055 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0082  */
    public final synchronized void A02() {
        /*
            r12 = this;
            monitor-enter(r12)
            java.lang.String r0 = r12.A06     // Catch:{ all -> 0x01bc }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x01bc }
            r5 = 1
            if (r0 == 0) goto L_0x0013
            java.lang.String r1 = "PendingMediaStoreSerializer_serialize_invalidFinalFileName"
            java.lang.String r0 = "Null or empty filename"
            p000X.AnonymousClass0QD.A03(r1, r0, r5)     // Catch:{ all -> 0x01bc }
            goto L_0x01ba
        L_0x0013:
            X.0C1 r0 = r12.A04     // Catch:{ all -> 0x01bc }
            com.instagram.pendingmedia.store.PendingMediaStore r0 = com.instagram.pendingmedia.store.PendingMediaStore.A01(r0)     // Catch:{ all -> 0x01bc }
            boolean r0 = r0.A0E()     // Catch:{ all -> 0x01bc }
            if (r0 != 0) goto L_0x0040
            X.0C1 r4 = r12.A04     // Catch:{ all -> 0x01bc }
            X.0L7 r3 = p000X.AnonymousClass0L7.PENDING_MEDIA_EARLY_SERIALIZE_BACKTEST     // Catch:{ all -> 0x01bc }
            r0 = 0
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x01bc }
            java.lang.String r1 = "disable_fix"
            r0 = 0
            java.lang.Object r0 = p000X.AnonymousClass0L6.A02(r4, r3, r1, r2, r0)     // Catch:{ all -> 0x01bc }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x01bc }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x01bc }
            if (r0 != 0) goto L_0x0040
            java.lang.String r1 = "PendingMediaStoreSerializer_serialize_tooEarly"
            java.lang.String r0 = "Tried to serialize data before initial deserialization happened."
            p000X.AnonymousClass0QD.A01(r1, r0)     // Catch:{ all -> 0x01bc }
            goto L_0x01ba
        L_0x0040:
            X.0C1 r0 = r12.A04     // Catch:{ all -> 0x01bc }
            com.instagram.pendingmedia.store.PendingMediaStore r0 = com.instagram.pendingmedia.store.PendingMediaStore.A01(r0)     // Catch:{ all -> 0x01bc }
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch:{ all -> 0x01bc }
            r7.<init>()     // Catch:{ all -> 0x01bc }
            java.util.Map r0 = r0.A02     // Catch:{ all -> 0x01bc }
            java.util.Collection r0 = r0.values()     // Catch:{ all -> 0x01bc }
            java.util.Iterator r11 = r0.iterator()     // Catch:{ all -> 0x01bc }
        L_0x0055:
            boolean r0 = r11.hasNext()     // Catch:{ all -> 0x01bc }
            if (r0 == 0) goto L_0x0086
            java.lang.Object r10 = r11.next()     // Catch:{ all -> 0x01bc }
            com.instagram.pendingmedia.model.PendingMedia r10 = (com.instagram.pendingmedia.model.PendingMedia) r10     // Catch:{ all -> 0x01bc }
            X.1sK r1 = r10.A0v     // Catch:{ all -> 0x01bc }
            X.1sK r0 = p000X.C42421sK.CONFIGURED     // Catch:{ all -> 0x01bc }
            r6 = 0
            if (r1 != r0) goto L_0x007f
            long r8 = r10.A0b     // Catch:{ all -> 0x01bc }
            r1 = 0
            int r0 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0080
            long r3 = r10.A0S     // Catch:{ all -> 0x01bc }
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0080
            long r1 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x01bc }
            long r3 = r3 + r8
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 >= 0) goto L_0x0080
        L_0x007f:
            r6 = 1
        L_0x0080:
            if (r6 == 0) goto L_0x0055
            r7.add(r10)     // Catch:{ all -> 0x01bc }
            goto L_0x0055
        L_0x0086:
            int r0 = r7.size()     // Catch:{ all -> 0x01bc }
            if (r0 != 0) goto L_0x0095
            android.content.Context r1 = r12.A00     // Catch:{ all -> 0x01bc }
            java.lang.String r0 = r12.A06     // Catch:{ all -> 0x01bc }
            r1.deleteFile(r0)     // Catch:{ all -> 0x01bc }
            goto L_0x01ba
        L_0x0095:
            r6 = 0
            android.content.Context r1 = r12.A00     // Catch:{ FileNotFoundException -> 0x019f, IOException -> 0x00e1 }
            java.lang.String r0 = r12.A08     // Catch:{ FileNotFoundException -> 0x019f, IOException -> 0x00e1 }
            java.io.FileOutputStream r4 = r1.openFileOutput(r0, r6)     // Catch:{ FileNotFoundException -> 0x019f, IOException -> 0x00e1 }
            X.0hZ r1 = p000X.C12890hY.A00     // Catch:{ all -> 0x00d8 }
            java.lang.Integer r0 = p000X.Constants.ZERO     // Catch:{ all -> 0x00d8 }
            X.0iZ r3 = r1.A04(r4, r0)     // Catch:{ all -> 0x00d8 }
            r7.size()     // Catch:{ all -> 0x00d1 }
            r3.A0S()     // Catch:{ all -> 0x00d1 }
            java.util.Iterator r2 = r7.iterator()     // Catch:{ all -> 0x00d1 }
        L_0x00b0:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x00d1 }
            if (r0 == 0) goto L_0x00c5
            java.lang.Object r1 = r2.next()     // Catch:{ all -> 0x00d1 }
            com.instagram.pendingmedia.model.PendingMedia r1 = (com.instagram.pendingmedia.model.PendingMedia) r1     // Catch:{ all -> 0x00d1 }
            monitor-enter(r1)     // Catch:{ all -> 0x00d1 }
            p000X.C42271s4.A01(r3, r1)     // Catch:{ all -> 0x00c2 }
            monitor-exit(r1)     // Catch:{ all -> 0x00c2 }
            goto L_0x00b0
        L_0x00c2:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x00c2 }
            throw r0     // Catch:{ all -> 0x00d1 }
        L_0x00c5:
            r3.A0P()     // Catch:{ all -> 0x00d1 }
            r3.close()     // Catch:{ all -> 0x00d8 }
            if (r4 == 0) goto L_0x00fc
            r4.close()     // Catch:{ FileNotFoundException -> 0x019f, IOException -> 0x00e1 }
            goto L_0x00fc
        L_0x00d1:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x00d3 }
        L_0x00d3:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x00d7 }
        L_0x00d7:
            throw r0     // Catch:{ all -> 0x00d8 }
        L_0x00d8:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x00da }
        L_0x00da:
            r0 = move-exception
            if (r4 == 0) goto L_0x00e0
            r4.close()     // Catch:{ all -> 0x00e0 }
        L_0x00e0:
            throw r0     // Catch:{ FileNotFoundException -> 0x019f, IOException -> 0x00e1 }
        L_0x00e1:
            r4 = move-exception
            java.lang.Class r3 = A09     // Catch:{ all -> 0x01bc }
            java.lang.String r2 = "Exception while writing out %s"
            java.lang.Object[] r1 = new java.lang.Object[r5]     // Catch:{ all -> 0x01bc }
            java.lang.String r0 = r12.A08     // Catch:{ all -> 0x01bc }
            r1[r6] = r0     // Catch:{ all -> 0x01bc }
            p000X.AnonymousClass0DB.A0B(r3, r4, r2, r1)     // Catch:{ all -> 0x01bc }
            java.lang.String r2 = "PendingMediaStoreSerializer_serialize_IOException"
            java.lang.String r1 = "Exception while writing to "
            java.lang.String r0 = r12.A08     // Catch:{ all -> 0x01bc }
            java.lang.String r0 = p000X.AnonymousClass000.A0E(r1, r0)     // Catch:{ all -> 0x01bc }
            p000X.AnonymousClass0QD.A08(r2, r0, r4, r5)     // Catch:{ all -> 0x01bc }
        L_0x00fc:
            java.lang.String r3 = r12.A08     // Catch:{ all -> 0x01bc }
            java.lang.String r1 = r12.A06     // Catch:{ all -> 0x01bc }
            r9 = r12
            monitor-enter(r9)     // Catch:{ all -> 0x01bc }
            java.io.File r2 = new java.io.File     // Catch:{ all -> 0x019c }
            android.content.Context r0 = r12.A00     // Catch:{ all -> 0x019c }
            java.io.File r0 = r0.getFilesDir()     // Catch:{ all -> 0x019c }
            r2.<init>(r0, r3)     // Catch:{ all -> 0x019c }
            java.io.File r8 = new java.io.File     // Catch:{ all -> 0x019c }
            android.content.Context r0 = r12.A00     // Catch:{ all -> 0x019c }
            java.io.File r0 = r0.getFilesDir()     // Catch:{ all -> 0x019c }
            r8.<init>(r0, r1)     // Catch:{ all -> 0x019c }
            boolean r0 = r2.exists()     // Catch:{ all -> 0x019c }
            if (r0 != 0) goto L_0x012e
            java.lang.String r1 = "Source file does not exist: "
            java.lang.String r0 = r2.getName()     // Catch:{ all -> 0x019c }
            java.lang.String r1 = p000X.AnonymousClass000.A0E(r1, r0)     // Catch:{ all -> 0x019c }
            java.lang.String r0 = "PendingMediaStoreSerializer_rename_srcFileDoesNotExist"
            p000X.AnonymousClass0QD.A03(r0, r1, r5)     // Catch:{ all -> 0x019c }
            goto L_0x0183
        L_0x012e:
            boolean r0 = r2.renameTo(r8)     // Catch:{ all -> 0x019c }
            if (r0 != 0) goto L_0x0185
            boolean r0 = r8.exists()     // Catch:{ all -> 0x019c }
            java.lang.String r7 = " to "
            java.lang.String r4 = "Unable to rename "
            if (r0 != 0) goto L_0x0152
            java.lang.String r2 = r2.getName()     // Catch:{ all -> 0x019c }
            java.lang.String r1 = r8.getName()     // Catch:{ all -> 0x019c }
            java.lang.String r0 = ". Destination file does not exist."
            java.lang.String r1 = p000X.AnonymousClass000.A0O(r4, r2, r7, r1, r0)     // Catch:{ all -> 0x019c }
            java.lang.String r0 = "PendingMediaStoreSerializer_rename_dstFileDoesNotExist"
            p000X.AnonymousClass0QD.A03(r0, r1, r5)     // Catch:{ all -> 0x019c }
            goto L_0x0183
        L_0x0152:
            boolean r0 = r8.delete()     // Catch:{ all -> 0x019c }
            if (r0 != 0) goto L_0x016c
            java.lang.String r2 = r2.getName()     // Catch:{ all -> 0x019c }
            java.lang.String r1 = r8.getName()     // Catch:{ all -> 0x019c }
            java.lang.String r0 = ". Unable to delete destination file."
            java.lang.String r1 = p000X.AnonymousClass000.A0O(r4, r2, r7, r1, r0)     // Catch:{ all -> 0x019c }
            java.lang.String r0 = "PendingMediaStoreSerializer_rename_dstFileDeleteFail"
            p000X.AnonymousClass0QD.A03(r0, r1, r5)     // Catch:{ all -> 0x019c }
            goto L_0x0183
        L_0x016c:
            boolean r0 = r2.renameTo(r8)     // Catch:{ all -> 0x019c }
            if (r0 != 0) goto L_0x0185
            java.lang.String r1 = r2.getName()     // Catch:{ all -> 0x019c }
            java.lang.String r0 = r8.getName()     // Catch:{ all -> 0x019c }
            java.lang.String r1 = p000X.AnonymousClass000.A0N(r4, r1, r7, r0)     // Catch:{ all -> 0x019c }
            java.lang.String r0 = "PendingMediaStoreSerializer_rename_srcFileRenameToFinalFileFail"
            p000X.AnonymousClass0QD.A03(r0, r1, r5)     // Catch:{ all -> 0x019c }
        L_0x0183:
            r0 = 0
            goto L_0x0186
        L_0x0185:
            r0 = 1
        L_0x0186:
            monitor-exit(r9)     // Catch:{ all -> 0x01bc }
            if (r0 != 0) goto L_0x01ba
            java.lang.Class r3 = A09     // Catch:{ all -> 0x01bc }
            java.lang.String r2 = "Unable to rename %s to %s"
            r0 = 2
            java.lang.Object[] r1 = new java.lang.Object[r0]     // Catch:{ all -> 0x01bc }
            java.lang.String r0 = r12.A08     // Catch:{ all -> 0x01bc }
            r1[r6] = r0     // Catch:{ all -> 0x01bc }
            java.lang.String r0 = r12.A06     // Catch:{ all -> 0x01bc }
            r1[r5] = r0     // Catch:{ all -> 0x01bc }
            p000X.AnonymousClass0DB.A08(r3, r2, r1)     // Catch:{ all -> 0x01bc }
            goto L_0x01ba
        L_0x019c:
            r0 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x01bc }
            throw r0     // Catch:{ all -> 0x01bc }
        L_0x019f:
            r4 = move-exception
            java.lang.Class r3 = A09     // Catch:{ all -> 0x01bc }
            java.lang.String r2 = "File not found while getting output stream for %s"
            java.lang.Object[] r1 = new java.lang.Object[r5]     // Catch:{ all -> 0x01bc }
            java.lang.String r0 = r12.A08     // Catch:{ all -> 0x01bc }
            r1[r6] = r0     // Catch:{ all -> 0x01bc }
            p000X.AnonymousClass0DB.A0B(r3, r4, r2, r1)     // Catch:{ all -> 0x01bc }
            java.lang.String r2 = "PendingMediaStoreSerializer_serialize_unableToOpenTempFileName"
            java.lang.String r1 = "Failed to acquire output stream for "
            java.lang.String r0 = r12.A08     // Catch:{ all -> 0x01bc }
            java.lang.String r0 = p000X.AnonymousClass000.A0E(r1, r0)     // Catch:{ all -> 0x01bc }
            p000X.AnonymousClass0QD.A03(r2, r0, r5)     // Catch:{ all -> 0x01bc }
        L_0x01ba:
            monitor-exit(r12)
            return
        L_0x01bc:
            r0 = move-exception
            monitor-exit(r12)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.pendingmedia.store.PendingMediaStoreSerializer.A02():void");
    }

    public final void onUserSessionWillEnd(boolean z) {
    }

    public static PendingMediaStoreSerializer A00(AnonymousClass0C1 r2) {
        return (PendingMediaStoreSerializer) r2.AVA(PendingMediaStoreSerializer.class, new C23260zq(r2));
    }

    public final void A01() {
        this.A03.ADc(this.A02);
    }

    public final void A03(Runnable runnable) {
        synchronized (this.A05) {
            if (PendingMediaStore.A01(this.A04).A0E()) {
                runnable.run();
            } else {
                this.A07.add(runnable);
            }
        }
    }

    public PendingMediaStoreSerializer(AnonymousClass0C1 r3) {
        AnonymousClass0O1 A002 = AnonymousClass0O1.A00();
        A002.A01 = "PendingMediaStoreSerializer";
        this.A03 = A002.A01();
        this.A02 = new C23270zr(this);
        this.A05 = new Object();
        this.A07 = new LinkedList();
        this.A00 = StoredPreferences.A00;
        this.A04 = r3;
        String A042 = r3.A04();
        this.A08 = AnonymousClass000.A0E(A042, "_pending_media.json.tmp");
        this.A06 = AnonymousClass000.A0E(A042, "_pending_media.json");
    }

    public final void onUserSessionStart(boolean z) {
        int A032 = AnonymousClass0Z0.A03(1252801019);
        AnonymousClass0C1 r1 = this.A04;
        if (r1.AgN() && !PendingMediaStore.A01(r1).A0E()) {
            this.A03.ADc(new AnonymousClass14K(this));
        }
        AnonymousClass0Z0.A0A(287518511, A032);
    }
}
