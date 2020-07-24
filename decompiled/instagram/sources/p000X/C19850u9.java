package p000X;

import com.instagram.direct.model.DirectForwardingParams;
import com.instagram.model.direct.DirectThreadKey;

/* renamed from: X.0u9  reason: invalid class name and case insensitive filesystem */
public final class C19850u9 extends C19410tR implements C19460tW {
    public static final C17120pi A03 = new C19860uA();
    public DirectForwardingParams A00;
    public AnonymousClass2XR A01;
    public String A02;

    public final String A01() {
        return "send_live_viewer_invite_message";
    }

    public final C58022fB A03() {
        return C58022fB.LIVE_VIEWER_INVITE;
    }

    public final /* bridge */ /* synthetic */ Object A04() {
        return this.A01;
    }

    public final DirectForwardingParams AM6() {
        return this.A00;
    }

    public C19850u9() {
    }

    public C19850u9(AnonymousClass3LQ r9, DirectThreadKey directThreadKey, String str, Long l, long j, DirectForwardingParams directForwardingParams) {
        super(r9, directThreadKey, l, j);
        this.A02 = str;
        this.A01 = new AnonymousClass2XR("");
        this.A00 = directForwardingParams;
    }
}
