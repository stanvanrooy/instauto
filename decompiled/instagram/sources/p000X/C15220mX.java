package p000X;

import android.os.Looper;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.0mX  reason: invalid class name and case insensitive filesystem */
public final class C15220mX implements C15230mY {
    public static final File A0F = new File("/dev/null");
    public static final ThreadPoolExecutor A0G = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue());
    public static final Pattern A0H = Pattern.compile("[a-z0-9_-]{1,120}");
    public int A00;
    public long A01;
    public AnonymousClass18J A02;
    public C35501gT A03;
    public int A04;
    public int A05;
    public final File A06;
    public final Object A07 = new Object();
    public final Object A08 = new Object();
    public final LinkedHashMap A09;
    public final List A0A;
    public final AtomicLong A0B = new AtomicLong();
    public final boolean A0C;
    public final C15250ma A0D;
    public final Runnable A0E = new C15240mZ(this);

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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public C15220mX(java.io.File r18, long r19, int r21, p000X.AnonymousClass0OT r22, p000X.AnonymousClass18J r23) {
        /*
            r17 = this;
            r5 = 1
            r4 = r17
            r4.<init>()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r4.A07 = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r4.A08 = r0
            java.util.concurrent.atomic.AtomicLong r0 = new java.util.concurrent.atomic.AtomicLong
            r0.<init>()
            r4.A0B = r0
            X.0mZ r0 = new X.0mZ
            r0.<init>(r4)
            r4.A0E = r0
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            java.lang.Thread r1 = r0.getThread()
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            if (r1 == r0) goto L_0x027b
            r0 = r18
            r4.A06 = r0
            r3 = r21
            r4.A00 = r3
            r0 = r19
            r4.A01 = r0
            r4.A0C = r5
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            r4.A0A = r0
            java.util.concurrent.atomic.AtomicLong r2 = r4.A0B
            r0 = 0
            r2.set(r0)
            r13 = 0
            r4.A05 = r13
            r4.A04 = r13
            X.0ma r1 = new X.0ma
            java.io.File r0 = r4.A06
            r2 = r22
            r1.<init>(r0, r4, r2, r3)
            r4.A0D = r1
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r0 = 1061158912(0x3f400000, float:0.75)
            r1.<init>(r13, r0, r5)
            r4.A09 = r1
            r3 = r23
            r4.A02 = r3
            if (r23 == 0) goto L_0x0137
            int r0 = r4.A00
            int r0 = r0 * 5
            int r2 = r0 / 100
            java.lang.Object r1 = r3.A02
            monitor-enter(r1)
            X.18L r0 = r3.A00     // Catch:{ all -> 0x0134 }
            int r0 = r0.A00     // Catch:{ all -> 0x0134 }
            monitor-exit(r1)     // Catch:{ all -> 0x0134 }
            if (r0 <= r2) goto L_0x008d
            X.18J r0 = r4.A02
            java.lang.Object r1 = r0.A02
            monitor-enter(r1)
            X.18L r0 = r0.A00     // Catch:{ all -> 0x0089 }
            r0.A00 = r2     // Catch:{ all -> 0x0089 }
            p000X.AnonymousClass18L.A00(r0)     // Catch:{ all -> 0x0089 }
            monitor-exit(r1)     // Catch:{ all -> 0x0089 }
            goto L_0x008d
        L_0x0089:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0089 }
            goto L_0x0136
        L_0x008d:
            long r2 = r4.A01
            r0 = 5
            long r2 = r2 * r0
            r0 = 100
            long r2 = r2 / r0
            X.18J r0 = r4.A02
            java.lang.Object r1 = r0.A02
            monitor-enter(r1)
            X.18L r0 = r0.A00     // Catch:{ all -> 0x0131 }
            r0.A01 = r2     // Catch:{ all -> 0x0131 }
            p000X.AnonymousClass18L.A00(r0)     // Catch:{ all -> 0x0131 }
            monitor-exit(r1)     // Catch:{ all -> 0x0131 }
            X.18J r0 = r4.A02
            java.lang.Object r6 = r0.A02
            monitor-enter(r6)
            X.18M r12 = r0.A01     // Catch:{ all -> 0x012e }
            java.io.File r2 = new java.io.File     // Catch:{ all -> 0x012e }
            java.io.File r1 = r12.A01     // Catch:{ all -> 0x012e }
            java.lang.String r0 = "blocker_journal"
            r2.<init>(r1, r0)     // Catch:{ all -> 0x012e }
            boolean r0 = r2.exists()     // Catch:{ all -> 0x012e }
            if (r0 == 0) goto L_0x012c
            java.io.BufferedReader r10 = new java.io.BufferedReader     // Catch:{ IOException | IndexOutOfBoundsException | NumberFormatException -> 0x0124 }
            java.io.FileReader r0 = new java.io.FileReader     // Catch:{ IOException | IndexOutOfBoundsException | NumberFormatException -> 0x0124 }
            r0.<init>(r2)     // Catch:{ IOException | IndexOutOfBoundsException | NumberFormatException -> 0x0124 }
            r10.<init>(r0)     // Catch:{ IOException | IndexOutOfBoundsException | NumberFormatException -> 0x0124 }
        L_0x00c2:
            java.lang.String r1 = r10.readLine()     // Catch:{ all -> 0x011d }
            if (r1 == 0) goto L_0x0119
            java.lang.String r0 = " "
            java.lang.String[] r7 = r1.split(r0)     // Catch:{ all -> 0x011d }
            int r1 = r7.length     // Catch:{ all -> 0x011d }
            r0 = 3
            if (r1 != r0) goto L_0x00c2
            r14 = r7[r13]     // Catch:{ all -> 0x011d }
            r0 = r7[r5]     // Catch:{ all -> 0x011d }
            long r2 = java.lang.Long.parseLong(r0)     // Catch:{ all -> 0x011d }
            r0 = 2
            r0 = r7[r0]     // Catch:{ all -> 0x011d }
            long r0 = java.lang.Long.parseLong(r0)     // Catch:{ all -> 0x011d }
            X.18J r7 = r12.A00     // Catch:{ all -> 0x011d }
            java.lang.Object r9 = r7.A02     // Catch:{ all -> 0x011d }
            monitor-enter(r9)     // Catch:{ all -> 0x011d }
            X.18L r7 = r7.A00     // Catch:{ all -> 0x0116 }
            java.util.HashMap r7 = r7.A03     // Catch:{ all -> 0x0116 }
            java.lang.Object r7 = r7.get(r14)     // Catch:{ all -> 0x0116 }
            X.1kj r7 = (p000X.C38101kj) r7     // Catch:{ all -> 0x0116 }
            monitor-exit(r9)     // Catch:{ all -> 0x0116 }
            if (r7 != 0) goto L_0x010d
            X.18J r8 = r12.A00     // Catch:{ all -> 0x011d }
            boolean r7 = r8 instanceof p000X.AnonymousClass18I     // Catch:{ all -> 0x011d }
            if (r7 == 0) goto L_0x010a
            X.18I r8 = (p000X.AnonymousClass18I) r8     // Catch:{ all -> 0x011d }
            java.lang.Object r11 = r8.A02     // Catch:{ all -> 0x011d }
            monitor-enter(r11)     // Catch:{ all -> 0x011d }
            X.18L r9 = r8.A00     // Catch:{ all -> 0x0113 }
            X.1kj r8 = new X.1kj     // Catch:{ all -> 0x0113 }
            r8.<init>(r14, r0)     // Catch:{ all -> 0x0113 }
            r9.A01(r14, r8)     // Catch:{ all -> 0x0113 }
            monitor-exit(r11)     // Catch:{ all -> 0x0113 }
            goto L_0x010d
        L_0x010a:
            r8.A00(r14)     // Catch:{ all -> 0x011d }
        L_0x010d:
            X.18J r0 = r12.A00     // Catch:{ all -> 0x011d }
            r0.A01(r14, r2)     // Catch:{ all -> 0x011d }
            goto L_0x00c2
        L_0x0113:
            r0 = move-exception
            monitor-exit(r11)     // Catch:{ all -> 0x0113 }
            goto L_0x0118
        L_0x0116:
            r0 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x0116 }
        L_0x0118:
            throw r0     // Catch:{ all -> 0x011d }
        L_0x0119:
            r10.close()     // Catch:{ IOException | IndexOutOfBoundsException | NumberFormatException -> 0x0124 }
            goto L_0x012c
        L_0x011d:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x011f }
        L_0x011f:
            r0 = move-exception
            r10.close()     // Catch:{ all -> 0x0123 }
        L_0x0123:
            throw r0     // Catch:{ IOException | IndexOutOfBoundsException | NumberFormatException -> 0x0124 }
        L_0x0124:
            r2 = move-exception
            java.lang.String r1 = "BlockerJournal"
            java.lang.String r0 = "Journal corrupted or IOException while reading journal"
            p000X.AnonymousClass0QD.A05(r1, r0, r2)     // Catch:{ all -> 0x012e }
        L_0x012c:
            monitor-exit(r6)     // Catch:{ all -> 0x012e }
            goto L_0x0137
        L_0x012e:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x012e }
            goto L_0x0136
        L_0x0131:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0131 }
            goto L_0x0136
        L_0x0134:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0134 }
        L_0x0136:
            throw r0
        L_0x0137:
            X.0ma r9 = r4.A0D
            java.io.File r3 = r9.A05
            java.io.File r2 = new java.io.File
            java.lang.String r0 = "journal.bkp"
            r2.<init>(r3, r0)
            boolean r0 = r2.exists()
            if (r0 == 0) goto L_0x0158
            java.io.File r1 = new java.io.File
            java.lang.String r0 = "journal"
            r1.<init>(r3, r0)
            boolean r0 = r1.exists()
            if (r0 == 0) goto L_0x0170
            r2.delete()
        L_0x0158:
            java.io.File r2 = new java.io.File
            java.io.File r1 = r9.A05
            java.lang.String r0 = "journal"
            r2.<init>(r1, r0)
            boolean r0 = r2.exists()
            r6 = 0
            r16 = 1
            if (r0 == 0) goto L_0x0240
            java.util.LinkedHashMap r8 = new java.util.LinkedHashMap
            r8.<init>()
            goto L_0x0174
        L_0x0170:
            r2.renameTo(r1)
            goto L_0x0158
        L_0x0174:
            java.io.BufferedReader r7 = new java.io.BufferedReader     // Catch:{ IOException | IndexOutOfBoundsException | NumberFormatException -> 0x023a, all -> 0x0230 }
            java.io.FileReader r0 = new java.io.FileReader     // Catch:{ IOException | IndexOutOfBoundsException | NumberFormatException -> 0x023a, all -> 0x0230 }
            r0.<init>(r2)     // Catch:{ IOException | IndexOutOfBoundsException | NumberFormatException -> 0x023a, all -> 0x0230 }
            r7.<init>(r0)     // Catch:{ IOException | IndexOutOfBoundsException | NumberFormatException -> 0x023a, all -> 0x0230 }
            java.util.HashSet r2 = new java.util.HashSet     // Catch:{ IOException | IndexOutOfBoundsException | NumberFormatException -> 0x023b, all -> 0x0233 }
            r2.<init>()     // Catch:{ IOException | IndexOutOfBoundsException | NumberFormatException -> 0x023b, all -> 0x0233 }
        L_0x0183:
            java.lang.String r1 = r7.readLine()     // Catch:{ IOException | IndexOutOfBoundsException | NumberFormatException -> 0x023b, all -> 0x0233 }
            r3 = 0
            if (r1 == 0) goto L_0x01e3
            java.lang.String r0 = " "
            java.lang.String[] r12 = r1.split(r0)     // Catch:{ IOException | IndexOutOfBoundsException | NumberFormatException -> 0x023b, all -> 0x0233 }
            r11 = r12[r3]     // Catch:{ IOException | IndexOutOfBoundsException | NumberFormatException -> 0x023b, all -> 0x0233 }
            r10 = r12[r5]     // Catch:{ IOException | IndexOutOfBoundsException | NumberFormatException -> 0x023b, all -> 0x0233 }
            java.lang.String r0 = "CLEAN"
            boolean r0 = r0.equals(r11)     // Catch:{ IOException | IndexOutOfBoundsException | NumberFormatException -> 0x023b, all -> 0x0233 }
            r1 = 2
            if (r0 == 0) goto L_0x01c2
            int r15 = r12.length     // Catch:{ IOException | IndexOutOfBoundsException | NumberFormatException -> 0x023b, all -> 0x0233 }
            r14 = 3
            if (r15 < r14) goto L_0x01c2
            r13 = 4
            if (r15 > r13) goto L_0x01c2
            java.lang.Object r11 = r8.get(r10)     // Catch:{ IOException | IndexOutOfBoundsException | NumberFormatException -> 0x023b, all -> 0x0233 }
            X.0mc r11 = (p000X.C15270mc) r11     // Catch:{ IOException | IndexOutOfBoundsException | NumberFormatException -> 0x023b, all -> 0x0233 }
            if (r11 != 0) goto L_0x01b6
            X.0mc r11 = new X.0mc     // Catch:{ IOException | IndexOutOfBoundsException | NumberFormatException -> 0x023b, all -> 0x0233 }
            java.io.File r0 = r9.A05     // Catch:{ IOException | IndexOutOfBoundsException | NumberFormatException -> 0x023b, all -> 0x0233 }
            r11.<init>(r0, r10)     // Catch:{ IOException | IndexOutOfBoundsException | NumberFormatException -> 0x023b, all -> 0x0233 }
            r8.put(r10, r11)     // Catch:{ IOException | IndexOutOfBoundsException | NumberFormatException -> 0x023b, all -> 0x0233 }
        L_0x01b6:
            if (r15 < r13) goto L_0x01d1
            r0 = r12[r14]     // Catch:{ IOException | IndexOutOfBoundsException | NumberFormatException -> 0x023b, all -> 0x0233 }
            boolean r0 = java.lang.Boolean.parseBoolean(r0)     // Catch:{ IOException | IndexOutOfBoundsException | NumberFormatException -> 0x023b, all -> 0x0233 }
            if (r0 == 0) goto L_0x01d1
            r3 = 1
            goto L_0x01d1
        L_0x01c2:
            java.lang.String r0 = "DIRTY"
            boolean r0 = r0.equals(r11)     // Catch:{ IOException | IndexOutOfBoundsException | NumberFormatException -> 0x023b, all -> 0x0233 }
            if (r0 == 0) goto L_0x01e5
            int r0 = r12.length     // Catch:{ IOException | IndexOutOfBoundsException | NumberFormatException -> 0x023b, all -> 0x0233 }
            if (r0 != r1) goto L_0x01e5
            r2.add(r10)     // Catch:{ IOException | IndexOutOfBoundsException | NumberFormatException -> 0x023b, all -> 0x0233 }
            goto L_0x01dd
        L_0x01d1:
            r0 = r12[r1]     // Catch:{ IOException | IndexOutOfBoundsException | NumberFormatException -> 0x023b, all -> 0x0233 }
            long r0 = java.lang.Long.parseLong(r0)     // Catch:{ IOException | IndexOutOfBoundsException | NumberFormatException -> 0x023b, all -> 0x0233 }
            r11.A04(r0, r3)     // Catch:{ IOException | IndexOutOfBoundsException | NumberFormatException -> 0x023b, all -> 0x0233 }
            r2.remove(r10)     // Catch:{ IOException | IndexOutOfBoundsException | NumberFormatException -> 0x023b, all -> 0x0233 }
        L_0x01dd:
            int r0 = r9.A00     // Catch:{ IOException | IndexOutOfBoundsException | NumberFormatException -> 0x023b, all -> 0x0233 }
            int r0 = r0 + r5
            r9.A00 = r0     // Catch:{ IOException | IndexOutOfBoundsException | NumberFormatException -> 0x023b, all -> 0x0233 }
            goto L_0x0183
        L_0x01e3:
            r0 = 0
            goto L_0x01e6
        L_0x01e5:
            r0 = 1
        L_0x01e6:
            if (r0 != 0) goto L_0x023b
            java.io.File r0 = r9.A05     // Catch:{ IOException | IndexOutOfBoundsException | NumberFormatException -> 0x023b, all -> 0x0233 }
            p000X.C15250ma.A01(r0, r3)     // Catch:{ IOException | IndexOutOfBoundsException | NumberFormatException -> 0x023b, all -> 0x0233 }
            X.0mX r0 = r9.A03     // Catch:{ IOException | IndexOutOfBoundsException | NumberFormatException -> 0x023b, all -> 0x0233 }
            boolean r0 = r0.A0C     // Catch:{ IOException | IndexOutOfBoundsException | NumberFormatException -> 0x023b, all -> 0x0233 }
            if (r0 != 0) goto L_0x0229
            java.util.Iterator r5 = r2.iterator()     // Catch:{ IOException | IndexOutOfBoundsException | NumberFormatException -> 0x023b, all -> 0x0233 }
        L_0x01f7:
            boolean r0 = r5.hasNext()     // Catch:{ IOException | IndexOutOfBoundsException | NumberFormatException -> 0x023b, all -> 0x0233 }
            if (r0 == 0) goto L_0x0229
            java.lang.Object r3 = r5.next()     // Catch:{ IOException | IndexOutOfBoundsException | NumberFormatException -> 0x023b, all -> 0x0233 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ IOException | IndexOutOfBoundsException | NumberFormatException -> 0x023b, all -> 0x0233 }
            java.lang.Object r2 = r8.get(r3)     // Catch:{ IOException | IndexOutOfBoundsException | NumberFormatException -> 0x023b, all -> 0x0233 }
            X.0mc r2 = (p000X.C15270mc) r2     // Catch:{ IOException | IndexOutOfBoundsException | NumberFormatException -> 0x023b, all -> 0x0233 }
            if (r2 == 0) goto L_0x0225
            java.io.File r1 = r2.A02()     // Catch:{ IOException | IndexOutOfBoundsException | NumberFormatException -> 0x023b, all -> 0x0233 }
            boolean r0 = r1.exists()     // Catch:{ IOException | IndexOutOfBoundsException | NumberFormatException -> 0x023b, all -> 0x0233 }
            if (r0 == 0) goto L_0x0218
            r1.delete()     // Catch:{ IOException | IndexOutOfBoundsException | NumberFormatException -> 0x023b, all -> 0x0233 }
        L_0x0218:
            java.io.File r1 = r2.A03()     // Catch:{ IOException | IndexOutOfBoundsException | NumberFormatException -> 0x023b, all -> 0x0233 }
            boolean r0 = r1.exists()     // Catch:{ IOException | IndexOutOfBoundsException | NumberFormatException -> 0x023b, all -> 0x0233 }
            if (r0 == 0) goto L_0x0225
            r1.delete()     // Catch:{ IOException | IndexOutOfBoundsException | NumberFormatException -> 0x023b, all -> 0x0233 }
        L_0x0225:
            r8.remove(r3)     // Catch:{ IOException | IndexOutOfBoundsException | NumberFormatException -> 0x023b, all -> 0x0233 }
            goto L_0x01f7
        L_0x0229:
            p000X.C15250ma.A00(r9)     // Catch:{ IOException | IndexOutOfBoundsException | NumberFormatException -> 0x023b, all -> 0x0233 }
            r7.close()     // Catch:{ IOException -> 0x0248 }
            goto L_0x0248
        L_0x0230:
            r0 = move-exception
            r7 = r6
            goto L_0x0234
        L_0x0233:
            r0 = move-exception
        L_0x0234:
            if (r7 == 0) goto L_0x0239
            r7.close()     // Catch:{ IOException -> 0x0239 }
        L_0x0239:
            throw r0
        L_0x023a:
            r7 = r6
        L_0x023b:
            if (r7 == 0) goto L_0x0240
            r7.close()     // Catch:{ IOException -> 0x0240 }
        L_0x0240:
            java.io.File r1 = r9.A05
            r0 = r16
            p000X.C15250ma.A01(r1, r0)
            goto L_0x0249
        L_0x0248:
            r6 = r8
        L_0x0249:
            if (r6 != 0) goto L_0x0256
            java.io.File r0 = r4.A06
            r0.mkdirs()
            X.0ma r0 = r4.A0D
            r0.A02()
        L_0x0255:
            return
        L_0x0256:
            java.util.LinkedHashMap r0 = r4.A09
            r0.putAll(r6)
            java.util.LinkedHashMap r0 = r4.A09
            java.util.Collection r0 = r0.values()
            java.util.Iterator r3 = r0.iterator()
        L_0x0265:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0255
            java.lang.Object r0 = r3.next()
            X.0mc r0 = (p000X.C15270mc) r0
            java.util.concurrent.atomic.AtomicLong r2 = r4.A0B
            long r0 = r0.A00()
            r2.getAndAdd(r0)
            goto L_0x0265
        L_0x027b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "This operation can't be run on UI thread."
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p000X.C15220mX.<init>(java.io.File, long, int, X.0OT, X.18J):void");
    }

    public final AnonymousClass1FY ACn(String str) {
        return A01(str, (C56252cB) null, false);
    }

    private AnonymousClass1FY A00(C15270mc r3) {
        if (r3 == null || !r3.A08()) {
            this.A05++;
            return new AnonymousClass1FY();
        }
        this.A04++;
        try {
            return new AnonymousClass1FY(new AnonymousClass1FU(r3));
        } catch (IOException unused) {
            return new AnonymousClass1FY();
        }
    }

    public static void A02(C15220mX r8) {
        IllegalStateException th;
        synchronized (r8.A08) {
            try {
                ListIterator listIterator = r8.A0A.listIterator();
                while (listIterator.hasNext()) {
                    C15270mc r2 = (C15270mc) listIterator.next();
                    if (r2 != null) {
                        File A022 = r2.A02();
                        if (A022.exists() && A022.delete()) {
                            r8.A0B.getAndAdd(-r2.A00());
                            listIterator.remove();
                        }
                    }
                }
            } catch (Throwable th2) {
                while (true) {
                    th = th2;
                }
            }
        }
        synchronized (r8.A07) {
            try {
                Iterator it = r8.A09.entrySet().iterator();
                while (it.hasNext() && ((r8.A09.size() > 0 && r8.A0B.get() > r8.A01) || r8.A09.size() > r8.A00)) {
                    try {
                        Map.Entry entry = (Map.Entry) it.next();
                        AnonymousClass18J r22 = r8.A02;
                        if (r22 == null || !r22.A02((String) entry.getKey(), (C15270mc) entry.getValue())) {
                            C15270mc r6 = (C15270mc) entry.getValue();
                            if (r6 != null) {
                                if (r6.A01() == null) {
                                    File A023 = r6.A02();
                                    File A032 = r6.A03();
                                    if ((!A023.exists() || A023.delete()) && (!A032.exists() || A032.delete())) {
                                        r8.A0B.getAndAdd(-r6.A00());
                                    } else {
                                        synchronized (r8.A08) {
                                            try {
                                                r8.A0A.add(r6);
                                            } catch (Throwable th3) {
                                                th = th3;
                                            }
                                        }
                                    }
                                    C35501gT r0 = r8.A03;
                                    if (r0 != null) {
                                        String str = r6.A07;
                                        C50092Ey r23 = r0.A00.A01;
                                        if (r23 != null) {
                                            r23.A01(System.currentTimeMillis(), str);
                                        }
                                    }
                                } else {
                                    th = new IllegalStateException("trying to clear a disk cache entry that is still under edit.");
                                    throw th;
                                }
                            }
                            it.remove();
                        }
                    } catch (IllegalStateException | NoSuchElementException unused) {
                    }
                }
                if (r8.A09.isEmpty() && r8.A0B.get() > r8.A01) {
                    AnonymousClass0QD.A0A("IgDiskCache", new RuntimeException("unable to trim disk size to limit"));
                }
            } catch (Throwable th4) {
                th = th4;
                throw th;
            }
        }
    }

    public static void A04(String str) {
        if (!A0H.matcher(str).matches()) {
            throw new IllegalArgumentException(AnonymousClass000.A0J("keys must match regex [a-z0-9_-]{1,120}: \"", str, "\""));
        }
    }

    public final void A06(C15270mc r5) {
        File file = new File(r5.A06, AnonymousClass000.A0E(r5.A07, ".tmp"));
        if (file.exists()) {
            file.delete();
        }
        r5.A05((C33371co) null);
        r5.A06((C56252cB) null, false);
        A03(this, r5);
    }

    public final int A9w() {
        int size;
        synchronized (this.A07) {
            size = this.A09.size();
        }
        return size;
    }

    public final AnonymousClass1FY ACo(String str, C56252cB r4, boolean z) {
        if (!z || r4 != null) {
            return A01(str, r4, z);
        }
        throw new IllegalArgumentException("Crucial metadata can't be null");
    }

    public final long APc() {
        return this.A01;
    }

    public final void Bip(long j) {
        this.A01 = j;
        AnonymousClass0Z9.A03(A0G, this.A0E, 1532727274);
    }

    public final void clear() {
        HashSet<String> hashSet = new HashSet<>();
        synchronized (this.A07) {
            hashSet.addAll(this.A09.keySet());
        }
        for (String Bac : hashSet) {
            try {
                Bac(Bac);
            } catch (IllegalStateException | NoSuchElementException unused) {
            }
        }
    }

    public final long size() {
        return this.A0B.get();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:?, code lost:
        r0 = new p000X.AnonymousClass1FY();
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:32:0x0070 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:38:0x0083 */
    private AnonymousClass1FY A01(String str, C56252cB r8, boolean z) {
        AnonymousClass1FY r0;
        A04(str);
        if (this.A01 == 0 || this.A00 == 0 || A0F.equals(this.A06) || (z && r8 == null)) {
            return new AnonymousClass1FY();
        }
        C15270mc A052 = A05(str);
        if (A052 == null) {
            A052 = new C15270mc(this.A06, str);
            synchronized (this.A07) {
                this.A09.put(str, A052);
            }
        } else if (A052.A01() != null) {
            throw new IllegalStateException("Trying to edit a disk cache entry while another edit is in progress.");
        }
        A052.A06(r8, z);
        C15250ma r4 = this.A0D;
        r4.A04.ADc(new C33351cm(r4, AnonymousClass000.A0F("DIRTY ", str, 10)));
        synchronized (this) {
            if (A052.A01() == null) {
                C33361cn r1 = new C33361cn(A052, this);
                this.A06.mkdirs();
                r1 = new C33361cn(A052, this);
                A052.A05(r1);
                r0 = new AnonymousClass1FY(r1);
            } else {
                throw new IllegalStateException("Trying to edit a disk cache entry while another edit is in progress.");
            }
        }
        return r0;
    }

    public static void A03(C15220mX r9, C15270mc r10) {
        if (r10.A08()) {
            C15250ma r8 = r9.A0D;
            String str = r10.A07;
            long A002 = r10.A00();
            boolean A072 = r10.A07();
            AnonymousClass0OT r4 = r8.A04;
            r4.ADc(new C33351cm(r8, "CLEAN " + str + ' ' + String.valueOf(A002) + ' ' + String.valueOf(A072) + 10));
        } else {
            synchronized (r9.A07) {
                r9.A09.remove(r10.A07);
            }
        }
        if (r9.A0B.get() > r9.A01 || r9.A9w() > r9.A00) {
            AnonymousClass0Z9.A03(A0G, r9.A0E, 1275077346);
        }
    }

    public final C15270mc A05(String str) {
        C15270mc r0;
        A04(str);
        synchronized (this.A07) {
            r0 = (C15270mc) this.A09.get(str);
        }
        return r0;
    }

    public final boolean A07(String str) {
        C15270mc r1;
        A04(str);
        synchronized (this.A07) {
            r1 = (C15270mc) this.A09.get(str);
        }
        if (r1 == null || !r1.A08() || !r1.A02().exists()) {
            return false;
        }
        if (!r1.A07() || r1.A03().exists()) {
            return true;
        }
        return false;
    }

    public final AnonymousClass1FY AF0(String str) {
        C15270mc A052 = A05(str);
        if (A052 == null || !A052.A07()) {
            return A00(A052);
        }
        throw new IllegalStateException("IgDiskCache.getWithMetadata() must be used for items that have crucial metadata");
    }

    public final long ALE(String str) {
        C15270mc A052 = A05(str);
        if (A052 != null) {
            return A052.A00();
        }
        return -1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0042 A[SYNTHETIC, Splitter:B:18:0x0042] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0049 A[SYNTHETIC, Splitter:B:26:0x0049] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0052 A[ADDED_TO_REGION] */
    public final AnonymousClass1FY Aam(String str) {
        C56252cB r4;
        BufferedReader bufferedReader;
        C15270mc A052 = A05(str);
        if (A052 != null) {
            File A032 = A052.A03();
            r4 = null;
            if (A032.canRead()) {
                try {
                    bufferedReader = new BufferedReader(new FileReader(A032));
                    try {
                        StringBuilder sb = new StringBuilder();
                        while (true) {
                            String readLine = bufferedReader.readLine();
                            if (readLine == null) {
                                break;
                            }
                            sb.append(readLine);
                        }
                        C56252cB r0 = new C56252cB(new JSONObject(sb.toString()));
                        try {
                            bufferedReader.close();
                        } catch (IOException unused) {
                        }
                        r4 = r0;
                    } catch (IOException | JSONException unused2) {
                        if (bufferedReader != null) {
                            try {
                                bufferedReader.close();
                            } catch (IOException unused3) {
                            }
                        }
                        if (A052 != null) {
                        }
                        this.A05++;
                        return new AnonymousClass1FY();
                    } catch (Throwable th) {
                        th = th;
                        if (bufferedReader != null) {
                            try {
                                bufferedReader.close();
                            } catch (IOException unused4) {
                            }
                        }
                        throw th;
                    }
                } catch (IOException | JSONException unused5) {
                    bufferedReader = null;
                    if (bufferedReader != null) {
                    }
                    if (A052 != null) {
                    }
                    this.A05++;
                    return new AnonymousClass1FY();
                } catch (Throwable th2) {
                    th = th2;
                    bufferedReader = null;
                    if (bufferedReader != null) {
                    }
                    throw th;
                }
            }
        } else {
            r4 = null;
        }
        if (A052 != null || (r4 == null && A052.A07())) {
            this.A05++;
        } else {
            AnonymousClass1FY A002 = A00(A052);
            if (A002.A01()) {
                return new AnonymousClass1FY(new C35511gU((AnonymousClass1FV) A002.A00(), r4));
            }
        }
        return new AnonymousClass1FY();
    }

    public final void Bac(String str) {
        C15270mc r3;
        C50092Ey r2;
        A04(str);
        synchronized (this.A07) {
            try {
                r3 = (C15270mc) this.A09.remove(str);
            } catch (Throwable th) {
                while (true) {
                    th = th;
                }
            }
        }
        if (r3 == null) {
            return;
        }
        if (r3.A01() == null) {
            File A022 = r3.A02();
            File A032 = r3.A03();
            if ((!A022.exists() || A022.delete()) && (!A032.exists() || A032.delete())) {
                this.A0B.getAndAdd(-r3.A00());
            } else {
                synchronized (this.A08) {
                    try {
                        this.A0A.add(r3);
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                }
            }
            C35501gT r0 = this.A03;
            if (r0 != null && (r2 = r0.A00.A01) != null) {
                r2.A02(System.currentTimeMillis(), str);
                return;
            }
            return;
        }
        throw new IllegalStateException("trying to remove a disk cache entry that is still under edit.");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x008a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        r5.close();
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:24:0x008e */
    public final void close() {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            A02(this);
            this.A0D.A02();
            AnonymousClass18J r0 = this.A02;
            if (r0 != null) {
                synchronized (r0.A02) {
                    AnonymousClass18M r7 = r0.A01;
                    try {
                        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(r7.A03), AnonymousClass18M.A04));
                        for (C38101kj r6 : new ArrayList(r7.A00.A00.A03.values())) {
                            bufferedWriter.write(r6.A02 + ' ' + r6.A01 + ' ' + r6.A00 + 10);
                        }
                        bufferedWriter.flush();
                        r7.A03.renameTo(r7.A02);
                        bufferedWriter.close();
                    } catch (IOException e) {
                        AnonymousClass0QD.A05("BlockerJournal", "IOException while rebuilding journal file", e);
                    } catch (Throwable ) {
                        throw th;
                    }
                }
                return;
            }
            return;
        }
        throw new IllegalStateException("This operation can't be run on UI thread.");
    }

    public final void BiY(C35501gT r1) {
        this.A03 = r1;
    }
}
