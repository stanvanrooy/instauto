package p000X;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.facebook.C0003R;
import com.facebook.common.dextricks.DexStore;

/* renamed from: X.1rL  reason: invalid class name and case insensitive filesystem */
public class C42001rL {
    public static final C42001rL A00 = new C42001rL();
    public static final String GOOGLE_PLAY_SERVICES_PACKAGE = "com.google.android.gms";

    public Intent A04(Context context, int i, String str) {
        if (i == 1 || i == 2) {
            if (context == null || !C42051rQ.A01(context)) {
                StringBuilder sb = new StringBuilder("gcore_");
                sb.append(12451000);
                sb.append("-");
                if (!TextUtils.isEmpty(str)) {
                    sb.append(str);
                }
                sb.append("-");
                if (context != null) {
                    sb.append(context.getPackageName());
                }
                sb.append("-");
                if (context != null) {
                    try {
                        C42041rP A002 = C42031rO.A00(context);
                        sb.append(A002.A00.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode);
                    } catch (PackageManager.NameNotFoundException unused) {
                    }
                }
                String sb2 = sb.toString();
                Intent intent = new Intent("android.intent.action.VIEW");
                Uri.Builder appendQueryParameter = Uri.parse("market://details").buildUpon().appendQueryParameter("id", "com.google.android.gms");
                if (!TextUtils.isEmpty(sb2)) {
                    appendQueryParameter.appendQueryParameter("pcampaignid", sb2);
                }
                intent.setData(appendQueryParameter.build());
                intent.setPackage("com.android.vending");
                intent.addFlags(DexStore.LOAD_RESULT_WITH_VDEX_ODEX);
                return intent;
            }
            Intent intent2 = new Intent("com.google.android.clockwork.home.UPDATE_ANDROID_WEAR_ACTION");
            intent2.setPackage("com.google.android.wearable.app");
            return intent2;
        } else if (i != 3) {
            return null;
        } else {
            Uri fromParts = Uri.fromParts("package", "com.google.android.gms", (String) null);
            Intent intent3 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent3.setData(fromParts);
            return intent3;
        }
    }

    public boolean A05(int i) {
        if (i == 1 || i == 2 || i == 3 || i == 9) {
            return true;
        }
        return false;
    }

    public static C42001rL getInstance() {
        return A00;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00ba, code lost:
        if (r10.getPackageManager().hasSystemFeature("android.hardware.type.embedded") != false) goto L_0x00bc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00ca, code lost:
        if (p000X.C42051rQ.A01.booleanValue() != false) goto L_0x00cc;
     */
    /* JADX WARNING: Removed duplicated region for block: B:105:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x012b  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x012e A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0131  */
    public int A03(Context context, int i) {
        boolean z;
        int i2;
        boolean z2;
        String str;
        int i3;
        int i4;
        boolean z3;
        try {
            context.getResources().getString(C0003R.string.common_google_play_services_unknown_issue);
        } catch (Throwable unused) {
            Log.e("GooglePlayServicesUtil", "The Google Play services resources were not found. Check your project configuration to ensure that the resources are included.");
        }
        if (!"com.google.android.gms".equals(context.getPackageName()) && !C42011rM.A03.get()) {
            synchronized (C42021rN.A01) {
                if (!C42021rN.A02) {
                    C42021rN.A02 = true;
                    try {
                        Bundle bundle = C42031rO.A00(context).A00.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
                        if (bundle != null) {
                            bundle.getString("com.google.app.id");
                            C42021rN.A00 = bundle.getInt("com.google.android.gms.version");
                        }
                    } catch (PackageManager.NameNotFoundException e) {
                        Log.wtf("MetadataValueReader", "This should never happen.", e);
                    }
                }
            }
            int i5 = C42021rN.A00;
            if (i5 == 0) {
                throw new IllegalStateException("A required meta-data tag in your app's AndroidManifest.xml does not exist.  You must have the following declaration within the <application> element:     <meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />");
            } else if (i5 != 12451000) {
                StringBuilder sb = new StringBuilder(320);
                sb.append("The meta-data tag in your app's AndroidManifest.xml does not have the right value.  Expected ");
                sb.append(12451000);
                sb.append(" but found ");
                sb.append(i5);
                sb.append(".  You must have the following declaration within the <application> element:     <meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />");
                throw new IllegalStateException(sb.toString());
            }
        }
        if (!C42051rQ.A01(context)) {
            if (C42051rQ.A01 == null) {
                if (!context.getPackageManager().hasSystemFeature("android.hardware.type.iot")) {
                    z3 = false;
                }
                z3 = true;
                C42051rQ.A01 = Boolean.valueOf(z3);
            }
            z = true;
        }
        z = false;
        boolean z4 = false;
        if (i >= 0) {
            z4 = true;
        }
        AnonymousClass0a2.A06(z4);
        PackageManager packageManager = context.getPackageManager();
        PackageInfo packageInfo = null;
        if (z) {
            try {
                packageInfo = packageManager.getPackageInfo("com.android.vending", 8256);
            } catch (PackageManager.NameNotFoundException unused2) {
                Log.w("GooglePlayServicesUtil", "Google Play Store is missing.");
                i2 = 9;
            }
        }
        try {
            PackageInfo packageInfo2 = packageManager.getPackageInfo("com.google.android.gms", 64);
            C42101rV.A00(context);
            if (!C42101rV.A01(packageInfo2, true)) {
                str = "Google Play services signature invalid.";
            } else if (!z || (C42101rV.A01(packageInfo, true) && packageInfo.signatures[0].equals(packageInfo2.signatures[0]))) {
                int i6 = packageInfo2.versionCode;
                if (i6 == -1) {
                    i3 = -1;
                } else {
                    i3 = i6 / 1000;
                }
                if (i == -1) {
                    i4 = -1;
                } else {
                    i4 = i / 1000;
                }
                if (i3 < i4) {
                    StringBuilder sb2 = new StringBuilder(77);
                    sb2.append("Google Play services out of date.  Requires ");
                    sb2.append(i);
                    sb2.append(" but found ");
                    sb2.append(i6);
                    Log.w("GooglePlayServicesUtil", sb2.toString());
                    i2 = 2;
                } else {
                    ApplicationInfo applicationInfo = packageInfo2.applicationInfo;
                    if (applicationInfo == null) {
                        try {
                            applicationInfo = packageManager.getApplicationInfo("com.google.android.gms", 0);
                        } catch (PackageManager.NameNotFoundException e2) {
                            Log.wtf("GooglePlayServicesUtil", "Google Play services missing when getting application info.", e2);
                            i2 = 1;
                        }
                    }
                    i2 = 0;
                    if (!applicationInfo.enabled) {
                        i2 = 3;
                    }
                }
                if (i2 != 18) {
                    z2 = true;
                } else if (i2 == 1) {
                    z2 = C42011rM.A00(context);
                } else {
                    z2 = false;
                }
                if (!z2) {
                    return 18;
                }
                return i2;
            } else {
                str = "Google Play Store signature invalid.";
            }
            Log.w("GooglePlayServicesUtil", str);
            i2 = 9;
        } catch (PackageManager.NameNotFoundException unused3) {
            Log.w("GooglePlayServicesUtil", "Google Play services is missing.");
            i2 = 1;
        }
        if (i2 != 18) {
        }
        if (!z2) {
        }
    }

    public int isGooglePlayServicesAvailable(Context context) {
        return A03(context, 12451000);
    }
}
