package p000X;

import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.bridge.Callback;

/* renamed from: X.A89 */
public final class A89 implements C23136A9b {
    public final float A00;
    public final float A01;
    public final int A02;
    public final Callback A03;
    public final /* synthetic */ A8K A04;

    public final void execute() {
        int A002;
        try {
            A8K a8k = this.A04;
            a8k.A0L.A07(this.A02, a8k.A0P);
            A8K a8k2 = this.A04;
            int[] iArr = a8k2.A0P;
            float f = (float) iArr[0];
            float f2 = (float) iArr[1];
            A83 a83 = a8k2.A0L;
            int i = this.A02;
            float f3 = this.A00;
            float f4 = this.A01;
            synchronized (a83) {
                C228039ra.A00();
                View view = (View) a83.A05.get(i);
                if (view != null) {
                    A002 = C23082A5t.A00(f3, f4, (ViewGroup) view, C23082A5t.A01);
                } else {
                    throw new A0k(AnonymousClass000.A05("Could not find view with tag ", i));
                }
            }
            A8K a8k3 = this.A04;
            a8k3.A0L.A07(A002, a8k3.A0P);
            int[] iArr2 = this.A04.A0P;
            float f5 = AnonymousClass951.A01.density;
            float f6 = (((float) iArr2[0]) - f) / f5;
            float f7 = (((float) iArr2[1]) - f2) / f5;
            float f8 = ((float) iArr2[2]) / f5;
            float f9 = ((float) iArr2[3]) / f5;
            this.A03.invoke(Integer.valueOf(A002), Float.valueOf(f6), Float.valueOf(f7), Float.valueOf(f8), Float.valueOf(f9));
        } catch (A0i unused) {
            this.A03.invoke(new Object[0]);
        }
    }

    public A89(A8K a8k, int i, float f, float f2, Callback callback) {
        this.A04 = a8k;
        this.A02 = i;
        this.A00 = f;
        this.A01 = f2;
        this.A03 = callback;
    }
}
