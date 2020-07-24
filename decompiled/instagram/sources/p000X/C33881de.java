package p000X;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* renamed from: X.1de  reason: invalid class name and case insensitive filesystem */
public final class C33881de extends InputStream {
    public final /* synthetic */ AnonymousClass1C9 A00;

    public C33881de(AnonymousClass1C9 r1) {
        this.A00 = r1;
    }

    public final void close() {
        while (!this.A00.A09) {
            AnonymousClass1C9 r1 = this.A00;
            r1.A07.release();
            try {
                r1.A06.acquire();
            } catch (InterruptedException unused) {
                throw new RuntimeException("Interrupted while waiting for byte stream.");
            }
        }
        AnonymousClass0a4.A09(this.A00.A09);
        AnonymousClass1C9 r12 = this.A00;
        r12.A01 = true;
        if (r12.A08 != null) {
            throw this.A00.A08;
        }
    }

    public final void finalize() {
        super.finalize();
        AnonymousClass1C9 r2 = this.A00;
        if (!r2.A01) {
            AnonymousClass0QD.A02("HttpEngine", "Input stream not closed for uri: " + r2.A04);
        }
    }

    public final int read() {
        AnonymousClass1C9.A00(this.A00);
        if (this.A00.A08 != null) {
            throw this.A00.A08;
        } else if (this.A00.A09) {
            return -1;
        } else {
            return this.A00.A05.get();
        }
    }

    public final int read(byte[] bArr, int i, int i2) {
        AnonymousClass1C9.A00(this.A00);
        if (this.A00.A08 != null) {
            throw this.A00.A08;
        } else if (this.A00.A09) {
            return -1;
        } else {
            if (this.A00.A07.availablePermits() > 0) {
                AnonymousClass0QD.A01("HttpMessageExchange_concurrency", "HttpMessageExchange.mByteBuffer is now open to multiple threads read and write to it");
                this.A00.A07.drainPermits();
            }
            int min = Math.min(Math.min(bArr.length - i, this.A00.A05.remaining()), i2);
            System.arraycopy(this.A00.A05.array(), this.A00.A05.position(), bArr, i, min);
            ByteBuffer byteBuffer = this.A00.A05;
            byteBuffer.position(byteBuffer.position() + min);
            return min;
        }
    }
}
