package com.google.common.collect;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import p000X.AnonymousClass000;
import p000X.AnonymousClass0a4;
import p000X.AnonymousClass17M;
import p000X.AnonymousClass267;
import p000X.C239212n;
import p000X.C239412p;
import p000X.C239512q;

public abstract class ImmutableList<E> extends ImmutableCollection<E> implements List<E>, RandomAccess {
    public static final C239412p A00 = new C239212n(RegularImmutableList.A01, 0);

    public class SerializedForm implements Serializable {
        public static final long serialVersionUID = 0;
        public final Object[] elements;

        public Object readResolve() {
            return ImmutableList.A0C(this.elements);
        }

        public SerializedForm(Object[] objArr) {
            this.elements = objArr;
        }
    }

    public class SubList extends ImmutableList<E> {
        public final transient int A00;
        public final transient int A01;

        public final boolean A0F() {
            return true;
        }

        public SubList(int i, int i2) {
            this.A01 = i;
            this.A00 = i2;
        }

        /* renamed from: A0J */
        public final ImmutableList subList(int i, int i2) {
            AnonymousClass0a4.A05(i, i2, this.A00);
            ImmutableList immutableList = ImmutableList.this;
            int i3 = this.A01;
            return immutableList.subList(i + i3, i2 + i3);
        }

        public final Object get(int i) {
            AnonymousClass0a4.A03(i, this.A00);
            return ImmutableList.this.get(i + this.A01);
        }

        public final /* bridge */ /* synthetic */ Iterator iterator() {
            return ImmutableList.super.A0I();
        }

        public final int size() {
            return this.A00;
        }

        public final /* bridge */ /* synthetic */ ListIterator listIterator() {
            return ImmutableList.super.listIterator();
        }

        public final /* bridge */ /* synthetic */ ListIterator listIterator(int i) {
            return ImmutableList.super.listIterator(i);
        }
    }

    public static ImmutableList A03(Object obj) {
        return A0D(obj);
    }

    public static ImmutableList A04(Object obj, Object obj2) {
        return A0D(obj, obj2);
    }

    public static ImmutableList A05(Object obj, Object obj2, Object obj3) {
        return A0D(obj, obj2, obj3);
    }

    public static ImmutableList A06(Object obj, Object obj2, Object obj3, Object obj4) {
        return A0D(obj, obj2, obj3, obj4);
    }

    public static ImmutableList A07(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        return A0D(obj, obj2, obj3, obj4, obj5, obj6, obj7);
    }

    public static ImmutableList A0B(Object[] objArr) {
        return A0E(objArr, objArr.length);
    }

    public static ImmutableList A0C(Object[] objArr) {
        if (objArr.length == 0) {
            return A01();
        }
        return A0D((Object[]) objArr.clone());
    }

    public static ImmutableList A0D(Object... objArr) {
        int length = objArr.length;
        int i = 0;
        while (i < length) {
            if (objArr[i] != null) {
                i++;
            } else {
                throw new NullPointerException(AnonymousClass000.A05("at index ", i));
            }
        }
        return A0B(objArr);
    }

    public final ImmutableList A0H() {
        return this;
    }

    /* renamed from: A0L */
    public final C239412p listIterator() {
        return listIterator(0);
    }

    public static AnonymousClass267 A00() {
        return new AnonymousClass267();
    }

    public static ImmutableList A01() {
        return RegularImmutableList.A01;
    }

    public static ImmutableList A08(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8) {
        return A0D(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8);
    }

    public static ImmutableList A09(Collection collection) {
        if (!(collection instanceof ImmutableCollection)) {
            return A0D(collection.toArray());
        }
        ImmutableList A0H = ((ImmutableCollection) collection).A0H();
        if (A0H.A0F()) {
            return A0B(A0H.toArray());
        }
        return A0H;
    }

    public static ImmutableList A0E(Object[] objArr, int i) {
        if (i == 0) {
            return A01();
        }
        return new RegularImmutableList(objArr, i);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Use SerializedForm");
    }

