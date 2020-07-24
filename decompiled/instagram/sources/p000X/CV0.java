package p000X;

import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.CV0 */
public final class CV0 implements C40371oY {
    public final long A00;
    public final ImageUrl A01;
    public final Integer A02;
    public final String A03;
    public final String A04;
    public final String A05;

    /* renamed from: A00 */
    public final boolean Aep(CV0 cv0) {
        if (!this.A04.equals(cv0.A04) || !this.A03.equals(cv0.A03) || this.A02 != cv0.A02) {
            return false;
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ Object getKey() {
        return Long.valueOf(this.A00);
    }

    public CV0(long j, String str, ImageUrl imageUrl, String str2, String str3, Integer num) {
        this.A00 = j;
        this.A04 = str;
        this.A01 = imageUrl;
        this.A03 = str2;
        this.A05 = str3;
        this.A02 = num;
    }
}
