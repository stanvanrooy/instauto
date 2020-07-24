package p000X;

import android.content.Context;
import java.io.File;
import java.util.BitSet;
import java.util.Set;
import java.util.regex.Matcher;

/* renamed from: X.0Zh  reason: invalid class name and case insensitive filesystem */
public final class C08930Zh {
    public boolean A00 = false;
    public final Context A01;
    public final C14590lB A02;
    public final C08860Za A03;

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00a4, code lost:
        if (r12 == false) goto L_0x00a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00a8, code lost:
        if (r0 == false) goto L_0x00ab;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0122, code lost:
        if (r31.contains(r10.A01) == false) goto L_0x0124;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0044, code lost:
        if (r14.groupCount() != 2) goto L_0x0046;
     */
    public static void A00(C08930Zh r31, Set set, Set set2) {
        Boolean bool;
        boolean z;
        String str;
        boolean z2;
        Integer num;
        String A022;
        File[] listFiles;
        boolean z3;
        String A023;
        C08930Zh r9 = r31;
        C08960Zk.A00(r9.A01);
        C08900Ze A002 = C08900Ze.A00();
        BitSet bitSet = new BitSet(13);
        BitSet bitSet2 = new BitSet(13);
        AnonymousClass0ZZ r10 = new AnonymousClass0ZZ(r9.A03);
        File file = r9.A03.A00;
        String[] list = file.list();
        Set set3 = set2;
        if (list != null) {
            for (String str2 : list) {
                Matcher matcher = r10.A04.matcher(str2);
                boolean z4 = false;
                if (matcher.find()) {
                    z = true;
                }
                z = false;
                r10.A03 = z;
                String str3 = null;
                if (z) {
                    str = matcher.group(1);
                } else {
                    str = null;
                }
                r10.A01 = str;
                if (r10.A03) {
                    str3 = matcher.group(2);
                }
                r10.A00 = str3;
                if (str2.equals("installed") || str2.equals("usage_log")) {
                    z4 = true;
                }
                r10.A02 = z4;
                if (!set.contains(r10.A01)) {
                    if (!r10.A02) {
                        boolean z5 = r10.A03;
                        if (z5) {
                            if (!"0".equals(r10.A00)) {
                                boolean z6 = false;
                                if (z5 && (A023 = C08900Ze.A00().A02(r10.A01)) != null && A023.equals(r10.A00)) {
                                    z6 = true;
                                }
                            }
                        }
                        z3 = true;
                        z2 = false;
                    }
                    z3 = false;
                    z2 = false;
                }
                z2 = true;
                if (z2) {
                    File file2 = new File(file, str2);
                    if (file2.isDirectory() && (listFiles = file2.listFiles()) != null) {
                        for (File A003 : listFiles) {
                            C08860Za.A00(A003);
                        }
                    }
                    file2.delete();
                }
                int A004 = C09050Zv.A00(r10.A01);
                if (A004 >= 0) {
                    bitSet2.set(A004);
                }
                boolean z7 = false;
                if (r10.A03 && (A022 = C08900Ze.A00().A02(r10.A01)) != null && A022.equals(r10.A00)) {
                    z7 = true;
                }
                if (z7) {
                    File file3 = new File(r9.A03.A02(r10.A01, r10.A00), "download.zip");
                    if (set3.contains(r10.A01)) {
                        file3.delete();
                    }
                    if (!z2) {
                        if (!file3.exists()) {
                        }
                        num = Constants.A0C;
                        C08900Ze.A00().A04(r10.A01, num);
                        bitSet.set(A004);
                    }
                    num = Constants.A0N;
                    C08900Ze.A00().A04(r10.A01, num);
                    bitSet.set(A004);
                }
            }
        }
        C14610lD A005 = r9.A02.A00("AppModules::PrevDownload");
        boolean A07 = A005.A07("key::PrevDownloadInit");
        C22450yR A05 = A005.A05();
        C14610lD A006 = r9.A02.A00("AppModules::Uninstall");
        C22450yR A052 = r9.A02.A00("AppModules::InitialInstallRequestTimestamp").A05();
        C22450yR.A02(A052);
        A052.A01 = true;
        A052.A04();
        C22450yR A053 = r9.A02.A00("AppModules::InitialInstallRequestTs").A05();
        C22450yR.A02(A053);
        A053.A01 = true;
        A053.A04();
        C22450yR A054 = r9.A02.A00("AppModules::InstallLatency").A05();
        C22450yR.A02(A054);
        A054.A01 = true;
        A054.A04();
        C14610lD A007 = r9.A02.A00("AppModules::InitialInstallRequestTs-1");
        C22450yR A055 = A007.A05();
        C14610lD A008 = r9.A02.A00("AppModules::InstallLatency-1");
        C22450yR A056 = A008.A05();
        long currentTimeMillis = System.currentTimeMillis();
        int i = 0;
        boolean z8 = false;
        boolean z9 = false;
        boolean z10 = false;
        for (int i2 = 13; i < i2; i2 = 13) {
            String A024 = AnonymousClass0ZV.A02(i);
            Integer num2 = Constants.A0N;
            if (!bitSet.get(i)) {
                if (C09000Zp.A01(A024, r9.A01)) {
                    num2 = Constants.A0C;
                }
                A002.A03(i, num2);
            }
            Boolean bool2 = null;
            if (A005.A06(A024)) {
                bool = Boolean.valueOf(A005.A07(A024));
            } else {
                bool = null;
            }
            boolean z11 = bitSet2.get(i);
            if (z11 && bool == null && A07) {
                AnonymousClass0DB.A0K("BackgroundInitializer", "Module %s has download but prev download pref not set (hasPref=%b)", A024, false);
            }
            if (set.contains(A024) || A006.A07(A024)) {
                bool2 = false;
            } else if (z11) {
                bool2 = true;
            }
            if (bool2 != null && !bool2.equals(bool)) {
                A05.A0B(A024, bool2.booleanValue());
                z10 = true;
            }
            if (set.contains(A024) || (!bitSet.get(i) && !set3.contains(A024) && A008.A06(A024))) {
                A055.A07(A024);
                A056.A07(A024);
                z8 = true;
                z9 = true;
            }
            if (num2 == Constants.A0C && !A008.A06(A024) && A007.A06(A024)) {
                A056.A09(A024, currentTimeMillis - A007.A04(A024, 0));
                z9 = true;
            }
            i++;
        }
        if (z8) {
            A055.A04();
        }
        if (z9) {
            A056.A04();
        }
        if (!A07) {
            z10 = true;
            A05.A0B("key::PrevDownloadInit", true);
        }
        if (z10) {
            A05.A05();
        }
    }

    public C08930Zh(Context context, C14590lB r3, C08860Za r4) {
        this.A01 = context;
        this.A02 = r3;
        this.A03 = r4;
    }
}
