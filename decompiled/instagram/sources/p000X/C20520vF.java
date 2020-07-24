package p000X;

import com.instagram.model.direct.DirectThreadKey;
import com.instagram.pendingmedia.model.PendingMedia;

/* renamed from: X.0vF  reason: invalid class name and case insensitive filesystem */
public final class C20520vF extends C19410tR {
    public static final C17120pi A01 = new C20530vG();
    public AnonymousClass4SA A00;

    public final String A01() {
        return "send_selfie_sticker_message";
    }

    public final C58022fB A03() {
        return C58022fB.SELFIE_STICKER;
    }

    public final /* bridge */ /* synthetic */ Object A04() {
        return this.A00;
    }

    public C20520vF() {
    }

    public C20520vF(AnonymousClass3LQ r7, DirectThreadKey directThreadKey, PendingMedia pendingMedia, long j, Long l) {
        super(r7, directThreadKey, l, j);
        this.A00 = AnonymousClass4SA.A00(pendingMedia);
    }
}
