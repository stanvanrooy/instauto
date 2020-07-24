package p000X;

import com.instagram.direct.model.DirectForwardingParams;
import com.instagram.model.direct.DirectThreadKey;

/* renamed from: X.0tl  reason: invalid class name and case insensitive filesystem */
public final class C19610tl extends C19410tR implements C19460tW {
    public static final C17120pi A04 = new C19620tm();
    public DirectForwardingParams A00;
    public AnonymousClass2cE A01;
    public C99424Rp A02;
    public String A03;

    public final String A01() {
        return "send_link_message";
    }

    public final C58022fB A03() {
        return C58022fB.LINK;
    }

    public final /* bridge */ /* synthetic */ Object A04() {
        return this.A01;
    }

    public final DirectForwardingParams AM6() {
        return this.A00;
    }

    public C19610tl() {
    }

    public C19610tl(AnonymousClass3LQ r7, DirectThreadKey directThreadKey, AnonymousClass2cE r9, Long l, long j, String str, C99424Rp r14, DirectForwardingParams directForwardingParams) {
        super(r7, directThreadKey, l, j);
        this.A01 = r9;
        this.A03 = str;
        this.A02 = r14;
        this.A00 = directForwardingParams;
    }

    public C19610tl(AnonymousClass3LQ r7, DirectThreadKey directThreadKey, String str, AnonymousClass2cE r10, Long l, long j) {
        super(r7, directThreadKey, l, j);
        this.A00 = str;
        this.A01 = r10;
    }
}
