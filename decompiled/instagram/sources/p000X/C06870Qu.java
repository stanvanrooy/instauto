package p000X;

import com.instagram.react.modules.base.IgReactAnalyticsModule;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: X.0Qu  reason: invalid class name and case insensitive filesystem */
public final class C06870Qu implements AnonymousClass0VM {
    public final AnonymousClass0RQ A00;
    public final String A01 = AnonymousClass000.A0J("567067343352427", "|", "f249176f09e26ce54212b472dbab8fa8");
    public final String A02;
    public final StringBuilder A03;
    public final AnonymousClass0S4 A04;
    public final AnonymousClass0RY A05;
    public final File A06;

    public C06870Qu(String str, File file, AnonymousClass0S4 r6, AnonymousClass0RY r7, AnonymousClass0RQ r8) {
        this.A02 = str;
        this.A06 = file;
        this.A03 = new StringBuilder();
        this.A05 = r7;
        this.A04 = r6;
        this.A00 = r8;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:50:0x009c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x009d, code lost:
        if (r3 != null) goto L_0x009f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:54:0x00a2 */
    public final boolean BtW() {
        String str;
        if (this.A06.exists()) {
            File[] listFiles = this.A06.listFiles();
            if (listFiles != null) {
                int i = 0;
                while (true) {
                    int length = listFiles.length;
                    if (i >= length) {
                        break;
                    }
                    String name = listFiles[i].getName();
                    if (!name.endsWith(".pending") && !name.endsWith(".recovery") && !name.endsWith(".enc")) {
                        if (listFiles[i].length() == 0) {
                            listFiles[i].delete();
                        } else {
                            C33861dc BtX = BtX(listFiles[i]);
                            if (BtX == null) {
                                return false;
                            }
                            if (this.A05 != null && BtX.A01 == 200) {
                                try {
                                    AnonymousClass1CA r3 = BtX.A00;
                                    InputStream inputStream = null;
                                    if (r3 != null) {
                                        if (r3.AHT() != null) {
                                            inputStream = r3.AHT();
                                        }
                                    }
                                    AnonymousClass0RY r1 = this.A05;
                                    boolean z = false;
                                    if (i == length - 1) {
                                        z = true;
                                    }
                                    r1.BMc(inputStream, z);
                                    if (r3 != null) {
                                        r3.close();
                                    }
                                } catch (IOException e) {
                                    AnonymousClass0DB.A0G("AnalyticsUploaderImpl", "Exception while parsing sampling config", e);
                                } catch (Throwable ) {
                                    throw th;
                                }
                            }
                        }
                    }
                    i++;
                }
            } else {
                if (!this.A06.exists()) {
                    str = "directory_not_found";
                } else if (this.A06.isFile()) {
                    str = "directory_is_file";
                } else {
                    str = "directory_unknown_error";
                }
                AnonymousClass0QD.A01("analytics_uploader", str);
            }
        }
        return true;
    }

    public final C33861dc BtX(File file) {
        C35071fl A002;
        AnonymousClass0S4 r2 = this.A04;
        AnonymousClass0RQ r0 = this.A00;
        String name = file.getName();
        if (r0.A0G && (A002 = AnonymousClass0S4.A00(name)) != null) {
            r2.A00.A5H(A002, (long) name.hashCode(), "upload_start");
        }
        C33861dc r5 = null;
        try {
            AnonymousClass1C4 A012 = C07100Rt.A01(file, this.A01, this.A02, this.A00.A0D, this.A03);
            Integer num = Constants.ZERO;
            C255919l r1 = new C255919l();
            r1.A03 = C15920nk.Analytics;
            r1.A08 = IgReactAnalyticsModule.MODULE_NAME;
            r1.A05 = num;
            try {
                r5 = AnonymousClass1C8.A00().A01(new AnonymousClass1C3(A012, r1.A00()), (C44061vX) null);
            } catch (IOException unused) {
            }
        } catch (IOException e) {
            AnonymousClass0QD.A09("AnalyticsUploaderImpl", e);
        }
        if (r5 == null || r5.A01 != 200) {
            this.A04.A03(this.A00, file.getName(), false);
            return r5;
        }
        this.A04.A03(this.A00, file.getName(), true);
        if (!file.delete()) {
            AnonymousClass0DB.A0K("AnalyticsUploaderImpl", "File %s was not deleted", file);
        }
        return r5;
    }
}
