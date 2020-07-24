package p000X;

import android.content.ContentResolver;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.os.SystemClock;
import android.provider.Settings;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import java.io.File;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.BRE */
public final class BRE {
    public Context A00;
    public HashMap A01;
    public BRO A02;
    public final BRL A03 = new BRL(this);

    /* JADX WARNING: Code restructure failed: missing block: B:156:0x0475, code lost:
        if (p000X.C35251g3.A07(r8.A00.A00, "android.permission.READ_SMS") != false) goto L_0x0477;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x04e5, code lost:
        if (r3 != null) goto L_0x04e7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00fb, code lost:
        if (r1.equals(android.os.Build.PRODUCT) != false) goto L_0x00fd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0171, code lost:
        if (r1.equals("") == false) goto L_0x0173;
     */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x0359  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x03d7 A[SYNTHETIC, Splitter:B:125:0x03d7] */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x04a0  */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x04e0  */
    /* JADX WARNING: Removed duplicated region for block: B:198:0x0248 A[EDGE_INSN: B:198:0x0248->B:72:0x0248 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:202:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x016a  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x022e A[Catch:{ SocketException -> 0x0248 }] */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0294  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x02a3  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x02aa  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x02b1  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x02f7  */
    public BRE(Context context) {
        boolean z;
        boolean z2;
        boolean z3;
        AnonymousClass2IW A002;
        String networkOperatorName;
        AnonymousClass2IW A003;
        String simOperatorName;
        Long l;
        Long l2;
        AnonymousClass2IW A004;
        int i;
        List A012;
        NetworkInfo networkInfo;
        NetworkInfo networkInfo2;
        Boolean bool;
        String str;
        String str2;
        Integer num;
        Integer num2;
        String str3;
        Cursor cursor;
        AnonymousClass2IW A005;
        AnonymousClass2IW A006;
        Enumeration<NetworkInterface> networkInterfaces;
        String str4;
        File[] listFiles;
        Context context2 = context;
        BRO bro = new BRO(context2);
        this.A02 = bro;
        HashMap hashMap = new HashMap();
        BRF brf = new BRF(bro.A00);
        hashMap.put("MobileCompVersion", "1.0.0");
        hashMap.put("MobileConfVersion", "1.0.0");
        Context context3 = brf.A00;
        String str5 = (String) BRM.A00.get();
        if (str5 == null) {
            SharedPreferences sharedPreferences = context3.getSharedPreferences("did", 0);
            str5 = sharedPreferences.getString("id", (String) null);
            if (str5 != null) {
                AtomicReference atomicReference = BRM.A00;
                if (!atomicReference.compareAndSet((Object) null, str5)) {
                    str5 = (String) atomicReference.get();
                }
            } else {
                String uuid = AnonymousClass954.A00().toString();
                AtomicReference atomicReference2 = BRM.A00;
                if (atomicReference2.compareAndSet((Object) null, uuid)) {
                    str5 = uuid;
                } else {
                    str5 = (String) atomicReference2.get();
                }
                if (TextUtils.equals(str5, uuid)) {
                    sharedPreferences.edit().putString("id", str5).apply();
                }
            }
        }
        hashMap.put("MobileAppGuid", str5);
        hashMap.put("MobileDeviceCanSendText", Boolean.valueOf(brf.A00.getPackageManager().hasSystemFeature("android.hardware.telephony")));
        TimeZone timeZone = TimeZone.getDefault();
        Date date = new Date();
        hashMap.put("MobileDayLightSavingsTimeEnabled", Boolean.valueOf(timeZone.inDaylightTime(date)));
        ContentResolver contentResolver = brf.A00.getContentResolver();
        String $const$string = AnonymousClass0C5.$const$string(57);
        hashMap.put("MobileDeviceId", Settings.Secure.getString(contentResolver, $const$string));
        String str6 = Build.FINGERPRINT;
        if (!str6.startsWith("generic") && !str6.startsWith("unknown")) {
            String str7 = Build.MODEL;
            String $const$string2 = AnonymousClass0C5.$const$string(237);
            z = (!str7.contains($const$string2) && !str7.contains(AnonymousClass0C5.$const$string(156)) && !str7.contains(AnonymousClass0C5.$const$string(146)) && !Build.MANUFACTURER.contains(AnonymousClass0C5.$const$string(162)) && (!Build.BRAND.startsWith("generic") || !Build.DEVICE.startsWith("generic"))) ? false : z;
        }
        z = true;
        hashMap.put("MobileDeviceIsEmulator", Boolean.valueOf(z));
        if (!new File("/system/app/Superuser.apk").exists() && ((str4 = Build.TAGS) == null || !str4.contains("test-keys"))) {
            String str8 = System.getenv("PATH");
            if (str8 != null) {
                String[] split = str8.split(":");
                int length = split.length;
                int i2 = 0;
                loop0:
                while (true) {
                    if (i2 >= length) {
                        break;
                    }
                    File file = new File(split[i2]);
                    if (file.exists() && file.isDirectory() && (listFiles = file.listFiles()) != null) {
                        for (File name : listFiles) {
                            if (name.getName().equals("su")) {
                                break loop0;
                            }
                        }
                        continue;
                    }
                    i2++;
                }
            }
            z2 = false;
            hashMap.put("MobileDeviceJailBroken", Boolean.valueOf(z2));
            hashMap.put("MobileDeviceLocalTimezone", timeZone.getDisplayName(timeZone.inDaylightTime(date), 1, Locale.ENGLISH));
            hashMap.put("MobileDeviceLocaleCountry", BRF.A02().getCountry());
            hashMap.put("MobileDeviceLocaleLanguage", BRF.A02().getLanguage());
            hashMap.put("MobileDeviceName", Build.DEVICE);
            hashMap.put("MobileOSType", "Android");
            String property = System.getProperty("http.proxyHost");
            boolean z4 = property != null ? false : z4;
            z4 = true;
            hashMap.put("MobileDeviceProxySet", Boolean.valueOf(z4));
            hashMap.put("MobileRequestTimestamp", Long.valueOf(System.currentTimeMillis() / 1000));
            hashMap.put("MobileDeviceTotalDiskSpace", Long.valueOf(C04120Cm.A01().A07(Constants.ONE)));
            hashMap.put("MobileTimezoneOffsetMs", Integer.valueOf(timeZone.getOffset(date.getTime())));
            networkInterfaces = NetworkInterface.getNetworkInterfaces();
            while (true) {
                if (networkInterfaces.hasMoreElements()) {
                    break;
                }
                NetworkInterface nextElement = networkInterfaces.nextElement();
                if (nextElement.isUp() && nextElement.getName().startsWith("tun")) {
                    z3 = true;
                    break;
                }
            }
            z3 = false;
            hashMap.put("MobileDeviceVPN", Boolean.valueOf(z3));
            hashMap.put("MobileDeviceUptime", Long.valueOf(SystemClock.uptimeMillis()));
            hashMap.put("MobileAppName", bro.A00.getApplicationContext().getPackageName());
            hashMap.put("MobileDeviceModel", Build.MANUFACTURER);
            hashMap.put("MobileOSVersion", Build.VERSION.RELEASE);
            hashMap.put("MobileAndroidID", Settings.Secure.getString(bro.A00.getContentResolver(), $const$string));
            A002 = AnonymousClass2IV.A00(bro.A00, (AnonymousClass26W) null);
            if (A002 != null) {
                networkOperatorName = null;
            } else {
                networkOperatorName = A002.A00.getNetworkOperatorName();
            }
            hashMap.put("MobileSimOperatorName", networkOperatorName);
            A003 = AnonymousClass2IV.A00(bro.A00, (AnonymousClass26W) null);
            if (A003 != null) {
                simOperatorName = null;
            } else {
                simOperatorName = A003.A00.getSimOperatorName();
            }
            hashMap.put("MobileSimOperatorName", simOperatorName);
            Context context4 = bro.A00;
            l = Long.valueOf(context4.getPackageManager().getPackageInfo(context4.getPackageName(), 0).firstInstallTime);
            hashMap.put("MobileAppFirstInstallTime", l);
            Context context5 = bro.A00;
            l2 = Long.valueOf(context5.getPackageManager().getPackageInfo(context5.getPackageName(), 0).lastUpdateTime);
            hashMap.put("MobileAppLastUpdateTime", l2);
            A004 = AnonymousClass2IV.A00(bro.A00, (AnonymousClass26W) null);
            if (A004 != null) {
                i = -1;
            } else {
                try {
                    i = A004.A00.getPhoneType();
                } catch (Resources.NotFoundException unused) {
                    i = -1;
                }
            }
            hashMap.put("MobileDeviceRadioType", Integer.valueOf(i));
            A012 = BRF.A01(false);
            String str9 = null;
            if (A012 != null && !A012.isEmpty()) {
                str9 = (String) A012.get(0);
            }
            hashMap.put("SourceIP", str9);
            hashMap.put("MobileIpAddresses", BRF.A01(true));
            hashMap.put("MobilePayloadType", "full");
            hashMap.put("MobileSerialNumber", BQW.A00(bro.A00));
            hashMap.put("MobileDeviceCanSendText", Boolean.valueOf(bro.A00.getPackageManager().hasSystemFeature("android.hardware.telephony")));
            this.A01 = hashMap;
            this.A00 = context2;
            hashMap.put("MobileAppVersion", C12840hT.A03);
            if (Build.VERSION.SDK_INT < 23) {
                HashMap hashMap2 = this.A01;
                Context context6 = this.A00;
                BRL brl = this.A03;
                ConnectivityManager connectivityManager = (ConnectivityManager) context6.getSystemService("connectivity");
                if (C35251g3.A07(brl.A00.A00, "android.permission.ACCESS_NETWORK_STATE")) {
                    networkInfo = connectivityManager.getActiveNetworkInfo();
                } else {
                    networkInfo = null;
                }
                String str10 = "";
                if (networkInfo != null) {
                    int type = networkInfo.getType();
                    if (type == 0) {
                        str10 = NetInfoModule.CONNECTION_TYPE_CELLULAR;
                    } else if (type == 1) {
                        str10 = NetInfoModule.CONNECTION_TYPE_WIFI;
                    }
                }
                hashMap2.put("MobileConnType", str10);
                HashMap hashMap3 = this.A01;
                Context context7 = this.A00;
                BRL brl2 = this.A03;
                ConnectivityManager connectivityManager2 = (ConnectivityManager) context7.getSystemService("connectivity");
                if (C35251g3.A07(brl2.A00.A00, "android.permission.ACCESS_NETWORK_STATE")) {
                    networkInfo2 = connectivityManager2.getActiveNetworkInfo();
                } else {
                    networkInfo2 = null;
                }
                if (networkInfo2 != null) {
                    bool = Boolean.valueOf(networkInfo2.isRoaming());
                } else {
                    bool = null;
                }
                hashMap3.put("MobileRoaming", bool);
                HashMap hashMap4 = this.A01;
                Context context8 = this.A00;
                String str11 = null;
                if (!C35251g3.A07(this.A03.A00.A00, "android.permission.READ_PHONE_STATE") || (A006 = AnonymousClass2IV.A00(context8, (AnonymousClass26W) null)) == null) {
                    str = null;
                } else {
                    try {
                        str = A006.A00.getSimSerialNumber();
                    } catch (SecurityException unused2) {
                        str = null;
                    }
                }
                hashMap4.put("MobileSimSerialNumber", str);
                HashMap hashMap5 = this.A01;
                Context context9 = this.A00;
                if (!C35251g3.A07(this.A03.A00.A00, "android.permission.READ_PHONE_STATE") || (A005 = AnonymousClass2IV.A00(context9, (AnonymousClass26W) null)) == null) {
                    str2 = null;
                } else {
                    try {
                        str2 = A005.A00.getSubscriberId();
                    } catch (SecurityException unused3) {
                        str2 = null;
                    }
                }
                hashMap5.put("MobileSubscriberId", str2);
                HashMap hashMap6 = this.A01;
                CdmaCellLocation A007 = BRF.A00(this.A00, this.A03);
                if (A007 != null) {
                    num = Integer.valueOf(A007.getNetworkId());
                } else {
                    num = null;
                }
                hashMap6.put("MobileCdmaNetworkId", num);
                HashMap hashMap7 = this.A01;
                CdmaCellLocation A008 = BRF.A00(this.A00, this.A03);
                if (A008 != null) {
                    num2 = Integer.valueOf(A008.getSystemId());
                } else {
                    num2 = null;
                }
                hashMap7.put("MobileCdmaSystemId", num2);
                HashMap hashMap8 = this.A01;
                Context context10 = this.A00;
                BRL brl3 = this.A03;
                AnonymousClass2IW A009 = AnonymousClass2IV.A00(context10, (AnonymousClass26W) null);
                if (A009 != null) {
                    boolean z5 = (!C35251g3.A07(brl3.A00.A00, "android.permission.READ_PHONE_NUMBERS") && !C35251g3.A07(brl3.A00.A00, "android.permission.READ_PHONE_STATE")) ? false : z5;
                    z5 = true;
                    if (z5) {
                        try {
                            str3 = A009.A00.getLine1Number();
                        } catch (SecurityException unused4) {
                            str3 = null;
                        }
                        hashMap8.put("MobileLine1Number", str3);
                        HashMap hashMap9 = this.A01;
                        Context context11 = this.A00;
                        if (C35251g3.A07(this.A03.A00.A00, "com.google.android.providers.gsf.permission.READ_GSERVICES")) {
                            try {
                                cursor = context11.getContentResolver().query(Uri.parse("content://com.google.android.gsf.gservices"), (String[]) null, (String) null, new String[]{$const$string}, (String) null);
                                try {
                                    if (cursor.moveToFirst() && cursor.getColumnCount() >= 2) {
                                        str11 = Long.toHexString(Long.parseLong(cursor.getString(1))).toUpperCase(Locale.US);
                                        cursor.close();
                                    }
                                } catch (Exception unused5) {
                                } catch (Throwable th) {
                                    th = th;
                                    if (cursor != null) {
                                    }
                                    throw th;
                                }
                            } catch (Exception unused6) {
                                cursor = null;
                            } catch (Throwable th2) {
                                th = th2;
                                cursor = null;
                                if (cursor != null) {
                                    cursor.close();
                                }
                                throw th;
                            }
                            cursor.close();
                        }
                        hashMap9.put("MobileGsfId", str11);
                        return;
                    }
                }
                str3 = null;
                hashMap8.put("MobileLine1Number", str3);
                HashMap hashMap92 = this.A01;
                Context context112 = this.A00;
                if (C35251g3.A07(this.A03.A00.A00, "com.google.android.providers.gsf.permission.READ_GSERVICES")) {
                }
                hashMap92.put("MobileGsfId", str11);
                return;
            }
            return;
        }
        z2 = true;
        hashMap.put("MobileDeviceJailBroken", Boolean.valueOf(z2));
        hashMap.put("MobileDeviceLocalTimezone", timeZone.getDisplayName(timeZone.inDaylightTime(date), 1, Locale.ENGLISH));
        hashMap.put("MobileDeviceLocaleCountry", BRF.A02().getCountry());
        hashMap.put("MobileDeviceLocaleLanguage", BRF.A02().getLanguage());
        hashMap.put("MobileDeviceName", Build.DEVICE);
        hashMap.put("MobileOSType", "Android");
        String property2 = System.getProperty("http.proxyHost");
        if (property2 != null) {
        }
        z4 = true;
        hashMap.put("MobileDeviceProxySet", Boolean.valueOf(z4));
        hashMap.put("MobileRequestTimestamp", Long.valueOf(System.currentTimeMillis() / 1000));
        hashMap.put("MobileDeviceTotalDiskSpace", Long.valueOf(C04120Cm.A01().A07(Constants.ONE)));
        hashMap.put("MobileTimezoneOffsetMs", Integer.valueOf(timeZone.getOffset(date.getTime())));
        try {
            networkInterfaces = NetworkInterface.getNetworkInterfaces();
            while (true) {
                if (networkInterfaces.hasMoreElements()) {
                }
            }
        } catch (SocketException unused7) {
        }
        z3 = false;
        hashMap.put("MobileDeviceVPN", Boolean.valueOf(z3));
        hashMap.put("MobileDeviceUptime", Long.valueOf(SystemClock.uptimeMillis()));
        hashMap.put("MobileAppName", bro.A00.getApplicationContext().getPackageName());
        hashMap.put("MobileDeviceModel", Build.MANUFACTURER);
        hashMap.put("MobileOSVersion", Build.VERSION.RELEASE);
        hashMap.put("MobileAndroidID", Settings.Secure.getString(bro.A00.getContentResolver(), $const$string));
        A002 = AnonymousClass2IV.A00(bro.A00, (AnonymousClass26W) null);
        if (A002 != null) {
        }
        hashMap.put("MobileSimOperatorName", networkOperatorName);
        A003 = AnonymousClass2IV.A00(bro.A00, (AnonymousClass26W) null);
        if (A003 != null) {
        }
        hashMap.put("MobileSimOperatorName", simOperatorName);
        Context context42 = bro.A00;
        try {
            l = Long.valueOf(context42.getPackageManager().getPackageInfo(context42.getPackageName(), 0).firstInstallTime);
        } catch (PackageManager.NameNotFoundException unused8) {
            l = null;
        }
        hashMap.put("MobileAppFirstInstallTime", l);
        Context context52 = bro.A00;
        try {
            l2 = Long.valueOf(context52.getPackageManager().getPackageInfo(context52.getPackageName(), 0).lastUpdateTime);
        } catch (PackageManager.NameNotFoundException unused9) {
            l2 = null;
        }
        hashMap.put("MobileAppLastUpdateTime", l2);
        A004 = AnonymousClass2IV.A00(bro.A00, (AnonymousClass26W) null);
        if (A004 != null) {
        }
        hashMap.put("MobileDeviceRadioType", Integer.valueOf(i));
        A012 = BRF.A01(false);
        String str92 = null;
        str92 = (String) A012.get(0);
        hashMap.put("SourceIP", str92);
        hashMap.put("MobileIpAddresses", BRF.A01(true));
        hashMap.put("MobilePayloadType", "full");
        hashMap.put("MobileSerialNumber", BQW.A00(bro.A00));
        hashMap.put("MobileDeviceCanSendText", Boolean.valueOf(bro.A00.getPackageManager().hasSystemFeature("android.hardware.telephony")));
        this.A01 = hashMap;
        this.A00 = context2;
        hashMap.put("MobileAppVersion", C12840hT.A03);
        if (Build.VERSION.SDK_INT < 23) {
        }
    }
}
