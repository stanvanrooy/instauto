package p000X;

/* renamed from: X.0fR  reason: invalid class name and case insensitive filesystem */
public final class C11720fR {
    public boolean A00 = false;
    public final AnonymousClass0QT A01;

    public final void A00(String str, boolean z, Throwable th) {
        C92703za r2 = new C92703za(this.A01.A02("fbresources_loading_failure"));
        if (r2.A0B()) {
            r2.A08("locale", str);
            r2.A08("source", "downloaded");
            r2.A04("is_from_waiting_activity_screen", Boolean.valueOf(z));
            if (th != null) {
                r2.A08("error", th.toString());
            }
            r2.A01();
        }
    }

    public C11720fR(AnonymousClass0QT r2) {
        this.A01 = r2;
    }
}
