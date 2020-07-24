package p000X;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;

/* renamed from: X.1eg  reason: invalid class name and case insensitive filesystem */
public final class C34401eg {
    public C474123v A00;
    public C474123v A01;
    public C474123v A02;
    public final View A03;
    public final C25751Ad A04 = C25751Ad.A01();

    public final ColorStateList A00() {
        C474123v r0 = this.A02;
        if (r0 != null) {
            return r0.A00;
        }
        return null;
    }

    public final PorterDuff.Mode A01() {
        C474123v r0 = this.A02;
        if (r0 != null) {
            return r0.A01;
        }
        return null;
    }

    public final void A02() {
        boolean z;
        Drawable background = this.A03.getBackground();
        if (background != null) {
            int i = Build.VERSION.SDK_INT;
            boolean z2 = true;
            if (i <= 21) {
                z2 = false;
                if (i == 21) {
                    z2 = true;
                }
            } else if (this.A00 == null) {
                z2 = false;
            }
            if (z2) {
                if (this.A01 == null) {
                    this.A01 = new C474123v();
                }
                C474123v r3 = this.A01;
                r3.A00 = null;
                r3.A02 = false;
                r3.A01 = null;
                r3.A03 = false;
                ColorStateList A032 = AnonymousClass1E1.A03(this.A03);
                if (A032 != null) {
                    r3.A02 = true;
                    r3.A00 = A032;
                }
                PorterDuff.Mode A042 = AnonymousClass1E1.A04(this.A03);
                if (A042 != null) {
                    r3.A03 = true;
                    r3.A01 = A042;
                }
                if (r3.A02 || r3.A03) {
                    C25761Ae.A04(background, r3, this.A03.getDrawableState());
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    return;
                }
            }
            C474123v r1 = this.A02;
            if (r1 != null || (r1 = this.A00) != null) {
                C25761Ae.A04(background, r1, this.A03.getDrawableState());
            }
        }
    }

    public final void A03(int i) {
        ColorStateList colorStateList;
        C25751Ad r1 = this.A04;
        if (r1 != null) {
            colorStateList = r1.A03(this.A03.getContext(), i);
        } else {
            colorStateList = null;
        }
        A05(colorStateList);
        A02();
    }

    public final void A04(ColorStateList colorStateList) {
        if (this.A02 == null) {
            this.A02 = new C474123v();
        }
        C474123v r1 = this.A02;
        r1.A00 = colorStateList;
        r1.A02 = true;
        A02();
    }

    public final void A05(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.A00 == null) {
                this.A00 = new C474123v();
            }
            C474123v r1 = this.A00;
            r1.A00 = colorStateList;
            r1.A02 = true;
        } else {
            this.A00 = null;
        }
        A02();
    }

    public final void A06(PorterDuff.Mode mode) {
        if (this.A02 == null) {
            this.A02 = new C474123v();
        }
        C474123v r1 = this.A02;
        r1.A01 = mode;
        r1.A03 = true;
        A02();
    }

    public final void A07(AttributeSet attributeSet, int i) {
        ColorStateList A032;
        AttributeSet attributeSet2 = attributeSet;
        int i2 = i;
        C25831An A012 = C25831An.A01(this.A03.getContext(), attributeSet, C26061Bl.A0e, i, 0);
        if (Build.VERSION.SDK_INT >= 29) {
            View view = this.A03;
            view.saveAttributeDataForStyleable(view.getContext(), C26061Bl.A0e, attributeSet2, A012.A02, i2, 0);
        }
        try {
            if (A012.A0C(0) && (A032 = this.A04.A03(this.A03.getContext(), A012.A05(0, -1))) != null) {
                A05(A032);
            }
            if (A012.A0C(1)) {
                AnonymousClass1E1.A0X(this.A03, A012.A06(1));
            }
            if (A012.A0C(2)) {
                AnonymousClass1E1.A0Z(this.A03, C25841Ao.A00(A012.A04(2, -1), (PorterDuff.Mode) null));
            }
        } finally {
            A012.A0B();
        }
    }

    public C34401eg(View view) {
        this.A03 = view;
    }
}
