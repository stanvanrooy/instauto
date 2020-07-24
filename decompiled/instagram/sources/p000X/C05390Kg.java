package p000X;

import com.facebook.common.dextricks.classtracing.logger.ClassTracingLogger;

/* renamed from: X.0Kg  reason: invalid class name and case insensitive filesystem */
public final class C05390Kg implements C04210Cz {
    public final void A8V(String str) {
        ClassTracingLogger.classNotFound();
    }

    public final void A8W(String str) {
        ClassTracingLogger.beginClassLoad(str);
    }

    public final void A8U(String str, Class cls) {
        ClassTracingLogger.classLoaded(cls);
    }
}
