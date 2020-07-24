package p000X;

import java.lang.reflect.Array;
import java.util.AbstractList;

/* renamed from: X.BTX */
public final class BTX extends AbstractList {
    public final /* synthetic */ Object A00;

    public BTX(Object obj) {
        this.A00 = obj;
    }

    public final Object get(int i) {
        return Array.get(this.A00, i);
    }

    public final int size() {
        return Array.getLength(this.A00);
    }
}
