package p000X;

import android.os.Bundle;
import android.os.ResultReceiver;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.D29 */
public final class D29 {
    public final D4L A00;
    public final AtomicReference A01;

    public final void A00(C41961rG r5) {
        C29662D3v d3v = (C29662D3v) this.A01.get();
        C39751nS r0 = r5.A00;
        if (d3v != null) {
            int i = r0.A00;
            Bundle bundle = new Bundle();
            bundle.putSerializable("ServiceEvent", r5);
            ResultReceiver resultReceiver = d3v.A00;
            if (resultReceiver != null) {
                resultReceiver.send(i, bundle);
                return;
            }
            return;
        }
        C40431oe.A01("ServiceEventCallbackImpl", "skipping log because listener is null", new Object[0]);
    }

    public D29(AtomicReference atomicReference, D4L d4l) {
        this.A01 = atomicReference;
        this.A00 = d4l;
        C40431oe.A01("ServiceEventCallbackImpl", "setting listener for event callback to: " + atomicReference, new Object[0]);
    }
}
