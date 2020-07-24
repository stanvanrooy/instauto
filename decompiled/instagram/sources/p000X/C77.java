package p000X;

import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.C77 */
public final class C77 {
    public final int A00;
    public final ImageUrl A01;
    public final Integer A02;
    public final String A03;
    public final String A04;

    public final String toString() {
        return "InsightsViewSubSectionModel{text='" + this.A04 + '\'' + ", value=" + this.A00 + '}';
    }

    public C77(String str, int i, Integer num) {
        this(str, i, num, (String) null, (ImageUrl) null);
    }

    public C77(String str, int i, Integer num, String str2, ImageUrl imageUrl) {
        this.A04 = str;
        this.A00 = i;
        this.A02 = num;
        this.A03 = str2;
        this.A01 = imageUrl;
    }
}
