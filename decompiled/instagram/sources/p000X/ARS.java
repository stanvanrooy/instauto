package p000X;

import android.graphics.Bitmap;

/* renamed from: X.ARS */
public final class ARS implements Cloneable {
    public final Bitmap A00;
    public final String A01;
    public final String A02;
    public final String A03;

    public final /* bridge */ /* synthetic */ Object clone() {
        return new ARS(this.A03, this.A01, this.A02, this.A00);
    }

    public ARS(String str, String str2, String str3, Bitmap bitmap) {
        this.A03 = str;
        this.A01 = str2;
        this.A02 = str3;
        this.A00 = bitmap;
    }
}
