package com.instagram.shopping.widget.pdp.herocarousel;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import p000X.AnonymousClass0P2;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass0a4;
import p000X.AnonymousClass1EG;
import p000X.AnonymousClass7H8;
import p000X.AnonymousClass7HA;

public class HeroCarouselScrollbarView extends View {
    public RecyclerView A00;
    public final AnonymousClass1EG A01;
    public final AnonymousClass7H8 A02;

    public static void A00(HeroCarouselScrollbarView heroCarouselScrollbarView) {
        RecyclerView recyclerView = heroCarouselScrollbarView.A00;
        AnonymousClass0a4.A06(recyclerView);
        int computeHorizontalScrollExtent = recyclerView.computeHorizontalScrollExtent();
        int computeHorizontalScrollOffset = heroCarouselScrollbarView.A00.computeHorizontalScrollOffset();
        int computeHorizontalScrollRange = heroCarouselScrollbarView.A00.computeHorizontalScrollRange();
        if (computeHorizontalScrollExtent < computeHorizontalScrollRange) {
            int width = (heroCarouselScrollbarView.getWidth() * computeHorizontalScrollExtent) / computeHorizontalScrollRange;
            int width2 = ((heroCarouselScrollbarView.getWidth() - width) * computeHorizontalScrollOffset) / (computeHorizontalScrollRange - computeHorizontalScrollExtent);
            AnonymousClass7H8 r1 = heroCarouselScrollbarView.A02;
            if (!(r1.A01 == width2 && r1.A00 == width)) {
                r1.A01 = width2;
                r1.A00 = width;
                AnonymousClass7H8.A00(r1);
            }
            heroCarouselScrollbarView.A01.A03(1.0d);
            return;
        }
        AnonymousClass7H8 r2 = heroCarouselScrollbarView.A02;
        if (!(r2.A01 == 0 && r2.A00 == 0)) {
            r2.A01 = 0;
            r2.A00 = 0;
            AnonymousClass7H8.A00(r2);
        }
        AnonymousClass1EG r22 = heroCarouselScrollbarView.A01;
        r22.A03(0.0d);
        r22.A02();
    }

    public final void onDraw(Canvas canvas) {
        if (this.A01.A00() > 0.0d) {
            this.A02.draw(canvas);
        }
    }

    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        int A06 = AnonymousClass0Z0.A06(-612923030);
        this.A02.setBounds(0, 0, i, i2);
        A00(this);
        AnonymousClass0Z0.A0D(1751904989, A06);
    }

    public final boolean verifyDrawable(Drawable drawable) {
        if (super.verifyDrawable(drawable) || this.A02 == drawable) {
            return true;
        }
        return false;
    }

    public HeroCarouselScrollbarView(Context context) {
        this(context, (AttributeSet) null);
    }

    public HeroCarouselScrollbarView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public HeroCarouselScrollbarView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        AnonymousClass7H8 r0 = new AnonymousClass7H8(context);
        this.A02 = r0;
        r0.setCallback(this);
        AnonymousClass1EG A002 = AnonymousClass0P2.A00().A00();
        A002.A05(0.0d, true);
        A002.A06 = true;
        A002.A07(new AnonymousClass7HA(this));
        this.A01 = A002;
    }
}
