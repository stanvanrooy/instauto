package p000X;

import android.net.NetworkInfo;
import android.os.SystemClock;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.facebook.rti.common.time.RealtimeSinceBootClock;
import java.util.Date;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.0Vf  reason: invalid class name and case insensitive filesystem */
public final class C07990Vf {
    public static final EnumSet A0b = EnumSet.of(C07980Ve.ACKNOWLEDGED_DELIVERY, new C07980Ve[]{C07980Ve.PROCESSING_LASTACTIVE_PRESENCEINFO, C07980Ve.EXACT_KEEPALIVE, C07980Ve.DELTA_SENT_MESSAGE_ENABLED, C07980Ve.USE_THRIFT_FOR_INBOX, C07980Ve.USE_ENUM_TOPIC});
    public static final AtomicInteger A0c = new AtomicInteger(1);
    public int A00;
    public List A01;
    public final C11030eJ A02;
    public final RealtimeSinceBootClock A03;
    public final AnonymousClass0TQ A04;
    public final AnonymousClass0TQ A05;
    public final AnonymousClass0TW A06;
    public final C07460Te A07;
    public final C07480Tg A08;
    public final C07500Ti A09;
    public final C07540Tm A0A;
    public final AnonymousClass0UC A0B;
    public final AnonymousClass0UU A0C;
    public final C10410dG A0D;
    public final C10390dE A0E = new C10390dE(this);
    public final C10380dD A0F;
    public final C08070Vn A0G;
    public final Long A0H;
    public final Map A0I = new HashMap();
    public final ExecutorService A0J;
    public final AtomicInteger A0K;
    public final boolean A0L;
    public final boolean A0M;
    public final C10400dF A0N = new C10400dF(this);
    public volatile long A0O;
    public volatile long A0P = Long.MAX_VALUE;
    public volatile long A0Q = Long.MAX_VALUE;
    public volatile long A0R = Long.MAX_VALUE;
    public volatile long A0S = Long.MAX_VALUE;
    public volatile long A0T = Long.MAX_VALUE;
    public volatile long A0U;
    public volatile NetworkInfo A0V;
    public volatile C10630dc A0W;
    public volatile AnonymousClass0VP A0X = AnonymousClass0VP.DISCONNECTED;
    public volatile String A0Y;
    public volatile String A0Z = NetInfoModule.CONNECTION_TYPE_NONE;
    public volatile boolean A0a;

