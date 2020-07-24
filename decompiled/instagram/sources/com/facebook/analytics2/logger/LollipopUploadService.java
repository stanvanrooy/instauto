package com.facebook.analytics2.logger;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;
import p000X.AnonymousClass06Z;
import p000X.AnonymousClass0FY;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass0ZA;
import p000X.C032206c;
import p000X.C032306d;
import p000X.C033906u;
import p000X.C034006v;

public class LollipopUploadService extends JobService {
    public C034006v A00;

    public final boolean onStopJob(JobParameters jobParameters) {
        AnonymousClass06Z r1;
        C034006v r0 = this.A00;
        AnonymousClass0FY.A00(r0);
        int jobId = jobParameters.getJobId();
        C032306d r2 = r0.A01;
        AnonymousClass0FY.A00(r2);
        synchronized (r2) {
            C032206c r02 = (C032206c) r2.A01.get(jobId);
            if (r02 != null) {
                r1 = r02.A00;
            } else {
                r1 = null;
            }
            if (r1 != null) {
                AnonymousClass0ZA.A05(r1, r1.obtainMessage(3));
            }
        }
        return true;
    }

    public final void onCreate() {
        int A04 = AnonymousClass0Z0.A04(1066597169);
        this.A00 = C034006v.A00(this);
        AnonymousClass0Z0.A0B(837422433, A04);
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        int A04 = AnonymousClass0Z0.A04(970169453);
        C034006v r1 = this.A00;
        AnonymousClass0FY.A00(r1);
        int A03 = r1.A03(intent, new C033906u(this, i2));
        AnonymousClass0Z0.A0B(1871451629, A04);
        return A03;
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
    public final boolean onStartJob(android.app.job.JobParameters r13) {
        /*
            r12 = this;
            android.os.PersistableBundle r1 = r13.getExtras()
            java.lang.String r4 = "PostLolliopUploadService"
            r3 = 0
            if (r1 != 0) goto L_0x0015
            java.lang.String r0 = "Job with no version code, cancelling job"
            p000X.AnonymousClass0DB.A0D(r4, r0)
            r2 = 0
        L_0x000f:
            if (r2 != 0) goto L_0x002b
            r13.getJobId()
            return r3
        L_0x0015:
            java.lang.String r0 = "__VERSION_CODE"
            int r1 = r1.getInt(r0, r3)     // Catch:{ Exception -> 0x0023 }
            r0 = 227299068(0xd8c4efc, float:8.647181E-31)
            r2 = 1
            if (r0 == r1) goto L_0x000f
            r2 = 0
            goto L_0x000f
        L_0x0023:
            r1 = move-exception
            java.lang.String r0 = "Corrupt bundle, cancelling job"
            p000X.AnonymousClass0DB.A0M(r4, r1, r0)
            r2 = 0
            goto L_0x000f
        L_0x002b:
            X.06v r8 = r12.A00     // Catch:{ 05p -> 0x00bd }
            p000X.AnonymousClass0FY.A00(r8)     // Catch:{ 05p -> 0x00bd }
            int r11 = r13.getJobId()     // Catch:{ 05p -> 0x00bd }
            android.os.PersistableBundle r1 = r13.getExtras()     // Catch:{ 05p -> 0x00bd }
            java.lang.String r0 = "action"
            java.lang.String r10 = r1.getString(r0)     // Catch:{ 05p -> 0x00bd }
            X.06W r2 = new X.06W     // Catch:{ 05p -> 0x00bd }
            android.os.Bundle r1 = new android.os.Bundle     // Catch:{ 05p -> 0x00bd }
            android.os.PersistableBundle r0 = r13.getExtras()     // Catch:{ 05p -> 0x00bd }
            r1.<init>(r0)     // Catch:{ 05p -> 0x00bd }
            r2.<init>(r1)     // Catch:{ 05p -> 0x00bd }
            X.04K r7 = new X.04K     // Catch:{ 05p -> 0x00bd }
            r7.<init>(r12, r13)     // Catch:{ 05p -> 0x00bd }
            java.lang.String r0 = r2.A07     // Catch:{ 05p -> 0x00bd }
            r5 = r0
            if (r0 != 0) goto L_0x0057
            goto L_0x0066
        L_0x0057:
            android.content.Context r0 = r8.A00     // Catch:{ 05p -> 0x00bd }
            X.05J r1 = p000X.AnonymousClass05J.A00(r0)     // Catch:{ 05p -> 0x00bd }
            java.util.ArrayList r0 = r1.A02     // Catch:{ 05p -> 0x00bd }
            java.lang.Object r6 = p000X.AnonymousClass05J.A02(r1, r0, r5)     // Catch:{ 05p -> 0x00bd }
            X.06e r6 = (p000X.C032406e) r6     // Catch:{ 05p -> 0x00bd }
            goto L_0x0067
        L_0x0066:
            r6 = 0
        L_0x0067:
            if (r6 == 0) goto L_0x0070
            java.lang.String r0 = "JOB-"
            java.lang.String r5 = p000X.C034006v.A01(r8, r0, r11)     // Catch:{ 05p -> 0x00bd }
            goto L_0x0071
        L_0x0070:
            r5 = 0
        L_0x0071:
            if (r6 == 0) goto L_0x0076
            p000X.AnonymousClass0FY.A00(r5)     // Catch:{ 05p -> 0x00bd }
        L_0x0076:
            X.06d r9 = r8.A01     // Catch:{ 05p -> 0x00bd }
            p000X.AnonymousClass0FY.A00(r9)     // Catch:{ 05p -> 0x00bd }
            X.06X r8 = new X.06X     // Catch:{ 05p -> 0x00bd }
            r8.<init>(r11, r2, r10)     // Catch:{ 05p -> 0x00bd }
            X.02r r2 = new X.02r     // Catch:{ 05p -> 0x00bd }
            r2.<init>(r7, r5, r6)     // Catch:{ 05p -> 0x00bd }
            monitor-enter(r9)     // Catch:{ 05p -> 0x00bd }
            android.util.SparseArray r1 = r9.A01     // Catch:{ all -> 0x00ba }
            int r0 = r8.A00     // Catch:{ all -> 0x00ba }
            java.lang.Object r0 = r1.get(r0)     // Catch:{ all -> 0x00ba }
            X.06c r0 = (p000X.C032206c) r0     // Catch:{ all -> 0x00ba }
            monitor-enter(r9)     // Catch:{ all -> 0x00ba }
            if (r0 == 0) goto L_0x0096
            X.06Z r0 = r0.A00     // Catch:{ all -> 0x00b7 }
            goto L_0x0097
        L_0x0096:
            r0 = 0
        L_0x0097:
            if (r0 == 0) goto L_0x009b
            r0 = 0
            goto L_0x009f
        L_0x009b:
            p000X.C032306d.A00(r9, r8, r2)     // Catch:{ all -> 0x00b7 }
            r0 = 1
        L_0x009f:
            monitor-exit(r9)     // Catch:{ all -> 0x00ba }
            monitor-exit(r9)     // Catch:{ 05p -> 0x00bd }
            if (r0 != 0) goto L_0x00b5
            r2 = 1
            android.app.job.JobParameters r0 = r7.A00     // Catch:{ 05p -> 0x00bd }
            r0.getJobId()     // Catch:{ 05p -> 0x00bd }
            com.facebook.analytics2.logger.LollipopUploadService r1 = r7.A01     // Catch:{ 05p -> 0x00bd }
            android.app.job.JobParameters r0 = r7.A00     // Catch:{ 05p -> 0x00bd }
            r1.jobFinished(r0, r2)     // Catch:{ 05p -> 0x00bd }
            if (r6 == 0) goto L_0x00b5
            p000X.AnonymousClass0FY.A00(r5)     // Catch:{ 05p -> 0x00bd }
        L_0x00b5:
            r0 = 1
            return r0
        L_0x00b7:
            r0 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x00ba }
            throw r0     // Catch:{ all -> 0x00ba }
        L_0x00ba:
            r0 = move-exception
            monitor-exit(r9)     // Catch:{ 05p -> 0x00bd }
            throw r0     // Catch:{ 05p -> 0x00bd }
        L_0x00bd:
            r1 = move-exception
            java.lang.String r0 = "Misunderstood job service extras: %s"
            p000X.AnonymousClass0DB.A0H(r4, r0, r1)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.analytics2.logger.LollipopUploadService.onStartJob(android.app.job.JobParameters):boolean");
    }
}
