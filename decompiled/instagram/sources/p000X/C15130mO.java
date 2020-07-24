package p000X;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.0mO  reason: invalid class name and case insensitive filesystem */
public final class C15130mO {
    public static final Charset A08 = Charset.forName("US-ASCII");
    public C15200mV A00;
    public AtomicInteger A01;
    public boolean A02;
    public final AnonymousClass0OT A03;
    public final File A04;
    public final String A05;
    public final int A06;
    public final List A07 = new LinkedList();

    public final void A01(C06590Pq r4) {
        LinkedList linkedList;
        synchronized (this) {
            linkedList = new LinkedList(this.A07);
            this.A07.clear();
        }
        this.A03.ADc(new C62722oG(this, linkedList, r4));
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x009c A[SYNTHETIC, Splitter:B:23:0x009c] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00a6 A[SYNTHETIC, Splitter:B:30:0x00a6] */
    /* JADX WARNING: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    public static void A00(C15130mO r8, List list) {
        File file = r8.A04;
        if (file != null) {
            BufferedWriter bufferedWriter = null;
            try {
                if (!file.exists()) {
                    r8.A04.createNewFile();
                }
                BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(r8.A04, true), A08));
                try {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        C15260mb r5 = (C15260mb) it.next();
                        bufferedWriter2.write(r5.A04 + "@" + r5.A00 + "@" + r5.A01 + "@" + r5.A05 + "@" + r5.A02 + "@" + r5.A03 + C15260mb.A06);
                    }
                    try {
                        bufferedWriter2.close();
                    } catch (IOException unused) {
                    }
                } catch (IOException e) {
                    e = e;
                    bufferedWriter = bufferedWriter2;
                    try {
                        AnonymousClass0QD.A01("IgCacheLoggerImpl", C06360Ot.formatString("IOException found for file %s. Error message: %s", r8.A04.getName(), e.getLocalizedMessage()));
                        if (bufferedWriter == null) {
                        }
                    } catch (Throwable th) {
                        th = th;
                        if (bufferedWriter != null) {
                            try {
                                bufferedWriter.close();
                            } catch (IOException unused2) {
                            }
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    bufferedWriter = bufferedWriter2;
                    if (bufferedWriter != null) {
                    }
                    throw th;
                }
            } catch (IOException e2) {
                e = e2;
                AnonymousClass0QD.A01("IgCacheLoggerImpl", C06360Ot.formatString("IOException found for file %s. Error message: %s", r8.A04.getName(), e.getLocalizedMessage()));
                if (bufferedWriter == null) {
                    bufferedWriter.close();
                }
            }
        } else {
            throw new IllegalStateException("File pointer should never be null if constructor did not throw an exception");
        }
    }

    public final void A02(String str, int i, int i2, String str2, long j) {
        C15260mb r2 = new C15260mb(Integer.toHexString(str.hashCode()), i, i2, str2, j);
        if (!this.A02 || !this.A00.A00(r2)) {
            synchronized (this) {
                if (this.A07.size() > this.A06) {
                    LinkedList linkedList = new LinkedList(this.A07);
                    this.A07.clear();
                    this.A03.ADc(new AnonymousClass2CW(this, linkedList));
                } else {
                    this.A07.add(r2);
                }
            }
        }
    }

    public C15130mO(File file, String str, int i) {
        this.A05 = str;
        this.A06 = i;
        File file2 = new File(file, C06360Ot.formatString("%s%s", str, "v3"));
        this.A04 = file2;
        if (!file2.exists()) {
            this.A04.createNewFile();
        }
        AnonymousClass0O1 A002 = AnonymousClass0O1.A00();
        A002.A01 = "IgCacheLogger";
        this.A03 = A002.A01();
        this.A01 = new AtomicInteger();
        this.A03.ADc(new C15160mR(this));
    }
}
