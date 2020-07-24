package p000X;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;

/* renamed from: X.0Ez  reason: invalid class name and case insensitive filesystem */
public final class C04700Ez {
    public static String A06;
    public static final Object A07 = new Object();
    public static final File[] A08 = new File[0];
    public final AnonymousClass0PP A00;
    public final C09110ad A01;
    public final AnonymousClass0FG A02;
    public final File A03;
    public final File A04;
    public final List A05 = new ArrayList();

    public C04700Ez(AnonymousClass0FG r4, AnonymousClass0PP r5) {
        C09110ad r1 = new C09110ad();
        this.A02 = r4;
        File file = r4.A03;
        this.A03 = file;
        this.A00 = r5;
        this.A01 = r1;
        File file2 = new File(file, "reports");
        this.A04 = file2;
        file2.mkdirs();
    }

    public static final void A00(File file, String str) {
        synchronized (A07) {
            try {
                new File(file, AnonymousClass000.A0E(str, "_done")).createNewFile();
            } catch (IOException unused) {
                AnonymousClass0DB.A0D("lacrima", "Marking session dir failed");
            }
        }
    }

    public static final boolean A01(File file, String str) {
        boolean exists;
        synchronized (A07) {
            exists = new File(file, AnonymousClass000.A0E(str, "_done")).exists();
        }
        return exists;
    }

    public final void A02(File file, File file2, C04440Dz r6) {
        AnonymousClass0ZL.A01("maybeAssembleReport", 287959939);
        try {
            synchronized (A07) {
                this.A05.size();
                for (C09120ae r0 : this.A05) {
                    file.getName();
                    if (file2 != null) {
                        file2.getName();
                    }
                    r0.A03(file, file2, r6);
                }
                A00(file, "mixers");
            }
            AnonymousClass0ZL.A00(1950764700);
        } catch (Throwable th) {
            AnonymousClass0ZL.A00(246084004);
            throw th;
        }
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: CFG modification limit reached, blocks count: 183 */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0061, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:28:0x0065 */
    public final void A03(List list, File file, String str, Properties properties) {
        Properties properties2;
        String str2;
        int i;
        AnonymousClass0ZL.A01("combineIntoReport", -1815913878);
        try {
            synchronized (A07) {
                AnonymousClass0ZL.A01("combineIntoProperties", 503076004);
                try {
                    synchronized (A07) {
                        file.getName();
                        Collections.sort(list, new C04650Eu(this));
                        properties2 = new Properties();
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            File file2 = (File) it.next();
                            AnonymousClass0ZL.A01(AnonymousClass000.A0E("include property file: ", file2.getName()), 1787531086);
                            Properties properties3 = new Properties();
                            try {
                                FileInputStream fileInputStream = new FileInputStream(file2);
                                properties3.load(fileInputStream);
                                properties2.putAll(properties3);
                                fileInputStream.close();
                                i = -1724052707;
                            } catch (IOException e) {
                                try {
                                    AnonymousClass0DB.A0J("lacrima", "Could not read property file %s", file2.getName(), e);
                                    i = 849070141;
                                } catch (Throwable th) {
                                    AnonymousClass0ZL.A00(122672681);
                                    throw th;
                                }
                            } catch (Throwable ) {
                                throw th;
                            }
                            AnonymousClass0ZL.A00(i);
                        }
                    }
                    AnonymousClass0ZL.A00(30630565);
                    if (properties != null) {
                        properties2.put("report_id", file.getName());
                        properties2.putAll(properties);
                    }
                    File file3 = new File(file, str);
                    try {
                        AnonymousClass0PP r1 = this.A00;
                        if (str.startsWith(C04440Dz.CRITICAL_REPORT.A00) || str.contains(C04540Ej.A00(Constants.A0j))) {
                            str2 = "reports";
                        } else {
                            str2 = null;
                        }
                        r1.A01(file3, properties2, str2);
                    } catch (IOException e2) {
                        AnonymousClass0DB.A0J("lacrima", "Assembling report failed: %s %s", file.getName(), str, e2);
                    }
                } catch (Throwable th2) {
                    AnonymousClass0ZL.A00(-1639448444);
                    throw th2;
                }
            }
        } finally {
            AnonymousClass0ZL.A00(1919660171);
        }
    }
}
