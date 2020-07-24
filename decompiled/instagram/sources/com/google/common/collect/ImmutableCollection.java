package com.google.common.collect;

import com.google.common.collect.ImmutableList;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.AbstractCollection;
import java.util.Collection;
import p000X.AnonymousClass0a4;
import p000X.C239512q;

public abstract class ImmutableCollection<E> extends AbstractCollection<E> implements Serializable {
    public static final Object[] A00 = new Object[0];

    public abstract boolean A0F();

    /* renamed from: A0I */
    public abstract C239512q iterator();

    public abstract boolean contains(Object obj);

    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    public final void clear() {
        throw new UnsupportedOperationException();
    }

    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    public Object writeReplace() {
        return new ImmutableList.SerializedForm(toArray());
    }

    public int A0G(Object[] objArr, int i) {
        C239512q A0I = iterator();
        while (A0I.hasNext()) {
            objArr[i] = A0I.next();
            i++;
        }
        return i;
    }

    public ImmutableList A0H() {
        if (isEmpty()) {
            return ImmutableList.A01();
        }
        return ImmutableList.A0B(toArray());
    }

    public final Object[] toArray() {
        int size = size();
        if (size == 0) {
            return A00;
        }
        Object[] objArr = new Object[size];
        A0G(objArr, 0);
        return objArr;
    }

    public final Object[] toArray(Object[] objArr) {
        AnonymousClass0a4.A06(objArr);
        int size = size();
        int length = objArr.length;
        if (length < size) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), size);
        } else if (length > size) {
            objArr[size] = null;
        }
        A0G(objArr, 0);
        return objArr;
    }
}
