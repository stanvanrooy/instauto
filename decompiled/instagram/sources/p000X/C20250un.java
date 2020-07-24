package p000X;

import com.instagram.direct.model.DirectForwardingParams;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.model.direct.gifs.DirectAnimatedMedia;

/* renamed from: X.0un  reason: invalid class name and case insensitive filesystem */
public final class C20250un extends C19410tR implements C19460tW {
    public static final C17120pi A02 = new C20260uo();
    public DirectForwardingParams A00;
    public DirectAnimatedMedia A01;

    public final String A01() {
        return "send_animated_media_message";
    }

    public final C58022fB A03() {
        return C58022fB.ANIMATED_MEDIA;
    }

    public final /* bridge */ /* synthetic */ Object A04() {
        return this.A01;
    }

    public final DirectForwardingParams AM6() {
        return this.A00;
    }

    public C20250un() {
    }

    public C20250un(AnonymousClass3LQ r7, DirectThreadKey directThreadKey, DirectAnimatedMedia directAnimatedMedia, Long l, long j, DirectForwardingParams directForwardingParams) {
        super(r7, directThreadKey, l, j);
        this.A01 = directAnimatedMedia;
        this.A00 = directForwardingParams;
    }
}
