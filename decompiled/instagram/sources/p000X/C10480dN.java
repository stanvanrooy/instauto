package p000X;

import android.content.Intent;
import android.net.NetworkInfo;
import android.os.IBinder;
import android.os.Looper;
import android.os.Process;
import android.os.SystemClock;
import com.facebook.common.dextricks.DexOptimizationMessageHandler;
import com.facebook.rti.common.time.RealtimeSinceBootClock;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.SocketAddress;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;

/* renamed from: X.0dN  reason: invalid class name and case insensitive filesystem */
public abstract class C10480dN extends C07910Ux {
    public long A00;
    public AnonymousClass0T1 A01;
    public C10960eC A02;
    public RealtimeSinceBootClock A03;
    public C07500Ti A04;
    public C07540Tm A05;
    public AnonymousClass0UC A06;
    public AnonymousClass0UE A07;
    public AnonymousClass0US A08;
    public C07890Uv A09;
    public C07930Uz A0A;
    public AtomicBoolean A0B = new AtomicBoolean(false);
    public AnonymousClass0VP A0C = AnonymousClass0VP.DISCONNECTED;
    public final C07870Ut A0D = new C10490dO(this);
    public volatile C07480Tg A0E;

    public final Looper A07() {
        return null;
    }

    public abstract C07930Uz A0C();

    public abstract Integer A0D();

    public String A0E() {
        return "N/A";
    }

    public void A0H() {
    }

    public void A0I() {
    }

    public void A0J() {
    }

    public void A0M(int i) {
    }

    public void A0N(Intent intent, AnonymousClass0VA r2) {
    }

    public void A0Q(AnonymousClass0VO r1) {
    }

    public void A0R(AnonymousClass0WB r1) {
    }

    public void A0S(String str, byte[] bArr, int i, long j, AnonymousClass0TV r6) {
    }

    public boolean A0U(Intent intent) {
        return true;
    }

    public IBinder onBind(Intent intent) {
        return null;
    }

    public static String A04(C10480dN r4) {
        long j;
        C07990Vf r1 = r4.A09.A0l;
        if (r1 == null || !r1.A05()) {
            j = 0;
        } else {
            j = SystemClock.elapsedRealtime() - r1.A0U;
        }
        C07510Tj A062 = r4.A05.A06(j, false);
        try {
            return C07510Tj.A00(A062, A062.A00).toString(2);
        } catch (JSONException unused) {
            return "";
        }
    }

    private void A05(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("event", str);
        hashMap.put("pid", String.valueOf(Process.myPid()));
        this.A01.Aj4("life_cycle", hashMap);
    }

    public final void A08() {
        boolean z = false;
        if (this.A0A == null) {
            z = true;
        }
        C07410Sz.A02(z);
        this.A0A = A0C();
        A0G();
        A0F();
        this.A01.Bkz(new C10500dP(this));
        A05("doCreate");
        C07480Tg r2 = this.A0E;
        String A0E2 = AnonymousClass000.A0E(AnonymousClass0VH.A00(A0D()), ".SERVICE_CREATE");
        String A0E3 = A0E();
        C11020eI r6 = C11020eI.A00;
        r2.A05(A0E2, A0E3, (String) null, r6, r6, this.A0B.get(), this.A06.A05.get(), this.A06.A02());
    }

