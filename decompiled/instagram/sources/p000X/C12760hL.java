package p000X;

import android.content.Context;
import java.io.File;

/* renamed from: X.0hL  reason: invalid class name and case insensitive filesystem */
public final class C12760hL {
    public File A00 = new File(this.A01, "cache");
    public File A01;
    public File A02 = new File(this.A01, "files");
    public File A03 = new File(this.A00, "attributed_store");
    public File A04;

    public C12760hL(Context context) {
        File file = new File(context.getApplicationInfo().dataDir);
        this.A01 = file;
        this.A04 = new File(file, "attributed_store");
    }
}
