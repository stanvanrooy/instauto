package p000X;

import android.content.Context;
import java.io.File;

/* renamed from: X.BWE */
public final class BWE {
    public final File A00;

    public BWE(Context context, String str) {
        this.A00 = new File(new File(context.getFilesDir(), "nativemetrics"), AnonymousClass000.A0E("libs_", str));
    }
}
