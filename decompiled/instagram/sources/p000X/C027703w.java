package p000X;

import java.io.DataInput;
import java.io.DataOutput;

/* renamed from: X.03w  reason: invalid class name and case insensitive filesystem */
public final class C027703w extends AnonymousClass082 {
    public final long A00() {
        return 2353414016265691865L;
    }

    public final void A01(C035307i r3, DataOutput dataOutput) {
        AnonymousClass01Y r32 = (AnonymousClass01Y) r3;
        dataOutput.writeDouble(r32.A03);
        dataOutput.writeDouble(r32.A02);
        dataOutput.writeDouble(r32.A01);
        dataOutput.writeDouble(r32.A00);
    }

    public final boolean A02(C035307i r3, DataInput dataInput) {
        AnonymousClass01Y r32 = (AnonymousClass01Y) r3;
        r32.A03 = dataInput.readDouble();
        r32.A02 = dataInput.readDouble();
        r32.A01 = dataInput.readDouble();
        r32.A00 = dataInput.readDouble();
        return true;
    }
}
