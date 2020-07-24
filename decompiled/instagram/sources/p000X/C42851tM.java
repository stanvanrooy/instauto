package p000X;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import com.instagram.creation.photo.util.ExifImageData;
import java.io.IOException;

/* renamed from: X.1tM  reason: invalid class name and case insensitive filesystem */
public final class C42851tM extends AnonymousClass1N0 {
    public static final Bitmap.CompressFormat A01 = Bitmap.CompressFormat.JPEG;
    public final C184027tf A00;

    public C42851tM(Context context, Uri uri, Uri uri2) {
        super(context);
        this.A00 = new C184027tf(uri, uri2, context, false);
    }

    public final /* bridge */ /* synthetic */ Object A08() {
        try {
            return this.A00.call();
        } catch (IOException unused) {
            return new C183117rv((C89043tP) null, (ExifImageData) null, (Bitmap) null);
        } catch (Exception e) {
            AnonymousClass0QD.A07("LoadImageTask_UnknownError", "Caught unknown error", e);
            return new C183117rv((C89043tP) null, (ExifImageData) null, (Bitmap) null);
        }
    }
}
