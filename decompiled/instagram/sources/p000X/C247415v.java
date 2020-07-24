package p000X;

import com.instagram.model.mediatype.MediaType;
import com.instagram.pendingmedia.model.PendingMedia;

/* renamed from: X.15v  reason: invalid class name and case insensitive filesystem */
public final class C247415v implements C17120pi {
    public final void BfU(C13460iZ r4, Object obj) {
        C247315u r5 = (C247315u) obj;
        r4.A0T();
        if (r5.A00 != null) {
            r4.A0d("value");
            C106554ih r2 = r5.A00;
            r4.A0T();
            MediaType mediaType = r2.A01;
            if (mediaType != null) {
                r4.A0H("media_type", PendingMedia.A04(mediaType));
            }
            r4.A0E("aspect_ratio", r2.A00);
            r4.A0Q();
        }
        r4.A0Q();
    }

    public final Object BWo(C13080hr r2) {
        return C106574ij.parseFromJson(r2);
    }
}
