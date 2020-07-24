package p000X;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import java.util.Set;

/* renamed from: X.0fQ  reason: invalid class name and case insensitive filesystem */
public final class C11710fQ implements Set {
    public static final Integer A01 = 0;
    public static final Object[] A02 = new Object[0];
    public final AnonymousClass00N A00 = new AnonymousClass00N();

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof Set) {
                Set set = (Set) obj;
                if (size() == set.size()) {
                    try {
                        int size = size();
                        int i = 0;
                        while (i < size) {
                            if (set.contains(this.A00.A06(i))) {
                                i++;
                            }
                        }
                    } catch (ClassCastException | NullPointerException unused) {
                    }
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final boolean add(Object obj) {
        if (this.A00.put(obj, A01) == null) {
            return true;
        }
        return false;
    }

    public final void clear() {
        this.A00.clear();
    }

    public final boolean contains(Object obj) {
        return this.A00.containsKey(obj);
    }

    public final boolean containsAll(Collection collection) {
        if (!(collection instanceof List) || !(collection instanceof RandomAccess)) {
            for (Object contains : collection) {
                if (!contains(contains)) {
                }
            }
            return true;
        }
        List list = (List) collection;
        int size = list.size();
        int i = 0;
        while (i < size) {
            if (contains(list.get(i))) {
                i++;
            }
        }
        return true;
        return false;
    }

    public final boolean isEmpty() {
        return this.A00.isEmpty();
    }

    public final Iterator iterator() {
        return new AIC(this);
    }

    public final boolean remove(Object obj) {
        int A04 = this.A00.A04(obj);
        if (A04 < 0) {
            return false;
        }
        this.A00.A07(A04);
        return true;
    }

    public final boolean removeAll(Collection collection) {
        boolean z;
        if (!(collection instanceof List) || !(collection instanceof RandomAccess)) {
            boolean z2 = false;
            for (Object remove : collection) {
                z2 = z | remove(remove);
            }
        } else {
            List list = (List) collection;
            int size = list.size();
            z = false;
            for (int i = 0; i < size; i++) {
                z |= remove(list.get(i));
            }
        }
        return z;
    }

    public final int size() {
        return this.A00.size();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: boolean} */
    /* JADX WARNING: type inference failed for: r3v0 */
    /* JADX WARNING: type inference failed for: r3v3, types: [int] */
    /* JADX WARNING: type inference failed for: r3v5 */
    /* JADX WARNING: type inference failed for: r3v6 */
    /* JADX WARNING: Multi-variable type inference failed */
    public final boolean addAll(Collection collection) {
        this.A00.A09(size() + collection.size());
        ? r3 = 0;
        if (collection instanceof C11710fQ) {
            int size = size();
            this.A00.A0A(((C11710fQ) collection).A00);
            if (size() != size) {
                return true;
            }
            return false;
        } else if (!(collection instanceof List) || !(collection instanceof RandomAccess)) {
            for (Object add : collection) {
                r3 |= add(add);
            }
            return r3;
        } else {
            List list = (List) collection;
            int size2 = list.size();
            boolean z = false;
            while (r3 < size2) {
                z |= add(list.get(r3));
                r3++;
            }
            return z;
        }
    }

    public final int hashCode() {
        int size = size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            Object A06 = this.A00.A06(i2);
            if (A06 != null) {
                i += A06.hashCode();
            }
        }
        return i;
    }

    public final boolean retainAll(Collection collection) {
        boolean z = false;
        for (int size = size() - 1; size >= 0; size--) {
            if (!collection.contains(this.A00.A06(size))) {
                this.A00.A07(size);
                z = true;
            }
        }
        return z;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        int size = size();
        StringBuilder sb = new StringBuilder(size * 14);
        sb.append('{');
        for (int i = 0; i < size; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            Object A06 = this.A00.A06(i);
            if (A06 != this) {
                sb.append(A06);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public final Object[] toArray() {
        AnonymousClass00N r4 = this.A00;
        int size = r4.size();
        if (size == 0) {
            return A02;
        }
        Object[] objArr = new Object[size];
        for (int i = 0; i < size; i++) {
            objArr[i] = r4.A06(i);
        }
        return objArr;
    }

    public final Object[] toArray(Object[] objArr) {
        int size = size();
        if (objArr.length < size) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), size);
        }
        for (int i = 0; i < size; i++) {
            objArr[i] = this.A00.A06(i);
        }
        if (objArr.length > size) {
            objArr[size] = null;
        }
        return objArr;
    }
}
