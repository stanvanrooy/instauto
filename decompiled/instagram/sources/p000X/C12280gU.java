package p000X;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/* renamed from: X.0gU  reason: invalid class name and case insensitive filesystem */
public final class C12280gU {
    public static int A00 = -1;

    public static int[] A03(int i) {
        try {
            return new int[]{A01(AnonymousClass000.A06("/sys/devices/system/cpu/cpu", i, "/cpufreq/cpuinfo_min_freq")), A01(AnonymousClass000.A06("/sys/devices/system/cpu/cpu", i, "/cpufreq/cpuinfo_max_freq"))};
        } catch (IOException unused) {
            return new int[]{-1, -1};
        }
    }

    public static int A00() {
        int i;
        BufferedReader bufferedReader;
        int i2 = A00;
        if (i2 == -1 || i2 == -2) {
            File file = new File("/sys/devices/system/cpu/possible");
            if (!file.exists()) {
                i = -2;
            } else {
                try {
                    bufferedReader = new BufferedReader(new FileReader(file));
                    String readLine = bufferedReader.readLine();
                    bufferedReader.close();
                    int indexOf = readLine.indexOf(45);
                    if (indexOf != -1) {
                        i = Integer.parseInt(readLine.substring(indexOf + 1)) + 1;
                    } else {
                        i = Integer.parseInt(readLine) + 1;
                    }
                } catch (Exception unused) {
                    i = -1;
                } catch (Throwable th) {
                    bufferedReader.close();
                    throw th;
                }
            }
            A00 = i;
        }
        return A00;
    }

    public static int A01(String str) {
        BufferedReader bufferedReader;
        File file = new File(str);
        if (!file.exists()) {
            return -2;
        }
        try {
            bufferedReader = new BufferedReader(new FileReader(file));
            String readLine = bufferedReader.readLine();
            bufferedReader.close();
            return Integer.parseInt(readLine);
        } catch (NumberFormatException unused) {
            return -1;
        } catch (Throwable th) {
            bufferedReader.close();
            throw th;
        }
    }

    public static C12290gV A02() {
        C12290gV r4 = new C12290gV();
        int A002 = A00();
        if (A002 > 0) {
            if (A002 == 1) {
                int[] A03 = A03(0);
                r4.A02 = 1;
                r4.A0B = A03;
            } else {
                int i = A002 - 1;
                int[] A032 = A03(0);
                int i2 = i - 1;
                int[] A033 = A03(i);
                int i3 = 1;
                while (i3 < i2) {
                    int i4 = A032[0];
                    if (i4 >= 0 && A033[0] >= 0) {
                        break;
                    }
                    if (i4 < 0) {
                        A032 = A03(i3);
                        i3++;
                    }
                    if (A033[0] < 0) {
                        A033 = A03(i2);
                        i2--;
                    }
                }
                int i5 = A032[0];
                if (i5 < 0 && A033[0] < 0) {
                    r4.A02 = A002;
                    r4.A0B = new int[]{-1, -1};
                } else if (i5 < 0) {
                    r4.A02 = A002;
                    r4.A0B = A033;
                } else {
                    if (A033[0] >= 0) {
                        int i6 = A032[1];
                        int i7 = A033[1];
                        boolean z = false;
                        if (i6 != i7) {
                            z = true;
                        }
                        if (z) {
                            int i8 = A002 >> 1;
                            if (i6 > i7) {
                                int i9 = i8;
                                int i10 = 0;
                                if (i3 - 1 > i2 + 1) {
                                    i10 = i8;
                                    i9 = 0;
                                }
                                int[] iArr = {i10, i9};
                                C12290gV r2 = new C12290gV();
                                int i11 = iArr[0];
                                r2.A00 = i8;
                                r2.A0A = A032;
                                r2.A01 = i11;
                                r2.A07 = true;
                                int i12 = iArr[1];
                                r2.A03 = i8;
                                r2.A0C = A033;
                                r2.A04 = i12;
                                r2.A07 = true;
                                r2.A02 = i8 + i8 + r2.A06;
                                r2.A0B = A032;
                                return r2;
                            }
                            int i13 = i8;
                            int i14 = 0;
                            if (i2 + 1 > i3 - 1) {
                                i14 = i8;
                                i13 = 0;
                            }
                            int[] iArr2 = {i14, i13};
                            C12290gV r22 = new C12290gV();
                            int i15 = iArr2[0];
                            r22.A00 = i8;
                            r22.A0A = A033;
                            r22.A01 = i15;
                            r22.A07 = true;
                            int i16 = iArr2[1];
                            r22.A03 = i8;
                            r22.A0C = A032;
                            r22.A04 = i16;
                            r22.A07 = true;
                            r22.A02 = i8 + i8 + r22.A06;
                            r22.A0B = A033;
                            return r22;
                        }
                    }
                    r4.A02 = A002;
                    r4.A0B = A032;
                }
            }
        }
        if (r4.A07) {
            r4.A02 = r4.A03 + r4.A00 + r4.A06;
            r4.A0B = r4.A0A;
        }
        return r4;
    }
}
