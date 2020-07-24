package p000X;

import com.instagram.model.direct.DirectThreadKey;

/* renamed from: X.0w5  reason: invalid class name and case insensitive filesystem */
public final class C21040w5 extends C17090pf implements C20570vK {
    public static final C17120pi A02 = new C21050w6();
    public String A00;
    public boolean A01;

    public final String A01() {
        return "send_mute_thread_mentions";
    }

    public final DirectThreadKey AY6() {
        return new DirectThreadKey(this.A00);
    }

    public C21040w5() {
    }

    public C21040w5(AnonymousClass3LQ r1, String str, boolean z) {
        super(r1);
        this.A00 = str;
        this.A01 = z;
    }
}
