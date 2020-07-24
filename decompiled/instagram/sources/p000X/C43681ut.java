package p000X;

import com.instagram.pendingmedia.model.PendingMedia;

/* renamed from: X.1ut  reason: invalid class name and case insensitive filesystem */
public final class C43681ut {
    public final C06180Ob A00 = C06190Oc.A00;
    public final AnonymousClass0IT A01;

    public C43681ut(AnonymousClass0C1 r3) {
        C43691uu r1 = new C43691uu(r3);
        this.A01 = r1;
    }

    public final void A00(PendingMedia pendingMedia) {
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (pendingMedia) {
            pendingMedia.A0U = currentTimeMillis;
        }
        pendingMedia.A0V(pendingMedia.A0U + 180000, true);
    }
}
