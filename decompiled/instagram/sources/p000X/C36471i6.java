package p000X;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: X.1i6  reason: invalid class name and case insensitive filesystem */
public final class C36471i6 extends C252618c {
    public final /* synthetic */ AnonymousClass188 A00;
    public final /* synthetic */ Method A01;

    public C36471i6(AnonymousClass188 r1, Method method) {
        this.A00 = r1;
        this.A01 = method;
    }

    public final C36491i8 A00(int i, byte[] bArr, int i2, float f, int i3, boolean z) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        if (AnonymousClass18Q.A06 && z) {
            options.inPreferredConfig = Bitmap.Config.RGB_565;
        }
        int i4 = i;
        if (i != 1) {
            options = new BitmapFactory.Options();
            options.inPurgeable = true;
            options.inInputShareable = false;
            options.inSampleSize = i;
        }
        int i5 = i2;
        float f2 = f;
        Bitmap A002 = AnonymousClass18Q.A00(bArr, i2, options, f, this.A00);
        if (A002 == null) {
            return null;
        }
        try {
            Bitmap bitmap = (Bitmap) this.A01.invoke(A002, new Object[0]);
            bitmap.prepareToDraw();
            return new C36491i8(bitmap, new C36561iF(this, i4, i5, bitmap.getByteCount(), i3, f2, bitmap));
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }
}
