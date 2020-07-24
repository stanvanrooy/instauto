package p000X;

import com.instagram.model.direct.DirectThreadKey;

/* renamed from: X.0vX  reason: invalid class name and case insensitive filesystem */
public final class C20700vX extends C20710vY {
    public static final C17120pi A02 = new C20720vZ();
    public C58862ge A00;
    public String A01;

    public final String A01() {
        return "send_thread_seen_marker";
    }

    public final /* bridge */ /* synthetic */ C58872gf A02() {
        return this.A00;
    }

    public final DirectThreadKey AY6() {
        return new DirectThreadKey(this.A00.A04);
    }

    public C20700vX() {
    }

    public C20700vX(AnonymousClass3LQ r4, C58862ge r5, String str) {
        super(r4);
        this.A00 = r5;
        this.A01 = str;
        this.A05.add(AnonymousClass000.A0E("mark_thread_seen-", r5.A04));
    }
}
