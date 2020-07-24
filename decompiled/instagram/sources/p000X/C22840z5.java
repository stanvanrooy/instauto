package p000X;

import android.content.Context;
import java.io.File;

/* renamed from: X.0z5  reason: invalid class name and case insensitive filesystem */
public final class C22840z5 {
    public final File A00;
    public final C22780yz A01;

    public C22840z5(Context context, C22780yz r6) {
        File file = new File(context.getDir("funnel_backup", 0), "instagram");
        file.mkdirs();
        this.A00 = new File(file, "backup_for_all");
        this.A01 = r6;
    }
}
