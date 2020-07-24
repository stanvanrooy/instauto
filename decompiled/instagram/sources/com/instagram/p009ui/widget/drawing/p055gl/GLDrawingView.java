package com.instagram.p009ui.widget.drawing.p055gl;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import p000X.AnonymousClass0Z0;
import p000X.C192588Li;
import p000X.C208328wv;
import p000X.C30030DNi;
import p000X.C30043DNx;
import p000X.C46011yz;
import p000X.C81623h6;
import p000X.DNX;
import p000X.DNY;
import p000X.DO0;
import p000X.DOG;
import p000X.DOI;

/* renamed from: com.instagram.ui.widget.drawing.gl.GLDrawingView */
public class GLDrawingView extends C46011yz implements DOI {
    public float A00;
    public C81623h6 A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public final GestureDetector A05;
    public final DNX A06;
    public final C192588Li A07;

    public final void A06() {
        this.A05.A05(new DO0(this, (Runnable) null));
    }

    public final void BQG(C192588Li r3) {
        this.A03 = true;
        C81623h6 r1 = this.A01;
        if (r1 != null) {
            r1.B5e(r3, this.A05);
        }
    }

    public View getView() {
        return this;
    }

    public final void A03() {
        DNX dnx = this.A06;
        dnx.A04 = true;
        dnx.A08.remove(dnx.A03);
        dnx.A03 = null;
        super.A03();
        this.A02 = true;
    }

    public C30030DNi getBrush() {
        C30030DNi dNi;
        DNX dnx = this.A06;
        synchronized (dnx) {
            dNi = dnx.A02;
        }
        return dNi;
    }

    public void setBrush(C30030DNi dNi) {
        DNX dnx = this.A06;
        synchronized (dnx) {
            dnx.A02 = dNi;
        }
    }

    public void setBrushSize(float f) {
        C30030DNi dNi;
        if (this.A04) {
            this.A00 = f;
            return;
        }
        this.A00 = -1.0f;
        DNX dnx = this.A06;
        synchronized (dnx) {
            dNi = dnx.A02;
        }
        if (dNi != null) {
            dNi.Bkb(f);
        }
    }

    public void setGLThreadListener(C81623h6 r3) {
        this.A01 = r3;
        if (this.A03 && r3 != null) {
            r3.B5e(this.A07, this.A05);
        }
    }

    public void setOnDrawListener(DOG dog) {
        this.A06.A01 = dog;
    }

    public final void A01() {
        A04();
        super.A01();
        this.A06.A04 = false;
        this.A02 = false;
    }

    public Bitmap getDrawingBitmap() {
        return getBitmap();
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int A052 = AnonymousClass0Z0.A05(1525605555);
        boolean isEnabled = isEnabled();
        if (isEnabled) {
            this.A05.onTouchEvent(motionEvent);
            DNX dnx = this.A06;
            dnx.A09.offer(MotionEvent.obtain(motionEvent));
            this.A05.A05(this.A06);
            A04();
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                float f = this.A00;
                if (f != -1.0f) {
                    setBrushSize(f);
                }
                this.A04 = true;
                getParent().requestDisallowInterceptTouchEvent(true);
            } else if (actionMasked == 1 || actionMasked == 3) {
                this.A04 = false;
                getParent().requestDisallowInterceptTouchEvent(false);
            }
        }
        AnonymousClass0Z0.A0C(-1857207591, A052);
        return isEnabled;
    }

    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (i == 0 && this.A02) {
            A01();
        }
    }

    public GLDrawingView(Context context) {
        this(context, (AttributeSet) null);
    }

    public GLDrawingView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A00 = -1.0f;
        this.A05 = new GestureDetector(getContext(), new C30043DNx(this));
        this.A07 = new C192588Li(context);
        setOpaque(false);
        setEGLContextClientVersion(2);
        setEGLConfigChooser(new C208328wv(this, 8, 0));
        setPreserveEGLContextOnPause(true);
        DNY dny = new DNY(this.A07, this);
        this.A06 = dny;
        setRenderer(dny);
        setRenderMode(0);
        A06();
    }
}
