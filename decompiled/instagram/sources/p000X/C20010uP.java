package p000X;

import com.instagram.model.direct.DirectThreadKey;
import java.util.Collections;

/* renamed from: X.0uP  reason: invalid class name and case insensitive filesystem */
public final class C20010uP extends C19410tR {
    public static final C17120pi A01 = new C20020uQ();
    public C103024cY A00;

    public final String A01() {
        return "send_guide_share_message";
    }

    public final C58022fB A03() {
        return C58022fB.GUIDE_SHARE;
    }

    public final /* bridge */ /* synthetic */ Object A04() {
        return this.A00;
    }

    public C20010uP() {
    }

    public C20010uP(AnonymousClass3LQ r7, DirectThreadKey directThreadKey, C120925Gn r9, Long l, long j) {
        super(r7, Collections.singletonList(directThreadKey), l, j);
        this.A00 = new C103024cY(r9);
    }
}