    public void A09() {
        C07480Tg r2 = this.A0E;
        String A0E2 = AnonymousClass000.A0E(AnonymousClass0VH.A00(A0D()), ".SERVICE_DESTROY");
        String A0E3 = A0E();
        C11020eI r6 = C11020eI.A00;
        r2.A05(A0E2, A0E3, (String) null, r6, r6, this.A0B.get(), this.A06.A05.get(), this.A06.A02());
        A05("doDestroy");
        this.A01.Bkz((C10500dP) null);
        A0L();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0109, code lost:
        if ("Orca.PERSISTENT_KICK_SKIP_PING".equals(r2.getAction()) != false) goto L_0x010b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0132, code lost:
        if (r4 == false) goto L_0x0134;
     */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0084  */
    public final void A0A(Intent intent, int i, int i2) {
        String str;
        boolean z;
        boolean z2;
        C07990Vf r2;
        long j;
        C07440Tc r0;
        boolean z3;
        boolean z4;
        Intent intent2 = intent;
        HashMap hashMap = new HashMap();
        if (intent == null) {
            hashMap.put("intent", (Object) null);
        } else {
            hashMap.put("action", intent2.getAction());
            String stringExtra = intent2.getStringExtra("caller");
            if (stringExtra != null) {
                hashMap.put("caller", stringExtra);
            }
        }
        this.A01.Aj4("start_command", hashMap);
        if (!A0U(intent2)) {
            intent2 = null;
        }
        Integer num = null;
        C10980eE A002 = this.A02.A00(Constants.A04);
        if (A002.A00.contains("DELIVERY_RETRY_INTERVAL")) {
            num = Integer.valueOf(A002.A00.getInt("DELIVERY_RETRY_INTERVAL", DexOptimizationMessageHandler.DEFAULT_RESTART_IMPORTANCE_THRESHOLD));
        }
        AnonymousClass0VA r1 = new AnonymousClass0VA((Boolean) null, num);
        if (intent2 != null) {
            if (intent2 != null) {
                if (intent2.hasExtra("caller")) {
                    r1.A03 = intent2.getStringExtra("caller");
                }
                if (intent2.hasExtra("EXPIRED_SESSION")) {
                    r1.A00 = intent2.getLongExtra("EXPIRED_SESSION", 0);
                }
                if (intent2.hasExtra("DELIVERY_RETRY_INTERVAL")) {
                    Integer valueOf = Integer.valueOf(intent2.getIntExtra("DELIVERY_RETRY_INTERVAL", DexOptimizationMessageHandler.DEFAULT_RESTART_IMPORTANCE_THRESHOLD));
                    if (!valueOf.equals(r1.A02)) {
                        r1.A02 = valueOf;
                        z3 = true;
                        if (z3) {
                            C11000eG A003 = this.A0A.A03.A00(Constants.A04).A00();
                            Integer num2 = r1.A02;
                            if (num2 != null) {
                                A003.A00.putInt("DELIVERY_RETRY_INTERVAL", num2.intValue());
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            if (z4) {
                                A003.A00.apply();
                            }
                        }
                        str = intent2.getAction();
                    }
                }
            }
            z3 = false;
            if (z3) {
            }
            str = intent2.getAction();
        } else {
            str = "NULL";
        }
        Integer valueOf2 = Integer.valueOf(i);
        Integer valueOf3 = Integer.valueOf(i2);
        C07480Tg r8 = this.A0E;
        String A032 = AnonymousClass000.A03(AnonymousClass0VH.A00(A0D()), '.', str);
        String A0E2 = A0E();
        String str2 = r1.A03;
        C07410Sz.A00(valueOf2);
        C11010eH r12 = new C11010eH(valueOf2);
        C07410Sz.A00(valueOf3);
        r8.A05(A032, A0E2, str2, r12, new C11010eH(valueOf3), this.A0B.get(), this.A06.A05.get(), this.A06.A02());
        if (intent2 != null && !"Orca.PERSISTENT_KICK".equals(intent2.getAction())) {
            z = false;
        }
        z = true;
        if (!z) {
            String action = intent2.getAction();
            if ("Orca.STOP".equals(action)) {
                A0P(C07450Td.SERVICE_STOP);
                stopSelf();
            } else if ("Orca.START".equals(action)) {
                A0O(C07440Tc.SERVICE_START, r1);
            } else if ("Orca.EXPIRE_CONNECTION".equals(action)) {
                C07890Uv r6 = this.A09;
                long j2 = r1.A00;
                C07990Vf r3 = r6.A0l;
                r6.A0A.A0E = C07440Tc.EXPIRE_CONNECTION;
                if (r3 == null || r3.A0U != j2) {
                    r6.A07();
                    return;
                }
                r6.A0E(r3, C07450Td.EXPIRE_CONNECTION, C07880Uu.STALED_CONNECTION);
                C07890Uv.A00(r6);
            } else {
                A0N(intent2, r1);
            }
        } else if (!this.A0B.get()) {
            if (intent2 == null) {
                r0 = C07440Tc.SERVICE_RESTART;
            } else {
                r0 = C07440Tc.PERSISTENT_KICK;
            }
            A0O(r0, r1);
        } else {
            if (A0T()) {
                C07990Vf r02 = this.A09.A0l;
                if (r02 != null) {
                    boolean A052 = r02.A05();
                    z2 = true;
                }
                z2 = false;
                if (z2) {
                    if (intent2 != null && "Orca.PERSISTENT_KICK".equals(intent2.getAction())) {
                        C07890Uv r7 = this.A09;
                        String str3 = r1.A03;
                        int i3 = r7.A0B.A00().A0D;
                        if (i3 >= 0 && (r2 = r7.A0l) != null) {
                            long elapsedRealtime = SystemClock.elapsedRealtime();
                            synchronized (r2) {
                                j = r2.A0Q;
                            }
                            if (elapsedRealtime - j > ((long) i3) * 1000) {
                                r7.A0F(str3);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
            }
            this.A09.A0C(C07440Tc.PERSISTENT_KICK);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:57:0x016b, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x016d, code lost:
        throw r0;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    public void A0B(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        String valueOf;
        HashSet hashSet;
        String str;
        String str2;
        SocketAddress remoteSocketAddress;
        try {
            printWriter.println("[ MqttPushService ]");
            printWriter.println(AnonymousClass000.A0E("persistence=", A0E()));
            long j = this.A09.A02;
            if (j > 0) {
                valueOf = new Date(j).toString();
            } else {
                valueOf = String.valueOf(j);
            }
            printWriter.println(AnonymousClass000.A0E("networkChangedTime=", valueOf));
            StringBuilder sb = new StringBuilder();
            sb.append("subscribedTopics=");
            C07890Uv r0 = this.A09;
            synchronized (r0.A0R) {
                try {
                    hashSet = new HashSet(r0.A0R.keySet());
                } catch (Throwable th) {
                    while (true) {
                        th = th;
                        break;
                    }
                }
            }
            sb.append(hashSet);
            printWriter.println(sb.toString());
            if (!(!this.A0A.A06.A02)) {
                C07890Uv r5 = this.A09;
                printWriter.println("[ FbnsConnectionManager ]");
                printWriter.println("keepAliveIntervalSeconds=" + r5.A0U);
                NetworkInfo A012 = r5.A0C.A01();
                if (A012 != null) {
                    str = A012.toString();
                } else {
                    str = "null";
                }
                printWriter.println(AnonymousClass000.A0E("networkInfo=", str));
                if (r5.A0o != null) {
                    printWriter.println(AnonymousClass000.A0E("lastConnectLostTime=", new Date((System.currentTimeMillis() + r5.A0j) - SystemClock.elapsedRealtime()).toString()));
                    printWriter.println(AnonymousClass000.A0E("lastConnectLostReason=", r5.A0o));
                }
                C07990Vf r52 = r5.A0l;
                if (r52 != null) {
                    synchronized (r52) {
                        printWriter.println("[ MqttClient ]");
                        printWriter.println("state=" + r52.A0X);
                        printWriter.println(AnonymousClass000.A0E("lastMessageSent=", C07990Vf.A01(r52, r52.A0S)));
                        printWriter.println(AnonymousClass000.A0E("lastMessageReceived=", C07990Vf.A01(r52, r52.A0R)));
                        printWriter.println(AnonymousClass000.A0E("connectionEstablished=", C07990Vf.A01(r52, r52.A0P)));
                        printWriter.println(AnonymousClass000.A0E("lastPing=", C07990Vf.A01(r52, r52.A0T)));
                        C10410dG r3 = r52.A0D;
                        synchronized (r3) {
                            Socket socket = r3.A05;
                            if (socket == null || (remoteSocketAddress = socket.getRemoteSocketAddress()) == null) {
                                str2 = "N/A";
                            } else {
                                String str3 = r3.A02;
                                if (str3 != null) {
                                    str2 = AnonymousClass000.A0J(str3, "|", remoteSocketAddress.toString());
                                } else {
                                    str2 = remoteSocketAddress.toString();
                                }
                            }
                        }
                        printWriter.println(AnonymousClass000.A0E("peer=", str2));
                    }
                } else {
                    printWriter.println("mMqttClient=null");
                }
                printWriter.println("[ MqttHealthStats ]");
                printWriter.println(A04(this));
            }
        } catch (Exception unused) {
        }
    }

    public void A0F() {
        C07540Tm r3 = this.A05;
        C07530Tl r0 = C07530Tl.A01;
        C07540Tm.A04(r3, r0).set(SystemClock.elapsedRealtime());
    }

    public void A0G() {
        C07930Uz r0 = this.A0A;
        C07890Uv r9 = r0.A0N;
        AnonymousClass0UC r8 = r0.A0H;
        C10700dj r7 = r0.A0J;
        RealtimeSinceBootClock realtimeSinceBootClock = r0.A04;
        C07480Tg r5 = r0.A0A;
        C07540Tm r4 = r0.A0C;
        AnonymousClass0UE r3 = r0.A0I;
        C07500Ti r2 = r0.A0B;
        AnonymousClass0T1 r1 = r0.A02;
        C10960eC r02 = r0.A03;
        this.A09 = r9;
        this.A06 = r8;
        this.A08 = r7;
        this.A03 = realtimeSinceBootClock;
        this.A0E = r5;
        this.A05 = r4;
        this.A07 = r3;
        this.A04 = r2;
        this.A01 = r1;
        this.A02 = r02;
    }

    public final void A0K() {
        AnonymousClass0VP r4;
        AnonymousClass0VP r0;
        C07990Vf r02 = this.A09.A0l;
        if (r02 == null) {
            r4 = AnonymousClass0VP.DISCONNECTED;
        } else {
            r4 = r02.A0X;
        }
        if (r4 != null && r4 != (r0 = this.A0C)) {
            this.A01.Aj2(AnonymousClass000.A0N("[state_machine] ", r0.toString(), " -> ", r4.toString()));
            this.A0C = r4;
            this.A04.A01(r4.name());
        }
    }

    public final void A0L() {
        if (this.A0B.get()) {
            A0P(C07450Td.SERVICE_DESTROY);
        }
        C07890Uv r1 = this.A09;
        if (r1 != null) {
            r1.A0D(C07450Td.SERVICE_DESTROY);
        }
        C07930Uz r4 = this.A0A;
        if (r4 != null && !r4.A0V) {
            r4.A0V = true;
            C07710Ud r3 = r4.A0L;
            if (r3 != null) {
                synchronized (r3) {
                    r3.A00();
                    if (r3.A01) {
                        boolean z = false;
                        if (!r3.A08.A06(r3.A06, r3.A05)) {
                            z = true;
                        }
                        r3.A01 = z;
                    }
                }
            }
            AnonymousClass0UC r32 = r4.A0H;
            if (r32 != null) {
                synchronized (r32) {
                    try {
                        r32.A01.unregisterReceiver(r32.A00);
                    } catch (IllegalArgumentException e) {
                        AnonymousClass0DB.A0N("MqttNetworkManager", e, "Failed to unregister broadcast receiver");
                    }
                }
            }
            AnonymousClass00Q r0 = r4.A0F;
            if (r0 != null) {
                r0.shutdown();
            }
            C07680Ua r02 = r4.A0K;
            if (r02 != null) {
                r02.A04();
                return;
            }
            return;
        }
        return;
    }

    public final void A0O(C07440Tc r5, AnonymousClass0VA r6) {
        Integer num;
        if (!this.A0B.getAndSet(true)) {
            if (!(r6 == null || (num = r6.A02) == null)) {
                A0M(num.intValue());
            }
            C07540Tm r0 = this.A05;
            String name = r5.name();
            C07560To r3 = r0.A00;
            if (r3.A07 == null) {
                r3.A07 = name;
                r3.A04.set(SystemClock.elapsedRealtime());
                r3.A02.set(SystemClock.elapsedRealtime());
            }
            A0I();
            this.A09.A09();
        }
        this.A09.A0C(r5);
    }

    public final void A0P(C07450Td r4) {
        if (!this.A0B.getAndSet(false)) {
            AnonymousClass0DB.A0E("MqttPushService", "service/stop/inactive_connection");
            return;
        }
        A0J();
        this.A09.A0A();
        this.A09.A0D(r4);
        A0K();
    }

    public final boolean A0T() {
        if (!this.A0B.get()) {
            this.A01.Aj2("MqttPushService/not_started");
            return false;
        }
        HashMap hashMap = new HashMap();
        if (this.A08.BmU(hashMap)) {
            return true;
        }
        this.A01.Aj4("MqttPushService/should_not_connect", hashMap);
        return false;
    }

    public final void onDestroy() {
        int A042 = AnonymousClass0Z0.A04(-729803162);
        if (this.A0E != null) {
            C07480Tg r3 = this.A0E;
            String A0E2 = AnonymousClass000.A0E(AnonymousClass0VH.A00(A0D()), ".SERVICE_ON_DESTROY");
            String A0E3 = A0E();
            C11020eI r7 = C11020eI.A00;
            r3.A05(A0E2, A0E3, (String) null, r7, r7, this.A0B.get(), 0, (NetworkInfo) null);
        }
        super.onDestroy();
        AnonymousClass0Z0.A0B(-392270703, A042);
    }
}
