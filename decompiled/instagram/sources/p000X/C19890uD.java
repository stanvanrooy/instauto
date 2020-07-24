package p000X;

import com.instagram.direct.model.DirectForwardingParams;
import com.instagram.model.direct.DirectThreadKey;

/* renamed from: X.0uD  reason: invalid class name and case insensitive filesystem */
public final class C19890uD extends C19410tR implements C19460tW {
    public static final C17120pi A02 = new C19900uE();
    public DirectForwardingParams A00;
    public C56382cP A01;

    public final String A01() {
        return "send_media_share_message";
    }

    public final C58022fB A03() {
        return C58022fB.MEDIA_SHARE;
    }

    public final /* bridge */ /* synthetic */ Object A04() {
        return this.A01;
    }

    public final DirectForwardingParams AM6() {
        return this.A00;
    }

    public C19890uD() {
    }

    public C19890uD(AnonymousClass3LQ r7, DirectThreadKey directThreadKey, C56382cP r9, Long l, long j, DirectForwardingParams directForwardingParams) {
        super(r7, directThreadKey, l, j);
        AnonymousClass0a4.A06(r9);
        this.A01 = r9;
        this.A00 = directForwardingParams;
    }
}
