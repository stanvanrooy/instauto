package p000X;

import java.util.concurrent.Callable;

/* renamed from: X.0qo  reason: invalid class name and case insensitive filesystem */
public final class C17790qo extends C17780qn {
    public final /* synthetic */ Callable A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C17790qo(int i, Callable callable) {
        super(i);
        this.A00 = callable;
    }

    public final void run() {
        try {
            A09(this.A00.call());
        } catch (Exception e) {
            if (!(e instanceof RuntimeException)) {
                A08(e);
                return;
            }
            throw ((RuntimeException) e);
        }
    }

    public final String toString() {
        return this.A00.toString();
    }
}
