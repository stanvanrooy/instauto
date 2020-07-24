package p000X;

import android.content.Context;
import android.os.Process;

/* renamed from: X.B6L */
public final class B6L {
    public static int A00(Context context, String str) {
        int myPid = Process.myPid();
        int myUid = Process.myUid();
        String packageName = context.getPackageName();
        if (context.checkPermission(str, myPid, myUid) == -1) {
            return -1;
        }
        String A01 = B6M.A01(str);
        if (A01 != null) {
            if (packageName == null) {
                String[] packagesForUid = context.getPackageManager().getPackagesForUid(myUid);
                if (packagesForUid == null || packagesForUid.length <= 0) {
                    return -1;
                }
                packageName = packagesForUid[0];
            }
            if (B6M.A00(context, A01, packageName) == 0) {
                return 0;
            }
            return -2;
        }
        return 0;
    }
}
