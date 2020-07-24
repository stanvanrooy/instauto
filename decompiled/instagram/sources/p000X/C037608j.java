package p000X;

/* renamed from: X.08j  reason: invalid class name and case insensitive filesystem */
public final class C037608j extends C04550Ek {
    public final /* synthetic */ AnonymousClass08e A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C037608j(AnonymousClass08e r1) {
        super(r1);
        this.A00 = r1;
    }

    public final int A01(int i) {
        int length;
        int i2;
        int length2;
        int length3;
        C037208d r3 = this.A00.A04;
        short[] sArr = this.A00;
        if (r3.A00(sArr, 0) == 0) {
            short[] sArr2 = this.A02[i];
            int i3 = 1;
            do {
                i3 = r3.A00(sArr2, i3) | (i3 << 1);
                length3 = sArr2.length;
            } while (i3 < length3);
            return (i3 - length3) + 2;
        }
        if (r3.A00(sArr, 1) == 0) {
            short[] sArr3 = this.A03[i];
            int i4 = 1;
            do {
                i4 = r3.A00(sArr3, i4) | (i4 << 1);
                length2 = sArr3.length;
            } while (i4 < length2);
            i2 = (i4 - length2) + 2;
        } else {
            short[] sArr4 = this.A01;
            int i5 = 1;
            do {
                i5 = r3.A00(sArr4, i5) | (i5 << 1);
                length = sArr4.length;
            } while (i5 < length);
            i2 = (i5 - length) + 2 + 8;
        }
        return i2 + 8;
    }
}
