package p000X;

/* renamed from: X.0tS  reason: invalid class name and case insensitive filesystem */
public final class C19420tS implements C17120pi {
    public final void BfU(C13460iZ r3, Object obj) {
        C19400tQ r4 = (C19400tQ) obj;
        r3.A0T();
        if (r4.A00 != null) {
            r3.A0d("cta_link");
            C99544Sb.A00(r3, r4.A00);
        }
        String str = r4.A01;
        if (str != null) {
            r3.A0H("invite_source", str);
        }
        AnonymousClass4RD.A00(r3, r4);
        r3.A0Q();
    }

    public final Object BWo(C13080hr r2) {
        return C99534Sa.parseFromJson(r2);
    }
}
