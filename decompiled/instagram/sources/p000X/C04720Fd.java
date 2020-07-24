package p000X;

import java.lang.ref.PhantomReference;

/* renamed from: X.0Fd  reason: invalid class name and case insensitive filesystem */
public abstract class C04720Fd extends PhantomReference {
    public C04720Fd A00;
    public C04720Fd A01;

    public abstract void destruct();

    public C04720Fd() {
        super((Object) null, C04750Fg.A02);
    }

    public C04720Fd(Object obj) {
        super(obj, C04750Fg.A02);
        C04720Fd r1;
        C04740Ff r2 = C04750Fg.A01;
        do {
            r1 = (C04720Fd) r2.A00.get();
            this.A00 = r1;
        } while (!r2.A00.compareAndSet(r1, this));
    }
}
