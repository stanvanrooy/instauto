package p000X;

import android.os.SystemClock;
import com.facebook.common.dextricks.OdexSchemeArtXdex;
import com.facebook.react.bridge.ReactMarker;

/* renamed from: X.A3K */
public final class A3K {
    public static volatile boolean A00;

    public static synchronized void A00() {
        synchronized (A3K.class) {
            if (!A00) {
                SystemClock.uptimeMillis();
                AnonymousClass0ZJ.A01(OdexSchemeArtXdex.STATE_PGO_ATTEMPTED, "ReactBridge.staticInit::load:reactnativejni", 458066061);
                ReactMarker.logMarker(A3L.LOAD_REACT_NATIVE_SO_FILE_START);
                AnonymousClass0Y1.A08("reactnativejni");
                ReactMarker.logMarker(A3L.LOAD_REACT_NATIVE_SO_FILE_END);
                AnonymousClass0ZJ.A00(OdexSchemeArtXdex.STATE_PGO_ATTEMPTED, -990212833);
                SystemClock.uptimeMillis();
                A00 = true;
            }
        }
    }
}
