package p000X;

import com.instagram.model.direct.DirectThreadKey;

/* renamed from: X.0uv  reason: invalid class name and case insensitive filesystem */
public final class C20330uv extends C19410tR {
    public static final C17120pi A01 = new C20340uw();
    public AnonymousClass4SA A00;

    public final String A01() {
        return "configure_media_message";
    }

    public final C58022fB A03() {
        return C58022fB.MEDIA;
    }

    public final /* bridge */ /* synthetic */ Object A04() {
        return this.A00;
    }

    public final String A07() {
        AnonymousClass4SA r1 = this.A00;
        AnonymousClass43I r0 = r1.A01;
        if (r0 != null) {
            return r0.A01;
        }
        return r1.A06;
    }

    public C20330uv() {
    }

    public C20330uv(AnonymousClass3LQ r7, DirectThreadKey directThreadKey, AnonymousClass4SA r9, Long l, long j) {
        super(r7, directThreadKey, l, j);
        String str;
        AnonymousClass43I r0 = r9.A01;
        if (r0 != null) {
            str = r0.A01;
        } else {
            str = r9.A06;
        }
        if (str == null) {
            AnonymousClass0a4.A07(r9.A04, "Invalid DirectPendingMedia object with null PendingMedia");
        }
        this.A00 = r9;
    }
}