    public final ImmutableList A0K(int i, int i2) {
        return new SubList(i, i2 - i);
    }

    public final void add(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    public final boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException();
    }

    public final int indexOf(Object obj) {
        if (obj != null) {
            if (this instanceof RandomAccess) {
                int size = size();
                int i = 0;
                if (obj == null) {
                    while (i < size) {
                        if (get(i) == null) {
                            return i;
                        }
                        i++;
                    }
                } else {
                    while (i < size) {
                        if (obj.equals(get(i))) {
                            return i;
                        }
                        i++;
                    }
                }
            } else {
                ListIterator listIterator = listIterator();
                while (listIterator.hasNext()) {
                    if (AnonymousClass17M.A00(obj, listIterator.next())) {
                        return listIterator.previousIndex();
                    }
                }
            }
        }
        return -1;
    }

    public final int lastIndexOf(Object obj) {
        if (obj != null) {
            if (!(this instanceof RandomAccess)) {
                ListIterator listIterator = listIterator(size());
                while (listIterator.hasPrevious()) {
                    if (AnonymousClass17M.A00(obj, listIterator.previous())) {
                        return listIterator.nextIndex();
                    }
                }
            } else if (obj == null) {
                for (int size = size() - 1; size >= 0; size--) {
                    if (get(size) == null) {
                        return size;
                    }
                }
            } else {
                for (int size2 = size() - 1; size2 >= 0; size2--) {
                    if (obj.equals(get(size2))) {
                        return size2;
                    }
                }
            }
        }
        return -1;
    }

    public final Object remove(int i) {
        throw new UnsupportedOperationException();
    }

    public final Object set(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    public Object writeReplace() {
        return new SerializedForm(toArray());
    }

    public static ImmutableList A02(Iterable iterable) {
        AnonymousClass0a4.A06(iterable);
        if (iterable instanceof Collection) {
            return A09((Collection) iterable);
        }
        return A0A(iterable.iterator());
    }

    public static ImmutableList A0A(Iterator it) {
        if (!it.hasNext()) {
            return A01();
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return A03(next);
        }
        AnonymousClass267 r0 = new AnonymousClass267();
        r0.A08(next);
        r0.A09(it);
        return r0.A06();
    }

    public int A0G(Object[] objArr, int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i + i2] = get(i2);
        }
        return i + size;
    }

    public final C239512q A0I() {
        return listIterator();
    }

    /* renamed from: A0J */
    public ImmutableList subList(int i, int i2) {
        AnonymousClass0a4.A05(i, i2, size());
        int i3 = i2 - i;
        if (i3 == size()) {
            return this;
        }
        if (i3 == 0) {
            return A01();
        }
        return A0K(i, i2);
    }

    /* renamed from: A0M */
    public final C239412p listIterator(int i) {
        AnonymousClass0a4.A04(i, size());
        if (isEmpty()) {
            return A00;
        }
        return new C239212n(this, i);
    }

    public final boolean contains(Object obj) {
        if (indexOf(obj) >= 0) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x003f  */
    public final boolean equals(Object obj) {
        AnonymousClass0a4.A06(this);
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        List list = (List) obj;
        int size = size();
        if (size != list.size()) {
            return false;
        }
        if (!(this instanceof RandomAccess) || !(list instanceof RandomAccess)) {
            Iterator it = list.iterator();
            for (Object A002 : this) {
                if (!it.hasNext() || !AnonymousClass17M.A00(A002, it.next())) {
                    return false;
                }
                while (r3.hasNext()) {
                }
            }
            return !it.hasNext();
        }
        for (int i = 0; i < size; i++) {
            if (!AnonymousClass17M.A00(get(i), list.get(i))) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int size = size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            i = (((i * 31) + get(i2).hashCode()) ^ -1) ^ -1;
        }
        return i;
    }

    public /* bridge */ /* synthetic */ Iterator iterator() {
        return iterator();
    }
}
