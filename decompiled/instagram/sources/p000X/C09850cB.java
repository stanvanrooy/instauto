package p000X;

import java.util.zip.ZipEntry;

/* renamed from: X.0cB  reason: invalid class name and case insensitive filesystem */
public final class C09850cB extends AnonymousClass0Y8 implements Comparable {
    public final int A00;
    public final ZipEntry A01;

    public C09850cB(String str, ZipEntry zipEntry, int i) {
        super(str, String.format("pseudo-zip-hash-1-%s-%s-%s-%s", new Object[]{zipEntry.getName(), Long.valueOf(zipEntry.getSize()), Long.valueOf(zipEntry.getCompressedSize()), Long.valueOf(zipEntry.getCrc())}));
        this.A01 = zipEntry;
        this.A00 = i;
    }

    public final int compareTo(Object obj) {
        return this.A01.compareTo(((C09850cB) obj).A01);
    }
}
