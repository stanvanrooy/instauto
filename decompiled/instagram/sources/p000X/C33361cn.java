package p000X;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.channels.FileChannel;

/* renamed from: X.1cn  reason: invalid class name and case insensitive filesystem */
public final class C33361cn extends C33371co {
    public C15270mc A00;
    public C15220mX A01;

    public final synchronized void A03() {
        if (!this.A00) {
            synchronized (this) {
                A00();
                close();
                this.A00 = true;
                this.A01.A06(this.A00);
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:63|64|(0)|69|70) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:69:0x00e8 */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0075 A[SYNTHETIC, Splitter:B:26:0x0075] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x007d A[SYNTHETIC, Splitter:B:33:0x007d] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x009f A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00e5 A[SYNTHETIC, Splitter:B:67:0x00e5] */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x00eb  */
    public final synchronized boolean A04() {
        boolean z;
        C56252cB r11;
        File A02;
        long j;
        boolean z2;
        boolean z3;
        boolean z4;
        A00();
        close();
        z = true;
        this.A00 = true;
        if (this.A01) {
            this.A01.A06(this.A00);
            this.A01.Bac(this.A00.A07);
            z = false;
        } else {
            C15220mX r5 = this.A01;
            C15270mc r4 = this.A00;
            File file = new File(r4.A06, AnonymousClass000.A0E(r4.A07, ".tmp"));
            boolean z5 = false;
            if (!file.exists()) {
                r4.A05((C33371co) null);
                r4.A06((C56252cB) null, false);
            } else {
                synchronized (r4) {
                    r11 = r4.A00;
                }
                if (r11 != null) {
                    BufferedWriter bufferedWriter = null;
                    try {
                        BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(r4.A03(), false), C56252cB.A01));
                        try {
                            bufferedWriter2.write(r11.A00.toString());
                            bufferedWriter2.flush();
                            try {
                                bufferedWriter2.close();
                            } catch (IOException unused) {
                            }
                            z3 = true;
                        } catch (IOException unused2) {
                            bufferedWriter = bufferedWriter2;
                            if (bufferedWriter != null) {
                            }
                            z3 = false;
                            if (!z3) {
                            }
                            A02 = r4.A02();
                            if (file.renameTo(A02)) {
                            }
                            if (z5) {
                            }
                            r5.A06(r4);
                            r5.Bac(r4.A07);
                            return z;
                        } catch (Throwable th) {
                            th = th;
                            bufferedWriter = bufferedWriter2;
                            if (bufferedWriter != null) {
                            }
                            throw th;
                        }
                    } catch (IOException unused3) {
                        if (bufferedWriter != null) {
                            try {
                                bufferedWriter.close();
                            } catch (IOException unused4) {
                            }
                        }
                        z3 = false;
                        if (!z3) {
                        }
                        A02 = r4.A02();
                        if (file.renameTo(A02)) {
                        }
                        if (z5) {
                        }
                        r5.A06(r4);
                        r5.Bac(r4.A07);
                        return z;
                    } catch (Throwable th2) {
                        th = th2;
                        if (bufferedWriter != null) {
                            bufferedWriter.close();
                        }
                        throw th;
                    }
                    if (!z3) {
                        synchronized (r4) {
                            z4 = r4.A01;
                        }
                        if (z4) {
                            z5 = true;
                        }
                    }
                } else {
                    File A03 = r4.A03();
                    if (A03.exists()) {
                        z5 = !A03.delete();
                    }
                }
                A02 = r4.A02();
                if (file.renameTo(A02) || z5) {
                    if (z5) {
                        AnonymousClass0QD.A01("IgDiskCache", "Failed to commit because of metadata error");
                    }
                    r5.A06(r4);
                    r5.Bac(r4.A07);
                } else {
                    File A032 = r4.A03();
                    long A002 = r4.A00();
                    long length = A02.length();
                    if (A032.exists()) {
                        j = A032.length();
                    } else {
                        j = 0;
                    }
                    long j2 = length + j;
                    synchronized (r4) {
                        z2 = r4.A01;
                    }
                    r4.A04(j2, z2);
                    r5.A0B.getAndAdd(j2 - A002);
                    AnonymousClass18J r1 = r5.A02;
                    if (r1 != null && r1.A02(r4.A07, r4)) {
                        r5.A02.A01(r4.A07, j2);
                    }
                }
            }
            C15220mX.A03(r5, r4);
        }
        return z;
    }

    public C33361cn(C15270mc r6, C15220mX r7) {
        super(new FileOutputStream(new File(r6.A06, AnonymousClass000.A0E(r6.A07, ".tmp"))));
        this.A01 = r7;
        this.A00 = r6;
    }

    private void A00() {
        if (this.A00) {
            throw new IllegalStateException("Try to operate on an EditorOutputStream that is already closed");
        } else if (this.A00.A01() != this) {
            throw new IllegalStateException("Two editors trying to write to the same cached file");
        }
    }

    public final FileDescriptor A01() {
        return ((FileOutputStream) this.A02).getFD();
    }

    public final FileChannel A02() {
        return ((FileOutputStream) this.A02).getChannel();
    }
}
