package p000X;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.0ma  reason: invalid class name and case insensitive filesystem */
public final class C15250ma {
    public static final Charset A09 = Charset.forName("US-ASCII");
    public int A00 = 0;
    public Writer A01;
    public final int A02;
    public final C15220mX A03;
    public final AnonymousClass0OT A04;
    public final File A05;
    public final File A06;
    public final File A07;
    public final File A08;

    public static void A00(C15250ma r5) {
        try {
            r5.A01 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(r5.A06, true), A09));
        } catch (IOException unused) {
            Writer writer = r5.A01;
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException unused2) {
                }
            }
            r5.A01 = null;
        }
    }

    public static void A01(File file, boolean z) {
        File[] listFiles;
        if (file != null && file.exists() && (listFiles = file.listFiles()) != null) {
            for (File file2 : listFiles) {
                String name = file2.getName();
                if ((name.endsWith(".tmp") || (z && (name.endsWith(".clean") || name.endsWith(".metadata")))) && file2.exists()) {
                    file2.delete();
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x00ad A[SYNTHETIC, Splitter:B:36:0x00ad] */
    public final void A02() {
        BufferedWriter bufferedWriter;
        ArrayList arrayList;
        Writer writer = this.A01;
        if (!(writer == null || writer == null)) {
            try {
                writer.close();
            } catch (IOException unused) {
            }
        }
        try {
            C15220mX r0 = this.A03;
            synchronized (r0.A07) {
                arrayList = new ArrayList(r0.A09.values());
            }
            this.A00 = arrayList.size();
            bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.A08), A09));
            try {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    C15270mc r1 = (C15270mc) it.next();
                    if (r1.A08()) {
                        bufferedWriter.write("CLEAN " + r1.A07 + ' ' + String.valueOf(r1.A00()) + 10);
                    } else {
                        bufferedWriter.write(AnonymousClass000.A0F("DIRTY ", r1.A07, 10));
                    }
                }
                bufferedWriter.flush();
                if (this.A06.exists()) {
                    this.A06.renameTo(this.A07);
                }
                this.A08.renameTo(this.A06);
                A00(this);
                this.A07.delete();
            } catch (IOException unused2) {
            } catch (Throwable th) {
                th = th;
                if (bufferedWriter != null) {
                }
                throw th;
            }
        } catch (IOException unused3) {
            bufferedWriter = null;
        } catch (Throwable th2) {
            th = th2;
            bufferedWriter = null;
            if (bufferedWriter != null) {
                try {
                    bufferedWriter.close();
                } catch (IOException unused4) {
                }
            }
            throw th;
        }
        if (bufferedWriter != null) {
            try {
                bufferedWriter.close();
            } catch (IOException unused5) {
            }
        }
    }

    public C15250ma(File file, C15220mX r4, AnonymousClass0OT r5, int i) {
        this.A06 = new File(file, "journal");
        this.A08 = new File(file, "journal.tmp");
        this.A07 = new File(file, "journal.bkp");
        this.A05 = file;
        this.A03 = r4;
        this.A04 = r5;
        this.A02 = Math.max(1000, i << 1);
    }
}
