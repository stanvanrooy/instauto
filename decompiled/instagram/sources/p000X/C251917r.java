package p000X;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import com.google.android.gms.common.GoogleApiAvailability;

/* renamed from: X.17r  reason: invalid class name and case insensitive filesystem */
public final class C251917r {
    public final Context A00;

    public final C252017t A00() {
        boolean booleanValue;
        Bundle bundle;
        if (Build.VERSION.SDK_INT >= 21) {
            return new AnonymousClass17s(this.A00);
        }
        Context context = this.A00;
        synchronized (AnonymousClass40G.class) {
            if (AnonymousClass40G.A00 == null) {
                try {
                    ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getApplicationInfo().packageName, 128);
                    if (applicationInfo == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("com.google.android.gms.version")) {
                        AnonymousClass40G.A00 = Boolean.FALSE;
                    } else {
                        AnonymousClass40G.A00 = Boolean.TRUE;
                    }
                } catch (PackageManager.NameNotFoundException e) {
                    throw new RuntimeException(e);
                }
            }
            booleanValue = AnonymousClass40G.A00.booleanValue();
        }
        if (!booleanValue || GoogleApiAvailability.A00.isGooglePlayServicesAvailable(this.A00) != 0) {
            return null;
        }
        return new B67(this.A00);
    }

    public C251917r(Context context) {
        if (context != null) {
            this.A00 = context.getApplicationContext();
            return;
        }
        throw new IllegalArgumentException("context");
    }
}
