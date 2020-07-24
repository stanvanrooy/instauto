package com.google.common.collect;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import p000X.AnonymousClass227;
import p000X.AnonymousClass93S;
import p000X.C14360kK;
import p000X.C14370kL;
import p000X.C239512q;

public abstract class ImmutableMap<K, V> implements Map<K, V>, Serializable {
    public static final Map.Entry[] A03 = new Map.Entry[0];
    public transient ImmutableSet A00;
    public transient ImmutableCollection A01;
    public transient ImmutableSet A02;

    public class SerializedForm implements Serializable {
        public static final long serialVersionUID = 0;
        public final Object[] keys;
        public final Object[] values;

        public Object readResolve() {
            Object[] objArr = new Object[(this.keys.length << 1)];
            int i = 0;
            int i2 = 0;
            while (true) {
                Object[] objArr2 = this.keys;
                if (i2 >= objArr2.length) {
                    return RegularImmutableMap.A00(i, objArr);
                }
                Object obj = objArr2[i2];
                Object obj2 = this.values[i2];
                int i3 = i + 1;
                int i4 = i3 << 1;
                int length = objArr.length;
                if (i4 > length) {
                    objArr = Arrays.copyOf(objArr, C14360kK.A01(length, i4));
                }
                C14370kL.A01(obj, obj2);
                int i5 = i << 1;
                objArr[i5] = obj;
                objArr[i5 + 1] = obj2;
                i = i3;
                i2++;
            }
        }

        public SerializedForm(ImmutableMap immutableMap) {
            this.keys = new Object[immutableMap.size()];
            this.values = new Object[immutableMap.size()];
            C239512q A0I = immutableMap.entrySet().iterator();
            int i = 0;
            while (A0I.hasNext()) {
                Map.Entry entry = (Map.Entry) A0I.next();
                this.keys[i] = entry.getKey();
                this.values[i] = entry.getValue();
                i++;
            }
        }
    }

    public abstract ImmutableCollection A03();

    public abstract ImmutableSet A05();

    public abstract ImmutableSet A06();

    public abstract boolean A07();

    public abstract Object get(Object obj);

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0025, code lost:
        r2 = (r5.A00 + r3.size()) << 1;
        r1 = r5.A01;
     */
    public static ImmutableMap A01(Map map) {
        int i;
        int size;
        Object[] objArr;
        int length;
        if ((map instanceof ImmutableMap) && !(map instanceof SortedMap)) {
            ImmutableMap immutableMap = (ImmutableMap) map;
            if (!immutableMap.A07()) {
                return immutableMap;
            }
        }
        Set<Map.Entry> entrySet = map.entrySet();
        boolean z = entrySet instanceof Collection;
        if (z) {
            i = entrySet.size();
        } else {
            i = 4;
        }
        AnonymousClass227 r5 = new AnonymousClass227(i);
        if (z && size > (length = objArr.length)) {
            r5.A01 = Arrays.copyOf(objArr, C14360kK.A01(length, size));
        }
        for (Map.Entry entry : entrySet) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            int i2 = (r5.A00 + 1) << 1;
            Object[] objArr2 = r5.A01;
            int length2 = objArr2.length;
            if (i2 > length2) {
                r5.A01 = Arrays.copyOf(objArr2, C14360kK.A01(length2, i2));
            }
            C14370kL.A01(key, value);
            Object[] objArr3 = r5.A01;
            int i3 = r5.A00;
            int i4 = i3 << 1;
            objArr3[i4] = key;
            objArr3[i4 + 1] = value;
            r5.A00 = i3 + 1;
        }
        return RegularImmutableMap.A00(r5.A00, r5.A01);
    }

    /* renamed from: A02 */
    public final ImmutableCollection values() {
        ImmutableCollection immutableCollection = this.A01;
        if (immutableCollection != null) {
            return immutableCollection;
        }
        ImmutableCollection A032 = A03();
        this.A01 = A032;
        return A032;
    }

    /* renamed from: A04 */
    public final ImmutableSet entrySet() {
        ImmutableSet immutableSet = this.A02;
        if (immutableSet != null) {
            return immutableSet;
        }
        ImmutableSet A05 = A05();
        this.A02 = A05;
        return A05;
    }

    public final void clear() {
        throw new UnsupportedOperationException();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    public final /* bridge */ /* synthetic */ Set keySet() {
        ImmutableSet immutableSet = this.A00;
        if (immutableSet != null) {
            return immutableSet;
        }
        ImmutableSet A06 = A06();
        this.A00 = A06;
        return A06;
    }

    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public Object writeReplace() {
        return new SerializedForm(this);
    }

    public final boolean containsKey(Object obj) {
        if (get(obj) != null) {
            return true;
        }
        return false;
    }

    public final boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        if (obj3 == null) {
            return obj2;
        }
        return obj3;
    }

    public final int hashCode() {
        return AnonymousClass93S.A00(entrySet());
    }

    public final boolean isEmpty() {
        if (size() == 0) {
            return true;
        }
        return false;
    }

    public final String toString() {
        int size = size();
        C14370kL.A00(size, "size");
        StringBuilder sb = new StringBuilder((int) Math.min(((long) size) * 8, 1073741824));
        sb.append('{');
        boolean z = true;
        for (Map.Entry entry : entrySet()) {
            if (!z) {
                sb.append(", ");
            }
            z = false;
            sb.append(entry.getKey());
            sb.append('=');
            sb.append(entry.getValue());
        }
        sb.append('}');
        return sb.toString();
    }
}
