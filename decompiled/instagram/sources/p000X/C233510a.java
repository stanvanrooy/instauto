package p000X;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.10a  reason: invalid class name and case insensitive filesystem */
public final class C233510a<T> implements Collection<T>, AnonymousClass10V {
    public final Object[] A00;
    public final boolean A01 = true;

    public C233510a(Object[] objArr) {
        C13150hy.A02(objArr, "values");
        this.A00 = objArr;
    }

    public final boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final Object[] toArray(Object[] objArr) {
        return AnonymousClass10X.A01(this, objArr);
    }

    public final boolean contains(Object obj) {
        Object[] objArr = this.A00;
        C13150hy.A02(objArr, "$this$contains");
        if (AnonymousClass7FA.A03(objArr, obj) >= 0) {
            return true;
        }
        return false;
    }

    public final boolean containsAll(Collection collection) {
        C13150hy.A02(collection, "elements");
        if (collection.isEmpty()) {
            return true;
        }
        for (Object contains : collection) {
            if (!contains(contains)) {
                return false;
            }
        }
        return true;
    }

    public final boolean isEmpty() {
        if (this.A00.length == 0) {
            return true;
        }
        return false;
    }

    public final Iterator iterator() {
        Object[] objArr = this.A00;
        C13150hy.A02(objArr, "array");
        return new C226599p6(objArr);
    }

    public final /* bridge */ int size() {
        return this.A00.length;
    }

    public final Object[] toArray() {
        Object[] objArr = this.A00;
        boolean z = this.A01;
        C13150hy.A02(objArr, "$this$copyToArrayOfAny");
        if (z && C13150hy.A05(objArr.getClass(), Object[].class)) {
            return objArr;
        }
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length, Object[].class);
        C13150hy.A01(copyOf, "java.util.Arrays.copyOf(… Array<Any?>::class.java)");
        return copyOf;
    }
}
