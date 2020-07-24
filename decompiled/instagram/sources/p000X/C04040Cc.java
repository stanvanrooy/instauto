package p000X;

import android.content.Context;
import android.os.SystemClock;
import com.instagram.realtimeclient.RealtimeSubscription;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.0Cc  reason: invalid class name and case insensitive filesystem */
public final class C04040Cc implements C022501q {
    public int A00;
    public C04220Db A01;
    public int A02;
    public Context A03;
    public File A04;
    public final Map A05 = new HashMap();
    public final C04410Dw A06;
    public final C04110Cl A07;

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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    private void A00() {
        /*
            r5 = this;
            java.util.Map r3 = r5.A05
            monitor-enter(r3)
            X.0Dw r1 = r5.A06     // Catch:{ IOException -> 0x0042 }
            java.util.Map r4 = r5.A05     // Catch:{ IOException -> 0x0042 }
            java.util.Set r2 = r1.A05     // Catch:{ IOException -> 0x0042 }
            monitor-enter(r2)     // Catch:{ IOException -> 0x0042 }
            java.util.Set r0 = r1.A05     // Catch:{ all -> 0x003f }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x003f }
            if (r0 == 0) goto L_0x0014
            monitor-exit(r2)     // Catch:{ all -> 0x003f }
            goto L_0x0044
        L_0x0014:
            java.util.Set r0 = r1.A05     // Catch:{ all -> 0x003f }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x003f }
            java.lang.Object r1 = r0.next()     // Catch:{ all -> 0x003f }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x003f }
            monitor-exit(r2)     // Catch:{ all -> 0x003f }
            java.io.File r2 = new java.io.File     // Catch:{ IOException -> 0x0042 }
            java.lang.String r0 = ".upd"
            java.lang.String r0 = p000X.AnonymousClass000.A0E(r1, r0)     // Catch:{ IOException -> 0x0042 }
            r2.<init>(r0)     // Catch:{ IOException -> 0x0042 }
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x0042 }
            r0 = 1
            r1.<init>(r2, r0)     // Catch:{ IOException -> 0x0042 }
            X.016 r0 = new X.016     // Catch:{ IOException -> 0x0042 }
            r0.<init>(r4)     // Catch:{ IOException -> 0x0042 }
            r0.A04(r1)     // Catch:{ IOException -> 0x0042 }
            r1.close()     // Catch:{ IOException -> 0x0042 }
            r0 = 1
            goto L_0x0045
        L_0x003f:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x003f }
            throw r0     // Catch:{ IOException -> 0x0042 }
        L_0x0042:
            r0 = 0
            goto L_0x0045
        L_0x0044:
            r0 = 0
        L_0x0045:
            if (r0 == 0) goto L_0x004c
            java.util.Map r0 = r5.A05     // Catch:{ all -> 0x004e }
            r0.clear()     // Catch:{ all -> 0x004e }
        L_0x004c:
            monitor-exit(r3)     // Catch:{ all -> 0x004e }
            return
        L_0x004e:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x004e }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000X.C04040Cc.A00():void");
    }

    public static void A01(File file) {
        if (file != null && file.listFiles() != null) {
            for (File file2 : file.listFiles()) {
                if (file2.isDirectory()) {
                    A01(file2);
                }
                if (file2 != null) {
                    boolean delete = file2.delete();
                    if (!delete && !file2.exists()) {
                        delete = true;
                    }
                    if (!delete) {
                        AnonymousClass0DB.A0K("ANRReport", "Could not delete error report: %s", file2.getName());
                    }
                }
            }
        }
    }

    public final void AE8(long j) {
        synchronized (this.A05) {
            this.A05.clear();
            this.A02 = 1;
        }
        C04410Dw.A0G("anr_recovery_delay", String.valueOf(j));
        C04220Db r0 = this.A01;
        if (r0 == null || r0.A03()) {
            this.A06.A0T(AnonymousClass01N.CACHED_ANR_REPORT);
            return;
        }
        A01(this.A03.getDir("traces", 0));
    }

    public final void AjA(long j) {
        synchronized (this.A05) {
            this.A05.put("anr_am_expired_uptime", Long.toString(j));
            A00();
        }
    }

    public final void AlE(long j) {
        synchronized (this.A05) {
            this.A05.put("anr_extra_sigquit_uptime", Long.toString(j));
            A00();
        }
    }

    public final void AmJ(long j) {
        synchronized (this.A05) {
            this.A05.put("anr_main_thread_unblocked_uptime", Long.toString(j));
            A00();
        }
    }

    public final void Ama(String str, String str2, String str3, long j) {
        synchronized (this.A05) {
            int i = this.A02;
            if (i < 5) {
                this.A05.put(AnonymousClass000.A05("anr_other_process_error_state_", i), str + ',' + j + ',' + str2 + ',' + str3);
                A00();
                int i2 = this.A02;
                if (i2 > this.A00) {
                    this.A00 = i2;
                }
                this.A02 = i2 + 1;
            }
        }
    }

    public final void Amj(long j, int i) {
        synchronized (this.A05) {
            this.A05.put("anr_process_error_detection_failure_time", Long.toString(j));
            this.A05.put("anr_process_error_detection_failure_cause", Integer.toString(i));
            A00();
        }
    }

    public final void Amk(long j) {
        synchronized (this.A05) {
            this.A05.put("anr_process_error_started_time", Long.toString(j));
            this.A02 = 1;
            A00();
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public final void AnI(java.lang.String r13, java.lang.String r14, long r15) {
        /*
            r12 = this;
            java.util.Map r3 = r12.A05
            monitor-enter(r3)
            java.util.Map r2 = r12.A05     // Catch:{ all -> 0x00b4 }
            java.lang.String r1 = "anr_java_callback_uptime"
            java.lang.String r0 = java.lang.Long.toString(r15)     // Catch:{ all -> 0x00b4 }
            r2.put(r1, r0)     // Catch:{ all -> 0x00b4 }
            if (r13 != 0) goto L_0x0012
            if (r14 == 0) goto L_0x00af
        L_0x0012:
            X.0Dw r6 = r12.A06     // Catch:{ IOException -> 0x00a7 }
            java.util.Set r1 = r6.A05     // Catch:{ IOException -> 0x00a7 }
            monitor-enter(r1)     // Catch:{ IOException -> 0x00a7 }
            java.util.Set r0 = r6.A05     // Catch:{ all -> 0x00a4 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x00a4 }
            if (r0 == 0) goto L_0x0021
            monitor-exit(r1)     // Catch:{ all -> 0x00a4 }
            goto L_0x009a
        L_0x0021:
            java.util.Set r0 = r6.A05     // Catch:{ all -> 0x00a4 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x00a4 }
            java.lang.Object r2 = r0.next()     // Catch:{ all -> 0x00a4 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x00a4 }
            monitor-exit(r1)     // Catch:{ all -> 0x00a4 }
            java.io.File r1 = new java.io.File     // Catch:{ IOException -> 0x00a7 }
            java.lang.String r0 = ".upd"
            java.lang.String r0 = p000X.AnonymousClass000.A0E(r2, r0)     // Catch:{ IOException -> 0x00a7 }
            r1.<init>(r0)     // Catch:{ IOException -> 0x00a7 }
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x00a7 }
            r0 = 1
            r2.<init>(r1, r0)     // Catch:{ IOException -> 0x00a7 }
            X.016 r7 = new X.016     // Catch:{ IOException -> 0x00a7 }
            r7.<init>()     // Catch:{ IOException -> 0x00a7 }
            if (r13 == 0) goto L_0x0056
            byte[] r0 = r13.getBytes()     // Catch:{ IOException -> 0x00a7 }
            java.lang.String r1 = p000X.C024502k.A00(r0)     // Catch:{ IOException -> 0x00a7 }
            X.01N r0 = p000X.AnonymousClass01N.ANR_REPORT     // Catch:{ IOException -> 0x00a7 }
            java.lang.String r0 = r0.A03     // Catch:{ IOException -> 0x00a7 }
            r7.put(r0, r1)     // Catch:{ IOException -> 0x00a7 }
            goto L_0x0094
        L_0x0056:
            java.io.File r4 = new java.io.File     // Catch:{ IOException -> 0x00a7 }
            r4.<init>(r14)     // Catch:{ IOException -> 0x00a7 }
            long r10 = r4.length()     // Catch:{ IOException -> 0x00a7 }
            java.io.FileInputStream r0 = new java.io.FileInputStream     // Catch:{ IOException -> 0x00a7 }
            r0.<init>(r14)     // Catch:{ IOException -> 0x00a7 }
            java.io.BufferedInputStream r8 = new java.io.BufferedInputStream     // Catch:{ IOException -> 0x00a7 }
            r8.<init>(r0)     // Catch:{ IOException -> 0x00a7 }
            X.01T r5 = p000X.C04410Dw.A03(r8)     // Catch:{ IOException -> 0x00a7 }
            java.lang.String r1 = r5.A00     // Catch:{ IOException -> 0x00a7 }
            if (r1 == 0) goto L_0x0076
            java.lang.String r0 = "PROCESS_NAME"
            r7.put(r0, r1)     // Catch:{ IOException -> 0x00a7 }
        L_0x0076:
            java.lang.String r0 = r5.A01     // Catch:{ IOException -> 0x00a7 }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ IOException -> 0x00a7 }
            if (r0 != 0) goto L_0x008c
            java.lang.String r1 = r5.A01     // Catch:{ IOException -> 0x00a7 }
            java.lang.String r0 = "APP_VERSION_CODE"
            r7.put(r0, r1)     // Catch:{ IOException -> 0x00a7 }
            java.lang.String r1 = r5.A02     // Catch:{ IOException -> 0x00a7 }
            java.lang.String r0 = "APP_VERSION_NAME"
            r7.put(r0, r1)     // Catch:{ IOException -> 0x00a7 }
        L_0x008c:
            X.01N r9 = p000X.AnonymousClass01N.ANR_REPORT     // Catch:{ IOException -> 0x00a7 }
            p000X.C04410Dw.A09(r6, r7, r8, r9, r10)     // Catch:{ IOException -> 0x00a7 }
            p000X.C04410Dw.A0D(r4)     // Catch:{ IOException -> 0x00a7 }
        L_0x0094:
            r7.A04(r2)     // Catch:{ IOException -> 0x00a7 }
            r2.close()     // Catch:{ IOException -> 0x00a7 }
        L_0x009a:
            java.util.Map r2 = r12.A05     // Catch:{ IOException -> 0x00a7 }
            java.lang.String r1 = "anr_with_sigquit_traces"
            java.lang.String r0 = "1"
            r2.put(r1, r0)     // Catch:{ IOException -> 0x00a7 }
            goto L_0x00af
        L_0x00a4:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x00a4 }
            throw r0     // Catch:{ IOException -> 0x00a7 }
        L_0x00a7:
            r2 = move-exception
            java.lang.String r1 = "ANRReport"
            java.lang.String r0 = "Failed to save SIGQUIT"
            p000X.AnonymousClass0DB.A0G(r1, r0, r2)     // Catch:{ all -> 0x00b4 }
        L_0x00af:
            r12.A00()     // Catch:{ all -> 0x00b4 }
            monitor-exit(r3)     // Catch:{ all -> 0x00b4 }
            return
        L_0x00b4:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x00b4 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000X.C04040Cc.AnI(java.lang.String, java.lang.String, long):void");
    }

    public final void Ani(String str, String str2, long j) {
        synchronized (this.A05) {
            this.A05.put("anr_process_error_detected_time", Long.toString(j));
            this.A05.put("anr_system_error_msg", str);
            this.A05.put("anr_system_tag", str2);
            A00();
        }
    }

    public C04040Cc(Context context, C04410Dw r4) {
        this.A03 = context;
        this.A06 = r4;
        this.A07 = new C04110Cl(context, ".cachedreport");
        this.A02 = 1;
        this.A00 = 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0186, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:?, code lost:
        r6.close();
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:42:0x018a */
    public final void Bq0(boolean z, String str, String str2, int i, boolean z2, boolean z3, long j, long j2, long j3, long j4, String str3, String str4, boolean z4, File file, String str5, Long l) {
        String jSONException;
        String str6;
        OutputStream outputStream;
        long j5 = j - 0;
        long j6 = j2 - 0;
        synchronized (this.A05) {
            try {
                C04410Dw.A0G("anr_process_error_detected_time", (String) this.A05.get("anr_process_error_detected_time"));
                C04410Dw.A0G("anr_process_error_detection_failure_time", (String) this.A05.get("anr_process_error_detection_failure_time"));
                C04410Dw.A0G("anr_process_error_detection_failure_cause", (String) this.A05.get("anr_process_error_detection_failure_cause"));
                C04410Dw.A0G("anr_system_error_msg", (String) this.A05.get("anr_system_error_msg"));
                C04410Dw.A0G("anr_system_tag", (String) this.A05.get("anr_system_tag"));
                C04410Dw.A0G("anr_process_error_started_time", (String) this.A05.get("anr_process_error_started_time"));
                C04410Dw.A0G("anr_main_thread_unblocked_uptime", (String) this.A05.get("anr_main_thread_unblocked_uptime"));
                C04410Dw.A0G("anr_am_expired_uptime", (String) this.A05.get("anr_am_expired_uptime"));
                for (int i2 = 1; i2 <= this.A00; i2++) {
                    C04410Dw.A0G(AnonymousClass000.A05("anr_other_process_error_state_", i2), (String) this.A05.get(AnonymousClass000.A05("anr_other_process_error_state_", i2)));
                }
                this.A05.clear();
            } catch (Throwable th) {
                while (true) {
                    th = th;
                    break;
                }
            }
        }
        C04410Dw.A0G("anr_detected_uptime", String.valueOf(j));
        C04410Dw.A0G("anr_detect_time_tag", String.valueOf(j5));
        C04410Dw.A0G("anr_recovery_delay", "-1");
        C04410Dw.A0G("anr_detected_pre_gkstore", String.valueOf(z));
        C04410Dw.A0G("anr_detector_id", String.valueOf(i));
        C04410Dw.A0G("anr_detector_start_time", String.valueOf(j6));
        C04410Dw.A0G("anr_started_in_foreground", String.valueOf(z2));
        C04410Dw.A0G("anr_started_in_foreground_v2", String.valueOf(z3));
        C04410Dw.A0G("anr_java_callback_uptime", String.valueOf(l));
        if (j3 > 0) {
            C04410Dw.A0G("anr_detector_actual_start_time", String.valueOf(j3 - 0));
        }
        if (j4 > 0) {
            C04410Dw.A0G("anr_detector_switch_time", String.valueOf(j4 - 0));
        }
        C04410Dw.A0G("black_box_trace", str);
        C04410Dw.A0G("long_stall_trace", str2);
        if (AnonymousClass02W.A00.isEmpty()) {
            jSONException = null;
        } else {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("current_uptime_ms", SystemClock.uptimeMillis());
                jSONObject.put("active_receivers_count", AnonymousClass02W.A00.size());
                JSONArray jSONArray = new JSONArray();
                for (JSONObject put : AnonymousClass02W.A00.values()) {
                    jSONArray.put(put);
                }
                jSONObject.put("active_receivers", jSONArray);
                jSONException = jSONObject.toString();
            } catch (JSONException e) {
                jSONException = e.toString();
            }
        }
        C04410Dw.A0G("anr_async_broadcast_receivers", jSONException);
        OutputStream outputStream2 = null;
        C04410Dw.A0G("first_sigquit", (String) null);
        C04410Dw.A0G("sigquit_times", (String) null);
        if (file != null) {
            TreeMap treeMap = new TreeMap();
            for (File file2 : file.listFiles()) {
                FileInputStream fileInputStream = new FileInputStream(file2);
                byte[] bArr = new byte[8];
                if (fileInputStream.read(bArr) != 8) {
                    AnonymousClass0DB.A0K("ANRReport", "Corrupted file %s", file2.getName());
                } else {
                    long j7 = 0;
                    int i3 = 0;
                    for (int i4 = 0; i4 < 8; i4++) {
                        j7 += (((long) bArr[i4]) & 255) << i3;
                        i3 += 8;
                    }
                    treeMap.put(Long.valueOf(j7), file2.getName());
                }
                try {
                    fileInputStream.close();
                } catch (IOException unused) {
                    AnonymousClass0DB.A0K("ANRReport", "Could not read from file %s", file2.getName());
                } catch (Throwable ) {
                    throw th;
                }
            }
            boolean z5 = true;
            StringBuilder sb = new StringBuilder();
            for (Map.Entry entry : treeMap.entrySet()) {
                if (z5) {
                    C04410Dw.A0G("first_sigquit", String.valueOf(((String) entry.getValue()).equals(str5)));
                    z5 = false;
                } else {
                    sb.append(",");
                }
                sb.append((String) entry.getValue());
                sb.append(",");
                sb.append(entry.getKey());
            }
            C04410Dw.A0G("sigquit_times", sb.toString());
        }
        boolean A052 = C021000z.A05("should_dedup_disk_persistence_gk_cached");
        if (z4) {
            str6 = RealtimeSubscription.GRAPHQL_MQTT_VERSION;
        } else {
            str6 = "0";
        }
        try {
            C04410Dw.A0G("anr_with_sigquit_traces", str6);
            String str7 = str4;
            if (str4 == null) {
                if (A052) {
                    outputStream = new ByteArrayOutputStream();
                } else {
                    if (this.A04 == null) {
                        C04110Cl r4 = new C04110Cl(this.A03, ".stacktrace");
                        this.A04 = new File(r4.A00.getDir(r4.A01, 0), AnonymousClass000.A0E(UUID.randomUUID().toString(), r4.A02));
                    }
                    outputStream = new FileOutputStream(this.A04);
                }
                outputStream2 = outputStream;
                String str8 = str3;
                if (str3 != null) {
                    PrintWriter printWriter = new PrintWriter(outputStream2);
                    if (!A052) {
                        printWriter.println(this.A06.A0H);
                        printWriter.println(this.A06.A0I);
                    }
                    printWriter.write(str8);
                    printWriter.flush();
                }
                if (A052) {
                    C04410Dw r42 = this.A06;
                    String obj = outputStream2.toString();
                    C04110Cl r2 = this.A07;
                    Object obj2 = C04410Dw.A0S;
                    synchronized (obj2) {
                        obj2.notify();
                    }
                    C04410Dw.A0A(r42, AnonymousClass01N.ANR_REPORT, obj, (File) null, r2);
                } else {
                    this.A04.getCanonicalPath();
                    this.A04.length();
                    this.A06.A0R(this.A04, this.A07);
                }
            } else {
                this.A06.A0R(new File(str7), this.A07);
            }
            if (outputStream2 != null) {
                outputStream2.close();
            }
            synchronized (this.A05) {
                try {
                    A00();
                } catch (Throwable th2) {
                    th = th2;
                    throw th;
                }
            }
        } catch (IOException e2) {
            try {
                throw e2;
            } catch (Throwable th3) {
                th = th3;
                if (outputStream2 != null) {
                    outputStream2.close();
                }
            }
        }
    }
}
