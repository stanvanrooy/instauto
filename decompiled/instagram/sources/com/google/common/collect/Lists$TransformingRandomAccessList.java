package com.google.common.collect;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import p000X.AnonymousClass0a4;
import p000X.AnonymousClass17J;
import p000X.C22550yc;

public class Lists$TransformingRandomAccessList<F, T> extends AbstractList<T> implements RandomAccess, Serializable {
    public static final long serialVersionUID = 0;
    public final List fromList;
    public final C22550yc function;

    public final void clear() {
        this.fromList.clear();
    }

    public final Object get(int i) {
        return this.function.apply(this.fromList.get(i));
    }

    public final boolean isEmpty() {
        return this.fromList.isEmpty();
    }

    public final ListIterator listIterator(int i) {
        return new AnonymousClass17J(this, this.fromList.listIterator(i));
    }

    public final Object remove(int i) {
        return this.function.apply(this.fromList.remove(i));
    }

    public final int size() {
        return this.fromList.size();
    }

    public Lists$TransformingRandomAccessList(List list, C22550yc r2) {
        AnonymousClass0a4.A06(list);
        this.fromList = list;
        AnonymousClass0a4.A06(r2);
        this.function = r2;
    }

    public final Iterator iterator() {
        return listIterator();
    }
}
