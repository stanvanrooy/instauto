package p000X;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashSet;
import java.util.Map;

/* renamed from: X.0lF  reason: invalid class name and case insensitive filesystem */
public final class C14630lF implements Runnable {
    public final /* synthetic */ C14610lD A00;

    public C14630lF(C14610lD r1) {
        this.A00 = r1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00c5, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:42:0x00c9 */
    public final void run() {
        AnonymousClass0ZL.A01("LightSharedPreferences.tryLoadSharedPreference", -157432371);
        try {
            synchronized (this.A00.A02) {
                C14610lD r0 = this.A00;
                C14620lE r6 = r0.A01;
                Map map = r0.A04;
                if (r6.A00.exists()) {
                    try {
                        DataInputStream dataInputStream = new DataInputStream(new BufferedInputStream(new FileInputStream(r6.A00), 512));
                        int readUnsignedByte = dataInputStream.readUnsignedByte();
                        if (readUnsignedByte == 1) {
                            int readInt = dataInputStream.readInt();
                            while (true) {
                                int i = readInt - 1;
                                if (readInt > 0) {
                                    int readUnsignedByte2 = dataInputStream.readUnsignedByte();
                                    String readUTF = dataInputStream.readUTF();
                                    switch (readUnsignedByte2) {
                                        case 0:
                                            map.put(readUTF, Boolean.valueOf(dataInputStream.readBoolean()));
                                            break;
                                        case 1:
                                            map.put(readUTF, Integer.valueOf(dataInputStream.readInt()));
                                            break;
                                        case 2:
                                            map.put(readUTF, Long.valueOf(dataInputStream.readLong()));
                                            break;
                                        case 3:
                                            map.put(readUTF, Float.valueOf(dataInputStream.readFloat()));
                                            break;
                                        case 4:
                                            map.put(readUTF, Double.valueOf(dataInputStream.readDouble()));
                                            break;
                                        case 5:
                                            map.put(readUTF, dataInputStream.readUTF());
                                            break;
                                        case 6:
                                            int readInt2 = dataInputStream.readInt();
                                            HashSet hashSet = new HashSet(readInt2);
                                            while (true) {
                                                int i2 = readInt2 - 1;
                                                if (readInt2 <= 0) {
                                                    map.put(readUTF, hashSet);
                                                    break;
                                                } else {
                                                    hashSet.add(dataInputStream.readUTF());
                                                    readInt2 = i2;
                                                }
                                            }
                                        default:
                                            throw new IllegalArgumentException(AnonymousClass000.A05("Unsupported type with ordinal: ", readUnsignedByte2));
                                    }
                                    readInt = i;
                                } else {
                                    dataInputStream.close();
                                }
                            }
                        } else {
                            throw new C45401xo(AnonymousClass000.A05("Expected version 1; got ", readUnsignedByte));
                        }
                    } catch (C45401xo | IOException | ArrayStoreException e) {
                        AnonymousClass0DB.A0B(C14620lE.class, e, "Failed to read or parse SharedPreferences from: %s; Raw file: %s", r6.A00.getAbsolutePath(), r6.A00());
                        r6.A00.delete();
                    } catch (Throwable ) {
                        throw th;
                    }
                }
            }
        } finally {
            this.A00.A09 = true;
            this.A00.A05.countDown();
            AnonymousClass0ZL.A00(1959940098);
        }
    }
}
