package p000X;

import com.instagram.common.p004ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout;

/* renamed from: X.CWV */
public final class CWV implements AnonymousClass2X8 {
    public final /* synthetic */ CWQ A00;

    public CWV(CWQ cwq) {
        this.A00 = cwq;
    }

    public final void BGF(C476524w r4, float f) {
        TouchInterceptorFrameLayout touchInterceptorFrameLayout;
        int i;
        CWQ cwq = this.A00;
        switch (cwq.A0C.intValue()) {
            case 1:
                if (!cwq.A0T) {
                    touchInterceptorFrameLayout = cwq.A09;
                    i = (int) (f * 256.0f);
                    break;
                } else {
                    return;
                }
            case 2:
                if (!cwq.A0T) {
                    touchInterceptorFrameLayout = cwq.A09;
                    i = (int) ((1.0f - f) * 256.0f);
                    break;
                } else {
                    return;
                }
            default:
                return;
        }
        touchInterceptorFrameLayout.setBackgroundColor(i << 24);
    }
}
