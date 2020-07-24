package p000X;

import android.content.Context;
import com.instagram.realtimeclient.GraphQLSubscriptionID;
import java.io.File;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: X.0l9  reason: invalid class name and case insensitive filesystem */
public class C14580l9 {
    public static C14580l9 A03;
    public final int A00;
    public final C14610lD A01;
    public final String A02;

    public int A04() {
        return 0;
    }

    public final int A02() {
        return this.A01.A03("native_version_override", this.A00);
    }

    public C14580l9(Context context) {
        Context applicationContext = context.getApplicationContext();
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
        String A002 = C14600lC.A00();
        File file = new File(applicationContext.getDir("light_prefs", 0), A002 == null ? GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT : A002);
        file.mkdirs();
        C14610lD A003 = new C14590lB(newSingleThreadExecutor, file).A00("overtheair_prefs");
        this.A01 = A003;
        this.A02 = "148.0.0.33.121";
        this.A00 = 227299068;
        int A032 = A003.A03("native_version", -1);
        if (A032 == -1 || A032 != this.A00) {
            C22450yR A05 = this.A01.A05();
            C22450yR.A02(A05);
            A05.A01 = true;
            A05.A08("native_version", this.A00);
            A05.A05();
        }
    }

    public int A03() {
        return A02();
    }
}
