package p000X;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ComponentInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import com.facebook.appcomponentmanager.AppComponentManagerProfiledRun;
import com.facebook.common.dextricks.DexStore;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/* renamed from: X.0eh  reason: invalid class name and case insensitive filesystem */
public final class C11270eh {
    public static String A02(int i) {
        if (i == 1) {
            return "Activity";
        }
        if (i == 2) {
            return "Receiver";
        }
        if (i == 4) {
            return "Service";
        }
        if (i != 8) {
            return AnonymousClass000.A06("Unknown (type = ", i, ")");
        }
        return "Provider";
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:35|36|37|38|39) */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x00a0, code lost:
        if (r3.equals("com.facebook.katana") == false) goto L_0x00a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x00a6, code lost:
        if (r1 == 1) goto L_0x00a8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00c9, code lost:
        if (r3.equals("com.facebook.wakizashi") == false) goto L_0x00a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00e2, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:?, code lost:
        throw r0;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:38:0x00e6 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:40:0x00e7 */
    public static void A03(Context context, String str) {
        char c;
        boolean z;
        PackageManager packageManager = context.getPackageManager();
        context.getPackageName();
        long currentTimeMillis = System.currentTimeMillis();
        int A00 = A00(context, packageManager, 4, 1, 2, 8, 4);
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        if (A00 >= 0) {
            File[] listFiles = new File(context.getDir("appcomponents", 0), "versions").listFiles();
            if (listFiles != null) {
                for (File delete : listFiles) {
                    delete.delete();
                }
            }
            File file = new File(new File(context.getDir("appcomponents", 0), "versions"), Integer.toString(227299068));
            file.getParentFile().mkdirs();
            try {
                new FileOutputStream(file, false).close();
                AppComponentManagerProfiledRun appComponentManagerProfiledRun = new AppComponentManagerProfiledRun(str, A00, currentTimeMillis2);
                String packageName = context.getPackageName();
                int hashCode = packageName.hashCode();
                if (hashCode == 419128298) {
                    c = 1;
                } else if (hashCode == 714499313) {
                    c = 0;
                }
                c = 65535;
                if (c != 0) {
                    z = false;
                }
                z = true;
                if (z) {
                    File file2 = new File(context.getDir("appcomponents", 0), "perflog");
                    ArrayList arrayList = new ArrayList();
                    if (file2.exists()) {
                        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file2));
                        ArrayList arrayList2 = (ArrayList) objectInputStream.readObject();
                        objectInputStream.close();
                        try {
                            arrayList2 = new ArrayList();
                            arrayList.addAll(arrayList2);
                        } catch (Exception e) {
                            AnonymousClass0DB.A0M("AppComponentManager", e, "Error reading entries from existing analytics file.");
                        }
                    }
                    arrayList.add(appComponentManagerProfiledRun);
                    if (!arrayList.isEmpty()) {
                        try {
                            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(file2, false));
                            objectOutputStream.writeObject(arrayList);
                            objectOutputStream.close();
                        } catch (Exception e2) {
                            AnonymousClass0DB.A0M("AppComponentManager", e2, "Error writing entries to logfile.");
                        }
                    }
                }
                context.getPackageName();
            } catch (IOException e3) {
                throw new RuntimeException("Failed to touch file: " + file, e3);
            }
        } else {
            throw new RuntimeException(String.format("Failed to set enable stage %d for pkg[%s], can't resume. Duration[%s]", new Object[]{3, context.getPackageName(), Long.valueOf(currentTimeMillis2 / 1000)}));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:74:0x0138 A[Catch:{ RuntimeException -> 0x01bf }] */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0148 A[Catch:{ RuntimeException -> 0x01bf }] */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0157 A[Catch:{ RuntimeException -> 0x01bf }] */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0175 A[Catch:{ RuntimeException -> 0x01bf }] */
    public static int A00(Context context, PackageManager packageManager, int i, Integer... numArr) {
        ComponentInfo[] componentInfoArr;
        char c;
        boolean z;
        ComponentInfo A01;
        boolean z2;
        ArrayList arrayList = new ArrayList();
        int length = numArr.length;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            PackageManager packageManager2 = packageManager;
            Context context2 = context;
            if (i2 < length) {
                Integer num = numArr[i2];
                try {
                    String packageName = context2.getPackageName();
                    int intValue = num.intValue();
                    int i4 = intValue;
                    try {
                        PackageInfo packageInfo = packageManager2.getPackageInfo(packageName, i4 | 512 | 512 | DexStore.LOAD_RESULT_PGO);
                        if (i4 == 1) {
                            componentInfoArr = packageInfo.activities;
                        } else if (i4 == 2) {
                            componentInfoArr = packageInfo.receivers;
                        } else if (i4 == 4) {
                            componentInfoArr = packageInfo.services;
                        } else if (i4 != 8) {
                            componentInfoArr = null;
                        } else {
                            componentInfoArr = packageInfo.providers;
                        }
                        if (componentInfoArr == null) {
                            Log.w("AppComponentManager", String.format("getComponentsForType component list was null for type[%s].", new Object[]{Integer.valueOf(i4)}));
                            componentInfoArr = new ComponentInfo[0];
                        }
                    } catch (Exception e) {
                        Log.w("AppComponentManager", String.format("Got error while trying to get components of type[%s]. Fallback to manifest parsing..", new Object[]{A02(i4)}), e);
                        B8O A04 = new BAs().A04(new File(context2.getApplicationInfo().sourceDir));
                        if (i4 == 1) {
                            componentInfoArr = B8O.A00(A04, A04.A03);
                        } else if (i4 == 2) {
                            componentInfoArr = B8O.A00(A04, A04.A05);
                        } else if (i4 == 4) {
                            componentInfoArr = B8O.A00(A04, A04.A06);
                        } else if (i4 == 8) {
                            componentInfoArr = B8O.A00(A04, A04.A04);
                        } else {
                            throw new IllegalArgumentException(AnonymousClass000.A05("Unsupported component type: ", i4));
                        }
                    } catch (Exception e2) {
                        AnonymousClass0DB.A0P("AppComponentManager", e2, "Error getting components type[%s] from the XML.", Integer.valueOf(i4));
                        throw new RuntimeException("Error getting components from the XML", e2);
                    }
                    C30786Dk8 dk8 = new C30786Dk8(r7);
                    for (ComponentInfo componentInfo : componentInfoArr) {
                        Bundle bundle = componentInfo.metaData;
                        if (bundle != null) {
                            String string = bundle.getString("enable-stage", "enable-normal");
                            char c2 = 65535;
                            c = 2;
                            switch (string.hashCode()) {
                                case -2055805548:
                                    if (string.equals("enable-cold-pretos")) {
                                        c2 = 0;
                                        break;
                                    }
                                    break;
                                case -338306349:
                                    if (string.equals("enable-warm-pretos")) {
                                        c2 = 1;
                                        break;
                                    }
                                    break;
                                case -301967247:
                                    if (string.equals("enable-normal")) {
                                        c2 = 3;
                                        break;
                                    }
                                    break;
                                case 1434842880:
                                    if (string.equals("enable-after-login-urgent")) {
                                        c2 = 2;
                                        break;
                                    }
                                    break;
                            }
                            if (c2 == 0) {
                                c = 0;
                            } else if (c2 == 1) {
                                c = 1;
                            } else if (c2 != 2) {
                                if (c2 != 3) {
                                    AnonymousClass0DB.A0J("AppComponentManager", "Could not match enable stage value \"%s\" for %s", string, componentInfo.name);
                                }
                            }
                            z = false;
                            if (c <= 3) {
                                z = true;
                            }
                            ComponentInfo componentInfo2 = componentInfo;
                            ComponentName componentName = new ComponentName(componentInfo2.packageName, componentInfo2.name);
                            int i5 = 2;
                            if (z) {
                                i5 = 1;
                            }
                            A01 = A01(packageManager2, componentName, intValue, true);
                            if (A01 != null) {
                                AnonymousClass0DB.A0J("AppComponentManager", "Error getting component info with meta-data name[%s] type[%s]. Assuming component is not disabled-by-default...", componentName.getClassName(), A02(intValue));
                            } else {
                                Bundle bundle2 = A01.metaData;
                                if (bundle2 == null) {
                                    z2 = false;
                                } else {
                                    z2 = !bundle2.getBoolean("default-state", true);
                                }
                                if (z2) {
                                    i5 = 0;
                                }
                            }
                            packageManager2.getComponentEnabledSetting(componentName);
                            packageManager2.setComponentEnabledSetting(componentName, i5, 1);
                        }
                        c = 3;
                        z = false;
                        if (c <= 3) {
                        }
                        ComponentInfo componentInfo22 = componentInfo;
                        ComponentName componentName2 = new ComponentName(componentInfo22.packageName, componentInfo22.name);
                        int i52 = 2;
                        if (z) {
                        }
                        A01 = A01(packageManager2, componentName2, intValue, true);
                        if (A01 != null) {
                        }
                        packageManager2.getComponentEnabledSetting(componentName2);
                        packageManager2.setComponentEnabledSetting(componentName2, i52, 1);
                    }
                    Log.w("AppComponentManager", String.format("updateComponents successfully updated all %s components of type[%s]", new Object[]{Integer.valueOf(dk8.A00), num}));
                    i3 += dk8.A00;
                } catch (RuntimeException e3) {
                    Log.e("AppComponentManager", String.format("updateComponents failed to update type[%s] error[%s]", new Object[]{A02(num.intValue()), e3.getMessage()}), e3);
                    arrayList.add(num);
                }
                i2++;
            } else if (arrayList.size() == 0) {
                return i3;
            } else {
                if (i == 0) {
                    Log.w("AppComponentManager", String.format("updateComponents Failed updating components for types[%s]. No more retries left.", new Object[]{arrayList, Integer.valueOf(i)}));
                    return -1;
                }
                Log.w("AppComponentManager", String.format("updateComponents Failed updating components for types[%s]. Retries left[%s]", new Object[]{arrayList, Integer.valueOf(i)}));
                return A00(context2, packageManager2, i - 1, (Integer[]) arrayList.toArray(new Integer[0]));
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0033, code lost:
        if (A01(r8, r9, r10, false) == null) goto L_0x0035;
     */
    public static ComponentInfo A01(PackageManager packageManager, ComponentName componentName, int i, boolean z) {
        boolean z2;
        String str;
        int i2 = 33280;
        if (z) {
            i2 = 33408;
        }
        if (i == 1) {
            return packageManager.getActivityInfo(componentName, i2);
        }
        if (i == 2) {
            return packageManager.getReceiverInfo(componentName, i2);
        }
        if (i == 4) {
            return packageManager.getServiceInfo(componentName, i2);
        }
        if (i != 8) {
            return null;
        }
        try {
            return packageManager.getProviderInfo(componentName, i2);
        } catch (PackageManager.NameNotFoundException unused) {
            if (z) {
                try {
                    z2 = true;
                } catch (Exception unused2) {
                }
            }
            z2 = false;
            Object[] objArr = new Object[4];
            objArr[0] = componentName.getClassName();
            objArr[1] = A02(i);
            objArr[2] = Boolean.valueOf(z);
            if (!z || !z2) {
                str = ".";
            } else {
                str = ", BUT succeeded without asking for metadata.";
            }
            objArr[3] = str;
            AnonymousClass0DB.A0J("AppComponentManager", "getComponentInfo couldn't find component name[%s] type[%s] getMetaData[%s]%s", objArr);
            return null;
        }
    }
}
