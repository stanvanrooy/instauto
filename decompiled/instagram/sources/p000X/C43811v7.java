package p000X;

import android.graphics.Bitmap;

/* renamed from: X.1v7  reason: invalid class name and case insensitive filesystem */
public final class C43811v7 extends C252618c {
    public final C36491i8 A00(int i, byte[] bArr, int i2, float f, int i3, boolean z) {
        int i4 = i2;
        int i5 = i;
        Bitmap A00 = AnonymousClass186.A00(bArr, i2, i, f, z);
        if (A00 == null) {
            return null;
        }
        A00.prepareToDraw();
        return new C36491i8(A00, new AnonymousClass21M(this, i5, i4, A00.getByteCount(), i3, A00));
    }
}
