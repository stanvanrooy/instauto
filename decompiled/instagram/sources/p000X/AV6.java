package p000X;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.webkit.ValueCallback;
import android.webkit.WebViewClient;
import com.facebook.secure.webkit.WebView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.AV6 */
public final class AV6 extends WebView {
    public C25117B1n A00;
    public AA9 A01;
    public boolean A02 = true;
    public final List A03 = new ArrayList();

    public AV6(Context context, AA9 aa9) {
        super(context, (AttributeSet) null, 16842885);
        this.A01 = aa9;
    }

    public final void A00(String str) {
        Looper mainLooper = Looper.getMainLooper();
        if (Looper.myLooper() == mainLooper) {
            String A0E = AnonymousClass000.A0E("javascript: ", str);
            try {
                evaluateJavascript(str, (ValueCallback) null);
            } catch (IllegalStateException unused) {
                loadUrl(A0E);
            }
        } else {
            AnonymousClass0ZA.A0E(new Handler(mainLooper), new AV7(this, str), 1125648880);
        }
    }

    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.A02 && computeVerticalScrollRange() > getHeight()) {
            this.A02 = false;
            Iterator it = this.A03.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
    }

    public void setWebViewClient(WebViewClient webViewClient) {
        super.setWebViewClient(webViewClient);
        this.A00 = (C25117B1n) webViewClient;
    }

    public C25117B1n getWebViewClient() {
        return this.A00;
    }
}
