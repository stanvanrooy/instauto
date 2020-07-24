package p000X;

/* renamed from: X.AE7 */
public final class AE7 implements AnonymousClass662 {
    public final /* synthetic */ AE6 A00;
    public final /* synthetic */ C23236ADz A01;

    public AE7(AE6 ae6, C23236ADz aDz) {
        this.A00 = ae6;
        this.A01 = aDz;
    }

    public final void onSearchCleared(String str) {
        C23236ADz.A01(this.A01, "");
    }

    public final void onSearchTextChanged(String str) {
        C23236ADz aDz = this.A01;
        if (str == null) {
            str = "";
        }
        C23236ADz.A01(aDz, str);
    }
}
