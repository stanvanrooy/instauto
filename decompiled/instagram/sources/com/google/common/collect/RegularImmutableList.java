package com.google.common.collect;

import p000X.AnonymousClass0a4;

public class RegularImmutableList<E> extends ImmutableList<E> {
    public static final ImmutableList A01 = new RegularImmutableList(new Object[0], 0);
    public final transient int A00;
    public final transient Object[] array;

    public final boolean A0F() {
        return false;
    }

    public final int A0G(Object[] objArr, int i) {
        System.arraycopy(this.array, 0, objArr, i, this.A00);
        return i + this.A00;
    }

    public final Object get(int i) {
        AnonymousClass0a4.A03(i, this.A00);
        return this.array[i];
    }

    public final int size() {
        return this.A00;
    }

    public RegularImmutableList(Object[] objArr, int i) {
        this.array = objArr;
        this.A00 = i;
    }
}
