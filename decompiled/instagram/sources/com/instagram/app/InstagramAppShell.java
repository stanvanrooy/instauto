package com.instagram.app;

import android.app.Application;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Handler;
import android.os.HandlerThread;
import com.facebook.common.dextricks.DexLibLoader;
import com.facebook.common.dextricks.classtracing.logger.ClassTracingLogger;
import com.facebook.common.dextricks.verifier.Verifier;
import com.facebook.profilo.logger.Logger;
import java.io.File;
import org.webrtc.HardwareVideoEncoderFactory;
import p000X.AnonymousClass000;
import p000X.AnonymousClass04H;
import p000X.AnonymousClass0Bq;
import p000X.AnonymousClass0CX;
import p000X.AnonymousClass0CY;
import p000X.AnonymousClass0D8;
import p000X.AnonymousClass0D9;
import p000X.AnonymousClass0DA;
import p000X.AnonymousClass0DB;
import p000X.AnonymousClass0FU;
import p000X.AnonymousClass0KV;
import p000X.AnonymousClass0L7;
import p000X.AnonymousClass0NE;
import p000X.AnonymousClass0Q7;
import p000X.AnonymousClass0QD;
import p000X.AnonymousClass0QQ;
import p000X.AnonymousClass0SZ;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass0ZA;
import p000X.AnonymousClass0ZB;
import p000X.C030405d;
import p000X.C05000Hl;
import p000X.C05610Lg;
import p000X.C05630Li;
import p000X.C05700Lp;
import p000X.C05770Lw;
import p000X.C05850Mk;
import p000X.C05870Mu;
import p000X.C06140Nx;
import p000X.C06150Ny;
import p000X.C06530Pk;
import p000X.C07170Sa;
import p000X.C09680bp;
import p000X.C35391gI;

