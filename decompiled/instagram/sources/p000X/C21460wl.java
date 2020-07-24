package p000X;

import com.instagram.model.direct.DirectThreadKey;

/* renamed from: X.0wl  reason: invalid class name and case insensitive filesystem */
public final class C21460wl extends C17090pf implements C20570vK {
    public static final C17120pi A04 = new C21470wm();
    public int A00;
    public DirectThreadKey A01;
    public String A02;
    public String A03;

    public final String A01() {
        return "send_poll_vote";
    }

    public final DirectThreadKey AY6() {
        return this.A01;
    }

    public C21460wl() {
    }

    public C21460wl(AnonymousClass3LQ r2, DirectThreadKey directThreadKey, String str, int i) {
        super(r2);
        this.A01 = directThreadKey;
        this.A03 = str;
        this.A00 = i;
        this.A02 = AnonymousClass3LP.A00();
    }
}
