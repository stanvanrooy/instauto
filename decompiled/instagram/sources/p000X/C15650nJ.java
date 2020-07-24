package p000X;

import android.os.SystemClock;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.0nJ  reason: invalid class name and case insensitive filesystem */
public final class C15650nJ extends C15190mU {
    public final Map A00 = new HashMap();

    public final void onNewData(AnonymousClass1C4 r6, C256019m r7, ByteBuffer byteBuffer) {
        ((C37641jz) this.A00.get(r6)).A02 += (long) byteBuffer.limit();
    }

    public final void onRequestCallbackDone(AnonymousClass1C4 r9, C256019m r10) {
        C37641jz r7 = (C37641jz) this.A00.get(r9);
        this.A00.remove(r9);
        if (r7 != null) {
            r7.A00 = SystemClock.elapsedRealtime();
            AnonymousClass1CX A002 = AnonymousClass1CX.A00();
            long j = r7.A00;
            boolean z = false;
            if (j != -1) {
                z = true;
            }
            AnonymousClass0a4.A06(Boolean.valueOf(z));
            A002.BIv(j - r7.A01, r7.A02);
        }
    }

    public final void onResponseStarted(AnonymousClass1C4 r3, C256019m r4, C33851db r5) {
        this.A00.put(r3, new C37641jz(this));
    }
}
