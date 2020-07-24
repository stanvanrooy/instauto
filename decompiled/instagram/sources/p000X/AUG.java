package p000X;

import android.graphics.Point;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;
import com.facebook.browser.lite.BrowserLiteActivity;
import java.util.List;

/* renamed from: X.AUG */
public final class AUG implements ViewTreeObserver.OnGlobalLayoutListener {
    public double A00;
    public int A01;
    public Point A02 = null;
    public boolean A03;
    public boolean A04;
    public final /* synthetic */ View A05;
    public final /* synthetic */ BrowserLiteActivity A06;
    public final /* synthetic */ List A07;

    public AUG(BrowserLiteActivity browserLiteActivity, View view, List list) {
        this.A06 = browserLiteActivity;
        this.A05 = view;
        this.A07 = list;
        this.A00 = browserLiteActivity.A00;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x002f, code lost:
        if (r4.y != r2.y) goto L_0x0031;
     */
    public final void onGlobalLayout() {
        boolean z;
        Rect rect = new Rect();
        this.A05.getWindowVisibleDisplayFrame(rect);
        Point point = new Point();
        this.A06.getWindowManager().getDefaultDisplay().getSize(point);
        Point point2 = this.A02;
        if (point2 == null) {
            this.A02 = point;
            return;
        }
        boolean z2 = false;
        if (point.x == point2.x) {
            z = false;
        }
        z = true;
        if (rect.height() < point.y - 100) {
            z2 = true;
        }
        int height = this.A05.getRootView().getHeight() - ((int) (((double) rect.height()) * this.A00));
        if (!(z2 == this.A03 && z == this.A04 && height == this.A01)) {
            for (ATG Auz : this.A07) {
                Auz.Auz(this.A03, z2, this.A04, z, height);
            }
        }
        this.A01 = height;
        this.A03 = z2;
        this.A04 = z;
    }
}
