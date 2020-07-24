package p000X;

import java.lang.reflect.Array;

/* renamed from: X.BTY */
public final class BTY {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Class A01;
    public final /* synthetic */ Object A02;

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj != null && obj.getClass() == this.A01 && Array.getLength(obj) == this.A00) {
                int i = 0;
                while (i < this.A00) {
                    Object obj2 = Array.get(this.A02, i);
                    Object obj3 = Array.get(obj, i);
                    if (obj2 == obj3 || obj2 == null || obj2.equals(obj3)) {
                        i++;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public BTY(Class cls, int i, Object obj) {
        this.A01 = cls;
        this.A00 = i;
        this.A02 = obj;
    }
}
