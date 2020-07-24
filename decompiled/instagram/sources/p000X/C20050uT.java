package p000X;

import com.instagram.direct.model.DirectForwardingParams;
import com.instagram.model.direct.DirectThreadKey;

/* renamed from: X.0uT  reason: invalid class name and case insensitive filesystem */
public final class C20050uT extends C19410tR implements C19460tW {
    public static final C17120pi A02 = new C20060uU();
    public DirectForwardingParams A00;
    public C13300iJ A01;

    public final String A01() {
        return "send_profile_share_message";
    }

    public final C58022fB A03() {
        return C58022fB.PROFILE;
    }

    public final /* bridge */ /* synthetic */ Object A04() {
        return this.A01;
    }

    public final DirectForwardingParams AM6() {
        return this.A00;
    }

    public C20050uT() {
    }

    public C20050uT(AnonymousClass3LQ r7, DirectThreadKey directThreadKey, C13300iJ r9, Long l, long j, DirectForwardingParams directForwardingParams) {
        super(r7, directThreadKey, l, j);
        this.A01 = r9;
        this.A00 = directForwardingParams;
    }
}
