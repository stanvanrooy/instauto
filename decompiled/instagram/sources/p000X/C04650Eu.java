package p000X;

import java.io.File;
import java.util.Comparator;

/* renamed from: X.0Eu  reason: invalid class name and case insensitive filesystem */
public final class C04650Eu implements Comparator {
    public final /* synthetic */ C04700Ez A00;

    public C04650Eu(C04700Ez r1) {
        this.A00 = r1;
    }

    public final int compare(Object obj, Object obj2) {
        return (int) (((File) obj).lastModified() - ((File) obj2).lastModified());
    }
}
