package p000X;

import com.instagram.pendingmedia.model.PendingMedia;

/* 'enum' modifier removed */
/* renamed from: X.1sI  reason: invalid class name and case insensitive filesystem */
public final class C42401sI extends C42361sE {
    public C42401sI() {
        super("REMOVE_CREATED_MEDIA", 4);
    }

    public final void A00(PendingMedia pendingMedia) {
        C42421sK r0 = pendingMedia.A0v;
        C42421sK r1 = C42421sK.CREATED_MEDIA;
        if (r0 == r1) {
            pendingMedia.A0v = C42421sK.NOT_UPLOADED;
        }
        if (pendingMedia.A0u == r1) {
            pendingMedia.A0u = C42421sK.NOT_UPLOADED;
        }
        if (pendingMedia.A3F == r1) {
            pendingMedia.A3F = C42421sK.NOT_UPLOADED;
        }
    }
}
