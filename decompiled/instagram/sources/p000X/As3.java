package p000X;

/* renamed from: X.As3 */
public final class As3 {
    public final C24712AsF A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof As3)) {
            return false;
        }
        As3 as3 = (As3) obj;
        return C13150hy.A05(this.A00, as3.A00) && C13150hy.A05(this.A01, as3.A01);
    }

    public final int hashCode() {
        C24712AsF asF = this.A00;
        int i = 0;
        int hashCode = (asF != null ? asF.hashCode() : 0) * 31;
        String str = this.A01;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "RtcCoWatchContentPickerTab(tab=" + this.A00 + ", requestPath=" + this.A01 + ")";
    }

    public As3(C24712AsF asF, String str) {
        C13150hy.A02(asF, "tab");
        C13150hy.A02(str, "requestPath");
        this.A00 = asF;
        this.A01 = str;
    }
}
