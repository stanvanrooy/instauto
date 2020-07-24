package p000X;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.DRD */
public final class DRD extends AtomicReference implements Runnable, C27711Ix, C29946DHw {
    public final DRE A00 = new DRE();
    public final DRE A01 = new DRE();

    public final void dispose() {
        if (getAndSet((Object) null) != null) {
            this.A01.dispose();
            this.A00.dispose();
        }
    }

    public DRD(Runnable runnable) {
        super(runnable);
    }

    public final void run() {
        Runnable runnable = (Runnable) get();
        if (runnable != null) {
            try {
                runnable.run();
            } finally {
                lazySet((Object) null);
                DRE dre = this.A01;
                AnonymousClass1KP r1 = AnonymousClass1KP.A01;
                dre.lazySet(r1);
                this.A00.lazySet(r1);
            }
        }
    }
}
