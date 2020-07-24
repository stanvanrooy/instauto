package com.google.common.collect;

import java.io.Serializable;
import java.util.AbstractSequentialList;
import java.util.List;
import java.util.ListIterator;
import p000X.AnonymousClass0a4;
import p000X.AnonymousClass17H;
import p000X.C22550yc;

public class Lists$TransformingSequentialList<F, T> extends AbstractSequentialList<T> implements Serializable {
    public static final long serialVersionUID = 0;
    public final List fromList;
    public final C22550yc function;

    public final void clear() {
        this.fromList.clear();
    }

    public final ListIterator listIterator(int i) {
        return new AnonymousClass17H(this, this.fromList.listIterator(i));
    }

    public final int size() {
        return this.fromList.size();
    }

    public Lists$TransformingSequentialList(List list, C22550yc r2) {
        AnonymousClass0a4.A06(list);
        this.fromList = list;
        AnonymousClass0a4.A06(r2);
        this.function = r2;
    }
}
