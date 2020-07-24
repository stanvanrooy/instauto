package p000X;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.telephony.TelephonyManager;

/* renamed from: X.BA1 */
public final class BA1 {
    /* JADX WARNING: Missing exception handler attribute for start block: B:59:0x00a9 */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0066 A[SYNTHETIC, Splitter:B:40:0x0066] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x006e A[Catch:{ IllegalArgumentException -> 0x00b2, all -> 0x00ba }] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00bd A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00be  */
    public static BA7 A00(Context context) {
        BA7 ba7;
        boolean z;
        BA7 ba72;
        boolean z2;
        boolean z3;
        boolean z4;
        PackageManager packageManager = context.getPackageManager();
        ComponentName componentName = new ComponentName("com.facebook.appmanager", "com.facebook.oxygen.appmanager.firstparty.tos.ShouldAcceptTos");
        ComponentName componentName2 = new ComponentName("com.facebook.appmanager", "com.facebook.oxygen.appmanager.firstparty.tos.ShouldShowExplicitTos");
        try {
            int componentEnabledSetting = packageManager.getComponentEnabledSetting(componentName);
            int componentEnabledSetting2 = packageManager.getComponentEnabledSetting(componentName2);
            boolean z5 = true;
            if (componentEnabledSetting == 0 || componentEnabledSetting2 == 0) {
                try {
                    context.getPackageManager().getReceiverInfo(componentName, 0);
                    z = true;
                } catch (PackageManager.NameNotFoundException unused) {
                    z = false;
                }
                if (z) {
                    try {
                        context.getPackageManager().getReceiverInfo(componentName2, 0);
                        z3 = true;
                    } catch (PackageManager.NameNotFoundException unused2) {
                        z3 = false;
                    }
                    if (z3) {
                        try {
                            int i = context.getPackageManager().getPackageInfo("com.facebook.appmanager", 0).applicationInfo.flags;
                            if (!((i & 1) == 0 && (i & 128) == 0)) {
                                z4 = true;
                                ba7 = !z4 ? new BA7(true, true, Constants.A0C) : new BA7(true, false, Constants.A0C);
                                if (ba7 != null) {
                                    return ba7;
                                }
                                TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
                                if (telephonyManager.getSimState() != 5) {
                                    return new BA7(true, true, Constants.A0j);
                                }
                                String simOperator = telephonyManager.getSimOperator();
                                if (simOperator.startsWith("2") || simOperator.startsWith("302")) {
                                    return new BA7(true, true, Constants.A0u);
                                }
                                return new BA7(true, false, Constants.A12);
                            }
                        } catch (PackageManager.NameNotFoundException unused3) {
                        }
                        z4 = false;
                        if (!z4) {
                        }
                        if (ba7 != null) {
                        }
                    }
                }
                PackageManager packageManager2 = context.getPackageManager();
                ComponentName componentName3 = new ComponentName("com.facebook.appmanager", "com.facebook.oxygen.appmanager.firstparty.tos.ShouldShowTos");
                ba7 = null;
                try {
                    int componentEnabledSetting3 = packageManager2.getComponentEnabledSetting(componentName3);
                    boolean z6 = true;
                    if (componentEnabledSetting3 == 0) {
                        try {
                            context.getPackageManager().getReceiverInfo(componentName3, 0);
                            z2 = true;
                        } catch (PackageManager.NameNotFoundException unused4) {
                            z2 = false;
                        }
                        if (z2) {
                            ba72 = new BA7(true, true, Constants.A0C);
                        }
                        if (ba7 != null) {
                        }
                    } else {
                        if (componentEnabledSetting3 != 1) {
                            z6 = false;
                        }
                        ba72 = new BA7(z6, z6, Constants.ONE);
                    }
                } catch (IllegalArgumentException ) {
                    ba72 = new BA7(false, false, Constants.A0Y);
                } catch (Throwable unused5) {
                }
                ba7 = ba72;
                if (ba7 != null) {
                }
            } else {
                boolean z7 = false;
                if (componentEnabledSetting == 1) {
                    z7 = true;
                }
                if (componentEnabledSetting2 != 1) {
                    z5 = false;
                }
                ba7 = new BA7(z7, z5, Constants.ONE);
                if (ba7 != null) {
                }
            }
        } catch (IllegalArgumentException unused6) {
            ba7 = new BA7(false, false, Constants.A0Y);
        } catch (Throwable unused7) {
            ba7 = null;
        }
    }
}
