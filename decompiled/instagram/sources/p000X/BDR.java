package p000X;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: X.BDR */
public final class BDR {
    public static final AtomicReferenceFieldUpdater A00 = AtomicReferenceFieldUpdater.newUpdater(BDR.class, Object.class, "_state");
    public volatile Object _state = null;
}
