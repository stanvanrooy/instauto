package p000X;

import android.content.Context;
import java.io.File;

/* renamed from: X.0Sj  reason: invalid class name and case insensitive filesystem */
public final class C07260Sj {
    public final C07220Sf A00;
    public final File A01;

    public C07260Sj(Context context, String str, AnonymousClass0TQ r6, String str2) {
        this.A00 = new C07220Sf(AnonymousClass000.A0J("725056107548211", "|", "0e20c3123a90c76c02c901b7415ff67f"), new C07230Sg(r6), str2);
        this.A01 = new File(context.getFilesDir(), AnonymousClass000.A0E("mqtt_analytics.", str));
    }
}
