package p000X;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;

/* renamed from: X.ADY */
public final class ADY {
    public int A00;
    public int A01;
    public Canvas A02;
    public final /* synthetic */ ADW A03;

    public ADY(ADW adw) {
        this.A03 = adw;
    }

    public static void A00(ADY ady) {
        int i;
        int i2;
        if (ady.A02 != null) {
            int i3 = ady.A00;
            ADW adw = ady.A03;
            if (adw.A04 == null) {
                i = 0;
            } else {
                i = adw.getMountItemCount();
            }
            while (true) {
                if (i3 >= i) {
                    i2 = ady.A01;
                    break;
                }
                C23225ADo aDo = ady.A03.A04[i3];
                if (aDo.A01.A05.A01 == Constants.ONE) {
                    i2 = i3 + 1;
                    break;
                }
                if (aDo.A03) {
                    ((Drawable) aDo.A02).draw(ady.A02);
                }
                i3++;
            }
            ady.A00 = i2;
        }
    }
}
