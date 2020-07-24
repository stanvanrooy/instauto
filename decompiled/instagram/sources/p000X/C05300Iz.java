package p000X;

import android.os.MessageQueue;

/* renamed from: X.0Iz  reason: invalid class name and case insensitive filesystem */
public final class C05300Iz implements MessageQueue.IdleHandler {
    public final /* synthetic */ C05290Iy A00;

    public C05300Iz(C05290Iy r1) {
        this.A00 = r1;
    }

    public final boolean queueIdle() {
        boolean Abj = this.A00.A02.Abj();
        if (Abj) {
            C05290Iy r0 = this.A00;
            r0.A00.markerAnnotate(31784965, "from_pk", r0.A02.A04());
            C05290Iy r02 = this.A00;
            r02.A00.markerAnnotate(31784965, "to_pk", r02.A03.getId());
            C05290Iy r03 = this.A00;
            r03.A00.markerAnnotate(31784965, "entry_point", r03.A04);
            this.A00.A00.markerEnd(31784965, 2);
        }
        return !Abj;
    }
}
