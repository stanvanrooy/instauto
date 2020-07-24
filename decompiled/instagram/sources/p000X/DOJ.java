package p000X;

import com.google.common.collect.MapMakerInternalMap;
import java.util.Map;

/* renamed from: X.DOJ */
public final class DOJ extends C125815aO {
    public Object A00;
    public final Object A01;
    public final /* synthetic */ MapMakerInternalMap A02;

    public DOJ(MapMakerInternalMap mapMakerInternalMap, Object obj, Object obj2) {
        this.A02 = mapMakerInternalMap;
        this.A01 = obj;
        this.A00 = obj2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        if (!this.A01.equals(entry.getKey()) || !this.A00.equals(entry.getValue())) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.A01.hashCode() ^ this.A00.hashCode();
    }

    public final Object setValue(Object obj) {
        Object put = this.A02.put(this.A01, obj);
        this.A00 = obj;
        return put;
    }

    public final Object getKey() {
        return this.A01;
    }

    public final Object getValue() {
        return this.A00;
    }
}
