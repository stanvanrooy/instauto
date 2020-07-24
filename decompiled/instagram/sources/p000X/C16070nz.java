package p000X;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;

/* renamed from: X.0nz  reason: invalid class name and case insensitive filesystem */
public class C16070nz implements C16090o1 {
    public final C12900hZ A00;
    public final boolean A01;
    public final C15830nb A02;
    public final Class A03;

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002c, code lost:
        if (r1.indexOf("application/json") >= 0) goto L_0x002e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x00e3, code lost:
        r2 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x00e5, code lost:
        r2 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x00e6, code lost:
        r7 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x00ee, code lost:
        throw new p000X.C150316bt(r2, r9.A01);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x00ef, code lost:
        r1 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x00f1, code lost:
        r1 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x00f2, code lost:
        r7 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x00f3, code lost:
        if (r7 != null) goto L_0x00f5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:?, code lost:
        r7.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x00f8, code lost:
        r0 = r9.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x00fa, code lost:
        if (r0 != null) goto L_0x00fc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x00fc, code lost:
        r0.A8w();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0101, code lost:
        if (p000X.C06530Pk.A00 != false) goto L_0x0103;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0103, code lost:
        p000X.AnonymousClass0ZB.A00(-1351146308);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0109, code lost:
        throw r1;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0031 A[Catch:{ 1xk | 1xm -> 0x00e5, all -> 0x00f1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x004a A[SYNTHETIC, Splitter:B:23:0x004a] */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00e3 A[ExcHandler: 1xk | 1xm (e java.lang.Throwable), PHI: r7 
      PHI: (r7v4 X.0hr) = (r7v5 X.0hr), (r7v5 X.0hr), (r7v5 X.0hr), (r7v5 X.0hr), (r7v8 X.0hr), (r7v8 X.0hr) binds: [B:36:0x0076, B:39:0x007c, B:52:0x00b1, B:40:?, B:21:0x0046, B:22:?] A[DONT_GENERATE, DONT_INLINE], Splitter:B:21:0x0046] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00e5 A[ExcHandler: 1xk | 1xm (e java.lang.Throwable), Splitter:B:4:0x000d] */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00f5 A[SYNTHETIC, Splitter:B:76:0x00f5] */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x00fc  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0103  */
    /* renamed from: A00 */
    public C28711Mu then(C33861dc r9) {
        C13080hr r7;
        boolean z;
        String str;
        if (C06530Pk.A00) {
            AnonymousClass0ZB.A01("parseHttpResponse", -2130374476);
        }
        try {
            AnonymousClass1CA r0 = r9.A00;
            if (r0 != null) {
                InputStream AHT = r0.AHT();
                if (this.A01) {
                    C17190pp A002 = r9.A00("Content-Type");
                    z = false;
                    if (A002 != null) {
                        String str2 = A002.A01;
                        if (str2 != null) {
                        }
                    }
                    if (!z) {
                        InputStream BuM = this.A02.BuM(AHT);
                        C12900hZ r02 = this.A00;
                        if (r02 != null) {
                            r7 = r02.A08(BuM);
                        } else {
                            r7 = C12890hY.A00.A08(BuM);
                        }
                        try {
                            r7.A0p();
                        } catch (NoSuchMethodException e) {
                            throw new IllegalArgumentException(AnonymousClass000.A0E("On Class ", this.A03.getCanonicalName()), e);
                        } catch (InvocationTargetException e2) {
                            if (e2.getTargetException() instanceof Exception) {
                                throw ((Exception) e2.getTargetException());
                            }
                            throw e2;
                        } catch (IllegalAccessException e3) {
                            throw new IllegalStateException(e3);
                        } catch (C45361xk | C45381xm e4) {
                        }
                    } else {
                        C17190pp A003 = r9.A00("Content-Type");
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        byte[] bArr = new byte[4096];
                        int read = AHT.read(bArr);
                        if (read > 0) {
                            byteArrayOutputStream.write(bArr, 0, read);
                            str = new String(bArr, 0, read, "utf-8");
                            throw new C45381xm(A003, str);
                        }
                        str = null;
                        throw new C45381xm(A003, str);
                    }
                }
                z = true;
                if (!z) {
                }
            } else {
                r7 = null;
            }
            if (r7 != null) {
                if (r7.A0g() != null) {
                    C28711Mu r1 = (C28711Mu) this.A03.getMethod("parseFromJson", new Class[]{C13080hr.class}).invoke((Object) null, new Object[]{r7});
                    r1.setStatusCode(r9.A01);
                    try {
                        r7.close();
                    } catch (IOException unused) {
                    }
                    AnonymousClass1CA r03 = r9.A00;
                    if (r03 != null) {
                        r03.A8w();
                    }
                    if (C06530Pk.A00) {
                        AnonymousClass0ZB.A00(139503086);
                    }
                    return r1;
                }
            }
            throw new IOException("Response body is empty");
        } catch (IOException unused2) {
        } catch (C45361xk | C45381xm e5) {
        }
    }

    public C16070nz(Class cls, C12900hZ r4) {
        this(cls, r4, new C22970zK((File) null), false);
    }

    public C16070nz(Class cls, C12900hZ r2, C15830nb r3, boolean z) {
        this.A03 = cls;
        this.A00 = r2;
        this.A02 = r3;
        this.A01 = z;
    }
}
