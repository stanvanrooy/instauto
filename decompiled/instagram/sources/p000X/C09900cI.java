package p000X;

import android.os.StrictMode;
import android.os.Trace;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.ClosedByInterruptException;
import java.nio.channels.FileChannel;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Collection;

/* renamed from: X.0cI  reason: invalid class name and case insensitive filesystem */
public class C09900cI extends AnonymousClass0Y2 {
    public final File A00;
    public final int A01;

    public int A04(String str, int i, StrictMode.ThreadPolicy threadPolicy) {
        return A09(str, i, this.A00, threadPolicy);
    }

    public final File A05(String str) {
        File file = new File(this.A00, str);
        if (file.exists()) {
            return file;
        }
        return null;
    }

    public final String A06(String str) {
        File file = new File(this.A00, str);
        if (file.exists()) {
            return file.getCanonicalPath();
        }
        return null;
    }

    public final void A07(Collection collection) {
        collection.add(this.A00.getAbsolutePath());
    }

    public final String[] A08(String str) {
        File file = new File(this.A00, str);
        if (file.exists()) {
            return A02(file);
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:66:0x00dc, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:?, code lost:
        r6.close();
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:69:0x00e0 */
    public final int A09(String str, int i, File file, StrictMode.ThreadPolicy threadPolicy) {
        String str2;
        String str3;
        String str4;
        File file2 = file;
        File file3 = new File(file2, str);
        if (!file3.exists()) {
            file2.getCanonicalPath();
            return 0;
        }
        file2.getCanonicalPath();
        if ((i & 1) != 0 && (this.A01 & 2) != 0) {
            return 2;
        }
        if ((this.A01 & 1) != 0) {
            String[] A02 = A02(file3);
            Arrays.toString(A02);
            for (String str5 : A02) {
                if (!str5.startsWith("/")) {
                    AnonymousClass0Y1.A0A(str5, (String) null, (String) null, i | 1, threadPolicy);
                }
            }
        }
        try {
            AnonymousClass0c6 r4 = AnonymousClass0Y1.A02;
            String absolutePath = file3.getAbsolutePath();
            if (r4.A04) {
                boolean z = false;
                if ((i & 4) == 4) {
                    z = true;
                }
                if (z) {
                    str2 = r4.A01;
                } else {
                    str2 = r4.A02;
                }
                try {
                    synchronized (r4.A00) {
                        try {
                            String str6 = (String) r4.A03.invoke(r4.A00, new Object[]{absolutePath, AnonymousClass0Y1.class.getClassLoader(), str2});
                            if (str6 == null) {
                                try {
                                    return 1;
                                } catch (Throwable th) {
                                    th = th;
                                    str4 = str6;
                                    throw th;
                                }
                            } else {
                                throw new UnsatisfiedLinkError(str6);
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            throw th;
                        }
                    }
                } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
                    throw new RuntimeException(AnonymousClass000.A0E("Error: Cannot load ", absolutePath), e);
                } catch (Throwable th3) {
                    if (str4 != null) {
                        try {
                            File file4 = new File(absolutePath);
                            MessageDigest instance = MessageDigest.getInstance("MD5");
                            FileInputStream fileInputStream = new FileInputStream(file4);
                            byte[] bArr = new byte[4096];
                            while (true) {
                                int read = fileInputStream.read(bArr);
                                if (read <= 0) {
                                    break;
                                }
                                instance.update(bArr, 0, read);
                            }
                            str3 = String.format("%32x", new Object[]{new BigInteger(1, instance.digest())});
                            fileInputStream.close();
                        } catch (IOException e2) {
                            str3 = e2.toString();
                        } catch (SecurityException e3) {
                            str3 = e3.toString();
                        } catch (NoSuchAlgorithmException e4) {
                            str3 = e4.toString();
                        } catch (Throwable ) {
                            throw th;
                        }
                        Log.e("SoLoader", AnonymousClass000.A0P("Error when loading lib: ", str4, " lib hash: ", str3, " search path is ", str2));
                    }
                    throw th3;
                }
            } else {
                System.load(absolutePath);
                return 1;
            }
        } catch (UnsatisfiedLinkError e5) {
            if (e5.getMessage().contains("bad ELF magic")) {
                return 3;
            }
            throw e5;
        }
    }

    public String toString() {
        String str;
        try {
            str = String.valueOf(this.A00.getCanonicalPath());
        } catch (IOException unused) {
            str = this.A00.getName();
        }
        return getClass().getName() + "[root = " + str + " flags = " + this.A01 + ']';
    }

    public C09900cI(File file, int i) {
        this.A00 = file;
        this.A01 = i;
    }

    public static String[] A02(File file) {
        FileInputStream fileInputStream;
        C08610Xu r1;
        long j;
        long j2;
        int i;
        ByteBuffer byteBuffer;
        FileChannel fileChannel;
        long j3;
        long j4;
        long j5;
        long j6;
        long j7;
        long j8;
        long j9;
        long j10;
        long j11;
        long j12;
        long j13;
        long j14;
        long j15;
        long j16;
        C08490Xg.A00("SoLoader.getElfDependencies[", file.getName());
        int i2 = 0;
        while (true) {
            try {
                fileInputStream = new FileInputStream(file);
                FileChannel channel = fileInputStream.getChannel();
                ByteBuffer allocate = ByteBuffer.allocate(8);
                allocate.order(ByteOrder.LITTLE_ENDIAN);
                if (C08630Xw.A01(channel, allocate, 0) == 1179403647) {
                    C08630Xw.A02(channel, allocate, 1, 4);
                    boolean z = true;
                    if (((short) (allocate.get() & 255)) != 1) {
                        z = false;
                    }
                    C08630Xw.A02(channel, allocate, 1, 5);
                    if (((short) (allocate.get() & 255)) == 2) {
                        allocate.order(ByteOrder.BIG_ENDIAN);
                    }
                    if (z) {
                        j = C08630Xw.A01(channel, allocate, 28);
                    } else {
                        j = C08630Xw.A00(channel, allocate, 32);
                    }
                    if (z) {
                        fileChannel = channel;
                        byteBuffer = allocate;
                        i = 2;
                        C08630Xw.A02(fileChannel, byteBuffer, 2, 44);
                        j2 = (long) (allocate.getShort() & 65535);
                    } else {
                        fileChannel = channel;
                        byteBuffer = allocate;
                        i = 2;
                        C08630Xw.A02(fileChannel, byteBuffer, 2, 56);
                        j2 = (long) (allocate.getShort() & 65535);
                    }
                    if (z) {
                        j3 = 42;
                    } else {
                        j3 = 54;
                    }
                    C08630Xw.A02(fileChannel, byteBuffer, i, j3);
                    short s = allocate.getShort() & 65535;
                    if (j2 == 65535) {
                        if (z) {
                            j16 = C08630Xw.A01(channel, allocate, 32);
                        } else {
                            j16 = C08630Xw.A00(channel, allocate, 40);
                        }
                        if (z) {
                            j2 = C08630Xw.A01(channel, allocate, j16 + 28);
                        } else {
                            j2 = C08630Xw.A01(channel, allocate, j16 + 44);
                        }
                    }
                    long j17 = j;
                    long j18 = 0;
                    while (true) {
                        if (j18 >= j2) {
                            j4 = 0;
                            break;
                        }
                        if (z) {
                            j15 = C08630Xw.A01(channel, allocate, j17 + 0);
                        } else {
                            j15 = C08630Xw.A01(channel, allocate, j17 + 0);
                        }
                        if (j15 != 2) {
                            j17 += (long) s;
                            j18++;
                        } else if (z) {
                            j4 = C08630Xw.A01(channel, allocate, j17 + 4);
                        } else {
                            j4 = C08630Xw.A00(channel, allocate, j17 + 8);
                        }
                    }
                    if (j4 != 0) {
                        long j19 = j4;
                        long j20 = 0;
                        int i3 = 0;
                        while (true) {
                            if (z) {
                                j5 = C08630Xw.A01(channel, allocate, j19 + 0);
                            } else {
                                j5 = C08630Xw.A00(channel, allocate, j19 + 0);
                            }
                            if (j5 == 1) {
                                if (i3 == Integer.MAX_VALUE) {
                                    r1 = new C08610Xu("malformed DT_NEEDED section");
                                    break;
                                }
                                i3++;
                            } else if (j5 == 5) {
                                if (z) {
                                    j20 = C08630Xw.A01(channel, allocate, j19 + 4);
                                } else {
                                    j20 = C08630Xw.A00(channel, allocate, j19 + 8);
                                }
                            }
                            if (z) {
                                j6 = 8;
                            } else {
                                j6 = 16;
                            }
                            j19 += j6;
                            if (j5 == 0) {
                                if (j20 != 0) {
                                    int i4 = 0;
                                    while (true) {
                                        if (((long) i4) >= j2) {
                                            j7 = 0;
                                            break;
                                        }
                                        if (z) {
                                            j11 = C08630Xw.A01(channel, allocate, j + 0);
                                        } else {
                                            j11 = C08630Xw.A01(channel, allocate, j + 0);
                                        }
                                        if (j11 == 1) {
                                            if (z) {
                                                j12 = C08630Xw.A01(channel, allocate, j + 8);
                                            } else {
                                                j12 = C08630Xw.A00(channel, allocate, j + 16);
                                            }
                                            if (z) {
                                                j13 = C08630Xw.A01(channel, allocate, j + 20);
                                            } else {
                                                j13 = C08630Xw.A00(channel, allocate, j + 40);
                                            }
                                            if (j12 <= j20 && j20 < j13 + j12) {
                                                if (z) {
                                                    j14 = C08630Xw.A01(channel, allocate, j + 4);
                                                } else {
                                                    j14 = C08630Xw.A00(channel, allocate, j + 8);
                                                }
                                                j7 = j14 + (j20 - j12);
                                            }
                                        }
                                        j += (long) s;
                                        i4++;
                                    }
                                    if (j7 != 0) {
                                        String[] strArr = new String[i3];
                                        int i5 = 0;
                                        while (true) {
                                            long j21 = j4 + 0;
                                            if (z) {
                                                j8 = C08630Xw.A01(channel, allocate, j21);
                                            } else {
                                                j8 = C08630Xw.A00(channel, allocate, j21);
                                            }
                                            if (j8 == 1) {
                                                if (z) {
                                                    j10 = C08630Xw.A01(channel, allocate, j4 + 4);
                                                } else {
                                                    j10 = C08630Xw.A00(channel, allocate, j4 + 8);
                                                }
                                                long j22 = j10 + j7;
                                                StringBuilder sb = new StringBuilder();
                                                while (true) {
                                                    long j23 = 1 + j22;
                                                    C08630Xw.A02(channel, allocate, 1, j22);
                                                    short s2 = (short) (allocate.get() & 255);
                                                    if (s2 == 0) {
                                                        break;
                                                    }
                                                    sb.append((char) s2);
                                                    j22 = j23;
                                                }
                                                strArr[i5] = sb.toString();
                                                if (i5 == Integer.MAX_VALUE) {
                                                    r1 = new C08610Xu("malformed DT_NEEDED section");
                                                    break;
                                                }
                                                i5++;
                                            }
                                            if (z) {
                                                j9 = 8;
                                            } else {
                                                j9 = 16;
                                            }
                                            j4 += j9;
                                            if (j8 == 0) {
                                                if (i5 == i3) {
                                                    fileInputStream.close();
                                                    Trace.endSection();
                                                    return strArr;
                                                }
                                                r1 = new C08610Xu("malformed DT_NEEDED section");
                                            }
                                        }
                                    } else {
                                        r1 = new C08610Xu("did not find file offset of DT_STRTAB table");
                                    }
                                } else {
                                    r1 = new C08610Xu("Dynamic section string-table not found");
                                }
                            }
                        }
                    } else {
                        r1 = new C08610Xu("ELF file does not contain dynamic linking information");
                    }
                } else {
                    r1 = new C08610Xu("file is not ELF");
                }
                throw r1;
            } catch (ClosedByInterruptException e) {
                i2++;
                if (i2 <= 3) {
                    Thread.interrupted();
                    Log.e("MinElf", "retrying extract_DT_NEEDED due to ClosedByInterruptException", e);
                    fileInputStream.close();
                } else {
                    throw e;
                }
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        }
    }
}
