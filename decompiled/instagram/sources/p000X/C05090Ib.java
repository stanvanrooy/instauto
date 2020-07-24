package p000X;

import java.io.File;
import java.io.InputStream;

/* renamed from: X.0Ib  reason: invalid class name and case insensitive filesystem */
public final class C05090Ib extends C12900hZ {
    public static C05090Ib A00;

    public static C12900hZ A00() {
        if (A00 == null) {
            A00 = new C05090Ib();
        }
        return A00;
    }

    public final C13080hr A07(File file) {
        return new C05080Ia(C12890hY.A00.A07(file));
    }

    public final C13080hr A08(InputStream inputStream) {
        return new C05080Ia(C12890hY.A00.A08(inputStream));
    }

    public final C13080hr A0A(String str) {
        return new C05080Ia(C12890hY.A00.A0A(str));
    }

    public final C13080hr A0B(byte[] bArr) {
        return new C05080Ia(C12890hY.A00.A0B(bArr));
    }
}
