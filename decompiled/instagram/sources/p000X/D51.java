package p000X;

import android.net.Uri;
import com.google.android.exoplayer2.Format;
import java.io.EOFException;

/* renamed from: X.D51 */
public final class D51 implements C29687D4y {
    public final void AEh(Format format) {
    }

    public final void BeM(long j, int i, int i2, int i3, C29719D6g d6g) {
    }

    public final void Btd(Uri uri) {
    }

    public final int BeJ(C29778D9m d9m, int i, boolean z) {
        int Bop = d9m.Bop(i);
        if (Bop != -1) {
            return Bop;
        }
        if (z) {
            return -1;
        }
        throw new EOFException();
    }

    public final void BeK(D9O d9o, int i) {
        d9o.A0D(i);
    }
}
