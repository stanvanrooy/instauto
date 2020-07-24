package p000X;

import android.webkit.WebView;

/* renamed from: X.0De  reason: invalid class name and case insensitive filesystem */
public final class C04240De {
    public static final int[] A05 = new int[2];
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final String A04;

    public C04240De(WebView webView) {
        this.A04 = String.format("%s{%s}", new Object[]{webView.getClass().getName(), Integer.toHexString(webView.hashCode())});
        int[] iArr = A05;
        webView.getLocationOnScreen(iArr);
        this.A01 = iArr[0];
        this.A02 = iArr[1];
        this.A03 = webView.getWidth();
        this.A00 = webView.getHeight();
    }
}
