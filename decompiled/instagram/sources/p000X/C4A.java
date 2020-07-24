package p000X;

/* renamed from: X.C4A */
public final class C4A {
    public final long A00;
    public final C13300iJ A01;
    public final C26813Bsy A02;
    public final Integer A03;
    public final Long A04;
    public final String A05;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C4A) {
            C4A c4a = (C4A) obj;
            if (this.A00 == c4a.A00 && this.A01.equals(c4a.A01) && this.A02 == c4a.A02) {
                String str = this.A05;
                String str2 = c4a.A05;
                if (str != null) {
                    return str.equals(str2);
                }
                return str2 == null;
            }
        }
        return false;
    }

    public final C4A A00(Integer num) {
        Integer num2 = num;
        if (num == this.A03) {
            return this;
        }
        return new C4A(this.A00, this.A01, this.A05, this.A02, num2, this.A04);
    }

    public final int hashCode() {
        int i;
        int i2;
        long j = this.A00;
        int i3 = ((int) (j ^ (j >>> 32))) * 31;
        C13300iJ r0 = this.A01;
        int i4 = 0;
        if (r0 != null) {
            i = r0.hashCode();
        } else {
            i = 0;
        }
        int i5 = (i3 + i) * 31;
        C26813Bsy bsy = this.A02;
        if (bsy != null) {
            i2 = bsy.hashCode();
        } else {
            i2 = 0;
        }
        int i6 = (i5 + i2) * 31;
        String str = this.A05;
        if (str != null) {
            i4 = str.hashCode();
        }
        return i6 + i4;
    }

    public final String toString() {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder("Question{id=");
        sb.append(this.A00);
        sb.append(", user=");
        sb.append(this.A01.AZn());
        sb.append(", body='");
        sb.append(this.A05);
        sb.append('\'');
        sb.append(", state=");
        Integer num = this.A03;
        if (num != null) {
            switch (num.intValue()) {
                case 1:
                    str2 = "current";
                    break;
                case 2:
                    str2 = "answered";
                    break;
                case 3:
                    str2 = "removed";
                    break;
                default:
                    str2 = "unanswered";
                    break;
            }
            str = AnonymousClass000.A0E("QuestionState: ", str2);
        } else {
            str = "null";
        }
        sb.append(str);
        sb.append(", source=");
        sb.append(this.A02);
        sb.append('}');
        return sb.toString();
    }

    public C4A(long j, C13300iJ r3, String str, C26813Bsy bsy, Integer num, Long l) {
        this.A00 = j;
        this.A01 = r3;
        this.A05 = str;
        this.A02 = bsy;
        this.A03 = num;
        this.A04 = l;
    }
}
