package com.facebook.profilo.provider.device_info;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.util.Log;
import com.facebook.profilo.core.ProvidersRegistry;
import com.facebook.profilo.ipc.TraceContext;
import com.facebook.profilo.logger.Logger;
import java.io.File;
import p000X.AnonymousClass000;
import p000X.C09630bj;
import p000X.C09640bk;
import p000X.C12300gW;
import p000X.C12310gX;

public final class DeviceInfoProvider extends C09630bj {
    public final Context A00;

    public DeviceInfoProvider(Context context) {
        super((String) null);
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null || !(context instanceof Application)) {
            this.A00 = applicationContext;
        } else {
            this.A00 = context;
        }
    }

    public static void A00(int i, long j) {
        Logger.writeStandardEntry(0, 7, 52, 0, 0, i, 0, j);
    }

    public static void A01(int i, String str, String str2) {
        int writeStandardEntry = Logger.writeStandardEntry(0, 7, 52, 0, 0, i, 0, 0);
        if (str != null) {
            writeStandardEntry = Logger.writeBytesEntry(0, 1, 56, writeStandardEntry, str);
        }
        Logger.writeBytesEntry(0, 1, 57, writeStandardEntry, str2);
    }

    static {
        ProvidersRegistry.A00.A02("device_info");
    }

    public final void logOnTraceEnd(TraceContext traceContext, C09640bk r6) {
        long j;
        A01(8126483, "os_ver", Build.VERSION.RELEASE);
        A01(8126478, "device_type", Build.MODEL);
        A01(8126479, "brand", Build.BRAND);
        A01(8126480, "manufacturer", Build.MANUFACTURER);
        A01(8126481, "year_class", Integer.toString(C12300gW.A00(this.A00)));
        A01(8126537, "os_sdk", Integer.toString(Build.VERSION.SDK_INT));
        A00(8126503, (long) C12310gX.A00());
        Context context = this.A00;
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(memoryInfo);
        A00(8126502, memoryInfo.totalMem);
        try {
            A01(8126527, "Kernel version", System.getProperty("os.version", "undefined"));
        } catch (SecurityException e) {
            Log.w("Profilo/DeviceInfo", AnonymousClass000.A0E("SecurityException: ", e.getMessage()));
        }
        if (new File("/proc/sys/kernel/perf_event_paranoid").exists()) {
            j = 1;
        } else {
            j = 0;
        }
        A00(8126490, j);
    }
}
