package p000X;

import android.content.Context;
import android.os.Build;
import java.io.File;
import java.util.ArrayDeque;
import java.util.Locale;

/* renamed from: X.0Zt  reason: invalid class name and case insensitive filesystem */
public final class C09030Zt {
    public static C09030Zt A03;
    public final Context A00;
    public final C08860Za A01;
    public final C09020Zs A02;

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0014, code lost:
        if (r2 == p000X.Constants.A0N) goto L_0x0016;
     */
    public final File A00(String str) {
        boolean z;
        String str2 = null;
        if (AnonymousClass0ZT.A00(this.A00)) {
            Integer A012 = AnonymousClass0ZV.A01(str);
            if (A012 != Constants.A0C) {
                z = false;
            }
            z = true;
            if (z) {
                String A013 = A01(str);
                if (A013 == null) {
                    AnonymousClass0DB.A0K("VoltronModuleManager", "Hash not found for module %s", str);
                } else {
                    str2 = A013;
                }
            }
        }
        if (str2 == null) {
            return null;
        }
        C08860Za r4 = this.A01;
        Context context = this.A00;
        if (C09000Zp.A01(str, context)) {
            return C09000Zp.A00(str, context);
        }
        return new File(r4.A02(str, str2), "download.zip");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0020, code lost:
        if (r4 >= 13) goto L_0x0022;
     */
    public final synchronized void A02(String str, boolean z) {
        boolean z2;
        C09040Zu r1;
        String str2;
        String str3;
        String str4;
        int A002 = C09050Zv.A00(str);
        if (A002 == -3) {
            AnonymousClass0DB.A0F("AppModuleIndexUtil", String.format(Locale.US, "Checking for valid module for %s", new Object[]{str}));
        }
        if (A002 >= 0) {
            z2 = true;
        }
        z2 = false;
        if (z2) {
            try {
                File A003 = A00(str);
                if (!AnonymousClass0ZT.A00(this.A00) || ((z && AnonymousClass0ZU.A00(AnonymousClass0ZV.A01(str))) || ((A003 != null && A003.exists()) || C09000Zp.A01(str, this.A00)))) {
                    ArrayDeque arrayDeque = new ArrayDeque();
                    arrayDeque.addLast(str);
                    while (arrayDeque.size() > 0) {
                        String str5 = (String) arrayDeque.removeFirst();
                        if (!C08900Ze.A00().A05(str5)) {
                            File A004 = A00(str5);
                            if (!AnonymousClass0ZT.A00(this.A00) || AnonymousClass0ZU.A00(AnonymousClass0ZV.A01(str5)) || ((A004 != null && A004.exists()) || C09000Zp.A01(str5, this.A00))) {
                                String[] A022 = this.A02.A02(str5, A01(str5), A004);
                                for (String addLast : A022) {
                                    arrayDeque.addLast(addLast);
                                }
                            } else {
                                if (A004 != null) {
                                    str3 = A004.getCanonicalPath();
                                } else {
                                    str3 = "";
                                }
                                r1 = new C09040Zu(str5, str3);
                            }
                        }
                    }
                    if (!C08900Ze.A00().A05(str)) {
                        C09020Zs r7 = this.A02;
                        String A012 = A01(str);
                        String A013 = A01(str);
                        C08860Za r12 = this.A01;
                        Context context = this.A00;
                        File A023 = r12.A02(str, A013);
                        if (C08860Za.A01(context)) {
                            str2 = "lib-zstd";
                        } else {
                            str2 = "lib-xzs";
                        }
                        r7.A01(str, A012, A003, new File(A023, AnonymousClass000.A0J(str2, File.separator, Build.CPU_ABI)));
                    }
                    C08900Ze A005 = C08900Ze.A00();
                    int A006 = C09050Zv.A00(str);
                    synchronized (A005) {
                        try {
                            if (C09050Zv.A02(A006)) {
                                A005.A02.set(A006);
                                if (AnonymousClass0DB.A0S()) {
                                    C09050Zv.A01(A006);
                                }
                            }
                        } catch (Throwable th) {
                            th = th;
                            throw th;
                        }
                    }
                } else {
                    if (A003 != null) {
                        str4 = A003.getCanonicalPath();
                    } else {
                        str4 = "";
                    }
                    r1 = new C09040Zu(str, str4);
                }
                throw r1;
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        }
    }

    public C09030Zt(Context context, C09020Zs r2, C08860Za r3) {
        this.A00 = context;
        this.A02 = r2;
        this.A01 = r3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000b, code lost:
        if (r2 == p000X.Constants.A0N) goto L_0x000d;
     */
    public final String A01(String str) {
        boolean z;
        Integer A012 = AnonymousClass0ZV.A01(str);
        if (A012 != Constants.A0C) {
            z = false;
        }
        z = true;
        if (!z) {
            return null;
        }
        C08960Zk.A00(this.A00);
        return C08900Ze.A00().A02(str);
    }
}
