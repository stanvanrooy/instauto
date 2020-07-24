package p000X;

import android.util.Log;
import android.view.animation.Interpolator;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.forker.Process;

/* renamed from: X.1wZ  reason: invalid class name and case insensitive filesystem */
public final class C44671wZ {
    public int A00 = 0;
    public int A01 = Process.WAIT_RESULT_TIMEOUT;
    public int A02 = 0;
    public int A03 = 0;
    public int A04 = -1;
    public Interpolator A05 = null;
    public boolean A06 = false;

    public final void A00(int i, int i2, int i3, Interpolator interpolator) {
        this.A02 = i;
        this.A03 = i2;
        this.A01 = i3;
        this.A05 = interpolator;
        this.A06 = true;
    }

    public final void A01(RecyclerView recyclerView) {
        int i = this.A04;
        if (i >= 0) {
            this.A04 = -1;
            recyclerView.A0e(i);
            this.A06 = false;
        } else if (this.A06) {
            Interpolator interpolator = this.A05;
            if (interpolator == null || this.A01 >= 1) {
                int i2 = this.A01;
                if (i2 >= 1) {
                    recyclerView.A0Q.A01(this.A02, this.A03, i2, interpolator);
                    int i3 = this.A00 + 1;
                    this.A00 = i3;
                    if (i3 > 10) {
                        Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
                    }
                    this.A06 = false;
                    return;
                }
                throw new IllegalStateException("Scroll duration must be a positive number");
            }
            throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
        } else {
            this.A00 = 0;
        }
    }
}
