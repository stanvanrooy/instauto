package p000X;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.ImageView;

/* renamed from: X.1eh  reason: invalid class name and case insensitive filesystem */
public final class C34411eh {
    public C474123v A00;
    public C474123v A01;
    public final ImageView A02;

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0014, code lost:
        if (r3 != 21) goto L_0x0016;
     */
    public final void A00() {
        boolean z;
        boolean z2;
        Drawable drawable = this.A02.getDrawable();
        if (drawable != null) {
            C25841Ao.A02(drawable);
        }
        if (drawable != null) {
            int i = Build.VERSION.SDK_INT;
            if (i <= 21) {
                z = true;
            }
            z = false;
            if (z) {
                if (this.A01 == null) {
                    this.A01 = new C474123v();
                }
                C474123v r3 = this.A01;
                r3.A00 = null;
                r3.A02 = false;
                r3.A01 = null;
                r3.A03 = false;
                ColorStateList A002 = C474323x.A00(this.A02);
                if (A002 != null) {
                    r3.A02 = true;
                    r3.A00 = A002;
                }
                PorterDuff.Mode A012 = C474323x.A01(this.A02);
                if (A012 != null) {
                    r3.A03 = true;
                    r3.A01 = A012;
                }
                if (r3.A02 || r3.A03) {
                    C25761Ae.A04(drawable, r3, this.A02.getDrawableState());
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    return;
                }
            }
            C474123v r1 = this.A00;
            if (r1 != null) {
                C25761Ae.A04(drawable, r1, this.A02.getDrawableState());
            }
        }
    }

    public final void A01(int i) {
        if (i != 0) {
            Drawable A012 = C474223w.A01(this.A02.getContext(), i);
            if (A012 != null) {
                C25841Ao.A02(A012);
            }
            this.A02.setImageDrawable(A012);
        } else {
            this.A02.setImageDrawable((Drawable) null);
        }
        A00();
    }

    public final void A02(AttributeSet attributeSet, int i) {
        int A05;
        AttributeSet attributeSet2 = attributeSet;
        int i2 = i;
        C25831An A012 = C25831An.A01(this.A02.getContext(), attributeSet, C26061Bl.A0A, i, 0);
        if (Build.VERSION.SDK_INT >= 29) {
            ImageView imageView = this.A02;
            imageView.saveAttributeDataForStyleable(imageView.getContext(), C26061Bl.A0A, attributeSet2, A012.A02, i2, 0);
        }
        try {
            Drawable drawable = this.A02.getDrawable();
            if (!(drawable != null || (A05 = A012.A05(1, -1)) == -1 || (drawable = C474223w.A01(this.A02.getContext(), A05)) == null)) {
                this.A02.setImageDrawable(drawable);
            }
            if (drawable != null) {
                C25841Ao.A02(drawable);
            }
            if (A012.A0C(2)) {
                C474323x.A02(this.A02, A012.A06(2));
            }
            if (A012.A0C(3)) {
                C474323x.A03(this.A02, C25841Ao.A00(A012.A04(3, -1), (PorterDuff.Mode) null));
            }
        } finally {
            A012.A0B();
        }
    }

    public final boolean A03() {
        Drawable background = this.A02.getBackground();
        if (Build.VERSION.SDK_INT < 21 || !(background instanceof RippleDrawable)) {
            return true;
        }
        return false;
    }

    public C34411eh(ImageView imageView) {
        this.A02 = imageView;
    }
}
