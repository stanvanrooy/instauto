package p000X;

import com.facebook.forker.Process;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.jar.JarFile;
import java.util.zip.ZipEntry;

/* renamed from: X.BAs */
public final class BAs {
    public final Set A00;

    private void A03(BAu bAu, List list) {
        String str;
        StringBuilder sb;
        int i = 0;
        while (i < list.size()) {
            String str2 = (String) list.get(i);
            if (str2 == null || str2.length() == 0) {
                str = "Empty component name.";
            } else {
                String str3 = bAu.A02;
                if (str3 == null || str3.length() == 0) {
                    str = "Package name is empty.";
                } else {
                    int indexOf = str2.indexOf(46);
                    if (indexOf == 0) {
                        sb = new StringBuilder();
                        sb.append(str3);
                    } else if (indexOf < 0) {
                        sb = new StringBuilder();
                        sb.append(str3);
                        sb.append(".");
                    } else {
                        list.set(i, str2);
                        i++;
                    }
                    sb.append(str2);
                    str2 = sb.toString();
                    list.set(i, str2);
                    i++;
                }
            }
            throw A00(bAu, str);
        }
    }

    public static BAv A00(BAu bAu, String str) {
        throw new BAv("Failed to parse AndroidManifest.xml in " + bAu.A00 + ": " + str);
    }

    public static String A01(BAu bAu, int i) {
        String str = (String) bAu.A09.get(Integer.valueOf(i));
        if (str != null) {
            return str;
        }
        throw new IllegalStateException(AnonymousClass000.A05("String not found: ", i));
    }

