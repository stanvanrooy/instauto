package p000X;

import com.google.common.collect.ImmutableCollection;
import java.util.Arrays;
import java.util.Collection;

/* renamed from: X.0kJ  reason: invalid class name and case insensitive filesystem */
public abstract class C14350kJ extends C14360kK {
    public int A00 = 0;
    public boolean A01;
    public Object[] A02 = new Object[4];

    public C14350kJ() {
        C14370kL.A00(4, "initialCapacity");
    }

    private void A00(int i) {
        Object[] objArr;
        Object[] objArr2 = this.A02;
        int length = objArr2.length;
        if (length < i) {
            objArr = Arrays.copyOf(objArr2, C14360kK.A01(length, i));
        } else if (this.A01) {
            objArr = (Object[]) objArr2.clone();
        } else {
            return;
        }
        this.A02 = objArr;
        this.A01 = false;
    }

    public C14360kK A02(Iterable iterable) {
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            A00(this.A00 + collection.size());
            if (collection instanceof ImmutableCollection) {
                this.A00 = ((ImmutableCollection) collection).A0G(this.A02, this.A00);
                return this;
            }
        }
        super.A02(iterable);
        return this;
    }

    public C14350kJ A05(Object obj) {
        AnonymousClass0a4.A06(obj);
        A00(this.A00 + 1);
        Object[] objArr = this.A02;
        int i = this.A00;
        this.A00 = i + 1;
        objArr[i] = obj;
        return this;
    }

    public /* bridge */ /* synthetic */ C14360kK A03(Object obj) {
        A05(obj);
        return this;
    }
}
