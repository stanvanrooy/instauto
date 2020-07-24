package p000X;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.lang.ref.WeakReference;

/* renamed from: X.18b  reason: invalid class name and case insensitive filesystem */
public final class C252518b extends C252618c {
    public final /* synthetic */ AnonymousClass188 A00;

    public C252518b(AnonymousClass188 r1) {
        this.A00 = r1;
    }

    public final C36491i8 A00(int i, byte[] bArr, int i2, float f, int i3, boolean z) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        if (AnonymousClass18Q.A06 && z) {
            options.inPreferredConfig = Bitmap.Config.RGB_565;
        }
        int i4 = i;
        if (i != 1) {
            options.inSampleSize = i;
        }
        int i5 = i2;
        float f2 = f;
        Bitmap A002 = AnonymousClass18Q.A00(bArr, i2, options, f, this.A00);
        if (A002 == null) {
            return null;
        }
        return new C36491i8(A002, new C36481i7(this, i4, i5, A002.getByteCount(), i3, f2, new WeakReference(A002)));
    }
}
