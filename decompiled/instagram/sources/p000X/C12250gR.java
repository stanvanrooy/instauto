package p000X;

import android.content.Context;
import android.os.Build;
import android.util.SparseArray;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;

/* renamed from: X.0gR  reason: invalid class name and case insensitive filesystem */
public final class C12250gR {
    public String A00 = NetInfoModule.CONNECTION_TYPE_UNKNOWN_DEPRECATED;
    public String A01 = NetInfoModule.CONNECTION_TYPE_UNKNOWN_DEPRECATED;
    public String A02 = C12260gS.A00().A00;
    public String A03 = Build.BRAND;
    public String A04 = Build.MODEL;
    public String A05 = String.valueOf(Build.VERSION.SDK_INT);
    public String A06 = NetInfoModule.CONNECTION_TYPE_UNKNOWN_DEPRECATED;
    public final SparseArray A07;

    public C12250gR(Context context, SparseArray sparseArray, String str) {
        String str2;
        this.A07 = sparseArray;
        try {
            str2 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (Exception unused) {
            str2 = NetInfoModule.CONNECTION_TYPE_UNKNOWN_DEPRECATED;
        }
        this.A01 = str2;
        try {
            this.A06 = String.valueOf(C12300gW.A00(context));
        } catch (Exception unused2) {
            this.A06 = NetInfoModule.CONNECTION_TYPE_UNKNOWN_DEPRECATED;
        }
        if (str != null) {
            this.A00 = str;
        }
    }
}
