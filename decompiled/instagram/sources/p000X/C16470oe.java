package p000X;

import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.0oe  reason: invalid class name and case insensitive filesystem */
public final class C16470oe extends C15190mU {
    public final Map A00 = Collections.synchronizedMap(new HashMap());
    public final /* synthetic */ C16450oc A01;

    public C16470oe(C16450oc r2) {
        this.A01 = r2;
    }

    public final void onNewData(AnonymousClass1C4 r4, C256019m r5, ByteBuffer byteBuffer) {
        int intValue;
        if (this.A00.get(r4) == null) {
            intValue = 0;
        } else {
            intValue = ((Integer) this.A00.get(r4)).intValue();
        }
        this.A00.put(r4, Integer.valueOf(Integer.valueOf(intValue).intValue() + byteBuffer.limit()));
    }

    public final void onRequestCallbackDone(AnonymousClass1C4 r9, C256019m r10) {
        int intValue;
        if (this.A00.get(r9) == null) {
            intValue = 0;
        } else {
            intValue = ((Integer) this.A00.get(r9)).intValue();
        }
        this.A01.A00.A00(r10.A05, r10.A00(), 1, (long) Integer.valueOf(intValue).intValue());
        this.A00.remove(r9);
    }
}