    public static synchronized void A04(C07990Vf r3, C07450Td r4, C08110Vr r5, Throwable th) {
        synchronized (r3) {
            if (r3.A06()) {
                AnonymousClass0Z9.A01(r3.A0J, new C07960Vc(r3, r4, r5, th), -555131673);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0015, code lost:
        if (r2 == p000X.AnonymousClass0VP.A03) goto L_0x0017;
     */
    public static void A02(C07990Vf r9) {
        boolean z;
        long j = (long) (r9.A0G.A03 * 1000);
        synchronized (r9) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            while (true) {
                AnonymousClass0VP r2 = r9.A0X;
                if (r2 != AnonymousClass0VP.CONNECTING) {
                    z = false;
                }
                z = true;
                if (!z) {
                    break;
                }
                long elapsedRealtime2 = j - (SystemClock.elapsedRealtime() - elapsedRealtime);
                if (elapsedRealtime2 <= 0) {
                    break;
                }
                r9.wait(elapsedRealtime2);
            }
        }
    }

    /* JADX WARNING: type inference failed for: r19v2, types: [X.0eI] */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0087, code lost:
        if (r28 != null) goto L_0x00cc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0089, code lost:
        r19 = p000X.C11020eI.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x008b, code lost:
        r24 = r4.A0U;
        r1 = r4.A0B.A05.get();
        r11 = r4.A0V;
        r0 = r4.A04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x009b, code lost:
        if (r0 != null) goto L_0x00c1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x009d, code lost:
        r18 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x009f, code lost:
        r10 = new java.util.HashMap();
        r13 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x00b2, code lost:
        if (android.provider.Settings.Global.getInt(r8.A00.getContentResolver(), "airplane_mode_on", 0) != 0) goto L_0x00b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x00b4, code lost:
        r13 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x00b5, code lost:
        r10.put("is_airplane_mode_on", java.lang.String.valueOf(r13));
        r9 = r8.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x00c1, code lost:
        r18 = ((java.lang.Boolean) r0.get()).booleanValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00cc, code lost:
        r0 = new p000X.C11010eH(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        r15 = r9.A00.registerReceiver((android.content.BroadcastReceiver) null, new android.content.IntentFilter("android.intent.action.BATTERY_CHANGED"));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00e2, code lost:
        if (r15 != null) goto L_0x00e7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00e4, code lost:
        r12 = p000X.C11020eI.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00e7, code lost:
        r9 = r15.getIntExtra(com.instagram.realtimeclient.RealtimeProtocol.USERS_ACCOUNT_STATUS, -1);
        r13 = true;
        r12 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00f2, code lost:
        if (r9 != 2) goto L_0x00f5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00f4, code lost:
        r12 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00f6, code lost:
        if (r9 == 5) goto L_0x00f9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00f8, code lost:
        r13 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00f9, code lost:
        r9 = r15.getIntExtra("level", -1);
        r0 = r15.getIntExtra("scale", -1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0106, code lost:
        if (r9 == -1) goto L_0x012b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0108, code lost:
        if (r0 == -1) goto L_0x012b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x010a, code lost:
        r9 = java.lang.Integer.valueOf((int) ((((float) r9) / ((float) r0)) * 100.0f));
        p000X.C07410Sz.A00(r9);
        r14 = new p000X.AnonymousClass0U9(r12, r13, new p000X.C11010eH(r9));
        p000X.C07410Sz.A00(r14);
        r12 = new p000X.C11010eH(r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x012b, code lost:
        r9 = new p000X.AnonymousClass0U9(r12, r13, p000X.C11020eI.A00);
        p000X.C07410Sz.A00(r9);
        r12 = new p000X.C11010eH(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x013b, code lost:
        r12 = p000X.C11020eI.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0013, code lost:
        ((p000X.AnonymousClass064) r4.A0A.A07(p000X.AnonymousClass064.class)).A02(p000X.C10890e2.A07, r26.name());
        r4.A0A.A00.A02.set(android.os.SystemClock.elapsedRealtime());
        ((java.util.concurrent.atomic.AtomicLong) ((p000X.AnonymousClass060) r4.A0A.A07(p000X.AnonymousClass060.class)).A00(p000X.C10760dp.MqttTotalDurationMs)).addAndGet(android.os.SystemClock.elapsedRealtime() - r4.A0U);
        r8 = r4.A08;
        r23 = r4.A00(r4.A0P);
        r22 = r4.A00(r4.A0T);
        r17 = r4.A00(r4.A0S);
        r16 = r4.A00(r4.A0R);
        r21 = r26.toString();
        r0 = r21;
        p000X.C07410Sz.A00(r0);
        r7 = new p000X.C11010eH(r0);
        r20 = r27.toString();
        r0 = r20;
        p000X.C07410Sz.A00(r0);
        r6 = new p000X.C11010eH(r0);
        r5 = r28;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    public static void A03(C07990Vf r25, C07450Td r26, C08110Vr r27, Throwable th) {
        C10630dc r3;
        C07480Tg r8;
        C07400Sy A002;
        C07400Sy A003;
        C07400Sy A004;
        C07400Sy A005;
        String r21;
        C11010eH r7;
        String r20;
        C11010eH r6;
        Throwable th2;
        C11010eH r19;
        long j;
        long j2;
        NetworkInfo networkInfo;
        boolean booleanValue;
        HashMap hashMap;
        C07400Sy r12;
        C07990Vf r4 = r25;
        synchronized (r4) {
            if (r4.A06()) {
                r3 = r4.A0W;
                r4.A0D.A03();
            } else {
                return;
            }
        }
        if (r12.A01()) {
            if (((AnonymousClass0U9) r12.A00()).A01 || ((AnonymousClass0U9) r12.A00()).A02) {
                hashMap.put("bat", "crg");
            } else if (((AnonymousClass0U9) r12.A00()).A00.A01()) {
                hashMap.put("bat", String.valueOf(((AnonymousClass0U9) r12.A00()).A00.A00()));
            }
        }
        if (A002.A01()) {
            hashMap.put("connected_duration_ms", ((Long) A002.A00()).toString());
        }
        if (A003.A01()) {
            hashMap.put("last_ping_ms_ago", ((Long) A003.A00()).toString());
        }
        if (A004.A01()) {
            hashMap.put("last_sent_ms_ago", ((Long) A004.A00()).toString());
        }
        if (A005.A01()) {
            hashMap.put("last_received_ms_ago", ((Long) A005.A00()).toString());
        }
        boolean A012 = r7.A01();
        if (A012) {
            hashMap.put("reason", r7.A00());
        }
        boolean A013 = r6.A01();
        if (A013) {
            hashMap.put("operation", r6.A00());
        }
        C11010eH r0 = r19;
        boolean A014 = r0.A01();
        if (A014) {
            hashMap.put("exception", ((Throwable) r0.A00()).getClass().getSimpleName());
            hashMap.put("error_message", ((Throwable) r19.A00()).getMessage());
        }
        hashMap.put("fs", String.valueOf(booleanValue));
        hashMap.put("mqtt_session_id", Long.toString(j));
        C07480Tg.A01(hashMap, j2);
        C07480Tg.A00(r8, hashMap, networkInfo);
        r8.A06("mqtt_disconnection_on_failure", hashMap);
        if (r8.A01 != null) {
            HashMap hashMap2 = new HashMap();
            if (A012) {
                hashMap2.put("reason", r7.A00());
            }
            if (A013) {
                hashMap2.put("operation", r6.A00());
            }
            if (A014) {
                hashMap2.put("exception", ((Throwable) r19.A00()).getClass().getSimpleName());
            }
            C07480Tg.A00(r8, hashMap2, r8.A03.A02());
            r8.A01.Aj4("mqtt_disconnection_on_failure", hashMap2);
        }
        if (r3 != null) {
            r26.toString();
            r27.toString();
            String A0J2 = AnonymousClass000.A0J(r21, "@", r20);
            r3.A01.A0j = SystemClock.elapsedRealtime();
            r3.A01.A0o = A0J2;
            AnonymousClass0ZA.A0E(r3.A01.A04, new C07830Up(r3), -1948040727);
            C07450Td r02 = r26;
            if (r02 == C07450Td.READ_FAILURE_UNCLASSIFIED || r02 == C07450Td.WRITE_FAILURE_UNCLASSIFIED) {
                r26.toString();
                r3.A01(th2);
            }
        }
        r4.A0P = Long.MAX_VALUE;
        r4.A0T = Long.MAX_VALUE;
        r4.A0S = Long.MAX_VALUE;
        r4.A0R = Long.MAX_VALUE;
        r4.A0Q = Long.MAX_VALUE;
    }

    public final boolean A05() {
        if (this.A0X == AnonymousClass0VP.CONNECTED) {
            return true;
        }
        return false;
    }

    public final boolean A06() {
        AnonymousClass0VP r2 = this.A0X;
        if (r2 == AnonymousClass0VP.CONNECTED || r2 == AnonymousClass0VP.CONNECTING || r2 == AnonymousClass0VP.CONNECT_SENT) {
            return true;
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[MqttClient (");
        C08070Vn r1 = this.A0G;
        sb.append(r1.A00);
        sb.append(":");
        sb.append(this.A00);
        if (r1.A0L) {
            sb.append(" +ssl");
        }
        sb.append(") ");
        sb.append(this.A0X);
        sb.append("]");
        return sb.toString();
    }

    public C07990Vf(AnonymousClass0UC r5, AnonymousClass0TW r6, C07480Tg r7, C07540Tm r8, C08070Vn r9, RealtimeSinceBootClock realtimeSinceBootClock, ExecutorService executorService, C07500Ti r12, C11030eJ r13, C10380dD r14, AnonymousClass0UU r15, C07460Te r16, C10410dG r17, AnonymousClass0TQ r18, AnonymousClass0TQ r19, boolean z, Long l) {
        String str;
        boolean z2 = false;
        this.A0K = new AtomicInteger(0);
        this.A0B = r5;
        this.A06 = r6;
        this.A08 = r7;
        this.A0A = r8;
        this.A0G = r9;
        this.A03 = realtimeSinceBootClock;
        this.A0J = executorService;
        this.A09 = r12;
        this.A02 = r13;
        this.A0F = r14;
        this.A0C = r15;
        this.A07 = r16;
        C10410dG r3 = r17;
        this.A0D = r3;
        this.A05 = r18;
        C10390dE r2 = this.A0E;
        C10400dF r0 = this.A0N;
        r3.A0I = r2;
        r3.A0H = r0;
        AnonymousClass0UU r02 = this.A0C;
        String AId = r02.AId();
        if ("".equals(r02.AIF()) && (str = this.A0G.A0F) != null && AId.equals(str)) {
            z2 = true;
        }
        this.A0M = z2;
        this.A04 = r19;
        this.A0L = z;
        this.A0H = l;
    }

    private C07400Sy A00(long j) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (j > elapsedRealtime) {
            return C11020eI.A00;
        }
        Long valueOf = Long.valueOf(elapsedRealtime - j);
        C07410Sz.A00(valueOf);
        return new C11010eH(valueOf);
    }

    public static String A01(C07990Vf r1, long j) {
        C07400Sy A002 = r1.A00(j);
        if (A002.A01()) {
            return new Date(System.currentTimeMillis() - ((Long) A002.A00()).longValue()).toString();
        }
        return "N/A";
    }
}
