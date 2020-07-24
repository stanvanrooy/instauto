package p000X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.BZE */
public final class BZE extends LinkedHashMap<C25268BBj, Boolean> {
    public final /* synthetic */ BZF A00;

    public BZE(BZF bzf) {
        this.A00 = bzf;
    }

    public final boolean removeEldestEntry(Map.Entry entry) {
        if (size() > 2) {
            return true;
        }
        return false;
    }
}
