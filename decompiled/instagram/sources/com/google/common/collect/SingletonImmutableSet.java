package com.google.common.collect;

import java.util.Iterator;
import p000X.AnonymousClass000;
import p000X.AnonymousClass0a4;
import p000X.AnonymousClass960;
import p000X.C239512q;

public final class SingletonImmutableSet<E> extends ImmutableSet<E> {
    public transient int A00;
    public final transient Object A01;

    public final boolean A0F() {
        return false;
    }

    public final int size() {
        return 1;
    }

    public final int A0G(Object[] objArr, int i) {
        objArr[i] = this.A01;
        return i + 1;
    }

    public final C239512q A0I() {
        return new AnonymousClass960(this.A01);
    }

    public final ImmutableList A0J() {
        return ImmutableList.A03(this.A01);
    }

    public final boolean A0K() {
        if (this.A00 != 0) {
            return true;
        }
        return false;
    }

    public final boolean contains(Object obj) {
        return this.A01.equals(obj);
    }

    public final int hashCode() {
        int i = this.A00;
        if (i != 0) {
            return i;
        }
        int hashCode = this.A01.hashCode();
        this.A00 = hashCode;
        return hashCode;
    }

    public final String toString() {
        return AnonymousClass000.A0F("[", this.A01.toString(), ']');
    }

    public final /* bridge */ /* synthetic */ Iterator iterator() {
        return iterator();
    }

    public SingletonImmutableSet(Object obj) {
        AnonymousClass0a4.A06(obj);
        this.A01 = obj;
    }

    public SingletonImmutableSet(Object obj, int i) {
        this.A01 = obj;
        this.A00 = i;
    }
}
