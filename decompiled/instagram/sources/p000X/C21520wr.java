package p000X;

import com.instagram.model.direct.DirectThreadKey;

/* renamed from: X.0wr  reason: invalid class name and case insensitive filesystem */
public final class C21520wr extends C17090pf implements C20570vK {
    public static final C17120pi A02 = new C21530ws();
    public int A00;
    public String A01;

    public final String A01() {
        return "thread_move_folder";
    }

    public final DirectThreadKey AY6() {
        return new DirectThreadKey(this.A01);
    }

    public C21520wr() {
    }

    public C21520wr(AnonymousClass3LQ r1, String str, int i) {
        super(r1);
        this.A01 = str;
        this.A00 = i;
    }
}
