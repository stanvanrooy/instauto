package p000X;

import com.facebook.common.stringformat.StringFormatUtil;
import com.google.common.p003io.Closeables;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.FileChannel;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/* renamed from: X.1ch  reason: invalid class name and case insensitive filesystem */
public final class C33301ch {
    public int A00;
    public C256019m A01;
    public C33371co A02;
    public C33371co A03;
    public AnonymousClass1FV A04;
    public String A05;
    public GZIPInputStream A06;
    public GZIPOutputStream A07;
    public GZIPOutputStream A08;
    public boolean A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;

    public final void A01() {
        C33371co r0 = this.A03;
        if (r0 != null) {
            r0.A03();
        }
        C33371co r02 = this.A02;
        if (r02 != null) {
            r02.A03();
        }
        GZIPOutputStream gZIPOutputStream = this.A08;
        if (gZIPOutputStream != null) {
            try {
                gZIPOutputStream.close();
            } catch (IOException e) {
                AnonymousClass0DB.A0H("HttpStoreEntry", "IOException when closing header output stream", e);
            }
        }
        GZIPOutputStream gZIPOutputStream2 = this.A07;
        if (gZIPOutputStream2 != null) {
            try {
                gZIPOutputStream2.close();
            } catch (IOException e2) {
                AnonymousClass0DB.A0H("HttpStoreEntry", "IOException when closing body output stream", e2);
            }
        }
    }

    public final String toString() {
        return StringFormatUtil.formatStrLocaleSafe("{requestPath: %s, cacheKey: %s, requestId: %d}", this.A05, this.A0A, Integer.valueOf(this.A00));
    }

    public C33301ch(String str) {
        this.A0B = str;
        this.A0C = AnonymousClass000.A0E(str, "-resp_info_gzip");
        this.A0A = AnonymousClass000.A0E(str, "-body_gzip");
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0052  */
    public static boolean A00(String str, String str2, C15220mX r8) {
        AnonymousClass1FV r2;
        C33371co r1;
        AnonymousClass1FY AF0 = r8.AF0(str);
        C33371co r3 = null;
        try {
            if (AF0.A01()) {
                AnonymousClass1FY ACn = r8.ACn(str2);
                if (ACn.A01()) {
                    r2 = (AnonymousClass1FV) AF0.A00();
                    try {
                        r1 = (C33371co) ACn.A00();
                    } catch (IOException unused) {
                        if (r3 != null) {
                        }
                        Closeables.A01(r2);
                        return false;
                    } catch (Throwable th) {
                        th = th;
                        if (r3 != null) {
                        }
                        Closeables.A01(r2);
                        throw th;
                    }
                    try {
                        FileChannel A012 = r2.A01();
                        A012.transferTo(0, A012.size(), r1.A02());
                        r1.A04();
                        r1.A03();
                        Closeables.A01(r2);
                        return true;
                    } catch (IOException unused2) {
                        r3 = r1;
                        if (r3 != null) {
                        }
                        Closeables.A01(r2);
                        return false;
                    } catch (Throwable th2) {
                        th = th2;
                        r3 = r1;
                        if (r3 != null) {
                        }
                        Closeables.A01(r2);
                        throw th;
                    }
                }
            }
            Closeables.A01((InputStream) null);
            return false;
        } catch (IOException unused3) {
            r2 = null;
            if (r3 != null) {
                r3.A03();
            }
            Closeables.A01(r2);
            return false;
        } catch (Throwable th3) {
            th = th3;
            r2 = null;
            if (r3 != null) {
                r3.A03();
            }
            Closeables.A01(r2);
            throw th;
        }
    }

    public final void A02(C15220mX r2) {
        A01();
        if (r2.A07(this.A0C)) {
            r2.Bac(this.A0C);
        }
        if (r2.A07(this.A0A)) {
            r2.Bac(this.A0A);
        }
    }
}
