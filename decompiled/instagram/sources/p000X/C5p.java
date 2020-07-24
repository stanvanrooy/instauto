package p000X;

import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* renamed from: X.C5p */
public final class C5p {
    public static C28843Cnd A00 = new C28819CnF();
    public static ArrayList A01 = new ArrayList();
    public static ThreadLocal A02 = new ThreadLocal();

    public static C04450Ea A00() {
        C04450Ea r0;
        WeakReference weakReference = (WeakReference) A02.get();
        if (weakReference != null && (r0 = (C04450Ea) weakReference.get()) != null) {
            return r0;
        }
        C04450Ea r2 = new C04450Ea();
        A02.set(new WeakReference(r2));
        return r2;
    }
}
