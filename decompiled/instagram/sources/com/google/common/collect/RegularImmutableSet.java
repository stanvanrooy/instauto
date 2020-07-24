package com.google.common.collect;

import java.util.Iterator;
import p000X.C14420kS;
import p000X.C239512q;

public final class RegularImmutableSet<E> extends ImmutableSet<E> {
    public static final RegularImmutableSet A03 = new RegularImmutableSet(new Object[0], 0, (Object[]) null, 0, 0);
    public final transient int A00;
    public final transient int A01;
    public final transient int A02;
    public final transient Object[] elements;
    public final transient Object[] table;

    public final boolean A0F() {
        return false;
    }

    public final boolean A0K() {
        return true;
    }

    public final int A0G(Object[] objArr, int i) {
        System.arraycopy(this.elements, 0, objArr, i, this.A02);
        return i + this.A02;
    }

    public final ImmutableList A0J() {
        return ImmutableList.A0E(this.elements, this.A02);
    }

    public final boolean contains(Object obj) {
        int hashCode;
        Object[] objArr = this.table;
        if (obj != null && objArr != null) {
            if (obj == null) {
                hashCode = 0;
            } else {
                hashCode = obj.hashCode();
            }
            int A002 = C14420kS.A00(hashCode);
            while (true) {
                int i = A002 & this.A01;
                Object obj2 = objArr[i];
                if (obj2 == null) {
                    break;
                } else if (obj2.equals(obj)) {
                    return true;
                } else {
                    A002 = i + 1;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.A00;
    }

    public final int size() {
        return this.A02;
    }

    public RegularImmutableSet(Object[] objArr, int i, Object[] objArr2, int i2, int i3) {
        this.elements = objArr;
        this.table = objArr2;
        this.A01 = i2;
        this.A00 = i;
        this.A02 = i3;
    }

    public final C239512q A0I() {
        return A0H().iterator();
    }

    public final /* bridge */ /* synthetic */ Iterator iterator() {
        return iterator();
    }
}
