package p000X;

import android.app.Notification;
import android.graphics.Bitmap;

/* renamed from: X.B4Z */
public final class B4Z extends AnonymousClass2O6 {
    public Bitmap A00;
    public boolean A01;

    public final void A00(C59712i5 r3) {
        Notification.BigPictureStyle bigPicture = new Notification.BigPictureStyle(r3.AHL()).setBigContentTitle((CharSequence) null).bigPicture(this.A00);
        if (this.A01) {
            bigPicture.bigLargeIcon((Bitmap) null);
        }
        if (this.A02) {
            bigPicture.setSummaryText(this.A01);
        }
    }

    public B4Z() {
    }

    public B4Z(AnonymousClass2O4 r1) {
        A01(r1);
    }
}
