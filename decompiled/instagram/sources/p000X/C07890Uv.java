package p000X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.NetworkInfo;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import com.facebook.rti.common.time.RealtimeSinceBootClock;
import com.facebook.rti.mqtt.protocol.messages.SubscribeTopic;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONException;

/* renamed from: X.0Uv  reason: invalid class name and case insensitive filesystem */
public final class C07890Uv {
    public long A00;
    public long A01;
    public long A02;
    public Context A03;
    public Handler A04;
    public AnonymousClass0T1 A05;
    public RealtimeSinceBootClock A06;
    public AnonymousClass0TW A07;
    public AnonymousClass0TY A08;
    public C07480Tg A09;
    public C07540Tm A0A;
    public C07630Tv A0B;
    public AnonymousClass0UC A0C;
    public AnonymousClass0UE A0D;
    public AnonymousClass0UU A0E;
    public C07680Ua A0F;
    public C07690Ub A0G;
    public C07710Ud A0H;
    public C07870Ut A0I;
    public C10610da A0J;
    public AnonymousClass0V0 A0K;
    public AnonymousClass0V4 A0L;
    public C031705u A0M;
    public C031505s A0N;
    public AnonymousClass0WZ A0O;
    public C08220Wc A0P;
    public String A0Q;
    public Map A0R = new HashMap();
    public Executor A0S;
    public AtomicBoolean A0T = new AtomicBoolean(false);
    public AtomicInteger A0U;
    public boolean A0V;
    public boolean A0W;
    public boolean A0X = false;
    public long A0Y;
    public BroadcastReceiver A0Z;
    public BroadcastReceiver A0a;
    public Method A0b;
    public long A0c;
    public final Object A0d = new Object();
    public final Runnable A0e = new C07740Ug(this);
    public final Runnable A0f = new C07750Uh(this);
    public final Runnable A0g = new C07720Ue(this);
    public final AtomicLong A0h = new AtomicLong();
    public final C10660df A0i = new C10660df(this);
    public volatile long A0j;
    public volatile C07650Tx A0k;
    public volatile C07990Vf A0l;
    public volatile C07990Vf A0m;
    public volatile C10380dD A0n;
    public volatile String A0o;
    public volatile boolean A0p;
    public volatile long A0q;

