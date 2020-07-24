package p000X;

import com.facebook.analytics.appstatelogger.AppStateLoggerNative;

/* renamed from: X.03a  reason: invalid class name and case insensitive filesystem */
public final class C025903a implements Runnable {
    public final void run() {
        AppStateLoggerNative.selfSigkillWithoutUpdatingAppStateLogStatus();
    }
}
