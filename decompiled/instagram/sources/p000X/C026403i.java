package p000X;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Process;
import android.os.SystemClock;
import android.util.Pair;
import com.facebook.analytics.appstatelogger.AppState;
import com.facebook.analytics.appstatelogger.AppStateLogFile;
import java.io.File;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* renamed from: X.03i  reason: invalid class name and case insensitive filesystem */
public final class C026403i extends Thread {
    public int A00 = 0;
    public int A01 = -1;
    public int A02;
    public long A03;
    public long A04;
    public long A05;
    public Pair A06;
    public AppStateLogFile A07;
    public AnonymousClass04F A08;
    public AnonymousClass0SX A09;
    public C04900Gr A0A;
    public Object A0B;
    public Runnable A0C;
    public Throwable A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J = false;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;
    public boolean A0N = false;
    public final Context A0O;
    public final AppState A0P;
    public final AnonymousClass03H A0Q = new AnonymousClass03H();
    public final AnonymousClass03I A0R;
    public final AnonymousClass09Q A0S;
    public final AnonymousClass03f A0T = new AnonymousClass03f();
    public final AnonymousClass043 A0U;
    public final AnonymousClass04Q A0V;
    public final AnonymousClass0FN A0W;
    public final File A0X;
    public final Object A0Y = new Object();
    public final Object A0Z = new Object();
    public final String A0a;
    public final List A0b;
    public final Map A0c = new TreeMap();
    public final boolean A0d;
    public final boolean A0e;

