package p000X;

import com.fasterxml.jackson.databind.JsonSerializer;

/* renamed from: X.C27 */
public final class C27 {
    public final C2P A00;
    public final C12960hf A01;
    public final C0L A02;
    public final JsonSerializer A03;
    public final boolean A04;

    public static C27 A00(C0L c0l, String str, C2P c2p, boolean z) {
        C12960hf r2;
        if (str == null) {
            r2 = null;
        } else {
            r2 = new C12960hf(str);
        }
        return new C27(c0l, r2, c2p, (JsonSerializer) null, z);
    }

    public C27(C0L c0l, C12960hf r2, C2P c2p, JsonSerializer jsonSerializer, boolean z) {
        this.A02 = c0l;
        this.A01 = r2;
        this.A00 = c2p;
        this.A03 = jsonSerializer;
        this.A04 = z;
    }
}
