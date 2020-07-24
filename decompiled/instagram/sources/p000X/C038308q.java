package p000X;

import android.content.Context;
import com.facebook.common.dextricks.DexStore;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.concurrent.Executor;

/* renamed from: X.08q  reason: invalid class name and case insensitive filesystem */
public final class C038308q {
    public static final C14940m1 A06 = new C14940m1();
    public static final Executor A07 = new C037908m();
    public C08590Xr A00 = null;
    public final Context A01;
    public final File A02;
    public final String A03;
    public final Executor A04;
    public final C038208p[] A05;

    public static void A00(C038308q r5) {
        try {
            for (C038208p A012 : r5.A05) {
                A012.A01(false);
            }
            if (!new File(r5.A02, ".unpacked").createNewFile()) {
                throw new IOException("Could not create .unpacked file");
            }
        } catch (IOException unused) {
        }
    }

    public static void A01(C038308q r2) {
        C08590Xr r0 = r2.A00;
        AnonymousClass0FY.A00(r0);
        r0.close();
        r2.A00 = null;
        A06.A01(r2.A03);
    }

    public static byte[] A02(InputStream inputStream, byte[] bArr, int i) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i2 = 0;
        while (i2 < i) {
            int read = inputStream.read(bArr, 0, Math.min(i - i2, bArr.length));
            if (read == -1) {
                break;
            }
            byteArrayOutputStream.write(bArr, 0, read);
            i2 += read;
        }
        return byteArrayOutputStream.toByteArray();
    }

    public C038308q(C038108o r3) {
        Context context = r3.A00;
        AnonymousClass0FY.A00(context);
        this.A01 = context;
        File file = r3.A01;
        AnonymousClass0FY.A00(file);
        this.A02 = file;
        ArrayList arrayList = r3.A04;
        this.A05 = (C038208p[]) arrayList.toArray(new C038208p[arrayList.size()]);
        this.A04 = r3.A03;
        String str = r3.A02;
        AnonymousClass0FY.A00(str);
        this.A03 = str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x009d, code lost:
        if (r0 == false) goto L_0x009f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0137, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:?, code lost:
        r7.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:?, code lost:
        throw r0;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:100:0x0144 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:91:0x013b */
    public final boolean A03() {
        boolean z;
        char c;
        InputStream A002;
        try {
            AnonymousClass0ZJ.A01(2147483648L, "AppUnpacker.lock", -1244634176);
            try {
                C14940m1 r5 = A06;
                String str = this.A03;
                synchronized (r5) {
                    try {
                        AnonymousClass0m4 r1 = (AnonymousClass0m4) r5.A00.get(str);
                        if (r1 == null) {
                            AnonymousClass0m4 r12 = new AnonymousClass0m4();
                            r12.A01.acquire();
                            r5.A00.put(str, r12);
                        } else {
                            r1.A00++;
                            try {
                                r1.A01.acquire();
                            } catch (InterruptedException | RuntimeException e) {
                                th = e;
                                C14940m1.A00(r5, str);
                                throw th;
                            }
                        }
                    } catch (Throwable th) {
                        while (true) {
                            th = th;
                            break;
                        }
                    }
                }
                boolean z2 = false;
                if (this.A00 == null) {
                    z2 = true;
                }
                AnonymousClass0FY.A02(z2);
                File filesDir = this.A01.getFilesDir();
                if (filesDir == null || !filesDir.exists()) {
                    filesDir = new File("/data/local/tmp");
                }
                File file = new File(filesDir, AnonymousClass000.A0E(this.A03, ".lock"));
                if (!file.exists()) {
                    file.createNewFile();
                }
                this.A00 = new C08590Xr(file);
                AnonymousClass0ZJ.A00(2147483648L, -1211033660);
                AnonymousClass0ZJ.A01(2147483648L, "AppUnpacker.unpack()", -580000483);
                try {
                    byte[] bArr = new byte[DexStore.LOAD_RESULT_DEX2OAT_CLASSPATH_SET];
                    File file2 = new File(this.A02, ".unpacked");
                    int i = 0;
                    if (this.A02.exists()) {
                        boolean exists = file2.exists();
                        z = false;
                    }
                    z = true;
                    while (true) {
                        C038208p[] r13 = this.A05;
                        if (i >= r13.length || z) {
                            char c2 = 0;
                        } else {
                            z = r13[i].A02(this.A01, bArr);
                            i++;
                        }
                    }
                    char c22 = 0;
                    if (!z) {
                        c = 0;
                    } else {
                        try {
                            AnonymousClass0Y5.A01(this.A02);
                            if (this.A02.mkdirs()) {
                                for (C038208p r14 : this.A05) {
                                    A002 = r14.A00(this.A01);
                                    File file3 = r14.A00;
                                    AnonymousClass0FY.A00(file3);
                                    FileOutputStream fileOutputStream = new FileOutputStream(file3);
                                    int i2 = 0;
                                    while (i2 < Integer.MAX_VALUE) {
                                        int read = A002.read(bArr, 0, Math.min(Integer.MAX_VALUE - i2, DexStore.LOAD_RESULT_DEX2OAT_CLASSPATH_SET));
                                        if (read != -1) {
                                            fileOutputStream.write(bArr, 0, read);
                                            i2 += read;
                                        }
                                    }
                                    fileOutputStream.close();
                                    if (A002 != null) {
                                        A002.close();
                                    }
                                }
                                Executor executor = this.A04;
                                if (executor != null) {
                                    AnonymousClass0Z9.A03(executor, new C038008n(this), 191822118);
                                } else {
                                    A00(this);
                                    c22 = 2;
                                }
                                c = c22 | 1;
                                if (c == 0) {
                                    AnonymousClass0Y5.A01(this.A02);
                                }
                            } else {
                                throw new IOException("Could not create the destination directory");
                            }
                        } catch (Throwable th2) {
                            AnonymousClass0Y5.A01(this.A02);
                            throw th2;
                        }
                    }
                    AnonymousClass0ZJ.A00(2147483648L, 718890688);
                    char c3 = c & 1;
                    if (c3 == 0 || (c & 2) != 0) {
                        A01(this);
                    }
                    if (c3 != 0) {
                        return true;
                    }
                    return false;
                    try {
                    } catch (Throwable th3) {
                        if (A002 != null) {
                            A002.close();
                        }
                        throw th3;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    AnonymousClass0ZJ.A00(2147483648L, 1725735239);
                    A01(this);
                    throw th;
                }
            } catch (Throwable th5) {
                th = th5;
                AnonymousClass0ZJ.A00(2147483648L, -702398667);
                throw th;
            }
        } catch (IOException | InterruptedException e2) {
            throw new RuntimeException(e2);
        }
    }
}
