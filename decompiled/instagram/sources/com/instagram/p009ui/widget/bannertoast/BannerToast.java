package com.instagram.p009ui.widget.bannertoast;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;
import p000X.AnonymousClass0P2;
import p000X.AnonymousClass1E8;
import p000X.AnonymousClass1EA;
import p000X.AnonymousClass1EG;
import p000X.C213519Ip;
import p000X.C213529Iq;
import p000X.C27181Gu;

/* renamed from: com.instagram.ui.widget.bannertoast.BannerToast */
public class BannerToast extends TextView implements AnonymousClass1E8 {
    public AnonymousClass1EG A00;
    public C213529Iq A01;
    public boolean A02;

    public final void BOI(AnonymousClass1EG r1) {
    }

    public static void A00(BannerToast bannerToast) {
        if (!bannerToast.A02) {
            AnonymousClass1EG A002 = AnonymousClass0P2.A00().A00();
            A002.A06(AnonymousClass1EA.A01(1.0d, 3.0d));
            A002.A05(0.0d, true);
            A002.A06 = true;
            bannerToast.A00 = A002;
            A002.A07(bannerToast);
            bannerToast.A02 = true;
        }
    }

    public final void BOF(AnonymousClass1EG r6) {
        if (r6.A01 == 1.0d) {
            setVisibility(0);
        }
    }

    public final void A01() {
        A00(this);
        if (getHeight() == 0) {
            postDelayed(new C213519Ip(this), 300);
        } else {
            this.A00.A03(1.0d);
        }
    }

    public final void BOH(AnonymousClass1EG r6) {
        if (r6.A00() == 0.0d) {
            setVisibility(8);
        }
    }

    public final void BOK(AnonymousClass1EG r12) {
        float A012 = (float) C27181Gu.A01(r12.A00(), 0.0d, 1.0d, (double) (-getHeight()), 0.0d);
        setTranslationY(A012);
        C213529Iq r1 = this.A01;
        if (r1 != null) {
            r1.BSj(A012 + ((float) getHeight()));
        }
    }

    public void setListener(C213529Iq r1) {
        this.A01 = r1;
    }

    public BannerToast(Context context) {
        this(context, (AttributeSet) null, 0);
    }

    public BannerToast(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public BannerToast(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
