package p000X;

import android.content.Context;
import android.os.Build;
import com.facebook.common.dextricks.DexStore;
import com.facebook.common.dextricks.DexStoreUtils;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.LinkedList;
import java.util.zip.ZipFile;

/* renamed from: X.0bW  reason: invalid class name and case insensitive filesystem */
public final class C09500bW extends C09020Zs {
    public static C09500bW A00;

    public static synchronized C09500bW A00(Context context) {
        C09500bW r0;
        synchronized (C09500bW.class) {
            if (A00 == null) {
                if (context.getApplicationContext() != null) {
                    context = context.getApplicationContext();
                }
                A00 = new C09500bW(context);
            }
            r0 = A00;
        }
        return r0;
    }

    public final void A01(String str, String str2, File file, File file2) {
        RuntimeException runtimeException;
        Class<AnonymousClass0YI> cls;
        Class<AnonymousClass0YI> cls2;
        RuntimeException runtimeException2;
        DexStore findOpened = DexStore.findOpened(new File(this.A01.A02(str, str2), DexStoreUtils.MAIN_DEX_STORE_ID));
        if (findOpened != null) {
            int i = 0;
            if (Build.VERSION.SDK_INT >= 26) {
                i = 1;
            }
            findOpened.loadAll(i, C024102g.A00, this.A00);
        }
        File file3 = file;
        File file4 = file2;
        if (file == null || !file.exists()) {
            try {
                InputStream open = this.A00.getAssets().open(AnonymousClass000.A0E(str, "/libs.txt"));
                if (open != null) {
                    open.close();
                    if (C08860Za.A01(this.A00)) {
                        String A0E = AnonymousClass000.A0E(str, "-lib-zstd");
                        String A0J = AnonymousClass000.A0J("assets/", str, "/libs.zstd");
                        String A0J2 = AnonymousClass000.A0J("assets/", str, "/libs.txt");
                        cls = AnonymousClass0YI.class;
                        synchronized (cls) {
                            if (AnonymousClass0YI.A00 == null) {
                                runtimeException = new RuntimeException(AnonymousClass000.A0E("FbSoLoader.init() was not called prior to loading additional asset ", A0E));
                                throw runtimeException;
                            } else if (!AnonymousClass0YI.A01.contains(A0E)) {
                                AnonymousClass0Y1.A07(new AnonymousClass00F(AnonymousClass0YI.A00, file4, A0J, A0J2, Constants.ONE));
                                AnonymousClass0YI.A01.add(A0E);
                            }
                        }
                    } else {
                        String A0E2 = AnonymousClass000.A0E(str, "-lib-xzs");
                        String A0J3 = AnonymousClass000.A0J("assets/", str, "/libs.xzs");
                        String A0J4 = AnonymousClass000.A0J("assets/", str, "/libs.txt");
                        cls = AnonymousClass0YI.class;
                        synchronized (cls) {
                            if (AnonymousClass0YI.A00 == null) {
                                runtimeException = new RuntimeException(AnonymousClass000.A0E("FbSoLoader.init() was not called prior to loading additional asset ", A0E2));
                                throw runtimeException;
                            } else if (!AnonymousClass0YI.A01.contains(A0E2)) {
                                AnonymousClass0Y1.A07(new AnonymousClass00F(AnonymousClass0YI.A00, file4, A0J3, A0J4, Constants.ZERO));
                                AnonymousClass0YI.A01.add(A0E2);
                            }
                        }
                    }
                }
            } catch (FileNotFoundException unused) {
            }
        } else {
            if (C08860Za.A01(this.A00)) {
                String A0E3 = AnonymousClass000.A0E(str, "-lib-zstd");
                String str3 = File.separator;
                String A0O = AnonymousClass000.A0O("assets", str3, str, str3, "libs.zstd");
                String A0O2 = AnonymousClass000.A0O("assets", str3, str, str3, "libs.txt");
                cls2 = AnonymousClass0YI.class;
                synchronized (cls2) {
                    if (AnonymousClass0YI.A00 != null) {
                        if (!AnonymousClass0YI.A01.contains(A0E3)) {
                            AnonymousClass0Y1.A07(new AnonymousClass00F(AnonymousClass0YI.A00, file4, file3, A0O, A0O2, Constants.ONE));
                            AnonymousClass0YI.A01.add(A0E3);
                        }
                        return;
                    }
                    runtimeException2 = new RuntimeException(AnonymousClass000.A0E("FbSoLoader.init() was not called prior to loading additional asset ", A0E3));
                }
            } else {
                String A0E4 = AnonymousClass000.A0E(str, "-lib-xzs");
                String str4 = File.separator;
                String A0O3 = AnonymousClass000.A0O("assets", str4, str, str4, "libs.xzs");
                String A0O4 = AnonymousClass000.A0O("assets", str4, str, str4, "libs.txt");
                cls2 = AnonymousClass0YI.class;
                synchronized (cls2) {
                    if (AnonymousClass0YI.A00 != null) {
                        if (!AnonymousClass0YI.A01.contains(A0E4)) {
                            AnonymousClass0Y1.A07(new AnonymousClass00F(AnonymousClass0YI.A00, file4, file3, A0O3, A0O4, Constants.ZERO));
                            AnonymousClass0YI.A01.add(A0E4);
                        }
                        return;
                    }
                    runtimeException2 = new RuntimeException(AnonymousClass000.A0E("FbSoLoader.init() was not called prior to loading additional asset ", A0E4));
                }
            }
            throw runtimeException2;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000d, code lost:
        if (r12.exists() == false) goto L_0x000f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0074 A[SYNTHETIC, Splitter:B:30:0x0074] */
    public final String[] A02(String str, String str2, File file) {
        boolean z;
        C09480bU r2;
        LinkedList linkedList = new LinkedList();
        if (file != null) {
            z = true;
        }
        z = false;
        File A002 = C09000Zp.A00(str, this.A00);
        if (z) {
            file.getCanonicalPath();
        } else if (!this.A00.getApplicationInfo().sourceDir.equals(A002.getCanonicalPath())) {
            A002.getCanonicalPath();
        }
        if (z) {
            r2 = new C09480bU(this.A00, str, file);
        } else {
            r2 = new C09480bU(this.A00, str);
        }
        String str3 = r2.A01;
        String str4 = File.separator;
        String A0J = AnonymousClass000.A0J(str3, str4, DexStoreUtils.SECONDARY_DEX_MANIFEST);
        ZipFile zipFile = r2.A02;
        boolean z2 = false;
        if (zipFile != null) {
            if (zipFile.getEntry(AnonymousClass000.A0J("assets", str4, A0J)) != null) {
            }
            if (z2) {
                DexStore open = DexStore.open(new File(this.A01.A02(str, str2), DexStoreUtils.MAIN_DEX_STORE_ID), A002, r2);
                open.loadManifest();
                for (String str5 : open.getParentNames()) {
                    if (!str5.equals(DexStoreUtils.MAIN_DEX_STORE_ID)) {
                        linkedList.add(str5);
                    }
                }
            }
            return (String[]) linkedList.toArray(new String[linkedList.size()]);
        }
        try {
            InputStream open2 = r2.A00.getAssets().open(A0J);
            if (open2 != null) {
                try {
                    open2.close();
                } catch (IOException unused) {
                    z2 = true;
                }
            }
        } catch (IOException unused2) {
        }
        if (z2) {
        }
        return (String[]) linkedList.toArray(new String[linkedList.size()]);
        z2 = true;
        if (z2) {
        }
        return (String[]) linkedList.toArray(new String[linkedList.size()]);
    }

    public C09500bW(Context context) {
        super(context, AnonymousClass0ZS.A00(context));
    }
}
