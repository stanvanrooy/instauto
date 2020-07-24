package p000X;

import java.io.DataInput;
import java.io.DataOutput;

/* renamed from: X.03l  reason: invalid class name and case insensitive filesystem */
public final class C026703l extends AnonymousClass082 {
    public final long A00() {
        return -5544646103548483595L;
    }

    public final void A01(C035307i r3, DataOutput dataOutput) {
        AnonymousClass026 r32 = (AnonymousClass026) r3;
        dataOutput.writeLong(r32.A00);
        dataOutput.writeLong(r32.A01);
    }

    public final boolean A02(C035307i r3, DataInput dataInput) {
        AnonymousClass026 r32 = (AnonymousClass026) r3;
        r32.A00 = dataInput.readLong();
        r32.A01 = dataInput.readLong();
        return true;
    }
}
