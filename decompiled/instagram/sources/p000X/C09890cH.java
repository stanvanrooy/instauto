package p000X;

import java.io.FileInputStream;

/* renamed from: X.0cH  reason: invalid class name and case insensitive filesystem */
public final class C09890cH extends AnonymousClass0YB {
    public int A00;
    public final /* synthetic */ C09880cG A01;

    public C09890cH(C09880cG r1) {
        this.A01 = r1;
    }

    public final AnonymousClass0YA A00() {
        C09860cC[] r2 = this.A01.A00;
        int i = this.A00;
        this.A00 = i + 1;
        C09860cC r22 = r2[i];
        FileInputStream fileInputStream = new FileInputStream(r22.A00);
        try {
            return new AnonymousClass0YA(r22, fileInputStream);
        } catch (Throwable th) {
            fileInputStream.close();
            throw th;
        }
    }

    public final boolean A01() {
        if (this.A00 < this.A01.A00.length) {
            return true;
        }
        return false;
    }
}
