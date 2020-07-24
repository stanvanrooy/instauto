package p000X;

import android.content.Context;
import android.widget.HorizontalScrollView;
import com.facebook.react.modules.i18nmanager.I18nUtil;

/* renamed from: X.A39 */
public final class A39 extends C23081A5s {
    public int A00 = 0;
    public int A01;

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.A01 == 1) {
            setLeft(0);
            setRight((i3 - i) + 0);
            HorizontalScrollView horizontalScrollView = (HorizontalScrollView) getParent();
            horizontalScrollView.scrollTo((horizontalScrollView.getScrollX() + getWidth()) - this.A00, horizontalScrollView.getScrollY());
        }
        this.A00 = getWidth();
    }

    public A39(Context context) {
        super(context);
        this.A01 = I18nUtil.A00().A03(context) ? 1 : 0;
    }
}
