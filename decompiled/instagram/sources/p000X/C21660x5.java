package p000X;

import com.instagram.direct.model.DirectForwardingParams;
import com.instagram.model.direct.DirectThreadKey;

/* renamed from: X.0x5  reason: invalid class name and case insensitive filesystem */
public final class C21660x5 extends C19410tR implements C19460tW {
    public static final C17120pi A02 = new C21670x6();
    public DirectForwardingParams A00;
    public AnonymousClass1NJ A01;

    public final String A01() {
        return "forward_media_message";
    }

    public final C58022fB A03() {
        return C58022fB.MEDIA;
    }

    public final /* bridge */ /* synthetic */ Object A04() {
        return this.A01;
    }

    public final DirectForwardingParams AM6() {
        return this.A00;
    }

    public C21660x5() {
    }

    public C21660x5(AnonymousClass3LQ r7, DirectThreadKey directThreadKey, AnonymousClass1NJ r9, Long l, long j, DirectForwardingParams directForwardingParams) {
        super(r7, directThreadKey, l, j);
        this.A01 = r9;
        this.A00 = directForwardingParams;
    }
}