    private Map A02(BAt bAt, BAu bAu, int i) {
        String A01;
        HashMap hashMap = new HashMap();
        for (int i2 = 0; i2 < i; i2++) {
            int A02 = bAt.A02();
            int A022 = bAt.A02();
            int A023 = bAt.A02();
            int i3 = bAt.A00;
            short A03 = bAt.A03();
            bAt.A01();
            bAt.A01();
            int A024 = bAt.A02();
            int i4 = A03 - (bAt.A00 - i3);
            if (i4 > 0) {
                bAt.A04(i4);
            }
            if (A02 >= 0) {
                A01(bAu, A02);
            }
            String A012 = A01(bAu, A022);
            if (A023 < 0) {
                A01 = null;
            } else {
                A01 = A01(bAu, A023);
            }
            if (A01 == null) {
                A01 = Integer.toString(A024);
            }
            if (A01 != null) {
                hashMap.put(A012, A01);
            }
        }
        return hashMap;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v0, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v0, resolved type: java.util.jar.JarFile} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: java.util.jar.JarFile} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: java.util.jar.JarFile} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v3, resolved type: java.util.jar.JarFile} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v5, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v4, resolved type: java.util.jar.JarFile} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v6, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v7, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v8, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v9, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v10, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v11, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: java.util.jar.JarFile} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:181:0x0398  */
    /* JADX WARNING: Removed duplicated region for block: B:183:0x039d  */
    public final B8O A04(File file) {
        JarFile jarFile;
        InputStream inputStream;
        InputStream inputStream2;
        String str;
        String str2;
        String str3;
        InputStream inputStream3 = null;
        BAu bAu = new BAu();
        File file2 = file;
        bAu.A00 = file2;
        try {
            JarFile jarFile2 = new JarFile(file2);
            try {
                ZipEntry entry = jarFile2.getEntry("AndroidManifest.xml");
                if (entry != null) {
                    inputStream3 = jarFile2.getInputStream(entry);
                    BAt bAt = new BAt(new DataInputStream(inputStream3));
                    bAt.A01 = Process.WAIT_RESULT_TIMEOUT;
                    bAt.A00 = 0;
                    short A03 = bAt.A03();
                    int A032 = bAt.A03();
                    int A02 = bAt.A02();
                    if (A03 == 3) {
                        bAt.A01 = A02 - 8;
                        bAt.A00 = 0;
                        int i = A032 - 8;
                        if (i > 0) {
                            bAt.A04(i);
                        }
                        C25261BAw bAw = new C25261BAw();
                        BAt bAt2 = new BAt(bAt);
                        while (true) {
                            boolean z = false;
                            if (bAt.A00 < bAt.A01) {
                                z = true;
                            }
                            if (z) {
                                bAt2.A01 = Process.WAIT_RESULT_TIMEOUT;
                                bAt2.A00 = 0;
                                short A033 = bAt2.A03();
                                short A034 = bAt2.A03();
                                int A022 = bAt2.A02();
                                bAw.A00 = A034;
                                bAt2.A01 = A022 - 8;
                                bAt2.A00 = 0;
                                if (A033 == 1) {
                                    int A023 = bAt2.A02();
                                    int A024 = bAt2.A02();
                                    int A025 = bAt2.A02();
                                    int A026 = bAt2.A02();
                                    bAt2.A02();
                                    int i2 = bAw.A00 - (bAt2.A00 + 8);
                                    if (i2 >= 0) {
                                        if (i2 > 0) {
                                            bAt2.A04(i2);
                                        }
                                        HashMap hashMap = new HashMap();
                                        for (int i3 = 0; i3 < A023; i3++) {
                                            hashMap.put(Integer.valueOf(bAt2.A02()), Integer.valueOf(i3));
                                        }
                                        bAt2.A04(A024 << 2);
                                        int i4 = (A026 - 8) - bAt2.A00;
                                        if (i4 >= 0) {
                                            if (i4 > 0) {
                                                bAt2.A04(i4);
                                            }
                                            boolean z2 = false;
                                            if ((A025 & 256) != 0) {
                                                z2 = true;
                                            }
                                            if (z2) {
                                                str = "UTF-8";
                                            } else {
                                                str = "UTF-16LE";
                                            }
                                            Charset forName = Charset.forName(str);
                                            int i5 = 0;
                                            while (i5 < A023) {
                                                int i6 = (bAt2.A00 + 8) - A026;
                                                if (hashMap.containsKey(Integer.valueOf(i6))) {
                                                    int intValue = ((Integer) hashMap.get(Integer.valueOf(i6))).intValue();
                                                    if (z2) {
                                                        int i7 = 0;
                                                        for (int i8 = 0; i8 < 2; i8++) {
                                                            i7 = bAt2.A01();
                                                            if ((i7 & 128) != 0) {
                                                                i7 = ((i7 & 127) << 8) | bAt2.A01();
                                                            }
                                                        }
                                                        byte[] bArr = new byte[i7];
                                                        bAt2.A05(bArr);
                                                        if (bAt2.A01() == 0) {
                                                            str2 = new String(bArr, forName);
                                                        } else {
                                                            throw A00(bAu, "each string is expected to end with \\0 terminator.");
                                                        }
                                                    } else {
                                                        short A035 = bAt2.A03();
                                                        if ((32768 & A035) != 0) {
                                                            A035 = ((A035 & Short.MAX_VALUE) << 16) | bAt2.A03();
                                                        }
                                                        byte[] bArr2 = new byte[(A035 << 1)];
                                                        bAt2.A05(bArr2);
                                                        if (bAt2.A03() == 0) {
                                                            str2 = new String(bArr2, forName);
                                                        } else {
                                                            throw A00(bAu, "each string is expected to end with \\0 terminator.");
                                                        }
                                                    }
                                                    bAu.A09.put(Integer.valueOf(intValue), str2);
                                                    i5++;
                                                } else {
                                                    throw A00(bAu, AnonymousClass000.A05("offset doesn't match string index: offset=", i6));
                                                }
                                            }
                                            bAt2.A04(bAt2.A01 - bAt2.A00);
                                        } else {
                                            throw A00(bAu, AnonymousClass000.A05("consumed too much data from string index table: ", i4));
                                        }
                                    } else {
                                        throw A00(bAu, AnonymousClass000.A05("consumed too much data from string header: ", i2));
                                    }
                                } else if (A033 == 258) {
                                    bAt2.A02();
                                    bAt2.A02();
                                    int i9 = bAw.A00 - (bAt2.A00 + 8);
                                    if (i9 > 0) {
                                        bAt2.A04(i9);
                                    }
                                    int i10 = bAt2.A00;
                                    bAt2.A02();
                                    int A027 = bAt2.A02();
                                    int A036 = bAt2.A03();
                                    bAt2.A03();
                                    short A037 = bAt2.A03();
                                    bAt2.A03();
                                    bAt2.A03();
                                    bAt2.A03();
                                    int i11 = A036 - (bAt2.A00 - i10);
                                    if (i11 > 0) {
                                        bAt2.A04(i11);
                                    }
                                    String A01 = A01(bAu, A027);
                                    if ("manifest".equals(A01) && bAu.A01 == 0) {
                                        bAu.A0B = true;
                                        Map A028 = A02(bAt2, bAu, A037);
                                        String str4 = (String) A028.get("package");
                                        bAu.A02 = str4;
                                        if (str4 != null) {
                                            String str5 = (String) A028.get("versionName");
                                            bAu.A04 = str5;
                                            if (str5 != null) {
                                                String str6 = (String) A028.get("versionCode");
                                                bAu.A03 = str6;
                                                if (str6 == null) {
                                                    throw A00(bAu, "manifest does not have version code specified.");
                                                }
                                            } else {
                                                throw A00(bAu, "manifest does not have version name specified.");
                                            }
                                        } else {
                                            throw A00(bAu, "manifest does not have package name specified.");
                                        }
                                    } else if ("application".equals(A01) && bAu.A0B && bAu.A01 == 1) {
                                        bAu.A0A = true;
                                    } else if (this.A00.contains(A01) && bAu.A0A && bAu.A01 == 2) {
                                        String str7 = (String) A02(bAt2, bAu, A037).get("name");
                                        if (str7 == null) {
                                            throw A00(bAu, AnonymousClass000.A0J("component tag ", A01, " did not include name attribute."));
                                        } else if ("activity".equals(A01) || "activity-alias".equals(A01)) {
                                            bAu.A05.add(str7);
                                        } else if ("receiver".equals(A01)) {
                                            bAu.A07.add(str7);
                                        } else if ("service".equals(A01)) {
                                            bAu.A08.add(str7);
                                        } else if ("provider".equals(A01)) {
                                            bAu.A06.add(str7);
                                        }
                                    }
                                    bAt2.A04(bAt2.A01 - bAt2.A00);
                                    bAu.A01++;
                                } else if (A033 == 259) {
                                    bAu.A01--;
                                    bAt2.A02();
                                    bAt2.A02();
                                    int i12 = bAw.A00 - (bAt2.A00 + 8);
                                    if (i12 > 0) {
                                        bAt2.A04(i12);
                                    }
                                    int A029 = bAt2.A02();
                                    int A0210 = bAt2.A02();
                                    if (A029 < 0) {
                                        str3 = null;
                                    } else {
                                        str3 = A01(bAu, A029);
                                    }
                                    String A012 = A01(bAu, A0210);
                                    boolean equals = "http://schemas.android.com/apk/res/android".equals(str3);
                                    if (equals && "manifest".equals(A012) && bAu.A01 == 0) {
                                        bAu.A0B = false;
                                    } else if (equals && "application".equals(A012) && bAu.A01 == 1) {
                                        bAu.A0A = false;
                                    }
                                }
                                bAt2.A04(bAt2.A01 - bAt2.A00);
                            } else {
                                A03(bAu, bAu.A05);
                                A03(bAu, bAu.A07);
                                A03(bAu, bAu.A06);
                                A03(bAu, bAu.A08);
                                B8O b8o = new B8O(bAu.A02, bAu.A03, bAu.A04, bAu.A05, bAu.A07, bAu.A06, bAu.A08);
                                if (inputStream3 != null) {
                                    inputStream3.close();
                                }
                                jarFile2.close();
                                return b8o;
                            }
                        }
                    } else {
                        throw A00(bAu, "stream is not an xml resource.");
                    }
                } else {
                    throw new FileNotFoundException("No manifest found in " + file2);
                }
            } catch (BAv e) {
                e = e;
                inputStream = inputStream3;
                inputStream3 = jarFile2;
                try {
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    jarFile = inputStream3;
                    inputStream3 = inputStream;
                }
            } catch (IOException e2) {
                e = e2;
                inputStream2 = inputStream3;
                inputStream3 = jarFile2;
                try {
                    throw new BAv("Failed to parse manifest from " + file2, e);
                } catch (Throwable th2) {
                    th = th2;
                    jarFile = inputStream3;
                    inputStream3 = inputStream2;
                    if (inputStream3 != null) {
                    }
                    if (jarFile != 0) {
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                jarFile = jarFile2;
                if (inputStream3 != null) {
                    inputStream3.close();
                }
                if (jarFile != 0) {
                    jarFile.close();
                }
                throw th;
            }
        } catch (BAv e3) {
            e = e3;
            inputStream = null;
            throw e;
        } catch (IOException e4) {
            e = e4;
            inputStream2 = null;
            throw new BAv("Failed to parse manifest from " + file2, e);
        } catch (Throwable th4) {
            th = th4;
            jarFile = 0;
            if (inputStream3 != null) {
            }
            if (jarFile != 0) {
            }
            throw th;
        }
    }

    public BAs() {
        HashSet hashSet = new HashSet();
        hashSet.add("activity");
        hashSet.add("activity-alias");
        hashSet.add("receiver");
        hashSet.add("service");
        hashSet.add("provider");
        this.A00 = Collections.unmodifiableSet(hashSet);
    }
}
