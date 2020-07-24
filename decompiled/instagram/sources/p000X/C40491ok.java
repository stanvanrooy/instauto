package p000X;

/* renamed from: X.1ok  reason: invalid class name and case insensitive filesystem */
public final class C40491ok {
    public boolean A00;
    public final C40451og A01;
    public final C40461oh A02;

    public final boolean A00() {
        if (this.A01.A00 || this.A02.A00() || AnonymousClass1CU.A00() || this.A01.A01) {
            return true;
        }
        return false;
    }

    public C40491ok(C40451og r5, C40461oh r6, AnonymousClass0C1 r7) {
        this.A01 = r5;
        this.A02 = r6;
        this.A00 = ((Boolean) AnonymousClass0L6.A02(r7, AnonymousClass0L7.HTTP_TRANSFER_EVENT, "is_enabled", false, (AnonymousClass04H) null)).booleanValue();
    }
}
