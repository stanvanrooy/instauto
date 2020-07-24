package p000X;

import android.content.Context;
import android.os.Looper;
import android.os.MessageQueue;
import com.facebook.quicklog.QuickPerformanceLoggerProvider;
import com.facebook.quicklog.xplat.QPLXplatInitializerImpl;
import com.facebook.redex.dynamicanalysis.DynamicAnalysis;
import com.facebook.xanalytics.XAnalyticsHolder;
import com.instagram.debug.devoptions.qpl.DebugHeadQplListener;
import com.instagram.perf.classpreload.CameraClassPreloadController;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.Executors;

/* renamed from: X.0Xo  reason: invalid class name and case insensitive filesystem */
public final class C08560Xo extends C09790c1 {
    public QPLXplatInitializerImpl A00;
    public AnonymousClass0SS A01;
    public final Context A02;
    public final MessageQueue A03 = Looper.myQueue();
    public final CameraClassPreloadController A04;

    public C08560Xo(Context context, CameraClassPreloadController cameraClassPreloadController) {
        this.A02 = context;
        this.A04 = cameraClassPreloadController;
    }

    public final void A07() {
        int A032 = AnonymousClass0Z0.A03(-776074213);
        ArrayList arrayList = new ArrayList();
        MessageQueue messageQueue = this.A03;
        boolean A033 = C05630Li.A03(new C05000Hl("is_enabled", AnonymousClass0L7.CRITICAL_PATH_SEQUENTIAL_RUNNER, false, (String[]) null, (AnonymousClass04H) null));
        boolean A034 = C05630Li.A03(new C05000Hl("add_scroll", AnonymousClass0L7.CRITICAL_PATH_SEQUENTIAL_RUNNER, (Object) null, (String[]) null, (AnonymousClass04H) null));
        if (!C12000g1.A03) {
            if (C06530Pk.A00) {
                AnonymousClass0ZB.A01("initCriticalPath", 2020593861);
            }
            try {
                C12010g2 r5 = new C12010g2();
                C12000g1.A02 = r5;
                C12030g4 r8 = new C12030g4(r5, messageQueue);
                C12050g6 r7 = new C12050g6(C12000g1.A02, C05700Lp.A00(), A033);
                C12040g5[] r4 = {r8, r7};
                Collections.addAll(C12000g1.A02.A00, r4);
                C12010g2 r52 = C12000g1.A02;
                C12000g1.A00 = new C12060g7(r52, A034);
                C12000g1.A01 = new C12070g8(r52, r8, r7, Executors.newSingleThreadExecutor());
                C12000g1.A03 = true;
                arrayList.add(C12000g1.A00);
                arrayList.add(AnonymousClass0c9.A06);
                boolean z = false;
                if (DynamicAnalysis.sNumStaticallyInstrumented > 0) {
                    z = true;
                }
                if (z) {
                    arrayList.add(new C23048A1j());
                }
                if (C05630Li.A03(new C05000Hl("is_enabled", AnonymousClass0L7.QPL_CLASS_MARKER, false, (String[]) null, (AnonymousClass04H) null))) {
                    arrayList.add(new C029304r());
                }
                arrayList.add(new C12080g9());
                arrayList.add(new AnonymousClass065());
                C12090gA A002 = C12090gA.A00(this.A02);
                arrayList.add(new C12530gt(new C12540gu(A002, A002.A04, this.A02)));
                arrayList.add(DebugHeadQplListener.getInstance());
                CameraClassPreloadController cameraClassPreloadController = this.A04;
                if (cameraClassPreloadController != null) {
                    arrayList.add(new C028804k(cameraClassPreloadController));
                }
                AnonymousClass0L7 r11 = AnonymousClass0L7.DEX_INFO_METADATA_TEST;
                boolean A035 = C05630Li.A03(new C05000Hl("is_enabled_for_native_art", r11, false, (String[]) null, (AnonymousClass04H) null));
                C05630Li.A03(new C05000Hl("is_enabled_for_ics_control", r11, false, (String[]) null, (AnonymousClass04H) null));
                C12550gw r6 = new C12550gw(A035);
                AnonymousClass0OL r10 = new AnonymousClass0OL();
                AnonymousClass00B r53 = new AnonymousClass00B(new C12560gx(), AnonymousClass00B.A00(this.A02, new C05030Hp[]{r6}), new C12570gy(), new AnonymousClass0NW(), r10, (AnonymousClass0IG[]) arrayList.toArray(new AnonymousClass0IG[0]));
                AnonymousClass00B.A01 = r53;
                QuickPerformanceLoggerProvider.mQuickPerformanceLogger = r53;
                if (C11070eN.A01) {
                    C09640bk A003 = C09640bk.A00();
                    C020200q r3 = new C020200q(r53);
                    A003.A06.A00.add(r3);
                    r3.B9E();
                }
                AnonymousClass00B r0 = AnonymousClass00B.A01;
                if (r0 != null) {
                    C10790ds.A00 = r0;
                    this.A01 = new AnonymousClass0SS();
                    this.A00 = new QPLXplatInitializerImpl();
                    XAnalyticsHolder xAnalyticsHolder = AnonymousClass0SS.A01;
                    if (QuickPerformanceLoggerProvider.getQPLInstance() != null) {
                        QPLXplatInitializerImpl.setupNativeQPLWithXAnalyticsHolder(xAnalyticsHolder);
                        AnonymousClass0Z0.A0A(-1008319914, A032);
                        return;
                    }
                    throw new AnonymousClass0SQ();
                }
                throw new IllegalArgumentException("qpl cannot be null");
            } finally {
                if (C06530Pk.A00) {
                    AnonymousClass0ZB.A00(1058576972);
                }
            }
        } else {
            throw new IllegalStateException("CriticalPath initialized");
        }
    }
}
