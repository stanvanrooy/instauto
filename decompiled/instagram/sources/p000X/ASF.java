package p000X;

/* renamed from: X.ASF */
public final class ASF implements C23544AQo {
    public final /* synthetic */ ASC A00;

    public final void onFailure() {
    }

    public ASF(ASC asc) {
        this.A00 = asc;
    }

    public final void BJq(String str) {
        if (str != null) {
            try {
                this.A00.A05.A01 = Long.valueOf(Long.parseLong(str));
            } catch (NumberFormatException unused) {
            }
        }
    }
}
