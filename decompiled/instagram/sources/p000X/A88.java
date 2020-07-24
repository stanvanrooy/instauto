package p000X;

import android.graphics.Rect;
import android.view.View;
import com.facebook.react.bridge.Callback;

/* renamed from: X.A88 */
public final class A88 implements C23136A9b {
    public final int A00;
    public final Callback A01;
    public final /* synthetic */ A8K A02;

    public final void execute() {
        try {
            A8K a8k = this.A02;
            A83 a83 = a8k.A0L;
            int i = this.A00;
            int[] iArr = a8k.A0P;
            synchronized (a83) {
                C228039ra.A00();
                View view = (View) a83.A05.get(i);
                if (view != null) {
                    view.getLocationOnScreen(iArr);
                    Rect rect = new Rect();
                    view.getWindowVisibleDisplayFrame(rect);
                    iArr[0] = iArr[0] - rect.left;
                    iArr[1] = iArr[1] - rect.top;
                    iArr[2] = view.getWidth();
                    iArr[3] = view.getHeight();
                } else {
                    throw new A9P(AnonymousClass000.A06("No native view for ", i, " currently exists"));
                }
            }
            int[] iArr2 = this.A02.A0P;
            float f = (float) iArr2[0];
            float f2 = AnonymousClass951.A01.density;
            float f3 = ((float) iArr2[1]) / f2;
            float f4 = ((float) iArr2[2]) / f2;
            float f5 = ((float) iArr2[3]) / f2;
            this.A01.invoke(Float.valueOf(f / f2), Float.valueOf(f3), Float.valueOf(f4), Float.valueOf(f5));
        } catch (A9P unused) {
            this.A01.invoke(new Object[0]);
        }
    }

    public A88(A8K a8k, int i, Callback callback) {
        this.A02 = a8k;
        this.A00 = i;
        this.A01 = callback;
    }
}
