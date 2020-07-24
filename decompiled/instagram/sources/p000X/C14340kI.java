package p000X;

import com.google.common.collect.ImmutableSet;
import com.google.common.collect.RegularImmutableSet;
import com.google.common.collect.SingletonImmutableSet;
import java.util.Arrays;
import java.util.Iterator;

/* renamed from: X.0kI  reason: invalid class name and case insensitive filesystem */
public final class C14340kI extends C14350kJ {
    public int A00;
    public Object[] hashTable;

    public final ImmutableSet A06() {
        ImmutableSet A002;
        int i = this.A00;
        if (i == 0) {
            return RegularImmutableSet.A03;
        }
        if (i == 1) {
            return new SingletonImmutableSet(this.A02[0]);
        }
        if (this.hashTable == null || ImmutableSet.chooseTableSize(i) != this.hashTable.length) {
            A002 = ImmutableSet.A00(this.A00, this.A02);
            this.A00 = A002.size();
        } else {
            int i2 = this.A00;
            Object[] objArr = this.A02;
            int length = objArr.length;
            int i3 = (length >> 1) + (length >> 2);
            boolean z = false;
            if (i2 < i3) {
                z = true;
            }
            if (z) {
                objArr = Arrays.copyOf(objArr, i2);
            }
            int i4 = this.A00;
            Object[] objArr2 = this.hashTable;
            A002 = new RegularImmutableSet(objArr, i4, objArr2, objArr2.length - 1, this.A00);
        }
        this.A01 = true;
        this.hashTable = null;
        return A002;
    }

    public final /* bridge */ /* synthetic */ C14360kK A04(Iterator it) {
        AnonymousClass0a4.A06(it);
        while (it.hasNext()) {
            A08(it.next());
        }
        return this;
    }

    public final void A07(Iterable iterable) {
        AnonymousClass0a4.A06(iterable);
        if (this.hashTable != null) {
            for (Object A08 : iterable) {
                A08(A08);
            }
            return;
        }
        super.A02(iterable);
    }

    public final void A08(Object obj) {
        int length;
        AnonymousClass0a4.A06(obj);
        if (this.hashTable == null || ImmutableSet.chooseTableSize(this.A00) > (length = this.hashTable.length)) {
            this.hashTable = null;
            super.A05(obj);
            return;
        }
        int i = length - 1;
        int hashCode = obj.hashCode();
        int A002 = C14420kS.A00(hashCode);
        while (true) {
            int i2 = A002 & i;
            Object[] objArr = this.hashTable;
            Object obj2 = objArr[i2];
            if (obj2 == null) {
                objArr[i2] = obj;
                this.A00 += hashCode;
                super.A05(obj);
                return;
            } else if (!obj2.equals(obj)) {
                A002 = i2 + 1;
            } else {
                return;
            }
        }
    }

    public final /* bridge */ /* synthetic */ C14360kK A02(Iterable iterable) {
        A07(iterable);
        return this;
    }

    public final /* bridge */ /* synthetic */ C14360kK A03(Object obj) {
        A08(obj);
        return this;
    }

    public final /* bridge */ /* synthetic */ C14350kJ A05(Object obj) {
        A08(obj);
        return this;
    }
}
