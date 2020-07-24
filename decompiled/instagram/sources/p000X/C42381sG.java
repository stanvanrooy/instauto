package p000X;

import com.instagram.pendingmedia.model.PendingMedia;

/* 'enum' modifier removed */
/* renamed from: X.1sG  reason: invalid class name and case insensitive filesystem */
public final class C42381sG extends C42361sE {
    public C42381sG() {
        super("REMOVE_UPLOADED_DECOR_IMAGE", 2);
    }

    public final void A00(PendingMedia pendingMedia) {
        C42421sK r0 = pendingMedia.A0v;
        C42421sK r1 = C42421sK.UPLOADED_DECOR_IMAGE;
        if (r0 == r1) {
            pendingMedia.A0v = C42421sK.CREATED_MEDIA;
        }
        if (pendingMedia.A0u == r1) {
            pendingMedia.A0u = C42421sK.CREATED_MEDIA;
        }
        if (pendingMedia.A3F == r1) {
            pendingMedia.A3F = C42421sK.CREATED_MEDIA;
        }
    }
}
