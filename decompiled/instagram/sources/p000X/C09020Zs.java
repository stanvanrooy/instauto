package p000X;

import android.content.Context;
import java.io.File;

/* renamed from: X.0Zs  reason: invalid class name and case insensitive filesystem */
public abstract class C09020Zs {
    public Context A00;
    public final C08860Za A01;
    public final C08900Ze A02 = C08900Ze.A00();

    public abstract void A01(String str, String str2, File file, File file2);

    public abstract String[] A02(String str, String str2, File file);

    public C09020Zs(Context context, C08860Za r3) {
        this.A01 = r3;
        this.A00 = context;
    }
}
