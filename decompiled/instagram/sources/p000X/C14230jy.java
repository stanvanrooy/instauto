package p000X;

import android.content.Context;
import android.os.Build;
import com.facebook.proxygen.utils.LigerInitializationException;
import java.lang.reflect.Field;
import java.net.Proxy;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/* renamed from: X.0jy  reason: invalid class name and case insensitive filesystem */
public final class C14230jy implements C11590fD {
    public C11590fD A00;
    public C13960jX A01;
    public final Context A02;

    public C14230jy(Context context, C06590Pq r3, C13960jX r4) {
        this.A02 = context.getApplicationContext();
        this.A01 = r4;
        this.A00 = new C14240jz(this, context, r3);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x005c, code lost:
        if (r2 != false) goto L_0x005e;
     */
    public final /* bridge */ /* synthetic */ Object get() {
        boolean z;
        C12670hC.A01();
        C14270kA r0 = (C14270kA) this.A00.get();
        int intValue = ((Integer) C05640Lj.A00(AnonymousClass0L7.MOBILE_HTTP_FLOW_DEVICE, "sampling_weight", 10000)).intValue();
        r0.A0B = C14300kE.A00();
        r0.A09 = "";
        r0.A00 = intValue;
        if (((Boolean) C05640Lj.A00(AnonymousClass0L7.FIZZ_IG_ANDROID, "is_enabled", false)).booleanValue()) {
            boolean z2 = C05770Lw.A00().A00.getBoolean("debug_disable_liger_fizz", false);
            if (!z2 && C05770Lw.A02.contains("debug_disable_liger_fizz")) {
                z2 = true;
            }
            z = true;
        }
        z = false;
        r0.A0I = z;
        C13960jX r1 = this.A01;
        if (r1 != null) {
            r0.A08 = r1;
        }
        r0.A0E = true;
        r0.A0F = true;
        AnonymousClass0L7 r2 = AnonymousClass0L7.SONAR_PROBER;
        if (((Boolean) C05640Lj.A00(r2, "is_enabled", true)).booleanValue()) {
            int intValue2 = ((Integer) C05640Lj.A00(r2, "pop_sample_rate", 50000)).intValue();
            String str = (String) C05640Lj.A00(r2, "pop_info_endpoint", "https://graph.facebook.com/glb_map");
            String str2 = str;
            AnonymousClass0L7 r3 = AnonymousClass0L7.SONAR_PROBER;
            String str3 = (String) C05640Lj.A00(r3, "pop_info_params", "access_token=432827354065804|cb9c2da18237a3bb72878cc3a28019ad&get_all_clusters=true");
            String str4 = str3;
            int intValue3 = ((Integer) C05640Lj.A00(r3, "fna_sample_rate", 50000)).intValue();
            String str5 = (String) C05640Lj.A00(r3, "fna_info_endpoint", "https://graph.facebook.com/glb_map");
            String str6 = str5;
            String str7 = (String) C05640Lj.A00(r3, "fna_info_params", "access_token=432827354065804|cb9c2da18237a3bb72878cc3a28019ad&get_fna_candidates=true");
            String str8 = str7;
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = AnonymousClass0O5.A00().A00;
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor2 = scheduledThreadPoolExecutor;
            C14390kP r8 = new C14390kP();
            if (scheduledThreadPoolExecutor == null) {
                throw new NullPointerException("mScheduledExecutorService == null");
            } else if (intValue2 == -1) {
                throw new IllegalArgumentException("mPopLatencySampleRate == -1");
            } else if (str == null) {
                throw new NullPointerException("mPopLatencyInfoEndpoint == null");
            } else if (str3 == null) {
                throw new NullPointerException("mPopLatencyInfoParams == null");
            } else if (intValue3 == -1) {
                throw new IllegalArgumentException("mFnaLatencySampleRate == -1");
            } else if (str5 == null) {
                throw new NullPointerException("mFnaLatencyInfoEndpoint == null");
            } else if (str7 != null) {
                r0.A07 = new C14410kR(new C14400kQ(intValue2, str2, str4, 0, 0), new C14400kQ(intValue3, str6, str8, 0, 0), new C14400kQ(0, (String) null, (String) null, -1, -1), new C14400kQ(0, (String) null, (String) null, -1, -1), scheduledThreadPoolExecutor2, r8);
            } else {
                throw new NullPointerException("mFnaLatencyInfoParams == null");
            }
        }
        if (C05770Lw.A00().A0D()) {
            r0.A0D = true;
        }
        try {
            Context context = r0.A0P;
            String str9 = r0.A0B;
            boolean z3 = r0.A0I;
            String str10 = r0.A09;
            boolean z4 = r0.A0E;
            boolean z5 = r0.A0F;
            C13960jX r23 = r0.A08;
            C14410kR r19 = r0.A07;
            boolean z6 = r0.A0D;
            int i = r0.A00;
            boolean z7 = r0.A0G;
            boolean z8 = r0.A0J;
            boolean z9 = r0.A0N;
            boolean z10 = r0.A0M;
            C14410kR r24 = r19;
            boolean z11 = z6;
            int i2 = i;
            return new C14430kT(context, str9, z3, str10, z4, z5, r23, r24, z11, i2, z7, z8, z9, z10, r0.A0A, r0.A03, r0.A0O, r0.A06, r0.A01, r0.A05, r0.A02, r0.A0L, r0.A0K, r0.A04, r0.A0C, r0.A0H);
        } catch (LigerInitializationException | UnsatisfiedLinkError e) {
            AnonymousClass0QD.A09("liger_load_error", e);
            Proxy proxy = Proxy.NO_PROXY;
            int i3 = Build.VERSION.SDK_INT;
            if (i3 == 19) {
                try {
                    Class<?> cls = Class.forName("com.android.okhttp.ConnectionPool");
                    Field declaredField = cls.getDeclaredField("systemDefault");
                    declaredField.setAccessible(true);
                    Object obj = declaredField.get((Object) null);
                    Field declaredField2 = cls.getDeclaredField("maxIdleConnections");
                    declaredField2.setAccessible(true);
                    declaredField2.set(obj, 100);
                } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException unused) {
                }
            } else if (i3 < 29) {
                try {
                    Field declaredField3 = Class.forName("com.android.okhttp.ConfigAwareConnectionPool").getDeclaredField("CONNECTION_POOL_MAX_IDLE_CONNECTIONS");
                    declaredField3.setAccessible(true);
                    declaredField3.set((Object) null, 100);
                } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException e2) {
                    AnonymousClass0QD.A05("modify_max_idle_connections_failed", "Failed to access private API field: com.android.okhttp.ConfigAwareConnectionPool#CONNECTION_POOL_MAX_IDLE_CONNECTIONS", e2);
                }
            } else {
                AnonymousClass0DB.A0E("IGHttpEngineSupplier", "No modification made to CONNECTION_POOL_MAX_IDLE_CONNECTIONS for UrlConnectionHttpStack. Not accessible on Android 10+.");
            }
            BM7 bm7 = new BM7(C05770Lw.A00().A0D());
            return new C206288sL(proxy, C14300kE.A00(), bm7, bm7, new AnonymousClass0YM());
        }
    }
}
