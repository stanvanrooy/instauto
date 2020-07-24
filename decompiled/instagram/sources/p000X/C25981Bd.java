package p000X;

/* renamed from: X.1Bd  reason: invalid class name and case insensitive filesystem */
public final class C25981Bd implements C11590fD {
    public final /* synthetic */ C06590Pq A00;

    public C25981Bd(C06590Pq r1) {
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ Object get() {
        C25991Be r1;
        C22560yd A002 = new C22530ya(StoredPreferences.A00, "AuthHeaderPrefs").A00();
        synchronized (C25991Be.class) {
            if (C25991Be.A02 == null) {
                C25991Be.A02 = new C25991Be(StoredPreferences.A00);
            }
            r1 = C25991Be.A02;
        }
        return new C25971Bc(A002, r1, this.A00);
    }
}
