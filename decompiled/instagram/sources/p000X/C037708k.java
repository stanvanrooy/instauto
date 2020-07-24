package p000X;

import java.nio.ByteBuffer;
import java.security.NoSuchAlgorithmException;

/* renamed from: X.08k  reason: invalid class name and case insensitive filesystem */
public final class C037708k extends AnonymousClass0FC {
    public C04770Fu A00;

    public C037708k() {
        super(new AnonymousClass09D());
        try {
            this.A00 = new AnonymousClass093();
        } catch (NoSuchAlgorithmException unused) {
            this.A00 = new AnonymousClass096();
        }
    }

    public final void A01(long j, long j2) {
        super.A01(j, j2);
        ByteBuffer allocate = ByteBuffer.allocate(16);
        allocate.putLong(j);
        allocate.putLong(j2);
        C04770Fu r3 = this.A00;
        byte[] array = allocate.array();
        r3.A00(array, 0, array.length);
    }
}
