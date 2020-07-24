package p000X;

import java.io.InputStream;

/* renamed from: X.0cA  reason: invalid class name and case insensitive filesystem */
public final class C09840cA extends AnonymousClass0YB {
    public int A00;
    public final /* synthetic */ C09830c8 A01;

    public C09840cA(C09830c8 r1) {
        this.A01 = r1;
    }

    public final AnonymousClass0YA A00() {
        this.A01.A03();
        C09830c8 r3 = this.A01;
        C09850cB[] r2 = r3.A00;
        int i = this.A00;
        this.A00 = i + 1;
        C09850cB r22 = r2[i];
        InputStream inputStream = r3.A01.getInputStream(r22.A01);
        try {
            return new AnonymousClass0YA(r22, inputStream);
        } catch (Throwable th) {
            if (inputStream != null) {
                inputStream.close();
            }
            throw th;
        }
    }

    public final boolean A01() {
        this.A01.A03();
        if (this.A00 < this.A01.A00.length) {
            return true;
        }
        return false;
    }
}
