package p000X;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Properties;

/* renamed from: X.0ae  reason: invalid class name and case insensitive filesystem */
public abstract class C09120ae {
    public final C04700Ez A00;

    public abstract Integer A00();

    public abstract Integer A01();

    public abstract Properties A02(C04440Dz r1);

    public void A03(File file, File file2, C04440Dz r21) {
        File[] listFiles;
        File[] listFiles2;
        File[] listFiles3;
        File file3 = file;
        File file4 = file3;
        if (A00() == Constants.ZERO) {
            file4 = file2;
        }
        if (file4 != null && file != null) {
            C04700Ez r4 = this.A00;
            Integer A01 = A01();
            C04440Dz r6 = r21;
            synchronized (C04700Ez.A07) {
                try {
                    listFiles = file3.listFiles(new C04660Ev(r4, r6, A01));
                    if (listFiles == null) {
                        listFiles = C04700Ez.A08;
                    }
                } catch (Throwable th) {
                    while (true) {
                        th = th;
                    }
                }
            }
            if (listFiles != null && (r3 = listFiles.length) != 0) {
                for (File file5 : listFiles) {
                    if (!C04700Ez.A01(file3, file5.getName())) {
                        file5.getName();
                        String name = file5.getName();
                        if (C04700Ez.A06 == null) {
                            C04700Ez.A06 = C04400Dv.A00();
                        }
                        File file6 = new File(this.A00.A04, AnonymousClass000.A0E(name.replace("_prop.txt", "_"), C04700Ez.A06));
                        file6.mkdirs();
                        C04700Ez r12 = this.A00;
                        synchronized (C04700Ez.A07) {
                            try {
                                listFiles2 = file4.listFiles(new C04680Ex(r12, r6));
                                if (listFiles2 == null) {
                                    listFiles2 = C04700Ez.A08;
                                }
                            } catch (Throwable th2) {
                                while (true) {
                                    th = th2;
                                    break;
                                }
                            }
                        }
                        Properties A02 = A02(r6);
                        A02.put("report_build_id", Integer.toString(227299068));
                        ArrayList arrayList = new ArrayList(Arrays.asList(listFiles2));
                        if (!arrayList.contains(file5)) {
                            arrayList.add(file5);
                        }
                        C04700Ez r122 = this.A00;
                        synchronized (C04700Ez.A07) {
                            try {
                                listFiles3 = file3.listFiles(new C04690Ey(r122, r6));
                                if (listFiles3 == null) {
                                    listFiles3 = C04700Ez.A08;
                                }
                            } catch (Throwable th3) {
                                while (true) {
                                    th = th3;
                                    break;
                                }
                            }
                        }
                        ArrayList arrayList2 = new ArrayList();
                        for (File file7 : listFiles3) {
                            if (!C04700Ez.A01(file3, file7.getName())) {
                                arrayList2.add(file7);
                            }
                        }
                        if (!arrayList2.isEmpty()) {
                            this.A00.A03(arrayList2, file6, AnonymousClass000.A0E(r6.A00, AnonymousClass000.A0E(C04540Ej.A00(A01()), "_attach.txt")), (Properties) null);
                        }
                        arrayList.addAll(arrayList2);
                        this.A00.A03(arrayList, file6, AnonymousClass000.A0E(r6.A00, AnonymousClass000.A0E(C04540Ej.A00(A01()), "_report.txt")), A02);
                        C04700Ez.A00(file3, file5.getName());
                        C04700Ez.A00(file3, file5.getName().replace("_prop.txt", "_attach.txt"));
                    }
                }
                return;
            }
            return;
        }
        return;
        throw th;
    }

    public C09120ae(C04700Ez r1) {
        this.A00 = r1;
    }
}
