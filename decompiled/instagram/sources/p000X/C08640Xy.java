package p000X;

import android.app.Application;
import com.facebook.errorreporting.lacrima.common.asl.aslnative.AppStateLoggerNative;
import java.io.File;

/* renamed from: X.0Xy  reason: invalid class name and case insensitive filesystem */
public final class C08640Xy implements AnonymousClass0ET {
    public final /* synthetic */ Application A00;
    public final /* synthetic */ boolean A01 = true;

    public C08640Xy(Application application) {
        this.A00 = application;
    }

    public final void ACl(AnonymousClass0EV r1) {
    }

    public final void Aie(AnonymousClass0EV r1) {
    }

    public final void ACm(AnonymousClass0EV r7) {
        AnonymousClass0ZL.A01("NativeAslConfig.libInit", 784532112);
        try {
            AnonymousClass0FG A012 = r7.A01();
            String path = new File(A012.A00(), "native_state.txt").getPath();
            String path2 = new File(A012.A00(), "anr_state.txt").getPath();
            String path3 = new File(A012.A00(), "dump_state.txt").getPath();
            boolean z = this.A01;
            if (!AppStateLoggerNative.sAppStateLoggerNativeInited) {
                AnonymousClass0Y1.A08("appstatelogger2");
                AnonymousClass0ZL.A01("registerWithNativeCrashHandler", -1348556428);
                try {
                    AppStateLoggerNative.registerWithNativeCrashHandler(path, path2, path3);
                    AnonymousClass0ZL.A00(-393878801);
                    AnonymousClass0ZL.A01("registerStreamWithBreakpad", -431937681);
                    try {
                        AppStateLoggerNative.registerStreamWithBreakpad();
                        AnonymousClass0ZL.A00(512980577);
                        AnonymousClass0ZL.A01("registerOomHandler", -1898055859);
                    } catch (Throwable th) {
                        th = th;
                        AnonymousClass0ZL.A00(1181364575);
                        throw th;
                    }
                    try {
                        AppStateLoggerNative.registerOomHandler();
                        AnonymousClass0ZL.A00(-313843958);
                        synchronized (AppStateLoggerNative.class) {
                            AppStateLoggerNative.appInForeground(z, z);
                            AppStateLoggerNative.sAppStateLoggerNativeInited = true;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        AnonymousClass0ZL.A00(-1065545923);
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    AnonymousClass0ZL.A00(-1966822826);
                    throw th;
                }
            }
            AnonymousClass0ZL.A00(-1511739141);
        } catch (Throwable th4) {
            AnonymousClass0ZL.A00(104300200);
            throw th4;
        }
    }
}
