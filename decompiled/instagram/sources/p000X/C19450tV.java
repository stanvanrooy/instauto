package p000X;

import com.instagram.direct.model.DirectForwardingParams;
import com.instagram.model.direct.DirectThreadKey;
import java.util.List;

/* renamed from: X.0tV  reason: invalid class name and case insensitive filesystem */
public final class C19450tV extends C19410tR implements C19460tW {
    public static final C17120pi A05 = new C19470tX();
    public DirectForwardingParams A00;
    public C99424Rp A01;
    public String A02;
    public String A03;
    public List A04;

    public final String A01() {
        return "send_text_message";
    }

    public final C99424Rp A02() {
        return this.A01;
    }

    public final C58022fB A03() {
        return C58022fB.TEXT;
    }

    public final /* bridge */ /* synthetic */ Object A04() {
        return this.A03;
    }

    public final DirectForwardingParams AM6() {
        return this.A00;
    }

    public C19450tV() {
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    public C19450tV(AnonymousClass3LQ r7, DirectThreadKey directThreadKey, String str, Long l, Long l2, String str2, List list, C99424Rp r14, DirectForwardingParams directForwardingParams) {
        super(r1, directThreadKey, l, l2.longValue());
        AnonymousClass3LQ r1 = r7;
        this.A03 = str;
        this.A02 = str2;
        this.A04 = list;
        this.A01 = r14;
        this.A00 = directForwardingParams;
    }

    public C19450tV(AnonymousClass3LQ r7, DirectThreadKey directThreadKey, String str, String str2, Long l, long j) {
        super(r7, directThreadKey, l, j);
        this.A00 = str;
        this.A03 = str2;
    }
}
