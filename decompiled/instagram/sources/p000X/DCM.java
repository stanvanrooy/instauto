package p000X;

import java.lang.reflect.Array;

/* renamed from: X.DCM */
public final class DCM {
    public int A00 = 0;
    public int A01 = 0;
    public final Object[] A02;

    public DCM(Class cls) {
        this.A02 = (Object[]) Array.newInstance(cls, 10);
    }
}
