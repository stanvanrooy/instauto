package p000X;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.instagram.mainactivity.MainActivity;
import com.instagram.url.UrlHandlerActivity;

/* renamed from: X.0ei  reason: invalid class name and case insensitive filesystem */
public final class C11280ei extends C11290ej {
    public final Intent A00(Context context) {
        return C16330oQ.A00.A00(context);
    }

    public final Intent A03(Context context, Uri uri) {
        Intent intent = new Intent(context, UrlHandlerActivity.class);
        intent.setData(uri);
        return intent;
    }

    public final Intent A01(Context context, int i) {
        return A02(context, i);
    }

    public final Intent A02(Context context, int i) {
        Intent intent;
        String packageName = context.getPackageName();
        if (packageName != null) {
            intent = new Intent();
            intent.setComponent(new ComponentName(packageName, "com.instagram.mainactivity.MainActivity"));
        } else {
            intent = new Intent(context, MainActivity.class);
        }
        intent.setFlags(i);
        return intent;
    }
}
