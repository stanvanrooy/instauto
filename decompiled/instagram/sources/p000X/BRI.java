package p000X;

import android.app.ActivityManager;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.facebook.proxygen.TraceFieldType;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.BRI */
public final class BRI implements AnonymousClass14N {
    public final Context A00;
    public final BRG A01;
    public final AnonymousClass0OZ A02;
    public final AnonymousClass0C1 A03;

    /* JADX WARNING: Can't wrap try/catch for region: R(22:0|(1:2)|3|(3:5|6|(2:8|(2:13|(1:18)(1:17))(1:12)))|19|20|(2:21|(2:23|(2:24|(2:26|(1:136)(2:135|30))(1:137)))(1:134))|33|(3:34|35|(2:36|(2:38|(2:39|(3:41|(2:45|(3:140|49|(1:51)))|142)(1:143)))(1:141)))|52|54|(16:56|57|58|59|60|61|62|63|88|(1:91)(4:126|127|(1:129)|130)|92|(4:94|(1:125)(1:98)|99|(1:101))|102|(3:104|(7:107|(2:109|(1:122)(4:112|113|(1:150)(3:(1:116)(2:119|(1:121)(1:151))|117|149)|118))|124|113|(0)(0)|118|105)|148)|132|133)|86|88|(0)(0)|92|(0)|102|(0)|132|133|(1:(17:31|33|34|35|(3:36|(0)(0)|143)|52|54|(0)|86|88|(0)(0)|92|(0)|102|(0)|132|133))) */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x0311, code lost:
        if (r0 != false) goto L_0x0313;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x00ad */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x026f  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x0288  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x0319 A[SYNTHETIC, Splitter:B:126:0x0319] */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x00dc A[EDGE_INSN: B:134:0x00dc->B:31:0x00dc ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x0131 A[EDGE_INSN: B:141:0x0131->B:52:0x0131 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x02c9 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00b7 A[Catch:{ Exception -> 0x00dc }] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00ef A[Catch:{ Exception -> 0x0131 }] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x01c4 A[SYNTHETIC, Splitter:B:56:0x01c4] */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x01e6 A[SYNTHETIC, Splitter:B:70:0x01e6] */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x01eb A[Catch:{ IOException -> 0x01ee }] */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x01f4 A[SYNTHETIC, Splitter:B:82:0x01f4] */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x01f9 A[Catch:{ IOException -> 0x01fc }] */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x020e  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x021c  */
    public final void report() {
        String str;
        String str2;
        int i;
        int i2;
        int i3;
        String A0B;
        String str3;
        String str4;
        TelephonyManager telephonyManager;
        FileReader fileReader;
        Enumeration<NetworkInterface> networkInterfaces;
        BRG brg = this.A01;
        HashMap hashMap = new HashMap();
        hashMap.put("brand", Build.BRAND);
        hashMap.put("build_product", Build.PRODUCT);
        hashMap.put("build_device", Build.DEVICE);
        String str5 = Build.MODEL;
        String $const$string = AnonymousClass0C5.$const$string(215);
        hashMap.put($const$string, str5);
        hashMap.put("hardware", Build.HARDWARE);
        String str6 = Build.MANUFACTURER;
        String $const$string2 = AnonymousClass0C5.$const$string(260);
        hashMap.put($const$string2, str6);
        boolean z = false;
        if (brg.A01.checkCallingOrSelfPermission("android.permission.READ_PHONE_STATE") == 0) {
            z = true;
        }
        hashMap.put("is_read_phone_state_permitted", Boolean.valueOf(z));
        if (brg.A01.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0) {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) brg.A01.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                hashMap.put("network_info", activeNetworkInfo.getExtraInfo());
                if (activeNetworkInfo.getType() == 1 && activeNetworkInfo.isConnected()) {
                    hashMap.put(TraceFieldType.NetworkType, NetInfoModule.CONNECTION_TYPE_WIFI);
                } else if (activeNetworkInfo.getType() != 0 || !activeNetworkInfo.isConnected()) {
                    hashMap.put(TraceFieldType.NetworkType, "unknown");
                } else {
                    hashMap.put(TraceFieldType.NetworkType, "mobile");
                }
            }
        }
        Enumeration<NetworkInterface> networkInterfaces2 = NetworkInterface.getNetworkInterfaces();
        loop0:
        while (true) {
            if (networkInterfaces2.hasMoreElements()) {
                break;
            }
            Enumeration<InetAddress> inetAddresses = networkInterfaces2.nextElement().getInetAddresses();
            while (true) {
                if (inetAddresses.hasMoreElements()) {
                    InetAddress nextElement = inetAddresses.nextElement();
                    if (!nextElement.isLoopbackAddress() && (nextElement instanceof Inet4Address)) {
                        str = nextElement.getHostAddress();
                        break loop0;
                    }
                }
            }
        }
        hashMap.put("ip_v4", str);
        try {
            networkInterfaces = NetworkInterface.getNetworkInterfaces();
            while (true) {
                if (!networkInterfaces.hasMoreElements()) {
                    break;
                }
                Enumeration<InetAddress> inetAddresses2 = networkInterfaces.nextElement().getInetAddresses();
                while (true) {
                    if (inetAddresses2.hasMoreElements()) {
                        InetAddress nextElement2 = inetAddresses2.nextElement();
                        if (!nextElement2.isLoopbackAddress() && (nextElement2 instanceof Inet6Address)) {
                            str2 = nextElement2.getHostAddress();
                            if (!str2.startsWith("fe80") && !str2.startsWith("FE80")) {
                                int indexOf = str2.indexOf(37);
                                if (indexOf >= 0) {
                                    str2 = str2.substring(0, indexOf);
                                }
                            }
                        }
                    }
                }
            }
        } catch (Exception unused) {
        }
        str2 = "";
        hashMap.put("ip_v6", str2);
        DisplayMetrics displayMetrics = brg.A01.getResources().getDisplayMetrics();
        hashMap.put("dpi", Integer.valueOf(displayMetrics.densityDpi));
        hashMap.put("actual_height", Integer.valueOf(displayMetrics.heightPixels));
        hashMap.put("actual_width", Integer.valueOf(displayMetrics.widthPixels));
        hashMap.put("pixel_ratio", Float.valueOf(displayMetrics.density));
        hashMap.put("logical_height", Double.valueOf(((double) displayMetrics.heightPixels) / ((double) displayMetrics.density)));
        hashMap.put("logical_width", Double.valueOf(((double) displayMetrics.widthPixels) / ((double) displayMetrics.density)));
        hashMap.put("cpu_core_count", Integer.valueOf(AnonymousClass8HO.A00()));
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        brg.A00.getMemoryInfo(memoryInfo);
        hashMap.put("ram_size", Long.valueOf(memoryInfo.totalMem / 1048576));
        File file = new File("/sys/devices/system/cpu/cpu0/cpufreq/cpuinfo_max_freq");
        BufferedReader bufferedReader = null;
        if (file.exists()) {
            try {
                fileReader = new FileReader(file);
                try {
                    BufferedReader bufferedReader2 = new BufferedReader(fileReader);
                    try {
                        i = Integer.parseInt(bufferedReader2.readLine());
                        try {
                            bufferedReader2.close();
                            fileReader.close();
                        } catch (IOException unused2) {
                        }
                    } catch (IOException unused3) {
                        bufferedReader = bufferedReader2;
                        if (bufferedReader != null) {
                            try {
                                bufferedReader.close();
                            } catch (IOException unused4) {
                            }
                        }
                        if (fileReader != null) {
                            fileReader.close();
                        }
                        i = -1;
                        hashMap.put("cpu_max_freq", Integer.valueOf(i));
                        if (brg.A01.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") != 0) {
                        }
                        hashMap.put("roaming_status", Integer.valueOf(i2));
                        if (brg.A02 != null) {
                        }
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (brg.A02 != null) {
                        }
                        hashMap.put("sim_info", linkedHashMap);
                        AnonymousClass0P4 A002 = AnonymousClass0P4.A00("device_detection", (AnonymousClass0RN) null);
                        A002.A0G("fdid", this.A02.AZO());
                        A002.A0G("gid", (String) hashMap.get("gid"));
                        String str7 = "brand";
                        A002.A0G(str7, (String) hashMap.get(str7));
                        String str8 = "build_product";
                        A002.A0G(str8, (String) hashMap.get(str8));
                        String str9 = "build_device";
                        A002.A0G(str9, (String) hashMap.get(str9));
                        String str10 = $const$string;
                        A002.A0G(str10, (String) hashMap.get(str10));
                        String str11 = "hardware";
                        A002.A0G(str11, (String) hashMap.get(str11));
                        String str12 = $const$string2;
                        A002.A0G(str12, (String) hashMap.get(str12));
                        A002.A0G("network_info", (String) hashMap.get("network_info"));
                        A002.A0G("network_operator", (String) hashMap.get("network_operator"));
                        A002.A0G("network_operator_name", (String) hashMap.get("network_operator_name"));
                        A002.A0G(TraceFieldType.NetworkType, (String) hashMap.get(TraceFieldType.NetworkType));
                        String str13 = "ip_v4";
                        A002.A0G(str13, (String) hashMap.get(str13));
                        String str14 = "ip_v6";
                        A002.A0G(str14, (String) hashMap.get(str14));
                        A002.A0E("dpi", (Integer) hashMap.get("dpi"));
                        A002.A0E("actual_height", (Integer) hashMap.get("actual_height"));
                        A002.A0E("actual_width", (Integer) hashMap.get("actual_width"));
                        A002.A0D("pixel_ratio", (Float) hashMap.get("pixel_ratio"));
                        A002.A0C("logical_height", (Double) hashMap.get("logical_height"));
                        A002.A0C("logical_width", (Double) hashMap.get("logical_width"));
                        A002.A0E("cpu_core_count", (Integer) hashMap.get("cpu_core_count"));
                        A002.A0F("ram_size", (Long) hashMap.get("ram_size"));
                        A002.A0E("cpu_max_freq", (Integer) hashMap.get("cpu_max_freq"));
                        A002.A0G("sim_operator", (String) hashMap.get("sim_operator"));
                        A002.A0G("sim_operator_name", (String) hashMap.get("sim_operator_name"));
                        A002.A0E("roaming_status", (Integer) hashMap.get("roaming_status"));
                        A002.A0K((Map) hashMap.get("sim_info"));
                        AnonymousClass0WN.A01(this.A03).BcG(A002);
                    } catch (Throwable th) {
                        th = th;
                        bufferedReader = bufferedReader2;
                        if (bufferedReader != null) {
                            try {
                                bufferedReader.close();
                            } catch (IOException unused5) {
                                throw th;
                            }
                        }
                        if (fileReader != null) {
                            fileReader.close();
                        }
                        throw th;
                    }
                } catch (IOException unused6) {
                    if (bufferedReader != null) {
                    }
                    if (fileReader != null) {
                    }
                    i = -1;
                    hashMap.put("cpu_max_freq", Integer.valueOf(i));
                    if (brg.A01.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") != 0) {
                    }
                    hashMap.put("roaming_status", Integer.valueOf(i2));
                    if (brg.A02 != null) {
                    }
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    if (brg.A02 != null) {
                    }
                    hashMap.put("sim_info", linkedHashMap2);
                    AnonymousClass0P4 A0022 = AnonymousClass0P4.A00("device_detection", (AnonymousClass0RN) null);
                    A0022.A0G("fdid", this.A02.AZO());
                    A0022.A0G("gid", (String) hashMap.get("gid"));
                    String str72 = "brand";
                    A0022.A0G(str72, (String) hashMap.get(str72));
                    String str82 = "build_product";
                    A0022.A0G(str82, (String) hashMap.get(str82));
                    String str92 = "build_device";
                    A0022.A0G(str92, (String) hashMap.get(str92));
                    String str102 = $const$string;
                    A0022.A0G(str102, (String) hashMap.get(str102));
                    String str112 = "hardware";
                    A0022.A0G(str112, (String) hashMap.get(str112));
                    String str122 = $const$string2;
                    A0022.A0G(str122, (String) hashMap.get(str122));
                    A0022.A0G("network_info", (String) hashMap.get("network_info"));
                    A0022.A0G("network_operator", (String) hashMap.get("network_operator"));
                    A0022.A0G("network_operator_name", (String) hashMap.get("network_operator_name"));
                    A0022.A0G(TraceFieldType.NetworkType, (String) hashMap.get(TraceFieldType.NetworkType));
                    String str132 = "ip_v4";
                    A0022.A0G(str132, (String) hashMap.get(str132));
                    String str142 = "ip_v6";
                    A0022.A0G(str142, (String) hashMap.get(str142));
                    A0022.A0E("dpi", (Integer) hashMap.get("dpi"));
                    A0022.A0E("actual_height", (Integer) hashMap.get("actual_height"));
                    A0022.A0E("actual_width", (Integer) hashMap.get("actual_width"));
                    A0022.A0D("pixel_ratio", (Float) hashMap.get("pixel_ratio"));
                    A0022.A0C("logical_height", (Double) hashMap.get("logical_height"));
                    A0022.A0C("logical_width", (Double) hashMap.get("logical_width"));
                    A0022.A0E("cpu_core_count", (Integer) hashMap.get("cpu_core_count"));
                    A0022.A0F("ram_size", (Long) hashMap.get("ram_size"));
                    A0022.A0E("cpu_max_freq", (Integer) hashMap.get("cpu_max_freq"));
                    A0022.A0G("sim_operator", (String) hashMap.get("sim_operator"));
                    A0022.A0G("sim_operator_name", (String) hashMap.get("sim_operator_name"));
                    A0022.A0E("roaming_status", (Integer) hashMap.get("roaming_status"));
                    A0022.A0K((Map) hashMap.get("sim_info"));
                    AnonymousClass0WN.A01(this.A03).BcG(A0022);
                } catch (Throwable th2) {
                    th = th2;
                    if (bufferedReader != null) {
                    }
                    if (fileReader != null) {
                    }
                    throw th;
                }
            } catch (IOException unused7) {
                fileReader = null;
                if (bufferedReader != null) {
                }
                if (fileReader != null) {
                }
                i = -1;
                hashMap.put("cpu_max_freq", Integer.valueOf(i));
                if (brg.A01.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") != 0) {
                }
                hashMap.put("roaming_status", Integer.valueOf(i2));
                if (brg.A02 != null) {
                }
                LinkedHashMap linkedHashMap22 = new LinkedHashMap();
                if (brg.A02 != null) {
                }
                hashMap.put("sim_info", linkedHashMap22);
                AnonymousClass0P4 A00222 = AnonymousClass0P4.A00("device_detection", (AnonymousClass0RN) null);
                A00222.A0G("fdid", this.A02.AZO());
                A00222.A0G("gid", (String) hashMap.get("gid"));
                String str722 = "brand";
                A00222.A0G(str722, (String) hashMap.get(str722));
                String str822 = "build_product";
                A00222.A0G(str822, (String) hashMap.get(str822));
                String str922 = "build_device";
                A00222.A0G(str922, (String) hashMap.get(str922));
                String str1022 = $const$string;
                A00222.A0G(str1022, (String) hashMap.get(str1022));
                String str1122 = "hardware";
                A00222.A0G(str1122, (String) hashMap.get(str1122));
                String str1222 = $const$string2;
                A00222.A0G(str1222, (String) hashMap.get(str1222));
                A00222.A0G("network_info", (String) hashMap.get("network_info"));
                A00222.A0G("network_operator", (String) hashMap.get("network_operator"));
                A00222.A0G("network_operator_name", (String) hashMap.get("network_operator_name"));
                A00222.A0G(TraceFieldType.NetworkType, (String) hashMap.get(TraceFieldType.NetworkType));
                String str1322 = "ip_v4";
                A00222.A0G(str1322, (String) hashMap.get(str1322));
                String str1422 = "ip_v6";
                A00222.A0G(str1422, (String) hashMap.get(str1422));
                A00222.A0E("dpi", (Integer) hashMap.get("dpi"));
                A00222.A0E("actual_height", (Integer) hashMap.get("actual_height"));
                A00222.A0E("actual_width", (Integer) hashMap.get("actual_width"));
                A00222.A0D("pixel_ratio", (Float) hashMap.get("pixel_ratio"));
                A00222.A0C("logical_height", (Double) hashMap.get("logical_height"));
                A00222.A0C("logical_width", (Double) hashMap.get("logical_width"));
                A00222.A0E("cpu_core_count", (Integer) hashMap.get("cpu_core_count"));
                A00222.A0F("ram_size", (Long) hashMap.get("ram_size"));
                A00222.A0E("cpu_max_freq", (Integer) hashMap.get("cpu_max_freq"));
                A00222.A0G("sim_operator", (String) hashMap.get("sim_operator"));
                A00222.A0G("sim_operator_name", (String) hashMap.get("sim_operator_name"));
                A00222.A0E("roaming_status", (Integer) hashMap.get("roaming_status"));
                A00222.A0K((Map) hashMap.get("sim_info"));
                AnonymousClass0WN.A01(this.A03).BcG(A00222);
            } catch (Throwable th3) {
                th = th3;
                fileReader = null;
                if (bufferedReader != null) {
                }
                if (fileReader != null) {
                }
                throw th;
            }
            hashMap.put("cpu_max_freq", Integer.valueOf(i));
            if (brg.A01.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") != 0) {
                i2 = -1;
            } else {
                try {
                    NetworkInfo activeNetworkInfo2 = ((ConnectivityManager) brg.A01.getSystemService("connectivity")).getActiveNetworkInfo();
                    if (activeNetworkInfo2 != null) {
                        i2 = activeNetworkInfo2.isRoaming();
                    }
                } catch (Throwable unused8) {
                }
                i2 = -1;
            }
            hashMap.put("roaming_status", Integer.valueOf(i2));
            if (brg.A02 != null) {
                if (!brg.A03.A0C() || (telephonyManager = brg.A02) == null) {
                    str4 = null;
                } else {
                    str4 = telephonyManager.getGroupIdLevel1();
                }
                hashMap.put("gid", str4);
                hashMap.put("network_operator", brg.A02.getNetworkOperator());
                hashMap.put("network_operator_name", brg.A02.getNetworkOperatorName());
                if (brg.A02.getSimState() == 5) {
                    hashMap.put("sim_operator", brg.A02.getSimOperator());
                    hashMap.put("sim_operator_name", brg.A02.getSimOperatorName());
                }
            }
            LinkedHashMap linkedHashMap222 = new LinkedHashMap();
            if (brg.A02 != null) {
                for (int i4 = 0; i4 < 2; i4++) {
                    BRJ brj = brg.A03;
                    if (BRJ.A00(brj, i4) == null) {
                        TelephonyManager telephonyManager2 = brj.A01;
                        if (telephonyManager2 == null || i4 != 0) {
                            boolean z2 = BRJ.A01(brj).A02;
                            i3 = -1;
                        } else {
                            i3 = telephonyManager2.getSimState();
                            if (i3 != -1) {
                                if (i4 == 0) {
                                    linkedHashMap222.put("state_1", BRG.A00(i3));
                                    linkedHashMap222.put("imei_1", brg.A03.A08(i4));
                                    linkedHashMap222.put("carrier_1", brg.A03.A09(i4));
                                    linkedHashMap222.put("mcc_1", brg.A03.A0A(i4));
                                    A0B = brg.A03.A0B(i4);
                                    str3 = "mnc_1";
                                } else if (i4 == 1) {
                                    linkedHashMap222.put("state_2", BRG.A00(i3));
                                    linkedHashMap222.put("imei_2", brg.A03.A08(i4));
                                    linkedHashMap222.put("carrier_2", brg.A03.A09(i4));
                                    linkedHashMap222.put("mcc_2", brg.A03.A0A(i4));
                                    A0B = brg.A03.A0B(i4);
                                    str3 = "mnc_2";
                                }
                                linkedHashMap222.put(str3, A0B);
                            }
                        }
                    }
                    i3 = 0;
                    if (i3 != -1) {
                    }
                }
            }
            hashMap.put("sim_info", linkedHashMap222);
            AnonymousClass0P4 A002222 = AnonymousClass0P4.A00("device_detection", (AnonymousClass0RN) null);
            A002222.A0G("fdid", this.A02.AZO());
            A002222.A0G("gid", (String) hashMap.get("gid"));
            String str7222 = "brand";
            A002222.A0G(str7222, (String) hashMap.get(str7222));
            String str8222 = "build_product";
            A002222.A0G(str8222, (String) hashMap.get(str8222));
            String str9222 = "build_device";
            A002222.A0G(str9222, (String) hashMap.get(str9222));
            String str10222 = $const$string;
            A002222.A0G(str10222, (String) hashMap.get(str10222));
            String str11222 = "hardware";
            A002222.A0G(str11222, (String) hashMap.get(str11222));
            String str12222 = $const$string2;
            A002222.A0G(str12222, (String) hashMap.get(str12222));
            A002222.A0G("network_info", (String) hashMap.get("network_info"));
            A002222.A0G("network_operator", (String) hashMap.get("network_operator"));
            A002222.A0G("network_operator_name", (String) hashMap.get("network_operator_name"));
            A002222.A0G(TraceFieldType.NetworkType, (String) hashMap.get(TraceFieldType.NetworkType));
            String str13222 = "ip_v4";
            A002222.A0G(str13222, (String) hashMap.get(str13222));
            String str14222 = "ip_v6";
            A002222.A0G(str14222, (String) hashMap.get(str14222));
            A002222.A0E("dpi", (Integer) hashMap.get("dpi"));
            A002222.A0E("actual_height", (Integer) hashMap.get("actual_height"));
            A002222.A0E("actual_width", (Integer) hashMap.get("actual_width"));
            A002222.A0D("pixel_ratio", (Float) hashMap.get("pixel_ratio"));
            A002222.A0C("logical_height", (Double) hashMap.get("logical_height"));
            A002222.A0C("logical_width", (Double) hashMap.get("logical_width"));
            A002222.A0E("cpu_core_count", (Integer) hashMap.get("cpu_core_count"));
            A002222.A0F("ram_size", (Long) hashMap.get("ram_size"));
            A002222.A0E("cpu_max_freq", (Integer) hashMap.get("cpu_max_freq"));
            A002222.A0G("sim_operator", (String) hashMap.get("sim_operator"));
            A002222.A0G("sim_operator_name", (String) hashMap.get("sim_operator_name"));
            A002222.A0E("roaming_status", (Integer) hashMap.get("roaming_status"));
            A002222.A0K((Map) hashMap.get("sim_info"));
            AnonymousClass0WN.A01(this.A03).BcG(A002222);
        }
        i = -1;
        hashMap.put("cpu_max_freq", Integer.valueOf(i));
        if (brg.A01.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") != 0) {
        }
        hashMap.put("roaming_status", Integer.valueOf(i2));
        if (brg.A02 != null) {
        }
        LinkedHashMap linkedHashMap2222 = new LinkedHashMap();
        if (brg.A02 != null) {
        }
        hashMap.put("sim_info", linkedHashMap2222);
        AnonymousClass0P4 A0022222 = AnonymousClass0P4.A00("device_detection", (AnonymousClass0RN) null);
        A0022222.A0G("fdid", this.A02.AZO());
        A0022222.A0G("gid", (String) hashMap.get("gid"));
        String str72222 = "brand";
        A0022222.A0G(str72222, (String) hashMap.get(str72222));
        String str82222 = "build_product";
        A0022222.A0G(str82222, (String) hashMap.get(str82222));
        String str92222 = "build_device";
        A0022222.A0G(str92222, (String) hashMap.get(str92222));
        String str102222 = $const$string;
        A0022222.A0G(str102222, (String) hashMap.get(str102222));
        String str112222 = "hardware";
        A0022222.A0G(str112222, (String) hashMap.get(str112222));
        String str122222 = $const$string2;
        A0022222.A0G(str122222, (String) hashMap.get(str122222));
        A0022222.A0G("network_info", (String) hashMap.get("network_info"));
        A0022222.A0G("network_operator", (String) hashMap.get("network_operator"));
        A0022222.A0G("network_operator_name", (String) hashMap.get("network_operator_name"));
        A0022222.A0G(TraceFieldType.NetworkType, (String) hashMap.get(TraceFieldType.NetworkType));
        String str132222 = "ip_v4";
        A0022222.A0G(str132222, (String) hashMap.get(str132222));
        String str142222 = "ip_v6";
        A0022222.A0G(str142222, (String) hashMap.get(str142222));
        A0022222.A0E("dpi", (Integer) hashMap.get("dpi"));
        A0022222.A0E("actual_height", (Integer) hashMap.get("actual_height"));
        A0022222.A0E("actual_width", (Integer) hashMap.get("actual_width"));
        A0022222.A0D("pixel_ratio", (Float) hashMap.get("pixel_ratio"));
        A0022222.A0C("logical_height", (Double) hashMap.get("logical_height"));
        A0022222.A0C("logical_width", (Double) hashMap.get("logical_width"));
        A0022222.A0E("cpu_core_count", (Integer) hashMap.get("cpu_core_count"));
        A0022222.A0F("ram_size", (Long) hashMap.get("ram_size"));
        A0022222.A0E("cpu_max_freq", (Integer) hashMap.get("cpu_max_freq"));
        A0022222.A0G("sim_operator", (String) hashMap.get("sim_operator"));
        A0022222.A0G("sim_operator_name", (String) hashMap.get("sim_operator_name"));
        A0022222.A0E("roaming_status", (Integer) hashMap.get("roaming_status"));
        A0022222.A0K((Map) hashMap.get("sim_info"));
        AnonymousClass0WN.A01(this.A03).BcG(A0022222);
        str = "";
        hashMap.put("ip_v4", str);
        networkInterfaces = NetworkInterface.getNetworkInterfaces();
        while (true) {
            if (!networkInterfaces.hasMoreElements()) {
            }
        }
        str2 = "";
        hashMap.put("ip_v6", str2);
        DisplayMetrics displayMetrics2 = brg.A01.getResources().getDisplayMetrics();
        hashMap.put("dpi", Integer.valueOf(displayMetrics2.densityDpi));
        hashMap.put("actual_height", Integer.valueOf(displayMetrics2.heightPixels));
        hashMap.put("actual_width", Integer.valueOf(displayMetrics2.widthPixels));
        hashMap.put("pixel_ratio", Float.valueOf(displayMetrics2.density));
        hashMap.put("logical_height", Double.valueOf(((double) displayMetrics2.heightPixels) / ((double) displayMetrics2.density)));
        hashMap.put("logical_width", Double.valueOf(((double) displayMetrics2.widthPixels) / ((double) displayMetrics2.density)));
        hashMap.put("cpu_core_count", Integer.valueOf(AnonymousClass8HO.A00()));
        ActivityManager.MemoryInfo memoryInfo2 = new ActivityManager.MemoryInfo();
        brg.A00.getMemoryInfo(memoryInfo2);
        hashMap.put("ram_size", Long.valueOf(memoryInfo2.totalMem / 1048576));
        File file2 = new File("/sys/devices/system/cpu/cpu0/cpufreq/cpuinfo_max_freq");
        BufferedReader bufferedReader3 = null;
        if (file2.exists()) {
        }
        i = -1;
        hashMap.put("cpu_max_freq", Integer.valueOf(i));
        if (brg.A01.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") != 0) {
        }
        hashMap.put("roaming_status", Integer.valueOf(i2));
        if (brg.A02 != null) {
        }
        LinkedHashMap linkedHashMap22222 = new LinkedHashMap();
        if (brg.A02 != null) {
        }
        hashMap.put("sim_info", linkedHashMap22222);
        AnonymousClass0P4 A00222222 = AnonymousClass0P4.A00("device_detection", (AnonymousClass0RN) null);
        A00222222.A0G("fdid", this.A02.AZO());
        A00222222.A0G("gid", (String) hashMap.get("gid"));
        String str722222 = "brand";
        A00222222.A0G(str722222, (String) hashMap.get(str722222));
        String str822222 = "build_product";
        A00222222.A0G(str822222, (String) hashMap.get(str822222));
        String str922222 = "build_device";
        A00222222.A0G(str922222, (String) hashMap.get(str922222));
        String str1022222 = $const$string;
        A00222222.A0G(str1022222, (String) hashMap.get(str1022222));
        String str1122222 = "hardware";
        A00222222.A0G(str1122222, (String) hashMap.get(str1122222));
        String str1222222 = $const$string2;
        A00222222.A0G(str1222222, (String) hashMap.get(str1222222));
        A00222222.A0G("network_info", (String) hashMap.get("network_info"));
        A00222222.A0G("network_operator", (String) hashMap.get("network_operator"));
        A00222222.A0G("network_operator_name", (String) hashMap.get("network_operator_name"));
        A00222222.A0G(TraceFieldType.NetworkType, (String) hashMap.get(TraceFieldType.NetworkType));
        String str1322222 = "ip_v4";
        A00222222.A0G(str1322222, (String) hashMap.get(str1322222));
        String str1422222 = "ip_v6";
        A00222222.A0G(str1422222, (String) hashMap.get(str1422222));
        A00222222.A0E("dpi", (Integer) hashMap.get("dpi"));
        A00222222.A0E("actual_height", (Integer) hashMap.get("actual_height"));
        A00222222.A0E("actual_width", (Integer) hashMap.get("actual_width"));
        A00222222.A0D("pixel_ratio", (Float) hashMap.get("pixel_ratio"));
        A00222222.A0C("logical_height", (Double) hashMap.get("logical_height"));
        A00222222.A0C("logical_width", (Double) hashMap.get("logical_width"));
        A00222222.A0E("cpu_core_count", (Integer) hashMap.get("cpu_core_count"));
        A00222222.A0F("ram_size", (Long) hashMap.get("ram_size"));
        A00222222.A0E("cpu_max_freq", (Integer) hashMap.get("cpu_max_freq"));
        A00222222.A0G("sim_operator", (String) hashMap.get("sim_operator"));
        A00222222.A0G("sim_operator_name", (String) hashMap.get("sim_operator_name"));
        A00222222.A0E("roaming_status", (Integer) hashMap.get("roaming_status"));
        A00222222.A0K((Map) hashMap.get("sim_info"));
        AnonymousClass0WN.A01(this.A03).BcG(A00222222);
    }

    public BRI(Context context, AnonymousClass0C1 r6) {
        this.A00 = context;
        this.A03 = r6;
        this.A01 = new BRG(context);
        Context context2 = this.A00;
        AnonymousClass0C1 r2 = this.A03;
        this.A02 = (AnonymousClass0OZ) r2.AVA(AnonymousClass0OZ.class, new C06850Qq(context2, r2));
    }
}
