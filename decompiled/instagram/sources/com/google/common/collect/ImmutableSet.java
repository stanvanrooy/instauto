package com.google.common.collect;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;
import p000X.AnonymousClass000;
import p000X.AnonymousClass0a4;
import p000X.AnonymousClass93S;
import p000X.C14420kS;
import p000X.C239512q;
import p000X.C25913Bc3;

public abstract class ImmutableSet<E> extends ImmutableCollection<E> implements Set<E> {
    public transient ImmutableList A00;

    public class SerializedForm implements Serializable {
        public static final long serialVersionUID = 0;
        public final Object[] elements;

        public Object readResolve() {
            return ImmutableSet.A03(this.elements);
        }

        public SerializedForm(Object[] objArr) {
            this.elements = objArr;
        }
    }

    public static ImmutableSet A00(int i, Object... objArr) {
        Object[] objArr2 = objArr;
        if (i == 0) {
            return RegularImmutableSet.A03;
        }
        if (i == 1) {
            return new SingletonImmutableSet(objArr[0]);
        }
        int chooseTableSize = chooseTableSize(i);
        Object[] objArr3 = new Object[chooseTableSize];
        int i2 = chooseTableSize - 1;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (i3 < i) {
            Object obj = objArr[i3];
            if (obj != null) {
                int hashCode = obj.hashCode();
                int A002 = C14420kS.A00(hashCode);
                while (true) {
                    int i6 = A002 & i2;
                    Object obj2 = objArr3[i6];
                    if (obj2 != null) {
                        if (obj2.equals(obj)) {
                            break;
                        }
                        A002++;
                    } else {
                        objArr[i5] = obj;
                        objArr3[i6] = obj;
                        i4 += hashCode;
                        i5++;
                        break;
                    }
                }
                i3++;
            } else {
                throw new NullPointerException(AnonymousClass000.A05("at index ", i3));
            }
        }
        Arrays.fill(objArr, i5, i, (Object) null);
        if (i5 == 1) {
            return new SingletonImmutableSet(objArr[0], i4);
        }
        if (chooseTableSize(i5) < (chooseTableSize >> 1)) {
            return A00(i5, objArr);
        }
        int length = objArr.length;
        int i7 = (length >> 1) + (length >> 2);
        boolean z = false;
        if (i5 < i7) {
            z = true;
        }
        if (z) {
            objArr2 = Arrays.copyOf(objArr, i5);
        }
        return new RegularImmutableSet(objArr2, i4, objArr3, i2, i5);
    }

    public static ImmutableSet A01(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object... objArr) {
        int length = objArr.length;
        boolean z = false;
        if (length <= 2147483641) {
            z = true;
        }
        AnonymousClass0a4.A0B(z, "the total number of elements must fit in an int");
        int i = length + 6;
        Object[] objArr2 = new Object[i];
        objArr2[0] = obj;
        objArr2[1] = obj2;
        objArr2[2] = obj3;
        objArr2[3] = obj4;
        objArr2[4] = obj5;
        objArr2[5] = obj6;
        System.arraycopy(objArr, 0, objArr2, 6, length);
        return A00(i, objArr2);
    }

    public static ImmutableSet A03(Object[] objArr) {
        int length = objArr.length;
        if (length == 0) {
            return RegularImmutableSet.A03;
        }
        if (length != 1) {
            return A00(length, (Object[]) objArr.clone());
        }
        return new SingletonImmutableSet(objArr[0]);
    }

    public static int chooseTableSize(int i) {
        int max = Math.max(i, 2);
        boolean z = true;
        if (max < 751619276) {
            int highestOneBit = Integer.highestOneBit(max - 1) << 1;
            while (((double) highestOneBit) * 0.7d < ((double) max)) {
                highestOneBit <<= 1;
            }
            return highestOneBit;
        }
        if (max >= 1073741824) {
            z = false;
        }
        AnonymousClass0a4.A0B(z, "collection too large");
        return C25913Bc3.MAX_SIGNED_POWER_OF_TWO;
    }

    public abstract C239512q A0I();

    public boolean A0K() {
        return false;
    }

    public static ImmutableSet A02(Collection collection) {
        if ((collection instanceof ImmutableSet) && !(collection instanceof SortedSet)) {
            ImmutableSet immutableSet = (ImmutableSet) collection;
            if (!immutableSet.A0F()) {
                return immutableSet;
            }
        }
        Object[] array = collection.toArray();
        return A00(array.length, array);
    }

    public ImmutableList A0H() {
        ImmutableList immutableList = this.A00;
        if (immutableList != null) {
            return immutableList;
        }
        ImmutableList A0J = A0J();
        this.A00 = A0J;
        return A0J;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof ImmutableSet) && A0K() && ((ImmutableSet) obj).A0K() && hashCode() != obj.hashCode()) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            try {
                if (size() != set.size() || !containsAll(set)) {
                    return false;
                }
                return true;
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    public Object writeReplace() {
        return new SerializedForm(toArray());
    }

    public ImmutableList A0J() {
        return ImmutableList.A0B(toArray());
    }

    public int hashCode() {
        return AnonymousClass93S.A00(this);
    }

    public /* bridge */ /* synthetic */ Iterator iterator() {
        return iterator();
    }
}