    /* JADX WARNING: Can't wrap try/catch for region: R(7:1|2|3|(2:7|8)|9|10|11) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0012 */
    public static synchronized void A02(C026403i r2) {
        int i;
        synchronized (r2) {
            r2.A0L = true;
            if (r2.A0K && (i = r2.A01) != -1) {
                Process.setThreadPriority(i, r2.A00);
            }
            r2.notify();
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0045  */
    public final void A06(p000X.AnonymousClass0SX r6, java.lang.Runnable r7, boolean r8, char r9, char r10) {
        /*
            r5 = this;
            r3 = r5
            monitor-enter(r3)
            X.0SX r0 = r5.A09     // Catch:{ all -> 0x005b }
            if (r6 != r0) goto L_0x0008
            monitor-exit(r3)     // Catch:{ all -> 0x005b }
            return
        L_0x0008:
            boolean r0 = r5.A0M     // Catch:{ all -> 0x005b }
            r4 = 1
            if (r0 == 0) goto L_0x0021
            com.facebook.analytics.appstatelogger.AppStateLogFile r0 = r5.A07     // Catch:{ all -> 0x005b }
            r5.A00(r0)     // Catch:{ all -> 0x005b }
            if (r8 == 0) goto L_0x0031
            X.0SX r1 = p000X.AnonymousClass0SX.NO_ANR_DETECTED     // Catch:{ all -> 0x005b }
            if (r6 == r1) goto L_0x0031
            X.0SX r0 = r5.A09     // Catch:{ all -> 0x005b }
            if (r0 != r1) goto L_0x0031
            com.facebook.analytics.appstatelogger.AppStateLogFile r0 = r5.A07     // Catch:{ all -> 0x005b }
            r0.updateForegroundAnrState(r4, r9, r10)     // Catch:{ all -> 0x005b }
        L_0x0021:
            r5.A09 = r6     // Catch:{ all -> 0x005b }
            X.0SX r0 = p000X.AnonymousClass0SX.DURING_ANR     // Catch:{ all -> 0x005b }
            if (r6 == r0) goto L_0x0042
            X.0SX r0 = p000X.AnonymousClass0SX.SIGQUIT_RECEIVED_AM_CONFIRMED_MT_BLOCKED     // Catch:{ all -> 0x005b }
            if (r6 == r0) goto L_0x0042
            X.0SX r1 = p000X.AnonymousClass0SX.NO_SIGQUIT_AM_CONFIRMED_MT_BLOCKED     // Catch:{ all -> 0x005b }
            r0 = 0
            if (r6 != r1) goto L_0x0043
            goto L_0x0042
        L_0x0031:
            X.0SX r1 = p000X.AnonymousClass0SX.NO_ANR_DETECTED     // Catch:{ all -> 0x005b }
            if (r6 != r1) goto L_0x0021
            X.0SX r0 = r5.A09     // Catch:{ all -> 0x005b }
            if (r0 == r1) goto L_0x0021
            com.facebook.analytics.appstatelogger.AppStateLogFile r2 = r5.A07     // Catch:{ all -> 0x005b }
            r1 = 0
            r0 = 32
            r2.updateForegroundAnrState(r1, r0, r0)     // Catch:{ all -> 0x005b }
            goto L_0x0021
        L_0x0042:
            r0 = 1
        L_0x0043:
            if (r0 == 0) goto L_0x004a
            int r0 = r5.A02     // Catch:{ all -> 0x005b }
            int r0 = r0 + r4
            r5.A02 = r0     // Catch:{ all -> 0x005b }
        L_0x004a:
            java.lang.Object r1 = r5.A0Z     // Catch:{ all -> 0x005b }
            monitor-enter(r1)     // Catch:{ all -> 0x005b }
            r5.A0C = r7     // Catch:{ all -> 0x0058 }
            monitor-exit(r1)     // Catch:{ all -> 0x0058 }
            A02(r5)     // Catch:{ all -> 0x005b }
            monitor-exit(r3)     // Catch:{ all -> 0x005b }
            A01(r5)
            return
        L_0x0058:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0058 }
            throw r0     // Catch:{ all -> 0x005b }
        L_0x005b:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x005b }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000X.C026403i.A06(X.0SX, java.lang.Runnable, boolean, char, char):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0083, code lost:
        if (r2.A0S(r1) != false) goto L_0x0085;
     */
    public C026403i(AnonymousClass043 r8, File file, AnonymousClass03I r10, AppState appState, AnonymousClass04Q r12, Context context, C04900Gr r14, String str, List list, boolean z, AnonymousClass0FN r18, AnonymousClass09Q r19) {
        super("AppStateLoggerThread");
        boolean z2;
        this.A0O = context;
        this.A0U = r8;
        this.A0A = r14;
        this.A0L = true;
        this.A0G = true;
        this.A08 = AnonymousClass04F.NO_STATUS;
        this.A09 = AnonymousClass0SX.NO_ANR_DETECTED;
        this.A0B = new Object();
        this.A0X = file;
        this.A0R = r10;
        this.A0E = false;
        this.A0P = appState;
        this.A0V = r12;
        this.A0a = str;
        this.A0e = z;
        this.A0b = list;
        this.A0T.A01.importance = -1;
        this.A0W = r18;
        this.A0S = r19;
        this.A0d = r8.A0C(context);
        AnonymousClass043 r2 = this.A0U;
        Context context2 = this.A0O;
        boolean z3 = !r2.A0R(context2) ? false : z3;
        z3 = true;
        this.A0F = z3;
        synchronized (this.A0B) {
            this.A05 = (long) this.A0U.A03(this.A0O);
        }
        this.A04 = (long) this.A0U.A02(this.A0O);
        this.A03 = (long) this.A0U.A01(this.A0O);
        this.A0K = this.A0U.A0I(this.A0O);
        this.A0I = this.A0U.A0G(this.A0O);
        this.A0U.A0T(this.A0O);
        this.A0U.A05(this.A0O);
        try {
            File parentFile = this.A0X.getParentFile();
            if (parentFile.exists() || parentFile.mkdirs()) {
                AppStateLogFile appStateLogFile = new AppStateLogFile(this.A0X, this.A0F);
                this.A07 = appStateLogFile;
                char A002 = AnonymousClass04I.A00(-1);
                byte[] A012 = AnonymousClass04I.A01(0);
                appStateLogFile.updateStatus(AnonymousClass04F.INITIAL);
                appStateLogFile.updateForegroundEntityInfo(AnonymousClass04W.INITIAL_STATE, ' ');
                appStateLogFile.updateProcessImportance(A002, A012, A012);
                if (appStateLogFile.mIsEnabled) {
                    appStateLogFile.mMappedByteBuffer.put(15, (byte) 32);
                }
                appStateLogFile.updateForegroundAnrState(false, ' ', ' ');
                if (appStateLogFile.mIsEnabled) {
                    AppStateLogFile.assertIsAscii(' ');
                    appStateLogFile.mMappedByteBuffer.put(19, (byte) 32);
                }
                this.A0X.getAbsolutePath();
                z2 = true;
                this.A0M = z2;
            }
            A03(String.format("Unable to create app state log directory: %s", new Object[]{parentFile.getAbsolutePath()}), (Throwable) null);
            z2 = false;
            this.A0M = z2;
        } catch (Exception e) {
            A03("Error opening app state logging file", e);
            z2 = false;
        }
    }

    private void A00(AppStateLogFile appStateLogFile) {
        AnonymousClass04F r0;
        if (this.A08 == AnonymousClass04F.NO_STATUS) {
            switch (this.A09.ordinal()) {
                case 1:
                case 4:
                    r0 = AnonymousClass04F.ANR;
                    break;
                case 2:
                case 5:
                    r0 = AnonymousClass04F.ANR_RECOVERED;
                    break;
                case 3:
                    r0 = AnonymousClass04F.ANR_SIGQUIT;
                    break;
                case 6:
                    r0 = AnonymousClass04F.ANR_MT_UNBLOCKED;
                    break;
                case 7:
                    r0 = AnonymousClass04F.ANR_AM_EXPIRED;
                    break;
                case 8:
                    r0 = AnonymousClass04F.ANR_AM_CONFIRMED;
                    break;
                case 9:
                    r0 = AnonymousClass04F.ANR_AM_CONFIRMED_MT_UNBLOCKED;
                    break;
                default:
                    r0 = AnonymousClass04F.DONE_WRITING;
                    break;
            }
            appStateLogFile.updateStatus(r0);
        }
    }

    public static void A01(C026403i r2) {
        synchronized (r2.A0B) {
            r2.A0G = true;
            r2.A0B.notify();
        }
    }

    private void A03(String str, Throwable th) {
        AnonymousClass0DB.A0M("AppStateLoggerThread", th, str);
        this.A0Q.A00(str, th);
    }

    public final int A04(boolean z, boolean z2) {
        long uptimeMillis;
        int i;
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
        long A012 = this.A0W.A01(runningAppProcessInfo);
        if (A012 != 0) {
            i = runningAppProcessInfo.importance;
            uptimeMillis = A012;
        } else {
            uptimeMillis = SystemClock.uptimeMillis();
            i = -1;
        }
        this.A0T.A01.importance = i;
        if (z) {
            if (z2) {
                A05(i, A012, uptimeMillis);
            } else if (this.A0M) {
                this.A07.updateProcessImportance(AnonymousClass04I.A00(i), (byte[]) null, (byte[]) null);
                return i;
            }
        }
        return i;
    }

    public final void A05(int i, long j, long j2) {
        if (this.A0M) {
            long j3 = 0;
            if (j != 0) {
                j3 = j - this.A0P.A05;
            }
            this.A07.updateProcessImportance(AnonymousClass04I.A00(i), AnonymousClass04I.A01(j3), AnonymousClass04I.A01(j2 - this.A0P.A05));
        }
    }

    public final void A07(boolean z, boolean z2) {
        if (z2) {
            synchronized (this.A0Y) {
                try {
                    this.A0J = true;
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
            }
        }
        synchronized (this) {
            try {
                A02(this);
            } catch (Throwable th2) {
                while (true) {
                    th = th2;
                }
            }
        }
        if (z) {
            A01(this);
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
        	at jadx.core.dex.visitors.regions.RegionMaker.makeEndlessLoop(RegionMaker.java:368)
        	at jadx.core.dex.visitors.regions.RegionMaker.processLoop(RegionMaker.java:172)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0034 A[Catch:{ Exception -> 0x0927, all -> 0x0931 }] */
    public final void run() {
        /*
            r36 = this;
            r9 = r36
            boolean r0 = r9.A0M     // Catch:{ all -> 0x0931 }
            if (r0 == 0) goto L_0x0937
            X.09Q r3 = r9.A0S     // Catch:{ all -> 0x0931 }
            if (r3 == 0) goto L_0x0039
            X.03i r2 = r3.A09     // Catch:{ all -> 0x0931 }
            boolean r1 = r3.A0K     // Catch:{ all -> 0x0931 }
            boolean r0 = r3.A0L     // Catch:{ all -> 0x0931 }
            int r2 = r2.A04(r1, r0)     // Catch:{ all -> 0x0931 }
            X.043 r1 = r3.A0A     // Catch:{ all -> 0x0931 }
            android.content.Context r0 = r3.A07     // Catch:{ all -> 0x0931 }
            int r1 = r1.A04(r0)     // Catch:{ all -> 0x0931 }
            r0 = 4
            if (r1 != r0) goto L_0x0029
            r0 = -1
            if (r2 == r0) goto L_0x0031
            r0 = 100
            if (r2 > r0) goto L_0x0031
            java.lang.Object r1 = r3.A0E     // Catch:{ all -> 0x0931 }
            goto L_0x0032
        L_0x0029:
            r0 = 7
            if (r1 != r0) goto L_0x0031
            java.lang.Object r1 = p000X.AnonymousClass09Q.A01(r3, r2)     // Catch:{ all -> 0x0931 }
            goto L_0x0032
        L_0x0031:
            r1 = 0
        L_0x0032:
            if (r1 == 0) goto L_0x0039
            X.04W r0 = p000X.AnonymousClass04W.IN_FOREGROUND     // Catch:{ all -> 0x0931 }
            p000X.AnonymousClass09Q.A06(r3, r1, r0)     // Catch:{ all -> 0x0931 }
        L_0x0039:
            monitor-enter(r9)     // Catch:{ all -> 0x0931 }
            int r0 = android.os.Process.myTid()     // Catch:{ all -> 0x092e }
            r9.A01 = r0     // Catch:{ all -> 0x092e }
            int r0 = android.os.Process.myTid()     // Catch:{ all -> 0x092e }
            int r0 = android.os.Process.getThreadPriority(r0)     // Catch:{ all -> 0x092e }
            r9.A00 = r0     // Catch:{ all -> 0x092e }
            monitor-exit(r9)     // Catch:{ all -> 0x092e }
            java.util.Properties r8 = new java.util.Properties     // Catch:{ all -> 0x0918 }
            r8.<init>()     // Catch:{ all -> 0x0918 }
            com.facebook.analytics.appstatelogger.AppState r0 = r9.A0P     // Catch:{ all -> 0x0918 }
            java.lang.String r1 = r0.A0X     // Catch:{ all -> 0x0918 }
            java.lang.String r0 = "processName"
            r8.setProperty(r0, r1)     // Catch:{ all -> 0x0918 }
            com.facebook.analytics.appstatelogger.AppState r0 = r9.A0P     // Catch:{ all -> 0x0918 }
            int r0 = r0.A0U     // Catch:{ all -> 0x0918 }
            java.lang.String r1 = java.lang.Integer.toString(r0)     // Catch:{ all -> 0x0918 }
            java.lang.String r0 = "processId"
            r8.setProperty(r0, r1)     // Catch:{ all -> 0x0918 }
            com.facebook.analytics.appstatelogger.AppState r0 = r9.A0P     // Catch:{ all -> 0x0918 }
            java.lang.String r1 = r0.A0V     // Catch:{ all -> 0x0918 }
            java.lang.String r0 = "appVersionName"
            r8.setProperty(r0, r1)     // Catch:{ all -> 0x0918 }
            com.facebook.analytics.appstatelogger.AppState r0 = r9.A0P     // Catch:{ all -> 0x0918 }
            int r0 = r0.A0T     // Catch:{ all -> 0x0918 }
            java.lang.String r1 = java.lang.Integer.toString(r0)     // Catch:{ all -> 0x0918 }
            java.lang.String r0 = "appVersionCode"
            r8.setProperty(r0, r1)     // Catch:{ all -> 0x0918 }
            com.facebook.analytics.appstatelogger.AppState r0 = r9.A0P     // Catch:{ all -> 0x0918 }
            java.lang.String r1 = r0.A0W     // Catch:{ all -> 0x0918 }
            java.lang.String r0 = "installerName"
            r8.setProperty(r0, r1)     // Catch:{ all -> 0x0918 }
            com.facebook.analytics.appstatelogger.AppState r0 = r9.A0P     // Catch:{ all -> 0x0918 }
            long r0 = r0.A04     // Catch:{ all -> 0x0918 }
            java.lang.String r1 = java.lang.Long.toString(r0)     // Catch:{ all -> 0x0918 }
            java.lang.String r0 = "aslCreationTime"
            r8.setProperty(r0, r1)     // Catch:{ all -> 0x0918 }
            com.facebook.analytics.appstatelogger.AppState r0 = r9.A0P     // Catch:{ all -> 0x0918 }
            boolean r0 = r0.A0Y     // Catch:{ all -> 0x0918 }
            java.lang.String r1 = java.lang.Boolean.toString(r0)     // Catch:{ all -> 0x0918 }
            java.lang.String r0 = "startedInBackground"
            r8.setProperty(r0, r1)     // Catch:{ all -> 0x0918 }
            com.facebook.analytics.appstatelogger.AppState r0 = r9.A0P     // Catch:{ all -> 0x0918 }
            long r0 = r0.A0B     // Catch:{ all -> 0x0918 }
            java.lang.String r1 = java.lang.Long.toString(r0)     // Catch:{ all -> 0x0918 }
            java.lang.String r0 = "timeToAslRegister"
            r8.setProperty(r0, r1)     // Catch:{ all -> 0x0918 }
            X.0FN r0 = r9.A0W     // Catch:{ all -> 0x0918 }
            int r0 = r0.A03     // Catch:{ all -> 0x0918 }
            java.lang.String r1 = java.lang.Integer.toString(r0)     // Catch:{ all -> 0x0918 }
            java.lang.String r0 = "timeBetweenImportanceQueries"
            r8.setProperty(r0, r1)     // Catch:{ all -> 0x0918 }
            java.io.File r1 = new java.io.File     // Catch:{ IOException -> 0x00dd }
            java.lang.String r0 = "/proc/sys/kernel/osrelease"
            r1.<init>(r0)     // Catch:{ IOException -> 0x00dd }
            boolean r0 = r1.exists()     // Catch:{ IOException -> 0x00dd }
            if (r0 == 0) goto L_0x00dd
            java.util.Scanner r0 = new java.util.Scanner     // Catch:{ IOException -> 0x00dd }
            r0.<init>(r1)     // Catch:{ IOException -> 0x00dd }
            java.lang.String r1 = r0.nextLine()     // Catch:{ IOException -> 0x00dd }
            int r0 = r1.length()     // Catch:{ IOException -> 0x00dd }
            if (r0 <= 0) goto L_0x00dd
            java.lang.String r0 = "kernelVersion"
            r8.setProperty(r0, r1)     // Catch:{ IOException -> 0x00dd }
        L_0x00dd:
            com.facebook.analytics.appstatelogger.AppState r0 = r9.A0P     // Catch:{ all -> 0x0918 }
            long r3 = r0.A06     // Catch:{ all -> 0x0918 }
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x00f0
            java.lang.String r1 = java.lang.Long.toString(r3)     // Catch:{ all -> 0x0918 }
            java.lang.String r0 = "deviceMemory"
            r8.setProperty(r0, r1)     // Catch:{ all -> 0x0918 }
        L_0x00f0:
            java.io.File r2 = new java.io.File     // Catch:{ all -> 0x0918 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0918 }
            r1.<init>()     // Catch:{ all -> 0x0918 }
            java.io.File r0 = r9.A0X     // Catch:{ all -> 0x0918 }
            r1.append(r0)     // Catch:{ all -> 0x0918 }
            java.lang.String r0 = "_static"
            r1.append(r0)     // Catch:{ all -> 0x0918 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0918 }
            r2.<init>(r0)     // Catch:{ all -> 0x0918 }
            r3 = 0
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x011c }
            r1.<init>(r2)     // Catch:{ IOException -> 0x011c }
            r8.store(r1, r3)     // Catch:{ all -> 0x0115 }
            r1.close()     // Catch:{ IOException -> 0x011c }
            goto L_0x0125
        L_0x0115:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0117 }
        L_0x0117:
            r0 = move-exception
            r1.close()     // Catch:{ all -> 0x011b }
        L_0x011b:
            throw r0     // Catch:{ IOException -> 0x011c }
        L_0x011c:
            r2 = move-exception
            java.lang.String r1 = "AppStateLoggerThread"
            java.lang.String r0 = "Error saving static properties"
            p000X.AnonymousClass0DB.A0G(r1, r0, r2)     // Catch:{ all -> 0x0918 }
            r8 = r3
        L_0x0125:
            long r12 = android.os.SystemClock.uptimeMillis()     // Catch:{ all -> 0x0918 }
            X.043 r1 = r9.A0U     // Catch:{ all -> 0x0918 }
            android.content.Context r0 = r9.A0O     // Catch:{ all -> 0x0918 }
            boolean r24 = r1.A0L(r0)     // Catch:{ all -> 0x0918 }
            X.043 r1 = r9.A0U     // Catch:{ all -> 0x0918 }
            android.content.Context r0 = r9.A0O     // Catch:{ all -> 0x0918 }
            boolean r23 = r1.A0K(r0)     // Catch:{ all -> 0x0918 }
            r21 = 0
        L_0x013b:
            java.lang.Object r3 = r9.A0B     // Catch:{ all -> 0x0918 }
            monitor-enter(r3)     // Catch:{ all -> 0x0918 }
        L_0x013e:
            boolean r2 = r9.A0G     // Catch:{ all -> 0x0915 }
            r11 = 0
            r9.A0G = r11     // Catch:{ all -> 0x0915 }
            long r4 = android.os.SystemClock.uptimeMillis()     // Catch:{ all -> 0x0915 }
            long r4 = r4 - r12
            long r0 = r9.A05     // Catch:{ all -> 0x0915 }
            long r0 = r0 - r4
            if (r2 != 0) goto L_0x0159
            r4 = 0
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 <= 0) goto L_0x0159
            java.lang.Object r2 = r9.A0B     // Catch:{ InterruptedException -> 0x08d4 }
            r2.wait(r0)     // Catch:{ InterruptedException -> 0x08d4 }
            goto L_0x013e
        L_0x0159:
            monitor-exit(r3)     // Catch:{ all -> 0x0915 }
            r25 = 0
            monitor-enter(r9)     // Catch:{ all -> 0x0913 }
        L_0x015d:
            boolean r0 = r9.A0L     // Catch:{ all -> 0x0910 }
            if (r0 != 0) goto L_0x019c
            boolean r0 = r9.A0d     // Catch:{ InterruptedException -> 0x08df }
            r2 = 1
            if (r0 == 0) goto L_0x017d
            X.04Q r0 = r9.A0V     // Catch:{ InterruptedException -> 0x08df }
            X.04P r0 = r0.A01()     // Catch:{ InterruptedException -> 0x08df }
            X.04W r1 = r0.A00     // Catch:{ InterruptedException -> 0x08df }
            if (r1 == 0) goto L_0x0188
            X.04W r0 = p000X.AnonymousClass04W.ACTIVITY_STOPPED     // Catch:{ InterruptedException -> 0x08df }
            int r1 = r1.compareTo(r0)     // Catch:{ InterruptedException -> 0x08df }
            r0 = 0
            if (r1 >= 0) goto L_0x017a
            r0 = 1
        L_0x017a:
            if (r0 == 0) goto L_0x0188
            goto L_0x0185
        L_0x017d:
            X.04Q r1 = r9.A0V     // Catch:{ InterruptedException -> 0x08df }
            monitor-enter(r1)     // Catch:{ InterruptedException -> 0x08df }
            int r0 = r1.A00     // Catch:{ all -> 0x08dc }
            monitor-exit(r1)     // Catch:{ InterruptedException -> 0x08df }
            if (r0 <= 0) goto L_0x0188
        L_0x0185:
            if (r2 == 0) goto L_0x018d
            goto L_0x018a
        L_0x0188:
            r2 = 0
            goto L_0x0185
        L_0x018a:
            long r0 = r9.A04     // Catch:{ InterruptedException -> 0x08df }
            goto L_0x018f
        L_0x018d:
            long r0 = r9.A03     // Catch:{ InterruptedException -> 0x08df }
        L_0x018f:
            r3 = 0
            int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r2 != 0) goto L_0x0199
            r9.wait()     // Catch:{ InterruptedException -> 0x08df }
            goto L_0x015d
        L_0x0199:
            r9.wait(r0)     // Catch:{ InterruptedException -> 0x08df }
        L_0x019c:
            boolean r0 = r9.A0K     // Catch:{ all -> 0x0910 }
            if (r0 == 0) goto L_0x01ad
            boolean r0 = r9.A0L     // Catch:{ IllegalArgumentException | SecurityException -> 0x01ad }
            if (r0 == 0) goto L_0x01aa
            int r0 = r9.A00     // Catch:{ IllegalArgumentException | SecurityException -> 0x01ad }
        L_0x01a6:
            android.os.Process.setThreadPriority(r0)     // Catch:{ IllegalArgumentException | SecurityException -> 0x01ad }
            goto L_0x01ad
        L_0x01aa:
            r0 = 19
            goto L_0x01a6
        L_0x01ad:
            com.facebook.analytics.appstatelogger.AppState r7 = new com.facebook.analytics.appstatelogger.AppState     // Catch:{ all -> 0x0910 }
            com.facebook.analytics.appstatelogger.AppState r0 = r9.A0P     // Catch:{ all -> 0x0910 }
            r7.<init>(r0)     // Catch:{ all -> 0x0910 }
            android.content.Context r2 = r9.A0O     // Catch:{ all -> 0x0910 }
            java.lang.String r1 = "acra_criticaldata_store"
            android.content.SharedPreferences r2 = r2.getSharedPreferences(r1, r11)     // Catch:{ all -> 0x0910 }
            java.lang.String r1 = "CLIENT_USER_ID"
            java.lang.String r0 = ""
            java.lang.String r0 = r2.getString(r1, r0)     // Catch:{ all -> 0x0910 }
            r7.A0P = r0     // Catch:{ all -> 0x0910 }
            boolean r0 = r9.A0E     // Catch:{ all -> 0x0910 }
            r7.A0R = r0     // Catch:{ all -> 0x0910 }
            java.lang.Throwable r0 = r9.A0D     // Catch:{ all -> 0x0910 }
            r7.A0Q = r0     // Catch:{ all -> 0x0910 }
            r7.A02 = r11     // Catch:{ all -> 0x0910 }
            int r0 = r9.A02     // Catch:{ all -> 0x0910 }
            r7.A03 = r0     // Catch:{ all -> 0x0910 }
            X.04Q r2 = r9.A0V     // Catch:{ all -> 0x0910 }
            monitor-enter(r2)     // Catch:{ all -> 0x0910 }
            java.util.WeakHashMap r1 = new java.util.WeakHashMap     // Catch:{ all -> 0x090d }
            java.util.WeakHashMap r0 = r2.A02     // Catch:{ all -> 0x090d }
            r1.<init>(r0)     // Catch:{ all -> 0x090d }
            java.util.Map r31 = java.util.Collections.unmodifiableMap(r1)     // Catch:{ all -> 0x090d }
            monitor-exit(r2)     // Catch:{ all -> 0x0910 }
            r9.A0L = r11     // Catch:{ all -> 0x0910 }
            monitor-exit(r9)     // Catch:{ all -> 0x0910 }
            com.facebook.analytics.appstatelogger.AppStateLogFile r6 = r9.A07     // Catch:{ IOException | JSONException -> 0x07c6 }
            r26 = 0
            if (r8 != 0) goto L_0x01ee
            r26 = 1
        L_0x01ee:
            r9.A00(r6)     // Catch:{ IOException | JSONException -> 0x07c6 }
            X.04F r0 = p000X.AnonymousClass04F.WRITING_FILE     // Catch:{ IOException | JSONException -> 0x07c6 }
            char r3 = r0.A00     // Catch:{ IOException | JSONException -> 0x07c6 }
            boolean r0 = r6.mIsEnabled     // Catch:{ IOException | JSONException -> 0x07c6 }
            if (r0 == 0) goto L_0x0201
            java.nio.MappedByteBuffer r2 = r6.mMappedByteBuffer     // Catch:{ IOException | JSONException -> 0x07c6 }
            r1 = 15
            byte r0 = (byte) r3     // Catch:{ IOException | JSONException -> 0x07c6 }
            r2.put(r1, r0)     // Catch:{ IOException | JSONException -> 0x07c6 }
        L_0x0201:
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ IOException | JSONException -> 0x07c6 }
            r0 = 2
            r5.<init>(r0)     // Catch:{ IOException | JSONException -> 0x07c6 }
            boolean r0 = r9.A0H     // Catch:{ IOException | JSONException -> 0x07c6 }
            if (r0 == 0) goto L_0x0213
            X.03h r0 = new X.03h     // Catch:{ IOException | JSONException -> 0x07c6 }
            r0.<init>()     // Catch:{ IOException | JSONException -> 0x07c6 }
            r5.add(r0)     // Catch:{ IOException | JSONException -> 0x07c6 }
        L_0x0213:
            java.io.ByteArrayOutputStream r13 = new java.io.ByteArrayOutputStream     // Catch:{ IOException | JSONException -> 0x07c6 }
            r0 = 4096(0x1000, float:5.74E-42)
            r13.<init>(r0)     // Catch:{ IOException | JSONException -> 0x07c6 }
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x07bf }
            r0 = 24
            if (r1 < r0) goto L_0x022e
            android.util.Pair r0 = r9.A06     // Catch:{ all -> 0x07bf }
            if (r0 != 0) goto L_0x022e
            android.content.Context r1 = r9.A0O     // Catch:{ all -> 0x07bf }
            java.lang.String r0 = r9.A0a     // Catch:{ all -> 0x07bf }
            android.util.Pair r0 = p000X.AnonymousClass03g.A00(r1, r0)     // Catch:{ all -> 0x07bf }
            r9.A06 = r0     // Catch:{ all -> 0x07bf }
        L_0x022e:
            boolean r0 = r9.A0e     // Catch:{ IllegalStateException -> 0x06ec }
            if (r0 == 0) goto L_0x0266
            java.lang.Class<X.049> r4 = p000X.AnonymousClass049.class
            monitor-enter(r4)     // Catch:{ IllegalStateException -> 0x06ec }
            long r0 = p000X.AnonymousClass049.A00     // Catch:{ all -> 0x06e9 }
            r14 = 1
            int r3 = (r0 > r14 ? 1 : (r0 == r14 ? 0 : -1))
            if (r3 != 0) goto L_0x0250
            java.io.File r0 = android.os.Environment.getDataDirectory()     // Catch:{ all -> 0x06e9 }
            android.os.StatFs r1 = new android.os.StatFs     // Catch:{ all -> 0x06e9 }
            java.lang.String r0 = r0.getPath()     // Catch:{ all -> 0x06e9 }
            r1.<init>(r0)     // Catch:{ all -> 0x06e9 }
            long r0 = r1.getTotalBytes()     // Catch:{ all -> 0x06e9 }
            p000X.AnonymousClass049.A00 = r0     // Catch:{ all -> 0x06e9 }
        L_0x0250:
            monitor-exit(r4)     // Catch:{ IllegalStateException -> 0x06ec }
            r7.A0D = r0     // Catch:{ IllegalStateException -> 0x06ec }
            java.io.File r0 = android.os.Environment.getDataDirectory()     // Catch:{ IllegalStateException -> 0x06ec }
            android.os.StatFs r1 = new android.os.StatFs     // Catch:{ IllegalStateException -> 0x06ec }
            java.lang.String r0 = r0.getPath()     // Catch:{ IllegalStateException -> 0x06ec }
            r1.<init>(r0)     // Catch:{ IllegalStateException -> 0x06ec }
            long r0 = r1.getAvailableBytes()     // Catch:{ IllegalStateException -> 0x06ec }
            r7.A07 = r0     // Catch:{ IllegalStateException -> 0x06ec }
        L_0x0266:
            android.content.Context r1 = r9.A0O     // Catch:{ IllegalStateException -> 0x06ec }
            java.lang.String r0 = "activity"
            java.lang.Object r3 = r1.getSystemService(r0)     // Catch:{ IllegalStateException -> 0x06ec }
            android.app.ActivityManager r3 = (android.app.ActivityManager) r3     // Catch:{ IllegalStateException -> 0x06ec }
            if (r3 != 0) goto L_0x0279
            java.lang.String r1 = "AppStateLoggerThread"
            java.lang.String r0 = "Could not get ActivityManager"
            p000X.AnonymousClass0DB.A0D(r1, r0)     // Catch:{ IllegalStateException -> 0x06ec }
        L_0x0279:
            X.03f r1 = r9.A0T     // Catch:{ IllegalStateException -> 0x06ec }
            monitor-enter(r1)     // Catch:{ IllegalStateException -> 0x06ec }
            if (r3 == 0) goto L_0x0285
            X.03f r0 = r9.A0T     // Catch:{ all -> 0x06e6 }
            android.app.ActivityManager$MemoryInfo r0 = r0.A00     // Catch:{ all -> 0x06e6 }
            r3.getMemoryInfo(r0)     // Catch:{ all -> 0x06e6 }
        L_0x0285:
            X.0FN r3 = r9.A0W     // Catch:{ all -> 0x06e6 }
            X.03f r0 = r9.A0T     // Catch:{ all -> 0x06e6 }
            android.app.ActivityManager$RunningAppProcessInfo r0 = r0.A01     // Catch:{ all -> 0x06e6 }
            r3.A01(r0)     // Catch:{ all -> 0x06e6 }
            monitor-exit(r1)     // Catch:{ all -> 0x06e6 }
            X.03I r3 = r9.A0R     // Catch:{ IllegalStateException -> 0x06ec }
            monitor-enter(r3)     // Catch:{ IllegalStateException -> 0x06ec }
            long r0 = r3.A02     // Catch:{ all -> 0x06e3 }
            r19 = r0
            monitor-enter(r3)     // Catch:{ all -> 0x06e3 }
            boolean r0 = r3.A03     // Catch:{ all -> 0x06e0 }
            if (r0 == 0) goto L_0x029e
            r14 = 0
            goto L_0x02a5
        L_0x029e:
            long r14 = android.os.SystemClock.uptimeMillis()     // Catch:{ all -> 0x06e0 }
            long r0 = r3.A00     // Catch:{ all -> 0x06e0 }
            long r14 = r14 - r0
        L_0x02a5:
            monitor-exit(r3)     // Catch:{ all -> 0x06e3 }
            long r19 = r19 + r14
            monitor-exit(r3)     // Catch:{ IllegalStateException -> 0x06ec }
            X.03I r3 = r9.A0R     // Catch:{ IllegalStateException -> 0x06ec }
            monitor-enter(r3)     // Catch:{ IllegalStateException -> 0x06ec }
            boolean r0 = r3.A03     // Catch:{ all -> 0x06e3 }
            if (r0 == 0) goto L_0x02b3
            r15 = 0
            goto L_0x02ba
        L_0x02b3:
            long r15 = android.os.SystemClock.uptimeMillis()     // Catch:{ all -> 0x06e3 }
            long r0 = r3.A00     // Catch:{ all -> 0x06e3 }
            long r15 = r15 - r0
        L_0x02ba:
            monitor-exit(r3)     // Catch:{ IllegalStateException -> 0x06ec }
            X.03I r3 = r9.A0R     // Catch:{ IllegalStateException -> 0x06ec }
            monitor-enter(r3)     // Catch:{ IllegalStateException -> 0x06ec }
            long r0 = r3.A01     // Catch:{ all -> 0x06e3 }
            r34 = r0
            monitor-exit(r3)     // Catch:{ IllegalStateException -> 0x06ec }
            android.util.Pair r0 = r9.A06     // Catch:{ IllegalStateException -> 0x06ec }
            r30 = r0
            boolean r12 = r9.A0e     // Catch:{ IllegalStateException -> 0x06ec }
            X.03f r1 = r9.A0T     // Catch:{ IllegalStateException -> 0x06ec }
            android.app.ActivityManager$MemoryInfo r0 = r1.A00     // Catch:{ IllegalStateException -> 0x06ec }
            r33 = r0
            android.app.ActivityManager$RunningAppProcessInfo r0 = r1.A01     // Catch:{ IllegalStateException -> 0x06ec }
            r32 = r0
            java.util.List r0 = r9.A0b     // Catch:{ IllegalStateException -> 0x06ec }
            java.io.OutputStreamWriter r4 = new java.io.OutputStreamWriter     // Catch:{ IllegalStateException -> 0x06ec }
            java.lang.String r1 = "UTF-8"
            r4.<init>(r13, r1)     // Catch:{ IllegalStateException -> 0x06ec }
            long r17 = android.os.SystemClock.uptimeMillis()     // Catch:{ IllegalStateException -> 0x06ec }
            java.lang.String r10 = "{"
            r4.append(r10)     // Catch:{ IllegalStateException -> 0x06ec }
            java.util.Iterator r2 = r0.iterator()     // Catch:{ IllegalStateException -> 0x06ec }
        L_0x02ea:
            boolean r0 = r2.hasNext()     // Catch:{ IllegalStateException -> 0x06ec }
            java.lang.String r3 = ","
            if (r0 == 0) goto L_0x0304
            java.lang.Object r1 = r2.next()     // Catch:{ IllegalStateException -> 0x06ec }
            X.04M r1 = (p000X.AnonymousClass04M) r1     // Catch:{ IllegalStateException -> 0x06ec }
            r0 = r25
            boolean r0 = r1.A4Z(r4, r0)     // Catch:{ IllegalStateException -> 0x06ec }
            if (r0 == 0) goto L_0x02ea
            r4.append(r3)     // Catch:{ IllegalStateException -> 0x06ec }
            goto L_0x02ea
        L_0x0304:
            java.lang.String r2 = "\","
            if (r26 == 0) goto L_0x0384
            java.lang.String r1 = r7.A0X     // Catch:{ IllegalStateException -> 0x06ec }
            java.lang.String r0 = "\"processName\":\""
            r4.append(r0)     // Catch:{ IllegalStateException -> 0x06ec }
            r4.append(r1)     // Catch:{ IllegalStateException -> 0x06ec }
            r4.append(r2)     // Catch:{ IllegalStateException -> 0x06ec }
            java.lang.String r0 = "\"process_id\":"
            r4.append(r0)     // Catch:{ IllegalStateException -> 0x06ec }
            int r0 = r7.A0U     // Catch:{ IllegalStateException -> 0x06ec }
            java.lang.String r0 = java.lang.Integer.toString(r0)     // Catch:{ IllegalStateException -> 0x06ec }
            r4.append(r0)     // Catch:{ IllegalStateException -> 0x06ec }
            r4.append(r3)     // Catch:{ IllegalStateException -> 0x06ec }
            java.lang.String r1 = r7.A0V     // Catch:{ IllegalStateException -> 0x06ec }
            java.lang.String r0 = "\"appVersionName\":\""
            r4.append(r0)     // Catch:{ IllegalStateException -> 0x06ec }
            r4.append(r1)     // Catch:{ IllegalStateException -> 0x06ec }
            r4.append(r2)     // Catch:{ IllegalStateException -> 0x06ec }
            int r1 = r7.A0T     // Catch:{ IllegalStateException -> 0x06ec }
            java.lang.String r0 = "\"appVersionCode\":"
            r4.append(r0)     // Catch:{ IllegalStateException -> 0x06ec }
            java.lang.String r0 = java.lang.Integer.toString(r1)     // Catch:{ IllegalStateException -> 0x06ec }
            r4.append(r0)     // Catch:{ IllegalStateException -> 0x06ec }
            r4.append(r3)     // Catch:{ IllegalStateException -> 0x06ec }
            java.lang.String r1 = r7.A0W     // Catch:{ IllegalStateException -> 0x06ec }
            java.lang.String r0 = "\"installerName\":\""
            r4.append(r0)     // Catch:{ IllegalStateException -> 0x06ec }
            r4.append(r1)     // Catch:{ IllegalStateException -> 0x06ec }
            r4.append(r2)     // Catch:{ IllegalStateException -> 0x06ec }
            long r0 = r7.A04     // Catch:{ IllegalStateException -> 0x06ec }
            java.lang.String r14 = "\"aslCreationTime\":"
            r4.append(r14)     // Catch:{ IllegalStateException -> 0x06ec }
            java.lang.String r0 = java.lang.Long.toString(r0)     // Catch:{ IllegalStateException -> 0x06ec }
            r4.append(r0)     // Catch:{ IllegalStateException -> 0x06ec }
            r4.append(r3)     // Catch:{ IllegalStateException -> 0x06ec }
            boolean r1 = r7.A0Y     // Catch:{ IllegalStateException -> 0x06ec }
            java.lang.String r0 = "\"startedInBackground\":"
            r4.append(r0)     // Catch:{ IllegalStateException -> 0x06ec }
            java.lang.String r0 = java.lang.Boolean.toString(r1)     // Catch:{ IllegalStateException -> 0x06ec }
            r4.append(r0)     // Catch:{ IllegalStateException -> 0x06ec }
            r4.append(r3)     // Catch:{ IllegalStateException -> 0x06ec }
            java.lang.String r0 = "\"deviceMemory\":"
            r4.append(r0)     // Catch:{ IllegalStateException -> 0x06ec }
            long r0 = r7.A06     // Catch:{ IllegalStateException -> 0x06ec }
            java.lang.String r0 = java.lang.Long.toString(r0)     // Catch:{ IllegalStateException -> 0x06ec }
            r4.append(r0)     // Catch:{ IllegalStateException -> 0x06ec }
            r4.append(r3)     // Catch:{ IllegalStateException -> 0x06ec }
        L_0x0384:
            java.lang.String r0 = "\"processWallClockUptimeMs\":"
            r4.append(r0)     // Catch:{ IllegalStateException -> 0x06ec }
            long r0 = r7.A05     // Catch:{ IllegalStateException -> 0x06ec }
            long r26 = r17 - r0
            java.lang.String r0 = java.lang.Long.toString(r26)     // Catch:{ IllegalStateException -> 0x06ec }
            r4.append(r0)     // Catch:{ IllegalStateException -> 0x06ec }
            r4.append(r3)     // Catch:{ IllegalStateException -> 0x06ec }
            java.lang.String r0 = "\"successfullyAppliedSelfSignalHookCount\":"
            r4.append(r0)     // Catch:{ IllegalStateException -> 0x06ec }
            java.lang.Class<com.facebook.analytics.appstatelogger.AppStateLoggerNative> r1 = com.facebook.analytics.appstatelogger.AppStateLoggerNative.class
            monitor-enter(r1)     // Catch:{ IllegalStateException -> 0x06ec }
            int r0 = com.facebook.analytics.appstatelogger.AppStateLoggerNative.sSelfSignalFunctionsSuccessfullyHooked     // Catch:{ all -> 0x06dd }
            monitor-exit(r1)     // Catch:{ IllegalStateException -> 0x06ec }
            java.lang.String r0 = java.lang.Integer.toString(r0)     // Catch:{ IllegalStateException -> 0x06ec }
            r4.append(r0)     // Catch:{ IllegalStateException -> 0x06ec }
            r4.append(r3)     // Catch:{ IllegalStateException -> 0x06ec }
            long r0 = r7.A0C     // Catch:{ IllegalStateException -> 0x06ec }
            r28 = 0
            int r14 = (r0 > r28 ? 1 : (r0 == r28 ? 0 : -1))
            if (r14 <= 0) goto L_0x03d4
            java.lang.String r14 = "\"timeToFirstActivityTransitionMs\":"
            r4.append(r14)     // Catch:{ IllegalStateException -> 0x06ec }
            java.lang.String r0 = java.lang.Long.toString(r0)     // Catch:{ IllegalStateException -> 0x06ec }
            r4.append(r0)     // Catch:{ IllegalStateException -> 0x06ec }
            r4.append(r3)     // Catch:{ IllegalStateException -> 0x06ec }
            java.lang.String r0 = "\"foregroundUntilFirstActivityTransition\":"
            r4.append(r0)     // Catch:{ IllegalStateException -> 0x06ec }
            boolean r0 = r7.A0S     // Catch:{ IllegalStateException -> 0x06ec }
            java.lang.String r0 = java.lang.Boolean.toString(r0)     // Catch:{ IllegalStateException -> 0x06ec }
            r4.append(r0)     // Catch:{ IllegalStateException -> 0x06ec }
            r4.append(r3)     // Catch:{ IllegalStateException -> 0x06ec }
        L_0x03d4:
            long r0 = r7.A09     // Catch:{ IllegalStateException -> 0x06ec }
            int r14 = (r0 > r28 ? 1 : (r0 == r28 ? 0 : -1))
            if (r14 <= 0) goto L_0x03f1
            java.lang.String r0 = "\"lastUpdateTimeMs\":"
            r4.append(r0)     // Catch:{ IllegalStateException -> 0x06ec }
            long r26 = java.lang.System.currentTimeMillis()     // Catch:{ IllegalStateException -> 0x06ec }
            long r0 = r7.A09     // Catch:{ IllegalStateException -> 0x06ec }
            long r26 = r26 - r0
            java.lang.String r0 = java.lang.Long.toString(r26)     // Catch:{ IllegalStateException -> 0x06ec }
            r4.append(r0)     // Catch:{ IllegalStateException -> 0x06ec }
            r4.append(r3)     // Catch:{ IllegalStateException -> 0x06ec }
        L_0x03f1:
            long r0 = r7.A0A     // Catch:{ IllegalStateException -> 0x06ec }
            int r14 = (r0 > r28 ? 1 : (r0 == r28 ? 0 : -1))
            if (r14 <= 0) goto L_0x0408
            java.lang.String r0 = "\"lastLauncherIntentTimeMs\":"
            r4.append(r0)     // Catch:{ IllegalStateException -> 0x06ec }
            long r0 = r7.A0A     // Catch:{ IllegalStateException -> 0x06ec }
            java.lang.String r0 = java.lang.Long.toString(r0)     // Catch:{ IllegalStateException -> 0x06ec }
            r4.append(r0)     // Catch:{ IllegalStateException -> 0x06ec }
            r4.append(r3)     // Catch:{ IllegalStateException -> 0x06ec }
        L_0x0408:
            java.lang.String r1 = r7.A0G     // Catch:{ IllegalStateException -> 0x06ec }
            if (r1 == 0) goto L_0x0417
            java.lang.String r0 = "\"analyticsSessionId\":\""
            r4.append(r0)     // Catch:{ IllegalStateException -> 0x06ec }
            r4.append(r1)     // Catch:{ IllegalStateException -> 0x06ec }
            r4.append(r2)     // Catch:{ IllegalStateException -> 0x06ec }
        L_0x0417:
            java.lang.String r0 = "\"activities\":["
            r4.append(r0)     // Catch:{ IllegalStateException -> 0x06ec }
            java.util.Set r0 = r31.entrySet()     // Catch:{ IllegalStateException -> 0x06ec }
            java.util.Iterator r26 = r0.iterator()     // Catch:{ IllegalStateException -> 0x06ec }
        L_0x0424:
            boolean r0 = r26.hasNext()     // Catch:{ IllegalStateException -> 0x06ec }
            if (r0 == 0) goto L_0x0468
            java.lang.Object r0 = r26.next()     // Catch:{ IllegalStateException -> 0x06ec }
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch:{ IllegalStateException -> 0x06ec }
            java.lang.Object r1 = r0.getKey()     // Catch:{ IllegalStateException -> 0x06ec }
            java.lang.Class r1 = r1.getClass()     // Catch:{ IllegalStateException -> 0x06ec }
            java.lang.String r14 = r1.getSimpleName()     // Catch:{ IllegalStateException -> 0x06ec }
            java.lang.Object r1 = r0.getValue()     // Catch:{ IllegalStateException -> 0x06ec }
            X.04W r1 = (p000X.AnonymousClass04W) r1     // Catch:{ IllegalStateException -> 0x06ec }
            r4.append(r10)     // Catch:{ IllegalStateException -> 0x06ec }
            java.lang.String r0 = "\"name\":\""
            r4.append(r0)     // Catch:{ IllegalStateException -> 0x06ec }
            r4.append(r14)     // Catch:{ IllegalStateException -> 0x06ec }
            java.lang.String r0 = "\",\"state\":\""
            r4.append(r0)     // Catch:{ IllegalStateException -> 0x06ec }
            java.lang.String r0 = r1.toString()     // Catch:{ IllegalStateException -> 0x06ec }
            r4.append(r0)     // Catch:{ IllegalStateException -> 0x06ec }
            java.lang.String r0 = "\"}"
            r4.append(r0)     // Catch:{ IllegalStateException -> 0x06ec }
            boolean r0 = r26.hasNext()     // Catch:{ IllegalStateException -> 0x06ec }
            if (r0 == 0) goto L_0x0424
            r4.append(r3)     // Catch:{ IllegalStateException -> 0x06ec }
            goto L_0x0424
        L_0x0468:
            java.lang.String r0 = "],"
            r4.append(r0)     // Catch:{ IllegalStateException -> 0x06ec }
            java.lang.String r0 = r7.A0P     // Catch:{ IllegalStateException -> 0x06ec }
            if (r0 == 0) goto L_0x0484
            boolean r0 = r0.isEmpty()     // Catch:{ IllegalStateException -> 0x06ec }
            if (r0 != 0) goto L_0x0484
            java.lang.String r0 = "\"userId\":\""
            r4.append(r0)     // Catch:{ IllegalStateException -> 0x06ec }
            java.lang.String r0 = r7.A0P     // Catch:{ IllegalStateException -> 0x06ec }
            r4.append(r0)     // Catch:{ IllegalStateException -> 0x06ec }
            r4.append(r2)     // Catch:{ IllegalStateException -> 0x06ec }
        L_0x0484:
            java.lang.String r0 = "\"granularExposures\":\""
            r4.append(r0)     // Catch:{ IllegalStateException -> 0x06ec }
            java.lang.String r0 = r7.A0K     // Catch:{ IllegalStateException -> 0x06ec }
            r4.append(r0)     // Catch:{ IllegalStateException -> 0x06ec }
            r4.append(r2)     // Catch:{ IllegalStateException -> 0x06ec }
            java.lang.String r0 = "\"navModule\":\""
            r4.append(r0)     // Catch:{ IllegalStateException -> 0x06ec }
            java.lang.String r0 = r7.A0N     // Catch:{ IllegalStateException -> 0x06ec }
            r4.append(r0)     // Catch:{ IllegalStateException -> 0x06ec }
            r4.append(r2)     // Catch:{ IllegalStateException -> 0x06ec }
            java.lang.String r0 = "\"endpoint\":\""
            r4.append(r0)     // Catch:{ IllegalStateException -> 0x06ec }
            java.lang.String r0 = r7.A00()     // Catch:{ IllegalStateException -> 0x06ec }
            r4.append(r0)     // Catch:{ IllegalStateException -> 0x06ec }
            r4.append(r2)     // Catch:{ IllegalStateException -> 0x06ec }
            java.lang.String r0 = "\"timeSinceNavigationMs\":"
            r4.append(r0)     // Catch:{ IllegalStateException -> 0x06ec }
            long r0 = r7.A08     // Catch:{ IllegalStateException -> 0x06ec }
            long r26 = r17 - r0
            java.lang.String r0 = java.lang.Long.toString(r26)     // Catch:{ IllegalStateException -> 0x06ec }
            r4.append(r0)     // Catch:{ IllegalStateException -> 0x06ec }
            r4.append(r3)     // Catch:{ IllegalStateException -> 0x06ec }
            if (r12 == 0) goto L_0x04e4
            java.lang.String r0 = "\"free_internal_disk_space_bytes\":"
            r4.append(r0)     // Catch:{ IllegalStateException -> 0x06ec }
            long r0 = r7.A07     // Catch:{ IllegalStateException -> 0x06ec }
            java.lang.String r0 = java.lang.Long.toString(r0)     // Catch:{ IllegalStateException -> 0x06ec }
            r4.append(r0)     // Catch:{ IllegalStateException -> 0x06ec }
            r4.append(r3)     // Catch:{ IllegalStateException -> 0x06ec }
            java.lang.String r0 = "\"total_internal_disk_space_bytes\":"
            r4.append(r0)     // Catch:{ IllegalStateException -> 0x06ec }
            long r0 = r7.A0D     // Catch:{ IllegalStateException -> 0x06ec }
            java.lang.String r0 = java.lang.Long.toString(r0)     // Catch:{ IllegalStateException -> 0x06ec }
            r4.append(r0)     // Catch:{ IllegalStateException -> 0x06ec }
            r4.append(r3)     // Catch:{ IllegalStateException -> 0x06ec }
        L_0x04e4:
            java.lang.String r0 = "\"radioType\":\""
            r4.append(r0)     // Catch:{ IllegalStateException -> 0x06ec }
            java.lang.String r0 = r7.A0O     // Catch:{ IllegalStateException -> 0x06ec }
            r4.append(r0)     // Catch:{ IllegalStateException -> 0x06ec }
            r4.append(r2)     // Catch:{ IllegalStateException -> 0x06ec }
            java.lang.String r0 = "\"mobileconfig_canary\":"
            r4.append(r0)     // Catch:{ IllegalStateException -> 0x06ec }
            java.lang.String r0 = r7.A0L     // Catch:{ IllegalStateException -> 0x06ec }
            r4.append(r0)     // Catch:{ IllegalStateException -> 0x06ec }
            r4.append(r3)     // Catch:{ IllegalStateException -> 0x06ec }
            java.lang.String r0 = "\"mobileconfig_fetch_timestamps\":"
            r4.append(r0)     // Catch:{ IllegalStateException -> 0x06ec }
            java.lang.String r0 = r7.A0M     // Catch:{ IllegalStateException -> 0x06ec }
            r4.append(r0)     // Catch:{ IllegalStateException -> 0x06ec }
            r4.append(r3)     // Catch:{ IllegalStateException -> 0x06ec }
            java.lang.String r10 = r7.A0H     // Catch:{ IllegalStateException -> 0x06ec }
            java.lang.String r1 = "\""
            if (r10 == 0) goto L_0x0526
            java.lang.String r0 = "\"attribution_id\":\""
            r4.append(r0)     // Catch:{ IllegalStateException -> 0x06ec }
            java.lang.String r0 = "\\\""
            java.lang.String r0 = java.util.regex.Matcher.quoteReplacement(r0)     // Catch:{ IllegalStateException -> 0x06ec }
            java.lang.String r0 = r10.replaceAll(r1, r0)     // Catch:{ IllegalStateException -> 0x06ec }
            r4.append(r0)     // Catch:{ IllegalStateException -> 0x06ec }
            r4.append(r2)     // Catch:{ IllegalStateException -> 0x06ec }
        L_0x0526:
            java.lang.String r0 = "\"total_fgtm_ms\":"
            r4.append(r0)     // Catch:{ IllegalStateException -> 0x06ec }
            r26 = r19
            java.lang.String r0 = java.lang.Long.toString(r26)     // Catch:{ IllegalStateException -> 0x06ec }
            r4.append(r0)     // Catch:{ IllegalStateException -> 0x06ec }
            r4.append(r3)     // Catch:{ IllegalStateException -> 0x06ec }
            java.lang.String r0 = "\"current_fgtm_ms\":"
            r4.append(r0)     // Catch:{ IllegalStateException -> 0x06ec }
            java.lang.String r0 = java.lang.Long.toString(r15)     // Catch:{ IllegalStateException -> 0x06ec }
            r4.append(r0)     // Catch:{ IllegalStateException -> 0x06ec }
            r4.append(r3)     // Catch:{ IllegalStateException -> 0x06ec }
            java.lang.String r0 = "\"total_fg_count\":"
            r4.append(r0)     // Catch:{ IllegalStateException -> 0x06ec }
            r14 = r34
            java.lang.String r0 = java.lang.Long.toString(r14)     // Catch:{ IllegalStateException -> 0x06ec }
            r4.append(r0)     // Catch:{ IllegalStateException -> 0x06ec }
            r4.append(r3)     // Catch:{ IllegalStateException -> 0x06ec }
            java.lang.Boolean r0 = r7.A0F     // Catch:{ IllegalStateException -> 0x06ec }
            if (r0 == 0) goto L_0x056c
            java.lang.String r0 = "\"sticky_bit_enabled\":"
            r4.append(r0)     // Catch:{ IllegalStateException -> 0x06ec }
            java.lang.Boolean r0 = r7.A0F     // Catch:{ IllegalStateException -> 0x06ec }
            java.lang.String r0 = r0.toString()     // Catch:{ IllegalStateException -> 0x06ec }
            r4.append(r0)     // Catch:{ IllegalStateException -> 0x06ec }
            r4.append(r3)     // Catch:{ IllegalStateException -> 0x06ec }
        L_0x056c:
            java.lang.String r0 = "\"first_message_code\":"
            r4.append(r0)     // Catch:{ IllegalStateException -> 0x06ec }
            int r0 = r7.A01     // Catch:{ IllegalStateException -> 0x06ec }
            java.lang.String r0 = java.lang.Integer.toString(r0)     // Catch:{ IllegalStateException -> 0x06ec }
            r4.append(r0)     // Catch:{ IllegalStateException -> 0x06ec }
            r4.append(r3)     // Catch:{ IllegalStateException -> 0x06ec }
            java.lang.String r0 = "\"first_message_str\":\""
            r4.append(r0)     // Catch:{ IllegalStateException -> 0x06ec }
            java.lang.String r0 = r7.A0J     // Catch:{ IllegalStateException -> 0x06ec }
            r4.append(r0)     // Catch:{ IllegalStateException -> 0x06ec }
            r4.append(r2)     // Catch:{ IllegalStateException -> 0x06ec }
            java.lang.String r0 = "\"anr_detector_id\":"
            r4.append(r0)     // Catch:{ IllegalStateException -> 0x06ec }
            int r0 = r7.A00     // Catch:{ IllegalStateException -> 0x06ec }
            java.lang.String r0 = java.lang.Integer.toString(r0)     // Catch:{ IllegalStateException -> 0x06ec }
            r4.append(r0)     // Catch:{ IllegalStateException -> 0x06ec }
            r4.append(r3)     // Catch:{ IllegalStateException -> 0x06ec }
            java.lang.String r0 = "\"device_is_shutting_down\":"
            r4.append(r0)     // Catch:{ IllegalStateException -> 0x06ec }
            boolean r0 = r7.A0R     // Catch:{ IllegalStateException -> 0x06ec }
            java.lang.String r0 = java.lang.Boolean.toString(r0)     // Catch:{ IllegalStateException -> 0x06ec }
            r4.append(r0)     // Catch:{ IllegalStateException -> 0x06ec }
            r4.append(r3)     // Catch:{ IllegalStateException -> 0x06ec }
            java.lang.Throwable r0 = r7.A0Q     // Catch:{ IllegalStateException -> 0x06ec }
            if (r0 == 0) goto L_0x05c8
            java.lang.String r0 = "\"last_throwable\":\""
            r4.append(r0)     // Catch:{ IllegalStateException -> 0x06ec }
            java.lang.Throwable r0 = r7.A0Q     // Catch:{ IllegalStateException -> 0x06ec }
            java.lang.Class r0 = r0.getClass()     // Catch:{ IllegalStateException -> 0x06ec }
            java.lang.String r0 = r0.getName()     // Catch:{ IllegalStateException -> 0x06ec }
            r4.append(r0)     // Catch:{ IllegalStateException -> 0x06ec }
            r4.append(r1)     // Catch:{ IllegalStateException -> 0x06ec }
            r4.append(r3)     // Catch:{ IllegalStateException -> 0x06ec }
        L_0x05c8:
            java.lang.String r0 = "\"available_memory\":"
            r4.append(r0)     // Catch:{ IllegalStateException -> 0x06ec }
            r0 = r33
            long r0 = r0.availMem     // Catch:{ IllegalStateException -> 0x06ec }
            java.lang.String r0 = java.lang.Long.toString(r0)     // Catch:{ IllegalStateException -> 0x06ec }
            r4.append(r0)     // Catch:{ IllegalStateException -> 0x06ec }
            r4.append(r3)     // Catch:{ IllegalStateException -> 0x06ec }
            java.lang.String r0 = "\"lmk_threshold\":"
            r4.append(r0)     // Catch:{ IllegalStateException -> 0x06ec }
            r0 = r33
            long r0 = r0.threshold     // Catch:{ IllegalStateException -> 0x06ec }
            java.lang.String r0 = java.lang.Long.toString(r0)     // Catch:{ IllegalStateException -> 0x06ec }
            r4.append(r0)     // Catch:{ IllegalStateException -> 0x06ec }
            r4.append(r3)     // Catch:{ IllegalStateException -> 0x06ec }
            java.lang.Runtime r2 = java.lang.Runtime.getRuntime()     // Catch:{ IllegalStateException -> 0x06ec }
            java.lang.String r0 = "\"java_runtime_max_memory_bytes\":"
            r4.append(r0)     // Catch:{ IllegalStateException -> 0x06ec }
            long r0 = r2.maxMemory()     // Catch:{ IllegalStateException -> 0x06ec }
            java.lang.String r0 = java.lang.Long.toString(r0)     // Catch:{ IllegalStateException -> 0x06ec }
            r4.append(r0)     // Catch:{ IllegalStateException -> 0x06ec }
            r4.append(r3)     // Catch:{ IllegalStateException -> 0x06ec }
            java.lang.String r0 = "\"java_runtime_total_memory_bytes\":"
            r4.append(r0)     // Catch:{ IllegalStateException -> 0x06ec }
            long r0 = r2.totalMemory()     // Catch:{ IllegalStateException -> 0x06ec }
            java.lang.String r0 = java.lang.Long.toString(r0)     // Catch:{ IllegalStateException -> 0x06ec }
            r4.append(r0)     // Catch:{ IllegalStateException -> 0x06ec }
            r4.append(r3)     // Catch:{ IllegalStateException -> 0x06ec }
            java.lang.String r0 = "\"java_runtime_free_memory_bytes\":"
            r4.append(r0)     // Catch:{ IllegalStateException -> 0x06ec }
            long r0 = r2.freeMemory()     // Catch:{ IllegalStateException -> 0x06ec }
            java.lang.String r0 = java.lang.Long.toString(r0)     // Catch:{ IllegalStateException -> 0x06ec }
            r4.append(r0)     // Catch:{ IllegalStateException -> 0x06ec }
            r4.append(r3)     // Catch:{ IllegalStateException -> 0x06ec }
            java.lang.String r0 = "\"lmk_importance\":"
            r4.append(r0)     // Catch:{ IllegalStateException -> 0x06ec }
            r0 = r32
            int r0 = r0.importance     // Catch:{ IllegalStateException -> 0x06ec }
            java.lang.String r0 = java.lang.Integer.toString(r0)     // Catch:{ IllegalStateException -> 0x06ec }
            r4.append(r0)     // Catch:{ IllegalStateException -> 0x06ec }
            r4.append(r3)     // Catch:{ IllegalStateException -> 0x06ec }
            java.lang.String r0 = "\"lmk_last_trim_level\":"
            r4.append(r0)     // Catch:{ IllegalStateException -> 0x06ec }
            r0 = r32
            int r0 = r0.lastTrimLevel     // Catch:{ IllegalStateException -> 0x06ec }
            java.lang.String r0 = java.lang.Integer.toString(r0)     // Catch:{ IllegalStateException -> 0x06ec }
            r4.append(r0)     // Catch:{ IllegalStateException -> 0x06ec }
            r4.append(r3)     // Catch:{ IllegalStateException -> 0x06ec }
            java.lang.String r0 = "\"future_num_activities\":"
            r4.append(r0)     // Catch:{ IllegalStateException -> 0x06ec }
            int r0 = r7.A02     // Catch:{ IllegalStateException -> 0x06ec }
            java.lang.String r0 = java.lang.Integer.toString(r0)     // Catch:{ IllegalStateException -> 0x06ec }
            r4.append(r0)     // Catch:{ IllegalStateException -> 0x06ec }
            r4.append(r3)     // Catch:{ IllegalStateException -> 0x06ec }
            java.lang.String r0 = "\"cur_uptime\":"
            r4.append(r0)     // Catch:{ IllegalStateException -> 0x06ec }
            java.lang.String r0 = java.lang.Long.toString(r17)     // Catch:{ IllegalStateException -> 0x06ec }
            r4.append(r0)     // Catch:{ IllegalStateException -> 0x06ec }
            X.0Dj r0 = r7.A0E     // Catch:{ IllegalStateException -> 0x06ec }
            java.util.Map r1 = r0.A00     // Catch:{ IllegalStateException -> 0x06ec }
            monitor-enter(r1)     // Catch:{ IllegalStateException -> 0x06ec }
            java.util.Map r0 = r0.A00     // Catch:{ all -> 0x06da }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x06da }
            monitor-exit(r1)     // Catch:{ all -> 0x06da }
            if (r0 != 0) goto L_0x0689
            r4.append(r3)     // Catch:{ IllegalStateException -> 0x06ec }
            java.lang.String r0 = "\"custom_app_data\":"
            r4.append(r0)     // Catch:{ IllegalStateException -> 0x06ec }
            X.0Dj r0 = r7.A0E     // Catch:{ IllegalStateException -> 0x06ec }
            r0.A00(r4)     // Catch:{ IllegalStateException -> 0x06ec }
        L_0x0689:
            int r1 = r7.A03     // Catch:{ IllegalStateException -> 0x06ec }
            if (r1 <= 0) goto L_0x069c
            r4.append(r3)     // Catch:{ IllegalStateException -> 0x06ec }
            java.lang.String r0 = "\"acra_anr_count\":"
            r4.append(r0)     // Catch:{ IllegalStateException -> 0x06ec }
            java.lang.String r0 = java.lang.Integer.toString(r1)     // Catch:{ IllegalStateException -> 0x06ec }
            r4.append(r0)     // Catch:{ IllegalStateException -> 0x06ec }
        L_0x069c:
            if (r30 == 0) goto L_0x06d0
            r4.append(r3)     // Catch:{ IllegalStateException -> 0x06ec }
            java.lang.String r0 = "\"anr_count\":"
            r4.append(r0)     // Catch:{ IllegalStateException -> 0x06ec }
            r0 = r30
            java.lang.Object r0 = r0.first     // Catch:{ IllegalStateException -> 0x06ec }
            java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ IllegalStateException -> 0x06ec }
            long r0 = r0.longValue()     // Catch:{ IllegalStateException -> 0x06ec }
            java.lang.String r0 = java.lang.Long.toString(r0)     // Catch:{ IllegalStateException -> 0x06ec }
            r4.append(r0)     // Catch:{ IllegalStateException -> 0x06ec }
            r4.append(r3)     // Catch:{ IllegalStateException -> 0x06ec }
            java.lang.String r0 = "\"crash_count\":"
            r4.append(r0)     // Catch:{ IllegalStateException -> 0x06ec }
            r0 = r30
            java.lang.Object r0 = r0.second     // Catch:{ IllegalStateException -> 0x06ec }
            java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ IllegalStateException -> 0x06ec }
            long r0 = r0.longValue()     // Catch:{ IllegalStateException -> 0x06ec }
            java.lang.String r0 = java.lang.Long.toString(r0)     // Catch:{ IllegalStateException -> 0x06ec }
            r4.append(r0)     // Catch:{ IllegalStateException -> 0x06ec }
        L_0x06d0:
            java.lang.String r0 = "}"
            r4.append(r0)     // Catch:{ IllegalStateException -> 0x06ec }
            r4.flush()     // Catch:{ IllegalStateException -> 0x06ec }
            goto L_0x06f2
        L_0x06da:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x06da }
            goto L_0x06eb
        L_0x06dd:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ IllegalStateException -> 0x06ec }
            goto L_0x06eb
        L_0x06e0:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x06e3 }
            throw r0     // Catch:{ all -> 0x06e3 }
        L_0x06e3:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ IllegalStateException -> 0x06ec }
            goto L_0x06eb
        L_0x06e6:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x06e6 }
            goto L_0x06eb
        L_0x06e9:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ IllegalStateException -> 0x06ec }
        L_0x06eb:
            throw r0     // Catch:{ IllegalStateException -> 0x06ec }
        L_0x06ec:
            r2 = move-exception
            java.lang.String r1 = "Generating malformed JSON"
            r9.A03(r1, r2)     // Catch:{ all -> 0x07bf }
        L_0x06f2:
            boolean r0 = r6.mIsEnabled     // Catch:{ all -> 0x07bf }
            if (r0 != 0) goto L_0x0704
            X.03L r2 = new X.03L     // Catch:{ all -> 0x07bf }
            r2.<init>()     // Catch:{ all -> 0x07bf }
        L_0x06fb:
            r5.add(r2)     // Catch:{ all -> 0x07bf }
            X.04J r1 = new X.04J     // Catch:{ all -> 0x07bf }
            r1.<init>(r5)     // Catch:{ all -> 0x07bf }
            goto L_0x0761
        L_0x0704:
            if (r0 == 0) goto L_0x070e
            java.lang.Object r2 = r6.mPositionLock     // Catch:{ all -> 0x07bf }
            monitor-enter(r2)     // Catch:{ all -> 0x07bf }
            boolean r0 = r6.mIsContentOutputStreamOpen     // Catch:{ all -> 0x07b6 }
            if (r0 != 0) goto L_0x07ae
            monitor-exit(r2)     // Catch:{ all -> 0x07b6 }
        L_0x070e:
            java.lang.Object r1 = r6.mPositionLock     // Catch:{ all -> 0x07bf }
            monitor-enter(r1)     // Catch:{ all -> 0x07bf }
            r0 = 1
            r6.mIsContentOutputStreamOpen = r0     // Catch:{ all -> 0x07bc }
            monitor-exit(r1)     // Catch:{ all -> 0x07bc }
            boolean r0 = r6.mIsEnabled     // Catch:{ all -> 0x07bf }
            if (r0 == 0) goto L_0x0744
            java.lang.Object r2 = r6.mPositionLock     // Catch:{ all -> 0x07bf }
            monitor-enter(r2)     // Catch:{ all -> 0x07bf }
            boolean r0 = r6.mIsEnabled     // Catch:{ all -> 0x07b9 }
            if (r0 == 0) goto L_0x0727
            java.nio.MappedByteBuffer r1 = r6.mMappedByteBuffer     // Catch:{ all -> 0x07b9 }
            r0 = 20
            r1.position(r0)     // Catch:{ all -> 0x07b9 }
        L_0x0727:
            r1 = 0
        L_0x0728:
            r0 = 4
            if (r1 >= r0) goto L_0x0733
            java.nio.MappedByteBuffer r0 = r6.mMappedByteBuffer     // Catch:{ all -> 0x07b9 }
            r0.put(r11)     // Catch:{ all -> 0x07b9 }
            int r1 = r1 + 1
            goto L_0x0728
        L_0x0733:
            boolean r0 = r6.mIsEnabled     // Catch:{ all -> 0x07b9 }
            if (r0 == 0) goto L_0x073e
            java.nio.MappedByteBuffer r1 = r6.mMappedByteBuffer     // Catch:{ all -> 0x07b9 }
            r0 = 52
            r1.position(r0)     // Catch:{ all -> 0x07b9 }
        L_0x073e:
            java.nio.MappedByteBuffer r0 = r6.mMappedByteBuffer     // Catch:{ all -> 0x07b9 }
            r0.put(r11)     // Catch:{ all -> 0x07b9 }
            monitor-exit(r2)     // Catch:{ all -> 0x07b9 }
        L_0x0744:
            boolean r0 = r6.mIsEnabled     // Catch:{ all -> 0x07bf }
            if (r0 == 0) goto L_0x074f
            java.nio.MappedByteBuffer r1 = r6.mMappedByteBuffer     // Catch:{ all -> 0x07bf }
            r0 = 52
            r1.position(r0)     // Catch:{ all -> 0x07bf }
        L_0x074f:
            java.security.MessageDigest r0 = r6.mDigest     // Catch:{ all -> 0x07bf }
            r0.reset()     // Catch:{ all -> 0x07bf }
            X.03K r1 = new X.03K     // Catch:{ all -> 0x07bf }
            r1.<init>(r6)     // Catch:{ all -> 0x07bf }
            java.security.DigestOutputStream r2 = new java.security.DigestOutputStream     // Catch:{ all -> 0x07bf }
            java.security.MessageDigest r0 = r6.mDigest     // Catch:{ all -> 0x07bf }
            r2.<init>(r1, r0)     // Catch:{ all -> 0x07bf }
            goto L_0x06fb
        L_0x0761:
            r13.writeTo(r1)     // Catch:{ all -> 0x07a7 }
            r1.flush()     // Catch:{ all -> 0x07a7 }
            r1.close()     // Catch:{ all -> 0x07bf }
            r13.close()     // Catch:{ IOException | JSONException -> 0x07c6 }
            r3 = 32
            boolean r0 = r6.mIsEnabled     // Catch:{ IOException | JSONException -> 0x07c6 }
            if (r0 == 0) goto L_0x077b
            java.nio.MappedByteBuffer r2 = r6.mMappedByteBuffer     // Catch:{ IOException | JSONException -> 0x07c6 }
            r1 = 15
            byte r0 = (byte) r3     // Catch:{ IOException | JSONException -> 0x07c6 }
            r2.put(r1, r0)     // Catch:{ IOException | JSONException -> 0x07c6 }
        L_0x077b:
            java.lang.Object r2 = r9.A0Y     // Catch:{ IOException | JSONException -> 0x07c6 }
            monitor-enter(r2)     // Catch:{ IOException | JSONException -> 0x07c6 }
            java.lang.Object r1 = r9.A0Y     // Catch:{ all -> 0x07a4 }
            monitor-enter(r1)     // Catch:{ all -> 0x07a4 }
            boolean r0 = r9.A0J     // Catch:{ all -> 0x07a1 }
            if (r0 == 0) goto L_0x078c
            r9.A0J = r11     // Catch:{ all -> 0x07a1 }
            java.lang.Object r0 = r9.A0Y     // Catch:{ all -> 0x07a1 }
            r0.notify()     // Catch:{ all -> 0x07a1 }
        L_0x078c:
            monitor-exit(r1)     // Catch:{ all -> 0x07a1 }
            monitor-exit(r2)     // Catch:{ all -> 0x07a4 }
            java.lang.Object r1 = r9.A0Z     // Catch:{ IOException | JSONException -> 0x07c6 }
            monitor-enter(r1)     // Catch:{ IOException | JSONException -> 0x07c6 }
            java.lang.Runnable r0 = r9.A0C     // Catch:{ all -> 0x079e }
            if (r0 == 0) goto L_0x079c
            r0.run()     // Catch:{ all -> 0x079e }
            r0 = r25
            r9.A0C = r0     // Catch:{ all -> 0x079e }
        L_0x079c:
            monitor-exit(r1)     // Catch:{ all -> 0x079e }
            goto L_0x07cc
        L_0x079e:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x079e }
            goto L_0x07a6
        L_0x07a1:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x07a1 }
            throw r0     // Catch:{ all -> 0x07a4 }
        L_0x07a4:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x07a4 }
        L_0x07a6:
            throw r0     // Catch:{ IOException | JSONException -> 0x07c6 }
        L_0x07a7:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x07a9 }
        L_0x07a9:
            r0 = move-exception
            r1.close()     // Catch:{ all -> 0x07ad }
        L_0x07ad:
            throw r0     // Catch:{ all -> 0x07bf }
        L_0x07ae:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x07b6 }
            java.lang.String r0 = "Cannot modify log file while content output stream is open"
            r1.<init>(r0)     // Catch:{ all -> 0x07b6 }
            throw r1     // Catch:{ all -> 0x07b6 }
        L_0x07b6:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x07b6 }
            goto L_0x07be
        L_0x07b9:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x07b9 }
            goto L_0x07be
        L_0x07bc:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x07bc }
        L_0x07be:
            throw r0     // Catch:{ all -> 0x07bf }
        L_0x07bf:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x07c1 }
        L_0x07c1:
            r0 = move-exception
            r13.close()     // Catch:{ all -> 0x07c5 }
        L_0x07c5:
            throw r0     // Catch:{ IOException | JSONException -> 0x07c6 }
        L_0x07c6:
            r1 = move-exception
            java.lang.String r0 = "Error dumping app state to log file"
            r9.A03(r0, r1)     // Catch:{ all -> 0x0913 }
        L_0x07cc:
            X.04F r1 = r9.A08     // Catch:{ all -> 0x0913 }
            X.04F r0 = p000X.AnonymousClass04F.NO_STATUS     // Catch:{ all -> 0x0913 }
            if (r1 == r0) goto L_0x07d4
            goto L_0x08e7
        L_0x07d4:
            long r12 = android.os.SystemClock.uptimeMillis()     // Catch:{ all -> 0x0913 }
            X.043 r1 = r9.A0U     // Catch:{ all -> 0x0918 }
            android.content.Context r0 = r9.A0O     // Catch:{ all -> 0x0918 }
            boolean r0 = r1.A0O(r0)     // Catch:{ all -> 0x0918 }
            if (r0 == 0) goto L_0x07f5
            long r5 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0918 }
            long r3 = r5 - r21
            r1 = 1000(0x3e8, double:4.94E-321)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x07f5
            android.content.Context r0 = r9.A0O     // Catch:{ all -> 0x0918 }
            p000X.AnonymousClass0FK.A00(r0)     // Catch:{ all -> 0x0918 }
            r21 = r5
        L_0x07f5:
            if (r23 == 0) goto L_0x013b
            boolean r0 = r9.A0N     // Catch:{ all -> 0x0918 }
            if (r0 == 0) goto L_0x07fd
            if (r24 == 0) goto L_0x013b
        L_0x07fd:
            java.lang.String r5 = "Error reading /proc/self/maps"
            java.lang.String r4 = "AppStateLoggerThread"
            java.lang.String r0 = "/proc/self/maps"
            java.io.BufferedReader r6 = new java.io.BufferedReader     // Catch:{ FileNotFoundException | IOException -> 0x08ce }
            java.io.FileReader r1 = new java.io.FileReader     // Catch:{ FileNotFoundException | IOException -> 0x08ce }
            r1.<init>(r0)     // Catch:{ FileNotFoundException | IOException -> 0x08ce }
            r0 = 128(0x80, float:1.794E-43)
            r6.<init>(r1, r0)     // Catch:{ FileNotFoundException | IOException -> 0x08ce }
        L_0x080f:
            java.lang.String r2 = r6.readLine()     // Catch:{ all -> 0x08c7 }
            if (r2 == 0) goto L_0x0855
            java.lang.String r0 = ".so"
            boolean r0 = r2.endsWith(r0)     // Catch:{ all -> 0x08c7 }
            if (r0 == 0) goto L_0x080f
            r0 = 47
            int r1 = r2.indexOf(r0)     // Catch:{ all -> 0x08c7 }
            r0 = -1
            if (r1 == r0) goto L_0x080f
            java.lang.String r10 = r2.substring(r1)     // Catch:{ all -> 0x08c7 }
            java.util.Map r0 = r9.A0c     // Catch:{ all -> 0x08c7 }
            boolean r0 = r0.containsKey(r10)     // Catch:{ all -> 0x08c7 }
            if (r0 != 0) goto L_0x080f
            java.io.File r0 = new java.io.File     // Catch:{ all -> 0x08c7 }
            r0.<init>(r10)     // Catch:{ all -> 0x08c7 }
            X.045 r7 = new X.045     // Catch:{ all -> 0x08c7 }
            long r2 = r0.lastModified()     // Catch:{ all -> 0x08c7 }
            long r0 = r0.length()     // Catch:{ all -> 0x08c7 }
            r7.<init>(r2, r0)     // Catch:{ all -> 0x08c7 }
            java.util.Map r0 = r9.A0c     // Catch:{ all -> 0x08c7 }
            r0.put(r10, r7)     // Catch:{ all -> 0x08c7 }
            java.lang.String r0 = "com.facebook."
            boolean r0 = r10.contains(r0)     // Catch:{ all -> 0x08c7 }
            if (r0 == 0) goto L_0x080f
            r0 = 1
            r9.A0N = r0     // Catch:{ all -> 0x08c7 }
            goto L_0x080f
        L_0x0855:
            r6.close()     // Catch:{ FileNotFoundException | IOException -> 0x08ce }
            java.io.OutputStreamWriter r3 = new java.io.OutputStreamWriter     // Catch:{ IOException -> 0x08bf }
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x08bf }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x08bf }
            r1.<init>()     // Catch:{ IOException -> 0x08bf }
            java.io.File r0 = r9.A0X     // Catch:{ IOException -> 0x08bf }
            r1.append(r0)     // Catch:{ IOException -> 0x08bf }
            java.lang.String r0 = "_lib"
            r1.append(r0)     // Catch:{ IOException -> 0x08bf }
            java.lang.String r0 = r1.toString()     // Catch:{ IOException -> 0x08bf }
            r2.<init>(r0)     // Catch:{ IOException -> 0x08bf }
            java.lang.String r0 = "ISO-8859-1"
            r3.<init>(r2, r0)     // Catch:{ IOException -> 0x08bf }
            java.util.Map r0 = r9.A0c     // Catch:{ all -> 0x08b8 }
            java.util.Set r0 = r0.entrySet()     // Catch:{ all -> 0x08b8 }
            java.util.Iterator r10 = r0.iterator()     // Catch:{ all -> 0x08b8 }
        L_0x0881:
            boolean r0 = r10.hasNext()     // Catch:{ all -> 0x08b8 }
            if (r0 == 0) goto L_0x08b3
            java.lang.Object r7 = r10.next()     // Catch:{ all -> 0x08b8 }
            java.util.Map$Entry r7 = (java.util.Map.Entry) r7     // Catch:{ all -> 0x08b8 }
            java.lang.String r6 = "%s %d %d\n"
            java.lang.Object r5 = r7.getKey()     // Catch:{ all -> 0x08b8 }
            java.lang.Object r0 = r7.getValue()     // Catch:{ all -> 0x08b8 }
            X.045 r0 = (p000X.AnonymousClass045) r0     // Catch:{ all -> 0x08b8 }
            long r0 = r0.A01     // Catch:{ all -> 0x08b8 }
            java.lang.Long r2 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x08b8 }
            java.lang.Object r0 = r7.getValue()     // Catch:{ all -> 0x08b8 }
            X.045 r0 = (p000X.AnonymousClass045) r0     // Catch:{ all -> 0x08b8 }
            long r0 = r0.A00     // Catch:{ all -> 0x08b8 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x08b8 }
            java.lang.String r0 = com.facebook.common.stringformat.StringFormatUtil.formatStrLocaleSafe(r6, r5, r2, r0)     // Catch:{ all -> 0x08b8 }
            r3.write(r0)     // Catch:{ all -> 0x08b8 }
            goto L_0x0881
        L_0x08b3:
            r3.close()     // Catch:{ IOException -> 0x08bf }
            goto L_0x013b
        L_0x08b8:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x08ba }
        L_0x08ba:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x08be }
        L_0x08be:
            throw r0     // Catch:{ IOException -> 0x08bf }
        L_0x08bf:
            r1 = move-exception
            java.lang.String r0 = "Error writing native library file"
            p000X.AnonymousClass0DB.A0G(r4, r0, r1)     // Catch:{ all -> 0x0918 }
            goto L_0x013b
        L_0x08c7:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x08c9 }
        L_0x08c9:
            r0 = move-exception
            r6.close()     // Catch:{ all -> 0x08cd }
        L_0x08cd:
            throw r0     // Catch:{ FileNotFoundException | IOException -> 0x08ce }
        L_0x08ce:
            r0 = move-exception
            p000X.AnonymousClass0DB.A0G(r4, r5, r0)     // Catch:{ all -> 0x0918 }
            goto L_0x013b
        L_0x08d4:
            r1 = move-exception
            java.lang.String r0 = "Interrupted while sleeping"
            r9.A03(r0, r1)     // Catch:{ all -> 0x0915 }
            monitor-exit(r3)     // Catch:{ all -> 0x0915 }
            return
        L_0x08dc:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ InterruptedException -> 0x08df }
            throw r0     // Catch:{ InterruptedException -> 0x08df }
        L_0x08df:
            r1 = move-exception
            java.lang.String r0 = "Interrupted while waiting for updated app state"
            r9.A03(r0, r1)     // Catch:{ all -> 0x0910 }
            monitor-exit(r9)     // Catch:{ all -> 0x0910 }
            return
        L_0x08e7:
            if (r1 == r0) goto L_0x0937
            X.043 r1 = r9.A0U     // Catch:{ all -> 0x0918 }
            android.content.Context r0 = r9.A0O     // Catch:{ all -> 0x0918 }
            boolean r0 = r1.A0P(r0)     // Catch:{ all -> 0x0918 }
            if (r0 == 0) goto L_0x0905
            com.facebook.analytics.appstatelogger.AppStateLogFile r2 = r9.A07     // Catch:{ all -> 0x0918 }
            X.04F r0 = r9.A08     // Catch:{ all -> 0x0918 }
            java.lang.Object r1 = r2.mStatusLock     // Catch:{ all -> 0x0918 }
            monitor-enter(r1)     // Catch:{ all -> 0x0918 }
            r2.updateStatus(r0)     // Catch:{ all -> 0x0902 }
            r0 = 1
            r2.mNoMoreChangesToStatusByte = r0     // Catch:{ all -> 0x0902 }
            monitor-exit(r1)     // Catch:{ all -> 0x0902 }
            return
        L_0x0902:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0902 }
            goto L_0x0917
        L_0x0905:
            com.facebook.analytics.appstatelogger.AppStateLogFile r1 = r9.A07     // Catch:{ all -> 0x0918 }
            X.04F r0 = r9.A08     // Catch:{ all -> 0x0918 }
            r1.updateStatus(r0)     // Catch:{ all -> 0x0918 }
            return
        L_0x090d:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0910 }
            throw r0     // Catch:{ all -> 0x0910 }
        L_0x0910:
            r0 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x0910 }
            throw r0     // Catch:{ all -> 0x0913 }
        L_0x0913:
            r0 = move-exception
            goto L_0x0917
        L_0x0915:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0915 }
        L_0x0917:
            throw r0     // Catch:{ all -> 0x0918 }
        L_0x0918:
            r2 = move-exception
            boolean r0 = r9.A0I     // Catch:{ all -> 0x0931 }
            if (r0 == 0) goto L_0x092d
            com.facebook.analytics.appstatelogger.AppStateLogFile r1 = r9.A07     // Catch:{ all -> 0x0931 }
            if (r1 == 0) goto L_0x092d
            X.04F r0 = p000X.AnonymousClass04F.APPSTATELOGGER_CRASH     // Catch:{ Exception -> 0x0927 }
            r1.updateStatus(r0)     // Catch:{ Exception -> 0x0927 }
            goto L_0x092d
        L_0x0927:
            r1 = move-exception
            java.lang.String r0 = "Error while trying to update status"
            r9.A03(r0, r1)     // Catch:{ all -> 0x0931 }
        L_0x092d:
            throw r2     // Catch:{ all -> 0x0931 }
        L_0x092e:
            r0 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x092e }
            throw r0     // Catch:{ all -> 0x0931 }
        L_0x0931:
            r1 = move-exception
            java.lang.String r0 = "Unhandled exception in AppStateLoggerThread.run"
            r9.A03(r0, r1)
        L_0x0937:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000X.C026403i.run():void");
    }
}
