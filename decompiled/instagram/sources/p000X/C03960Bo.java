package p000X;

import android.os.Build;
import android.system.StructStat;
import android.util.Log;
import com.facebook.common.dextricks.DexStore;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import libcore.io.Libcore;
import libcore.util.MutableLong;

/* renamed from: X.0Bo  reason: invalid class name and case insensitive filesystem */
public final class C03960Bo {
    public static boolean A00 = true;
    public static final boolean A01;

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003c, code lost:
        if (r3 == 3) goto L_0x003e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003e, code lost:
        r7 = true;
     */
    static {
        boolean z = false;
        try {
            String property = System.getProperty("os.version");
            if (property != null && !property.isEmpty()) {
                String[] split = property.split("\\.");
                int[] iArr = {2, 6, 33};
                int min = Math.min(split.length, 3);
                int i = 0;
                while (true) {
                    if (i < min) {
                        int parseInt = Integer.parseInt(split[i]);
                        int i2 = iArr[i];
                        if (parseInt >= i2) {
                            if (parseInt > i2) {
                                break;
                            }
                            i++;
                        } else {
                            break;
                        }
                    }
                }
            }
        } catch (IllegalArgumentException | NullPointerException | SecurityException unused) {
        }
        A01 = z;
    }

    public static int A02(InputStream inputStream, byte[] bArr, int i) {
        int min = Math.min(bArr.length, i);
        int i2 = 0;
        int i3 = 0;
        while (i2 < min) {
            i3 = inputStream.read(bArr, i2, min - i2);
            if (i3 < 0) {
                break;
            }
            i2 += i3;
        }
        if (i3 == -1 && i2 == 0) {
            return -1;
        }
        return i2;
    }

    public static int A00(FileDescriptor fileDescriptor, FileDescriptor fileDescriptor2, AnonymousClass0Bn r7, int i) {
        try {
            int i2 = Build.VERSION.SDK_INT;
            FileDescriptor fileDescriptor3 = fileDescriptor;
            FileDescriptor fileDescriptor4 = fileDescriptor2;
            if (i2 >= 28) {
                return AnonymousClass0Bm.A01(fileDescriptor, fileDescriptor2, r7, i);
            }
            if (i2 >= 21) {
                return AnonymousClass0Bl.A01(fileDescriptor, fileDescriptor2, r7, i);
            }
            MutableLong mutableLong = new MutableLong(r7.A00);
            int sendfile = (int) Libcore.os.sendfile(fileDescriptor3, fileDescriptor4, mutableLong, (long) i);
            if (sendfile >= 0) {
                r7.A00 = mutableLong.value;
            }
            return sendfile;
        } catch (IllegalAccessError | NoClassDefFoundError | NoSuchFieldError | NoSuchMethodError e) {
            Log.w("CopyUtils", "Failed to call send file for copy utils", e);
            A00 = false;
            return -1;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static int A01(FileOutputStream fileOutputStream, FileInputStream fileInputStream, int i) {
        int i2;
        int i3;
        if (!A01 || !A00) {
            i2 = -1;
        } else {
            FileDescriptor fd = fileOutputStream.getFD();
            FileDescriptor fd2 = fileInputStream.getFD();
            try {
                int i4 = Build.VERSION.SDK_INT;
                if (i4 >= 28) {
                    i3 = AnonymousClass0Bm.A00(fd2);
                } else if (i4 >= 21) {
                    i3 = AnonymousClass0Bl.A00(fd2);
                } else {
                    StructStat fstat = Libcore.os.fstat(fd2);
                    if (fstat == null) {
                        i3 = -1;
                    } else {
                        i3 = (int) fstat.st_size;
                    }
                }
            } catch (IllegalAccessError | NoClassDefFoundError | NoSuchFieldError | NoSuchMethodError e) {
                Log.w("CopyUtils", "Failed to call fstat st.size for copy utils", e);
                A00 = false;
                i3 = -1;
            } catch (Exception e2) {
                throw new IOException(e2);
            }
            if (i3 >= 0) {
                int min = Math.min(i3, i);
                AnonymousClass0Bn r3 = new AnonymousClass0Bn();
                i2 = 0;
                int i5 = 0;
                while (i2 < min) {
                    int A002 = A00(fd, fd2, r3, min - i2);
                    if (A002 >= 0) {
                        i2 += A002;
                        int i6 = i5 + 1;
                        if (i5 <= 50) {
                            i5 = i6;
                        } else {
                            throw new IOException(String.format("Tried %d times to send file. Progress %d / %d sent: %d", new Object[]{Integer.valueOf(i6), Integer.valueOf(i2), Integer.valueOf(min), Integer.valueOf(A002)}));
                        }
                    } else {
                        throw new IOException(String.format("Failed to send file. Ret: %d", new Object[]{Integer.valueOf(A002)}));
                    }
                }
            } else {
                throw new IOException(String.format("fstat st_size failed with value %d", new Object[]{Integer.valueOf(i3)}));
            }
        }
        if (i2 > 0) {
            return i2;
        }
        return A03(fileOutputStream, fileInputStream, i);
    }

    public static int A03(OutputStream outputStream, InputStream inputStream, int i) {
        byte[] bArr = new byte[DexStore.LOAD_RESULT_PGO];
        int i2 = 0;
        while (i2 < i) {
            int A02 = A02(inputStream, bArr, i - i2);
            if (A02 == -1) {
                break;
            }
            outputStream.write(bArr, 0, A02);
            i2 += A02;
        }
        return i2;
    }

    public static int A04(RandomAccessFile randomAccessFile, InputStream inputStream, byte[] bArr) {
        int i = 0;
        while (i < Integer.MAX_VALUE) {
            int A02 = A02(inputStream, bArr, Integer.MAX_VALUE - i);
            if (A02 == -1) {
                break;
            }
            randomAccessFile.write(bArr, 0, A02);
            i += A02;
        }
        return i;
    }
}
