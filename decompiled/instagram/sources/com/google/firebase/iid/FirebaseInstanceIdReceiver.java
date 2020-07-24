package com.google.firebase.iid;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import android.util.Log;
import p000X.AnonymousClass0Z0;
import p000X.C25150B3f;
import p000X.C25154B3j;
import p000X.C59692i2;

public final class FirebaseInstanceIdReceiver extends C59692i2 {
    public static C25154B3j A00;
    public static C25154B3j A01;

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
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x01a9 A[Catch:{ SecurityException -> 0x01e3, IllegalStateException -> 0x01c0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x01ae A[Catch:{ SecurityException -> 0x01e3, IllegalStateException -> 0x01c0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x01b4 A[Catch:{ SecurityException -> 0x01e3, IllegalStateException -> 0x01c0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x01bd A[Catch:{ SecurityException -> 0x01e3, IllegalStateException -> 0x01c0 }] */
    private final void A03(android.content.Context r13, android.content.Intent r14, java.lang.String r15) {
        /*
            r12 = this;
            r2 = 0
            r14.setComponent(r2)
            java.lang.String r0 = r13.getPackageName()
            r14.setPackage(r0)
            java.lang.String r3 = "gcm.rawData64"
            java.lang.String r1 = r14.getStringExtra(r3)
            if (r1 == 0) goto L_0x0020
            r0 = 0
            byte[] r1 = android.util.Base64.decode(r1, r0)
            java.lang.String r0 = "rawData"
            r14.putExtra(r0, r1)
            r14.removeExtra(r3)
        L_0x0020:
            java.lang.String r0 = "from"
            java.lang.String r1 = r14.getStringExtra(r0)
            java.lang.String r0 = "google.com/iid"
            boolean r0 = r0.equals(r1)
            java.lang.String r6 = "com.google.firebase.MESSAGING_EVENT"
            java.lang.String r7 = "com.google.firebase.INSTANCE_ID_EVENT"
            if (r0 != 0) goto L_0x01f6
            boolean r0 = r7.equals(r15)
            if (r0 != 0) goto L_0x01f6
            java.lang.String r0 = "com.google.android.c2dm.intent.RECEIVE"
            boolean r0 = r0.equals(r15)
            if (r0 != 0) goto L_0x0046
            boolean r0 = r6.equals(r15)
            if (r0 == 0) goto L_0x0047
        L_0x0046:
            r2 = r6
        L_0x0047:
            r0 = -1
            if (r2 == 0) goto L_0x006e
            boolean r1 = p000X.C42061rR.A03()
            r8 = 1
            if (r1 == 0) goto L_0x005c
            android.content.pm.ApplicationInfo r1 = r13.getApplicationInfo()
            int r3 = r1.targetSdkVersion
            r1 = 26
            r5 = 1
            if (r3 >= r1) goto L_0x005d
        L_0x005c:
            r5 = 0
        L_0x005d:
            int r3 = r14.getFlags()
            r1 = 268435456(0x10000000, float:2.5243549E-29)
            r3 = r3 & r1
            if (r3 != 0) goto L_0x0067
            r8 = 0
        L_0x0067:
            if (r5 == 0) goto L_0x0078
            if (r8 != 0) goto L_0x0078
            A00(r12, r13, r2, r14)
        L_0x006e:
            boolean r1 = r12.isOrderedBroadcast()
            if (r1 == 0) goto L_0x0077
            r12.setResultCode(r0)
        L_0x0077:
            return
        L_0x0078:
            X.B3h r5 = p000X.C25152B3h.A00()
            java.lang.String r3 = "FirebaseInstanceId"
            r0 = 3
            boolean r0 = android.util.Log.isLoggable(r3, r0)
            if (r0 == 0) goto L_0x0096
            java.lang.String r1 = "Starting service: "
            java.lang.String r0 = java.lang.String.valueOf(r2)
            int r0 = r0.length()
            if (r0 != 0) goto L_0x0096
            java.lang.String r0 = new java.lang.String
            r0.<init>(r1)
        L_0x0096:
            r9 = -1
            int r10 = r2.hashCode()
            r0 = -842411455(0xffffffffcdc9d241, float:-4.23249952E8)
            r1 = 1
            if (r10 == r0) goto L_0x01ed
            r0 = 41532704(0x279bd20, float:1.8347907E-37)
            if (r10 != r0) goto L_0x00ad
            boolean r0 = r2.equals(r6)
            if (r0 == 0) goto L_0x00ad
            r9 = 1
        L_0x00ad:
            if (r9 == 0) goto L_0x00d8
            if (r9 == r1) goto L_0x00db
            java.lang.String r1 = "Unknown service action: "
            int r0 = r2.length()
            if (r0 == 0) goto L_0x00d2
            java.lang.String r0 = r1.concat(r2)
        L_0x00bd:
            android.util.Log.w(r3, r0)
            r0 = 500(0x1f4, float:7.0E-43)
        L_0x00c2:
            boolean r1 = p000X.C42061rR.A03()
            if (r1 == 0) goto L_0x006e
            r1 = 402(0x192, float:5.63E-43)
            if (r0 != r1) goto L_0x006e
            A00(r12, r13, r2, r14)
            r0 = 403(0x193, float:5.65E-43)
            goto L_0x006e
        L_0x00d2:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r1)
            goto L_0x00bd
        L_0x00d8:
            java.util.Queue r0 = r5.A03
            goto L_0x00dd
        L_0x00db:
            java.util.Queue r0 = r5.A04
        L_0x00dd:
            r0.offer(r14)
            android.content.Intent r7 = new android.content.Intent
            r7.<init>(r2)
            java.lang.String r0 = r13.getPackageName()
            r7.setPackage(r0)
            X.00N r9 = r5.A02
            monitor-enter(r9)
            X.00N r1 = r5.A02     // Catch:{ all -> 0x01fc }
            java.lang.String r0 = r7.getAction()     // Catch:{ all -> 0x01fc }
            java.lang.Object r6 = r1.get(r0)     // Catch:{ all -> 0x01fc }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ all -> 0x01fc }
            monitor-exit(r9)     // Catch:{ all -> 0x01fc }
            if (r6 != 0) goto L_0x0184
            android.content.pm.PackageManager r1 = r13.getPackageManager()
            r0 = 0
            android.content.pm.ResolveInfo r0 = r1.resolveService(r7, r0)
            if (r0 == 0) goto L_0x017e
            android.content.pm.ServiceInfo r1 = r0.serviceInfo
            if (r1 == 0) goto L_0x017e
            java.lang.String r0 = r13.getPackageName()
            java.lang.String r10 = r1.packageName
            boolean r0 = r0.equals(r10)
            if (r0 == 0) goto L_0x014c
            java.lang.String r6 = r1.name
            if (r6 == 0) goto L_0x014c
            java.lang.String r0 = "."
            boolean r0 = r6.startsWith(r0)
            if (r0 == 0) goto L_0x0137
            java.lang.String r0 = r13.getPackageName()
            java.lang.String r1 = java.lang.String.valueOf(r0)
            int r0 = r6.length()
            if (r0 == 0) goto L_0x013b
            java.lang.String r6 = r1.concat(r6)
        L_0x0137:
            X.00N r9 = r5.A02
            monitor-enter(r9)
            goto L_0x0141
        L_0x013b:
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1)
            goto L_0x0137
        L_0x0141:
            X.00N r1 = r5.A02     // Catch:{ all -> 0x01f9 }
            java.lang.String r0 = r7.getAction()     // Catch:{ all -> 0x01f9 }
            r1.put(r0, r6)     // Catch:{ all -> 0x01f9 }
            monitor-exit(r9)     // Catch:{ all -> 0x01f9 }
            goto L_0x0184
        L_0x014c:
            java.lang.String r9 = r1.name
            java.lang.String r0 = java.lang.String.valueOf(r10)
            int r0 = r0.length()
            int r6 = r0 + 94
            java.lang.String r0 = java.lang.String.valueOf(r9)
            int r0 = r0.length()
            int r6 = r6 + r0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r6)
            java.lang.String r0 = "Error resolving target intent service, skipping classname enforcement. Resolved service was: "
            r1.append(r0)
            r1.append(r10)
            java.lang.String r0 = "/"
            r1.append(r0)
            r1.append(r9)
            java.lang.String r0 = r1.toString()
            android.util.Log.e(r3, r0)
            goto L_0x01a3
        L_0x017e:
            java.lang.String r0 = "Failed to resolve target intent service, skipping classname enforcement"
            android.util.Log.e(r3, r0)
            goto L_0x01a3
        L_0x0184:
            r0 = 3
            boolean r0 = android.util.Log.isLoggable(r3, r0)
            if (r0 == 0) goto L_0x019c
            java.lang.String r1 = "Restricting intent to a specific service: "
            java.lang.String r0 = java.lang.String.valueOf(r6)
            int r0 = r0.length()
            if (r0 != 0) goto L_0x019c
            java.lang.String r0 = new java.lang.String
            r0.<init>(r1)
        L_0x019c:
            java.lang.String r0 = r13.getPackageName()
            r7.setClassName(r0, r6)
        L_0x01a3:
            boolean r0 = r5.A01(r13)     // Catch:{ SecurityException -> 0x01e3, IllegalStateException -> 0x01c0 }
            if (r0 == 0) goto L_0x01ae
            android.content.ComponentName r0 = p000X.C59692i2.A01(r13, r7)     // Catch:{ SecurityException -> 0x01e3, IllegalStateException -> 0x01c0 }
            goto L_0x01b2
        L_0x01ae:
            android.content.ComponentName r0 = r13.startService(r7)     // Catch:{ SecurityException -> 0x01e3, IllegalStateException -> 0x01c0 }
        L_0x01b2:
            if (r0 != 0) goto L_0x01bd
            java.lang.String r0 = "Error while delivering the message: ServiceIntent not found."
            android.util.Log.e(r3, r0)     // Catch:{ SecurityException -> 0x01e3, IllegalStateException -> 0x01c0 }
            r0 = 404(0x194, float:5.66E-43)
            goto L_0x00c2
        L_0x01bd:
            r0 = -1
            goto L_0x00c2
        L_0x01c0:
            r0 = move-exception
            java.lang.String r5 = java.lang.String.valueOf(r0)
            int r0 = r5.length()
            int r0 = r0 + 45
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            java.lang.String r0 = "Failed to start service while in background: "
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = r1.toString()
            android.util.Log.e(r3, r0)
            r0 = 402(0x192, float:5.63E-43)
            goto L_0x00c2
        L_0x01e3:
            r1 = move-exception
            java.lang.String r0 = "Error while delivering the message to the serviceIntent"
            android.util.Log.e(r3, r0, r1)
            r0 = 401(0x191, float:5.62E-43)
            goto L_0x00c2
        L_0x01ed:
            boolean r0 = r2.equals(r7)
            if (r0 == 0) goto L_0x00ad
            r9 = 0
            goto L_0x00ad
        L_0x01f6:
            r2 = r7
            goto L_0x0047
        L_0x01f9:
            r0 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x01f9 }
            goto L_0x01fe
        L_0x01fc:
            r0 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x01fc }
        L_0x01fe:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.iid.FirebaseInstanceIdReceiver.A03(android.content.Context, android.content.Intent, java.lang.String):void");
    }

    public static void A00(BroadcastReceiver broadcastReceiver, Context context, String str, Intent intent) {
        C25154B3j b3j;
        if (Log.isLoggable("FirebaseInstanceId", 3) && String.valueOf(str).length() == 0) {
            new String("Binding to service: ");
        }
        if (broadcastReceiver.isOrderedBroadcast()) {
            broadcastReceiver.setResultCode(-1);
        }
        synchronized (FirebaseInstanceIdReceiver.class) {
            if ("com.google.firebase.MESSAGING_EVENT".equals(str)) {
                if (A01 == null) {
                    A01 = new C25154B3j(context, str);
                }
                b3j = A01;
            } else {
                if (A00 == null) {
                    A00 = new C25154B3j(context, str);
                }
                b3j = A00;
            }
        }
        BroadcastReceiver.PendingResult goAsync = broadcastReceiver.goAsync();
        synchronized (b3j) {
            Log.isLoggable("EnhancedIntentService", 3);
            b3j.A04.add(new C25150B3f(intent, goAsync, b3j.A05));
            C25154B3j.A00(b3j);
        }
    }

    public final void onReceive(Context context, Intent intent) {
        Intent intent2;
        int i;
        int A012 = AnonymousClass0Z0.A01(-952371940);
        if (intent == null) {
            i = 7726294;
        } else {
            Parcelable parcelableExtra = intent.getParcelableExtra("wrapped_intent");
            if (parcelableExtra instanceof Intent) {
                intent2 = (Intent) parcelableExtra;
            } else {
                intent2 = null;
            }
            if (intent2 != null) {
                A03(context, intent2, intent.getAction());
                i = 928610916;
            } else {
                A03(context, intent, intent.getAction());
                i = -1700168424;
            }
        }
        AnonymousClass0Z0.A0E(intent, i, A012);
    }
}
