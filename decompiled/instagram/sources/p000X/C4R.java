package p000X;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapRegionDecoder;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.media.ExifInterface;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.Callable;

/* renamed from: X.C4R */
public final class C4R implements Callable {
    public final /* synthetic */ C88583se A00;
    public final /* synthetic */ C4Q A01;
    public final /* synthetic */ byte[] A02;

    public C4R(C4Q c4q, byte[] bArr, C88583se r3) {
        this.A01 = c4q;
        this.A02 = bArr;
        this.A00 = r3;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        Rect rect;
        C4X c4x = (C4X) this.A01.A0C.get();
        if (c4x != null) {
            C4Q c4q = this.A01;
            String A002 = C5N.A00(c4q.A06, c4q.A00);
            if (A002 == null) {
                C4Q.A00(c4q);
            } else {
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(A002);
                    BitmapFactory.Options options = new BitmapFactory.Options();
                    options.inJustDecodeBounds = true;
                    byte[] bArr = this.A02;
                    BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
                    Rect rect2 = this.A00.A03;
                    C4Q c4q2 = this.A01;
                    byte[] bArr2 = this.A02;
                    int width = rect2.width();
                    int height = rect2.height();
                    int AHg = c4x.AHg();
                    int AHf = c4x.AHf();
                    int i = options.outWidth;
                    int i2 = options.outHeight;
                    if (c4q2.A0D || c4q2.A06.A0D) {
                        Rect A012 = C27249C4z.A01(width, height, i, i2);
                        Rect A013 = C27249C4z.A01(AHg, AHf, A012.width(), A012.height());
                        rect = new Rect(A013.top, i2 - A013.right, A013.bottom, i2 - A013.left);
                    } else {
                        Rect A003 = C5T.A00(c4x.AK7(), c4q2.A05, AHg, AHf);
                        Rect A014 = C27249C4z.A01(width, height, i, i2);
                        Rect A015 = C27249C4z.A01(AHg, AHf, A014.width(), A014.height());
                        float width2 = ((float) A015.width()) / ((float) AHg);
                        int i3 = A014.left;
                        int i4 = A015.left;
                        float f = (float) (i3 + i4);
                        float f2 = ((float) A003.left) * width2;
                        int i5 = A014.top;
                        int i6 = A015.top;
                        float f3 = ((float) A003.top) * width2;
                        int i7 = (int) (((float) (i5 + i6)) + f3);
                        int i8 = (int) (((float) (A014.right - i4)) - f2);
                        int i9 = (int) (((float) (A014.bottom - i6)) - f3);
                        int i10 = i2 - i8;
                        int i11 = i2 - ((int) (f + f2));
                        int min = Math.min((int) (((float) (i9 - i7)) * 0.2f), (int) (0.2f * ((float) (i11 - i10))));
                        rect = new Rect(Math.max(i7 - min, 0), Math.max(i10 - min, 0), Math.min(i9 + min, i), Math.min(i11 + min, i2));
                    }
                    Bitmap decodeRegion = BitmapRegionDecoder.newInstance(bArr2, 0, bArr2.length, true).decodeRegion(rect, (BitmapFactory.Options) null);
                    Matrix matrix = new Matrix();
                    matrix.postRotate(90.0f);
                    Bitmap.createBitmap(decodeRegion, 0, 0, decodeRegion.getWidth(), decodeRegion.getHeight(), matrix, true).compress(Bitmap.CompressFormat.JPEG, 90, fileOutputStream);
                    if (this.A00.A02.width() > this.A00.A02.height()) {
                        ExifInterface exifInterface = new ExifInterface(A002);
                        exifInterface.setAttribute("Orientation", "6");
                        exifInterface.saveAttributes();
                    }
                } catch (FileNotFoundException | IOException unused) {
                    C4Q.A00(this.A01);
                }
                return true;
            }
        }
        return false;
    }
}
