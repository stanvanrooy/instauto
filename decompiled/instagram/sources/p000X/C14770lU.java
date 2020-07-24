package p000X;

import android.content.Context;
import java.io.File;
import java.io.IOException;
import java.util.Map;

/* renamed from: X.0lU  reason: invalid class name and case insensitive filesystem */
public final class C14770lU {
    public Context A00;
    public C14660lI A01;
    public C14670lJ A02;
    public C14700lM A03;
    public C14580l9 A04;
    public C14720lO A05;
    public final C14750lS A06;
    public final C14730lP A07;

    public static boolean A00(C14770lU r5, File file, C14910lx r7) {
        if (r7.A01.A01 > 0 && file.length() != ((long) r7.A01.A01)) {
            return false;
        }
        return r5.A06.A00(file, new C209268zo(new C209318zt()));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00a1, code lost:
        if (r8 == null) goto L_0x00a3;
     */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0092 A[SYNTHETIC, Splitter:B:25:0x0092] */
    public final File A01(int i, String str, String str2) {
        File file;
        C209138za r7;
        String str3;
        Object[] objArr;
        String str4;
        String str5 = str2;
        String str6 = str;
        if (this.A04.A01.A07("developer_resources_on")) {
            C14660lI r0 = this.A01;
            String str7 = File.separator;
            file = new File(r0.A01, AnonymousClass000.A0Q("developer", str7, "resources", str7, str5, "_", str6));
            if (!file.isFile()) {
                file = null;
            }
            if (file == null) {
                Context context = this.A00;
                synchronized (C209138za.class) {
                    if (C209138za.A02 == null) {
                        C209138za.A02 = new C209138za(context);
                    }
                    r7 = C209138za.A02;
                }
                C209308zs r11 = r7.A01;
                file = null;
                if (r11 != null) {
                    Map map = (Map) r11.A00.get(str6);
                    String str8 = null;
                    if (map == null) {
                        str3 = "OnDemandDeveloperResourceFetcher";
                        objArr = new Object[]{str, r11.A00.toString()};
                        str4 = "Resource %s is missing in the manifest: %s";
                    } else {
                        String str9 = (String) map.get(str5);
                        if (str9 == null) {
                            str3 = "OnDemandDeveloperResourceFetcher";
                            objArr = new Object[]{str, str2, r11.A00.toString()};
                            str4 = "Resource %s with flavor %s is missing in the manifest: %s";
                        } else {
                            str8 = str9;
                            if (str8 != null) {
                                try {
                                    file = C209138za.A00(r7, str8);
                                } catch (C46061z4 e) {
                                    throw new AssertionError(e);
                                }
                            }
                        }
                    }
                    AnonymousClass0DB.A0K(str3, str4, objArr);
                    if (str8 != null) {
                    }
                }
            }
        }
        file = null;
        if (file == null) {
            try {
                file = new File(C14660lI.A00(this.A01, i), AnonymousClass000.A0J(str5, "__DELIM__", str6));
                if (!file.isFile() || file.length() <= 0) {
                    return null;
                }
            } catch (IOException unused) {
            }
        }
        return file;
    }

    public C14770lU(Context context, C14660lI r2, C14580l9 r3, C14670lJ r4, C14700lM r5, C14720lO r6, C14730lP r7, C14750lS r8) {
        this.A00 = context;
        this.A01 = r2;
        this.A04 = r3;
        this.A02 = r4;
        this.A03 = r5;
        this.A05 = r6;
        this.A07 = r7;
        this.A06 = r8;
    }
}
