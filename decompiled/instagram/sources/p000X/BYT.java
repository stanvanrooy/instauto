package p000X;

import com.google.p013ar.core.AugmentedFace;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.BYT */
public final class BYT extends LinkedHashMap<Long, AugmentedFace> {
    public BYT() {
        super(1, 0.75f, true);
    }

    public final boolean removeEldestEntry(Map.Entry entry) {
        if (size() > 10) {
            return true;
        }
        return false;
    }
}
