package p000X;

import android.os.SystemClock;
import com.facebook.common.stringformat.StringFormatUtil;
import com.facebook.debug.tracer.Tracer;
import com.facebook.profilo.core.TraceEvents;

/* renamed from: X.1xe  reason: invalid class name and case insensitive filesystem */
public final class C45311xe implements Runnable {
    public final /* synthetic */ C45111xJ A00;
    public final /* synthetic */ C45301xd A01;
    public final /* synthetic */ C45291xc A02;

    public C45311xe(C45301xd r1, C45291xc r2, C45111xJ r3) {
        this.A01 = r1;
        this.A02 = r2;
        this.A00 = r3;
    }

    /* JADX INFO: finally extract failed */
    public final void run() {
        String A002 = C114604wB.A00(this.A02.getClass());
        try {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (!TraceEvents.isEnabled(C09680bp.A06)) {
                Tracer.A00("StartPreloading.%s", 1, A002, (Object) null, (Object) null);
            } else {
                AnonymousClass0ZN.A02(StringFormatUtil.formatStrLocaleSafe("StartPreloading.%s", (Object) A002), 1708478000);
            }
            this.A02.preloadClasses();
            AnonymousClass0ZN.A00(1282914044);
            C45111xJ r3 = this.A00;
            if (r3 != null) {
                r3.A05("Succeeded", SystemClock.elapsedRealtime() - elapsedRealtime, A002);
            }
        } catch (Exception | NoClassDefFoundError | UnsatisfiedLinkError e) {
            C45111xJ r32 = this.A00;
            if (r32 != null) {
                r32.A05(AnonymousClass000.A0E("Failed : ", e.getMessage()), 0, A002);
            }
        } catch (Throwable th) {
            AnonymousClass0ZN.A00(197871819);
            throw th;
        }
    }
}
