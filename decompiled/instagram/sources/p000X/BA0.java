package p000X;

import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.PackageManager;
import com.facebook.oxygen.preloads.sdk.firstparty.settings.TosAcceptedFlag;

/* renamed from: X.BA0 */
public final class BA0 extends AnonymousClass0O9 {
    public final /* synthetic */ Context A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BA0(Context context) {
        super(176, 4, false, false);
        this.A00 = context;
    }

    public final void run() {
        boolean z;
        BAD bad;
        try {
            Context context = this.A00;
            boolean z2 = BA1.A00(context).A01;
            try {
                context.getPackageManager().getPackageInfo("com.facebook.appmanager", 0);
                z = true;
            } catch (PackageManager.NameNotFoundException unused) {
                z = false;
            }
            if (z) {
                PackageManager packageManager = context.getPackageManager();
                String packageName = context.getPackageName();
                ContentResolver contentResolver = context.getContentResolver();
                ComponentName componentName = new ComponentName(context, TosAcceptedFlag.class);
                if (packageManager.getComponentEnabledSetting(componentName) != 1) {
                    packageManager.setComponentEnabledSetting(componentName, 1, 1);
                    C25244B9u b9u = new C25244B9u(context, context.getPackageManager());
                    if (z2 && b9u.A02(2)) {
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("terms_of_service_accepted", 1);
                        try {
                            int update = contentResolver.update(BA6.A00(packageName), contentValues, (String) null, (String[]) null);
                            if (update != 1) {
                                bad = new BAD(AnonymousClass000.A05("Expected 1 row changed, actually ", update));
                                throw bad;
                            }
                        } catch (IllegalArgumentException e) {
                            bad = new BAD("Could not resolve content uri for firstparty settings", e);
                        } catch (Throwable th) {
                            bad = new BAD("Unexpected failure.", th);
                        }
                    }
                }
            }
        } catch (BAD e2) {
            AnonymousClass0QD.A09("omvp_tos_display_manager: error communicating tos acceptance to appmanager", e2);
            AnonymousClass0DB.A0G("TosNoticeDisplayManager", "Error communicating with appmanager", e2);
        }
    }
}
