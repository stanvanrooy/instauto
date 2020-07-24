package p000X;

import android.content.Context;
import com.instagram.realtimeclient.GraphQLSubscriptionID;
import java.io.File;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: X.0yQ  reason: invalid class name and case insensitive filesystem */
public final class C22440yQ {
    public static C14590lB A00;

    public static synchronized C14590lB A00(Context context) {
        C14590lB r0;
        synchronized (C22440yQ.class) {
            if (A00 == null) {
                Context applicationContext = context.getApplicationContext().getApplicationContext();
                ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
                String A002 = C14600lC.A00();
                if (A002 == null) {
                    A002 = GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT;
                }
                File file = new File(applicationContext.getDir("light_prefs", 0), A002);
                file.mkdirs();
                A00 = new C14590lB(newSingleThreadExecutor, file);
            }
            r0 = A00;
        }
        return r0;
    }

    public static void setForTesting(C14590lB r0) {
        A00 = r0;
    }
}
