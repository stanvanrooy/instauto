package p000X;

import com.facebook.common.dextricks.classtracing.logger.ClassTracingLogger;

/* renamed from: X.0g9  reason: invalid class name and case insensitive filesystem */
public final class C12080g9 extends C10030cY {
    public final void onQuickMarkerEnd(int i, int i2) {
        if (ClassTracingLogger.sEnabled) {
            ClassTracingLogger.logNonClassLoad(1215735889, i);
        }
    }

    public final boolean onQuickMarkerStart(int i, int i2) {
        if (!ClassTracingLogger.sEnabled) {
            return false;
        }
        ClassTracingLogger.logNonClassLoad(1505373456, i);
        return false;
    }

    public final AnonymousClass0IF getListenerMarkers() {
        if (!ClassTracingLogger.isEnabled()) {
            return AnonymousClass0IF.A05;
        }
        return new AnonymousClass0IF((int[]) null, new int[]{-1});
    }
}
