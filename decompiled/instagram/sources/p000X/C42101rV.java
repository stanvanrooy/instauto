package p000X;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.util.Log;
import com.google.android.gms.common.zze;
import com.google.android.gms.common.zzf;

/* renamed from: X.1rV  reason: invalid class name and case insensitive filesystem */
public final class C42101rV {
    public static C42101rV A02;
    public final Context A00;
    public volatile String A01;

    public static boolean A01(PackageInfo packageInfo, boolean z) {
        Signature[] signatureArr;
        if (!(packageInfo == null || (signatureArr = packageInfo.signatures) == null)) {
            zze[] zzeArr = z ? C42121rX.A00 : new zze[]{C42121rX.A00[0]};
            zze zze = null;
            if (signatureArr != null) {
                if (signatureArr.length != 1) {
                    Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
                } else {
                    int i = 0;
                    zzf zzf = new zzf(signatureArr[0].toByteArray());
                    while (true) {
                        if (i >= zzeArr.length) {
                            break;
                        } else if (zzeArr[i].equals(zzf)) {
                            zze = zzeArr[i];
                            break;
                        } else {
                            i++;
                        }
                    }
                }
            }
            if (zze != null) {
                return true;
            }
        }
        return false;
    }

    public C42101rV(Context context) {
        this.A00 = context.getApplicationContext();
    }

    public static C42101rV A00(Context context) {
        AnonymousClass0a2.A02(context);
        synchronized (C42101rV.class) {
            if (A02 == null) {
                synchronized (C42111rW.class) {
                    if (C42111rW.A00 != null) {
                        Log.w("GoogleCertificates", "GoogleCertificates has been initialized already");
                    } else if (context != null) {
                        C42111rW.A00 = context.getApplicationContext();
                    }
                }
                A02 = new C42101rV(context);
            }
        }
        return A02;
    }
}
