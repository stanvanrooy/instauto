package p000X;

import com.facebook.common.dextricks.OdexSchemeArtXdex;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.17f  reason: invalid class name and case insensitive filesystem */
public final class C250817f implements C250917g {
    public final Runtime A00 = Runtime.getRuntime();

    public final List AJs() {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(new C181927pj(C181917pi.A0E, this.A00.maxMemory() / OdexSchemeArtXdex.STATE_MIXED_ATTEMPTED, (this.A00.totalMemory() - this.A00.freeMemory()) / OdexSchemeArtXdex.STATE_MIXED_ATTEMPTED));
        return arrayList;
    }
}
