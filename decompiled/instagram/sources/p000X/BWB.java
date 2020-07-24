package p000X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.SystemClock;
import java.io.File;
import java.util.EnumSet;

/* renamed from: X.BWB */
public final class BWB extends C28726Clh {
    public float A00;
    public long A01;
    public Bitmap A02;
    public String A03;
    public String A04;
    public EnumSet A05 = EnumSet.noneOf(C25697BVs.class);
    public boolean A06;
    public float A07;
    public float A08;
    public final float A09;
    public final Paint A0A = new Paint(1);

    public final void A0B() {
        int height = this.A07.A07.getHeight();
        float f = this.A09;
        this.A08 = ((float) 0) + f;
        this.A07 = (((float) (height - 0)) - this.A00) - f;
    }

    public final void A0C(Canvas canvas) {
        if (!this.A05.contains(C25697BVs.OSM) && this.A05.contains(C25697BVs.HERE)) {
            Bitmap bitmap = this.A02;
            if (bitmap != null) {
                canvas.drawBitmap(bitmap, this.A08, this.A07, this.A0A);
            } else if (!this.A06 && SystemClock.uptimeMillis() - this.A01 > 10000) {
                this.A06 = true;
                this.A01 = SystemClock.uptimeMillis();
                C25694BVp.A01(new BWA(this));
            }
        }
    }

    public BWB(C28721Clc clc) {
        super(clc);
        String str;
        if (this.A0A >= 2.0f) {
            str = "https://www.facebook.com/images/here_maps/here_maps_logo_64px.png";
        } else {
            str = "https://www.facebook.com/images/here_maps/here_maps_logo_32px.png";
        }
        this.A04 = str;
        this.A03 = AnonymousClass000.A0J(this.A06.getFilesDir().getAbsolutePath(), File.separator, "copyright_logo");
        this.A09 = this.A0A * 12.0f;
        this.A01 = 5;
        this.A00 = Float.MAX_VALUE;
    }
}
