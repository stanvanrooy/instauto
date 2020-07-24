package com.instagram.igds.components.imagebutton;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.ImageView;
import com.facebook.C0003R;
import com.instagram.common.p004ui.widget.imageview.ConstrainedImageView;
import p000X.Constants;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass3CX;
import p000X.C019000b;
import p000X.C71753Ca;

public class IgImageButton extends ConstrainedImageView {
    public int A00;
    public int A01;
    public Drawable A02;
    public Drawable A03;
    public Drawable A04;
    public Drawable A05;
    public Integer A06;
    public boolean A07;
    public Drawable A08;
    public Drawable A09;
    public Drawable A0A;
    public AnonymousClass3CX A0B;
    public Integer A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public final int A0I;
    public final C71753Ca A0J;

    public static void A00(Drawable drawable, int i, int i2) {
        Drawable drawable2 = drawable;
        if (drawable != null) {
            AnonymousClass3CX.A00(AnonymousClass3CX.A03, drawable2, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), i, i2);
        }
    }

    public static void A02(IgImageButton igImageButton) {
        Drawable drawable = igImageButton.A08;
        if (drawable != null) {
            AnonymousClass3CX.A00(igImageButton.A0B, drawable, igImageButton.A01, igImageButton.A00, igImageButton.getWidth(), igImageButton.getHeight());
        }
        igImageButton.invalidate();
    }

    private Drawable getVideoIcon() {
        if (this.A0C.intValue() != 1) {
            if (this.A0A == null) {
                this.A0A = C019000b.A03(getContext(), C0003R.C0004drawable.instagram_play_filled_32);
            }
            return this.A0A;
        }
        if (this.A09 == null) {
            this.A09 = C019000b.A03(getContext(), C0003R.C0004drawable.instagram_igtv_filled_32);
        }
        return this.A09;
    }

    public final void A0A(boolean z) {
        this.A0D = z;
        if (z) {
            if (this.A02 == null) {
                this.A02 = C019000b.A03(getContext(), C0003R.C0004drawable.filled_grid_album_icon);
            }
            A00(this.A02, getWidth(), getHeight());
        }
        invalidate();
    }

    public final void A0B(boolean z) {
        this.A0F = z;
        if (z) {
            if (this.A04 == null) {
                Context context = getContext();
                Drawable A032 = C019000b.A03(context, C0003R.C0004drawable.instagram_news_off_outline_32);
                this.A04 = A032;
                A032.setAlpha(255);
                Drawable drawable = this.A04;
                getContext();
                drawable.setColorFilter(C019000b.A00(context, C0003R.color.white), PorterDuff.Mode.SRC_ATOP);
            }
            int width = getWidth();
            int height = getHeight();
            Drawable drawable2 = this.A04;
            if (drawable2 != null) {
                AnonymousClass3CX r0 = AnonymousClass3CX.A02;
                int i = this.A0I;
                AnonymousClass3CX.A00(r0, drawable2, i, i, width, height);
            }
        }
        invalidate();
    }

    public final void A0C(boolean z) {
        this.A0G = z;
        if (z) {
            if (this.A05 == null) {
                this.A05 = C019000b.A03(getContext(), C0003R.C0004drawable.instagram_shopping_filled_32);
            }
            A00(this.A05, getWidth(), getHeight());
        }
        invalidate();
    }

    public final void A0D(boolean z) {
        A0F(z, Constants.ZERO);
    }

    public final void A0E(boolean z, Integer num) {
        this.A06 = num;
        this.A0E = z;
        if (z) {
            if (this.A03 == null) {
                this.A03 = C019000b.A03(getContext(), C0003R.C0004drawable.instagram_eye_off_outline_32);
            }
            switch (this.A06.intValue()) {
                case 0:
                    this.A03.setColorFilter(C019000b.A00(getContext(), C0003R.color.white), PorterDuff.Mode.SRC_ATOP);
                    this.A03.setAlpha(255);
                    break;
                case 1:
                    this.A03.setColorFilter(C019000b.A00(getContext(), C0003R.color.black), PorterDuff.Mode.SRC_ATOP);
                    this.A03.setAlpha(102);
                    break;
            }
            int width = getWidth();
            int height = getHeight();
            Drawable drawable = this.A03;
            if (drawable != null) {
                AnonymousClass3CX r0 = AnonymousClass3CX.A02;
                int i = this.A0I;
                AnonymousClass3CX.A00(r0, drawable, i, i, width, height);
            }
        }
        invalidate();
    }

    public final void A0F(boolean z, Integer num) {
        this.A0C = num;
        this.A0H = z;
        if (z) {
            A00(getVideoIcon(), getWidth(), getHeight());
        }
        invalidate();
    }

    public void setEnableTouchOverlay(boolean z) {
        this.A0J.A00 = z;
    }

    public void setIconDrawable(Drawable drawable) {
        this.A08 = drawable;
        A02(this);
    }

    public void setIconPosition(AnonymousClass3CX r1) {
        this.A0B = r1;
        A02(this);
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.A0J.A00(canvas);
        Drawable drawable = this.A08;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        if (this.A0H) {
            getVideoIcon().draw(canvas);
        }
        if (this.A0E) {
            this.A03.draw(canvas);
        }
        if (this.A07) {
            canvas.drawColor(C019000b.A00(getContext(), C0003R.color.white_75_transparent));
        }
        if (this.A0D) {
            this.A02.draw(canvas);
        }
        if (this.A0G) {
            this.A05.draw(canvas);
        }
        if (this.A0F) {
            this.A04.draw(canvas);
        }
    }

    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        Drawable drawable;
        Drawable drawable2;
        int A062 = AnonymousClass0Z0.A06(-531236997);
        int i5 = i;
        int i6 = i2;
        super.onSizeChanged(i, i2, i3, i4);
        Drawable drawable3 = this.A08;
        if (drawable3 != null) {
            AnonymousClass3CX.A00(this.A0B, drawable3, this.A01, this.A00, i5, i6);
        }
        if (this.A0H) {
            A00(getVideoIcon(), i, i2);
        }
        if (this.A0E && (drawable2 = this.A03) != null) {
            AnonymousClass3CX r1 = AnonymousClass3CX.A02;
            int i7 = this.A0I;
            AnonymousClass3CX.A00(r1, drawable2, i7, i7, i5, i6);
        }
        if (this.A0D) {
            A00(this.A02, i, i2);
        }
        if (this.A0G) {
            A00(this.A05, i, i2);
        }
        if (this.A0F && (drawable = this.A04) != null) {
            AnonymousClass3CX r12 = AnonymousClass3CX.A02;
            int i8 = this.A0I;
            AnonymousClass3CX.A00(r12, drawable, i8, i8, i5, i6);
        }
        AnonymousClass0Z0.A0D(-1156262012, A062);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001d, code lost:
        if (r3.A0J.A00 != false) goto L_0x001f;
     */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        int A052 = AnonymousClass0Z0.A05(-1722906845);
        C71753Ca r1 = this.A0J;
        if (r1.A00) {
            r1.A02.A02(motionEvent);
        }
        if (!super.onTouchEvent(motionEvent)) {
            z = false;
        }
        z = true;
        AnonymousClass0Z0.A0C(1126293271, A052);
        return z;
    }

    public void setIconDrawableResource(int i) {
        setIconDrawable(C019000b.A03(getContext(), i));
    }

    public IgImageButton(Context context) {
        this(context, (AttributeSet) null);
    }

    public IgImageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public IgImageButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A01 = -1;
        this.A00 = -1;
        this.A0B = AnonymousClass3CX.A02;
        setAdjustViewBounds(false);
        setScaleType(ImageView.ScaleType.CENTER_CROP);
        setPlaceHolderColor(C019000b.A00(context, C0003R.color.igds_highlight_background));
        this.A0I = getResources().getDimensionPixelSize(C0003R.dimen.grid_hidden_icon_size);
        C71753Ca r1 = new C71753Ca(this);
        this.A0J = r1;
        r1.A00 = true;
        this.A06 = Constants.ONE;
        this.A0C = Constants.ZERO;
    }
}
