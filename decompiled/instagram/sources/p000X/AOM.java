package p000X;

import android.content.Context;
import android.graphics.Bitmap;
import android.media.MediaScannerConnection;
import java.io.File;

/* renamed from: X.AOM */
public final class AOM extends AWZ {
    public final /* synthetic */ AQ5 A00;
    public final /* synthetic */ String A01;

    public AOM(AQ5 aq5, String str) {
        this.A00 = aq5;
        this.A01 = str;
    }

    public final void A03(Exception exc) {
        this.A00.A0V.A00(new C23588ASm("saveFrameToFile", (String) null, exc));
    }

    public final /* bridge */ /* synthetic */ void A04(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        try {
            File file = new File(this.A01);
            Context context = this.A00.A03;
            boolean A0G = C72663Gk.A0G(bitmap, file);
            if (A0G) {
                MediaScannerConnection.scanFile(context, new String[]{file.getAbsolutePath()}, (String[]) null, (MediaScannerConnection.OnScanCompletedListener) null);
            }
            if (A0G) {
                AWN.A00((AWN) null);
            }
        } finally {
            bitmap.recycle();
        }
    }
}
