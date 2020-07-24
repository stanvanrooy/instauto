package p000X;

import java.io.DataInputStream;
import java.io.EOFException;
import java.nio.ByteOrder;

/* renamed from: X.BAt */
public final class BAt {
    public int A00;
    public int A01;
    public final BAt A02;
    public final DataInputStream A03;

    private void A00() {
        int i;
        int i2 = this.A01;
        if (i2 >= 0 && (i = this.A00) > i2) {
            throw new EOFException(AnonymousClass000.A07("Invalid access: limit=", i2, ", consumed=", i));
        }
    }

    public final byte A01() {
        this.A00++;
        A00();
        DataInputStream dataInputStream = this.A03;
        if (dataInputStream != null) {
            return dataInputStream.readByte();
        }
        BAt bAt = this.A02;
        if (bAt != null) {
            return bAt.A01();
        }
        throw new NullPointerException("Source input stream was not setup.");
    }

    public final int A02() {
        this.A00 += 4;
        A00();
        DataInputStream dataInputStream = this.A03;
        if (dataInputStream != null) {
            int readInt = dataInputStream.readInt();
            if (ByteOrder.nativeOrder().equals(ByteOrder.LITTLE_ENDIAN)) {
                return Integer.reverseBytes(readInt);
            }
            return readInt;
        }
        BAt bAt = this.A02;
        if (bAt != null) {
            return bAt.A02();
        }
        throw new NullPointerException("Source input stream was not setup.");
    }

    public final short A03() {
        this.A00 += 2;
        A00();
        DataInputStream dataInputStream = this.A03;
        if (dataInputStream != null) {
            short readShort = dataInputStream.readShort();
            if (ByteOrder.nativeOrder().equals(ByteOrder.LITTLE_ENDIAN)) {
                return Short.reverseBytes(readShort);
            }
            return readShort;
        }
        BAt bAt = this.A02;
        if (bAt != null) {
            return bAt.A03();
        }
        throw new NullPointerException("Source input stream was not setup.");
    }

    public final void A04(int i) {
        this.A00 += i;
        A00();
        DataInputStream dataInputStream = this.A03;
        if (dataInputStream != null) {
            dataInputStream.skipBytes(i);
            return;
        }
        BAt bAt = this.A02;
        if (bAt != null) {
            bAt.A04(i);
            return;
        }
        throw new NullPointerException("Source input stream was not setup.");
    }

    public final void A05(byte[] bArr) {
        this.A00 += bArr.length;
        A00();
        DataInputStream dataInputStream = this.A03;
        if (dataInputStream != null) {
            dataInputStream.readFully(bArr);
            return;
        }
        BAt bAt = this.A02;
        if (bAt != null) {
            bAt.A05(bArr);
            return;
        }
        throw new NullPointerException("Source input stream was not setup.");
    }

    public BAt(BAt bAt) {
        this.A03 = null;
        this.A02 = bAt;
    }

    public BAt(DataInputStream dataInputStream) {
        this.A03 = dataInputStream;
        this.A02 = null;
    }
}
