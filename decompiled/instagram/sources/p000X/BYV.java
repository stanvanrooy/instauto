package p000X;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.BYV */
public final class BYV<K, V> extends LinkedHashMap<K, V> implements Serializable {
    public final int A00;

    public BYV(int i, int i2) {
        super(i, 0.8f, true);
        this.A00 = i2;
    }

    public final boolean removeEldestEntry(Map.Entry entry) {
        if (size() > this.A00) {
            return true;
        }
        return false;
    }
}
