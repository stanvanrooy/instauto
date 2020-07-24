package p000X;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.facebook.proxygen.TraceFieldType;
import java.io.File;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* renamed from: X.BRH */
public final class BRH {
    public static final Class A04 = BRH.class;
    public BRP A00;
    public final Context A01;
    public final PackageManager A02;
    public final TelephonyManager A03 = ((TelephonyManager) this.A01.getSystemService("phone"));

    public static long A00(File file, int i) {
        File[] listFiles;
        long j = 0;
        if (file != null && file.exists()) {
            if (file.isFile()) {
                long j2 = (long) i;
                return (((file.length() + j2) - 1) / j2) * j2;
            } else if (file.isDirectory() && (listFiles = file.listFiles()) != null) {
                for (int length = listFiles.length - 1; length >= 0; length--) {
                    j += A00(listFiles[length], i);
                }
            }
        }
        return j;
    }

    public static void A01(Context context, C06590Pq r3, AnonymousClass0P4 r4) {
        String A05 = C05860Mt.A02.A05(context);
        String AZO = AnonymousClass0OZ.A00(r3).AZO();
        r4.A0G(AnonymousClass0C5.$const$string(60), A05);
        r4.A0G("analytics_device_id", AZO);
    }

    public BRH(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.A01 = applicationContext;
        this.A02 = applicationContext.getPackageManager();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:166:0x0373, code lost:
        if (r0 != false) goto L_0x0375;
     */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x027d  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x028f  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x02c3  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x02ce A[Catch:{ SecurityException -> 0x02f4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x02ea A[Catch:{ SecurityException -> 0x02f4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x02ff A[Catch:{ SecurityException -> 0x0348 }] */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x031b A[Catch:{ SecurityException -> 0x0348 }] */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x032c A[Catch:{ SecurityException -> 0x0348 }] */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x033e A[Catch:{ SecurityException -> 0x0348 }] */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x0361  */
    /* JADX WARNING: Removed duplicated region for block: B:175:0x0180 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x017a  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x017d  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0183  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0261  */
    public final void A02(AnonymousClass0P4 r38) {
        ArrayList arrayList;
        int i;
        String str;
        String str2;
        int i2;
        String str3;
        int i3;
        String str4;
        String A022;
        NetworkInfo activeNetworkInfo;
        BRJ brj;
        String str5;
        BRJ brj2;
        String str6;
        BRJ brj3;
        String str7;
        C06270Ok A002;
        C06170Oa A003 = C06170Oa.A00();
        BRK brk = new BRK(this.A01);
        if (brk.A01 == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList();
            for (int i4 = 0; i4 < 2; i4++) {
                TelephonyManager telephonyManager = brk.A01;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                BRJ brj4 = brk.A02;
                if (BRJ.A00(brj4, i4) == null) {
                    TelephonyManager telephonyManager2 = brj4.A01;
                    if (telephonyManager2 == null || i4 != 0) {
                        boolean z = BRJ.A01(brj4).A02;
                        i = -1;
                    } else {
                        i = telephonyManager2.getSimState();
                        if (i != -1) {
                            linkedHashMap = null;
                        } else {
                            linkedHashMap.put("index", Integer.valueOf(i4));
                            if (i == 1) {
                                str = "ABSENT";
                            } else if (i == 2) {
                                str = "PIN_REQUIRED";
                            } else if (i == 3) {
                                str = "PUK_REQUIRED";
                            } else if (i == 4) {
                                str = "NETWORK_LOCKED";
                            } else if (i != 5) {
                                str = NetInfoModule.CONNECTION_TYPE_UNKNOWN_DEPRECATED;
                            } else {
                                str = "READY";
                            }
                            linkedHashMap.put("state", str);
                            BRJ brj5 = brk.A02;
                            String A09 = brj5.A09(i4);
                            if (BRJ.A07(A09)) {
                                TelephonyManager telephonyManager3 = brj5.A01;
                                if (telephonyManager3 == null || i4 != 0) {
                                    A09 = null;
                                } else {
                                    A09 = telephonyManager3.getNetworkOperatorName();
                                }
                            }
                            linkedHashMap.put("carrier", A09);
                            String A092 = brk.A02.A09(i4);
                            if (BRJ.A07(A092)) {
                                A092 = null;
                            }
                            linkedHashMap.put("sim_carrier_name", A092);
                            String A032 = BRJ.A03(brk.A02, i4);
                            if (BRJ.A07(A032)) {
                                A032 = null;
                            }
                            linkedHashMap.put("sim_display_name", A032);
                            TelephonyManager telephonyManager4 = brk.A02.A01;
                            if (telephonyManager4 == null || i4 != 0) {
                                str2 = null;
                            } else {
                                str2 = telephonyManager4.getNetworkCountryIso();
                            }
                            linkedHashMap.put("carrier_country_iso", str2);
                            TelephonyManager telephonyManager5 = brk.A02.A01;
                            if (telephonyManager5 == null || i4 != 0) {
                                i2 = -1;
                            } else {
                                i2 = telephonyManager5.getNetworkType();
                            }
                            switch (i2) {
                                case 1:
                                    str3 = "GPRS";
                                    break;
                                case 2:
                                    str3 = "EDGE";
                                    break;
                                case 3:
                                    str3 = "UMTS";
                                    break;
                                case 4:
                                    str3 = "CDMA";
                                    break;
                                case 5:
                                    str3 = "EVDO_0";
                                    break;
                                case 6:
                                    str3 = "EVDO_A";
                                    break;
                                case 7:
                                    str3 = "1xRTT";
                                    break;
                                case 8:
                                    str3 = "HSDPA";
                                    break;
                                case 9:
                                    str3 = "HSUPA";
                                    break;
                                case 10:
                                    str3 = "HSPA";
                                    break;
                                case C120125Dh.VIEW_TYPE_BANNER:
                                    str3 = "IDEN";
                                    break;
                                case C120125Dh.VIEW_TYPE_SPINNER:
                                    str3 = "EVDO_B";
                                    break;
                                case C120125Dh.VIEW_TYPE_BADGE:
                                    str3 = "LTE";
                                    break;
                                case C120125Dh.VIEW_TYPE_LINK:
                                    str3 = "EHRPD";
                                    break;
                                case 15:
                                    str3 = "HSPAP";
                                    break;
                                default:
                                    str3 = NetInfoModule.CONNECTION_TYPE_UNKNOWN_DEPRECATED;
                                    break;
                            }
                            linkedHashMap.put(TraceFieldType.NetworkType, str3);
                            TelephonyManager telephonyManager6 = brk.A02.A01;
                            if (telephonyManager6 != null && i4 == 0) {
                                try {
                                    i3 = telephonyManager6.getPhoneType();
                                } catch (Resources.NotFoundException unused) {
                                }
                                if (i3 != 0) {
                                    str4 = NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED;
                                } else if (i3 == 1) {
                                    str4 = "GSM";
                                } else if (i3 == 2) {
                                    str4 = "CDMA";
                                } else if (i3 != 3) {
                                    str4 = NetInfoModule.CONNECTION_TYPE_UNKNOWN_DEPRECATED;
                                } else {
                                    str4 = "SIP";
                                }
                                linkedHashMap.put("phone_type", str4);
                                BRJ brj6 = brk.A02;
                                A022 = BRJ.A02(brj6, i4);
                                if (BRJ.A07(A022)) {
                                    TelephonyManager telephonyManager7 = brj6.A01;
                                    if (telephonyManager7 == null || i4 != 0) {
                                        A022 = null;
                                    } else {
                                        A022 = telephonyManager7.getSimCountryIso();
                                    }
                                }
                                linkedHashMap.put("country_iso", A022);
                                if (i == 5) {
                                    BRJ brj7 = brk.A02;
                                    String A06 = BRJ.A06(brj7, i4);
                                    if (BRJ.A07(A06)) {
                                        TelephonyManager telephonyManager8 = brj7.A01;
                                        if (telephonyManager8 == null || i4 != 0) {
                                            A06 = null;
                                        } else {
                                            A06 = telephonyManager8.getSimOperator();
                                        }
                                    }
                                    linkedHashMap.put("operator", A06);
                                    if (i4 == 0) {
                                        linkedHashMap.put("sim_operator_name", telephonyManager.getSimOperatorName());
                                    }
                                }
                                brj3 = brk.A02;
                                if (!brj3.A0C()) {
                                    str7 = BRJ.A04(brj3, i4);
                                    if (BRJ.A07(str7)) {
                                        TelephonyManager telephonyManager9 = brj3.A01;
                                        if (telephonyManager9 == null || i4 != 0) {
                                            str7 = AnonymousClass7K8.A00(BRJ.A01(brj3), "getLine1Number", i4);
                                        } else {
                                            str7 = telephonyManager9.getLine1Number();
                                        }
                                    }
                                } else {
                                    str7 = null;
                                }
                                linkedHashMap.put("phone_number", str7);
                                brj = brk.A02;
                                if (!brj.A0C()) {
                                    str5 = BRJ.A05(brj, i4);
                                    if (BRJ.A07(str5)) {
                                        TelephonyManager telephonyManager10 = brj.A01;
                                        if (telephonyManager10 == null || i4 != 0) {
                                            str5 = AnonymousClass7K8.A00(BRJ.A01(brj), "getIccSerialNumber", i4);
                                        } else {
                                            str5 = telephonyManager10.getSimSerialNumber();
                                        }
                                    }
                                } else {
                                    str5 = null;
                                }
                                linkedHashMap.put("serial_number", str5);
                                brj2 = brk.A02;
                                if (!brj2.A0C()) {
                                    TelephonyManager telephonyManager11 = brj2.A01;
                                    if (telephonyManager11 == null || i4 != 0) {
                                        str6 = AnonymousClass7K8.A00(BRJ.A01(brj2), "getSubscriberId", i4);
                                    } else {
                                        str6 = telephonyManager11.getSubscriberId();
                                    }
                                } else {
                                    str6 = null;
                                }
                                linkedHashMap.put("subscriber_id", str6);
                                linkedHashMap.put("device_locale", brk.A03.toString());
                                activeNetworkInfo = brk.A00.getActiveNetworkInfo();
                                if (activeNetworkInfo != null) {
                                    linkedHashMap.put("network_info", activeNetworkInfo.getExtraInfo());
                                }
                            }
                            i3 = -1;
                            if (i3 != 0) {
                            }
                            linkedHashMap.put("phone_type", str4);
                            BRJ brj62 = brk.A02;
                            A022 = BRJ.A02(brj62, i4);
                            if (BRJ.A07(A022)) {
                            }
                            linkedHashMap.put("country_iso", A022);
                            if (i == 5) {
                            }
                            try {
                                brj3 = brk.A02;
                                if (!brj3.A0C()) {
                                }
                                linkedHashMap.put("phone_number", str7);
                            } catch (SecurityException unused2) {
                                linkedHashMap.put("phone_number", "SecurityException");
                            }
                            try {
                                brj = brk.A02;
                                if (!brj.A0C()) {
                                }
                                linkedHashMap.put("serial_number", str5);
                                brj2 = brk.A02;
                                if (!brj2.A0C()) {
                                }
                                linkedHashMap.put("subscriber_id", str6);
                            } catch (SecurityException unused3) {
                                linkedHashMap.put("serial_number", "SecurityException");
                                linkedHashMap.put("subscriber_id", "SecurityException");
                            }
                            linkedHashMap.put("device_locale", brk.A03.toString());
                            activeNetworkInfo = brk.A00.getActiveNetworkInfo();
                            if (activeNetworkInfo != null) {
                            }
                        }
                        if (linkedHashMap == null) {
                            arrayList.add(linkedHashMap);
                        }
                    }
                }
                i = 0;
                if (i != -1) {
                }
                if (linkedHashMap == null) {
                }
            }
        }
        if (arrayList != null) {
            for (int i5 = 0; i5 < arrayList.size(); i5++) {
                LinkedHashMap linkedHashMap2 = (LinkedHashMap) arrayList.get(i5);
                if (linkedHashMap2 == null) {
                    A002 = null;
                } else {
                    A002 = C06270Ok.A00();
                    int intValue = ((Integer) linkedHashMap2.get("index")).intValue();
                    String str8 = (String) linkedHashMap2.get("state");
                    String str9 = (String) linkedHashMap2.get("carrier");
                    String str10 = (String) linkedHashMap2.get("sim_carrier_name");
                    String str11 = (String) linkedHashMap2.get("sim_display_name");
                    String str12 = (String) linkedHashMap2.get("carrier_country_iso");
                    String str13 = (String) linkedHashMap2.get("phone_type");
                    String str14 = (String) linkedHashMap2.get(TraceFieldType.NetworkType);
                    String str15 = (String) linkedHashMap2.get("country_iso");
                    String str16 = (String) linkedHashMap2.get("operator");
                    String str17 = (String) linkedHashMap2.get("sim_operator_name");
                    String str18 = (String) linkedHashMap2.get("phone_number");
                    String str19 = (String) linkedHashMap2.get("serial_number");
                    String str20 = (String) linkedHashMap2.get("subscriber_id");
                    A002.A07("index", Integer.valueOf(intValue));
                    A002.A09("state", str8);
                    A002.A09("carrier", str9);
                    C06270Ok r1 = A002;
                    r1.A09("sim_carrier_name", str10);
                    r1.A09("sim_display_name", str11);
                    r1.A09("carrier_country_iso", str12);
                    C06270Ok r8 = r1;
                    r8.A09("phone_type", str13);
                    r8.A09(TraceFieldType.NetworkType, str14);
                    r8.A09("country_iso", str15);
                    r8.A09("operator", str16);
                    r8.A09("sim_operator_name", str17);
                    r8.A09("phone_number", str18);
                    r8.A09("serial_number", str19);
                    r8.A09("subscriber_id", str20);
                    r8.A09("device_locale", (String) linkedHashMap2.get("device_locale"));
                }
                if (A002 != null) {
                    A003.A00.add(A002);
                }
            }
        }
        r38.A09("sim_info", A003);
    }
}
