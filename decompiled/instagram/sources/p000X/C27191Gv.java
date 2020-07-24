package p000X;

import android.app.Activity;

/* renamed from: X.1Gv  reason: invalid class name and case insensitive filesystem */
public final class C27191Gv {
    public boolean A00;

    public final void A00(boolean z, Activity activity) {
        if (this.A00) {
            try {
                Class<?> cls = Class.forName("com.instagram.debug.devoptions.eventvisualizer.EventVisualizerController");
                Object invoke = cls.getMethod("getInstance", new Class[0]).invoke((Object) null, new Object[0]);
                if (z) {
                    cls.getMethod("onEventVisualizerShow", new Class[]{Activity.class}).invoke(invoke, new Object[]{activity});
                    return;
                }
                cls.getMethod("onEventVisualizerDismiss", new Class[0]).invoke(invoke, new Object[0]);
            } catch (Exception unused) {
            }
        }
    }

    public C27191Gv() {
        if (C22270y8.A01().A06(C22470yU.DEVELOPER_OPTIONS)) {
            this.A00 = C05770Lw.A00().A00.getBoolean("show_event_logger", false);
        }
    }
}
