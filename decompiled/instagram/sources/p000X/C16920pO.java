package p000X;

import android.content.Context;
import android.os.Bundle;

/* renamed from: X.0pO  reason: invalid class name and case insensitive filesystem */
public abstract class C16920pO {
    public static C16920pO A00;

    public abstract void addMemoryInfoToEvent(AnonymousClass0P4 r1);

    public abstract C121635Jh getFragmentFactory();

    public abstract A56 getPerformanceLogger(C06590Pq r1);

    public abstract boolean maybeRequestOverlayPermissions(Context context, Integer num);

    public abstract void navigateToReactNativeApp(C06590Pq r1, String str, Bundle bundle);

    public abstract C227499qb newIgReactDelegate(AnonymousClass1HD r1);

    public abstract C53832Un newReactNativeLauncher(C06590Pq r1);

    public abstract C53832Un newReactNativeLauncher(C06590Pq r1, String str);

    public abstract void preloadReactNativeBridge(C06590Pq r1);

    public static synchronized C16920pO getInstance() {
        C16920pO r0;
        synchronized (C16920pO.class) {
            r0 = A00;
        }
        return r0;
    }

    public static void maybeAddMemoryInfoToEvent(AnonymousClass0P4 r0) {
    }

    public static void setInstance(C16920pO r0) {
        A00 = r0;
    }
}
