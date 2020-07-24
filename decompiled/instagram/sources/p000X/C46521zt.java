package p000X;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;

/* renamed from: X.1zt  reason: invalid class name and case insensitive filesystem */
public final class C46521zt {
    public final File A00;
    public final File A01;
    public final File A02;
    public final Random A03 = new Random();

    /* JADX WARNING: Removed duplicated region for block: B:40:0x0092 A[Catch:{ all -> 0x00db, all -> 0x00e0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0093 A[Catch:{ all -> 0x00db, all -> 0x00e0 }] */
    public final long A01() {
        long j;
        long j2;
        DataOutputStream dataOutputStream;
        DataInputStream dataInputStream;
        try {
            synchronized (this) {
                if (this.A02.exists() || this.A01.exists() || this.A00.exists() || this.A00.mkdirs()) {
                    C46531zu r6 = new C46531zu(this.A02);
                    try {
                        if (this.A01.exists()) {
                            try {
                                dataInputStream = new DataInputStream(new BufferedInputStream(new FileInputStream(this.A01), 16));
                                int readInt = dataInputStream.readInt();
                                if (readInt == 1) {
                                    j = dataInputStream.readLong();
                                    dataInputStream.close();
                                    if (j != 0) {
                                        j2 = A00();
                                    } else {
                                        int i = (int) (j >> 32);
                                        int i2 = (int) (j & -1);
                                        if (i == Integer.MAX_VALUE) {
                                            j2 = A00();
                                        } else {
                                            j2 = (((long) i2) & 4294967295L) | (((long) (i + 1)) << 32);
                                        }
                                    }
                                    dataOutputStream = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(this.A01), 16));
                                    dataOutputStream.writeInt(1);
                                    dataOutputStream.writeLong(j2);
                                    dataOutputStream.close();
                                    r6.close();
                                } else {
                                    throw new IOException(AnonymousClass000.A05("expected 1; got ", readInt));
                                }
                            } catch (IOException e) {
                                AnonymousClass0DB.A0Q("BeaconIdGenerator", e, "Failure reading beacon id file %s", this.A01);
                            } catch (Throwable th) {
                                dataInputStream.close();
                                throw th;
                            }
                        }
                        j = 0;
                        if (j != 0) {
                        }
                        dataOutputStream = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(this.A01), 16));
                        dataOutputStream.writeInt(1);
                        dataOutputStream.writeLong(j2);
                        dataOutputStream.close();
                        r6.close();
                    } catch (Throwable th2) {
                        r6.close();
                        throw th2;
                    }
                } else {
                    throw new IOException("Cannot create " + this.A00);
                }
            }
            return j2;
        } catch (IOException e2) {
            AnonymousClass0DB.A0N("BeaconIdGenerator", e2, "Failed to increment beacon id");
            return A00();
        }
    }

    private long A00() {
        return (((long) this.A03.nextInt()) & 4294967295L) | (((long) 0) << 32);
    }

    public C46521zt(File file) {
        this.A00 = file;
        this.A02 = new File(file, "beacon_id.lock");
        this.A01 = new File(file, "beacon_id");
    }
}