    public final void A0E(C07990Vf r5, C07450Td r6, C07880Uu r7) {
        synchronized (this) {
            if (this.A0l == r5) {
                this.A0l = null;
            }
        }
        boolean z = false;
        if (r5 != null) {
            if (r5.A0X == AnonymousClass0VP.DISCONNECTED) {
                z = true;
            }
            r5.A0W = null;
            synchronized (r5) {
                C07990Vf.A04(r5, r6, C08110Vr.DISCONNECT, (Throwable) null);
            }
            this.A01 = System.currentTimeMillis();
        }
        if (!z) {
            A03(this, r7, C11020eI.A00);
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x025e  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0275  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x029c A[LOOP:1: B:52:0x0296->B:54:0x029c, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x02b7  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x02c5  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0308  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x031b  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0342  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x035f  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0389  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0392  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x03b0  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x03b3  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x03b7  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x03bd  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x03be  */
    public static void A00(p000X.C07890Uv r41) {
        /*
            r1 = r41
            X.0Tm r2 = r1.A0A
            java.lang.Class<X.064> r0 = p000X.AnonymousClass064.class
            X.0Tr r2 = r2.A07(r0)
            X.064 r2 = (p000X.AnonymousClass064) r2
            X.0e2 r0 = p000X.C10890e2.CountConnectAttempt
            java.lang.Object r0 = r2.A00(r0)
            java.util.concurrent.atomic.AtomicLong r0 = (java.util.concurrent.atomic.AtomicLong) r0
            r0.incrementAndGet()
            java.util.concurrent.atomic.AtomicLong r0 = r1.A0h
            long r2 = android.os.SystemClock.elapsedRealtime()
            r0.set(r2)
            X.0Tv r0 = r1.A0B
            X.0Tx r0 = r0.A00()
            int r2 = r0.A0F
            java.lang.String r16 = "FbnsConnectionManager"
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.setPriority(r2)
            r1.A0B()
            java.util.Map r3 = r1.A0R
            monitor-enter(r3)
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ all -> 0x0428 }
            java.util.Map r0 = r1.A0R     // Catch:{ all -> 0x0428 }
            java.util.Collection r0 = r0.values()     // Catch:{ all -> 0x0428 }
            r2.<init>(r0)     // Catch:{ all -> 0x0428 }
            X.0WZ r0 = r1.A0O     // Catch:{ all -> 0x0428 }
            java.util.List r36 = r0.getConnectSubscribeTopics(r2)     // Catch:{ all -> 0x0428 }
            monitor-exit(r3)     // Catch:{ all -> 0x0428 }
            X.0da r4 = r1.A0J
            X.0Uz r0 = r4.A03
            X.0Tv r0 = r0.A0D
            X.0Tx r2 = r0.A00()
            X.0V7 r0 = r4.A04
            X.0V0 r0 = r0.A0J
            java.lang.String r5 = r0.AKC()
            X.0V7 r0 = r4.A04
            X.0V0 r0 = r0.A0J
            java.lang.String r3 = r0.AKE()
            boolean r0 = r4.A08
            if (r0 != 0) goto L_0x0083
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 != 0) goto L_0x0073
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 == 0) goto L_0x0083
        L_0x0073:
            X.0V7 r0 = r4.A04
            X.0UU r0 = r0.A0F
            r0.clear()
            X.0V7 r0 = r4.A04
            X.0V0 r3 = r0.A0J
            X.0UV r0 = p000X.AnonymousClass0UV.A01
            r3.BsN(r0)
        L_0x0083:
            X.0Vn r17 = new X.0Vn
            java.lang.String r15 = r2.A0R
            java.lang.String r14 = r2.A0S
            int r13 = r2.A0K
            int r12 = r2.A07
            boolean r11 = r2.A0V
            X.0V7 r0 = r4.A04
            X.0UU r0 = r0.A0F
            X.0UT r23 = r0.AOR()
            X.0V7 r0 = r4.A04
            X.0V0 r0 = r0.A0J
            java.lang.String r24 = r0.AKC()
            X.0V7 r0 = r4.A04
            X.0V0 r0 = r0.A0J
            java.lang.String r25 = r0.AKE()
            X.0V7 r0 = r4.A04
            X.0V0 r3 = r0.A0J
            java.lang.String r26 = r3.AG2()
            X.0Uz r3 = r4.A03
            X.0TZ r10 = r3.A08
            java.util.concurrent.atomic.AtomicInteger r9 = r3.A0U
            int r8 = r2.A0H
            int r7 = r2.A0N
            int r6 = r2.A0B
            boolean r3 = r2.A0U
            r32 = 0
            if (r3 == 0) goto L_0x00c3
            r32 = 1
        L_0x00c3:
            int r5 = r2.A0E
            int r3 = r2.A0G
            X.0TQ r2 = r0.A0C
            X.0TQ r0 = r0.A09
            java.lang.Object r0 = r0.get()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r37 = r0.booleanValue()
            X.0V7 r0 = r4.A04
            X.0TQ r0 = r0.A0B
            if (r0 == 0) goto L_0x01a7
            java.lang.Object r0 = r0.get()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r38 = r0.booleanValue()
        L_0x00e5:
            X.0V7 r0 = r4.A04
            java.util.Map r0 = r0.A0Q
            r27 = r10
            r28 = r9
            r29 = r8
            r30 = r7
            r31 = r6
            r33 = r5
            r34 = r3
            r35 = r2
            r39 = r0
            r18 = r15
            r19 = r14
            r20 = r13
            r21 = r12
            r22 = r11
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39)
            X.0V7 r2 = r4.A04
            X.0Vg r12 = r2.A0K
            X.0UK r11 = r4.A02
            X.0Uz r0 = r4.A03
            com.facebook.rti.common.time.RealtimeSinceBootClock r10 = r0.A04
            java.util.concurrent.ScheduledExecutorService r9 = r4.A07
            X.0VJ r8 = r4.A05
            X.0WZ r7 = r2.A0M
            android.content.Context r6 = r4.A00
            r21 = r17
            X.0dG r31 = new X.0dG
            X.0Tg r5 = r12.A01
            X.0e7 r3 = r12.A00
            X.0QT r2 = r12.A03
            java.lang.String r0 = r12.A04
            r18 = r31
            r27 = r6
            r28 = r2
            r29 = r0
            r22 = r10
            r23 = r3
            r24 = r9
            r25 = r8
            r26 = r7
            r19 = r11
            r20 = r5
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            X.0Uz r0 = r4.A03
            X.0Tm r2 = r0.A0C
            X.0V7 r0 = r4.A04
            X.0Vg r0 = r0.A0K
            java.lang.String r0 = r0.A05
            r2.A0F = r0
            X.0Vf r0 = new X.0Vf
            X.0Uz r3 = r4.A03
            X.0UC r2 = r3.A0H
            r19 = r2
            X.0TW r15 = r4.A01
            X.0Tg r14 = r3.A0A
            X.0Tm r12 = r3.A0C
            com.facebook.rti.common.time.RealtimeSinceBootClock r11 = r3.A04
            java.util.concurrent.ExecutorService r10 = r4.A06
            X.0Ti r9 = r3.A0B
            X.0V7 r2 = r4.A04
            X.0eJ r13 = r2.A06
            X.0dD r8 = r2.A0L
            X.0UU r7 = r2.A0F
            X.0Te r6 = r3.A09
            X.0TQ r5 = r2.A0D
            X.0TQ r4 = r2.A0B
            boolean r3 = r2.A0R
            java.lang.Long r2 = r2.A0P
            r18 = r0
            r20 = r15
            r21 = r14
            r22 = r12
            r23 = r17
            r24 = r11
            r25 = r10
            r26 = r9
            r27 = r13
            r28 = r8
            r29 = r7
            r30 = r6
            r32 = r5
            r33 = r4
            r34 = r3
            r35 = r2
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35)
            X.0dc r2 = new X.0dc
            r2.<init>(r1, r0)
            r0.A0W = r2
            java.util.List r6 = java.util.Collections.emptyList()
            boolean r8 = r1.A0X
            r2 = r8 ^ 1
            r1.A0X = r2
            monitor-enter(r0)
            goto L_0x01ab
        L_0x01a7:
            r38 = 0
            goto L_0x00e5
        L_0x01ab:
            long r2 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x0425 }
            r0.A0Q = r2     // Catch:{ all -> 0x0425 }
            r0.A0O = r2     // Catch:{ all -> 0x0425 }
            p000X.C07410Sz.A00(r6)     // Catch:{ all -> 0x0425 }
            r0.A01 = r6     // Catch:{ all -> 0x0425 }
            X.0Vn r2 = r0.A0G     // Catch:{ all -> 0x0425 }
            java.util.concurrent.atomic.AtomicInteger r2 = r2.A0I     // Catch:{ all -> 0x0425 }
            int r40 = r2.get()     // Catch:{ all -> 0x0425 }
            java.util.ArrayList r11 = new java.util.ArrayList     // Catch:{ all -> 0x0425 }
            r11.<init>()     // Catch:{ all -> 0x0425 }
            java.util.Map r7 = r0.A0I     // Catch:{ all -> 0x0425 }
            monitor-enter(r7)     // Catch:{ all -> 0x0425 }
            X.0Vn r2 = r0.A0G     // Catch:{ all -> 0x041f }
            java.util.List r2 = r2.A0G     // Catch:{ all -> 0x041f }
            java.util.Iterator r5 = r2.iterator()     // Catch:{ all -> 0x041f }
        L_0x01d0:
            boolean r2 = r5.hasNext()     // Catch:{ all -> 0x041f }
            if (r2 == 0) goto L_0x01e9
            java.lang.Object r4 = r5.next()     // Catch:{ all -> 0x041f }
            com.facebook.rti.mqtt.protocol.messages.SubscribeTopic r4 = (com.facebook.rti.mqtt.protocol.messages.SubscribeTopic) r4     // Catch:{ all -> 0x041f }
            java.lang.String r2 = r4.A01     // Catch:{ all -> 0x041f }
            r11.add(r2)     // Catch:{ all -> 0x041f }
            java.util.Map r3 = r0.A0I     // Catch:{ all -> 0x041f }
            java.lang.String r2 = r4.A01     // Catch:{ all -> 0x041f }
            r3.put(r2, r4)     // Catch:{ all -> 0x041f }
            goto L_0x01d0
        L_0x01e9:
            monitor-exit(r7)     // Catch:{ all -> 0x041f }
            boolean r2 = r0.A0M     // Catch:{ all -> 0x0425 }
            r4 = 0
            if (r2 == 0) goto L_0x0232
            X.0Vn r2 = r0.A0G     // Catch:{ all -> 0x0425 }
            X.0TZ r9 = r2.A0B     // Catch:{ all -> 0x0425 }
            java.lang.String r5 = "["
            r2 = 4
            java.lang.Object[] r7 = new java.lang.Object[r2]     // Catch:{ all -> 0x0425 }
            r3 = 0
            java.lang.String r2 = "FBAN"
            r7[r3] = r2     // Catch:{ all -> 0x0425 }
            java.lang.String r3 = r9.A02     // Catch:{ all -> 0x0425 }
            r2 = 1
            r7[r2] = r3     // Catch:{ all -> 0x0425 }
            r3 = 2
            java.lang.String r2 = "FBAV"
            r7[r3] = r2     // Catch:{ all -> 0x0425 }
            X.0TT r2 = r9.A01     // Catch:{ all -> 0x0425 }
            java.lang.String r3 = r2.A01     // Catch:{ all -> 0x0425 }
            r2 = 3
            r7[r2] = r3     // Catch:{ all -> 0x0425 }
            java.lang.String r3 = "%s/%s;%s/%s;"
            java.lang.String r3 = java.lang.String.format(r4, r3, r7)     // Catch:{ all -> 0x0425 }
            java.lang.String r2 = "]"
            java.lang.String r19 = p000X.AnonymousClass000.A0J(r5, r3, r2)     // Catch:{ all -> 0x0425 }
            r5 = r4
        L_0x021b:
            X.0TQ r2 = r0.A05     // Catch:{ all -> 0x0425 }
            java.lang.Object r2 = r2.get()     // Catch:{ all -> 0x0425 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x0425 }
            if (r2 == 0) goto L_0x0243
            java.lang.String r10 = r2.trim()     // Catch:{ all -> 0x0425 }
            java.lang.String r2 = ""
            boolean r2 = r10.equals(r2)     // Catch:{ all -> 0x0425 }
            if (r2 == 0) goto L_0x0244
            goto L_0x0243
        L_0x0232:
            X.0Vn r2 = r0.A0G     // Catch:{ all -> 0x0425 }
            X.0TZ r2 = r2.A0B     // Catch:{ all -> 0x0425 }
            java.lang.String r19 = r2.A01()     // Catch:{ all -> 0x0425 }
            X.0Vn r2 = r0.A0G     // Catch:{ all -> 0x0425 }
            X.0UV r2 = r2.A0D     // Catch:{ all -> 0x0425 }
            java.lang.Object r5 = r2.first     // Catch:{ all -> 0x0425 }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ all -> 0x0425 }
            goto L_0x021b
        L_0x0243:
            r10 = r4
        L_0x0244:
            X.0UC r2 = r0.A0B     // Catch:{ all -> 0x0425 }
            android.net.NetworkInfo r2 = r2.A02()     // Catch:{ all -> 0x0425 }
            r0.A0V = r2     // Catch:{ all -> 0x0425 }
            X.0UC r2 = r0.A0B     // Catch:{ all -> 0x0425 }
            android.net.NetworkInfo r3 = r2.A02()     // Catch:{ all -> 0x0425 }
            if (r3 == 0) goto L_0x0275
            java.lang.String r2 = r3.getTypeName()     // Catch:{ all -> 0x0425 }
            boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch:{ all -> 0x0425 }
            if (r2 != 0) goto L_0x0275
            java.lang.String r2 = r3.getTypeName()     // Catch:{ all -> 0x0425 }
        L_0x0262:
            java.lang.String r2 = r2.toLowerCase()     // Catch:{ all -> 0x0425 }
            r0.A0Z = r2     // Catch:{ all -> 0x0425 }
            long r2 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x0425 }
            r0.A0U = r2     // Catch:{ all -> 0x0425 }
            r2 = 0
            java.lang.Long r18 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x0425 }
            goto L_0x0278
        L_0x0275:
            java.lang.String r2 = "none"
            goto L_0x0262
        L_0x0278:
            X.0Vn r2 = r0.A0G     // Catch:{ NumberFormatException -> 0x028c }
            X.0UT r2 = r2.A0C     // Catch:{ NumberFormatException -> 0x028c }
            java.lang.Object r2 = r2.first     // Catch:{ NumberFormatException -> 0x028c }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ NumberFormatException -> 0x028c }
            r0.A0Y = r2     // Catch:{ NumberFormatException -> 0x028c }
            java.lang.String r2 = r0.A0Y     // Catch:{ NumberFormatException -> 0x028c }
            long r2 = java.lang.Long.parseLong(r2)     // Catch:{ NumberFormatException -> 0x028c }
            java.lang.Long r18 = java.lang.Long.valueOf(r2)     // Catch:{ NumberFormatException -> 0x028c }
        L_0x028c:
            X.0W0 r9 = new X.0W0     // Catch:{ all -> 0x0425 }
            java.util.EnumSet r2 = p000X.C07990Vf.A0b     // Catch:{ all -> 0x0425 }
            java.util.Iterator r7 = r2.iterator()     // Catch:{ all -> 0x0425 }
            r12 = 0
        L_0x0296:
            boolean r2 = r7.hasNext()     // Catch:{ all -> 0x0425 }
            if (r2 == 0) goto L_0x02a9
            java.lang.Object r2 = r7.next()     // Catch:{ all -> 0x0425 }
            X.0Ve r2 = (p000X.C07980Ve) r2     // Catch:{ all -> 0x0425 }
            byte r3 = r2.A00     // Catch:{ all -> 0x0425 }
            r2 = 1
            int r2 = r2 << r3
            long r2 = (long) r2     // Catch:{ all -> 0x0425 }
            long r12 = r12 | r2
            goto L_0x0296
        L_0x02a9:
            java.lang.Long r20 = java.lang.Long.valueOf(r12)     // Catch:{ all -> 0x0425 }
            long r2 = r0.A0U     // Catch:{ all -> 0x0425 }
            java.lang.Long r21 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x0425 }
            android.net.NetworkInfo r2 = r0.A0V     // Catch:{ all -> 0x0425 }
            if (r2 == 0) goto L_0x03b7
            android.net.NetworkInfo r2 = r0.A0V     // Catch:{ all -> 0x0425 }
            int r2 = r2.getType()     // Catch:{ all -> 0x0425 }
            java.lang.Integer r22 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x0425 }
        L_0x02c1:
            android.net.NetworkInfo r2 = r0.A0V     // Catch:{ all -> 0x0425 }
            if (r2 == 0) goto L_0x03b3
            android.net.NetworkInfo r2 = r0.A0V     // Catch:{ all -> 0x0425 }
            int r2 = r2.getSubtype()     // Catch:{ all -> 0x0425 }
            java.lang.Integer r23 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x0425 }
        L_0x02cf:
            X.0Vn r3 = r0.A0G     // Catch:{ all -> 0x0425 }
            boolean r2 = r3.A0K     // Catch:{ all -> 0x0425 }
            java.lang.Boolean r24 = java.lang.Boolean.valueOf(r2)     // Catch:{ all -> 0x0425 }
            r2 = 1
            java.lang.Boolean r25 = java.lang.Boolean.valueOf(r2)     // Catch:{ all -> 0x0425 }
            X.0UV r2 = r3.A0D     // Catch:{ all -> 0x0425 }
            java.lang.Object r2 = r2.second     // Catch:{ all -> 0x0425 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x0425 }
            boolean r7 = r3.A0J     // Catch:{ all -> 0x0425 }
            java.lang.Boolean r28 = java.lang.Boolean.valueOf(r7)     // Catch:{ all -> 0x0425 }
            X.0TQ r3 = r3.A0A     // Catch:{ all -> 0x0425 }
            java.lang.Object r3 = r3.get()     // Catch:{ all -> 0x0425 }
            java.lang.Long r3 = (java.lang.Long) r3     // Catch:{ all -> 0x0425 }
            long r12 = r3.longValue()     // Catch:{ all -> 0x0425 }
            java.lang.Long r29 = java.lang.Long.valueOf(r12)     // Catch:{ all -> 0x0425 }
            X.0Vn r7 = r0.A0G     // Catch:{ all -> 0x0425 }
            int r15 = r7.A07     // Catch:{ all -> 0x0425 }
            X.0UU r3 = r0.A0C     // Catch:{ all -> 0x0425 }
            java.lang.String r31 = r3.AIF()     // Catch:{ all -> 0x0425 }
            java.lang.String r14 = r7.A0E     // Catch:{ all -> 0x0425 }
            boolean r3 = r0.A0M     // Catch:{ all -> 0x0425 }
            if (r3 == 0) goto L_0x03b0
            java.lang.String r13 = r7.A0F     // Catch:{ all -> 0x0425 }
        L_0x030a:
            r3 = 3
            java.lang.Byte r36 = java.lang.Byte.valueOf(r3)     // Catch:{ all -> 0x0425 }
            java.util.Map r12 = r7.A0H     // Catch:{ all -> 0x0425 }
            java.lang.Long r7 = r0.A0H     // Catch:{ all -> 0x0425 }
            X.0UC r3 = r0.A0B     // Catch:{ all -> 0x0425 }
            java.lang.Integer r3 = r3.A03()     // Catch:{ all -> 0x0425 }
            if (r3 != 0) goto L_0x0392
            X.0au r39 = p000X.C09230au.A02     // Catch:{ all -> 0x0425 }
        L_0x031d:
            r26 = r5
            r27 = r2
            r30 = r15
            r32 = r14
            r33 = r11
            r34 = r13
            r35 = r10
            r37 = r12
            r38 = r7
            r17 = r9
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39)     // Catch:{ all -> 0x0425 }
            X.0Vn r2 = r0.A0G     // Catch:{ all -> 0x0425 }
            X.0UV r2 = r2.A0D     // Catch:{ all -> 0x0425 }
            java.lang.Object r2 = r2.first     // Catch:{ all -> 0x0425 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x0425 }
            boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch:{ all -> 0x0425 }
            if (r2 == 0) goto L_0x0389
            java.util.UUID r2 = java.util.UUID.randomUUID()     // Catch:{ all -> 0x0425 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0425 }
        L_0x034a:
            r5 = 20
            int r3 = r2.length()     // Catch:{ all -> 0x0425 }
            int r5 = java.lang.Math.min(r5, r3)     // Catch:{ all -> 0x0425 }
            r3 = 0
            java.lang.String r3 = r2.substring(r3, r5)     // Catch:{ all -> 0x0425 }
            X.0Vz r7 = new X.0Vz     // Catch:{ all -> 0x0425 }
            boolean r2 = r0.A0M     // Catch:{ all -> 0x0425 }
            if (r2 != 0) goto L_0x0367
            X.0Vn r2 = r0.A0G     // Catch:{ all -> 0x0425 }
            X.0UT r2 = r2.A0C     // Catch:{ all -> 0x0425 }
            java.lang.Object r4 = r2.second     // Catch:{ all -> 0x0425 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ all -> 0x0425 }
        L_0x0367:
            r7.<init>(r3, r9, r4, r6)     // Catch:{ all -> 0x0425 }
            X.0Vn r2 = r0.A0G     // Catch:{ all -> 0x0425 }
            java.lang.String r2 = r2.A01     // Catch:{ all -> 0x0425 }
            r7.A00 = r2     // Catch:{ all -> 0x0425 }
            X.0VP r2 = p000X.AnonymousClass0VP.CONNECTING     // Catch:{ all -> 0x0425 }
            r0.A0X = r2     // Catch:{ all -> 0x0425 }
            X.0Tm r2 = r0.A0A     // Catch:{ all -> 0x0425 }
            X.0To r9 = r2.A00     // Catch:{ all -> 0x0425 }
            long r4 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x0425 }
            java.util.concurrent.atomic.AtomicLong r6 = r9.A03     // Catch:{ all -> 0x0425 }
            r2 = 0
            r6.compareAndSet(r2, r4)     // Catch:{ all -> 0x0425 }
            java.util.concurrent.atomic.AtomicLong r6 = r9.A00     // Catch:{ all -> 0x0425 }
            r6.compareAndSet(r2, r4)     // Catch:{ all -> 0x0425 }
            goto L_0x03bb
        L_0x0389:
            X.0Vn r2 = r0.A0G     // Catch:{ all -> 0x0425 }
            X.0UV r2 = r2.A0D     // Catch:{ all -> 0x0425 }
            java.lang.Object r2 = r2.first     // Catch:{ all -> 0x0425 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x0425 }
            goto L_0x034a
        L_0x0392:
            int r3 = r3.intValue()     // Catch:{ all -> 0x0425 }
            switch(r3) {
                case 0: goto L_0x039c;
                case 1: goto L_0x039c;
                case 2: goto L_0x03ac;
                case 3: goto L_0x03a0;
                case 4: goto L_0x03a4;
                case 5: goto L_0x03a8;
                case 6: goto L_0x039c;
                case 7: goto L_0x039c;
                default: goto L_0x0399;
            }     // Catch:{ all -> 0x0425 }
        L_0x0399:
            X.0au r39 = p000X.C09230au.A02     // Catch:{ all -> 0x0425 }
            goto L_0x031d
        L_0x039c:
            X.0au r39 = p000X.C09230au.A02     // Catch:{ all -> 0x0425 }
            goto L_0x031d
        L_0x03a0:
            X.0au r39 = p000X.C09230au.A03     // Catch:{ all -> 0x0425 }
            goto L_0x031d
        L_0x03a4:
            X.0au r39 = p000X.C09230au.A04     // Catch:{ all -> 0x0425 }
            goto L_0x031d
        L_0x03a8:
            X.0au r39 = p000X.C09230au.A05     // Catch:{ all -> 0x0425 }
            goto L_0x031d
        L_0x03ac:
            X.0au r39 = p000X.C09230au.A08     // Catch:{ all -> 0x0425 }
            goto L_0x031d
        L_0x03b0:
            r13 = r4
            goto L_0x030a
        L_0x03b3:
            r23 = r4
            goto L_0x02cf
        L_0x03b7:
            r22 = r4
            goto L_0x02c1
        L_0x03bb:
            if (r8 == 0) goto L_0x03be
            goto L_0x03c3
        L_0x03be:
            X.0Vn r2 = r0.A0G     // Catch:{ all -> 0x0425 }
            int r9 = r2.A06     // Catch:{ all -> 0x0425 }
            goto L_0x03c7
        L_0x03c3:
            X.0Vn r2 = r0.A0G     // Catch:{ all -> 0x0425 }
            int r9 = r2.A02     // Catch:{ all -> 0x0425 }
        L_0x03c7:
            r0.A00 = r9     // Catch:{ all -> 0x0425 }
            X.0dG r8 = r0.A0D     // Catch:{ all -> 0x0425 }
            X.0Vn r2 = r0.A0G     // Catch:{ all -> 0x0425 }
            java.lang.String r6 = r2.A00     // Catch:{ all -> 0x0425 }
            boolean r5 = r0.A0M     // Catch:{ all -> 0x0425 }
            boolean r2 = r2.A0L     // Catch:{ all -> 0x0425 }
            monitor-enter(r8)     // Catch:{ all -> 0x0425 }
            java.lang.Thread r4 = new java.lang.Thread     // Catch:{ all -> 0x0422 }
            X.0VR r3 = new X.0VR     // Catch:{ all -> 0x0422 }
            r38 = r5
            r39 = r7
            r41 = r2
            r34 = r3
            r35 = r8
            r36 = r6
            r37 = r9
            r34.<init>(r35, r36, r37, r38, r39, r40, r41)     // Catch:{ all -> 0x0422 }
            java.lang.String r2 = "MqttClient-Network-Thread"
            r4.<init>(r3, r2)     // Catch:{ all -> 0x0422 }
            X.0Vn r2 = r8.A0A     // Catch:{ all -> 0x0422 }
            int r2 = r2.A09     // Catch:{ all -> 0x0422 }
            r4.setPriority(r2)     // Catch:{ all -> 0x0422 }
            r4.start()     // Catch:{ all -> 0x0422 }
            monitor-exit(r8)     // Catch:{ all -> 0x0425 }
            monitor-exit(r0)
            monitor-enter(r1)
            X.0Vf r3 = r1.A0l     // Catch:{ all -> 0x041c }
            r1.A0l = r0     // Catch:{ all -> 0x041c }
            monitor-exit(r1)     // Catch:{ all -> 0x041c }
            if (r3 == 0) goto L_0x0410
            java.lang.String r2 = "connecting new client without disconnecting old one"
            r0 = r16
            p000X.AnonymousClass0DB.A0E(r0, r2)
            X.0Td r2 = p000X.C07450Td.EXPIRE_CONNECTION
            X.0Uu r0 = p000X.C07880Uu.DISCONNECTED
            r1.A0E(r3, r2, r0)
        L_0x0410:
            long r2 = java.lang.System.currentTimeMillis()
            r1.A00 = r2
            X.0Ut r0 = r1.A0I
            r0.Ay2()
            return
        L_0x041c:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x041c }
            goto L_0x042a
        L_0x041f:
            r1 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x041f }
            goto L_0x0424
        L_0x0422:
            r1 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x0425 }
        L_0x0424:
            throw r1     // Catch:{ all -> 0x0425 }
        L_0x0425:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        L_0x0428:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0428 }
        L_0x042a:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000X.C07890Uv.A00(X.0Uv):void");
    }

    public static void A02(C07890Uv r4, C07510Tj r5, boolean z) {
        String str;
        try {
            str = C07510Tj.A00(r5, r5.A00).toString();
        } catch (JSONException unused) {
            str = "";
        }
        if (!TextUtils.isEmpty(str)) {
            try {
                Integer num = Constants.ONE;
                if (z) {
                    num = Constants.ZERO;
                }
                r4.A04("/mqtt_health_stats", str.getBytes("UTF-8"), num, (C08090Vp) null);
            } catch (UnsupportedEncodingException unused2) {
                throw new RuntimeException("UTF-8 not supported");
            } catch (C08040Vk unused3) {
            }
        }
    }

    public static void A03(C07890Uv r14, C07880Uu r15, C07400Sy r16) {
        String str;
        C08220Wc r1;
        long j;
        String sb;
        C07990Vf r0 = r14.A0l;
        if (r0 != null) {
            C10410dG r3 = r0.A0D;
            StringBuilder sb2 = new StringBuilder();
            InetAddress inetAddress = r3.A04;
            if (inetAddress != null) {
                sb2.append("Remote:");
                sb2.append(inetAddress.toString());
                sb2.append(10);
            }
            InetAddress inetAddress2 = r3.A03;
            if (inetAddress2 != null) {
                sb2.append("Local:");
                sb2.append(inetAddress2.toString());
                sb2.append(10);
            }
            AnonymousClass0VJ r32 = r3.A09;
            synchronized (r32) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("Cache{");
                Iterator it = r32.A00.A01().iterator();
                while (it.hasNext()) {
                    sb3.append(((C08140Vu) it.next()).toString());
                    sb3.append(',');
                }
                sb3.append("}\n");
                sb = sb3.toString();
            }
            sb2.append(sb);
            str = sb2.toString();
        } else {
            str = "";
        }
        AnonymousClass0V4 r33 = r14.A0L;
        C08040Vk r2 = new C08040Vk("Connection lost " + r15 + ", " + str);
        ArrayList<C10520dR> arrayList = new ArrayList<>();
        synchronized (r33.A03) {
            arrayList.addAll(r33.A03.values());
            r33.A03.clear();
        }
        arrayList.size();
        for (C10520dR r12 : arrayList) {
            r12.A01(r2);
            int i = r12.A01;
            C07990Vf r02 = r12.A03;
            if (r02 == null) {
                j = 0;
            } else {
                j = r02.A0U;
            }
            r33.A00.A04("abort", r12.A05, AnonymousClass0WE.A00(Constants.ONE), r12.A01, i, r2, j);
        }
        r2.getMessage();
        switch (r15.ordinal()) {
            case 0:
                break;
            case 1:
                r14.A0A.A0E = C07440Tc.CONNECTION_LOST;
                long j2 = r14.A0c;
                if (j2 <= 0 || (SystemClock.elapsedRealtime() - j2) / 1000 >= ((long) r14.A0B.A00().A0L)) {
                    C08220Wc r13 = r14.A0P;
                    synchronized (r13) {
                        r13.A07 = false;
                    }
                    r1 = r14.A0P;
                    synchronized (r1) {
                        C08220Wc.A00(r1);
                    }
                } else {
                    r1 = r14.A0P;
                    synchronized (r1) {
                        r1.A07 = true;
                    }
                }
                break;
        }
        r14.A0P.A02();
        C07400Sy r17 = r16;
        if (r17.A01()) {
            r17.A00();
        }
        r14.A0I.Ay5(r17);
    }

    public final int A04(String str, byte[] bArr, Integer num, C08090Vp r11) {
        String str2 = str;
        Integer num2 = num;
        C07400Sy A062 = A06(str2, bArr, num2, r11, this.A0B.A00().A0I, (C08080Vo) null);
        if (!A062.A01()) {
            return -1;
        }
        return ((C10520dR) A062.A00()).A01;
    }

    public final Pair A05() {
        ArrayList arrayList;
        ArrayList arrayList2;
        C07990Vf r7 = this.A0l;
        if (r7 == null) {
            return null;
        }
        Map map = this.A0R;
        synchronized (r7.A0I) {
            arrayList = null;
            for (SubscribeTopic subscribeTopic : map.values()) {
                if (!r7.A0I.containsKey(subscribeTopic.A01)) {
                    r7.A0I.put(subscribeTopic.A01, subscribeTopic);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(subscribeTopic);
                }
            }
            Iterator it = r7.A0I.entrySet().iterator();
            arrayList2 = null;
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (!map.containsKey(entry.getKey())) {
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                    }
                    arrayList2.add(entry.getValue());
                    it.remove();
                }
            }
            boolean z = false;
            if (map.size() == r7.A0I.size()) {
                z = true;
            }
            C07410Sz.A02(z);
        }
        if (arrayList == null && arrayList2 == null) {
            return null;
        }
        return new Pair(arrayList, arrayList2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0037, code lost:
        if (r4 == p000X.AnonymousClass0VP.A03) goto L_0x0039;
     */
    public final C07400Sy A06(String str, byte[] bArr, Integer num, C08090Vp r27, int i, C08080Vo r29) {
        long j;
        boolean z;
        int i2;
        C10520dR r4;
        C10520dR r12;
        long j2;
        Integer num2 = num;
        boolean z2 = false;
        if (AnonymousClass0WE.A00(num2) < AnonymousClass0WE.A00(Constants.A0C)) {
            z2 = true;
        }
        C07410Sz.A01(z2);
        C07990Vf r3 = this.A0l;
        String str2 = str;
        if (r3 == null || !r3.A06()) {
            if (r3 == null) {
                j = 0;
            } else {
                j = r3.A0U;
            }
            this.A09.A04("not_connected", str2, AnonymousClass0WE.A00(num2), 0, 0, (Throwable) null, j);
            return C11020eI.A00;
        }
        AnonymousClass0TV r5 = AnonymousClass0TV.A01;
        try {
            int andIncrement = C07990Vf.A0c.getAndIncrement() & 65535;
            AnonymousClass0VP r42 = r3.A0X;
            if (r42 != AnonymousClass0VP.CONNECTING) {
                z = false;
            }
            z = true;
            if (z) {
                if (r3.A0U > 0) {
                    j2 = SystemClock.elapsedRealtime() - r3.A0U;
                } else {
                    j2 = 0;
                }
                long j3 = ((long) this.A0B.A00().A0H) * 1000;
                long j4 = j3 - j2;
                if (j4 < 0) {
                    j4 = 0;
                } else if (j4 > j3) {
                    j4 = j3;
                }
                i2 = (int) (j4 / 1000);
            } else {
                i2 = 0;
            }
            int i3 = i + i2;
            if (num2 == Constants.ONE) {
                C08080Vo r6 = r29;
                if (r29 == null) {
                    r4 = this.A0L.A01(r3, str2, AnonymousClass0W6.PUBACK, andIncrement, i3);
                } else {
                    AnonymousClass0V4 r1 = this.A0L;
                    AnonymousClass0W6 r16 = AnonymousClass0W6.PUBACK;
                    C07410Sz.A00(r3);
                    C07990Vf r14 = r3;
                    r4 = new C10520dR(r14, str2, r16, andIncrement, SystemClock.elapsedRealtime());
                    synchronized (r1.A03) {
                        try {
                            r12 = (C10520dR) r1.A03.put(Integer.valueOf(r4.A01), r4);
                        } catch (Throwable th) {
                            while (true) {
                                th = th;
                                break;
                            }
                        }
                    }
                    if (r12 != null) {
                        r12.A00();
                        AnonymousClass0DB.A0J("MqttOperationManager", "operation/add/duplicate; id=%d, name=%s", Integer.valueOf(r12.A01), r12.A04.name());
                    }
                    C10720dl A032 = r1.A02.schedule(new AnonymousClass0V2(r1, r4), (long) i3, TimeUnit.SECONDS);
                    C07410Sz.A00(A032);
                    boolean z3 = false;
                    if (r4.A06 == null) {
                        z3 = true;
                    }
                    C07410Sz.A02(z3);
                    r4.A06 = A032;
                    C07410Sz.A00(r6);
                    boolean z4 = false;
                    if (r4.A07 == null) {
                        z4 = true;
                    }
                    C07410Sz.A02(z4);
                    r4.A07 = r6;
                }
            } else {
                String str3 = str2;
                r4 = new C10520dR(r3, str3, AnonymousClass0W6.PUBACK, andIncrement, SystemClock.elapsedRealtime());
                if (r4.A06 != null) {
                    r4.A06.cancel(false);
                }
                this.A09.A03(str3, AnonymousClass0WE.A00(num2), andIncrement, 0, r4.A01, r3.A0U);
            }
            synchronized (r3) {
                try {
                    if (r3.A06()) {
                        String str4 = str2;
                        AnonymousClass0Z9.A03(r3.A0J, new C07940Va(r3, str4, bArr, num2, andIncrement, r27, r5), 167031433);
                    } else {
                        throw new C08040Vk(Constants.ZERO);
                    }
                } catch (Throwable th2) {
                    th = th2;
                    throw th;
                }
            }
            if (!"/mqtt_health_stats".equals(str2) && num2 == Constants.ONE) {
                A08();
            }
            C07410Sz.A00(r4);
            return new C11010eH(r4);
        } catch (C08040Vk e) {
            AnonymousClass0DB.A0N("FbnsConnectionManager", e, "exception/publish");
            A0E(r3, C07450Td.SEND_FAILURE, C07880Uu.CONNECTION_LOST);
            PowerManager.WakeLock wakeLock = r5.A00;
            if (wakeLock != null) {
                AnonymousClass0ZP.A02(wakeLock);
            }
        } catch (Throwable unused) {
        }
        throw e;
    }

    public final void A07() {
        if (!this.A0I.BmT()) {
            A0D(C07450Td.KICK_SHOULD_NOT_CONNECT);
            return;
        }
        C07990Vf r2 = this.A0l;
        if (r2 == null) {
            A00(this);
        } else if (!r2.A06()) {
            A0E(r2, C07450Td.EXPIRE_CONNECTION, C07880Uu.DISCONNECTED);
            A00(this);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0010, code lost:
        if (r2.A0T.get() == false) goto L_0x0012;
     */
    public final void A08() {
        boolean z;
        this.A0H.A00();
        if (this.A0V) {
            z = true;
        }
        z = false;
        if (z) {
            this.A0H.A01();
        } else {
            this.A0F.A05();
        }
    }

    public final void A09() {
        C07770Uj r3 = new C07770Uj(this);
        this.A0a = r3;
        this.A03.registerReceiver(r3, new IntentFilter("android.os.action.POWER_SAVE_MODE_CHANGED"), (String) null, this.A04);
        C07780Uk r32 = new C07780Uk(this);
        this.A0Z = r32;
        this.A03.registerReceiver(r32, new IntentFilter("com.facebook.rti.mqtt.ACTION_MQTT_CONFIG_CHANGED"), (String) null, this.A04);
        AnonymousClass0UC r2 = this.A0C;
        C10660df r1 = this.A0i;
        synchronized (r2) {
            r2.A03.add(r1);
        }
        this.A0N.A03();
    }

    public final void A0A() {
        this.A0F.A03();
        this.A0H.A00();
        AnonymousClass0UE r3 = this.A0D;
        String str = "ScreenStateListener unregistration should be called on MqttThread. Current Looper:" + Looper.myLooper();
        if (!r3.A02.getLooper().equals(Looper.myLooper())) {
            Log.w(AnonymousClass0TH.class.getName(), str);
            if (!AnonymousClass0TH.A00) {
                throw new AssertionError(str);
            }
        }
        try {
            r3.A01.unregisterReceiver(r3.A00);
        } catch (IllegalArgumentException unused) {
        }
        r3.A04.set((Object) null);
        AnonymousClass0UC r2 = this.A0C;
        C10660df r1 = this.A0i;
        synchronized (r2) {
            r2.A03.remove(r1);
        }
        BroadcastReceiver broadcastReceiver = this.A0a;
        if (broadcastReceiver != null) {
            try {
                this.A03.unregisterReceiver(broadcastReceiver);
            } catch (IllegalArgumentException e) {
                AnonymousClass0DB.A0N("FbnsConnectionManager", e, "Failed to unregister broadcast receiver");
            }
            this.A0a = null;
        }
        BroadcastReceiver broadcastReceiver2 = this.A0Z;
        if (broadcastReceiver2 != null) {
            try {
                this.A03.unregisterReceiver(broadcastReceiver2);
            } catch (IllegalArgumentException e2) {
                AnonymousClass0DB.A0N("FbnsConnectionManager", e2, "Failed to unregister broadcast receiver");
            }
            this.A0Z = null;
        }
        this.A0N.A04();
        this.A0M.A04();
    }

    public final void A0B() {
        int AGa;
        if (this.A0T.get()) {
            AGa = this.A0G.AM2();
        } else {
            AGa = this.A0G.AGa();
        }
        if (this.A0U.getAndSet(AGa) != AGa) {
            A08();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0046, code lost:
        if (r2.A05() == false) goto L_0x0048;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000b, code lost:
        if (r5.A0T.get() == false) goto L_0x000d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x007f, code lost:
        if (r1 == false) goto L_0x0081;
     */
    public final void A0C(C07440Tc r6) {
        boolean z;
        boolean z2;
        boolean z3;
        if (this.A0V) {
            z = true;
        }
        z = false;
        if (z) {
            C07710Ud r1 = this.A0H;
            synchronized (r1) {
                if (!r1.A00) {
                    r1.A01();
                }
            }
        } else {
            C07680Ua r12 = this.A0F;
            synchronized (r12) {
                if (!r12.A03) {
                    r12.A05();
                } else {
                    SystemClock.elapsedRealtime();
                }
            }
        }
        if (!this.A0I.BmT()) {
            A0D(C07450Td.KICK_SHOULD_NOT_CONNECT);
            return;
        }
        C07990Vf r2 = this.A0l;
        if (r2 != null) {
            z2 = true;
        }
        z2 = false;
        if (!z2) {
            C07990Vf r0 = this.A0l;
            if (r0 != null) {
                boolean A062 = r0.A06();
                z3 = true;
            }
            z3 = false;
            if (z3) {
                return;
            }
        } else if (!((String) this.A0E.AOR().first).equals(r2.A0Y)) {
            A0D(C07450Td.AUTH_CREDENTIALS_CHANGE);
        } else if (this.A02 <= this.A0c) {
            return;
        }
        A0B();
        this.A0A.A0E = r6;
        C08220Wc r13 = this.A0P;
        synchronized (r13) {
            C08220Wc.A00(r13);
            r13.A02();
        }
    }

    public final void A0D(C07450Td r3) {
        C08220Wc r1 = this.A0P;
        synchronized (r1) {
            C08220Wc.A00(r1);
        }
        A0E(this.A0l, r3, C07880Uu.BY_REQUEST);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0060, code lost:
        if (r8.A05() == false) goto L_0x0062;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x007e, code lost:
        if (r8.A05() == false) goto L_0x0080;
     */
    public final void A0F(String str) {
        boolean z;
        boolean z2;
        C07990Vf r8 = this.A0l;
        try {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if ((elapsedRealtime - this.A0q) / 1000 >= ((long) this.A0B.A00().A0M)) {
                this.A0q = elapsedRealtime;
                AnonymousClass0XL.A02.A01 = str;
                if (this.A0W) {
                    if (this.A0T.get()) {
                        ((AtomicLong) ((AnonymousClass060) this.A0A.A07(AnonymousClass060.class)).A00(C10760dp.ForegroundPing)).incrementAndGet();
                    } else {
                        ((AtomicLong) ((AnonymousClass060) this.A0A.A07(AnonymousClass060.class)).A00(C10760dp.BackgroundPing)).incrementAndGet();
                    }
                    if (r8 != null) {
                        z2 = true;
                    }
                    z2 = false;
                    if (z2) {
                        A02(this, this.A0A.A05(SystemClock.elapsedRealtime() - r8.A0U), false);
                        return;
                    }
                    return;
                }
                if (r8 != null) {
                    z = true;
                }
                z = false;
                if (z) {
                    this.A0L.A01(r8, "callPing", AnonymousClass0W6.PINGRESP, -1, this.A0B.A00().A0I);
                    synchronized (r8) {
                        if (r8.A05()) {
                            AnonymousClass0Z9.A03(r8.A0J, new C07950Vb(r8), 1398772463);
                        } else {
                            throw new C08040Vk(Constants.ZERO);
                        }
                    }
                }
            }
        } catch (C08040Vk e) {
            AnonymousClass0DB.A0M("FbnsConnectionManager", e, "exception/send_keepalive");
            A0E(r8, C07450Td.SEND_FAILURE, C07880Uu.CONNECTION_LOST);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0049, code lost:
        if (r1 == false) goto L_0x004b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0064, code lost:
        if (r1 == false) goto L_0x0066;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x012a, code lost:
        if (r0.isConnected() == false) goto L_0x012c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0174, code lost:
        if (r1 == false) goto L_0x0176;
     */
    public static void A01(C07890Uv r7, Intent intent) {
        boolean z;
        int i;
        int i2;
        C07440Tc r0;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        String action = intent.getAction();
        if (C07390Sx.A00(action, "com.facebook.rti.mqtt.ACTION_MQTT_CONFIG_CHANGED")) {
            r7.A0B.A01();
            C07650Tx A002 = r7.A0B.A00();
            C07650Tx r4 = r7.A0k;
            if (A002.A0R.equals(r4.A0R) && A002.A0K == r4.A0K && A002.A07 == r4.A07 && A002.A0V == r4.A0V) {
                String str = A002.A0S;
                String str2 = r4.A0S;
                if (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) {
                    z5 = true;
                } else if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
                    z5 = false;
                } else {
                    z5 = str.equals(str2);
                }
                z3 = false;
            }
            z3 = true;
            r7.A0k = A002;
            if (z3) {
                r7.A0D(C07450Td.KICK_CONFIG_CHANGED);
            } else {
                C07990Vf r02 = r7.A0l;
                if (r02 != null) {
                    boolean A062 = r02.A06();
                    z4 = true;
                }
                z4 = false;
                if (z4) {
                    return;
                }
            }
            r0 = C07440Tc.CONFIG_CHANGED;
        } else if (C07390Sx.A00(action, "android.os.action.POWER_SAVE_MODE_CHANGED")) {
            try {
                if (r7.A0b == null) {
                    r7.A0b = PowerManager.class.getDeclaredMethod("isPowerSaveMode", new Class[0]);
                }
                C07400Sy A003 = r7.A08.A00("power", PowerManager.class);
                if (A003.A01()) {
                    String obj = r7.A0b.invoke(A003.A00(), new Object[0]).toString();
                    C07480Tg r42 = r7.A09;
                    Map A004 = C07200Sd.A00("pow", obj);
                    r42.A06("mqtt_device_state", A004);
                    AnonymousClass0T1 r03 = r42.A01;
                    if (r03 != null) {
                        r03.Aj4("mqtt_device_state", A004);
                        return;
                    }
                    return;
                }
                return;
            } catch (NoSuchMethodException e) {
                AnonymousClass0DB.A0N("FbnsConnectionManager", e, "exception/NoSuchMethodException");
                return;
            } catch (IllegalAccessException e2) {
                AnonymousClass0DB.A0N("FbnsConnectionManager", e2, "exception/IllegalAccessException");
                return;
            } catch (InvocationTargetException e3) {
                AnonymousClass0DB.A0N("FbnsConnectionManager", e3, "exception/InvocationTargetException");
                return;
            }
        } else if (C07390Sx.A00(action, "com.facebook.orca.ACTION_NETWORK_CONNECTIVITY_CHANGED")) {
            C07480Tg r6 = r7.A09;
            long j = r7.A0C.A05.get();
            NetworkInfo A022 = r7.A0C.A02();
            Map A005 = C07200Sd.A00(new String[0]);
            C07480Tg.A01(A005, j);
            C07480Tg.A00(r6, A005, A022);
            long j2 = r6.A03.A06.get();
            if (j2 != -1) {
                A005.put("dc_ms_ago", String.valueOf(j2));
            }
            r6.A06("mqtt_network_changed", A005);
            AnonymousClass0T1 r04 = r6.A01;
            if (r04 != null) {
                r04.Aj4("mqtt_network_changed", A005);
            }
            NetworkInfo A012 = r7.A0C.A01();
            if (A012 != null) {
                z = true;
            }
            z = false;
            NetworkInfo A023 = r7.A0C.A02();
            NetworkInfo.State state = NetworkInfo.State.DISCONNECTED;
            if (A023 != null) {
                i = A023.getType();
                i2 = A023.getSubtype();
                state = A023.getState();
                A023.getTypeName();
                A023.getSubtypeName();
                A023.getState();
            } else {
                i = 0;
                i2 = 0;
            }
            long hashCode = (long) Arrays.hashCode(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), state});
            if (hashCode == r7.A0Y) {
                C07990Vf r05 = r7.A0l;
                if (r05 != null) {
                    boolean A063 = r05.A06();
                    z2 = true;
                }
                z2 = false;
                if (z2) {
                    return;
                }
            }
            r7.A0Y = hashCode;
            r7.A02 = SystemClock.elapsedRealtime();
            if (z) {
                r0 = C07440Tc.CONNECTIVITY_CHANGED;
            } else {
                r7.A0F.A03();
                r7.A0H.A00();
                r7.A0D(C07450Td.NETWORK_LOST);
                return;
            }
        } else {
            return;
        }
        r7.A0C(r0);
    }
}
