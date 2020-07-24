package p000X;

import android.content.Context;
import android.content.DialogInterface;
import android.hardware.SensorManager;

/* renamed from: X.13j  reason: invalid class name and case insensitive filesystem */
public abstract class C241213j {
    public C241413l A00 = new C241313k(this);
    public boolean A01;
    public boolean A02 = false;
    public SensorManager A03;
    public final Context A04;

    public abstract boolean A07();

    private SensorManager A03() {
        if (this.A03 == null) {
            this.A03 = (SensorManager) this.A04.getSystemService("sensor");
        }
        return this.A03;
    }

    public DialogInterface.OnDismissListener A04() {
        return new C180477nA(this);
    }

    public final void A05() {
        if (!this.A02) {
            AnonymousClass0ZH.A01(A03(), this.A00, A03().getDefaultSensor(1), 2);
            this.A02 = true;
        }
    }

    public final void A06() {
        if (this.A02) {
            AnonymousClass0ZH.A00(A03(), this.A00);
            this.A02 = false;
        }
    }

    public C241213j(Context context) {
        this.A04 = context;
    }
}
