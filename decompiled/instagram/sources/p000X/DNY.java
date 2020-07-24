package p000X;

import android.graphics.Bitmap;
import android.view.MotionEvent;
import javax.microedition.khronos.opengles.GL10;

/* renamed from: X.DNY */
public final class DNY extends DNX {
    public int A00 = -1;
    public Bitmap A01;
    public DNZ A02;
    public DNZ A03;
    public DNZ A04;
    public boolean A05;
    public boolean A06;

    public static DNZ A00(DNY dny, DNZ dnz, int i, int i2) {
        if (dnz != null) {
            AnonymousClass83K r1 = dnz.A04;
            if (i == r1.getWidth() && i2 == r1.getHeight()) {
                return dnz;
            }
        }
        DNZ dnz2 = new DNZ(dny.A07, i, i2);
        dnz2.A03();
        return dnz2;
    }

    public final void A09(MotionEvent motionEvent) {
        if (this.A06) {
            motionEvent.setAction(3);
        }
        super.A09(motionEvent);
    }

    public DNY(C192588Li r2, DOI doi) {
        super(r2, doi);
    }

    public final void A0A(DMK dmk) {
        super.A0A(dmk);
        this.A05 = true;
        if (this.A06) {
            A06();
            C30023DNb dNb = new C30023DNb();
            dNb.A01(this.A02);
            this.A03 = dNb;
            this.A08.add(dNb);
            this.A06 = false;
        }
    }

    public final void A0B(DMK dmk) {
        super.A0B(dmk);
        this.A05 = false;
    }

    public final void onSurfaceChanged(GL10 gl10, int i, int i2) {
        super.onSurfaceChanged(gl10, i, i2);
        this.A02 = A00(this, this.A02, i, i2);
        this.A04 = A00(this, this.A04, i, i2);
        if (this.A01 != null) {
            DNZ A002 = A00(this, this.A03, i, i2);
            this.A03 = A002;
            Bitmap bitmap = this.A01;
            DNZ.A01(A002);
            AnonymousClass8EG r1 = new AnonymousClass8EG(bitmap);
            r1.A01(A002.A02);
            DNZ.A02(A002, r1.A00, A002.A05);
            DNZ.A00();
            this.A02.A04(this.A03);
        }
        this.A00 = -1;
        for (int i3 = 0; i3 < this.A08.size(); i3++) {
            C30037DNr dNr = (C30037DNr) this.A08.get(i3);
            dNr.BXn();
            this.A02.A04(dNr);
        }
    }
}
