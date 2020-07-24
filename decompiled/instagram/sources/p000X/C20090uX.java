package p000X;

import com.instagram.model.direct.DirectThreadKey;
import com.instagram.model.hashtag.Hashtag;

/* renamed from: X.0uX  reason: invalid class name and case insensitive filesystem */
public final class C20090uX extends C19410tR {
    public static final C17120pi A01 = new C20100uY();
    public Hashtag A00;

    public final String A01() {
        return "send_hashtag_share_message";
    }

    public final C58022fB A03() {
        return C58022fB.HASHTAG;
    }

    public final /* bridge */ /* synthetic */ Object A04() {
        return this.A00;
    }

    public C20090uX() {
    }

    public C20090uX(AnonymousClass3LQ r7, DirectThreadKey directThreadKey, Hashtag hashtag, Long l, long j) {
        super(r7, directThreadKey, l, j);
        this.A00 = hashtag;
    }
}