public class InstagramAppShell extends Application implements AnonymousClass0SZ {
    public long A00 = -1;
    public long A01 = -1;
    public long A02 = -1;
    public long A03 = -1;
    public AnonymousClass0CY A04;
    public AnonymousClass0QQ A05;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v8, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v69, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r4v2 */
    /* JADX WARNING: type inference failed for: r4v3, types: [java.io.BufferedReader] */
    /* JADX WARNING: type inference failed for: r4v4 */
    /* JADX WARNING: type inference failed for: r4v5 */
    /* JADX WARNING: type inference failed for: r1v48 */
    /* JADX WARNING: type inference failed for: r1v67, types: [java.io.Closeable] */
    /* JADX WARNING: type inference failed for: r1v68 */
    /* JADX WARNING: type inference failed for: r4v70 */
    /* JADX WARNING: type inference failed for: r4v71 */
    /* JADX WARNING: type inference failed for: r4v72 */
    /* JADX WARNING: type inference failed for: r4v73 */
    /* JADX WARNING: type inference failed for: r1v291 */
    /* JADX WARNING: type inference failed for: r4v74 */
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:391:0x0ab5 A[SYNTHETIC, Splitter:B:391:0x0ab5] */
    /* JADX WARNING: Removed duplicated region for block: B:400:0x0ada A[Catch:{ Exception -> 0x0ac2, all -> 0x0d15 }] */
    /* JADX WARNING: Removed duplicated region for block: B:403:0x0ae9 A[Catch:{ Exception -> 0x0ac2, all -> 0x0d15 }] */
    /* JADX WARNING: Removed duplicated region for block: B:406:0x0af8 A[Catch:{ Exception -> 0x0ac2, all -> 0x0d15 }] */
    /* JADX WARNING: Removed duplicated region for block: B:409:0x0b0b A[Catch:{ Exception -> 0x0ac2, all -> 0x0d15 }] */
    /* JADX WARNING: Removed duplicated region for block: B:416:0x0b2c A[Catch:{ Exception -> 0x0ac2, all -> 0x0d15 }] */
    /* JADX WARNING: Removed duplicated region for block: B:419:0x0b3b A[Catch:{ Exception -> 0x0ac2, all -> 0x0d15 }] */
    /* JADX WARNING: Removed duplicated region for block: B:422:0x0b4a A[Catch:{ Exception -> 0x0ac2, all -> 0x0d15 }] */
    /* JADX WARNING: Removed duplicated region for block: B:425:0x0b59 A[Catch:{ Exception -> 0x0ac2, all -> 0x0d15 }] */
    /* JADX WARNING: Removed duplicated region for block: B:428:0x0b6c A[Catch:{ Exception -> 0x0ac2, all -> 0x0d15 }] */
    /* JADX WARNING: Removed duplicated region for block: B:431:0x0b7b A[Catch:{ Exception -> 0x0ac2, all -> 0x0d15 }] */
    /* JADX WARNING: Removed duplicated region for block: B:434:0x0b8a A[Catch:{ Exception -> 0x0ac2, all -> 0x0d15 }] */
    /* JADX WARNING: Removed duplicated region for block: B:437:0x0b99 A[Catch:{ Exception -> 0x0ac2, all -> 0x0d15 }] */
    /* JADX WARNING: Removed duplicated region for block: B:465:0x0c42 A[Catch:{ Exception -> 0x0ac2, all -> 0x0d15 }] */
    /* JADX WARNING: Removed duplicated region for block: B:470:0x0c5f A[Catch:{ Exception -> 0x0ac2, all -> 0x0d15 }] */
    /* JADX WARNING: Removed duplicated region for block: B:473:0x0c87 A[Catch:{ Exception -> 0x0ac2, all -> 0x0d15 }] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:684:0x0f55=Splitter:B:684:0x0f55, B:692:0x0f5f=Splitter:B:692:0x0f5f} */
    public final void attachBaseContext(android.content.Context r46) {
        /*
            r45 = this;
            r14 = r45
            r44 = r46
            r0 = r44
            super.attachBaseContext(r0)
            com.facebook.common.time.AwakeTimeSinceBootClock r0 = com.facebook.common.time.AwakeTimeSinceBootClock.INSTANCE
            long r0 = r0.now()
            r14.A00 = r0
            java.lang.String r0 = "pre_init_qe"
            r10 = 0
            android.content.SharedPreferences r0 = r14.getSharedPreferences(r0, r10)
            p000X.C05630Li.A00 = r0
            int r5 = android.os.Process.myPid()
            java.lang.String r1 = "activity"
            java.lang.Object r4 = r14.getSystemService(r1)
            android.app.ActivityManager r4 = (android.app.ActivityManager) r4
            java.util.List r0 = r4.getRunningAppProcesses()
            if (r0 == 0) goto L_0x00a9
            java.util.Iterator r3 = r0.iterator()
        L_0x0030:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x00a9
            java.lang.Object r2 = r3.next()
            android.app.ActivityManager$RunningAppProcessInfo r2 = (android.app.ActivityManager.RunningAppProcessInfo) r2
            int r0 = r2.pid
            if (r0 != r5) goto L_0x0030
            java.lang.String r4 = r2.processName
        L_0x0042:
            X.0CY r0 = p000X.AnonymousClass0CY.A01(r4)
            r14.A04 = r0
            X.0I1 r4 = new X.0I1
            X.0L7 r3 = p000X.AnonymousClass0L7.LACRIMA
            java.lang.Boolean r17 = java.lang.Boolean.valueOf(r10)
            java.lang.String r16 = "is_enabled"
            r5 = 0
            r2 = r16
            r0 = r17
            r4.<init>(r2, r3, r0, r5)
            boolean r0 = p000X.C05630Li.A03(r4)
            if (r0 == 0) goto L_0x0682
            X.0CY r7 = r14.A04
            java.lang.String r6 = "lacrima"
            X.0CX r0 = r7.A00
            if (r0 == 0) goto L_0x00a7
            java.lang.String r1 = r0.A00
        L_0x006a:
            java.lang.String r0 = "pretosproc"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x1213
            X.0aa r1 = new X.0aa
            java.util.concurrent.ExecutorService r0 = p000X.AnonymousClass0EH.A00
            r1.<init>(r0)
            p000X.AnonymousClass0QD.A00 = r1
            X.0Hl r18 = new X.0Hl
            X.0L7 r20 = p000X.AnonymousClass0L7.INSTACRASH
            r0 = 1
            java.lang.Boolean r21 = java.lang.Boolean.valueOf(r0)
            r22 = 0
            r23 = 0
            r19 = r2
            r18.<init>(r19, r20, r21, r22, r23)
            boolean r0 = p000X.C05630Li.A03(r18)
            if (r0 == 0) goto L_0x009e
            X.0CX r1 = p000X.AnonymousClass0CX.A01
            X.0CX r0 = r7.A00
            boolean r0 = r1.equals(r0)
            p000X.C05410Ki.A00(r14, r0)
        L_0x009e:
            r1 = -1460951774(0xffffffffa8eba522, float:-2.6161856E-14)
            java.lang.String r0 = "BasicConfig.getConfig"
            p000X.AnonymousClass0ZB.A01(r0, r1)
            goto L_0x00eb
        L_0x00a7:
            r1 = 0
            goto L_0x006a
        L_0x00a9:
            r0 = 1000(0x3e8, float:1.401E-42)
            java.util.List r0 = r4.getRunningServices(r0)
            if (r0 == 0) goto L_0x00c9
            java.util.Iterator r3 = r0.iterator()
        L_0x00b5:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x00c9
            java.lang.Object r2 = r3.next()
            android.app.ActivityManager$RunningServiceInfo r2 = (android.app.ActivityManager.RunningServiceInfo) r2
            int r0 = r2.pid
            if (r0 != r5) goto L_0x00b5
            java.lang.String r4 = r2.process
            goto L_0x0042
        L_0x00c9:
            r4 = 0
            java.io.FileReader r3 = new java.io.FileReader     // Catch:{ IOException -> 0x00e3, all -> 0x1253 }
            java.lang.String r0 = "/proc/self/cmdline"
            r3.<init>(r0)     // Catch:{ IOException -> 0x00e3, all -> 0x1253 }
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch:{ IOException -> 0x00e3, all -> 0x1253 }
            r0 = 128(0x80, float:1.794E-43)
            r2.<init>(r3, r0)     // Catch:{ IOException -> 0x00e3, all -> 0x1253 }
            java.lang.String r0 = r2.readLine()     // Catch:{ IOException -> 0x00e4, all -> 0x1255 }
            if (r0 == 0) goto L_0x00e6
            java.lang.String r4 = r0.trim()     // Catch:{ IOException -> 0x00e4, all -> 0x1255 }
            goto L_0x00e6
        L_0x00e3:
            r2 = r4
        L_0x00e4:
            if (r2 == 0) goto L_0x0042
        L_0x00e6:
            r2.close()     // Catch:{ IOException -> 0x0042 }
            goto L_0x0042
        L_0x00eb:
            X.0J8 r4 = new X.0J8     // Catch:{ IOException -> 0x05f0 }
            r4.<init>()     // Catch:{ IOException -> 0x05f0 }
            X.0Iw r3 = new X.0Iw     // Catch:{ IOException -> 0x05f0 }
            r3.<init>()     // Catch:{ IOException -> 0x05f0 }
            X.0It r2 = new X.0It     // Catch:{ IOException -> 0x05f0 }
            r2.<init>()     // Catch:{ IOException -> 0x05f0 }
            X.0Io r8 = new X.0Io     // Catch:{ IOException -> 0x05f0 }
            r8.<init>()     // Catch:{ IOException -> 0x05f0 }
            X.0IX r1 = new X.0IX     // Catch:{ IOException -> 0x05f0 }
            r1.<init>()     // Catch:{ IOException -> 0x05f0 }
            X.0EW r0 = new X.0EW     // Catch:{ IOException -> 0x05f0 }
            r0.<init>(r14)     // Catch:{ IOException -> 0x05f0 }
            X.04n r9 = new X.04n     // Catch:{ IOException -> 0x05f0 }
            r9.<init>(r14)     // Catch:{ IOException -> 0x05f0 }
            r0.A05 = r9     // Catch:{ IOException -> 0x05f0 }
            X.04o r9 = new X.04o     // Catch:{ IOException -> 0x05f0 }
            r9.<init>(r14)     // Catch:{ IOException -> 0x05f0 }
            r0.A00 = r9     // Catch:{ IOException -> 0x05f0 }
            java.lang.String r11 = r7.A01     // Catch:{ IOException -> 0x05f0 }
            X.07t r9 = new X.07t     // Catch:{ IOException -> 0x05f0 }
            r9.<init>(r11)     // Catch:{ IOException -> 0x05f0 }
            r0.A01 = r9     // Catch:{ IOException -> 0x05f0 }
            X.0CX r7 = r7.A00     // Catch:{ IOException -> 0x05f0 }
            if (r7 == 0) goto L_0x01b7
            java.lang.String r9 = r7.A00     // Catch:{ IOException -> 0x05f0 }
        L_0x0126:
            X.07t r7 = new X.07t     // Catch:{ IOException -> 0x05f0 }
            r7.<init>(r9)     // Catch:{ IOException -> 0x05f0 }
            r0.A04 = r7     // Catch:{ IOException -> 0x05f0 }
            X.0ES r11 = new X.0ES     // Catch:{ IOException -> 0x05f0 }
            r11.<init>()     // Catch:{ IOException -> 0x05f0 }
            X.0ZX r7 = new X.0ZX     // Catch:{ IOException -> 0x05f0 }
            r7.<init>()     // Catch:{ IOException -> 0x05f0 }
            r11.A00 = r7     // Catch:{ IOException -> 0x05f0 }
            X.0ZQ r9 = new X.0ZQ     // Catch:{ IOException -> 0x05f0 }
            r9.<init>(r14)     // Catch:{ IOException -> 0x05f0 }
            X.0Dz r7 = p000X.C04440Dz.CRITICAL_REPORT     // Catch:{ IOException -> 0x05f0 }
            r11.A01(r9, r7)     // Catch:{ IOException -> 0x05f0 }
            X.0ZK r7 = new X.0ZK     // Catch:{ IOException -> 0x05f0 }
            r7.<init>()     // Catch:{ IOException -> 0x05f0 }
            X.0Dz r9 = p000X.C04440Dz.CRITICAL_REPORT     // Catch:{ IOException -> 0x05f0 }
            r11.A01(r7, r9)     // Catch:{ IOException -> 0x05f0 }
            X.0Z7 r7 = new X.0Z7     // Catch:{ IOException -> 0x05f0 }
            r7.<init>()     // Catch:{ IOException -> 0x05f0 }
            r11.A01(r7, r9)     // Catch:{ IOException -> 0x05f0 }
            X.0R6 r7 = r11.A00()     // Catch:{ IOException -> 0x05f0 }
            r0.A00(r7)     // Catch:{ IOException -> 0x05f0 }
            X.0ES r9 = new X.0ES     // Catch:{ IOException -> 0x05f0 }
            r9.<init>()     // Catch:{ IOException -> 0x05f0 }
            X.0Z6 r7 = new X.0Z6     // Catch:{ IOException -> 0x05f0 }
            r7.<init>()     // Catch:{ IOException -> 0x05f0 }
            r9.A00 = r7     // Catch:{ IOException -> 0x05f0 }
            X.0R6 r7 = r9.A00()     // Catch:{ IOException -> 0x05f0 }
            r0.A00(r7)     // Catch:{ IOException -> 0x05f0 }
            r7 = 2
            X.0Eo[] r9 = new p000X.C04590Eo[r7]     // Catch:{ IOException -> 0x05f0 }
            X.0Zb r11 = new X.0Zb     // Catch:{ IOException -> 0x05f0 }
            r11.<init>()     // Catch:{ IOException -> 0x05f0 }
            p000X.C04330Dn.A02 = r11     // Catch:{ IOException -> 0x05f0 }
            X.0Z4 r7 = new X.0Z4     // Catch:{ IOException -> 0x05f0 }
            r7.<init>(r11)     // Catch:{ IOException -> 0x05f0 }
            r9[r10] = r7     // Catch:{ IOException -> 0x05f0 }
            X.0Y6 r7 = new X.0Y6     // Catch:{ IOException -> 0x05f0 }
            r7.<init>()     // Catch:{ IOException -> 0x05f0 }
            r13 = 1
            r9[r13] = r7     // Catch:{ IOException -> 0x05f0 }
            X.0ES r11 = new X.0ES     // Catch:{ IOException -> 0x05f0 }
            r11.<init>()     // Catch:{ IOException -> 0x05f0 }
            X.0Z2 r7 = new X.0Z2     // Catch:{ IOException -> 0x05f0 }
            r7.<init>(r9)     // Catch:{ IOException -> 0x05f0 }
            r11.A00 = r7     // Catch:{ IOException -> 0x05f0 }
            X.0MA r10 = new X.0MA     // Catch:{ IOException -> 0x05f0 }
            r10.<init>()     // Catch:{ IOException -> 0x05f0 }
            X.0Dz r9 = p000X.C04440Dz.CRITICAL_REPORT     // Catch:{ IOException -> 0x05f0 }
            X.0EO r7 = r11.A04     // Catch:{ IOException -> 0x05f0 }
            r7.A00(r10, r9)     // Catch:{ IOException -> 0x05f0 }
            java.lang.Integer r7 = p000X.Constants.ZERO     // Catch:{ IOException -> 0x05f0 }
            r11.A02 = r7     // Catch:{ IOException -> 0x05f0 }
            X.0R6 r7 = r11.A00()     // Catch:{ IOException -> 0x05f0 }
            r0.A00(r7)     // Catch:{ IOException -> 0x05f0 }
            p000X.AnonymousClass0Bi.A00()     // Catch:{ IOException -> 0x05f0 }
            java.lang.String r9 = "JavaCrashDetector"
            r7 = -1183144774(0xffffffffb97aa4ba, float:-2.3903223E-4)
            p000X.AnonymousClass0ZL.A01(r9, r7)     // Catch:{ IOException -> 0x05f0 }
            goto L_0x01ba
        L_0x01b7:
            r9 = 0
            goto L_0x0126
        L_0x01ba:
            X.0ES r9 = new X.0ES     // Catch:{ all -> 0x05e0 }
            r9.<init>()     // Catch:{ all -> 0x05e0 }
            X.0WL r7 = new X.0WL     // Catch:{ all -> 0x05e0 }
            r7.<init>()     // Catch:{ all -> 0x05e0 }
            r9.A00 = r7     // Catch:{ all -> 0x05e0 }
            java.lang.Integer r7 = p000X.Constants.ZERO     // Catch:{ all -> 0x05e0 }
            r9.A02 = r7     // Catch:{ all -> 0x05e0 }
            X.0Ul r7 = new X.0Ul     // Catch:{ all -> 0x05e0 }
            r7.<init>()     // Catch:{ all -> 0x05e0 }
            X.0Dz r10 = p000X.C04440Dz.CRITICAL_REPORT     // Catch:{ all -> 0x05e0 }
            r9.A01(r7, r10)     // Catch:{ all -> 0x05e0 }
            X.0MA r11 = new X.0MA     // Catch:{ all -> 0x05e0 }
            r11.<init>()     // Catch:{ all -> 0x05e0 }
            X.0EO r7 = r9.A04     // Catch:{ all -> 0x05e0 }
            r7.A00(r11, r10)     // Catch:{ all -> 0x05e0 }
            X.0SG r7 = new X.0SG     // Catch:{ all -> 0x05e0 }
            r7.<init>()     // Catch:{ all -> 0x05e0 }
            r9.A01(r7, r10)     // Catch:{ all -> 0x05e0 }
            X.0MW r11 = new X.0MW     // Catch:{ all -> 0x05e0 }
            r11.<init>(r14)     // Catch:{ all -> 0x05e0 }
            X.0Dz r10 = p000X.C04440Dz.LARGE_REPORT     // Catch:{ all -> 0x05e0 }
            X.0EO r7 = r9.A04     // Catch:{ all -> 0x05e0 }
            r7.A00(r11, r10)     // Catch:{ all -> 0x05e0 }
            r9.A03 = r13     // Catch:{ all -> 0x05e0 }
            X.0SF r7 = new X.0SF     // Catch:{ all -> 0x05e0 }
            r7.<init>()     // Catch:{ all -> 0x05e0 }
            r9.A01 = r7     // Catch:{ all -> 0x05e0 }
            r7 = 1104743894(0x41d90dd6, float:27.131756)
            p000X.AnonymousClass0ZL.A00(r7)     // Catch:{ IOException -> 0x05f0 }
            X.0Dz r7 = p000X.C04440Dz.CRITICAL_REPORT     // Catch:{ IOException -> 0x05f0 }
            r9.A01(r4, r7)     // Catch:{ IOException -> 0x05f0 }
            r9.A01(r3, r10)     // Catch:{ IOException -> 0x05f0 }
            X.0Dz r7 = p000X.C04440Dz.CRITICAL_REPORT     // Catch:{ IOException -> 0x05f0 }
            r9.A02(r2, r7)     // Catch:{ IOException -> 0x05f0 }
            r9.A01(r1, r10)     // Catch:{ IOException -> 0x05f0 }
            X.0R6 r7 = r9.A00()     // Catch:{ IOException -> 0x05f0 }
            r0.A00(r7)     // Catch:{ IOException -> 0x05f0 }
            X.0Xy r7 = new X.0Xy     // Catch:{ IOException -> 0x05f0 }
            r7.<init>(r14)     // Catch:{ IOException -> 0x05f0 }
            r0.A00(r7)     // Catch:{ IOException -> 0x05f0 }
            X.0YF r7 = new X.0YF     // Catch:{ IOException -> 0x05f0 }
            r7.<init>(r14)     // Catch:{ IOException -> 0x05f0 }
            r0.A00(r7)     // Catch:{ IOException -> 0x05f0 }
            X.0Yf r7 = new X.0Yf     // Catch:{ IOException -> 0x05f0 }
            r7.<init>()     // Catch:{ IOException -> 0x05f0 }
            r0.A00(r7)     // Catch:{ IOException -> 0x05f0 }
            X.0Yn r7 = new X.0Yn     // Catch:{ IOException -> 0x05f0 }
            r7.<init>()     // Catch:{ IOException -> 0x05f0 }
            r0.A00(r7)     // Catch:{ IOException -> 0x05f0 }
            X.0ES r9 = new X.0ES     // Catch:{ IOException -> 0x05f0 }
            r9.<init>()     // Catch:{ IOException -> 0x05f0 }
            X.0Zx r7 = new X.0Zx     // Catch:{ IOException -> 0x05f0 }
            r7.<init>()     // Catch:{ IOException -> 0x05f0 }
            r9.A00 = r7     // Catch:{ IOException -> 0x05f0 }
            java.lang.Integer r7 = p000X.Constants.ONE     // Catch:{ IOException -> 0x05f0 }
            r9.A02 = r7     // Catch:{ IOException -> 0x05f0 }
            X.0Zf r7 = new X.0Zf     // Catch:{ IOException -> 0x05f0 }
            r7.<init>()     // Catch:{ IOException -> 0x05f0 }
            X.0Dz r10 = p000X.C04440Dz.CRITICAL_REPORT     // Catch:{ IOException -> 0x05f0 }
            r9.A02(r7, r10)     // Catch:{ IOException -> 0x05f0 }
            X.0Zd r7 = new X.0Zd     // Catch:{ IOException -> 0x05f0 }
            r7.<init>()     // Catch:{ IOException -> 0x05f0 }
            r9.A02(r7, r10)     // Catch:{ IOException -> 0x05f0 }
            X.0Zc r7 = new X.0Zc     // Catch:{ IOException -> 0x05f0 }
            r7.<init>()     // Catch:{ IOException -> 0x05f0 }
            r9.A01 = r7     // Catch:{ IOException -> 0x05f0 }
            r9.A02(r4, r10)     // Catch:{ IOException -> 0x05f0 }
            X.0Dz r7 = p000X.C04440Dz.LARGE_REPORT     // Catch:{ IOException -> 0x05f0 }
            r9.A02(r8, r7)     // Catch:{ IOException -> 0x05f0 }
            X.0Dz r11 = p000X.C04440Dz.CRITICAL_REPORT     // Catch:{ IOException -> 0x05f0 }
            r9.A02(r2, r10)     // Catch:{ IOException -> 0x05f0 }
            r9.A01(r1, r10)     // Catch:{ IOException -> 0x05f0 }
            X.0R6 r7 = r9.A00()     // Catch:{ IOException -> 0x05f0 }
            r0.A00(r7)     // Catch:{ IOException -> 0x05f0 }
            X.0ES r9 = new X.0ES     // Catch:{ IOException -> 0x05f0 }
            r9.<init>()     // Catch:{ IOException -> 0x05f0 }
            X.0Ya r7 = new X.0Ya     // Catch:{ IOException -> 0x05f0 }
            r7.<init>(r14)     // Catch:{ IOException -> 0x05f0 }
            r9.A00 = r7     // Catch:{ IOException -> 0x05f0 }
            java.lang.Integer r7 = p000X.Constants.ONE     // Catch:{ IOException -> 0x05f0 }
            r9.A02 = r7     // Catch:{ IOException -> 0x05f0 }
            X.0YX r7 = new X.0YX     // Catch:{ IOException -> 0x05f0 }
            r7.<init>()     // Catch:{ IOException -> 0x05f0 }
            X.0Dz r10 = p000X.C04440Dz.CRITICAL_REPORT     // Catch:{ IOException -> 0x05f0 }
            r9.A02(r7, r11)     // Catch:{ IOException -> 0x05f0 }
            X.0YQ r7 = new X.0YQ     // Catch:{ IOException -> 0x05f0 }
            r7.<init>()     // Catch:{ IOException -> 0x05f0 }
            r9.A02(r7, r11)     // Catch:{ IOException -> 0x05f0 }
            X.0YP r7 = new X.0YP     // Catch:{ IOException -> 0x05f0 }
            r7.<init>()     // Catch:{ IOException -> 0x05f0 }
            r9.A01 = r7     // Catch:{ IOException -> 0x05f0 }
            r9.A02(r4, r11)     // Catch:{ IOException -> 0x05f0 }
            X.0Dz r7 = p000X.C04440Dz.LARGE_REPORT     // Catch:{ IOException -> 0x05f0 }
            r9.A02(r8, r7)     // Catch:{ IOException -> 0x05f0 }
            r9.A02(r2, r11)     // Catch:{ IOException -> 0x05f0 }
            r9.A01(r1, r11)     // Catch:{ IOException -> 0x05f0 }
            X.0R6 r7 = r9.A00()     // Catch:{ IOException -> 0x05f0 }
            r0.A00(r7)     // Catch:{ IOException -> 0x05f0 }
            X.0ES r8 = new X.0ES     // Catch:{ IOException -> 0x05f0 }
            r8.<init>()     // Catch:{ IOException -> 0x05f0 }
            X.0Yr r7 = new X.0Yr     // Catch:{ IOException -> 0x05f0 }
            r7.<init>()     // Catch:{ IOException -> 0x05f0 }
            r8.A00 = r7     // Catch:{ IOException -> 0x05f0 }
            java.lang.Integer r7 = p000X.Constants.A0C     // Catch:{ IOException -> 0x05f0 }
            r8.A02 = r7     // Catch:{ IOException -> 0x05f0 }
            X.0Yo r7 = new X.0Yo     // Catch:{ IOException -> 0x05f0 }
            r7.<init>()     // Catch:{ IOException -> 0x05f0 }
            r8.A01 = r7     // Catch:{ IOException -> 0x05f0 }
            X.0Dz r7 = p000X.C04440Dz.LARGE_REPORT     // Catch:{ IOException -> 0x05f0 }
            r8.A01(r3, r7)     // Catch:{ IOException -> 0x05f0 }
            X.0R6 r7 = r8.A00()     // Catch:{ IOException -> 0x05f0 }
            r0.A00(r7)     // Catch:{ IOException -> 0x05f0 }
            X.0Hl r18 = new X.0Hl     // Catch:{ IOException -> 0x05f0 }
            X.0L7 r20 = p000X.AnonymousClass0L7.ANR_CONFIG     // Catch:{ IOException -> 0x05f0 }
            java.lang.String r19 = "is_detector_enabled"
            r18.<init>(r19, r20, r21, r22, r23)     // Catch:{ IOException -> 0x05f0 }
            boolean r7 = p000X.C05630Li.A03(r18)     // Catch:{ IOException -> 0x05f0 }
            if (r7 == 0) goto L_0x02fe
            X.0Hl r7 = new X.0Hl     // Catch:{ IOException -> 0x05f0 }
            X.0L7 r9 = p000X.AnonymousClass0L7.ANR_CONFIG     // Catch:{ IOException -> 0x05f0 }
            java.lang.String r8 = "is_reporter_enabled"
            r11 = 0
            r12 = 0
            r10 = r17
            r7.<init>(r8, r9, r10, r11, r12)     // Catch:{ IOException -> 0x05f0 }
            boolean r7 = p000X.C05630Li.A03(r7)     // Catch:{ IOException -> 0x05f0 }
            r10 = 0
            if (r7 == 0) goto L_0x0300
            r10 = 1
            goto L_0x0300
        L_0x02fe:
            r7 = 0
            goto L_0x033f
        L_0x0300:
            X.0ES r8 = new X.0ES     // Catch:{ IOException -> 0x05f0 }
            r8.<init>()     // Catch:{ IOException -> 0x05f0 }
            X.0SC r9 = new X.0SC     // Catch:{ IOException -> 0x05f0 }
            r9.<init>(r14, r10)     // Catch:{ IOException -> 0x05f0 }
            r8.A00 = r9     // Catch:{ IOException -> 0x05f0 }
            java.lang.Integer r7 = p000X.Constants.ONE     // Catch:{ IOException -> 0x05f0 }
            r8.A02 = r7     // Catch:{ IOException -> 0x05f0 }
            X.0SB r7 = new X.0SB     // Catch:{ IOException -> 0x05f0 }
            r7.<init>()     // Catch:{ IOException -> 0x05f0 }
            X.0Dz r10 = p000X.C04440Dz.CRITICAL_REPORT     // Catch:{ IOException -> 0x05f0 }
            r8.A01(r7, r10)     // Catch:{ IOException -> 0x05f0 }
            X.0MA r9 = new X.0MA     // Catch:{ IOException -> 0x05f0 }
            r9.<init>()     // Catch:{ IOException -> 0x05f0 }
            X.0EO r7 = r8.A04     // Catch:{ IOException -> 0x05f0 }
            r7.A00(r9, r10)     // Catch:{ IOException -> 0x05f0 }
            X.0SA r7 = new X.0SA     // Catch:{ IOException -> 0x05f0 }
            r7.<init>()     // Catch:{ IOException -> 0x05f0 }
            r8.A01 = r7     // Catch:{ IOException -> 0x05f0 }
            r8.A01(r4, r10)     // Catch:{ IOException -> 0x05f0 }
            X.0Dz r7 = p000X.C04440Dz.LARGE_REPORT     // Catch:{ IOException -> 0x05f0 }
            r8.A01(r3, r7)     // Catch:{ IOException -> 0x05f0 }
            r8.A02(r2, r10)     // Catch:{ IOException -> 0x05f0 }
            X.0Dz r7 = p000X.C04440Dz.LARGE_REPORT     // Catch:{ IOException -> 0x05f0 }
            r8.A01(r1, r7)     // Catch:{ IOException -> 0x05f0 }
            X.0R6 r7 = r8.A00()     // Catch:{ IOException -> 0x05f0 }
        L_0x033f:
            r0.A00(r7)     // Catch:{ IOException -> 0x05f0 }
            X.0ES r8 = new X.0ES     // Catch:{ IOException -> 0x05f0 }
            r8.<init>()     // Catch:{ IOException -> 0x05f0 }
            X.0S9 r7 = new X.0S9     // Catch:{ IOException -> 0x05f0 }
            r7.<init>()     // Catch:{ IOException -> 0x05f0 }
            r8.A00 = r7     // Catch:{ IOException -> 0x05f0 }
            java.lang.Integer r7 = p000X.Constants.A0C     // Catch:{ IOException -> 0x05f0 }
            r8.A02 = r7     // Catch:{ IOException -> 0x05f0 }
            X.0S8 r9 = new X.0S8     // Catch:{ IOException -> 0x05f0 }
            r9.<init>()     // Catch:{ IOException -> 0x05f0 }
            r8.A02(r9, r10)     // Catch:{ IOException -> 0x05f0 }
            X.0S7 r7 = new X.0S7     // Catch:{ IOException -> 0x05f0 }
            r7.<init>()     // Catch:{ IOException -> 0x05f0 }
            r8.A01 = r7     // Catch:{ IOException -> 0x05f0 }
            r8.A01(r4, r10)     // Catch:{ IOException -> 0x05f0 }
            X.0Dz r4 = p000X.C04440Dz.LARGE_REPORT     // Catch:{ IOException -> 0x05f0 }
            r8.A01(r3, r4)     // Catch:{ IOException -> 0x05f0 }
            r8.A02(r2, r10)     // Catch:{ IOException -> 0x05f0 }
            r8.A01(r1, r4)     // Catch:{ IOException -> 0x05f0 }
            X.0R6 r1 = r8.A00()     // Catch:{ IOException -> 0x05f0 }
            r0.A00(r1)     // Catch:{ IOException -> 0x05f0 }
            X.0IJ r1 = new X.0IJ     // Catch:{ IOException -> 0x05f0 }
            r1.<init>()     // Catch:{ IOException -> 0x05f0 }
            r0.A00(r1)     // Catch:{ IOException -> 0x05f0 }
            X.0SE r1 = new X.0SE     // Catch:{ IOException -> 0x05f0 }
            r1.<init>()     // Catch:{ IOException -> 0x05f0 }
            r0.A00(r1)     // Catch:{ IOException -> 0x05f0 }
            X.0IT r1 = r0.A03     // Catch:{ IOException -> 0x05f0 }
            if (r1 != 0) goto L_0x0395
            java.lang.String r2 = p000X.C04400Dv.A00()     // Catch:{ IOException -> 0x05f0 }
            X.07t r1 = new X.07t     // Catch:{ IOException -> 0x05f0 }
            r1.<init>(r2)     // Catch:{ IOException -> 0x05f0 }
            r0.A03 = r1     // Catch:{ IOException -> 0x05f0 }
        L_0x0395:
            X.0IT r1 = r0.A00     // Catch:{ IOException -> 0x05f0 }
            java.lang.String r2 = "0"
            if (r1 != 0) goto L_0x03a7
            java.lang.String r1 = "LacrimaConfigBuilder.setDeviceId not called, using 0"
            p000X.AnonymousClass0DB.A0E(r6, r1)     // Catch:{ IOException -> 0x05f0 }
            X.07t r1 = new X.07t     // Catch:{ IOException -> 0x05f0 }
            r1.<init>(r2)     // Catch:{ IOException -> 0x05f0 }
            r0.A00 = r1     // Catch:{ IOException -> 0x05f0 }
        L_0x03a7:
            X.0IT r1 = r0.A05     // Catch:{ IOException -> 0x05f0 }
            if (r1 != 0) goto L_0x03b7
            java.lang.String r1 = "LacrimaConfigBuilder.setUserId not called, using 0"
            p000X.AnonymousClass0DB.A0E(r6, r1)     // Catch:{ IOException -> 0x05f0 }
            X.07t r1 = new X.07t     // Catch:{ IOException -> 0x05f0 }
            r1.<init>(r2)     // Catch:{ IOException -> 0x05f0 }
            r0.A05 = r1     // Catch:{ IOException -> 0x05f0 }
        L_0x03b7:
            X.0IT r1 = r0.A02     // Catch:{ IOException -> 0x05f0 }
            if (r1 != 0) goto L_0x03c9
            java.lang.String r1 = "LacrimaConfigBuilder.setIsEmployee not called, using false"
            p000X.AnonymousClass0DB.A0E(r6, r1)     // Catch:{ IOException -> 0x05f0 }
            X.07t r2 = new X.07t     // Catch:{ IOException -> 0x05f0 }
            r1 = r17
            r2.<init>(r1)     // Catch:{ IOException -> 0x05f0 }
            r0.A02 = r2     // Catch:{ IOException -> 0x05f0 }
        L_0x03c9:
            X.0IT r1 = r0.A04     // Catch:{ IOException -> 0x05f0 }
            java.lang.String r2 = ""
            if (r1 != 0) goto L_0x03db
            java.lang.String r1 = "LacrimaConfigBuilder.setShortProcessName not called, using \"\""
            p000X.AnonymousClass0DB.A0E(r6, r1)     // Catch:{ IOException -> 0x05f0 }
            X.07t r1 = new X.07t     // Catch:{ IOException -> 0x05f0 }
            r1.<init>(r2)     // Catch:{ IOException -> 0x05f0 }
            r0.A04 = r1     // Catch:{ IOException -> 0x05f0 }
        L_0x03db:
            X.0IT r1 = r0.A01     // Catch:{ IOException -> 0x05f0 }
            if (r1 != 0) goto L_0x03eb
            java.lang.String r1 = "LacrimaConfigBuilder.setFullProcessName not called, using \"\""
            p000X.AnonymousClass0DB.A0E(r6, r1)     // Catch:{ IOException -> 0x05f0 }
            X.07t r1 = new X.07t     // Catch:{ IOException -> 0x05f0 }
            r1.<init>(r2)     // Catch:{ IOException -> 0x05f0 }
            r0.A01 = r1     // Catch:{ IOException -> 0x05f0 }
        L_0x03eb:
            X.0EV r15 = new X.0EV     // Catch:{ IOException -> 0x05f0 }
            android.app.Application r11 = r0.A06     // Catch:{ IOException -> 0x05f0 }
            java.lang.String r10 = r0.A07     // Catch:{ IOException -> 0x05f0 }
            X.0IT r9 = r0.A03     // Catch:{ IOException -> 0x05f0 }
            X.0IT r8 = r0.A00     // Catch:{ IOException -> 0x05f0 }
            X.0IT r7 = r0.A05     // Catch:{ IOException -> 0x05f0 }
            X.0IT r4 = r0.A02     // Catch:{ IOException -> 0x05f0 }
            java.util.List r3 = r0.A08     // Catch:{ IOException -> 0x05f0 }
            X.0IT r1 = r0.A04     // Catch:{ IOException -> 0x05f0 }
            X.0IT r0 = r0.A01     // Catch:{ IOException -> 0x05f0 }
            r2 = r15
            r17 = r10
            r18 = r9
            r19 = r8
            r20 = r7
            r21 = r4
            r22 = r3
            r23 = r1
            r24 = r0
            r16 = r11
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24)     // Catch:{ IOException -> 0x05f0 }
            p000X.AnonymousClass0M8.A00 = r15     // Catch:{ IOException -> 0x05f0 }
            java.lang.String r10 = "reports"
            java.lang.String r9 = "collector"
            X.0Bi r0 = p000X.AnonymousClass0Bi.A01()     // Catch:{ IOException -> 0x05f0 }
            if (r0 != 0) goto L_0x042a
            java.lang.String r0 = "ExceptionHandlerManager not initialized, initializing."
            p000X.AnonymousClass0DB.A0E(r6, r0)     // Catch:{ IOException -> 0x05f0 }
            p000X.AnonymousClass0Bi.A00()     // Catch:{ IOException -> 0x05f0 }
        L_0x042a:
            r1 = -1442594937(0xffffffffaa03bf87, float:-1.1701587E-13)
            java.lang.String r0 = "earlyJavaInit"
            p000X.AnonymousClass0ZL.A01(r0, r1)     // Catch:{ IOException -> 0x05f0 }
            X.0EL r4 = p000X.AnonymousClass0EL.A00(r9)     // Catch:{ all -> 0x05d8 }
            android.app.Application r3 = r15.A0H     // Catch:{ all -> 0x05d8 }
            int r1 = r15.A0D     // Catch:{ all -> 0x05d8 }
            int r0 = r15.A0E     // Catch:{ all -> 0x05d8 }
            r4.A03(r3, r1, r0)     // Catch:{ all -> 0x05d8 }
            X.0EL r4 = p000X.AnonymousClass0EL.A00(r10)     // Catch:{ all -> 0x05d8 }
            android.app.Application r3 = r15.A0H     // Catch:{ all -> 0x05d8 }
            int r1 = r15.A0F     // Catch:{ all -> 0x05d8 }
            int r0 = r15.A0G     // Catch:{ all -> 0x05d8 }
            r4.A03(r3, r1, r0)     // Catch:{ all -> 0x05d8 }
            long r3 = p000X.C04420Dx.A00()     // Catch:{ all -> 0x05d8 }
            r7 = 10240(0x2800, double:5.059E-320)
            int r0 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r0 >= 0) goto L_0x046c
            X.0EL r0 = p000X.AnonymousClass0EL.A00(r10)     // Catch:{ all -> 0x05d8 }
            r0.A01()     // Catch:{ all -> 0x05d8 }
            long r3 = p000X.C04420Dx.A00()     // Catch:{ all -> 0x05d8 }
            int r0 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r0 >= 0) goto L_0x046c
            X.0EL r0 = p000X.AnonymousClass0EL.A00(r9)     // Catch:{ all -> 0x05d8 }
            r0.A01()     // Catch:{ all -> 0x05d8 }
        L_0x046c:
            X.0IT r0 = r15.A0N     // Catch:{ all -> 0x05d8 }
            java.lang.Object r7 = r0.get()     // Catch:{ all -> 0x05d8 }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ all -> 0x05d8 }
            X.0FG r15 = new X.0FG     // Catch:{ all -> 0x05d8 }
            android.app.Application r3 = r2.A0H     // Catch:{ all -> 0x05d8 }
            r1 = 0
            java.lang.String r0 = "errorreporting"
            java.io.File r16 = r3.getDir(r0, r1)     // Catch:{ all -> 0x05d8 }
            X.0IT r0 = r2.A0O     // Catch:{ all -> 0x05d8 }
            java.lang.Object r4 = r0.get()     // Catch:{ all -> 0x05d8 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ all -> 0x05d8 }
            X.0IT r0 = r2.A05     // Catch:{ all -> 0x05d8 }
            if (r0 != 0) goto L_0x0492
            X.06l r0 = new X.06l     // Catch:{ all -> 0x05d8 }
            r0.<init>(r2)     // Catch:{ all -> 0x05d8 }
            r2.A05 = r0     // Catch:{ all -> 0x05d8 }
        L_0x0492:
            X.0IT r0 = r2.A05     // Catch:{ all -> 0x05d8 }
            java.lang.Object r3 = r0.get()     // Catch:{ all -> 0x05d8 }
            X.0S5 r3 = (p000X.AnonymousClass0S5) r3     // Catch:{ all -> 0x05d8 }
            X.0IT r0 = r2.A03     // Catch:{ all -> 0x05d8 }
            if (r0 != 0) goto L_0x04a5
            X.06g r0 = new X.06g     // Catch:{ all -> 0x05d8 }
            r0.<init>(r2)     // Catch:{ all -> 0x05d8 }
            r2.A03 = r0     // Catch:{ all -> 0x05d8 }
        L_0x04a5:
            X.0IT r0 = r2.A03     // Catch:{ all -> 0x05d8 }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x05d8 }
            X.0EF r0 = (p000X.AnonymousClass0EF) r0     // Catch:{ all -> 0x05d8 }
            r17 = r7
            r18 = r4
            r19 = r3
            r20 = r0
            r15.<init>(r16, r17, r18, r19, r20)     // Catch:{ all -> 0x05d8 }
            r2.A02 = r15     // Catch:{ all -> 0x05d8 }
            X.0Dr r3 = new X.0Dr     // Catch:{ all -> 0x05d8 }
            X.0IT r0 = r2.A06     // Catch:{ all -> 0x05d8 }
            if (r0 != 0) goto L_0x04c7
            X.06m r0 = new X.06m     // Catch:{ all -> 0x05d8 }
            r0.<init>(r2)     // Catch:{ all -> 0x05d8 }
            r2.A06 = r0     // Catch:{ all -> 0x05d8 }
        L_0x04c7:
            X.0IT r0 = r2.A06     // Catch:{ all -> 0x05d8 }
            java.lang.Object r1 = r0.get()     // Catch:{ all -> 0x05d8 }
            X.0PP r1 = (p000X.AnonymousClass0PP) r1     // Catch:{ all -> 0x05d8 }
            X.0Le r0 = new X.0Le     // Catch:{ all -> 0x05d8 }
            r0.<init>()     // Catch:{ all -> 0x05d8 }
            r3.<init>(r15, r1, r0)     // Catch:{ all -> 0x05d8 }
            r2.A01 = r3     // Catch:{ all -> 0x05d8 }
            X.0EL r0 = p000X.AnonymousClass0EL.A00(r9)     // Catch:{ all -> 0x05d8 }
            r0.A02()     // Catch:{ all -> 0x05d8 }
            X.0EL r0 = p000X.AnonymousClass0EL.A00(r10)     // Catch:{ all -> 0x05d8 }
            r0.A02()     // Catch:{ all -> 0x05d8 }
            X.0IT r0 = r2.A09     // Catch:{ all -> 0x05d8 }
            if (r0 != 0) goto L_0x04f2
            X.06P r0 = new X.06P     // Catch:{ all -> 0x05d8 }
            r0.<init>(r2)     // Catch:{ all -> 0x05d8 }
            r2.A09 = r0     // Catch:{ all -> 0x05d8 }
        L_0x04f2:
            X.0IT r0 = r2.A09     // Catch:{ all -> 0x05d8 }
            p000X.AnonymousClass0EX.A01 = r0     // Catch:{ all -> 0x05d8 }
            if (r0 != 0) goto L_0x04ff
            X.06P r0 = new X.06P     // Catch:{ all -> 0x05d8 }
            r0.<init>(r2)     // Catch:{ all -> 0x05d8 }
            r2.A09 = r0     // Catch:{ all -> 0x05d8 }
        L_0x04ff:
            X.0IT r0 = r2.A09     // Catch:{ all -> 0x05d8 }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x05d8 }
            X.0PA r0 = (p000X.AnonymousClass0PA) r0     // Catch:{ all -> 0x05d8 }
            java.lang.String r4 = "endpoint_override"
            r7 = 0
            android.app.Application r3 = r0.A00     // Catch:{ all -> 0x05d8 }
            r0 = 0
            android.content.SharedPreferences r0 = r3.getSharedPreferences(r6, r0)     // Catch:{ all -> 0x05d8 }
            java.lang.String r1 = r0.getString(r4, r7)     // Catch:{ all -> 0x05d8 }
            if (r1 == 0) goto L_0x0526
            p000X.AnonymousClass0EX.A00 = r1     // Catch:{ all -> 0x05d8 }
            X.0IT r0 = p000X.AnonymousClass0EX.A01     // Catch:{ all -> 0x05d8 }
            if (r0 == 0) goto L_0x0526
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x05d8 }
            X.0PA r0 = (p000X.AnonymousClass0PA) r0     // Catch:{ all -> 0x05d8 }
            r0.A01(r4, r1)     // Catch:{ all -> 0x05d8 }
        L_0x0526:
            r0 = 1518099960(0x5a7c5df8, float:1.77587535E16)
            p000X.AnonymousClass0ZL.A00(r0)     // Catch:{ IOException -> 0x05f0 }
            java.util.List r0 = r2.A0J     // Catch:{ IOException -> 0x05f0 }
            java.util.Iterator r1 = r0.iterator()     // Catch:{ IOException -> 0x05f0 }
        L_0x0532:
            boolean r0 = r1.hasNext()     // Catch:{ IOException -> 0x05f0 }
            if (r0 == 0) goto L_0x0542
            java.lang.Object r0 = r1.next()     // Catch:{ IOException -> 0x05f0 }
            X.0ET r0 = (p000X.AnonymousClass0ET) r0     // Catch:{ IOException -> 0x05f0 }
            r0.ACl(r2)     // Catch:{ IOException -> 0x05f0 }
            goto L_0x0532
        L_0x0542:
            java.lang.String r1 = "sendPendingReports"
            r0 = 473300282(0x1c35fd3a, float:6.0215164E-22)
            p000X.AnonymousClass0ZL.A01(r1, r0)     // Catch:{ IOException -> 0x05f0 }
            X.0IT r0 = r2.A08     // Catch:{ all -> 0x05d0 }
            if (r0 != 0) goto L_0x0556
            X.06f r0 = new X.06f     // Catch:{ all -> 0x05d0 }
            r0.<init>(r2)     // Catch:{ all -> 0x05d0 }
            r2.A08 = r0     // Catch:{ all -> 0x05d0 }
        L_0x0556:
            X.0IT r0 = r2.A08     // Catch:{ all -> 0x05d0 }
            java.lang.Object r1 = r0.get()     // Catch:{ all -> 0x05d0 }
            X.0F7 r1 = (p000X.AnonymousClass0F7) r1     // Catch:{ all -> 0x05d0 }
            X.0Dz r0 = p000X.C04440Dz.CRITICAL_REPORT     // Catch:{ all -> 0x05d0 }
            r1.A01(r0)     // Catch:{ all -> 0x05d0 }
            X.0Dz r0 = p000X.C04440Dz.LARGE_REPORT     // Catch:{ all -> 0x05d0 }
            r1.A01(r0)     // Catch:{ all -> 0x05d0 }
            r1.A00()     // Catch:{ all -> 0x05d0 }
            r0 = -245271246(0xfffffffff1617532, float:-1.1164129E30)
            p000X.AnonymousClass0ZL.A00(r0)     // Catch:{ IOException -> 0x05f0 }
            p000X.AnonymousClass0YI.A00(r14)     // Catch:{ IOException -> 0x05f0 }
            X.0EV r3 = p000X.AnonymousClass0M8.A00     // Catch:{ IOException -> 0x05f0 }
            X.0FG r0 = r3.A02     // Catch:{ IOException -> 0x05f0 }
            if (r0 == 0) goto L_0x120d
            r1 = -507217368(0xffffffffe1c47a28, float:-4.530455E20)
            java.lang.String r0 = "earlyNativeInit"
            p000X.AnonymousClass0ZL.A01(r0, r1)     // Catch:{ IOException -> 0x05f0 }
            boolean r0 = com.facebook.errorreporting.lacrima.common.mappedfile.mlocked.MLockedFile.sLibraryLoaded     // Catch:{ all -> 0x05e8 }
            if (r0 != 0) goto L_0x0590
            r1 = 1
            java.lang.String r0 = "appstatelogger2"
            p000X.AnonymousClass0Y1.A08(r0)     // Catch:{ RuntimeException | UnsatisfiedLinkError -> 0x058d, all -> 0x05ae }
            goto L_0x058e
        L_0x058d:
            r1 = 0
        L_0x058e:
            com.facebook.errorreporting.lacrima.common.mappedfile.mlocked.MLockedFile.sLibraryLoaded = r1     // Catch:{ all -> 0x05e8 }
        L_0x0590:
            X.0FG r2 = r3.A01()     // Catch:{ all -> 0x05e8 }
            X.0N2 r1 = r2.A02     // Catch:{ all -> 0x05e8 }
            java.lang.String r0 = "Did you call SessionManager.init()?"
            p000X.AnonymousClass11J.A01(r1, r0)     // Catch:{ all -> 0x05e8 }
            X.0N2 r2 = r2.A02     // Catch:{ all -> 0x05e8 }
            boolean r0 = r2.A01     // Catch:{ all -> 0x05e8 }
            if (r0 == 0) goto L_0x05b2
            java.lang.Object r1 = r2.A02     // Catch:{ all -> 0x05e8 }
            monitor-enter(r1)     // Catch:{ all -> 0x05e8 }
            X.0P7 r0 = r2.A00     // Catch:{ all -> 0x05ab }
            r0.mlockBuffer()     // Catch:{ all -> 0x05ab }
            monitor-exit(r1)     // Catch:{ all -> 0x05ab }
            goto L_0x05b2
        L_0x05ab:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x05ab }
            goto L_0x05b1
        L_0x05ae:
            r0 = move-exception
            com.facebook.errorreporting.lacrima.common.mappedfile.mlocked.MLockedFile.sLibraryLoaded = r13     // Catch:{ all -> 0x05e8 }
        L_0x05b1:
            throw r0     // Catch:{ all -> 0x05e8 }
        L_0x05b2:
            java.util.List r0 = r3.A0J     // Catch:{ all -> 0x05e8 }
            java.util.Iterator r1 = r0.iterator()     // Catch:{ all -> 0x05e8 }
        L_0x05b8:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x05e8 }
            if (r0 == 0) goto L_0x05c8
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x05e8 }
            X.0ET r0 = (p000X.AnonymousClass0ET) r0     // Catch:{ all -> 0x05e8 }
            r0.ACm(r3)     // Catch:{ all -> 0x05e8 }
            goto L_0x05b8
        L_0x05c8:
            r0 = 247846743(0xec5d757, float:4.8771614E-30)
            p000X.AnonymousClass0ZL.A00(r0)     // Catch:{ IOException -> 0x05f0 }
            goto L_0x120d
        L_0x05d0:
            r1 = move-exception
            r0 = 2055539141(0x7a8509c5, float:3.453868E35)
            p000X.AnonymousClass0ZL.A00(r0)     // Catch:{ IOException -> 0x05f0 }
            goto L_0x05ef
        L_0x05d8:
            r1 = move-exception
            r0 = 91165084(0x56f119c, float:1.124096E-35)
            p000X.AnonymousClass0ZL.A00(r0)     // Catch:{ IOException -> 0x05f0 }
            goto L_0x05ef
        L_0x05e0:
            r1 = move-exception
            r0 = 19319628(0x126cb4c, float:3.0635243E-38)
            p000X.AnonymousClass0ZL.A00(r0)     // Catch:{ IOException -> 0x05f0 }
            goto L_0x05ef
        L_0x05e8:
            r1 = move-exception
            r0 = -1705743841(0xffffffff9a546a1f, float:-4.3926296E-23)
            p000X.AnonymousClass0ZL.A00(r0)     // Catch:{ IOException -> 0x05f0 }
        L_0x05ef:
            throw r1     // Catch:{ IOException -> 0x05f0 }
        L_0x05f0:
            r1 = move-exception
            java.lang.String r0 = "Could not initialize error reporting"
            p000X.AnonymousClass0DB.A0H(r6, r0, r1)     // Catch:{ all -> 0x067a }
            X.0EV r0 = p000X.AnonymousClass0M8.A00     // Catch:{ all -> 0x067a }
            if (r0 != 0) goto L_0x05fc
            r3 = 0
            goto L_0x05fe
        L_0x05fc:
            X.0IT r3 = r0.A0P     // Catch:{ all -> 0x067a }
        L_0x05fe:
            java.util.HashMap r2 = new java.util.HashMap     // Catch:{ all -> 0x067a }
            r2.<init>()     // Catch:{ all -> 0x067a }
            X.0Bi r0 = p000X.AnonymousClass0Bi.A01()     // Catch:{ all -> 0x067a }
            if (r0 == 0) goto L_0x063c
            X.0ND r1 = new X.0ND     // Catch:{ all -> 0x067a }
            r1.<init>(r2, r3)     // Catch:{ all -> 0x067a }
            r0 = 100
            p000X.AnonymousClass0Bi.A03(r1, r0)     // Catch:{ all -> 0x067a }
        L_0x0613:
            java.lang.Object r3 = r3.get()     // Catch:{ all -> 0x067a }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x067a }
            java.lang.String r2 = "Use fallback error handler"
            java.util.HashMap r5 = new java.util.HashMap     // Catch:{ all -> 0x067a }
            r5.<init>()     // Catch:{ all -> 0x067a }
            java.lang.String r1 = "category"
            java.lang.String r0 = "soft_error"
            r5.put(r1, r0)     // Catch:{ all -> 0x067a }
            java.lang.String r1 = "endpoint"
            java.lang.String r0 = "lacrima_direct_report"
            r5.put(r1, r0)     // Catch:{ all -> 0x067a }
            java.lang.String r0 = "soft_error_category"
            r5.put(r0, r6)     // Catch:{ all -> 0x067a }
            java.lang.String r0 = "soft_error_message"
            r5.put(r0, r2)     // Catch:{ all -> 0x067a }
            goto L_0x0649
        L_0x063c:
            java.lang.Thread$UncaughtExceptionHandler r1 = java.lang.Thread.getDefaultUncaughtExceptionHandler()     // Catch:{ all -> 0x067a }
            X.0EC r0 = new X.0EC     // Catch:{ all -> 0x067a }
            r0.<init>(r2, r3, r1)     // Catch:{ all -> 0x067a }
            java.lang.Thread.setDefaultUncaughtExceptionHandler(r0)     // Catch:{ all -> 0x067a }
            goto L_0x0613
        L_0x0649:
            if (r3 == 0) goto L_0x0651
            java.lang.String r0 = "user_id"
            r5.put(r0, r3)     // Catch:{ all -> 0x067a }
        L_0x0651:
            X.0EB r0 = p000X.AnonymousClass0EB.A04     // Catch:{ all -> 0x067a }
            if (r0 != 0) goto L_0x065c
            X.0EB r0 = new X.0EB     // Catch:{ all -> 0x067a }
            r0.<init>()     // Catch:{ all -> 0x067a }
            p000X.AnonymousClass0EB.A04 = r0     // Catch:{ all -> 0x067a }
        L_0x065c:
            X.0EB r4 = p000X.AnonymousClass0EB.A04     // Catch:{ all -> 0x067a }
            java.lang.String r3 = "android_large_soft_error"
            java.util.concurrent.ExecutorService r0 = r4.A03     // Catch:{ all -> 0x067a }
            if (r0 != 0) goto L_0x0668
            java.util.concurrent.ExecutorService r0 = p000X.AnonymousClass0EH.A00     // Catch:{ all -> 0x067a }
            r4.A03 = r0     // Catch:{ all -> 0x067a }
        L_0x0668:
            java.util.concurrent.ExecutorService r2 = r4.A03     // Catch:{ all -> 0x067a }
            X.0E9 r1 = new X.0E9     // Catch:{ all -> 0x067a }
            r1.<init>(r4, r5, r3)     // Catch:{ all -> 0x067a }
            r0 = -959363524(0xffffffffc6d1463c, float:-26787.117)
            p000X.AnonymousClass0Z9.A03(r2, r1, r0)     // Catch:{ all -> 0x067a }
            r0 = 878591175(0x345e3cc7, float:2.0697472E-7)
            goto L_0x1210
        L_0x067a:
            r1 = move-exception
            r0 = -1678038703(0xffffffff9bfb2951, float:-4.1551167E-22)
            p000X.AnonymousClass0ZB.A00(r0)
            throw r1
        L_0x0682:
            X.0I1 r7 = new X.0I1
            X.0L7 r6 = p000X.AnonymousClass0L7.APP_RELEASE_CHANNEL
            r0 = 1
            java.lang.String[] r3 = new java.lang.String[r0]
            java.lang.String r4 = "PUBLIC"
            r3[r10] = r4
            java.lang.String r0 = "release_channel"
            r7.<init>(r0, r6, r4, r3)
            p000X.C05630Li.A02(r7)
            android.content.SharedPreferences r3 = p000X.C05630Li.A00
            java.lang.String r2 = p000X.C05630Li.A01(r7)
            java.lang.Object r0 = r7.A03
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = r3.getString(r2, r0)
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x06c9
            java.lang.String r4 = "https://www.facebook.com/mobile/instagram_android_crash_logs/"
        L_0x06ac:
            X.0CY r3 = r14.A04
            if (r45 == 0) goto L_0x1252
            if (r4 == 0) goto L_0x1252
            if (r3 == 0) goto L_0x1252
            X.0Jl r0 = new X.0Jl
            r0.<init>(r14, r4, r3)
            r2 = 1
            p000X.AnonymousClass0K9.A01 = r2
            boolean r2 = p000X.C06530Pk.A00
            if (r2 == 0) goto L_0x06c8
            r3 = 1313347476(0x4e481794, float:8.392471E8)
            java.lang.String r2 = "initACRA"
            p000X.AnonymousClass0ZB.A01(r2, r3)
        L_0x06c8:
            goto L_0x06cc
        L_0x06c9:
            java.lang.String r4 = "https://www.facebook.com/mobile/instagram_android_beta_crash_logs/"
            goto L_0x06ac
        L_0x06cc:
            X.0Hl r34 = new X.0Hl     // Catch:{ all -> 0x1246 }
            X.0L7 r36 = p000X.AnonymousClass0L7.INSTACRASH     // Catch:{ all -> 0x1246 }
            r2 = 1
            java.lang.Boolean r37 = java.lang.Boolean.valueOf(r2)     // Catch:{ all -> 0x1246 }
            r41 = r37
            r38 = 0
            r39 = 0
            r35 = r16
            r34.<init>(r35, r36, r37, r38, r39)     // Catch:{ all -> 0x1246 }
            boolean r2 = p000X.C05630Li.A03(r34)     // Catch:{ all -> 0x1246 }
            if (r2 == 0) goto L_0x06f5
            android.app.Application r4 = r0.A00     // Catch:{ all -> 0x1246 }
            X.0CY r2 = r0.A01     // Catch:{ all -> 0x1246 }
            X.0CX r3 = p000X.AnonymousClass0CX.A01     // Catch:{ all -> 0x1246 }
            X.0CX r2 = r2.A00     // Catch:{ all -> 0x1246 }
            boolean r2 = r3.equals(r2)     // Catch:{ all -> 0x1246 }
            p000X.C05410Ki.A00(r4, r2)     // Catch:{ all -> 0x1246 }
        L_0x06f5:
            X.0Hl r34 = new X.0Hl     // Catch:{ all -> 0x1246 }
            X.0L7 r36 = p000X.AnonymousClass0L7.APPSTATE_LOGGER     // Catch:{ all -> 0x1246 }
            r34.<init>(r35, r36, r37, r38, r39)     // Catch:{ all -> 0x1246 }
            boolean r2 = p000X.C05630Li.A03(r34)     // Catch:{ all -> 0x1246 }
            if (r2 == 0) goto L_0x08eb
            android.app.Application r6 = r0.A00     // Catch:{ all -> 0x1246 }
            X.0CY r4 = r0.A01     // Catch:{ all -> 0x1246 }
            X.0CX r2 = p000X.AnonymousClass0CX.A01     // Catch:{ all -> 0x1246 }
            X.0CX r3 = r4.A00     // Catch:{ all -> 0x1246 }
            boolean r2 = r2.equals(r3)     // Catch:{ all -> 0x1246 }
            if (r2 != 0) goto L_0x0720
            if (r3 == 0) goto L_0x0715
            java.lang.String r3 = r3.A00     // Catch:{ all -> 0x1246 }
            goto L_0x0716
        L_0x0715:
            r3 = 0
        L_0x0716:
            if (r3 == 0) goto L_0x08eb
            java.lang.String r2 = "browser"
            boolean r2 = r3.equals(r2)     // Catch:{ all -> 0x1246 }
            if (r2 == 0) goto L_0x08eb
        L_0x0720:
            long r24 = android.os.SystemClock.uptimeMillis()     // Catch:{ all -> 0x1246 }
            X.0Gr r32 = new X.0Gr     // Catch:{ all -> 0x1246 }
            r32.<init>()     // Catch:{ all -> 0x1246 }
            X.0BY r2 = p000X.AnonymousClass0BY.A03     // Catch:{ all -> 0x1246 }
            if (r2 != 0) goto L_0x0741
            java.lang.Class<X.0BY> r3 = p000X.AnonymousClass0BY.class
            monitor-enter(r3)     // Catch:{ all -> 0x1246 }
            X.0BY r2 = p000X.AnonymousClass0BY.A03     // Catch:{ all -> 0x073d }
            if (r2 != 0) goto L_0x073b
            X.0BY r2 = new X.0BY     // Catch:{ all -> 0x073d }
            r2.<init>()     // Catch:{ all -> 0x073d }
            p000X.AnonymousClass0BY.A03 = r2     // Catch:{ all -> 0x073d }
        L_0x073b:
            monitor-exit(r3)     // Catch:{ all -> 0x073d }
            goto L_0x0741
        L_0x073d:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x073d }
            goto L_0x11eb
        L_0x0741:
            X.0BY r5 = p000X.AnonymousClass0BY.A03     // Catch:{ all -> 0x1246 }
            java.lang.String r4 = r4.A01     // Catch:{ all -> 0x1246 }
            if (r4 != 0) goto L_0x074a
            java.lang.String r4 = "unknown"
        L_0x074a:
            if (r6 == 0) goto L_0x08e3
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ all -> 0x1246 }
            r3.<init>()     // Catch:{ all -> 0x1246 }
            X.08J r2 = new X.08J     // Catch:{ all -> 0x1246 }
            r2.<init>()     // Catch:{ all -> 0x1246 }
            r3.add(r2)     // Catch:{ all -> 0x1246 }
            X.083 r2 = new X.083     // Catch:{ all -> 0x1246 }
            r2.<init>()     // Catch:{ all -> 0x1246 }
            r3.add(r2)     // Catch:{ all -> 0x1246 }
            X.07A r2 = new X.07A     // Catch:{ all -> 0x1246 }
            r2.<init>()     // Catch:{ all -> 0x1246 }
            r3.add(r2)     // Catch:{ all -> 0x1246 }
            X.08g r2 = new X.08g     // Catch:{ all -> 0x1246 }
            r2.<init>()     // Catch:{ all -> 0x1246 }
            r3.add(r2)     // Catch:{ all -> 0x1246 }
            X.07c r2 = new X.07c     // Catch:{ all -> 0x1246 }
            r2.<init>()     // Catch:{ all -> 0x1246 }
            r3.add(r2)     // Catch:{ all -> 0x1246 }
            boolean r2 = r5.A0V(r6)     // Catch:{ all -> 0x1246 }
            if (r2 == 0) goto L_0x0787
            X.073 r2 = new X.073     // Catch:{ all -> 0x1246 }
            r2.<init>(r6)     // Catch:{ all -> 0x1246 }
            r3.add(r2)     // Catch:{ all -> 0x1246 }
        L_0x0787:
            boolean r2 = r5.A0Q(r6)     // Catch:{ all -> 0x1246 }
            if (r2 == 0) goto L_0x0795
            X.08r r2 = new X.08r     // Catch:{ all -> 0x1246 }
            r2.<init>()     // Catch:{ all -> 0x1246 }
            r3.add(r2)     // Catch:{ all -> 0x1246 }
        L_0x0795:
            boolean r2 = r5.A0U(r6)     // Catch:{ all -> 0x1246 }
            if (r2 == 0) goto L_0x07a3
            X.07Q r2 = new X.07Q     // Catch:{ all -> 0x1246 }
            r2.<init>()     // Catch:{ all -> 0x1246 }
            r3.add(r2)     // Catch:{ all -> 0x1246 }
        L_0x07a3:
            java.util.List r2 = r5.A08()     // Catch:{ all -> 0x1246 }
            r3.addAll(r2)     // Catch:{ all -> 0x1246 }
            java.lang.String r2 = "app_state_log_write_free_internal_disk_space"
            boolean r35 = p000X.AnonymousClass0FU.A08(r6, r2)     // Catch:{ all -> 0x1246 }
            java.lang.Object r7 = p000X.AnonymousClass09Q.A0X     // Catch:{ all -> 0x1246 }
            monitor-enter(r7)     // Catch:{ all -> 0x1246 }
            X.09Q r2 = p000X.AnonymousClass09Q.A0W     // Catch:{ all -> 0x08df }
            if (r2 != 0) goto L_0x08d7
            X.0BK r2 = new X.0BK     // Catch:{ all -> 0x08df }
            r2.<init>()     // Catch:{ all -> 0x08df }
            p000X.C04330Dn.A02 = r2     // Catch:{ all -> 0x08df }
            monitor-exit(r7)     // Catch:{ all -> 0x08df }
            java.lang.Object r12 = r6.getSystemService(r1)     // Catch:{ all -> 0x1246 }
            android.app.ActivityManager r12 = (android.app.ActivityManager) r12     // Catch:{ all -> 0x1246 }
            java.security.SecureRandom r9 = new java.security.SecureRandom     // Catch:{ all -> 0x1246 }
            r9.<init>()     // Catch:{ all -> 0x1246 }
            r19 = -1
            java.lang.String r2 = "acra_criticaldata_store"
            android.content.SharedPreferences r7 = r6.getSharedPreferences(r2, r10)     // Catch:{ NumberFormatException -> 0x07e0 }
            java.lang.String r2 = "CLIENT_USER_ID"
            java.lang.String r1 = ""
            java.lang.String r1 = r7.getString(r2, r1)     // Catch:{ NumberFormatException -> 0x07e0 }
            if (r1 == 0) goto L_0x07e0
            long r19 = java.lang.Long.parseLong(r1)     // Catch:{ NumberFormatException -> 0x07e0 }
        L_0x07e0:
            java.util.UUID r18 = new java.util.UUID     // Catch:{ all -> 0x1246 }
            long r7 = r9.nextLong()     // Catch:{ all -> 0x1246 }
            long r7 = r7 ^ r24
            long r1 = r9.nextLong()     // Catch:{ all -> 0x1246 }
            long r19 = r19 ^ r1
            r26 = r18
            r27 = r7
            r29 = r19
            r26.<init>(r27, r29)     // Catch:{ all -> 0x1246 }
            java.lang.String r1 = "state_logs"
            java.io.File r9 = r6.getDir(r1, r10)     // Catch:{ all -> 0x1246 }
            int r20 = android.os.Process.myPid()     // Catch:{ all -> 0x1246 }
            r2 = 58
            r1 = 95
            java.lang.String r8 = r4.replace(r2, r1)     // Catch:{ all -> 0x1246 }
            java.lang.String r7 = "_"
            java.lang.String r2 = r18.toString()     // Catch:{ all -> 0x1246 }
            java.lang.Integer r1 = p000X.AnonymousClass03N.A00     // Catch:{ all -> 0x1246 }
            java.lang.String r1 = p000X.AnonymousClass03N.A01(r1)     // Catch:{ all -> 0x1246 }
            java.lang.String r1 = p000X.AnonymousClass000.A0N(r8, r7, r2, r1)     // Catch:{ all -> 0x1246 }
            java.io.File r15 = new java.io.File     // Catch:{ all -> 0x1246 }
            r15.<init>(r9, r1)     // Catch:{ all -> 0x1246 }
            android.content.pm.PackageManager r9 = r6.getPackageManager()     // Catch:{ all -> 0x1246 }
            android.content.pm.ApplicationInfo r1 = r6.getApplicationInfo()     // Catch:{ all -> 0x1246 }
            X.0D2 r8 = new X.0D2     // Catch:{ all -> 0x1246 }
            r8.<init>(r9, r1)     // Catch:{ all -> 0x1246 }
            java.lang.String r13 = r6.getPackageName()     // Catch:{ all -> 0x1246 }
            r7 = 0
            android.content.pm.PackageManager r1 = r8.A01     // Catch:{ NameNotFoundException -> 0x0842, RuntimeException -> 0x0838 }
            android.content.pm.PackageInfo r7 = r1.getPackageInfo(r13, r10)     // Catch:{ NameNotFoundException -> 0x0842, RuntimeException -> 0x0838 }
            goto L_0x0842
        L_0x0838:
            r2 = move-exception
            java.lang.Throwable r1 = r2.getCause()     // Catch:{ all -> 0x1246 }
            boolean r1 = r1 instanceof android.os.DeadObjectException     // Catch:{ all -> 0x1246 }
            if (r1 != 0) goto L_0x0842
            throw r2     // Catch:{ all -> 0x1246 }
        L_0x0842:
            if (r7 == 0) goto L_0x085a
            android.content.pm.ApplicationInfo r11 = r7.applicationInfo     // Catch:{ all -> 0x1246 }
            android.content.pm.ApplicationInfo r1 = r8.A00     // Catch:{ all -> 0x1246 }
            int r2 = r1.uid     // Catch:{ all -> 0x1246 }
            int r1 = r11.uid     // Catch:{ all -> 0x1246 }
            if (r2 == r1) goto L_0x0857
            android.content.pm.PackageManager r8 = r8.A01     // Catch:{ all -> 0x1246 }
            int r2 = r8.checkSignatures(r2, r1)     // Catch:{ all -> 0x1246 }
            r1 = 0
            if (r2 != 0) goto L_0x0858
        L_0x0857:
            r1 = 1
        L_0x0858:
            if (r1 != 0) goto L_0x085b
        L_0x085a:
            r7 = 0
        L_0x085b:
            if (r7 == 0) goto L_0x0864
            java.lang.String r2 = r7.versionName     // Catch:{ all -> 0x1246 }
            int r11 = r7.versionCode     // Catch:{ all -> 0x1246 }
            long r7 = r7.lastUpdateTime     // Catch:{ all -> 0x1246 }
            goto L_0x0870
        L_0x0864:
            java.lang.String r2 = "AppStateLoggerCore"
            java.lang.String r1 = "Could not find package info"
            p000X.AnonymousClass0DB.A0E(r2, r1)     // Catch:{ all -> 0x1246 }
            java.lang.String r2 = "UNKNOWN"
            r7 = 0
            r11 = -1
        L_0x0870:
            if (r9 == 0) goto L_0x0873
            goto L_0x0876
        L_0x0873:
            java.lang.String r23 = ""
            goto L_0x087e
        L_0x0876:
            java.lang.String r23 = r9.getInstallerPackageName(r13)     // Catch:{ all -> 0x1246 }
            if (r23 != 0) goto L_0x087e
            java.lang.String r23 = ""
        L_0x087e:
            X.09Q r19 = new X.09Q     // Catch:{ all -> 0x1246 }
            r1 = r18
            java.lang.String r33 = r1.toString()     // Catch:{ all -> 0x1246 }
            r1 = r19
            r31 = r6
            r21 = r2
            r22 = r11
            r26 = r7
            r28 = r5
            r29 = r15
            r30 = r12
            r34 = r4
            r36 = r3
            r19.<init>(r20, r21, r22, r23, r24, r26, r28, r29, r30, r31, r32, r33, r34, r35, r36)     // Catch:{ all -> 0x1246 }
            int r3 = r5.A04(r6)     // Catch:{ all -> 0x1246 }
            r2 = 4
            if (r3 == r2) goto L_0x08a7
            r2 = 7
            if (r3 != r2) goto L_0x08ac
        L_0x08a7:
            X.03i r2 = r1.A09     // Catch:{ all -> 0x1246 }
            r2.start()     // Catch:{ all -> 0x1246 }
        L_0x08ac:
            X.03X r2 = new X.03X     // Catch:{ all -> 0x1246 }
            r2.<init>(r1)     // Catch:{ all -> 0x1246 }
            r6.registerActivityLifecycleCallbacks(r2)     // Catch:{ all -> 0x1246 }
            X.09P r2 = p000X.AnonymousClass09P.A00     // Catch:{ all -> 0x1246 }
            if (r2 != 0) goto L_0x08cf
            X.09P r3 = new X.09P     // Catch:{ all -> 0x1246 }
            r3.<init>()     // Catch:{ all -> 0x1246 }
            p000X.AnonymousClass09P.A00 = r3     // Catch:{ all -> 0x1246 }
            r2 = 100
            p000X.AnonymousClass0Bi.A03(r3, r2)     // Catch:{ all -> 0x1246 }
            java.lang.Object r2 = p000X.AnonymousClass09Q.A0X     // Catch:{ all -> 0x1246 }
            monitor-enter(r2)     // Catch:{ all -> 0x1246 }
            p000X.AnonymousClass09Q.A0W = r19     // Catch:{ all -> 0x08cb }
            monitor-exit(r2)     // Catch:{ all -> 0x08cb }
            goto L_0x08eb
        L_0x08cb:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x08cb }
            goto L_0x11eb
        L_0x08cf:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x1246 }
            java.lang.String r0 = "AppStateLoggerExceptionHandler can only be initialized once"
            r1.<init>(r0)     // Catch:{ all -> 0x1246 }
            throw r1     // Catch:{ all -> 0x1246 }
        L_0x08d7:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x08df }
            java.lang.String r0 = "An application has already been registered with AppStateLogger"
            r1.<init>(r0)     // Catch:{ all -> 0x08df }
            throw r1     // Catch:{ all -> 0x08df }
        L_0x08df:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x08df }
            goto L_0x11eb
        L_0x08e3:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch:{ all -> 0x1246 }
            java.lang.String r0 = "Must provide a valid context"
            r1.<init>(r0)     // Catch:{ all -> 0x1246 }
            throw r1     // Catch:{ all -> 0x1246 }
        L_0x08eb:
            X.0eA r18 = new X.0eA     // Catch:{ all -> 0x1246 }
            r18.<init>()     // Catch:{ all -> 0x1246 }
            android.app.Application r2 = r0.A00     // Catch:{ all -> 0x1246 }
            java.lang.String r1 = r0.A03     // Catch:{ all -> 0x1246 }
            X.0Hl r34 = new X.0Hl     // Catch:{ all -> 0x1246 }
            X.0L7 r36 = p000X.AnonymousClass0L7.ANR_CONFIG     // Catch:{ all -> 0x1246 }
            java.lang.String r35 = "is_detector_enabled"
            r34.<init>(r35, r36, r37, r38, r39)     // Catch:{ all -> 0x1246 }
            boolean r3 = p000X.C05630Li.A03(r34)     // Catch:{ all -> 0x1246 }
            X.0Hl r4 = new X.0Hl     // Catch:{ all -> 0x1246 }
            X.0L7 r6 = p000X.AnonymousClass0L7.EXTRA_NATIVE_DEBUGGING_INFO     // Catch:{ all -> 0x1246 }
            r8 = 0
            r9 = 0
            r5 = r16
            r7 = r17
            r4.<init>(r5, r6, r7, r8, r9)     // Catch:{ all -> 0x1246 }
            p000X.C05630Li.A03(r4)     // Catch:{ all -> 0x1246 }
            X.0Hl r38 = new X.0Hl     // Catch:{ all -> 0x1246 }
            X.0L7 r40 = p000X.AnonymousClass0L7.ERROR_REPORTING_LSLR_DATAFILE     // Catch:{ all -> 0x1246 }
            java.lang.String r39 = "is_disabled"
            r42 = 0
            r43 = 0
            r38.<init>(r39, r40, r41, r42, r43)     // Catch:{ all -> 0x1246 }
            boolean r5 = p000X.C05630Li.A03(r38)     // Catch:{ all -> 0x1246 }
            X.02l r4 = new X.02l     // Catch:{ all -> 0x1246 }
            r4.<init>(r2, r1, r3, r5)     // Catch:{ all -> 0x1246 }
            X.0Dw r3 = p000X.AnonymousClass01Q.A00     // Catch:{ all -> 0x1246 }
            X.0CU r1 = p000X.C021000z.A03     // Catch:{ all -> 0x1246 }
            if (r1 != 0) goto L_0x0e55
            p000X.C021000z.A03 = r4     // Catch:{ all -> 0x1246 }
            android.content.Context r4 = r4.A00     // Catch:{ all -> 0x1246 }
            p000X.AnonymousClass0CY.A00()     // Catch:{ all -> 0x1246 }
            java.lang.String r13 = "report_host.txt"
            java.io.File r2 = r4.getFileStreamPath(r13)     // Catch:{ SecurityException -> 0x096d }
            boolean r1 = r2.exists()     // Catch:{ SecurityException -> 0x096d }
            if (r1 == 0) goto L_0x0975
            boolean r1 = r2.canRead()     // Catch:{ SecurityException -> 0x096d }
            if (r1 == 0) goto L_0x0965
            boolean r1 = r2.canWrite()     // Catch:{ SecurityException -> 0x096d }
            if (r1 == 0) goto L_0x0965
            long r7 = r2.length()     // Catch:{ SecurityException -> 0x096d }
            r5 = 0
            int r1 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r1 != 0) goto L_0x0975
            boolean r1 = r4.deleteFile(r13)     // Catch:{ SecurityException -> 0x096d }
            if (r1 != 0) goto L_0x0975
            java.lang.String r2 = "ACRA"
            java.lang.String r1 = "could not delete empty host file"
            p000X.AnonymousClass0DB.A0D(r2, r1)     // Catch:{ SecurityException -> 0x096d }
            goto L_0x0975
        L_0x0965:
            java.lang.String r2 = "ACRA"
            java.lang.String r1 = "cannot read or write host file"
            p000X.AnonymousClass0DB.A0D(r2, r1)     // Catch:{ SecurityException -> 0x096d }
            goto L_0x0975
        L_0x096d:
            r5 = move-exception
            java.lang.String r2 = "ACRA"
            java.lang.String r1 = "could not delete empty host file: "
            p000X.AnonymousClass0DB.A0M(r2, r5, r1)     // Catch:{ all -> 0x1246 }
        L_0x0975:
            X.0CU r5 = p000X.C021000z.A03     // Catch:{ all -> 0x1246 }
            boolean r1 = r3.A0N     // Catch:{ all -> 0x1246 }
            if (r1 != 0) goto L_0x0e1e
            android.content.Context r1 = r5.A00     // Catch:{ all -> 0x1246 }
            r3.A0B = r1     // Catch:{ all -> 0x1246 }
            android.content.Context r1 = r3.A0B     // Catch:{ all -> 0x1246 }
            if (r1 == 0) goto L_0x0e16
            java.io.File r2 = new java.io.File     // Catch:{ all -> 0x1246 }
            android.content.Context r1 = r3.A0B     // Catch:{ all -> 0x1246 }
            android.content.pm.ApplicationInfo r1 = r1.getApplicationInfo()     // Catch:{ all -> 0x1246 }
            java.lang.String r1 = r1.sourceDir     // Catch:{ all -> 0x1246 }
            r2.<init>(r1)     // Catch:{ all -> 0x1246 }
            long r1 = r2.lastModified()     // Catch:{ all -> 0x1246 }
            r3.A09 = r1     // Catch:{ all -> 0x1246 }
            long r1 = r3.A09     // Catch:{ all -> 0x1246 }
            r7 = 0
            int r6 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r6 != 0) goto L_0x09a5
            java.lang.String r2 = "ACRA"
            java.lang.String r1 = "could not retrieve APK mod time"
            p000X.AnonymousClass0DB.A0E(r2, r1)     // Catch:{ all -> 0x1246 }
        L_0x09a5:
            r3.A0F = r5     // Catch:{ all -> 0x1246 }
            java.lang.Thread$UncaughtExceptionHandler r1 = r5.A02     // Catch:{ all -> 0x1246 }
            r3.A0L = r1     // Catch:{ all -> 0x1246 }
            android.content.Context r2 = r3.A0B     // Catch:{ all -> 0x1246 }
            java.lang.String r11 = "acra_criticaldata_store"
            android.content.SharedPreferences r2 = r2.getSharedPreferences(r11, r10)     // Catch:{ all -> 0x1246 }
            java.lang.String r1 = "USER_ID"
            java.lang.String r6 = ""
            java.lang.String r7 = r2.getString(r1, r6)     // Catch:{ all -> 0x1246 }
            android.content.Context r2 = r3.A0B     // Catch:{ all -> 0x1246 }
            android.content.SharedPreferences r2 = r2.getSharedPreferences(r11, r10)     // Catch:{ all -> 0x1246 }
            java.lang.String r1 = "CLIENT_USER_ID"
            java.lang.String r5 = r2.getString(r1, r6)     // Catch:{ all -> 0x1246 }
            android.content.Context r2 = r3.A0B     // Catch:{ all -> 0x1246 }
            android.content.SharedPreferences r2 = r2.getSharedPreferences(r11, r10)     // Catch:{ all -> 0x1246 }
            java.lang.String r1 = "DEVICE_ID"
            java.lang.String r1 = r2.getString(r1, r6)     // Catch:{ all -> 0x1246 }
            int r2 = r7.length()     // Catch:{ all -> 0x1246 }
            if (r2 <= 0) goto L_0x09db
            r3.A0K = r7     // Catch:{ all -> 0x1246 }
        L_0x09db:
            int r2 = r5.length()     // Catch:{ all -> 0x1246 }
            if (r2 <= 0) goto L_0x09e3
            r3.A0J = r5     // Catch:{ all -> 0x1246 }
        L_0x09e3:
            int r2 = r1.length()     // Catch:{ all -> 0x1246 }
            if (r2 <= 0) goto L_0x09ee
            java.lang.String r2 = "marauder_device_id"
            p000X.C04410Dw.A0G(r2, r1)     // Catch:{ all -> 0x1246 }
        L_0x09ee:
            android.content.Context r9 = r3.A0B     // Catch:{ all -> 0x1246 }
            java.util.HashMap r8 = new java.util.HashMap     // Catch:{ all -> 0x1246 }
            r8.<init>()     // Catch:{ all -> 0x1246 }
            r7 = 0
            android.content.SharedPreferences r2 = r9.getSharedPreferences(r11, r10)     // Catch:{ all -> 0x1246 }
            java.lang.String r1 = "ADDITIONAL_PARAMS"
            java.util.Set r2 = r2.getStringSet(r1, r7)     // Catch:{ all -> 0x1246 }
            if (r2 == 0) goto L_0x0a2a
            boolean r1 = r2.isEmpty()     // Catch:{ all -> 0x1246 }
            if (r1 != 0) goto L_0x0a2a
            android.content.SharedPreferences r5 = r9.getSharedPreferences(r11, r10)     // Catch:{ all -> 0x1246 }
            java.util.Iterator r9 = r2.iterator()     // Catch:{ all -> 0x1246 }
        L_0x0a10:
            boolean r1 = r9.hasNext()     // Catch:{ all -> 0x1246 }
            if (r1 == 0) goto L_0x0a2a
            java.lang.Object r2 = r9.next()     // Catch:{ all -> 0x1246 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x1246 }
            java.lang.String r1 = r5.getString(r2, r6)     // Catch:{ all -> 0x1246 }
            boolean r7 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x1246 }
            if (r7 != 0) goto L_0x0a10
            r8.put(r2, r1)     // Catch:{ all -> 0x1246 }
            goto L_0x0a10
        L_0x0a2a:
            java.util.Set r1 = r8.entrySet()     // Catch:{ all -> 0x1246 }
            java.util.Iterator r7 = r1.iterator()     // Catch:{ all -> 0x1246 }
        L_0x0a32:
            boolean r1 = r7.hasNext()     // Catch:{ all -> 0x1246 }
            if (r1 == 0) goto L_0x0a54
            java.lang.Object r5 = r7.next()     // Catch:{ all -> 0x1246 }
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5     // Catch:{ all -> 0x1246 }
            java.lang.Object r2 = r5.getValue()     // Catch:{ all -> 0x1246 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x1246 }
            boolean r1 = android.text.TextUtils.isEmpty(r2)     // Catch:{ all -> 0x1246 }
            if (r1 != 0) goto L_0x0a32
            java.lang.Object r1 = r5.getKey()     // Catch:{ all -> 0x1246 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x1246 }
            p000X.C04410Dw.A0G(r1, r2)     // Catch:{ all -> 0x1246 }
            goto L_0x0a32
        L_0x0a54:
            r1 = 1
            r3.A0N = r1     // Catch:{ all -> 0x1246 }
            r5 = 0
            r1 = 65536(0x10000, float:9.18355E-41)
            byte[] r1 = new byte[r1]     // Catch:{ all -> 0x0d15 }
            r3.A0O = r1     // Catch:{ all -> 0x0d15 }
            android.text.format.Time r2 = r3.A01     // Catch:{ all -> 0x0d15 }
            monitor-enter(r2)     // Catch:{ all -> 0x0d15 }
            android.text.format.Time r1 = r3.A01     // Catch:{ all -> 0x0d12 }
            r1.setToNow()     // Catch:{ all -> 0x0d12 }
            byte[] r1 = r3.A0O     // Catch:{ all -> 0x0d12 }
            r7 = 1
            r1[r10] = r7     // Catch:{ all -> 0x0d12 }
            monitor-exit(r2)     // Catch:{ all -> 0x0d12 }
            r9 = 227299068(0xd8c4efc, float:8.647181E-31)
            java.lang.String r1 = java.lang.Integer.toString(r9)     // Catch:{ all -> 0x0d15 }
            r3.A0H = r1     // Catch:{ all -> 0x0d15 }
            X.02y r12 = new X.02y     // Catch:{ all -> 0x0d15 }
            android.content.Context r1 = r3.A0B     // Catch:{ all -> 0x0d15 }
            r12.<init>(r1)     // Catch:{ all -> 0x0d15 }
            android.content.Context r1 = r12.A00     // Catch:{ all -> 0x0d15 }
            java.lang.String r7 = r1.getPackageName()     // Catch:{ all -> 0x0d15 }
            android.content.Context r1 = r12.A00     // Catch:{ all -> 0x0d15 }
            android.content.pm.PackageManager r1 = r1.getPackageManager()     // Catch:{ all -> 0x0d15 }
            r8 = 0
            if (r1 == 0) goto L_0x0a95
            android.content.pm.PackageInfo r8 = r1.getPackageInfo(r7, r10)     // Catch:{ NameNotFoundException -> 0x0a90, RuntimeException -> 0x0a95 }
            goto L_0x0a95
        L_0x0a90:
            android.content.Context r1 = r12.A00     // Catch:{ all -> 0x0d15 }
            r1.getPackageName()     // Catch:{ all -> 0x0d15 }
        L_0x0a95:
            if (r8 == 0) goto L_0x0aa2
            int r1 = r8.versionCode     // Catch:{ all -> 0x0d15 }
            if (r1 != r9) goto L_0x0aa2
            java.lang.String r1 = r8.versionName     // Catch:{ all -> 0x0d15 }
            if (r1 == 0) goto L_0x0aa2
            r3.A0I = r1     // Catch:{ all -> 0x0d15 }
            goto L_0x0aa6
        L_0x0aa2:
            java.lang.String r1 = "not set"
            r3.A0I = r1     // Catch:{ all -> 0x0d15 }
        L_0x0aa6:
            java.util.TreeMap r7 = new java.util.TreeMap     // Catch:{ all -> 0x0d15 }
            r7.<init>()     // Catch:{ all -> 0x0d15 }
            X.0CU r1 = r3.A0F     // Catch:{ all -> 0x0d15 }
            java.lang.String r11 = "ANDROID_ID"
            boolean r1 = r1.A03(r11)     // Catch:{ all -> 0x0d15 }
            if (r1 == 0) goto L_0x0ad0
            android.content.Context r1 = r3.A0B     // Catch:{ Exception -> 0x0ac2 }
            android.content.ContentResolver r2 = r1.getContentResolver()     // Catch:{ Exception -> 0x0ac2 }
            java.lang.String r1 = "android_id"
            java.lang.String r1 = android.provider.Settings.Secure.getString(r2, r1)     // Catch:{ Exception -> 0x0ac2 }
            goto L_0x0acd
        L_0x0ac2:
            r9 = move-exception
            java.lang.String r2 = "ErrorReporter"
            java.lang.String r1 = "Failed to fetch the constant field ANDROID_ID"
            p000X.AnonymousClass0DB.A0G(r2, r1, r9)     // Catch:{ all -> 0x0d15 }
            java.lang.String r1 = "unknown"
        L_0x0acd:
            r7.put(r11, r1)     // Catch:{ all -> 0x0d15 }
        L_0x0ad0:
            X.0CU r1 = r3.A0F     // Catch:{ all -> 0x0d15 }
            java.lang.String r2 = "APP_VERSION_CODE"
            boolean r1 = r1.A03(r2)     // Catch:{ all -> 0x0d15 }
            if (r1 == 0) goto L_0x0adf
            java.lang.String r1 = r3.A0H     // Catch:{ all -> 0x0d15 }
            r7.put(r2, r1)     // Catch:{ all -> 0x0d15 }
        L_0x0adf:
            X.0CU r1 = r3.A0F     // Catch:{ all -> 0x0d15 }
            java.lang.String r2 = "APP_VERSION_NAME"
            boolean r1 = r1.A03(r2)     // Catch:{ all -> 0x0d15 }
            if (r1 == 0) goto L_0x0aee
            java.lang.String r1 = r3.A0I     // Catch:{ all -> 0x0d15 }
            r7.put(r2, r1)     // Catch:{ all -> 0x0d15 }
        L_0x0aee:
            X.0CU r1 = r3.A0F     // Catch:{ all -> 0x0d15 }
            java.lang.String r2 = "PACKAGE_NAME"
            boolean r1 = r1.A03(r2)     // Catch:{ all -> 0x0d15 }
            if (r1 == 0) goto L_0x0b01
            android.content.Context r1 = r3.A0B     // Catch:{ all -> 0x0d15 }
            java.lang.String r1 = r1.getPackageName()     // Catch:{ all -> 0x0d15 }
            r7.put(r2, r1)     // Catch:{ all -> 0x0d15 }
        L_0x0b01:
            X.0CU r1 = r3.A0F     // Catch:{ all -> 0x0d15 }
            java.lang.String r2 = "INSTALLER_NAME"
            boolean r1 = r1.A03(r2)     // Catch:{ all -> 0x0d15 }
            if (r1 == 0) goto L_0x0b22
            android.content.Context r1 = r12.A00     // Catch:{ all -> 0x0d15 }
            android.content.pm.PackageManager r1 = r1.getPackageManager()     // Catch:{ all -> 0x0d15 }
            if (r1 != 0) goto L_0x0b15
            r1 = 0
            goto L_0x0b1f
        L_0x0b15:
            android.content.Context r9 = r12.A00     // Catch:{ all -> 0x0d15 }
            java.lang.String r9 = r9.getPackageName()     // Catch:{ all -> 0x0d15 }
            java.lang.String r1 = r1.getInstallerPackageName(r9)     // Catch:{ all -> 0x0d15 }
        L_0x0b1f:
            r7.put(r2, r1)     // Catch:{ all -> 0x0d15 }
        L_0x0b22:
            X.0CU r1 = r3.A0F     // Catch:{ all -> 0x0d15 }
            java.lang.String r2 = "PHONE_MODEL"
            boolean r1 = r1.A03(r2)     // Catch:{ all -> 0x0d15 }
            if (r1 == 0) goto L_0x0b31
            java.lang.String r1 = android.os.Build.MODEL     // Catch:{ all -> 0x0d15 }
            r7.put(r2, r1)     // Catch:{ all -> 0x0d15 }
        L_0x0b31:
            X.0CU r1 = r3.A0F     // Catch:{ all -> 0x0d15 }
            java.lang.String r2 = "DEVICE"
            boolean r1 = r1.A03(r2)     // Catch:{ all -> 0x0d15 }
            if (r1 == 0) goto L_0x0b40
            java.lang.String r1 = android.os.Build.DEVICE     // Catch:{ all -> 0x0d15 }
            r7.put(r2, r1)     // Catch:{ all -> 0x0d15 }
        L_0x0b40:
            X.0CU r1 = r3.A0F     // Catch:{ all -> 0x0d15 }
            java.lang.String r2 = "ANDROID_VERSION"
            boolean r1 = r1.A03(r2)     // Catch:{ all -> 0x0d15 }
            if (r1 == 0) goto L_0x0b4f
            java.lang.String r1 = android.os.Build.VERSION.RELEASE     // Catch:{ all -> 0x0d15 }
            r7.put(r2, r1)     // Catch:{ all -> 0x0d15 }
        L_0x0b4f:
            X.0CU r1 = r3.A0F     // Catch:{ all -> 0x0d15 }
            java.lang.String r2 = "OS_VERSION"
            boolean r1 = r1.A03(r2)     // Catch:{ all -> 0x0d15 }
            if (r1 == 0) goto L_0x0b62
            java.lang.String r1 = "os.version"
            java.lang.String r1 = java.lang.System.getProperty(r1)     // Catch:{ all -> 0x0d15 }
            r7.put(r2, r1)     // Catch:{ all -> 0x0d15 }
        L_0x0b62:
            X.0CU r1 = r3.A0F     // Catch:{ all -> 0x0d15 }
            java.lang.String r2 = "BUILD_HOST"
            boolean r1 = r1.A03(r2)     // Catch:{ all -> 0x0d15 }
            if (r1 == 0) goto L_0x0b71
            java.lang.String r1 = android.os.Build.HOST     // Catch:{ all -> 0x0d15 }
            r7.put(r2, r1)     // Catch:{ all -> 0x0d15 }
        L_0x0b71:
            X.0CU r1 = r3.A0F     // Catch:{ all -> 0x0d15 }
            java.lang.String r2 = "BRAND"
            boolean r1 = r1.A03(r2)     // Catch:{ all -> 0x0d15 }
            if (r1 == 0) goto L_0x0b80
            java.lang.String r1 = android.os.Build.BRAND     // Catch:{ all -> 0x0d15 }
            r7.put(r2, r1)     // Catch:{ all -> 0x0d15 }
        L_0x0b80:
            X.0CU r1 = r3.A0F     // Catch:{ all -> 0x0d15 }
            java.lang.String r2 = "PRODUCT"
            boolean r1 = r1.A03(r2)     // Catch:{ all -> 0x0d15 }
            if (r1 == 0) goto L_0x0b8f
            java.lang.String r1 = android.os.Build.PRODUCT     // Catch:{ all -> 0x0d15 }
            r7.put(r2, r1)     // Catch:{ all -> 0x0d15 }
        L_0x0b8f:
            X.0CU r1 = r3.A0F     // Catch:{ all -> 0x0d15 }
            java.lang.String r2 = "FILE_PATH"
            boolean r1 = r1.A03(r2)     // Catch:{ all -> 0x0d15 }
            if (r1 == 0) goto L_0x0ba8
            android.content.Context r1 = r3.A0B     // Catch:{ all -> 0x0d15 }
            java.io.File r1 = r1.getFilesDir()     // Catch:{ all -> 0x0d15 }
            if (r1 == 0) goto L_0x0bb3
            java.lang.String r1 = r1.getAbsolutePath()     // Catch:{ all -> 0x0d15 }
        L_0x0ba5:
            r7.put(r2, r1)     // Catch:{ all -> 0x0d15 }
        L_0x0ba8:
            X.0CU r1 = r3.A0F     // Catch:{ all -> 0x0d15 }
            java.lang.String r11 = "APP_INSTALL_TIME"
            boolean r1 = r1.A03(r11)     // Catch:{ all -> 0x0d15 }
            if (r1 == 0) goto L_0x0bd0
            goto L_0x0bb6
        L_0x0bb3:
            java.lang.String r1 = "n/a"
            goto L_0x0ba5
        L_0x0bb6:
            if (r8 == 0) goto L_0x0bd0
            long r1 = r8.firstInstallTime     // Catch:{ all -> 0x0d15 }
            java.util.Date r9 = new java.util.Date     // Catch:{ all -> 0x0d15 }
            r9.<init>(r1)     // Catch:{ all -> 0x0d15 }
            java.text.SimpleDateFormat r12 = new java.text.SimpleDateFormat     // Catch:{ all -> 0x0d15 }
            java.util.Locale r2 = java.util.Locale.US     // Catch:{ all -> 0x0d15 }
            java.lang.String r1 = "yyyy-MM-dd'T'HH:mm:ss.000ZZZZZ"
            r12.<init>(r1, r2)     // Catch:{ all -> 0x0d15 }
            java.lang.String r1 = r12.format(r9)     // Catch:{ all -> 0x0d15 }
            r7.put(r11, r1)     // Catch:{ all -> 0x0d15 }
        L_0x0bd0:
            X.0CU r1 = r3.A0F     // Catch:{ all -> 0x0d15 }
            java.lang.String r9 = "APP_INSTALL_EPOCH_TIME"
            boolean r1 = r1.A03(r9)     // Catch:{ all -> 0x0d15 }
            if (r1 == 0) goto L_0x0be5
            if (r8 == 0) goto L_0x0be5
            long r1 = r8.firstInstallTime     // Catch:{ all -> 0x0d15 }
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x0d15 }
            r7.put(r9, r1)     // Catch:{ all -> 0x0d15 }
        L_0x0be5:
            X.0CU r1 = r3.A0F     // Catch:{ all -> 0x0d15 }
            java.lang.String r11 = "APP_UPGRADE_TIME"
            boolean r1 = r1.A03(r11)     // Catch:{ all -> 0x0d15 }
            if (r1 == 0) goto L_0x0c09
            if (r8 == 0) goto L_0x0c09
            long r1 = r8.lastUpdateTime     // Catch:{ all -> 0x0d15 }
            java.util.Date r9 = new java.util.Date     // Catch:{ all -> 0x0d15 }
            r9.<init>(r1)     // Catch:{ all -> 0x0d15 }
            java.text.SimpleDateFormat r12 = new java.text.SimpleDateFormat     // Catch:{ all -> 0x0d15 }
            java.util.Locale r2 = java.util.Locale.US     // Catch:{ all -> 0x0d15 }
            java.lang.String r1 = "yyyy-MM-dd'T'HH:mm:ss.000ZZZZZ"
            r12.<init>(r1, r2)     // Catch:{ all -> 0x0d15 }
            java.lang.String r1 = r12.format(r9)     // Catch:{ all -> 0x0d15 }
            r7.put(r11, r1)     // Catch:{ all -> 0x0d15 }
        L_0x0c09:
            X.0CU r1 = r3.A0F     // Catch:{ all -> 0x0d15 }
            java.lang.String r9 = "APP_UPGRADE_EPOCH_TIME"
            boolean r1 = r1.A03(r9)     // Catch:{ all -> 0x0d15 }
            if (r1 == 0) goto L_0x0c1e
            if (r8 == 0) goto L_0x0c1e
            long r1 = r8.lastUpdateTime     // Catch:{ all -> 0x0d15 }
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x0d15 }
            r7.put(r9, r1)     // Catch:{ all -> 0x0d15 }
        L_0x0c1e:
            X.0CU r1 = r3.A0F     // Catch:{ all -> 0x0d15 }
            java.lang.String r9 = "APP_SINCE_UPGRADE_TIME"
            boolean r1 = r1.A03(r9)     // Catch:{ all -> 0x0d15 }
            if (r1 == 0) goto L_0x0c38
            if (r8 == 0) goto L_0x0c38
            long r11 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0d15 }
            long r1 = r8.lastUpdateTime     // Catch:{ all -> 0x0d15 }
            long r11 = r11 - r1
            java.lang.String r1 = java.lang.Long.toString(r11)     // Catch:{ all -> 0x0d15 }
            r7.put(r9, r1)     // Catch:{ all -> 0x0d15 }
        L_0x0c38:
            X.0CU r1 = r3.A0F     // Catch:{ all -> 0x0d15 }
            java.lang.String r2 = "PUBLIC_SOURCE_DIR"
            boolean r1 = r1.A03(r2)     // Catch:{ all -> 0x0d15 }
            if (r1 == 0) goto L_0x0c55
            android.content.Context r1 = r3.A0B     // Catch:{ all -> 0x0d15 }
            android.content.pm.ApplicationInfo r1 = r1.getApplicationInfo()     // Catch:{ all -> 0x0d15 }
            if (r1 == 0) goto L_0x0c88
            android.content.Context r1 = r3.A0B     // Catch:{ all -> 0x0d15 }
            android.content.pm.ApplicationInfo r1 = r1.getApplicationInfo()     // Catch:{ all -> 0x0d15 }
            java.lang.String r1 = r1.publicSourceDir     // Catch:{ all -> 0x0d15 }
            r7.put(r2, r1)     // Catch:{ all -> 0x0d15 }
        L_0x0c55:
            X.0CU r1 = r3.A0F     // Catch:{ all -> 0x0d15 }
            java.lang.String r2 = "is_relabeled"
            boolean r1 = r1.A03(r2)     // Catch:{ all -> 0x0d15 }
            if (r1 == 0) goto L_0x0c66
            java.lang.String r1 = java.lang.String.valueOf(r10)     // Catch:{ all -> 0x0d15 }
            r7.put(r2, r1)     // Catch:{ all -> 0x0d15 }
        L_0x0c66:
            java.util.Map r1 = java.util.Collections.unmodifiableMap(r7)     // Catch:{ all -> 0x0d15 }
            r3.A0M = r1     // Catch:{ all -> 0x0d15 }
            android.content.Context r2 = r3.A0B     // Catch:{ all -> 0x0d15 }
            java.lang.String r1 = "acra-reports"
            java.io.File r2 = r2.getDir(r1, r10)     // Catch:{ all -> 0x0d15 }
            java.io.File r12 = new java.io.File     // Catch:{ all -> 0x0d15 }
            java.lang.String r1 = "reportfile.prealloc"
            r12.<init>(r2, r1)     // Catch:{ all -> 0x0d15 }
            r19 = 1572864(0x180000, double:7.77098E-318)
            long r7 = r12.length()     // Catch:{ all -> 0x0d15 }
            int r1 = (r7 > r19 ? 1 : (r7 == r19 ? 0 : -1))
            if (r1 >= 0) goto L_0x0d0f
            goto L_0x0c8e
        L_0x0c88:
            java.lang.String r1 = "null application info"
            r7.put(r2, r1)     // Catch:{ all -> 0x0d15 }
            goto L_0x0c55
        L_0x0c8e:
            r21 = 1572864(0x180000, double:7.77098E-318)
            java.lang.Class<X.0Dw> r2 = p000X.C04410Dw.class
            java.util.UUID r1 = java.util.UUID.randomUUID()     // Catch:{ all -> 0x0d0a }
            java.lang.String r7 = p000X.C04410Dw.A04(r3, r2, r1)     // Catch:{ all -> 0x0d0a }
            X.01N r2 = p000X.AnonymousClass01N.ACRA_CRASH_REPORT     // Catch:{ all -> 0x0d0a }
            android.content.Context r1 = r3.A0B     // Catch:{ all -> 0x0d0a }
            X.01h r2 = r2.A01(r1)     // Catch:{ all -> 0x0d0a }
            X.01f r11 = r2.A01(r7, r5)     // Catch:{ all -> 0x0d0a }
            java.io.FileOutputStream r9 = new java.io.FileOutputStream     // Catch:{ all -> 0x0cfa }
            java.io.File r1 = r11.A00     // Catch:{ all -> 0x0cfa }
            r9.<init>(r1)     // Catch:{ all -> 0x0cfa }
            r1 = 32768(0x8000, float:4.5918E-41)
            r8 = 32768(0x8000, float:4.5918E-41)
            byte[] r7 = new byte[r1]     // Catch:{ all -> 0x0cf3 }
            r19 = 0
        L_0x0cb8:
            int r1 = (r19 > r21 ? 1 : (r19 == r21 ? 0 : -1))
            if (r1 >= 0) goto L_0x0cc3
            r9.write(r7)     // Catch:{ all -> 0x0cf3 }
            long r1 = (long) r8     // Catch:{ all -> 0x0cf3 }
            long r19 = r19 + r1
            goto L_0x0cb8
        L_0x0cc3:
            java.io.FileDescriptor r1 = r9.getFD()     // Catch:{ all -> 0x0cf3 }
            r1.sync()     // Catch:{ all -> 0x0cf3 }
            r9.close()     // Catch:{ all -> 0x0cfa }
            java.io.File r7 = r11.A00     // Catch:{ all -> 0x0cfa }
            boolean r1 = r7.renameTo(r12)     // Catch:{ all -> 0x0cfa }
            if (r1 == 0) goto L_0x0cde
            java.io.File r1 = r11.A00     // Catch:{ all -> 0x0d01 }
            r1.delete()     // Catch:{ all -> 0x0d01 }
            r11.close()     // Catch:{ all -> 0x0d0a }
            goto L_0x0d0f
        L_0x0cde:
            java.io.IOException r2 = new java.io.IOException     // Catch:{ all -> 0x0cfa }
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ all -> 0x0cfa }
            r1[r10] = r7     // Catch:{ all -> 0x0cfa }
            r7 = 1
            r1[r7] = r12     // Catch:{ all -> 0x0cfa }
            java.lang.String r7 = "rename of %s to %s failed"
            java.lang.String r1 = java.lang.String.format(r7, r1)     // Catch:{ all -> 0x0cfa }
            r2.<init>(r1)     // Catch:{ all -> 0x0cfa }
            throw r2     // Catch:{ all -> 0x0cfa }
        L_0x0cf3:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0cf5 }
        L_0x0cf5:
            r1 = move-exception
            r9.close()     // Catch:{ all -> 0x0cf9 }
        L_0x0cf9:
            throw r1     // Catch:{ all -> 0x0cfa }
        L_0x0cfa:
            r2 = move-exception
            java.io.File r1 = r11.A00     // Catch:{ all -> 0x0d01 }
            r1.delete()     // Catch:{ all -> 0x0d01 }
            throw r2     // Catch:{ all -> 0x0d01 }
        L_0x0d01:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0d03 }
        L_0x0d03:
            r1 = move-exception
            if (r11 == 0) goto L_0x0d09
            r11.close()     // Catch:{ all -> 0x0d09 }
        L_0x0d09:
            throw r1     // Catch:{ all -> 0x0d0a }
        L_0x0d0a:
            r2 = move-exception
            p000X.C04410Dw.A0J(r5, r2)     // Catch:{ all -> 0x0d15 }
            r12 = 0
        L_0x0d0f:
            r3.A0G = r12     // Catch:{ all -> 0x0d15 }
            goto L_0x0d16
        L_0x0d12:
            r1 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0d12 }
            throw r1     // Catch:{ all -> 0x0d15 }
        L_0x0d15:
            r5 = move-exception
        L_0x0d16:
            X.0CU r1 = p000X.C021000z.A03     // Catch:{ all -> 0x1246 }
            X.08S r8 = r1.A01()     // Catch:{ all -> 0x1246 }
            p000X.C021000z.A04 = r8     // Catch:{ all -> 0x1246 }
            java.util.ArrayList r1 = r3.A03     // Catch:{ all -> 0x1246 }
            monitor-enter(r1)     // Catch:{ all -> 0x1246 }
            java.util.ArrayList r2 = r3.A03     // Catch:{ all -> 0x0e12 }
            monitor-enter(r2)     // Catch:{ all -> 0x0e12 }
            java.util.ArrayList r7 = r3.A03     // Catch:{ all -> 0x0e0f }
            r7.clear()     // Catch:{ all -> 0x0e0f }
            monitor-exit(r2)     // Catch:{ all -> 0x0e0f }
            java.util.ArrayList r7 = r3.A03     // Catch:{ all -> 0x0e12 }
            monitor-enter(r7)     // Catch:{ all -> 0x0e12 }
            java.util.ArrayList r2 = r3.A03     // Catch:{ all -> 0x0e0c }
            r2.add(r8)     // Catch:{ all -> 0x0e0c }
            monitor-exit(r7)     // Catch:{ all -> 0x0e0c }
            monitor-exit(r1)     // Catch:{ all -> 0x0e12 }
            r1 = 0
            java.io.File r8 = r4.getFileStreamPath(r13)     // Catch:{ IOException -> 0x0d88, all -> 0x0e08 }
            boolean r2 = r8.canRead()     // Catch:{ IOException -> 0x0d88, all -> 0x0e08 }
            if (r2 != 0) goto L_0x0d43
            p000X.C021000z.A02(r1)     // Catch:{ all -> 0x1246 }
            goto L_0x0d8f
        L_0x0d43:
            java.io.BufferedReader r7 = new java.io.BufferedReader     // Catch:{ IOException -> 0x0d88, all -> 0x0e08 }
            java.io.FileReader r2 = new java.io.FileReader     // Catch:{ IOException -> 0x0d88, all -> 0x0e08 }
            r2.<init>(r8)     // Catch:{ IOException -> 0x0d88, all -> 0x0e08 }
            r7.<init>(r2)     // Catch:{ IOException -> 0x0d88, all -> 0x0e08 }
            java.lang.String r2 = r7.readLine()     // Catch:{ IOException -> 0x0d87, all -> 0x0d84 }
            if (r2 == 0) goto L_0x0d57
            java.lang.String r1 = r2.trim()     // Catch:{ IOException -> 0x0d87, all -> 0x0d84 }
        L_0x0d57:
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch:{ IOException -> 0x0d87, all -> 0x0d84 }
            if (r2 != 0) goto L_0x0d8c
            X.08S r2 = p000X.C021000z.A04     // Catch:{ IOException -> 0x0d87, all -> 0x0d84 }
            if (r1 == 0) goto L_0x0d8c
            boolean r6 = r1.equals(r6)     // Catch:{ IOException -> 0x0d87, all -> 0x0d84 }
            if (r6 != 0) goto L_0x0d8c
            android.net.Uri r6 = r2.A00     // Catch:{ IOException -> 0x0d87, all -> 0x0d84 }
            java.lang.String r6 = r6.getHost()     // Catch:{ IOException -> 0x0d87, all -> 0x0d84 }
            boolean r6 = r1.equals(r6)     // Catch:{ IOException -> 0x0d87, all -> 0x0d84 }
            if (r6 != 0) goto L_0x0d8c
            android.net.Uri r6 = r2.A00     // Catch:{ IOException -> 0x0d87, all -> 0x0d84 }
            android.net.Uri$Builder r6 = r6.buildUpon()     // Catch:{ IOException -> 0x0d87, all -> 0x0d84 }
            android.net.Uri$Builder r1 = r6.authority(r1)     // Catch:{ IOException -> 0x0d87, all -> 0x0d84 }
            android.net.Uri r1 = r1.build()     // Catch:{ IOException -> 0x0d87, all -> 0x0d84 }
            r2.A00 = r1     // Catch:{ IOException -> 0x0d87, all -> 0x0d84 }
            goto L_0x0d8c
        L_0x0d84:
            r0 = move-exception
            goto L_0x11e8
        L_0x0d87:
            r1 = r7
        L_0x0d88:
            p000X.C021000z.A02(r1)     // Catch:{ all -> 0x1246 }
            goto L_0x0d8f
        L_0x0d8c:
            p000X.C021000z.A02(r7)     // Catch:{ all -> 0x1246 }
        L_0x0d8f:
            java.lang.String r1 = "skip_cert_checks.txt"
            java.io.File r1 = r4.getFileStreamPath(r1)     // Catch:{ all -> 0x1246 }
            boolean r2 = r1.exists()     // Catch:{ all -> 0x1246 }
            X.08S r1 = p000X.C021000z.A04     // Catch:{ all -> 0x1246 }
            r1.A01 = r2     // Catch:{ all -> 0x1246 }
            r4 = 1
            X.01N[] r2 = new p000X.AnonymousClass01N[r4]     // Catch:{ all -> 0x1246 }
            X.01N r1 = p000X.AnonymousClass01N.NATIVE_CRASH_REPORT     // Catch:{ all -> 0x1246 }
            r2[r10] = r1     // Catch:{ all -> 0x1246 }
            int r2 = r3.A0P(r2)     // Catch:{ all -> 0x1246 }
            r1 = 5
            if (r2 <= r1) goto L_0x0de4
            X.01S r6 = new X.01S     // Catch:{ all -> 0x1246 }
            X.01N[] r2 = new p000X.AnonymousClass01N[r4]     // Catch:{ all -> 0x1246 }
            X.01N r1 = p000X.AnonymousClass01N.NATIVE_CRASH_REPORT     // Catch:{ all -> 0x1246 }
            r2[r10] = r1     // Catch:{ all -> 0x1246 }
            r6.<init>(r3, r2)     // Catch:{ all -> 0x1246 }
            android.os.StrictMode$ThreadPolicy r4 = android.os.StrictMode.getThreadPolicy()     // Catch:{ all -> 0x1246 }
            android.os.StrictMode$ThreadPolicy$Builder r1 = new android.os.StrictMode$ThreadPolicy$Builder     // Catch:{ all -> 0x1246 }
            r1.<init>()     // Catch:{ all -> 0x1246 }
            android.os.StrictMode$ThreadPolicy$Builder r1 = r1.permitAll()     // Catch:{ all -> 0x1246 }
            android.os.StrictMode$ThreadPolicy r1 = r1.build()     // Catch:{ all -> 0x1246 }
            android.os.StrictMode.setThreadPolicy(r1)     // Catch:{ all -> 0x1246 }
            r6.A00()     // Catch:{ all -> 0x0dcf }
            goto L_0x0dd6
        L_0x0dcf:
            r2 = move-exception
            java.lang.String r1 = "sending native reports on app launch"
            p000X.C04410Dw.A0J(r1, r2)     // Catch:{ all -> 0x0dd9 }
        L_0x0dd6:
            if (r4 == 0) goto L_0x0de4
            goto L_0x0de1
        L_0x0dd9:
            r0 = move-exception
            if (r4 == 0) goto L_0x11eb
            android.os.StrictMode.setThreadPolicy(r4)     // Catch:{ all -> 0x1246 }
            goto L_0x11eb
        L_0x0de1:
            android.os.StrictMode.setThreadPolicy(r4)     // Catch:{ all -> 0x1246 }
        L_0x0de4:
            X.01N[] r1 = p000X.C04410Dw.A0V     // Catch:{ all -> 0x1246 }
            int r1 = r3.A0P(r1)     // Catch:{ all -> 0x1246 }
            if (r1 <= 0) goto L_0x0df9
            X.01N[] r2 = p000X.C04410Dw.A0V     // Catch:{ all -> 0x1246 }
            X.01S r1 = new X.01S     // Catch:{ all -> 0x1246 }
            r1.<init>(r3, r2)     // Catch:{ all -> 0x1246 }
            r1.start()     // Catch:{ all -> 0x1246 }
            r3.A0P(r2)     // Catch:{ all -> 0x1246 }
        L_0x0df9:
            monitor-enter(r3)     // Catch:{ all -> 0x1246 }
            monitor-exit(r3)     // Catch:{ all -> 0x0e04 }
            r1 = r3
            monitor-enter(r1)     // Catch:{ all -> 0x1246 }
            monitor-exit(r1)     // Catch:{ all -> 0x1246 }
            p000X.AnonymousClass0Bi.A03(r3, r10)     // Catch:{ all -> 0x1246 }
            if (r5 == 0) goto L_0x0e2d
            goto L_0x0e26
        L_0x0e04:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0e04 }
            goto L_0x11eb
        L_0x0e08:
            r0 = move-exception
            r7 = r1
            goto L_0x11e8
        L_0x0e0c:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x0e0c }
            goto L_0x0e11
        L_0x0e0f:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0e0f }
        L_0x0e11:
            throw r0     // Catch:{ all -> 0x0e12 }
        L_0x0e12:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0e12 }
            goto L_0x11eb
        L_0x0e16:
            java.lang.AssertionError r1 = new java.lang.AssertionError     // Catch:{ all -> 0x1246 }
            java.lang.String r0 = "context must be non-null"
            r1.<init>(r0)     // Catch:{ all -> 0x1246 }
            throw r1     // Catch:{ all -> 0x1246 }
        L_0x0e1e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x1246 }
            java.lang.String r0 = "ErrorReporter already initialized"
            r1.<init>(r0)     // Catch:{ all -> 0x1246 }
            throw r1     // Catch:{ all -> 0x1246 }
        L_0x0e26:
            java.lang.Thread r1 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x1246 }
            p000X.AnonymousClass0Bi.A04(r1, r5)     // Catch:{ all -> 0x1246 }
        L_0x0e2d:
            X.0CU r2 = p000X.C021000z.A03     // Catch:{ all -> 0x1246 }
            boolean r1 = r2.A02()     // Catch:{ all -> 0x1246 }
            if (r1 == 0) goto L_0x0e55
            android.content.Context r4 = r2.A00     // Catch:{ all -> 0x1246 }
            java.lang.String r2 = "acraconfig_logcat_native_crash_periodic_interval_mins"
            int r2 = p000X.AnonymousClass0FU.A01(r4, r2, r10)     // Catch:{ all -> 0x1246 }
            if (r2 <= 0) goto L_0x0e55
            r1 = 1
            java.util.concurrent.ScheduledExecutorService r19 = java.util.concurrent.Executors.newScheduledThreadPool(r1)     // Catch:{ all -> 0x1246 }
            X.00y r4 = new X.00y     // Catch:{ all -> 0x1246 }
            r4.<init>(r3)     // Catch:{ all -> 0x1246 }
            long r1 = (long) r2     // Catch:{ all -> 0x1246 }
            java.util.concurrent.TimeUnit r25 = java.util.concurrent.TimeUnit.MINUTES     // Catch:{ all -> 0x1246 }
            r23 = r1
            r20 = r4
            r21 = r1
            r19.scheduleWithFixedDelay(r20, r21, r23, r25)     // Catch:{ all -> 0x1246 }
        L_0x0e55:
            p000X.C021000z.A00 = r18     // Catch:{ all -> 0x1246 }
            X.0CU r1 = p000X.C021000z.A03     // Catch:{ all -> 0x1246 }
            android.content.Context r7 = r1.A00     // Catch:{ all -> 0x1246 }
            X.0CY r1 = p000X.AnonymousClass0CY.A00()     // Catch:{ all -> 0x1246 }
            java.lang.String r6 = r1.A01     // Catch:{ all -> 0x1246 }
            if (r6 != 0) goto L_0x0e66
            java.lang.String r6 = "unknown"
        L_0x0e66:
            java.lang.String r1 = "record_signal_time"
            boolean r2 = p000X.C021000z.A05(r1)     // Catch:{ all -> 0x1246 }
            r4 = 1
            if (r2 == 0) goto L_0x0e72
            r4 = 1
            goto L_0x0e8e
        L_0x0e72:
            java.lang.String r2 = ":"
            boolean r2 = r6.contains(r2)     // Catch:{ all -> 0x1246 }
            r2 = r2 ^ r4
            if (r2 != 0) goto L_0x0e8e
            java.lang.String r2 = ":browser"
            boolean r2 = r6.contains(r2)     // Catch:{ all -> 0x1246 }
            if (r2 == 0) goto L_0x0e8d
            java.lang.String r2 = "run_anr_detector_on_browser_process"
            boolean r2 = p000X.C021000z.A05(r2)     // Catch:{ all -> 0x1246 }
            if (r2 == 0) goto L_0x0e8d
            goto L_0x0e8e
        L_0x0e8d:
            r4 = 0
        L_0x0e8e:
            r2 = 1
            if (r4 != 0) goto L_0x0e9d
            java.lang.String r5 = "ACRA"
            java.lang.Object[] r4 = new java.lang.Object[r2]     // Catch:{ all -> 0x1246 }
            r4[r10] = r6     // Catch:{ all -> 0x1246 }
            java.lang.String r2 = "Skipping ANR Detector for process: %s"
            p000X.AnonymousClass0DB.A0J(r5, r2, r4)     // Catch:{ all -> 0x1246 }
            goto L_0x0eb8
        L_0x0e9d:
            java.lang.String r5 = "ACRA"
            java.lang.Object[] r4 = new java.lang.Object[r2]     // Catch:{ all -> 0x1246 }
            r4[r10] = r6     // Catch:{ all -> 0x1246 }
            java.lang.String r2 = "Initializing ANR detector for process: %s"
            p000X.AnonymousClass0DB.A0J(r5, r2, r4)     // Catch:{ all -> 0x1246 }
            X.0CU r2 = p000X.C021000z.A03     // Catch:{ all -> 0x1246 }
            boolean r2 = r2.A03     // Catch:{ all -> 0x1246 }
            if (r2 == 0) goto L_0x0eb8
            p000X.C021000z.A01(r7, r3, r6)     // Catch:{ all -> 0x1246 }
            X.01p r2 = p000X.C021000z.A01     // Catch:{ all -> 0x1246 }
            if (r2 == 0) goto L_0x0eb8
            r2.start()     // Catch:{ all -> 0x1246 }
        L_0x0eb8:
            java.lang.String r5 = "fb.report_source"
            java.lang.String r4 = p000X.AnonymousClass070.A02(r5)     // Catch:{ all -> 0x1246 }
            if (r4 == 0) goto L_0x0ec8
            java.lang.String r2 = ""
            boolean r2 = r4.equals(r2)     // Catch:{ all -> 0x1246 }
            if (r2 == 0) goto L_0x0ecc
        L_0x0ec8:
            java.lang.String r4 = java.lang.System.getProperty(r5)     // Catch:{ all -> 0x1246 }
        L_0x0ecc:
            java.lang.String r11 = "report_source_ref"
            java.lang.String r9 = ""
            if (r4 == 0) goto L_0x0ee2
            boolean r2 = r4.equals(r9)     // Catch:{ all -> 0x1246 }
            if (r2 != 0) goto L_0x0ee2
            java.lang.String r2 = "report_source"
            p000X.C04410Dw.A0G(r2, r4)     // Catch:{ all -> 0x1246 }
            p000X.C04410Dw.A0G(r11, r9)     // Catch:{ all -> 0x1246 }
        L_0x0ee2:
            X.0CU r2 = p000X.C021000z.A03     // Catch:{ all -> 0x1246 }
            android.content.Context r5 = r2.A00     // Catch:{ all -> 0x1246 }
            java.lang.String r4 = "errorreporting"
            java.io.File r5 = r5.getDir(r4, r10)     // Catch:{ all -> 0x1246 }
            boolean r2 = r5.exists()     // Catch:{ all -> 0x1246 }
            r8 = 0
            if (r2 == 0) goto L_0x0f6a
            java.io.File r4 = new java.io.File     // Catch:{ all -> 0x1246 }
            java.lang.String r2 = "report_source"
            r4.<init>(r5, r2)     // Catch:{ all -> 0x1246 }
            boolean r2 = r4.exists()     // Catch:{ all -> 0x1246 }
            if (r2 == 0) goto L_0x0f6a
            java.io.File r5 = new java.io.File     // Catch:{ all -> 0x1246 }
            java.lang.String r2 = "report_source_ref.txt"
            r5.<init>(r4, r2)     // Catch:{ all -> 0x1246 }
            boolean r2 = r5.exists()     // Catch:{ all -> 0x1246 }
            if (r2 == 0) goto L_0x0f6a
            java.io.FileInputStream r4 = new java.io.FileInputStream     // Catch:{ IOException -> 0x0f60 }
            r4.<init>(r5)     // Catch:{ IOException -> 0x0f60 }
            java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch:{ all -> 0x0f59 }
            r2.<init>(r4)     // Catch:{ all -> 0x0f59 }
            java.io.BufferedReader r6 = new java.io.BufferedReader     // Catch:{ all -> 0x0f59 }
            r6.<init>(r2)     // Catch:{ all -> 0x0f59 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x0f59 }
            r5.<init>()     // Catch:{ all -> 0x0f59 }
        L_0x0f23:
            java.lang.String r2 = r6.readLine()     // Catch:{ all -> 0x0f59 }
            if (r2 == 0) goto L_0x0f2d
            r5.append(r2)     // Catch:{ all -> 0x0f59 }
            goto L_0x0f23
        L_0x0f2d:
            java.lang.String r2 = r5.toString()     // Catch:{ all -> 0x0f59 }
            java.lang.String r6 = "ACRA"
            java.lang.String r5 = "report_source_ref="
            boolean r7 = r2.startsWith(r5)     // Catch:{ all -> 0x0f59 }
            if (r7 == 0) goto L_0x0f40
            java.lang.String r2 = r2.replace(r5, r9)     // Catch:{ all -> 0x0f59 }
        L_0x0f40:
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0f46 }
            r5.<init>(r2)     // Catch:{ JSONException -> 0x0f46 }
            goto L_0x0f55
        L_0x0f46:
            r7 = move-exception
            r5 = 2
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch:{ all -> 0x0f59 }
            r5[r10] = r2     // Catch:{ all -> 0x0f59 }
            r2 = 1
            r5[r2] = r7     // Catch:{ all -> 0x0f59 }
            java.lang.String r2 = "Invalid report source ref override file contents: %s"
            p000X.AnonymousClass0DB.A0K(r6, r2, r5)     // Catch:{ all -> 0x0f59 }
            r5 = 0
        L_0x0f55:
            r4.close()     // Catch:{ IOException -> 0x0f60 }
            goto L_0x0f69
        L_0x0f59:
            r2 = move-exception
            throw r2     // Catch:{ all -> 0x0f5b }
        L_0x0f5b:
            r2 = move-exception
            r4.close()     // Catch:{ all -> 0x0f5f }
        L_0x0f5f:
            throw r2     // Catch:{ IOException -> 0x0f60 }
        L_0x0f60:
            r5 = move-exception
            java.lang.String r4 = "ACRA"
            java.lang.String r2 = "Failed to read report source ref override file"
            p000X.AnonymousClass0DB.A0H(r4, r2, r5)     // Catch:{ all -> 0x1246 }
            goto L_0x0f6a
        L_0x0f69:
            r8 = r5
        L_0x0f6a:
            if (r8 == 0) goto L_0x1000
            java.lang.String r4 = "fb.fury_stacktraces_filename"
            java.lang.String r5 = p000X.AnonymousClass070.A02(r4)     // Catch:{ all -> 0x1246 }
            if (r5 == 0) goto L_0x0f7a
            boolean r2 = r5.equals(r9)     // Catch:{ all -> 0x1246 }
            if (r2 == 0) goto L_0x0f7e
        L_0x0f7a:
            java.lang.String r5 = java.lang.System.getProperty(r4)     // Catch:{ all -> 0x1246 }
        L_0x0f7e:
            if (r5 == 0) goto L_0x0ff6
            boolean r2 = r5.equals(r9)     // Catch:{ all -> 0x1246 }
            if (r2 != 0) goto L_0x0ff6
            X.0CU r2 = p000X.C021000z.A03     // Catch:{ all -> 0x1246 }
            android.content.Context r2 = r2.A00     // Catch:{ all -> 0x1246 }
            r7 = 0
            if (r2 == 0) goto L_0x0fd3
            java.io.File r4 = new java.io.File     // Catch:{ all -> 0x1246 }
            java.io.File r2 = r2.getFilesDir()     // Catch:{ all -> 0x1246 }
            r4.<init>(r2, r5)     // Catch:{ all -> 0x1246 }
            boolean r2 = r4.exists()     // Catch:{ all -> 0x1246 }
            if (r2 == 0) goto L_0x0fd3
            java.io.FileInputStream r6 = new java.io.FileInputStream     // Catch:{ IOException -> 0x0fc9 }
            r6.<init>(r4)     // Catch:{ IOException -> 0x0fc9 }
            java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch:{ all -> 0x0fc2 }
            r2.<init>(r6)     // Catch:{ all -> 0x0fc2 }
            java.io.BufferedReader r5 = new java.io.BufferedReader     // Catch:{ all -> 0x0fc2 }
            r5.<init>(r2)     // Catch:{ all -> 0x0fc2 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0fc2 }
            r4.<init>()     // Catch:{ all -> 0x0fc2 }
        L_0x0fb0:
            java.lang.String r2 = r5.readLine()     // Catch:{ all -> 0x0fc2 }
            if (r2 == 0) goto L_0x0fba
            r4.append(r2)     // Catch:{ all -> 0x0fc2 }
            goto L_0x0fb0
        L_0x0fba:
            java.lang.String r2 = r4.toString()     // Catch:{ all -> 0x0fc2 }
            r6.close()     // Catch:{ IOException -> 0x0fc9 }
            goto L_0x0fd2
        L_0x0fc2:
            r2 = move-exception
            throw r2     // Catch:{ all -> 0x0fc4 }
        L_0x0fc4:
            r2 = move-exception
            r6.close()     // Catch:{ all -> 0x0fc8 }
        L_0x0fc8:
            throw r2     // Catch:{ IOException -> 0x0fc9 }
        L_0x0fc9:
            r5 = move-exception
            java.lang.String r4 = "ACRA"
            java.lang.String r2 = "Failed to read fury traces file"
            p000X.AnonymousClass0DB.A0H(r4, r2, r5)     // Catch:{ all -> 0x1246 }
            goto L_0x0fd3
        L_0x0fd2:
            r7 = r2
        L_0x0fd3:
            if (r7 == 0) goto L_0x0ff6
            boolean r2 = r7.equals(r9)     // Catch:{ all -> 0x1246 }
            if (r2 != 0) goto L_0x0ff6
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0fe6 }
            r4.<init>(r7)     // Catch:{ JSONException -> 0x0fe6 }
            java.lang.String r2 = "fury_traces"
            r8.put(r2, r4)     // Catch:{ JSONException -> 0x0fe6 }
            goto L_0x0ff6
        L_0x0fe6:
            r6 = move-exception
            java.lang.String r5 = "ACRA"
            r2 = 2
            java.lang.Object[] r4 = new java.lang.Object[r2]     // Catch:{ all -> 0x1246 }
            r4[r10] = r7     // Catch:{ all -> 0x1246 }
            r2 = 1
            r4[r2] = r6     // Catch:{ all -> 0x1246 }
            java.lang.String r2 = "Invalid fury file contents: %s"
            p000X.AnonymousClass0DB.A0K(r5, r2, r4)     // Catch:{ all -> 0x1246 }
        L_0x0ff6:
            r8.toString()     // Catch:{ all -> 0x1246 }
            java.lang.String r2 = r8.toString()     // Catch:{ all -> 0x1246 }
            p000X.C04410Dw.A0G(r11, r2)     // Catch:{ all -> 0x1246 }
        L_0x1000:
            java.lang.String r5 = "fb.testing.build_target"
            java.lang.String r4 = p000X.AnonymousClass070.A02(r5)     // Catch:{ all -> 0x1246 }
            if (r4 == 0) goto L_0x100e
            boolean r2 = r4.equals(r9)     // Catch:{ all -> 0x1246 }
            if (r2 == 0) goto L_0x1012
        L_0x100e:
            java.lang.String r4 = java.lang.System.getProperty(r5)     // Catch:{ all -> 0x1246 }
        L_0x1012:
            if (r4 == 0) goto L_0x101f
            boolean r2 = r4.equals(r9)     // Catch:{ all -> 0x1246 }
            if (r2 != 0) goto L_0x101f
            java.lang.String r2 = "mobile_build_target"
            p000X.C04410Dw.A0G(r2, r4)     // Catch:{ all -> 0x1246 }
        L_0x101f:
            java.lang.String r4 = r0.A02     // Catch:{ all -> 0x1246 }
            java.lang.String r2 = "app"
            p000X.C04410Dw.A0G(r2, r4)     // Catch:{ all -> 0x1246 }
            java.lang.String r4 = "567067343352427"
            java.lang.String r2 = "fb_app_id"
            p000X.C04410Dw.A0G(r2, r4)     // Catch:{ all -> 0x1246 }
            X.0G6 r4 = new X.0G6     // Catch:{ all -> 0x1246 }
            r4.<init>(r0)     // Catch:{ all -> 0x1246 }
            java.lang.String r2 = "react_bundle_version"
            r3.A0S(r2, r4)     // Catch:{ all -> 0x1246 }
            X.0G2 r4 = new X.0G2     // Catch:{ all -> 0x1246 }
            r4.<init>()     // Catch:{ all -> 0x1246 }
            java.lang.String r2 = "app_backgrounded"
            r3.A0S(r2, r4)     // Catch:{ all -> 0x1246 }
            X.0Mt r4 = p000X.C05860Mt.A02     // Catch:{ RuntimeException -> 0x1077 }
            android.app.Application r2 = r0.A00     // Catch:{ RuntimeException -> 0x1077 }
            java.lang.String r2 = r4.A05(r2)     // Catch:{ RuntimeException -> 0x1077 }
            if (r2 == 0) goto L_0x107f
            java.lang.String r4 = "marauder_device_id"
            p000X.C04410Dw.A0G(r4, r2)     // Catch:{ RuntimeException -> 0x1077 }
            android.app.Application r6 = r0.A00     // Catch:{ RuntimeException -> 0x1077 }
            if (r2 == 0) goto L_0x107f
            java.lang.String r5 = "acra_criticaldata_store"
            android.content.SharedPreferences r0 = r6.getSharedPreferences(r5, r10)     // Catch:{ RuntimeException -> 0x1077 }
            java.lang.String r4 = "DEVICE_ID"
            java.lang.String r0 = r0.getString(r4, r9)     // Catch:{ RuntimeException -> 0x1077 }
            boolean r0 = r2.equals(r0)     // Catch:{ RuntimeException -> 0x1077 }
            if (r0 != 0) goto L_0x107f
            android.content.SharedPreferences r0 = r6.getSharedPreferences(r5, r10)     // Catch:{ RuntimeException -> 0x1077 }
            android.content.SharedPreferences$Editor r0 = r0.edit()     // Catch:{ RuntimeException -> 0x1077 }
            android.content.SharedPreferences$Editor r0 = r0.putString(r4, r2)     // Catch:{ RuntimeException -> 0x1077 }
            r0.commit()     // Catch:{ RuntimeException -> 0x1077 }
            goto L_0x107f
        L_0x1077:
            r4 = move-exception
            java.lang.String r2 = "CrashReportingInitializer"
            java.lang.String r0 = "Failed to set application uuid"
            p000X.AnonymousClass0DB.A0G(r2, r0, r4)     // Catch:{ all -> 0x1246 }
        L_0x107f:
            p000X.AnonymousClass0K9.A00 = r3     // Catch:{ all -> 0x1246 }
            X.09Q r2 = p000X.AnonymousClass09Q.A0W     // Catch:{ all -> 0x1246 }
            r0 = 0
            if (r2 == 0) goto L_0x1087
            r0 = 1
        L_0x1087:
            if (r0 == 0) goto L_0x1093
            X.0GZ r2 = new X.0GZ     // Catch:{ all -> 0x1246 }
            r2.<init>()     // Catch:{ all -> 0x1246 }
            java.lang.String r0 = "nav_module"
            r3.A0S(r0, r2)     // Catch:{ all -> 0x1246 }
        L_0x1093:
            X.0Hl r2 = new X.0Hl     // Catch:{ all -> 0x1246 }
            X.0L7 r4 = p000X.AnonymousClass0L7.ANR_CONFIG     // Catch:{ all -> 0x1246 }
            java.lang.String r3 = "is_reporter_enabled"
            r6 = 0
            r7 = 0
            r5 = r17
            r2.<init>(r3, r4, r5, r6, r7)     // Catch:{ all -> 0x1246 }
            boolean r2 = p000X.C05630Li.A03(r2)     // Catch:{ all -> 0x1246 }
            X.03k r0 = new X.03k     // Catch:{ all -> 0x1246 }
            X.0Hl r34 = new X.0Hl     // Catch:{ all -> 0x1246 }
            r38 = 0
            r39 = 0
            r34.<init>(r35, r36, r37, r38, r39)     // Catch:{ all -> 0x1246 }
            boolean r4 = p000X.C05630Li.A03(r34)     // Catch:{ all -> 0x1246 }
            X.0I1 r8 = new X.0I1     // Catch:{ all -> 0x1246 }
            X.0L7 r7 = p000X.AnonymousClass0L7.ANR_MULTISIGNAL_ANR_DETECTOR     // Catch:{ all -> 0x1246 }
            r5 = r16
            r3 = r17
            r8.<init>(r5, r7, r3, r6)     // Catch:{ all -> 0x1246 }
            boolean r3 = p000X.C05630Li.A03(r8)     // Catch:{ all -> 0x1246 }
            if (r3 == 0) goto L_0x114b
            X.0I1 r8 = new X.0I1     // Catch:{ all -> 0x1246 }
            r3 = 30000(0x7530, float:4.2039E-41)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x1246 }
            r3 = 1
            java.lang.String[] r5 = new java.lang.String[r3]     // Catch:{ all -> 0x1246 }
            java.lang.String r3 = "30000"
            r5[r10] = r3     // Catch:{ all -> 0x1246 }
            java.lang.String r3 = "recovery_timeout_ms"
            r8.<init>(r3, r7, r6, r5)     // Catch:{ all -> 0x1246 }
            int r3 = p000X.C05630Li.A00(r8)     // Catch:{ all -> 0x1246 }
        L_0x10dd:
            r0.<init>(r4, r2, r3)     // Catch:{ all -> 0x1246 }
            X.0CU r2 = p000X.C021000z.A03     // Catch:{ all -> 0x1246 }
            boolean r2 = r2.A03     // Catch:{ all -> 0x1246 }
            if (r2 == 0) goto L_0x11ad
            boolean r2 = r0.A03()     // Catch:{ all -> 0x1246 }
            java.lang.String r4 = "anr_gk_cached"
            p000X.C021000z.A04(r4, r2)     // Catch:{ all -> 0x1246 }
            boolean r3 = r0.A05()     // Catch:{ all -> 0x1246 }
            java.lang.String r2 = "should_upload_system_anr_traces_gk_cached"
            p000X.C021000z.A04(r2, r3)     // Catch:{ all -> 0x1246 }
            r3 = 0
            java.lang.String r2 = "should_dedup_disk_persistence_gk_cached"
            p000X.C021000z.A04(r2, r3)     // Catch:{ all -> 0x1246 }
            int r3 = r0.A01()     // Catch:{ all -> 0x1246 }
            java.lang.String r2 = "android_anr_detector_to_use"
            p000X.C021000z.A03(r2, r3)     // Catch:{ all -> 0x1246 }
            boolean r3 = r0.A04()     // Catch:{ all -> 0x1246 }
            java.lang.String r2 = "run_anr_detector_on_browser_process"
            p000X.C021000z.A04(r2, r3)     // Catch:{ all -> 0x1246 }
            int r3 = r0.A00()     // Catch:{ all -> 0x1246 }
            java.lang.String r2 = "error_monitor_check_interval"
            p000X.C021000z.A03(r2, r3)     // Catch:{ all -> 0x1246 }
            r3 = 0
            java.lang.String r2 = "should_report_soft_errors"
            p000X.C021000z.A04(r2, r3)     // Catch:{ all -> 0x1246 }
            java.lang.String r2 = "log_on_signal_handler"
            p000X.C021000z.A04(r2, r3)     // Catch:{ all -> 0x1246 }
            java.lang.String r2 = "avoid_mutex_on_signal_handler"
            p000X.C021000z.A04(r2, r3)     // Catch:{ all -> 0x1246 }
            int r3 = r0.A02()     // Catch:{ all -> 0x1246 }
            java.lang.String r2 = "anr_recovery_timeout"
            p000X.C021000z.A03(r2, r3)     // Catch:{ all -> 0x1246 }
            r2 = 0
            p000X.C021000z.A04(r1, r2)     // Catch:{ all -> 0x1246 }
            java.lang.String r1 = "log_position_anr_trace_file"
            p000X.C021000z.A04(r1, r2)     // Catch:{ all -> 0x1246 }
            r2 = 5
            java.lang.String r1 = "foreground_check_period"
            p000X.C021000z.A03(r1, r2)     // Catch:{ all -> 0x1246 }
            X.0Dw r6 = p000X.AnonymousClass01Q.A00     // Catch:{ all -> 0x1246 }
            java.lang.Object r7 = p000X.C021000z.A06     // Catch:{ all -> 0x1246 }
            monitor-enter(r7)     // Catch:{ all -> 0x1246 }
            goto L_0x1167
        L_0x114b:
            X.0Hl r5 = new X.0Hl     // Catch:{ all -> 0x1246 }
            X.0L7 r7 = p000X.AnonymousClass0L7.APPSTATE_LOGGER     // Catch:{ all -> 0x1246 }
            r3 = -1
            java.lang.Integer r8 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x1246 }
            r3 = 1
            java.lang.String[] r9 = new java.lang.String[r3]     // Catch:{ all -> 0x1246 }
            java.lang.String r3 = "-1"
            r9[r10] = r3     // Catch:{ all -> 0x1246 }
            java.lang.String r6 = "anr_recovery_timeout"
            r10 = 0
            r5.<init>(r6, r7, r8, r9, r10)     // Catch:{ all -> 0x1246 }
            int r3 = p000X.C05630Li.A00(r5)     // Catch:{ all -> 0x1246 }
            goto L_0x10dd
        L_0x1167:
            X.01p r1 = p000X.C021000z.A01     // Catch:{ all -> 0x11a1 }
            r5 = 0
            r3 = 0
            if (r1 != 0) goto L_0x1186
            r3 = 1
            X.0CU r1 = p000X.C021000z.A03     // Catch:{ all -> 0x11a1 }
            android.content.Context r2 = r1.A00     // Catch:{ all -> 0x11a1 }
            X.0CY r1 = p000X.AnonymousClass0CY.A00()     // Catch:{ all -> 0x11a1 }
            java.lang.String r1 = r1.A01     // Catch:{ all -> 0x11a1 }
            if (r1 != 0) goto L_0x117d
            java.lang.String r1 = "unknown"
        L_0x117d:
            p000X.C021000z.A01(r2, r6, r1)     // Catch:{ all -> 0x11a1 }
            X.01p r1 = p000X.C021000z.A01     // Catch:{ all -> 0x11a1 }
            if (r1 != 0) goto L_0x1186
            monitor-exit(r7)     // Catch:{ all -> 0x11a1 }
            goto L_0x11ad
        L_0x1186:
            X.0Cc r1 = p000X.C021000z.A02     // Catch:{ all -> 0x11a1 }
            r1.A01 = r0     // Catch:{ all -> 0x11a1 }
            X.01p r1 = p000X.C021000z.A01     // Catch:{ all -> 0x11a1 }
            r1.BfW(r0)     // Catch:{ all -> 0x11a1 }
            monitor-exit(r7)     // Catch:{ all -> 0x11a1 }
            r6.A0E = r0     // Catch:{ all -> 0x1246 }
            if (r3 == 0) goto L_0x119e
            java.lang.Object r1 = p000X.C021000z.A07     // Catch:{ all -> 0x1246 }
            monitor-enter(r1)     // Catch:{ all -> 0x1246 }
            boolean r5 = p000X.C021000z.A05     // Catch:{ all -> 0x119b }
            monitor-exit(r1)     // Catch:{ all -> 0x119b }
            goto L_0x119e
        L_0x119b:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x119b }
            goto L_0x11eb
        L_0x119e:
            if (r5 == 0) goto L_0x11ad
            goto L_0x11a4
        L_0x11a1:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x11a1 }
            goto L_0x11eb
        L_0x11a4:
            X.01p r1 = p000X.C021000z.A01     // Catch:{ all -> 0x1246 }
            boolean r0 = p000X.C021000z.A05(r4)     // Catch:{ all -> 0x1246 }
            r1.ApJ(r0)     // Catch:{ all -> 0x1246 }
        L_0x11ad:
            X.0Hl r0 = new X.0Hl     // Catch:{ all -> 0x1246 }
            X.0L7 r2 = p000X.AnonymousClass0L7.APPSTATE_LOGGER     // Catch:{ all -> 0x1246 }
            r4 = 0
            r5 = 0
            r1 = r16
            r3 = r37
            r0.<init>(r1, r2, r3, r4, r5)     // Catch:{ all -> 0x1246 }
            boolean r0 = p000X.C05630Li.A03(r0)     // Catch:{ all -> 0x1246 }
            if (r0 == 0) goto L_0x11ec
            X.09Q r1 = p000X.AnonymousClass09Q.A0W     // Catch:{ all -> 0x1246 }
            r0 = 0
            if (r1 == 0) goto L_0x11c6
            r0 = 1
        L_0x11c6:
            if (r0 == 0) goto L_0x11ec
            java.lang.String r0 = "android_anr_detector_to_use"
            int r1 = p000X.C021000z.A00(r0)     // Catch:{ all -> 0x1246 }
            java.lang.Object r2 = p000X.AnonymousClass09Q.A0X     // Catch:{ all -> 0x1246 }
            monitor-enter(r2)     // Catch:{ all -> 0x1246 }
            X.09Q r0 = p000X.AnonymousClass09Q.A0W     // Catch:{ all -> 0x11e5 }
            if (r0 == 0) goto L_0x11dd
            monitor-exit(r2)     // Catch:{ all -> 0x11e5 }
            X.09Q r0 = p000X.AnonymousClass09Q.A0W     // Catch:{ all -> 0x1246 }
            com.facebook.analytics.appstatelogger.AppState r0 = r0.A08     // Catch:{ all -> 0x1246 }
            r0.A00 = r1     // Catch:{ all -> 0x1246 }
            goto L_0x11ec
        L_0x11dd:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x11e5 }
            java.lang.String r0 = "Application needs to be registered before setting ANR detector Id"
            r1.<init>(r0)     // Catch:{ all -> 0x11e5 }
            throw r1     // Catch:{ all -> 0x11e5 }
        L_0x11e5:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x11e5 }
            goto L_0x11eb
        L_0x11e8:
            p000X.C021000z.A02(r7)     // Catch:{ all -> 0x1246 }
        L_0x11eb:
            throw r0     // Catch:{ all -> 0x1246 }
        L_0x11ec:
            boolean r0 = p000X.C06530Pk.A00
            if (r0 == 0) goto L_0x11f6
            r0 = 49704987(0x2f6701b, float:3.6210797E-37)
            p000X.AnonymousClass0ZB.A00(r0)
        L_0x11f6:
            com.facebook.common.time.AwakeTimeSinceBootClock r0 = com.facebook.common.time.AwakeTimeSinceBootClock.INSTANCE
            long r0 = r0.now()
            r14.A02 = r0
            X.0Hi r1 = new X.0Hi
            r1.<init>()
            X.0IT r0 = p000X.C06610Ps.A00
            if (r0 != 0) goto L_0x123e
            p000X.C06610Ps.A00 = r1
            p000X.AnonymousClass0YI.A00(r44)
            goto L_0x1226
        L_0x120d:
            r0 = -377223716(0xffffffffe98405dc, float:-1.9950735E25)
        L_0x1210:
            p000X.AnonymousClass0ZB.A00(r0)
        L_0x1213:
            com.facebook.common.time.AwakeTimeSinceBootClock r0 = com.facebook.common.time.AwakeTimeSinceBootClock.INSTANCE
            long r0 = r0.now()
            r14.A02 = r0
            X.0Hi r1 = new X.0Hi
            r1.<init>()
            X.0IT r0 = p000X.C06610Ps.A00
            if (r0 != 0) goto L_0x123e
            p000X.C06610Ps.A00 = r1
        L_0x1226:
            com.facebook.common.time.AwakeTimeSinceBootClock r2 = com.facebook.common.time.AwakeTimeSinceBootClock.INSTANCE
            long r0 = r2.now()
            r14.A03 = r0
            p000X.C020100p.A01(r14)
            long r0 = r2.now()
            r14.A01 = r0
            com.facebook.common.dextricks.verifier.Verifier.disableRuntimeVerification(r14)
            r0 = r14
            monitor-enter(r0)
            monitor-exit(r0)
            return
        L_0x123e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "Release Channel provider already set"
            r1.<init>(r0)
            throw r1
        L_0x1246:
            r1 = move-exception
            boolean r0 = p000X.C06530Pk.A00
            if (r0 == 0) goto L_0x1251
            r0 = 1301508050(0x4d936fd2, float:3.09197376E8)
            p000X.AnonymousClass0ZB.A00(r0)
        L_0x1251:
            throw r1
        L_0x1252:
            throw r5
        L_0x1253:
            r0 = move-exception
            goto L_0x1257
        L_0x1255:
            r0 = move-exception
            r4 = r2
        L_0x1257:
            if (r4 == 0) goto L_0x125c
            r4.close()     // Catch:{ IOException -> 0x125c }
        L_0x125c:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.app.InstagramAppShell.attachBaseContext(android.content.Context):void");
    }

    public final File getCacheDir() {
        AnonymousClass0QQ r1 = this.A05;
        if (r1 != null) {
            return r1.getCacheDir(super.getCacheDir());
        }
        return super.getCacheDir();
    }

    public final File getDir(String str, int i) {
        AnonymousClass0QQ r0 = this.A05;
        if (r0 != null) {
            str = r0.getDir(str, i);
        }
        return super.getDir(str, i);
    }

    public final Resources getResources() {
        AnonymousClass0QQ r1 = this.A05;
        if (r1 instanceof C07170Sa) {
            if (this instanceof AnonymousClass0SZ) {
                Resources overridingResources = ((C07170Sa) r1).getOverridingResources();
                if (overridingResources != null) {
                    return overridingResources;
                }
            } else {
                throw new IllegalStateException(AnonymousClass000.A0E(getClass().getName(), " illegally implements HasOverridingResources without HasBaseResourcesAccess."));
            }
        }
        return super.getResources();
    }

    public final void onCreate() {
        IllegalStateException th;
        RuntimeException th2;
        String str;
        int writeStandardEntry = Logger.writeStandardEntry(C09680bp.A04, 6, 24, 0, 0, 1026255790, 0, 0);
        super.onCreate();
        if (C06530Pk.A00) {
            AnonymousClass0ZB.A01("IgAppShell.onCreate", -1540194984);
        }
        try {
            Verifier.disableRuntimeVerification(this);
            synchronized (this) {
            }
            boolean z = false;
            if (AnonymousClass0Bq.A00 && C05630Li.A03(new C05000Hl("is_enabled", AnonymousClass0L7.MULTI_DEX_CLASS_LOADER_V2, false, (String[]) null, (AnonymousClass04H) null))) {
                DexLibLoader.loadAll(this, false);
                z = true;
            }
            boolean z2 = false;
            if (this.A04.A01 == null) {
                z2 = true;
            }
            if (!z2) {
                if (AnonymousClass0Bq.A00 && (C05770Lw.A01(this).A00.getBoolean("debug_dead_code_detection", false) || C05630Li.A03(new C05000Hl("is_class_logging_allowed", AnonymousClass0L7.DEAD_CODE_DETECTION, false, (String[]) null, (AnonymousClass04H) null)))) {
                    ClassTracingLogger.sLoggerEnabled = AnonymousClass0FU.A07(this, AnonymousClass000.A0E("classtracinglogger_enable_", this.A04.A01));
                    ClassTracingLogger.initialize();
                    AnonymousClass0CY r5 = this.A04;
                    boolean equals = AnonymousClass0CX.A01.equals(r5.A00);
                    String str2 = r5.A01;
                    String str3 = str2;
                    synchronized (AnonymousClass0DA.class) {
                        try {
                            if (ClassTracingLogger.isEnabled() && !equals && AnonymousClass0DA.A02(this)) {
                                if (str2 == null) {
                                    AnonymousClass0DB.A03(AnonymousClass0DA.A00, "Process name is unknown");
                                } else {
                                    HandlerThread handlerThread = new HandlerThread("DeadCodeDetection", 19);
                                    handlerThread.start();
                                    Handler handler = new Handler(handlerThread.getLooper());
                                    AnonymousClass0D8 r6 = new AnonymousClass0D8(str3, this);
                                    AnonymousClass0ZA.A09(handler, r6, 60000, -1012224588);
                                    AnonymousClass0ZA.A09(handler, r6, 180000, 1429260515);
                                    AnonymousClass0ZA.A09(handler, new AnonymousClass0D9(r6, handler), 14400000, 101437532);
                                }
                            }
                        } catch (Throwable th3) {
                            th2 = th3;
                            throw th2;
                        }
                    }
                    if (ClassTracingLogger.isEnabled() && !z) {
                        DexLibLoader.loadAll(this, false);
                        z = true;
                    }
                }
                if (AnonymousClass0CX.A01.equals(this.A04.A00)) {
                    str = "com.instagram.process.instagram.InstagramApplicationForMainProcess";
                } else {
                    AnonymousClass0CY.A00();
                    str = "com.instagram.process.secondary.InstagramApplicationForSecondaryProcess";
                }
                if (z) {
                    C030405d.A00(this, AnonymousClass0QD.A00());
                }
                try {
                    this.A05 = (AnonymousClass0QQ) Class.forName(str).getConstructor(new Class[]{Context.class}).newInstance(new Object[]{this});
                    if (C06530Pk.A00) {
                        AnonymousClass0ZB.A01("Delegate.onCreate", -1331574819);
                    }
                    if (C05630Li.A03(new C05000Hl("enable_ig_executor_v2", AnonymousClass0L7.APP_SPEED_IG_EXECUTOR, false, (String[]) null, (AnonymousClass04H) null))) {
                        int A002 = C05630Li.A00(new C05000Hl("normal_worker_count_delta", AnonymousClass0L7.APP_SPEED_IG_EXECUTOR, -1, new String[]{"-1"}, (AnonymousClass04H) null));
                        AnonymousClass0L7 r17 = AnonymousClass0L7.APP_SPEED_IG_EXECUTOR;
                        C05700Lp.A0E = new C05610Lg(A002, C05630Li.A00(new C05000Hl("sensitive_worker_count_delta", r17, -1, new String[]{"-1"}, (AnonymousClass04H) null)), C05630Li.A03(new C05000Hl("enable_normal_worker_after_startup", r17, true, (String[]) null, (AnonymousClass04H) null)), C05630Li.A03(new C05000Hl("enable_defer_after_startup_if_possible", r17, true, (String[]) null, (AnonymousClass04H) null)), C05630Li.A03(new C05000Hl("enable_stuck_thread_monitor", r17, true, (String[]) null, (AnonymousClass04H) null)), C05630Li.A00(new C05000Hl("stuck_thread_timeout", AnonymousClass0L7.APP_SPEED_IG_EXECUTOR, 500, new String[]{"500"}, (AnonymousClass04H) null)));
                        C35391gI.A00 = C05700Lp.A00();
                        if (C05630Li.A03(new C05000Hl("enable_stuck_startup_monitor", r17, true, (String[]) null, (AnonymousClass04H) null))) {
                            C06140Nx r52 = C06140Nx.A06;
                            long A003 = (long) C05630Li.A00(new C05000Hl("startup_deadline_ms", AnonymousClass0L7.APP_SPEED_IG_EXECUTOR, Integer.valueOf(HardwareVideoEncoderFactory.QCOM_VP8_KEY_FRAME_INTERVAL_ANDROID_M_MS), new String[]{"20000"}, (AnonymousClass04H) null));
                            AnonymousClass0KV r2 = new AnonymousClass0KV();
                            r52.A00 = A003;
                            r52.A01 = r2;
                            Thread thread = new Thread(new C06150Ny(r52));
                            thread.setName("StuckStartupDetector");
                            thread.start();
                        }
                    }
                    AnonymousClass0L7 r13 = AnonymousClass0L7.APP_SPEED_INSTANT_BACKGROUND_DETECTION;
                    if (C05630Li.A03(new C05000Hl("enable_instant_background_detection", r13, false, (String[]) null, (AnonymousClass04H) null))) {
                        AnonymousClass0Q7.A04(new C05850Mk(), this);
                    } else if (C05630Li.A03(new C05000Hl("enable_android_background_detection", AnonymousClass0L7.APP_SPEED_INSTANT_BACKGROUND_DETECTION, (Object) null, (String[]) null, (AnonymousClass04H) null))) {
                        AnonymousClass0Q7.A04(new AnonymousClass0NE(), this);
                    } else {
                        AnonymousClass0Q7.A04(new C05870Mu(), this);
                    }
                    if (C05630Li.A03(new C05000Hl("enable_instant_background_detection", r13, false, (String[]) null, (AnonymousClass04H) null)) || C05630Li.A03(new C05000Hl("enable_android_background_detection", r13, false, (String[]) null, (AnonymousClass04H) null)) || C05630Li.A03(new C05000Hl("enabled_delayed_background_detection", AnonymousClass0L7.APP_SPEED_INSTANT_BACKGROUND_DETECTION, true, (String[]) null, (AnonymousClass04H) null))) {
                        AnonymousClass0Q7.A03().A00 = true;
                    }
                    this.A05.onCreate(this.A04.A01, this.A00, this.A02, this.A03, this.A01);
                    if (C06530Pk.A00) {
                        AnonymousClass0ZB.A00(-952761638);
                    }
                    if (C06530Pk.A00) {
                        AnonymousClass0ZB.A00(-475778813);
                    }
                    AnonymousClass0Z0.A08(-1394565812, writeStandardEntry);
                } catch (Exception e) {
                    th2 = new RuntimeException(e);
                    throw th2;
                }
            } else {
                th = new IllegalStateException("Can't find current process's name");
                AnonymousClass0Z0.A08(1140077778, writeStandardEntry);
                throw th;
            }
        } catch (Throwable th4) {
            if (C06530Pk.A00) {
                AnonymousClass0ZB.A00(-1873165690);
            }
            AnonymousClass0Z0.A08(-486635189, writeStandardEntry);
            throw th4;
        }
    }

    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        AnonymousClass0QQ r0 = this.A05;
        if (r0 != null) {
            r0.onConfigurationChangedCallback(configuration);
        }
    }
}
