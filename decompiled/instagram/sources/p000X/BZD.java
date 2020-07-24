package p000X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.BZD */
public final class BZD extends LinkedHashMap<C25268BBj, Boolean> {
    public final /* synthetic */ BZG A00;

    public BZD(BZG bzg) {
        this.A00 = bzg;
    }

    public final boolean removeEldestEntry(Map.Entry entry) {
        if (size() > 2) {
            return true;
        }
        return false;
    }
}
