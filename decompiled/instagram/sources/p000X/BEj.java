package p000X;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import android.os.Bundle;
import android.util.Base64;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.BEj */
public final class BEj {
    public static final B6O A02 = new B6O("SplitInstallService");
    public static final Intent A03 = new Intent("com.google.android.play.core.splitinstall.BIND_SPLIT_INSTALL_SERVICE").setPackage("com.android.vending");
    public C25348BFm A00;
    public final String A01;

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    public BEj(Context context) {
        boolean z;
        int length;
        String str;
        this.A01 = context.getPackageName();
        try {
            Signature[] signatureArr = context.getPackageManager().getPackageInfo("com.android.vending", 64).signatures;
            if (signatureArr == null || (length = signatureArr.length) == 0) {
                B6O.A01(C25338BEt.A00, 5, "Phonesky package is not signed -- possibly self-built package. Could not verify.", new Object[0]);
                z = false;
                if (!z) {
                    Context applicationContext = context.getApplicationContext();
                    this.A00 = new C25348BFm(applicationContext != null ? applicationContext : context, A02, A03, BFI.A00);
                    return;
                }
                return;
            }
            int i = 0;
            while (true) {
                if (i >= length) {
                    z = false;
                    break;
                }
                byte[] byteArray = signatureArr[i].toByteArray();
                try {
                    MessageDigest instance = MessageDigest.getInstance("SHA-256");
                    instance.update(byteArray);
                    str = Base64.encodeToString(instance.digest(), 11);
                } catch (NoSuchAlgorithmException unused) {
                    str = "";
                }
                if ("8P1sW0EPJcslw7UzRsiXL64w-O50Ed-RBICtay1g24M".equals(str)) {
                    break;
                }
                String str2 = Build.TAGS;
                if ((str2.contains("dev-keys") || str2.contains("test-keys")) && "GXWy8XF3vIml3_MfnmSmyuKBpT3B0dWbHRR_4cgq-gA".equals(str)) {
                    break;
                }
                i++;
            }
            z = true;
            if (!z) {
            }
        } catch (PackageManager.NameNotFoundException unused2) {
        }
    }

    public static BFP A00() {
        B6O.A01(A02, 6, "onError(%d)", new Object[]{-14});
        BFb bFb = new BFb(-14);
        BFL bfl = new BFL();
        bfl.A07(bFb);
        return bfl;
    }

    public static /* synthetic */ ArrayList A01(Collection collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            Bundle bundle = new Bundle();
            bundle.putString("module_name", (String) it.next());
            arrayList.add(bundle);
        }
        return arrayList;
    }
}
