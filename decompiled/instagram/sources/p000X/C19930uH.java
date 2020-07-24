package p000X;

import com.instagram.direct.model.DirectForwardingParams;
import com.instagram.model.direct.DirectThreadKey;

/* renamed from: X.0uH  reason: invalid class name and case insensitive filesystem */
public final class C19930uH extends C19410tR implements C19460tW {
    public static final C17120pi A02 = new C19940uI();
    public DirectForwardingParams A00;
    public C58482g1 A01;

    public final String A01() {
        return "send_igtv_share_message";
    }

    public final C58022fB A03() {
        return C58022fB.FELIX_SHARE;
    }

    public final /* bridge */ /* synthetic */ Object A04() {
        return this.A01;
    }

    public final DirectForwardingParams AM6() {
        return this.A00;
    }

    public C19930uH() {
    }

    public C19930uH(AnonymousClass3LQ r7, DirectThreadKey directThreadKey, AnonymousClass1NJ r9, Long l, long j, DirectForwardingParams directForwardingParams) {
        super(r7, directThreadKey, l, j);
        this.A01 = new C58482g1(r9);
        this.A00 = directForwardingParams;
    }
}
