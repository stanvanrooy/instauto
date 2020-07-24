package p000X;

/* renamed from: X.0Zk  reason: invalid class name and case insensitive filesystem */
public final class C08960Zk {
    public static boolean A00;

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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public static synchronized void A00(android.content.Context r22) {
        /*
            java.lang.Class<X.0Zk> r16 = p000X.C08960Zk.class
            monitor-enter(r16)
            boolean r0 = A00     // Catch:{ all -> 0x0150 }
            if (r0 != 0) goto L_0x014e
            boolean r0 = p000X.AnonymousClass0ZT.A00(r22)     // Catch:{ all -> 0x0150 }
            r6 = 1
            if (r0 != 0) goto L_0x0012
            A00 = r6     // Catch:{ all -> 0x0150 }
            goto L_0x014e
        L_0x0012:
            android.content.res.AssetManager r7 = r22.getAssets()     // Catch:{ IOException -> 0x0146 }
            java.lang.String r0 = "app_modules.json"
            java.io.InputStream r2 = r7.open(r0)     // Catch:{ FileNotFoundException -> 0x0128 }
            android.util.JsonReader r10 = new android.util.JsonReader     // Catch:{ FileNotFoundException -> 0x0128 }
            java.io.InputStreamReader r1 = new java.io.InputStreamReader     // Catch:{ FileNotFoundException -> 0x0128 }
            java.lang.String r0 = "UTF-8"
            r1.<init>(r2, r0)     // Catch:{ FileNotFoundException -> 0x0128 }
            r10.<init>(r1)     // Catch:{ FileNotFoundException -> 0x0128 }
            java.util.ArrayList r14 = new java.util.ArrayList     // Catch:{ all -> 0x0123 }
            r14.<init>()     // Catch:{ all -> 0x0123 }
            r10.beginArray()     // Catch:{ all -> 0x0123 }
        L_0x0030:
            boolean r0 = r10.hasNext()     // Catch:{ all -> 0x0123 }
            if (r0 == 0) goto L_0x00e5
            android.util.JsonToken r1 = r10.peek()     // Catch:{ all -> 0x0123 }
            android.util.JsonToken r0 = android.util.JsonToken.BEGIN_OBJECT     // Catch:{ all -> 0x0123 }
            if (r1 != r0) goto L_0x00e5
            r10.beginObject()     // Catch:{ all -> 0x0123 }
            r13 = 0
            r2 = r13
            r1 = r13
            r3 = r13
            r4 = r13
        L_0x0046:
            boolean r0 = r10.hasNext()     // Catch:{ all -> 0x0123 }
            if (r0 == 0) goto L_0x00c0
            java.lang.String r12 = r10.nextName()     // Catch:{ all -> 0x0123 }
            r15 = -1
            int r0 = r12.hashCode()     // Catch:{ all -> 0x0123 }
            r11 = 4
            r9 = 3
            r8 = 2
            r5 = 1
            switch(r0) {
                case 3355: goto L_0x0085;
                case 3195150: goto L_0x007b;
                case 3373707: goto L_0x0071;
                case 3433509: goto L_0x0067;
                case 1109408053: goto L_0x005d;
                default: goto L_0x005c;
            }     // Catch:{ all -> 0x0123 }
        L_0x005c:
            goto L_0x008e
        L_0x005d:
            java.lang.String r0 = "download_uri"
            boolean r0 = r12.equals(r0)     // Catch:{ all -> 0x0123 }
            if (r0 == 0) goto L_0x008e
            r15 = 3
            goto L_0x008e
        L_0x0067:
            java.lang.String r0 = "path"
            boolean r0 = r12.equals(r0)     // Catch:{ all -> 0x0123 }
            if (r0 == 0) goto L_0x008e
            r15 = 4
            goto L_0x008e
        L_0x0071:
            java.lang.String r0 = "name"
            boolean r0 = r12.equals(r0)     // Catch:{ all -> 0x0123 }
            if (r0 == 0) goto L_0x008e
            r15 = 1
            goto L_0x008e
        L_0x007b:
            java.lang.String r0 = "hash"
            boolean r0 = r12.equals(r0)     // Catch:{ all -> 0x0123 }
            if (r0 == 0) goto L_0x008e
            r15 = 2
            goto L_0x008e
        L_0x0085:
            java.lang.String r0 = "id"
            boolean r0 = r12.equals(r0)     // Catch:{ all -> 0x0123 }
            if (r0 == 0) goto L_0x008e
            r15 = 0
        L_0x008e:
            if (r15 == 0) goto L_0x00b8
            if (r15 == r5) goto L_0x00b0
            if (r15 == r8) goto L_0x00a8
            if (r15 == r9) goto L_0x00a0
            if (r15 != r11) goto L_0x00d9
            p000X.C08920Zg.A00(r4, r12)     // Catch:{ all -> 0x0123 }
            java.lang.String r4 = r10.nextString()     // Catch:{ all -> 0x0123 }
            goto L_0x0046
        L_0x00a0:
            p000X.C08920Zg.A00(r3, r12)     // Catch:{ all -> 0x0123 }
            java.lang.String r3 = r10.nextString()     // Catch:{ all -> 0x0123 }
            goto L_0x0046
        L_0x00a8:
            p000X.C08920Zg.A00(r2, r12)     // Catch:{ all -> 0x0123 }
            java.lang.String r2 = r10.nextString()     // Catch:{ all -> 0x0123 }
            goto L_0x0046
        L_0x00b0:
            p000X.C08920Zg.A00(r13, r12)     // Catch:{ all -> 0x0123 }
            java.lang.String r13 = r10.nextString()     // Catch:{ all -> 0x0123 }
            goto L_0x0046
        L_0x00b8:
            p000X.C08920Zg.A00(r1, r12)     // Catch:{ all -> 0x0123 }
            java.lang.String r1 = r10.nextString()     // Catch:{ all -> 0x0123 }
            goto L_0x0046
        L_0x00c0:
            r10.endObject()     // Catch:{ all -> 0x0123 }
            X.0Zj r0 = new X.0Zj     // Catch:{ all -> 0x0123 }
            r21 = r3
            r22 = r4
            r19 = r2
            r20 = r1
            r17 = r0
            r18 = r13
            r17.<init>(r18, r19, r20, r21, r22)     // Catch:{ all -> 0x0123 }
            r14.add(r0)     // Catch:{ all -> 0x0123 }
            goto L_0x0030
        L_0x00d9:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch:{ all -> 0x0123 }
            java.lang.String r0 = "Unexpected name: "
            java.lang.String r0 = p000X.AnonymousClass000.A0E(r0, r12)     // Catch:{ all -> 0x0123 }
            r1.<init>(r0)     // Catch:{ all -> 0x0123 }
            throw r1     // Catch:{ all -> 0x0123 }
        L_0x00e5:
            r10.endArray()     // Catch:{ all -> 0x0123 }
            r10.close()     // Catch:{ FileNotFoundException -> 0x0128 }
            java.util.Iterator r4 = r14.iterator()     // Catch:{ IOException -> 0x0146 }
        L_0x00ef:
            boolean r0 = r4.hasNext()     // Catch:{ IOException -> 0x0146 }
            if (r0 == 0) goto L_0x0120
            java.lang.Object r1 = r4.next()     // Catch:{ IOException -> 0x0146 }
            X.0Zj r1 = (p000X.C08950Zj) r1     // Catch:{ IOException -> 0x0146 }
            X.0Ze r3 = p000X.C08900Ze.A00()     // Catch:{ IOException -> 0x0146 }
            java.lang.String r0 = r1.A03     // Catch:{ IOException -> 0x0146 }
            int r2 = p000X.C09050Zv.A00(r0)     // Catch:{ IOException -> 0x0146 }
            java.lang.String r1 = r1.A01     // Catch:{ IOException -> 0x0146 }
            monitor-enter(r3)     // Catch:{ IOException -> 0x0146 }
            boolean r0 = p000X.C09050Zv.A02(r2)     // Catch:{ all -> 0x011d }
            if (r0 == 0) goto L_0x011b
            java.lang.String[] r0 = r3.A04     // Catch:{ all -> 0x011d }
            r0[r2] = r1     // Catch:{ all -> 0x011d }
            boolean r0 = p000X.AnonymousClass0DB.A0S()     // Catch:{ all -> 0x011d }
            if (r0 == 0) goto L_0x011b
            p000X.C09050Zv.A01(r2)     // Catch:{ all -> 0x011d }
        L_0x011b:
            monitor-exit(r3)     // Catch:{ IOException -> 0x0146 }
            goto L_0x00ef
        L_0x011d:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ IOException -> 0x0146 }
            throw r0     // Catch:{ IOException -> 0x0146 }
        L_0x0120:
            A00 = r6     // Catch:{ IOException -> 0x0146 }
            goto L_0x014e
        L_0x0123:
            r0 = move-exception
            r10.close()     // Catch:{ FileNotFoundException -> 0x0128 }
            throw r0     // Catch:{ FileNotFoundException -> 0x0128 }
        L_0x0128:
            r5 = move-exception
            java.io.IOException r4 = new java.io.IOException     // Catch:{ IOException -> 0x0146 }
            java.util.Locale r3 = java.util.Locale.US     // Catch:{ IOException -> 0x0146 }
            java.lang.Object[] r2 = new java.lang.Object[r6]     // Catch:{ IOException -> 0x0146 }
            r1 = 0
            java.lang.String r0 = ""
            java.lang.String[] r0 = r7.list(r0)     // Catch:{ IOException -> 0x0146 }
            java.lang.String r0 = java.util.Arrays.toString(r0)     // Catch:{ IOException -> 0x0146 }
            r2[r1] = r0     // Catch:{ IOException -> 0x0146 }
            java.lang.String r0 = "app_modules.json not found, assets = %s"
            java.lang.String r0 = java.lang.String.format(r3, r0, r2)     // Catch:{ IOException -> 0x0146 }
            r4.<init>(r0, r5)     // Catch:{ IOException -> 0x0146 }
            throw r4     // Catch:{ IOException -> 0x0146 }
        L_0x0146:
            r2 = move-exception
            java.lang.String r1 = "DownloadableAppModuleMetadataReader"
            java.lang.String r0 = "Error loading downloadable module metadata"
            p000X.AnonymousClass0DB.A0O(r1, r2, r0)     // Catch:{ all -> 0x0150 }
        L_0x014e:
            monitor-exit(r16)
            return
        L_0x0150:
            r0 = move-exception
            monitor-exit(r16)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000X.C08960Zk.A00(android.content.Context):void");
    }
}
