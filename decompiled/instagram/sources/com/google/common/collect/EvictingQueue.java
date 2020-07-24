package com.google.common.collect;

import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Queue;
import p000X.AnonymousClass0a4;
import p000X.AnonymousClass17K;
import p000X.C1894587p;
import p000X.C43941vL;

public final class EvictingQueue<E> extends C43941vL<E> implements Serializable {
    public static final long serialVersionUID = 0;
    public final Queue delegate;
    public final int maxSize;

    /* renamed from: A03 */
    public final Queue A02() {
        return this.delegate;
    }

    public EvictingQueue(int i) {
        this.delegate = new ArrayDeque(i);
        this.maxSize = i;
    }

    public final boolean add(Object obj) {
        AnonymousClass0a4.A06(obj);
        if (this.maxSize == 0) {
            return true;
        }
        if (size() == this.maxSize) {
            this.delegate.remove();
        }
        this.delegate.add(obj);
        return true;
    }

    public final boolean addAll(Collection collection) {
        int size = collection.size();
        if (size < this.maxSize) {
            return AnonymousClass17K.A01(this, collection.iterator());
        }
        clear();
        int i = size - this.maxSize;
        AnonymousClass0a4.A06(collection);
        boolean z = false;
        if (i >= 0) {
            z = true;
        }
        AnonymousClass0a4.A0B(z, "number to skip cannot be negative");
        C1894587p r1 = new C1894587p(collection, i);
        if (r1 instanceof Collection) {
            return addAll((Collection) r1);
        }
        AnonymousClass0a4.A06(r1);
        return AnonymousClass17K.A01(this, r1.iterator());
    }

    public final boolean contains(Object obj) {
        Queue A03 = A02();
        AnonymousClass0a4.A06(obj);
        return A03.contains(obj);
    }

    public final boolean offer(Object obj) {
        return add(obj);
    }

    public final boolean remove(Object obj) {
        Queue A03 = A02();
        AnonymousClass0a4.A06(obj);
        return A03.remove(obj);
    }
}
