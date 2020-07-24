package p000X;

import com.instagram.pendingmedia.store.PendingMediaStore;
import java.util.ArrayList;

/* renamed from: X.0zs  reason: invalid class name and case insensitive filesystem */
public final class C23280zs implements Runnable {
    public final /* synthetic */ C23240zn A00;

    public C23280zs(C23240zn r1) {
        this.A00 = r1;
    }

    public final void run() {
        if (!new ArrayList(PendingMediaStore.A01(this.A00.A01).A02.keySet()).isEmpty()) {
            C23240zn r0 = this.A00;
            C17870qw.A00(r0.A00, r0.A01);
        }
    }
}
