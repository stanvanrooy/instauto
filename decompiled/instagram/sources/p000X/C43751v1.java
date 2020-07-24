package p000X;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.instagram.common.graphics.IgBitmapReference;
import com.instagram.common.graphics.IgBitmapReferenceFactory;

/* renamed from: X.1v1  reason: invalid class name and case insensitive filesystem */
public final class C43751v1 extends C252618c {
    public final C36491i8 A00(int i, byte[] bArr, int i2, float f, int i3, boolean z) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        if (AnonymousClass18Q.A06 && z) {
            options.inPreferredConfig = Bitmap.Config.RGB_565;
        }
        int i4 = i;
        options.inSampleSize = i;
        if (IgBitmapReferenceFactory.isIgBitmapReferenceSupported()) {
            int i5 = i2;
            IgBitmapReference nativeDecodeByteArray = IgBitmapReferenceFactory.nativeDecodeByteArray(bArr, 0, i2, options);
            if (nativeDecodeByteArray == null) {
                return null;
            }
            Bitmap orCreateBitmap = nativeDecodeByteArray.getOrCreateBitmap();
            nativeDecodeByteArray.makeDiscardable();
            return new C36491i8(orCreateBitmap, new AnonymousClass21L(this, i4, i5, orCreateBitmap.getByteCount(), i3, nativeDecodeByteArray));
        }
        throw new IllegalStateException("IgBitmapReference is not supported");
    }
}
