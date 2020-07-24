package p000X;

import java.io.File;
import java.io.FileFilter;

/* renamed from: X.0Ev  reason: invalid class name and case insensitive filesystem */
public final class C04660Ev implements FileFilter {
    public final /* synthetic */ C04440Dz A00;
    public final /* synthetic */ C04700Ez A01;
    public final /* synthetic */ Integer A02;

    public C04660Ev(C04700Ez r1, C04440Dz r2, Integer num) {
        this.A01 = r1;
        this.A00 = r2;
        this.A02 = num;
    }

    public final boolean accept(File file) {
        if (!file.getName().startsWith(this.A00.A00) || !file.getName().endsWith(AnonymousClass000.A0E(C04540Ej.A00(this.A02), "_prop.txt"))) {
            return false;
        }
        return true;
    }
}
