package p000X;

import com.facebook.browser.lite.views.BrowserLiteWrapperView;

/* renamed from: X.AUM */
public final class AUM extends AnonymousClass2LX {
    public final /* synthetic */ BrowserLiteWrapperView A00;

    public AUM(BrowserLiteWrapperView browserLiteWrapperView) {
        this.A00 = browserLiteWrapperView;
    }

    public final void BOK(AnonymousClass1EG r8) {
        this.A00.A04.setTranslationY((float) r8.A00());
        BrowserLiteWrapperView browserLiteWrapperView = this.A00;
        browserLiteWrapperView.A03.setAlpha(((float) (1.0d - (r8.A00() / ((double) browserLiteWrapperView.getHeight())))) * 0.7f);
    }
}
