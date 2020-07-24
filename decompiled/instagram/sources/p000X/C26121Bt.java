package p000X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.UUID;

/* renamed from: X.1Bt  reason: invalid class name and case insensitive filesystem */
public final class C26121Bt {
    public static File A00;
    public static File A01;

    public static File A01(Context context) {
        if (A01 == null) {
            File file = A00;
            if (file == null) {
                file = C26111Bs.A00(context);
                A00 = file;
            }
            File file2 = new File(file, "decors");
            A01 = file2;
            file2.mkdirs();
        }
        return A01;
    }

    public static String A04(String str, String str2) {
        return AnonymousClass000.A0N(str, "_", UUID.randomUUID().toString(), str2);
    }

    public static File A00(Context context) {
        String A04 = A04("quick_cam_decor", ".png");
        File file = new File(A01(context), A04);
        try {
            file.createNewFile();
            return file;
        } catch (IOException unused) {
            return new File(AnonymousClass19M.A01(), A04);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001f, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0023 */
    public static String A02(Bitmap bitmap, Context context) {
        File A002 = A00(context);
        try {
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(A002));
            bitmap.compress(Bitmap.CompressFormat.PNG, 100, bufferedOutputStream);
            bufferedOutputStream.close();
            return A002.getCanonicalPath();
        } catch (Exception e) {
            AnonymousClass0QD.A05("PhotoStorageUtil", "Failed while trying to save bitmap decor image", e);
            throw new RuntimeException(e);
        } catch (Throwable ) {
            throw th;
        }
    }

    public static String A03(Drawable drawable, Context context) {
        Rect bounds = drawable.getBounds();
        Bitmap createBitmap = Bitmap.createBitmap(bounds.width(), bounds.height(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        canvas.save();
        canvas.translate((float) (-bounds.left), (float) (-bounds.top));
        drawable.draw(canvas);
        canvas.restore();
        return A02(createBitmap, context);
    }
}
