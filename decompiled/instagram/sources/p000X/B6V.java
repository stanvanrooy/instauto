package p000X;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.List;
import java.util.Vector;

/* renamed from: X.B6V */
public abstract class B6V {
    public static final Throwable[] A00 = new Throwable[0];

    public void A00(Throwable th, Throwable th2) {
        if (!(this instanceof B6W) && (this instanceof B6Z)) {
            B6Z b6z = (B6Z) this;
            if (th2 == th) {
                throw new IllegalArgumentException("Self suppression is not allowed.", th2);
            } else if (th2 != null) {
                C25195B6b b6b = b6z.A00;
                while (true) {
                    Reference poll = b6b.A00.poll();
                    if (poll == null) {
                        break;
                    }
                    b6b.A01.remove(poll);
                }
                List list = (List) b6b.A01.get(new C25194B6a(th, (ReferenceQueue) null));
                if (list == null) {
                    Vector vector = new Vector(2);
                    list = (List) b6b.A01.putIfAbsent(new C25194B6a(th, b6b.A00), vector);
                    if (list == null) {
                        list = vector;
                    }
                }
                list.add(th2);
            } else {
                throw new NullPointerException("The suppressed exception cannot be null.");
            }
        }
    }
}
