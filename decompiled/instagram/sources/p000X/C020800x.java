package p000X;

import android.content.Context;
import com.facebook.acra.util.NativeProcFileReader;
import com.facebook.acra.util.NoSync;
import com.facebook.common.dextricks.OptSvcAnalyticsStore;
import java.io.File;
import java.util.Random;
import java.util.UUID;

/* renamed from: X.00x  reason: invalid class name and case insensitive filesystem */
public final class C020800x implements Runnable {
    public final /* synthetic */ Context A00;

    public C020800x(Context context) {
        this.A00 = context;
    }

    public final void run() {
        File file;
        try {
            synchronized (C021000z.A07) {
                try {
                    AnonymousClass0YD.A01("acra");
                    C021000z.A05 = true;
                } catch (Throwable th) {
                    while (true) {
                        th = th;
                    }
                    throw th;
                }
            }
            Context context = this.A00;
            if (AnonymousClass0FU.A08(context, "acraconfig_enable_nightwatch")) {
                String str = AnonymousClass0CY.A00().A01;
                if (str == null) {
                    str = "unknown";
                }
                if (!str.contains(":")) {
                    AnonymousClass0FI r7 = new AnonymousClass0FI(AnonymousClass0FU.A08(context, "acraconfig_nightwatch_use_setsid"), AnonymousClass0FU.A08(context, "acraconfig_nightwatch_use_lss_on_exec"), AnonymousClass0FU.A08(context, "nightwatch_use_mmap"), AnonymousClass0FU.A08(context, "nightwatch_monitor_resources"), AnonymousClass0FU.A01(context, "acraconfig_logcat_all_buffers_size_kb", 12), AnonymousClass0FU.A01(context, "acraconfig_logcat_crash_buffer_size_kb", 8));
                    if (AnonymousClass0FU.A08(context, "acraconfig_nightwatch_use_asl_session_id")) {
                        file = new File(context.getDir("watcher", 0), AnonymousClass000.A0N(str.replace(':', '_'), "_", (String) null, OptSvcAnalyticsStore.FILE_SUFFIX));
                    } else {
                        Random random = new Random();
                        file = new File(context.getDir("watcher", 0), AnonymousClass000.A0N(str.replace(':', '_'), "_", new UUID(random.nextLong(), random.nextLong()).toString(), OptSvcAnalyticsStore.FILE_SUFFIX));
                    }
                    AnonymousClass0FK.A01(file, r7);
                }
            }
            synchronized (C021000z.A06) {
                try {
                    C022401p r1 = C021000z.A01;
                    if (r1 != null) {
                        r1.ApJ(C021000z.A05("anr_gk_cached"));
                    }
                } catch (Throwable th2) {
                    while (true) {
                        th = th2;
                        break;
                    }
                }
            }
            Class<NativeProcFileReader> cls = NativeProcFileReader.class;
            synchronized (cls) {
                try {
                    NativeProcFileReader.sReadyToUse.set(true);
                    cls.notifyAll();
                } catch (Throwable th3) {
                    while (true) {
                        th = th3;
                        break;
                    }
                }
            }
            if (AnonymousClass0FU.A08(context, "acraconfig_disable_fs_sync_syscalls")) {
                NoSync.disableFSSync(AnonymousClass0FU.A08(context, "acraconfig_use_fast_fs_sync_hooks"));
                return;
            }
            return;
            throw th;
        } catch (UnsatisfiedLinkError unused) {
        }
    }
}
