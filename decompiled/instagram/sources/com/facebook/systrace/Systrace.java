package com.facebook.systrace;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicInteger;
import p000X.AnonymousClass072;
import p000X.AnonymousClass0FY;
import p000X.AnonymousClass0Yu;
import p000X.C034306y;
import p000X.C08670Yb;
import p000X.C08690Yd;
import p000X.C08800Yq;
import p000X.C08820Yv;

public final class Systrace {
    public static long A00;
    public static final ThreadLocal A01 = new C08690Yd();
    public static final AtomicInteger A02 = new AtomicInteger();
    public static final String[] A03 = {"dalvik.system.VMStack", "java.lang.Thread", "com.facebook.systrace.Systrace", "com.facebook.systrace.SystraceMessage", "com.facebook.litho.FbComponentsSystrace", "com.facebook.litho.ComponentsSystrace", "com.facebook.debug.tracer.Tracer"};
    public static final String[][] A04 = {new String[]{"com.facebook.common.fury.FBSystraceReqContextLifecycleCallbacks.onActivate", "com.facebook.common.fury.FBSystraceReqContextLifecycleCallbacks.onDeactivate"}, new String[]{"com.facebook.common.plugins.fblogging.FbPluginsLogger.pluginMarkerStart", "com.facebook.common.plugins.fblogging.FbPluginsLogger.pluginMarkerEnd"}, new String[]{"com.facebook.common.plugins.fblogging.FbPluginsLogger.onSocketGetPluginsStart", "com.facebook.common.plugins.fblogging.FbPluginsLogger.onSocketGetPluginsEnd"}};

    static {
        if (AnonymousClass072.A03) {
            Method method = AnonymousClass072.A02;
            AnonymousClass0FY.A00(method);
            try {
                method.invoke((Object) null, new Object[]{true});
            } catch (IllegalAccessException unused) {
                AnonymousClass072.A03 = false;
            } catch (InvocationTargetException e) {
                C034306y.A00(e);
            }
        }
        C08800Yq.A02(false);
    }

    public static boolean A08(long j) {
        boolean z = false;
        if ((j & C08800Yq.A01) != 0) {
            z = true;
        }
        if (z || (j & A00) != 0) {
            return true;
        }
        return false;
    }

    public static void A00(long j, String str) {
        if (!A08(j)) {
            return;
        }
        if (TraceDirect.checkNative()) {
            TraceDirect.nativeBeginSection(str);
            return;
        }
        AnonymousClass0Yu r0 = new AnonymousClass0Yu('B');
        r0.A00();
        r0.A03(str);
        C08820Yv.A00(r0.toString());
    }

    public static void A01(long j, String str, int i) {
        if (A08(j)) {
            TraceDirect.asyncTraceBegin(str, i, 0);
        }
    }

    public static void A02(long j, String str, int i) {
        if (!A08(j)) {
            return;
        }
        if (TraceDirect.checkNative()) {
            TraceDirect.nativeEndAsyncFlow(str, i);
            return;
        }
        AnonymousClass0Yu r0 = new AnonymousClass0Yu('f');
        r0.A00();
        r0.A03(str);
        r0.A01(i);
        C08820Yv.A00(r0.toString());
    }

    public static void A03(long j, String str, int i) {
        if (A08(j)) {
            TraceDirect.asyncTraceEnd(str, i, 0);
        }
    }

    public static void A04(long j, String str, int i) {
        if (!A08(j)) {
            return;
        }
        if (TraceDirect.checkNative()) {
            TraceDirect.nativeStartAsyncFlow(str, i);
            return;
        }
        AnonymousClass0Yu r0 = new AnonymousClass0Yu('s');
        r0.A00();
        r0.A03(str);
        r0.A01(i);
        C08820Yv.A00(r0.toString());
    }

    public static void A05(long j, String str, int i) {
        if (!A08(j)) {
            return;
        }
        if (TraceDirect.checkNative()) {
            TraceDirect.nativeTraceCounter(str, i);
            return;
        }
        AnonymousClass0Yu r0 = new AnonymousClass0Yu('C');
        r0.A00();
        r0.A03(str);
        r0.A01(i);
        C08820Yv.A00(r0.toString());
    }

    public static void A06(long j, String str, int i, long j2) {
        if (A08(j)) {
            TraceDirect.asyncTraceBegin(str, i, C08670Yb.A00(j2));
        }
    }

    public static void A07(long j, String str, int i, long j2, String str2) {
        if (A08(j)) {
            long A002 = C08670Yb.A00(j2);
            if (TraceDirect.checkNative()) {
                TraceDirect.nativeAsyncTraceStageBegin(str, i, A002, str2);
                return;
            }
            AnonymousClass0Yu r5 = new AnonymousClass0Yu('T');
            r5.A00();
            r5.A03(str);
            if (A002 != 0) {
                r5.A02("<T");
                r5.A02(Long.toString(A002));
                r5.A02(">");
            }
            r5.A01(i);
            r5.A03(str2);
            C08820Yv.A00(r5.toString());
        }
    }
}
