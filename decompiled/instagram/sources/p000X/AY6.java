package p000X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.facebook.appcomponentmanager.AppComponentManagerService;
import java.io.File;

/* renamed from: X.AY6 */
public abstract class AY6 extends BroadcastReceiver {
    public boolean A00(Context context) {
        if (C05760Lv.A01 == null) {
            C05760Lv.A01 = new C05760Lv(context);
        }
        return C05760Lv.A01.A00.getString("current", (String) null) != null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x002c, code lost:
        if (r1 == 0) goto L_0x002e;
     */
    public final void onReceive(Context context, Intent intent) {
        int i;
        boolean z;
        int A01 = AnonymousClass0Z0.A01(-1383463471);
        intent.getAction();
        if ("android.intent.action.MY_PACKAGE_REPLACED".equals(intent.getAction())) {
            String[] list = new File(context.getDir("appcomponents", 0), "versions").list();
            if (list != null) {
                int length = list.length;
                z = true;
            }
            z = false;
            if (z || A00(context)) {
                AnonymousClass00Y.enqueueWork(context, AppComponentManagerService.class, 137875812, new Intent("com.facebook.appcomponentmanager.ACTION_ENABLE_COMPONENTS"));
            } else {
                i = -753553021;
                AnonymousClass0Z0.A0E(intent, i, A01);
            }
        }
        i = -1079568247;
        AnonymousClass0Z0.A0E(intent, i, A01);
    }
}
