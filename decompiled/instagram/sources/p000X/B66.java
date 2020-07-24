package p000X;

import android.os.Bundle;
import com.facebook.common.gcmcompat.OneoffTask;
import com.facebook.common.gcmcompat.PeriodicTask;
import com.facebook.common.gcmcompat.Task;

/* renamed from: X.B66 */
public abstract class B66 {
    public int A00 = 0;
    public Bundle A01 = null;
    public String A02 = null;
    public String A03 = null;
    public boolean A04;
    public boolean A05 = false;
    public boolean A06 = false;

    public Task A00() {
        if (!(this instanceof B6A)) {
            B6B b6b = (B6B) this;
            b6b.A01();
            return new OneoffTask(b6b);
        }
        B6A b6a = (B6A) this;
        b6a.A01();
        return new PeriodicTask(b6a);
    }

    public void A01() {
        if (this.A02 != null) {
            Task.A01(this.A03);
            if (this.A04) {
                Task.A00(this.A01);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Must provide an endpoint for this task by calling setService(ComponentName).");
    }

    public B66(boolean z) {
        this.A04 = z;
    }
}
