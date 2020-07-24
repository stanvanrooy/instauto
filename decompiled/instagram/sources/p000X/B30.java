package p000X;

import com.google.common.collect.MapMakerInternalMap;
import java.util.concurrent.ConcurrentMap;

/* renamed from: X.B30 */
public abstract class B30<K, V> extends C25146B2z<K, V> implements ConcurrentMap<K, V> {
    public ConcurrentMap A03() {
        return ((MapMakerInternalMap.AbstractSerializationProxy) this).A00;
    }

    public final Object putIfAbsent(Object obj, Object obj2) {
        return A03().putIfAbsent(obj, obj2);
    }

    public final boolean remove(Object obj, Object obj2) {
        return A03().remove(obj, obj2);
    }

    public final Object replace(Object obj, Object obj2) {
        return A03().replace(obj, obj2);
    }

    public final boolean replace(Object obj, Object obj2, Object obj3) {
        return A03().replace(obj, obj2, obj3);
    }
}
