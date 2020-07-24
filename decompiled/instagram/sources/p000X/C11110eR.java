package p000X;

import android.content.Context;
import java.io.File;
import java.util.concurrent.TimeUnit;

/* renamed from: X.0eR  reason: invalid class name and case insensitive filesystem */
public final class C11110eR {
    public static final long A02 = TimeUnit.HOURS.toMillis(2);
    public final Context A00;
    public final File A01;

    public C11110eR(Context context) {
        this.A01 = new File(context.getFilesDir(), "profilo_config_temp");
        this.A00 = context.getApplicationContext();
    }
}
