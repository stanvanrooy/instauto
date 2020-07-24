package p000X;

import com.facebook.analytics.appstatelogger.AppStateLoggerNative;
import java.io.ByteArrayOutputStream;

/* renamed from: X.03h  reason: invalid class name and case insensitive filesystem */
public final class C026303h extends ByteArrayOutputStream {
    public final void flush() {
        int i = this.count;
        byte[] bArr = this.buf;
        if (i != bArr.length) {
            bArr = toByteArray();
        }
        if (!AppStateLoggerNative.sAppStateLoggerNativeInited) {
            AnonymousClass0DB.A0E("AppStateLoggerNative", "AppStateLoggerNative.initializeNativeCrashReporting not called.  setBreakpadStreamData will most likely crash.");
        }
        AppStateLoggerNative.setBreakpadStreamDataNative(bArr);
    }
}
