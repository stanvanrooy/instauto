package p000X;

import android.content.Context;
import android.os.Build;
import android.view.WindowManager;
import java.util.Observable;
import java.util.Observer;

/* renamed from: X.AIO */
public final class AIO implements Observer {
    public static final int A05;
    public WindowManager.LayoutParams A00;
    public WindowManager A01;
    public C169327Lk A02;
    public boolean A03;
    public final C33671dI A04 = C33671dI.A02;

    static {
        int i = 2038;
        if (Build.VERSION.SDK_INT < 26) {
            i = 2006;
        }
        A05 = i;
    }

    public final void A00(Context context) {
        this.A01 = (WindowManager) context.getSystemService("window");
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(1000);
        this.A00 = layoutParams;
        layoutParams.width = -1;
        layoutParams.height = -1;
        layoutParams.type = A05;
        layoutParams.format = 1;
        layoutParams.flags = 16843032;
        this.A02 = new C169327Lk(context);
    }

    public final void update(Observable observable, Object obj) {
        WindowManager windowManager;
        WindowManager windowManager2;
        C169327Lk r3 = this.A02;
        if (r3 != null) {
            C33671dI r0 = this.A04;
            String str = r0.A00;
            if (r0.A01) {
                if (!this.A03 && (windowManager2 = this.A01) != null) {
                    windowManager2.addView(r3, this.A00);
                    this.A03 = true;
                }
            } else if (this.A03 && (windowManager = this.A01) != null) {
                windowManager.removeViewImmediate(r3);
                this.A03 = false;
            }
            C169327Lk r02 = this.A02;
            r02.A00 = str;
            r02.invalidate();
        }
    }
}
