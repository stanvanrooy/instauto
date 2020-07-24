package p000X;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/* renamed from: X.0gX  reason: invalid class name and case insensitive filesystem */
public final class C12310gX {
    public static final FileFilter A00 = new C12320gY();

    /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x0053 */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00cf  */
    public static int A00() {
        FileInputStream fileInputStream;
        int i;
        int i2;
        byte b;
        FileInputStream fileInputStream2;
        int i3 = -1;
        for (int i4 = 0; i4 < A01(); i4++) {
            File file = new File(AnonymousClass000.A06("/sys/devices/system/cpu/cpu", i4, "/cpufreq/cpuinfo_max_freq"));
            if (file.exists() && file.canRead()) {
                byte[] bArr = new byte[128];
                fileInputStream2 = new FileInputStream(file);
                try {
                    fileInputStream2.read(bArr);
                    int i5 = 0;
                    while (Character.isDigit(bArr[i5]) && i5 < 128) {
                        i5++;
                    }
                    int intValue = Integer.valueOf(Integer.parseInt(new String(bArr, 0, i5))).intValue();
                    if (intValue > i3) {
                        i3 = intValue;
                    }
                } catch (NumberFormatException ) {
                    fileInputStream2.close();
                } catch (Throwable th) {
                    th = th;
                    fileInputStream2.close();
                    throw th;
                }
                try {
                    fileInputStream2.close();
                } catch (IOException unused) {
                    return -1;
                }
            }
        }
        if (i3 != -1) {
            return i3;
        }
        fileInputStream = new FileInputStream("/proc/cpuinfo");
        try {
            byte[] bArr2 = new byte[1024];
            try {
                int read = fileInputStream.read(bArr2);
                int i6 = 0;
                while (true) {
                    if (i6 >= read) {
                        break;
                    }
                    byte b2 = bArr2[i6];
                    if (b2 == 10 || i6 == 0) {
                        if (b2 == 10) {
                            i6++;
                        }
                        int i7 = i6;
                        while (i7 < read) {
                            int i8 = i7 - i6;
                            if (bArr2[i7] != "cpu MHz".charAt(i8)) {
                                continue;
                                break;
                            } else if (i8 == "cpu MHz".length() - 1) {
                                while (true) {
                                    if (i7 >= 1024 || (b = bArr2[i7]) == 10) {
                                        i = -1;
                                    } else if (Character.isDigit(b)) {
                                        int i9 = i7 + 1;
                                        while (i9 < 1024 && Character.isDigit(bArr2[i9])) {
                                            i9++;
                                        }
                                        i = Integer.parseInt(new String(bArr2, 0, i7, i9 - i7));
                                    } else {
                                        i7++;
                                    }
                                }
                                i = -1;
                            } else {
                                i7++;
                            }
                        }
                        continue;
                    }
                    i6++;
                }
            } catch (IOException | NumberFormatException unused2) {
            }
            i2 = i * 1000;
            if (i2 <= i3) {
                i2 = -1;
            }
            fileInputStream.close();
            return i2;
        } catch (Throwable th2) {
            th = th2;
            fileInputStream.close();
            throw th;
        }
        i = -1;
        i2 = i * 1000;
        if (i2 <= i3) {
        }
        fileInputStream.close();
        return i2;
    }

    public static int A01() {
        try {
            int A02 = A02("/sys/devices/system/cpu/possible");
            if (A02 == -1) {
                A02 = A02("/sys/devices/system/cpu/present");
            }
            if (A02 == -1) {
                return new File("/sys/devices/system/cpu/").listFiles(A00).length;
            }
            return A02;
        } catch (NullPointerException | SecurityException unused) {
            return -1;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x003c A[SYNTHETIC, Splitter:B:17:0x003c] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0044 A[SYNTHETIC, Splitter:B:26:0x0044] */
    public static int A02(String str) {
        int i;
        FileInputStream fileInputStream;
        try {
            fileInputStream = new FileInputStream(str);
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream));
                String readLine = bufferedReader.readLine();
                bufferedReader.close();
                if (readLine == null || !readLine.matches("0-[\\d]+$")) {
                    i = -1;
                } else {
                    i = Integer.valueOf(readLine.substring(2)).intValue() + 1;
                }
            } catch (IOException unused) {
                i = -1;
                if (fileInputStream != null) {
                }
                return i;
            } catch (Throwable th) {
                th = th;
                if (fileInputStream != null) {
                }
                throw th;
            }
            try {
                fileInputStream.close();
                return i;
            } catch (IOException unused2) {
            }
        } catch (IOException unused3) {
            fileInputStream = null;
            i = -1;
            if (fileInputStream != null) {
                fileInputStream.close();
            }
            return i;
        } catch (Throwable th2) {
            th = th2;
            fileInputStream = null;
            if (fileInputStream != null) {
                try {
                    fileInputStream.close();
                } catch (IOException unused4) {
                }
            }
            throw th;
        }
    }
}
