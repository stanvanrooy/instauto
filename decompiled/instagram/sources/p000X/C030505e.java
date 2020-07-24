package p000X;

import android.content.Context;
import android.os.Parcel;
import android.os.StrictMode;
import android.util.Log;
import com.facebook.common.dextricks.DexStore;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.05e  reason: invalid class name and case insensitive filesystem */
public abstract class C030505e extends C09900cI {
    public String A00;
    public String[] A01;
    public final Map A02 = new HashMap();
    public final Context A03;

    public abstract AnonymousClass0YC A0A();

    public static Object A00(C030505e r3, String str) {
        Object obj;
        synchronized (r3.A02) {
            obj = r3.A02.get(str);
            if (obj == null) {
                obj = new Object();
                r3.A02.put(str, obj);
            }
        }
        return obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0028, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0024, code lost:
        r0 = move-exception;
     */
    public static void A01(File file, byte b) {
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
        randomAccessFile.seek(0);
        randomAccessFile.write(b);
        randomAccessFile.setLength(randomAccessFile.getFilePointer());
        randomAccessFile.getFD().sync();
        randomAccessFile.close();
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:128|(2:130|131)|132|133) */
    /* JADX WARNING: Can't wrap try/catch for region: R(4:169|(2:171|172)|173|174) */
    /* JADX WARNING: Can't wrap try/catch for region: R(4:178|(2:180|181)|182|183) */
    /* JADX WARNING: Can't wrap try/catch for region: R(5:161|162|163|164|165) */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x004f, code lost:
        if (r3 != 1) goto L_0x0051;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x02b6, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:?, code lost:
        throw r0;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:132:0x0233 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:164:0x029a */
    /* JADX WARNING: Missing exception handler attribute for start block: B:173:0x02a3 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:182:0x02ac */
    /* JADX WARNING: Missing exception handler attribute for start block: B:196:0x02ba */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x01b7 A[Catch:{ IOException -> 0x020b, all -> 0x0210 }] */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x01c8 A[Catch:{ IOException -> 0x020b, all -> 0x0210 }] */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x01ea A[SYNTHETIC, Splitter:B:108:0x01ea] */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x01f4 A[SYNTHETIC, Splitter:B:113:0x01f4] */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x027d A[SYNTHETIC, Splitter:B:155:0x027d] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00ea A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00fb A[Catch:{ all -> 0x0233 }] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:139:0x023c=Splitter:B:139:0x023c, B:182:0x02ac=Splitter:B:182:0x02ac} */
    public final void A03(int i) {
        C08590Xr r0;
        byte[] A0B;
        File file;
        RandomAccessFile randomAccessFile;
        byte b;
        AnonymousClass0Y9 r7;
        RandomAccessFile randomAccessFile2;
        boolean z;
        AnonymousClass0YC A0A;
        AnonymousClass0YB A012;
        RandomAccessFile randomAccessFile3;
        AnonymousClass0Y9 r6;
        String[] list;
        AnonymousClass0YA A002;
        IOException th;
        File file2;
        RandomAccessFile randomAccessFile4;
        int available;
        int i2;
        RuntimeException runtimeException;
        File file3 = this.A00;
        if (file3.mkdirs() || file3.isDirectory()) {
            r0 = new C08590Xr(new File(this.A00, "dso_lock"));
            A0B = A0B();
            file = new File(this.A00, "dso_state");
            randomAccessFile = new RandomAccessFile(file, "rw");
            b = randomAccessFile.readByte();
        } else {
            throw new IOException("cannot mkdir: " + file3);
        }
        b = 0;
        try {
            randomAccessFile.close();
            File file4 = new File(this.A00, "dso_deps");
            r7 = null;
            randomAccessFile2 = new RandomAccessFile(file4, "rw");
            int length = (int) randomAccessFile2.length();
            byte[] bArr = new byte[length];
            if (randomAccessFile2.read(bArr) != length) {
                b = 0;
            }
            if (!Arrays.equals(bArr, A0B)) {
                b = 0;
            }
            if (b == 0 || (i & 2) != 0) {
                A01(file, (byte) 0);
                A0A = A0A();
                r7 = A0A.A00();
                A012 = A0A.A01();
                randomAccessFile3 = new RandomAccessFile(new File(this.A00, "dso_manifest"), "rw");
                r6 = null;
                if (b == 1) {
                    try {
                        if (randomAccessFile3.readByte() == 1) {
                            int readInt = randomAccessFile3.readInt();
                            if (readInt >= 0) {
                                AnonymousClass0Y8[] r13 = new AnonymousClass0Y8[readInt];
                                for (int i3 = 0; i3 < readInt; i3++) {
                                    RandomAccessFile randomAccessFile5 = randomAccessFile3;
                                    r13[i3] = new AnonymousClass0Y8(randomAccessFile5.readUTF(), randomAccessFile5.readUTF());
                                }
                                r6 = new AnonymousClass0Y9(r13);
                            } else {
                                runtimeException = new RuntimeException("illegal number of shared libraries");
                            }
                        } else {
                            runtimeException = new RuntimeException("wrong dso manifest version");
                        }
                        throw runtimeException;
                    } catch (Exception unused) {
                    }
                }
                if (r6 == null) {
                    r6 = new AnonymousClass0Y9(new AnonymousClass0Y8[0]);
                }
                AnonymousClass0Y8[] r14 = r7.A00;
                list = this.A00.list();
                if (list == null) {
                    for (String str : list) {
                        if (!str.equals("dso_state") && !str.equals("dso_lock") && !str.equals("dso_deps") && !str.equals("dso_manifest")) {
                            boolean z2 = false;
                            int i4 = 0;
                            while (!z2 && i4 < r14.length) {
                                if (r14[i4].A01.equals(str)) {
                                    z2 = true;
                                }
                                i4++;
                            }
                            if (!z2) {
                                AnonymousClass0Y5.A01(new File(this.A00, str));
                            }
                        }
                    }
                    byte[] bArr2 = new byte[DexStore.LOAD_RESULT_PGO];
                    while (A012.A01()) {
                        A002 = A012.A00();
                        boolean z3 = true;
                        int i5 = 0;
                        while (z3) {
                            AnonymousClass0Y8[] r1 = r6.A00;
                            if (i5 >= r1.length) {
                                break;
                            }
                            AnonymousClass0Y8 r3 = r1[i5];
                            String str2 = r3.A01;
                            AnonymousClass0Y8 r2 = A002.A00;
                            if (str2.equals(r2.A01) && r3.A00.equals(r2.A00)) {
                                z3 = false;
                            }
                            i5++;
                        }
                        if (z3) {
                            if (this.A00.setWritable(true, true)) {
                                file2 = new File(this.A00, A002.A00.A01);
                                try {
                                    randomAccessFile4 = new RandomAccessFile(file2, "rw");
                                } catch (IOException e) {
                                    Log.w("fb-UnpackingSoSource", "error overwriting " + file2 + " trying to delete and start over", e);
                                    AnonymousClass0Y5.A01(file2);
                                    randomAccessFile4 = new RandomAccessFile(file2, "rw");
                                }
                                try {
                                    available = A002.A01.available();
                                    if (available > 1) {
                                        AnonymousClass0Y5.A02(randomAccessFile4.getFD(), (long) available);
                                    }
                                    InputStream inputStream = A002.A01;
                                    i2 = 0;
                                    while (i2 < Integer.MAX_VALUE) {
                                        int read = inputStream.read(bArr2, 0, Math.min(DexStore.LOAD_RESULT_PGO, Integer.MAX_VALUE - i2));
                                        if (read == -1) {
                                            break;
                                        }
                                        randomAccessFile4.write(bArr2, 0, read);
                                        i2 += read;
                                    }
                                    randomAccessFile4.setLength(randomAccessFile4.getFilePointer());
                                    if (!file2.setExecutable(true, false)) {
                                        randomAccessFile4.close();
                                    } else {
                                        throw new IOException("cannot make file executable: " + file2);
                                    }
                                } catch (IOException e2) {
                                    AnonymousClass0Y5.A01(file2);
                                    throw e2;
                                } catch (Throwable th2) {
                                    th = th2;
                                    randomAccessFile4.close();
                                    throw th;
                                }
                            } else {
                                th = new IOException("cannot make directory writable for us: " + this.A00);
                                throw th;
                            }
                        }
                        if (A002 != null) {
                            A002.close();
                        }
                    }
                    randomAccessFile3.close();
                    if (A012 != null) {
                        A012.close();
                    }
                    A0A.close();
                } else {
                    throw new IOException("unable to list directory " + this.A00);
                }
            }
            randomAccessFile2.close();
            if (r7 == null) {
                z = false;
            } else {
                AnonymousClass0Y7 r11 = new AnonymousClass0Y7(this, file4, A0B, r7, file, r0);
                if ((i & 1) != 0) {
                    new Thread(r11, AnonymousClass000.A0E("SoSync:", this.A00.getName())).start();
                } else {
                    r11.run();
                }
                z = true;
            }
            if (z) {
                r0 = null;
            }
            if (r0 == null) {
                return;
            }
            return;
        } finally {
            r0.close();
        }
        try {
        } catch (Throwable th3) {
            if (A0A != null) {
                A0A.close();
            }
            throw th3;
        }
        try {
        } catch (Throwable th4) {
            randomAccessFile3.close();
            throw th4;
        }
        if (r6 == null) {
        }
        AnonymousClass0Y8[] r142 = r7.A00;
        list = this.A00.list();
        if (list == null) {
        }
        try {
        } catch (Throwable th5) {
            if (A002 != null) {
                A002.close();
            }
            throw th5;
        }
        try {
        } catch (Throwable th6) {
            if (A012 != null) {
                A012.close();
            }
            throw th6;
        }
        try {
        } catch (Throwable th7) {
            th = th7;
            randomAccessFile2.close();
        }
        available = A002.A01.available();
        if (available > 1) {
        }
        InputStream inputStream2 = A002.A01;
        i2 = 0;
        while (i2 < Integer.MAX_VALUE) {
        }
        randomAccessFile4.setLength(randomAccessFile4.getFilePointer());
        if (!file2.setExecutable(true, false)) {
        }
    }

    public final int A04(String str, int i, StrictMode.ThreadPolicy threadPolicy) {
        int A09;
        synchronized (A00(this, str)) {
            A09 = A09(str, i, this.A00, threadPolicy);
        }
        return A09;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0037, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0038, code lost:
        if (r4 != null) goto L_0x003a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003d, code lost:
        throw r0;
     */
    public byte[] A0B() {
        Parcel obtain = Parcel.obtain();
        AnonymousClass0YC A0A = A0A();
        AnonymousClass0Y8[] r3 = A0A.A00().A00;
        obtain.writeByte((byte) 1);
        int length = r3.length;
        obtain.writeInt(length);
        for (int i = 0; i < length; i++) {
            obtain.writeString(r3[i].A01);
            obtain.writeString(r3[i].A00);
        }
        A0A.close();
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        return marshall;
    }

    public C030505e(Context context, File file) {
        super(file, 1);
        this.A03 = context;
    }

    public C030505e(Context context, String str) {
        super(new File(AnonymousClass000.A0J(context.getApplicationInfo().dataDir, "/", str)), 1);
        this.A03 = context;
    }
}
