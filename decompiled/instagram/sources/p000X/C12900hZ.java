package p000X;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Serializable;
import java.io.StringReader;
import java.io.Writer;
import java.lang.ref.SoftReference;

/* renamed from: X.0hZ  reason: invalid class name and case insensitive filesystem */
public class C12900hZ implements C12910ha, Serializable {
    public static final C12970hg A07 = C12940hd.A05;
    public static final int A08;
    public static final int A09;
    public static final int A0A = C12920hb.A00();
    public static final ThreadLocal A0B = new ThreadLocal();
    public int A00;
    public C3U A01;
    public int A02;
    public int A03;
    public C12970hg A04;
    public final transient C13000hj A05;
    public final transient C12980hh A06;

    static {
        int i = 0;
        for (Integer intValue : Constants.ZERO(2)) {
            i |= 1 << intValue.intValue();
        }
        A08 = i;
        int i2 = 0;
        for (C12930hc r1 : C12930hc.values()) {
            if (r1.A01) {
                i2 |= r1.A00;
            }
        }
        A09 = i2;
    }

    public final C13460iZ A04(OutputStream outputStream, Integer num) {
        Writer outputStreamWriter;
        C13030hm A0C = A0C(outputStream, false);
        Integer num2 = Constants.ZERO;
        if (num == num2) {
            return A03(outputStream, A0C);
        }
        if (num == num2) {
            outputStreamWriter = new BZP(A0C, outputStream);
        } else {
            outputStreamWriter = new OutputStreamWriter(outputStream, C206058rv.A00(num));
        }
        return A06(outputStreamWriter, A0C);
    }

    public final C13460iZ A05(Writer writer) {
        return A06(writer, A0C(writer, false));
    }

    public C13080hr A07(File file) {
        return A09(new FileInputStream(file), A0C(file, true));
    }

    public C13080hr A08(InputStream inputStream) {
        return A09(inputStream, A0C(inputStream, false));
    }

    public C13080hr A0B(byte[] bArr) {
        return new C13670j2(A0C(bArr, true), bArr, bArr.length).A00(this.A00, this.A01, this.A05, this.A06, A0D(Constants.ONE), A0D(Constants.ZERO));
    }

    public static final C13040hn A01() {
        C13040hn r0;
        SoftReference softReference = (SoftReference) A0B.get();
        if (softReference == null) {
            r0 = null;
        } else {
            r0 = (C13040hn) softReference.get();
        }
        if (r0 != null) {
            return r0;
        }
        C13040hn r02 = new C13040hn();
        A0B.set(new SoftReference(r02));
        return r02;
    }

    public final C13460iZ A02(File file, Integer num) {
        Writer outputStreamWriter;
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        C13030hm A0C = A0C(fileOutputStream, true);
        Integer num2 = Constants.ZERO;
        if (num == num2) {
            return A03(fileOutputStream, A0C);
        }
        if (num == num2) {
            outputStreamWriter = new BZP(A0C, fileOutputStream);
        } else {
            outputStreamWriter = new OutputStreamWriter(fileOutputStream, C206058rv.A00(num));
        }
        return A06(outputStreamWriter, A0C);
    }

    public final C13460iZ A03(OutputStream outputStream, C13030hm r5) {
        C22880z9 r2 = new C22880z9(r5, this.A03, this.A01, outputStream);
        C12970hg r1 = this.A04;
        if (r1 != A07) {
            r2.A01 = r1;
        }
        return r2;
    }

    public final C13460iZ A06(Writer writer, C13030hm r5) {
        C13430iW r2 = new C13430iW(r5, this.A03, this.A01, writer);
        C12970hg r1 = this.A04;
        if (r1 != A07) {
            r2.A01 = r1;
        }
        return r2;
    }

    public final C13080hr A09(InputStream inputStream, C13030hm r10) {
        return new C13670j2(r10, inputStream).A00(this.A00, this.A01, this.A05, this.A06, A0D(Constants.ONE), A0D(Constants.ZERO));
    }

    public C13080hr A0A(String str) {
        StringReader stringReader = new StringReader(str);
        return new C13050ho(A0C(stringReader, true), this.A00, stringReader, this.A01, this.A06.A00(A0D(Constants.ONE), A0D(Constants.ZERO)));
    }

    public final C13030hm A0C(Object obj, boolean z) {
        return new C13030hm(A01(), obj, z);
    }

    public final boolean A0D(Integer num) {
        if (((1 << num.intValue()) & this.A02) != 0) {
            return true;
        }
        return false;
    }

    public final AnonymousClass4UF Btl() {
        return C3O.A00;
    }

    public C12900hZ() {
        this((C3U) null);
    }

    public C12900hZ(C3U c3u) {
        long currentTimeMillis = System.currentTimeMillis();
        C12980hh r0 = C12980hh.A0B;
        this.A06 = new C12980hh((C12980hh) null, true, true, r0.A07, r0.A06, r0.A02, (((int) currentTimeMillis) + ((int) (currentTimeMillis >>> 32))) | 1, r0.A01);
        long currentTimeMillis2 = System.currentTimeMillis();
        this.A05 = new C13000hj((((int) currentTimeMillis2) + ((int) (currentTimeMillis2 >>> 32))) | 1);
        this.A02 = A08;
        this.A00 = A0A;
        this.A03 = A09;
        this.A04 = A07;
        this.A01 = c3u;
    }
}
