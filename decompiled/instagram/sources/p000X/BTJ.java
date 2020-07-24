package p000X;

import android.os.Debug;
import com.facebook.common.dextricks.OdexSchemeArtXdex;

/* renamed from: X.BTJ */
public final class BTJ implements BTH {
    public final BTN AQG() {
        Runtime runtime = Runtime.getRuntime();
        BTM btm = new BTM();
        btm.A01 = runtime.maxMemory() / OdexSchemeArtXdex.STATE_MIXED_ATTEMPTED;
        btm.A00 = (runtime.totalMemory() - runtime.freeMemory()) / OdexSchemeArtXdex.STATE_MIXED_ATTEMPTED;
        btm.A03 = Debug.getNativeHeapSize() / OdexSchemeArtXdex.STATE_MIXED_ATTEMPTED;
        btm.A02 = Debug.getNativeHeapAllocatedSize() / OdexSchemeArtXdex.STATE_MIXED_ATTEMPTED;
        return btm;
    }
}
