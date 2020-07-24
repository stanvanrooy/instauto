package p000X;

import android.os.Bundle;

/* renamed from: X.C94 */
public abstract class C94 implements C27920CWi {
    public final int A00;
    public final Bundle A01 = new Bundle();
    public final C93 A02;
    public final CY3 A03;
    public final String A04;

    public C94(C92 c92) {
        this.A02 = c92.A03;
        this.A04 = c92.A02;
        this.A03 = c92.A01;
        this.A00 = c92.A00;
    }

    public final int AMc() {
        return this.A00;
    }

    public final CY3 AX8() {
        return this.A03;
    }

    public final C93 AZB() {
        return this.A02;
    }

    public final String getId() {
        return this.A04;
    }
}
