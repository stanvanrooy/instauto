package p000X;

import android.content.Context;
import java.io.File;

/* renamed from: X.0Si  reason: invalid class name and case insensitive filesystem */
public final class C07250Si {
    public final File A00;

    public C07250Si(Context context, String str) {
        this.A00 = new File(context.getFilesDir(), AnonymousClass000.A0E("mqtt_analytics.", str));
    }
}
