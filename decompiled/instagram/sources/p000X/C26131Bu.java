package p000X;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.List;

/* renamed from: X.1Bu  reason: invalid class name and case insensitive filesystem */
public final class C26131Bu implements C26141Bv {
    public final C17190pp A00 = new C17190pp("Content-Type", "application/x-www-form-urlencoded; charset=UTF-8");
    public final byte[] A01;

    public final C17190pp AIj() {
        return null;
    }

    public final C17190pp AIn() {
        return this.A00;
    }

    public final InputStream BWa() {
        return new ByteArrayInputStream(this.A01);
    }

    public final long getContentLength() {
        return (long) this.A01.length;
    }

    public C26131Bu(List list) {
        this.A01 = C26161Bx.A00(list).getBytes("UTF-8");
    }
}
