package p000X;

import android.os.Looper;
import android.util.Pair;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.util.concurrent.TimeUnit;

/* renamed from: X.BHH */
public abstract class BHH {
    public C138515vO A02(long j, TimeUnit timeUnit) {
        BasePendingResult basePendingResult = (BasePendingResult) this;
        if (j > 0) {
            boolean z = false;
            if (Looper.getMainLooper() == Looper.myLooper()) {
                z = true;
            }
            if (z) {
                throw new IllegalStateException("await must not be called on the UI thread when time is greater than zero.");
            }
        }
        AnonymousClass0a2.A09(!basePendingResult.A0C, "Result has already been consumed.");
        AnonymousClass0a2.A09(true, "Cannot await if then() has been called.");
        try {
            if (!basePendingResult.A0A.await(j, timeUnit)) {
                basePendingResult.A0A(Status.A09);
            }
        } catch (InterruptedException unused) {
            basePendingResult.A0A(Status.A07);
        }
        AnonymousClass0a2.A09(basePendingResult.A0C(), "Result is not ready.");
        return BasePendingResult.A00(basePendingResult);
    }

    public void A04(C25388BHf bHf) {
        BasePendingResult basePendingResult = (BasePendingResult) this;
        synchronized (basePendingResult.A07) {
            if (bHf == null) {
                basePendingResult.A01 = null;
            } else {
                boolean z = false;
                if (!basePendingResult.A0C) {
                    z = true;
                }
                AnonymousClass0a2.A09(z, "Result has already been consumed.");
                AnonymousClass0a2.A09(true, "Cannot set callbacks if then() has been called.");
                if (!basePendingResult.A0B()) {
                    if (basePendingResult.A0C()) {
                        BHe bHe = basePendingResult.A06;
                        AnonymousClass0ZA.A0D(bHe, bHe.obtainMessage(1, new Pair(bHf, BasePendingResult.A00(basePendingResult))));
                    } else {
                        basePendingResult.A01 = bHf;
                    }
                }
            }
        }
    }

    public void A05(C25388BHf bHf, long j, TimeUnit timeUnit) {
        BasePendingResult basePendingResult = (BasePendingResult) this;
        synchronized (basePendingResult.A07) {
            if (bHf == null) {
                basePendingResult.A01 = null;
            } else {
                boolean z = false;
                if (!basePendingResult.A0C) {
                    z = true;
                }
                AnonymousClass0a2.A09(z, "Result has already been consumed.");
                AnonymousClass0a2.A09(true, "Cannot set callbacks if then() has been called.");
                if (!basePendingResult.A0B()) {
                    if (basePendingResult.A0C()) {
                        BHe bHe = basePendingResult.A06;
                        AnonymousClass0ZA.A0D(bHe, bHe.obtainMessage(1, new Pair(bHf, BasePendingResult.A00(basePendingResult))));
                    } else {
                        basePendingResult.A01 = bHf;
                        BHe bHe2 = basePendingResult.A06;
                        AnonymousClass0ZA.A06(bHe2, bHe2.obtainMessage(2, basePendingResult), timeUnit.toMillis(j));
                    }
                }
            }
        }
    }

    public void A03(BHS bhs) {
        if (!(this instanceof BasePendingResult)) {
            throw new UnsupportedOperationException();
        }
        BasePendingResult basePendingResult = (BasePendingResult) this;
        boolean z = false;
        if (bhs != null) {
            z = true;
        }
        AnonymousClass0a2.A08(z, "Callback cannot be null.");
        synchronized (basePendingResult.A07) {
            if (basePendingResult.A0C()) {
                bhs.AxX(basePendingResult.A02);
            } else {
                basePendingResult.A09.add(bhs);
            }
        }
    }
}
