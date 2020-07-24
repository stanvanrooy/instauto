package p000X;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: X.BUB */
public final class BUB extends C14510kq {
    public final AtomicReferenceFieldUpdater A00;
    public final AtomicReferenceFieldUpdater A01;
    public final AtomicReferenceFieldUpdater A02;
    public final AtomicReferenceFieldUpdater A03;
    public final AtomicReferenceFieldUpdater A04;

    public final void A00(C14530ku r2, C14530ku r3) {
        this.A02.lazySet(r2, r3);
    }

    public final void A01(C14530ku r2, Thread thread) {
        this.A03.lazySet(r2, thread);
    }

    public final boolean A02(C14460kf r2, C14540kv r3, C14540kv r4) {
        return this.A00.compareAndSet(r2, r3, r4);
    }

    public final boolean A03(C14460kf r2, C14530ku r3, C14530ku r4) {
        return this.A04.compareAndSet(r2, r3, r4);
    }

    public final boolean A04(C14460kf r2, Object obj, Object obj2) {
        return this.A01.compareAndSet(r2, obj, obj2);
    }

    public BUB(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.A03 = atomicReferenceFieldUpdater;
        this.A02 = atomicReferenceFieldUpdater2;
        this.A04 = atomicReferenceFieldUpdater3;
        this.A00 = atomicReferenceFieldUpdater4;
        this.A01 = atomicReferenceFieldUpdater5;
    }
}
