package p000X;

import com.instagram.direct.model.DirectForwardingParams;
import com.instagram.model.direct.DirectThreadKey;

/* renamed from: X.0u5  reason: invalid class name and case insensitive filesystem */
public final class C19810u5 extends C19410tR implements C19460tW {
    public static final C17120pi A04 = new C19820u6();
    public DirectForwardingParams A00;
    public C56312cI A01;
    public String A02;
    public String A03;

    public final String A01() {
        return "send_story_share_message";
    }

    public final C58022fB A03() {
        return C58022fB.STORY_SHARE;
    }

    public final /* bridge */ /* synthetic */ Object A04() {
        return this.A01;
    }

    public final DirectForwardingParams AM6() {
        return this.A00;
    }

    public C19810u5() {
    }

    public C19810u5(AnonymousClass3LQ r7, DirectThreadKey directThreadKey, String str, String str2, AnonymousClass1NJ r11, Long l, long j, DirectForwardingParams directForwardingParams) {
        super(r7, directThreadKey, l, j);
        this.A02 = str;
        this.A01 = new C56312cI(r11);
        this.A03 = str2;
        this.A00 = directForwardingParams;
    }
}
