package p000X;

import java.util.Locale;

/* renamed from: X.0cv  reason: invalid class name and case insensitive filesystem */
public final class C10260cv implements C08240We {
    public int A00 = 0;
    public final int A01;
    public final int A02;
    public final int A03;

    public final boolean Abx(boolean z) {
        int i;
        int i2;
        if (z) {
            i = this.A00;
            i2 = this.A01;
        } else {
            i = this.A00;
            i2 = this.A02;
        }
        return i < i2;
    }

    public final String toString() {
        return String.format((Locale) null, "BackToBackRetryStrategy: attempt:%d/%d/%d, delay:%d seconds", new Object[]{Integer.valueOf(this.A00), Integer.valueOf(this.A01), Integer.valueOf(this.A02), Integer.valueOf(this.A03)});
    }

    public final C08230Wd AX0() {
        return C08230Wd.BACK_TO_BACK;
    }

    public C10260cv(int i, int i2, int i3) {
        this.A01 = i;
        this.A02 = i2;
        this.A03 = i3;
    }

    public final int Apz(boolean z) {
        if (!Abx(z)) {
            return -1;
        }
        this.A00++;
        return this.A03;
    }
}
