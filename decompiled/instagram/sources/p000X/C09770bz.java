package p000X;

import android.content.Context;
import com.instagram.debug.devoptions.apiperf.DebugHeadPlugin;

/* renamed from: X.0bz  reason: invalid class name and case insensitive filesystem */
public final class C09770bz {
    public static boolean A00(Context context) {
        if (C05770Lw.A01(context).A00.getInt("loom_qpl_marker_trigger", -1) == 15335435) {
            C22270y8.A00 = new C22260y7(context);
            if (C22270y8.A01().A08(C22470yU.DEVELOPER_OPTIONS, false)) {
                if (DebugHeadPlugin.getInstance() == null) {
                    try {
                        DebugHeadPlugin.setInstance((DebugHeadPlugin) Class.forName("com.instagram.debug.devoptions.debughead.DebugHeadPluginImpl").newInstance());
                    } catch (ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
                        return false;
                    }
                }
                DebugHeadPlugin.getInstance().getDebugHeadLoomTraceHelper(context).startTrace();
                return true;
            }
        }
        return false;
    }
}
