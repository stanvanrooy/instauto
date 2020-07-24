package p000X;

import android.graphics.Paint;
import android.view.View;

/* renamed from: X.1gj  reason: invalid class name and case insensitive filesystem */
public final class C35661gj implements C34871fR {
    public float A00;
    public float A01;
    public final View A02;

    public final void Ata(C35691gm r6) {
        if (r6.A07.A03 == 1.0d) {
            this.A00 = this.A02.getScaleX();
            this.A01 = this.A02.getScaleY();
        }
        if (r6.A0A) {
            this.A02.setLayerType(2, (Paint) null);
        }
    }

    public final void Atb(C35691gm r4) {
        if (!r4.A00) {
            this.A02.setLayerType(r4.A05, (Paint) null);
        }
    }

    public final void Atc(C35691gm r4) {
        float A002 = (float) r4.A07.A00();
        this.A02.setScaleX(this.A00 * A002);
        this.A02.setScaleY(A002 * this.A01);
    }

    public final void BJa(C35691gm r4) {
        this.A02.setLayerType(r4.A05, (Paint) null);
    }

    public C35661gj(View view) {
        this.A02 = view;
        this.A00 = view.getScaleX();
        this.A01 = view.getScaleY();
    }
}
