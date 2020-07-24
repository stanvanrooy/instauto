package p000X;

import com.instagram.model.direct.DirectThreadKey;
import java.util.Collections;
import java.util.List;

/* renamed from: X.0v2  reason: invalid class name and case insensitive filesystem */
public final class C20400v2 extends C19410tR {
    public static final C17120pi A02 = new C20410v3();
    public C96034Do A00;
    public String A01;

    public final String A01() {
        return "send_status_reply_message";
    }

    public final C58022fB A03() {
        return C58022fB.STATUS_REPLY;
    }

    public final /* bridge */ /* synthetic */ Object A04() {
        return this.A00;
    }

    public final List A06() {
        return Collections.unmodifiableList(this.A01);
    }

    public C20400v2() {
    }

    public C20400v2(AnonymousClass3LQ r7, DirectThreadKey directThreadKey, String str, C96034Do r10, Long l, long j) {
        super(r7, directThreadKey, l, j);
        this.A01 = str;
        this.A00 = r10;
    }
}
