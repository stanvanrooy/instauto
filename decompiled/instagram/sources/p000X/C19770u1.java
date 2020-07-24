package p000X;

import com.instagram.model.direct.DirectShareTarget;
import com.instagram.model.direct.DirectThreadKey;

/* renamed from: X.0u1  reason: invalid class name and case insensitive filesystem */
public final class C19770u1 extends C19410tR {
    public static final C17120pi A04 = new C19780u2();
    public C99974Ts A00;
    public DirectShareTarget A01;
    public String A02;
    public String A03;

    public final String A01() {
        return "send_live_video_share_message";
    }

    public final C58022fB A03() {
        return C58022fB.LIVE_VIDEO_SHARE;
    }

    public final /* bridge */ /* synthetic */ Object A04() {
        return this.A00;
    }

    public C19770u1() {
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    public C19770u1(AnonymousClass3LQ r7, DirectThreadKey directThreadKey, String str, C38031kc r10, int i, String str2, String str3, Long l, long j) {
        super(r1, directThreadKey, l, j);
        AnonymousClass3LQ r1 = r7;
        this.A03 = str;
        this.A00 = new C99974Ts(r10, i, str2);
        this.A02 = str3;
    }
}
