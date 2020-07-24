package p000X;

import com.instagram.common.typedurl.ImageUrl;
import java.util.Objects;

/* renamed from: X.1wh  reason: invalid class name and case insensitive filesystem */
public final class C44751wh {
    public static final int[] A09 = {-4652876, -720896};
    public ImageUrl A00;
    public C44761wi A01 = C44761wi.TEXT;
    public String A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;
    public String A07;
    public boolean A08;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C44751wh r5 = (C44751wh) obj;
            if (this.A08 != r5.A08 || !Objects.equals(this.A02, r5.A02) || !Objects.equals(this.A04, r5.A04) || !Objects.equals(this.A05, r5.A05) || !Objects.equals(this.A00, r5.A00) || this.A01 != r5.A01 || !Objects.equals(this.A06, r5.A06) || !Objects.equals(this.A03, r5.A03) || !Objects.equals(this.A07, r5.A07)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{Boolean.valueOf(this.A08), this.A02, this.A04, this.A05, this.A00, this.A01, this.A06, this.A03, this.A07});
    }

    public C44751wh() {
    }

    public C44751wh(C148016Ug r2) {
        this.A01 = r2.A05;
        this.A02 = AnonymousClass0OW.A0B(r2.A00);
        this.A07 = AnonymousClass0OW.A0B(r2.A01);
        this.A00 = r2.A02;
        this.A06 = r2.A04;
        this.A03 = r2.A03;
    }
}
