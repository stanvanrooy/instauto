package com.facebook.http.historical;

import android.os.SystemClock;
import android.util.LruCache;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.regex.PatternSyntaxException;
import p000X.C209378zz;
import p000X.C25943Bcv;
import p000X.C25944Bcw;

public final class NetworkInfoMap {
    public static final NetworkInfoMap A07 = new NetworkInfoMap();
    public long A00;
    public C209378zz A01 = null;
    public C25943Bcv A02;
    public String A03;
    public boolean A04;
    public final LruCache A05;
    public final C25944Bcw A06;

    public final synchronized List A01() {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (Map.Entry value : this.A05.snapshot().entrySet()) {
            arrayList.add(((C25943Bcv) value.getValue()).toString());
        }
        return arrayList;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x006f, code lost:
        if ((android.os.SystemClock.elapsedRealtime() - r6) >= 120000) goto L_0x0071;
     */
    public final synchronized void A02(String str) {
        String str2;
        boolean z;
        C209378zz r1;
        if (str != null) {
            str2 = str.replace("=", "-").replace("\n", "-").replace(",", "-");
        } else {
            str2 = null;
        }
        if (str2 != null) {
            String str3 = this.A03;
            if (!str2.equals(str3)) {
                if (!(str3 == null || (r1 = this.A01) == null)) {
                    r1.A00(A01());
                    this.A00 = SystemClock.elapsedRealtime();
                }
                this.A03 = str2;
                C25943Bcv bcv = (C25943Bcv) this.A05.get(str2);
                this.A02 = bcv;
                if (bcv == null) {
                    String str4 = this.A03;
                    C25943Bcv bcv2 = new C25943Bcv(str4, -1, -1, -1, -1);
                    this.A02 = bcv2;
                    this.A05.put(str4, bcv2);
                }
                long j = this.A02.A02;
                if (j != -1) {
                    z = false;
                }
                z = true;
                this.A04 = z;
            }
        }
    }

    public NetworkInfoMap() {
        C25944Bcw bcw = new C25944Bcw();
        this.A06 = bcw;
        this.A05 = new LruCache(20);
        this.A00 = 0;
        this.A04 = false;
        if (this.A01 != null) {
            A00(this);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0042, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0049, code lost:
        r3 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0128, code lost:
        if ((android.os.SystemClock.elapsedRealtime() - r7) >= 120000) goto L_0x012a;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0042 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:1:0x0010] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0045 A[SYNTHETIC, Splitter:B:20:0x0045] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x004c A[SYNTHETIC, Splitter:B:28:0x004c] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00f1  */
    /* JADX WARNING: Removed duplicated region for block: B:90:? A[RETURN, SYNTHETIC] */
    public static void A00(NetworkInfoMap networkInfoMap) {
        ArrayList<String> arrayList;
        String str;
        boolean z;
        C25943Bcv bcv;
        NetworkInfoMap networkInfoMap2 = networkInfoMap;
        networkInfoMap2.A05.evictAll();
        networkInfoMap2.A00 = SystemClock.elapsedRealtime();
        C209378zz r1 = networkInfoMap2.A01;
        BufferedReader bufferedReader = null;
        try {
            File file = new File(r1.A00, r1.A01);
            if (!file.exists()) {
                arrayList = null;
            } else {
                arrayList = new ArrayList<>();
                BufferedReader bufferedReader2 = new BufferedReader(new FileReader(file));
                while (true) {
                    try {
                        String readLine = bufferedReader2.readLine();
                        if (readLine != null) {
                            arrayList.add(readLine);
                        } else {
                            try {
                                break;
                            } catch (IOException unused) {
                            }
                        }
                    } catch (IOException | NullPointerException | SecurityException unused2) {
                        bufferedReader = bufferedReader2;
                        if (bufferedReader != null) {
                            bufferedReader.close();
                        }
                        if (arrayList != null) {
                        }
                        str = networkInfoMap2.A03;
                        if (str == null) {
                        }
                    } catch (Throwable th) {
                        th = th;
                        bufferedReader = bufferedReader2;
                        if (bufferedReader != null) {
                            try {
                                bufferedReader.close();
                            } catch (IOException unused3) {
                            }
                        }
                        throw th;
                    }
                }
                bufferedReader2.close();
            }
        } catch (IOException | NullPointerException | SecurityException unused4) {
            if (bufferedReader != null) {
            }
            if (arrayList != null) {
            }
            str = networkInfoMap2.A03;
            if (str == null) {
            }
        } catch (Throwable th2) {
        }
        if (arrayList != null) {
            for (String str2 : arrayList) {
                String str3 = str2;
                if (str2 == null || str2.isEmpty()) {
                    bcv = null;
                } else {
                    try {
                        long j = -1;
                        long j2 = -1;
                        long j3 = -1;
                        long j4 = -1;
                        String str4 = null;
                        for (String str5 : str3.split(",")) {
                            if (str5.startsWith("id=")) {
                                str4 = str5.substring(3);
                            } else if (str5.startsWith("bw=")) {
                                j = Long.parseLong(str5.substring(3));
                            } else if (str5.startsWith("ttfb=")) {
                                j2 = Long.parseLong(str5.substring(5));
                            } else if (str5.startsWith("ts=")) {
                                j3 = Long.parseLong(str5.substring(3));
                            } else if (str5.startsWith("bwt=")) {
                                j4 = Long.parseLong(str5.substring(4));
                            }
                        }
                        if (str4 != null) {
                            bcv = new C25943Bcv(str4, j, j2, j3, j4);
                        }
                    } catch (IndexOutOfBoundsException | NumberFormatException | PatternSyntaxException unused5) {
                    }
                    bcv = null;
                }
                if (bcv != null) {
                    networkInfoMap2.A05.put(bcv.A04, bcv);
                }
            }
        }
        str = networkInfoMap2.A03;
        if (str == null) {
            C25943Bcv bcv2 = (C25943Bcv) networkInfoMap2.A05.get(str);
            networkInfoMap2.A02 = bcv2;
            if (bcv2 == null) {
                String str6 = networkInfoMap2.A03;
                C25943Bcv bcv3 = new C25943Bcv(str6, -1, -1, -1, -1);
                networkInfoMap2.A02 = bcv3;
                networkInfoMap2.A05.put(str6, bcv3);
            }
            long j5 = networkInfoMap2.A02.A02;
            if (j5 != -1) {
                z = false;
            }
            z = true;
            networkInfoMap2.A04 = z;
        }
    }
}
