package p000X;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.view.Display;
import android.view.WindowManager;

/* renamed from: X.D72 */
public final class D72 {
    public long A00;
    public long A01;
    public long A02;
    public long A03;
    public long A04;
    public long A05;
    public long A06;
    public long A07;
    public boolean A08;
    public final WindowManager A09;
    public final D83 A0A;
    public final AnonymousClass8EF A0B;

    public static void A00(D72 d72) {
        Display defaultDisplay = d72.A09.getDefaultDisplay();
        if (defaultDisplay != null) {
            long refreshRate = (long) (1.0E9d / ((double) defaultDisplay.getRefreshRate()));
            d72.A06 = refreshRate;
            d72.A07 = (refreshRate * 80) / 100;
        }
    }

    public D72() {
        this((Context) null);
    }

    public D72(Context context) {
        D83 d83 = null;
        if (context != null) {
            this.A09 = (WindowManager) context.getSystemService("window");
        } else {
            this.A09 = null;
        }
        if (this.A09 != null) {
            if (C25948Bd0.A00 >= 17) {
                DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
                if (displayManager == null) {
                    d83 = null;
                } else {
                    d83 = new D83(this, displayManager);
                }
            }
            this.A0A = d83;
            this.A0B = AnonymousClass8EF.A05;
        } else {
            this.A0A = null;
            this.A0B = null;
        }
        this.A06 = -9223372036854775807L;
        this.A07 = -9223372036854775807L;
    }
}
