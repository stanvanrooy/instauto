package p000X;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import java.io.Serializable;

@JsonAutoDetect(creatorVisibility = C26693Bps.ANY, fieldVisibility = C26693Bps.PUBLIC_ONLY, getterVisibility = C26693Bps.PUBLIC_ONLY, isGetterVisibility = C26693Bps.PUBLIC_ONLY, setterVisibility = C26693Bps.ANY)
/* renamed from: X.C10 */
public final class C10 implements C27198C1i, Serializable {
    public static final C10 A05 = new C10((JsonAutoDetect) C10.class.getAnnotation(JsonAutoDetect.class));
    public final Integer A00;
    public final Integer A01;
    public final Integer A02;
    public final Integer A03;
    public final Integer A04;

    /* renamed from: A00 */
    public final C10 BuF(Integer num) {
        Integer num2 = num;
        if (num == Constants.A0j) {
            num2 = A05.A00;
        }
        if (this.A00 == num2) {
            return this;
        }
        return new C10(this.A02, this.A03, this.A04, num2, this.A01);
    }

    /* renamed from: A01 */
    public final C10 BuG(Integer num) {
        Integer num2 = num;
        if (num == Constants.A0j) {
            num2 = A05.A01;
        }
        if (this.A01 == num2) {
            return this;
        }
        return new C10(this.A02, this.A03, this.A04, this.A00, num2);
    }

    /* renamed from: A02 */
    public final C10 BuH(Integer num) {
        Integer num2 = num;
        if (num == Constants.A0j) {
            num2 = A05.A02;
        }
        if (this.A02 == num2) {
            return this;
        }
        return new C10(num2, this.A03, this.A04, this.A00, this.A01);
    }

    /* renamed from: A03 */
    public final C10 BuI(Integer num) {
        Integer num2 = num;
        if (num == Constants.A0j) {
            num2 = A05.A03;
        }
        if (this.A03 == num2) {
            return this;
        }
        return new C10(this.A02, num2, this.A04, this.A00, this.A01);
    }

    /* renamed from: A04 */
    public final C10 BuK(Integer num) {
        Integer num2 = num;
        if (num == Constants.A0j) {
            num2 = A05.A04;
        }
        if (this.A04 == num2) {
            return this;
        }
        return new C10(this.A02, this.A03, num2, this.A00, this.A01);
    }

    public final boolean AfW(C0e c0e) {
        return C26693Bps.A01(this.A01, c0e.A00);
    }

    public final boolean Afe(C0F c0f) {
        return C26693Bps.A01(this.A02, c0f.A01);
    }

    public final boolean Ag2(C0F c0f) {
        return C26693Bps.A01(this.A03, c0f.A01);
    }

    public final boolean Ahf(C0F c0f) {
        return C26693Bps.A01(this.A04, c0f.A01);
    }

    public final /* bridge */ /* synthetic */ C27198C1i BuE(JsonAutoDetect jsonAutoDetect) {
        if (jsonAutoDetect != null) {
            return BuH(jsonAutoDetect.getterVisibility$REDEX$eeKe1rqTCAd()).BuI(jsonAutoDetect.isGetterVisibility$REDEX$rcLEWf1ViD5()).BuK(jsonAutoDetect.setterVisibility$REDEX$e31pGEhb4Y7()).BuF(jsonAutoDetect.creatorVisibility$REDEX$W2ZQuEsqHA5()).BuG(jsonAutoDetect.fieldVisibility$REDEX$atNbVC2Qzp8());
        }
        return this;
    }

    public final String toString() {
        return "[Visibility:" + " getter: " + C26693Bps.A00(this.A02) + ", isGetter: " + C26693Bps.A00(this.A03) + ", setter: " + C26693Bps.A00(this.A04) + ", creator: " + C26693Bps.A00(this.A00) + ", field: " + C26693Bps.A00(this.A01) + "]";
    }

    public final boolean Aes(C27200C1k c1k) {
        return C26693Bps.A01(this.A00, c1k.A0I());
    }

    public C10(JsonAutoDetect jsonAutoDetect) {
        this.A02 = jsonAutoDetect.getterVisibility$REDEX$eeKe1rqTCAd();
        this.A03 = jsonAutoDetect.isGetterVisibility$REDEX$rcLEWf1ViD5();
        this.A04 = jsonAutoDetect.setterVisibility$REDEX$e31pGEhb4Y7();
        this.A00 = jsonAutoDetect.creatorVisibility$REDEX$W2ZQuEsqHA5();
        this.A01 = jsonAutoDetect.fieldVisibility$REDEX$atNbVC2Qzp8();
    }

    public C10(Integer num, Integer num2, Integer num3, Integer num4, Integer num5) {
        this.A02 = num;
        this.A03 = num2;
        this.A04 = num3;
        this.A00 = num4;
        this.A01 = num5;
    }
}
