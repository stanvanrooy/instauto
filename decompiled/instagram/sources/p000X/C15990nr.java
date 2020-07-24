package p000X;

/* renamed from: X.0nr  reason: invalid class name and case insensitive filesystem */
public final class C15990nr implements C16010nt {
    public final String A00;

    public final boolean isStreaming() {
        return false;
    }

    public final void A4n(String str, AnonymousClass29J r7) {
        String str2 = this.A00;
        r7.A02.add(r7.A01);
        r7.A02.add(new AnonymousClass29M("Content-Disposition: form-data; name=\"", str, "\"", "\r\n", "\r\n", str2, "\r\n"));
    }

    public C15990nr(String str) {
        this.A00 = str;
    }
}
