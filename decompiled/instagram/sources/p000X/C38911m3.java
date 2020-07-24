package p000X;

import java.util.Arrays;

/* renamed from: X.1m3  reason: invalid class name and case insensitive filesystem */
public final class C38911m3 implements C249616t {
    public AnonymousClass1NJ A00;
    public Integer A01;
    public Integer A02;
    public boolean A03;

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{getId()});
    }

    public final boolean A00(AnonymousClass0C1 r3) {
        if (this.A01 != null || C36791ic.A00(r3).A04(this.A00)) {
            return true;
        }
        return false;
    }

    public final String AWS(AnonymousClass0C1 r2) {
        return C30671Ut.A0A(r2, this.A00);
    }

    public final boolean Afk() {
        return this.A00.Afk();
    }

    public final boolean Agp() {
        return this.A00.Agp();
    }

    public final boolean Aho() {
        return this.A00.Aho();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C38911m3) || !AnonymousClass17M.A00(((C38911m3) obj).getId(), getId())) {
            return false;
        }
        return true;
    }

    public final String getId() {
        Integer num;
        switch (this.A02.intValue()) {
            case 0:
                return this.A00.getId();
            case 1:
                return AnonymousClass000.A0E(this.A00.getId(), "_survey");
            case 2:
                num = Constants.A0C;
                break;
            case 3:
                num = Constants.A0N;
                break;
            default:
                throw new UnsupportedOperationException("Unhandled ClipsItemType");
        }
        return C25983Bdc.A00(num);
    }

    public C38911m3() {
    }

    public C38911m3(Integer num) {
        this.A02 = num;
    }
}
